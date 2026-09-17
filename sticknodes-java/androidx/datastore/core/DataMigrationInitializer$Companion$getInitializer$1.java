package androidx.datastore.core;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: DataMigrationInitializer.kt */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DataMigrationInitializer$Companion$getInitializer$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.datastore.core.InitializerApi<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.List<androidx.datastore.core.DataMigration<T>> $migrations;
    /* synthetic */ java.lang.Object L$0;
    int label;

    DataMigrationInitializer$Companion$getInitializer$1(java.util.List<? extends androidx.datastore.core.DataMigration<T>> r1, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1> r2) {
            r0 = this;
            r0.$migrations = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1 r0 = new androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1
            java.util.List<androidx.datastore.core.DataMigration<T>> r1 = r2.$migrations
            r0.<init>(r1, r4)
            r0.L$0 = r3
            return r0
    }

    public final java.lang.Object invoke(androidx.datastore.core.InitializerApi<T> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1 r1 = (androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            androidx.datastore.core.InitializerApi r1 = (androidx.datastore.core.InitializerApi) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke(r1, r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r5)
            goto L2b
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            kotlin.ResultKt.throwOnFailure(r5)
            java.lang.Object r5 = r4.L$0
            androidx.datastore.core.InitializerApi r5 = (androidx.datastore.core.InitializerApi) r5
            androidx.datastore.core.DataMigrationInitializer$Companion r1 = androidx.datastore.core.DataMigrationInitializer.Companion
            java.util.List<androidx.datastore.core.DataMigration<T>> r3 = r4.$migrations
            r4.label = r2
            java.lang.Object r5 = androidx.datastore.core.DataMigrationInitializer.Companion.access$runMigrations(r1, r3, r5, r4)
            if (r5 != r0) goto L2b
            return r0
        L2b:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
    }
}
