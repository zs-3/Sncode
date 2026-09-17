package kotlinx.coroutines;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes2.dex */
final class Active implements kotlinx.coroutines.NotCompleted {
    public static final kotlinx.coroutines.Active INSTANCE = null;

    static {
            kotlinx.coroutines.Active r0 = new kotlinx.coroutines.Active
            r0.<init>()
            kotlinx.coroutines.Active.INSTANCE = r0
            return
    }

    private Active() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Active"
            return r0
    }
}
