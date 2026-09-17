package kotlin;

/* compiled from: Exceptions.kt */
/* loaded from: classes2.dex */
class ExceptionsKt__ExceptionsKt {
    public static void addSuppressed(java.lang.Throwable r1, java.lang.Throwable r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "exception"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r1 == r2) goto L11
            kotlin.internal.PlatformImplementations r0 = kotlin.internal.PlatformImplementationsKt.IMPLEMENTATIONS
            r0.addSuppressed(r1, r2)
        L11:
            return
    }
}
