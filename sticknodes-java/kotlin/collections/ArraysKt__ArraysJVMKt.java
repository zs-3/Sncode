package kotlin.collections;

/* compiled from: ArraysJVM.kt */
/* loaded from: classes2.dex */
class ArraysKt__ArraysJVMKt {
    public static final <T> T[] arrayOfNulls(T[] r1, int r2) {
            java.lang.String r0 = "reference"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Class r1 = r1.getClass()
            java.lang.Class r1 = r1.getComponentType()
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            return r1
    }
}
