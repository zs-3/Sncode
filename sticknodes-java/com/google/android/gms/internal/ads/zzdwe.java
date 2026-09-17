package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzdwe implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzdwg zza;

    zzdwe(com.google.android.gms.internal.ads.zzdwg r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(java.lang.Throwable r8) {
            r7 = this;
            monitor-enter(r7)
            com.google.android.gms.internal.ads.zzdwg r8 = r7.zza     // Catch: java.lang.Throwable -> L31
            r0 = 1
            com.google.android.gms.internal.ads.zzdwg.zzi(r8, r0)     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzdwg r8 = r7.zza     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = "com.google.android.gms.ads.MobileAds"
            r1 = 0
            java.lang.String r2 = "Internal Error."
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L31
            long r3 = r3.elapsedRealtime()     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzdwg r5 = r7.zza     // Catch: java.lang.Throwable -> L31
            long r5 = com.google.android.gms.internal.ads.zzdwg.zza(r5)     // Catch: java.lang.Throwable -> L31
            long r3 = r3 - r5
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzdwg.zzk(r8, r0, r1, r2, r4)     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzdwg r8 = r7.zza     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzcas r8 = com.google.android.gms.internal.ads.zzdwg.zzb(r8)     // Catch: java.lang.Throwable -> L31
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L31
            r0.<init>()     // Catch: java.lang.Throwable -> L31
            r8.zzd(r0)     // Catch: java.lang.Throwable -> L31
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L31
            return
        L31:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L31
            throw r8
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r9) {
            r8 = this;
            java.lang.String r9 = (java.lang.String) r9
            monitor-enter(r8)
            com.google.android.gms.internal.ads.zzdwg r0 = r8.zza     // Catch: java.lang.Throwable -> L32
            r1 = 1
            com.google.android.gms.internal.ads.zzdwg.zzi(r0, r1)     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.internal.ads.zzdwg r0 = r8.zza     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "com.google.android.gms.ads.MobileAds"
            java.lang.String r3 = ""
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L32
            long r4 = r4.elapsedRealtime()     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.internal.ads.zzdwg r6 = r8.zza     // Catch: java.lang.Throwable -> L32
            long r6 = com.google.android.gms.internal.ads.zzdwg.zza(r6)     // Catch: java.lang.Throwable -> L32
            long r4 = r4 - r6
            int r5 = (int) r4     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.internal.ads.zzdwg.zzk(r0, r2, r1, r3, r5)     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.internal.ads.zzdwg r0 = r8.zza     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.Executor r0 = com.google.android.gms.internal.ads.zzdwg.zzh(r0)     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.internal.ads.zzdwd r1 = new com.google.android.gms.internal.ads.zzdwd     // Catch: java.lang.Throwable -> L32
            r1.<init>(r8, r9)     // Catch: java.lang.Throwable -> L32
            r0.execute(r1)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L32
            throw r9
    }
}
