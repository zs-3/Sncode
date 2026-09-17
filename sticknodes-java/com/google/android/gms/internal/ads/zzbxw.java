package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbxw extends com.google.android.gms.internal.ads.zzbxb {
    private final java.lang.String zza;
    private final int zzb;

    public zzbxw(com.google.android.gms.ads.rewarded.RewardItem r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.lang.String r0 = r2.getType()
            goto L9
        L7:
            java.lang.String r0 = ""
        L9:
            if (r2 == 0) goto L10
            int r2 = r2.getAmount()
            goto L11
        L10:
            r2 = 1
        L11:
            r1.<init>(r0, r2)
            return
    }

    public zzbxw(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final int zze() throws android.os.RemoteException {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final java.lang.String zzf() throws android.os.RemoteException {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }
}
