package com.google.firebase.crashlytics.internal.persistence;

/* loaded from: classes2.dex */
public class CrashlyticsReportPersistence {
    private static final java.io.FilenameFilter EVENT_FILE_FILTER = null;
    private static final int EVENT_NAME_LENGTH = 0;
    private static final java.util.Comparator<? super java.io.File> LATEST_SESSION_ID_FIRST_COMPARATOR = null;
    private static final com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform TRANSFORM = null;
    private static final java.nio.charset.Charset UTF_8 = null;
    private final java.util.concurrent.atomic.AtomicInteger eventCounter;
    private final com.google.firebase.crashlytics.internal.persistence.FileStore fileStore;
    private final com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber sessionsSubscriber;
    private final com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider;

    public static /* synthetic */ int $r8$lambda$BJjCaTKwZBDrL4FuuJih4J3qP6E(java.io.File r0, java.io.File r1) {
            int r0 = lambda$static$0(r0, r1)
            return r0
    }

    public static /* synthetic */ boolean $r8$lambda$JFU0vij0Pn952vNT34mb4Hr_UXo(java.io.File r0, java.lang.String r1) {
            boolean r0 = isNormalPriorityEventFile(r0, r1)
            return r0
    }

    /* renamed from: $r8$lambda$n3pLmsPsV-a9XZY5T7lAH7PN0HQ, reason: not valid java name */
    public static /* synthetic */ int m60$r8$lambda$n3pLmsPsVa9XZY5T7lAH7PN0HQ(java.io.File r0, java.io.File r1) {
            int r0 = oldestEventFileFirst(r0, r1)
            return r0
    }

