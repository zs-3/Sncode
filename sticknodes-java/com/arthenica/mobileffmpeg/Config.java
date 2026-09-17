package com.arthenica.mobileffmpeg;

/* loaded from: classes.dex */
public class Config {
    private static com.arthenica.mobileffmpeg.Level activeLogLevel;
    private static final java.util.List<com.arthenica.mobileffmpeg.FFmpegExecution> executions = null;
    private static int lastCreatedPipeIndex;
    private static com.arthenica.mobileffmpeg.Statistics lastReceivedStatistics;
    private static int lastReturnCode;
    private static com.arthenica.mobileffmpeg.LogCallback logCallbackFunction;
    private static com.arthenica.mobileffmpeg.StatisticsCallback statisticsCallbackFunction;

    /* renamed from: com.arthenica.mobileffmpeg.Config$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$arthenica$mobileffmpeg$Level = null;

        static {
                com.arthenica.mobileffmpeg.Level[] r0 = com.arthenica.mobileffmpeg.Level.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.arthenica.mobileffmpeg.Config.AnonymousClass1.$SwitchMap$com$arthenica$mobileffmpeg$Level = r0
                com.arthenica.mobileffmpeg.Level r1 = com.arthenica.mobileffmpeg.Level.AV_LOG_QUIET     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.arthenica.mobileffmpeg.Config.AnonymousClass1.$SwitchMap$com$arthenica$mobileffmpeg$Level     // Catch: java.lang.NoSuchFieldError -> L1d
                com.arthenica.mobileffmpeg.Level r1 = com.arthenica.mobileffmpeg.Level.AV_LOG_TRACE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.arthenica.mobileffmpeg.Config.AnonymousClass1.$SwitchMap$com$arthenica$mobileffmpeg$Level     // Catch: java.lang.NoSuchFieldError -> L28
                com.arthenica.mobileffmpeg.Level r1 = com.arthenica.mobileffmpeg.Level.AV_LOG_DEBUG     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.arthenica.mobileffmpeg.Config.AnonymousClass1.$SwitchMap$com$arthenica$mobileffmpeg$Level     // Catch: java.lang.NoSuchFieldError -> L33
                com.arthenica.mobileffmpeg.Level r1 = com.arthenica.mobileffmpeg.Level.AV_LOG_STDERR     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.arthenica.mobileffmpeg.Config.AnonymousClass1.$SwitchMap$com$arthenica$mobileffmpeg$Level     // Catch: java.lang.NoSuchFieldError -> L3e
                com.arthenica.mobileffmpeg.Level r1 = com.arthenica.mobileffmpeg.Level.AV_LOG_VERBOSE     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.arthenica.mobileffmpeg.Config.AnonymousClass1.$SwitchMap$com$arthenica$mobileffmpeg$Level     // Catch: java.lang.NoSuchFieldError -> L49
                com.arthenica.mobileffmpeg.Level r1 = com.arthenica.mobileffmpeg.Level.AV_LOG_INFO     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.arthenica.mobileffmpeg.Config.AnonymousClass1.$SwitchMap$com$arthenica$mobileffmpeg$Level     // Catch: java.lang.NoSuchFieldError -> L54
                com.arthenica.mobileffmpeg.Level r1 = com.arthenica.mobileffmpeg.Level.AV_LOG_WARNING     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = com.arthenica.mobileffmpeg.Config.AnonymousClass1.$SwitchMap$com$arthenica$mobileffmpeg$Level     // Catch: java.lang.NoSuchFieldError -> L60
                com.arthenica.mobileffmpeg.Level r1 = com.arthenica.mobileffmpeg.Level.AV_LOG_ERROR     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = com.arthenica.mobileffmpeg.Config.AnonymousClass1.$SwitchMap$com$arthenica$mobileffmpeg$Level     // Catch: java.lang.NoSuchFieldError -> L6c
                com.arthenica.mobileffmpeg.Level r1 = com.arthenica.mobileffmpeg.Level.AV_LOG_FATAL     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = com.arthenica.mobileffmpeg.Config.AnonymousClass1.$SwitchMap$com$arthenica$mobileffmpeg$Level     // Catch: java.lang.NoSuchFieldError -> L78
                com.arthenica.mobileffmpeg.Level r1 = com.arthenica.mobileffmpeg.Level.AV_LOG_PANIC     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                return
        }
    }

    static {
            java.lang.String r0 = "mobile-ffmpeg"
            java.lang.String r1 = "Loading mobile-ffmpeg."
            android.util.Log.i(r0, r1)
            java.lang.String r1 = com.arthenica.mobileffmpeg.AbiDetect.getNativeAbi()
            java.lang.String r2 = "arm-v7a"
            boolean r1 = r2.equals(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2a
            java.lang.String r1 = "mobileffmpeg_armv7a_neon"
            java.lang.System.loadLibrary(r1)     // Catch: java.lang.UnsatisfiedLinkError -> L22
            com.arthenica.mobileffmpeg.AbiDetect.setArmV7aNeonLoaded(r2)     // Catch: java.lang.UnsatisfiedLinkError -> L1f
            r4 = 1
            goto L2b
        L1f:
            r1 = move-exception
            r4 = 1
            goto L24
        L22:
            r1 = move-exception
            r4 = 0
        L24:
            java.lang.String r5 = "NEON supported armeabi-v7a mobileffmpeg library not found. Loading default armeabi-v7a library."
            android.util.Log.i(r0, r5, r1)
            goto L2b
        L2a:
            r4 = 0
        L2b:
            if (r4 != 0) goto L32
            java.lang.String r1 = "mobileffmpeg"
            java.lang.System.loadLibrary(r1)
        L32:
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = getPackageName()
            r1[r3] = r4
            java.lang.String r4 = com.arthenica.mobileffmpeg.AbiDetect.getAbi()
            r1[r2] = r4
            r2 = 2
            java.lang.String r4 = getVersion()
            r1[r2] = r4
            r2 = 3
            java.lang.String r4 = getBuildDate()
            r1[r2] = r4
            java.lang.String r2 = "Loaded mobile-ffmpeg-%s-%s-%s-%s."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            android.util.Log.i(r0, r1)
            int r0 = getNativeLogLevel()
            com.arthenica.mobileffmpeg.Level r0 = com.arthenica.mobileffmpeg.Level.from(r0)
            com.arthenica.mobileffmpeg.Config.activeLogLevel = r0
            com.arthenica.mobileffmpeg.Statistics r0 = new com.arthenica.mobileffmpeg.Statistics
            r0.<init>()
            com.arthenica.mobileffmpeg.Config.lastReceivedStatistics = r0
            enableRedirection()
            com.arthenica.mobileffmpeg.Config.lastCreatedPipeIndex = r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = java.util.Collections.synchronizedList(r0)
            com.arthenica.mobileffmpeg.Config.executions = r0
            return
    }

    private Config() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native void disableNativeRedirection();

    private static native void enableNativeRedirection();

    public static void enableRedirection() {
            enableNativeRedirection()
            return
    }

    static int ffmpegExecute(long r2, java.lang.String[] r4) {
            com.arthenica.mobileffmpeg.FFmpegExecution r0 = new com.arthenica.mobileffmpeg.FFmpegExecution
            r0.<init>(r2, r4)
            java.util.List<com.arthenica.mobileffmpeg.FFmpegExecution> r1 = com.arthenica.mobileffmpeg.Config.executions
            r1.add(r0)
            int r2 = nativeFFmpegExecute(r2, r4)     // Catch: java.lang.Throwable -> L15
            setLastReturnCode(r2)     // Catch: java.lang.Throwable -> L15
            r1.remove(r0)
            return r2
        L15:
            r2 = move-exception
            java.util.List<com.arthenica.mobileffmpeg.FFmpegExecution> r3 = com.arthenica.mobileffmpeg.Config.executions
            r3.remove(r0)
            throw r2
    }

    public static java.lang.String getBuildDate() {
            java.lang.String r0 = getNativeBuildDate()
            return r0
    }

    public static java.lang.String getLastCommandOutput() {
            java.lang.String r0 = getNativeLastCommandOutput()
            if (r0 == 0) goto Le
            r1 = 13
            r2 = 10
            java.lang.String r0 = r0.replace(r1, r2)
        Le:
            return r0
    }

    private static native java.lang.String getNativeBuildDate();

    private static native java.lang.String getNativeFFmpegVersion();

    private static native java.lang.String getNativeLastCommandOutput();

    private static native int getNativeLogLevel();

    private static native java.lang.String getNativeVersion();

    public static java.lang.String getPackageName() {
            java.lang.String r0 = com.arthenica.mobileffmpeg.Packages.getPackageName()
            return r0
    }

    public static java.lang.String getVersion() {
            boolean r0 = isLTSBuild()
            if (r0 == 0) goto L17
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r2 = getNativeVersion()
            r0[r1] = r2
            java.lang.String r1 = "%s-lts"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
        L17:
            java.lang.String r0 = getNativeVersion()
            return r0
    }

    private static native void ignoreNativeSignal(int r0);

    public static boolean isLTSBuild() {
            boolean r0 = com.arthenica.mobileffmpeg.AbiDetect.isNativeLTSBuild()
            return r0
    }

    private static void log(long r3, int r5, byte[] r6) {
            com.arthenica.mobileffmpeg.Level r0 = com.arthenica.mobileffmpeg.Level.from(r5)
            java.lang.String r1 = new java.lang.String
            r1.<init>(r6)
            com.arthenica.mobileffmpeg.Level r6 = com.arthenica.mobileffmpeg.Config.activeLogLevel
            com.arthenica.mobileffmpeg.Level r2 = com.arthenica.mobileffmpeg.Level.AV_LOG_QUIET
            if (r6 != r2) goto L17
            com.arthenica.mobileffmpeg.Level r6 = com.arthenica.mobileffmpeg.Level.AV_LOG_STDERR
            int r6 = r6.getValue()
            if (r5 != r6) goto L1f
        L17:
            com.arthenica.mobileffmpeg.Level r6 = com.arthenica.mobileffmpeg.Config.activeLogLevel
            int r6 = r6.getValue()
            if (r5 <= r6) goto L20
        L1f:
            return
        L20:
            com.arthenica.mobileffmpeg.LogCallback r5 = com.arthenica.mobileffmpeg.Config.logCallbackFunction
            java.lang.String r6 = "mobile-ffmpeg"
            if (r5 == 0) goto L36
            com.arthenica.mobileffmpeg.LogMessage r2 = new com.arthenica.mobileffmpeg.LogMessage     // Catch: java.lang.Exception -> L2f
            r2.<init>(r3, r0, r1)     // Catch: java.lang.Exception -> L2f
            r5.apply(r2)     // Catch: java.lang.Exception -> L2f
            goto L58
        L2f:
            r3 = move-exception
            java.lang.String r4 = "Exception thrown inside LogCallback block"
            android.util.Log.e(r6, r4, r3)
            goto L58
        L36:
            int[] r3 = com.arthenica.mobileffmpeg.Config.AnonymousClass1.$SwitchMap$com$arthenica$mobileffmpeg$Level
            int r4 = r0.ordinal()
            r3 = r3[r4]
            switch(r3) {
                case 1: goto L58;
                case 2: goto L55;
                case 3: goto L55;
                case 4: goto L51;
                case 5: goto L51;
                case 6: goto L4d;
                case 7: goto L49;
                case 8: goto L45;
                case 9: goto L45;
                case 10: goto L45;
                default: goto L41;
            }
        L41:
            android.util.Log.v(r6, r1)
            goto L58
        L45:
            android.util.Log.e(r6, r1)
            goto L58
        L49:
            android.util.Log.w(r6, r1)
            goto L58
        L4d:
            android.util.Log.i(r6, r1)
            goto L58
        L51:
            android.util.Log.v(r6, r1)
            goto L58
        L55:
            android.util.Log.d(r6, r1)
        L58:
            return
    }

    static native void nativeFFmpegCancel(long r0);

    private static native int nativeFFmpegExecute(long r0, java.lang.String[] r2);

    static native int nativeFFprobeExecute(java.lang.String[] r0);

    public static void printLastCommandOutput(int r6) {
            java.lang.String r0 = getLastCommandOutput()
        L4:
            int r1 = r0.length()
            java.lang.String r2 = "mobile-ffmpeg"
            r3 = 4000(0xfa0, float:5.605E-42)
            if (r1 > r3) goto L14
            android.util.Log.println(r6, r2, r0)
            java.lang.String r0 = ""
            goto L38
        L14:
            r1 = 0
            java.lang.String r4 = r0.substring(r1, r3)
            r5 = 10
            int r4 = r4.lastIndexOf(r5)
            if (r4 >= 0) goto L2d
            java.lang.String r1 = r0.substring(r1, r3)
            android.util.Log.println(r6, r2, r1)
            java.lang.String r0 = r0.substring(r3)
            goto L38
        L2d:
            java.lang.String r1 = r0.substring(r1, r4)
            android.util.Log.println(r6, r2, r1)
            java.lang.String r0 = r0.substring(r4)
        L38:
            int r1 = r0.length()
            if (r1 > 0) goto L4
            return
    }

    private static native int registerNewNativeFFmpegPipe(java.lang.String r0);

    static void setLastReturnCode(int r0) {
            com.arthenica.mobileffmpeg.Config.lastReturnCode = r0
            return
    }

    private static native int setNativeEnvironmentVariable(java.lang.String r0, java.lang.String r1);

    private static native void setNativeLogLevel(int r0);

    private static void statistics(long r14, int r16, float r17, float r18, long r19, int r21, double r22, double r24) {
            com.arthenica.mobileffmpeg.Statistics r0 = new com.arthenica.mobileffmpeg.Statistics
            r1 = r0
            r2 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r9 = r21
            r10 = r22
            r12 = r24
            r1.<init>(r2, r4, r5, r6, r7, r9, r10, r12)
            com.arthenica.mobileffmpeg.Statistics r1 = com.arthenica.mobileffmpeg.Config.lastReceivedStatistics
            r1.update(r0)
            com.arthenica.mobileffmpeg.StatisticsCallback r0 = com.arthenica.mobileffmpeg.Config.statisticsCallbackFunction
            if (r0 == 0) goto L2c
            com.arthenica.mobileffmpeg.Statistics r1 = com.arthenica.mobileffmpeg.Config.lastReceivedStatistics     // Catch: java.lang.Exception -> L24
            r0.apply(r1)     // Catch: java.lang.Exception -> L24
            goto L2c
        L24:
            r0 = move-exception
            java.lang.String r1 = "mobile-ffmpeg"
            java.lang.String r2 = "Exception thrown inside StatisticsCallback block"
            android.util.Log.e(r1, r2, r0)
        L2c:
            return
    }
}
