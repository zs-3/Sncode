package kotlin.coroutines.intrinsics;

/* compiled from: IntrinsicsJvm.kt */
/* loaded from: classes2.dex */
class IntrinsicsKt__IntrinsicsJvmKt {
    public static <R, T> kotlin.coroutines.Continuation<kotlin.Unit> createCoroutineUnintercepted(kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r2, R r3, kotlin.coroutines.Continuation<? super T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "completion"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(r4)
            boolean r0 = r2 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl
            if (r0 == 0) goto L19
            kotlin.coroutines.jvm.internal.BaseContinuationImpl r2 = (kotlin.coroutines.jvm.internal.BaseContinuationImpl) r2
            kotlin.coroutines.Continuation r2 = r2.create(r3, r4)
            goto L2e
        L19:
            kotlin.coroutines.CoroutineContext r0 = r4.getContext()
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            if (r0 != r1) goto L28
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3 r0 = new kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
            r0.<init>(r4, r2, r3)
            r2 = r0
            goto L2e
        L28:
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4 r1 = new kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
            r1.<init>(r4, r0, r2, r3)
            r2 = r1
        L2e:
            return r2
    }

    public static <T> kotlin.coroutines.Continuation<T> intercepted(kotlin.coroutines.Continuation<? super T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1 instanceof kotlin.coroutines.jvm.internal.ContinuationImpl
            if (r0 == 0) goto Ld
            r0 = r1
            kotlin.coroutines.jvm.internal.ContinuationImpl r0 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L18
            kotlin.coroutines.Continuation r0 = r0.intercepted()
            if (r0 != 0) goto L17
            goto L18
        L17:
            r1 = r0
        L18:
            return r1
    }
}
