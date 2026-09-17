package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzhm {
    private final android.media.MediaCodec.CryptoInfo zza;
    private final android.media.MediaCodec.CryptoInfo.Pattern zzb;

    /* synthetic */ zzhm(android.media.MediaCodec.CryptoInfo r1, com.google.android.gms.internal.ads.zzhl r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            android.media.MediaCodec$CryptoInfo$Pattern r1 = new android.media.MediaCodec$CryptoInfo$Pattern
            r2 = 0
            r1.<init>(r2, r2)
            r0.zzb = r1
            return
    }

    static /* bridge */ /* synthetic */ void zza(com.google.android.gms.internal.ads.zzhm r1, int r2, int r3) {
            android.media.MediaCodec$CryptoInfo$Pattern r0 = r1.zzb
            r0.set(r2, r3)
            android.media.MediaCodec$CryptoInfo r2 = r1.zza
            android.media.MediaCodec$CryptoInfo$Pattern r1 = r1.zzb
            r2.setPattern(r1)
            return
    }
}
