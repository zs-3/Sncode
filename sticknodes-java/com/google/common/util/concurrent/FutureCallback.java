package com.google.common.util.concurrent;

/* loaded from: classes2.dex */
public interface FutureCallback<V> {
    void onFailure(java.lang.Throwable r1);

    void onSuccess(V r1);
}
