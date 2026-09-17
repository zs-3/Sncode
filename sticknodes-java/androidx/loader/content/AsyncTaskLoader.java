package androidx.loader.content;

/* loaded from: classes.dex */
public abstract class AsyncTaskLoader<D> extends androidx.loader.content.Loader<D> {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "AsyncTaskLoader";
    private volatile androidx.loader.content.AsyncTaskLoader<D>.LoadTask mCancellingTask;
    private java.util.concurrent.Executor mExecutor;
    private android.os.Handler mHandler;
    private long mLastLoadCompleteTime;
    private volatile androidx.loader.content.AsyncTaskLoader<D>.LoadTask mTask;
    private long mUpdateThrottle;

    final class LoadTask extends androidx.loader.content.ModernAsyncTask<D> implements java.lang.Runnable {
        final /* synthetic */ androidx.loader.content.AsyncTaskLoader this$0;
        boolean waiting;

        LoadTask(androidx.loader.content.AsyncTaskLoader r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.loader.content.ModernAsyncTask
        protected D doInBackground() {
                r1 = this;
                androidx.loader.content.AsyncTaskLoader r0 = r1.this$0
                java.lang.Object r0 = r0.onLoadInBackground()
                return r0
        }

        @Override // androidx.loader.content.ModernAsyncTask
        protected void onCancelled(D r2) {
                r1 = this;
                androidx.loader.content.AsyncTaskLoader r0 = r1.this$0
                r0.dispatchOnCancelled(r1, r2)
                return
        }

        @Override // androidx.loader.content.ModernAsyncTask
        protected void onPostExecute(D r2) {
                r1 = this;
                androidx.loader.content.AsyncTaskLoader r0 = r1.this$0
                r0.dispatchOnLoadComplete(r1, r2)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                r0 = 0
                r1.waiting = r0
                androidx.loader.content.AsyncTaskLoader r0 = r1.this$0
                r0.executePendingTask()
                return
        }
    }

    public AsyncTaskLoader(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            r0 = -10000(0xffffffffffffd8f0, double:NaN)
            r2.mLastLoadCompleteTime = r0
            return
    }

    public void cancelLoadInBackground() {
            r0 = this;
            return
    }

    void dispatchOnCancelled(androidx.loader.content.AsyncTaskLoader<D>.LoadTask r1, D r2) {
            r0 = this;
            r0.onCanceled(r2)
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r2 = r0.mCancellingTask
            if (r2 != r1) goto L19
            r0.rollbackContentChanged()
            long r1 = android.os.SystemClock.uptimeMillis()
            r0.mLastLoadCompleteTime = r1
            r1 = 0
            r0.mCancellingTask = r1
            r0.deliverCancellation()
            r0.executePendingTask()
        L19:
            return
    }

    void dispatchOnLoadComplete(androidx.loader.content.AsyncTaskLoader<D>.LoadTask r3, D r4) {
            r2 = this;
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r2.mTask
            if (r0 == r3) goto L8
            r2.dispatchOnCancelled(r3, r4)
            goto L21
        L8:
            boolean r3 = r2.isAbandoned()
            if (r3 == 0) goto L12
            r2.onCanceled(r4)
            goto L21
        L12:
            r2.commitContentChanged()
            long r0 = android.os.SystemClock.uptimeMillis()
            r2.mLastLoadCompleteTime = r0
            r3 = 0
            r2.mTask = r3
            r2.deliverResult(r4)
        L21:
            return
    }

