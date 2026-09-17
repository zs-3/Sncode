package kotlinx.coroutines;

/* compiled from: CompletableDeferred.kt */
/* loaded from: classes2.dex */
public interface CompletableDeferred<T> extends kotlinx.coroutines.Deferred<T> {
    boolean complete(T r1);

    boolean completeExceptionally(java.lang.Throwable r1);
}
