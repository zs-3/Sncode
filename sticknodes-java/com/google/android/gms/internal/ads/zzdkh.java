package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzdkh implements com.google.android.gms.internal.ads.zzayv {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdkk zzb;

    zzdkh(com.google.android.gms.internal.ads.zzdkk r1, java.lang.String r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayv
    public final void zzdp(com.google.android.gms.internal.ads.zzayu r5) {
            r4 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzbM
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 == 0) goto L53
            monitor-enter(r4)
            boolean r5 = r5.zzj     // Catch: java.lang.Throwable -> L50
            if (r5 == 0) goto L4e
            com.google.android.gms.internal.ads.zzdkk r5 = r4.zzb     // Catch: java.lang.Throwable -> L50
            com.google.android.gms.internal.ads.zzdml r0 = com.google.android.gms.internal.ads.zzdkk.zze(r5)     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L22
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L50
            return
        L22:
            java.util.Map r5 = com.google.android.gms.internal.ads.zzdkk.zzh(r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = r4.zza     // Catch: java.lang.Throwable -> L50
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L50
            r5.put(r0, r2)     // Catch: java.lang.Throwable -> L50
            com.google.android.gms.internal.ads.zzdkk r5 = r4.zzb     // Catch: java.lang.Throwable -> L50
            com.google.android.gms.internal.ads.zzdml r0 = com.google.android.gms.internal.ads.zzdkk.zze(r5)     // Catch: java.lang.Throwable -> L50
            android.view.View r0 = r0.zzf()     // Catch: java.lang.Throwable -> L50
            com.google.android.gms.internal.ads.zzdkk r2 = r4.zzb     // Catch: java.lang.Throwable -> L50
            com.google.android.gms.internal.ads.zzdml r2 = com.google.android.gms.internal.ads.zzdkk.zze(r2)     // Catch: java.lang.Throwable -> L50
            java.util.Map r2 = r2.zzl()     // Catch: java.lang.Throwable -> L50
            com.google.android.gms.internal.ads.zzdkk r3 = r4.zzb     // Catch: java.lang.Throwable -> L50
            com.google.android.gms.internal.ads.zzdml r3 = com.google.android.gms.internal.ads.zzdkk.zze(r3)     // Catch: java.lang.Throwable -> L50
            java.util.Map r3 = r3.zzm()     // Catch: java.lang.Throwable -> L50
            r5.zzB(r0, r2, r3, r1)     // Catch: java.lang.Throwable -> L50
        L4e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L50
            return
        L50:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L50
            throw r5
        L53:
            boolean r5 = r5.zzj
            if (r5 == 0) goto L85
            com.google.android.gms.internal.ads.zzdkk r5 = r4.zzb
            java.lang.String r0 = r4.zza
            java.util.Map r5 = com.google.android.gms.internal.ads.zzdkk.zzh(r5)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r5.put(r0, r2)
            com.google.android.gms.internal.ads.zzdkk r5 = r4.zzb
            com.google.android.gms.internal.ads.zzdml r0 = com.google.android.gms.internal.ads.zzdkk.zze(r5)
            android.view.View r0 = r0.zzf()
            com.google.android.gms.internal.ads.zzdkk r2 = r4.zzb
            com.google.android.gms.internal.ads.zzdml r2 = com.google.android.gms.internal.ads.zzdkk.zze(r2)
            java.util.Map r2 = r2.zzl()
            com.google.android.gms.internal.ads.zzdkk r3 = r4.zzb
            com.google.android.gms.internal.ads.zzdml r3 = com.google.android.gms.internal.ads.zzdkk.zze(r3)
            java.util.Map r3 = r3.zzm()
            r5.zzB(r0, r2, r3, r1)
        L85:
            return
    }
}
