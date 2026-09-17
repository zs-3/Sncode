package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
public interface zzcv extends android.os.IInterface {
    void beginAdUnitExposure(java.lang.String r1, long r2) throws android.os.RemoteException;

    void clearConditionalUserProperty(java.lang.String r1, java.lang.String r2, android.os.Bundle r3) throws android.os.RemoteException;

    void clearMeasurementEnabled(long r1) throws android.os.RemoteException;

    void endAdUnitExposure(java.lang.String r1, long r2) throws android.os.RemoteException;

    void generateEventId(com.google.android.gms.internal.measurement.zzcy r1) throws android.os.RemoteException;

    void getAppInstanceId(com.google.android.gms.internal.measurement.zzcy r1) throws android.os.RemoteException;

    void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzcy r1) throws android.os.RemoteException;

    void getConditionalUserProperties(java.lang.String r1, java.lang.String r2, com.google.android.gms.internal.measurement.zzcy r3) throws android.os.RemoteException;

    void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzcy r1) throws android.os.RemoteException;

    void getCurrentScreenName(com.google.android.gms.internal.measurement.zzcy r1) throws android.os.RemoteException;

    void getGmpAppId(com.google.android.gms.internal.measurement.zzcy r1) throws android.os.RemoteException;

    void getMaxUserProperties(java.lang.String r1, com.google.android.gms.internal.measurement.zzcy r2) throws android.os.RemoteException;

    void getSessionId(com.google.android.gms.internal.measurement.zzcy r1) throws android.os.RemoteException;

    void getTestFlag(com.google.android.gms.internal.measurement.zzcy r1, int r2) throws android.os.RemoteException;

    void getUserProperties(java.lang.String r1, java.lang.String r2, boolean r3, com.google.android.gms.internal.measurement.zzcy r4) throws android.os.RemoteException;

    void initForTests(java.util.Map r1) throws android.os.RemoteException;

    void initialize(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.internal.measurement.zzdh r2, long r3) throws android.os.RemoteException;

    void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzcy r1) throws android.os.RemoteException;

    void logEvent(java.lang.String r1, java.lang.String r2, android.os.Bundle r3, boolean r4, boolean r5, long r6) throws android.os.RemoteException;

    void logEventAndBundle(java.lang.String r1, java.lang.String r2, android.os.Bundle r3, com.google.android.gms.internal.measurement.zzcy r4, long r5) throws android.os.RemoteException;

    void logHealthData(int r1, java.lang.String r2, com.google.android.gms.dynamic.IObjectWrapper r3, com.google.android.gms.dynamic.IObjectWrapper r4, com.google.android.gms.dynamic.IObjectWrapper r5) throws android.os.RemoteException;

    void onActivityCreated(com.google.android.gms.dynamic.IObjectWrapper r1, android.os.Bundle r2, long r3) throws android.os.RemoteException;

    void onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj r1, android.os.Bundle r2, long r3) throws android.os.RemoteException;

    void onActivityDestroyed(com.google.android.gms.dynamic.IObjectWrapper r1, long r2) throws android.os.RemoteException;

    void onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj r1, long r2) throws android.os.RemoteException;

    void onActivityPaused(com.google.android.gms.dynamic.IObjectWrapper r1, long r2) throws android.os.RemoteException;

    void onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj r1, long r2) throws android.os.RemoteException;

    void onActivityResumed(com.google.android.gms.dynamic.IObjectWrapper r1, long r2) throws android.os.RemoteException;

    void onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj r1, long r2) throws android.os.RemoteException;

    void onActivitySaveInstanceState(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.internal.measurement.zzcy r2, long r3) throws android.os.RemoteException;

    void onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj r1, com.google.android.gms.internal.measurement.zzcy r2, long r3) throws android.os.RemoteException;

    void onActivityStarted(com.google.android.gms.dynamic.IObjectWrapper r1, long r2) throws android.os.RemoteException;

    void onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj r1, long r2) throws android.os.RemoteException;

    void onActivityStopped(com.google.android.gms.dynamic.IObjectWrapper r1, long r2) throws android.os.RemoteException;

    void onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj r1, long r2) throws android.os.RemoteException;

    void performAction(android.os.Bundle r1, com.google.android.gms.internal.measurement.zzcy r2, long r3) throws android.os.RemoteException;

    void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzde r1) throws android.os.RemoteException;

    void resetAnalyticsData(long r1) throws android.os.RemoteException;

    void retrieveAndUploadBatches(com.google.android.gms.internal.measurement.zzdb r1) throws android.os.RemoteException;

    void setConditionalUserProperty(android.os.Bundle r1, long r2) throws android.os.RemoteException;

    void setConsent(android.os.Bundle r1, long r2) throws android.os.RemoteException;

    void setConsentThirdParty(android.os.Bundle r1, long r2) throws android.os.RemoteException;

    void setCurrentScreen(com.google.android.gms.dynamic.IObjectWrapper r1, java.lang.String r2, java.lang.String r3, long r4) throws android.os.RemoteException;

    void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj r1, java.lang.String r2, java.lang.String r3, long r4) throws android.os.RemoteException;

    void setDataCollectionEnabled(boolean r1) throws android.os.RemoteException;

    void setDefaultEventParameters(android.os.Bundle r1) throws android.os.RemoteException;

    void setEventInterceptor(com.google.android.gms.internal.measurement.zzde r1) throws android.os.RemoteException;

    void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzdg r1) throws android.os.RemoteException;

    void setMeasurementEnabled(boolean r1, long r2) throws android.os.RemoteException;

    void setMinimumSessionDuration(long r1) throws android.os.RemoteException;

    void setSessionTimeoutDuration(long r1) throws android.os.RemoteException;

    void setSgtmDebugInfo(android.content.Intent r1) throws android.os.RemoteException;

    void setUserId(java.lang.String r1, long r2) throws android.os.RemoteException;

    void setUserProperty(java.lang.String r1, java.lang.String r2, com.google.android.gms.dynamic.IObjectWrapper r3, boolean r4, long r5) throws android.os.RemoteException;

    void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzde r1) throws android.os.RemoteException;
}
