package kotlin.io;

/* compiled from: Closeable.kt */
/* loaded from: classes2.dex */
public final class CloseableKt {
    public static final void closeFinally(java.io.Closeable r0, java.lang.Throwable r1) {
            if (r0 == 0) goto L10
            if (r1 != 0) goto L8
            r0.close()
            goto L10
        L8:
            r0.close()     // Catch: java.lang.Throwable -> Lc
            goto L10
        Lc:
            r0 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r1, r0)
        L10:
            return
    }
}
