package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zztp implements com.google.android.gms.internal.ads.zztn {
    private zztp() {
            r1 = this;
            r0 = 0
            throw r0
    }

    /* synthetic */ zztp(com.google.android.gms.internal.ads.zzto r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final int zza() {
            r1 = this;
            int r0 = android.media.MediaCodecList.getCodecCount()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final android.media.MediaCodecInfo zzb(int r1) {
            r0 = this;
            android.media.MediaCodecInfo r1 = android.media.MediaCodecList.getCodecInfoAt(r1)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final boolean zzc(java.lang.String r1, java.lang.String r2, android.media.MediaCodecInfo.CodecCapabilities r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final boolean zzd(java.lang.String r1, java.lang.String r2, android.media.MediaCodecInfo.CodecCapabilities r3) {
            r0 = this;
            java.lang.String r3 = "secure-playback"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L12
            java.lang.String r1 = "video/avc"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final boolean zze() {
            r1 = this;
            r0 = 0
            return r0
    }
}
