package kotlinx.coroutines.internal;

/* compiled from: Concurrent.kt */
/* loaded from: classes2.dex */
public final class ConcurrentKt {
    private static final java.lang.reflect.Method REMOVE_FUTURE_ON_CANCEL = null;

    static {
            java.lang.Class<java.util.concurrent.ScheduledThreadPoolExecutor> r0 = java.util.concurrent.ScheduledThreadPoolExecutor.class
            java.lang.String r1 = "setRemoveOnCancelPolicy"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L11
            r3 = 0
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L11
            r2[r3] = r4     // Catch: java.lang.Throwable -> L11
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L11
            goto L12
        L11:
            r0 = 0
        L12:
            kotlinx.coroutines.internal.ConcurrentKt.REMOVE_FUTURE_ON_CANCEL = r0
            return
    }

    public static final boolean removeFutureOnCancel(java.util.concurrent.Executor r5) {
            r0 = 0
            boolean r1 = r5 instanceof java.util.concurrent.ScheduledThreadPoolExecutor     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L8
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = (java.util.concurrent.ScheduledThreadPoolExecutor) r5     // Catch: java.lang.Throwable -> L1c
            goto L9
        L8:
            r5 = 0
        L9:
            if (r5 != 0) goto Lc
            return r0
        Lc:
            java.lang.reflect.Method r1 = kotlinx.coroutines.internal.ConcurrentKt.REMOVE_FUTURE_ON_CANCEL     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L11
            return r0
        L11:
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1c
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1c
            r3[r0] = r4     // Catch: java.lang.Throwable -> L1c
            r1.invoke(r5, r3)     // Catch: java.lang.Throwable -> L1c
            return r2
        L1c:
            return r0
    }
}
