package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@android.annotation.SuppressLint({"HandlerLeak"})
/* loaded from: classes.dex */
final class zzzj extends android.os.Handler implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzzo zza;
    private final com.google.android.gms.internal.ads.zzzk zzb;
    private final long zzc;
    private com.google.android.gms.internal.ads.zzzg zzd;
    private java.io.IOException zze;
    private int zzf;
    private java.lang.Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    public zzzj(com.google.android.gms.internal.ads.zzzo r1, android.os.Looper r2, com.google.android.gms.internal.ads.zzzk r3, com.google.android.gms.internal.ads.zzzg r4, int r5, long r6) {
            r0 = this;
            r0.zza = r1
            r0.<init>(r2)
            r0.zzb = r3
            r0.zzd = r4
            r0.zzc = r6
            return
    }

    private final void zzd() {
            r2 = this;
            r0 = 0
            r2.zze = r0
            com.google.android.gms.internal.ads.zzzo r0 = r2.zza
            java.util.concurrent.Executor r1 = com.google.android.gms.internal.ads.zzzo.zzd(r0)
            com.google.android.gms.internal.ads.zzzj r0 = com.google.android.gms.internal.ads.zzzo.zzc(r0)
            java.util.Objects.requireNonNull(r0)
            r1.execute(r0)
            return
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r13) {
            r12 = this;
            boolean r0 = r12.zzi
            if (r0 == 0) goto L6
            goto L8a
        L6:
            int r0 = r13.what
            r1 = 1
            if (r0 != r1) goto Lf
            r12.zzd()
            return
        Lf:
            r2 = 4
            if (r0 == r2) goto La4
            com.google.android.gms.internal.ads.zzzo r0 = r12.zza
            r2 = 0
            com.google.android.gms.internal.ads.zzzo.zze(r0, r2)
            long r2 = r12.zzc
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r8 = r6 - r2
            com.google.android.gms.internal.ads.zzzg r4 = r12.zzd
            java.util.Objects.requireNonNull(r4)
            boolean r0 = r12.zzh
            if (r0 == 0) goto L30
            com.google.android.gms.internal.ads.zzzk r5 = r12.zzb
            r10 = 0
            r4.zzJ(r5, r6, r8, r10)
            return
        L30:
            int r0 = r13.what
            r2 = 2
            if (r0 == r2) goto L8b
            r3 = 3
            if (r0 == r3) goto L39
            goto L8a
        L39:
            java.lang.Object r13 = r13.obj
            r10 = r13
            java.io.IOException r10 = (java.io.IOException) r10
            r12.zze = r10
            int r13 = r12.zzf
            int r11 = r13 + 1
            r12.zzf = r11
            com.google.android.gms.internal.ads.zzzk r5 = r12.zzb
            com.google.android.gms.internal.ads.zzzi r13 = r4.zzu(r5, r6, r8, r10, r11)
            int r0 = com.google.android.gms.internal.ads.zzzi.zza(r13)
            if (r0 != r3) goto L5a
            com.google.android.gms.internal.ads.zzzo r13 = r12.zza
            java.io.IOException r0 = r12.zze
            com.google.android.gms.internal.ads.zzzo.zzf(r13, r0)
            return
        L5a:
            int r0 = com.google.android.gms.internal.ads.zzzi.zza(r13)
            if (r0 == r2) goto L8a
            int r0 = com.google.android.gms.internal.ads.zzzi.zza(r13)
            if (r0 != r1) goto L68
            r12.zzf = r1
        L68:
            long r0 = com.google.android.gms.internal.ads.zzzi.zzb(r13)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L7a
            long r0 = com.google.android.gms.internal.ads.zzzi.zzb(r13)
            goto L87
        L7a:
            int r13 = r12.zzf
            int r13 = r13 + (-1)
            int r13 = r13 * 1000
            r0 = 5000(0x1388, float:7.006E-42)
            int r13 = java.lang.Math.min(r13, r0)
            long r0 = (long) r13
        L87:
            r12.zzc(r0)
        L8a:
            return
        L8b:
            com.google.android.gms.internal.ads.zzzk r5 = r12.zzb     // Catch: java.lang.RuntimeException -> L91
            r4.zzK(r5, r6, r8)     // Catch: java.lang.RuntimeException -> L91
            return
        L91:
            r13 = move-exception
            java.lang.String r0 = "LoadTask"
            java.lang.String r1 = "Unexpected exception handling load completed"
            com.google.android.gms.internal.ads.zzea.zzd(r0, r1, r13)
            com.google.android.gms.internal.ads.zzzo r0 = r12.zza
            com.google.android.gms.internal.ads.zzzn r1 = new com.google.android.gms.internal.ads.zzzn
            r1.<init>(r13)
            com.google.android.gms.internal.ads.zzzo.zzf(r0, r1)
            return
        La4:
            java.lang.Object r13 = r13.obj
            java.lang.Error r13 = (java.lang.Error) r13
            throw r13
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            r0 = 3
            monitor-enter(r4)     // Catch: java.lang.Error -> L52 java.lang.OutOfMemoryError -> L67 java.lang.Exception -> L80 java.io.IOException -> L99
            boolean r1 = r4.zzh     // Catch: java.lang.Throwable -> L4f
            r1 = r1 ^ 1
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L4f
            r4.zzg = r2     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L3b
            com.google.android.gms.internal.ads.zzzk r1 = r4.zzb     // Catch: java.lang.Error -> L52 java.lang.OutOfMemoryError -> L67 java.lang.Exception -> L80 java.io.IOException -> L99
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Error -> L52 java.lang.OutOfMemoryError -> L67 java.lang.Exception -> L80 java.io.IOException -> L99
            java.lang.String r1 = r1.getSimpleName()     // Catch: java.lang.Error -> L52 java.lang.OutOfMemoryError -> L67 java.lang.Exception -> L80 java.io.IOException -> L99
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Error -> L52 java.lang.OutOfMemoryError -> L67 java.lang.Exception -> L80 java.io.IOException -> L99
            r2.<init>()     // Catch: java.lang.Error -> L52 java.lang.OutOfMemoryError -> L67 java.lang.Exception -> L80 java.io.IOException -> L99
            java.lang.String r3 = "load:"
            r2.append(r3)     // Catch: java.lang.Error -> L52 java.lang.OutOfMemoryError -> L67 java.lang.Exception -> L80 java.io.IOException -> L99
            r2.append(r1)     // Catch: java.lang.Error -> L52 java.lang.OutOfMemoryError -> L67 java.lang.Exception -> L80 java.io.IOException -> L99
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Error -> L52 java.lang.OutOfMemoryError -> L67 java.lang.Exception -> L80 java.io.IOException -> L99
            android.os.Trace.beginSection(r1)     // Catch: java.lang.Error -> L52 java.lang.OutOfMemoryError -> L67 java.lang.Exception -> L80 java.io.IOException -> L99
            com.google.android.gms.internal.ads.zzzk r1 = r4.zzb     // Catch: java.lang.Throwable -> L36
            r1.zzh()     // Catch: java.lang.Throwable -> L36
            android.os.Trace.endSection()     // Catch: java.lang.Error -> L52 java.lang.OutOfMemoryError -> L67 java.lang.Exception -> L80 java.io.IOException -> L99
            goto L3b
        L36:
            r1 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Error -> L52 java.lang.OutOfMemoryError -> L67 java.lang.Exception -> L80 java.io.IOException -> L99
            throw r1     // Catch: java.lang.Error -> L52 java.lang.OutOfMemoryError -> L67 java.lang.Exception -> L80 java.io.IOException -> L99
        L3b:
            monitor-enter(r4)     // Catch: java.lang.Error -> L52 java.lang.OutOfMemoryError -> L67 java.lang.Exception -> L80 java.io.IOException -> L99
            r1 = 0
            r4.zzg = r1     // Catch: java.lang.Throwable -> L4c
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4c
            boolean r1 = r4.zzi     // Catch: java.lang.Error -> L52 java.lang.OutOfMemoryError -> L67 java.lang.Exception -> L80 java.io.IOException -> L99
            if (r1 != 0) goto La5
            r1 = 2
            r4.sendEmptyMessage(r1)     // Catch: java.lang.Error -> L52 java.lang.OutOfMemoryError -> L67 java.lang.Exception -> L80 java.io.IOException -> L99
            return
        L4c:
            r1 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4c
            throw r1     // Catch: java.lang.Error -> L52 java.lang.OutOfMemoryError -> L67 java.lang.Exception -> L80 java.io.IOException -> L99
        L4f:
            r1 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4f
            throw r1     // Catch: java.lang.Error -> L52 java.lang.OutOfMemoryError -> L67 java.lang.Exception -> L80 java.io.IOException -> L99
        L52:
            r0 = move-exception
            boolean r1 = r4.zzi
            if (r1 != 0) goto L66
            java.lang.String r1 = "LoadTask"
            java.lang.String r2 = "Unexpected error loading stream"
            com.google.android.gms.internal.ads.zzea.zzd(r1, r2, r0)
            r1 = 4
            android.os.Message r1 = r4.obtainMessage(r1, r0)
            r1.sendToTarget()
        L66:
            throw r0
        L67:
            r1 = move-exception
            boolean r2 = r4.zzi
            if (r2 != 0) goto La5
            java.lang.String r2 = "LoadTask"
            java.lang.String r3 = "OutOfMemory error loading stream"
            com.google.android.gms.internal.ads.zzea.zzd(r2, r3, r1)
            com.google.android.gms.internal.ads.zzzn r2 = new com.google.android.gms.internal.ads.zzzn
            r2.<init>(r1)
            android.os.Message r0 = r4.obtainMessage(r0, r2)
            r0.sendToTarget()
            return
        L80:
            r1 = move-exception
            boolean r2 = r4.zzi
            if (r2 != 0) goto La5
            java.lang.String r2 = "LoadTask"
            java.lang.String r3 = "Unexpected exception loading stream"
            com.google.android.gms.internal.ads.zzea.zzd(r2, r3, r1)
            com.google.android.gms.internal.ads.zzzn r2 = new com.google.android.gms.internal.ads.zzzn
            r2.<init>(r1)
            android.os.Message r0 = r4.obtainMessage(r0, r2)
            r0.sendToTarget()
            return
        L99:
            r1 = move-exception
            boolean r2 = r4.zzi
            if (r2 != 0) goto La5
            android.os.Message r0 = r4.obtainMessage(r0, r1)
            r0.sendToTarget()
        La5:
            return
    }

    public final void zza(boolean r9) {
            r8 = this;
            r8.zzi = r9
            r0 = 0
            r8.zze = r0
            r1 = 1
            boolean r2 = r8.hasMessages(r1)
            if (r2 == 0) goto L18
            r8.zzh = r1
            r8.removeMessages(r1)
            if (r9 != 0) goto L28
            r1 = 2
            r8.sendEmptyMessage(r1)
            goto L28
        L18:
            monitor-enter(r8)
            r8.zzh = r1     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.ads.zzzk r1 = r8.zzb     // Catch: java.lang.Throwable -> L45
            r1.zzg()     // Catch: java.lang.Throwable -> L45
            java.lang.Thread r1 = r8.zzg     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L27
            r1.interrupt()     // Catch: java.lang.Throwable -> L45
        L27:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L45
        L28:
            if (r9 == 0) goto L44
            com.google.android.gms.internal.ads.zzzo r9 = r8.zza
            com.google.android.gms.internal.ads.zzzo.zze(r9, r0)
            long r3 = android.os.SystemClock.elapsedRealtime()
            com.google.android.gms.internal.ads.zzzg r1 = r8.zzd
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.internal.ads.zzzk r2 = r8.zzb
            long r5 = r8.zzc
            long r5 = r3 - r5
            r7 = 1
            r1.zzJ(r2, r3, r5, r7)
            r8.zzd = r0
        L44:
            return
        L45:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L45
            throw r9
    }

    public final void zzb(int r3) throws java.io.IOException {
            r2 = this;
            java.io.IOException r0 = r2.zze
            if (r0 == 0) goto La
            int r1 = r2.zzf
            if (r1 > r3) goto L9
            goto La
        L9:
            throw r0
        La:
            return
    }

    public final void zzc(long r5) {
            r4 = this;
            com.google.android.gms.internal.ads.zzzo r0 = r4.zza
            com.google.android.gms.internal.ads.zzzj r0 = com.google.android.gms.internal.ads.zzzo.zzc(r0)
            r1 = 1
            if (r0 != 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            com.google.android.gms.internal.ads.zzzo r0 = r4.zza
            com.google.android.gms.internal.ads.zzzo.zze(r0, r4)
            r2 = 0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1e
            r4.sendEmptyMessageDelayed(r1, r5)
            return
        L1e:
            r4.zzd()
            return
    }
}
