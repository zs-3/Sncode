package kotlinx.coroutines.selects;

/* compiled from: Select.kt */
/* loaded from: classes2.dex */
public interface SelectInstance<R> {
    kotlin.coroutines.CoroutineContext getContext();

    void selectInRegistrationPhase(java.lang.Object r1);

    boolean trySelect(java.lang.Object r1, java.lang.Object r2);
}
