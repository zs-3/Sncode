package com.arthenica.mobileffmpeg;

/* loaded from: classes.dex */
public class AbiDetect {
    private static boolean armV7aNeonLoaded;

    static {
            java.lang.String r0 = "mobileffmpeg_abidetect"
            java.lang.System.loadLibrary(r0)
            return
    }

    private AbiDetect() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getAbi() {
            boolean r0 = com.arthenica.mobileffmpeg.AbiDetect.armV7aNeonLoaded
            if (r0 == 0) goto L7
            java.lang.String r0 = "arm-v7a-neon"
            return r0
        L7:
            java.lang.String r0 = getNativeAbi()
            return r0
    }

    public static native java.lang.String getNativeAbi();

    static native java.lang.String getNativeBuildConf();

    public static native java.lang.String getNativeCpuAbi();

    static native boolean isNativeLTSBuild();

    static void setArmV7aNeonLoaded(boolean r0) {
            com.arthenica.mobileffmpeg.AbiDetect.armV7aNeonLoaded = r0
            return
    }
}
