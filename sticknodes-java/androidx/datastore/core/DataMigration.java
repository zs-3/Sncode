package androidx.datastore.core;

/* compiled from: DataMigration.kt */
/* loaded from: classes.dex */
public interface DataMigration<T> {
    java.lang.Object cleanUp(kotlin.coroutines.Continuation<? super kotlin.Unit> r1);

    java.lang.Object migrate(T r1, kotlin.coroutines.Continuation<? super T> r2);

    java.lang.Object shouldMigrate(T r1, kotlin.coroutines.Continuation<? super java.lang.Boolean> r2);
}
