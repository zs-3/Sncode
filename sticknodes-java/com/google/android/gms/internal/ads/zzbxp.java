package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbxp implements com.google.android.gms.ads.rewarded.RewardItem {
    private final com.google.android.gms.internal.ads.zzbxc zza;

    public zzbxp(com.google.android.gms.internal.ads.zzbxc r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
            r3 = this;
            com.google.android.gms.internal.ads.zzbxc r0 = r3.zza
            r1 = 0
            if (r0 == 0) goto L10
            int r0 = r0.zze()     // Catch: android.os.RemoteException -> La
            return r0
        La:
            r0 = move-exception
            java.lang.String r2 = "Could not forward getAmount to RewardItem"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r2, r0)
        L10:
            return r1
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final java.lang.String getType() {
            r3 = this;
            com.google.android.gms.internal.ads.zzbxc r0 = r3.zza
            r1 = 0
            if (r0 == 0) goto L10
            java.lang.String r0 = r0.zzf()     // Catch: android.os.RemoteException -> La
            return r0
        La:
            r0 = move-exception
            java.lang.String r2 = "Could not forward getType to RewardItem"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r2, r0)
        L10:
            return r1
    }
}
