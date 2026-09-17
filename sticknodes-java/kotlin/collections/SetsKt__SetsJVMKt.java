package kotlin.collections;

/* compiled from: SetsJVM.kt */
/* loaded from: classes2.dex */
class SetsKt__SetsJVMKt {
    public static final <T> java.util.Set<T> setOf(T r1) {
            java.util.Set r1 = java.util.Collections.singleton(r1)
            java.lang.String r0 = "singleton(element)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }
}
