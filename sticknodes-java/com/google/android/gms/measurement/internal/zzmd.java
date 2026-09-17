package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzmd extends com.google.android.gms.measurement.internal.zzg {
    private android.app.job.JobScheduler zza;

    public zzmd(com.google.android.gms.measurement.internal.zzio r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    @android.annotation.TargetApi(24)
    protected final void zzd() {
            r2 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            android.content.Context r0 = r0.zzaT()
            java.lang.String r1 = "jobscheduler"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.job.JobScheduler r0 = (android.app.job.JobScheduler) r0
            r2.zza = r0
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzf() {
            r1 = this;
            r0 = 1
            return r0
    }

    final int zzh() {
            r2 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            android.content.Context r0 = r0.zzaT()
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "measurement-client"
            java.lang.String r0 = r1.concat(r0)
            int r0 = r0.hashCode()
            return r0
    }

    final com.google.android.gms.internal.measurement.zzih zzi() {
            r7 = this;
            r7.zza()
            r7.zzg()
            com.google.android.gms.measurement.internal.zzio r0 = r7.zzu
            com.google.android.gms.measurement.internal.zzam r1 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzaR
            r3 = 0
            boolean r1 = r1.zzx(r3, r2)
            if (r1 != 0) goto L18
            com.google.android.gms.internal.measurement.zzih r0 = com.google.android.gms.internal.measurement.zzih.zzi
            return r0
        L18:
            android.app.job.JobScheduler r1 = r7.zza
            if (r1 == 0) goto L65
            com.google.android.gms.measurement.internal.zzam r1 = r0.zzf()
            boolean r1 = r1.zzE()
            if (r1 == 0) goto L62
            com.google.android.gms.measurement.internal.zzio r1 = r7.zzu
            com.google.android.gms.measurement.internal.zzgs r2 = r1.zzh()
            long r2 = r2.zzj()
            r4 = 119000(0x1d0d8, double:5.8794E-319)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L5f
            android.content.Context r0 = r0.zzaT()
            java.lang.String r2 = "com.google.android.gms.measurement.AppMeasurementJobService"
            boolean r0 = com.google.android.gms.measurement.internal.zzqf.zzas(r0, r2)
            if (r0 != 0) goto L46
            com.google.android.gms.internal.measurement.zzih r0 = com.google.android.gms.internal.measurement.zzih.zzc
            return r0
        L46:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r0 < r2) goto L5c
            com.google.android.gms.measurement.internal.zzny r0 = r1.zzu()
            boolean r0 = r0.zzad()
            if (r0 != 0) goto L59
            com.google.android.gms.internal.measurement.zzih r0 = com.google.android.gms.internal.measurement.zzih.zze
            return r0
        L59:
            com.google.android.gms.internal.measurement.zzih r0 = com.google.android.gms.internal.measurement.zzih.zzb
            return r0
        L5c:
            com.google.android.gms.internal.measurement.zzih r0 = com.google.android.gms.internal.measurement.zzih.zzd
            return r0
        L5f:
            com.google.android.gms.internal.measurement.zzih r0 = com.google.android.gms.internal.measurement.zzih.zzf
            return r0
        L62:
            com.google.android.gms.internal.measurement.zzih r0 = com.google.android.gms.internal.measurement.zzih.zzh
            return r0
        L65:
            com.google.android.gms.internal.measurement.zzih r0 = com.google.android.gms.internal.measurement.zzih.zzg
            return r0
    }

    @android.annotation.TargetApi(24)
    public final void zzj(long r8) {
            r7 = this;
            r7.zza()
            r7.zzg()
            android.app.job.JobScheduler r0 = r7.zza
            if (r0 == 0) goto L25
            int r1 = r7.zzh()
            android.app.job.JobInfo r0 = r0.getPendingJob(r1)
            if (r0 != 0) goto L15
            goto L25
        L15:
            com.google.android.gms.measurement.internal.zzio r8 = r7.zzu
            com.google.android.gms.measurement.internal.zzhe r8 = r8.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzj()
            java.lang.String r9 = "[sgtm] There's an existing pending job, skip this schedule."
            r8.zza(r9)
            return
        L25:
            com.google.android.gms.internal.measurement.zzih r0 = r7.zzi()
            com.google.android.gms.internal.measurement.zzih r1 = com.google.android.gms.internal.measurement.zzih.zzb
            if (r0 != r1) goto L97
            com.google.android.gms.measurement.internal.zzio r0 = r7.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            java.lang.String r3 = "[sgtm] Scheduling Scion upload, millis"
            r1.zzb(r3, r2)
            android.os.PersistableBundle r1 = new android.os.PersistableBundle
            r1.<init>()
            java.lang.String r2 = "action"
            java.lang.String r3 = "com.google.android.gms.measurement.SCION_UPLOAD"
            r1.putString(r2, r3)
            android.app.job.JobInfo$Builder r2 = new android.app.job.JobInfo$Builder
            int r3 = r7.zzh()
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.Context r5 = r0.zzaT()
            java.lang.String r6 = "com.google.android.gms.measurement.AppMeasurementJobService"
            r4.<init>(r5, r6)
            r2.<init>(r3, r4)
            r3 = 1
            android.app.job.JobInfo$Builder r2 = r2.setRequiredNetworkType(r3)
            android.app.job.JobInfo$Builder r2 = r2.setMinimumLatency(r8)
            long r8 = r8 + r8
            android.app.job.JobInfo$Builder r8 = r2.setOverrideDeadline(r8)
            android.app.job.JobInfo$Builder r8 = r8.setExtras(r1)
            android.app.job.JobInfo r8 = r8.build()
            android.app.job.JobScheduler r9 = r7.zza
            java.lang.Object r9 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            android.app.job.JobScheduler r9 = (android.app.job.JobScheduler) r9
            int r8 = r9.schedule(r8)
            com.google.android.gms.measurement.internal.zzhe r9 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zzj()
            if (r8 != r3) goto L8f
            java.lang.String r8 = "SUCCESS"
            goto L91
        L8f:
            java.lang.String r8 = "FAILURE"
        L91:
            java.lang.String r0 = "[sgtm] Scion upload job scheduled with result"
            r9.zzb(r0, r8)
            return
        L97:
            com.google.android.gms.measurement.internal.zzio r8 = r7.zzu
            com.google.android.gms.measurement.internal.zzhe r8 = r8.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzj()
            java.lang.String r9 = r0.name()
            java.lang.String r0 = "[sgtm] Not eligible for Scion upload"
            r8.zzb(r0, r9)
            return
    }
}
