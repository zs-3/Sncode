package com.google.firebase.crashlytics.internal.stacktrace;

/* loaded from: classes2.dex */
public class MiddleOutStrategy implements com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy {
    private final int trimmedSize;

    public MiddleOutStrategy(int r1) {
            r0 = this;
            r0.<init>()
            r0.trimmedSize = r1
            return
    }

    @Override // com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy
    public java.lang.StackTraceElement[] getTrimmedStackTrace(java.lang.StackTraceElement[] r5) {
            r4 = this;
            int r0 = r5.length
            int r1 = r4.trimmedSize
            if (r0 > r1) goto L6
            return r5
        L6:
            int r0 = r1 / 2
            int r2 = r1 - r0
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            r3 = 0
            java.lang.System.arraycopy(r5, r3, r1, r3, r2)
            int r3 = r5.length
            int r3 = r3 - r0
            java.lang.System.arraycopy(r5, r3, r1, r2, r0)
            return r1
    }
}
