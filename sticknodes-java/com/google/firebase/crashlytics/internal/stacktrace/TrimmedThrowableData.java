package com.google.firebase.crashlytics.internal.stacktrace;

/* loaded from: classes2.dex */
public class TrimmedThrowableData {
    public final com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData cause;
    public final java.lang.String className;
    public final java.lang.String localizedMessage;
    public final java.lang.StackTraceElement[] stacktrace;

    private TrimmedThrowableData(java.lang.String r1, java.lang.String r2, java.lang.StackTraceElement[] r3, com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData r4) {
            r0 = this;
            r0.<init>()
            r0.localizedMessage = r1
            r0.className = r2
            r0.stacktrace = r3
            r0.cause = r4
            return
    }

    public static com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData makeTrimmedThrowableData(java.lang.Throwable r5, com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy r6) {
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
        L5:
            if (r5 == 0) goto Lf
            r0.push(r5)
            java.lang.Throwable r5 = r5.getCause()
            goto L5
        Lf:
            r5 = 0
        L10:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L37
            java.lang.Object r1 = r0.pop()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData r2 = new com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData
            java.lang.String r3 = r1.getLocalizedMessage()
            java.lang.Class r4 = r1.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            java.lang.StackTraceElement[] r1 = r6.getTrimmedStackTrace(r1)
            r2.<init>(r3, r4, r1, r5)
            r5 = r2
            goto L10
        L37:
            return r5
    }
}
