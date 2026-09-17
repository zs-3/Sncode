package kotlinx.coroutines.internal;

/* compiled from: StackTraceRecovery.kt */
/* loaded from: classes2.dex */
public final class StackTraceRecoveryKt {
    private static final java.lang.StackTraceElement ARTIFICIAL_FRAME = null;
    private static final java.lang.String baseContinuationImplClassName = null;
    private static final java.lang.String stackTraceRecoveryClassName = null;

    static {
            java.lang.String r0 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl"
            _COROUTINE.ArtificialStackFrames r1 = new _COROUTINE.ArtificialStackFrames
            r1.<init>()
            java.lang.StackTraceElement r1 = r1.coroutineBoundary()
            kotlinx.coroutines.internal.StackTraceRecoveryKt.ARTIFICIAL_FRAME = r1
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L1c
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = r1.getCanonicalName()     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = kotlin.Result.m72constructorimpl(r1)     // Catch: java.lang.Throwable -> L1c
            goto L27
        L1c:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m72constructorimpl(r1)
        L27:
            java.lang.Throwable r2 = kotlin.Result.m73exceptionOrNullimpl(r1)
            if (r2 != 0) goto L2e
            r0 = r1
        L2e:
            java.lang.String r0 = (java.lang.String) r0
            kotlinx.coroutines.internal.StackTraceRecoveryKt.baseContinuationImplClassName = r0
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L3f
            java.lang.Class<kotlinx.coroutines.internal.StackTraceRecoveryKt> r0 = kotlinx.coroutines.internal.StackTraceRecoveryKt.class
            java.lang.String r0 = r0.getCanonicalName()     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r0 = kotlin.Result.m72constructorimpl(r0)     // Catch: java.lang.Throwable -> L3f
            goto L4a
        L3f:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m72constructorimpl(r0)
        L4a:
            java.lang.Throwable r1 = kotlin.Result.m73exceptionOrNullimpl(r0)
            if (r1 != 0) goto L51
            goto L53
        L51:
            java.lang.String r0 = "kotlinx.coroutines.internal.StackTraceRecoveryKt"
        L53:
            java.lang.String r0 = (java.lang.String) r0
            kotlinx.coroutines.internal.StackTraceRecoveryKt.stackTraceRecoveryClassName = r0
            return
    }

    public static final <E extends java.lang.Throwable> E recoverStackTrace(E r0) {
            return r0
    }
}
