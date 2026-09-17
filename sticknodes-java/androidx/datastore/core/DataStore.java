package androidx.datastore.core;

/* compiled from: DataStore.kt */
/* loaded from: classes.dex */
public interface DataStore<T> {
    kotlinx.coroutines.flow.Flow<T> getData();

    java.lang.Object updateData(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r1, kotlin.coroutines.Continuation<? super T> r2);
}
