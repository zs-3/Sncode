package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zznx implements android.content.ServiceConnection, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zza;
    private volatile boolean zzb;
    private volatile com.google.android.gms.measurement.internal.zzgy zzc;

    protected zznx(com.google.android.gms.measurement.internal.zzny r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ void zza(com.google.android.gms.measurement.internal.zznx r0, boolean r1) {
            r1 = 0
            r0.zzb = r1
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle r3) {
            r2 = this;
            com.google.android.gms.measurement.internal.zzny r3 = r2.zza
            com.google.android.gms.measurement.internal.zzio r3 = r3.zzu
            com.google.android.gms.measurement.internal.zzil r3 = r3.zzaX()
            r3.zzn()
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.zzgy r3 = r2.zzc     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L2c
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzgy r3 = r2.zzc     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L2c
            android.os.IInterface r3 = r3.getService()     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzgl r3 = (com.google.android.gms.measurement.internal.zzgl) r3     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzny r0 = r2.zza     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzns r1 = new com.google.android.gms.measurement.internal.zzns     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L2c
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L2c
            r0.zzq(r1)     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L2c
            goto L32
        L2a:
            r3 = move-exception
            goto L34
        L2c:
            r3 = 0
            r2.zzc = r3     // Catch: java.lang.Throwable -> L2a
            r3 = 0
            r2.zzb = r3     // Catch: java.lang.Throwable -> L2a
        L32:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            return
        L34:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            throw r3
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult r3) {
            r2 = this;
            com.google.android.gms.measurement.internal.zzny r0 = r2.zza
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzil r1 = r1.zzaX()
            r1.zzn()
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzl()
            if (r0 == 0) goto L1c
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzk()
            java.lang.String r1 = "Service connection failed"
            r0.zzb(r1, r3)
        L1c:
            monitor-enter(r2)
            r0 = 0
            r2.zzb = r0     // Catch: java.lang.Throwable -> L35
            r0 = 0
            r2.zzc = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.measurement.internal.zzny r0 = r2.zza
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zznw r1 = new com.google.android.gms.measurement.internal.zznw
            r1.<init>(r2, r3)
            r0.zzq(r1)
            return
        L35:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L35
            throw r3
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int r3) {
            r2 = this;
            com.google.android.gms.measurement.internal.zzny r3 = r2.zza
            com.google.android.gms.measurement.internal.zzio r3 = r3.zzu
            com.google.android.gms.measurement.internal.zzil r0 = r3.zzaX()
            r0.zzn()
            com.google.android.gms.measurement.internal.zzhe r0 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzd()
            java.lang.String r1 = "Service connection suspended"
            r0.zza(r1)
            com.google.android.gms.measurement.internal.zzil r3 = r3.zzaX()
            com.google.android.gms.measurement.internal.zznt r0 = new com.google.android.gms.measurement.internal.zznt
            r0.<init>(r2)
            r3.zzq(r0)
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
            r3 = this;
            com.google.android.gms.measurement.internal.zzny r4 = r3.zza
            com.google.android.gms.measurement.internal.zzio r4 = r4.zzu
            com.google.android.gms.measurement.internal.zzil r4 = r4.zzaX()
            r4.zzn()
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L24
            r3.zzb = r4     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.measurement.internal.zzny r4 = r3.zza     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.measurement.internal.zzio r4 = r4.zzu     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zze()     // Catch: java.lang.Throwable -> L69
            java.lang.String r5 = "Service connected with null binder"
            r4.zza(r5)     // Catch: java.lang.Throwable -> L69
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L69
            return
        L24:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch: java.lang.Throwable -> L69 android.os.RemoteException -> L6b
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch: java.lang.Throwable -> L69 android.os.RemoteException -> L6b
            if (r2 == 0) goto L57
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch: java.lang.Throwable -> L69 android.os.RemoteException -> L6b
            boolean r2 = r1 instanceof com.google.android.gms.measurement.internal.zzgl     // Catch: java.lang.Throwable -> L69 android.os.RemoteException -> L6b
            if (r2 == 0) goto L3f
            com.google.android.gms.measurement.internal.zzgl r1 = (com.google.android.gms.measurement.internal.zzgl) r1     // Catch: java.lang.Throwable -> L69 android.os.RemoteException -> L6b
        L3d:
            r0 = r1
            goto L45
        L3f:
            com.google.android.gms.measurement.internal.zzgj r1 = new com.google.android.gms.measurement.internal.zzgj     // Catch: java.lang.Throwable -> L69 android.os.RemoteException -> L6b
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L69 android.os.RemoteException -> L6b
            goto L3d
        L45:
            com.google.android.gms.measurement.internal.zzny r5 = r3.zza     // Catch: java.lang.Throwable -> L69 android.os.RemoteException -> L6b
            com.google.android.gms.measurement.internal.zzio r5 = r5.zzu     // Catch: java.lang.Throwable -> L69 android.os.RemoteException -> L6b
            com.google.android.gms.measurement.internal.zzhe r5 = r5.zzaW()     // Catch: java.lang.Throwable -> L69 android.os.RemoteException -> L6b
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zzj()     // Catch: java.lang.Throwable -> L69 android.os.RemoteException -> L6b
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.zza(r1)     // Catch: java.lang.Throwable -> L69 android.os.RemoteException -> L6b
            goto L7c
        L57:
            com.google.android.gms.measurement.internal.zzny r5 = r3.zza     // Catch: java.lang.Throwable -> L69 android.os.RemoteException -> L6b
            com.google.android.gms.measurement.internal.zzio r5 = r5.zzu     // Catch: java.lang.Throwable -> L69 android.os.RemoteException -> L6b
            com.google.android.gms.measurement.internal.zzhe r5 = r5.zzaW()     // Catch: java.lang.Throwable -> L69 android.os.RemoteException -> L6b
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zze()     // Catch: java.lang.Throwable -> L69 android.os.RemoteException -> L6b
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.zzb(r2, r1)     // Catch: java.lang.Throwable -> L69 android.os.RemoteException -> L6b
            goto L7c
        L69:
            r4 = move-exception
            goto La6
        L6b:
            com.google.android.gms.measurement.internal.zzny r5 = r3.zza     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.measurement.internal.zzio r5 = r5.zzu     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.measurement.internal.zzhe r5 = r5.zzaW()     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zze()     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.zza(r1)     // Catch: java.lang.Throwable -> L69
        L7c:
            if (r0 != 0) goto L94
            r3.zzb = r4     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.common.stats.ConnectionTracker r4 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch: java.lang.Throwable -> L69 java.lang.IllegalArgumentException -> La4
            com.google.android.gms.measurement.internal.zzny r5 = r3.zza     // Catch: java.lang.Throwable -> L69 java.lang.IllegalArgumentException -> La4
            com.google.android.gms.measurement.internal.zzio r0 = r5.zzu     // Catch: java.lang.Throwable -> L69 java.lang.IllegalArgumentException -> La4
            android.content.Context r0 = r0.zzaT()     // Catch: java.lang.Throwable -> L69 java.lang.IllegalArgumentException -> La4
            com.google.android.gms.measurement.internal.zznx r5 = com.google.android.gms.measurement.internal.zzny.zzj(r5)     // Catch: java.lang.Throwable -> L69 java.lang.IllegalArgumentException -> La4
            r4.unbindService(r0, r5)     // Catch: java.lang.Throwable -> L69 java.lang.IllegalArgumentException -> La4
            goto La4
        L94:
            com.google.android.gms.measurement.internal.zzny r4 = r3.zza     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.measurement.internal.zzio r4 = r4.zzu     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.measurement.internal.zzil r4 = r4.zzaX()     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.measurement.internal.zznq r5 = new com.google.android.gms.measurement.internal.zznq     // Catch: java.lang.Throwable -> L69
            r5.<init>(r3, r0)     // Catch: java.lang.Throwable -> L69
            r4.zzq(r5)     // Catch: java.lang.Throwable -> L69
        La4:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L69
            return
        La6:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L69
            throw r4
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName r4) {
            r3 = this;
            com.google.android.gms.measurement.internal.zzny r0 = r3.zza
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzil r1 = r0.zzaX()
            r1.zzn()
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzd()
            java.lang.String r2 = "Service disconnected"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zznr r1 = new com.google.android.gms.measurement.internal.zznr
            r1.<init>(r3, r4)
            r0.zzq(r1)
            return
    }

    public final void zzb(android.content.Intent r6) {
            r5 = this;
            com.google.android.gms.measurement.internal.zzny r0 = r5.zza
            r0.zzg()
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            android.content.Context r0 = r0.zzaT()
            com.google.android.gms.common.stats.ConnectionTracker r1 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()
            monitor-enter(r5)
            boolean r2 = r5.zzb     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L27
            com.google.android.gms.measurement.internal.zzny r6 = r5.zza     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.measurement.internal.zzio r6 = r6.zzu     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.measurement.internal.zzhe r6 = r6.zzaW()     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzj()     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = "Connection attempt already in progress"
            r6.zza(r0)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L46
            return
        L27:
            com.google.android.gms.measurement.internal.zzny r2 = r5.zza     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.measurement.internal.zzio r3 = r2.zzu     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzj()     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = "Using local app measurement service"
            r3.zza(r4)     // Catch: java.lang.Throwable -> L46
            r3 = 1
            r5.zzb = r3     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.measurement.internal.zznx r2 = com.google.android.gms.measurement.internal.zzny.zzj(r2)     // Catch: java.lang.Throwable -> L46
            r3 = 129(0x81, float:1.81E-43)
            r1.bindService(r0, r6, r2, r3)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L46
            return
        L46:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L46
            throw r6
    }

    public final void zzc() {
            r3 = this;
            com.google.android.gms.measurement.internal.zzny r0 = r3.zza
            r0.zzg()
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            android.content.Context r0 = r0.zzaT()
            monitor-enter(r3)
            boolean r1 = r3.zzb     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L23
            com.google.android.gms.measurement.internal.zzny r0 = r3.zza     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = "Connection attempt already in progress"
            r0.zza(r1)     // Catch: java.lang.Throwable -> L75
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L75
            return
        L23:
            com.google.android.gms.measurement.internal.zzgy r1 = r3.zzc     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L4a
            com.google.android.gms.measurement.internal.zzgy r1 = r3.zzc     // Catch: java.lang.Throwable -> L75
            boolean r1 = r1.isConnecting()     // Catch: java.lang.Throwable -> L75
            if (r1 != 0) goto L37
            com.google.android.gms.measurement.internal.zzgy r1 = r3.zzc     // Catch: java.lang.Throwable -> L75
            boolean r1 = r1.isConnected()     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L4a
        L37:
            com.google.android.gms.measurement.internal.zzny r0 = r3.zza     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = "Already awaiting connection attempt"
            r0.zza(r1)     // Catch: java.lang.Throwable -> L75
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L75
            return
        L4a:
            com.google.android.gms.measurement.internal.zzgy r1 = new com.google.android.gms.measurement.internal.zzgy     // Catch: java.lang.Throwable -> L75
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L75
            r1.<init>(r0, r2, r3, r3)     // Catch: java.lang.Throwable -> L75
            r3.zzc = r1     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.measurement.internal.zzny r0 = r3.zza     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = "Connecting to remote service"
            r0.zza(r1)     // Catch: java.lang.Throwable -> L75
            r0 = 1
            r3.zzb = r0     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.measurement.internal.zzgy r0 = r3.zzc     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.measurement.internal.zzgy r0 = r3.zzc     // Catch: java.lang.Throwable -> L75
            r0.checkAvailabilityAndConnect()     // Catch: java.lang.Throwable -> L75
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L75
            return
        L75:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L75
            throw r0
    }

    public final void zzd() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzgy r0 = r1.zzc
            if (r0 == 0) goto L19
            com.google.android.gms.measurement.internal.zzgy r0 = r1.zzc
            boolean r0 = r0.isConnected()
            if (r0 != 0) goto L14
            com.google.android.gms.measurement.internal.zzgy r0 = r1.zzc
            boolean r0 = r0.isConnecting()
            if (r0 == 0) goto L19
        L14:
            com.google.android.gms.measurement.internal.zzgy r0 = r1.zzc
            r0.disconnect()
        L19:
            r0 = 0
            r1.zzc = r0
            return
    }
}
