package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhn {
    public byte[] zza;
    public byte[] zzb;
    public int zzc;
    public int[] zzd;
    public int[] zze;
    public int zzf;
    public int zzg;
    public int zzh;
    private final android.media.MediaCodec.CryptoInfo zzi;
    private final com.google.android.gms.internal.ads.zzhm zzj;

    public zzhn() {
            r4 = this;
            r4.<init>()
            android.media.MediaCodec$CryptoInfo r0 = new android.media.MediaCodec$CryptoInfo
            r0.<init>()
            r4.zzi = r0
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            r2 = 0
            r3 = 24
            if (r1 < r3) goto L17
            com.google.android.gms.internal.ads.zzhm r1 = new com.google.android.gms.internal.ads.zzhm
            r1.<init>(r0, r2)
            r2 = r1
        L17:
            r4.zzj = r2
            return
    }

    public final android.media.MediaCodec.CryptoInfo zza() {
            r1 = this;
            android.media.MediaCodec$CryptoInfo r0 = r1.zzi
            return r0
    }

    public final void zzb(int r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            int[] r0 = r3.zzd
            if (r0 != 0) goto L10
            r0 = 1
            int[] r0 = new int[r0]
            r3.zzd = r0
            android.media.MediaCodec$CryptoInfo r1 = r3.zzi
            r1.numBytesOfClearData = r0
        L10:
            int[] r0 = r3.zzd
            r1 = 0
            r2 = r0[r1]
            int r2 = r2 + r4
            r0[r1] = r2
            return
    }

    public final void zzc(int r2, int[] r3, int[] r4, byte[] r5, byte[] r6, int r7, int r8, int r9) {
            r1 = this;
            r1.zzf = r2
            r1.zzd = r3
            r1.zze = r4
            r1.zzb = r5
            r1.zza = r6
            r1.zzc = r7
            r1.zzg = r8
            r1.zzh = r9
            android.media.MediaCodec$CryptoInfo r0 = r1.zzi
            r0.numSubSamples = r2
            r0.numBytesOfClearData = r3
            r0.numBytesOfEncryptedData = r4
            r0.key = r5
            r0.iv = r6
            r0.mode = r7
            int r2 = com.google.android.gms.internal.ads.zzeu.zza
            r3 = 24
            if (r2 < r3) goto L2c
            com.google.android.gms.internal.ads.zzhm r2 = r1.zzj
            java.util.Objects.requireNonNull(r2)
            com.google.android.gms.internal.ads.zzhm.zza(r2, r8, r9)
        L2c:
            return
    }
}
