package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zztv implements com.google.android.gms.internal.ads.zzsu {
    private final android.media.MediaCodec zza;

    public zztv(android.media.MediaCodec r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzb() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzc() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzd(int r8, int r9, int r10, long r11, int r13) {
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

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zze(int r8, int r9, com.google.android.gms.internal.ads.zzhn r10, long r11, int r13) {
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

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzf(android.os.Bundle r2) {
            r1 = this;
            android.media.MediaCodec r0 = r1.zza
            r0.setParameters(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzg() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzh() {
            r0 = this;
            return
    }
}
