package androidx.datastore.core;

/* compiled from: DataMigrationInitializer.kt */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
/* loaded from: classes.dex */
final class DataMigrationInitializer$Companion$runMigrations$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.datastore.core.DataMigrationInitializer.Companion this$0;

    DataMigrationInitializer$Companion$runMigrations$1(androidx.datastore.core.DataMigrationInitializer.Companion r1, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>(r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r2) {
            r1 = this;
            r1.result = r2
            int r2 = r1.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.label = r2
            androidx.datastore.core.DataMigrationInitializer$Companion r2 = r1.this$0
            r0 = 0
            java.lang.Object r2 = androidx.datastore.core.DataMigrationInitializer.Companion.access$runMigrations(r2, r0, r0, r1)
            return r2
    }
}
