package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzog {
    private final android.content.Context zza;

    public zzog(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            r0.zza = r1
            return
    }

    public static /* synthetic */ void zzc(com.google.android.gms.measurement.internal.zzog r2, android.app.job.JobParameters r3) {
            java.lang.String r0 = "FA"
            java.lang.String r1 = "[sgtm] AppMeasurementJobService processed last Scion upload request."
            android.util.Log.v(r0, r1)
            android.content.Context r2 = r2.zza
            com.google.android.gms.measurement.internal.zzof r2 = (com.google.android.gms.measurement.internal.zzof) r2
            r0 = 0
            r2.zzb(r3, r0)
            return
    }

    public static /* synthetic */ void zzd(com.google.android.gms.measurement.internal.zzog r1, com.google.android.gms.measurement.internal.zzhe r2, android.app.job.JobParameters r3) {
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzj()
            java.lang.String r0 = "AppMeasurementJobService processed last upload request."
            r2.zza(r0)
            android.content.Context r1 = r1.zza
            com.google.android.gms.measurement.internal.zzof r1 = (com.google.android.gms.measurement.internal.zzof) r1
            r2 = 0
            r1.zzb(r3, r2)
            return
    }

    public static /* synthetic */ void zze(com.google.android.gms.measurement.internal.zzog r2, int r3, com.google.android.gms.measurement.internal.zzhe r4, android.content.Intent r5) {
            android.content.Context r2 = r2.zza
            r0 = r2
            com.google.android.gms.measurement.internal.zzof r0 = (com.google.android.gms.measurement.internal.zzof) r0
            boolean r1 = r0.zzc(r3)
            if (r1 == 0) goto L2d
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzj()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r1 = "Local AppMeasurementService processed last upload request. StartId"
            r4.zzb(r1, r3)
            r3 = 0
            com.google.android.gms.measurement.internal.zzio r2 = com.google.android.gms.measurement.internal.zzio.zzp(r2, r3, r3)
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzj()
            java.lang.String r3 = "Completed wakeful intent."
            r2.zza(r3)
            r0.zza(r5)
        L2d:
            return
    }

    public static final void zzi(android.content.Intent r2) {
            java.lang.String r0 = "FA"
            if (r2 != 0) goto La
            java.lang.String r2 = "onRebind called with null intent"
            android.util.Log.e(r0, r2)
            return
        La:
            java.lang.String r2 = r2.getAction()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "onRebind called. action: "
            java.lang.String r2 = r1.concat(r2)
            android.util.Log.v(r0, r2)
            return
    }

    public static final boolean zzj(android.content.Intent r3) {
            r0 = 1
            java.lang.String r1 = "FA"
            if (r3 != 0) goto Lb
            java.lang.String r3 = "onUnbind called with null intent"
            android.util.Log.e(r1, r3)
            return r0
        Lb:
            java.lang.String r3 = r3.getAction()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r2 = "onUnbind called for intent. action: "
            java.lang.String r3 = r2.concat(r3)
            android.util.Log.v(r1, r3)
            return r0
    }

    private final void zzk(com.google.android.gms.measurement.internal.zzpv r3, java.lang.Runnable r4) {
            r2 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r3.zzaX()
            com.google.android.gms.measurement.internal.zzoe r1 = new com.google.android.gms.measurement.internal.zzoe
            r1.<init>(r2, r3, r4)
            r0.zzq(r1)
            return
    }

    public final int zza(android.content.Intent r7, int r8, int r9) {
            r6 = this;
            r8 = 2
            if (r7 != 0) goto Lb
            java.lang.String r7 = "FA"
            java.lang.String r9 = "AppMeasurementService started with null intent"
            android.util.Log.w(r7, r9)
            return r8
        Lb:
            android.content.Context r0 = r6.zza
            r1 = 0
            com.google.android.gms.measurement.internal.zzio r1 = com.google.android.gms.measurement.internal.zzio.zzp(r0, r1, r1)
            com.google.android.gms.measurement.internal.zzhe r2 = r1.zzaW()
            java.lang.String r3 = r7.getAction()
            r1.zzaV()
            com.google.android.gms.measurement.internal.zzhc r1 = r2.zzj()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            java.lang.String r5 = "Local AppMeasurementService called. startId, action"
            r1.zzc(r5, r4, r3)
            java.lang.String r1 = "com.google.android.gms.measurement.UPLOAD"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3e
            com.google.android.gms.measurement.internal.zzoc r1 = new com.google.android.gms.measurement.internal.zzoc
            r1.<init>(r6, r9, r2, r7)
            com.google.android.gms.measurement.internal.zzpv r7 = com.google.android.gms.measurement.internal.zzpv.zzz(r0)
            r6.zzk(r7, r1)
        L3e:
            return r8
    }

    public final android.os.IBinder zzb(android.content.Intent r4) {
            r3 = this;
            java.lang.String r0 = "FA"
            r1 = 0
            if (r4 != 0) goto Lb
            java.lang.String r4 = "onBind called with null intent"
            android.util.Log.e(r0, r4)
            return r1
        Lb:
            java.lang.String r4 = r4.getAction()
            java.lang.String r2 = "com.google.android.gms.measurement.START"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L23
            android.content.Context r4 = r3.zza
            com.google.android.gms.measurement.internal.zzjp r0 = new com.google.android.gms.measurement.internal.zzjp
            com.google.android.gms.measurement.internal.zzpv r4 = com.google.android.gms.measurement.internal.zzpv.zzz(r4)
            r0.<init>(r4, r1)
            return r0
        L23:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r2 = "onBind received unknown action: "
            java.lang.String r4 = r2.concat(r4)
            android.util.Log.w(r0, r4)
            return r1
    }

    public final void zzf() {
            r2 = this;
            android.content.Context r0 = r2.zza
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = " is starting up."
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "FA"
            android.util.Log.v(r1, r0)
            return
    }

    public final void zzg() {
            r2 = this;
            android.content.Context r0 = r2.zza
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = " is shutting down."
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "FA"
            android.util.Log.v(r1, r0)
            return
    }

    @android.annotation.TargetApi(24)
    public final boolean zzh(android.app.job.JobParameters r7) {
            r6 = this;
            android.os.PersistableBundle r0 = r7.getExtras()
            java.lang.String r1 = "action"
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "onStartJob received action: "
            java.lang.String r1 = r2.concat(r1)
            java.lang.String r2 = "FA"
            android.util.Log.v(r2, r1)
            java.lang.String r1 = "com.google.android.gms.measurement.UPLOAD"
            boolean r1 = java.util.Objects.equals(r0, r1)
            if (r1 == 0) goto L45
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r1 = (java.lang.String) r1
            android.content.Context r2 = r6.zza
            com.google.android.gms.measurement.internal.zzpv r2 = com.google.android.gms.measurement.internal.zzpv.zzz(r2)
            com.google.android.gms.measurement.internal.zzhe r3 = r2.zzaW()
            r2.zzaV()
            com.google.android.gms.measurement.internal.zzhc r4 = r3.zzj()
            java.lang.String r5 = "Local AppMeasurementJobService called. action"
            r4.zzb(r5, r1)
            com.google.android.gms.measurement.internal.zzod r1 = new com.google.android.gms.measurement.internal.zzod
            r1.<init>(r6, r3, r7)
            r6.zzk(r2, r1)
        L45:
            java.lang.String r1 = "com.google.android.gms.measurement.SCION_UPLOAD"
            boolean r1 = java.util.Objects.equals(r0, r1)
            if (r1 == 0) goto L70
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.content.Context r0 = r6.zza
            r1 = 0
            com.google.android.gms.internal.measurement.zzff r0 = com.google.android.gms.internal.measurement.zzff.zzg(r0, r1, r1, r1, r1)
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzaT
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L70
            com.google.android.gms.measurement.internal.zzob r1 = new com.google.android.gms.measurement.internal.zzob
            r1.<init>(r6, r7)
            r0.zzE(r1)
        L70:
            r7 = 1
            return r7
    }
}
