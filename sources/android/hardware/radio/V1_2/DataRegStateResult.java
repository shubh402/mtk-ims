package android.hardware.radio.V1_2;

import android.hardware.radio.V1_0.RegState;
import android.hardware.radio.V1_5.UtranBands;
import android.os.HidlSupport;
import android.os.HwBlob;
import android.os.HwParcel;
import java.util.ArrayList;
import java.util.Objects;

public final class DataRegStateResult {
    public CellIdentity cellIdentity = new CellIdentity();
    public int maxDataCalls = 0;
    public int rat = 0;
    public int reasonDataDenied = 0;
    public int regState = 0;

    public final boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null || otherObject.getClass() != DataRegStateResult.class) {
            return false;
        }
        DataRegStateResult other = (DataRegStateResult) otherObject;
        if (this.regState == other.regState && this.rat == other.rat && this.reasonDataDenied == other.reasonDataDenied && this.maxDataCalls == other.maxDataCalls && HidlSupport.deepEquals(this.cellIdentity, other.cellIdentity)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.regState))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.rat))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.reasonDataDenied))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.maxDataCalls))), Integer.valueOf(HidlSupport.deepHashCode(this.cellIdentity))});
    }

    public final String toString() {
        return "{" + ".regState = " + RegState.toString(this.regState) + ", .rat = " + this.rat + ", .reasonDataDenied = " + this.reasonDataDenied + ", .maxDataCalls = " + this.maxDataCalls + ", .cellIdentity = " + this.cellIdentity + "}";
    }

    public final void readFromParcel(HwParcel parcel) {
        readEmbeddedFromParcel(parcel, parcel.readBuffer(104), 0);
    }

    public static final ArrayList<DataRegStateResult> readVectorFromParcel(HwParcel parcel) {
        ArrayList<DataRegStateResult> _hidl_vec = new ArrayList<>();
        HwBlob _hidl_blob = parcel.readBuffer(16);
        int _hidl_vec_size = _hidl_blob.getInt32(8);
        HwBlob childBlob = parcel.readEmbeddedBuffer((long) (_hidl_vec_size * UtranBands.BAND_D), _hidl_blob.handle(), 0, true);
        _hidl_vec.clear();
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            DataRegStateResult _hidl_vec_element = new DataRegStateResult();
            _hidl_vec_element.readEmbeddedFromParcel(parcel, childBlob, (long) (_hidl_index_0 * UtranBands.BAND_D));
            _hidl_vec.add(_hidl_vec_element);
        }
        return _hidl_vec;
    }

    public final void readEmbeddedFromParcel(HwParcel parcel, HwBlob _hidl_blob, long _hidl_offset) {
        this.regState = _hidl_blob.getInt32(0 + _hidl_offset);
        this.rat = _hidl_blob.getInt32(4 + _hidl_offset);
        this.reasonDataDenied = _hidl_blob.getInt32(8 + _hidl_offset);
        this.maxDataCalls = _hidl_blob.getInt32(12 + _hidl_offset);
        this.cellIdentity.readEmbeddedFromParcel(parcel, _hidl_blob, 16 + _hidl_offset);
    }

    public final void writeToParcel(HwParcel parcel) {
        HwBlob _hidl_blob = new HwBlob(UtranBands.BAND_D);
        writeEmbeddedToBlob(_hidl_blob, 0);
        parcel.writeBuffer(_hidl_blob);
    }

    public static final void writeVectorToParcel(HwParcel parcel, ArrayList<DataRegStateResult> _hidl_vec) {
        HwBlob _hidl_blob = new HwBlob(16);
        int _hidl_vec_size = _hidl_vec.size();
        _hidl_blob.putInt32(8, _hidl_vec_size);
        _hidl_blob.putBool(12, false);
        HwBlob childBlob = new HwBlob(_hidl_vec_size * UtranBands.BAND_D);
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            _hidl_vec.get(_hidl_index_0).writeEmbeddedToBlob(childBlob, (long) (_hidl_index_0 * UtranBands.BAND_D));
        }
        _hidl_blob.putBlob(0, childBlob);
        parcel.writeBuffer(_hidl_blob);
    }

    public final void writeEmbeddedToBlob(HwBlob _hidl_blob, long _hidl_offset) {
        _hidl_blob.putInt32(0 + _hidl_offset, this.regState);
        _hidl_blob.putInt32(4 + _hidl_offset, this.rat);
        _hidl_blob.putInt32(8 + _hidl_offset, this.reasonDataDenied);
        _hidl_blob.putInt32(12 + _hidl_offset, this.maxDataCalls);
        this.cellIdentity.writeEmbeddedToBlob(_hidl_blob, 16 + _hidl_offset);
    }
}
