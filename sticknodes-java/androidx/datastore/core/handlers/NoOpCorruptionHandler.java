package androidx.datastore.core.handlers;

/* compiled from: NoOpCorruptionHandler.kt */
/* loaded from: classes.dex */
public final class NoOpCorruptionHandler<T> implements androidx.datastore.core.CorruptionHandler<T> {
    public NoOpCorruptionHandler() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.datastore.core.CorruptionHandler
    public java.lang.Object handleCorruption(androidx.datastore.core.CorruptionException r1, kotlin.coroutines.Continuation<? super T> r2) throws androidx.datastore.core.CorruptionException {
            r0 = this;
            throw r1
    }
}
