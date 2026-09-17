package _COROUTINE;

/* compiled from: CoroutineDebugging.kt */
/* loaded from: classes.dex */
public final class ArtificialStackFrames {
    public ArtificialStackFrames() {
            r0 = this;
            r0.<init>()
            return
    }

    public final java.lang.StackTraceElement coroutineBoundary() {
            r2 = this;
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.Class<_COROUTINE._BOUNDARY> r1 = _COROUTINE._BOUNDARY.class
            java.lang.String r1 = r1.getSimpleName()
            java.lang.StackTraceElement r0 = _COROUTINE.CoroutineDebuggingKt.access$artificialFrame(r0, r1)
            return r0
    }
}
