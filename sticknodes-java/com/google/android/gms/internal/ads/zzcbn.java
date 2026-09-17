package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcbn extends com.google.android.gms.internal.ads.zzcbp implements android.view.TextureView.SurfaceTextureListener, android.media.MediaPlayer.OnBufferingUpdateListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnInfoListener, android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnVideoSizeChangedListener {
    private static final java.util.Map zzc = null;
    private final com.google.android.gms.internal.ads.zzccj zzd;
    private final com.google.android.gms.internal.ads.zzcck zze;
    private final boolean zzf;
    private int zzg;
    private int zzh;
    private android.media.MediaPlayer zzi;
    private android.net.Uri zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private com.google.android.gms.internal.ads.zzcch zzn;
    private final boolean zzo;
    private int zzp;
    private com.google.android.gms.internal.ads.zzcbo zzq;
    private boolean zzr;
    private java.lang.Integer zzs;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.gms.internal.ads.zzcbn.zzc = r0
            r1 = -1004(0xfffffffffffffc14, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MEDIA_ERROR_IO"
            r0.put(r1, r2)
            r1 = -1007(0xfffffffffffffc11, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MEDIA_ERROR_MALFORMED"
            r0.put(r1, r2)
            r1 = -1010(0xfffffffffffffc0e, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MEDIA_ERROR_UNSUPPORTED"
            r0.put(r1, r2)
            r1 = -110(0xffffffffffffff92, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MEDIA_ERROR_TIMED_OUT"
            r0.put(r1, r2)
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MEDIA_INFO_VIDEO_RENDERING_START"
            r0.put(r1, r2)
            r1 = 100
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MEDIA_ERROR_SERVER_DIED"
            r0.put(r1, r2)
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MEDIA_ERROR_UNKNOWN"
            r0.put(r1, r2)
            java.lang.String r2 = "MEDIA_INFO_UNKNOWN"
            r0.put(r1, r2)
            r1 = 700(0x2bc, float:9.81E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING"
            r0.put(r1, r2)
            r1 = 701(0x2bd, float:9.82E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MEDIA_INFO_BUFFERING_START"
            r0.put(r1, r2)
            r1 = 702(0x2be, float:9.84E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MEDIA_INFO_BUFFERING_END"
            r0.put(r1, r2)
            r1 = 800(0x320, float:1.121E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MEDIA_INFO_BAD_INTERLEAVING"
            r0.put(r1, r2)
            r1 = 801(0x321, float:1.122E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MEDIA_INFO_NOT_SEEKABLE"
            r0.put(r1, r2)
            r1 = 802(0x322, float:1.124E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MEDIA_INFO_METADATA_UPDATE"
            r0.put(r1, r2)
            r1 = 901(0x385, float:1.263E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE"
            r0.put(r1, r2)
            r1 = 902(0x386, float:1.264E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MEDIA_INFO_SUBTITLE_TIMED_OUT"
            r0.put(r1, r2)
            return
    }

    public zzcbn(android.content.Context r1, com.google.android.gms.internal.ads.zzccj r2, boolean r3, boolean r4, com.google.android.gms.internal.ads.zzcci r5, com.google.android.gms.internal.ads.zzcck r6) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.zzg = r1
            r0.zzh = r1
            r0.zzr = r1
            r1 = 0
            r0.zzs = r1
            r0.setSurfaceTextureListener(r0)
            r0.zzd = r2
            r0.zze = r6
            r0.zzo = r3
            r0.zzf = r4
            r6.zza(r0)
            return
    }

    private final void zzD() {
            r6 = this;
            java.lang.String r0 = "AdMediaPlayerView init MediaPlayer"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            android.graphics.SurfaceTexture r0 = r6.getSurfaceTexture()
            android.net.Uri r1 = r6.zzj
            if (r1 == 0) goto Lb4
            if (r0 != 0) goto L11
            goto Lb4
        L11:
            r1 = 0
            r6.zzE(r1)
            r2 = 1
            com.google.android.gms.ads.internal.zzu.zzk()     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            android.media.MediaPlayer r3 = new android.media.MediaPlayer     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            r3.<init>()     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            r6.zzi = r3     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            r3.setOnBufferingUpdateListener(r6)     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            android.media.MediaPlayer r3 = r6.zzi     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            r3.setOnCompletionListener(r6)     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            android.media.MediaPlayer r3 = r6.zzi     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            r3.setOnErrorListener(r6)     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            android.media.MediaPlayer r3 = r6.zzi     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            r3.setOnInfoListener(r6)     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            android.media.MediaPlayer r3 = r6.zzi     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            r3.setOnPreparedListener(r6)     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            android.media.MediaPlayer r3 = r6.zzi     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            r3.setOnVideoSizeChangedListener(r6)     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            r6.zzm = r1     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            boolean r3 = r6.zzo     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            if (r3 == 0) goto L6f
            com.google.android.gms.internal.ads.zzcch r3 = new com.google.android.gms.internal.ads.zzcch     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            android.content.Context r4 = r6.getContext()     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            r3.<init>(r4)     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            r6.zzn = r3     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            int r4 = r6.getWidth()     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            int r5 = r6.getHeight()     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            r3.zzd(r0, r4, r5)     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            com.google.android.gms.internal.ads.zzcch r3 = r6.zzn     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            r3.start()     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            com.google.android.gms.internal.ads.zzcch r3 = r6.zzn     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            android.graphics.SurfaceTexture r3 = r3.zzb()     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            if (r3 == 0) goto L67
            r0 = r3
            goto L6f
        L67:
            com.google.android.gms.internal.ads.zzcch r3 = r6.zzn     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            r3.zze()     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            r3 = 0
            r6.zzn = r3     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
        L6f:
            android.media.MediaPlayer r3 = r6.zzi     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            android.content.Context r4 = r6.getContext()     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            android.net.Uri r5 = r6.zzj     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            r3.setDataSource(r4, r5)     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            com.google.android.gms.ads.internal.zzu.zzl()     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            android.view.Surface r3 = new android.view.Surface     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            r3.<init>(r0)     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            android.media.MediaPlayer r0 = r6.zzi     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            r0.setSurface(r3)     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            android.media.MediaPlayer r0 = r6.zzi     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            r3 = 3
            r0.setAudioStreamType(r3)     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            android.media.MediaPlayer r0 = r6.zzi     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            r0.setScreenOnWhilePlaying(r2)     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            android.media.MediaPlayer r0 = r6.zzi     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            r0.prepareAsync()     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            r6.zzF(r2)     // Catch: java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
            return
        L9b:
            r0 = move-exception
            goto La0
        L9d:
            r0 = move-exception
            goto La0
        L9f:
            r0 = move-exception
        La0:
            android.net.Uri r3 = r6.zzj
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Failed to initialize MediaPlayer at "
            java.lang.String r3 = r4.concat(r3)
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r3, r0)
            android.media.MediaPlayer r0 = r6.zzi
            r6.onError(r0, r2, r1)
        Lb4:
            return
    }

    private final void zzE(boolean r3) {
            r2 = this;
            java.lang.String r0 = "AdMediaPlayerView release"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            com.google.android.gms.internal.ads.zzcch r0 = r2.zzn
            r1 = 0
            if (r0 == 0) goto Lf
            r0.zze()
            r2.zzn = r1
        Lf:
            android.media.MediaPlayer r0 = r2.zzi
            if (r0 == 0) goto L25
            r0.reset()
            android.media.MediaPlayer r0 = r2.zzi
            r0.release()
            r2.zzi = r1
            r0 = 0
            r2.zzF(r0)
            if (r3 == 0) goto L25
            r2.zzh = r0
        L25:
            return
    }

    private final void zzF(int r3) {
            r2 = this;
            r0 = 3
            if (r3 != r0) goto Le
            com.google.android.gms.internal.ads.zzcck r0 = r2.zze
            r0.zzc()
            com.google.android.gms.internal.ads.zzccn r0 = r2.zzb
            r0.zzb()
            goto L1c
        Le:
            int r1 = r2.zzg
            if (r1 != r0) goto L1c
            com.google.android.gms.internal.ads.zzcck r0 = r2.zze
            r0.zze()
            com.google.android.gms.internal.ads.zzccn r0 = r2.zzb
            r0.zzc()
        L1c:
            r2.zzg = r3
            return
    }

    private final void zzG(float r2) {
            r1 = this;
            android.media.MediaPlayer r0 = r1.zzi
            if (r0 == 0) goto L8
            r0.setVolume(r2, r2)     // Catch: java.lang.IllegalStateException -> L7
        L7:
            return
        L8:
            java.lang.String r2 = "AdMediaPlayerView setMediaPlayerVolume() called before onPrepared()."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
            return
    }

    private final boolean zzH() {
            r2 = this;
            android.media.MediaPlayer r0 = r2.zzi
            if (r0 == 0) goto Lf
            int r0 = r2.zzg
            r1 = -1
            if (r0 == r1) goto Lf
            if (r0 == 0) goto Lf
            r1 = 1
            if (r0 == r1) goto Lf
            return r1
        Lf:
            r0 = 0
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzcbo zzi(com.google.android.gms.internal.ads.zzcbn r0) {
            com.google.android.gms.internal.ads.zzcbo r0 = r0.zzq
            return r0
    }

    static /* bridge */ /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzcbn r0, boolean r1) {
            r1 = 1
            r0.zzr = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzl(com.google.android.gms.internal.ads.zzcbn r10, android.media.MediaPlayer r11) {
            java.lang.String r0 = "frameRate"
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzbT
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L11c
            com.google.android.gms.internal.ads.zzccj r1 = r10.zzd
            if (r1 == 0) goto L11c
            if (r11 != 0) goto L1c
            goto L11c
        L1c:
            android.media.MediaPlayer$TrackInfo[] r11 = r11.getTrackInfo()     // Catch: java.lang.RuntimeException -> L112
            if (r11 == 0) goto L11c
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
        L28:
            int r3 = r11.length
            if (r2 >= r3) goto L104
            r3 = r11[r2]
            if (r3 != 0) goto L31
            goto L100
        L31:
            int r4 = r3.getTrackType()
            r5 = 30
            r6 = 1
            java.lang.String r7 = "codecs-string"
            java.lang.String r8 = "mime"
            if (r4 == r6) goto L6d
            r6 = 2
            if (r4 == r6) goto L43
            goto L100
        L43:
            android.media.MediaFormat r3 = r3.getFormat()
            if (r3 == 0) goto L100
            boolean r4 = r3.containsKey(r8)
            if (r4 == 0) goto L58
            java.lang.String r4 = r3.getString(r8)
            java.lang.String r6 = "audioMime"
            r1.put(r6, r4)
        L58:
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r5) goto L100
            boolean r4 = r3.containsKey(r7)
            if (r4 == 0) goto L100
            java.lang.String r3 = r3.getString(r7)
            java.lang.String r4 = "audioCodec"
            r1.put(r4, r3)
            goto L100
        L6d:
            android.media.MediaFormat r3 = r3.getFormat()
            if (r3 == 0) goto L100
            java.lang.String r4 = "frame-rate"
            boolean r6 = r3.containsKey(r4)
            if (r6 == 0) goto L92
            float r6 = r3.getFloat(r4)     // Catch: java.lang.ClassCastException -> L87
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.ClassCastException -> L87
            r1.put(r0, r6)     // Catch: java.lang.ClassCastException -> L87
            goto L92
        L87:
            int r4 = r3.getInteger(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1.put(r0, r4)
        L92:
            java.lang.String r4 = "bitrate"
            boolean r6 = r3.containsKey(r4)
            if (r6 == 0) goto Lad
            int r4 = r3.getInteger(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r10.zzs = r4
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r6 = "bitRate"
            r1.put(r6, r4)
        Lad:
            java.lang.String r4 = "width"
            boolean r6 = r3.containsKey(r4)
            if (r6 == 0) goto Lde
            java.lang.String r6 = "height"
            boolean r9 = r3.containsKey(r6)
            if (r9 == 0) goto Lde
            int r4 = r3.getInteger(r4)
            int r6 = r3.getInteger(r6)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            java.lang.String r4 = "x"
            r9.append(r4)
            r9.append(r6)
            java.lang.String r4 = r9.toString()
            java.lang.String r6 = "resolution"
            r1.put(r6, r4)
        Lde:
            boolean r4 = r3.containsKey(r8)
            if (r4 == 0) goto Led
            java.lang.String r4 = r3.getString(r8)
            java.lang.String r6 = "videoMime"
            r1.put(r6, r4)
        Led:
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r5) goto L100
            boolean r4 = r3.containsKey(r7)
            if (r4 == 0) goto L100
            java.lang.String r3 = r3.getString(r7)
            java.lang.String r4 = "videoCodec"
            r1.put(r4, r3)
        L100:
            int r2 = r2 + 1
            goto L28
        L104:
            boolean r11 = r1.isEmpty()
            if (r11 != 0) goto L11c
            com.google.android.gms.internal.ads.zzccj r10 = r10.zzd
            java.lang.String r11 = "onMetadataEvent"
            r10.zzd(r11, r1)
            return
        L112:
            r10 = move-exception
            com.google.android.gms.internal.ads.zzcad r11 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r0 = "AdMediaPlayerView.reportMetadata"
            r11.zzw(r10, r0)
        L11c:
            return
    }

    static /* bridge */ /* synthetic */ boolean zzv(com.google.android.gms.internal.ads.zzcbn r0) {
            boolean r0 = r0.zzr
            return r0
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(android.media.MediaPlayer r1, int r2) {
            r0 = this;
            r0.zzm = r2
            return
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(android.media.MediaPlayer r2) {
            r1 = this;
            java.lang.String r2 = "AdMediaPlayerView completion"
            com.google.android.gms.ads.internal.util.zze.zza(r2)
            r2 = 5
            r1.zzF(r2)
            r1.zzh = r2
            com.google.android.gms.internal.ads.zzfun r2 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzcbg r0 = new com.google.android.gms.internal.ads.zzcbg
            r0.<init>(r1)
            r2.post(r0)
            return
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(android.media.MediaPlayer r2, int r3, int r4) {
            r1 = this;
            java.util.Map r2 = com.google.android.gms.internal.ads.zzcbn.zzc
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r2 = r2.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "AdMediaPlayerView MediaPlayer error: "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = ":"
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
            r4 = -1
            r1.zzF(r4)
            r1.zzh = r4
            com.google.android.gms.internal.ads.zzfun r4 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzcbh r0 = new com.google.android.gms.internal.ads.zzcbh
            r0.<init>(r1, r3, r2)
            r4.post(r0)
            r2 = 1
            return r2
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(android.media.MediaPlayer r2, int r3, int r4) {
            r1 = this;
            java.util.Map r2 = com.google.android.gms.internal.ads.zzcbn.zzc
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r2 = r2.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "AdMediaPlayerView MediaPlayer info: "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = ":"
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r2)
            r2 = 1
            return r2
    }

    @Override // android.view.View
    protected final void onMeasure(int r6, int r7) {
            r5 = this;
            int r0 = r5.zzk
            int r0 = android.view.TextureView.getDefaultSize(r0, r6)
            int r1 = r5.zzl
            int r1 = android.view.TextureView.getDefaultSize(r1, r7)
            int r2 = r5.zzk
            if (r2 <= 0) goto L7e
            int r2 = r5.zzl
            if (r2 <= 0) goto L7e
            com.google.android.gms.internal.ads.zzcch r2 = r5.zzn
            if (r2 != 0) goto L7e
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L43
            if (r1 != r2) goto L41
            int r0 = r5.zzk
            int r1 = r0 * r7
            int r2 = r5.zzl
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L7e
        L3c:
            if (r1 <= r3) goto L63
            int r1 = r3 / r0
            goto L54
        L41:
            r0 = 1073741824(0x40000000, float:2.0)
        L43:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L56
            int r0 = r5.zzl
            int r0 = r0 * r6
            int r2 = r5.zzk
            int r0 = r0 / r2
            if (r1 != r3) goto L53
            if (r0 <= r7) goto L53
            goto L63
        L53:
            r1 = r0
        L54:
            r0 = r6
            goto L7e
        L56:
            if (r1 != r2) goto L67
            int r1 = r5.zzk
            int r1 = r1 * r7
            int r2 = r5.zzl
            int r1 = r1 / r2
            if (r0 != r3) goto L65
            if (r1 <= r6) goto L65
        L63:
            r0 = r6
            goto L3a
        L65:
            r0 = r1
            goto L3a
        L67:
            int r2 = r5.zzk
            int r4 = r5.zzl
            if (r1 != r3) goto L73
            if (r4 <= r7) goto L73
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L75
        L73:
            r1 = r2
            r7 = r4
        L75:
            if (r0 != r3) goto L65
            if (r1 <= r6) goto L65
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L54
        L7e:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.zzcch r6 = r5.zzn
            if (r6 == 0) goto L88
            r6.zzc(r0, r1)
        L88:
            return
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(android.media.MediaPlayer r9) {
            r8 = this;
            java.lang.String r0 = "AdMediaPlayerView prepared"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            r0 = 2
            r8.zzF(r0)
            com.google.android.gms.internal.ads.zzcck r0 = r8.zze
            r0.zzb()
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzcbf r1 = new com.google.android.gms.internal.ads.zzcbf
            r1.<init>(r8, r9)
            r0.post(r1)
            int r0 = r9.getVideoWidth()
            r8.zzk = r0
            int r9 = r9.getVideoHeight()
            r8.zzl = r9
            int r9 = r8.zzp
            if (r9 == 0) goto L2b
            r8.zzq(r9)
        L2b:
            boolean r9 = r8.zzf
            r0 = 3
            if (r9 != 0) goto L31
            goto L84
        L31:
            boolean r9 = r8.zzH()
            if (r9 == 0) goto L84
            android.media.MediaPlayer r9 = r8.zzi
            int r9 = r9.getCurrentPosition()
            if (r9 <= 0) goto L84
            int r9 = r8.zzh
            if (r9 == r0) goto L84
            java.lang.String r9 = "AdMediaPlayerView nudging MediaPlayer"
            com.google.android.gms.ads.internal.util.zze.zza(r9)
            r9 = 0
            r8.zzG(r9)
            android.media.MediaPlayer r9 = r8.zzi
            r9.start()
            android.media.MediaPlayer r9 = r8.zzi
            int r9 = r9.getCurrentPosition()
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzu.zzB()
            long r1 = r1.currentTimeMillis()
        L5f:
            boolean r3 = r8.zzH()
            if (r3 == 0) goto L7c
            android.media.MediaPlayer r3 = r8.zzi
            int r3 = r3.getCurrentPosition()
            if (r3 != r9) goto L7c
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzu.zzB()
            long r3 = r3.currentTimeMillis()
            long r3 = r3 - r1
            r5 = 250(0xfa, double:1.235E-321)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L5f
        L7c:
            android.media.MediaPlayer r9 = r8.zzi
            r9.pause()
            r8.zzn()
        L84:
            int r9 = r8.zzk
            int r1 = r8.zzl
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "AdMediaPlayerView stream dimensions: "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r9 = " x "
            r2.append(r9)
            r2.append(r1)
            java.lang.String r9 = r2.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r9)
            int r9 = r8.zzh
            if (r9 != r0) goto Lab
            r8.zzp()
        Lab:
            r8.zzn()
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r1, int r2, int r3) {
            r0 = this;
            java.lang.String r1 = "AdMediaPlayerView surface created"
            com.google.android.gms.ads.internal.util.zze.zza(r1)
            r0.zzD()
            com.google.android.gms.internal.ads.zzfun r1 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzcbi r2 = new com.google.android.gms.internal.ads.zzcbi
            r2.<init>(r0)
            r1.post(r2)
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture r2) {
            r1 = this;
            java.lang.String r2 = "AdMediaPlayerView surface destroyed"
            com.google.android.gms.ads.internal.util.zze.zza(r2)
            android.media.MediaPlayer r2 = r1.zzi
            if (r2 == 0) goto L13
            int r0 = r1.zzp
            if (r0 != 0) goto L13
            int r2 = r2.getCurrentPosition()
            r1.zzp = r2
        L13:
            com.google.android.gms.internal.ads.zzcch r2 = r1.zzn
            if (r2 == 0) goto L1a
            r2.zze()
        L1a:
            com.google.android.gms.internal.ads.zzfun r2 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzcbk r0 = new com.google.android.gms.internal.ads.zzcbk
            r0.<init>(r1)
            r2.post(r0)
            r2 = 1
            r1.zzE(r2)
            return r2
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture r3, int r4, int r5) {
            r2 = this;
            java.lang.String r3 = "AdMediaPlayerView surface changed"
            com.google.android.gms.ads.internal.util.zze.zza(r3)
            int r3 = r2.zzh
            int r0 = r2.zzk
            r1 = 0
            if (r0 != r4) goto L11
            int r0 = r2.zzl
            if (r0 != r5) goto L11
            r1 = 1
        L11:
            android.media.MediaPlayer r0 = r2.zzi
            if (r0 == 0) goto L24
            r0 = 3
            if (r3 != r0) goto L24
            if (r1 == 0) goto L24
            int r3 = r2.zzp
            if (r3 == 0) goto L21
            r2.zzq(r3)
        L21:
            r2.zzp()
        L24:
            com.google.android.gms.internal.ads.zzcch r3 = r2.zzn
            if (r3 == 0) goto L2b
            r3.zzc(r4, r5)
        L2b:
            com.google.android.gms.internal.ads.zzfun r3 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzcbj r0 = new com.google.android.gms.internal.ads.zzcbj
            r0.<init>(r2, r4, r5)
            r3.post(r0)
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzcck r0 = r2.zze
            r0.zzf(r2)
            com.google.android.gms.internal.ads.zzcbo r0 = r2.zzq
            com.google.android.gms.internal.ads.zzccd r1 = r2.zza
            r1.zza(r3, r0)
            return
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(android.media.MediaPlayer r3, int r4, int r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AdMediaPlayerView size changed: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " x "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r4)
            int r4 = r3.getVideoWidth()
            r2.zzk = r4
            int r3 = r3.getVideoHeight()
            r2.zzl = r3
            int r4 = r2.zzk
            if (r4 == 0) goto L31
            if (r3 == 0) goto L31
            r2.requestLayout()
        L31:
            return
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AdMediaPlayerView window visibility changed to "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzcbe r1 = new com.google.android.gms.internal.ads.zzcbe
            r1.<init>(r2, r3)
            r0.post(r1)
            super.onWindowVisibilityChanged(r3)
            return
    }

    @Override // android.view.View
    public final java.lang.String toString() {
            r3 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzcbn> r0 = com.google.android.gms.internal.ads.zzcbn.class
            java.lang.String r0 = r0.getName()
            int r1 = r3.hashCode()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "@"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zza() {
            r1 = this;
            boolean r0 = r1.zzH()
            if (r0 == 0) goto Ld
            android.media.MediaPlayer r0 = r1.zzi
            int r0 = r0.getCurrentPosition()
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zzb() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L19
            boolean r0 = r2.zzH()
            if (r0 == 0) goto L19
            android.media.MediaPlayer r0 = r2.zzi
            android.os.PersistableBundle r0 = r0.getMetrics()
            java.lang.String r1 = "android.media.mediaplayer.dropped"
            int r0 = r0.getInt(r1)
            return r0
        L19:
            r0 = -1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zzc() {
            r1 = this;
            boolean r0 = r1.zzH()
            if (r0 == 0) goto Ld
            android.media.MediaPlayer r0 = r1.zzi
            int r0 = r0.getDuration()
            return r0
        Ld:
            r0 = -1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zzd() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.zzi
            if (r0 == 0) goto L9
            int r0 = r0.getVideoHeight()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zze() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.zzi
            if (r0 == 0) goto L9
            int r0 = r0.getVideoWidth()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final long zzf() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final long zzg() {
            r4 = this;
            java.lang.Integer r0 = r4.zzs
            if (r0 == 0) goto L11
            long r0 = r4.zzh()
            int r2 = r4.zzm
            long r2 = (long) r2
            long r0 = r0 * r2
            r2 = 100
            long r0 = r0 / r2
            return r0
        L11:
            r0 = -1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final long zzh() {
            r4 = this;
            java.lang.Integer r0 = r4.zzs
            if (r0 == 0) goto L13
            int r0 = r4.zzc()
            long r0 = (long) r0
            java.lang.Integer r2 = r4.zzs
            int r2 = r2.intValue()
            long r2 = (long) r2
            long r0 = r0 * r2
            return r0
        L13:
            r0 = -1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final java.lang.String zzj() {
            r2 = this;
            boolean r0 = r2.zzo
            r1 = 1
            if (r1 == r0) goto L8
            java.lang.String r0 = ""
            goto La
        L8:
            java.lang.String r0 = " spherical"
        La:
            java.lang.String r1 = "MediaPlayer"
            java.lang.String r0 = r1.concat(r0)
            return r0
    }

    final /* synthetic */ void zzm(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbo r0 = r1.zzq
            if (r0 == 0) goto L7
            r0.onWindowVisibilityChanged(r2)
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp, com.google.android.gms.internal.ads.zzccm
    public final void zzn() {
            r1 = this;
            com.google.android.gms.internal.ads.zzccn r0 = r1.zzb
            float r0 = r0.zza()
            r1.zzG(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzo() {
            r3 = this;
            java.lang.String r0 = "AdMediaPlayerView pause"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            boolean r0 = r3.zzH()
            r1 = 4
            if (r0 == 0) goto L26
            android.media.MediaPlayer r0 = r3.zzi
            boolean r0 = r0.isPlaying()
            if (r0 == 0) goto L26
            android.media.MediaPlayer r0 = r3.zzi
            r0.pause()
            r3.zzF(r1)
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzcbm r2 = new com.google.android.gms.internal.ads.zzcbm
            r2.<init>(r3)
            r0.post(r2)
        L26:
            r3.zzh = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzp() {
            r3 = this;
            java.lang.String r0 = "AdMediaPlayerView play"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            boolean r0 = r3.zzH()
            r1 = 3
            if (r0 == 0) goto L23
            android.media.MediaPlayer r0 = r3.zzi
            r0.start()
            r3.zzF(r1)
            com.google.android.gms.internal.ads.zzccd r0 = r3.zza
            r0.zzb()
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzcbl r2 = new com.google.android.gms.internal.ads.zzcbl
            r2.<init>(r3)
            r0.post(r2)
        L23:
            r3.zzh = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzq(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AdMediaPlayerView seek "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            boolean r0 = r2.zzH()
            if (r0 == 0) goto L23
            android.media.MediaPlayer r0 = r2.zzi
            r0.seekTo(r3)
            r3 = 0
            r2.zzp = r3
            return
        L23:
            r2.zzp = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzr(com.google.android.gms.internal.ads.zzcbo r1) {
            r0 = this;
            r0.zzq = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzs(java.lang.String r3) {
            r2 = this;
            android.net.Uri r3 = android.net.Uri.parse(r3)
            com.google.android.gms.internal.ads.zzbbg r0 = com.google.android.gms.internal.ads.zzbbg.zza(r3)
            if (r0 == 0) goto L10
            java.lang.String r1 = r0.zza
            if (r1 == 0) goto Lf
            goto L10
        Lf:
            return
        L10:
            if (r0 == 0) goto L18
            java.lang.String r3 = r0.zza
            android.net.Uri r3 = android.net.Uri.parse(r3)
        L18:
            r2.zzj = r3
            r3 = 0
            r2.zzp = r3
            r2.zzD()
            r2.requestLayout()
            r2.invalidate()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzt() {
            r1 = this;
            java.lang.String r0 = "AdMediaPlayerView stop"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            android.media.MediaPlayer r0 = r1.zzi
            if (r0 == 0) goto L1a
            r0.stop()
            android.media.MediaPlayer r0 = r1.zzi
            r0.release()
            r0 = 0
            r1.zzi = r0
            r0 = 0
            r1.zzF(r0)
            r1.zzh = r0
        L1a:
            com.google.android.gms.internal.ads.zzcck r0 = r1.zze
            r0.zzd()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzu(float r2, float r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcch r0 = r1.zzn
            if (r0 == 0) goto L7
            r0.zzf(r2, r3)
        L7:
            return
    }
}
