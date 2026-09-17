package kotlin.coroutines.jvm.internal;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes2.dex */
public abstract class SuspendLambda extends kotlin.coroutines.jvm.internal.ContinuationImpl implements kotlin.jvm.internal.FunctionBase<java.lang.Object> {
    private final int arity;

    public SuspendLambda(int r1, kotlin.coroutines.Continuation<java.lang.Object> r2) {
            r0 = this;
            r0.<init>(r2)
            r0.arity = r1
            return
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
            r1 = this;
            int r0 = r1.arity
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public java.lang.String toString() {
            r2 = this;
            kotlin.coroutines.Continuation r0 = r2.getCompletion()
            if (r0 != 0) goto L10
            java.lang.String r0 = kotlin.jvm.internal.Reflection.renderLambdaToString(r2)
            java.lang.String r1 = "renderLambdaToString(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            goto L14
        L10:
            java.lang.String r0 = super.toString()
        L14:
            return r0
    }
}
