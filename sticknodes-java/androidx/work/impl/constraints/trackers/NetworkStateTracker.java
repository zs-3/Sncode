package androidx.work.impl.constraints.trackers;

/* loaded from: classes.dex */
public class NetworkStateTracker extends androidx.work.impl.constraints.trackers.ConstraintTracker<androidx.work.impl.constraints.NetworkState> {
    static final java.lang.String TAG = null;
    private androidx.work.impl.constraints.trackers.NetworkStateTracker.NetworkStateBroadcastReceiver mBroadcastReceiver;
    private final android.net.ConnectivityManager mConnectivityManager;
    private androidx.work.impl.constraints.trackers.NetworkStateTracker.NetworkStateCallback mNetworkCallback;

    private class NetworkStateBroadcastReceiver extends android.content.BroadcastReceiver {
        final /* synthetic */ androidx.work.impl.constraints.trackers.NetworkStateTracker this$0;

        NetworkStateBroadcastReceiver(androidx.work.impl.constraints.trackers.NetworkStateTracker r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r3, android.content.Intent r4) {
                r2 = this;
                if (r4 == 0) goto L2c
                java.lang.String r3 = r4.getAction()
                if (r3 != 0) goto L9
                goto L2c
            L9:
                java.lang.String r3 = r4.getAction()
                java.lang.String r4 = "android.net.conn.CONNECTIVITY_CHANGE"
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L2c
                androidx.work.Logger r3 = androidx.work.Logger.get()
                java.lang.String r4 = androidx.work.impl.constraints.trackers.NetworkStateTracker.TAG
                r0 = 0
                java.lang.Throwable[] r0 = new java.lang.Throwable[r0]
                java.lang.String r1 = "Network broadcast received"
                r3.debug(r4, r1, r0)
                androidx.work.impl.constraints.trackers.NetworkStateTracker r3 = r2.this$0
                androidx.work.impl.constraints.NetworkState r4 = r3.getActiveNetworkState()
                r3.setState(r4)
            L2c:
                return
        }
    }

    private class NetworkStateCallback extends android.net.ConnectivityManager.NetworkCallback {
        final /* synthetic */ androidx.work.impl.constraints.trackers.NetworkStateTracker this$0;

