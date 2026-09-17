package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public abstract class ActivityLifecycleObserver {
    public ActivityLifecycleObserver() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.common.api.internal.ActivityLifecycleObserver of(android.app.Activity r1) {
            com.google.android.gms.common.api.internal.zab r0 = new com.google.android.gms.common.api.internal.zab
            com.google.android.gms.common.api.internal.zaa r1 = com.google.android.gms.common.api.internal.zaa.zaa(r1)
            r0.<init>(r1)
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract com.google.android.gms.common.api.internal.ActivityLifecycleObserver onStopCallOnce(java.lang.Runnable r1);
}
