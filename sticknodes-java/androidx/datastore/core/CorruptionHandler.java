package androidx.datastore.core;

/* compiled from: CorruptionHandler.kt */
/* loaded from: classes.dex */
public interface CorruptionHandler<T> {
    java.lang.Object handleCorruption(androidx.datastore.core.CorruptionException r1, kotlin.coroutines.Continuation<? super T> r2);
}
