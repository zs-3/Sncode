package kotlin;

/* compiled from: Result.kt */
/* loaded from: classes2.dex */
public final class Result<T> implements java.io.Serializable {
    public static final kotlin.Result.Companion Companion = null;

    /* compiled from: Result.kt */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: Result.kt */
    public static final class Failure implements java.io.Serializable {
        public final java.lang.Throwable exception;

        public Failure(java.lang.Throwable r2) {
                r1 = this;
                java.lang.String r0 = "exception"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.exception = r2
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlin.Result.Failure
                if (r0 == 0) goto L12
                java.lang.Throwable r0 = r1.exception
                kotlin.Result$Failure r2 = (kotlin.Result.Failure) r2
                java.lang.Throwable r2 = r2.exception
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r2 == 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }

        public int hashCode() {
                r1 = this;
                java.lang.Throwable r0 = r1.exception
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failure("
                r0.append(r1)
                java.lang.Throwable r1 = r2.exception
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            kotlin.Result$Companion r0 = new kotlin.Result$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.Result.Companion = r0
            return
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> java.lang.Object m72constructorimpl(java.lang.Object r0) {
            return r0
    }

    /* renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final java.lang.Throwable m73exceptionOrNullimpl(java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlin.Result.Failure
            if (r0 == 0) goto L9
            kotlin.Result$Failure r1 = (kotlin.Result.Failure) r1
            java.lang.Throwable r1 = r1.exception
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    /* renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m74isFailureimpl(java.lang.Object r0) {
            boolean r0 = r0 instanceof kotlin.Result.Failure
            return r0
    }

    /* renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m75isSuccessimpl(java.lang.Object r0) {
            boolean r0 = r0 instanceof kotlin.Result.Failure
            r0 = r0 ^ 1
            return r0
    }
}
