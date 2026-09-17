package androidx.datastore.core;

/* compiled from: DataMigrationInitializer.kt */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DataMigrationInitializer$Companion$runMigrations$2$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.datastore.core.DataMigration<T> $migration;
    int label;

    DataMigrationInitializer$Companion$runMigrations$2$1$1(androidx.datastore.core.DataMigration<T> r1, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1> r2) {
            r0 = this;
            r0.$migration = r1
            r1 = 1
            r0.<init>(r1, r2)
            return
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> r3) {
            r2 = this;
            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1 r0 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1
            androidx.datastore.core.DataMigration<T> r1 = r2.$migration
            r0.<init>(r1, r3)
            return r0
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> r1) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.invoke2(r1)
            return r1
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r1 = this;
            kotlin.coroutines.Continuation r2 = r1.create(r2)
            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1 r2 = (androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1) r2
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.lang.Object r2 = r2.invokeSuspend(r0)
            return r2
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r4)
            goto L25
        Lf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L17:
            kotlin.ResultKt.throwOnFailure(r4)
            androidx.datastore.core.DataMigration<T> r4 = r3.$migration
            r3.label = r2
            java.lang.Object r4 = r4.cleanUp(r3)
            if (r4 != r0) goto L25
            return r0
        L25:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
    }
}
