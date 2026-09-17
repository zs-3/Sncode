package androidx.work;

/* loaded from: classes.dex */
public abstract class ListenableWorker {
    private android.content.Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;
    private androidx.work.WorkerParameters mWorkerParams;

    public static abstract class Result {

        public static final class Failure extends androidx.work.ListenableWorker.Result {
            private final androidx.work.Data mOutputData;

            public Failure() {
                    r1 = this;
                    androidx.work.Data r0 = androidx.work.Data.EMPTY
                    r1.<init>(r0)
                    return
            }

            public Failure(androidx.work.Data r1) {
                    r0 = this;
                    r0.<init>()
                    r0.mOutputData = r1
                    return
            }

            public boolean equals(java.lang.Object r3) {
                    r2 = this;
                    if (r2 != r3) goto L4
                    r3 = 1
                    return r3
                L4:
                    if (r3 == 0) goto L1a
                    java.lang.Class<androidx.work.ListenableWorker$Result$Failure> r0 = androidx.work.ListenableWorker.Result.Failure.class
                    java.lang.Class r1 = r3.getClass()
                    if (r0 == r1) goto Lf
                    goto L1a
                Lf:
                    androidx.work.ListenableWorker$Result$Failure r3 = (androidx.work.ListenableWorker.Result.Failure) r3
                    androidx.work.Data r0 = r2.mOutputData
                    androidx.work.Data r3 = r3.mOutputData
                    boolean r3 = r0.equals(r3)
                    return r3
                L1a:
                    r3 = 0
                    return r3
            }

