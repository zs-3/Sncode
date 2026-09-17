package com.google.android.gms.common.internal.service;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
public abstract class zaj extends com.google.android.gms.internal.base.zab implements com.google.android.gms.common.internal.service.zak {
    public zaj() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.service.ICommonCallbacks"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.base.zab
    protected final boolean zaa(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r3 = 1
            if (r1 != r3) goto Le
            int r1 = r2.readInt()
            com.google.android.gms.internal.base.zac.zab(r2)
            r0.zab(r1)
            return r3
        Le:
            r1 = 0
            return r1
    }
}
