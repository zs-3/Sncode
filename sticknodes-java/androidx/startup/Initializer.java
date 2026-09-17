package androidx.startup;

/* loaded from: classes.dex */
public interface Initializer<T> {
    T create(android.content.Context r1);

    java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies();
}
