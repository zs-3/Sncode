package androidx.datastore.core;

/* compiled from: SingleProcessDataStore.kt */
/* loaded from: classes.dex */
final class Final<T> extends androidx.datastore.core.State<T> {
    private final java.lang.Throwable finalException;

    public Final(java.lang.Throwable r2) {
            r1 = this;
            java.lang.String r0 = "finalException"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            r1.<init>(r0)
            r1.finalException = r2
            return
    }

    public final java.lang.Throwable getFinalException() {
            r1 = this;
            java.lang.Throwable r0 = r1.finalException
            return r0
    }
}
