package android.hardware.radio.V1_4;

import android.hardware.radio.V1_2.CellConnectionStatus;
import android.hardware.radio.V1_2.CellInfoCdma;
import android.hardware.radio.V1_2.CellInfoGsm;
import android.hardware.radio.V1_2.CellInfoTdscdma;
import android.hardware.radio.V1_2.CellInfoWcdma;
import android.os.HidlSupport;
import android.os.HwBlob;
import android.os.HwParcel;
import com.mediatek.ims.ImsCallSessionProxy;
import java.util.ArrayList;
import java.util.Objects;

public final class CellInfo {
    public int connectionStatus = 0;
    public Info info = new Info();
    public boolean isRegistered = false;

    public static final class Info {
        private byte hidl_d;
        private Object hidl_o;

        public Info() {
            this.hidl_d = 0;
            this.hidl_o = null;
            this.hidl_o = new CellInfoGsm();
        }

        public static final class hidl_discriminator {
            public static final byte cdma = 1;
            public static final byte gsm = 0;
            public static final byte lte = 4;

            /* renamed from: nr */
            public static final byte f16nr = 5;
            public static final byte tdscdma = 3;
            public static final byte wcdma = 2;

            public static final String getName(byte value) {
                switch (value) {
                    case 0:
                        return "gsm";
                    case 1:
                        return "cdma";
                    case 2:
                        return "wcdma";
                    case 3:
                        return "tdscdma";
                    case 4:
                        return "lte";
                    case 5:
                        return "nr";
                    default:
                        return "Unknown";
                }
            }

            private hidl_discriminator() {
            }
        }

        public void gsm(CellInfoGsm gsm) {
            this.hidl_d = 0;
            this.hidl_o = gsm;
        }

        public CellInfoGsm gsm() {
            if (this.hidl_d != 0) {
                Object obj = this.hidl_o;
                String className = obj != null ? obj.getClass().getName() : "null";
                throw new IllegalStateException("Read access to inactive union components is disallowed. Discriminator value is " + this.hidl_d + " (corresponding to " + hidl_discriminator.getName(this.hidl_d) + "), and hidl_o is of type " + className + ".");
            }
            Object obj2 = this.hidl_o;
            if (obj2 == null || CellInfoGsm.class.isInstance(obj2)) {
                return (CellInfoGsm) this.hidl_o;
            }
            throw new Error("Union is in a corrupted state.");
        }

        public void cdma(CellInfoCdma cdma) {
            this.hidl_d = 1;
            this.hidl_o = cdma;
        }

        public CellInfoCdma cdma() {
            if (this.hidl_d != 1) {
                Object obj = this.hidl_o;
                String className = obj != null ? obj.getClass().getName() : "null";
                throw new IllegalStateException("Read access to inactive union components is disallowed. Discriminator value is " + this.hidl_d + " (corresponding to " + hidl_discriminator.getName(this.hidl_d) + "), and hidl_o is of type " + className + ".");
            }
            Object obj2 = this.hidl_o;
            if (obj2 == null || CellInfoCdma.class.isInstance(obj2)) {
                return (CellInfoCdma) this.hidl_o;
            }
            throw new Error("Union is in a corrupted state.");
        }

        public void wcdma(CellInfoWcdma wcdma) {
            this.hidl_d = 2;
            this.hidl_o = wcdma;
        }

        public CellInfoWcdma wcdma() {
            if (this.hidl_d != 2) {
                Object obj = this.hidl_o;
                String className = obj != null ? obj.getClass().getName() : "null";
                throw new IllegalStateException("Read access to inactive union components is disallowed. Discriminator value is " + this.hidl_d + " (corresponding to " + hidl_discriminator.getName(this.hidl_d) + "), and hidl_o is of type " + className + ".");
            }
            Object obj2 = this.hidl_o;
            if (obj2 == null || CellInfoWcdma.class.isInstance(obj2)) {
                return (CellInfoWcdma) this.hidl_o;
            }
            throw new Error("Union is in a corrupted state.");
        }

        public void tdscdma(CellInfoTdscdma tdscdma) {
            this.hidl_d = 3;
            this.hidl_o = tdscdma;
        }

