package androidx.datastore.core;

/* compiled from: Serializer.kt */
/* loaded from: classes.dex */
public interface Serializer<T> {
    T getDefaultValue();

    java.lang.Object readFrom(java.io.InputStream r1, kotlin.coroutines.Continuation<? super T> r2);

    java.lang.Object writeTo(T r1, java.io.OutputStream r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3);
}
