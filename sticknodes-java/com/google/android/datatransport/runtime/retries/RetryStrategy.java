package com.google.android.datatransport.runtime.retries;

/* loaded from: classes.dex */
public interface RetryStrategy<TInput, TResult> {
    TInput shouldRetry(TInput r1, TResult r2);
}
