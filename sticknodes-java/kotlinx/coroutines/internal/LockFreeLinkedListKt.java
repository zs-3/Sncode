package kotlinx.coroutines.internal;

/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes2.dex */
public final class LockFreeLinkedListKt {
    private static final java.lang.Object CONDITION_FALSE = null;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "CONDITION_FALSE"
            r0.<init>(r1)
            kotlinx.coroutines.internal.LockFreeLinkedListKt.CONDITION_FALSE = r0
            return
    }

    public static final java.lang.Object getCONDITION_FALSE() {
            java.lang.Object r0 = kotlinx.coroutines.internal.LockFreeLinkedListKt.CONDITION_FALSE
            return r0
    }

    public static final kotlinx.coroutines.internal.LockFreeLinkedListNode unwrap(java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.internal.Removed
            if (r0 == 0) goto L8
            r0 = r1
            kotlinx.coroutines.internal.Removed r0 = (kotlinx.coroutines.internal.Removed) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto Lf
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.ref
            if (r0 != 0) goto L17
        Lf:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r0)
            r0 = r1
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
        L17:
            return r0
    }
}
