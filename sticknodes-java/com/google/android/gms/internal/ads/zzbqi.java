package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzbqi implements com.google.android.gms.ads.mediation.MediationAdLoadCallback {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbpr zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbqm zzb;

    zzbqi(com.google.android.gms.internal.ads.zzbqm r1, com.google.android.gms.internal.ads.zzbpr r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(com.google.android.gms.ads.AdError r6) {
            r5 = this;
            com.google.android.gms.internal.ads.zzbqm r0 = r5.zzb     // Catch: android.os.RemoteException -> L61
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbqm.zzb(r0)     // Catch: android.os.RemoteException -> L61
            java.lang.Class r0 = r0.getClass()     // Catch: android.os.RemoteException -> L61
            java.lang.String r0 = r0.getCanonicalName()     // Catch: android.os.RemoteException -> L61
            int r1 = r6.getCode()     // Catch: android.os.RemoteException -> L61
            java.lang.String r2 = r6.getMessage()     // Catch: android.os.RemoteException -> L61
            java.lang.String r3 = r6.getDomain()     // Catch: android.os.RemoteException -> L61
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> L61
            r4.<init>()     // Catch: android.os.RemoteException -> L61
            r4.append(r0)     // Catch: android.os.RemoteException -> L61
            java.lang.String r0 = "failed to load mediation ad: ErrorCode = "
            r4.append(r0)     // Catch: android.os.RemoteException -> L61
            r4.append(r1)     // Catch: android.os.RemoteException -> L61
            java.lang.String r0 = ". ErrorMessage = "
            r4.append(r0)     // Catch: android.os.RemoteException -> L61
            r4.append(r2)     // Catch: android.os.RemoteException -> L61
            java.lang.String r0 = ". ErrorDomain = "
            r4.append(r0)     // Catch: android.os.RemoteException -> L61
            r4.append(r3)     // Catch: android.os.RemoteException -> L61
            java.lang.String r0 = r4.toString()     // Catch: android.os.RemoteException -> L61
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)     // Catch: android.os.RemoteException -> L61
            com.google.android.gms.internal.ads.zzbpr r0 = r5.zza     // Catch: android.os.RemoteException -> L61
            com.google.android.gms.ads.internal.client.zze r1 = r6.zza()     // Catch: android.os.RemoteException -> L61
            r0.zzh(r1)     // Catch: android.os.RemoteException -> L61
            com.google.android.gms.internal.ads.zzbpr r0 = r5.zza     // Catch: android.os.RemoteException -> L61
            int r1 = r6.getCode()     // Catch: android.os.RemoteException -> L61
            java.lang.String r2 = r6.getMessage()     // Catch: android.os.RemoteException -> L61
            r0.zzi(r1, r2)     // Catch: android.os.RemoteException -> L61
            com.google.android.gms.internal.ads.zzbpr r0 = r5.zza     // Catch: android.os.RemoteException -> L61
            int r6 = r6.getCode()     // Catch: android.os.RemoteException -> L61
            r0.zzg(r6)     // Catch: android.os.RemoteException -> L61
            return
        L61:
            r6 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r6)
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
    public final /* bridge */ /* synthetic */ java.lang.Object onSuccess(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.ads.mediation.UnifiedNativeAdMapper r2 = (com.google.android.gms.ads.mediation.UnifiedNativeAdMapper) r2
            com.google.android.gms.internal.ads.zzbqm r0 = r1.zzb     // Catch: android.os.RemoteException -> Ld
            com.google.android.gms.internal.ads.zzbqm.zzT(r0, r2)     // Catch: android.os.RemoteException -> Ld
            com.google.android.gms.internal.ads.zzbpr r2 = r1.zza     // Catch: android.os.RemoteException -> Ld
            r2.zzo()     // Catch: android.os.RemoteException -> Ld
            goto L13
        Ld:
            r2 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
        L13:
            com.google.android.gms.internal.ads.zzbpr r2 = r1.zza
            com.google.android.gms.internal.ads.zzbqc r0 = new com.google.android.gms.internal.ads.zzbqc
            r0.<init>(r2)
            return r0
    }
}
