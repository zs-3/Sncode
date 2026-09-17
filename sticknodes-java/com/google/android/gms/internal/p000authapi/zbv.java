package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
public final class zbv extends com.google.android.gms.internal.p000authapi.zba {
    zbv(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.auth.api.identity.internal.ISignInService"
            r1.<init>(r2, r0)
            return
    }

    public final void zbc(com.google.android.gms.internal.p000authapi.zbl r2, com.google.android.gms.auth.api.identity.BeginSignInRequest r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zba()
            com.google.android.gms.internal.p000authapi.zbc.zbd(r0, r2)
            com.google.android.gms.internal.p000authapi.zbc.zbc(r0, r3)
            r2 = 1
            r1.zbb(r2, r0)
            return
    }

    public final void zbd(com.google.android.gms.internal.p000authapi.zbo r2, com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest r3, java.lang.String r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zba()
            com.google.android.gms.internal.p000authapi.zbc.zbd(r0, r2)
            com.google.android.gms.internal.p000authapi.zbc.zbc(r0, r3)
            r0.writeString(r4)
            r2 = 4
            r1.zbb(r2, r0)
            return
    }

    public final void zbe(com.google.android.gms.internal.p000authapi.zbq r2, com.google.android.gms.auth.api.identity.GetSignInIntentRequest r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zba()
            com.google.android.gms.internal.p000authapi.zbc.zbd(r0, r2)
            com.google.android.gms.internal.p000authapi.zbc.zbc(r0, r3)
            r2 = 3
            r1.zbb(r2, r0)
            return
    }

    public final void zbf(com.google.android.gms.common.api.internal.IStatusCallback r2, java.lang.String r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zba()
            com.google.android.gms.internal.p000authapi.zbc.zbd(r0, r2)
            r0.writeString(r3)
            r2 = 2
            r1.zbb(r2, r0)
            return
    }
}
