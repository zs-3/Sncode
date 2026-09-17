package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public class AndroidApplicationConfiguration {
    public int a;
    public int b;
    public int depth;
    public boolean disableAudio;
    public int g;
    public boolean getTouchEventsForLiveWallpaper;
    public int maxNetThreads;
    public int maxSimultaneousSounds;
    public com.badlogic.gdx.backends.android.GdxNativeLoader nativeLoader;
    public int numSamples;
    public int r;
    public com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy resolutionStrategy;
    public int sensorDelay;
    public int stencil;
    public int touchSleepTime;
    public boolean useAccelerometer;
    public boolean useCompass;
    public boolean useGL30;
    public boolean useGyroscope;
    public boolean useImmersiveMode;
    public boolean useRotationVectorSensor;
    public boolean useWakelock;


    public AndroidApplicationConfiguration() {
            r3 = this;
            r3.<init>()
            r0 = 8
            r3.r = r0
            r3.g = r0
            r3.b = r0
            r0 = 0
            r3.a = r0
            r1 = 16
            r3.depth = r1
            r3.stencil = r0
            r3.numSamples = r0
            r2 = 1
            r3.useAccelerometer = r2
            r3.useGyroscope = r0
            r3.useCompass = r2
            r3.useRotationVectorSensor = r0
            r3.sensorDelay = r2
            r3.touchSleepTime = r0
            r3.useWakelock = r0
            r3.disableAudio = r0
            r3.maxSimultaneousSounds = r1
            com.badlogic.gdx.backends.android.surfaceview.FillResolutionStrategy r1 = new com.badlogic.gdx.backends.android.surfaceview.FillResolutionStrategy
            r1.<init>()
            r3.resolutionStrategy = r1
            r3.getTouchEventsForLiveWallpaper = r0
            r3.useImmersiveMode = r2
            r3.useGL30 = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r3.maxNetThreads = r0
            com.badlogic.gdx.backends.android.AndroidApplicationConfiguration$1 r0 = new com.badlogic.gdx.backends.android.AndroidApplicationConfiguration$1
            r0.<init>(r3)
            r3.nativeLoader = r0
            return
    }
}
