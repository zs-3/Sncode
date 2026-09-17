package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzbrw implements com.google.android.gms.ads.mediation.MediationAdLoadCallback {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbrh zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbpr zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbrx zzc;

    zzbrw(com.google.android.gms.internal.ads.zzbrx r1, com.google.android.gms.internal.ads.zzbrh r2, com.google.android.gms.internal.ads.zzbpr r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(com.google.android.gms.ads.AdError r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbrh r0 = r1.zza     // Catch: android.os.RemoteException -> La
            com.google.android.gms.ads.internal.client.zze r2 = r2.zza()     // Catch: android.os.RemoteException -> La
            r0.zzf(r2)     // Catch: android.os.RemoteException -> La
            return
        La:
            r2 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(java.lang.String r4) {
            r3 = this;
            com.google.android.gms.ads.AdError r0 = new com.google.android.gms.ads.AdError
            r1 = 0
            java.lang.String r2 = "undefined"
            r0.<init>(r1, r4, r2)
            r3.onFailure(r0)
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ java.lang.Object onSuccess(java.lang.Object r4) {
            r3 = this;
            com.google.android.gms.ads.mediation.MediationRewardedAd r4 = (com.google.android.gms.ads.mediation.MediationRewardedAd) r4
            r0 = 0
            java.lang.String r1 = ""
            if (r4 != 0) goto L19
            java.lang.String r4 = "Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
            com.google.android.gms.internal.ads.zzbrh r4 = r3.zza     // Catch: android.os.RemoteException -> L14
            java.lang.String r2 = "Adapter returned null."
            r4.zze(r2)     // Catch: android.os.RemoteException -> L14
            goto L2f
        L14:
            r4 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r4)
            goto L2f
        L19:
            com.google.android.gms.internal.ads.zzbrx r0 = r3.zzc     // Catch: android.os.RemoteException -> L24
            com.google.android.gms.internal.ads.zzbrx.zzu(r0, r4)     // Catch: android.os.RemoteException -> L24
            com.google.android.gms.internal.ads.zzbrh r4 = r3.zza     // Catch: android.os.RemoteException -> L24
            r4.zzg()     // Catch: android.os.RemoteException -> L24
            goto L28
        L24:
            r4 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r4)
        L28:
            com.google.android.gms.internal.ads.zzbpr r4 = r3.zzb
            com.google.android.gms.internal.ads.zzbry r0 = new com.google.android.gms.internal.ads.zzbry
            r0.<init>(r4)
        L2f:
            return r0
    }
}
