package com.google.firebase.concurrent;

/* loaded from: classes2.dex */
public class FirebaseExecutors {
    public static java.util.concurrent.Executor newSequentialExecutor(java.util.concurrent.Executor r1) {
            com.google.firebase.concurrent.SequentialExecutor r0 = new com.google.firebase.concurrent.SequentialExecutor
            r0.<init>(r1)
            return r0
    }
}
