package androidx.work.impl.diagnostics;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String TAG = null;

    static {
            java.lang.String r0 = "DiagnosticsRcvr"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.diagnostics.DiagnosticsReceiver.TAG = r0
            return
    }

    public DiagnosticsReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r5, android.content.Intent r6) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            androidx.work.Logger r6 = androidx.work.Logger.get()
            java.lang.String r0 = androidx.work.impl.diagnostics.DiagnosticsReceiver.TAG
            r1 = 0
            java.lang.Throwable[] r2 = new java.lang.Throwable[r1]
            java.lang.String r3 = "Requesting diagnostics"
            r6.debug(r0, r3, r2)
            androidx.work.WorkManager r5 = androidx.work.WorkManager.getInstance(r5)     // Catch: java.lang.IllegalStateException -> L1f
            java.lang.Class<androidx.work.impl.workers.DiagnosticsWorker> r6 = androidx.work.impl.workers.DiagnosticsWorker.class
            androidx.work.OneTimeWorkRequest r6 = androidx.work.OneTimeWorkRequest.from(r6)     // Catch: java.lang.IllegalStateException -> L1f
            r5.enqueue(r6)     // Catch: java.lang.IllegalStateException -> L1f
            goto L30
        L1f:
            r5 = move-exception
            androidx.work.Logger r6 = androidx.work.Logger.get()
            java.lang.String r0 = androidx.work.impl.diagnostics.DiagnosticsReceiver.TAG
            r2 = 1
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r2[r1] = r5
            java.lang.String r5 = "WorkManager is not initialized"
            r6.error(r0, r5, r2)
        L30:
            return
    }
}