        public CellInfoTdscdma tdscdma() {
            if (this.hidl_d != 3) {
                Object obj = this.hidl_o;
                String className = obj != null ? obj.getClass().getName() : "null";
                throw new IllegalStateException("Read access to inactive union components is disallowed. Discriminator value is " + this.hidl_d + " (corresponding to " + hidl_discriminator.getName(this.hidl_d) + "), and hidl_o is of type " + className + ".");
            }
            Object obj2 = this.hidl_o;
            if (obj2 == null || CellInfoTdscdma.class.isInstance(obj2)) {
                return (CellInfoTdscdma) this.hidl_o;
            }
            throw new Error("Union is in a corrupted state.");
        }

        public void lte(CellInfoLte lte) {
            this.hidl_d = 4;
            this.hidl_o = lte;
        }

        public CellInfoLte lte() {
            if (this.hidl_d != 4) {
                Object obj = this.hidl_o;
                String className = obj != null ? obj.getClass().getName() : "null";
                throw new IllegalStateException("Read access to inactive union components is disallowed. Discriminator value is " + this.hidl_d + " (corresponding to " + hidl_discriminator.getName(this.hidl_d) + "), and hidl_o is of type " + className + ".");
            }
            Object obj2 = this.hidl_o;
            if (obj2 == null || CellInfoLte.class.isInstance(obj2)) {
                return (CellInfoLte) this.hidl_o;
            }
            throw new Error("Union is in a corrupted state.");
        }

        /* renamed from: nr */
        public void mo1268nr(CellInfoNr nr) {
            this.hidl_d = 5;
            this.hidl_o = nr;
        }

        /* renamed from: nr */
        public CellInfoNr mo1267nr() {
            if (this.hidl_d != 5) {
                Object obj = this.hidl_o;
                String className = obj != null ? obj.getClass().getName() : "null";
                throw new IllegalStateException("Read access to inactive union components is disallowed. Discriminator value is " + this.hidl_d + " (corresponding to " + hidl_discriminator.getName(this.hidl_d) + "), and hidl_o is of type " + className + ".");
            }
            Object obj2 = this.hidl_o;
            if (obj2 == null || CellInfoNr.class.isInstance(obj2)) {
                return (CellInfoNr) this.hidl_o;
            }
            throw new Error("Union is in a corrupted state.");
        }

        public byte getDiscriminator() {
            return this.hidl_d;
        }

        public final boolean equals(Object otherObject) {
            if (this == otherObject) {
                return true;
            }
            if (otherObject == null || otherObject.getClass() != Info.class) {
                return false;
            }
            Info other = (Info) otherObject;
            if (this.hidl_d == other.hidl_d && HidlSupport.deepEquals(this.hidl_o, other.hidl_o)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(HidlSupport.deepHashCode(this.hidl_o)), Integer.valueOf(Objects.hashCode(Byte.valueOf(this.hidl_d)))});
        }

