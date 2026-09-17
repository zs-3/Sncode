package com.google.android.gms.dynamic;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public interface LifecycleDelegate {
    @com.google.android.gms.common.annotation.KeepForSdk
    void onCreate(android.os.Bundle r1);

    @com.google.android.gms.common.annotation.KeepForSdk
    android.view.View onCreateView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3);

    @com.google.android.gms.common.annotation.KeepForSdk
    void onDestroy();

    @com.google.android.gms.common.annotation.KeepForSdk
    void onDestroyView();

    @com.google.android.gms.common.annotation.KeepForSdk
    void onInflate(android.app.Activity r1, android.os.Bundle r2, android.os.Bundle r3);

    @com.google.android.gms.common.annotation.KeepForSdk
    void onLowMemory();

    @com.google.android.gms.common.annotation.KeepForSdk
    void onPause();

    @com.google.android.gms.common.annotation.KeepForSdk
    void onResume();

    @com.google.android.gms.common.annotation.KeepForSdk
    void onSaveInstanceState(android.os.Bundle r1);

    @com.google.android.gms.common.annotation.KeepForSdk
    void onStart();

    @com.google.android.gms.common.annotation.KeepForSdk
    void onStop();
}
