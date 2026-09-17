package kotlin.text;

/* compiled from: Strings.kt */
/* loaded from: classes2.dex */
final class DelimitedRangesSequence implements kotlin.sequences.Sequence<kotlin.ranges.IntRange> {
    private final kotlin.jvm.functions.Function2<java.lang.CharSequence, java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> getNextMatch;
    private final java.lang.CharSequence input;
    private final int limit;
    private final int startIndex;


    public DelimitedRangesSequence(java.lang.CharSequence r2, int r3, int r4, kotlin.jvm.functions.Function2<? super java.lang.CharSequence, ? super java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> r5) {
            r1 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "getNextMatch"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r1.<init>()
            r1.input = r2
            r1.startIndex = r3
            r1.limit = r4
            r1.getNextMatch = r5
            return
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function2 access$getGetNextMatch$p(kotlin.text.DelimitedRangesSequence r0) {
            kotlin.jvm.functions.Function2<java.lang.CharSequence, java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> r0 = r0.getNextMatch
            return r0
    }

    public static final /* synthetic */ java.lang.CharSequence access$getInput$p(kotlin.text.DelimitedRangesSequence r0) {
            java.lang.CharSequence r0 = r0.input
            return r0
    }

    public static final /* synthetic */ int access$getLimit$p(kotlin.text.DelimitedRangesSequence r0) {
            int r0 = r0.limit
            return r0
    }

    public static final /* synthetic */ int access$getStartIndex$p(kotlin.text.DelimitedRangesSequence r0) {
            int r0 = r0.startIndex
            return r0
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<kotlin.ranges.IntRange> iterator() {
            r1 = this;
            kotlin.text.DelimitedRangesSequence$iterator$1 r0 = new kotlin.text.DelimitedRangesSequence$iterator$1
            r0.<init>(r1)
            return r0
    }
}
