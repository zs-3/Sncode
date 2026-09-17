package com.google.firebase.sessions;

/* compiled from: SessionEvents.kt */
/* loaded from: classes2.dex */
public final class SessionEvents {
    public static final com.google.firebase.sessions.SessionEvents INSTANCE = null;
    private static final com.google.firebase.encoders.DataEncoder SESSION_EVENT_ENCODER = null;

    static {
            com.google.firebase.sessions.SessionEvents r0 = new com.google.firebase.sessions.SessionEvents
            r0.<init>()
            com.google.firebase.sessions.SessionEvents.INSTANCE = r0
            com.google.firebase.encoders.json.JsonDataEncoderBuilder r0 = new com.google.firebase.encoders.json.JsonDataEncoderBuilder
            r0.<init>()
            com.google.firebase.encoders.config.Configurator r1 = com.google.firebase.sessions.AutoSessionEventEncoder.CONFIG
            com.google.firebase.encoders.json.JsonDataEncoderBuilder r0 = r0.configureWith(r1)
            r1 = 1
            com.google.firebase.encoders.json.JsonDataEncoderBuilder r0 = r0.ignoreNullValues(r1)
            com.google.firebase.encoders.DataEncoder r0 = r0.build()
            java.lang.String r1 = "JsonDataEncoderBuilder()…lues(true)\n      .build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.google.firebase.sessions.SessionEvents.SESSION_EVENT_ENCODER = r0
            return
    }

    private SessionEvents() {
            r0 = this;
            r0.<init>()
            return
    }

    private final com.google.firebase.sessions.DataCollectionState toDataCollectionState(com.google.firebase.sessions.api.SessionSubscriber r1) {
            r0 = this;
            if (r1 != 0) goto L5
            com.google.firebase.sessions.DataCollectionState r1 = com.google.firebase.sessions.DataCollectionState.COLLECTION_SDK_NOT_INSTALLED
            goto L10
        L5:
            boolean r1 = r1.isDataCollectionEnabled()
            if (r1 == 0) goto Le
            com.google.firebase.sessions.DataCollectionState r1 = com.google.firebase.sessions.DataCollectionState.COLLECTION_ENABLED
            goto L10
        Le:
            com.google.firebase.sessions.DataCollectionState r1 = com.google.firebase.sessions.DataCollectionState.COLLECTION_DISABLED
        L10:
            return r1
    }