    public static /* synthetic */ boolean $r8$lambda$s1SqRZ8scbBy8L2NtxXahLmTiCI(java.io.File r0, java.lang.String r1) {
            boolean r0 = lambda$static$1(r0, r1)
            return r0
    }

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.UTF_8 = r0
            r0 = 15
            com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.EVENT_NAME_LENGTH = r0
            com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform r0 = new com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform
            r0.<init>()
            com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.TRANSFORM = r0
            com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence$$ExternalSyntheticLambda2 r0 = com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence$$ExternalSyntheticLambda2.INSTANCE
            com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.LATEST_SESSION_ID_FIRST_COMPARATOR = r0
            com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence$$ExternalSyntheticLambda1 r0 = com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence$$ExternalSyntheticLambda1.INSTANCE
            com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.EVENT_FILE_FILTER = r0
            return
    }

    public CrashlyticsReportPersistence(com.google.firebase.crashlytics.internal.persistence.FileStore r3, com.google.firebase.crashlytics.internal.settings.SettingsProvider r4, com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber r5) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r2.eventCounter = r0
            r2.fileStore = r3
            r2.settingsProvider = r4
            r2.sessionsSubscriber = r5
            return
    }

    private java.util.SortedSet<java.lang.String> capAndGetOpenSessions(java.lang.String r6) {
            r5 = this;
            com.google.firebase.crashlytics.internal.persistence.FileStore r0 = r5.fileStore
            r0.cleanupPreviousFileSystems()
            java.util.SortedSet r0 = r5.getOpenSessionIds()
            if (r6 == 0) goto Le
            r0.remove(r6)
        Le:
            int r6 = r0.size()
            r1 = 8
            if (r6 > r1) goto L17
            return r0
        L17:
            int r6 = r0.size()
            if (r6 <= r1) goto L44
            java.lang.Object r6 = r0.last()
            java.lang.String r6 = (java.lang.String) r6
            com.google.firebase.crashlytics.internal.Logger r2 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Removing session over cap: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r2.d(r3)
            com.google.firebase.crashlytics.internal.persistence.FileStore r2 = r5.fileStore
            r2.deleteSessionFiles(r6)
            r0.remove(r6)
            goto L17
        L44:
            return r0
    }

    private static int capFilesCount(java.util.List<java.io.File> r2, int r3) {
            int r0 = r2.size()
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r2.next()
            java.io.File r1 = (java.io.File) r1
            if (r0 > r3) goto L17
            return r0
        L17:
            com.google.firebase.crashlytics.internal.persistence.FileStore.recursiveDelete(r1)
            int r0 = r0 + (-1)
            goto L8
        L1d:
            return r0
    }

    private void capFinalizedReports() {
            r3 = this;
            com.google.firebase.crashlytics.internal.settings.SettingsProvider r0 = r3.settingsProvider
            com.google.firebase.crashlytics.internal.settings.Settings r0 = r0.getSettingsSync()
            com.google.firebase.crashlytics.internal.settings.Settings$SessionData r0 = r0.sessionData
            int r0 = r0.maxCompleteSessionsCount
            java.util.List r1 = r3.getAllFinalizedReportFiles()
            int r2 = r1.size()
            if (r2 > r0) goto L15
            return
        L15:
            java.util.List r0 = r1.subList(r0, r2)
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            java.io.File r1 = (java.io.File) r1
            r1.delete()
            goto L1d
        L2d:
            return
    }

    private static long convertTimestampFromSecondsToMs(long r2) {
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            return r2
    }

    private void deleteFiles(java.util.List<java.io.File> r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r2.next()
            java.io.File r0 = (java.io.File) r0
            r0.delete()
            goto L4
        L14:
            return
    }

    private static java.lang.String generateEventFilename(int r3, boolean r4) {
            java.util.Locale r0 = java.util.Locale.US
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2 = 0
            r1[r2] = r3
            java.lang.String r3 = "%010d"
            java.lang.String r3 = java.lang.String.format(r0, r3, r1)
            if (r4 == 0) goto L17
            java.lang.String r4 = "_"
            goto L19
        L17:
            java.lang.String r4 = ""
        L19:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "event"
            r0.append(r1)
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private java.util.List<java.io.File> getAllFinalizedReportFiles() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.firebase.crashlytics.internal.persistence.FileStore r1 = r3.fileStore
            java.util.List r1 = r1.getPriorityReports()
            r0.addAll(r1)
            com.google.firebase.crashlytics.internal.persistence.FileStore r1 = r3.fileStore
            java.util.List r1 = r1.getNativeReports()
            r0.addAll(r1)
            java.util.Comparator<? super java.io.File> r1 = com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.LATEST_SESSION_ID_FIRST_COMPARATOR
            java.util.Collections.sort(r0, r1)
            com.google.firebase.crashlytics.internal.persistence.FileStore r2 = r3.fileStore
            java.util.List r2 = r2.getReports()
            java.util.Collections.sort(r2, r1)
            r0.addAll(r2)
            return r0
    }

    private static java.lang.String getEventNameWithoutPriority(java.lang.String r2) {
            int r0 = com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.EVENT_NAME_LENGTH
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
            return r2
    }

    private static boolean isHighPriorityEventFile(java.lang.String r1) {
            java.lang.String r0 = "event"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L12
            java.lang.String r0 = "_"
            boolean r1 = r1.endsWith(r0)
            if (r1 == 0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    private static boolean isNormalPriorityEventFile(java.io.File r0, java.lang.String r1) {
            java.lang.String r0 = "event"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L12
            java.lang.String r0 = "_"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    private static /* synthetic */ int lambda$static$0(java.io.File r0, java.io.File r1) {
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = r0.getName()
            int r0 = r1.compareTo(r0)
            return r0
    }

    private static /* synthetic */ boolean lambda$static$1(java.io.File r0, java.lang.String r1) {
            java.lang.String r0 = "event"
            boolean r0 = r1.startsWith(r0)
            return r0
    }

    private static int oldestEventFileFirst(java.io.File r0, java.io.File r1) {
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = getEventNameWithoutPriority(r0)
            java.lang.String r1 = r1.getName()
            java.lang.String r1 = getEventNameWithoutPriority(r1)
            int r0 = r0.compareTo(r1)
            return r0
    }

    private static java.lang.String readTextFile(java.io.File r4) throws java.io.IOException {
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r4)
        Le:
            int r4 = r2.read(r0)     // Catch: java.lang.Throwable -> L28
            if (r4 <= 0) goto L19
            r3 = 0
            r1.write(r0, r3, r4)     // Catch: java.lang.Throwable -> L28
            goto Le
        L19:
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L28
            byte[] r0 = r1.toByteArray()     // Catch: java.lang.Throwable -> L28
            java.nio.charset.Charset r1 = com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.UTF_8     // Catch: java.lang.Throwable -> L28
            r4.<init>(r0, r1)     // Catch: java.lang.Throwable -> L28
            r2.close()
            return r4
        L28:
            r4 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L2d
            goto L31
        L2d:
            r0 = move-exception
            r4.addSuppressed(r0)
        L31:
            throw r4
    }

    private void synthesizeNativeReportFile(java.io.File r4, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload r5, java.lang.String r6, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo r7) {
            r3 = this;
            com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber r0 = r3.sessionsSubscriber
            java.lang.String r0 = r0.getAppQualitySessionId(r6)
            com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform r1 = com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.TRANSFORM     // Catch: java.io.IOException -> L2a
            java.lang.String r2 = readTextFile(r4)     // Catch: java.io.IOException -> L2a
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r2 = r1.reportFromJson(r2)     // Catch: java.io.IOException -> L2a
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r5 = r2.withNdkPayload(r5)     // Catch: java.io.IOException -> L2a
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r5 = r5.withApplicationExitInfo(r7)     // Catch: java.io.IOException -> L2a
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r5 = r5.withAppQualitySessionId(r0)     // Catch: java.io.IOException -> L2a
            com.google.firebase.crashlytics.internal.persistence.FileStore r7 = r3.fileStore     // Catch: java.io.IOException -> L2a
            java.io.File r6 = r7.getNativeReport(r6)     // Catch: java.io.IOException -> L2a
            java.lang.String r5 = r1.reportToJson(r5)     // Catch: java.io.IOException -> L2a
            writeTextFile(r6, r5)     // Catch: java.io.IOException -> L2a
            goto L43
        L2a:
            r5 = move-exception
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Could not synthesize final native report file for "
            r7.append(r0)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r6.w(r4, r5)
        L43:
            return
    }

    private void synthesizeReport(java.lang.String r10, long r11) {
            r9 = this;
            com.google.firebase.crashlytics.internal.persistence.FileStore r0 = r9.fileStore
            java.io.FilenameFilter r1 = com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.EVENT_FILE_FILTER
            java.util.List r0 = r0.getSessionFiles(r10, r1)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2c
            com.google.firebase.crashlytics.internal.Logger r11 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Session "
            r12.append(r0)
            r12.append(r10)
            java.lang.String r10 = " has no events."
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.v(r10)
            return
        L2c:
            java.util.Collections.sort(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L39:
            r5 = 0
        L3a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L7c
            java.lang.Object r3 = r0.next()
            java.io.File r3 = (java.io.File) r3
            com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform r4 = com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.TRANSFORM     // Catch: java.io.IOException -> L62
            java.lang.String r6 = readTextFile(r3)     // Catch: java.io.IOException -> L62
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event r4 = r4.eventFromJson(r6)     // Catch: java.io.IOException -> L62
            r2.add(r4)     // Catch: java.io.IOException -> L62
            if (r5 != 0) goto L5f
            java.lang.String r4 = r3.getName()     // Catch: java.io.IOException -> L62
            boolean r3 = isHighPriorityEventFile(r4)     // Catch: java.io.IOException -> L62
            if (r3 == 0) goto L39
        L5f:
            r3 = 1
            r5 = 1
            goto L3a
        L62:
            r4 = move-exception
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Could not add event to report for "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            r6.w(r3, r4)
            goto L3a
        L7c:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9b
            com.google.firebase.crashlytics.internal.Logger r11 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Could not parse event files for session "
            r12.append(r0)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.w(r10)
            return
        L9b:
            com.google.firebase.crashlytics.internal.persistence.FileStore r0 = r9.fileStore
            java.lang.String r6 = com.google.firebase.crashlytics.internal.metadata.UserMetadata.readUserId(r10, r0)
            com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber r0 = r9.sessionsSubscriber
            java.lang.String r7 = r0.getAppQualitySessionId(r10)
            com.google.firebase.crashlytics.internal.persistence.FileStore r0 = r9.fileStore
            java.lang.String r1 = "report"
            java.io.File r1 = r0.getSessionFile(r10, r1)
            r0 = r9
            r3 = r11
            r0.synthesizeReportFile(r1, r2, r3, r5, r6, r7)
            return
    }

    private void synthesizeReportFile(java.io.File r3, java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event> r4, long r5, boolean r7, java.lang.String r8, java.lang.String r9) {
            r2 = this;
            com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform r0 = com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.TRANSFORM     // Catch: java.io.IOException -> L54
            java.lang.String r1 = readTextFile(r3)     // Catch: java.io.IOException -> L54
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r1 = r0.reportFromJson(r1)     // Catch: java.io.IOException -> L54
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r5 = r1.withSessionEndFields(r5, r7, r8)     // Catch: java.io.IOException -> L54
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r5 = r5.withAppQualitySessionId(r9)     // Catch: java.io.IOException -> L54
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r4 = r5.withEvents(r4)     // Catch: java.io.IOException -> L54
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r5 = r4.getSession()     // Catch: java.io.IOException -> L54
            if (r5 != 0) goto L1d
            return
        L1d:
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.io.IOException -> L54
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L54
            r8.<init>()     // Catch: java.io.IOException -> L54
            java.lang.String r1 = "appQualitySessionId: "
            r8.append(r1)     // Catch: java.io.IOException -> L54
            r8.append(r9)     // Catch: java.io.IOException -> L54
            java.lang.String r8 = r8.toString()     // Catch: java.io.IOException -> L54
            r6.d(r8)     // Catch: java.io.IOException -> L54
            if (r7 == 0) goto L42
            com.google.firebase.crashlytics.internal.persistence.FileStore r6 = r2.fileStore     // Catch: java.io.IOException -> L54
            java.lang.String r5 = r5.getIdentifier()     // Catch: java.io.IOException -> L54
            java.io.File r5 = r6.getPriorityReport(r5)     // Catch: java.io.IOException -> L54
            goto L4c
        L42:
            com.google.firebase.crashlytics.internal.persistence.FileStore r6 = r2.fileStore     // Catch: java.io.IOException -> L54
            java.lang.String r5 = r5.getIdentifier()     // Catch: java.io.IOException -> L54
            java.io.File r5 = r6.getReport(r5)     // Catch: java.io.IOException -> L54
        L4c:
            java.lang.String r4 = r0.reportToJson(r4)     // Catch: java.io.IOException -> L54
            writeTextFile(r5, r4)     // Catch: java.io.IOException -> L54
            goto L6d
        L54:
            r4 = move-exception
            com.google.firebase.crashlytics.internal.Logger r5 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Could not synthesize final report file for "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r5.w(r3, r4)
        L6d:
            return
    }

    private int trimEvents(java.lang.String r3, int r4) {
            r2 = this;
            com.google.firebase.crashlytics.internal.persistence.FileStore r0 = r2.fileStore
            com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence$$ExternalSyntheticLambda0 r1 = com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence$$ExternalSyntheticLambda0.INSTANCE
            java.util.List r3 = r0.getSessionFiles(r3, r1)
            com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence$$ExternalSyntheticLambda3 r0 = com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence$$ExternalSyntheticLambda3.INSTANCE
            java.util.Collections.sort(r3, r0)
            int r3 = capFilesCount(r3, r4)
            return r3
    }

    private static void writeTextFile(java.io.File r2, java.lang.String r3) throws java.io.IOException {
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r2)
            java.nio.charset.Charset r2 = com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.UTF_8
            r0.<init>(r1, r2)
            r0.write(r3)     // Catch: java.lang.Throwable -> L13
            r0.close()
            return
        L13:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L18
            goto L1c
        L18:
            r3 = move-exception
            r2.addSuppressed(r3)
        L1c:
            throw r2
    }

    private static void writeTextFile(java.io.File r3, java.lang.String r4, long r5) throws java.io.IOException {
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r3)
            java.nio.charset.Charset r2 = com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.UTF_8
            r0.<init>(r1, r2)
            r0.write(r4)     // Catch: java.lang.Throwable -> L1a
            long r4 = convertTimestampFromSecondsToMs(r5)     // Catch: java.lang.Throwable -> L1a
            r3.setLastModified(r4)     // Catch: java.lang.Throwable -> L1a
            r0.close()
            return
        L1a:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L1f
            goto L23
        L1f:
            r4 = move-exception
            r3.addSuppressed(r4)
        L23:
            throw r3
    }

    public void deleteAllReports() {
            r1 = this;
            com.google.firebase.crashlytics.internal.persistence.FileStore r0 = r1.fileStore
            java.util.List r0 = r0.getReports()
            r1.deleteFiles(r0)
            com.google.firebase.crashlytics.internal.persistence.FileStore r0 = r1.fileStore
            java.util.List r0 = r0.getPriorityReports()
            r1.deleteFiles(r0)
            com.google.firebase.crashlytics.internal.persistence.FileStore r0 = r1.fileStore
            java.util.List r0 = r0.getNativeReports()
            r1.deleteFiles(r0)
            return
    }

    public void finalizeReports(java.lang.String r5, long r6) {
            r4 = this;
            java.util.SortedSet r5 = r4.capAndGetOpenSessions(r5)
            java.util.Iterator r5 = r5.iterator()
        L8:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Finalizing report for session "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.v(r2)
            r4.synthesizeReport(r0, r6)
            com.google.firebase.crashlytics.internal.persistence.FileStore r1 = r4.fileStore
            r1.deleteSessionFiles(r0)
            goto L8
        L35:
            r4.capFinalizedReports()
            return
    }

    public void finalizeSessionWithNativeEvent(java.lang.String r5, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload r6, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo r7) {
            r4 = this;
            com.google.firebase.crashlytics.internal.persistence.FileStore r0 = r4.fileStore
            java.lang.String r1 = "report"
            java.io.File r0 = r0.getSessionFile(r5, r1)
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Writing native session report for "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = " to file: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.d(r2)
            r4.synthesizeNativeReportFile(r0, r6, r5, r7)
            return
    }

    public java.util.SortedSet<java.lang.String> getOpenSessionIds() {
            r2 = this;
            java.util.TreeSet r0 = new java.util.TreeSet
            com.google.firebase.crashlytics.internal.persistence.FileStore r1 = r2.fileStore
            java.util.List r1 = r1.getAllOpenSessionIds()
            r0.<init>(r1)
            java.util.NavigableSet r0 = r0.descendingSet()
            return r0
    }

    public long getStartTimestampMillis(java.lang.String r3) {
            r2 = this;
            com.google.firebase.crashlytics.internal.persistence.FileStore r0 = r2.fileStore
            java.lang.String r1 = "start-time"
            java.io.File r3 = r0.getSessionFile(r3, r1)
            long r0 = r3.lastModified()
            return r0
    }

    public boolean hasFinalizedReports() {
            r1 = this;
            com.google.firebase.crashlytics.internal.persistence.FileStore r0 = r1.fileStore
            java.util.List r0 = r0.getReports()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L27
            com.google.firebase.crashlytics.internal.persistence.FileStore r0 = r1.fileStore
            java.util.List r0 = r0.getPriorityReports()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L27
            com.google.firebase.crashlytics.internal.persistence.FileStore r0 = r1.fileStore
            java.util.List r0 = r0.getNativeReports()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L25
            goto L27
        L25:
            r0 = 0
            goto L28
        L27:
            r0 = 1
        L28:
            return r0
    }

    public java.util.List<com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId> loadFinalizedReports() {
            r7 = this;
            java.util.List r0 = r7.getAllFinalizedReportFiles()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L51
            java.lang.Object r2 = r0.next()
            java.io.File r2 = (java.io.File) r2
            com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform r3 = com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.TRANSFORM     // Catch: java.io.IOException -> L2f
            java.lang.String r4 = readTextFile(r2)     // Catch: java.io.IOException -> L2f
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r3 = r3.reportFromJson(r4)     // Catch: java.io.IOException -> L2f
            java.lang.String r4 = r2.getName()     // Catch: java.io.IOException -> L2f
            com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId r3 = com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId.create(r3, r4, r2)     // Catch: java.io.IOException -> L2f
            r1.add(r3)     // Catch: java.io.IOException -> L2f
            goto Ld
        L2f:
            r3 = move-exception
            com.google.firebase.crashlytics.internal.Logger r4 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Could not load report file "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = "; deleting"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.w(r5, r3)
            r2.delete()
            goto Ld
        L51:
            return r1
    }

    public void persistEvent(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event r4, java.lang.String r5, boolean r6) {
            r3 = this;
            com.google.firebase.crashlytics.internal.settings.SettingsProvider r0 = r3.settingsProvider
            com.google.firebase.crashlytics.internal.settings.Settings r0 = r0.getSettingsSync()
            com.google.firebase.crashlytics.internal.settings.Settings$SessionData r0 = r0.sessionData
            int r0 = r0.maxCustomExceptionEvents
            com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform r1 = com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.TRANSFORM
            java.lang.String r4 = r1.eventToJson(r4)
            java.util.concurrent.atomic.AtomicInteger r1 = r3.eventCounter
            int r1 = r1.getAndIncrement()
            java.lang.String r6 = generateEventFilename(r1, r6)
            com.google.firebase.crashlytics.internal.persistence.FileStore r1 = r3.fileStore     // Catch: java.io.IOException -> L24
            java.io.File r6 = r1.getSessionFile(r5, r6)     // Catch: java.io.IOException -> L24
            writeTextFile(r6, r4)     // Catch: java.io.IOException -> L24
            goto L3d
        L24:
            r4 = move-exception
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not persist event for session "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r6.w(r1, r4)
        L3d:
            r3.trimEvents(r5, r0)
            return
    }

    public void persistReport(com.google.firebase.crashlytics.internal.model.CrashlyticsReport r6) {
            r5 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r0 = r6.getSession()
            if (r0 != 0) goto L10
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r0 = "Could not get session for report"
            r6.d(r0)
            return
        L10:
            java.lang.String r1 = r0.getIdentifier()
            com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform r2 = com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.TRANSFORM     // Catch: java.io.IOException -> L37
            java.lang.String r6 = r2.reportToJson(r6)     // Catch: java.io.IOException -> L37
            com.google.firebase.crashlytics.internal.persistence.FileStore r2 = r5.fileStore     // Catch: java.io.IOException -> L37
            java.lang.String r3 = "report"
            java.io.File r2 = r2.getSessionFile(r1, r3)     // Catch: java.io.IOException -> L37
            writeTextFile(r2, r6)     // Catch: java.io.IOException -> L37
            com.google.firebase.crashlytics.internal.persistence.FileStore r6 = r5.fileStore     // Catch: java.io.IOException -> L37
            java.lang.String r2 = "start-time"
            java.io.File r6 = r6.getSessionFile(r1, r2)     // Catch: java.io.IOException -> L37
            java.lang.String r2 = ""
            long r3 = r0.getStartedAt()     // Catch: java.io.IOException -> L37
            writeTextFile(r6, r2, r3)     // Catch: java.io.IOException -> L37
            goto L50
        L37:
            r6 = move-exception
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Could not persist report for session "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.d(r1, r6)
        L50:
            return
    }
}
