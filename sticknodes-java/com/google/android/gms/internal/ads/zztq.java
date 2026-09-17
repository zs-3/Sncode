package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zztq implements com.google.android.gms.internal.ads.zztn {
    private final int zza;
    private android.media.MediaCodecInfo[] zzb;

    public zztq(boolean r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            if (r2 != 0) goto La
            if (r3 == 0) goto L9
            goto La
        L9:
            r0 = 0
        La:
            r1.zza = r0
            return
    }

    private final void zzf() {
            r2 = this;
            android.media.MediaCodecInfo[] r0 = r2.zzb
            if (r0 != 0) goto L11
            int r0 = r2.zza
            android.media.MediaCodecList r1 = new android.media.MediaCodecList
            r1.<init>(r0)
            android.media.MediaCodecInfo[] r0 = r1.getCodecInfos()
            r2.zzb = r0
        L11:
            return
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final int zza() {
            r1 = this;
            r1.zzf()
            android.media.MediaCodecInfo[] r0 = r1.zzb
            int r0 = r0.length
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final android.media.MediaCodecInfo zzb(int r2) {
            r1 = this;
            r1.zzf()
            android.media.MediaCodecInfo[] r0 = r1.zzb
            r2 = r0[r2]
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final boolean zzc(java.lang.String r1, java.lang.String r2, android.media.MediaCodecInfo.CodecCapabilities r3) {
            r0 = this;
            boolean r1 = r3.isFeatureRequired(r1)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final boolean zzd(java.lang.String r1, java.lang.String r2, android.media.MediaCodecInfo.CodecCapabilities r3) {
            r0 = this;
            boolean r1 = r3.isFeatureSupported(r1)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final boolean zze() {
            r1 = this;
            r0 = 1
            return r0
    }
}
