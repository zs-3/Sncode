package com.google.common.util.concurrent;

/* loaded from: classes2.dex */
public interface ListenableFuture<V> extends java.util.concurrent.Future<V> {
    void addListener(java.lang.Runnable r1, java.util.concurrent.Executor r2);
}
