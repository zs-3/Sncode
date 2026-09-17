package androidx.work.impl.background.systemalarm;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends android.content.BroadcastReceiver {
    static final java.lang.String TAG = null;


    static {
            java.lang.String r0 = "ConstrntProxyUpdtRecvr"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.TAG = r0
            return
    }

    public ConstraintProxyUpdateReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.Intent newConstraintProxyUpdateIntent(android.content.Context r3, boolean r4, boolean r5, boolean r6, boolean r7) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "androidx.work.impl.background.systemalarm.UpdateProxies"
            r0.<init>(r1)
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.Class<androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver> r2 = androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.class
            r1.<init>(r3, r2)
            r0.setComponent(r1)
            java.lang.String r3 = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED"
            android.content.Intent r3 = r0.putExtra(r3, r4)
            java.lang.String r4 = "KEY_BATTERY_CHARGING_PROXY_ENABLED"
            android.content.Intent r3 = r3.putExtra(r4, r5)
            java.lang.String r4 = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED"
            android.content.Intent r3 = r3.putExtra(r4, r6)
            java.lang.String r4 = "KEY_NETWORK_STATE_PROXY_ENABLED"
            r3.putExtra(r4, r7)
            return r0
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r4, android.content.Intent r5) {
            r3 = this;
            if (r5 == 0) goto L7
            java.lang.String r0 = r5.getAction()
            goto L8
        L7:
            r0 = 0
        L8:
            java.lang.String r1 = "androidx.work.impl.background.systemalarm.UpdateProxies"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L28
            androidx.work.Logger r4 = androidx.work.Logger.get()
            java.lang.String r5 = androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.TAG
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "Ignoring unknown action %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]
            r4.debug(r5, r0, r1)
            goto L3c
        L28:
            android.content.BroadcastReceiver$PendingResult r0 = r3.goAsync()
            androidx.work.impl.WorkManagerImpl r1 = androidx.work.impl.WorkManagerImpl.getInstance(r4)
            androidx.work.impl.utils.taskexecutor.TaskExecutor r1 = r1.getWorkTaskExecutor()
            androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$1 r2 = new androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$1
            r2.<init>(r3, r5, r4, r0)
            r1.executeOnBackgroundThread(r2)
        L3c:
            return
    }
}
