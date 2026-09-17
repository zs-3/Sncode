package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public interface VideosClient {
    public static final int CAPTURE_OVERLAY_STATE_CAPTURE_STARTED = 2;
    public static final int CAPTURE_OVERLAY_STATE_CAPTURE_STOPPED = 3;
    public static final int CAPTURE_OVERLAY_STATE_DISMISSED = 4;
    public static final int CAPTURE_OVERLAY_STATE_SHOWN = 1;

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface CaptureOverlayState {
    }

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    @java.lang.Deprecated
    public interface OnCaptureOverlayStateListener extends com.google.android.gms.games.video.Videos.CaptureOverlayStateListener {
        @Override // com.google.android.gms.games.video.Videos.CaptureOverlayStateListener
        @java.lang.Deprecated
        void onCaptureOverlayStateChanged(int r1);
    }

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<com.google.android.gms.games.video.VideoCapabilities> getCaptureCapabilities();

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<android.content.Intent> getCaptureOverlayIntent();

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<com.google.android.gms.games.video.CaptureState> getCaptureState();

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<java.lang.Boolean> isCaptureAvailable(int r1);

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<java.lang.Boolean> isCaptureSupported();

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<java.lang.Void> registerOnCaptureOverlayStateChangedListener(com.google.android.gms.games.VideosClient.OnCaptureOverlayStateListener r1);

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<java.lang.Boolean> unregisterOnCaptureOverlayStateChangedListener(com.google.android.gms.games.VideosClient.OnCaptureOverlayStateListener r1);
}
