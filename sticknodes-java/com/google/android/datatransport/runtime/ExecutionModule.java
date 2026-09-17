package com.google.android.datatransport.runtime;

@com.google.android.datatransport.runtime.dagger.Module
/* loaded from: classes.dex */
abstract class ExecutionModule {
    ExecutionModule() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.datatransport.runtime.dagger.Provides
    @android.annotation.SuppressLint({"ThreadPoolCreation"})
    static java.util.concurrent.Executor executor() {
            com.google.android.datatransport.runtime.SafeLoggingExecutor r0 = new com.google.android.datatransport.runtime.SafeLoggingExecutor
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r0.<init>(r1)
            return r0
    }
}
