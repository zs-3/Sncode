package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
public class CrashlyticsAppQualitySessionsSubscriber implements com.google.firebase.sessions.api.SessionSubscriber {
    private final com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsStore appQualitySessionsStore;
    private final com.google.firebase.crashlytics.internal.common.DataCollectionArbiter dataCollectionArbiter;

    public CrashlyticsAppQualitySessionsSubscriber(com.google.firebase.crashlytics.internal.common.DataCollectionArbiter r1, com.google.firebase.crashlytics.internal.persistence.FileStore r2) {
            r0 = this;
            r0.<init>()
            r0.dataCollectionArbiter = r1
            com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsStore r1 = new com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsStore
            r1.<init>(r2)
            r0.appQualitySessionsStore = r1
            return
    }

    public java.lang.String getAppQualitySessionId(java.lang.String r2) {
            r1 = this;
            com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsStore r0 = r1.appQualitySessionsStore
            java.lang.String r2 = r0.getAppQualitySessionId(r2)
            return r2
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public com.google.firebase.sessions.api.SessionSubscriber.Name getSessionSubscriberName() {
            r1 = this;
            com.google.firebase.sessions.api.SessionSubscriber$Name r0 = com.google.firebase.sessions.api.SessionSubscriber.Name.CRASHLYTICS
            return r0
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public boolean isDataCollectionEnabled() {
            r1 = this;
            com.google.firebase.crashlytics.internal.common.DataCollectionArbiter r0 = r1.dataCollectionArbiter
            boolean r0 = r0.isAutomaticDataCollectionEnabled()
            return r0
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public void onSessionChanged(com.google.firebase.sessions.api.SessionSubscriber.SessionDetails r4) {
            r3 = this;
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "App Quality Sessions session changed: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.d(r1)
            com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsStore r0 = r3.appQualitySessionsStore
            java.lang.String r4 = r4.getSessionId()
            r0.rotateAppQualitySessionId(r4)
            return
    }

    public void setSessionId(java.lang.String r2) {
            r1 = this;
            com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsStore r0 = r1.appQualitySessionsStore
            r0.rotateSessionId(r2)
            return
    }
}
