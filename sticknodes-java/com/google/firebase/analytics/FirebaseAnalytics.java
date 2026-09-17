package com.google.firebase.analytics;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
/* loaded from: classes2.dex */
public final class FirebaseAnalytics {
    private static volatile com.google.firebase.analytics.FirebaseAnalytics zza;
    private final com.google.android.gms.internal.measurement.zzff zzb;

    public FirebaseAnalytics(com.google.android.gms.internal.measurement.zzff r1) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            r0.zzb = r1
            return
    }

    @androidx.annotation.Keep
    public static com.google.firebase.analytics.FirebaseAnalytics getInstance(android.content.Context r2) {
            com.google.firebase.analytics.FirebaseAnalytics r0 = com.google.firebase.analytics.FirebaseAnalytics.zza
            if (r0 != 0) goto L1c
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r0 = com.google.firebase.analytics.FirebaseAnalytics.class
            monitor-enter(r0)
            com.google.firebase.analytics.FirebaseAnalytics r1 = com.google.firebase.analytics.FirebaseAnalytics.zza     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L17
            r1 = 0
            com.google.android.gms.internal.measurement.zzff r2 = com.google.android.gms.internal.measurement.zzff.zzg(r2, r1, r1, r1, r1)     // Catch: java.lang.Throwable -> L19
            com.google.firebase.analytics.FirebaseAnalytics r1 = new com.google.firebase.analytics.FirebaseAnalytics     // Catch: java.lang.Throwable -> L19
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L19
            com.google.firebase.analytics.FirebaseAnalytics.zza = r1     // Catch: java.lang.Throwable -> L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            goto L1c
        L19:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r2
        L1c:
            com.google.firebase.analytics.FirebaseAnalytics r2 = com.google.firebase.analytics.FirebaseAnalytics.zza
            return r2
    }

    @androidx.annotation.Keep
    public static com.google.android.gms.measurement.internal.zzlx getScionFrontendApiImplementation(android.content.Context r1, android.os.Bundle r2) {
            r0 = 0
            com.google.android.gms.internal.measurement.zzff r1 = com.google.android.gms.internal.measurement.zzff.zzg(r1, r0, r0, r0, r2)
            if (r1 != 0) goto L8
            return r0
        L8:
            com.google.firebase.analytics.zzd r2 = new com.google.firebase.analytics.zzd
            r2.<init>(r1)
            return r2
    }

    @androidx.annotation.Keep
    public java.lang.String getFirebaseInstanceId() {
            r4 = this;
            com.google.firebase.installations.FirebaseInstallations r0 = com.google.firebase.installations.FirebaseInstallations.getInstance()     // Catch: java.lang.InterruptedException -> L13 java.util.concurrent.TimeoutException -> L1a java.util.concurrent.ExecutionException -> L22
            com.google.android.gms.tasks.Task r0 = r0.getId()     // Catch: java.lang.InterruptedException -> L13 java.util.concurrent.TimeoutException -> L1a java.util.concurrent.ExecutionException -> L22
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L13 java.util.concurrent.TimeoutException -> L1a java.util.concurrent.ExecutionException -> L22
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r0, r1, r3)     // Catch: java.lang.InterruptedException -> L13 java.util.concurrent.TimeoutException -> L1a java.util.concurrent.ExecutionException -> L22
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.InterruptedException -> L13 java.util.concurrent.TimeoutException -> L1a java.util.concurrent.ExecutionException -> L22
            return r0
        L13:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L1a:
            java.lang.IllegalThreadStateException r0 = new java.lang.IllegalThreadStateException
            java.lang.String r1 = "Firebase Installations getId Task has timed out."
            r0.<init>(r1)
            throw r0
        L22:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r0 = r0.getCause()
            r1.<init>(r0)
            throw r1
    }

    public void logEvent(java.lang.String r2, android.os.Bundle r3) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r1.zzb
            r0.zzy(r2, r3)
            return
    }

    @androidx.annotation.Keep
    @java.lang.Deprecated
    public void setCurrentScreen(android.app.Activity r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r1.zzb
            com.google.android.gms.internal.measurement.zzdj r2 = com.google.android.gms.internal.measurement.zzdj.zza(r2)
            r0.zzH(r2, r3, r4)
            return
    }

    public void setUserId(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r1.zzb
            r0.zzO(r2)
            return
    }
}
