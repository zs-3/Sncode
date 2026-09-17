package kotlinx.coroutines.internal;

/* compiled from: InlineList.kt */
/* loaded from: classes2.dex */
public final class InlineList<E> {
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <E> java.lang.Object m125constructorimpl(java.lang.Object r0) {
            return r0
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m126constructorimpl$default(java.lang.Object r0, int r1, kotlin.jvm.internal.DefaultConstructorMarker r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            java.lang.Object r0 = m125constructorimpl(r0)
            return r0
    }

    /* renamed from: plus-FjFbRPM, reason: not valid java name */
    public static final java.lang.Object m127plusFjFbRPM(java.lang.Object r2, E r3) {
            if (r2 != 0) goto L7
            java.lang.Object r2 = m125constructorimpl(r3)
            goto L2b
        L7:
            boolean r0 = r2 instanceof java.util.ArrayList
            if (r0 == 0) goto L1b
            java.lang.String r0 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r0)
            r0 = r2
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r3)
            java.lang.Object r2 = m125constructorimpl(r2)
            goto L2b
        L1b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            r0.add(r2)
            r0.add(r3)
            java.lang.Object r2 = m125constructorimpl(r0)
        L2b:
            return r2
    }
}
