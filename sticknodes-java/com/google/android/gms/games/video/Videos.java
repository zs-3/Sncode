package com.google.android.gms.games.video;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.gms.internal.games.zzfp
@java.lang.Deprecated
/* loaded from: classes.dex */
public interface Videos {

    @com.google.android.gms.internal.games.zzfp
    public static final int CAPTURE_OVERLAY_STATE_CAPTURE_STARTED = 2;

    @com.google.android.gms.internal.games.zzfp
    public static final int CAPTURE_OVERLAY_STATE_CAPTURE_STOPPED = 3;

    @com.google.android.gms.internal.games.zzfp
    public static final int CAPTURE_OVERLAY_STATE_DISMISSED = 4;

    @com.google.android.gms.internal.games.zzfp
    public static final int CAPTURE_OVERLAY_STATE_SHOWN = 1;

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public interface CaptureAvailableResult extends com.google.android.gms.common.api.Result {
        @com.google.android.gms.internal.games.zzfp
        boolean isAvailable();
    }

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public interface CaptureCapabilitiesResult extends com.google.android.gms.common.api.Result {
        @com.google.android.gms.internal.games.zzfp
        com.google.android.gms.games.video.VideoCapabilities getCapabilities();
    }

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public interface CaptureOverlayStateListener {
        @com.google.android.gms.internal.games.zzfp
        void onCaptureOverlayStateChanged(int r1);
    }

    /* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
    @com.google.android.gms.internal.games.zzfp
    @java.lang.Deprecated
    public interface CaptureStateResult extends com.google.android.gms.common.api.Result {
        @com.google.android.gms.internal.games.zzfp
        com.google.android.gms.games.video.CaptureState getCaptureState();
    }

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.video.Videos.CaptureCapabilitiesResult> getCaptureCapabilities(com.google.android.gms.common.api.GoogleApiClient r1);

    @com.google.android.gms.internal.games.zzfp
    android.content.Intent getCaptureOverlayIntent(com.google.android.gms.common.api.GoogleApiClient r1);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.video.Videos.CaptureStateResult> getCaptureState(com.google.android.gms.common.api.GoogleApiClient r1);

    @com.google.android.gms.internal.games.zzfp
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.games.video.Videos.CaptureAvailableResult> isCaptureAvailable(com.google.android.gms.common.api.GoogleApiClient r1, int r2);

    @com.google.android.gms.internal.games.zzfp
    boolean isCaptureSupported(com.google.android.gms.common.api.GoogleApiClient r1);

    @com.google.android.gms.internal.games.zzfp
    void registerCaptureOverlayStateChangedListener(com.google.android.gms.common.api.GoogleApiClient r1, com.google.android.gms.games.video.Videos.CaptureOverlayStateListener r2);

    @com.google.android.gms.internal.games.zzfp
    void unregisterCaptureOverlayStateChangedListener(com.google.android.gms.common.api.GoogleApiClient r1);
}
