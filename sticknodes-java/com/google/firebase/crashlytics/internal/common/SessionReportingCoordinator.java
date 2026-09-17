package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
public class SessionReportingCoordinator {
    private final com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers crashlyticsWorkers;
    private final com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture dataCapture;
    private final com.google.firebase.crashlytics.internal.common.IdManager idManager;
    private final com.google.firebase.crashlytics.internal.metadata.LogFileManager logFileManager;
    private final com.google.firebase.crashlytics.internal.metadata.UserMetadata reportMetadata;
    private final com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence reportPersistence;
    private final com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender reportsSender;

    /* renamed from: $r8$lambda$E0EcUvGAcoqjPOmC0PORx8-bHg0, reason: not valid java name */
    public static /* synthetic */ boolean m53$r8$lambda$E0EcUvGAcoqjPOmC0PORx8bHg0(com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator r0, com.google.android.gms.tasks.Task r1) {
            boolean r0 = r0.onReportSendComplete(r1)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$aXBaJtIkEfO3X5co0Tqq4Dzvuog(com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator r0, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event r1, java.lang.String r2, boolean r3) {
            r0.lambda$persistEvent$0(r1, r2, r3)
            return
    }

    public static /* synthetic */ int $r8$lambda$sFirNqCEOiSXTEJvrIYjgF36GcU(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute r0, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute r1) {
            int r0 = lambda$getSortedCustomAttributes$1(r0, r1)
            return r0
    }

    SessionReportingCoordinator(com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture r1, com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence r2, com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender r3, com.google.firebase.crashlytics.internal.metadata.LogFileManager r4, com.google.firebase.crashlytics.internal.metadata.UserMetadata r5, com.google.firebase.crashlytics.internal.common.IdManager r6, com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r7) {
            r0 = this;
            r0.<init>()
            r0.dataCapture = r1
            r0.reportPersistence = r2
            r0.reportsSender = r3
            r0.logFileManager = r4
            r0.reportMetadata = r5
            r0.idManager = r6
            r0.crashlyticsWorkers = r7
            return
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event addLogsAndCustomKeysToEvent(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event r3, com.google.firebase.crashlytics.internal.metadata.LogFileManager r4, com.google.firebase.crashlytics.internal.metadata.UserMetadata r5) {
            r2 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Builder r0 = r3.toBuilder()
            java.lang.String r4 = r4.getLogString()
            if (r4 == 0) goto L1a
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log$Builder r1 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.builder()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log$Builder r4 = r1.setContent(r4)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log r4 = r4.build()
            r0.setLog(r4)
            goto L23
        L1a:
            com.google.firebase.crashlytics.internal.Logger r4 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r1 = "No log data to include with this event."
            r4.v(r1)
        L23:
            java.util.Map r4 = r5.getCustomKeys()
            java.util.List r4 = getSortedCustomAttributes(r4)
            java.util.Map r5 = r5.getInternalKeys()
            java.util.List r5 = getSortedCustomAttributes(r5)
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L3f
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L56
        L3f:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application r3 = r3.getApp()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Builder r3 = r3.toBuilder()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Builder r3 = r3.setCustomAttributes(r4)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Builder r3 = r3.setInternalKeys(r5)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application r3 = r3.build()
            r0.setApp(r3)
        L56:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event r3 = r0.build()
            return r3
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event addMetaDataToEvent(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event r3) {
            r2 = this;
            com.google.firebase.crashlytics.internal.metadata.LogFileManager r0 = r2.logFileManager
            com.google.firebase.crashlytics.internal.metadata.UserMetadata r1 = r2.reportMetadata
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event r3 = r2.addLogsAndCustomKeysToEvent(r3, r0, r1)
            com.google.firebase.crashlytics.internal.metadata.UserMetadata r0 = r2.reportMetadata
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event r3 = r2.addRolloutsStateToEvent(r3, r0)
            return r3
    }

    private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event addRolloutsStateToEvent(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event r2, com.google.firebase.crashlytics.internal.metadata.UserMetadata r3) {
            r1 = this;
            java.util.List r3 = r3.getRolloutsState()
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Lb
            return r2
        Lb:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Builder r2 = r2.toBuilder()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.builder()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState$Builder r3 = r0.setRolloutAssignments(r3)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState r3 = r3.build()
            r2.setRollouts(r3)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event r2 = r2.build()
            return r2
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo convertApplicationExitInfo(android.app.ApplicationExitInfo r5) {
            r0 = 0
            java.io.InputStream r1 = r5.getTraceInputStream()     // Catch: java.io.IOException -> Lc
            if (r1 == 0) goto L31
            java.lang.String r0 = convertInputStreamToString(r1)     // Catch: java.io.IOException -> Lc
            goto L31
        Lc:
            r1 = move-exception
            com.google.firebase.crashlytics.internal.Logger r2 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Could not get input trace in application exit info: "
            r3.append(r4)
            java.lang.String r4 = r5.toString()
            r3.append(r4)
            java.lang.String r4 = " Error: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.w(r1)
        L31:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder r1 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.builder()
            int r2 = r5.getImportance()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder r1 = r1.setImportance(r2)
            java.lang.String r2 = r5.getProcessName()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder r1 = r1.setProcessName(r2)
            int r2 = r5.getReason()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder r1 = r1.setReasonCode(r2)
            long r2 = r5.getTimestamp()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder r1 = r1.setTimestamp(r2)
            int r2 = r5.getPid()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder r1 = r1.setPid(r2)
            long r2 = r5.getPss()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder r1 = r1.setPss(r2)
            long r2 = r5.getRss()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder r5 = r1.setRss(r2)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder r5 = r5.setTraceFile(r0)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo r5 = r5.build()
            return r5
    }

    public static java.lang.String convertInputStreamToString(java.io.InputStream r4) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 8192(0x2000, float:1.14794E-41)
            byte[] r1 = new byte[r1]
        L9:
            int r2 = r4.read(r1)
            r3 = -1
            if (r2 == r3) goto L15
            r3 = 0
            r0.write(r1, r3, r2)
            goto L9
        L15:
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r4 = r4.name()
            java.lang.String r4 = r0.toString(r4)
            return r4
    }

    public static com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator create(android.content.Context r9, com.google.firebase.crashlytics.internal.common.IdManager r10, com.google.firebase.crashlytics.internal.persistence.FileStore r11, com.google.firebase.crashlytics.internal.common.AppData r12, com.google.firebase.crashlytics.internal.metadata.LogFileManager r13, com.google.firebase.crashlytics.internal.metadata.UserMetadata r14, com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy r15, com.google.firebase.crashlytics.internal.settings.SettingsProvider r16, com.google.firebase.crashlytics.internal.common.OnDemandCounter r17, com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber r18, com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r19) {
            r6 = r16
            com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture r7 = new com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r12
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence r2 = new com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence
            r0 = r11
            r1 = r18
            r2.<init>(r11, r6, r1)
            r0 = r9
            r1 = r17
            com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender r3 = com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender.create(r9, r6, r1)
            com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator r8 = new com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator
            r0 = r8
            r1 = r7
            r4 = r13
            r5 = r14
            r6 = r10
            r7 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    private com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId ensureHasFid(com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId r4) {
            r3 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r0 = r4.getReport()
            java.lang.String r0 = r0.getFirebaseInstallationId()
            if (r0 == 0) goto L16
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r0 = r4.getReport()
            java.lang.String r0 = r0.getFirebaseAuthenticationToken()
            if (r0 != 0) goto L15
            goto L16
        L15:
            return r4
        L16:
            com.google.firebase.crashlytics.internal.common.IdManager r0 = r3.idManager
            r1 = 1
            com.google.firebase.crashlytics.internal.common.FirebaseInstallationId r0 = r0.fetchTrueFid(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r1 = r4.getReport()
            java.lang.String r2 = r0.getFid()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r1 = r1.withFirebaseInstallationId(r2)
            java.lang.String r0 = r0.getAuthToken()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r0 = r1.withFirebaseAuthenticationToken(r0)
            java.lang.String r1 = r4.getSessionId()
            java.io.File r4 = r4.getReportFile()
            com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId r4 = com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId.create(r0, r1, r4)
            return r4
    }

    private android.app.ApplicationExitInfo findRelevantApplicationExitInfo(java.lang.String r7, java.util.List<android.app.ApplicationExitInfo> r8) {
            r6 = this;
            com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence r0 = r6.reportPersistence
            long r0 = r0.getStartTimestampMillis(r7)
            java.util.Iterator r7 = r8.iterator()
        La:
            boolean r8 = r7.hasNext()
            r2 = 0
            if (r8 == 0) goto L29
            java.lang.Object r8 = r7.next()
            android.app.ApplicationExitInfo r8 = (android.app.ApplicationExitInfo) r8
            long r3 = r8.getTimestamp()
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 >= 0) goto L20
            return r2
        L20:
            int r2 = r8.getReason()
            r3 = 6
            if (r2 == r3) goto L28
            goto La
        L28:
            return r8
        L29:
            return r2
    }

    private static java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> getSortedCustomAttributes(java.util.Map<java.lang.String, java.lang.String> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r4.size()
            r0.ensureCapacity(r1)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute$Builder r2 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.builder()
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute$Builder r2 = r2.setKey(r3)
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute$Builder r1 = r2.setValue(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute r1 = r1.build()
            r0.add(r1)
            goto L14
        L40:
            com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator$$ExternalSyntheticLambda2 r4 = com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator$$ExternalSyntheticLambda2.INSTANCE
            java.util.Collections.sort(r0, r4)
            java.util.List r4 = java.util.Collections.unmodifiableList(r0)
            return r4
    }

    private static /* synthetic */ int lambda$getSortedCustomAttributes$1(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute r0, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute r1) {
            java.lang.String r0 = r0.getKey()
            java.lang.String r1 = r1.getKey()
            int r0 = r0.compareTo(r1)
            return r0
    }

    private /* synthetic */ void lambda$persistEvent$0(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event r3, java.lang.String r4, boolean r5) {
            r2 = this;
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r1 = "disk worker: log non-fatal event to persistence"
            r0.d(r1)
            com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence r0 = r2.reportPersistence
            r0.persistEvent(r3, r4, r5)
            return
    }

    private boolean onReportSendComplete(com.google.android.gms.tasks.Task<com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId> r4) {
            r3 = this;
            boolean r0 = r4.isSuccessful()
            if (r0 == 0) goto L6d
            java.lang.Object r4 = r4.getResult()
            com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId r4 = (com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId) r4
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Crashlytics report successfully enqueued to DataTransport: "
            r1.append(r2)
            java.lang.String r2 = r4.getSessionId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.d(r1)
            java.io.File r4 = r4.getReportFile()
            boolean r0 = r4.delete()
            if (r0 == 0) goto L4f
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Deleted report file: "
            r1.append(r2)
            java.lang.String r4 = r4.getPath()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.d(r4)
            goto L6b
        L4f:
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Crashlytics could not delete report file: "
            r1.append(r2)
            java.lang.String r4 = r4.getPath()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.w(r4)
        L6b:
            r4 = 1
            return r4
        L6d:
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.Exception r4 = r4.getException()
            java.lang.String r1 = "Crashlytics report could not be enqueued to DataTransport"
            r0.w(r1, r4)
            r4 = 0
            return r4
    }

    private void persistEvent(java.lang.Throwable r13, java.lang.Thread r14, java.lang.String r15, java.lang.String r16, long r17, boolean r19) {
            r12 = this;
            r0 = r12
            r1 = r15
            java.lang.String r2 = "crash"
            r6 = r16
            boolean r2 = r6.equals(r2)
            com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture r3 = r0.dataCapture
            r9 = 4
            r10 = 8
            r4 = r13
            r5 = r14
            r7 = r17
            r11 = r19
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event r3 = r3.captureEventData(r4, r5, r6, r7, r9, r10, r11)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event r3 = r12.addMetaDataToEvent(r3)
            if (r19 != 0) goto L2c
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r4 = r0.crashlyticsWorkers
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker r4 = r4.diskWrite
            com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator$$ExternalSyntheticLambda1 r5 = new com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator$$ExternalSyntheticLambda1
            r5.<init>(r12, r3, r15, r2)
            r4.submit(r5)
            return
        L2c:
            com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence r4 = r0.reportPersistence
            r4.persistEvent(r3, r15, r2)
            return
    }

    public void finalizeSessionWithNativeEvent(java.lang.String r3, java.util.List<com.google.firebase.crashlytics.internal.common.NativeSessionFile> r4, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo r5) {
            r2 = this;
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r1 = "SessionReportingCoordinator#finalizeSessionWithNativeEvent"
            r0.d(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L12:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r4.next()
            com.google.firebase.crashlytics.internal.common.NativeSessionFile r1 = (com.google.firebase.crashlytics.internal.common.NativeSessionFile) r1
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File r1 = r1.asFilePayload()
            if (r1 == 0) goto L12
            r0.add(r1)
            goto L12
        L28:
            com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence r4 = r2.reportPersistence
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$Builder r1 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.builder()
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$Builder r0 = r1.setFiles(r0)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload r0 = r0.build()
            r4.finalizeSessionWithNativeEvent(r3, r0, r5)
            return
    }

    public void finalizeSessions(long r2, java.lang.String r4) {
            r1 = this;
            com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence r0 = r1.reportPersistence
            r0.finalizeReports(r4, r2)
            return
    }

    public boolean hasReportsToSend() {
            r1 = this;
            com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence r0 = r1.reportPersistence
            boolean r0 = r0.hasFinalizedReports()
            return r0
    }

    public java.util.SortedSet<java.lang.String> listSortedOpenSessionIds() {
            r1 = this;
            com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence r0 = r1.reportPersistence
            java.util.SortedSet r0 = r0.getOpenSessionIds()
            return r0
    }

    public void onBeginSession(java.lang.String r2, long r3) {
            r1 = this;
            com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture r0 = r1.dataCapture
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r2 = r0.captureReportData(r2, r3)
            com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence r3 = r1.reportPersistence
            r3.persistReport(r2)
            return
    }

    public void persistFatalEvent(java.lang.Throwable r11, java.lang.Thread r12, java.lang.String r13, long r14) {
            r10 = this;
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Persisting fatal event for session "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            r0.v(r1)
            java.lang.String r6 = "crash"
            r9 = 1
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r7 = r14
            r2.persistEvent(r3, r4, r5, r6, r7, r9)
            return
    }

    public void persistNonFatalEvent(java.lang.Throwable r11, java.lang.Thread r12, java.lang.String r13, long r14) {
            r10 = this;
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Persisting non-fatal event for session "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            r0.v(r1)
            java.lang.String r6 = "error"
            r9 = 0
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r7 = r14
            r2.persistEvent(r3, r4, r5, r6, r7, r9)
            return
    }

    public void persistRelevantAppExitInfoEvent(java.lang.String r4, java.util.List<android.app.ApplicationExitInfo> r5, com.google.firebase.crashlytics.internal.metadata.LogFileManager r6, com.google.firebase.crashlytics.internal.metadata.UserMetadata r7) {
            r3 = this;
            android.app.ApplicationExitInfo r5 = r3.findRelevantApplicationExitInfo(r4, r5)
            if (r5 != 0) goto L1f
            com.google.firebase.crashlytics.internal.Logger r5 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "No relevant ApplicationExitInfo occurred during session: "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.v(r4)
            return
        L1f:
            com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture r0 = r3.dataCapture
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo r5 = convertApplicationExitInfo(r5)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event r5 = r0.captureAnrEventData(r5)
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Persisting anr for session "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.d(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event r5 = r3.addLogsAndCustomKeysToEvent(r5, r6, r7)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event r5 = r3.addRolloutsStateToEvent(r5, r7)
            com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence r6 = r3.reportPersistence
            r7 = 1
            r6.persistEvent(r5, r4, r7)
            return
    }

    public void removeAllReports() {
            r1 = this;
            com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence r0 = r1.reportPersistence
            r0.deleteAllReports()
            return
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> sendReports(java.util.concurrent.Executor r2) {
            r1 = this;
            r0 = 0
            com.google.android.gms.tasks.Task r2 = r1.sendReports(r2, r0)
            return r2
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> sendReports(java.util.concurrent.Executor r6, java.lang.String r7) {
            r5 = this;
            com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence r0 = r5.reportPersistence
            java.util.List r0 = r0.loadFinalizedReports()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r0.next()
            com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId r2 = (com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId) r2
            if (r7 == 0) goto L27
            java.lang.String r3 = r2.getSessionId()
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto Lf
        L27:
            com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender r3 = r5.reportsSender
            com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId r2 = r5.ensureHasFid(r2)
            if (r7 == 0) goto L31
            r4 = 1
            goto L32
        L31:
            r4 = 0
        L32:
            com.google.android.gms.tasks.Task r2 = r3.enqueueReport(r2, r4)
            com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator$$ExternalSyntheticLambda0 r3 = new com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator$$ExternalSyntheticLambda0
            r3.<init>(r5)
            com.google.android.gms.tasks.Task r2 = r2.continueWith(r6, r3)
            r1.add(r2)
            goto Lf
        L43:
            com.google.android.gms.tasks.Task r6 = com.google.android.gms.tasks.Tasks.whenAll(r1)
            return r6
    }
}
