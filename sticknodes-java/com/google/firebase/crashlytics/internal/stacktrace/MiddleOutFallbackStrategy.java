package com.google.firebase.crashlytics.internal.stacktrace;

/* loaded from: classes2.dex */
public class MiddleOutFallbackStrategy implements com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy {
    private final int maximumStackSize;
    private final com.google.firebase.crashlytics.internal.stacktrace.MiddleOutStrategy middleOutStrategy;
    private final com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy[] trimmingStrategies;

    public MiddleOutFallbackStrategy(int r1, com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy... r2) {
            r0 = this;
            r0.<init>()
            r0.maximumStackSize = r1
            r0.trimmingStrategies = r2
            com.google.firebase.crashlytics.internal.stacktrace.MiddleOutStrategy r2 = new com.google.firebase.crashlytics.internal.stacktrace.MiddleOutStrategy
            r2.<init>(r1)
            r0.middleOutStrategy = r2
            return
    }

    @Override // com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy
    public java.lang.StackTraceElement[] getTrimmedStackTrace(java.lang.StackTraceElement[] r8) {
            r7 = this;
            int r0 = r8.length
            int r1 = r7.maximumStackSize
            if (r0 > r1) goto L6
            return r8
        L6:
            com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy[] r0 = r7.trimmingStrategies
            int r1 = r0.length
            r2 = 0
            r3 = r8
        Lb:
            if (r2 >= r1) goto L1c
            r4 = r0[r2]
            int r5 = r3.length
            int r6 = r7.maximumStackSize
            if (r5 > r6) goto L15
            goto L1c
        L15:
            java.lang.StackTraceElement[] r3 = r4.getTrimmedStackTrace(r8)
            int r2 = r2 + 1
            goto Lb
        L1c:
            int r8 = r3.length
            int r0 = r7.maximumStackSize
            if (r8 <= r0) goto L27
            com.google.firebase.crashlytics.internal.stacktrace.MiddleOutStrategy r8 = r7.middleOutStrategy
            java.lang.StackTraceElement[] r3 = r8.getTrimmedStackTrace(r3)
        L27:
            return r3
    }
}
