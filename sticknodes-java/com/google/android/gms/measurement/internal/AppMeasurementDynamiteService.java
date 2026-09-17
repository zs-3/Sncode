package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@22.4.0 */
@com.google.android.gms.common.util.DynamiteApi
/* loaded from: classes2.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzcu {
    com.google.android.gms.measurement.internal.zzio zza;
    private final java.util.Map zzb;

    public static /* synthetic */ void $r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r1, com.google.android.gms.internal.measurement.zzdb r2) {
            r2.zze()     // Catch: android.os.RemoteException -> L4
            return
        L4:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzio r1 = r1.zza
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.measurement.internal.zzio r1 = (com.google.android.gms.measurement.internal.zzio) r1
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzk()
            java.lang.String r0 = "Failed to call IDynamiteUploadBatchesCallback"
            r1.zzb(r0, r2)
            return
    }

    public AppMeasurementDynamiteService() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r1.zzb = r0
            return
    }

    private final void zzb() {
            r2 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r2.zza
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Attempting to perform action before initialize."
            r0.<init>(r1)
            throw r0
    }

    private final void zzc(com.google.android.gms.internal.measurement.zzcy r2, java.lang.String r3) {
            r1 = this;
            r1.zzb()
            com.google.android.gms.measurement.internal.zzio r0 = r1.zza
            com.google.android.gms.measurement.internal.zzqf r0 = r0.zzw()
            r0.zzZ(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void beginAdUnitExposure(java.lang.String r2, long r3) throws android.os.RemoteException {
            r1 = this;
            r1.zzb()
            com.google.android.gms.measurement.internal.zzio r0 = r1.zza
            com.google.android.gms.measurement.internal.zzd r0 = r0.zzd()
            r0.zzd(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void clearConditionalUserProperty(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) throws android.os.RemoteException {
            r1 = this;
            r1.zzb()
            com.google.android.gms.measurement.internal.zzio r0 = r1.zza
            com.google.android.gms.measurement.internal.zzlw r0 = r0.zzq()
            r0.zzJ(r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void clearMeasurementEnabled(long r1) throws android.os.RemoteException {
            r0 = this;
            r0.zzb()
            com.google.android.gms.measurement.internal.zzio r1 = r0.zza
            com.google.android.gms.measurement.internal.zzlw r1 = r1.zzq()
            r2 = 0
            r1.zzai(r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void endAdUnitExposure(java.lang.String r2, long r3) throws android.os.RemoteException {
            r1 = this;
            r1.zzb()
            com.google.android.gms.measurement.internal.zzio r0 = r1.zza
            com.google.android.gms.measurement.internal.zzd r0 = r0.zzd()
            r0.zze(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void generateEventId(com.google.android.gms.internal.measurement.zzcy r4) throws android.os.RemoteException {
            r3 = this;
            r3.zzb()
            com.google.android.gms.measurement.internal.zzio r0 = r3.zza
            com.google.android.gms.measurement.internal.zzqf r0 = r0.zzw()
            long r0 = r0.zzs()
            r3.zzb()
            com.google.android.gms.measurement.internal.zzio r2 = r3.zza
            com.google.android.gms.measurement.internal.zzqf r2 = r2.zzw()
            r2.zzY(r4, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzcy r3) throws android.os.RemoteException {
            r2 = this;
            r2.zzb()
            com.google.android.gms.measurement.internal.zzio r0 = r2.zza
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzj r1 = new com.google.android.gms.measurement.internal.zzj
            r1.<init>(r2, r3)
            r0.zzq(r1)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzcy r2) throws android.os.RemoteException {
            r1 = this;
            r1.zzb()
            com.google.android.gms.measurement.internal.zzio r0 = r1.zza
            com.google.android.gms.measurement.internal.zzlw r0 = r0.zzq()
            java.lang.String r0 = r0.zzr()
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getConditionalUserProperties(java.lang.String r3, java.lang.String r4, com.google.android.gms.internal.measurement.zzcy r5) throws android.os.RemoteException {
            r2 = this;
            r2.zzb()
            com.google.android.gms.measurement.internal.zzio r0 = r2.zza
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzn r1 = new com.google.android.gms.measurement.internal.zzn
            r1.<init>(r2, r5, r3, r4)
            r0.zzq(r1)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzcy r2) throws android.os.RemoteException {
            r1 = this;
            r1.zzb()
            com.google.android.gms.measurement.internal.zzio r0 = r1.zza
            com.google.android.gms.measurement.internal.zzlw r0 = r0.zzq()
            java.lang.String r0 = r0.zzs()
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzcy r2) throws android.os.RemoteException {
            r1 = this;
            r1.zzb()
            com.google.android.gms.measurement.internal.zzio r0 = r1.zza
            com.google.android.gms.measurement.internal.zzlw r0 = r0.zzq()
            java.lang.String r0 = r0.zzt()
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getGmpAppId(com.google.android.gms.internal.measurement.zzcy r6) throws android.os.RemoteException {
            r5 = this;
            r5.zzb()
            com.google.android.gms.measurement.internal.zzio r0 = r5.zza
            com.google.android.gms.measurement.internal.zzlw r0 = r0.zzq()
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzam r2 = r1.zzf()
            com.google.android.gms.measurement.internal.zzgg r3 = com.google.android.gms.measurement.internal.zzgi.zzbp
            r4 = 0
            boolean r2 = r2.zzx(r4, r3)
            if (r2 != 0) goto L27
            com.google.android.gms.measurement.internal.zzio r2 = r0.zzu
            java.lang.String r2 = r2.zzx()
            if (r2 == 0) goto L27
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            java.lang.String r4 = r0.zzx()
            goto L48
        L27:
            android.content.Context r1 = r1.zzaT()     // Catch: java.lang.IllegalStateException -> L38
            com.google.android.gms.measurement.internal.zzio r2 = r0.zzu     // Catch: java.lang.IllegalStateException -> L38
            java.lang.String r2 = r2.zzA()     // Catch: java.lang.IllegalStateException -> L38
            java.lang.String r3 = "google_app_id"
            java.lang.String r4 = com.google.android.gms.measurement.internal.zzmg.zzc(r1, r3, r2)     // Catch: java.lang.IllegalStateException -> L38
            goto L48
        L38:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.String r2 = "getGoogleAppId failed with exception"
            r0.zzb(r2, r1)
        L48:
            r5.zzc(r6, r4)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getMaxUserProperties(java.lang.String r2, com.google.android.gms.internal.measurement.zzcy r3) throws android.os.RemoteException {
            r1 = this;
            r1.zzb()
            com.google.android.gms.measurement.internal.zzio r0 = r1.zza
            com.google.android.gms.measurement.internal.zzlw r0 = r0.zzq()
            r0.zzi(r2)
            r1.zzb()
            com.google.android.gms.measurement.internal.zzio r2 = r1.zza
            com.google.android.gms.measurement.internal.zzqf r2 = r2.zzw()
            r0 = 25
            r2.zzX(r3, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getSessionId(com.google.android.gms.internal.measurement.zzcy r4) throws android.os.RemoteException {
            r3 = this;
            r3.zzb()
            com.google.android.gms.measurement.internal.zzio r0 = r3.zza
            com.google.android.gms.measurement.internal.zzlw r0 = r0.zzq()
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzil r1 = r1.zzaX()
            com.google.android.gms.measurement.internal.zzlj r2 = new com.google.android.gms.measurement.internal.zzlj
            r2.<init>(r0, r4)
            r1.zzq(r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getTestFlag(com.google.android.gms.internal.measurement.zzcy r5, int r6) throws android.os.RemoteException {
            r4 = this;
            r4.zzb()
            if (r6 == 0) goto L8d
            r0 = 1
            if (r6 == r0) goto L75
            r0 = 2
            if (r6 == r0) goto L42
            r0 = 3
            if (r6 == r0) goto L2a
            r0 = 4
            if (r6 == r0) goto L12
            return
        L12:
            com.google.android.gms.measurement.internal.zzio r6 = r4.zza
            com.google.android.gms.measurement.internal.zzqf r6 = r6.zzw()
            com.google.android.gms.measurement.internal.zzio r0 = r4.zza
            com.google.android.gms.measurement.internal.zzlw r0 = r0.zzq()
            java.lang.Boolean r0 = r0.zzl()
            boolean r0 = r0.booleanValue()
            r6.zzT(r5, r0)
            return
        L2a:
            com.google.android.gms.measurement.internal.zzio r6 = r4.zza
            com.google.android.gms.measurement.internal.zzqf r6 = r6.zzw()
            com.google.android.gms.measurement.internal.zzio r0 = r4.zza
            com.google.android.gms.measurement.internal.zzlw r0 = r0.zzq()
            java.lang.Integer r0 = r0.zzp()
            int r0 = r0.intValue()
            r6.zzX(r5, r0)
            return
        L42:
            com.google.android.gms.measurement.internal.zzio r6 = r4.zza
            com.google.android.gms.measurement.internal.zzqf r6 = r6.zzw()
            com.google.android.gms.measurement.internal.zzio r0 = r4.zza
            com.google.android.gms.measurement.internal.zzlw r0 = r0.zzq()
            java.lang.Double r0 = r0.zzm()
            double r0 = r0.doubleValue()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "r"
            r2.putDouble(r3, r0)
            r5.zze(r2)     // Catch: android.os.RemoteException -> L64
            return
        L64:
            r5 = move-exception
            com.google.android.gms.measurement.internal.zzio r6 = r6.zzu
            com.google.android.gms.measurement.internal.zzhe r6 = r6.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzk()
            java.lang.String r0 = "Error returning double value to wrapper"
            r6.zzb(r0, r5)
            return
        L75:
            com.google.android.gms.measurement.internal.zzio r6 = r4.zza
            com.google.android.gms.measurement.internal.zzqf r6 = r6.zzw()
            com.google.android.gms.measurement.internal.zzio r0 = r4.zza
            com.google.android.gms.measurement.internal.zzlw r0 = r0.zzq()
            java.lang.Long r0 = r0.zzq()
            long r0 = r0.longValue()
            r6.zzY(r5, r0)
            return
        L8d:
            com.google.android.gms.measurement.internal.zzio r6 = r4.zza
            com.google.android.gms.measurement.internal.zzqf r6 = r6.zzw()
            com.google.android.gms.measurement.internal.zzio r0 = r4.zza
            com.google.android.gms.measurement.internal.zzlw r0 = r0.zzq()
            java.lang.String r0 = r0.zzu()
            r6.zzZ(r5, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getUserProperties(java.lang.String r9, java.lang.String r10, boolean r11, com.google.android.gms.internal.measurement.zzcy r12) throws android.os.RemoteException {
            r8 = this;
            r8.zzb()
            com.google.android.gms.measurement.internal.zzio r0 = r8.zza
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzl r7 = new com.google.android.gms.measurement.internal.zzl
            r1 = r7
            r2 = r8
            r3 = r12
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r0.zzq(r7)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void initForTests(java.util.Map r1) throws android.os.RemoteException {
            r0 = this;
            r0.zzb()
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void initialize(com.google.android.gms.dynamic.IObjectWrapper r2, com.google.android.gms.internal.measurement.zzdh r3, long r4) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r1.zza
            if (r0 != 0) goto L1b
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.zzio r2 = com.google.android.gms.measurement.internal.zzio.zzp(r2, r3, r4)
            r1.zza = r2
            return
        L1b:
            com.google.android.gms.measurement.internal.zzhe r2 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzk()
            java.lang.String r3 = "Attempting to initialize multiple times"
            r2.zza(r3)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzcy r3) throws android.os.RemoteException {
            r2 = this;
            r2.zzb()
            com.google.android.gms.measurement.internal.zzio r0 = r2.zza
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzo r1 = new com.google.android.gms.measurement.internal.zzo
            r1.<init>(r2, r3)
            r0.zzq(r1)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void logEvent(java.lang.String r11, java.lang.String r12, android.os.Bundle r13, boolean r14, boolean r15, long r16) throws android.os.RemoteException {
            r10 = this;
            r10.zzb()
            r0 = r10
            com.google.android.gms.measurement.internal.zzio r1 = r0.zza
            com.google.android.gms.measurement.internal.zzlw r2 = r1.zzq()
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r2.zzP(r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void logEventAndBundle(java.lang.String r8, java.lang.String r9, android.os.Bundle r10, com.google.android.gms.internal.measurement.zzcy r11, long r12) throws android.os.RemoteException {
            r7 = this;
            r7.zzb()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            if (r10 == 0) goto Le
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>(r10)
            goto L13
        Le:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L13:
            java.lang.String r4 = "app"
            java.lang.String r1 = "_o"
            r0.putString(r1, r4)
            com.google.android.gms.measurement.internal.zzbh r0 = new com.google.android.gms.measurement.internal.zzbh
            com.google.android.gms.measurement.internal.zzbf r3 = new com.google.android.gms.measurement.internal.zzbf
            r3.<init>(r10)
            r1 = r0
            r2 = r9
            r5 = r12
            r1.<init>(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.zzio r9 = r7.zza
            com.google.android.gms.measurement.internal.zzil r9 = r9.zzaX()
            com.google.android.gms.measurement.internal.zzk r10 = new com.google.android.gms.measurement.internal.zzk
            r10.<init>(r7, r11, r0, r8)
            r9.zzq(r10)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void logHealthData(int r10, java.lang.String r11, com.google.android.gms.dynamic.IObjectWrapper r12, com.google.android.gms.dynamic.IObjectWrapper r13, com.google.android.gms.dynamic.IObjectWrapper r14) throws android.os.RemoteException {
            r9 = this;
            r9.zzb()
            r0 = 0
            if (r12 != 0) goto L8
            r6 = r0
            goto Ld
        L8:
            java.lang.Object r12 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r12)
            r6 = r12
        Ld:
            if (r13 != 0) goto L11
            r7 = r0
            goto L16
        L11:
            java.lang.Object r12 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r13)
            r7 = r12
        L16:
            if (r14 != 0) goto L19
            goto L1d
        L19:
            java.lang.Object r0 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r14)
        L1d:
            r8 = r0
            com.google.android.gms.measurement.internal.zzio r12 = r9.zza
            com.google.android.gms.measurement.internal.zzhe r1 = r12.zzaW()
            r3 = 1
            r4 = 0
            r2 = r10
            r5 = r11
            r1.zzu(r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityCreated(com.google.android.gms.dynamic.IObjectWrapper r1, android.os.Bundle r2, long r3) throws android.os.RemoteException {
            r0 = this;
            r0.zzb()
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            android.app.Activity r1 = (android.app.Activity) r1
            com.google.android.gms.internal.measurement.zzdj r1 = com.google.android.gms.internal.measurement.zzdj.zza(r1)
            r0.onActivityCreatedByScionActivityInfo(r1, r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj r1, android.os.Bundle r2, long r3) {
            r0 = this;
            r0.zzb()
            com.google.android.gms.measurement.internal.zzio r3 = r0.zza
            com.google.android.gms.measurement.internal.zzlw r3 = r3.zzq()
            com.google.android.gms.measurement.internal.zzlv r3 = r3.zza
            if (r3 == 0) goto L19
            com.google.android.gms.measurement.internal.zzio r4 = r0.zza
            com.google.android.gms.measurement.internal.zzlw r4 = r4.zzq()
            r4.zzK()
            r3.zza(r1, r2)
        L19:
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityDestroyed(com.google.android.gms.dynamic.IObjectWrapper r1, long r2) throws android.os.RemoteException {
            r0 = this;
            r0.zzb()
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            android.app.Activity r1 = (android.app.Activity) r1
            com.google.android.gms.internal.measurement.zzdj r1 = com.google.android.gms.internal.measurement.zzdj.zza(r1)
            r0.onActivityDestroyedByScionActivityInfo(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj r1, long r2) throws android.os.RemoteException {
            r0 = this;
            r0.zzb()
            com.google.android.gms.measurement.internal.zzio r2 = r0.zza
            com.google.android.gms.measurement.internal.zzlw r2 = r2.zzq()
            com.google.android.gms.measurement.internal.zzlv r2 = r2.zza
            if (r2 == 0) goto L19
            com.google.android.gms.measurement.internal.zzio r3 = r0.zza
            com.google.android.gms.measurement.internal.zzlw r3 = r3.zzq()
            r3.zzK()
            r2.zzb(r1)
        L19:
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityPaused(com.google.android.gms.dynamic.IObjectWrapper r1, long r2) throws android.os.RemoteException {
            r0 = this;
            r0.zzb()
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            android.app.Activity r1 = (android.app.Activity) r1
            com.google.android.gms.internal.measurement.zzdj r1 = com.google.android.gms.internal.measurement.zzdj.zza(r1)
            r0.onActivityPausedByScionActivityInfo(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj r1, long r2) throws android.os.RemoteException {
            r0 = this;
            r0.zzb()
            com.google.android.gms.measurement.internal.zzio r2 = r0.zza
            com.google.android.gms.measurement.internal.zzlw r2 = r2.zzq()
            com.google.android.gms.measurement.internal.zzlv r2 = r2.zza
            if (r2 == 0) goto L19
            com.google.android.gms.measurement.internal.zzio r3 = r0.zza
            com.google.android.gms.measurement.internal.zzlw r3 = r3.zzq()
            r3.zzK()
            r2.zzc(r1)
        L19:
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityResumed(com.google.android.gms.dynamic.IObjectWrapper r1, long r2) throws android.os.RemoteException {
            r0 = this;
            r0.zzb()
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            android.app.Activity r1 = (android.app.Activity) r1
            com.google.android.gms.internal.measurement.zzdj r1 = com.google.android.gms.internal.measurement.zzdj.zza(r1)
            r0.onActivityResumedByScionActivityInfo(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj r1, long r2) throws android.os.RemoteException {
            r0 = this;
            r0.zzb()
            com.google.android.gms.measurement.internal.zzio r2 = r0.zza
            com.google.android.gms.measurement.internal.zzlw r2 = r2.zzq()
            com.google.android.gms.measurement.internal.zzlv r2 = r2.zza
            if (r2 == 0) goto L19
            com.google.android.gms.measurement.internal.zzio r3 = r0.zza
            com.google.android.gms.measurement.internal.zzlw r3 = r3.zzq()
            r3.zzK()
            r2.zzd(r1)
        L19:
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivitySaveInstanceState(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.internal.measurement.zzcy r2, long r3) throws android.os.RemoteException {
            r0 = this;
            r0.zzb()
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            android.app.Activity r1 = (android.app.Activity) r1
            com.google.android.gms.internal.measurement.zzdj r1 = com.google.android.gms.internal.measurement.zzdj.zza(r1)
            r0.onActivitySaveInstanceStateByScionActivityInfo(r1, r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj r2, com.google.android.gms.internal.measurement.zzcy r3, long r4) throws android.os.RemoteException {
            r1 = this;
            r1.zzb()
            com.google.android.gms.measurement.internal.zzio r4 = r1.zza
            com.google.android.gms.measurement.internal.zzlw r4 = r4.zzq()
            com.google.android.gms.measurement.internal.zzlv r4 = r4.zza
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            if (r4 == 0) goto L1e
            com.google.android.gms.measurement.internal.zzio r0 = r1.zza
            com.google.android.gms.measurement.internal.zzlw r0 = r0.zzq()
            r0.zzK()
            r4.zze(r2, r5)
        L1e:
            r3.zze(r5)     // Catch: android.os.RemoteException -> L22
            return
        L22:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzio r3 = r1.zza
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzk()
            java.lang.String r4 = "Error returning bundle value to wrapper"
            r3.zzb(r4, r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityStarted(com.google.android.gms.dynamic.IObjectWrapper r1, long r2) throws android.os.RemoteException {
            r0 = this;
            r0.zzb()
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            android.app.Activity r1 = (android.app.Activity) r1
            com.google.android.gms.internal.measurement.zzdj r1 = com.google.android.gms.internal.measurement.zzdj.zza(r1)
            r0.onActivityStartedByScionActivityInfo(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj r1, long r2) throws android.os.RemoteException {
            r0 = this;
            r0.zzb()
            com.google.android.gms.measurement.internal.zzio r1 = r0.zza
            com.google.android.gms.measurement.internal.zzlw r1 = r1.zzq()
            com.google.android.gms.measurement.internal.zzlv r1 = r1.zza
            if (r1 == 0) goto L16
            com.google.android.gms.measurement.internal.zzio r1 = r0.zza
            com.google.android.gms.measurement.internal.zzlw r1 = r1.zzq()
            r1.zzK()
        L16:
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityStopped(com.google.android.gms.dynamic.IObjectWrapper r1, long r2) throws android.os.RemoteException {
            r0 = this;
            r0.zzb()
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            android.app.Activity r1 = (android.app.Activity) r1
            com.google.android.gms.internal.measurement.zzdj r1 = com.google.android.gms.internal.measurement.zzdj.zza(r1)
            r0.onActivityStoppedByScionActivityInfo(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj r1, long r2) throws android.os.RemoteException {
            r0 = this;
            r0.zzb()
            com.google.android.gms.measurement.internal.zzio r1 = r0.zza
            com.google.android.gms.measurement.internal.zzlw r1 = r1.zzq()
            com.google.android.gms.measurement.internal.zzlv r1 = r1.zza
            if (r1 == 0) goto L16
            com.google.android.gms.measurement.internal.zzio r1 = r0.zza
            com.google.android.gms.measurement.internal.zzlw r1 = r1.zzq()
            r1.zzK()
        L16:
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void performAction(android.os.Bundle r1, com.google.android.gms.internal.measurement.zzcy r2, long r3) throws android.os.RemoteException {
            r0 = this;
            r0.zzb()
            r1 = 0
            r2.zze(r1)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzde r3) throws android.os.RemoteException {
            r2 = this;
            r2.zzb()
            java.util.Map r0 = r2.zzb
            monitor-enter(r0)
            int r1 = r3.zze()     // Catch: java.lang.Throwable -> L31
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.measurement.internal.zzkc r1 = (com.google.android.gms.measurement.internal.zzkc) r1     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L26
            com.google.android.gms.measurement.internal.zzq r1 = new com.google.android.gms.measurement.internal.zzq     // Catch: java.lang.Throwable -> L31
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L31
            int r3 = r3.zze()     // Catch: java.lang.Throwable -> L31
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L31
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L31
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.measurement.internal.zzio r3 = r2.zza
            com.google.android.gms.measurement.internal.zzlw r3 = r3.zzq()
            r3.zzV(r1)
            return
        L31:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r3
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void resetAnalyticsData(long r2) throws android.os.RemoteException {
            r1 = this;
            r1.zzb()
            com.google.android.gms.measurement.internal.zzio r0 = r1.zza
            com.google.android.gms.measurement.internal.zzlw r0 = r0.zzq()
            r0.zzX(r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void retrieveAndUploadBatches(com.google.android.gms.internal.measurement.zzdb r4) {
            r3 = this;
            r3.zzb()
            com.google.android.gms.measurement.internal.zzio r0 = r3.zza
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r1 = com.google.android.gms.measurement.internal.zzgi.zzaR
            r2 = 0
            boolean r0 = r0.zzx(r2, r1)
            if (r0 != 0) goto L13
            return
        L13:
            com.google.android.gms.measurement.internal.zzio r0 = r3.zza
            com.google.android.gms.measurement.internal.zzlw r0 = r0.zzq()
            com.google.android.gms.measurement.internal.zzi r1 = new com.google.android.gms.measurement.internal.zzi
            r1.<init>(r3, r4)
            r0.zzY(r1)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setConditionalUserProperty(android.os.Bundle r2, long r3) throws android.os.RemoteException {
            r1 = this;
            r1.zzb()
            if (r2 != 0) goto L15
            com.google.android.gms.measurement.internal.zzio r2 = r1.zza
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()
            java.lang.String r3 = "Conditional user property must not be null"
            r2.zza(r3)
            return
        L15:
            com.google.android.gms.measurement.internal.zzio r0 = r1.zza
            com.google.android.gms.measurement.internal.zzlw r0 = r0.zzq()
            r0.zzae(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setConsent(android.os.Bundle r4, long r5) throws android.os.RemoteException {
            r3 = this;
            r3.zzb()
            com.google.android.gms.measurement.internal.zzio r0 = r3.zza
            com.google.android.gms.measurement.internal.zzlw r0 = r0.zzq()
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzil r1 = r1.zzaX()
            com.google.android.gms.measurement.internal.zzkm r2 = new com.google.android.gms.measurement.internal.zzkm
            r2.<init>(r0, r4, r5)
            r1.zzr(r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setConsentThirdParty(android.os.Bundle r3, long r4) throws android.os.RemoteException {
            r2 = this;
            r2.zzb()
            com.google.android.gms.measurement.internal.zzio r0 = r2.zza
            com.google.android.gms.measurement.internal.zzlw r0 = r0.zzq()
            r1 = -20
            r0.zzaf(r3, r1, r4)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setCurrentScreen(com.google.android.gms.dynamic.IObjectWrapper r7, java.lang.String r8, java.lang.String r9, long r10) throws android.os.RemoteException {
            r6 = this;
            r6.zzb()
            java.lang.Object r7 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r7)
            android.app.Activity r7 = (android.app.Activity) r7
            java.lang.Object r7 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            android.app.Activity r7 = (android.app.Activity) r7
            com.google.android.gms.internal.measurement.zzdj r1 = com.google.android.gms.internal.measurement.zzdj.zza(r7)
            r0 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            r0.setCurrentScreenByScionActivityInfo(r1, r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj r1, java.lang.String r2, java.lang.String r3, long r4) throws android.os.RemoteException {
            r0 = this;
            r0.zzb()
            com.google.android.gms.measurement.internal.zzio r4 = r0.zza
            com.google.android.gms.measurement.internal.zzmo r4 = r4.zzt()
            r4.zzx(r1, r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setDataCollectionEnabled(boolean r4) throws android.os.RemoteException {
            r3 = this;
            r3.zzb()
            com.google.android.gms.measurement.internal.zzio r0 = r3.zza
            com.google.android.gms.measurement.internal.zzlw r0 = r0.zzq()
            r0.zza()
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzil r1 = r1.zzaX()
            com.google.android.gms.measurement.internal.zzkv r2 = new com.google.android.gms.measurement.internal.zzkv
            r2.<init>(r0, r4)
            r1.zzq(r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setDefaultEventParameters(android.os.Bundle r4) {
            r3 = this;
            r3.zzb()
            com.google.android.gms.measurement.internal.zzio r0 = r3.zza
            com.google.android.gms.measurement.internal.zzlw r0 = r0.zzq()
            if (r4 != 0) goto L11
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            goto L17
        L11:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>(r4)
            r4 = r1
        L17:
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzil r1 = r1.zzaX()
            com.google.android.gms.measurement.internal.zzkk r2 = new com.google.android.gms.measurement.internal.zzkk
            r2.<init>(r0, r4)
            r1.zzq(r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzde r3) throws android.os.RemoteException {
            r2 = this;
            r2.zzb()
            com.google.android.gms.measurement.internal.zzp r0 = new com.google.android.gms.measurement.internal.zzp
            r0.<init>(r2, r3)
            com.google.android.gms.measurement.internal.zzio r3 = r2.zza
            com.google.android.gms.measurement.internal.zzil r3 = r3.zzaX()
            boolean r3 = r3.zzu()
            if (r3 == 0) goto L1e
            com.google.android.gms.measurement.internal.zzio r3 = r2.zza
            com.google.android.gms.measurement.internal.zzlw r3 = r3.zzq()
            r3.zzah(r0)
            return
        L1e:
            com.google.android.gms.measurement.internal.zzio r3 = r2.zza
            com.google.android.gms.measurement.internal.zzil r3 = r3.zzaX()
            com.google.android.gms.measurement.internal.zzm r1 = new com.google.android.gms.measurement.internal.zzm
            r1.<init>(r2, r0)
            r3.zzq(r1)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzdg r1) throws android.os.RemoteException {
            r0 = this;
            r0.zzb()
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setMeasurementEnabled(boolean r1, long r2) throws android.os.RemoteException {
            r0 = this;
            r0.zzb()
            com.google.android.gms.measurement.internal.zzio r2 = r0.zza
            com.google.android.gms.measurement.internal.zzlw r2 = r2.zzq()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.zzai(r1)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setMinimumSessionDuration(long r1) throws android.os.RemoteException {
            r0 = this;
            r0.zzb()
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setSessionTimeoutDuration(long r4) throws android.os.RemoteException {
            r3 = this;
            r3.zzb()
            com.google.android.gms.measurement.internal.zzio r0 = r3.zza
            com.google.android.gms.measurement.internal.zzlw r0 = r0.zzq()
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzil r1 = r1.zzaX()
            com.google.android.gms.measurement.internal.zzkx r2 = new com.google.android.gms.measurement.internal.zzkx
            r2.<init>(r0, r4)
            r1.zzq(r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setSgtmDebugInfo(android.content.Intent r4) throws android.os.RemoteException {
            r3 = this;
            r3.zzb()
            com.google.android.gms.measurement.internal.zzio r0 = r3.zza
            com.google.android.gms.measurement.internal.zzlw r0 = r0.zzq()
            android.net.Uri r4 = r4.getData()
            if (r4 != 0) goto L1f
            com.google.android.gms.measurement.internal.zzio r4 = r0.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzi()
            java.lang.String r0 = "Activity intent has no data. Preview Mode was not enabled."
            r4.zza(r0)
            return
        L1f:
            java.lang.String r1 = "sgtm_debug_enable"
            java.lang.String r1 = r4.getQueryParameter(r1)
            if (r1 == 0) goto L53
            java.lang.String r2 = "1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L30
            goto L53
        L30:
            java.lang.String r1 = "sgtm_preview_key"
            java.lang.String r4 = r4.getQueryParameter(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L52
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzi()
            java.lang.String r2 = "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: "
            r1.zzb(r2, r4)
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzf()
            r0.zzv(r4)
        L52:
            return
        L53:
            com.google.android.gms.measurement.internal.zzio r4 = r0.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzi()
            java.lang.String r1 = "[sgtm] Preview Mode was not enabled."
            r0.zza(r1)
            com.google.android.gms.measurement.internal.zzam r4 = r4.zzf()
            r0 = 0
            r4.zzv(r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setUserId(java.lang.String r9, long r10) throws android.os.RemoteException {
            r8 = this;
            r8.zzb()
            com.google.android.gms.measurement.internal.zzio r0 = r8.zza
            com.google.android.gms.measurement.internal.zzlw r1 = r0.zzq()
            if (r9 == 0) goto L21
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L21
            com.google.android.gms.measurement.internal.zzio r9 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r9 = r9.zzaW()
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zzk()
            java.lang.String r10 = "User ID must be non-empty or null"
            r9.zza(r10)
            return
        L21:
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzkg r2 = new com.google.android.gms.measurement.internal.zzkg
            r2.<init>(r1, r9)
            r0.zzq(r2)
            r2 = 0
            r5 = 1
            java.lang.String r3 = "_id"
            r4 = r9
            r6 = r10
            r1.zzam(r2, r3, r4, r5, r6)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setUserProperty(java.lang.String r8, java.lang.String r9, com.google.android.gms.dynamic.IObjectWrapper r10, boolean r11, long r12) throws android.os.RemoteException {
            r7 = this;
            r7.zzb()
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r10)
            com.google.android.gms.measurement.internal.zzio r10 = r7.zza
            com.google.android.gms.measurement.internal.zzlw r0 = r10.zzq()
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            r0.zzam(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzde r3) throws android.os.RemoteException {
            r2 = this;
            r2.zzb()
            java.util.Map r0 = r2.zzb
            monitor-enter(r0)
            int r1 = r3.zze()     // Catch: java.lang.Throwable -> L26
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L26
            java.lang.Object r1 = r0.remove(r1)     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.measurement.internal.zzkc r1 = (com.google.android.gms.measurement.internal.zzkc) r1     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L1c
            com.google.android.gms.measurement.internal.zzq r1 = new com.google.android.gms.measurement.internal.zzq
            r1.<init>(r2, r3)
        L1c:
            com.google.android.gms.measurement.internal.zzio r3 = r2.zza
            com.google.android.gms.measurement.internal.zzlw r3 = r3.zzq()
            r3.zzao(r1)
            return
        L26:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r3
    }
}
