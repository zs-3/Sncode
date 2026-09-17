package com.google.android.gms.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
@android.annotation.TargetApi(24)
/* loaded from: classes2.dex */
public final class AppMeasurementJobService extends android.app.job.JobService implements com.google.android.gms.measurement.internal.zzof {
    private com.google.android.gms.measurement.internal.zzog zza;

    public AppMeasurementJobService() {
            r0 = this;
            r0.<init>()
            return
    }

    private final com.google.android.gms.measurement.internal.zzog zzd() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzog r0 = r1.zza
            if (r0 != 0) goto Lb
            com.google.android.gms.measurement.internal.zzog r0 = new com.google.android.gms.measurement.internal.zzog
            r0.<init>(r1)
            r1.zza = r0
        Lb:
            com.google.android.gms.measurement.internal.zzog r0 = r1.zza
            return r0
    }

    @Override // android.app.Service
    public void onCreate() {
            r1 = this;
            super.onCreate()
            com.google.android.gms.measurement.internal.zzog r0 = r1.zzd()
            r0.zzf()
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzog r0 = r1.zzd()
            r0.zzg()
            super.onDestroy()
            return
    }

    @Override // android.app.Service
    public void onRebind(android.content.Intent r1) {
            r0 = this;
            r0.zzd()
            com.google.android.gms.measurement.internal.zzog.zzi(r1)
            return
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(android.app.job.JobParameters r2) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzog r0 = r1.zzd()
            r0.zzh(r2)
            r2 = 1
            return r2
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(android.app.job.JobParameters r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent r1) {
            r0 = this;
            r0.zzd()
            com.google.android.gms.measurement.internal.zzog.zzj(r1)
            r1 = 1
            return r1
    }

    @Override // com.google.android.gms.measurement.internal.zzof
    public final void zza(android.content.Intent r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzof
    @android.annotation.TargetApi(24)
    public final void zzb(android.app.job.JobParameters r1, boolean r2) {
            r0 = this;
            r2 = 0
            r0.jobFinished(r1, r2)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzof
    public final boolean zzc(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
