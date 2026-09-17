package kotlinx.coroutines.flow;

/* compiled from: Flow.kt */
/* loaded from: classes2.dex */
public interface Flow<T> {
    java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2);
}