        public final String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("{");
            switch (this.hidl_d) {
                case 0:
                    builder.append(".gsm = ");
                    builder.append(gsm());
                    break;
                case 1:
                    builder.append(".cdma = ");
                    builder.append(cdma());
                    break;
                case 2:
                    builder.append(".wcdma = ");
                    builder.append(wcdma());
                    break;
                case 3:
                    builder.append(".tdscdma = ");
                    builder.append(tdscdma());
                    break;
                case 4:
                    builder.append(".lte = ");
                    builder.append(lte());
                    break;
                case 5:
                    builder.append(".nr = ");
                    builder.append(mo1267nr());
                    break;
                default:
                    throw new Error("Unknown union discriminator (value: " + this.hidl_d + ").");
            }
            builder.append("}");
            return builder.toString();
        }

        public final void readFromParcel(HwParcel parcel) {
            readEmbeddedFromParcel(parcel, parcel.readBuffer(128), 0);
        }

        public static final ArrayList<Info> readVectorFromParcel(HwParcel parcel) {
            ArrayList<Info> _hidl_vec = new ArrayList<>();
            HwBlob _hidl_blob = parcel.readBuffer(16);
            int _hidl_vec_size = _hidl_blob.getInt32(8);
            HwBlob childBlob = parcel.readEmbeddedBuffer((long) (_hidl_vec_size * 128), _hidl_blob.handle(), 0, true);
            _hidl_vec.clear();
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
                Info _hidl_vec_element = new Info();
                _hidl_vec_element.readEmbeddedFromParcel(parcel, childBlob, (long) (_hidl_index_0 * 128));
                _hidl_vec.add(_hidl_vec_element);
            }
            return _hidl_vec;
        }

        public final void readEmbeddedFromParcel(HwParcel parcel, HwBlob _hidl_blob, long _hidl_offset) {
            byte int8 = _hidl_blob.getInt8(0 + _hidl_offset);
            this.hidl_d = int8;
            switch (int8) {
                case 0:
                    CellInfoGsm cellInfoGsm = new CellInfoGsm();
                    this.hidl_o = cellInfoGsm;
                    cellInfoGsm.readEmbeddedFromParcel(parcel, _hidl_blob, 8 + _hidl_offset);
                    return;
                case 1:
                    CellInfoCdma cellInfoCdma = new CellInfoCdma();
                    this.hidl_o = cellInfoCdma;
                    cellInfoCdma.readEmbeddedFromParcel(parcel, _hidl_blob, 8 + _hidl_offset);
                    return;
                case 2:
                    CellInfoWcdma cellInfoWcdma = new CellInfoWcdma();
                    this.hidl_o = cellInfoWcdma;
                    cellInfoWcdma.readEmbeddedFromParcel(parcel, _hidl_blob, 8 + _hidl_offset);
                    return;
                case 3:
                    CellInfoTdscdma cellInfoTdscdma = new CellInfoTdscdma();
                    this.hidl_o = cellInfoTdscdma;
                    cellInfoTdscdma.readEmbeddedFromParcel(parcel, _hidl_blob, 8 + _hidl_offset);
                    return;
                case 4:
                    CellInfoLte cellInfoLte = new CellInfoLte();
                    this.hidl_o = cellInfoLte;
                    cellInfoLte.readEmbeddedFromParcel(parcel, _hidl_blob, 8 + _hidl_offset);
                    return;
                case 5:
                    CellInfoNr cellInfoNr = new CellInfoNr();
                    this.hidl_o = cellInfoNr;
                    cellInfoNr.readEmbeddedFromParcel(parcel, _hidl_blob, 8 + _hidl_offset);
                    return;
                default:
                    throw new IllegalStateException("Unknown union discriminator (value: " + this.hidl_d + ").");
            }
        }

        public final void writeToParcel(HwParcel parcel) {
            HwBlob _hidl_blob = new HwBlob(128);
            writeEmbeddedToBlob(_hidl_blob, 0);
            parcel.writeBuffer(_hidl_blob);
        }

        public static final void writeVectorToParcel(HwParcel parcel, ArrayList<Info> _hidl_vec) {
            HwBlob _hidl_blob = new HwBlob(16);
            int _hidl_vec_size = _hidl_vec.size();
            _hidl_blob.putInt32(8, _hidl_vec_size);
            _hidl_blob.putBool(12, false);
            HwBlob childBlob = new HwBlob(_hidl_vec_size * 128);
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
                _hidl_vec.get(_hidl_index_0).writeEmbeddedToBlob(childBlob, (long) (_hidl_index_0 * 128));
            }
            _hidl_blob.putBlob(0, childBlob);
            parcel.writeBuffer(_hidl_blob);
        }

        public final void writeEmbeddedToBlob(HwBlob _hidl_blob, long _hidl_offset) {
            _hidl_blob.putInt8(0 + _hidl_offset, this.hidl_d);
            switch (this.hidl_d) {
                case 0:
                    gsm().writeEmbeddedToBlob(_hidl_blob, 8 + _hidl_offset);
                    return;
                case 1:
                    cdma().writeEmbeddedToBlob(_hidl_blob, 8 + _hidl_offset);
                    return;
                case 2:
                    wcdma().writeEmbeddedToBlob(_hidl_blob, 8 + _hidl_offset);
                    return;
                case 3:
                    tdscdma().writeEmbeddedToBlob(_hidl_blob, 8 + _hidl_offset);
                    return;
                case 4:
                    lte().writeEmbeddedToBlob(_hidl_blob, 8 + _hidl_offset);
                    return;
                case 5:
                    mo1267nr().writeEmbeddedToBlob(_hidl_blob, 8 + _hidl_offset);
                    return;
                default:
                    throw new Error("Unknown union discriminator (value: " + this.hidl_d + ").");
            }
        }
    }

    public final boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null || otherObject.getClass() != CellInfo.class) {
            return false;
        }
        CellInfo other = (CellInfo) otherObject;
        if (this.isRegistered == other.isRegistered && this.connectionStatus == other.connectionStatus && HidlSupport.deepEquals(this.info, other.info)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(HidlSupport.deepHashCode(Boolean.valueOf(this.isRegistered))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.connectionStatus))), Integer.valueOf(HidlSupport.deepHashCode(this.info))});
    }

    public final String toString() {
        return "{" + ".isRegistered = " + this.isRegistered + ", .connectionStatus = " + CellConnectionStatus.toString(this.connectionStatus) + ", .info = " + this.info + "}";
    }

    public final void readFromParcel(HwParcel parcel) {
        readEmbeddedFromParcel(parcel, parcel.readBuffer(136), 0);
    }

    public static final ArrayList<CellInfo> readVectorFromParcel(HwParcel parcel) {
        ArrayList<CellInfo> _hidl_vec = new ArrayList<>();
        HwBlob _hidl_blob = parcel.readBuffer(16);
        int _hidl_vec_size = _hidl_blob.getInt32(8);
        HwBlob childBlob = parcel.readEmbeddedBuffer((long) (_hidl_vec_size * ImsCallSessionProxy.CALL_INFO_MSG_TYPE_REMOTE_RESUME), _hidl_blob.handle(), 0, true);
        _hidl_vec.clear();
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            CellInfo _hidl_vec_element = new CellInfo();
            _hidl_vec_element.readEmbeddedFromParcel(parcel, childBlob, (long) (_hidl_index_0 * ImsCallSessionProxy.CALL_INFO_MSG_TYPE_REMOTE_RESUME));
            _hidl_vec.add(_hidl_vec_element);
        }
        return _hidl_vec;
    }

    public final void readEmbeddedFromParcel(HwParcel parcel, HwBlob _hidl_blob, long _hidl_offset) {
        this.isRegistered = _hidl_blob.getBool(0 + _hidl_offset);
        this.connectionStatus = _hidl_blob.getInt32(4 + _hidl_offset);
        this.info.readEmbeddedFromParcel(parcel, _hidl_blob, 8 + _hidl_offset);
    }

    public final void writeToParcel(HwParcel parcel) {
        HwBlob _hidl_blob = new HwBlob(ImsCallSessionProxy.CALL_INFO_MSG_TYPE_REMOTE_RESUME);
        writeEmbeddedToBlob(_hidl_blob, 0);
        parcel.writeBuffer(_hidl_blob);
    }

    public static final void writeVectorToParcel(HwParcel parcel, ArrayList<CellInfo> _hidl_vec) {
        HwBlob _hidl_blob = new HwBlob(16);
        int _hidl_vec_size = _hidl_vec.size();
        _hidl_blob.putInt32(8, _hidl_vec_size);
        _hidl_blob.putBool(12, false);
        HwBlob childBlob = new HwBlob(_hidl_vec_size * ImsCallSessionProxy.CALL_INFO_MSG_TYPE_REMOTE_RESUME);
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            _hidl_vec.get(_hidl_index_0).writeEmbeddedToBlob(childBlob, (long) (_hidl_index_0 * ImsCallSessionProxy.CALL_INFO_MSG_TYPE_REMOTE_RESUME));
        }
        _hidl_blob.putBlob(0, childBlob);
        parcel.writeBuffer(_hidl_blob);
    }

    public final void writeEmbeddedToBlob(HwBlob _hidl_blob, long _hidl_offset) {
        _hidl_blob.putBool(0 + _hidl_offset, this.isRegistered);
        _hidl_blob.putInt32(4 + _hidl_offset, this.connectionStatus);
        this.info.writeEmbeddedToBlob(_hidl_blob, 8 + _hidl_offset);
    }
}
