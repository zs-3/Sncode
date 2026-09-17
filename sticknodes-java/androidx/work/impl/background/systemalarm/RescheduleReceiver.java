package androidx.work.impl.background.systemalarm;

/* loaded from: classes.dex */
public class RescheduleReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String TAG = null;

    static {
            java.lang.String r0 = "RescheduleReceiver"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.background.systemalarm.RescheduleReceiver.TAG = r0
            return
    }

    public RescheduleReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r6, android.content.Intent r7) {
            r5 = this;
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.TAG
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r7
            java.lang.String r7 = "Received intent %s"
            java.lang.String r7 = java.lang.String.format(r7, r3)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r4]
            r0.debug(r1, r7, r3)
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r7 < r0) goto L3a
            androidx.work.impl.WorkManagerImpl r6 = androidx.work.impl.WorkManagerImpl.getInstance(r6)     // Catch: java.lang.IllegalStateException -> L29
            android.content.BroadcastReceiver$PendingResult r7 = r5.goAsync()     // Catch: java.lang.IllegalStateException -> L29
            r6.setReschedulePendingResult(r7)     // Catch: java.lang.IllegalStateException -> L29
            goto L41
        L29:
            r6 = move-exception
            androidx.work.Logger r7 = androidx.work.Logger.get()
            java.lang.String r0 = androidx.work.impl.background.systemalarm.RescheduleReceiver.TAG
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]
            r1[r4] = r6
            java.lang.String r6 = "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate()."
            r7.error(r0, r6, r1)
            goto L41
        L3a:
            android.content.Intent r7 = androidx.work.impl.background.systemalarm.CommandHandler.createRescheduleIntent(r6)
            r6.startService(r7)
        L41:
            return
    }
}
