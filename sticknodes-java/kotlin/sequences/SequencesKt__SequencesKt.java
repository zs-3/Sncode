package kotlin.sequences;

/* compiled from: Sequences.kt */
/* loaded from: classes2.dex */
class SequencesKt__SequencesKt extends kotlin.sequences.SequencesKt__SequencesJVMKt {
    public static <T> kotlin.sequences.Sequence<T> asSequence(java.util.Iterator<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.sequences.SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1 r0 = new kotlin.sequences.SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1
            r0.<init>(r1)
            kotlin.sequences.Sequence r1 = constrainOnce(r0)
            return r1
    }

    public static final <T> kotlin.sequences.Sequence<T> constrainOnce(kotlin.sequences.Sequence<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1 instanceof kotlin.sequences.ConstrainedOnceSequence
            if (r0 == 0) goto La
            goto L10
        La:
            kotlin.sequences.ConstrainedOnceSequence r0 = new kotlin.sequences.ConstrainedOnceSequence
            r0.<init>(r1)
            r1 = r0
        L10:
            return r1
    }
}