            public androidx.work.Data getOutputData() {
                    r1 = this;
                    androidx.work.Data r0 = r1.mOutputData
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class<androidx.work.ListenableWorker$Result$Failure> r0 = androidx.work.ListenableWorker.Result.Failure.class
                    java.lang.String r0 = r0.getName()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    androidx.work.Data r1 = r2.mOutputData
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            public java.lang.String toString() {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "Failure {mOutputData="
                    r0.append(r1)
                    androidx.work.Data r1 = r2.mOutputData
                    r0.append(r1)
                    r1 = 125(0x7d, float:1.75E-43)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        public static final class Retry extends androidx.work.ListenableWorker.Result {
            public Retry() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public boolean equals(java.lang.Object r3) {
                    r2 = this;
                    r0 = 1
                    if (r2 != r3) goto L4
                    return r0
                L4:
                    if (r3 == 0) goto Lf
                    java.lang.Class<androidx.work.ListenableWorker$Result$Retry> r1 = androidx.work.ListenableWorker.Result.Retry.class
                    java.lang.Class r3 = r3.getClass()
                    if (r1 != r3) goto Lf
                    goto L10
                Lf:
                    r0 = 0
                L10:
                    return r0
            }

            public int hashCode() {
                    r1 = this;
                    java.lang.Class<androidx.work.ListenableWorker$Result$Retry> r0 = androidx.work.ListenableWorker.Result.Retry.class
                    java.lang.String r0 = r0.getName()
                    int r0 = r0.hashCode()
                    return r0
            }

            public java.lang.String toString() {
                    r1 = this;
                    java.lang.String r0 = "Retry"
                    return r0
            }
        }

        public static final class Success extends androidx.work.ListenableWorker.Result {
            private final androidx.work.Data mOutputData;

            public Success() {
                    r1 = this;
                    androidx.work.Data r0 = androidx.work.Data.EMPTY
                    r1.<init>(r0)
                    return
            }

            public Success(androidx.work.Data r1) {
                    r0 = this;
                    r0.<init>()
                    r0.mOutputData = r1
                    return
            }

            public boolean equals(java.lang.Object r3) {
                    r2 = this;
                    if (r2 != r3) goto L4
                    r3 = 1
                    return r3
                L4:
                    if (r3 == 0) goto L1a
                    java.lang.Class<androidx.work.ListenableWorker$Result$Success> r0 = androidx.work.ListenableWorker.Result.Success.class
                    java.lang.Class r1 = r3.getClass()
                    if (r0 == r1) goto Lf
                    goto L1a
                Lf:
                    androidx.work.ListenableWorker$Result$Success r3 = (androidx.work.ListenableWorker.Result.Success) r3
                    androidx.work.Data r0 = r2.mOutputData
                    androidx.work.Data r3 = r3.mOutputData
                    boolean r3 = r0.equals(r3)
                    return r3
                L1a:
                    r3 = 0
                    return r3
            }

            public androidx.work.Data getOutputData() {
                    r1 = this;
                    androidx.work.Data r0 = r1.mOutputData
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class<androidx.work.ListenableWorker$Result$Success> r0 = androidx.work.ListenableWorker.Result.Success.class
                    java.lang.String r0 = r0.getName()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    androidx.work.Data r1 = r2.mOutputData
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            public java.lang.String toString() {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "Success {mOutputData="
                    r0.append(r1)
                    androidx.work.Data r1 = r2.mOutputData
                    r0.append(r1)
                    r1 = 125(0x7d, float:1.75E-43)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        Result() {
                r0 = this;
                r0.<init>()
                return
        }

        public static androidx.work.ListenableWorker.Result failure() {
                androidx.work.ListenableWorker$Result$Failure r0 = new androidx.work.ListenableWorker$Result$Failure
                r0.<init>()
                return r0
        }

        public static androidx.work.ListenableWorker.Result retry() {
                androidx.work.ListenableWorker$Result$Retry r0 = new androidx.work.ListenableWorker$Result$Retry
                r0.<init>()
                return r0
        }

        public static androidx.work.ListenableWorker.Result success() {
                androidx.work.ListenableWorker$Result$Success r0 = new androidx.work.ListenableWorker$Result$Success
                r0.<init>()
                return r0
        }

        public static androidx.work.ListenableWorker.Result success(androidx.work.Data r1) {
                androidx.work.ListenableWorker$Result$Success r0 = new androidx.work.ListenableWorker$Result$Success
                r0.<init>(r1)
                return r0
        }
    }

    @androidx.annotation.Keep
    @android.annotation.SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(android.content.Context r1, androidx.work.WorkerParameters r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L14
            if (r2 == 0) goto Lc
            r0.mAppContext = r1
            r0.mWorkerParams = r2
            return
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "WorkerParameters is null"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Application Context is null"
            r1.<init>(r2)
            throw r1
    }

    public final android.content.Context getApplicationContext() {
            r1 = this;
            android.content.Context r0 = r1.mAppContext
            return r0
    }

    public java.util.concurrent.Executor getBackgroundExecutor() {
            r1 = this;
            androidx.work.WorkerParameters r0 = r1.mWorkerParams
            java.util.concurrent.Executor r0 = r0.getBackgroundExecutor()
            return r0
    }

    public com.google.common.util.concurrent.ListenableFuture<androidx.work.ForegroundInfo> getForegroundInfoAsync() {
            r3 = this;
            androidx.work.impl.utils.futures.SettableFuture r0 = androidx.work.impl.utils.futures.SettableFuture.create()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"
            r1.<init>(r2)
            r0.setException(r1)
            return r0
    }

    public final java.util.UUID getId() {
            r1 = this;
            androidx.work.WorkerParameters r0 = r1.mWorkerParams
            java.util.UUID r0 = r0.getId()
            return r0
    }

    public final androidx.work.Data getInputData() {
            r1 = this;
            androidx.work.WorkerParameters r0 = r1.mWorkerParams
            androidx.work.Data r0 = r0.getInputData()
            return r0
    }

    public final android.net.Network getNetwork() {
            r1 = this;
            androidx.work.WorkerParameters r0 = r1.mWorkerParams
            android.net.Network r0 = r0.getNetwork()
            return r0
    }

    public final int getRunAttemptCount() {
            r1 = this;
            androidx.work.WorkerParameters r0 = r1.mWorkerParams
            int r0 = r0.getRunAttemptCount()
            return r0
    }

    public final java.util.Set<java.lang.String> getTags() {
            r1 = this;
            androidx.work.WorkerParameters r0 = r1.mWorkerParams
            java.util.Set r0 = r0.getTags()
            return r0
    }

    public androidx.work.impl.utils.taskexecutor.TaskExecutor getTaskExecutor() {
            r1 = this;
            androidx.work.WorkerParameters r0 = r1.mWorkerParams
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r0.getTaskExecutor()
            return r0
    }

    public final java.util.List<java.lang.String> getTriggeredContentAuthorities() {
            r1 = this;
            androidx.work.WorkerParameters r0 = r1.mWorkerParams
            java.util.List r0 = r0.getTriggeredContentAuthorities()
            return r0
    }

    public final java.util.List<android.net.Uri> getTriggeredContentUris() {
            r1 = this;
            androidx.work.WorkerParameters r0 = r1.mWorkerParams
            java.util.List r0 = r0.getTriggeredContentUris()
            return r0
    }

    public androidx.work.WorkerFactory getWorkerFactory() {
            r1 = this;
            androidx.work.WorkerParameters r0 = r1.mWorkerParams
            androidx.work.WorkerFactory r0 = r0.getWorkerFactory()
            return r0
    }

    public boolean isRunInForeground() {
            r1 = this;
            boolean r0 = r1.mRunInForeground
            return r0
    }

    public final boolean isStopped() {
            r1 = this;
            boolean r0 = r1.mStopped
            return r0
    }

    public final boolean isUsed() {
            r1 = this;
            boolean r0 = r1.mUsed
            return r0
    }

    public void onStopped() {
            r0 = this;
            return
    }

    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setForegroundAsync(androidx.work.ForegroundInfo r4) {
            r3 = this;
            r0 = 1
            r3.mRunInForeground = r0
            androidx.work.WorkerParameters r0 = r3.mWorkerParams
            androidx.work.ForegroundUpdater r0 = r0.getForegroundUpdater()
            android.content.Context r1 = r3.getApplicationContext()
            java.util.UUID r2 = r3.getId()
            com.google.common.util.concurrent.ListenableFuture r4 = r0.setForegroundAsync(r1, r2, r4)
            return r4
    }

    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setProgressAsync(androidx.work.Data r4) {
            r3 = this;
            androidx.work.WorkerParameters r0 = r3.mWorkerParams
            androidx.work.ProgressUpdater r0 = r0.getProgressUpdater()
            android.content.Context r1 = r3.getApplicationContext()
            java.util.UUID r2 = r3.getId()
            com.google.common.util.concurrent.ListenableFuture r4 = r0.updateProgress(r1, r2, r4)
            return r4
    }

    public void setRunInForeground(boolean r1) {
            r0 = this;
            r0.mRunInForeground = r1
            return
    }

    public final void setUsed() {
            r1 = this;
            r0 = 1
            r1.mUsed = r0
            return
    }

    public abstract com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> startWork();

    public final void stop() {
            r1 = this;
            r0 = 1
            r1.mStopped = r0
            r1.onStopped()
            return
    }
}
