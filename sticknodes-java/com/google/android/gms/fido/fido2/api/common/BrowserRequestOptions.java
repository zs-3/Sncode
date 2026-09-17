package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public abstract class BrowserRequestOptions extends com.google.android.gms.fido.fido2.api.common.RequestOptions {
    public BrowserRequestOptions() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract byte[] getClientDataHash();

    public abstract android.net.Uri getOrigin();
}
