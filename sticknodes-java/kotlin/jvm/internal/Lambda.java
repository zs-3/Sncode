package kotlin.jvm.internal;

/* compiled from: Lambda.kt */
/* loaded from: classes2.dex */
public abstract class Lambda<R> implements kotlin.jvm.internal.FunctionBase<R>, java.io.Serializable {
    private final int arity;

    public Lambda(int r1) {
            r0 = this;
            r0.<init>()
            r0.arity = r1
            return
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
            r1 = this;
            int r0 = r1.arity
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = kotlin.jvm.internal.Reflection.renderLambdaToString(r2)
            java.lang.String r1 = "renderLambdaToString(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }
}
