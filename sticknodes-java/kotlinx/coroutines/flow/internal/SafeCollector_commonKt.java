package kotlinx.coroutines.flow.internal;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes2.dex */
public final class SafeCollector_commonKt {
    public static final void checkContext(kotlinx.coroutines.flow.internal.SafeCollector<?> r3, kotlin.coroutines.CoroutineContext r4) {
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            kotlinx.coroutines.flow.internal.SafeCollector_commonKt$checkContext$result$1 r1 = new kotlinx.coroutines.flow.internal.SafeCollector_commonKt$checkContext$result$1
            r1.<init>(r3)
            java.lang.Object r0 = r4.fold(r0, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = r3.collectContextSize
            if (r0 != r1) goto L19
            return
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Flow invariant is violated:\n\t\tFlow was collected in "
            r1.append(r2)
            kotlin.coroutines.CoroutineContext r3 = r3.collectContext
            r1.append(r3)
            java.lang.String r3 = ",\n\t\tbut emission happened in "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public static final kotlinx.coroutines.Job transitiveCoroutineParent(kotlinx.coroutines.Job r1, kotlinx.coroutines.Job r2) {
        L0:
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            if (r1 != r2) goto L7
            return r1
        L7:
            boolean r0 = r1 instanceof kotlinx.coroutines.internal.ScopeCoroutine
            if (r0 != 0) goto Lc
            return r1
        Lc:
            kotlinx.coroutines.Job r1 = r1.getParent()
            goto L0
    }
}
