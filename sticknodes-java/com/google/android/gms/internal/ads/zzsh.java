package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzsh implements com.google.android.gms.internal.ads.zzsu {
    private static final java.util.ArrayDeque zza = null;
    private static final java.lang.Object zzb = null;
    private final android.media.MediaCodec zzc;
    private final android.os.HandlerThread zzd;
    private android.os.Handler zze;
    private final java.util.concurrent.atomic.AtomicReference zzf;
    private final com.google.android.gms.internal.ads.zzdm zzg;
    private boolean zzh;

    static {
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            com.google.android.gms.internal.ads.zzsh.zza = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.ads.zzsh.zzb = r0
            return
    }

    public zzsh(android.media.MediaCodec r3, android.os.HandlerThread r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzdm r0 = new com.google.android.gms.internal.ads.zzdm
            com.google.android.gms.internal.ads.zzdj r1 = com.google.android.gms.internal.ads.zzdj.zza
            r0.<init>(r1)
            r2.<init>()
            r2.zzc = r3
            r2.zzd = r4
            r2.zzg = r0
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>()
            r2.zzf = r3
            return
    }

    static /* bridge */ /* synthetic */ void zza(com.google.android.gms.internal.ads.zzsh r10, android.os.Message r11) {
            int r0 = r11.what
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L58
            r1 = 2
            if (r0 == r1) goto L37
            r1 = 3
            if (r0 == r1) goto L31
            r1 = 4
            if (r0 == r1) goto L20
            java.util.concurrent.atomic.AtomicReference r10 = r10.zzf
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r11 = r11.what
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r0.<init>(r11)
            com.google.android.gms.internal.ads.zzse.zza(r10, r2, r0)
            goto L72
        L20:
            java.lang.Object r11 = r11.obj
            android.os.Bundle r11 = (android.os.Bundle) r11
            android.media.MediaCodec r0 = r10.zzc     // Catch: java.lang.RuntimeException -> L2a
            r0.setParameters(r11)     // Catch: java.lang.RuntimeException -> L2a
            goto L72
        L2a:
            r11 = move-exception
            java.util.concurrent.atomic.AtomicReference r10 = r10.zzf
            com.google.android.gms.internal.ads.zzse.zza(r10, r2, r11)
            goto L72
        L31:
            com.google.android.gms.internal.ads.zzdm r10 = r10.zzg
            r10.zze()
            goto L72
        L37:
            java.lang.Object r11 = r11.obj
            com.google.android.gms.internal.ads.zzsg r11 = (com.google.android.gms.internal.ads.zzsg) r11
            int r4 = r11.zza
            android.media.MediaCodec$CryptoInfo r6 = r11.zzd
            long r7 = r11.zze
            int r9 = r11.zzf
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzsh.zzb     // Catch: java.lang.RuntimeException -> L51
            monitor-enter(r0)     // Catch: java.lang.RuntimeException -> L51
            android.media.MediaCodec r3 = r10.zzc     // Catch: java.lang.Throwable -> L4e
            r5 = 0
            r3.queueSecureInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            goto L71
        L4e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            throw r1     // Catch: java.lang.RuntimeException -> L51
        L51:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r10 = r10.zzf
            com.google.android.gms.internal.ads.zzse.zza(r10, r2, r0)
            goto L71
        L58:
            java.lang.Object r11 = r11.obj
            com.google.android.gms.internal.ads.zzsg r11 = (com.google.android.gms.internal.ads.zzsg) r11
            int r4 = r11.zza
            int r6 = r11.zzc
            long r7 = r11.zze
            int r9 = r11.zzf
            android.media.MediaCodec r3 = r10.zzc     // Catch: java.lang.RuntimeException -> L6b
            r5 = 0
            r3.queueInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.RuntimeException -> L6b
            goto L71
        L6b:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r10 = r10.zzf
            com.google.android.gms.internal.ads.zzse.zza(r10, r2, r0)
        L71:
            r2 = r11
        L72:
            if (r2 == 0) goto L7f
            java.util.ArrayDeque r10 = com.google.android.gms.internal.ads.zzsh.zza
            monitor-enter(r10)
            r10.add(r2)     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L7c
            return
        L7c:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L7c
            throw r11
        L7f:
            return
    }

    private static com.google.android.gms.internal.ads.zzsg zzi() {
            java.util.ArrayDeque r0 = com.google.android.gms.internal.ads.zzsh.zza
            monitor-enter(r0)
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L10
            com.google.android.gms.internal.ads.zzsg r1 = new com.google.android.gms.internal.ads.zzsg     // Catch: java.lang.Throwable -> L18
            r1.<init>()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r1
        L10:
            java.lang.Object r1 = r0.removeFirst()     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.internal.ads.zzsg r1 = (com.google.android.gms.internal.ads.zzsg) r1     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r1
        L18:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }

    private static byte[] zzj(byte[] r2, byte[] r3) {
            if (r2 != 0) goto L3
            return r3
        L3:
            if (r3 == 0) goto Lf
            int r0 = r2.length
            int r1 = r3.length
            if (r1 >= r0) goto La
            goto Lf
        La:
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r3, r1, r0)
            return r3
        Lf:
            int r3 = r2.length
            byte[] r2 = java.util.Arrays.copyOf(r2, r3)
            return r2
    }

    private static int[] zzk(int[] r2, int[] r3) {
            if (r2 != 0) goto L3
            return r3
        L3:
            if (r3 == 0) goto Lf
            int r0 = r2.length
            int r1 = r3.length
            if (r1 >= r0) goto La
            goto Lf
        La:
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r3, r1, r0)
            return r3
        Lf:
            int r3 = r2.length
            int[] r2 = java.util.Arrays.copyOf(r2, r3)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzb() {
            r2 = this;
            boolean r0 = r2.zzh
            if (r0 == 0) goto L33
            android.os.Handler r0 = r2.zze     // Catch: java.lang.InterruptedException -> L25
            java.util.Objects.requireNonNull(r0)
            r1 = 0
            r0.removeCallbacksAndMessages(r1)     // Catch: java.lang.InterruptedException -> L25
            com.google.android.gms.internal.ads.zzdm r0 = r2.zzg     // Catch: java.lang.InterruptedException -> L25
            r0.zzc()     // Catch: java.lang.InterruptedException -> L25
            android.os.Handler r0 = r2.zze     // Catch: java.lang.InterruptedException -> L25
            java.util.Objects.requireNonNull(r0)
            r1 = 3
            android.os.Message r0 = r0.obtainMessage(r1)     // Catch: java.lang.InterruptedException -> L25
            r0.sendToTarget()     // Catch: java.lang.InterruptedException -> L25
            com.google.android.gms.internal.ads.zzdm r0 = r2.zzg     // Catch: java.lang.InterruptedException -> L25
            r0.zza()     // Catch: java.lang.InterruptedException -> L25
            return
        L25:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L33:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzc() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.zzf
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            if (r0 != 0) goto Lc
            return
        Lc:
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzd(int r8, int r9, int r10, long r11, int r13) {
            r7 = this;
            r7.zzc()
            com.google.android.gms.internal.ads.zzsg r9 = zzi()
            r2 = 0
            r0 = r9
            r1 = r8
            r3 = r10
            r4 = r11
            r6 = r13
            r0.zza(r1, r2, r3, r4, r6)
            android.os.Handler r8 = r7.zze
            int r10 = com.google.android.gms.internal.ads.zzeu.zza
            r10 = 1
            android.os.Message r8 = r8.obtainMessage(r10, r9)
            r8.sendToTarget()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zze(int r8, int r9, com.google.android.gms.internal.ads.zzhn r10, long r11, int r13) {
            r7 = this;
            r7.zzc()
            com.google.android.gms.internal.ads.zzsg r9 = zzi()
            r2 = 0
            r3 = 0
            r6 = 0
            r0 = r9
            r1 = r8
            r4 = r11
            r0.zza(r1, r2, r3, r4, r6)
            android.media.MediaCodec$CryptoInfo r8 = r9.zzd
            int r11 = r10.zzf
            r8.numSubSamples = r11
            int[] r11 = r10.zzd
            int[] r12 = r8.numBytesOfClearData
            int[] r11 = zzk(r11, r12)
            r8.numBytesOfClearData = r11
            int[] r11 = r10.zze
            int[] r12 = r8.numBytesOfEncryptedData
            int[] r11 = zzk(r11, r12)
            r8.numBytesOfEncryptedData = r11
            byte[] r11 = r10.zzb
            byte[] r12 = r8.key
            byte[] r11 = zzj(r11, r12)
            java.util.Objects.requireNonNull(r11)
            r8.key = r11
            byte[] r11 = r10.zza
            byte[] r12 = r8.iv
            byte[] r11 = zzj(r11, r12)
            java.util.Objects.requireNonNull(r11)
            r8.iv = r11
            int r11 = r10.zzc
            r8.mode = r11
            int r11 = com.google.android.gms.internal.ads.zzeu.zza
            r12 = 24
            if (r11 < r12) goto L5a
            android.media.MediaCodec$CryptoInfo$Pattern r11 = new android.media.MediaCodec$CryptoInfo$Pattern
            int r12 = r10.zzg
            int r10 = r10.zzh
            r11.<init>(r12, r10)
            r8.setPattern(r11)
        L5a:
            android.os.Handler r8 = r7.zze
            r10 = 2
            android.os.Message r8 = r8.obtainMessage(r10, r9)
            r8.sendToTarget()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzf(android.os.Bundle r3) {
            r2 = this;
            r2.zzc()
            android.os.Handler r0 = r2.zze
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 4
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            r3.sendToTarget()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzg() {
            r1 = this;
            boolean r0 = r1.zzh
            if (r0 == 0) goto Lc
            r1.zzb()
            android.os.HandlerThread r0 = r1.zzd
            r0.quit()
        Lc:
            r0 = 0
            r1.zzh = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzh() {
            r2 = this;
            boolean r0 = r2.zzh
            if (r0 != 0) goto L19
            android.os.HandlerThread r0 = r2.zzd
            r0.start()
            android.os.HandlerThread r0 = r2.zzd
            com.google.android.gms.internal.ads.zzsf r1 = new com.google.android.gms.internal.ads.zzsf
            android.os.Looper r0 = r0.getLooper()
            r1.<init>(r2, r0)
            r2.zze = r1
            r0 = 1
            r2.zzh = r0
        L19:
            return
    }
}
