package kotlin.jvm.internal;

/* compiled from: ArrayIterator.kt */
/* loaded from: classes2.dex */
public final class ArrayIteratorKt {
    public static final <T> java.util.Iterator<T> iterator(T[] r1) {
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.jvm.internal.ArrayIterator r0 = new kotlin.jvm.internal.ArrayIterator
            r0.<init>(r1)
            return r0
    }
}
