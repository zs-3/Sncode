package com.google.android.gms.auth.api.signin;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public interface GoogleSignInOptionsExtension {

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int FITNESS = 3;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int GAMES = 1;

    @com.google.android.gms.common.annotation.KeepForSdk
    int getExtensionType();

    @com.google.android.gms.common.annotation.KeepForSdk
    java.util.List<com.google.android.gms.common.api.Scope> getImpliedScopes();

    @com.google.android.gms.common.annotation.KeepForSdk
    android.os.Bundle toBundle();
}
