package com.mediatek.ims;

import android.net.Uri;
import com.android.ims.internal.IImsRegistrationListener;
import java.util.function.Consumer;

public final /* synthetic */ class ImsService$$ExternalSyntheticLambda5 implements Consumer {
    public final /* synthetic */ ImsService f$0;
    public final /* synthetic */ Uri[] f$1;

    public /* synthetic */ ImsService$$ExternalSyntheticLambda5(ImsService imsService, Uri[] uriArr) {
        this.f$0 = imsService;
        this.f$1 = uriArr;
    }

    public final void accept(Object obj) {
        this.f$0.lambda$notifyRegistrationAssociatedUriChange$0$ImsService(this.f$1, (IImsRegistrationListener) obj);
    }
}
