package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbwl extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbwm {
    public zzbwl() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.reward.client.IRewardItem"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r2 = 1
            if (r1 == r2) goto L13
            r4 = 2
            if (r1 == r4) goto L8
            r1 = 0
            return r1
        L8:
            int r1 = r0.zzb()
            r3.writeNoException()
            r3.writeInt(r1)
            goto L1d
        L13:
            java.lang.String r1 = r0.zzc()
            r3.writeNoException()
            r3.writeString(r1)
        L1d:
            return r2
    }
}
