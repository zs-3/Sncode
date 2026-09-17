package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
public abstract class zbq extends com.google.android.gms.internal.p000authapi.zbb implements com.google.android.gms.auth.api.signin.internal.zbr {
    public zbq() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    protected final boolean zba(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            switch(r1) {
                case 101: goto L23;
                case 102: goto L14;
                case 103: goto L5;
                default: goto L3;
            }
        L3:
            r1 = 0
            return r1
        L5:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r1 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.p000authapi.zbc.zba(r2, r1)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            com.google.android.gms.internal.p000authapi.zbc.zbb(r2)
            r0.zbb(r1)
            goto L39
        L14:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r1 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.p000authapi.zbc.zba(r2, r1)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            com.google.android.gms.internal.p000authapi.zbc.zbb(r2)
            r0.zbc(r1)
            goto L39
        L23:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> r1 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.p000authapi.zbc.zba(r2, r1)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r1
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r4 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.p000authapi.zbc.zba(r2, r4)
            com.google.android.gms.common.api.Status r4 = (com.google.android.gms.common.api.Status) r4
            com.google.android.gms.internal.p000authapi.zbc.zbb(r2)
            r0.zbd(r1, r4)
        L39:
            r3.writeNoException()
            r1 = 1
            return r1
    }
}
