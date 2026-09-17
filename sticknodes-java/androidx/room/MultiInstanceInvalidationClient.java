package androidx.room;

/* loaded from: classes.dex */
class MultiInstanceInvalidationClient {
    final android.content.Context mAppContext;
    final androidx.room.IMultiInstanceInvalidationCallback mCallback;
    int mClientId;
    final java.util.concurrent.Executor mExecutor;
    final androidx.room.InvalidationTracker mInvalidationTracker;
    final java.lang.String mName;
    final androidx.room.InvalidationTracker.Observer mObserver;
    final java.lang.Runnable mRemoveObserverRunnable;
    androidx.room.IMultiInstanceInvalidationService mService;
    final android.content.ServiceConnection mServiceConnection;
    final java.lang.Runnable mSetUpRunnable;
    final java.util.concurrent.atomic.AtomicBoolean mStopped;
    private final java.lang.Runnable mTearDownRunnable;







    MultiInstanceInvalidationClient(android.content.Context r4, java.lang.String r5, androidx.room.InvalidationTracker r6, java.util.concurrent.Executor r7) {
            r3 = this;
            r3.<init>()
            androidx.room.MultiInstanceInvalidationClient$1 r0 = new androidx.room.MultiInstanceInvalidationClient$1
            r0.<init>(r3)
            r3.mCallback = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r3.mStopped = r0
            androidx.room.MultiInstanceInvalidationClient$2 r0 = new androidx.room.MultiInstanceInvalidationClient$2
            r0.<init>(r3)
            r3.mServiceConnection = r0
            androidx.room.MultiInstanceInvalidationClient$3 r2 = new androidx.room.MultiInstanceInvalidationClient$3
            r2.<init>(r3)
            r3.mSetUpRunnable = r2
            androidx.room.MultiInstanceInvalidationClient$4 r2 = new androidx.room.MultiInstanceInvalidationClient$4
            r2.<init>(r3)
            r3.mRemoveObserverRunnable = r2
            androidx.room.MultiInstanceInvalidationClient$5 r2 = new androidx.room.MultiInstanceInvalidationClient$5
            r2.<init>(r3)
            r3.mTearDownRunnable = r2
            android.content.Context r4 = r4.getApplicationContext()
            r3.mAppContext = r4
            r3.mName = r5
            r3.mInvalidationTracker = r6
            r3.mExecutor = r7
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r6.mTableIdLookup
            java.util.Set r5 = r5.keySet()
            androidx.room.MultiInstanceInvalidationClient$6 r6 = new androidx.room.MultiInstanceInvalidationClient$6
            java.lang.String[] r7 = new java.lang.String[r1]
            java.lang.Object[] r5 = r5.toArray(r7)
            java.lang.String[] r5 = (java.lang.String[]) r5
            r6.<init>(r3, r5)
            r3.mObserver = r6
            android.content.Intent r5 = new android.content.Intent
            java.lang.Class<androidx.room.MultiInstanceInvalidationService> r6 = androidx.room.MultiInstanceInvalidationService.class
            r5.<init>(r4, r6)
            r6 = 1
            r4.bindService(r5, r0, r6)
            return
    }
}
