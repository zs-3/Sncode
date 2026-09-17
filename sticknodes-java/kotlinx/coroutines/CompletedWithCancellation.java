package kotlinx.coroutines;

/* compiled from: CompletionState.kt */
/* loaded from: classes2.dex */
public final class CompletedWithCancellation {
    public final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> onCancellation;
    public final java.lang.Object result;

    public CompletedWithCancellation(java.lang.Object r1, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r2) {
            r0 = this;
            r0.<init>()
            r0.result = r1
            r0.onCancellation = r2
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlinx.coroutines.CompletedWithCancellation
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlinx.coroutines.CompletedWithCancellation r5 = (kotlinx.coroutines.CompletedWithCancellation) r5
            java.lang.Object r1 = r4.result
            java.lang.Object r3 = r5.result
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r1 = r4.onCancellation
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r5 = r5.onCancellation
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.result
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            int r0 = r0 * 31
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r1 = r2.onCancellation
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CompletedWithCancellation(result="
            r0.append(r1)
            java.lang.Object r1 = r2.result
            r0.append(r1)
            java.lang.String r1 = ", onCancellation="
            r0.append(r1)
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r1 = r2.onCancellation
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
