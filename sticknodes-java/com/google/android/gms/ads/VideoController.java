package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class VideoController {

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int PLAYBACK_STATE_ENDED = 3;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int PLAYBACK_STATE_PAUSED = 2;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int PLAYBACK_STATE_PLAYING = 1;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int PLAYBACK_STATE_READY = 5;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final java.lang.Object zza;
    private com.google.android.gms.ads.internal.client.zzeb zzb;
    private com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks zzc;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public static abstract class VideoLifecycleCallbacks {
        public VideoLifecycleCallbacks() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onVideoEnd() {
                r0 = this;
                return
        }

        public void onVideoMute(boolean r1) {
                r0 = this;
                return
        }

        public void onVideoPause() {
                r0 = this;
                return
        }

        public void onVideoPlay() {
                r0 = this;
                return
        }

        public void onVideoStart() {
                r0 = this;
                return
        }
    }

    public VideoController() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zza = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int getPlaybackState() {
            r4 = this;
            java.lang.Object r0 = r4.zza
            monitor-enter(r0)
            com.google.android.gms.ads.internal.client.zzeb r1 = r4.zzb     // Catch: java.lang.Throwable -> L18
            r2 = 0
            if (r1 != 0) goto La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r2
        La:
            int r1 = r1.zzh()     // Catch: android.os.RemoteException -> L10 java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r1
        L10:
            r1 = move-exception
            java.lang.String r3 = "Unable to call getPlaybackState on video controller."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r3, r1)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r2
        L18:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }

    public com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks r1 = r2.zzc     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public boolean hasVideoContent() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            com.google.android.gms.ads.internal.client.zzeb r1 = r2.zzb     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    public boolean isClickToExpandEnabled() {
            r4 = this;
            java.lang.Object r0 = r4.zza
            monitor-enter(r0)
            com.google.android.gms.ads.internal.client.zzeb r1 = r4.zzb     // Catch: java.lang.Throwable -> L18
            r2 = 0
            if (r1 != 0) goto La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r2
        La:
            boolean r1 = r1.zzo()     // Catch: android.os.RemoteException -> L10 java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r1
        L10:
            r1 = move-exception
            java.lang.String r3 = "Unable to call isClickToExpandEnabled."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r3, r1)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r2
        L18:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }

    public boolean isCustomControlsEnabled() {
            r4 = this;
            java.lang.Object r0 = r4.zza
            monitor-enter(r0)
            com.google.android.gms.ads.internal.client.zzeb r1 = r4.zzb     // Catch: java.lang.Throwable -> L18
            r2 = 0
            if (r1 != 0) goto La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r2
        La:
            boolean r1 = r1.zzp()     // Catch: android.os.RemoteException -> L10 java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r1
        L10:
            r1 = move-exception
            java.lang.String r3 = "Unable to call isUsingCustomPlayerControls."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r3, r1)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r2
        L18:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }

    public boolean isMuted() {
            r4 = this;
            java.lang.Object r0 = r4.zza
            monitor-enter(r0)
            com.google.android.gms.ads.internal.client.zzeb r1 = r4.zzb     // Catch: java.lang.Throwable -> L18
            r2 = 1
            if (r1 != 0) goto La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r2
        La:
            boolean r1 = r1.zzq()     // Catch: android.os.RemoteException -> L10 java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r1
        L10:
            r1 = move-exception
            java.lang.String r3 = "Unable to call isMuted on video controller."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r3, r1)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r2
        L18:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }

    public void mute(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            com.google.android.gms.ads.internal.client.zzeb r1 = r2.zzb     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L9:
            r1.zzj(r3)     // Catch: android.os.RemoteException -> Ld java.lang.Throwable -> L15
            goto L13
        Ld:
            r3 = move-exception
            java.lang.String r1 = "Unable to call mute on video controller."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r3)     // Catch: java.lang.Throwable -> L15
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r3
    }

    public void pause() {
            r3 = this;
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            com.google.android.gms.ads.internal.client.zzeb r1 = r3.zzb     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L9:
            r1.zzk()     // Catch: android.os.RemoteException -> Ld java.lang.Throwable -> L15
            goto L13
        Ld:
            r1 = move-exception
            java.lang.String r2 = "Unable to call pause on video controller."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r1)     // Catch: java.lang.Throwable -> L15
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r1
    }

    public void play() {
            r3 = this;
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            com.google.android.gms.ads.internal.client.zzeb r1 = r3.zzb     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L9:
            r1.zzl()     // Catch: android.os.RemoteException -> Ld java.lang.Throwable -> L15
            goto L13
        Ld:
            r1 = move-exception
            java.lang.String r2 = "Unable to call play on video controller."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r1)     // Catch: java.lang.Throwable -> L15
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r1
    }

    public void setVideoLifecycleCallbacks(com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks r4) {
            r3 = this;
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            r3.zzc = r4     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.ads.internal.client.zzeb r1 = r3.zzb     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        Lb:
            if (r4 != 0) goto Lf
            r4 = 0
            goto L15
        Lf:
            com.google.android.gms.ads.internal.client.zzga r2 = new com.google.android.gms.ads.internal.client.zzga     // Catch: android.os.RemoteException -> L19 java.lang.Throwable -> L21
            r2.<init>(r4)     // Catch: android.os.RemoteException -> L19 java.lang.Throwable -> L21
            r4 = r2
        L15:
            r1.zzm(r4)     // Catch: android.os.RemoteException -> L19 java.lang.Throwable -> L21
            goto L1f
        L19:
            r4 = move-exception
            java.lang.String r1 = "Unable to call setVideoLifecycleCallbacks on video controller."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r4)     // Catch: java.lang.Throwable -> L21
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r4
    }

    public void stop() {
            r3 = this;
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            com.google.android.gms.ads.internal.client.zzeb r1 = r3.zzb     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L9:
            r1.zzn()     // Catch: android.os.RemoteException -> Ld java.lang.Throwable -> L15
            goto L13
        Ld:
            r1 = move-exception
            java.lang.String r2 = "Unable to call stop on video controller."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r1)     // Catch: java.lang.Throwable -> L15
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r1
    }

    public final com.google.android.gms.ads.internal.client.zzeb zza() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            com.google.android.gms.ads.internal.client.zzeb r1 = r2.zzb     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public final void zzb(com.google.android.gms.ads.internal.client.zzeb r2) {
            r1 = this;
            java.lang.Object r0 = r1.zza
            monitor-enter(r0)
            r1.zzb = r2     // Catch: java.lang.Throwable -> Le
            com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks r2 = r1.zzc     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto Lc
            r1.setVideoLifecycleCallbacks(r2)     // Catch: java.lang.Throwable -> Le
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r2
    }
}
