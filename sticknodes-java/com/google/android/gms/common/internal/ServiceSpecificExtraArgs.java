package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public final class ServiceSpecificExtraArgs {

    /* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface CastExtraArgs {

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final java.lang.String LISTENER = "listener";
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface GamesExtraArgs {

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final java.lang.String DESIRED_LOCALE = "com.google.android.gms.games.key.desiredLocale";

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final java.lang.String GAME_PACKAGE_NAME = "com.google.android.gms.games.key.gamePackageName";

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final java.lang.String SIGNIN_OPTIONS = "com.google.android.gms.games.key.signInOptions";

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final java.lang.String WINDOW_TOKEN = "com.google.android.gms.games.key.popupWindowToken";
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface PlusExtraArgs {

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final java.lang.String PLUS_AUTH_PACKAGE = "auth_package";
    }

    private ServiceSpecificExtraArgs() {
            r0 = this;
            r0.<init>()
            return
    }
}
