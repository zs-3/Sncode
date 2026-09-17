package kotlinx.coroutines;

/* compiled from: Job.kt */
/* loaded from: classes2.dex */
public final class NonDisposableHandle implements kotlinx.coroutines.DisposableHandle, kotlinx.coroutines.ChildHandle {
    public static final kotlinx.coroutines.NonDisposableHandle INSTANCE = null;

    static {
            kotlinx.coroutines.NonDisposableHandle r0 = new kotlinx.coroutines.NonDisposableHandle
            r0.<init>()
            kotlinx.coroutines.NonDisposableHandle.INSTANCE = r0
            return
    }

    private NonDisposableHandle() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.ChildHandle
    public boolean childCancelled(java.lang.Throwable r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public void dispose() {
            r0 = this;
            return
    }

    @Override // kotlinx.coroutines.ChildHandle
    public kotlinx.coroutines.Job getParent() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "NonDisposableHandle"
            return r0
    }
}
