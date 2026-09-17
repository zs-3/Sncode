package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzct extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.internal.measurement.zzcv {
    zzct(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void beginAdUnitExposure(java.lang.String r2, long r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeLong(r3)
            r2 = 23
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void clearConditionalUserProperty(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeString(r3)
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r4)
            r2 = 9
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void clearMeasurementEnabled(long r1) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void endAdUnitExposure(java.lang.String r2, long r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeLong(r3)
            r2 = 24
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void generateEventId(com.google.android.gms.internal.measurement.zzcy r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zze(r0, r2)
            r2 = 22
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getAppInstanceId(com.google.android.gms.internal.measurement.zzcy r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zze(r0, r2)
            r2 = 20
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzcy r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zze(r0, r2)
            r2 = 19
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getConditionalUserProperties(java.lang.String r2, java.lang.String r3, com.google.android.gms.internal.measurement.zzcy r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeString(r3)
            com.google.android.gms.internal.measurement.zzbo.zze(r0, r4)
            r2 = 10
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzcy r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zze(r0, r2)
            r2 = 17
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getCurrentScreenName(com.google.android.gms.internal.measurement.zzcy r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zze(r0, r2)
            r2 = 16
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getGmpAppId(com.google.android.gms.internal.measurement.zzcy r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zze(r0, r2)
            r2 = 21
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getMaxUserProperties(java.lang.String r2, com.google.android.gms.internal.measurement.zzcy r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            com.google.android.gms.internal.measurement.zzbo.zze(r0, r3)
            r2 = 6
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getSessionId(com.google.android.gms.internal.measurement.zzcy r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zze(r0, r2)
            r2 = 46
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getTestFlag(com.google.android.gms.internal.measurement.zzcy r2, int r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zze(r0, r2)
            r0.writeInt(r3)
            r2 = 38
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getUserProperties(java.lang.String r2, java.lang.String r3, boolean r4, com.google.android.gms.internal.measurement.zzcy r5) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeString(r3)
            int r2 = com.google.android.gms.internal.measurement.zzbo.zza
            r0.writeInt(r4)
            com.google.android.gms.internal.measurement.zzbo.zze(r0, r5)
            r2 = 5
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void initForTests(java.util.Map r1) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void initialize(com.google.android.gms.dynamic.IObjectWrapper r2, com.google.android.gms.internal.measurement.zzdh r3, long r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zze(r0, r2)
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r3)
            r0.writeLong(r4)
            r2 = 1
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzcy r1) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void logEvent(java.lang.String r2, java.lang.String r3, android.os.Bundle r4, boolean r5, boolean r6, long r7) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeString(r3)
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r4)
            r0.writeInt(r5)
            r0.writeInt(r6)
            r0.writeLong(r7)
            r2 = 2
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void logEventAndBundle(java.lang.String r1, java.lang.String r2, android.os.Bundle r3, com.google.android.gms.internal.measurement.zzcy r4, long r5) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void logHealthData(int r2, java.lang.String r3, com.google.android.gms.dynamic.IObjectWrapper r4, com.google.android.gms.dynamic.IObjectWrapper r5, com.google.android.gms.dynamic.IObjectWrapper r6) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r2 = r1.zza()
            r0 = 5
            r2.writeInt(r0)
            r2.writeString(r3)
            com.google.android.gms.internal.measurement.zzbo.zze(r2, r4)
            com.google.android.gms.internal.measurement.zzbo.zze(r2, r5)
            com.google.android.gms.internal.measurement.zzbo.zze(r2, r6)
            r3 = 33
            r1.zzc(r3, r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityCreated(com.google.android.gms.dynamic.IObjectWrapper r1, android.os.Bundle r2, long r3) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj r2, android.os.Bundle r3, long r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r3)
            r0.writeLong(r4)
            r2 = 53
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityDestroyed(com.google.android.gms.dynamic.IObjectWrapper r1, long r2) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj r2, long r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            r0.writeLong(r3)
            r2 = 54
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityPaused(com.google.android.gms.dynamic.IObjectWrapper r1, long r2) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj r2, long r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            r0.writeLong(r3)
            r2 = 55
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityResumed(com.google.android.gms.dynamic.IObjectWrapper r1, long r2) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj r2, long r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            r0.writeLong(r3)
            r2 = 56
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivitySaveInstanceState(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.internal.measurement.zzcy r2, long r3) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj r2, com.google.android.gms.internal.measurement.zzcy r3, long r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            com.google.android.gms.internal.measurement.zzbo.zze(r0, r3)
            r0.writeLong(r4)
            r2 = 57
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityStarted(com.google.android.gms.dynamic.IObjectWrapper r1, long r2) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj r2, long r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            r0.writeLong(r3)
            r2 = 51
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityStopped(com.google.android.gms.dynamic.IObjectWrapper r1, long r2) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj r2, long r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            r0.writeLong(r3)
            r2 = 52
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void performAction(android.os.Bundle r2, com.google.android.gms.internal.measurement.zzcy r3, long r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            com.google.android.gms.internal.measurement.zzbo.zze(r0, r3)
            r0.writeLong(r4)
            r2 = 32
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzde r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zze(r0, r2)
            r2 = 35
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void resetAnalyticsData(long r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeLong(r2)
            r2 = 12
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void retrieveAndUploadBatches(com.google.android.gms.internal.measurement.zzdb r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zze(r0, r2)
            r2 = 58
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setConditionalUserProperty(android.os.Bundle r2, long r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            r0.writeLong(r3)
            r2 = 8
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setConsent(android.os.Bundle r1, long r2) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setConsentThirdParty(android.os.Bundle r2, long r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            r0.writeLong(r3)
            r2 = 45
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setCurrentScreen(com.google.android.gms.dynamic.IObjectWrapper r1, java.lang.String r2, java.lang.String r3, long r4) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj r2, java.lang.String r3, java.lang.String r4, long r5) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            r0.writeString(r3)
            r0.writeString(r4)
            r0.writeLong(r5)
            r2 = 50
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setDataCollectionEnabled(boolean r3) throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            int r1 = com.google.android.gms.internal.measurement.zzbo.zza
            r0.writeInt(r3)
            r3 = 39
            r2.zzc(r3, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setDefaultEventParameters(android.os.Bundle r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            r2 = 42
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setEventInterceptor(com.google.android.gms.internal.measurement.zzde r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zze(r0, r2)
            r2 = 34
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzdg r1) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setMeasurementEnabled(boolean r3, long r4) throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            int r1 = com.google.android.gms.internal.measurement.zzbo.zza
            r0.writeInt(r3)
            r0.writeLong(r4)
            r3 = 11
            r2.zzc(r3, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setMinimumSessionDuration(long r1) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setSessionTimeoutDuration(long r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeLong(r2)
            r2 = 14
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setSgtmDebugInfo(android.content.Intent r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zzd(r0, r2)
            r2 = 48
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setUserId(java.lang.String r2, long r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeLong(r3)
            r2 = 7
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setUserProperty(java.lang.String r2, java.lang.String r3, com.google.android.gms.dynamic.IObjectWrapper r4, boolean r5, long r6) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeString(r3)
            com.google.android.gms.internal.measurement.zzbo.zze(r0, r4)
            r0.writeInt(r5)
            r0.writeLong(r6)
            r2 = 4
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzde r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzbo.zze(r0, r2)
            r2 = 36
            r1.zzc(r2, r0)
            return
    }
}
