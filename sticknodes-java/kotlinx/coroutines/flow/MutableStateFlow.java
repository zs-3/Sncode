package kotlinx.coroutines.flow;

/* compiled from: StateFlow.kt */
/* loaded from: classes2.dex */
public interface MutableStateFlow<T> extends kotlinx.coroutines.flow.Flow, kotlinx.coroutines.flow.FlowCollector {
    T getValue();

    void setValue(T r1);
}
