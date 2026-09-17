package org.jcodec.common.logging;

/* loaded from: classes2.dex */
public class Logger {
    private static java.util.List<org.jcodec.common.logging.LogSink> sinks;
    private static java.util.List<org.jcodec.common.logging.LogSink> stageSinks;

    static {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            org.jcodec.common.logging.Logger.stageSinks = r0
            return
    }

    public Logger() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void debug(java.lang.String r1) {
            org.jcodec.common.logging.LogLevel r0 = org.jcodec.common.logging.LogLevel.DEBUG
            message(r0, r1)
            return
    }

    public static void error(java.lang.String r1) {
            org.jcodec.common.logging.LogLevel r0 = org.jcodec.common.logging.LogLevel.ERROR
            message(r0, r1)
            return
    }

    private static void message(org.jcodec.common.logging.LogLevel r9, java.lang.String r10) {
            java.util.List<org.jcodec.common.logging.LogSink> r0 = org.jcodec.common.logging.Logger.sinks
            if (r0 != 0) goto L26
            java.lang.Class<org.jcodec.common.logging.Logger> r0 = org.jcodec.common.logging.Logger.class
            monitor-enter(r0)
            java.util.List<org.jcodec.common.logging.LogSink> r1 = org.jcodec.common.logging.Logger.sinks     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L21
            java.util.List<org.jcodec.common.logging.LogSink> r1 = org.jcodec.common.logging.Logger.stageSinks     // Catch: java.lang.Throwable -> L23
            org.jcodec.common.logging.Logger.sinks = r1     // Catch: java.lang.Throwable -> L23
            r2 = 0
            org.jcodec.common.logging.Logger.stageSinks = r2     // Catch: java.lang.Throwable -> L23
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L21
            java.util.List<org.jcodec.common.logging.LogSink> r1 = org.jcodec.common.logging.Logger.sinks     // Catch: java.lang.Throwable -> L23
            org.jcodec.common.logging.OutLogSink r2 = org.jcodec.common.logging.OutLogSink.createOutLogSink()     // Catch: java.lang.Throwable -> L23
            r1.add(r2)     // Catch: java.lang.Throwable -> L23
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            goto L26
        L23:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r9
        L26:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 3
            r0 = r0[r1]
            org.jcodec.common.logging.Message r8 = new org.jcodec.common.logging.Message
            java.lang.String r3 = r0.getFileName()
            java.lang.String r4 = r0.getClassName()
            java.lang.String r5 = r0.getMethodName()
            int r6 = r0.getLineNumber()
            r1 = r8
            r2 = r9
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.util.List<org.jcodec.common.logging.LogSink> r9 = org.jcodec.common.logging.Logger.sinks
            java.util.Iterator r9 = r9.iterator()
        L4f:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L5f
            java.lang.Object r10 = r9.next()
            org.jcodec.common.logging.LogSink r10 = (org.jcodec.common.logging.LogSink) r10
            r10.postMessage(r8)
            goto L4f
        L5f:
            return
    }

    public static void warn(java.lang.String r1) {
            org.jcodec.common.logging.LogLevel r0 = org.jcodec.common.logging.LogLevel.WARN
            message(r0, r1)
            return
    }
}
