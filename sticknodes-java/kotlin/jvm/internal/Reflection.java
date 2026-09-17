package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public class Reflection {
    private static final kotlin.reflect.KClass[] EMPTY_K_CLASS_ARRAY = null;
    private static final kotlin.jvm.internal.ReflectionFactory factory = null;

    static {
            r0 = 0
            java.lang.String r1 = "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Throwable -> Lf
            kotlin.jvm.internal.ReflectionFactory r1 = (kotlin.jvm.internal.ReflectionFactory) r1     // Catch: java.lang.Throwable -> Lf
            r0 = r1
            goto L10
        Lf:
        L10:
            if (r0 == 0) goto L13
            goto L18
        L13:
            kotlin.jvm.internal.ReflectionFactory r0 = new kotlin.jvm.internal.ReflectionFactory
            r0.<init>()
        L18:
            kotlin.jvm.internal.Reflection.factory = r0
            r0 = 0
            kotlin.reflect.KClass[] r0 = new kotlin.reflect.KClass[r0]
            kotlin.jvm.internal.Reflection.EMPTY_K_CLASS_ARRAY = r0
            return
    }

    public static kotlin.reflect.KFunction function(kotlin.jvm.internal.FunctionReference r1) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KFunction r1 = r0.function(r1)
            return r1
    }

    public static kotlin.reflect.KClass getOrCreateKotlinClass(java.lang.Class r1) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KClass r1 = r0.getOrCreateKotlinClass(r1)
            return r1
    }

    public static kotlin.reflect.KDeclarationContainer getOrCreateKotlinPackage(java.lang.Class r2) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            java.lang.String r1 = ""
            kotlin.reflect.KDeclarationContainer r2 = r0.getOrCreateKotlinPackage(r2, r1)
            return r2
    }

    public static kotlin.reflect.KProperty0 property0(kotlin.jvm.internal.PropertyReference0 r1) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KProperty0 r1 = r0.property0(r1)
            return r1
    }

    public static kotlin.reflect.KProperty2 property2(kotlin.jvm.internal.PropertyReference2 r1) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KProperty2 r1 = r0.property2(r1)
            return r1
    }

    public static java.lang.String renderLambdaToString(kotlin.jvm.internal.FunctionBase r1) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            java.lang.String r1 = r0.renderLambdaToString(r1)
            return r1
    }

    public static java.lang.String renderLambdaToString(kotlin.jvm.internal.Lambda r1) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            java.lang.String r1 = r0.renderLambdaToString(r1)
            return r1
    }
}
