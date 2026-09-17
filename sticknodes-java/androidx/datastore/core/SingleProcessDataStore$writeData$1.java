package androidx.datastore.core;

/* compiled from: SingleProcessDataStore.kt */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {426}, m = "writeData$datastore_core")
/* loaded from: classes.dex */
final class SingleProcessDataStore$writeData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.datastore.core.SingleProcessDataStore<T> this$0;

    SingleProcessDataStore$writeData$1(androidx.datastore.core.SingleProcessDataStore<T> r1, kotlin.coroutines.Continuation<? super androidx.datastore.core.SingleProcessDataStore$writeData$1> r2) {
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
            androidx.datastore.core.SingleProcessDataStore<T> r2 = r1.this$0
            r0 = 0
            java.lang.Object r2 = r2.writeData$datastore_core(r0, r1)
            return r2
    }
}