    @Override // androidx.loader.content.Loader
    @java.lang.Deprecated
    public void dump(java.lang.String r5, java.io.FileDescriptor r6, java.io.PrintWriter r7, java.lang.String[] r8) {
            r4 = this;
            super.dump(r5, r6, r7, r8)
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r6 = r4.mTask
            java.lang.String r8 = " waiting="
            if (r6 == 0) goto L20
            r7.print(r5)
            java.lang.String r6 = "mTask="
            r7.print(r6)
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r6 = r4.mTask
            r7.print(r6)
            r7.print(r8)
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r6 = r4.mTask
            boolean r6 = r6.waiting
            r7.println(r6)
        L20:
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r6 = r4.mCancellingTask
            if (r6 == 0) goto L3b
            r7.print(r5)
            java.lang.String r6 = "mCancellingTask="
            r7.print(r6)
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r6 = r4.mCancellingTask
            r7.print(r6)
            r7.print(r8)
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r6 = r4.mCancellingTask
            boolean r6 = r6.waiting
            r7.println(r6)
        L3b:
            long r0 = r4.mUpdateThrottle
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L90
            r7.print(r5)
            java.lang.String r5 = "mUpdateThrottle="
            r7.print(r5)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r4.mUpdateThrottle
            long r0 = r5.toSeconds(r0)
            java.lang.String r6 = android.text.format.DateUtils.formatElapsedTime(r0)
            r7.print(r6)
            java.lang.String r6 = " mLastLoadCompleteTime="
            r7.print(r6)
            long r0 = r4.mLastLoadCompleteTime
            r2 = -10000(0xffffffffffffd8f0, double:NaN)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L6a
            java.lang.String r5 = "--"
            goto L8a
        L6a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "-"
            r6.append(r8)
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r4.mLastLoadCompleteTime
            long r0 = r0 - r2
            long r0 = r5.toSeconds(r0)
            java.lang.String r5 = android.text.format.DateUtils.formatElapsedTime(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
        L8a:
            r7.print(r5)
            r7.println()
        L90:
            return
    }

    void executePendingTask() {
            r6 = this;
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r6.mCancellingTask
            if (r0 != 0) goto L52
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r6.mTask
            if (r0 == 0) goto L52
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r6.mTask
            boolean r0 = r0.waiting
            if (r0 == 0) goto L1a
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r6.mTask
            r1 = 0
            r0.waiting = r1
            android.os.Handler r0 = r6.mHandler
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r1 = r6.mTask
            r0.removeCallbacks(r1)
        L1a:
            long r0 = r6.mUpdateThrottle
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L41
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r6.mLastLoadCompleteTime
            long r4 = r6.mUpdateThrottle
            long r2 = r2 + r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L41
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r6.mTask
            r1 = 1
            r0.waiting = r1
            android.os.Handler r0 = r6.mHandler
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r1 = r6.mTask
            long r2 = r6.mLastLoadCompleteTime
            long r4 = r6.mUpdateThrottle
            long r2 = r2 + r4
            r0.postAtTime(r1, r2)
            return
        L41:
            java.util.concurrent.Executor r0 = r6.mExecutor
            if (r0 != 0) goto L4b
            java.util.concurrent.Executor r0 = r6.getExecutor()
            r6.mExecutor = r0
        L4b:
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r6.mTask
            java.util.concurrent.Executor r1 = r6.mExecutor
            r0.executeOnExecutor(r1)
        L52:
            return
    }

    protected java.util.concurrent.Executor getExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
            return r0
    }

    public boolean isLoadInBackgroundCanceled() {
            r1 = this;
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r1.mCancellingTask
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public abstract D loadInBackground();

    @Override // androidx.loader.content.Loader
    protected boolean onCancelLoad() {
            r4 = this;
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r4.mTask
            r1 = 0
            if (r0 == 0) goto L4d
            boolean r0 = r4.isStarted()
            if (r0 != 0) goto Le
            r4.onContentChanged()
        Le:
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r4.mCancellingTask
            r2 = 0
            if (r0 == 0) goto L27
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r4.mTask
            boolean r0 = r0.waiting
            if (r0 == 0) goto L24
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r4.mTask
            r0.waiting = r1
            android.os.Handler r0 = r4.mHandler
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r3 = r4.mTask
            r0.removeCallbacks(r3)
        L24:
            r4.mTask = r2
            return r1
        L27:
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r4.mTask
            boolean r0 = r0.waiting
            if (r0 == 0) goto L3b
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r4.mTask
            r0.waiting = r1
            android.os.Handler r0 = r4.mHandler
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r3 = r4.mTask
            r0.removeCallbacks(r3)
            r4.mTask = r2
            return r1
        L3b:
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r4.mTask
            boolean r0 = r0.cancel(r1)
            if (r0 == 0) goto L4a
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r1 = r4.mTask
            r4.mCancellingTask = r1
            r4.cancelLoadInBackground()
        L4a:
            r4.mTask = r2
            return r0
        L4d:
            return r1
    }

    public void onCanceled(D r1) {
            r0 = this;
            return
    }

    @Override // androidx.loader.content.Loader
    protected void onForceLoad() {
            r1 = this;
            super.onForceLoad()
            r1.cancelLoad()
            androidx.loader.content.AsyncTaskLoader$LoadTask r0 = new androidx.loader.content.AsyncTaskLoader$LoadTask
            r0.<init>(r1)
            r1.mTask = r0
            r1.executePendingTask()
            return
    }

    protected D onLoadInBackground() {
            r1 = this;
            java.lang.Object r0 = r1.loadInBackground()
            return r0
    }

    public void setUpdateThrottle(long r4) {
            r3 = this;
            r3.mUpdateThrottle = r4
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto Lf
            android.os.Handler r4 = new android.os.Handler
            r4.<init>()
            r3.mHandler = r4
        Lf:
            return
    }
}
