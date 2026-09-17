package androidx.work;

@android.annotation.SuppressLint({"AddedAbstractMethod"})
/* loaded from: classes.dex */
public abstract class WorkManager {
    protected WorkManager() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.work.WorkManager getInstance(android.content.Context r0) {
            androidx.work.impl.WorkManagerImpl r0 = androidx.work.impl.WorkManagerImpl.getInstance(r0)
            return r0
    }

    public static void initialize(android.content.Context r0, androidx.work.Configuration r1) {
            androidx.work.impl.WorkManagerImpl.initialize(r0, r1)
            return
    }

    public abstract androidx.work.Operation cancelAllWorkByTag(java.lang.String r1);

    public final androidx.work.Operation enqueue(androidx.work.WorkRequest r1) {
            r0 = this;
            java.util.List r1 = java.util.Collections.singletonList(r1)
            androidx.work.Operation r1 = r0.enqueue(r1)
            return r1
    }

    public abstract androidx.work.Operation enqueue(java.util.List<? extends androidx.work.WorkRequest> r1);
}
