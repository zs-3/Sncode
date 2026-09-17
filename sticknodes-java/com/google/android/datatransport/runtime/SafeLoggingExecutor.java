package com.google.android.datatransport.runtime;

/* loaded from: classes.dex */
class SafeLoggingExecutor implements java.util.concurrent.Executor {
    private final java.util.concurrent.Executor delegate;

    static class SafeLoggingRunnable implements java.lang.Runnable {
        private final java.lang.Runnable delegate;

        SafeLoggingRunnable(java.lang.Runnable r1) {
                r0 = this;
                r0.<init>()
                r0.delegate = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                java.lang.Runnable r0 = r3.delegate     // Catch: java.lang.Exception -> L6
                r0.run()     // Catch: java.lang.Exception -> L6
                goto Le
            L6:
                r0 = move-exception
                java.lang.String r1 = "Executor"
                java.lang.String r2 = "Background execution failure."
                com.google.android.datatransport.runtime.logging.Logging.e(r1, r2, r0)
            Le:
                return
        }
    }

    SafeLoggingExecutor(java.util.concurrent.Executor r1) {
            r0 = this;
            r0.<init>()
            r0.delegate = r1
            return
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r3) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.delegate
            com.google.android.datatransport.runtime.SafeLoggingExecutor$SafeLoggingRunnable r1 = new com.google.android.datatransport.runtime.SafeLoggingExecutor$SafeLoggingRunnable
            r1.<init>(r3)
            r0.execute(r1)
            return
    }
}
