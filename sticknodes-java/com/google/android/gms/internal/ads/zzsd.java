package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzsd implements com.google.android.gms.internal.ads.zzst {
    private final android.media.MediaCodec zza;
    private final com.google.android.gms.internal.ads.zzsj zzb;
    private final com.google.android.gms.internal.ads.zzsu zzc;
    private final com.google.android.gms.internal.ads.zzsp zzd;
    private boolean zze;
    private int zzf;

    /* synthetic */ zzsd(android.media.MediaCodec r1, android.os.HandlerThread r2, com.google.android.gms.internal.ads.zzsu r3, com.google.android.gms.internal.ads.zzsp r4, com.google.android.gms.internal.ads.zzsc r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            com.google.android.gms.internal.ads.zzsj r1 = new com.google.android.gms.internal.ads.zzsj
            r1.<init>(r2)
            r0.zzb = r1
            r0.zzc = r3
            r0.zzd = r4
            r1 = 0
            r0.zzf = r1
            return
    }

    static /* synthetic */ java.lang.String zzd(int r1) {
            java.lang.String r0 = "ExoPlayer:MediaCodecAsyncAdapter:"
            java.lang.String r1 = zzt(r1, r0)
            return r1
    }

    static /* synthetic */ java.lang.String zze(int r1) {
            java.lang.String r0 = "ExoPlayer:MediaCodecQueueingThread:"
            java.lang.String r1 = zzt(r1, r0)
            return r1
    }

    static /* bridge */ /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzsd r1, android.media.MediaFormat r2, android.view.Surface r3, android.media.MediaCrypto r4, int r5) {
            com.google.android.gms.internal.ads.zzsj r4 = r1.zzb
            android.media.MediaCodec r0 = r1.zza
            r4.zzf(r0)
            java.lang.String r4 = "configureCodec"
            android.os.Trace.beginSection(r4)
            android.media.MediaCodec r4 = r1.zza
            r0 = 0
            r4.configure(r2, r3, r0, r5)
            android.os.Trace.endSection()
            com.google.android.gms.internal.ads.zzsu r2 = r1.zzc
            r2.zzh()
            java.lang.String r2 = "startCodec"
            android.os.Trace.beginSection(r2)
            android.media.MediaCodec r2 = r1.zza
            r2.start()
            android.os.Trace.endSection()
            int r2 = com.google.android.gms.internal.ads.zzeu.zza
            r3 = 35
            if (r2 < r3) goto L36
            com.google.android.gms.internal.ads.zzsp r2 = r1.zzd
            if (r2 == 0) goto L36
            android.media.MediaCodec r3 = r1.zza
            r2.zza(r3)
        L36:
            r2 = 1
            r1.zzf = r2
            return
    }

    private static java.lang.String zzt(int r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r2 = 1
            if (r1 != r2) goto Le
            java.lang.String r1 = "Audio"
            r0.append(r1)
            goto L24
        Le:
            r2 = 2
            if (r1 != r2) goto L17
            java.lang.String r1 = "Video"
            r0.append(r1)
            goto L24
        L17:
            java.lang.String r2 = "Unknown("
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
        L24:
            java.lang.String r1 = r0.toString()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final int zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzsu r0 = r1.zzc
            r0.zzc()
            com.google.android.gms.internal.ads.zzsj r0 = r1.zzb
            int r0 = r0.zza()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final int zzb(android.media.MediaCodec.BufferInfo r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzsu r0 = r1.zzc
            r0.zzc()
            com.google.android.gms.internal.ads.zzsj r0 = r1.zzb
            int r2 = r0.zzb(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final android.media.MediaFormat zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzsj r0 = r1.zzb
            android.media.MediaFormat r0 = r0.zzc()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final java.nio.ByteBuffer zzf(int r2) {
            r1 = this;
            android.media.MediaCodec r0 = r1.zza
            java.nio.ByteBuffer r2 = r0.getInputBuffer(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final java.nio.ByteBuffer zzg(int r2) {
            r1 = this;
            android.media.MediaCodec r0 = r1.zza
            java.nio.ByteBuffer r2 = r0.getOutputBuffer(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzi() {
            r1 = this;
            android.media.MediaCodec r0 = r1.zza
            r0.detachOutputSurface()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzj() {
            r1 = this;
            com.google.android.gms.internal.ads.zzsu r0 = r1.zzc
            r0.zzb()
            android.media.MediaCodec r0 = r1.zza
            r0.flush()
            com.google.android.gms.internal.ads.zzsj r0 = r1.zzb
            r0.zze()
            android.media.MediaCodec r0 = r1.zza
            r0.start()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzk(int r8, int r9, int r10, long r11, int r13) {
            r7 = this;
            com.google.android.gms.internal.ads.zzsu r0 = r7.zzc
            r2 = 0
            r1 = r8
            r3 = r10
            r4 = r11
            r6 = r13
            r0.zzd(r1, r2, r3, r4, r6)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzl(int r8, int r9, com.google.android.gms.internal.ads.zzhn r10, long r11, int r13) {
            r7 = this;
            com.google.android.gms.internal.ads.zzsu r0 = r7.zzc
            r2 = 0
            r6 = 0
            r1 = r8
            r3 = r10
            r4 = r11
            r0.zze(r1, r2, r3, r4, r6)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzm() {
            r6 = this;
            r0 = 33
            r1 = 30
            r2 = 35
            r3 = 1
            int r4 = r6.zzf     // Catch: java.lang.Throwable -> L3d
            if (r4 != r3) goto L15
            com.google.android.gms.internal.ads.zzsu r4 = r6.zzc     // Catch: java.lang.Throwable -> L3d
            r4.zzg()     // Catch: java.lang.Throwable -> L3d
            com.google.android.gms.internal.ads.zzsj r4 = r6.zzb     // Catch: java.lang.Throwable -> L3d
            r4.zzh()     // Catch: java.lang.Throwable -> L3d
        L15:
            r4 = 2
            r6.zzf = r4     // Catch: java.lang.Throwable -> L3d
            boolean r4 = r6.zze
            if (r4 != 0) goto L3c
            int r4 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.Throwable -> L3a
            if (r4 < r1) goto L27
            if (r4 >= r0) goto L27
            android.media.MediaCodec r0 = r6.zza     // Catch: java.lang.Throwable -> L3a
            r0.stop()     // Catch: java.lang.Throwable -> L3a
        L27:
            if (r4 < r2) goto L32
            com.google.android.gms.internal.ads.zzsp r0 = r6.zzd
            if (r0 == 0) goto L32
            android.media.MediaCodec r1 = r6.zza
            r0.zzc(r1)
        L32:
            android.media.MediaCodec r0 = r6.zza
            r0.release()
            r6.zze = r3
            return
        L3a:
            r0 = move-exception
            goto L60
        L3c:
            return
        L3d:
            r4 = move-exception
            boolean r5 = r6.zze
            if (r5 != 0) goto L75
            int r5 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.Throwable -> L3a
            if (r5 < r1) goto L4d
            if (r5 >= r0) goto L4d
            android.media.MediaCodec r0 = r6.zza     // Catch: java.lang.Throwable -> L3a
            r0.stop()     // Catch: java.lang.Throwable -> L3a
        L4d:
            if (r5 < r2) goto L58
            com.google.android.gms.internal.ads.zzsp r0 = r6.zzd
            if (r0 == 0) goto L58
            android.media.MediaCodec r1 = r6.zza
            r0.zzc(r1)
        L58:
            android.media.MediaCodec r0 = r6.zza
            r0.release()
            r6.zze = r3
            goto L75
        L60:
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            if (r1 < r2) goto L6d
            com.google.android.gms.internal.ads.zzsp r1 = r6.zzd
            if (r1 == 0) goto L6d
            android.media.MediaCodec r2 = r6.zza
            r1.zzc(r2)
        L6d:
            android.media.MediaCodec r1 = r6.zza
            r1.release()
            r6.zze = r3
            throw r0
        L75:
            throw r4
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzn(int r2, long r3) {
            r1 = this;
            android.media.MediaCodec r0 = r1.zza
            r0.releaseOutputBuffer(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzo(int r2, boolean r3) {
            r1 = this;
            android.media.MediaCodec r3 = r1.zza
            r0 = 0
            r3.releaseOutputBuffer(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzp(android.view.Surface r2) {
            r1 = this;
            android.media.MediaCodec r0 = r1.zza
            r0.setOutputSurface(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzq(android.os.Bundle r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzsu r0 = r1.zzc
            r0.zzf(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzr(int r2) {
            r1 = this;
            android.media.MediaCodec r0 = r1.zza
            r0.setVideoScalingMode(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final boolean zzs(com.google.android.gms.internal.ads.zzss r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzsj r0 = r1.zzb
            r0.zzg(r2)
            r2 = 1
            return r2
    }
}
