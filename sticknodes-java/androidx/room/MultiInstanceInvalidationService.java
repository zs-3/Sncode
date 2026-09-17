package androidx.room;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends android.app.Service {
    private final androidx.room.IMultiInstanceInvalidationService.Stub mBinder;
    final android.os.RemoteCallbackList<androidx.room.IMultiInstanceInvalidationCallback> mCallbackList;
    final java.util.HashMap<java.lang.Integer, java.lang.String> mClientNames;
    int mMaxClientId;



    public MultiInstanceInvalidationService() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mMaxClientId = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mClientNames = r0
            androidx.room.MultiInstanceInvalidationService$1 r0 = new androidx.room.MultiInstanceInvalidationService$1
            r0.<init>(r1)
            r1.mCallbackList = r0
            androidx.room.MultiInstanceInvalidationService$2 r0 = new androidx.room.MultiInstanceInvalidationService$2
            r0.<init>(r1)
            r1.mBinder = r0
            return
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            androidx.room.IMultiInstanceInvalidationService$Stub r1 = r0.mBinder
            return r1
    }
}
