package androidx.datastore.core;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SingleProcessDataStore.kt */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", l = {239, 242}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SingleProcessDataStore$actor$3<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.datastore.core.SingleProcessDataStore.Message<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ androidx.datastore.core.SingleProcessDataStore<T> this$0;

    SingleProcessDataStore$actor$3(androidx.datastore.core.SingleProcessDataStore<T> r1, kotlin.coroutines.Continuation<? super androidx.datastore.core.SingleProcessDataStore$actor$3> r2) {
            r0 = this;
            r0.this$0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            androidx.datastore.core.SingleProcessDataStore$actor$3 r0 = new androidx.datastore.core.SingleProcessDataStore$actor$3
            androidx.datastore.core.SingleProcessDataStore<T> r1 = r2.this$0
            r0.<init>(r1, r4)
            r0.L$0 = r3
            return r0
    }

    public final java.lang.Object invoke(androidx.datastore.core.SingleProcessDataStore.Message<T> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            androidx.datastore.core.SingleProcessDataStore$actor$3 r1 = (androidx.datastore.core.SingleProcessDataStore$actor$3) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            androidx.datastore.core.SingleProcessDataStore$Message r1 = (androidx.datastore.core.SingleProcessDataStore.Message) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke(r1, r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            kotlin.ResultKt.throwOnFailure(r5)
            goto L44
        L1b:
            kotlin.ResultKt.throwOnFailure(r5)
            java.lang.Object r5 = r4.L$0
            androidx.datastore.core.SingleProcessDataStore$Message r5 = (androidx.datastore.core.SingleProcessDataStore.Message) r5
            boolean r1 = r5 instanceof androidx.datastore.core.SingleProcessDataStore.Message.Read
            if (r1 == 0) goto L33
            androidx.datastore.core.SingleProcessDataStore<T> r1 = r4.this$0
            androidx.datastore.core.SingleProcessDataStore$Message$Read r5 = (androidx.datastore.core.SingleProcessDataStore.Message.Read) r5
            r4.label = r3
            java.lang.Object r5 = androidx.datastore.core.SingleProcessDataStore.access$handleRead(r1, r5, r4)
            if (r5 != r0) goto L44
            return r0
        L33:
            boolean r1 = r5 instanceof androidx.datastore.core.SingleProcessDataStore.Message.Update
            if (r1 == 0) goto L44
            androidx.datastore.core.SingleProcessDataStore<T> r1 = r4.this$0
            androidx.datastore.core.SingleProcessDataStore$Message$Update r5 = (androidx.datastore.core.SingleProcessDataStore.Message.Update) r5
            r4.label = r2
            java.lang.Object r5 = androidx.datastore.core.SingleProcessDataStore.access$handleUpdate(r1, r5, r4)
            if (r5 != r0) goto L44
            return r0
        L44:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
    }
}
