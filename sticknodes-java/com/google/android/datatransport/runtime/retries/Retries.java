package com.google.android.datatransport.runtime.retries;

/* loaded from: classes.dex */
public final class Retries {
    private Retries() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <TInput, TResult, TException extends java.lang.Throwable> TResult retry(int r2, TInput r3, com.google.android.datatransport.runtime.retries.Function<TInput, TResult, TException> r4, com.google.android.datatransport.runtime.retries.RetryStrategy<TInput, TResult> r5) throws java.lang.Throwable {
            r0 = 1
            if (r2 >= r0) goto L8
            java.lang.Object r2 = r4.apply(r3)
            return r2
        L8:
            java.lang.Object r1 = r4.apply(r3)
            java.lang.Object r3 = r5.shouldRetry(r3, r1)
            if (r3 == 0) goto L16
            int r2 = r2 + (-1)
            if (r2 >= r0) goto L8
        L16:
            return r1
    }
}
