package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public class ReflectionFactory {
    public ReflectionFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public kotlin.reflect.KFunction function(kotlin.jvm.internal.FunctionReference r1) {
            r0 = this;
            return r1
    }

    public kotlin.reflect.KClass getOrCreateKotlinClass(java.lang.Class r2) {
            r1 = this;
            kotlin.jvm.internal.ClassReference r0 = new kotlin.jvm.internal.ClassReference
            r0.<init>(r2)
            return r0
    }

    public kotlin.reflect.KDeclarationContainer getOrCreateKotlinPackage(java.lang.Class r2, java.lang.String r3) {
            r1 = this;
            kotlin.jvm.internal.PackageReference r0 = new kotlin.jvm.internal.PackageReference
            r0.<init>(r2, r3)
            return r0
    }

    public kotlin.reflect.KProperty0 property0(kotlin.jvm.internal.PropertyReference0 r1) {
            r0 = this;
            return r1
    }

    public kotlin.reflect.KProperty2 property2(kotlin.jvm.internal.PropertyReference2 r1) {
            r0 = this;
            return r1
    }

    public java.lang.String renderLambdaToString(kotlin.jvm.internal.FunctionBase r2) {
            r1 = this;
            java.lang.Class r2 = r2.getClass()
            java.lang.reflect.Type[] r2 = r2.getGenericInterfaces()
            r0 = 0
            r2 = r2[r0]
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "kotlin.jvm.functions."
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L1d
            r0 = 21
            java.lang.String r2 = r2.substring(r0)
        L1d:
            return r2
    }

    public java.lang.String renderLambdaToString(kotlin.jvm.internal.Lambda r1) {
            r0 = this;
            java.lang.String r1 = r0.renderLambdaToString(r1)
            return r1
    }
}
