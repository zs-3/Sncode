package kotlinx.coroutines;

/* compiled from: Exceptions.kt */
/* loaded from: classes2.dex */
public final class JobCancellationException extends java.util.concurrent.CancellationException {
    public final transient kotlinx.coroutines.Job job;

    public JobCancellationException(java.lang.String r1, java.lang.Throwable r2, kotlinx.coroutines.Job r3) {
            r0 = this;
            r0.<init>(r1)
            r0.job = r3
            if (r2 == 0) goto La
            r0.initCause(r2)
        La:
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 == r2) goto L31
            boolean r0 = r3 instanceof kotlinx.coroutines.JobCancellationException
            if (r0 == 0) goto L2f
            kotlinx.coroutines.JobCancellationException r3 = (kotlinx.coroutines.JobCancellationException) r3
            java.lang.String r0 = r3.getMessage()
            java.lang.String r1 = r2.getMessage()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L2f
            kotlinx.coroutines.Job r0 = r3.job
            kotlinx.coroutines.Job r1 = r2.job
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L2f
            java.lang.Throwable r3 = r3.getCause()
            java.lang.Throwable r0 = r2.getCause()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r3 == 0) goto L2f
            goto L31
        L2f:
            r3 = 0
            goto L32
        L31:
            r3 = 1
        L32:
            return r3
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
            r1 = this;
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            r1.setStackTrace(r0)
            return r1
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.getMessage()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            kotlinx.coroutines.Job r1 = r2.job
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Throwable r1 = r2.getCause()
            if (r1 == 0) goto L21
            int r1 = r1.hashCode()
            goto L22
        L21:
            r1 = 0
        L22:
            int r0 = r0 + r1
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "; job="
            r0.append(r1)
            kotlinx.coroutines.Job r1 = r2.job
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
