package kotlinx.coroutines.android;

/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes2.dex */
public final class AndroidDispatcherFactory implements kotlinx.coroutines.internal.MainDispatcherFactory {
    public AndroidDispatcherFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public kotlinx.coroutines.MainCoroutineDispatcher createDispatcher(java.util.List<? extends kotlinx.coroutines.internal.MainDispatcherFactory> r4) {
            r3 = this;
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            if (r4 == 0) goto L13
            kotlinx.coroutines.android.HandlerContext r0 = new kotlinx.coroutines.android.HandlerContext
            r1 = 1
            android.os.Handler r4 = kotlinx.coroutines.android.HandlerDispatcherKt.asHandler(r4, r1)
            r1 = 2
            r2 = 0
            r0.<init>(r4, r2, r1, r2)
            return r0
        L13:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "The main looper is not available"
            r4.<init>(r0)
            throw r4
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public int getLoadPriority() {
            r1 = this;
            r0 = 1073741823(0x3fffffff, float:1.9999999)
            return r0
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public java.lang.String hintOnError() {
            r1 = this;
            java.lang.String r0 = "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used"
            return r0
    }
}
