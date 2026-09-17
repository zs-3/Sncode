package kotlinx.coroutines;

/* compiled from: Exceptions.kt */
/* loaded from: classes2.dex */
public final class ExceptionsKt {
    public static final java.util.concurrent.CancellationException CancellationException(java.lang.String r1, java.lang.Throwable r2) {
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            r0.initCause(r2)
            return r0
    }
}
