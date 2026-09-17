package kotlin.sequences;

/* compiled from: Sequences.kt */
/* loaded from: classes2.dex */
public final class TransformingSequence<T, R> implements kotlin.sequences.Sequence<R> {
    private final kotlin.sequences.Sequence<T> sequence;
    private final kotlin.jvm.functions.Function1<T, R> transformer;


    public TransformingSequence(kotlin.sequences.Sequence<? extends T> r2, kotlin.jvm.functions.Function1<? super T, ? extends R> r3) {
            r1 = this;
            java.lang.String r0 = "sequence"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "transformer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.sequence = r2
            r1.transformer = r3
            return
    }

    public static final /* synthetic */ kotlin.sequences.Sequence access$getSequence$p(kotlin.sequences.TransformingSequence r0) {
            kotlin.sequences.Sequence<T> r0 = r0.sequence
            return r0
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 access$getTransformer$p(kotlin.sequences.TransformingSequence r0) {
            kotlin.jvm.functions.Function1<T, R> r0 = r0.transformer
            return r0
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<R> iterator() {
            r1 = this;
            kotlin.sequences.TransformingSequence$iterator$1 r0 = new kotlin.sequences.TransformingSequence$iterator$1
            r0.<init>(r1)
            return r0
    }
}
