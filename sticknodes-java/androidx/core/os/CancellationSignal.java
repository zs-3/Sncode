package androidx.core.os;

/* loaded from: classes.dex */
public final class CancellationSignal {
    private boolean mCancelInProgress;
    private java.lang.Object mCancellationSignalObj;
    private boolean mIsCanceled;
    private androidx.core.os.CancellationSignal.OnCancelListener mOnCancelListener;

    static class Api16Impl {
        static void cancel(java.lang.Object r0) {
                android.os.CancellationSignal r0 = (android.os.CancellationSignal) r0
                r0.cancel()
                return
        }

        static android.os.CancellationSignal createCancellationSignal() {
                android.os.CancellationSignal r0 = new android.os.CancellationSignal
                r0.<init>()
                return r0
        }
    }

    public interface OnCancelListener {
        void onCancel();
    }

    public CancellationSignal() {
            r0 = this;
            r0.<init>()
            return
    }

    private void waitForCancelFinishedLocked() {
            r1 = this;
        L0:
            boolean r0 = r1.mCancelInProgress
            if (r0 == 0) goto La
            r1.wait()     // Catch: java.lang.InterruptedException -> L8
            goto L0
        L8:
            goto L0
        La:
            return
    }

    public void cancel() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.mIsCanceled     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L7
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            return
        L7:
            r0 = 1
            r3.mIsCanceled = r0     // Catch: java.lang.Throwable -> L36
            r3.mCancelInProgress = r0     // Catch: java.lang.Throwable -> L36
            androidx.core.os.CancellationSignal$OnCancelListener r0 = r3.mOnCancelListener     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r3.mCancellationSignalObj     // Catch: java.lang.Throwable -> L36
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            r2 = 0
            if (r0 == 0) goto L1a
            r0.onCancel()     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r0 = move-exception
            goto L20
        L1a:
            if (r1 == 0) goto L2b
            androidx.core.os.CancellationSignal.Api16Impl.cancel(r1)     // Catch: java.lang.Throwable -> L18
            goto L2b
        L20:
            monitor-enter(r3)
            r3.mCancelInProgress = r2     // Catch: java.lang.Throwable -> L28
            r3.notifyAll()     // Catch: java.lang.Throwable -> L28
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
            throw r0
        L28:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
            throw r0
        L2b:
            monitor-enter(r3)
            r3.mCancelInProgress = r2     // Catch: java.lang.Throwable -> L33
            r3.notifyAll()     // Catch: java.lang.Throwable -> L33
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            throw r0
        L36:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            throw r0
    }

    public void setOnCancelListener(androidx.core.os.CancellationSignal.OnCancelListener r2) {
            r1 = this;
            monitor-enter(r1)
            r1.waitForCancelFinishedLocked()     // Catch: java.lang.Throwable -> L1a
            androidx.core.os.CancellationSignal$OnCancelListener r0 = r1.mOnCancelListener     // Catch: java.lang.Throwable -> L1a
            if (r0 != r2) goto La
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            return
        La:
            r1.mOnCancelListener = r2     // Catch: java.lang.Throwable -> L1a
            boolean r0 = r1.mIsCanceled     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L18
            if (r2 != 0) goto L13
            goto L18
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            r2.onCancel()
            return
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r2
    }
}
