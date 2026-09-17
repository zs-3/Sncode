package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
public abstract class zbo extends com.google.android.gms.internal.p000authapi.zbb implements com.google.android.gms.auth.api.signin.internal.zbp {
    public zbo() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.auth.api.signin.internal.IRevocationService"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    protected final boolean zba(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r2 = 1
            if (r1 == r2) goto Lc
            r3 = 2
            if (r1 == r3) goto L8
            r1 = 0
            return r1
        L8:
            r0.zbb()
            goto Lf
        Lc:
            r0.zbc()
        Lf:
            return r2
    }
}
