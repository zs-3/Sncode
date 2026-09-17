package kotlinx.coroutines.android;

/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes2.dex */
public final class HandlerContext extends kotlinx.coroutines.android.HandlerDispatcher {
    private volatile kotlinx.coroutines.android.HandlerContext _immediate;
    private final android.os.Handler handler;
    private final kotlinx.coroutines.android.HandlerContext immediate;
    private final boolean invokeImmediately;
    private final java.lang.String name;

    public HandlerContext(android.os.Handler r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public /* synthetic */ HandlerContext(android.os.Handler r1, java.lang.String r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    private HandlerContext(android.os.Handler r2, java.lang.String r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.handler = r2
            r1.name = r3
            r1.invokeImmediately = r4
            if (r4 == 0) goto Ld
            r0 = r1
        Ld:
            r1._immediate = r0
            kotlinx.coroutines.android.HandlerContext r4 = r1._immediate
            if (r4 != 0) goto L1b
            kotlinx.coroutines.android.HandlerContext r4 = new kotlinx.coroutines.android.HandlerContext
            r0 = 1
            r4.<init>(r2, r3, r0)
            r1._immediate = r4
        L1b:
            r1.immediate = r4
            return
    }

    private final void cancelOnRejection(kotlin.coroutines.CoroutineContext r4, java.lang.Runnable r5) {
            r3 = this;
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The task was rejected, the handler underlying the dispatcher '"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = "' was closed"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            kotlinx.coroutines.JobKt.cancel(r4, r0)
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getIO()
            r0.mo128dispatch(r4, r5)
            return
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo128dispatch(kotlin.coroutines.CoroutineContext r2, java.lang.Runnable r3) {
            r1 = this;
            android.os.Handler r0 = r1.handler
            boolean r0 = r0.post(r3)
            if (r0 != 0) goto Lb
            r1.cancelOnRejection(r2, r3)
        Lb:
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.android.HandlerContext
            if (r0 == 0) goto Le
            kotlinx.coroutines.android.HandlerContext r2 = (kotlinx.coroutines.android.HandlerContext) r2
            android.os.Handler r2 = r2.handler
            android.os.Handler r0 = r1.handler
            if (r2 != r0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    public /* bridge */ /* synthetic */ kotlinx.coroutines.MainCoroutineDispatcher getImmediate() {
            r1 = this;
            kotlinx.coroutines.android.HandlerContext r0 = r1.getImmediate()
            return r0
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    public kotlinx.coroutines.android.HandlerContext getImmediate() {
            r1 = this;
            kotlinx.coroutines.android.HandlerContext r0 = r1.immediate
            return r0
    }

    public int hashCode() {
            r1 = this;
            android.os.Handler r0 = r1.handler
            int r0 = java.lang.System.identityHashCode(r0)
            return r0
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(kotlin.coroutines.CoroutineContext r2) {
            r1 = this;
            boolean r2 = r1.invokeImmediately
            if (r2 == 0) goto L17
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Handler r0 = r1.handler
            android.os.Looper r0 = r0.getLooper()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r2 != 0) goto L15
            goto L17
        L15:
            r2 = 0
            goto L18
        L17:
            r2 = 1
        L18:
            return r2
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.toStringInternalImpl()
            if (r0 != 0) goto L25
            java.lang.String r0 = r2.name
            if (r0 != 0) goto L10
            android.os.Handler r0 = r2.handler
            java.lang.String r0 = r0.toString()
        L10:
            boolean r1 = r2.invokeImmediately
            if (r1 == 0) goto L25
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ".immediate"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L25:
            return r0
    }
}
