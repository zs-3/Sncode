package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
public abstract class zbh extends com.google.android.gms.internal.p000authapi.zbb implements com.google.android.gms.internal.p000authapi.zbi {
    public zbh() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    protected final boolean zba(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r3 = 1
            if (r1 != r3) goto L1a
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r1 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.p000authapi.zbc.zba(r2, r1)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.identity.AuthorizationResult> r4 = com.google.android.gms.auth.api.identity.AuthorizationResult.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.p000authapi.zbc.zba(r2, r4)
            com.google.android.gms.auth.api.identity.AuthorizationResult r4 = (com.google.android.gms.auth.api.identity.AuthorizationResult) r4
            com.google.android.gms.internal.p000authapi.zbc.zbb(r2)
            r0.zbb(r1, r4)
            return r3
        L1a:
            r1 = 0
            return r1
    }
}
