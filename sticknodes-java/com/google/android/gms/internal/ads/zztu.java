package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zztu implements com.google.android.gms.internal.ads.zzst {
    private final android.media.MediaCodec zza;
    private final com.google.android.gms.internal.ads.zzsp zzb;

    /* synthetic */ zztu(android.media.MediaCodec r2, com.google.android.gms.internal.ads.zzsp r3, com.google.android.gms.internal.ads.zztt r4) {
            r1 = this;
            r1.<init>()
            r1.zza = r2
            r1.zzb = r3
            int r4 = com.google.android.gms.internal.ads.zzeu.zza
            r0 = 35
            if (r4 < r0) goto L12
            if (r3 == 0) goto L12
            r3.zza(r2)
        L12:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final int zza() {
            r3 = this;
            android.media.MediaCodec r0 = r3.zza
            r1 = 0
            int r0 = r0.dequeueInputBuffer(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final int zzb(android.media.MediaCodec.BufferInfo r4) {
            r3 = this;
        L0:
            android.media.MediaCodec r0 = r3.zza
            r1 = 0
            int r0 = r0.dequeueOutputBuffer(r4, r1)
            r1 = -3
            if (r0 == r1) goto L0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final android.media.MediaFormat zzc() {
            r1 = this;
            android.media.MediaCodec r0 = r1.zza
            android.media.MediaFormat r0 = r0.getOutputFormat()
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
            android.media.MediaCodec r0 = r1.zza
            r0.flush()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzk(int r8, int r9, int r10, long r11, int r13) {
            r7 = this;
            android.media.MediaCodec r0 = r7.zza
            r2 = 0
            r1 = r8
            r3 = r10
            r4 = r11
            r6 = r13
            r0.queueInputBuffer(r1, r2, r3, r4, r6)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzl(int r8, int r9, com.google.android.gms.internal.ads.zzhn r10, long r11, int r13) {
            r7 = this;
            android.media.MediaCodec$CryptoInfo r3 = r10.zza()
            android.media.MediaCodec r0 = r7.zza
            r2 = 0
            r6 = 0
            r1 = r8
            r4 = r11
            r0.queueSecureInputBuffer(r1, r2, r3, r4, r6)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzm() {
            r3 = this;
            r0 = 35
            int r1 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.Throwable -> L22
            r2 = 30
            if (r1 < r2) goto L11
            r2 = 33
            if (r1 >= r2) goto L11
            android.media.MediaCodec r2 = r3.zza     // Catch: java.lang.Throwable -> L22
            r2.stop()     // Catch: java.lang.Throwable -> L22
        L11:
            if (r1 < r0) goto L1c
            com.google.android.gms.internal.ads.zzsp r0 = r3.zzb
            if (r0 == 0) goto L1c
            android.media.MediaCodec r1 = r3.zza
            r0.zzc(r1)
        L1c:
            android.media.MediaCodec r0 = r3.zza
            r0.release()
            return
        L22:
            r1 = move-exception
            int r2 = com.google.android.gms.internal.ads.zzeu.zza
            if (r2 < r0) goto L31
            com.google.android.gms.internal.ads.zzsp r0 = r3.zzb
            if (r0 != 0) goto L2c
            goto L31
        L2c:
            android.media.MediaCodec r2 = r3.zza
            r0.zzc(r2)
        L31:
            android.media.MediaCodec r0 = r3.zza
            r0.release()
            throw r1
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
            android.media.MediaCodec r0 = r1.zza
            r0.setParameters(r2)
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
    public final /* synthetic */ boolean zzs(com.google.android.gms.internal.ads.zzss r1) {
            r0 = this;
            r1 = 0
            return r1
    }
}
