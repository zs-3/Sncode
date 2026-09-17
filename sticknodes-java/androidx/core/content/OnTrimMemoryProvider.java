package androidx.core.content;

/* loaded from: classes.dex */
public interface OnTrimMemoryProvider {
    void addOnTrimMemoryListener(androidx.core.util.Consumer<java.lang.Integer> r1);

    void removeOnTrimMemoryListener(androidx.core.util.Consumer<java.lang.Integer> r1);
}
