package kotlinx.coroutines.internal;

/* compiled from: LimitedDispatcher.kt */
/* loaded from: classes2.dex */
public final class LimitedDispatcherKt {
    public static final void checkParallelism(int r2) {
            r0 = 1
            if (r2 < r0) goto L4
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 == 0) goto L8
            return
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected positive parallelism level, but got "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }
}
