package com.google.firebase.crashlytics.internal.concurrency;

/* loaded from: classes2.dex */
public final class CrashlyticsTasks {
    private static final java.util.concurrent.Executor DIRECT = null;

    /* renamed from: $r8$lambda$dXQxMu6K-bSHhgtIisZRt42JKXU, reason: not valid java name */
    public static /* synthetic */ com.google.android.gms.tasks.Task m54$r8$lambda$dXQxMu6KbSHhgtIisZRt42JKXU(com.google.android.gms.tasks.TaskCompletionSource r0, java.util.concurrent.atomic.AtomicBoolean r1, com.google.android.gms.tasks.CancellationTokenSource r2, com.google.android.gms.tasks.Task r3) {
            com.google.android.gms.tasks.Task r0 = lambda$race$0(r0, r1, r2, r3)
            return r0
    }

    static {
            androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$$ExternalSyntheticLambda0 r0 = androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$$ExternalSyntheticLambda0.INSTANCE
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks.DIRECT = r0
            return
    }

    private static /* synthetic */ com.google.android.gms.tasks.Task lambda$race$0(com.google.android.gms.tasks.TaskCompletionSource r1, java.util.concurrent.atomic.AtomicBoolean r2, com.google.android.gms.tasks.CancellationTokenSource r3, com.google.android.gms.tasks.Task r4) throws java.lang.Exception {
            boolean r0 = r4.isSuccessful()
            if (r0 == 0) goto Le
            java.lang.Object r2 = r4.getResult()
            r1.trySetResult(r2)
            goto L26
        Le:
            java.lang.Exception r0 = r4.getException()
            if (r0 == 0) goto L1c
            java.lang.Exception r2 = r4.getException()
            r1.trySetException(r2)
            goto L26
        L1c:
            r1 = 1
            boolean r1 = r2.getAndSet(r1)
            if (r1 == 0) goto L26
            r3.cancel()
        L26:
            r1 = 0
            com.google.android.gms.tasks.Task r1 = com.google.android.gms.tasks.Tasks.forResult(r1)
            return r1
    }

    public static <T> com.google.android.gms.tasks.Task<T> race(com.google.android.gms.tasks.Task<T> r4, com.google.android.gms.tasks.Task<T> r5) {
            com.google.android.gms.tasks.CancellationTokenSource r0 = new com.google.android.gms.tasks.CancellationTokenSource
            r0.<init>()
            com.google.android.gms.tasks.TaskCompletionSource r1 = new com.google.android.gms.tasks.TaskCompletionSource
            com.google.android.gms.tasks.CancellationToken r2 = r0.getToken()
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r2.<init>(r3)
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks$$ExternalSyntheticLambda0 r3 = new com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks$$ExternalSyntheticLambda0
            r3.<init>(r1, r2, r0)
            java.util.concurrent.Executor r0 = com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks.DIRECT
            r4.continueWithTask(r0, r3)
            r5.continueWithTask(r0, r3)
            com.google.android.gms.tasks.Task r4 = r1.getTask()
            return r4
    }
}
