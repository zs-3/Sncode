package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbzz extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcad zza;

    zzbzz(com.google.android.gms.internal.ads.zzcad r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcy r0 = new com.google.android.gms.internal.ads.zzbcy
            com.google.android.gms.internal.ads.zzcad r1 = r3.zza
            android.content.Context r2 = com.google.android.gms.internal.ads.zzcad.zzc(r1)
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r1 = com.google.android.gms.internal.ads.zzcad.zzj(r1)
            java.lang.String r1 = r1.afmaVersion
            r0.<init>(r2, r1)
            com.google.android.gms.internal.ads.zzcad r1 = r3.zza
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzcad.zzm(r1)
            monitor-enter(r1)
            com.google.android.gms.ads.internal.zzu.zze()     // Catch: java.lang.Throwable -> L25 java.lang.IllegalArgumentException -> L27
            com.google.android.gms.internal.ads.zzcad r2 = r3.zza     // Catch: java.lang.Throwable -> L25 java.lang.IllegalArgumentException -> L27
            com.google.android.gms.internal.ads.zzbda r2 = com.google.android.gms.internal.ads.zzcad.zzf(r2)     // Catch: java.lang.Throwable -> L25 java.lang.IllegalArgumentException -> L27
            com.google.android.gms.internal.ads.zzbdb.zza(r2, r0)     // Catch: java.lang.Throwable -> L25 java.lang.IllegalArgumentException -> L27
            goto L2d
        L25:
            r0 = move-exception
            goto L2f
        L27:
            r0 = move-exception
            java.lang.String r2 = "Cannot config CSI reporter."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r2, r0)     // Catch: java.lang.Throwable -> L25
        L2d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L25
            return
        L2f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L25
            throw r0
    }
}
