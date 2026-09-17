package kotlin.reflect;

/* compiled from: KProperty.kt */
/* loaded from: classes2.dex */
public interface KProperty2<D, E, V> extends kotlin.reflect.KProperty<V>, kotlin.jvm.functions.Function2<D, E, V> {

    /* compiled from: KProperty.kt */
    public interface Getter<D, E, V> extends kotlin.reflect.KFunction, kotlin.jvm.functions.Function2<D, E, V> {
    }

    V get(D r1, E r2);

    kotlin.reflect.KProperty2.Getter<D, E, V> getGetter();
}
