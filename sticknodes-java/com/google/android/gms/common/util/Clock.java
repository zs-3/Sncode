package com.google.android.gms.common.util;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public interface Clock {

    /* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    /* renamed from: com.google.android.gms.common.util.Clock$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        @com.google.android.gms.common.annotation.KeepForSdk
        public static long $default$currentThreadTimeMillis(com.google.android.gms.common.util.Clock r2) {
                long r0 = android.os.SystemClock.currentThreadTimeMillis()
                return r0
        }
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    long currentThreadTimeMillis();

    @com.google.android.gms.common.annotation.KeepForSdk
    long currentTimeMillis();

    @com.google.android.gms.common.annotation.KeepForSdk
    long elapsedRealtime();

    @com.google.android.gms.common.annotation.KeepForSdk
    long nanoTime();
}
