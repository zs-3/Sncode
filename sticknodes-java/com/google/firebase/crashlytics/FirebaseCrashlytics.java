package com.google.firebase.crashlytics;

/* loaded from: classes2.dex */
public class FirebaseCrashlytics {
    final com.google.firebase.crashlytics.internal.common.CrashlyticsCore core;

    public static /* synthetic */ void $r8$lambda$XK7OWSV95iEyQK_LSWMaF6yA8Dc(java.lang.Exception r0) {
            lambda$init$0(r0)
            return
    }

    private FirebaseCrashlytics(com.google.firebase.crashlytics.internal.common.CrashlyticsCore r1) {
            r0 = this;
            r0.<init>()
            r0.core = r1
            return
    }

    public static com.google.firebase.crashlytics.FirebaseCrashlytics getInstance() {
            com.google.firebase.FirebaseApp r0 = com.google.firebase.FirebaseApp.getInstance()
            java.lang.Class<com.google.firebase.crashlytics.FirebaseCrashlytics> r1 = com.google.firebase.crashlytics.FirebaseCrashlytics.class
            java.lang.Object r0 = r0.get(r1)
            com.google.firebase.crashlytics.FirebaseCrashlytics r0 = (com.google.firebase.crashlytics.FirebaseCrashlytics) r0
            java.lang.String r1 = "FirebaseCrashlytics component is not present."
            java.util.Objects.requireNonNull(r0, r1)
            return r0
    }

