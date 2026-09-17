package kotlinx.coroutines;

/* compiled from: DebugStrings.kt */
/* loaded from: classes2.dex */
public final class DebugStringsKt {
    public static final java.lang.String getClassSimpleName(java.lang.Object r0) {
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    public static final java.lang.String getHexAddress(java.lang.Object r0) {
            int r0 = java.lang.System.identityHashCode(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            return r0
    }

    public static final java.lang.String toDebugString(kotlin.coroutines.Continuation<?> r3) {
            boolean r0 = r3 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r0 == 0) goto L9
            java.lang.String r3 = r3.toString()
            goto L5b
        L9:
            r0 = 64
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r1.<init>()     // Catch: java.lang.Throwable -> L28
            r1.append(r3)     // Catch: java.lang.Throwable -> L28
            r1.append(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = getHexAddress(r3)     // Catch: java.lang.Throwable -> L28
            r1.append(r2)     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L28
            java.lang.Object r1 = kotlin.Result.m72constructorimpl(r1)     // Catch: java.lang.Throwable -> L28
            goto L33
        L28:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m72constructorimpl(r1)
        L33:
            java.lang.Throwable r2 = kotlin.Result.m73exceptionOrNullimpl(r1)
            if (r2 != 0) goto L3a
            goto L58
        L3a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r3 = getHexAddress(r3)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
        L58:
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
        L5b:
            return r3
    }
}
