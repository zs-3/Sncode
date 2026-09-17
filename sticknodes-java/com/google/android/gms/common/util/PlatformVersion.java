package com.google.android.gms.common.util;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public final class PlatformVersion {
    private PlatformVersion() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static boolean isAtLeastHoneycomb() {
            r0 = 1
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastHoneycombMR1() {
            r0 = 1
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastIceCreamSandwich() {
            r0 = 1
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastIceCreamSandwichMR1() {
            r0 = 1
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastJellyBean() {
            r0 = 1
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastJellyBeanMR1() {
            r0 = 1
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastJellyBeanMR2() {
            r0 = 1
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastKitKat() {
            r0 = 1
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastKitKatWatch() {
            r0 = 1
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastLollipop() {
            r0 = 1
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastLollipopMR1() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 22
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastM() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastN() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastO() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastP() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastQ() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastR() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastS() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastSv2() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 32
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastT() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastU() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isAtLeastV() {
            boolean r0 = isAtLeastU()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastV()
            return r0
    }
}
