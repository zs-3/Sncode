package kotlin.sequences;

/* compiled from: _Sequences.kt */
/* loaded from: classes2.dex */
class SequencesKt___SequencesKt extends kotlin.sequences.SequencesKt___SequencesJvmKt {
    public static <T, R> kotlin.sequences.Sequence<R> map(kotlin.sequences.Sequence<? extends T> r1, kotlin.jvm.functions.Function1<? super T, ? extends R> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.sequences.TransformingSequence r0 = new kotlin.sequences.TransformingSequence
            r0.<init>(r1, r2)
            return r0
    }

    public static final <T, C extends java.util.Collection<? super T>> C toCollection(kotlin.sequences.Sequence<? extends T> r1, C r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r1.next()
            r2.add(r0)
            goto Le
        L1c:
            return r2
    }

    public static <T> java.util.List<T> toList(kotlin.sequences.Sequence<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.List r1 = toMutableList(r1)
            java.util.List r1 = kotlin.collections.CollectionsKt.optimizeReadOnlyList(r1)
            return r1
    }

    public static final <T> java.util.List<T> toMutableList(kotlin.sequences.Sequence<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r1 = toCollection(r1, r0)
            java.util.List r1 = (java.util.List) r1
            return r1
    }
}
