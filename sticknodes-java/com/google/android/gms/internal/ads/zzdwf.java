package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzdwf extends com.google.android.gms.internal.ads.zzblx {
    final /* synthetic */ java.lang.Object zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzflp zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcas zze;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdwg zzf;

    zzdwf(com.google.android.gms.internal.ads.zzdwg r1, java.lang.Object r2, java.lang.String r3, long r4, com.google.android.gms.internal.ads.zzflp r6, com.google.android.gms.internal.ads.zzcas r7) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r6
            r0.zze = r7
            r0.zzf = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void zze(java.lang.String r8) {
            r7 = this;
            java.lang.Object r0 = r7.zza
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzdwg r1 = r7.zzf     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = r7.zzb     // Catch: java.lang.Throwable -> L4f
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L4f
            long r3 = r3.elapsedRealtime()     // Catch: java.lang.Throwable -> L4f
            long r5 = r7.zzc     // Catch: java.lang.Throwable -> L4f
            long r3 = r3 - r5
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L4f
            r3 = 0
            com.google.android.gms.internal.ads.zzdwg.zzk(r1, r2, r3, r8, r4)     // Catch: java.lang.Throwable -> L4f
            com.google.android.gms.internal.ads.zzdwg r1 = r7.zzf     // Catch: java.lang.Throwable -> L4f
            com.google.android.gms.internal.ads.zzdun r1 = com.google.android.gms.internal.ads.zzdwg.zzd(r1)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = r7.zzb     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = "error"
            r1.zzb(r2, r4)     // Catch: java.lang.Throwable -> L4f
            com.google.android.gms.internal.ads.zzdwg r1 = r7.zzf     // Catch: java.lang.Throwable -> L4f
            com.google.android.gms.internal.ads.zzdez r1 = com.google.android.gms.internal.ads.zzdwg.zzc(r1)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = r7.zzb     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = "error"
            r1.zzb(r2, r4)     // Catch: java.lang.Throwable -> L4f
            com.google.android.gms.internal.ads.zzdwg r1 = r7.zzf     // Catch: java.lang.Throwable -> L4f
            com.google.android.gms.internal.ads.zzfmd r1 = com.google.android.gms.internal.ads.zzdwg.zze(r1)     // Catch: java.lang.Throwable -> L4f
            com.google.android.gms.internal.ads.zzflp r2 = r7.zzd     // Catch: java.lang.Throwable -> L4f
            r2.zzc(r8)     // Catch: java.lang.Throwable -> L4f
            r2.zzg(r3)     // Catch: java.lang.Throwable -> L4f
            com.google.android.gms.internal.ads.zzflt r8 = r2.zzm()     // Catch: java.lang.Throwable -> L4f
            r1.zzb(r8)     // Catch: java.lang.Throwable -> L4f
            com.google.android.gms.internal.ads.zzcas r8 = r7.zze     // Catch: java.lang.Throwable -> L4f
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L4f
            r8.zzc(r1)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            return
        L4f:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            throw r8
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void zzf() {
            r8 = this;
            java.lang.Object r0 = r8.zza
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzdwg r1 = r8.zzf     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = r8.zzb     // Catch: java.lang.Throwable -> L4a
            java.lang.String r3 = ""
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L4a
            long r4 = r4.elapsedRealtime()     // Catch: java.lang.Throwable -> L4a
            long r6 = r8.zzc     // Catch: java.lang.Throwable -> L4a
            long r4 = r4 - r6
            int r5 = (int) r4     // Catch: java.lang.Throwable -> L4a
            r4 = 1
            com.google.android.gms.internal.ads.zzdwg.zzk(r1, r2, r4, r3, r5)     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.internal.ads.zzdwg r1 = r8.zzf     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.internal.ads.zzdun r1 = com.google.android.gms.internal.ads.zzdwg.zzd(r1)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = r8.zzb     // Catch: java.lang.Throwable -> L4a
            r1.zzd(r2)     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.internal.ads.zzdwg r1 = r8.zzf     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.internal.ads.zzdez r1 = com.google.android.gms.internal.ads.zzdwg.zzc(r1)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = r8.zzb     // Catch: java.lang.Throwable -> L4a
            r1.zzd(r2)     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.internal.ads.zzdwg r1 = r8.zzf     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.internal.ads.zzfmd r1 = com.google.android.gms.internal.ads.zzdwg.zze(r1)     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.internal.ads.zzflp r2 = r8.zzd     // Catch: java.lang.Throwable -> L4a
            r2.zzg(r4)     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.internal.ads.zzflt r2 = r2.zzm()     // Catch: java.lang.Throwable -> L4a
            r1.zzb(r2)     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.internal.ads.zzcas r1 = r8.zze     // Catch: java.lang.Throwable -> L4a
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L4a
            r1.zzc(r2)     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return
        L4a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r1
    }
}
