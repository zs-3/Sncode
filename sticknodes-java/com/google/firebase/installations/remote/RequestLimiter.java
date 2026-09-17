package com.google.firebase.installations.remote;

/* loaded from: classes2.dex */
class RequestLimiter {
    private static final long MAXIMUM_BACKOFF_DURATION_FOR_CONFIGURATION_ERRORS = 0;
    private static final long MAXIMUM_BACKOFF_DURATION_FOR_SERVER_ERRORS = 0;
    private int attemptCount;
    private long nextRequestTime;
    private final com.google.firebase.installations.Utils utils;

    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.HOURS
            r1 = 24
            long r0 = r0.toMillis(r1)
            com.google.firebase.installations.remote.RequestLimiter.MAXIMUM_BACKOFF_DURATION_FOR_CONFIGURATION_ERRORS = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            r1 = 30
            long r0 = r0.toMillis(r1)
            com.google.firebase.installations.remote.RequestLimiter.MAXIMUM_BACKOFF_DURATION_FOR_SERVER_ERRORS = r0
            return
    }

    RequestLimiter() {
            r1 = this;
            r1.<init>()
            com.google.firebase.installations.Utils r0 = com.google.firebase.installations.Utils.getInstance()
            r1.utils = r0
            return
    }

    private synchronized long getBackoffDuration(int r5) {
            r4 = this;
            monitor-enter(r4)
            boolean r5 = isRetryableError(r5)     // Catch: java.lang.Throwable -> L26
            if (r5 != 0) goto Lb
            long r0 = com.google.firebase.installations.remote.RequestLimiter.MAXIMUM_BACKOFF_DURATION_FOR_CONFIGURATION_ERRORS     // Catch: java.lang.Throwable -> L26
            monitor-exit(r4)
            return r0
        Lb:
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r5 = r4.attemptCount     // Catch: java.lang.Throwable -> L26
            double r2 = (double) r5     // Catch: java.lang.Throwable -> L26
            double r0 = java.lang.Math.pow(r0, r2)     // Catch: java.lang.Throwable -> L26
            com.google.firebase.installations.Utils r5 = r4.utils     // Catch: java.lang.Throwable -> L26
            long r2 = r5.getRandomDelayForSyncPrevention()     // Catch: java.lang.Throwable -> L26
            double r2 = (double) r2     // Catch: java.lang.Throwable -> L26
            double r0 = r0 + r2
            long r2 = com.google.firebase.installations.remote.RequestLimiter.MAXIMUM_BACKOFF_DURATION_FOR_SERVER_ERRORS     // Catch: java.lang.Throwable -> L26
            double r2 = (double) r2     // Catch: java.lang.Throwable -> L26
            double r0 = java.lang.Math.min(r0, r2)     // Catch: java.lang.Throwable -> L26
            long r0 = (long) r0
            monitor-exit(r4)
            return r0
        L26:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    private static boolean isRetryableError(int r1) {
            r0 = 429(0x1ad, float:6.01E-43)
            if (r1 == r0) goto Lf
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 < r0) goto Ld
            r0 = 600(0x258, float:8.41E-43)
            if (r1 >= r0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            return r1
    }

    private static boolean isSuccessfulOrRequiresNewFidCreation(int r1) {
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 < r0) goto L8
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 < r0) goto L13
        L8:
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L13
            r0 = 404(0x194, float:5.66E-43)
            if (r1 != r0) goto L11
            goto L13
        L11:
            r1 = 0
            goto L14
        L13:
            r1 = 1
        L14:
            return r1
    }

    private synchronized void resetBackoffStrategy() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.attemptCount = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public synchronized boolean isRequestAllowed() {
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.attemptCount     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L14
            com.google.firebase.installations.Utils r0 = r5.utils     // Catch: java.lang.Throwable -> L17
            long r0 = r0.currentTimeInMillis()     // Catch: java.lang.Throwable -> L17
            long r2 = r5.nextRequestTime     // Catch: java.lang.Throwable -> L17
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L12
            goto L14
        L12:
            r0 = 0
            goto L15
        L14:
            r0 = 1
        L15:
            monitor-exit(r5)
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    public synchronized void setNextRequestTime(int r5) {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = isSuccessfulOrRequiresNewFidCreation(r5)     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto Lc
            r4.resetBackoffStrategy()     // Catch: java.lang.Throwable -> L21
            monitor-exit(r4)
            return
        Lc:
            int r0 = r4.attemptCount     // Catch: java.lang.Throwable -> L21
            int r0 = r0 + 1
            r4.attemptCount = r0     // Catch: java.lang.Throwable -> L21
            long r0 = r4.getBackoffDuration(r5)     // Catch: java.lang.Throwable -> L21
            com.google.firebase.installations.Utils r5 = r4.utils     // Catch: java.lang.Throwable -> L21
            long r2 = r5.currentTimeInMillis()     // Catch: java.lang.Throwable -> L21
            long r2 = r2 + r0
            r4.nextRequestTime = r2     // Catch: java.lang.Throwable -> L21
            monitor-exit(r4)
            return
        L21:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }
}
