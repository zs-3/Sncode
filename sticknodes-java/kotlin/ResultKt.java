package kotlin;

/* compiled from: Result.kt */
/* loaded from: classes2.dex */
public final class ResultKt {
    public static final java.lang.Object createFailure(java.lang.Throwable r1) {
            java.lang.String r0 = "exception"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.Result$Failure r0 = new kotlin.Result$Failure
            r0.<init>(r1)
            return r0
    }

    public static final void throwOnFailure(java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlin.Result.Failure
            if (r0 != 0) goto L5
            return
        L5:
            kotlin.Result$Failure r1 = (kotlin.Result.Failure) r1
            java.lang.Throwable r1 = r1.exception
            throw r1
    }
}
