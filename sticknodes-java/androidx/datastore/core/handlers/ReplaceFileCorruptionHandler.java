package androidx.datastore.core.handlers;

/* compiled from: ReplaceFileCorruptionHandler.kt */
/* loaded from: classes.dex */
public final class ReplaceFileCorruptionHandler<T> implements androidx.datastore.core.CorruptionHandler<T> {
    private final kotlin.jvm.functions.Function1<androidx.datastore.core.CorruptionException, T> produceNewData;

    public ReplaceFileCorruptionHandler(kotlin.jvm.functions.Function1<? super androidx.datastore.core.CorruptionException, ? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "produceNewData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.produceNewData = r2
            return
    }

    @Override // androidx.datastore.core.CorruptionHandler
    public java.lang.Object handleCorruption(androidx.datastore.core.CorruptionException r1, kotlin.coroutines.Continuation<? super T> r2) throws java.io.IOException {
            r0 = this;
            kotlin.jvm.functions.Function1<androidx.datastore.core.CorruptionException, T> r2 = r0.produceNewData
            java.lang.Object r1 = r2.invoke(r1)
            return r1
    }
}
