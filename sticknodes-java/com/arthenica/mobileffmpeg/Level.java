package com.arthenica.mobileffmpeg;

/* loaded from: classes.dex */
public enum Level extends java.lang.Enum<com.arthenica.mobileffmpeg.Level> {
    private static final /* synthetic */ com.arthenica.mobileffmpeg.Level[] $VALUES = null;
    public static final com.arthenica.mobileffmpeg.Level AV_LOG_DEBUG = null;
    public static final com.arthenica.mobileffmpeg.Level AV_LOG_ERROR = null;
    public static final com.arthenica.mobileffmpeg.Level AV_LOG_FATAL = null;
    public static final com.arthenica.mobileffmpeg.Level AV_LOG_INFO = null;
    public static final com.arthenica.mobileffmpeg.Level AV_LOG_PANIC = null;
    public static final com.arthenica.mobileffmpeg.Level AV_LOG_QUIET = null;
    public static final com.arthenica.mobileffmpeg.Level AV_LOG_STDERR = null;
    public static final com.arthenica.mobileffmpeg.Level AV_LOG_TRACE = null;
    public static final com.arthenica.mobileffmpeg.Level AV_LOG_VERBOSE = null;
    public static final com.arthenica.mobileffmpeg.Level AV_LOG_WARNING = null;
    private int value;

    static {
            com.arthenica.mobileffmpeg.Level r0 = new com.arthenica.mobileffmpeg.Level
            java.lang.String r1 = "AV_LOG_STDERR"
            r2 = 0
            r3 = -16
            r0.<init>(r1, r2, r3)
            com.arthenica.mobileffmpeg.Level.AV_LOG_STDERR = r0
            com.arthenica.mobileffmpeg.Level r1 = new com.arthenica.mobileffmpeg.Level
            java.lang.String r3 = "AV_LOG_QUIET"
            r4 = 1
            r5 = -8
            r1.<init>(r3, r4, r5)
            com.arthenica.mobileffmpeg.Level.AV_LOG_QUIET = r1
            com.arthenica.mobileffmpeg.Level r3 = new com.arthenica.mobileffmpeg.Level
            java.lang.String r5 = "AV_LOG_PANIC"
            r6 = 2
            r3.<init>(r5, r6, r2)
            com.arthenica.mobileffmpeg.Level.AV_LOG_PANIC = r3
            com.arthenica.mobileffmpeg.Level r5 = new com.arthenica.mobileffmpeg.Level
            java.lang.String r7 = "AV_LOG_FATAL"
            r8 = 3
            r9 = 8
            r5.<init>(r7, r8, r9)
            com.arthenica.mobileffmpeg.Level.AV_LOG_FATAL = r5
            com.arthenica.mobileffmpeg.Level r7 = new com.arthenica.mobileffmpeg.Level
            java.lang.String r10 = "AV_LOG_ERROR"
            r11 = 4
            r12 = 16
            r7.<init>(r10, r11, r12)
            com.arthenica.mobileffmpeg.Level.AV_LOG_ERROR = r7
            com.arthenica.mobileffmpeg.Level r10 = new com.arthenica.mobileffmpeg.Level
            java.lang.String r12 = "AV_LOG_WARNING"
            r13 = 5
            r14 = 24
            r10.<init>(r12, r13, r14)
            com.arthenica.mobileffmpeg.Level.AV_LOG_WARNING = r10
            com.arthenica.mobileffmpeg.Level r12 = new com.arthenica.mobileffmpeg.Level
            java.lang.String r14 = "AV_LOG_INFO"
            r15 = 6
            r13 = 32
            r12.<init>(r14, r15, r13)
            com.arthenica.mobileffmpeg.Level.AV_LOG_INFO = r12
            com.arthenica.mobileffmpeg.Level r13 = new com.arthenica.mobileffmpeg.Level
            java.lang.String r14 = "AV_LOG_VERBOSE"
            r15 = 7
            r11 = 40
            r13.<init>(r14, r15, r11)
            com.arthenica.mobileffmpeg.Level.AV_LOG_VERBOSE = r13
            com.arthenica.mobileffmpeg.Level r11 = new com.arthenica.mobileffmpeg.Level
            java.lang.String r14 = "AV_LOG_DEBUG"
            r15 = 48
            r11.<init>(r14, r9, r15)
            com.arthenica.mobileffmpeg.Level.AV_LOG_DEBUG = r11
            com.arthenica.mobileffmpeg.Level r14 = new com.arthenica.mobileffmpeg.Level
            java.lang.String r15 = "AV_LOG_TRACE"
            r9 = 9
            r8 = 56
            r14.<init>(r15, r9, r8)
            com.arthenica.mobileffmpeg.Level.AV_LOG_TRACE = r14
            r8 = 10
            com.arthenica.mobileffmpeg.Level[] r8 = new com.arthenica.mobileffmpeg.Level[r8]
            r8[r2] = r0
            r8[r4] = r1
            r8[r6] = r3
            r0 = 3
            r8[r0] = r5
            r0 = 4
            r8[r0] = r7
            r0 = 5
            r8[r0] = r10
            r0 = 6
            r8[r0] = r12
            r0 = 7
            r8[r0] = r13
            r0 = 8
            r8[r0] = r11
            r8[r9] = r14
            com.arthenica.mobileffmpeg.Level.$VALUES = r8
            return
    }

