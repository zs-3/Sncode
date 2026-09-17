package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzyc {
    private final android.media.Spatializer zza;
    private final boolean zzb;
    private android.os.Handler zzc;
    private android.media.Spatializer.OnSpatializerStateChangedListener zzd;

    private zzyc(android.media.Spatializer r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            int r1 = r1.getImmersiveAudioLevel()
            if (r1 == 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            r0.zzb = r1
            return
    }

    public static com.google.android.gms.internal.ads.zzyc zza(android.content.Context r1) {
            java.lang.String r0 = "audio"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.media.AudioManager r1 = (android.media.AudioManager) r1
            if (r1 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            com.google.android.gms.internal.ads.zzyc r0 = new com.google.android.gms.internal.ads.zzyc
            android.media.Spatializer r1 = r1.getSpatializer()
            r0.<init>(r1)
            return r0
    }

    public final void zzb(com.google.android.gms.internal.ads.zzyj r2, android.os.Looper r3) {
            r1 = this;
            android.media.Spatializer$OnSpatializerStateChangedListener r0 = r1.zzd
            if (r0 != 0) goto L26
            android.os.Handler r0 = r1.zzc
            if (r0 == 0) goto L9
            goto L26
        L9:
            com.google.android.gms.internal.ads.zzyb r0 = new com.google.android.gms.internal.ads.zzyb
            r0.<init>(r1, r2)
            r1.zzd = r0
            android.os.Handler r2 = new android.os.Handler
            r2.<init>(r3)
            r1.zzc = r2
            android.media.Spatializer r3 = r1.zza
            java.util.Objects.requireNonNull(r2)
            com.google.android.gms.internal.ads.zzya r0 = new com.google.android.gms.internal.ads.zzya
            r0.<init>(r2)
            android.media.Spatializer$OnSpatializerStateChangedListener r2 = r1.zzd
            r3.addOnSpatializerStateChangedListener(r0, r2)
        L26:
            return
    }

    public final void zzc() {
            r2 = this;
            android.media.Spatializer$OnSpatializerStateChangedListener r0 = r2.zzd
            if (r0 == 0) goto L1a
            android.os.Handler r1 = r2.zzc
            if (r1 != 0) goto L9
            goto L1a
        L9:
            android.media.Spatializer r1 = r2.zza
            r1.removeOnSpatializerStateChangedListener(r0)
            android.os.Handler r0 = r2.zzc
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            r2.zzc = r1
            r2.zzd = r1
        L1a:
            return
    }

    public final boolean zzd(com.google.android.gms.internal.ads.zzh r4, com.google.android.gms.internal.ads.zzaf r5) {
            r3 = this;
            java.lang.String r0 = r5.zzn
            java.lang.String r1 = "audio/eac3-joc"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            int r0 = r5.zzB
            r1 = 16
            if (r0 != r1) goto L13
            r0 = 12
            goto L15
        L13:
            int r0 = r5.zzB
        L15:
            int r0 = com.google.android.gms.internal.ads.zzeu.zzh(r0)
            if (r0 != 0) goto L1d
            r4 = 0
            return r4
        L1d:
            android.media.AudioFormat$Builder r1 = new android.media.AudioFormat$Builder
            r1.<init>()
            r2 = 2
            android.media.AudioFormat$Builder r1 = r1.setEncoding(r2)
            android.media.AudioFormat$Builder r0 = r1.setChannelMask(r0)
            int r5 = r5.zzC
            r1 = -1
            if (r5 == r1) goto L33
            r0.setSampleRate(r5)
        L33:
            android.media.Spatializer r5 = r3.zza
            com.google.android.gms.internal.ads.zzf r4 = r4.zza()
            android.media.AudioAttributes r4 = r4.zza
            android.media.AudioFormat r0 = r0.build()
            boolean r4 = r5.canBeSpatialized(r4, r0)
            return r4
    }

    public final boolean zze() {
            r1 = this;
            android.media.Spatializer r0 = r1.zza
            boolean r0 = r0.isAvailable()
            return r0
    }

    public final boolean zzf() {
            r1 = this;
            android.media.Spatializer r0 = r1.zza
            boolean r0 = r0.isEnabled()
            return r0
    }

    public final boolean zzg() {
            r1 = this;
            boolean r0 = r1.zzb
            return r0
    }
}
