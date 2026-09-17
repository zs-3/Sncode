package com.googlecode.mp4parser.util;

/* loaded from: classes2.dex */
public abstract class Logger {
    public Logger() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.googlecode.mp4parser.util.Logger getLogger(java.lang.Class r2) {
            java.lang.String r0 = "java.vm.name"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r1 = "Dalvik"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L18
            com.googlecode.mp4parser.util.AndroidLogger r0 = new com.googlecode.mp4parser.util.AndroidLogger
            java.lang.String r2 = r2.getSimpleName()
            r0.<init>(r2)
            return r0
        L18:
            com.googlecode.mp4parser.util.JuliLogger r0 = new com.googlecode.mp4parser.util.JuliLogger
            java.lang.String r2 = r2.getSimpleName()
            r0.<init>(r2)
            return r0
    }

    public abstract void logDebug(java.lang.String r1);

    public abstract void logError(java.lang.String r1);

    public abstract void logWarn(java.lang.String r1);
}
