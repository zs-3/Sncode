package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public interface LifecycleFragment {
    @com.google.android.gms.common.annotation.KeepForSdk
    void addCallback(java.lang.String r1, com.google.android.gms.common.api.internal.LifecycleCallback r2);

    @com.google.android.gms.common.annotation.KeepForSdk
    <T extends com.google.android.gms.common.api.internal.LifecycleCallback> T getCallbackOrNull(java.lang.String r1, java.lang.Class<T> r2);

    @com.google.android.gms.common.annotation.KeepForSdk
    android.app.Activity getLifecycleActivity();

    @com.google.android.gms.common.annotation.KeepForSdk
    boolean isCreated();

    @com.google.android.gms.common.annotation.KeepForSdk
    boolean isStarted();

    @com.google.android.gms.common.annotation.KeepForSdk
    void startActivityForResult(android.content.Intent r1, int r2);
}
