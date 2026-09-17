package kotlinx.coroutines.internal;

import kotlinx.coroutines.internal.Segment;

/* compiled from: ConcurrentLinkedList.kt */
/* loaded from: classes2.dex */
public final class SegmentOrClosed<S extends kotlinx.coroutines.internal.Segment<S>> {
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <S extends kotlinx.coroutines.internal.Segment<S>> java.lang.Object m129constructorimpl(java.lang.Object r0) {
            return r0
    }

    /* renamed from: getSegment-impl, reason: not valid java name */
    public static final S m130getSegmentimpl(java.lang.Object r1) {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.access$getCLOSED$p()
            if (r1 == r0) goto Le
            java.lang.String r0 = "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r0)
            kotlinx.coroutines.internal.Segment r1 = (kotlinx.coroutines.internal.Segment) r1
            return r1
        Le:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Does not contain segment"
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m131isClosedimpl(java.lang.Object r1) {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.access$getCLOSED$p()
            if (r1 != r0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }
}
