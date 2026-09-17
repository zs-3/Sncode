package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbzt implements java.lang.Runnable {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcas zzb;

    zzbzt(com.google.android.gms.internal.ads.zzbzu r1, android.content.Context r2, com.google.android.gms.internal.ads.zzcas r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            android.content.Context r0 = r2.zza     // Catch: com.google.android.gms.common.GooglePlayServicesRepairableException -> Lc com.google.android.gms.common.GooglePlayServicesNotAvailableException -> Le java.lang.IllegalStateException -> L10 java.io.IOException -> L12
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r0 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r0)     // Catch: com.google.android.gms.common.GooglePlayServicesRepairableException -> Lc com.google.android.gms.common.GooglePlayServicesNotAvailableException -> Le java.lang.IllegalStateException -> L10 java.io.IOException -> L12
            com.google.android.gms.internal.ads.zzcas r1 = r2.zzb     // Catch: com.google.android.gms.common.GooglePlayServicesRepairableException -> Lc com.google.android.gms.common.GooglePlayServicesNotAvailableException -> Le java.lang.IllegalStateException -> L10 java.io.IOException -> L12
            r1.zzc(r0)     // Catch: com.google.android.gms.common.GooglePlayServicesRepairableException -> Lc com.google.android.gms.common.GooglePlayServicesNotAvailableException -> Le java.lang.IllegalStateException -> L10 java.io.IOException -> L12
            return
        Lc:
            r0 = move-exception
            goto L13
        Le:
            r0 = move-exception
            goto L13
        L10:
            r0 = move-exception
            goto L13
        L12:
            r0 = move-exception
        L13:
            com.google.android.gms.internal.ads.zzcas r1 = r2.zzb
            r1.zzd(r0)
            java.lang.String r1 = "Exception while getting advertising Id info"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            return
    }
}
