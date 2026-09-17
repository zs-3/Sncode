package kotlin;

/* compiled from: LazyJVM.kt */
/* loaded from: classes2.dex */
class LazyKt__LazyJVMKt {
    public static <T> kotlin.Lazy<T> lazy(kotlin.jvm.functions.Function0<? extends T> r3) {
            java.lang.String r0 = "initializer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.SynchronizedLazyImpl r0 = new kotlin.SynchronizedLazyImpl
            r1 = 0
            r2 = 2
            r0.<init>(r3, r1, r2, r1)
            return r0
    }
}