    Level(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static com.arthenica.mobileffmpeg.Level from(int r2) {
            com.arthenica.mobileffmpeg.Level r0 = com.arthenica.mobileffmpeg.Level.AV_LOG_STDERR
            int r1 = r0.getValue()
            if (r2 != r1) goto L9
            return r0
        L9:
            com.arthenica.mobileffmpeg.Level r0 = com.arthenica.mobileffmpeg.Level.AV_LOG_QUIET
            int r1 = r0.getValue()
            if (r2 != r1) goto L12
            return r0
        L12:
            com.arthenica.mobileffmpeg.Level r0 = com.arthenica.mobileffmpeg.Level.AV_LOG_PANIC
            int r1 = r0.getValue()
            if (r2 != r1) goto L1b
            return r0
        L1b:
            com.arthenica.mobileffmpeg.Level r0 = com.arthenica.mobileffmpeg.Level.AV_LOG_FATAL
            int r1 = r0.getValue()
            if (r2 != r1) goto L24
            return r0
        L24:
            com.arthenica.mobileffmpeg.Level r0 = com.arthenica.mobileffmpeg.Level.AV_LOG_ERROR
            int r1 = r0.getValue()
            if (r2 != r1) goto L2d
            return r0
        L2d:
            com.arthenica.mobileffmpeg.Level r0 = com.arthenica.mobileffmpeg.Level.AV_LOG_WARNING
            int r1 = r0.getValue()
            if (r2 != r1) goto L36
            return r0
        L36:
            com.arthenica.mobileffmpeg.Level r0 = com.arthenica.mobileffmpeg.Level.AV_LOG_INFO
            int r1 = r0.getValue()
            if (r2 != r1) goto L3f
            return r0
        L3f:
            com.arthenica.mobileffmpeg.Level r0 = com.arthenica.mobileffmpeg.Level.AV_LOG_VERBOSE
            int r1 = r0.getValue()
            if (r2 != r1) goto L48
            return r0
        L48:
            com.arthenica.mobileffmpeg.Level r0 = com.arthenica.mobileffmpeg.Level.AV_LOG_DEBUG
            int r1 = r0.getValue()
            if (r2 != r1) goto L51
            return r0
        L51:
            com.arthenica.mobileffmpeg.Level r2 = com.arthenica.mobileffmpeg.Level.AV_LOG_TRACE
            return r2
    }

    public static com.arthenica.mobileffmpeg.Level valueOf(java.lang.String r1) {
            java.lang.Class<com.arthenica.mobileffmpeg.Level> r0 = com.arthenica.mobileffmpeg.Level.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.arthenica.mobileffmpeg.Level r1 = (com.arthenica.mobileffmpeg.Level) r1
            return r1
    }

    public static com.arthenica.mobileffmpeg.Level[] values() {
            com.arthenica.mobileffmpeg.Level[] r0 = com.arthenica.mobileffmpeg.Level.$VALUES
            java.lang.Object r0 = r0.clone()
            com.arthenica.mobileffmpeg.Level[] r0 = (com.arthenica.mobileffmpeg.Level[]) r0
            return r0
    }

    public int getValue() {
            r1 = this;
            int r0 = r1.value
            return r0
    }
}
