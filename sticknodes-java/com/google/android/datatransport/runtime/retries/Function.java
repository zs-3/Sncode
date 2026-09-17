package com.google.android.datatransport.runtime.retries;

import java.lang.Throwable;

/* loaded from: classes.dex */
public interface Function<TInput, TResult, TException extends java.lang.Throwable> {
    TResult apply(TInput r1) throws java.lang.Throwable;
}
