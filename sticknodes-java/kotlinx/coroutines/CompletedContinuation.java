package kotlinx.coroutines;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes2.dex */
final class CompletedContinuation {
    public final java.lang.Throwable cancelCause;
    public final kotlinx.coroutines.CancelHandler cancelHandler;
    public final java.lang.Object idempotentResume;
    public final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> onCancellation;
    public final java.lang.Object result;

    public CompletedContinuation(java.lang.Object r1, kotlinx.coroutines.CancelHandler r2, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3, java.lang.Object r4, java.lang.Throwable r5) {
            r0 = this;
            r0.<init>()
            r0.result = r1
            r0.cancelHandler = r2
            r0.onCancellation = r3
            r0.idempotentResume = r4
            r0.cancelCause = r5
            return
    }

    public /* synthetic */ CompletedContinuation(java.lang.Object r8, kotlinx.coroutines.CancelHandler r9, kotlin.jvm.functions.Function1 r10, java.lang.Object r11, java.lang.Throwable r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
            r7 = this;
            r14 = r13 & 2
            r0 = 0
            if (r14 == 0) goto L7
            r3 = r0
            goto L8
        L7:
            r3 = r9
        L8:
            r9 = r13 & 4
            if (r9 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r10
        Lf:
            r9 = r13 & 8
            if (r9 == 0) goto L15
            r5 = r0
            goto L16
        L15:
            r5 = r11
        L16:
            r9 = r13 & 16
            if (r9 == 0) goto L1c
            r6 = r0
            goto L1d
        L1c:
            r6 = r12
        L1d:
            r1 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    public static /* synthetic */ kotlinx.coroutines.CompletedContinuation copy$default(kotlinx.coroutines.CompletedContinuation r3, java.lang.Object r4, kotlinx.coroutines.CancelHandler r5, kotlin.jvm.functions.Function1 r6, java.lang.Object r7, java.lang.Throwable r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.Object r4 = r3.result
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            kotlinx.coroutines.CancelHandler r5 = r3.cancelHandler
        Lc:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L13
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r6 = r3.onCancellation
        L13:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L1a
            java.lang.Object r7 = r3.idempotentResume
        L1a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L21
            java.lang.Throwable r8 = r3.cancelCause
        L21:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            kotlinx.coroutines.CompletedContinuation r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
    }

    public final kotlinx.coroutines.CompletedContinuation copy(java.lang.Object r8, kotlinx.coroutines.CancelHandler r9, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r10, java.lang.Object r11, java.lang.Throwable r12) {
            r7 = this;
            kotlinx.coroutines.CompletedContinuation r6 = new kotlinx.coroutines.CompletedContinuation
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlinx.coroutines.CompletedContinuation
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlinx.coroutines.CompletedContinuation r5 = (kotlinx.coroutines.CompletedContinuation) r5
            java.lang.Object r1 = r4.result
            java.lang.Object r3 = r5.result
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            kotlinx.coroutines.CancelHandler r1 = r4.cancelHandler
            kotlinx.coroutines.CancelHandler r3 = r5.cancelHandler
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r1 = r4.onCancellation
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r3 = r5.onCancellation
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.Object r1 = r4.idempotentResume
            java.lang.Object r3 = r5.idempotentResume
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.Throwable r1 = r4.cancelCause
            java.lang.Throwable r5 = r5.cancelCause
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L43
            return r2
        L43:
            return r0
    }

    public final boolean getCancelled() {
            r1 = this;
            java.lang.Throwable r0 = r1.cancelCause
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.result
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            kotlinx.coroutines.CancelHandler r2 = r3.cancelHandler
            if (r2 != 0) goto L13
            r2 = 0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r0 = r0 + r2
            int r0 = r0 * 31
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r2 = r3.onCancellation
            if (r2 != 0) goto L20
            r2 = 0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Object r2 = r3.idempotentResume
            if (r2 != 0) goto L2d
            r2 = 0
            goto L31
        L2d:
            int r2 = r2.hashCode()
        L31:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Throwable r2 = r3.cancelCause
            if (r2 != 0) goto L39
            goto L3d
        L39:
            int r1 = r2.hashCode()
        L3d:
            int r0 = r0 + r1
            return r0
    }

    public final void invokeHandlers(kotlinx.coroutines.CancellableContinuationImpl<?> r2, java.lang.Throwable r3) {
            r1 = this;
            kotlinx.coroutines.CancelHandler r0 = r1.cancelHandler
            if (r0 == 0) goto L7
            r2.callCancelHandler(r0, r3)
        L7:
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r0 = r1.onCancellation
            if (r0 == 0) goto Le
            r2.callOnCancellation(r0, r3)
        Le:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CompletedContinuation(result="
            r0.append(r1)
            java.lang.Object r1 = r2.result
            r0.append(r1)
            java.lang.String r1 = ", cancelHandler="
            r0.append(r1)
            kotlinx.coroutines.CancelHandler r1 = r2.cancelHandler
            r0.append(r1)
            java.lang.String r1 = ", onCancellation="
            r0.append(r1)
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r1 = r2.onCancellation
            r0.append(r1)
            java.lang.String r1 = ", idempotentResume="
            r0.append(r1)
            java.lang.Object r1 = r2.idempotentResume
            r0.append(r1)
            java.lang.String r1 = ", cancelCause="
            r0.append(r1)
            java.lang.Throwable r1 = r2.cancelCause
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
