package androidx.work;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements androidx.startup.Initializer<androidx.work.WorkManager> {
    private static final java.lang.String TAG = null;

    static {
            java.lang.String r0 = "WrkMgrInitializer"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.WorkManagerInitializer.TAG = r0
            return
    }

    public WorkManagerInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    public androidx.work.WorkManager create(android.content.Context r5) {
            r4 = this;
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.WorkManagerInitializer.TAG
            r2 = 0
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            java.lang.String r3 = "Initializing WorkManager with default configuration."
            r0.debug(r1, r3, r2)
            androidx.work.Configuration$Builder r0 = new androidx.work.Configuration$Builder
            r0.<init>()
            androidx.work.Configuration r0 = r0.build()
            androidx.work.WorkManager.initialize(r5, r0)
            androidx.work.WorkManager r5 = androidx.work.WorkManager.getInstance(r5)
            return r5
    }

    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ androidx.work.WorkManager create(android.content.Context r1) {
            r0 = this;
            androidx.work.WorkManager r1 = r0.create(r1)
            return r1
    }

    @Override // androidx.startup.Initializer
    public java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
            r1 = this;
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }
}
