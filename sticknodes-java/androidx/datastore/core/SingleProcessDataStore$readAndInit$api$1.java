package androidx.datastore.core;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SingleProcessDataStore.kt */
/* loaded from: classes.dex */
public final class SingleProcessDataStore$readAndInit$api$1<T> implements androidx.datastore.core.InitializerApi<T> {
    final /* synthetic */ kotlin.jvm.internal.Ref$ObjectRef<T> $initData;
    final /* synthetic */ kotlin.jvm.internal.Ref$BooleanRef $initializationComplete;
    final /* synthetic */ kotlinx.coroutines.sync.Mutex $updateLock;
    final /* synthetic */ androidx.datastore.core.SingleProcessDataStore<T> this$0;

    SingleProcessDataStore$readAndInit$api$1(kotlinx.coroutines.sync.Mutex r1, kotlin.jvm.internal.Ref$BooleanRef r2, kotlin.jvm.internal.Ref$ObjectRef<T> r3, androidx.datastore.core.SingleProcessDataStore<T> r4) {
            r0 = this;
            r0.$updateLock = r1
            r0.$initializationComplete = r2
            r0.$initData = r3
            r0.this$0 = r4
            r0.<init>()
            return
    }

    @Override // androidx.datastore.core.InitializerApi
    public java.lang.Object updateData(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r11, kotlin.coroutines.Continuation<? super T> r12) {
            r10 = this;
            boolean r0 = r12 instanceof androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1$updateData$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1$updateData$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1$updateData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1$updateData$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1$updateData$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L76
            if (r2 == r5) goto L5a
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r11 = r0.L$2
            java.lang.Object r1 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.sync.Mutex r0 = (kotlinx.coroutines.sync.Mutex) r0
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L3b
            goto Lcc
        L3b:
            r11 = move-exception
            goto Le1
        L3e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L46:
            java.lang.Object r11 = r0.L$2
            androidx.datastore.core.SingleProcessDataStore r11 = (androidx.datastore.core.SingleProcessDataStore) r11
            java.lang.Object r2 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.sync.Mutex r4 = (kotlinx.coroutines.sync.Mutex) r4
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L56
            goto Lb2
        L56:
            r11 = move-exception
            r0 = r4
            goto Le1
        L5a:
            java.lang.Object r11 = r0.L$4
            androidx.datastore.core.SingleProcessDataStore r11 = (androidx.datastore.core.SingleProcessDataStore) r11
            java.lang.Object r2 = r0.L$3
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r5 = r0.L$2
            kotlin.jvm.internal.Ref$BooleanRef r5 = (kotlin.jvm.internal.Ref$BooleanRef) r5
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.sync.Mutex r7 = (kotlinx.coroutines.sync.Mutex) r7
            java.lang.Object r8 = r0.L$0
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            kotlin.ResultKt.throwOnFailure(r12)
            r12 = r7
            r9 = r8
            r8 = r11
            r11 = r9
            goto L96
        L76:
            kotlin.ResultKt.throwOnFailure(r12)
            kotlinx.coroutines.sync.Mutex r12 = r10.$updateLock
            kotlin.jvm.internal.Ref$BooleanRef r2 = r10.$initializationComplete
            kotlin.jvm.internal.Ref$ObjectRef<T> r7 = r10.$initData
            androidx.datastore.core.SingleProcessDataStore<T> r8 = r10.this$0
            r0.L$0 = r11
            r0.L$1 = r12
            r0.L$2 = r2
            r0.L$3 = r7
            r0.L$4 = r8
            r0.label = r5
            java.lang.Object r5 = r12.lock(r6, r0)
            if (r5 != r1) goto L94
            return r1
        L94:
            r5 = r2
            r2 = r7
        L96:
            boolean r5 = r5.element     // Catch: java.lang.Throwable -> Ldf
            if (r5 != 0) goto Ld7
            T r5 = r2.element     // Catch: java.lang.Throwable -> Ldf
            r0.L$0 = r12     // Catch: java.lang.Throwable -> Ldf
            r0.L$1 = r2     // Catch: java.lang.Throwable -> Ldf
            r0.L$2 = r8     // Catch: java.lang.Throwable -> Ldf
            r0.L$3 = r6     // Catch: java.lang.Throwable -> Ldf
            r0.L$4 = r6     // Catch: java.lang.Throwable -> Ldf
            r0.label = r4     // Catch: java.lang.Throwable -> Ldf
            java.lang.Object r11 = r11.invoke(r5, r0)     // Catch: java.lang.Throwable -> Ldf
            if (r11 != r1) goto Laf
            return r1
        Laf:
            r4 = r12
            r12 = r11
            r11 = r8
        Lb2:
            T r5 = r2.element     // Catch: java.lang.Throwable -> L56
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r5)     // Catch: java.lang.Throwable -> L56
            if (r5 != 0) goto Ld0
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L56
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L56
            r0.L$2 = r12     // Catch: java.lang.Throwable -> L56
            r0.label = r3     // Catch: java.lang.Throwable -> L56
            java.lang.Object r11 = r11.writeData$datastore_core(r12, r0)     // Catch: java.lang.Throwable -> L56
            if (r11 != r1) goto Lc9
            return r1
        Lc9:
            r11 = r12
            r1 = r2
            r0 = r4
        Lcc:
            r1.element = r11     // Catch: java.lang.Throwable -> L3b
            r2 = r1
            goto Ld1
        Ld0:
            r0 = r4
        Ld1:
            T r11 = r2.element     // Catch: java.lang.Throwable -> L3b
            r0.unlock(r6)
            return r11
        Ld7:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r0 = "InitializerApi.updateData should not be called after initialization is complete."
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Ldf
            throw r11     // Catch: java.lang.Throwable -> Ldf
        Ldf:
            r11 = move-exception
            r0 = r12
        Le1:
            r0.unlock(r6)
            throw r11
    }
}
