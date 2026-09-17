package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzoy extends com.google.android.gms.measurement.internal.zzpg {
    private final android.app.AlarmManager zza;
    private com.google.android.gms.measurement.internal.zzaz zzb;
    private java.lang.Integer zzc;

    protected zzoy(com.google.android.gms.measurement.internal.zzpv r2) {
            r1 = this;
            r1.<init>(r2)
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu
            android.content.Context r2 = r2.zzaT()
            java.lang.String r0 = "alarm"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.app.AlarmManager r2 = (android.app.AlarmManager) r2
            r1.zza = r2
            return
    }

    private final int zzf() {
            r2 = this;
            java.lang.Integer r0 = r2.zzc
            if (r0 != 0) goto L22
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            android.content.Context r0 = r0.zzaT()
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "measurement"
            java.lang.String r0 = r1.concat(r0)
            int r0 = r0.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.zzc = r0
        L22:
            java.lang.Integer r0 = r2.zzc
            int r0 = r0.intValue()
            return r0
    }

    private final android.app.PendingIntent zzh() {
            r4 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r4.zzu
            android.content.Context r0 = r0.zzaT()
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "com.google.android.gms.measurement.AppMeasurementReceiver"
            android.content.Intent r1 = r1.setClassName(r0, r2)
            java.lang.String r2 = "com.google.android.gms.measurement.UPLOAD"
            android.content.Intent r1 = r1.setAction(r2)
            int r2 = com.google.android.gms.internal.measurement.zzcj.zza
            r3 = 0
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r0, r3, r1, r2)
            return r0
    }

    private final com.google.android.gms.measurement.internal.zzaz zzi() {
            r2 = this;
            com.google.android.gms.measurement.internal.zzaz r0 = r2.zzb
            if (r0 != 0) goto L11
            com.google.android.gms.measurement.internal.zzpv r0 = r2.zzg
            com.google.android.gms.measurement.internal.zzox r1 = new com.google.android.gms.measurement.internal.zzox
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzt()
            r1.<init>(r2, r0)
            r2.zzb = r1
        L11:
            com.google.android.gms.measurement.internal.zzaz r0 = r2.zzb
            return r0
    }

    @android.annotation.TargetApi(24)
    private final void zzj() {
            r2 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            android.content.Context r0 = r0.zzaT()
            java.lang.String r1 = "jobscheduler"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.job.JobScheduler r0 = (android.app.job.JobScheduler) r0
            if (r0 == 0) goto L17
            int r1 = r2.zzf()
            r0.cancel(r1)
        L17:
            return
    }

    public final void zza() {
            r2 = this;
            r2.zzav()
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            java.lang.String r1 = "Unscheduling upload"
            r0.zza(r1)
            android.app.AlarmManager r0 = r2.zza
            if (r0 == 0) goto L1d
            android.app.PendingIntent r1 = r2.zzh()
            r0.cancel(r1)
        L1d:
            com.google.android.gms.measurement.internal.zzaz r0 = r2.zzi()
            r0.zzb()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L2d
            r2.zzj()
        L2d:
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzpg
    protected final boolean zzb() {
            r2 = this;
            android.app.AlarmManager r0 = r2.zza
            if (r0 == 0) goto Lb
            android.app.PendingIntent r1 = r2.zzh()
            r0.cancel(r1)
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L14
            r2.zzj()
        L14:
            r0 = 0
            return r0
    }

    public final void zzd(long r11) {
            r10 = this;
            r10.zzav()
            com.google.android.gms.measurement.internal.zzio r0 = r10.zzu
            r0.zzaV()
            android.content.Context r1 = r0.zzaT()
            boolean r2 = com.google.android.gms.measurement.internal.zzqf.zzar(r1)
            if (r2 != 0) goto L1f
            com.google.android.gms.measurement.internal.zzhe r2 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzd()
            java.lang.String r3 = "Receiver not registered/enabled"
            r2.zza(r3)
        L1f:
            r2 = 0
            boolean r1 = com.google.android.gms.measurement.internal.zzqf.zzat(r1, r2)
            if (r1 != 0) goto L33
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzd()
            java.lang.String r2 = "Service not registered/enabled"
            r1.zza(r2)
        L33:
            r10.zza()
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            java.lang.String r3 = "Scheduling upload, millis"
            r1.zzb(r3, r2)
            com.google.android.gms.common.util.Clock r1 = r0.zzaU()
            long r1 = r1.elapsedRealtime()
            long r5 = r1 + r11
            r0.zzf()
            r1 = 0
            com.google.android.gms.measurement.internal.zzgg r3 = com.google.android.gms.measurement.internal.zzgi.zzK
            r4 = 0
            java.lang.Object r3 = r3.zza(r4)
            java.lang.Long r3 = (java.lang.Long) r3
            long r7 = r3.longValue()
            long r1 = java.lang.Math.max(r1, r7)
            int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r3 >= 0) goto L7c
            com.google.android.gms.measurement.internal.zzaz r1 = r10.zzi()
            boolean r1 = r1.zze()
            if (r1 != 0) goto L7c
            com.google.android.gms.measurement.internal.zzaz r1 = r10.zzi()
            r1.zzd(r11)
        L7c:
            r0.zzaV()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r1 < r2) goto Lbe
            android.content.Context r0 = r0.zzaT()
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r2 = "com.google.android.gms.measurement.AppMeasurementJobService"
            r1.<init>(r0, r2)
            int r2 = r10.zzf()
            android.os.PersistableBundle r3 = new android.os.PersistableBundle
            r3.<init>()
            java.lang.String r4 = "action"
            java.lang.String r5 = "com.google.android.gms.measurement.UPLOAD"
            r3.putString(r4, r5)
            android.app.job.JobInfo$Builder r4 = new android.app.job.JobInfo$Builder
            r4.<init>(r2, r1)
            android.app.job.JobInfo$Builder r1 = r4.setMinimumLatency(r11)
            long r11 = r11 + r11
            android.app.job.JobInfo$Builder r11 = r1.setOverrideDeadline(r11)
            android.app.job.JobInfo$Builder r11 = r11.setExtras(r3)
            android.app.job.JobInfo r11 = r11.build()
            java.lang.String r12 = "com.google.android.gms"
            java.lang.String r1 = "UploadAlarm"
            com.google.android.gms.internal.measurement.zzck.zza(r0, r11, r12, r1)
            return
        Lbe:
            android.app.AlarmManager r3 = r10.zza
            if (r3 == 0) goto Lde
            r0.zzf()
            r0 = 2
            com.google.android.gms.measurement.internal.zzgg r1 = com.google.android.gms.measurement.internal.zzgi.zzF
            java.lang.Object r1 = r1.zza(r4)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r7 = java.lang.Math.max(r1, r11)
            android.app.PendingIntent r9 = r10.zzh()
            r4 = r0
            r3.setInexactRepeating(r4, r5, r7, r9)
        Lde:
            return
    }
}
