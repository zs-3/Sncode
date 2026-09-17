package androidx.loader.content;

/* loaded from: classes.dex */
abstract class ModernAsyncTask<Result> {
    private static android.os.Handler sHandler;
    final java.util.concurrent.atomic.AtomicBoolean mCancelled;
    private final java.util.concurrent.FutureTask<Result> mFuture;
    private volatile androidx.loader.content.ModernAsyncTask.Status mStatus;
    final java.util.concurrent.atomic.AtomicBoolean mTaskInvoked;




    /* renamed from: androidx.loader.content.ModernAsyncTask$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$androidx$loader$content$ModernAsyncTask$Status = null;

        static {
                androidx.loader.content.ModernAsyncTask$Status[] r0 = androidx.loader.content.ModernAsyncTask.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.loader.content.ModernAsyncTask.AnonymousClass4.$SwitchMap$androidx$loader$content$ModernAsyncTask$Status = r0
                androidx.loader.content.ModernAsyncTask$Status r1 = androidx.loader.content.ModernAsyncTask.Status.RUNNING     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.loader.content.ModernAsyncTask.AnonymousClass4.$SwitchMap$androidx$loader$content$ModernAsyncTask$Status     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.loader.content.ModernAsyncTask$Status r1 = androidx.loader.content.ModernAsyncTask.Status.FINISHED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    public enum Status extends java.lang.Enum<androidx.loader.content.ModernAsyncTask.Status> {
        private static final /* synthetic */ androidx.loader.content.ModernAsyncTask.Status[] $VALUES = null;
        public static final androidx.loader.content.ModernAsyncTask.Status FINISHED = null;
        public static final androidx.loader.content.ModernAsyncTask.Status PENDING = null;
        public static final androidx.loader.content.ModernAsyncTask.Status RUNNING = null;

        static {
                androidx.loader.content.ModernAsyncTask$Status r0 = new androidx.loader.content.ModernAsyncTask$Status
                java.lang.String r1 = "PENDING"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.loader.content.ModernAsyncTask.Status.PENDING = r0
                androidx.loader.content.ModernAsyncTask$Status r1 = new androidx.loader.content.ModernAsyncTask$Status
                java.lang.String r3 = "RUNNING"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.loader.content.ModernAsyncTask.Status.RUNNING = r1
                androidx.loader.content.ModernAsyncTask$Status r3 = new androidx.loader.content.ModernAsyncTask$Status
                java.lang.String r5 = "FINISHED"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.loader.content.ModernAsyncTask.Status.FINISHED = r3
                r5 = 3
                androidx.loader.content.ModernAsyncTask$Status[] r5 = new androidx.loader.content.ModernAsyncTask.Status[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                androidx.loader.content.ModernAsyncTask.Status.$VALUES = r5
                return
        }

        Status(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.loader.content.ModernAsyncTask.Status valueOf(java.lang.String r1) {
                java.lang.Class<androidx.loader.content.ModernAsyncTask$Status> r0 = androidx.loader.content.ModernAsyncTask.Status.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.loader.content.ModernAsyncTask$Status r1 = (androidx.loader.content.ModernAsyncTask.Status) r1
                return r1
        }

        public static androidx.loader.content.ModernAsyncTask.Status[] values() {
                androidx.loader.content.ModernAsyncTask$Status[] r0 = androidx.loader.content.ModernAsyncTask.Status.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.loader.content.ModernAsyncTask$Status[] r0 = (androidx.loader.content.ModernAsyncTask.Status[]) r0
                return r0
        }
    }

    ModernAsyncTask() {
            r2 = this;
            r2.<init>()
            androidx.loader.content.ModernAsyncTask$Status r0 = androidx.loader.content.ModernAsyncTask.Status.PENDING
            r2.mStatus = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.mCancelled = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.mTaskInvoked = r0
            androidx.loader.content.ModernAsyncTask$1 r0 = new androidx.loader.content.ModernAsyncTask$1
            r0.<init>(r2)
            androidx.loader.content.ModernAsyncTask$2 r1 = new androidx.loader.content.ModernAsyncTask$2
            r1.<init>(r2, r0)
            r2.mFuture = r1
            return
    }

    private static android.os.Handler getHandler() {
            java.lang.Class<androidx.loader.content.ModernAsyncTask> r0 = androidx.loader.content.ModernAsyncTask.class
            monitor-enter(r0)
            android.os.Handler r1 = androidx.loader.content.ModernAsyncTask.sHandler     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L12
            android.os.Handler r1 = new android.os.Handler     // Catch: java.lang.Throwable -> L16
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L16
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L16
            androidx.loader.content.ModernAsyncTask.sHandler = r1     // Catch: java.lang.Throwable -> L16
        L12:
            android.os.Handler r1 = androidx.loader.content.ModernAsyncTask.sHandler     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return r1
        L16:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    public final boolean cancel(boolean r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mCancelled
            r1 = 1
            r0.set(r1)
            java.util.concurrent.FutureTask<Result> r0 = r2.mFuture
            boolean r3 = r0.cancel(r3)
            return r3
    }

    protected abstract Result doInBackground();

    public final void executeOnExecutor(java.util.concurrent.Executor r3) {
            r2 = this;
            androidx.loader.content.ModernAsyncTask$Status r0 = r2.mStatus
            androidx.loader.content.ModernAsyncTask$Status r1 = androidx.loader.content.ModernAsyncTask.Status.PENDING
            if (r0 == r1) goto L2e
            int[] r3 = androidx.loader.content.ModernAsyncTask.AnonymousClass4.$SwitchMap$androidx$loader$content$ModernAsyncTask$Status
            androidx.loader.content.ModernAsyncTask$Status r0 = r2.mStatus
            int r0 = r0.ordinal()
            r3 = r3[r0]
            r0 = 1
            if (r3 == r0) goto L26
            r0 = 2
            if (r3 == r0) goto L1e
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "We should never reach this state"
            r3.<init>(r0)
            throw r3
        L1e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot execute task: the task has already been executed (a task can be executed only once)"
            r3.<init>(r0)
            throw r3
        L26:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot execute task: the task is already running."
            r3.<init>(r0)
            throw r3
        L2e:
            androidx.loader.content.ModernAsyncTask$Status r0 = androidx.loader.content.ModernAsyncTask.Status.RUNNING
            r2.mStatus = r0
            java.util.concurrent.FutureTask<Result> r0 = r2.mFuture
            r3.execute(r0)
            return
    }

    void finish(Result r2) {
            r1 = this;
            boolean r0 = r1.isCancelled()
            if (r0 == 0) goto La
            r1.onCancelled(r2)
            goto Ld
        La:
            r1.onPostExecute(r2)
        Ld:
            androidx.loader.content.ModernAsyncTask$Status r2 = androidx.loader.content.ModernAsyncTask.Status.FINISHED
            r1.mStatus = r2
            return
    }

    public final boolean isCancelled() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.mCancelled
            boolean r0 = r0.get()
            return r0
    }

    protected void onCancelled(Result r1) {
            r0 = this;
            return
    }

    protected void onPostExecute(Result r1) {
            r0 = this;
            return
    }

    void postResult(Result r3) {
            r2 = this;
            android.os.Handler r0 = getHandler()
            androidx.loader.content.ModernAsyncTask$3 r1 = new androidx.loader.content.ModernAsyncTask$3
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    void postResultIfNotInvoked(Result r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.mTaskInvoked
            boolean r0 = r0.get()
            if (r0 != 0) goto Lb
            r1.postResult(r2)
        Lb:
            return
    }
}
