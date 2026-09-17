package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
public final class zbm extends com.google.android.gms.internal.p000authapi.zba {
    zbm(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService"
            r1.<init>(r2, r0)
            return
    }

    public final void zbc(com.google.android.gms.internal.p000authapi.zbs r2, com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zba()
            com.google.android.gms.internal.p000authapi.zbc.zbd(r0, r2)
            com.google.android.gms.internal.p000authapi.zbc.zbc(r0, r3)
            r2 = 1
            r1.zbb(r2, r0)
            return
    }

    public final void zbd(com.google.android.gms.internal.p000authapi.zbu r2, com.google.android.gms.auth.api.identity.SavePasswordRequest r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zba()
            com.google.android.gms.internal.p000authapi.zbc.zbd(r0, r2)
            com.google.android.gms.internal.p000authapi.zbc.zbc(r0, r3)
            r2 = 2
            r1.zbb(r2, r0)
            return
    }
}