    static com.google.firebase.crashlytics.FirebaseCrashlytics init(com.google.firebase.FirebaseApp r18, com.google.firebase.installations.FirebaseInstallationsApi r19, com.google.firebase.inject.Deferred<com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent> r20, com.google.firebase.inject.Deferred<com.google.firebase.analytics.connector.AnalyticsConnector> r21, com.google.firebase.inject.Deferred<com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop> r22, java.util.concurrent.ExecutorService r23, java.util.concurrent.ExecutorService r24) {
            android.content.Context r1 = r18.getApplicationContext()
            java.lang.String r0 = r1.getPackageName()
            com.google.firebase.crashlytics.internal.Logger r2 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Initializing Firebase Crashlytics "
            r3.append(r4)
            java.lang.String r4 = com.google.firebase.crashlytics.internal.common.CrashlyticsCore.getVersion()
            r3.append(r4)
            java.lang.String r4 = " for "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.i(r3)
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r15 = new com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers
            r2 = r23
            r3 = r24
            r15.<init>(r2, r3)
            com.google.firebase.crashlytics.internal.persistence.FileStore r3 = new com.google.firebase.crashlytics.internal.persistence.FileStore
            r3.<init>(r1)
            com.google.firebase.crashlytics.internal.common.DataCollectionArbiter r2 = new com.google.firebase.crashlytics.internal.common.DataCollectionArbiter
            r14 = r18
            r2.<init>(r14)
            com.google.firebase.crashlytics.internal.common.IdManager r13 = new com.google.firebase.crashlytics.internal.common.IdManager
            r4 = r19
            r13.<init>(r1, r0, r4, r2)
            com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy r7 = new com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy
            r0 = r20
            r7.<init>(r0)
            com.google.firebase.crashlytics.AnalyticsDeferredProxy r0 = new com.google.firebase.crashlytics.AnalyticsDeferredProxy
            r4 = r21
            r0.<init>(r4)
            com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber r12 = new com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber
            r12.<init>(r2, r3)
            com.google.firebase.sessions.api.FirebaseSessionsDependencies.register(r12)
            com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy r11 = new com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy
            r4 = r22
            r11.<init>(r4)
            com.google.firebase.crashlytics.internal.common.CrashlyticsCore r10 = new com.google.firebase.crashlytics.internal.common.CrashlyticsCore
            com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource r9 = r0.getDeferredBreadcrumbSource()
            com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger r0 = r0.getAnalyticsEventLogger()
            r4 = r10
            r5 = r18
            r6 = r13
            r8 = r2
            r16 = r10
            r10 = r0
            r0 = r11
            r11 = r3
            r17 = r13
            r13 = r0
            r14 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            com.google.firebase.FirebaseOptions r0 = r18.getOptions()
            java.lang.String r0 = r0.getApplicationId()
            java.lang.String r4 = com.google.firebase.crashlytics.internal.common.CommonUtils.getMappingFileId(r1)
            java.util.List r5 = com.google.firebase.crashlytics.internal.common.CommonUtils.getBuildIdInfo(r1)
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Mapping file ID is: "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            r6.d(r7)
            java.util.Iterator r6 = r5.iterator()
        Lac:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lde
            java.lang.Object r7 = r6.next()
            com.google.firebase.crashlytics.internal.common.BuildIdInfo r7 = (com.google.firebase.crashlytics.internal.common.BuildIdInfo) r7
            com.google.firebase.crashlytics.internal.Logger r8 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r10 = 0
            java.lang.String r11 = r7.getLibraryName()
            r9[r10] = r11
            r10 = 1
            java.lang.String r11 = r7.getArch()
            r9[r10] = r11
            r10 = 2
            java.lang.String r7 = r7.getBuildId()
            r9[r10] = r7
            java.lang.String r7 = "Build id for %s on %s: %s"
            java.lang.String r7 = java.lang.String.format(r7, r9)
            r8.d(r7)
            goto Lac
        Lde:
            com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider r6 = new com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider
            r6.<init>(r1)
            r18 = r1
            r19 = r17
            r20 = r0
            r21 = r4
            r22 = r5
            r23 = r6
            com.google.firebase.crashlytics.internal.common.AppData r9 = com.google.firebase.crashlytics.internal.common.AppData.create(r18, r19, r20, r21, r22, r23)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13a
            com.google.firebase.crashlytics.internal.Logger r4 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Installer package name is: "
            r5.append(r6)
            java.lang.String r6 = r9.installerPackageName
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.v(r5)
            com.google.firebase.crashlytics.internal.network.HttpRequestFactory r4 = new com.google.firebase.crashlytics.internal.network.HttpRequestFactory
            r4.<init>()
            java.lang.String r5 = r9.versionCode
            java.lang.String r6 = r9.versionName
            r8 = r2
            r2 = r0
            r0 = r3
            r3 = r17
            r7 = r0
            com.google.firebase.crashlytics.internal.settings.SettingsController r0 = com.google.firebase.crashlytics.internal.settings.SettingsController.create(r1, r2, r3, r4, r5, r6, r7, r8)
            com.google.android.gms.tasks.Task r1 = r0.loadSettingsData(r15)
            com.google.firebase.crashlytics.FirebaseCrashlytics$$ExternalSyntheticLambda0 r2 = com.google.firebase.crashlytics.FirebaseCrashlytics$$ExternalSyntheticLambda0.INSTANCE
            r1.addOnFailureListener(r2)
            r1 = r16
            boolean r2 = r1.onPreExecute(r9, r0)
            if (r2 == 0) goto L134
            r1.doBackgroundInitializationAsync(r0)
        L134:
            com.google.firebase.crashlytics.FirebaseCrashlytics r0 = new com.google.firebase.crashlytics.FirebaseCrashlytics
            r0.<init>(r1)
            return r0
        L13a:
            r0 = move-exception
            r1 = r0
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r2 = "Error retrieving app package info."
            r0.e(r2, r1)
            r0 = 0
            return r0
    }

    private static /* synthetic */ void lambda$init$0(java.lang.Exception r2) {
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r1 = "Error fetching settings."
            r0.e(r1, r2)
            return
    }

    public void recordException(java.lang.Throwable r2) {
            r1 = this;
            if (r2 != 0) goto Lc
            com.google.firebase.crashlytics.internal.Logger r2 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r0 = "A null value was passed to recordException. Ignoring."
            r2.w(r0)
            return
        Lc:
            com.google.firebase.crashlytics.internal.common.CrashlyticsCore r0 = r1.core
            r0.logException(r2)
            return
    }

    public void setCustomKey(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.google.firebase.crashlytics.internal.common.CrashlyticsCore r0 = r1.core
            r0.setCustomKey(r2, r3)
            return
    }

    public void setUserId(java.lang.String r2) {
            r1 = this;
            com.google.firebase.crashlytics.internal.common.CrashlyticsCore r0 = r1.core
            r0.setUserId(r2)
            return
    }
}