        NetworkStateCallback(androidx.work.impl.constraints.trackers.NetworkStateTracker r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(android.net.Network r4, android.net.NetworkCapabilities r5) {
                r3 = this;
                androidx.work.Logger r4 = androidx.work.Logger.get()
                java.lang.String r0 = androidx.work.impl.constraints.trackers.NetworkStateTracker.TAG
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r5
                java.lang.String r5 = "Network capabilities changed: %s"
                java.lang.String r5 = java.lang.String.format(r5, r1)
                java.lang.Throwable[] r1 = new java.lang.Throwable[r2]
                r4.debug(r0, r5, r1)
                androidx.work.impl.constraints.trackers.NetworkStateTracker r4 = r3.this$0
                androidx.work.impl.constraints.NetworkState r5 = r4.getActiveNetworkState()
                r4.setState(r5)
                return
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(android.net.Network r4) {
                r3 = this;
                androidx.work.Logger r4 = androidx.work.Logger.get()
                java.lang.String r0 = androidx.work.impl.constraints.trackers.NetworkStateTracker.TAG
                r1 = 0
                java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
                java.lang.String r2 = "Network connection lost"
                r4.debug(r0, r2, r1)
                androidx.work.impl.constraints.trackers.NetworkStateTracker r4 = r3.this$0
                androidx.work.impl.constraints.NetworkState r0 = r4.getActiveNetworkState()
                r4.setState(r0)
                return
        }
    }

    static {
            java.lang.String r0 = "NetworkStateTracker"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.constraints.trackers.NetworkStateTracker.TAG = r0
            return
    }

    public NetworkStateTracker(android.content.Context r1, androidx.work.impl.utils.taskexecutor.TaskExecutor r2) {
            r0 = this;
            r0.<init>(r1, r2)
            android.content.Context r1 = r0.mAppContext
            java.lang.String r2 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            r0.mConnectivityManager = r1
            boolean r1 = isNetworkCallbackSupported()
            if (r1 == 0) goto L1d
            androidx.work.impl.constraints.trackers.NetworkStateTracker$NetworkStateCallback r1 = new androidx.work.impl.constraints.trackers.NetworkStateTracker$NetworkStateCallback
            r1.<init>(r0)
            r0.mNetworkCallback = r1
            goto L24
        L1d:
            androidx.work.impl.constraints.trackers.NetworkStateTracker$NetworkStateBroadcastReceiver r1 = new androidx.work.impl.constraints.trackers.NetworkStateTracker$NetworkStateBroadcastReceiver
            r1.<init>(r0)
            r0.mBroadcastReceiver = r1
        L24:
            return
    }

    private static boolean isNetworkCallbackSupported() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    androidx.work.impl.constraints.NetworkState getActiveNetworkState() {
            r6 = this;
            android.net.ConnectivityManager r0 = r6.mConnectivityManager
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L12
            boolean r3 = r0.isConnected()
            if (r3 == 0) goto L12
            r3 = 1
            goto L13
        L12:
            r3 = 0
        L13:
            boolean r4 = r6.isActiveNetworkValidated()
            android.net.ConnectivityManager r5 = r6.mConnectivityManager
            boolean r5 = androidx.core.net.ConnectivityManagerCompat.isActiveNetworkMetered(r5)
            if (r0 == 0) goto L26
            boolean r0 = r0.isRoaming()
            if (r0 != 0) goto L26
            goto L27
        L26:
            r1 = 0
        L27:
            androidx.work.impl.constraints.NetworkState r0 = new androidx.work.impl.constraints.NetworkState
            r0.<init>(r3, r4, r5, r1)
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public androidx.work.impl.constraints.NetworkState getInitialState() {
            r1 = this;
            androidx.work.impl.constraints.NetworkState r0 = r1.getActiveNetworkState()
            return r0
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public /* bridge */ /* synthetic */ androidx.work.impl.constraints.NetworkState getInitialState() {
            r1 = this;
            androidx.work.impl.constraints.NetworkState r0 = r1.getInitialState()
            return r0
    }

    boolean isActiveNetworkValidated() {
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 23
            if (r0 >= r2) goto L8
            return r1
        L8:
            r0 = 1
            android.net.ConnectivityManager r2 = r5.mConnectivityManager     // Catch: java.lang.SecurityException -> L21
            android.net.Network r2 = r2.getActiveNetwork()     // Catch: java.lang.SecurityException -> L21
            android.net.ConnectivityManager r3 = r5.mConnectivityManager     // Catch: java.lang.SecurityException -> L21
            android.net.NetworkCapabilities r2 = r3.getNetworkCapabilities(r2)     // Catch: java.lang.SecurityException -> L21
            if (r2 == 0) goto L20
            r3 = 16
            boolean r2 = r2.hasCapability(r3)     // Catch: java.lang.SecurityException -> L21
            if (r2 == 0) goto L20
            r1 = 1
        L20:
            return r1
        L21:
            r2 = move-exception
            androidx.work.Logger r3 = androidx.work.Logger.get()
            java.lang.String r4 = androidx.work.impl.constraints.trackers.NetworkStateTracker.TAG
            java.lang.Throwable[] r0 = new java.lang.Throwable[r0]
            r0[r1] = r2
            java.lang.String r2 = "Unable to validate active network"
            r3.error(r4, r2, r0)
            return r1
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void startTracking() {
            r5 = this;
            boolean r0 = isNetworkCallbackSupported()
            r1 = 0
            if (r0 == 0) goto L30
            androidx.work.Logger r0 = androidx.work.Logger.get()     // Catch: java.lang.SecurityException -> L1c java.lang.IllegalArgumentException -> L1e
            java.lang.String r2 = androidx.work.impl.constraints.trackers.NetworkStateTracker.TAG     // Catch: java.lang.SecurityException -> L1c java.lang.IllegalArgumentException -> L1e
            java.lang.String r3 = "Registering network callback"
            java.lang.Throwable[] r4 = new java.lang.Throwable[r1]     // Catch: java.lang.SecurityException -> L1c java.lang.IllegalArgumentException -> L1e
            r0.debug(r2, r3, r4)     // Catch: java.lang.SecurityException -> L1c java.lang.IllegalArgumentException -> L1e
            android.net.ConnectivityManager r0 = r5.mConnectivityManager     // Catch: java.lang.SecurityException -> L1c java.lang.IllegalArgumentException -> L1e
            androidx.work.impl.constraints.trackers.NetworkStateTracker$NetworkStateCallback r2 = r5.mNetworkCallback     // Catch: java.lang.SecurityException -> L1c java.lang.IllegalArgumentException -> L1e
            r0.registerDefaultNetworkCallback(r2)     // Catch: java.lang.SecurityException -> L1c java.lang.IllegalArgumentException -> L1e
            goto L4b
        L1c:
            r0 = move-exception
            goto L1f
        L1e:
            r0 = move-exception
        L1f:
            androidx.work.Logger r2 = androidx.work.Logger.get()
            java.lang.String r3 = androidx.work.impl.constraints.trackers.NetworkStateTracker.TAG
            r4 = 1
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
            r4[r1] = r0
            java.lang.String r0 = "Received exception while registering network callback"
            r2.error(r3, r0, r4)
            goto L4b
        L30:
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r2 = androidx.work.impl.constraints.trackers.NetworkStateTracker.TAG
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            java.lang.String r3 = "Registering broadcast receiver"
            r0.debug(r2, r3, r1)
            android.content.Context r0 = r5.mAppContext
            androidx.work.impl.constraints.trackers.NetworkStateTracker$NetworkStateBroadcastReceiver r1 = r5.mBroadcastReceiver
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r3 = "android.net.conn.CONNECTIVITY_CHANGE"
            r2.<init>(r3)
            r0.registerReceiver(r1, r2)
        L4b:
            return
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void stopTracking() {
            r5 = this;
            boolean r0 = isNetworkCallbackSupported()
            r1 = 0
            if (r0 == 0) goto L30
            androidx.work.Logger r0 = androidx.work.Logger.get()     // Catch: java.lang.SecurityException -> L1c java.lang.IllegalArgumentException -> L1e
            java.lang.String r2 = androidx.work.impl.constraints.trackers.NetworkStateTracker.TAG     // Catch: java.lang.SecurityException -> L1c java.lang.IllegalArgumentException -> L1e
            java.lang.String r3 = "Unregistering network callback"
            java.lang.Throwable[] r4 = new java.lang.Throwable[r1]     // Catch: java.lang.SecurityException -> L1c java.lang.IllegalArgumentException -> L1e
            r0.debug(r2, r3, r4)     // Catch: java.lang.SecurityException -> L1c java.lang.IllegalArgumentException -> L1e
            android.net.ConnectivityManager r0 = r5.mConnectivityManager     // Catch: java.lang.SecurityException -> L1c java.lang.IllegalArgumentException -> L1e
            androidx.work.impl.constraints.trackers.NetworkStateTracker$NetworkStateCallback r2 = r5.mNetworkCallback     // Catch: java.lang.SecurityException -> L1c java.lang.IllegalArgumentException -> L1e
            r0.unregisterNetworkCallback(r2)     // Catch: java.lang.SecurityException -> L1c java.lang.IllegalArgumentException -> L1e
            goto L44
        L1c:
            r0 = move-exception
            goto L1f
        L1e:
            r0 = move-exception
        L1f:
            androidx.work.Logger r2 = androidx.work.Logger.get()
            java.lang.String r3 = androidx.work.impl.constraints.trackers.NetworkStateTracker.TAG
            r4 = 1
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
            r4[r1] = r0
            java.lang.String r0 = "Received exception while unregistering network callback"
            r2.error(r3, r0, r4)
            goto L44
        L30:
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r2 = androidx.work.impl.constraints.trackers.NetworkStateTracker.TAG
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            java.lang.String r3 = "Unregistering broadcast receiver"
            r0.debug(r2, r3, r1)
            android.content.Context r0 = r5.mAppContext
            androidx.work.impl.constraints.trackers.NetworkStateTracker$NetworkStateBroadcastReceiver r1 = r5.mBroadcastReceiver
            r0.unregisterReceiver(r1)
        L44:
            return
    }
}
