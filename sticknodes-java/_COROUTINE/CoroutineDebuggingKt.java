package _COROUTINE;

/* compiled from: CoroutineDebugging.kt */
/* loaded from: classes.dex */
public final class CoroutineDebuggingKt {
    private static final java.lang.String ARTIFICIAL_FRAME_PACKAGE_NAME = "_COROUTINE";

    static {
            return
    }

    public static final /* synthetic */ java.lang.StackTraceElement access$artificialFrame(java.lang.Throwable r0, java.lang.String r1) {
            java.lang.StackTraceElement r0 = artificialFrame(r0, r1)
            return r0
    }

    private static final java.lang.StackTraceElement artificialFrame(java.lang.Throwable r3, java.lang.String r4) {
            java.lang.StackTraceElement[] r3 = r3.getStackTrace()
            r0 = 0
            r3 = r3[r0]
            java.lang.StackTraceElement r0 = new java.lang.StackTraceElement
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = _COROUTINE.CoroutineDebuggingKt.ARTIFICIAL_FRAME_PACKAGE_NAME
            r1.append(r2)
            r2 = 46
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = r3.getFileName()
            int r3 = r3.getLineNumber()
            java.lang.String r2 = "_"
            r0.<init>(r4, r2, r1, r3)
            return r0
    }
}
