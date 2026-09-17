package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzzo {
    public static final com.google.android.gms.internal.ads.zzzi zza = null;
    public static final com.google.android.gms.internal.ads.zzzi zzb = null;
    private final java.util.concurrent.Executor zzc;
    private final java.lang.Runnable zzd;
    private com.google.android.gms.internal.ads.zzzj zze;
    private java.io.IOException zzf;

    static {
            com.google.android.gms.internal.ads.zzzi r0 = new com.google.android.gms.internal.ads.zzzi
            r1 = 2
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 0
            r0.<init>(r1, r2, r4)
            com.google.android.gms.internal.ads.zzzo.zza = r0
            com.google.android.gms.internal.ads.zzzi r0 = new com.google.android.gms.internal.ads.zzzi
            r1 = 3
            r0.<init>(r1, r2, r4)
            com.google.android.gms.internal.ads.zzzo.zzb = r0
            return
    }

    public zzzo(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzes r2 = new com.google.android.gms.internal.ads.zzes
            java.lang.String r0 = "ExoPlayer:Loader:ProgressiveMediaPeriod"
            r2.<init>(r0)
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newSingleThreadExecutor(r2)
            r1.zzc = r2
            java.util.Objects.requireNonNull(r2)
            com.google.android.gms.internal.ads.zzzf r0 = new com.google.android.gms.internal.ads.zzzf
            r0.<init>(r2)
            r1.zzd = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzzi zzb(boolean r2, long r3) {
            com.google.android.gms.internal.ads.zzzi r0 = new com.google.android.gms.internal.ads.zzzi
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzzj zzc(com.google.android.gms.internal.ads.zzzo r0) {
            com.google.android.gms.internal.ads.zzzj r0 = r0.zze
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.Executor zzd(com.google.android.gms.internal.ads.zzzo r0) {
            java.util.concurrent.Executor r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ void zze(com.google.android.gms.internal.ads.zzzo r0, com.google.android.gms.internal.ads.zzzj r1) {
            r0.zze = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzzo r0, java.io.IOException r1) {
            r0.zzf = r1
            return
    }

    public final long zza(com.google.android.gms.internal.ads.zzzk r12, com.google.android.gms.internal.ads.zzzg r13, int r14) {
            r11 = this;
            android.os.Looper r2 = android.os.Looper.myLooper()
            com.google.android.gms.internal.ads.zzdi.zzb(r2)
            r0 = 0
            r11.zzf = r0
            long r8 = android.os.SystemClock.elapsedRealtime()
            com.google.android.gms.internal.ads.zzzj r10 = new com.google.android.gms.internal.ads.zzzj
            r0 = r10
            r1 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12 = 0
            r10.zzc(r12)
            return r8
    }

    public final void zzg() {
            r2 = this;
            com.google.android.gms.internal.ads.zzzj r0 = r2.zze
            com.google.android.gms.internal.ads.zzdi.zzb(r0)
            r1 = 0
            r0.zza(r1)
            return
    }

    public final void zzh() {
            r1 = this;
            r0 = 0
            r1.zzf = r0
            return
    }

    public final void zzi(int r2) throws java.io.IOException {
            r1 = this;
            java.io.IOException r0 = r1.zzf
            if (r0 != 0) goto Lc
            com.google.android.gms.internal.ads.zzzj r0 = r1.zze
            if (r0 == 0) goto Lb
            r0.zzb(r2)
        Lb:
            return
        Lc:
            throw r0
    }

    public final void zzj(com.google.android.gms.internal.ads.zzzl r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzzj r0 = r2.zze
            if (r0 == 0) goto L8
            r1 = 1
            r0.zza(r1)
        L8:
            java.util.concurrent.Executor r0 = r2.zzc
            com.google.android.gms.internal.ads.zzzm r1 = new com.google.android.gms.internal.ads.zzzm
            r1.<init>(r3)
            r0.execute(r1)
            java.lang.Runnable r3 = r2.zzd
            r3.run()
            return
    }

    public final boolean zzk() {
            r1 = this;
            java.io.IOException r0 = r1.zzf
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean zzl() {
            r1 = this;
            com.google.android.gms.internal.ads.zzzj r0 = r1.zze
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }
}
