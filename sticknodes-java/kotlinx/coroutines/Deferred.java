package kotlinx.coroutines;

/* compiled from: Deferred.kt */
/* loaded from: classes2.dex */
public interface Deferred<T> extends kotlinx.coroutines.Job {
    java.lang.Object await(kotlin.coroutines.Continuation<? super T> r1);

    T getCompleted();
}
