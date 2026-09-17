package com.google.firebase.crashlytics.internal.stacktrace;

/* loaded from: classes2.dex */
public class RemoveRepeatsStrategy implements com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy {
    private final int maxRepetitions;

    public RemoveRepeatsStrategy(int r1) {
            r0 = this;
            r0.<init>()
            r0.maxRepetitions = r1
            return
    }

    private static boolean isRepeatingSequence(java.lang.StackTraceElement[] r5, int r6, int r7) {
            int r0 = r7 - r6
            int r1 = r7 + r0
            int r2 = r5.length
            r3 = 0
            if (r1 <= r2) goto L9
            return r3
        L9:
            r1 = 0
        La:
            if (r1 >= r0) goto L1e
            int r2 = r6 + r1
            r2 = r5[r2]
            int r4 = r7 + r1
            r4 = r5[r4]
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L1b
            return r3
        L1b:
            int r1 = r1 + 1
            goto La
        L1e:
            r5 = 1
            return r5
    }

    private static java.lang.StackTraceElement[] trimRepeats(java.lang.StackTraceElement[] r10, int r11) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r10.length
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            r2 = 0
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 1
        Ld:
            int r7 = r10.length
            if (r4 >= r7) goto L49
            r7 = r10[r4]
            java.lang.Object r8 = r0.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L37
            int r9 = r8.intValue()
            boolean r9 = isRepeatingSequence(r10, r9, r4)
            if (r9 != 0) goto L25
            goto L37
        L25:
            int r8 = r8.intValue()
            int r8 = r4 - r8
            if (r6 >= r11) goto L33
            java.lang.System.arraycopy(r10, r4, r1, r5, r8)
            int r5 = r5 + r8
            int r6 = r6 + 1
        L33:
            int r8 = r8 + (-1)
            int r8 = r8 + r4
            goto L3f
        L37:
            r6 = r10[r4]
            r1[r5] = r6
            int r5 = r5 + 1
            r8 = r4
            r6 = 1
        L3f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r7, r4)
            int r4 = r8 + 1
            goto Ld
        L49:
            java.lang.StackTraceElement[] r10 = new java.lang.StackTraceElement[r5]
            java.lang.System.arraycopy(r1, r2, r10, r2, r5)
            return r10
    }

    @Override // com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy
    public java.lang.StackTraceElement[] getTrimmedStackTrace(java.lang.StackTraceElement[] r4) {
            r3 = this;
            int r0 = r3.maxRepetitions
            java.lang.StackTraceElement[] r0 = trimRepeats(r4, r0)
            int r1 = r0.length
            int r2 = r4.length
            if (r1 >= r2) goto Lb
            return r0
        Lb:
            return r4
    }
}
