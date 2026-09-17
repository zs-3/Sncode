package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzelv implements com.google.android.gms.internal.ads.zzczj {
    boolean zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzegn zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcas zzc;

    zzelv(com.google.android.gms.internal.ads.zzelw r1, com.google.android.gms.internal.ads.zzegn r2, com.google.android.gms.internal.ads.zzcas r3) {
            r0 = this;
            r0.zzb = r2
            r0.zzc = r3
            r0.<init>()
            r1 = 0
            r0.zza = r1
            return
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze r3) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzfm     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L22
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L22
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L22
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L22
            r1 = 1
            if (r1 == r0) goto L15
            goto L16
        L15:
            r1 = 3
        L16:
            com.google.android.gms.internal.ads.zzego r0 = new com.google.android.gms.internal.ads.zzego     // Catch: java.lang.Throwable -> L22
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.ads.zzcas r3 = r2.zzc     // Catch: java.lang.Throwable -> L22
            r3.zzd(r0)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r2)
            return
        L22:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final synchronized void zza(int r8) {
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.zza     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L7
            monitor-exit(r7)
            return
        L7:
            r0 = 1
            r7.zza = r0     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.ads.zzegn r0 = r7.zzb     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = r0.zza     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = com.google.android.gms.internal.ads.zzelw.zze(r0, r8)     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = "undefined"
            com.google.android.gms.ads.internal.client.zze r0 = new com.google.android.gms.ads.internal.client.zze     // Catch: java.lang.Throwable -> L22
            r5 = 0
            r6 = 0
            r1 = r0
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L22
            r7.zze(r0)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r7)
            return
        L22:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zze r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zza     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L7
            monitor-exit(r1)
            return
        L7:
            r0 = 1
            r1.zza = r0     // Catch: java.lang.Throwable -> Lf
            r1.zze(r2)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return
        Lf:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final synchronized void zzc(int r7, java.lang.String r8) {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.zza     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L7
            monitor-exit(r6)
            return
        L7:
            r0 = 1
            r6.zza = r0     // Catch: java.lang.Throwable -> L25
            if (r8 != 0) goto L14
            com.google.android.gms.internal.ads.zzegn r8 = r6.zzb     // Catch: java.lang.Throwable -> L25
            java.lang.String r8 = r8.zza     // Catch: java.lang.Throwable -> L25
            java.lang.String r8 = com.google.android.gms.internal.ads.zzelw.zze(r8, r7)     // Catch: java.lang.Throwable -> L25
        L14:
            r2 = r8
            java.lang.String r3 = "undefined"
            com.google.android.gms.ads.internal.client.zze r8 = new com.google.android.gms.ads.internal.client.zze     // Catch: java.lang.Throwable -> L25
            r4 = 0
            r5 = 0
            r0 = r8
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L25
            r6.zze(r8)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r6)
            return
        L25:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final synchronized void zzd() {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzcas r0 = r2.zzc     // Catch: java.lang.Throwable -> L9
            r1 = 0
            r0.zzc(r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return
        L9:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }
}
