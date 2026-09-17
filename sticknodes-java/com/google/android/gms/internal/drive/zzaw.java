package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzaw extends com.google.android.gms.common.internal.GmsClient<com.google.android.gms.internal.drive.zzeo> {
    private final java.lang.String zzeb;
    protected final boolean zzec;
    private volatile com.google.android.gms.drive.DriveId zzed;
    private volatile com.google.android.gms.drive.DriveId zzee;
    private volatile boolean zzef;

    @com.google.android.gms.common.util.VisibleForTesting
    private final java.util.Map<com.google.android.gms.drive.DriveId, java.util.Map<com.google.android.gms.drive.events.ChangeListener, com.google.android.gms.internal.drive.zzee>> zzeg;

    @com.google.android.gms.common.util.VisibleForTesting
    private final java.util.Map<com.google.android.gms.drive.events.zzd, com.google.android.gms.internal.drive.zzee> zzeh;

    @com.google.android.gms.common.util.VisibleForTesting
    private final java.util.Map<com.google.android.gms.drive.DriveId, java.util.Map<com.google.android.gms.drive.events.zzl, com.google.android.gms.internal.drive.zzee>> zzei;

    @com.google.android.gms.common.util.VisibleForTesting
    private final java.util.Map<com.google.android.gms.drive.DriveId, java.util.Map<com.google.android.gms.drive.events.zzl, com.google.android.gms.internal.drive.zzee>> zzej;
    private final android.os.Bundle zzz;

    public zzaw(android.content.Context r8, android.os.Looper r9, com.google.android.gms.common.internal.ClientSettings r10, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r11, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r12, android.os.Bundle r13) {
            r7 = this;
            r3 = 11
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9 = 0
            r7.zzef = r9
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            r7.zzeg = r11
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            r7.zzeh = r11
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            r7.zzei = r11
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            r7.zzej = r11
            java.lang.String r10 = r10.getRealClientPackageName()
            r7.zzeb = r10
            r7.zzz = r13
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r11 = "com.google.android.gms.drive.events.HANDLE_EVENT"
            r10.<init>(r11)
            java.lang.String r11 = r8.getPackageName()
            r10.setPackage(r11)
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            java.util.List r8 = r8.queryIntentServices(r10, r9)
            int r11 = r8.size()
            if (r11 == 0) goto Lb2
            r12 = 1
            if (r11 != r12) goto L88
            java.lang.Object r8 = r8.get(r9)
            android.content.pm.ResolveInfo r8 = (android.content.pm.ResolveInfo) r8
            android.content.pm.ServiceInfo r8 = r8.serviceInfo
            boolean r9 = r8.exported
            if (r9 == 0) goto L60
            r7.zzec = r12
            return
        L60:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.name
            java.lang.String r10 = java.lang.String.valueOf(r8)
            int r10 = r10.length()
            int r10 = r10 + 60
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r10)
            java.lang.String r10 = "Drive event service "
            r11.append(r10)
            r11.append(r8)
            java.lang.String r8 = " must be exported in AndroidManifest.xml"
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r9.<init>(r8)
            throw r9
        L88:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = r10.getAction()
            java.lang.String r10 = java.lang.String.valueOf(r9)
            int r10 = r10.length()
            int r10 = r10 + 72
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r10)
            java.lang.String r10 = "AndroidManifest.xml can only define one service that handles the "
            r11.append(r10)
            r11.append(r9)
            java.lang.String r9 = " action"
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r8.<init>(r9)
            throw r8
        Lb2:
            r7.zzec = r9
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.drive.zzeo
            if (r1 == 0) goto L11
            com.google.android.gms.internal.drive.zzeo r0 = (com.google.android.gms.internal.drive.zzeo) r0
            return r0
        L11:
            com.google.android.gms.internal.drive.zzep r0 = new com.google.android.gms.internal.drive.zzep
            r0.<init>(r3)
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
            r2 = this;
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L14
            android.os.IInterface r0 = r2.getService()     // Catch: android.os.RemoteException -> L14
            com.google.android.gms.internal.drive.zzeo r0 = (com.google.android.gms.internal.drive.zzeo) r0     // Catch: android.os.RemoteException -> L14
            com.google.android.gms.internal.drive.zzad r1 = new com.google.android.gms.internal.drive.zzad     // Catch: android.os.RemoteException -> L14
            r1.<init>()     // Catch: android.os.RemoteException -> L14
            r0.zza(r1)     // Catch: android.os.RemoteException -> L14
        L14:
            super.disconnect()
            java.util.Map<com.google.android.gms.drive.DriveId, java.util.Map<com.google.android.gms.drive.events.ChangeListener, com.google.android.gms.internal.drive.zzee>> r0 = r2.zzeg
            monitor-enter(r0)
            java.util.Map<com.google.android.gms.drive.DriveId, java.util.Map<com.google.android.gms.drive.events.ChangeListener, com.google.android.gms.internal.drive.zzee>> r1 = r2.zzeg     // Catch: java.lang.Throwable -> L45
            r1.clear()     // Catch: java.lang.Throwable -> L45
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            java.util.Map<com.google.android.gms.drive.events.zzd, com.google.android.gms.internal.drive.zzee> r1 = r2.zzeh
            monitor-enter(r1)
            java.util.Map<com.google.android.gms.drive.events.zzd, com.google.android.gms.internal.drive.zzee> r0 = r2.zzeh     // Catch: java.lang.Throwable -> L42
            r0.clear()     // Catch: java.lang.Throwable -> L42
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L42
            java.util.Map<com.google.android.gms.drive.DriveId, java.util.Map<com.google.android.gms.drive.events.zzl, com.google.android.gms.internal.drive.zzee>> r0 = r2.zzei
            monitor-enter(r0)
            java.util.Map<com.google.android.gms.drive.DriveId, java.util.Map<com.google.android.gms.drive.events.zzl, com.google.android.gms.internal.drive.zzee>> r1 = r2.zzei     // Catch: java.lang.Throwable -> L3f
            r1.clear()     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            java.util.Map<com.google.android.gms.drive.DriveId, java.util.Map<com.google.android.gms.drive.events.zzl, com.google.android.gms.internal.drive.zzee>> r1 = r2.zzej
            monitor-enter(r1)
            java.util.Map<com.google.android.gms.drive.DriveId, java.util.Map<com.google.android.gms.drive.events.zzl, com.google.android.gms.internal.drive.zzee>> r0 = r2.zzej     // Catch: java.lang.Throwable -> L3c
            r0.clear()     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3c
            return
        L3c:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3c
            throw r0
        L3f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r1
        L42:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L42
            throw r0
        L45:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            throw r1
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final android.os.Bundle getGetServiceRequestExtraArgs() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            java.lang.String r0 = r0.getPackageName()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.common.internal.ClientSettings r1 = r3.getClientSettings()
            java.util.Set r1 = r1.getAllRequestedScopes()
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            com.google.android.gms.common.internal.Preconditions.checkState(r1)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = r3.zzeb
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L30
            java.lang.String r0 = r3.zzeb
            java.lang.String r2 = "proxy_package_name"
            r1.putString(r2, r0)
        L30:
            android.os.Bundle r0 = r3.zzz
            r1.putAll(r0)
            return r1
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
            r1 = this;
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getServiceDescriptor() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.drive.internal.IDriveService"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.drive.ApiService.START"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final void onPostInitHandler(int r2, android.os.IBinder r3, android.os.Bundle r4, int r5) {
            r1 = this;
            if (r4 == 0) goto L22
            java.lang.Class<com.google.android.gms.internal.drive.zzaw> r0 = com.google.android.gms.internal.drive.zzaw.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r4.setClassLoader(r0)
            java.lang.String r0 = "com.google.android.gms.drive.root_id"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            com.google.android.gms.drive.DriveId r0 = (com.google.android.gms.drive.DriveId) r0
            r1.zzed = r0
            java.lang.String r0 = "com.google.android.gms.drive.appdata_id"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            com.google.android.gms.drive.DriveId r0 = (com.google.android.gms.drive.DriveId) r0
            r1.zzee = r0
            r0 = 1
            r1.zzef = r0
        L22:
            super.onPostInitHandler(r2, r3, r4, r5)
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresAccount() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r1 = r2.zzeb
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L21
            android.content.Context r0 = r2.getContext()
            int r1 = android.os.Process.myUid()
            boolean r0 = com.google.android.gms.common.util.UidVerifier.isGooglePlayServicesUid(r0, r1)
            if (r0 != 0) goto L1f
            goto L21
        L1f:
            r0 = 0
            return r0
        L21:
            r0 = 1
            return r0
    }

    final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> zza(com.google.android.gms.common.api.GoogleApiClient r7, com.google.android.gms.drive.DriveId r8, com.google.android.gms.drive.events.ChangeListener r9) {
            r6 = this;
            r0 = 1
            boolean r1 = com.google.android.gms.drive.events.zzj.zza(r0, r8)
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1)
            java.lang.String r1 = "listener"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9, r1)
            boolean r1 = r6.isConnected()
            java.lang.String r2 = "Client must be connected"
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r2)
            java.util.Map<com.google.android.gms.drive.DriveId, java.util.Map<com.google.android.gms.drive.events.ChangeListener, com.google.android.gms.internal.drive.zzee>> r1 = r6.zzeg
            monitor-enter(r1)
            java.util.Map<com.google.android.gms.drive.DriveId, java.util.Map<com.google.android.gms.drive.events.ChangeListener, com.google.android.gms.internal.drive.zzee>> r2 = r6.zzeg     // Catch: java.lang.Throwable -> L68
            java.lang.Object r2 = r2.get(r8)     // Catch: java.lang.Throwable -> L68
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L2d
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L68
            r2.<init>()     // Catch: java.lang.Throwable -> L68
            java.util.Map<com.google.android.gms.drive.DriveId, java.util.Map<com.google.android.gms.drive.events.ChangeListener, com.google.android.gms.internal.drive.zzee>> r3 = r6.zzeg     // Catch: java.lang.Throwable -> L68
            r3.put(r8, r2)     // Catch: java.lang.Throwable -> L68
        L2d:
            java.lang.Object r3 = r2.get(r9)     // Catch: java.lang.Throwable -> L68
            com.google.android.gms.internal.drive.zzee r3 = (com.google.android.gms.internal.drive.zzee) r3     // Catch: java.lang.Throwable -> L68
            if (r3 != 0) goto L46
            com.google.android.gms.internal.drive.zzee r3 = new com.google.android.gms.internal.drive.zzee     // Catch: java.lang.Throwable -> L68
            android.os.Looper r4 = r6.getLooper()     // Catch: java.lang.Throwable -> L68
            android.content.Context r5 = r6.getContext()     // Catch: java.lang.Throwable -> L68
            r3.<init>(r4, r5, r0, r9)     // Catch: java.lang.Throwable -> L68
            r2.put(r9, r3)     // Catch: java.lang.Throwable -> L68
            goto L55
        L46:
            boolean r9 = r3.zzg(r0)     // Catch: java.lang.Throwable -> L68
            if (r9 == 0) goto L55
            com.google.android.gms.internal.drive.zzat r8 = new com.google.android.gms.internal.drive.zzat     // Catch: java.lang.Throwable -> L68
            com.google.android.gms.common.api.Status r9 = com.google.android.gms.common.api.Status.RESULT_SUCCESS     // Catch: java.lang.Throwable -> L68
            r8.<init>(r7, r9)     // Catch: java.lang.Throwable -> L68
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L68
            return r8
        L55:
            r3.zzf(r0)     // Catch: java.lang.Throwable -> L68
            com.google.android.gms.internal.drive.zzj r9 = new com.google.android.gms.internal.drive.zzj     // Catch: java.lang.Throwable -> L68
            r9.<init>(r0, r8)     // Catch: java.lang.Throwable -> L68
            com.google.android.gms.internal.drive.zzax r8 = new com.google.android.gms.internal.drive.zzax     // Catch: java.lang.Throwable -> L68
            r8.<init>(r6, r7, r9, r3)     // Catch: java.lang.Throwable -> L68
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r7 = r7.execute(r8)     // Catch: java.lang.Throwable -> L68
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L68
            return r7
        L68:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L68
            throw r7
    }

    public final com.google.android.gms.drive.DriveId zzae() {
            r1 = this;
            com.google.android.gms.drive.DriveId r0 = r1.zzed
            return r0
    }

    public final com.google.android.gms.drive.DriveId zzaf() {
            r1 = this;
            com.google.android.gms.drive.DriveId r0 = r1.zzee
            return r0
    }

    public final boolean zzag() {
            r1 = this;
            boolean r0 = r1.zzef
            return r0
    }

    public final boolean zzah() {
            r1 = this;
            boolean r0 = r1.zzec
            return r0
    }

    final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> zzb(com.google.android.gms.common.api.GoogleApiClient r4, com.google.android.gms.drive.DriveId r5, com.google.android.gms.drive.events.ChangeListener r6) {
            r3 = this;
            r0 = 1
            boolean r1 = com.google.android.gms.drive.events.zzj.zza(r0, r5)
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1)
            boolean r1 = r3.isConnected()
            java.lang.String r2 = "Client must be connected"
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r2)
            java.lang.String r1 = "listener"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6, r1)
            java.util.Map<com.google.android.gms.drive.DriveId, java.util.Map<com.google.android.gms.drive.events.ChangeListener, com.google.android.gms.internal.drive.zzee>> r1 = r3.zzeg
            monitor-enter(r1)
            java.util.Map<com.google.android.gms.drive.DriveId, java.util.Map<com.google.android.gms.drive.events.ChangeListener, com.google.android.gms.internal.drive.zzee>> r2 = r3.zzeg     // Catch: java.lang.Throwable -> L58
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> L58
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L58
            if (r2 != 0) goto L2c
            com.google.android.gms.internal.drive.zzat r5 = new com.google.android.gms.internal.drive.zzat     // Catch: java.lang.Throwable -> L58
            com.google.android.gms.common.api.Status r6 = com.google.android.gms.common.api.Status.RESULT_SUCCESS     // Catch: java.lang.Throwable -> L58
            r5.<init>(r4, r6)     // Catch: java.lang.Throwable -> L58
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
            return r5
        L2c:
            java.lang.Object r6 = r2.remove(r6)     // Catch: java.lang.Throwable -> L58
            com.google.android.gms.internal.drive.zzee r6 = (com.google.android.gms.internal.drive.zzee) r6     // Catch: java.lang.Throwable -> L58
            if (r6 != 0) goto L3d
            com.google.android.gms.internal.drive.zzat r5 = new com.google.android.gms.internal.drive.zzat     // Catch: java.lang.Throwable -> L58
            com.google.android.gms.common.api.Status r6 = com.google.android.gms.common.api.Status.RESULT_SUCCESS     // Catch: java.lang.Throwable -> L58
            r5.<init>(r4, r6)     // Catch: java.lang.Throwable -> L58
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
            return r5
        L3d:
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L48
            java.util.Map<com.google.android.gms.drive.DriveId, java.util.Map<com.google.android.gms.drive.events.ChangeListener, com.google.android.gms.internal.drive.zzee>> r2 = r3.zzeg     // Catch: java.lang.Throwable -> L58
            r2.remove(r5)     // Catch: java.lang.Throwable -> L58
        L48:
            com.google.android.gms.internal.drive.zzgs r2 = new com.google.android.gms.internal.drive.zzgs     // Catch: java.lang.Throwable -> L58
            r2.<init>(r5, r0)     // Catch: java.lang.Throwable -> L58
            com.google.android.gms.internal.drive.zzay r5 = new com.google.android.gms.internal.drive.zzay     // Catch: java.lang.Throwable -> L58
            r5.<init>(r3, r4, r2, r6)     // Catch: java.lang.Throwable -> L58
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r4 = r4.execute(r5)     // Catch: java.lang.Throwable -> L58
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
            return r4
        L58:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
            throw r4
    }
}
