package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzceh implements com.google.android.gms.internal.ads.zzko {
    private final com.google.android.gms.internal.ads.zzza zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private int zzf;
    private boolean zzg;

    zzceh() {
            r3 = this;
            r3.<init>()
            com.google.android.gms.internal.ads.zzza r0 = new com.google.android.gms.internal.ads.zzza
            r1 = 1
            r2 = 65536(0x10000, float:9.18355E-41)
            r0.<init>(r1, r2)
            r3.zza = r0
            r0 = 15000000(0xe4e1c0, double:7.4109847E-317)
            r3.zzb = r0
            r0 = 30000000(0x1c9c380, double:1.48219694E-316)
            r3.zzc = r0
            r0 = 2500000(0x2625a0, double:1.235164E-317)
            r3.zzd = r0
            r0 = 5000000(0x4c4b40, double:2.470328E-317)
            r3.zze = r0
            return
    }

    final void zza(boolean r2) {
            r1 = this;
            r0 = 0
            r1.zzf = r0
            r1.zzg = r0
            if (r2 == 0) goto Lc
            com.google.android.gms.internal.ads.zzza r2 = r1.zza
            r2.zze()
        Lc:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final long zzb(com.google.android.gms.internal.ads.zzom r3) {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzc(com.google.android.gms.internal.ads.zzom r1) {
            r0 = this;
            r1 = 0
            r0.zza(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzd(com.google.android.gms.internal.ads.zzom r1) {
            r0 = this;
            r1 = 1
            r0.zza(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zze(com.google.android.gms.internal.ads.zzom r1) {
            r0 = this;
            r1 = 1
            r0.zza(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzf(com.google.android.gms.internal.ads.zzom r1, com.google.android.gms.internal.ads.zzcc r2, com.google.android.gms.internal.ads.zzuy r3, com.google.android.gms.internal.ads.zzlr[] r4, com.google.android.gms.internal.ads.zzwy r5, com.google.android.gms.internal.ads.zzyl[] r6) {
            r0 = this;
            r1 = 0
            r0.zzf = r1
        L3:
            int r2 = r4.length
            r2 = 2
            if (r1 >= r2) goto L21
            r2 = r6[r1]
            if (r2 == 0) goto L1e
            int r2 = r0.zzf
            r3 = r4[r1]
            int r3 = r3.zzb()
            r5 = 1
            if (r3 == r5) goto L19
            r3 = 131072000(0x7d00000, float:3.1296362E-34)
            goto L1b
        L19:
            r3 = 13107200(0xc80000, float:1.8367099E-38)
        L1b:
            int r2 = r2 + r3
            r0.zzf = r2
        L1e:
            int r1 = r1 + 1
            goto L3
        L21:
            com.google.android.gms.internal.ads.zzza r1 = r0.zza
            int r2 = r0.zzf
            r1.zzf(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final boolean zzg(com.google.android.gms.internal.ads.zzom r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final boolean zzh(com.google.android.gms.internal.ads.zzkn r8) {
            r7 = this;
            long r0 = r8.zzb
            long r2 = r7.zzc
            r8 = 2
            r4 = 1
            r5 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto Ld
            r0 = 0
            goto L16
        Ld:
            long r2 = r7.zzb
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L15
            r0 = 2
            goto L16
        L15:
            r0 = 1
        L16:
            com.google.android.gms.internal.ads.zzza r1 = r7.zza
            int r1 = r1.zza()
            int r2 = r7.zzf
            if (r0 == r8) goto L2a
            if (r0 != r4) goto L29
            boolean r8 = r7.zzg
            if (r8 == 0) goto L29
            if (r1 >= r2) goto L29
            goto L2a
        L29:
            r4 = 0
        L2a:
            r7.zzg = r4
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final boolean zzi(com.google.android.gms.internal.ads.zzkn r6) {
            r5 = this;
            boolean r0 = r6.zzd
            if (r0 == 0) goto L7
            long r0 = r5.zze
            goto L9
        L7:
            long r0 = r5.zzd
        L9:
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L18
            long r2 = r6.zzb
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 < 0) goto L16
            goto L18
        L16:
            r6 = 0
            return r6
        L18:
            r6 = 1
            return r6
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final com.google.android.gms.internal.ads.zzza zzj() {
            r1 = this;
            com.google.android.gms.internal.ads.zzza r0 = r1.zza
            return r0
    }

    public final synchronized void zzk(int r5) {
            r4 = this;
            monitor-enter(r4)
            long r0 = (long) r5
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            r4.zzd = r0     // Catch: java.lang.Throwable -> La
            monitor-exit(r4)
            return
        La:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    public final synchronized void zzl(int r5) {
            r4 = this;
            monitor-enter(r4)
            long r0 = (long) r5
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            r4.zze = r0     // Catch: java.lang.Throwable -> La
            monitor-exit(r4)
            return
        La:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    public final synchronized void zzm(int r5) {
            r4 = this;
            monitor-enter(r4)
            long r0 = (long) r5
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            r4.zzc = r0     // Catch: java.lang.Throwable -> La
            monitor-exit(r4)
            return
        La:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    public final synchronized void zzn(int r5) {
            r4 = this;
            monitor-enter(r4)
            long r0 = (long) r5
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            r4.zzb = r0     // Catch: java.lang.Throwable -> La
            monitor-exit(r4)
            return
        La:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }
}
