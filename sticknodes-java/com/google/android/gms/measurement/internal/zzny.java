package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzny extends com.google.android.gms.measurement.internal.zzg {
    private final com.google.android.gms.measurement.internal.zznx zza;
    private com.google.android.gms.measurement.internal.zzgl zzb;
    private volatile java.lang.Boolean zzc;
    private final com.google.android.gms.measurement.internal.zzaz zzd;
    private java.util.concurrent.ScheduledExecutorService zze;
    private final com.google.android.gms.measurement.internal.zzou zzf;
    private final java.util.List zzg;
    private final com.google.android.gms.measurement.internal.zzaz zzh;

    protected zzny(com.google.android.gms.measurement.internal.zzio r3) {
            r2 = this;
            r2.<init>(r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zzg = r0
            com.google.android.gms.measurement.internal.zzou r0 = new com.google.android.gms.measurement.internal.zzou
            com.google.android.gms.common.util.Clock r1 = r3.zzaU()
            r0.<init>(r1)
            r2.zzf = r0
            com.google.android.gms.measurement.internal.zznx r0 = new com.google.android.gms.measurement.internal.zznx
            r0.<init>(r2)
            r2.zza = r0
            com.google.android.gms.measurement.internal.zzne r0 = new com.google.android.gms.measurement.internal.zzne
            r0.<init>(r2, r3)
            r2.zzd = r0
            com.google.android.gms.measurement.internal.zzni r0 = new com.google.android.gms.measurement.internal.zzni
            r0.<init>(r2, r3)
            r2.zzh = r0
            return
    }

    private final com.google.android.gms.measurement.internal.zzr zzae(boolean r4) {
            r3 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r3.zzu
            r0.zzaV()
            com.google.android.gms.measurement.internal.zzio r1 = r3.zzu
            com.google.android.gms.measurement.internal.zzgs r1 = r1.zzh()
            r2 = 0
            if (r4 == 0) goto L4c
            com.google.android.gms.measurement.internal.zzhe r4 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzio r4 = r4.zzu
            com.google.android.gms.measurement.internal.zzht r0 = r4.zzm()
            com.google.android.gms.measurement.internal.zzhq r0 = r0.zzb
            if (r0 != 0) goto L1d
            goto L4c
        L1d:
            com.google.android.gms.measurement.internal.zzht r4 = r4.zzm()
            com.google.android.gms.measurement.internal.zzhq r4 = r4.zzb
            android.util.Pair r4 = r4.zza()
            if (r4 == 0) goto L4c
            android.util.Pair r0 = com.google.android.gms.measurement.internal.zzht.zza
            if (r4 != r0) goto L2e
            goto L4c
        L2e:
            java.lang.Object r0 = r4.second
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r4 = r4.first
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ":"
            r2.append(r0)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
        L4c:
            com.google.android.gms.measurement.internal.zzr r4 = r1.zzk(r2)
            return r4
    }

    private final void zzaf() {
            r4 = this;
            r4.zzg()
            com.google.android.gms.measurement.internal.zzio r0 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            java.util.List r1 = r4.zzg
            int r2 = r1.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "Processing queued up service tasks"
            r0.zzb(r3, r2)
            java.util.Iterator r0 = r1.iterator()
        L20:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()     // Catch: java.lang.RuntimeException -> L30
            goto L20
        L30:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzio r2 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()
            java.lang.String r3 = "Task exception while flushing queue"
            r2.zzb(r3, r1)
            goto L20
        L41:
            java.util.List r0 = r4.zzg
            r0.clear()
            com.google.android.gms.measurement.internal.zzaz r0 = r4.zzh
            r0.zzb()
            return
    }

    private final void zzag() {
            r3 = this;
            r3.zzg()
            com.google.android.gms.measurement.internal.zzou r0 = r3.zzf
            r0.zzb()
            com.google.android.gms.measurement.internal.zzio r0 = r3.zzu
            r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r0 = com.google.android.gms.measurement.internal.zzgi.zzX
            r1 = 0
            java.lang.Object r0 = r0.zza(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            com.google.android.gms.measurement.internal.zzaz r2 = r3.zzd
            r2.zzd(r0)
            return
    }

    private final void zzah(java.lang.Runnable r8) throws java.lang.IllegalStateException {
            r7 = this;
            r7.zzg()
            boolean r0 = r7.zzaa()
            if (r0 == 0) goto Ld
            r8.run()
            return
        Ld:
            java.util.List r0 = r7.zzg
            int r1 = r0.size()
            long r1 = (long) r1
            com.google.android.gms.measurement.internal.zzio r3 = r7.zzu
            r3.zzf()
            r4 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 < 0) goto L2d
            com.google.android.gms.measurement.internal.zzhe r8 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zze()
            java.lang.String r0 = "Discarding data. Max runnable queue size reached"
            r8.zza(r0)
            return
        L2d:
            r0.add(r8)
            com.google.android.gms.measurement.internal.zzaz r8 = r7.zzh
            r0 = 60000(0xea60, double:2.9644E-319)
            r8.zzd(r0)
            r7.zzB()
            return
    }

    private final boolean zzai() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu
            r0.zzaV()
            r0 = 1
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzgl zzi(com.google.android.gms.measurement.internal.zzny r0) {
            com.google.android.gms.measurement.internal.zzgl r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zznx zzj(com.google.android.gms.measurement.internal.zzny r0) {
            com.google.android.gms.measurement.internal.zznx r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.ScheduledExecutorService zzm(com.google.android.gms.measurement.internal.zzny r0) {
            java.util.concurrent.ScheduledExecutorService r0 = r0.zze
            return r0
    }

    public static /* synthetic */ void zzp(com.google.android.gms.measurement.internal.zzny r2) {
            com.google.android.gms.measurement.internal.zzgl r0 = r2.zzb
            if (r0 != 0) goto L14
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()
            java.lang.String r0 = "Failed to send storage consent settings to service"
            r2.zza(r0)
            return
        L14:
            r1 = 0
            com.google.android.gms.measurement.internal.zzr r1 = r2.zzae(r1)     // Catch: android.os.RemoteException -> L23
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: android.os.RemoteException -> L23
            r0.zzA(r1)     // Catch: android.os.RemoteException -> L23
            r2.zzag()     // Catch: android.os.RemoteException -> L23
            return
        L23:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()
            java.lang.String r1 = "Failed to send storage consent settings to the service"
            r2.zzb(r1, r0)
            return
    }

    public static /* synthetic */ void zzq(com.google.android.gms.measurement.internal.zzny r2, java.util.concurrent.atomic.AtomicReference r3, com.google.android.gms.measurement.internal.zzr r4, com.google.android.gms.measurement.internal.zzpc r5) {
            monitor-enter(r3)
            com.google.android.gms.measurement.internal.zzgl r0 = r2.zzb     // Catch: java.lang.Throwable -> L25 android.os.RemoteException -> L27
            if (r0 != 0) goto L16
            com.google.android.gms.measurement.internal.zzio r4 = r2.zzu     // Catch: java.lang.Throwable -> L25 android.os.RemoteException -> L27
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()     // Catch: java.lang.Throwable -> L25 android.os.RemoteException -> L27
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zze()     // Catch: java.lang.Throwable -> L25 android.os.RemoteException -> L27
            java.lang.String r5 = "[sgtm] Failed to get upload batches; not connected to service"
            r4.zza(r5)     // Catch: java.lang.Throwable -> L25 android.os.RemoteException -> L27
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            return
        L16:
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L25 android.os.RemoteException -> L27
            com.google.android.gms.measurement.internal.zzmx r1 = new com.google.android.gms.measurement.internal.zzmx     // Catch: java.lang.Throwable -> L25 android.os.RemoteException -> L27
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L25 android.os.RemoteException -> L27
            r0.zzo(r4, r5, r1)     // Catch: java.lang.Throwable -> L25 android.os.RemoteException -> L27
            r2.zzag()     // Catch: java.lang.Throwable -> L25 android.os.RemoteException -> L27
            goto L3a
        L25:
            r2 = move-exception
            goto L3c
        L27:
            r4 = move-exception
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = "[sgtm] Failed to get upload batches; remote exception"
            r2.zzb(r5, r4)     // Catch: java.lang.Throwable -> L25
            r3.notifyAll()     // Catch: java.lang.Throwable -> L25
        L3a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            return
        L3c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            throw r2
    }

    public static /* synthetic */ void zzr(com.google.android.gms.measurement.internal.zzny r2, java.util.concurrent.atomic.AtomicReference r3, com.google.android.gms.measurement.internal.zzr r4, android.os.Bundle r5) {
            monitor-enter(r3)
            com.google.android.gms.measurement.internal.zzgl r0 = r2.zzb     // Catch: java.lang.Throwable -> L25 android.os.RemoteException -> L27
            if (r0 != 0) goto L16
            com.google.android.gms.measurement.internal.zzio r4 = r2.zzu     // Catch: java.lang.Throwable -> L25 android.os.RemoteException -> L27
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()     // Catch: java.lang.Throwable -> L25 android.os.RemoteException -> L27
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zze()     // Catch: java.lang.Throwable -> L25 android.os.RemoteException -> L27
            java.lang.String r5 = "Failed to request trigger URIs; not connected to service"
            r4.zza(r5)     // Catch: java.lang.Throwable -> L25 android.os.RemoteException -> L27
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            return
        L16:
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L25 android.os.RemoteException -> L27
            com.google.android.gms.measurement.internal.zzmw r1 = new com.google.android.gms.measurement.internal.zzmw     // Catch: java.lang.Throwable -> L25 android.os.RemoteException -> L27
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L25 android.os.RemoteException -> L27
            r0.zzr(r4, r5, r1)     // Catch: java.lang.Throwable -> L25 android.os.RemoteException -> L27
            r2.zzag()     // Catch: java.lang.Throwable -> L25 android.os.RemoteException -> L27
            goto L3a
        L25:
            r2 = move-exception
            goto L3c
        L27:
            r4 = move-exception
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = "Failed to request trigger URIs; remote exception"
            r2.zzb(r5, r4)     // Catch: java.lang.Throwable -> L25
            r3.notifyAll()     // Catch: java.lang.Throwable -> L25
        L3a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            return
        L3c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            throw r2
    }

    public static /* synthetic */ void zzs(com.google.android.gms.measurement.internal.zzny r2, com.google.android.gms.measurement.internal.zzr r3, com.google.android.gms.measurement.internal.zzag r4) {
            com.google.android.gms.measurement.internal.zzgl r0 = r2.zzb
            if (r0 != 0) goto L14
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()
            java.lang.String r3 = "[sgtm] Discarding data. Failed to update batch upload status."
            r2.zza(r3)
            return
        L14:
            r0.zzC(r3, r4)     // Catch: android.os.RemoteException -> L1b
            r2.zzag()     // Catch: android.os.RemoteException -> L1b
            return
        L1b:
            r3 = move-exception
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()
            long r0 = r4.zza
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "[sgtm] Failed to update batch upload status, rowId, exception"
            r2.zzc(r0, r4, r3)
            return
    }

    public static /* synthetic */ void zzt(com.google.android.gms.measurement.internal.zzny r2) {
            com.google.android.gms.measurement.internal.zzgl r0 = r2.zzb
            if (r0 != 0) goto L14
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()
            java.lang.String r0 = "Failed to send Dma consent settings to service"
            r2.zza(r0)
            return
        L14:
            r1 = 0
            com.google.android.gms.measurement.internal.zzr r1 = r2.zzae(r1)     // Catch: android.os.RemoteException -> L23
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: android.os.RemoteException -> L23
            r0.zzy(r1)     // Catch: android.os.RemoteException -> L23
            r2.zzag()     // Catch: android.os.RemoteException -> L23
            return
        L23:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()
            java.lang.String r1 = "Failed to send Dma consent settings to the service"
            r2.zzb(r1, r0)
            return
    }

    static /* bridge */ /* synthetic */ void zzu(com.google.android.gms.measurement.internal.zzny r0, java.util.concurrent.ScheduledExecutorService r1) {
            r0.zze = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzv(com.google.android.gms.measurement.internal.zzny r0, com.google.android.gms.measurement.internal.zzgl r1) {
            r1 = 0
            r0.zzb = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzw(com.google.android.gms.measurement.internal.zzny r0) {
            r0.zzaf()
            return
    }

    static /* bridge */ /* synthetic */ void zzx(com.google.android.gms.measurement.internal.zzny r2, android.content.ComponentName r3) {
            r2.zzg()
            com.google.android.gms.measurement.internal.zzgl r0 = r2.zzb
            if (r0 == 0) goto L1f
            r0 = 0
            r2.zzb = r0
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            java.lang.String r1 = "Disconnected from device MeasurementService"
            r0.zzb(r1, r3)
            r2.zzg()
            r2.zzB()
        L1f:
            return
    }

    static /* bridge */ /* synthetic */ void zzy(com.google.android.gms.measurement.internal.zzny r0) {
            r0.zzag()
            return
    }

    protected final void zzA() {
            r5 = this;
            r5.zzg()
            r5.zza()
            r0 = 1
            com.google.android.gms.measurement.internal.zzr r1 = r5.zzae(r0)
            r5.zzai()
            com.google.android.gms.measurement.internal.zzio r2 = r5.zzu
            com.google.android.gms.measurement.internal.zzam r2 = r2.zzf()
            com.google.android.gms.measurement.internal.zzgg r3 = com.google.android.gms.measurement.internal.zzgi.zzbl
            r4 = 0
            r2.zzx(r4, r3)
            com.google.android.gms.measurement.internal.zzio r2 = r5.zzu
            com.google.android.gms.measurement.internal.zzgv r2 = r2.zzi()
            r2.zzk()
            com.google.android.gms.measurement.internal.zznc r2 = new com.google.android.gms.measurement.internal.zznc
            r2.<init>(r5, r1, r0)
            r5.zzah(r2)
            return
    }

    final void zzB() {
            r5 = this;
            r5.zzg()
            r5.zza()
            boolean r0 = r5.zzaa()
            if (r0 == 0) goto Ld
            goto L70
        Ld:
            boolean r0 = r5.zzad()
            if (r0 != 0) goto L71
            com.google.android.gms.measurement.internal.zzio r0 = r5.zzu
            com.google.android.gms.measurement.internal.zzam r1 = r0.zzf()
            boolean r1 = r1.zzC()
            if (r1 != 0) goto L70
            r0.zzaV()
            android.content.Context r1 = r0.zzaT()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            android.content.Context r3 = r0.zzaT()
            java.lang.String r4 = "com.google.android.gms.measurement.AppMeasurementService"
            android.content.Intent r2 = r2.setClassName(r3, r4)
            r3 = 65536(0x10000, float:9.18355E-41)
            java.util.List r1 = r1.queryIntentServices(r2, r3)
            if (r1 == 0) goto L63
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L63
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "com.google.android.gms.measurement.START"
            r1.<init>(r2)
            android.content.ComponentName r2 = new android.content.ComponentName
            android.content.Context r3 = r0.zzaT()
            r0.zzaV()
            r2.<init>(r3, r4)
            r1.setComponent(r2)
            com.google.android.gms.measurement.internal.zznx r0 = r5.zza
            r0.zzb(r1)
            return
        L63:
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.String r1 = "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest"
            r0.zza(r1)
        L70:
            return
        L71:
            com.google.android.gms.measurement.internal.zznx r0 = r5.zza
            r0.zzc()
            return
    }

    public final void zzC() {
            r3 = this;
            r3.zzg()
            r3.zza()
            com.google.android.gms.measurement.internal.zznx r0 = r3.zza
            r0.zzd()
            com.google.android.gms.common.stats.ConnectionTracker r1 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.measurement.internal.zzio r2 = r3.zzu     // Catch: java.lang.Throwable -> L18
            android.content.Context r2 = r2.zzaT()     // Catch: java.lang.Throwable -> L18
            r1.unbindService(r2, r0)     // Catch: java.lang.Throwable -> L18
        L18:
            r0 = 0
            r3.zzb = r0
            return
    }

    public final void zzD(com.google.android.gms.internal.measurement.zzcy r3) {
            r2 = this;
            r2.zzg()
            r2.zza()
            r0 = 0
            com.google.android.gms.measurement.internal.zzr r0 = r2.zzae(r0)
            com.google.android.gms.measurement.internal.zznb r1 = new com.google.android.gms.measurement.internal.zznb
            r1.<init>(r2, r0, r3)
            r2.zzah(r1)
            return
    }

    public final void zzE(java.util.concurrent.atomic.AtomicReference r3) {
            r2 = this;
            r2.zzg()
            r2.zza()
            r0 = 0
            com.google.android.gms.measurement.internal.zzr r0 = r2.zzae(r0)
            com.google.android.gms.measurement.internal.zzna r1 = new com.google.android.gms.measurement.internal.zzna
            r1.<init>(r2, r3, r0)
            r2.zzah(r1)
            return
    }

    protected final void zzF(com.google.android.gms.internal.measurement.zzcy r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            r7.zzg()
            r7.zza()
            r0 = 0
            com.google.android.gms.measurement.internal.zzr r5 = r7.zzae(r0)
            com.google.android.gms.measurement.internal.zzno r0 = new com.google.android.gms.measurement.internal.zzno
            r1 = r0
            r2 = r7
            r3 = r9
            r4 = r10
            r6 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r7.zzah(r0)
            return
    }

    protected final void zzG(java.util.concurrent.atomic.AtomicReference r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            r7 = this;
            r7.zzg()
            r7.zza()
            r9 = 0
            com.google.android.gms.measurement.internal.zzr r6 = r7.zzae(r9)
            com.google.android.gms.measurement.internal.zznn r9 = new com.google.android.gms.measurement.internal.zznn
            r3 = 0
            r0 = r9
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.zzah(r9)
            return
    }

    protected final void zzH(java.util.concurrent.atomic.AtomicReference r3, android.os.Bundle r4) {
            r2 = this;
            r2.zzg()
            r2.zza()
            r0 = 0
            com.google.android.gms.measurement.internal.zzr r0 = r2.zzae(r0)
            com.google.android.gms.measurement.internal.zzms r1 = new com.google.android.gms.measurement.internal.zzms
            r1.<init>(r2, r3, r0, r4)
            r2.zzah(r1)
            return
    }

    protected final void zzI(java.util.concurrent.atomic.AtomicReference r3, com.google.android.gms.measurement.internal.zzpc r4) {
            r2 = this;
            r2.zzg()
            r2.zza()
            r0 = 0
            com.google.android.gms.measurement.internal.zzr r0 = r2.zzae(r0)
            com.google.android.gms.measurement.internal.zzmt r1 = new com.google.android.gms.measurement.internal.zzmt
            r1.<init>(r2, r3, r0, r4)
            r2.zzah(r1)
            return
    }

    protected final void zzJ(java.util.concurrent.atomic.AtomicReference r3, boolean r4) {
            r2 = this;
            r2.zzg()
            r2.zza()
            r0 = 0
            com.google.android.gms.measurement.internal.zzr r0 = r2.zzae(r0)
            com.google.android.gms.measurement.internal.zzmv r1 = new com.google.android.gms.measurement.internal.zzmv
            r1.<init>(r2, r3, r0, r4)
            r2.zzah(r1)
            return
    }

    protected final void zzK(com.google.android.gms.internal.measurement.zzcy r9, java.lang.String r10, java.lang.String r11, boolean r12) {
            r8 = this;
            r8.zzg()
            r8.zza()
            r0 = 0
            com.google.android.gms.measurement.internal.zzr r5 = r8.zzae(r0)
            com.google.android.gms.measurement.internal.zzmu r0 = new com.google.android.gms.measurement.internal.zzmu
            r1 = r0
            r2 = r8
            r3 = r10
            r4 = r11
            r6 = r12
            r7 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.zzah(r0)
            return
    }

    protected final void zzL(java.util.concurrent.atomic.AtomicReference r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13) {
            r8 = this;
            r8.zzg()
            r8.zza()
            r10 = 0
            com.google.android.gms.measurement.internal.zzr r6 = r8.zzae(r10)
            com.google.android.gms.measurement.internal.zznp r10 = new com.google.android.gms.measurement.internal.zznp
            r3 = 0
            r0 = r10
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.zzah(r10)
            return
    }

    protected final void zzM(com.google.android.gms.measurement.internal.zzbh r9, java.lang.String r10) {
            r8 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            r8.zzg()
            r8.zza()
            r8.zzai()
            com.google.android.gms.measurement.internal.zzio r0 = r8.zzu
            com.google.android.gms.measurement.internal.zzgv r0 = r0.zzi()
            boolean r5 = r0.zzp(r9)
            r0 = 1
            com.google.android.gms.measurement.internal.zzr r4 = r8.zzae(r0)
            com.google.android.gms.measurement.internal.zznl r0 = new com.google.android.gms.measurement.internal.zznl
            r3 = 1
            r1 = r0
            r2 = r8
            r6 = r9
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.zzah(r0)
            return
    }

    public final void zzN(com.google.android.gms.internal.measurement.zzcy r4, com.google.android.gms.measurement.internal.zzbh r5, java.lang.String r6) {
            r3 = this;
            r3.zzg()
            r3.zza()
            com.google.android.gms.measurement.internal.zzio r0 = r3.zzu
            com.google.android.gms.measurement.internal.zzqf r1 = r0.zzw()
            r2 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r1 = r1.zzp(r2)
            if (r1 == 0) goto L2d
            com.google.android.gms.measurement.internal.zzhe r5 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zzk()
            java.lang.String r6 = "Not bundling data. Service unavailable or out of date"
            r5.zza(r6)
            com.google.android.gms.measurement.internal.zzqf r5 = r0.zzw()
            r6 = 0
            byte[] r6 = new byte[r6]
            r5.zzW(r4, r6)
            return
        L2d:
            com.google.android.gms.measurement.internal.zznh r0 = new com.google.android.gms.measurement.internal.zznh
            r0.<init>(r3, r5, r6, r4)
            r3.zzah(r0)
            return
    }

    protected final void zzO() {
            r2 = this;
            r2.zzg()
            r2.zza()
            r0 = 0
            com.google.android.gms.measurement.internal.zzr r0 = r2.zzae(r0)
            r2.zzai()
            com.google.android.gms.measurement.internal.zzio r1 = r2.zzu
            com.google.android.gms.measurement.internal.zzgv r1 = r1.zzi()
            r1.zzj()
            com.google.android.gms.measurement.internal.zzmz r1 = new com.google.android.gms.measurement.internal.zzmz
            r1.<init>(r2, r0)
            r2.zzah(r1)
            return
    }

    final void zzP(com.google.android.gms.measurement.internal.zzgl r60, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r61, com.google.android.gms.measurement.internal.zzr r62) {
            r59 = this;
            r1 = r59
            r2 = r60
            r3 = r61
            r59.zzg()
            r59.zza()
            r59.zzai()
            com.google.android.gms.measurement.internal.zzio r4 = r1.zzu
            r4.zzf()
            r6 = 100
            r0 = r62
            r7 = 0
            r8 = 100
        L1b:
            r9 = 1001(0x3e9, float:1.403E-42)
            if (r7 >= r9) goto L22c
            if (r8 != r6) goto L22c
            com.google.android.gms.measurement.internal.zzio r8 = r1.zzu
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            com.google.android.gms.measurement.internal.zzgv r8 = r8.zzi()
            java.util.List r8 = r8.zzi(r6)
            if (r8 == 0) goto L3a
            r9.addAll(r8)
            int r8 = r8.size()
            goto L3b
        L3a:
            r8 = 0
        L3b:
            if (r3 == 0) goto L4b
            if (r8 >= r6) goto L4b
            java.lang.String r10 = r0.zzc
            long r11 = r0.zzj
            com.google.android.gms.measurement.internal.zzgu r13 = new com.google.android.gms.measurement.internal.zzgu
            r13.<init>(r3, r10, r11)
            r9.add(r13)
        L4b:
            com.google.android.gms.measurement.internal.zzam r10 = r4.zzf()
            com.google.android.gms.measurement.internal.zzgg r11 = com.google.android.gms.measurement.internal.zzgi.zzaU
            r12 = 0
            boolean r10 = r10.zzx(r12, r11)
            int r11 = r9.size()
            r13 = 0
        L5b:
            if (r13 >= r11) goto L226
            java.lang.Object r14 = r9.get(r13)
            com.google.android.gms.measurement.internal.zzgu r14 = (com.google.android.gms.measurement.internal.zzgu) r14
            com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r15 = r14.zza
            com.google.android.gms.measurement.internal.zzam r5 = r4.zzf()
            com.google.android.gms.measurement.internal.zzgg r6 = com.google.android.gms.measurement.internal.zzgi.zzbl
            boolean r5 = r5.zzx(r12, r6)
            if (r5 == 0) goto L105
            java.lang.String r5 = r14.zzb
            boolean r16 = android.text.TextUtils.isEmpty(r5)
            if (r16 != 0) goto L105
            r58 = r13
            long r12 = r14.zzc
            r20 = r12
            java.lang.String r12 = r0.zza
            r17 = r12
            java.lang.String r12 = r0.zzb
            r18 = r12
            java.lang.String r12 = r0.zzd
            r22 = r12
            long r12 = r0.zze
            r23 = r12
            long r12 = r0.zzf
            r25 = r12
            java.lang.String r12 = r0.zzg
            r27 = r12
            boolean r12 = r0.zzh
            r28 = r12
            boolean r12 = r0.zzi
            r29 = r12
            java.lang.String r12 = r0.zzk
            r30 = r12
            long r12 = r0.zzl
            r31 = r12
            int r12 = r0.zzm
            r33 = r12
            boolean r12 = r0.zzn
            r34 = r12
            boolean r12 = r0.zzo
            r35 = r12
            java.lang.String r12 = r0.zzp
            r36 = r12
            java.lang.Boolean r12 = r0.zzq
            r37 = r12
            long r12 = r0.zzr
            r38 = r12
            java.util.List r12 = r0.zzs
            r40 = r12
            java.lang.String r12 = r0.zzt
            r41 = r12
            java.lang.String r12 = r0.zzu
            r42 = r12
            java.lang.String r12 = r0.zzv
            r43 = r12
            java.lang.String r12 = r0.zzw
            r44 = r12
            boolean r12 = r0.zzx
            r45 = r12
            long r12 = r0.zzy
            r46 = r12
            int r12 = r0.zzz
            r48 = r12
            java.lang.String r12 = r0.zzA
            r49 = r12
            int r12 = r0.zzB
            r50 = r12
            long r12 = r0.zzC
            r51 = r12
            java.lang.String r12 = r0.zzD
            r53 = r12
            java.lang.String r12 = r0.zzE
            r54 = r12
            long r12 = r0.zzF
            r55 = r12
            int r0 = r0.zzG
            r57 = r0
            com.google.android.gms.measurement.internal.zzr r0 = new com.google.android.gms.measurement.internal.zzr
            r16 = r0
            r19 = r5
            r16.<init>(r17, r18, r19, r20, r22, r23, r25, r27, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r40, r41, r42, r43, r44, r45, r46, r48, r49, r50, r51, r53, r54, r55, r57)
            goto L107
        L105:
            r58 = r13
        L107:
            r5 = r0
            boolean r0 = r15 instanceof com.google.android.gms.measurement.internal.zzbh
            if (r0 == 0) goto L1ad
            r12 = 0
            if (r10 == 0) goto L133
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu     // Catch: android.os.RemoteException -> L12d
            com.google.android.gms.common.util.Clock r6 = r0.zzaU()     // Catch: android.os.RemoteException -> L12d
            long r16 = r6.currentTimeMillis()     // Catch: android.os.RemoteException -> L12d
            com.google.android.gms.common.util.Clock r0 = r0.zzaU()     // Catch: android.os.RemoteException -> L127
            long r18 = r0.elapsedRealtime()     // Catch: android.os.RemoteException -> L127
            r24 = r16
            r26 = r18
            goto L137
        L127:
            r0 = move-exception
            r26 = r12
            r19 = r16
            goto L174
        L12d:
            r0 = move-exception
            r19 = r12
            r26 = r19
            goto L174
        L133:
            r24 = r12
            r26 = r24
        L137:
            com.google.android.gms.measurement.internal.zzbh r15 = (com.google.android.gms.measurement.internal.zzbh) r15     // Catch: android.os.RemoteException -> L171
            r2.zzp(r15, r5)     // Catch: android.os.RemoteException -> L171
            if (r10 == 0) goto L1c7
            com.google.android.gms.measurement.internal.zzhe r0 = r4.zzaW()     // Catch: android.os.RemoteException -> L171
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()     // Catch: android.os.RemoteException -> L171
            java.lang.String r6 = "Logging telemetry for logEvent from database"
            r0.zza(r6)     // Catch: android.os.RemoteException -> L171
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu     // Catch: android.os.RemoteException -> L171
            com.google.android.gms.measurement.internal.zzha r16 = com.google.android.gms.measurement.internal.zzha.zza(r0)     // Catch: android.os.RemoteException -> L171
            com.google.android.gms.common.util.Clock r6 = r0.zzaU()     // Catch: android.os.RemoteException -> L171
            long r21 = r6.currentTimeMillis()     // Catch: android.os.RemoteException -> L171
            r17 = 36301(0x8dcd, float:5.0869E-41)
            r18 = 0
            com.google.android.gms.common.util.Clock r0 = r0.zzaU()     // Catch: android.os.RemoteException -> L171
            long r14 = r0.elapsedRealtime()     // Catch: android.os.RemoteException -> L171
            long r14 = r14 - r26
            int r0 = (int) r14     // Catch: android.os.RemoteException -> L171
            r19 = r24
            r23 = r0
            r16.zzc(r17, r18, r19, r21, r23)     // Catch: android.os.RemoteException -> L171
            goto L1c7
        L171:
            r0 = move-exception
            r19 = r24
        L174:
            com.google.android.gms.measurement.internal.zzio r6 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r6 = r6.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zze()
            java.lang.String r14 = "Failed to send event to the service"
            r6.zzb(r14, r0)
            if (r10 == 0) goto L1c7
            int r0 = (r19 > r12 ? 1 : (r19 == r12 ? 0 : -1))
            if (r0 == 0) goto L1c7
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu
            com.google.android.gms.measurement.internal.zzha r16 = com.google.android.gms.measurement.internal.zzha.zza(r0)
            r17 = 36301(0x8dcd, float:5.0869E-41)
            r18 = 13
            com.google.android.gms.common.util.Clock r6 = r0.zzaU()
            long r21 = r6.currentTimeMillis()
            com.google.android.gms.common.util.Clock r0 = r0.zzaU()
            long r12 = r0.elapsedRealtime()
            long r12 = r12 - r26
            int r0 = (int) r12
            r23 = r0
            r16.zzc(r17, r18, r19, r21, r23)
            goto L1c7
        L1ad:
            boolean r0 = r15 instanceof com.google.android.gms.measurement.internal.zzqb
            if (r0 == 0) goto L1c9
            com.google.android.gms.measurement.internal.zzqb r15 = (com.google.android.gms.measurement.internal.zzqb) r15     // Catch: android.os.RemoteException -> L1b7
            r2.zzB(r15, r5)     // Catch: android.os.RemoteException -> L1b7
            goto L1c7
        L1b7:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r6 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r6 = r6.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zze()
            java.lang.String r12 = "Failed to send user property to the service"
            r6.zzb(r12, r0)
        L1c7:
            r13 = 0
            goto L21d
        L1c9:
            boolean r0 = r15 instanceof com.google.android.gms.measurement.internal.zzai
            if (r0 == 0) goto L1e4
            com.google.android.gms.measurement.internal.zzai r15 = (com.google.android.gms.measurement.internal.zzai) r15     // Catch: android.os.RemoteException -> L1d3
            r2.zzt(r15, r5)     // Catch: android.os.RemoteException -> L1d3
            goto L1c7
        L1d3:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r6 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r6 = r6.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zze()
            java.lang.String r12 = "Failed to send conditional user property to the service"
            r6.zzb(r12, r0)
            goto L1c7
        L1e4:
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu
            com.google.android.gms.measurement.internal.zzam r12 = r0.zzf()
            r13 = 0
            boolean r6 = r12.zzx(r13, r6)
            if (r6 == 0) goto L210
            boolean r6 = r15 instanceof com.google.android.gms.measurement.internal.zzbf
            if (r6 == 0) goto L210
            com.google.android.gms.measurement.internal.zzbf r15 = (com.google.android.gms.measurement.internal.zzbf) r15     // Catch: android.os.RemoteException -> L1ff
            android.os.Bundle r0 = r15.zzc()     // Catch: android.os.RemoteException -> L1ff
            r2.zzx(r0, r5)     // Catch: android.os.RemoteException -> L1ff
            goto L21d
        L1ff:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r6 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r6 = r6.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zze()
            java.lang.String r12 = "Failed to send default event parameters to the service"
            r6.zzb(r12, r0)
            goto L21d
        L210:
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.String r6 = "Discarding data. Unrecognized parcel type."
            r0.zza(r6)
        L21d:
            int r0 = r58 + 1
            r12 = r13
            r6 = 100
            r13 = r0
            r0 = r5
            goto L5b
        L226:
            int r7 = r7 + 1
            r6 = 100
            goto L1b
        L22c:
            return
    }

    protected final void zzQ(com.google.android.gms.measurement.internal.zzai r9) {
            r8 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            r8.zzg()
            r8.zza()
            com.google.android.gms.measurement.internal.zzio r0 = r8.zzu
            r0.zzaV()
            com.google.android.gms.measurement.internal.zzio r0 = r8.zzu
            com.google.android.gms.measurement.internal.zzgv r0 = r0.zzi()
            boolean r5 = r0.zzn(r9)
            com.google.android.gms.measurement.internal.zzai r6 = new com.google.android.gms.measurement.internal.zzai
            r6.<init>(r9)
            r0 = 1
            com.google.android.gms.measurement.internal.zzr r4 = r8.zzae(r0)
            com.google.android.gms.measurement.internal.zznm r0 = new com.google.android.gms.measurement.internal.zznm
            r3 = 1
            r1 = r0
            r2 = r8
            r7 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.zzah(r0)
            return
    }

    protected final void zzR(boolean r2) {
            r1 = this;
            r1.zzg()
            r1.zza()
            boolean r2 = r1.zzab()
            if (r2 == 0) goto L19
            r2 = 0
            com.google.android.gms.measurement.internal.zzr r2 = r1.zzae(r2)
            com.google.android.gms.measurement.internal.zznk r0 = new com.google.android.gms.measurement.internal.zznk
            r0.<init>(r1, r2)
            r1.zzah(r0)
        L19:
            return
    }

    protected final void zzS(com.google.android.gms.measurement.internal.zzmh r2) {
            r1 = this;
            r1.zzg()
            r1.zza()
            com.google.android.gms.measurement.internal.zznf r0 = new com.google.android.gms.measurement.internal.zznf
            r0.<init>(r1, r2)
            r1.zzah(r0)
            return
    }

    public final void zzT(android.os.Bundle r9) {
            r8 = this;
            r8.zzg()
            r8.zza()
            com.google.android.gms.measurement.internal.zzbf r5 = new com.google.android.gms.measurement.internal.zzbf
            r5.<init>(r9)
            r8.zzai()
            com.google.android.gms.measurement.internal.zzio r0 = r8.zzu
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r1 = com.google.android.gms.measurement.internal.zzgi.zzbl
            r2 = 0
            boolean r0 = r0.zzx(r2, r1)
            r1 = 0
            if (r0 == 0) goto L2d
            com.google.android.gms.measurement.internal.zzio r0 = r8.zzu
            com.google.android.gms.measurement.internal.zzgv r0 = r0.zzi()
            boolean r0 = r0.zzo(r5)
            if (r0 == 0) goto L2d
            r0 = 1
            r4 = 1
            goto L2e
        L2d:
            r4 = 0
        L2e:
            com.google.android.gms.measurement.internal.zzr r3 = r8.zzae(r1)
            com.google.android.gms.measurement.internal.zzng r7 = new com.google.android.gms.measurement.internal.zzng
            r2 = 1
            r0 = r7
            r1 = r8
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.zzah(r7)
            return
    }

    protected final void zzU() {
            r1 = this;
            r1.zzg()
            r1.zza()
            com.google.android.gms.measurement.internal.zzmq r0 = new com.google.android.gms.measurement.internal.zzmq
            r0.<init>(r1)
            r1.zzah(r0)
            return
    }

    protected final void zzV() {
            r2 = this;
            r2.zzg()
            r2.zza()
            r0 = 1
            com.google.android.gms.measurement.internal.zzr r0 = r2.zzae(r0)
            com.google.android.gms.measurement.internal.zznj r1 = new com.google.android.gms.measurement.internal.zznj
            r1.<init>(r2, r0)
            r2.zzah(r1)
            return
    }

    protected final void zzW(com.google.android.gms.measurement.internal.zzgl r1) {
            r0 = this;
            r0.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            r0.zzb = r1
            r0.zzag()
            r0.zzaf()
            return
    }

    protected final void zzX(boolean r1) {
            r0 = this;
            r0.zzg()
            r0.zza()
            com.google.android.gms.measurement.internal.zzmp r1 = new com.google.android.gms.measurement.internal.zzmp
            r1.<init>(r0)
            r0.zzah(r1)
            return
    }

    protected final void zzY(com.google.android.gms.measurement.internal.zzqb r4) {
            r3 = this;
            r3.zzg()
            r3.zza()
            r3.zzai()
            com.google.android.gms.measurement.internal.zzio r0 = r3.zzu
            com.google.android.gms.measurement.internal.zzgv r0 = r0.zzi()
            boolean r0 = r0.zzq(r4)
            r1 = 1
            com.google.android.gms.measurement.internal.zzr r1 = r3.zzae(r1)
            com.google.android.gms.measurement.internal.zzmy r2 = new com.google.android.gms.measurement.internal.zzmy
            r2.<init>(r3, r1, r0, r4)
            r3.zzah(r2)
            return
    }

    protected final void zzZ(com.google.android.gms.measurement.internal.zzag r3) {
            r2 = this;
            r2.zzg()
            r2.zza()
            r0 = 1
            com.google.android.gms.measurement.internal.zzr r0 = r2.zzae(r0)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzmr r1 = new com.google.android.gms.measurement.internal.zzmr
            r1.<init>(r2, r0, r3)
            r2.zzah(r1)
            return
    }

    public final boolean zzaa() {
            r1 = this;
            r1.zzg()
            r1.zza()
            com.google.android.gms.measurement.internal.zzgl r0 = r1.zzb
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    final boolean zzab() {
            r4 = this;
            r4.zzg()
            r4.zza()
            boolean r0 = r4.zzad()
            r1 = 1
            if (r0 == 0) goto L29
            com.google.android.gms.measurement.internal.zzio r0 = r4.zzu
            com.google.android.gms.measurement.internal.zzqf r0 = r0.zzw()
            int r0 = r0.zzm()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzaI
            r3 = 0
            java.lang.Object r2 = r2.zza(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r0 < r2) goto L27
            return r1
        L27:
            r0 = 0
            return r0
        L29:
            return r1
    }

    final boolean zzac() {
            r3 = this;
            r3.zzg()
            r3.zza()
            boolean r0 = r3.zzad()
            r1 = 1
            if (r0 == 0) goto L1f
            com.google.android.gms.measurement.internal.zzio r0 = r3.zzu
            com.google.android.gms.measurement.internal.zzqf r0 = r0.zzw()
            int r0 = r0.zzm()
            r2 = 241200(0x3ae30, float:3.37993E-40)
            if (r0 < r2) goto L1d
            return r1
        L1d:
            r0 = 0
            return r0
        L1f:
            return r1
    }

    final boolean zzad() {
            r7 = this;
            r7.zzg()
            r7.zza()
            java.lang.Boolean r0 = r7.zzc
            if (r0 != 0) goto L12d
            r7.zzg()
            r7.zza()
            com.google.android.gms.measurement.internal.zzio r0 = r7.zzu
            com.google.android.gms.measurement.internal.zzht r1 = r0.zzm()
            r1.zzg()
            android.content.SharedPreferences r2 = r1.zzb()
            java.lang.String r3 = "use_service"
            boolean r2 = r2.contains(r3)
            r4 = 0
            if (r2 != 0) goto L28
            r1 = 0
            goto L34
        L28:
            android.content.SharedPreferences r1 = r1.zzb()
            boolean r1 = r1.getBoolean(r3, r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
        L34:
            r2 = 1
            if (r1 == 0) goto L3f
            boolean r5 = r1.booleanValue()
            if (r5 == 0) goto L3f
            goto L127
        L3f:
            r0.zzaV()
            com.google.android.gms.measurement.internal.zzio r5 = r7.zzu
            com.google.android.gms.measurement.internal.zzgs r5 = r5.zzh()
            int r5 = r5.zzh()
            if (r5 != r2) goto L51
        L4e:
            r4 = 1
            goto Lf5
        L51:
            com.google.android.gms.measurement.internal.zzhe r5 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zzj()
            java.lang.String r6 = "Checking service availability"
            r5.zza(r6)
            com.google.android.gms.measurement.internal.zzqf r5 = r0.zzw()
            r6 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r5 = r5.zzp(r6)
            if (r5 == 0) goto Le6
            if (r5 == r2) goto Ld8
            r6 = 2
            if (r5 == r6) goto Lb8
            r1 = 3
            if (r5 == r1) goto La9
            r1 = 9
            if (r5 == r1) goto L9b
            r1 = 18
            if (r5 == r1) goto L8d
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzk()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.String r5 = "Unexpected service status"
            r1.zzb(r5, r2)
            goto Lb6
        L8d:
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzk()
            java.lang.String r4 = "Service updating"
            r1.zza(r4)
            goto L4e
        L9b:
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzk()
            java.lang.String r2 = "Service invalid"
            r1.zza(r2)
            goto Lb6
        La9:
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzk()
            java.lang.String r2 = "Service disabled"
            r1.zza(r2)
        Lb6:
            r2 = 0
            goto Lf5
        Lb8:
            com.google.android.gms.measurement.internal.zzhe r5 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zzd()
            java.lang.String r6 = "Service container out of date"
            r5.zza(r6)
            com.google.android.gms.measurement.internal.zzqf r5 = r0.zzw()
            int r5 = r5.zzm()
            r6 = 17443(0x4423, float:2.4443E-41)
            if (r5 >= r6) goto Ld2
            goto Lf5
        Ld2:
            if (r1 != 0) goto Ld5
            goto Ld6
        Ld5:
            r2 = 0
        Ld6:
            r4 = r2
            goto Lb6
        Ld8:
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.String r5 = "Service missing"
            r1.zza(r5)
            goto Lf5
        Le6:
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.String r4 = "Service available"
            r1.zza(r4)
            goto L4e
        Lf5:
            if (r4 != 0) goto L10f
            com.google.android.gms.measurement.internal.zzam r1 = r0.zzf()
            boolean r1 = r1.zzC()
            if (r1 == 0) goto L10f
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.String r1 = "No way to upload. Consider using the full version of Analytics"
            r0.zza(r1)
            goto L126
        L10f:
            if (r2 == 0) goto L126
            com.google.android.gms.measurement.internal.zzht r0 = r0.zzm()
            r0.zzg()
            android.content.SharedPreferences r0 = r0.zzb()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r3, r4)
            r0.apply()
        L126:
            r2 = r4
        L127:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r7.zzc = r0
        L12d:
            java.lang.Boolean r0 = r7.zzc
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzf() {
            r1 = this;
            r0 = 0
            return r0
    }

    protected final com.google.android.gms.measurement.internal.zzap zzh() {
            r4 = this;
            r4.zzg()
            r4.zza()
            com.google.android.gms.measurement.internal.zzgl r0 = r4.zzb
            r1 = 0
            if (r0 != 0) goto L1e
            r4.zzB()
            com.google.android.gms.measurement.internal.zzio r0 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzd()
            java.lang.String r2 = "Failed to get consents; not connected to service yet."
            r0.zza(r2)
            return r1
        L1e:
            r2 = 0
            com.google.android.gms.measurement.internal.zzr r2 = r4.zzae(r2)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.measurement.internal.zzap r0 = r0.zze(r2)     // Catch: android.os.RemoteException -> L2e
            r4.zzag()     // Catch: android.os.RemoteException -> L2e
            return r0
        L2e:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r2 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()
            java.lang.String r3 = "Failed to get consents; remote exception"
            r2.zzb(r3, r0)
            return r1
    }

    final java.lang.Boolean zzl() {
            r1 = this;
            java.lang.Boolean r0 = r1.zzc
            return r0
    }

    protected final void zzz() {
            r2 = this;
            r2.zzg()
            r2.zza()
            r0 = 1
            com.google.android.gms.measurement.internal.zzr r0 = r2.zzae(r0)
            com.google.android.gms.measurement.internal.zznd r1 = new com.google.android.gms.measurement.internal.zznd
            r1.<init>(r2, r0)
            r2.zzah(r1)
            return
    }
}
