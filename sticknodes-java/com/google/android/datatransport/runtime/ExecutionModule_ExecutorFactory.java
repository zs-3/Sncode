package com.google.android.datatransport.runtime;

@com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata
@com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata("javax.inject.Singleton")
@com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated
/* loaded from: classes.dex */
public final class ExecutionModule_ExecutorFactory implements com.google.android.datatransport.runtime.dagger.internal.Factory<java.util.concurrent.Executor> {

    private static final class InstanceHolder {
        private static final com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory INSTANCE = null;

        static {
                com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory r0 = new com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory
                r0.<init>()
                com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory.InstanceHolder.INSTANCE = r0
                return
        }

        private InstanceHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory access$000() {
                com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory r0 = com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory.InstanceHolder.INSTANCE
                return r0
        }
    }

    public ExecutionModule_ExecutorFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory create() {
            com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory r0 = com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory.InstanceHolder.access$000()
            return r0
    }

    public static java.util.concurrent.Executor executor() {
            java.util.concurrent.Executor r0 = com.google.android.datatransport.runtime.ExecutionModule.executor()
            java.lang.Object r0 = com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNullFromProvides(r0)
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            return r0
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public /* bridge */ /* synthetic */ java.lang.Object get() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.get()
            return r0
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public java.util.concurrent.Executor get() {
            r1 = this;
            java.util.concurrent.Executor r0 = executor()
            return r0
    }
}