    public final com.google.firebase.sessions.SessionEvent buildSession(com.google.firebase.FirebaseApp r17, com.google.firebase.sessions.SessionDetails r18, com.google.firebase.sessions.settings.SessionsSettings r19, java.util.Map<com.google.firebase.sessions.api.SessionSubscriber.Name, ? extends com.google.firebase.sessions.api.SessionSubscriber> r20, java.lang.String r21, java.lang.String r22) {
            r16 = this;
            r0 = r16
            r1 = r20
            java.lang.String r2 = "firebaseApp"
            r3 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.String r2 = "sessionDetails"
            r4 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            java.lang.String r2 = "sessionsSettings"
            r5 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            java.lang.String r2 = "subscribers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = "firebaseInstallationId"
            r11 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
            java.lang.String r2 = "firebaseAuthenticationToken"
            r12 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r2)
            com.google.firebase.sessions.SessionEvent r2 = new com.google.firebase.sessions.SessionEvent
            com.google.firebase.sessions.EventType r13 = com.google.firebase.sessions.EventType.SESSION_START
            com.google.firebase.sessions.SessionInfo r14 = new com.google.firebase.sessions.SessionInfo
            java.lang.String r6 = r18.getSessionId()
            java.lang.String r7 = r18.getFirstSessionId()
            int r8 = r18.getSessionIndex()
            long r9 = r18.getSessionStartTimestampUs()
            com.google.firebase.sessions.DataCollectionStatus r15 = new com.google.firebase.sessions.DataCollectionStatus
            com.google.firebase.sessions.api.SessionSubscriber$Name r4 = com.google.firebase.sessions.api.SessionSubscriber.Name.PERFORMANCE
            java.lang.Object r4 = r1.get(r4)
            com.google.firebase.sessions.api.SessionSubscriber r4 = (com.google.firebase.sessions.api.SessionSubscriber) r4
            com.google.firebase.sessions.DataCollectionState r4 = r0.toDataCollectionState(r4)
            com.google.firebase.sessions.api.SessionSubscriber$Name r3 = com.google.firebase.sessions.api.SessionSubscriber.Name.CRASHLYTICS
            java.lang.Object r1 = r1.get(r3)
            com.google.firebase.sessions.api.SessionSubscriber r1 = (com.google.firebase.sessions.api.SessionSubscriber) r1
            com.google.firebase.sessions.DataCollectionState r1 = r0.toDataCollectionState(r1)
            double r11 = r19.getSamplingRate()
            r15.<init>(r4, r1, r11)
            r4 = r14
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r10 = r15
            r11 = r21
            r12 = r22
            r4.<init>(r5, r6, r7, r8, r10, r11, r12)
            com.google.firebase.sessions.ApplicationInfo r1 = r16.getApplicationInfo(r17)
            r2.<init>(r13, r14, r1)
            return r2
    }

    public final com.google.firebase.sessions.ApplicationInfo getApplicationInfo(com.google.firebase.FirebaseApp r17) {
            r16 = this;
            java.lang.String r0 = "firebaseApp"
            r1 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            android.content.Context r0 = r17.getApplicationContext()
            java.lang.String r2 = "firebaseApp.applicationContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.lang.String r4 = r0.getPackageName()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r3 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r4, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r3 < r5) goto L2c
            long r5 = r0.getLongVersionCode()
            java.lang.String r3 = java.lang.String.valueOf(r5)
            goto L32
        L2c:
            int r3 = r0.versionCode
            java.lang.String r3 = java.lang.String.valueOf(r3)
        L32:
            r6 = r3
            com.google.firebase.sessions.ApplicationInfo r14 = new com.google.firebase.sessions.ApplicationInfo
            com.google.firebase.FirebaseOptions r3 = r17.getOptions()
            java.lang.String r10 = r3.getApplicationId()
            java.lang.String r3 = "firebaseApp.options.applicationId"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r3)
            java.lang.String r11 = android.os.Build.MODEL
            java.lang.String r3 = "MODEL"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r3)
            java.lang.String r12 = android.os.Build.VERSION.RELEASE
            java.lang.String r3 = "RELEASE"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r3)
            com.google.firebase.sessions.LogEnvironment r13 = com.google.firebase.sessions.LogEnvironment.LOG_ENVIRONMENT_PROD
            com.google.firebase.sessions.AndroidApplicationInfo r15 = new com.google.firebase.sessions.AndroidApplicationInfo
            java.lang.String r3 = "packageName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
            java.lang.String r0 = r0.versionName
            if (r0 != 0) goto L5f
            r5 = r6
            goto L60
        L5f:
            r5 = r0
        L60:
            java.lang.String r7 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "MANUFACTURER"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            com.google.firebase.sessions.ProcessDetailsProvider r0 = com.google.firebase.sessions.ProcessDetailsProvider.INSTANCE
            android.content.Context r3 = r17.getApplicationContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            com.google.firebase.sessions.ProcessDetails r8 = r0.getCurrentProcessDetails(r3)
            android.content.Context r1 = r17.getApplicationContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.util.List r9 = r0.getAppProcessDetails(r1)
            r3 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.lang.String r0 = "2.0.5"
            r7 = r14
            r8 = r10
            r9 = r11
            r10 = r0
            r11 = r12
            r12 = r13
            r13 = r15
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r14
    }

    public final com.google.firebase.encoders.DataEncoder getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions() {
            r1 = this;
            com.google.firebase.encoders.DataEncoder r0 = com.google.firebase.sessions.SessionEvents.SESSION_EVENT_ENCODER
            return r0
    }
}
