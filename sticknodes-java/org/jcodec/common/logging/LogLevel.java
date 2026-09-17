package org.jcodec.common.logging;

/* loaded from: classes2.dex */
public enum LogLevel extends java.lang.Enum<org.jcodec.common.logging.LogLevel> {
    private static final /* synthetic */ org.jcodec.common.logging.LogLevel[] $VALUES = null;
    public static final org.jcodec.common.logging.LogLevel DEBUG = null;
    public static final org.jcodec.common.logging.LogLevel ERROR = null;
    public static final org.jcodec.common.logging.LogLevel INFO = null;
    public static final org.jcodec.common.logging.LogLevel WARN = null;

    static {
            org.jcodec.common.logging.LogLevel r0 = new org.jcodec.common.logging.LogLevel
            java.lang.String r1 = "DEBUG"
            r2 = 0
            r0.<init>(r1, r2)
            org.jcodec.common.logging.LogLevel.DEBUG = r0
            org.jcodec.common.logging.LogLevel r1 = new org.jcodec.common.logging.LogLevel
            java.lang.String r3 = "INFO"
            r4 = 1
            r1.<init>(r3, r4)
            org.jcodec.common.logging.LogLevel.INFO = r1
            org.jcodec.common.logging.LogLevel r3 = new org.jcodec.common.logging.LogLevel
            java.lang.String r5 = "WARN"
            r6 = 2
            r3.<init>(r5, r6)
            org.jcodec.common.logging.LogLevel.WARN = r3
            org.jcodec.common.logging.LogLevel r5 = new org.jcodec.common.logging.LogLevel
            java.lang.String r7 = "ERROR"
            r8 = 3
            r5.<init>(r7, r8)
            org.jcodec.common.logging.LogLevel.ERROR = r5
            r7 = 4
            org.jcodec.common.logging.LogLevel[] r7 = new org.jcodec.common.logging.LogLevel[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r8] = r5
            org.jcodec.common.logging.LogLevel.$VALUES = r7
            return
    }

    LogLevel(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static org.jcodec.common.logging.LogLevel valueOf(java.lang.String r1) {
            java.lang.Class<org.jcodec.common.logging.LogLevel> r0 = org.jcodec.common.logging.LogLevel.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.jcodec.common.logging.LogLevel r1 = (org.jcodec.common.logging.LogLevel) r1
            return r1
    }

    public static org.jcodec.common.logging.LogLevel[] values() {
            org.jcodec.common.logging.LogLevel[] r0 = org.jcodec.common.logging.LogLevel.$VALUES
            java.lang.Object r0 = r0.clone()
            org.jcodec.common.logging.LogLevel[] r0 = (org.jcodec.common.logging.LogLevel[]) r0
            return r0
    }
}
