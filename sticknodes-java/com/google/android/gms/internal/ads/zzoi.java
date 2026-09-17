package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzoi implements com.google.android.gms.internal.ads.zzmd, com.google.android.gms.internal.ads.zzoj {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzok zzb;
    private final android.media.metrics.PlaybackSession zzc;
    private final long zzd;
    private final com.google.android.gms.internal.ads.zzcb zze;
    private final com.google.android.gms.internal.ads.zzca zzf;
    private final java.util.HashMap zzg;
    private final java.util.HashMap zzh;
    private java.lang.String zzi;
    private android.media.metrics.PlaybackMetrics.Builder zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private com.google.android.gms.internal.ads.zzbp zzn;
    private com.google.android.gms.internal.ads.zzoh zzo;
    private com.google.android.gms.internal.ads.zzoh zzp;
    private com.google.android.gms.internal.ads.zzoh zzq;
    private com.google.android.gms.internal.ads.zzaf zzr;
    private com.google.android.gms.internal.ads.zzaf zzs;
    private com.google.android.gms.internal.ads.zzaf zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;

    private zzoi(android.content.Context r1, android.media.metrics.PlaybackSession r2) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.zza = r1
            r0.zzc = r2
            com.google.android.gms.internal.ads.zzcb r1 = new com.google.android.gms.internal.ads.zzcb
            r1.<init>()
            r0.zze = r1
            com.google.android.gms.internal.ads.zzca r1 = new com.google.android.gms.internal.ads.zzca
            r1.<init>()
            r0.zzf = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.zzh = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.zzg = r1
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.zzd = r1
            r1 = 0
            r0.zzl = r1
            r0.zzm = r1
            com.google.android.gms.internal.ads.zzog r1 = new com.google.android.gms.internal.ads.zzog
            com.google.android.gms.internal.ads.zzfyp r2 = com.google.android.gms.internal.ads.zzog.zza
            r1.<init>(r2)
            r0.zzb = r1
            r1.zzh(r0)
            return
    }

    public static com.google.android.gms.internal.ads.zzoi zzb(android.content.Context r2) {
            java.lang.String r0 = "media_metrics"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.media.metrics.MediaMetricsManager r0 = (android.media.metrics.MediaMetricsManager) r0
            if (r0 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            com.google.android.gms.internal.ads.zzoi r1 = new com.google.android.gms.internal.ads.zzoi
            android.media.metrics.PlaybackSession r0 = r0.createPlaybackSession()
            r1.<init>(r2, r0)
            return r1
    }

    @android.annotation.SuppressLint({"SwitchIntDef"})
    private static int zzr(int r0) {
            int r0 = com.google.android.gms.internal.ads.zzeu.zzk(r0)
            switch(r0) {
                case 6002: goto L13;
                case 6003: goto L10;
                case 6004: goto Ld;
                case 6005: goto La;
                default: goto L7;
            }
        L7:
            r0 = 27
            return r0
        La:
            r0 = 26
            return r0
        Ld:
            r0 = 25
            return r0
        L10:
            r0 = 28
            return r0
        L13:
            r0 = 24
            return r0
    }

    private final void zzs() {
            r7 = this;
            android.media.metrics.PlaybackMetrics$Builder r0 = r7.zzj
            r1 = 0
            if (r0 == 0) goto L69
            boolean r2 = r7.zzz
            if (r2 == 0) goto L69
            int r2 = r7.zzy
            r0.setAudioUnderrunCount(r2)
            android.media.metrics.PlaybackMetrics$Builder r0 = r7.zzj
            int r2 = r7.zzw
            r0.setVideoFramesDropped(r2)
            android.media.metrics.PlaybackMetrics$Builder r0 = r7.zzj
            int r2 = r7.zzx
            r0.setVideoFramesPlayed(r2)
            java.util.HashMap r0 = r7.zzg
            java.lang.String r2 = r7.zzi
            java.lang.Object r0 = r0.get(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            android.media.metrics.PlaybackMetrics$Builder r2 = r7.zzj
            r3 = 0
            if (r0 != 0) goto L2e
            r5 = r3
            goto L32
        L2e:
            long r5 = r0.longValue()
        L32:
            r2.setNetworkTransferDurationMillis(r5)
            java.util.HashMap r0 = r7.zzh
            java.lang.String r2 = r7.zzi
            java.lang.Object r0 = r0.get(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            android.media.metrics.PlaybackMetrics$Builder r2 = r7.zzj
            if (r0 != 0) goto L45
            r5 = r3
            goto L49
        L45:
            long r5 = r0.longValue()
        L49:
            r2.setNetworkBytesRead(r5)
            android.media.metrics.PlaybackMetrics$Builder r2 = r7.zzj
            if (r0 == 0) goto L5a
            long r5 = r0.longValue()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L5a
            r0 = 1
            goto L5b
        L5a:
            r0 = 0
        L5b:
            r2.setStreamSource(r0)
            android.media.metrics.PlaybackSession r0 = r7.zzc
            android.media.metrics.PlaybackMetrics$Builder r2 = r7.zzj
            android.media.metrics.PlaybackMetrics r2 = r2.build()
            r0.reportPlaybackMetrics(r2)
        L69:
            r0 = 0
            r7.zzj = r0
            r7.zzi = r0
            r7.zzy = r1
            r7.zzw = r1
            r7.zzx = r1
            r7.zzr = r0
            r7.zzs = r0
            r7.zzt = r0
            r7.zzz = r1
            return
    }

    private final void zzt(long r7, com.google.android.gms.internal.ads.zzaf r9, int r10) {
            r6 = this;
            com.google.android.gms.internal.ads.zzaf r10 = r6.zzs
            boolean r10 = java.util.Objects.equals(r10, r9)
            if (r10 == 0) goto L9
            return
        L9:
            com.google.android.gms.internal.ads.zzaf r10 = r6.zzs
            if (r10 != 0) goto L10
            r10 = 1
            r5 = 1
            goto L12
        L10:
            r10 = 0
            r5 = 0
        L12:
            r6.zzs = r9
            r1 = 0
            r0 = r6
            r2 = r7
            r4 = r9
            r0.zzx(r1, r2, r4, r5)
            return
    }

    private final void zzu(long r7, com.google.android.gms.internal.ads.zzaf r9, int r10) {
            r6 = this;
            com.google.android.gms.internal.ads.zzaf r10 = r6.zzt
            boolean r10 = java.util.Objects.equals(r10, r9)
            if (r10 == 0) goto L9
            return
        L9:
            com.google.android.gms.internal.ads.zzaf r10 = r6.zzt
            if (r10 != 0) goto L10
            r10 = 1
            r5 = 1
            goto L12
        L10:
            r10 = 0
            r5 = 0
        L12:
            r6.zzt = r9
            r1 = 2
            r0 = r6
            r2 = r7
            r4 = r9
            r0.zzx(r1, r2, r4, r5)
            return
    }

    private final void zzv(com.google.android.gms.internal.ads.zzcc r8, com.google.android.gms.internal.ads.zzuy r9) {
            r7 = this;
            android.media.metrics.PlaybackMetrics$Builder r0 = r7.zzj
            if (r9 != 0) goto L6
            goto L71
        L6:
            java.lang.Object r9 = r9.zza
            int r9 = r8.zza(r9)
            r1 = -1
            if (r9 == r1) goto L71
            com.google.android.gms.internal.ads.zzca r1 = r7.zzf
            r2 = 0
            r8.zzd(r9, r1, r2)
            com.google.android.gms.internal.ads.zzca r9 = r7.zzf
            com.google.android.gms.internal.ads.zzcb r1 = r7.zze
            int r9 = r9.zzc
            r3 = 0
            r8.zze(r9, r1, r3)
            com.google.android.gms.internal.ads.zzcb r8 = r7.zze
            com.google.android.gms.internal.ads.zzbc r8 = r8.zzd
            com.google.android.gms.internal.ads.zzax r8 = r8.zzb
            r9 = 2
            r1 = 1
            if (r8 != 0) goto L2b
            goto L3e
        L2b:
            android.net.Uri r8 = r8.zza
            int r8 = com.google.android.gms.internal.ads.zzeu.zzn(r8)
            if (r8 == 0) goto L3d
            if (r8 == r1) goto L3b
            if (r8 == r9) goto L39
            r2 = 1
            goto L3e
        L39:
            r2 = 4
            goto L3e
        L3b:
            r2 = 5
            goto L3e
        L3d:
            r2 = 3
        L3e:
            r0.setStreamType(r2)
            com.google.android.gms.internal.ads.zzcb r8 = r7.zze
            long r2 = r8.zzm
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L63
            boolean r4 = r8.zzk
            if (r4 != 0) goto L63
            boolean r4 = r8.zzi
            if (r4 != 0) goto L63
            boolean r8 = r8.zzb()
            if (r8 != 0) goto L63
            long r2 = com.google.android.gms.internal.ads.zzeu.zzu(r2)
            r0.setMediaDurationMillis(r2)
        L63:
            com.google.android.gms.internal.ads.zzcb r8 = r7.zze
            boolean r8 = r8.zzb()
            if (r1 == r8) goto L6c
            r9 = 1
        L6c:
            r0.setPlaybackType(r9)
            r7.zzz = r1
        L71:
            return
    }

    private final void zzw(long r7, com.google.android.gms.internal.ads.zzaf r9, int r10) {
            r6 = this;
            com.google.android.gms.internal.ads.zzaf r10 = r6.zzr
            boolean r10 = java.util.Objects.equals(r10, r9)
            if (r10 == 0) goto L9
            return
        L9:
            com.google.android.gms.internal.ads.zzaf r10 = r6.zzr
            if (r10 != 0) goto L10
            r10 = 1
            r5 = 1
            goto L12
        L10:
            r10 = 0
            r5 = 0
        L12:
            r6.zzr = r9
            r1 = 1
            r0 = r6
            r2 = r7
            r4 = r9
            r0.zzx(r1, r2, r4, r5)
            return
    }

    private final void zzx(int r4, long r5, com.google.android.gms.internal.ads.zzaf r7, int r8) {
            r3 = this;
            android.media.metrics.TrackChangeEvent$Builder r0 = new android.media.metrics.TrackChangeEvent$Builder
            r0.<init>(r4)
            long r1 = r3.zzd
            long r5 = r5 - r1
            android.media.metrics.TrackChangeEvent$Builder r4 = r0.setTimeSinceCreatedMillis(r5)
            r5 = 0
            r6 = 1
            if (r7 == 0) goto L8a
            r4.setTrackState(r6)
            r0 = 2
            if (r8 == r6) goto L18
            r8 = 1
            goto L19
        L18:
            r8 = 2
        L19:
            r4.setTrackChangeReason(r8)
            java.lang.String r8 = r7.zzm
            if (r8 == 0) goto L23
            r4.setContainerMimeType(r8)
        L23:
            java.lang.String r8 = r7.zzn
            if (r8 == 0) goto L2a
            r4.setSampleMimeType(r8)
        L2a:
            java.lang.String r8 = r7.zzj
            if (r8 == 0) goto L31
            r4.setCodecName(r8)
        L31:
            int r8 = r7.zzi
            r1 = -1
            if (r8 == r1) goto L39
            r4.setBitrate(r8)
        L39:
            int r8 = r7.zzt
            if (r8 == r1) goto L40
            r4.setWidth(r8)
        L40:
            int r8 = r7.zzu
            if (r8 == r1) goto L47
            r4.setHeight(r8)
        L47:
            int r8 = r7.zzB
            if (r8 == r1) goto L4e
            r4.setChannelCount(r8)
        L4e:
            int r8 = r7.zzC
            if (r8 == r1) goto L55
            r4.setAudioSampleRate(r8)
        L55:
            java.lang.String r8 = r7.zzd
            if (r8 == 0) goto L7e
            int r2 = com.google.android.gms.internal.ads.zzeu.zza
            java.lang.String r2 = "-"
            java.lang.String[] r8 = r8.split(r2, r1)
            r5 = r8[r5]
            int r1 = r8.length
            if (r1 < r0) goto L69
            r8 = r8[r6]
            goto L6a
        L69:
            r8 = 0
        L6a:
            android.util.Pair r5 = android.util.Pair.create(r5, r8)
            java.lang.Object r8 = r5.first
            java.lang.String r8 = (java.lang.String) r8
            r4.setLanguage(r8)
            java.lang.Object r5 = r5.second
            if (r5 == 0) goto L7e
            java.lang.String r5 = (java.lang.String) r5
            r4.setLanguageRegion(r5)
        L7e:
            float r5 = r7.zzv
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L8d
            r4.setVideoFrameRate(r5)
            goto L8d
        L8a:
            r4.setTrackState(r5)
        L8d:
            r3.zzz = r6
            android.media.metrics.PlaybackSession r5 = r3.zzc
            android.media.metrics.TrackChangeEvent r4 = r4.build()
            r5.reportTrackChangeEvent(r4)
            return
    }

    private final boolean zzy(com.google.android.gms.internal.ads.zzoh r2) {
            r1 = this;
            if (r2 == 0) goto L12
            com.google.android.gms.internal.ads.zzok r0 = r1.zzb
            java.lang.String r2 = r2.zzc
            java.lang.String r0 = r0.zze()
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final android.media.metrics.LogSessionId zza() {
            r1 = this;
            android.media.metrics.PlaybackSession r0 = r1.zzc
            android.media.metrics.LogSessionId r0 = r0.getSessionId()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzoj
    public final void zzc(com.google.android.gms.internal.ads.zzmb r2, java.lang.String r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzuy r0 = r2.zzd
            if (r0 == 0) goto Lb
            boolean r0 = r0.zzb()
            if (r0 == 0) goto Lb
            return
        Lb:
            r1.zzs()
            r1.zzi = r3
            android.media.metrics.PlaybackMetrics$Builder r3 = new android.media.metrics.PlaybackMetrics$Builder
            r3.<init>()
            java.lang.String r0 = "AndroidXMedia3"
            android.media.metrics.PlaybackMetrics$Builder r3 = r3.setPlayerName(r0)
            java.lang.String r0 = "1.4.0"
            android.media.metrics.PlaybackMetrics$Builder r3 = r3.setPlayerVersion(r0)
            r1.zzj = r3
            com.google.android.gms.internal.ads.zzcc r3 = r2.zzb
            com.google.android.gms.internal.ads.zzuy r2 = r2.zzd
            r1.zzv(r3, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzoj
    public final void zzd(com.google.android.gms.internal.ads.zzmb r1, java.lang.String r2, boolean r3) {
            r0 = this;
            com.google.android.gms.internal.ads.zzuy r1 = r1.zzd
            if (r1 == 0) goto La
            boolean r1 = r1.zzb()
            if (r1 != 0) goto L15
        La:
            java.lang.String r1 = r0.zzi
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L15
            r0.zzs()
        L15:
            java.util.HashMap r1 = r0.zzg
            r1.remove(r2)
            java.util.HashMap r1 = r0.zzh
            r1.remove(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final /* synthetic */ void zze(com.google.android.gms.internal.ads.zzmb r1, com.google.android.gms.internal.ads.zzaf r2, com.google.android.gms.internal.ads.zzib r3) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzf(com.google.android.gms.internal.ads.zzmb r6, int r7, long r8, long r10) {
            r5 = this;
            com.google.android.gms.internal.ads.zzuy r10 = r6.zzd
            if (r10 == 0) goto L42
            com.google.android.gms.internal.ads.zzok r11 = r5.zzb
            com.google.android.gms.internal.ads.zzcc r6 = r6.zzb
            java.lang.String r6 = r11.zzf(r6, r10)
            java.util.HashMap r10 = r5.zzh
            java.lang.Object r10 = r10.get(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            java.util.HashMap r11 = r5.zzg
            java.lang.Object r11 = r11.get(r6)
            java.lang.Long r11 = (java.lang.Long) r11
            java.util.HashMap r0 = r5.zzh
            r1 = 0
            if (r10 != 0) goto L24
            r3 = r1
            goto L28
        L24:
            long r3 = r10.longValue()
        L28:
            long r3 = r3 + r8
            java.lang.Long r8 = java.lang.Long.valueOf(r3)
            r0.put(r6, r8)
            java.util.HashMap r8 = r5.zzg
            if (r11 != 0) goto L35
            goto L39
        L35:
            long r1 = r11.longValue()
        L39:
            long r9 = (long) r7
            long r1 = r1 + r9
            java.lang.Long r7 = java.lang.Long.valueOf(r1)
            r8.put(r6, r7)
        L42:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzg(com.google.android.gms.internal.ads.zzmb r6, com.google.android.gms.internal.ads.zzuu r7) {
            r5 = this;
            com.google.android.gms.internal.ads.zzuy r0 = r6.zzd
            if (r0 != 0) goto L5
            goto L25
        L5:
            com.google.android.gms.internal.ads.zzaf r1 = r7.zzb
            com.google.android.gms.internal.ads.zzoh r2 = new com.google.android.gms.internal.ads.zzoh
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.internal.ads.zzok r3 = r5.zzb
            com.google.android.gms.internal.ads.zzcc r6 = r6.zzb
            r4 = 0
            java.lang.String r6 = r3.zzf(r6, r0)
            r2.<init>(r1, r4, r6)
            int r6 = r7.zza
            if (r6 == 0) goto L2c
            r7 = 1
            if (r6 == r7) goto L29
            r7 = 2
            if (r6 == r7) goto L2c
            r7 = 3
            if (r6 == r7) goto L26
        L25:
            return
        L26:
            r5.zzq = r2
            return
        L29:
            r5.zzp = r2
            return
        L2c:
            r5.zzo = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzmb r1, int r2, long r3) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzi(com.google.android.gms.internal.ads.zzbw r21, com.google.android.gms.internal.ads.zzmc r22) {
            r20 = this;
            r0 = r20
            r1 = r22
            int r2 = r22.zzb()
            if (r2 != 0) goto Lc
            goto L3e1
        Lc:
            r2 = 0
            r3 = 0
        Le:
            int r4 = r22.zzb()
            r5 = 11
            if (r3 >= r4) goto L38
            int r4 = r1.zza(r3)
            com.google.android.gms.internal.ads.zzmb r6 = r1.zzc(r4)
            if (r4 != 0) goto L26
            com.google.android.gms.internal.ads.zzok r4 = r0.zzb
            r4.zzk(r6)
            goto L35
        L26:
            if (r4 != r5) goto L30
            com.google.android.gms.internal.ads.zzok r4 = r0.zzb
            int r5 = r0.zzk
            r4.zzj(r6, r5)
            goto L35
        L30:
            com.google.android.gms.internal.ads.zzok r4 = r0.zzb
            r4.zzi(r6)
        L35:
            int r3 = r3 + 1
            goto Le
        L38:
            long r3 = android.os.SystemClock.elapsedRealtime()
            boolean r6 = r1.zzd(r2)
            if (r6 == 0) goto L51
            com.google.android.gms.internal.ads.zzmb r6 = r1.zzc(r2)
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.zzj
            if (r7 == 0) goto L51
            com.google.android.gms.internal.ads.zzcc r7 = r6.zzb
            com.google.android.gms.internal.ads.zzuy r6 = r6.zzd
            r0.zzv(r7, r6)
        L51:
            r6 = 2
            boolean r7 = r1.zzd(r6)
            r9 = 3
            r10 = 0
            r11 = 1
            if (r7 == 0) goto Lc9
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.zzj
            if (r7 == 0) goto Lc9
            com.google.android.gms.internal.ads.zzck r7 = r21.zzo()
            com.google.android.gms.internal.ads.zzgax r7 = r7.zza()
            int r12 = r7.size()
            r13 = 0
        L6c:
            if (r13 >= r12) goto L92
            java.lang.Object r14 = r7.get(r13)
            com.google.android.gms.internal.ads.zzcj r14 = (com.google.android.gms.internal.ads.zzcj) r14
            r15 = 0
        L75:
            int r5 = r14.zza
            int r16 = r13 + 1
            if (r15 >= r5) goto L8d
            boolean r5 = r14.zzd(r15)
            if (r5 == 0) goto L8a
            com.google.android.gms.internal.ads.zzaf r5 = r14.zzb(r15)
            com.google.android.gms.internal.ads.zzy r5 = r5.zzr
            if (r5 == 0) goto L8a
            goto L93
        L8a:
            int r15 = r15 + 1
            goto L75
        L8d:
            r13 = r16
            r5 = 11
            goto L6c
        L92:
            r5 = r10
        L93:
            if (r5 == 0) goto Lc9
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.zzj
            int r12 = com.google.android.gms.internal.ads.zzeu.zza
            r12 = 0
        L9a:
            int r13 = r5.zzb
            if (r12 >= r13) goto Lc5
            com.google.android.gms.internal.ads.zzx r13 = r5.zza(r12)
            java.util.UUID r13 = r13.zza
            java.util.UUID r14 = com.google.android.gms.internal.ads.zzk.zzd
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto Lae
            r5 = 3
            goto Lc6
        Lae:
            java.util.UUID r14 = com.google.android.gms.internal.ads.zzk.zze
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto Lb8
            r5 = 2
            goto Lc6
        Lb8:
            java.util.UUID r14 = com.google.android.gms.internal.ads.zzk.zzc
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto Lc2
            r5 = 6
            goto Lc6
        Lc2:
            int r12 = r12 + 1
            goto L9a
        Lc5:
            r5 = 1
        Lc6:
            r7.setDrmType(r5)
        Lc9:
            r5 = 1011(0x3f3, float:1.417E-42)
            boolean r5 = r1.zzd(r5)
            if (r5 == 0) goto Ld6
            int r5 = r0.zzy
            int r5 = r5 + r11
            r0.zzy = r5
        Ld6:
            com.google.android.gms.internal.ads.zzbp r5 = r0.zzn
            r16 = 9
            if (r5 != 0) goto Lde
            goto L290
        Lde:
            android.content.Context r7 = r0.zza
            int r8 = r5.zza
            r12 = 1001(0x3e9, float:1.403E-42)
            r17 = 31
            r18 = 14
            r19 = 35
            r13 = 23
            if (r8 != r12) goto Lf5
            r17 = 20
            r7 = 0
            r13 = 20
            goto L26a
        Lf5:
            r8 = r5
            com.google.android.gms.internal.ads.zzij r8 = (com.google.android.gms.internal.ads.zzij) r8
            int r12 = r8.zzc
            if (r12 != r11) goto Lfe
            r12 = 1
            goto Lff
        Lfe:
            r12 = 0
        Lff:
            int r8 = r8.zzg
            java.lang.Throwable r14 = r5.getCause()
            java.util.Objects.requireNonNull(r14)
            boolean r15 = r14 instanceof java.io.IOException
            if (r15 == 0) goto L200
            boolean r8 = r14 instanceof com.google.android.gms.internal.ads.zzha
            if (r8 == 0) goto L117
            com.google.android.gms.internal.ads.zzha r14 = (com.google.android.gms.internal.ads.zzha) r14
            int r7 = r14.zzc
            r13 = 5
            goto L26a
        L117:
            boolean r8 = r14 instanceof com.google.android.gms.internal.ads.zzgz
            if (r8 != 0) goto L1fb
            boolean r8 = r14 instanceof com.google.android.gms.internal.ads.zzbo
            if (r8 == 0) goto L121
            goto L1fb
        L121:
            boolean r8 = r14 instanceof com.google.android.gms.internal.ads.zzgy
            if (r8 != 0) goto L1c8
            boolean r12 = r14 instanceof com.google.android.gms.internal.ads.zzhi
            if (r12 == 0) goto L12b
            goto L1c8
        L12b:
            int r7 = r5.zza
            r8 = 1002(0x3ea, float:1.404E-42)
            if (r7 != r8) goto L138
            r17 = 21
            r7 = 0
            r13 = 21
            goto L26a
        L138:
            boolean r7 = r14 instanceof com.google.android.gms.internal.ads.zzro
            if (r7 == 0) goto L194
            java.lang.Throwable r7 = r14.getCause()
            java.util.Objects.requireNonNull(r7)
            boolean r8 = r7 instanceof android.media.MediaDrm.MediaDrmStateException
            if (r8 == 0) goto L157
            android.media.MediaDrm$MediaDrmStateException r7 = (android.media.MediaDrm.MediaDrmStateException) r7
            java.lang.String r7 = r7.getDiagnosticInfo()
            int r7 = com.google.android.gms.internal.ads.zzeu.zzl(r7)
            int r17 = zzr(r7)
            goto L262
        L157:
            int r8 = com.google.android.gms.internal.ads.zzeu.zza
            if (r8 < r13) goto L166
            boolean r8 = r7 instanceof android.media.MediaDrmResetException
            if (r8 == 0) goto L166
            r17 = 27
            r7 = 0
            r13 = 27
            goto L26a
        L166:
            boolean r8 = r7 instanceof android.media.NotProvisionedException
            if (r8 == 0) goto L171
            r17 = 24
            r7 = 0
            r13 = 24
            goto L26a
        L171:
            boolean r8 = r7 instanceof android.media.DeniedByServerException
            if (r8 == 0) goto L17c
            r17 = 29
            r7 = 0
            r13 = 29
            goto L26a
        L17c:
            boolean r8 = r7 instanceof com.google.android.gms.internal.ads.zzry
            if (r8 == 0) goto L182
            goto L218
        L182:
            boolean r7 = r7 instanceof com.google.android.gms.internal.ads.zzrn
            if (r7 == 0) goto L18d
            r17 = 28
            r7 = 0
            r13 = 28
            goto L26a
        L18d:
            r17 = 30
            r7 = 0
            r13 = 30
            goto L26a
        L194:
            boolean r7 = r14 instanceof com.google.android.gms.internal.ads.zzgv
            if (r7 == 0) goto L1c3
            java.lang.Throwable r7 = r14.getCause()
            boolean r7 = r7 instanceof java.io.FileNotFoundException
            if (r7 == 0) goto L1c3
            java.lang.Throwable r7 = r14.getCause()
            java.util.Objects.requireNonNull(r7)
            java.lang.Throwable r7 = r7.getCause()
            boolean r8 = r7 instanceof android.system.ErrnoException
            if (r8 == 0) goto L1be
            android.system.ErrnoException r7 = (android.system.ErrnoException) r7
            int r7 = r7.errno
            int r8 = android.system.OsConstants.EACCES
            if (r7 != r8) goto L1be
            r17 = 32
            r7 = 0
            r13 = 32
            goto L26a
        L1be:
            r7 = 0
            r13 = 31
            goto L26a
        L1c3:
            r7 = 0
            r13 = 9
            goto L26a
        L1c8:
            com.google.android.gms.internal.ads.zzei r7 = com.google.android.gms.internal.ads.zzei.zzb(r7)
            int r7 = r7.zza()
            if (r7 != r11) goto L1d6
            r7 = 0
            r13 = 3
            goto L26a
        L1d6:
            java.lang.Throwable r7 = r14.getCause()
            boolean r12 = r7 instanceof java.net.UnknownHostException
            if (r12 == 0) goto L1e2
            r7 = 0
            r13 = 6
            goto L26a
        L1e2:
            boolean r7 = r7 instanceof java.net.SocketTimeoutException
            if (r7 == 0) goto L1ea
            r7 = 0
            r13 = 7
            goto L26a
        L1ea:
            if (r8 == 0) goto L1f6
            com.google.android.gms.internal.ads.zzgy r14 = (com.google.android.gms.internal.ads.zzgy) r14
            int r7 = r14.zzb
            if (r7 != r11) goto L1f6
            r7 = 0
            r13 = 4
            goto L26a
        L1f6:
            r7 = 0
            r13 = 8
            goto L26a
        L1fb:
            r7 = 0
            r13 = 11
            goto L26a
        L200:
            if (r12 == 0) goto L20a
            if (r8 == 0) goto L206
            if (r8 != r11) goto L20a
        L206:
            r7 = 0
            r13 = 35
            goto L26a
        L20a:
            if (r12 == 0) goto L214
            if (r8 != r9) goto L214
            r17 = 15
            r7 = 0
            r13 = 15
            goto L26a
        L214:
            if (r12 == 0) goto L21a
            if (r8 != r6) goto L21a
        L218:
            r7 = 0
            goto L26a
        L21a:
            boolean r7 = r14 instanceof com.google.android.gms.internal.ads.zzta
            if (r7 == 0) goto L229
            com.google.android.gms.internal.ads.zzta r14 = (com.google.android.gms.internal.ads.zzta) r14
            java.lang.String r7 = r14.zzd
            int r7 = com.google.android.gms.internal.ads.zzeu.zzl(r7)
            r13 = 13
            goto L26a
        L229:
            boolean r7 = r14 instanceof com.google.android.gms.internal.ads.zzsv
            if (r7 == 0) goto L234
            com.google.android.gms.internal.ads.zzsv r14 = (com.google.android.gms.internal.ads.zzsv) r14
            int r7 = r14.zzb
        L231:
            r13 = 14
            goto L26a
        L234:
            boolean r7 = r14 instanceof java.lang.OutOfMemoryError
            if (r7 == 0) goto L23a
            r7 = 0
            goto L231
        L23a:
            boolean r7 = r14 instanceof com.google.android.gms.internal.ads.zzpu
            if (r7 == 0) goto L247
            com.google.android.gms.internal.ads.zzpu r14 = (com.google.android.gms.internal.ads.zzpu) r14
            int r7 = r14.zza
            r17 = 17
            r13 = 17
            goto L26a
        L247:
            boolean r7 = r14 instanceof com.google.android.gms.internal.ads.zzpx
            if (r7 == 0) goto L254
            com.google.android.gms.internal.ads.zzpx r14 = (com.google.android.gms.internal.ads.zzpx) r14
            int r7 = r14.zza
            r17 = 18
            r13 = 18
            goto L26a
        L254:
            boolean r7 = r14 instanceof android.media.MediaCodec.CryptoException
            if (r7 == 0) goto L265
            android.media.MediaCodec$CryptoException r14 = (android.media.MediaCodec.CryptoException) r14
            int r7 = r14.getErrorCode()
            int r17 = zzr(r7)
        L262:
            r13 = r17
            goto L26a
        L265:
            r17 = 22
            r7 = 0
            r13 = 22
        L26a:
            android.media.metrics.PlaybackSession r8 = r0.zzc
            android.media.metrics.PlaybackErrorEvent$Builder r12 = new android.media.metrics.PlaybackErrorEvent$Builder
            r12.<init>()
            long r14 = r0.zzd
            long r14 = r3 - r14
            android.media.metrics.PlaybackErrorEvent$Builder r12 = r12.setTimeSinceCreatedMillis(r14)
            android.media.metrics.PlaybackErrorEvent$Builder r12 = r12.setErrorCode(r13)
            android.media.metrics.PlaybackErrorEvent$Builder r7 = r12.setSubErrorCode(r7)
            android.media.metrics.PlaybackErrorEvent$Builder r5 = r7.setException(r5)
            android.media.metrics.PlaybackErrorEvent r5 = r5.build()
            r8.reportPlaybackErrorEvent(r5)
            r0.zzz = r11
            r0.zzn = r10
        L290:
            boolean r5 = r1.zzd(r6)
            if (r5 == 0) goto L2bc
            com.google.android.gms.internal.ads.zzck r5 = r21.zzo()
            boolean r7 = r5.zzb(r6)
            boolean r8 = r5.zzb(r11)
            boolean r5 = r5.zzb(r9)
            if (r7 != 0) goto L2ad
            if (r8 != 0) goto L2ad
            if (r5 == 0) goto L2bc
            r5 = 1
        L2ad:
            if (r7 != 0) goto L2b2
            r0.zzw(r3, r10, r2)
        L2b2:
            if (r8 != 0) goto L2b7
            r0.zzt(r3, r10, r2)
        L2b7:
            if (r5 != 0) goto L2bc
            r0.zzu(r3, r10, r2)
        L2bc:
            com.google.android.gms.internal.ads.zzoh r5 = r0.zzo
            boolean r5 = r0.zzy(r5)
            if (r5 == 0) goto L2d2
            com.google.android.gms.internal.ads.zzoh r5 = r0.zzo
            com.google.android.gms.internal.ads.zzaf r5 = r5.zza
            int r7 = r5.zzu
            r8 = -1
            if (r7 == r8) goto L2d2
            r0.zzw(r3, r5, r2)
            r0.zzo = r10
        L2d2:
            com.google.android.gms.internal.ads.zzoh r5 = r0.zzp
            boolean r5 = r0.zzy(r5)
            if (r5 == 0) goto L2e3
            com.google.android.gms.internal.ads.zzoh r5 = r0.zzp
            com.google.android.gms.internal.ads.zzaf r5 = r5.zza
            r0.zzt(r3, r5, r2)
            r0.zzp = r10
        L2e3:
            com.google.android.gms.internal.ads.zzoh r5 = r0.zzq
            boolean r5 = r0.zzy(r5)
            if (r5 == 0) goto L2f4
            com.google.android.gms.internal.ads.zzoh r5 = r0.zzq
            com.google.android.gms.internal.ads.zzaf r5 = r5.zza
            r0.zzu(r3, r5, r2)
            r0.zzq = r10
        L2f4:
            android.content.Context r5 = r0.zza
            com.google.android.gms.internal.ads.zzei r5 = com.google.android.gms.internal.ads.zzei.zzb(r5)
            int r5 = r5.zza()
            switch(r5) {
                case 0: goto L315;
                case 1: goto L312;
                case 2: goto L310;
                case 3: goto L30e;
                case 4: goto L30c;
                case 5: goto L30a;
                case 6: goto L301;
                case 7: goto L308;
                case 8: goto L301;
                case 9: goto L305;
                case 10: goto L303;
                default: goto L301;
            }
        L301:
            r13 = 1
            goto L316
        L303:
            r13 = 7
            goto L316
        L305:
            r13 = 8
            goto L316
        L308:
            r13 = 3
            goto L316
        L30a:
            r13 = 6
            goto L316
        L30c:
            r13 = 5
            goto L316
        L30e:
            r13 = 4
            goto L316
        L310:
            r13 = 2
            goto L316
        L312:
            r13 = 9
            goto L316
        L315:
            r13 = 0
        L316:
            int r5 = r0.zzm
            if (r13 == r5) goto L336
            r0.zzm = r13
            android.media.metrics.PlaybackSession r5 = r0.zzc
            android.media.metrics.NetworkEvent$Builder r7 = new android.media.metrics.NetworkEvent$Builder
            r7.<init>()
            android.media.metrics.NetworkEvent$Builder r7 = r7.setNetworkType(r13)
            long r12 = r0.zzd
            long r12 = r3 - r12
            android.media.metrics.NetworkEvent$Builder r7 = r7.setTimeSinceCreatedMillis(r12)
            android.media.metrics.NetworkEvent r7 = r7.build()
            r5.reportNetworkEvent(r7)
        L336:
            int r5 = r21.zzf()
            if (r5 == r6) goto L33e
            r0.zzu = r2
        L33e:
            r5 = r21
            com.google.android.gms.internal.ads.zzly r5 = (com.google.android.gms.internal.ads.zzly) r5
            com.google.android.gms.internal.ads.zzij r5 = r5.zzC()
            r7 = 10
            if (r5 != 0) goto L34d
            r0.zzv = r2
            goto L355
        L34d:
            boolean r2 = r1.zzd(r7)
            if (r2 == 0) goto L355
            r0.zzv = r11
        L355:
            int r2 = r21.zzf()
            boolean r5 = r0.zzu
            r8 = 12
            if (r5 == 0) goto L361
            r5 = 5
            goto L3ad
        L361:
            boolean r5 = r0.zzv
            if (r5 == 0) goto L368
            r5 = 13
            goto L3ad
        L368:
            r5 = 4
            if (r2 != r5) goto L36e
            r5 = 11
            goto L3ad
        L36e:
            if (r2 != r6) goto L38e
            int r2 = r0.zzl
            if (r2 == 0) goto L38c
            if (r2 == r6) goto L38c
            if (r2 != r8) goto L379
            goto L38c
        L379:
            boolean r2 = r21.zzu()
            if (r2 != 0) goto L381
            r5 = 7
            goto L3ad
        L381:
            int r2 = r21.zzg()
            if (r2 == 0) goto L38a
            r5 = 10
            goto L3ad
        L38a:
            r5 = 6
            goto L3ad
        L38c:
            r5 = 2
            goto L3ad
        L38e:
            if (r2 != r9) goto L3a2
            boolean r2 = r21.zzu()
            if (r2 != 0) goto L397
            goto L3ad
        L397:
            int r2 = r21.zzg()
            if (r2 == 0) goto L3a0
            r5 = 9
            goto L3ad
        L3a0:
            r5 = 3
            goto L3ad
        L3a2:
            if (r2 != r11) goto L3ab
            int r2 = r0.zzl
            if (r2 == 0) goto L3ab
            r5 = 12
            goto L3ad
        L3ab:
            int r5 = r0.zzl
        L3ad:
            int r2 = r0.zzl
            if (r2 == r5) goto L3d0
            r0.zzl = r5
            r0.zzz = r11
            android.media.metrics.PlaybackSession r2 = r0.zzc
            android.media.metrics.PlaybackStateEvent$Builder r5 = new android.media.metrics.PlaybackStateEvent$Builder
            r5.<init>()
            int r6 = r0.zzl
            android.media.metrics.PlaybackStateEvent$Builder r5 = r5.setState(r6)
            long r6 = r0.zzd
            long r3 = r3 - r6
            android.media.metrics.PlaybackStateEvent$Builder r3 = r5.setTimeSinceCreatedMillis(r3)
            android.media.metrics.PlaybackStateEvent r3 = r3.build()
            r2.reportPlaybackStateEvent(r3)
        L3d0:
            r2 = 1028(0x404, float:1.44E-42)
            boolean r3 = r1.zzd(r2)
            if (r3 == 0) goto L3e1
            com.google.android.gms.internal.ads.zzok r3 = r0.zzb
            com.google.android.gms.internal.ads.zzmb r1 = r1.zzc(r2)
            r3.zzg(r1)
        L3e1:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzj(com.google.android.gms.internal.ads.zzmb r1, com.google.android.gms.internal.ads.zzup r2, com.google.android.gms.internal.ads.zzuu r3, java.io.IOException r4, boolean r5) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzmb r1, int r2) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzl(com.google.android.gms.internal.ads.zzmb r1, com.google.android.gms.internal.ads.zzbp r2) {
            r0 = this;
            r0.zzn = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzm(com.google.android.gms.internal.ads.zzmb r1, com.google.android.gms.internal.ads.zzbv r2, com.google.android.gms.internal.ads.zzbv r3, int r4) {
            r0 = this;
            r1 = 1
            if (r4 != r1) goto L6
            r0.zzu = r1
            r4 = 1
        L6:
            r0.zzk = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final /* synthetic */ void zzn(com.google.android.gms.internal.ads.zzmb r1, java.lang.Object r2, long r3) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzo(com.google.android.gms.internal.ads.zzmb r2, com.google.android.gms.internal.ads.zzia r3) {
            r1 = this;
            int r2 = r1.zzw
            int r0 = r3.zzg
            int r2 = r2 + r0
            r1.zzw = r2
            int r2 = r1.zzx
            int r3 = r3.zze
            int r2 = r2 + r3
            r1.zzx = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final /* synthetic */ void zzp(com.google.android.gms.internal.ads.zzmb r1, com.google.android.gms.internal.ads.zzaf r2, com.google.android.gms.internal.ads.zzib r3) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzq(com.google.android.gms.internal.ads.zzmb r4, com.google.android.gms.internal.ads.zzcp r5) {
            r3 = this;
            com.google.android.gms.internal.ads.zzoh r4 = r3.zzo
            if (r4 == 0) goto L27
            com.google.android.gms.internal.ads.zzaf r0 = r4.zza
            int r1 = r0.zzu
            r2 = -1
            if (r1 != r2) goto L27
            com.google.android.gms.internal.ads.zzad r0 = r0.zzb()
            int r1 = r5.zzb
            r0.zzae(r1)
            int r5 = r5.zzc
            r0.zzJ(r5)
            com.google.android.gms.internal.ads.zzaf r5 = r0.zzaf()
            java.lang.String r4 = r4.zzc
            com.google.android.gms.internal.ads.zzoh r0 = new com.google.android.gms.internal.ads.zzoh
            r1 = 0
            r0.<init>(r5, r1, r4)
            r3.zzo = r0
        L27:
            return
    }
}
