package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
class CrashlyticsAppQualitySessionsStore {
    private static final java.io.FilenameFilter AQS_SESSION_ID_FILE_FILTER = null;
    private static final java.util.Comparator<java.io.File> FILE_RECENCY_COMPARATOR = null;
    private java.lang.String appQualitySessionId;
    private final com.google.firebase.crashlytics.internal.persistence.FileStore fileStore;
    private java.lang.String sessionId;

    public static /* synthetic */ boolean $r8$lambda$pQZW6rkK1gfvx4eSTc1P4X0m9Lo(java.io.File r0, java.lang.String r1) {
            boolean r0 = lambda$static$0(r0, r1)
            return r0
    }

    public static /* synthetic */ int $r8$lambda$tZZcZVgbHH_NcFRknrZR9fFuW50(java.io.File r0, java.io.File r1) {
            int r0 = lambda$static$1(r0, r1)
            return r0
    }

    static {
            com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsStore$$ExternalSyntheticLambda0 r0 = com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsStore$$ExternalSyntheticLambda0.INSTANCE
            com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsStore.AQS_SESSION_ID_FILE_FILTER = r0
            com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsStore$$ExternalSyntheticLambda1 r0 = com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsStore$$ExternalSyntheticLambda1.INSTANCE
            com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsStore.FILE_RECENCY_COMPARATOR = r0
            return
    }

    CrashlyticsAppQualitySessionsStore(com.google.firebase.crashlytics.internal.persistence.FileStore r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.sessionId = r0
            r1.appQualitySessionId = r0
            r1.fileStore = r2
            return
    }

    private static /* synthetic */ boolean lambda$static$0(java.io.File r0, java.lang.String r1) {
            java.lang.String r0 = "aqs."
            boolean r0 = r1.startsWith(r0)
            return r0
    }

    private static /* synthetic */ int lambda$static$1(java.io.File r2, java.io.File r3) {
            long r0 = r3.lastModified()
            long r2 = r2.lastModified()
            int r2 = java.lang.Long.compare(r0, r2)
            return r2
    }

    private static void persist(com.google.firebase.crashlytics.internal.persistence.FileStore r2, java.lang.String r3, java.lang.String r4) {
            if (r3 == 0) goto L27
            if (r4 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1d
            r0.<init>()     // Catch: java.io.IOException -> L1d
            java.lang.String r1 = "aqs."
            r0.append(r1)     // Catch: java.io.IOException -> L1d
            r0.append(r4)     // Catch: java.io.IOException -> L1d
            java.lang.String r4 = r0.toString()     // Catch: java.io.IOException -> L1d
            java.io.File r2 = r2.getSessionFile(r3, r4)     // Catch: java.io.IOException -> L1d
            r2.createNewFile()     // Catch: java.io.IOException -> L1d
            goto L27
        L1d:
            r2 = move-exception
            com.google.firebase.crashlytics.internal.Logger r3 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r4 = "Failed to persist App Quality Sessions session id."
            r3.w(r4, r2)
        L27:
            return
    }

    static java.lang.String readAqsSessionIdFile(com.google.firebase.crashlytics.internal.persistence.FileStore r1, java.lang.String r2) {
            java.io.FilenameFilter r0 = com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsStore.AQS_SESSION_ID_FILE_FILTER
            java.util.List r1 = r1.getSessionFiles(r2, r0)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L17
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r2 = "Unable to read App Quality Sessions session id."
            r1.w(r2)
            r1 = 0
            return r1
        L17:
            java.util.Comparator<java.io.File> r2 = com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsStore.FILE_RECENCY_COMPARATOR
            java.lang.Object r1 = java.util.Collections.min(r1, r2)
            java.io.File r1 = (java.io.File) r1
            java.lang.String r1 = r1.getName()
            r2 = 4
            java.lang.String r1 = r1.substring(r2)
            return r1
    }

    public synchronized java.lang.String getAppQualitySessionId(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = r1.sessionId     // Catch: java.lang.Throwable -> L15
            boolean r0 = java.util.Objects.equals(r0, r2)     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto Ld
            java.lang.String r2 = r1.appQualitySessionId     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)
            return r2
        Ld:
            com.google.firebase.crashlytics.internal.persistence.FileStore r0 = r1.fileStore     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = readAqsSessionIdFile(r0, r2)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)
            return r2
        L15:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized void rotateAppQualitySessionId(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.appQualitySessionId     // Catch: java.lang.Throwable -> L14
            boolean r0 = java.util.Objects.equals(r0, r3)     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L12
            com.google.firebase.crashlytics.internal.persistence.FileStore r0 = r2.fileStore     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = r2.sessionId     // Catch: java.lang.Throwable -> L14
            persist(r0, r1, r3)     // Catch: java.lang.Throwable -> L14
            r2.appQualitySessionId = r3     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r2)
            return
        L14:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public synchronized void rotateSessionId(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.sessionId     // Catch: java.lang.Throwable -> L14
            boolean r0 = java.util.Objects.equals(r0, r3)     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L12
            com.google.firebase.crashlytics.internal.persistence.FileStore r0 = r2.fileStore     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = r2.appQualitySessionId     // Catch: java.lang.Throwable -> L14
            persist(r0, r3, r1)     // Catch: java.lang.Throwable -> L14
            r2.sessionId = r3     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r2)
            return
        L14:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
