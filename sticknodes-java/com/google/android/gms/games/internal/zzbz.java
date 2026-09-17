package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzbz extends com.google.android.gms.common.internal.GmsClient {
    public static final /* synthetic */ int zze = 0;
    private final com.google.android.gms.internal.games.zzfo zzf;
    private final java.lang.String zzg;
    private com.google.android.gms.games.PlayerEntity zzh;
    private com.google.android.gms.games.GameEntity zzi;
    private final com.google.android.gms.games.internal.zzcf zzj;
    private boolean zzk;
    private final long zzl;
    private final com.google.android.gms.games.Games.GamesOptions zzm;
    private final com.google.android.gms.games.internal.zzcg zzn;

    public zzbz(android.content.Context r8, android.os.Looper r9, com.google.android.gms.common.internal.ClientSettings r10, com.google.android.gms.games.Games.GamesOptions r11, com.google.android.gms.common.api.internal.ConnectionCallbacks r12, com.google.android.gms.common.api.internal.OnConnectionFailedListener r13, com.google.android.gms.games.internal.zzcg r14) {
            r7 = this;
            r3 = 1
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.google.android.gms.games.internal.zzq r9 = new com.google.android.gms.games.internal.zzq
            r9.<init>(r7)
            r7.zzf = r9
            r9 = 0
            r7.zzk = r9
            java.lang.String r9 = r10.getRealClientPackageName()
            r7.zzg = r9
            java.lang.Object r9 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r14)
            com.google.android.gms.games.internal.zzcg r9 = (com.google.android.gms.games.internal.zzcg) r9
            r7.zzn = r9
            int r9 = r10.getGravityForPopups()
            com.google.android.gms.games.internal.zzcf r9 = com.google.android.gms.games.internal.zzcf.zzc(r7, r9)
            r7.zzj = r9
            int r12 = r7.hashCode()
            long r12 = (long) r12
            r7.zzl = r12
            r7.zzm = r11
            boolean r11 = r11.zzh
            android.view.View r11 = r10.getViewForPopups()
            if (r11 != 0) goto L43
            boolean r8 = r8 instanceof android.app.Activity
            if (r8 == 0) goto L42
            goto L43
        L42:
            return
        L43:
            android.view.View r8 = r10.getViewForPopups()
            r9.zze(r8)
            return
    }

    static /* bridge */ /* synthetic */ void zzL(com.google.android.gms.games.internal.zzbz r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = 26703(0x684f, float:3.7419E-41)
            android.os.IInterface r1 = r1.getService()     // Catch: android.os.RemoteException -> L18
            com.google.android.gms.games.internal.zzce r1 = (com.google.android.gms.games.internal.zzce) r1     // Catch: android.os.RemoteException -> L18
            android.app.PendingIntent r1 = r1.zzf()     // Catch: android.os.RemoteException -> L18
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.games.GamesClientStatusCodes.zzb(r0, r1)     // Catch: android.os.RemoteException -> L18
            com.google.android.gms.games.FriendsResolutionRequiredException r1 = com.google.android.gms.games.FriendsResolutionRequiredException.zza(r1)     // Catch: android.os.RemoteException -> L18
            r2.setException(r1)     // Catch: android.os.RemoteException -> L18
            return
        L18:
            r1 = move-exception
            r2.setException(r1)
            return
    }

    static /* bridge */ /* synthetic */ void zzM(android.os.RemoteException r0) {
            zzbf(r0)
            return
    }

    private static void zzbf(android.os.RemoteException r2) {
            java.lang.String r0 = "GamesGmsClientImpl"
            java.lang.String r1 = "service died"
            com.google.android.gms.internal.games.zzft.zze(r0, r1, r2)
            return
    }

    private static void zzbg(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r0, java.lang.SecurityException r1) {
            if (r0 == 0) goto La
            r1 = 4
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.games.GamesClientStatusCodes.zza(r1)
            r0.setFailedResult(r1)
        La:
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void connect(com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks r2) {
            r1 = this;
            r0 = 0
            r1.zzh = r0
            r1.zzi = r0
            super.connect(r2)
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            goto L18
        L4:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.games.internal.zzce
            if (r1 == 0) goto L12
            r3 = r0
            com.google.android.gms.games.internal.zzce r3 = (com.google.android.gms.games.internal.zzce) r3
            goto L18
        L12:
            com.google.android.gms.games.internal.zzce r0 = new com.google.android.gms.games.internal.zzce
            r0.<init>(r3)
            r3 = r0
        L18:
            return r3
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
            r3 = this;
            r0 = 0
            r3.zzk = r0
            boolean r0 = r3.isConnected()
            if (r0 == 0) goto L21
            com.google.android.gms.internal.games.zzfo r0 = r3.zzf     // Catch: android.os.RemoteException -> L1a
            r0.zzb()     // Catch: android.os.RemoteException -> L1a
            android.os.IInterface r0 = r3.getService()     // Catch: android.os.RemoteException -> L1a
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: android.os.RemoteException -> L1a
            long r1 = r3.zzl     // Catch: android.os.RemoteException -> L1a
            r0.zzv(r1)     // Catch: android.os.RemoteException -> L1a
            goto L21
        L1a:
            java.lang.String r0 = "GamesGmsClientImpl"
            java.lang.String r1 = "Failed to notify client disconnect."
            com.google.android.gms.internal.games.zzft.zzd(r0, r1)
        L21:
            super.disconnect()
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final com.google.android.gms.common.Feature[] getApiFeatures() {
            r1 = this;
            com.google.android.gms.common.Feature[] r0 = com.google.android.gms.games.zzd.zzf
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final android.os.Bundle getConnectionHint() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final android.os.Bundle getGetServiceRequestExtraArgs() {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            java.lang.String r0 = r0.toString()
            com.google.android.gms.games.Games$GamesOptions r1 = r4.zzm
            android.os.Bundle r1 = r1.zza()
            java.lang.String r2 = r4.zzg
            java.lang.String r3 = "com.google.android.gms.games.key.gamePackageName"
            r1.putString(r3, r2)
            java.lang.String r2 = "com.google.android.gms.games.key.desiredLocale"
            r1.putString(r2, r0)
            com.google.android.gms.common.internal.BinderWrapper r0 = new com.google.android.gms.common.internal.BinderWrapper
            com.google.android.gms.games.internal.zzcf r2 = r4.zzj
            android.os.IBinder r2 = r2.zzb()
            r0.<init>(r2)
            java.lang.String r2 = "com.google.android.gms.games.key.popupWindowToken"
            r1.putParcelable(r2, r0)
            java.lang.String r0 = "com.google.android.gms.games.key.API_VERSION"
            boolean r2 = r1.containsKey(r0)
            if (r2 != 0) goto L41
            r2 = 9
            r1.putInt(r0, r2)
        L41:
            com.google.android.gms.common.internal.ClientSettings r0 = r4.getClientSettings()
            android.os.Bundle r0 = com.google.android.gms.signin.internal.SignInClientImpl.createBundleFromClientSettings(r0)
            java.lang.String r2 = "com.google.android.gms.games.key.signInOptions"
            r1.putBundle(r2, r0)
            return r1
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
            r1 = this;
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            return r0
    }

    @Override // com.google.android.gms.common.internal.GmsClient, com.google.android.gms.common.api.Api.Client
    public final java.util.Set getScopesForConnectionlessNonSignIn() {
            r1 = this;
            java.util.Set r0 = r1.getScopes()
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getServiceDescriptor() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.games.service.START"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* bridge */ /* synthetic */ void onConnectedLocked(android.os.IInterface r5) {
            r4 = this;
            com.google.android.gms.games.internal.zzce r5 = (com.google.android.gms.games.internal.zzce) r5
            super.onConnectedLocked(r5)
            boolean r0 = r4.zzk
            if (r0 == 0) goto L11
            com.google.android.gms.games.internal.zzcf r0 = r4.zzj
            r0.zzg()
            r0 = 0
            r4.zzk = r0
        L11:
            com.google.android.gms.games.Games$GamesOptions r0 = r4.zzm
            boolean r0 = r0.zza
            com.google.android.gms.internal.games.zzfr r0 = new com.google.android.gms.internal.games.zzfr     // Catch: android.os.RemoteException -> L2b
            com.google.android.gms.games.internal.zzcf r1 = r4.zzj     // Catch: android.os.RemoteException -> L2b
            com.google.android.gms.internal.games.zzfq r1 = r1.zzd()     // Catch: android.os.RemoteException -> L2b
            r0.<init>(r1)     // Catch: android.os.RemoteException -> L2b
            com.google.android.gms.games.internal.zzs r1 = new com.google.android.gms.games.internal.zzs     // Catch: android.os.RemoteException -> L2b
            r1.<init>(r0)     // Catch: android.os.RemoteException -> L2b
            long r2 = r4.zzl     // Catch: android.os.RemoteException -> L2b
            r5.zzW(r1, r2)     // Catch: android.os.RemoteException -> L2b
            return
        L2b:
            r5 = move-exception
            zzbf(r5)
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult r1) {
            r0 = this;
            super.onConnectionFailed(r1)
            r1 = 0
            r0.zzk = r1
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final void onPostInitHandler(int r2, android.os.IBinder r3, android.os.Bundle r4, int r5) {
            r1 = this;
            r0 = 0
            if (r2 != 0) goto L2b
            if (r4 == 0) goto L2a
            java.lang.Class<com.google.android.gms.games.internal.zzbz> r2 = com.google.android.gms.games.internal.zzbz.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            r4.setClassLoader(r2)
            java.lang.String r2 = "show_welcome_popup"
            boolean r2 = r4.getBoolean(r2)
            r1.zzk = r2
            java.lang.String r2 = "com.google.android.gms.games.current_player"
            android.os.Parcelable r2 = r4.getParcelable(r2)
            com.google.android.gms.games.PlayerEntity r2 = (com.google.android.gms.games.PlayerEntity) r2
            r1.zzh = r2
            java.lang.String r2 = "com.google.android.gms.games.current_game"
            android.os.Parcelable r2 = r4.getParcelable(r2)
            com.google.android.gms.games.GameEntity r2 = (com.google.android.gms.games.GameEntity) r2
            r1.zzi = r2
        L2a:
            r2 = 0
        L2b:
            super.onPostInitHandler(r2, r3, r4, r5)
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void onUserSignOut(com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks r2) {
            r1 = this;
            com.google.android.gms.games.internal.zzx r0 = new com.google.android.gms.games.internal.zzx     // Catch: android.os.RemoteException -> L9
            r0.<init>(r2)     // Catch: android.os.RemoteException -> L9
            r1.zzaV(r0)     // Catch: android.os.RemoteException -> L9
            return
        L9:
            r2.onSignOutComplete()
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
            r1 = this;
            com.google.android.gms.games.Games$GamesOptions r0 = r1.zzm
            com.google.android.gms.games.internal.zzf r0 = r0.zzo
            r0 = 1
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final android.content.Intent zzA() {
            r1 = this;
            android.content.Intent r0 = r1.zzz()     // Catch: android.os.RemoteException -> L5
            return r0
        L5:
            r0 = move-exception
            zzbf(r0)
            r0 = 0
            return r0
    }

    public final android.content.Intent zzB(java.lang.String r2, boolean r3, boolean r4, int r5) throws android.os.RemoteException {
            r1 = this;
            android.os.IInterface r0 = r1.getService()
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0
            android.content.Intent r2 = r0.zzm(r2, r3, r4, r5)
            return r2
    }

    public final android.content.Intent zzC(java.lang.String r1, boolean r2, boolean r3, int r4) {
            r0 = this;
            android.content.Intent r1 = r0.zzB(r1, r2, r3, r4)     // Catch: android.os.RemoteException -> L5
            return r1
        L5:
            r1 = move-exception
            zzbf(r1)
            r1 = 0
            return r1
    }

    public final com.google.android.gms.games.Game zzD() throws android.os.RemoteException {
            r3 = this;
            r3.checkConnected()
            monitor-enter(r3)
            com.google.android.gms.games.GameEntity r0 = r3.zzi     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L32
            com.google.android.gms.games.GameBuffer r0 = new com.google.android.gms.games.GameBuffer     // Catch: java.lang.Throwable -> L36
            android.os.IInterface r1 = r3.getService()     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.games.internal.zzce r1 = (com.google.android.gms.games.internal.zzce) r1     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.common.data.DataHolder r1 = r1.zzp()     // Catch: java.lang.Throwable -> L36
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L36
            int r1 = r0.getCount()     // Catch: java.lang.Throwable -> L2d
            if (r1 <= 0) goto L29
            r1 = 0
            com.google.android.gms.games.Game r1 = r0.get(r1)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.games.GameEntity r2 = new com.google.android.gms.games.GameEntity     // Catch: java.lang.Throwable -> L2d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L2d
            r3.zzi = r2     // Catch: java.lang.Throwable -> L2d
        L29:
            r0.release()     // Catch: java.lang.Throwable -> L36
            goto L32
        L2d:
            r1 = move-exception
            r0.release()     // Catch: java.lang.Throwable -> L36
            throw r1     // Catch: java.lang.Throwable -> L36
        L32:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.games.GameEntity r0 = r3.zzi
            return r0
        L36:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            throw r0
    }

    public final com.google.android.gms.games.Game zzE() {
            r1 = this;
            com.google.android.gms.games.Game r0 = r1.zzD()     // Catch: android.os.RemoteException -> L5
            return r0
        L5:
            r0 = move-exception
            zzbf(r0)
            r0 = 0
            return r0
    }

    public final com.google.android.gms.games.Player zzF() throws android.os.RemoteException {
            r3 = this;
            r3.checkConnected()
            monitor-enter(r3)
            com.google.android.gms.games.PlayerEntity r0 = r3.zzh     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L32
            com.google.android.gms.games.PlayerBuffer r0 = new com.google.android.gms.games.PlayerBuffer     // Catch: java.lang.Throwable -> L36
            android.os.IInterface r1 = r3.getService()     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.games.internal.zzce r1 = (com.google.android.gms.games.internal.zzce) r1     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.common.data.DataHolder r1 = r1.zzq()     // Catch: java.lang.Throwable -> L36
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L36
            int r1 = r0.getCount()     // Catch: java.lang.Throwable -> L2d
            if (r1 <= 0) goto L29
            r1 = 0
            com.google.android.gms.games.Player r1 = r0.get(r1)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.games.PlayerEntity r2 = new com.google.android.gms.games.PlayerEntity     // Catch: java.lang.Throwable -> L2d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L2d
            r3.zzh = r2     // Catch: java.lang.Throwable -> L2d
        L29:
            r0.release()     // Catch: java.lang.Throwable -> L36
            goto L32
        L2d:
            r1 = move-exception
            r0.release()     // Catch: java.lang.Throwable -> L36
            throw r1     // Catch: java.lang.Throwable -> L36
        L32:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.games.PlayerEntity r0 = r3.zzh
            return r0
        L36:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            throw r0
    }

    public final com.google.android.gms.games.Player zzG() {
            r1 = this;
            com.google.android.gms.games.Player r0 = r1.zzF()     // Catch: android.os.RemoteException -> L5
            return r0
        L5:
            r0 = move-exception
            zzbf(r0)
            r0 = 0
            return r0
    }

    public final java.lang.String zzH() throws android.os.RemoteException {
            r1 = this;
            android.os.IInterface r0 = r1.getService()
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0
            java.lang.String r0 = r0.zzs()
            return r0
    }

    public final java.lang.String zzI() {
            r1 = this;
            java.lang.String r0 = r1.zzH()     // Catch: android.os.RemoteException -> L5
            return r0
        L5:
            r0 = move-exception
            zzbf(r0)
            r0 = 0
            return r0
    }

    public final java.lang.String zzJ(boolean r1) throws android.os.RemoteException {
            r0 = this;
            com.google.android.gms.games.PlayerEntity r1 = r0.zzh
            if (r1 == 0) goto L9
            java.lang.String r1 = r1.getPlayerId()
            return r1
        L9:
            android.os.IInterface r1 = r0.getService()
            com.google.android.gms.games.internal.zzce r1 = (com.google.android.gms.games.internal.zzce) r1
            java.lang.String r1 = r1.zzt()
            return r1
    }

    public final java.lang.String zzK(boolean r1) {
            r0 = this;
            r1 = 1
            java.lang.String r1 = r0.zzJ(r1)     // Catch: android.os.RemoteException -> L6
            return r1
        L6:
            r1 = move-exception
            zzbf(r1)
            r1 = 0
            return r1
    }

    final void zzN() {
            r1 = this;
            boolean r0 = r1.isConnected()
            if (r0 == 0) goto L14
            android.os.IInterface r0 = r1.getService()     // Catch: android.os.RemoteException -> L10
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: android.os.RemoteException -> L10
            r0.zzu()     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r0 = move-exception
            zzbf(r0)
        L14:
            return
    }

    public final void zzO(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r4, com.google.android.gms.games.snapshot.Snapshot r5, com.google.android.gms.games.snapshot.SnapshotMetadataChange r6) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.games.snapshot.SnapshotContents r0 = r5.getSnapshotContents()
            boolean r1 = r0.isClosed()
            r1 = r1 ^ 1
            java.lang.String r2 = "Snapshot already closed"
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r2)
            com.google.android.gms.common.data.BitmapTeleporter r1 = r6.zza()
            if (r1 == 0) goto L20
            android.content.Context r2 = r3.getContext()
            java.io.File r2 = r2.getCacheDir()
            r1.setTempDir(r2)
        L20:
            com.google.android.gms.drive.Contents r1 = r0.zza()
            r0.zzb()
            android.os.IInterface r0 = r3.getService()     // Catch: java.lang.SecurityException -> L40
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> L40
            com.google.android.gms.games.internal.zzh r2 = new com.google.android.gms.games.internal.zzh     // Catch: java.lang.SecurityException -> L40
            r2.<init>(r4)     // Catch: java.lang.SecurityException -> L40
            com.google.android.gms.games.snapshot.SnapshotMetadata r5 = r5.getMetadata()     // Catch: java.lang.SecurityException -> L40
            java.lang.String r5 = r5.getSnapshotId()     // Catch: java.lang.SecurityException -> L40
            com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity r6 = (com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity) r6     // Catch: java.lang.SecurityException -> L40
            r0.zzw(r2, r5, r6, r1)     // Catch: java.lang.SecurityException -> L40
            return
        L40:
            r5 = move-exception
            zzbg(r4, r5)
            return
    }

    public final void zzP(com.google.android.gms.tasks.TaskCompletionSource r4, com.google.android.gms.games.snapshot.Snapshot r5, com.google.android.gms.games.snapshot.SnapshotMetadataChange r6) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.games.snapshot.SnapshotContents r0 = r5.getSnapshotContents()
            boolean r1 = r0.isClosed()
            r1 = r1 ^ 1
            java.lang.String r2 = "Snapshot already closed"
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r2)
            com.google.android.gms.common.data.BitmapTeleporter r1 = r6.zza()
            if (r1 == 0) goto L20
            android.content.Context r2 = r3.getContext()
            java.io.File r2 = r2.getCacheDir()
            r1.setTempDir(r2)
        L20:
            com.google.android.gms.drive.Contents r1 = r0.zza()
            r0.zzb()
            android.os.IInterface r0 = r3.getService()     // Catch: java.lang.SecurityException -> L40
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> L40
            com.google.android.gms.games.internal.zzag r2 = new com.google.android.gms.games.internal.zzag     // Catch: java.lang.SecurityException -> L40
            r2.<init>(r4)     // Catch: java.lang.SecurityException -> L40
            com.google.android.gms.games.snapshot.SnapshotMetadata r5 = r5.getMetadata()     // Catch: java.lang.SecurityException -> L40
            java.lang.String r5 = r5.getSnapshotId()     // Catch: java.lang.SecurityException -> L40
            com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity r6 = (com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity) r6     // Catch: java.lang.SecurityException -> L40
            r0.zzw(r2, r5, r6, r1)     // Catch: java.lang.SecurityException -> L40
            return
        L40:
            r5 = move-exception
            com.google.android.gms.games.GamesStatusUtils.zzb(r4, r5)
            return
    }

    public final void zzQ(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r3, java.lang.String r4) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzi r1 = new com.google.android.gms.games.internal.zzi     // Catch: java.lang.SecurityException -> Lf
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> Lf
            r0.zzx(r1, r4)     // Catch: java.lang.SecurityException -> Lf
            return
        Lf:
            r4 = move-exception
            zzbg(r3, r4)
            return
    }

    public final void zzR(com.google.android.gms.tasks.TaskCompletionSource r3, java.lang.String r4) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzai r1 = new com.google.android.gms.games.internal.zzai     // Catch: java.lang.SecurityException -> Lf
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> Lf
            r0.zzx(r1, r4)     // Catch: java.lang.SecurityException -> Lf
            return
        Lf:
            r4 = move-exception
            com.google.android.gms.games.GamesStatusUtils.zzb(r3, r4)
            return
    }

    public final void zzS(com.google.android.gms.games.snapshot.Snapshot r3) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.games.snapshot.SnapshotContents r3 = r3.getSnapshotContents()
            boolean r0 = r3.isClosed()
            r0 = r0 ^ 1
            java.lang.String r1 = "Snapshot already closed"
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            com.google.android.gms.drive.Contents r0 = r3.zza()
            r3.zzb()
            android.os.IInterface r3 = r2.getService()
            com.google.android.gms.games.internal.zzce r3 = (com.google.android.gms.games.internal.zzce) r3
            r3.zzy(r0)
            return
    }

    public final void zzT(com.google.android.gms.games.snapshot.Snapshot r1) {
            r0 = this;
            r0.zzS(r1)     // Catch: android.os.RemoteException -> L4
            return
        L4:
            r1 = move-exception
            zzbf(r1)
            return
    }

    public final void zzU(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r3) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzj r1 = new com.google.android.gms.games.internal.zzj     // Catch: java.lang.SecurityException -> Lf
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> Lf
            r0.zzB(r1)     // Catch: java.lang.SecurityException -> Lf
            return
        Lf:
            r0 = move-exception
            zzbg(r3, r0)
            return
    }

    public final void zzV(com.google.android.gms.tasks.TaskCompletionSource r3) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzbk r1 = new com.google.android.gms.games.internal.zzbk     // Catch: java.lang.SecurityException -> Lf
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> Lf
            r0.zzB(r1)     // Catch: java.lang.SecurityException -> Lf
            return
        Lf:
            r0 = move-exception
            com.google.android.gms.games.GamesStatusUtils.zzb(r3, r0)
            return
    }

    public final void zzW(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r3) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzk r1 = new com.google.android.gms.games.internal.zzk     // Catch: java.lang.SecurityException -> Lf
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> Lf
            r0.zzz(r1)     // Catch: java.lang.SecurityException -> Lf
            return
        Lf:
            r0 = move-exception
            zzbg(r3, r0)
            return
    }

    public final void zzX(com.google.android.gms.tasks.TaskCompletionSource r3) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzbh r1 = new com.google.android.gms.games.internal.zzbh     // Catch: java.lang.SecurityException -> Lf
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> Lf
            r0.zzz(r1)     // Catch: java.lang.SecurityException -> Lf
            return
        Lf:
            r0 = move-exception
            com.google.android.gms.games.GamesStatusUtils.zzb(r3, r0)
            return
    }

    public final void zzY(com.google.android.gms.tasks.TaskCompletionSource r4, boolean r5) throws android.os.RemoteException {
            r3 = this;
            android.os.IInterface r0 = r3.getService()     // Catch: java.lang.SecurityException -> L10
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> L10
            com.google.android.gms.games.internal.zzbp r1 = new com.google.android.gms.games.internal.zzbp     // Catch: java.lang.SecurityException -> L10
            r1.<init>(r4)     // Catch: java.lang.SecurityException -> L10
            r2 = 0
            r0.zzQ(r1, r2, r5)     // Catch: java.lang.SecurityException -> L10
            return
        L10:
            r5 = move-exception
            com.google.android.gms.games.GamesStatusUtils.zzb(r4, r5)
            return
    }

    public final void zzZ(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r8, java.lang.String r9, int r10) throws android.os.RemoteException {
            r7 = this;
            if (r8 != 0) goto L4
            r0 = 0
            goto L9
        L4:
            com.google.android.gms.games.internal.zzz r0 = new com.google.android.gms.games.internal.zzz
            r0.<init>(r8)
        L9:
            r2 = r0
            android.os.IInterface r0 = r7.getService()     // Catch: java.lang.SecurityException -> L23
            r1 = r0
            com.google.android.gms.games.internal.zzce r1 = (com.google.android.gms.games.internal.zzce) r1     // Catch: java.lang.SecurityException -> L23
            com.google.android.gms.games.internal.zzcf r0 = r7.zzj     // Catch: java.lang.SecurityException -> L23
            android.os.IBinder r5 = r0.zzb()     // Catch: java.lang.SecurityException -> L23
            com.google.android.gms.games.internal.zzcf r0 = r7.zzj     // Catch: java.lang.SecurityException -> L23
            android.os.Bundle r6 = r0.zza()     // Catch: java.lang.SecurityException -> L23
            r3 = r9
            r4 = r10
            r1.zzC(r2, r3, r4, r5, r6)     // Catch: java.lang.SecurityException -> L23
            return
        L23:
            r9 = move-exception
            zzbg(r8, r9)
            return
    }

    public final void zzaA(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r3, boolean r4) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzg r1 = new com.google.android.gms.games.internal.zzg     // Catch: java.lang.SecurityException -> Lf
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> Lf
            r0.zzP(r1, r4)     // Catch: java.lang.SecurityException -> Lf
            return
        Lf:
            r4 = move-exception
            zzbg(r3, r4)
            return
    }

    public final void zzaB(com.google.android.gms.tasks.TaskCompletionSource r3, boolean r4) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzbm r1 = new com.google.android.gms.games.internal.zzbm     // Catch: java.lang.SecurityException -> Lf
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> Lf
            r0.zzP(r1, r4)     // Catch: java.lang.SecurityException -> Lf
            return
        Lf:
            r4 = move-exception
            com.google.android.gms.games.GamesStatusUtils.zzb(r3, r4)
            return
    }

    public final void zzaC(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r7, java.lang.String r8, int r9, boolean r10, boolean r11) throws android.os.RemoteException {
            r6 = this;
            java.lang.String r2 = "played_with"
            android.os.IInterface r8 = r6.getService()     // Catch: java.lang.SecurityException -> L15
            r0 = r8
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> L15
            com.google.android.gms.games.internal.zzbn r1 = new com.google.android.gms.games.internal.zzbn     // Catch: java.lang.SecurityException -> L15
            r1.<init>(r7)     // Catch: java.lang.SecurityException -> L15
            r3 = r9
            r4 = r10
            r5 = r11
            r0.zzR(r1, r2, r3, r4, r5)     // Catch: java.lang.SecurityException -> L15
            return
        L15:
            r8 = move-exception
            zzbg(r7, r8)
            return
    }

    public final void zzaD(com.google.android.gms.tasks.TaskCompletionSource r8, java.lang.String r9, int r10, boolean r11, boolean r12) throws android.os.RemoteException {
            r7 = this;
            java.lang.String r0 = "played_with"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L1d
            java.lang.String r0 = "friends_all"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L11
            goto L1d
        L11:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Invalid player collection: "
            java.lang.String r9 = r10.concat(r9)
            r8.<init>(r9)
            throw r8
        L1d:
            android.os.IInterface r0 = r7.getService()     // Catch: java.lang.SecurityException -> L31
            r1 = r0
            com.google.android.gms.games.internal.zzce r1 = (com.google.android.gms.games.internal.zzce) r1     // Catch: java.lang.SecurityException -> L31
            com.google.android.gms.games.internal.zzbo r2 = new com.google.android.gms.games.internal.zzbo     // Catch: java.lang.SecurityException -> L31
            r2.<init>(r7, r8)     // Catch: java.lang.SecurityException -> L31
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.zzR(r2, r3, r4, r5, r6)     // Catch: java.lang.SecurityException -> L31
            return
        L31:
            r9 = move-exception
            com.google.android.gms.games.GamesStatusUtils.zzb(r8, r9)
            return
    }

    public final void zzaE(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r3, boolean r4) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzbw r1 = new com.google.android.gms.games.internal.zzbw     // Catch: java.lang.SecurityException -> Lf
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> Lf
            r0.zzS(r1, r4)     // Catch: java.lang.SecurityException -> Lf
            return
        Lf:
            r4 = move-exception
            zzbg(r3, r4)
            return
    }

    public final void zzaF(com.google.android.gms.tasks.TaskCompletionSource r3, boolean r4) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzbi r1 = new com.google.android.gms.games.internal.zzbi     // Catch: java.lang.SecurityException -> Lf
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> Lf
            r0.zzS(r1, r4)     // Catch: java.lang.SecurityException -> Lf
            return
        Lf:
            r4 = move-exception
            com.google.android.gms.games.GamesStatusUtils.zzb(r3, r4)
            return
    }

    public final void zzaG(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r9, java.lang.String r10, int r11, int r12, int r13, boolean r14) throws android.os.RemoteException {
            r8 = this;
            android.os.IInterface r0 = r8.getService()     // Catch: java.lang.SecurityException -> L15
            r1 = r0
            com.google.android.gms.games.internal.zzce r1 = (com.google.android.gms.games.internal.zzce) r1     // Catch: java.lang.SecurityException -> L15
            com.google.android.gms.games.internal.zzas r2 = new com.google.android.gms.games.internal.zzas     // Catch: java.lang.SecurityException -> L15
            r2.<init>(r9)     // Catch: java.lang.SecurityException -> L15
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.zzT(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.SecurityException -> L15
            return
        L15:
            r10 = move-exception
            zzbg(r9, r10)
            return
    }

    public final void zzaH(com.google.android.gms.tasks.TaskCompletionSource r9, java.lang.String r10, int r11, int r12, int r13, boolean r14) throws android.os.RemoteException {
            r8 = this;
            android.os.IInterface r0 = r8.getService()     // Catch: java.lang.SecurityException -> L15
            r1 = r0
            com.google.android.gms.games.internal.zzce r1 = (com.google.android.gms.games.internal.zzce) r1     // Catch: java.lang.SecurityException -> L15
            com.google.android.gms.games.internal.zzat r2 = new com.google.android.gms.games.internal.zzat     // Catch: java.lang.SecurityException -> L15
            r2.<init>(r8, r9)     // Catch: java.lang.SecurityException -> L15
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.zzT(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.SecurityException -> L15
            return
        L15:
            r10 = move-exception
            com.google.android.gms.games.GamesStatusUtils.zzb(r9, r10)
            return
    }

    public final void zzaI(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r3, java.lang.String r4, boolean r5, int r6) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzbt r1 = new com.google.android.gms.games.internal.zzbt     // Catch: java.lang.SecurityException -> Lf
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> Lf
            r0.zzU(r1, r4, r5, r6)     // Catch: java.lang.SecurityException -> Lf
            return
        Lf:
            r4 = move-exception
            zzbg(r3, r4)
            return
    }

    public final void zzaJ(com.google.android.gms.tasks.TaskCompletionSource r3, java.lang.String r4, boolean r5, int r6) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzbv r1 = new com.google.android.gms.games.internal.zzbv     // Catch: java.lang.SecurityException -> Lf
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> Lf
            r0.zzU(r1, r4, r5, r6)     // Catch: java.lang.SecurityException -> Lf
            return
        Lf:
            r4 = move-exception
            com.google.android.gms.games.GamesStatusUtils.zzb(r3, r4)
            return
    }

    public final void zzaK(com.google.android.gms.common.api.internal.ListenerHolder r5) {
            r4 = this;
            android.os.IInterface r0 = r4.getService()     // Catch: android.os.RemoteException -> L11
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: android.os.RemoteException -> L11
            com.google.android.gms.games.internal.zzp r1 = new com.google.android.gms.games.internal.zzp     // Catch: android.os.RemoteException -> L11
            r1.<init>(r5)     // Catch: android.os.RemoteException -> L11
            long r2 = r4.zzl     // Catch: android.os.RemoteException -> L11
            r0.zzV(r1, r2)     // Catch: android.os.RemoteException -> L11
            return
        L11:
            r5 = move-exception
            zzbf(r5)
            return
    }

    public final void zzaL(com.google.android.gms.common.api.internal.ListenerHolder r5) throws android.os.RemoteException {
            r4 = this;
            android.os.IInterface r0 = r4.getService()
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0
            com.google.android.gms.games.internal.zzn r1 = new com.google.android.gms.games.internal.zzn
            r1.<init>(r5)
            long r2 = r4.zzl
            r0.zzV(r1, r2)
            return
    }

    public final void zzaM(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r9, java.lang.String r10, java.lang.String r11, com.google.android.gms.games.snapshot.SnapshotMetadataChange r12, com.google.android.gms.games.snapshot.SnapshotContents r13) throws android.os.RemoteException {
            r8 = this;
            boolean r0 = r13.isClosed()
            r0 = r0 ^ 1
            java.lang.String r1 = "SnapshotContents already closed"
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            com.google.android.gms.common.data.BitmapTeleporter r0 = r12.zza()
            if (r0 == 0) goto L1c
            android.content.Context r1 = r8.getContext()
            java.io.File r1 = r1.getCacheDir()
            r0.setTempDir(r1)
        L1c:
            com.google.android.gms.drive.Contents r7 = r13.zza()
            r13.zzb()
            android.os.IInterface r13 = r8.getService()     // Catch: java.lang.SecurityException -> L38
            r2 = r13
            com.google.android.gms.games.internal.zzce r2 = (com.google.android.gms.games.internal.zzce) r2     // Catch: java.lang.SecurityException -> L38
            com.google.android.gms.games.internal.zzbt r3 = new com.google.android.gms.games.internal.zzbt     // Catch: java.lang.SecurityException -> L38
            r3.<init>(r9)     // Catch: java.lang.SecurityException -> L38
            r6 = r12
            com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity r6 = (com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity) r6     // Catch: java.lang.SecurityException -> L38
            r4 = r10
            r5 = r11
            r2.zzX(r3, r4, r5, r6, r7)     // Catch: java.lang.SecurityException -> L38
            return
        L38:
            r10 = move-exception
            zzbg(r9, r10)
            return
    }

    public final void zzaN(com.google.android.gms.tasks.TaskCompletionSource r9, java.lang.String r10, java.lang.String r11, com.google.android.gms.games.snapshot.SnapshotMetadataChange r12, com.google.android.gms.games.snapshot.SnapshotContents r13) throws android.os.RemoteException {
            r8 = this;
            boolean r0 = r13.isClosed()
            r0 = r0 ^ 1
            java.lang.String r1 = "SnapshotContents already closed"
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            com.google.android.gms.common.data.BitmapTeleporter r0 = r12.zza()
            if (r0 == 0) goto L1c
            android.content.Context r1 = r8.getContext()
            java.io.File r1 = r1.getCacheDir()
            r0.setTempDir(r1)
        L1c:
            com.google.android.gms.drive.Contents r7 = r13.zza()
            r13.zzb()
            android.os.IInterface r13 = r8.getService()     // Catch: java.lang.SecurityException -> L38
            r2 = r13
            com.google.android.gms.games.internal.zzce r2 = (com.google.android.gms.games.internal.zzce) r2     // Catch: java.lang.SecurityException -> L38
            com.google.android.gms.games.internal.zzbv r3 = new com.google.android.gms.games.internal.zzbv     // Catch: java.lang.SecurityException -> L38
            r3.<init>(r9)     // Catch: java.lang.SecurityException -> L38
            r6 = r12
            com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity r6 = (com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity) r6     // Catch: java.lang.SecurityException -> L38
            r4 = r10
            r5 = r11
            r2.zzX(r3, r4, r5, r6, r7)     // Catch: java.lang.SecurityException -> L38
            return
        L38:
            r10 = move-exception
            com.google.android.gms.games.GamesStatusUtils.zzb(r9, r10)
            return
    }

    public final void zzaO(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r5, java.lang.String r6) throws android.os.RemoteException {
            r4 = this;
            if (r5 != 0) goto L4
            r0 = 0
            goto L9
        L4:
            com.google.android.gms.games.internal.zzz r0 = new com.google.android.gms.games.internal.zzz
            r0.<init>(r5)
        L9:
            android.os.IInterface r1 = r4.getService()     // Catch: java.lang.SecurityException -> L1f
            com.google.android.gms.games.internal.zzce r1 = (com.google.android.gms.games.internal.zzce) r1     // Catch: java.lang.SecurityException -> L1f
            com.google.android.gms.games.internal.zzcf r2 = r4.zzj     // Catch: java.lang.SecurityException -> L1f
            android.os.IBinder r2 = r2.zzb()     // Catch: java.lang.SecurityException -> L1f
            com.google.android.gms.games.internal.zzcf r3 = r4.zzj     // Catch: java.lang.SecurityException -> L1f
            android.os.Bundle r3 = r3.zza()     // Catch: java.lang.SecurityException -> L1f
            r1.zzY(r0, r6, r2, r3)     // Catch: java.lang.SecurityException -> L1f
            return
        L1f:
            r6 = move-exception
            zzbg(r5, r6)
            return
    }

    public final void zzaP(com.google.android.gms.tasks.TaskCompletionSource r5, java.lang.String r6) throws android.os.RemoteException {
            r4 = this;
            if (r5 != 0) goto L4
            r0 = 0
            goto L9
        L4:
            com.google.android.gms.games.internal.zzab r0 = new com.google.android.gms.games.internal.zzab
            r0.<init>(r5)
        L9:
            android.os.IInterface r1 = r4.getService()     // Catch: java.lang.SecurityException -> L1f
            com.google.android.gms.games.internal.zzce r1 = (com.google.android.gms.games.internal.zzce) r1     // Catch: java.lang.SecurityException -> L1f
            com.google.android.gms.games.internal.zzcf r2 = r4.zzj     // Catch: java.lang.SecurityException -> L1f
            android.os.IBinder r2 = r2.zzb()     // Catch: java.lang.SecurityException -> L1f
            com.google.android.gms.games.internal.zzcf r3 = r4.zzj     // Catch: java.lang.SecurityException -> L1f
            android.os.Bundle r3 = r3.zza()     // Catch: java.lang.SecurityException -> L1f
            r1.zzY(r0, r6, r2, r3)     // Catch: java.lang.SecurityException -> L1f
            return
        L1f:
            r6 = move-exception
            com.google.android.gms.games.GamesStatusUtils.zzb(r5, r6)
            return
    }

    public final void zzaQ(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r8, java.lang.String r9, int r10) throws android.os.RemoteException {
            r7 = this;
            if (r8 != 0) goto L4
            r0 = 0
            goto L9
        L4:
            com.google.android.gms.games.internal.zzz r0 = new com.google.android.gms.games.internal.zzz
            r0.<init>(r8)
        L9:
            r2 = r0
            android.os.IInterface r0 = r7.getService()     // Catch: java.lang.SecurityException -> L23
            r1 = r0
            com.google.android.gms.games.internal.zzce r1 = (com.google.android.gms.games.internal.zzce) r1     // Catch: java.lang.SecurityException -> L23
            com.google.android.gms.games.internal.zzcf r0 = r7.zzj     // Catch: java.lang.SecurityException -> L23
            android.os.IBinder r5 = r0.zzb()     // Catch: java.lang.SecurityException -> L23
            com.google.android.gms.games.internal.zzcf r0 = r7.zzj     // Catch: java.lang.SecurityException -> L23
            android.os.Bundle r6 = r0.zza()     // Catch: java.lang.SecurityException -> L23
            r3 = r9
            r4 = r10
            r1.zzZ(r2, r3, r4, r5, r6)     // Catch: java.lang.SecurityException -> L23
            return
        L23:
            r9 = move-exception
            zzbg(r8, r9)
            return
    }

    public final void zzaR(com.google.android.gms.tasks.TaskCompletionSource r8, java.lang.String r9, int r10) throws android.os.RemoteException {
            r7 = this;
            if (r8 != 0) goto L4
            r0 = 0
            goto L9
        L4:
            com.google.android.gms.games.internal.zzaa r0 = new com.google.android.gms.games.internal.zzaa
            r0.<init>(r8)
        L9:
            r2 = r0
            android.os.IInterface r0 = r7.getService()     // Catch: java.lang.SecurityException -> L23
            r1 = r0
            com.google.android.gms.games.internal.zzce r1 = (com.google.android.gms.games.internal.zzce) r1     // Catch: java.lang.SecurityException -> L23
            com.google.android.gms.games.internal.zzcf r0 = r7.zzj     // Catch: java.lang.SecurityException -> L23
            android.os.IBinder r5 = r0.zzb()     // Catch: java.lang.SecurityException -> L23
            com.google.android.gms.games.internal.zzcf r0 = r7.zzj     // Catch: java.lang.SecurityException -> L23
            android.os.Bundle r6 = r0.zza()     // Catch: java.lang.SecurityException -> L23
            r3 = r9
            r4 = r10
            r1.zzZ(r2, r3, r4, r5, r6)     // Catch: java.lang.SecurityException -> L23
            return
        L23:
            r9 = move-exception
            com.google.android.gms.games.GamesStatusUtils.zzb(r8, r9)
            return
    }

    public final void zzaS(int r2) {
            r1 = this;
            com.google.android.gms.games.internal.zzcf r0 = r1.zzj
            r0.zzf(r2)
            return
    }

    public final void zzaT(android.view.View r2) {
            r1 = this;
            com.google.android.gms.games.internal.zzcf r0 = r1.zzj
            r0.zze(r2)
            return
    }

    final void zzaU(android.os.IBinder r2, android.os.Bundle r3) {
            r1 = this;
            boolean r0 = r1.isConnected()
            if (r0 == 0) goto L1d
            com.google.android.gms.games.Games$GamesOptions r0 = r1.zzm
            com.google.android.gms.games.internal.zzf r0 = r0.zzo
            android.os.IInterface r0 = r1.getService()     // Catch: android.os.RemoteException -> L19
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: android.os.RemoteException -> L19
            r0.zzaa(r2, r3)     // Catch: android.os.RemoteException -> L19
            com.google.android.gms.games.internal.zzcg r2 = r1.zzn     // Catch: android.os.RemoteException -> L19
            r2.zzb()     // Catch: android.os.RemoteException -> L19
            return
        L19:
            r2 = move-exception
            zzbf(r2)
        L1d:
            return
    }

    public final void zzaV(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r3) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.internal.games.zzfo r0 = r2.zzf
            r0.zzb()
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> L14
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> L14
            com.google.android.gms.games.internal.zzy r1 = new com.google.android.gms.games.internal.zzy     // Catch: java.lang.SecurityException -> L14
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> L14
            r0.zzab(r1)     // Catch: java.lang.SecurityException -> L14
            return
        L14:
            r0 = move-exception
            zzbg(r3, r0)
            return
    }

    public final void zzaW(java.lang.String r8, long r9, java.lang.String r11) throws android.os.RemoteException {
            r7 = this;
            android.os.IInterface r0 = r7.getService()     // Catch: java.lang.SecurityException -> Le
            r1 = r0
            com.google.android.gms.games.internal.zzce r1 = (com.google.android.gms.games.internal.zzce) r1     // Catch: java.lang.SecurityException -> Le
            r2 = 0
            r3 = r8
            r4 = r9
            r6 = r11
            r1.zzac(r2, r3, r4, r6)     // Catch: java.lang.SecurityException -> Le
        Le:
            return
    }

    public final void zzaX(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r8, java.lang.String r9, long r10, java.lang.String r12) throws android.os.RemoteException {
            r7 = this;
            if (r8 != 0) goto L4
            r0 = 0
            goto L9
        L4:
            com.google.android.gms.games.internal.zzu r0 = new com.google.android.gms.games.internal.zzu
            r0.<init>(r8)
        L9:
            r2 = r0
            android.os.IInterface r0 = r7.getService()     // Catch: java.lang.SecurityException -> L18
            r1 = r0
            com.google.android.gms.games.internal.zzce r1 = (com.google.android.gms.games.internal.zzce) r1     // Catch: java.lang.SecurityException -> L18
            r3 = r9
            r4 = r10
            r6 = r12
            r1.zzac(r2, r3, r4, r6)     // Catch: java.lang.SecurityException -> L18
            return
        L18:
            r9 = move-exception
            zzbg(r8, r9)
            return
    }

    public final void zzaY(com.google.android.gms.tasks.TaskCompletionSource r8, java.lang.String r9, long r10, java.lang.String r12) throws android.os.RemoteException {
            r7 = this;
            android.os.IInterface r0 = r7.getService()     // Catch: java.lang.SecurityException -> L13
            r1 = r0
            com.google.android.gms.games.internal.zzce r1 = (com.google.android.gms.games.internal.zzce) r1     // Catch: java.lang.SecurityException -> L13
            com.google.android.gms.games.internal.zzbs r2 = new com.google.android.gms.games.internal.zzbs     // Catch: java.lang.SecurityException -> L13
            r2.<init>(r8)     // Catch: java.lang.SecurityException -> L13
            r3 = r9
            r4 = r10
            r6 = r12
            r1.zzac(r2, r3, r4, r6)     // Catch: java.lang.SecurityException -> L13
            return
        L13:
            r9 = move-exception
            com.google.android.gms.games.GamesStatusUtils.zzb(r8, r9)
            return
    }

    public final void zzaZ(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r5, java.lang.String r6) throws android.os.RemoteException {
            r4 = this;
            if (r5 != 0) goto L4
            r0 = 0
            goto L9
        L4:
            com.google.android.gms.games.internal.zzz r0 = new com.google.android.gms.games.internal.zzz
            r0.<init>(r5)
        L9:
            android.os.IInterface r1 = r4.getService()     // Catch: java.lang.SecurityException -> L1f
            com.google.android.gms.games.internal.zzce r1 = (com.google.android.gms.games.internal.zzce) r1     // Catch: java.lang.SecurityException -> L1f
            com.google.android.gms.games.internal.zzcf r2 = r4.zzj     // Catch: java.lang.SecurityException -> L1f
            android.os.IBinder r2 = r2.zzb()     // Catch: java.lang.SecurityException -> L1f
            com.google.android.gms.games.internal.zzcf r3 = r4.zzj     // Catch: java.lang.SecurityException -> L1f
            android.os.Bundle r3 = r3.zza()     // Catch: java.lang.SecurityException -> L1f
            r1.zzad(r0, r6, r2, r3)     // Catch: java.lang.SecurityException -> L1f
            return
        L1f:
            r6 = move-exception
            zzbg(r5, r6)
            return
    }

    public final void zzaa(com.google.android.gms.tasks.TaskCompletionSource r8, java.lang.String r9, int r10) throws android.os.RemoteException {
            r7 = this;
            if (r8 != 0) goto L4
            r0 = 0
            goto L9
        L4:
            com.google.android.gms.games.internal.zzaa r0 = new com.google.android.gms.games.internal.zzaa
            r0.<init>(r8)
        L9:
            r2 = r0
            android.os.IInterface r0 = r7.getService()     // Catch: java.lang.SecurityException -> L23
            r1 = r0
            com.google.android.gms.games.internal.zzce r1 = (com.google.android.gms.games.internal.zzce) r1     // Catch: java.lang.SecurityException -> L23
            com.google.android.gms.games.internal.zzcf r0 = r7.zzj     // Catch: java.lang.SecurityException -> L23
            android.os.IBinder r5 = r0.zzb()     // Catch: java.lang.SecurityException -> L23
            com.google.android.gms.games.internal.zzcf r0 = r7.zzj     // Catch: java.lang.SecurityException -> L23
            android.os.Bundle r6 = r0.zza()     // Catch: java.lang.SecurityException -> L23
            r3 = r9
            r4 = r10
            r1.zzC(r2, r3, r4, r5, r6)     // Catch: java.lang.SecurityException -> L23
            return
        L23:
            r9 = move-exception
            com.google.android.gms.games.GamesStatusUtils.zzb(r8, r9)
            return
    }

    public final void zzab(java.lang.String r2, int r3) {
            r1 = this;
            com.google.android.gms.internal.games.zzfo r0 = r1.zzf
            r0.zzc(r2, r3)
            return
    }

    public final void zzac(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r3, int r4) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzl r1 = new com.google.android.gms.games.internal.zzl     // Catch: java.lang.SecurityException -> Lf
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> Lf
            r0.zzE(r1, r4)     // Catch: java.lang.SecurityException -> Lf
            return
        Lf:
            r4 = move-exception
            zzbg(r3, r4)
            return
    }

    public final void zzad(com.google.android.gms.tasks.TaskCompletionSource r3, int r4) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzbj r1 = new com.google.android.gms.games.internal.zzbj     // Catch: java.lang.SecurityException -> Lf
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> Lf
            r0.zzE(r1, r4)     // Catch: java.lang.SecurityException -> Lf
            return
        Lf:
            r4 = move-exception
            com.google.android.gms.games.GamesStatusUtils.zzb(r3, r4)
            return
    }

    public final void zzae(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r3, boolean r4) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzv r1 = new com.google.android.gms.games.internal.zzv     // Catch: java.lang.SecurityException -> Lf
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> Lf
            r0.zzF(r1, r4)     // Catch: java.lang.SecurityException -> Lf
            return
        Lf:
            r4 = move-exception
            zzbg(r3, r4)
            return
    }

    public final void zzaf(com.google.android.gms.tasks.TaskCompletionSource r3, boolean r4) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzac r1 = new com.google.android.gms.games.internal.zzac     // Catch: java.lang.SecurityException -> Lf
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> Lf
            r0.zzF(r1, r4)     // Catch: java.lang.SecurityException -> Lf
            return
        Lf:
            r4 = move-exception
            com.google.android.gms.games.GamesStatusUtils.zzb(r3, r4)
            return
    }

    public final void zzag(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r3, boolean r4) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzbn r1 = new com.google.android.gms.games.internal.zzbn     // Catch: java.lang.SecurityException -> Lf
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> Lf
            r0.zzG(r1, r4)     // Catch: java.lang.SecurityException -> Lf
            return
        Lf:
            r4 = move-exception
            zzbg(r3, r4)
            return
    }

    public final void zzah(com.google.android.gms.tasks.TaskCompletionSource r8, java.lang.String r9, int r10, int r11) throws android.os.RemoteException {
            r7 = this;
            android.os.IInterface r0 = r7.getService()     // Catch: java.lang.SecurityException -> L14
            r1 = r0
            com.google.android.gms.games.internal.zzce r1 = (com.google.android.gms.games.internal.zzce) r1     // Catch: java.lang.SecurityException -> L14
            com.google.android.gms.games.internal.zzar r2 = new com.google.android.gms.games.internal.zzar     // Catch: java.lang.SecurityException -> L14
            r2.<init>(r7, r8)     // Catch: java.lang.SecurityException -> L14
            r3 = 0
            r4 = r9
            r5 = r10
            r6 = r11
            r1.zzA(r2, r3, r4, r5, r6)     // Catch: java.lang.SecurityException -> L14
            return
        L14:
            r9 = move-exception
            com.google.android.gms.games.GamesStatusUtils.zzb(r8, r9)
            return
    }

    public final void zzai(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r3, boolean r4) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.internal.games.zzfo r0 = r2.zzf
            r0.zzb()
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> L14
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> L14
            com.google.android.gms.games.internal.zzak r1 = new com.google.android.gms.games.internal.zzak     // Catch: java.lang.SecurityException -> L14
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> L14
            r0.zzH(r1, r4)     // Catch: java.lang.SecurityException -> L14
            return
        L14:
            r4 = move-exception
            zzbg(r3, r4)
            return
    }

    public final void zzaj(com.google.android.gms.tasks.TaskCompletionSource r3, boolean r4) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.internal.games.zzfo r0 = r2.zzf
            r0.zzb()
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> L14
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> L14
            com.google.android.gms.games.internal.zzal r1 = new com.google.android.gms.games.internal.zzal     // Catch: java.lang.SecurityException -> L14
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> L14
            r0.zzH(r1, r4)     // Catch: java.lang.SecurityException -> L14
            return
        L14:
            r4 = move-exception
            com.google.android.gms.games.GamesStatusUtils.zzb(r3, r4)
            return
    }

    public final void zzak(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r3, boolean r4, java.lang.String... r5) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.internal.games.zzfo r0 = r2.zzf
            r0.zzb()
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> L14
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> L14
            com.google.android.gms.games.internal.zzak r1 = new com.google.android.gms.games.internal.zzak     // Catch: java.lang.SecurityException -> L14
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> L14
            r0.zzI(r1, r4, r5)     // Catch: java.lang.SecurityException -> L14
            return
        L14:
            r4 = move-exception
            zzbg(r3, r4)
            return
    }

    public final void zzal(com.google.android.gms.tasks.TaskCompletionSource r3, boolean r4, java.lang.String... r5) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.internal.games.zzfo r0 = r2.zzf
            r0.zzb()
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> L14
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> L14
            com.google.android.gms.games.internal.zzal r1 = new com.google.android.gms.games.internal.zzal     // Catch: java.lang.SecurityException -> L14
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> L14
            r0.zzI(r1, r4, r5)     // Catch: java.lang.SecurityException -> L14
            return
        L14:
            r4 = move-exception
            com.google.android.gms.games.GamesStatusUtils.zzb(r3, r4)
            return
    }

    public final void zzam(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r3) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzw r1 = new com.google.android.gms.games.internal.zzw     // Catch: java.lang.SecurityException -> Lf
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> Lf
            r0.zzJ(r1)     // Catch: java.lang.SecurityException -> Lf
            return
        Lf:
            r0 = move-exception
            zzbg(r3, r0)
            return
    }

    public final void zzan(com.google.android.gms.tasks.TaskCompletionSource r3) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzan r1 = new com.google.android.gms.games.internal.zzan     // Catch: java.lang.SecurityException -> Lf
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> Lf
            r0.zzJ(r1)     // Catch: java.lang.SecurityException -> Lf
            return
        Lf:
            r0 = move-exception
            com.google.android.gms.games.GamesStatusUtils.zzb(r3, r0)
            return
    }

    public final void zzao(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r3, int r4, boolean r5, boolean r6) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzbn r1 = new com.google.android.gms.games.internal.zzbn     // Catch: java.lang.SecurityException -> Lf
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> Lf
            r0.zzK(r1, r4, r5, r6)     // Catch: java.lang.SecurityException -> Lf
            return
        Lf:
            r4 = move-exception
            zzbg(r3, r4)
            return
    }

    public final void zzap(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r3, boolean r4) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzau r1 = new com.google.android.gms.games.internal.zzau     // Catch: java.lang.SecurityException -> Lf
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> Lf
            r0.zzM(r1, r4)     // Catch: java.lang.SecurityException -> Lf
            return
        Lf:
            r4 = move-exception
            zzbg(r3, r4)
            return
    }

    public final void zzaq(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r3, java.lang.String r4, boolean r5) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzau r1 = new com.google.android.gms.games.internal.zzau     // Catch: java.lang.SecurityException -> Lf
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> Lf
            r0.zzL(r1, r4, r5)     // Catch: java.lang.SecurityException -> Lf
            return
        Lf:
            r4 = move-exception
            zzbg(r3, r4)
            return
    }

    public final void zzar(com.google.android.gms.tasks.TaskCompletionSource r3, java.lang.String r4, boolean r5) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzap r1 = new com.google.android.gms.games.internal.zzap     // Catch: java.lang.SecurityException -> Lf
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> Lf
            r0.zzL(r1, r4, r5)     // Catch: java.lang.SecurityException -> Lf
            return
        Lf:
            r4 = move-exception
            com.google.android.gms.games.GamesStatusUtils.zzb(r3, r4)
            return
    }

    public final void zzas(com.google.android.gms.tasks.TaskCompletionSource r3, boolean r4) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzav r1 = new com.google.android.gms.games.internal.zzav     // Catch: java.lang.SecurityException -> Lf
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> Lf
            r0.zzM(r1, r4)     // Catch: java.lang.SecurityException -> Lf
            return
        Lf:
            r4 = move-exception
            com.google.android.gms.games.GamesStatusUtils.zzb(r3, r4)
            return
    }

    public final void zzat(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r3, com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer r4, int r5, int r6) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> L17
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> L17
            com.google.android.gms.games.internal.zzas r1 = new com.google.android.gms.games.internal.zzas     // Catch: java.lang.SecurityException -> L17
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> L17
            com.google.android.gms.games.leaderboard.zza r4 = r4.zza()     // Catch: java.lang.SecurityException -> L17
            android.os.Bundle r4 = r4.zza()     // Catch: java.lang.SecurityException -> L17
            r0.zzN(r1, r4, r5, r6)     // Catch: java.lang.SecurityException -> L17
            return
        L17:
            r4 = move-exception
            zzbg(r3, r4)
            return
    }

    public final void zzau(com.google.android.gms.tasks.TaskCompletionSource r3, com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer r4, int r5, int r6) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> L17
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> L17
            com.google.android.gms.games.internal.zzat r1 = new com.google.android.gms.games.internal.zzat     // Catch: java.lang.SecurityException -> L17
            r1.<init>(r2, r3)     // Catch: java.lang.SecurityException -> L17
            com.google.android.gms.games.leaderboard.zza r4 = r4.zza()     // Catch: java.lang.SecurityException -> L17
            android.os.Bundle r4 = r4.zza()     // Catch: java.lang.SecurityException -> L17
            r0.zzN(r1, r4, r5, r6)     // Catch: java.lang.SecurityException -> L17
            return
        L17:
            r4 = move-exception
            com.google.android.gms.games.GamesStatusUtils.zzb(r3, r4)
            return
    }

    public final void zzav(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r3, java.lang.String r4, boolean r5) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzbn r1 = new com.google.android.gms.games.internal.zzbn     // Catch: java.lang.SecurityException -> Lf
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> Lf
            r0.zzQ(r1, r4, r5)     // Catch: java.lang.SecurityException -> Lf
            return
        Lf:
            r4 = move-exception
            zzbg(r3, r4)
            return
    }

    public final void zzaw(com.google.android.gms.tasks.TaskCompletionSource r3, java.lang.String r4, boolean r5) throws android.os.RemoteException {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> Lf
            com.google.android.gms.games.internal.zzbp r1 = new com.google.android.gms.games.internal.zzbp     // Catch: java.lang.SecurityException -> Lf
            r1.<init>(r3)     // Catch: java.lang.SecurityException -> Lf
            r0.zzQ(r1, r4, r5)     // Catch: java.lang.SecurityException -> Lf
            return
        Lf:
            r4 = move-exception
            com.google.android.gms.games.GamesStatusUtils.zzb(r3, r4)
            return
    }

    public final void zzax(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r9, java.lang.String r10, int r11, int r12, int r13, boolean r14) throws android.os.RemoteException {
            r8 = this;
            android.os.IInterface r0 = r8.getService()     // Catch: java.lang.SecurityException -> L15
            r1 = r0
            com.google.android.gms.games.internal.zzce r1 = (com.google.android.gms.games.internal.zzce) r1     // Catch: java.lang.SecurityException -> L15
            com.google.android.gms.games.internal.zzas r2 = new com.google.android.gms.games.internal.zzas     // Catch: java.lang.SecurityException -> L15
            r2.<init>(r9)     // Catch: java.lang.SecurityException -> L15
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.zzO(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.SecurityException -> L15
            return
        L15:
            r10 = move-exception
            zzbg(r9, r10)
            return
    }

    public final void zzay(com.google.android.gms.tasks.TaskCompletionSource r9, java.lang.String r10, int r11, int r12, int r13, boolean r14) throws android.os.RemoteException {
            r8 = this;
            android.os.IInterface r0 = r8.getService()     // Catch: java.lang.SecurityException -> L15
            r1 = r0
            com.google.android.gms.games.internal.zzce r1 = (com.google.android.gms.games.internal.zzce) r1     // Catch: java.lang.SecurityException -> L15
            com.google.android.gms.games.internal.zzat r2 = new com.google.android.gms.games.internal.zzat     // Catch: java.lang.SecurityException -> L15
            r2.<init>(r8, r9)     // Catch: java.lang.SecurityException -> L15
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.zzO(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.SecurityException -> L15
            return
        L15:
            r10 = move-exception
            com.google.android.gms.games.GamesStatusUtils.zzb(r9, r10)
            return
    }

    public final void zzaz(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r7, java.lang.String r8, java.lang.String r9, int r10, int r11) throws android.os.RemoteException {
            r6 = this;
            android.os.IInterface r8 = r6.getService()     // Catch: java.lang.SecurityException -> L14
            r0 = r8
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: java.lang.SecurityException -> L14
            com.google.android.gms.games.internal.zzt r1 = new com.google.android.gms.games.internal.zzt     // Catch: java.lang.SecurityException -> L14
            r1.<init>(r7)     // Catch: java.lang.SecurityException -> L14
            r2 = 0
            r3 = r9
            r4 = r10
            r5 = r11
            r0.zzA(r1, r2, r3, r4, r5)     // Catch: java.lang.SecurityException -> L14
            return
        L14:
            r8 = move-exception
            zzbg(r7, r8)
            return
    }

    public final void zzba(com.google.android.gms.tasks.TaskCompletionSource r5, java.lang.String r6) throws android.os.RemoteException {
            r4 = this;
            if (r5 != 0) goto L4
            r0 = 0
            goto L9
        L4:
            com.google.android.gms.games.internal.zzab r0 = new com.google.android.gms.games.internal.zzab
            r0.<init>(r5)
        L9:
            android.os.IInterface r1 = r4.getService()     // Catch: java.lang.SecurityException -> L1f
            com.google.android.gms.games.internal.zzce r1 = (com.google.android.gms.games.internal.zzce) r1     // Catch: java.lang.SecurityException -> L1f
            com.google.android.gms.games.internal.zzcf r2 = r4.zzj     // Catch: java.lang.SecurityException -> L1f
            android.os.IBinder r2 = r2.zzb()     // Catch: java.lang.SecurityException -> L1f
            com.google.android.gms.games.internal.zzcf r3 = r4.zzj     // Catch: java.lang.SecurityException -> L1f
            android.os.Bundle r3 = r3.zza()     // Catch: java.lang.SecurityException -> L1f
            r1.zzad(r0, r6, r2, r3)     // Catch: java.lang.SecurityException -> L1f
            return
        L1f:
            r6 = move-exception
            com.google.android.gms.games.GamesStatusUtils.zzb(r5, r6)
            return
    }

    public final void zzbb() throws android.os.RemoteException {
            r3 = this;
            android.os.IInterface r0 = r3.getService()
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0
            long r1 = r3.zzl
            r0.zzae(r1)
            return
    }

    public final void zzbc() {
            r1 = this;
            r1.zzbb()     // Catch: android.os.RemoteException -> L4
            return
        L4:
            r0 = move-exception
            zzbf(r0)
            return
    }

    public final boolean zzbd() throws android.os.RemoteException {
            r1 = this;
            android.os.IInterface r0 = r1.getService()
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0
            boolean r0 = r0.zzaf()
            return r0
    }

    public final boolean zzbe() {
            r1 = this;
            boolean r0 = r1.zzbd()     // Catch: android.os.RemoteException -> L5
            return r0
        L5:
            r0 = move-exception
            zzbf(r0)
            r0 = 0
            return r0
    }

    public final int zzp() throws android.os.RemoteException {
            r1 = this;
            android.os.IInterface r0 = r1.getService()
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0
            int r0 = r0.zzd()
            return r0
    }

    public final int zzq() {
            r1 = this;
            int r0 = r1.zzp()     // Catch: android.os.RemoteException -> L5
            return r0
        L5:
            r0 = move-exception
            zzbf(r0)
            r0 = -1
            return r0
    }

    public final int zzr() throws android.os.RemoteException {
            r1 = this;
            android.os.IInterface r0 = r1.getService()
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0
            int r0 = r0.zze()
            return r0
    }

    public final int zzs() {
            r1 = this;
            int r0 = r1.zzr()     // Catch: android.os.RemoteException -> L5
            return r0
        L5:
            r0 = move-exception
            zzbf(r0)
            r0 = -1
            return r0
    }

    public final android.content.Intent zzt() {
            r1 = this;
            android.os.IInterface r0 = r1.getService()     // Catch: android.os.RemoteException -> Lb
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: android.os.RemoteException -> Lb
            android.content.Intent r0 = r0.zzg()     // Catch: android.os.RemoteException -> Lb
            goto L10
        Lb:
            r0 = move-exception
            zzbf(r0)
            r0 = 0
        L10:
            return r0
    }

    public final android.content.Intent zzu() {
            r1 = this;
            android.os.IInterface r0 = r1.getService()     // Catch: android.os.RemoteException -> Lb
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: android.os.RemoteException -> Lb
            android.content.Intent r0 = r0.zzh()     // Catch: android.os.RemoteException -> Lb
            return r0
        Lb:
            r0 = move-exception
            zzbf(r0)
            r0 = 0
            return r0
    }

    public final android.content.Intent zzv() throws android.os.RemoteException {
            r1 = this;
            android.os.IInterface r0 = r1.getService()
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0
            android.content.Intent r0 = r0.zzo()
            return r0
    }

    public final android.content.Intent zzw() {
            r1 = this;
            android.content.Intent r0 = r1.zzv()     // Catch: android.os.RemoteException -> L5
            return r0
        L5:
            r0 = move-exception
            zzbf(r0)
            r0 = 0
            return r0
    }

    public final android.content.Intent zzx(com.google.android.gms.games.PlayerEntity r2) {
            r1 = this;
            android.os.IInterface r0 = r1.getService()     // Catch: android.os.RemoteException -> Lb
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: android.os.RemoteException -> Lb
            android.content.Intent r2 = r0.zzi(r2)     // Catch: android.os.RemoteException -> Lb
            return r2
        Lb:
            r2 = move-exception
            zzbf(r2)
            r2 = 0
            return r2
    }

    public final android.content.Intent zzy(java.lang.String r2, int r3, int r4) {
            r1 = this;
            android.os.IInterface r0 = r1.getService()     // Catch: android.os.RemoteException -> Lb
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0     // Catch: android.os.RemoteException -> Lb
            android.content.Intent r2 = r0.zzk(r2, r3, r4)     // Catch: android.os.RemoteException -> Lb
            goto L10
        Lb:
            r2 = move-exception
            zzbf(r2)
            r2 = 0
        L10:
            return r2
    }

    public final android.content.Intent zzz() throws android.os.RemoteException {
            r1 = this;
            android.os.IInterface r0 = r1.getService()
            com.google.android.gms.games.internal.zzce r0 = (com.google.android.gms.games.internal.zzce) r0
            android.content.Intent r0 = r0.zzl()
            return r0
    }
}
