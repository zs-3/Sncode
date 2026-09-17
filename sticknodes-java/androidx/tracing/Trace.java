package androidx.tracing;

/* loaded from: classes.dex */
public final class Trace {
    private static java.lang.reflect.Method sIsTagEnabledMethod;
    private static long sTraceTagApp;

    public static void beginSection(java.lang.String r0) {
            androidx.tracing.TraceApi18Impl.beginSection(r0)
            return
    }

    public static void endSection() {
            androidx.tracing.TraceApi18Impl.endSection()
            return
    }

    private static void handleException(java.lang.String r2, java.lang.Exception r3) {
            boolean r0 = r3 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto L15
            java.lang.Throwable r2 = r3.getCause()
            boolean r3 = r2 instanceof java.lang.RuntimeException
            if (r3 == 0) goto Lf
            java.lang.RuntimeException r2 = (java.lang.RuntimeException) r2
            throw r2
        Lf:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to call "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = " via reflection"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "Trace"
            android.util.Log.v(r0, r2, r3)
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static boolean isEnabled() {
            java.lang.reflect.Method r0 = androidx.tracing.Trace.sIsTagEnabledMethod     // Catch: java.lang.Throwable -> L9
            if (r0 != 0) goto L9
            boolean r0 = android.os.Trace.isEnabled()     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            boolean r0 = isEnabledFallback()
            return r0
    }

    private static boolean isEnabledFallback() {
            java.lang.String r0 = "isTagEnabled"
            r1 = 0
            java.lang.reflect.Method r2 = androidx.tracing.Trace.sIsTagEnabledMethod     // Catch: java.lang.Exception -> L3c
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L25
            java.lang.Class<android.os.Trace> r2 = android.os.Trace.class
            java.lang.String r5 = "TRACE_TAG_APP"
            java.lang.reflect.Field r2 = r2.getField(r5)     // Catch: java.lang.Exception -> L3c
            long r5 = r2.getLong(r4)     // Catch: java.lang.Exception -> L3c
            androidx.tracing.Trace.sTraceTagApp = r5     // Catch: java.lang.Exception -> L3c
            java.lang.Class<android.os.Trace> r2 = android.os.Trace.class
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L3c
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L3c
            r5[r1] = r6     // Catch: java.lang.Exception -> L3c
            java.lang.reflect.Method r2 = r2.getMethod(r0, r5)     // Catch: java.lang.Exception -> L3c
            androidx.tracing.Trace.sIsTagEnabledMethod = r2     // Catch: java.lang.Exception -> L3c
        L25:
            java.lang.reflect.Method r2 = androidx.tracing.Trace.sIsTagEnabledMethod     // Catch: java.lang.Exception -> L3c
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L3c
            long r5 = androidx.tracing.Trace.sTraceTagApp     // Catch: java.lang.Exception -> L3c
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Exception -> L3c
            r3[r1] = r5     // Catch: java.lang.Exception -> L3c
            java.lang.Object r2 = r2.invoke(r4, r3)     // Catch: java.lang.Exception -> L3c
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Exception -> L3c
            boolean r0 = r2.booleanValue()     // Catch: java.lang.Exception -> L3c
            return r0
        L3c:
            r2 = move-exception
            handleException(r0, r2)
            return r1
    }
}
