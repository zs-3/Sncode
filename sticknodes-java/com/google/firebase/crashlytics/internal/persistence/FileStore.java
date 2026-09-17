package com.google.firebase.crashlytics.internal.persistence;

/* loaded from: classes2.dex */
public class FileStore {
    private final java.io.File crashlyticsDir;
    private final java.io.File filesDir;
    private final java.io.File nativeReportsDir;
    private final java.io.File priorityReportsDir;
    final java.lang.String processName;
    private final java.io.File reportsDir;
    private final java.io.File sessionsDir;

    public static /* synthetic */ boolean $r8$lambda$3QmQpSTeM5pqCpaeBC8PpjfvTJA(java.lang.String r0, java.io.File r1, java.lang.String r2) {
            boolean r0 = lambda$cleanupFileSystemDirs$0(r0, r1, r2)
            return r0
    }

    public FileStore(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            com.google.firebase.crashlytics.internal.ProcessDetailsProvider r0 = com.google.firebase.crashlytics.internal.ProcessDetailsProvider.INSTANCE
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r0 = r0.getCurrentProcessDetails(r4)
            java.lang.String r0 = r0.getProcessName()
            r3.processName = r0
            java.io.File r4 = r4.getFilesDir()
            r3.filesDir = r4
            boolean r1 = r3.useV3FileSystem()
            if (r1 == 0) goto L36
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ".crashlytics.v3"
            r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            r1.append(r2)
            java.lang.String r0 = sanitizeName(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L38
        L36:
            java.lang.String r0 = ".com.google.firebase.crashlytics.files.v1"
        L38:
            java.io.File r1 = new java.io.File
            r1.<init>(r4, r0)
            java.io.File r4 = prepareBaseDir(r1)
            r3.crashlyticsDir = r4
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "open-sessions"
            r0.<init>(r4, r1)
            java.io.File r0 = prepareBaseDir(r0)
            r3.sessionsDir = r0
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "reports"
            r0.<init>(r4, r1)
            java.io.File r0 = prepareBaseDir(r0)
            r3.reportsDir = r0
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "priority-reports"
            r0.<init>(r4, r1)
            java.io.File r0 = prepareBaseDir(r0)
            r3.priorityReportsDir = r0
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "native-reports"
            r0.<init>(r4, r1)
            java.io.File r4 = prepareBaseDir(r0)
            r3.nativeReportsDir = r4
            return
    }

    private void cleanupFileSystemDir(java.lang.String r4) {
            r3 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r3.filesDir
            r0.<init>(r1, r4)
            boolean r4 = r0.exists()
            if (r4 == 0) goto L2f
            boolean r4 = recursiveDelete(r0)
            if (r4 == 0) goto L2f
            com.google.firebase.crashlytics.internal.Logger r4 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Deleted previous Crashlytics file system: "
            r1.append(r2)
            java.lang.String r0 = r0.getPath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.d(r0)
        L2f:
            return
    }

    private void cleanupFileSystemDirs(java.lang.String r4) {
            r3 = this;
            java.io.File r0 = r3.filesDir
            boolean r0 = r0.exists()
            if (r0 == 0) goto L21
            java.io.File r0 = r3.filesDir
            com.google.firebase.crashlytics.internal.persistence.FileStore$$ExternalSyntheticLambda0 r1 = new com.google.firebase.crashlytics.internal.persistence.FileStore$$ExternalSyntheticLambda0
            r1.<init>(r4)
            java.lang.String[] r4 = r0.list(r1)
            if (r4 == 0) goto L21
            int r0 = r4.length
            r1 = 0
        L17:
            if (r1 >= r0) goto L21
            r2 = r4[r1]
            r3.cleanupFileSystemDir(r2)
            int r1 = r1 + 1
            goto L17
        L21:
            return
    }

    private java.io.File getSessionDir(java.lang.String r3) {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r2.sessionsDir
            r0.<init>(r1, r3)
            java.io.File r3 = prepareDir(r0)
            return r3
    }

    private static /* synthetic */ boolean lambda$cleanupFileSystemDirs$0(java.lang.String r0, java.io.File r1, java.lang.String r2) {
            boolean r0 = r2.startsWith(r0)
            return r0
    }

    private static synchronized java.io.File prepareBaseDir(java.io.File r4) {
            java.lang.Class<com.google.firebase.crashlytics.internal.persistence.FileStore> r0 = com.google.firebase.crashlytics.internal.persistence.FileStore.class
            monitor-enter(r0)
            boolean r1 = r4.exists()     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L31
            boolean r1 = r4.isDirectory()     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L11
            monitor-exit(r0)
            return r4
        L11:
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L51
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
            r2.<init>()     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = "Unexpected non-directory file: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L51
            r2.append(r4)     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = "; deleting file and creating new directory."
            r2.append(r3)     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L51
            r1.d(r2)     // Catch: java.lang.Throwable -> L51
            r4.delete()     // Catch: java.lang.Throwable -> L51
        L31:
            boolean r1 = r4.mkdirs()     // Catch: java.lang.Throwable -> L51
            if (r1 != 0) goto L4f
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L51
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
            r2.<init>()     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = "Could not create Crashlytics-specific directory: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L51
            r2.append(r4)     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L51
            r1.e(r2)     // Catch: java.lang.Throwable -> L51
        L4f:
            monitor-exit(r0)
            return r4
        L51:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    private static java.io.File prepareDir(java.io.File r0) {
            r0.mkdirs()
            return r0
    }

    static boolean recursiveDelete(java.io.File r4) {
            java.io.File[] r0 = r4.listFiles()
            if (r0 == 0) goto L12
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            recursiveDelete(r3)
            int r2 = r2 + 1
            goto L8
        L12:
            boolean r4 = r4.delete()
            return r4
    }

    private static <T> java.util.List<T> safeArrayToList(T[] r0) {
            if (r0 != 0) goto L7
            java.util.List r0 = java.util.Collections.emptyList()
            goto Lb
        L7:
            java.util.List r0 = java.util.Arrays.asList(r0)
        Lb:
            return r0
    }

    static java.lang.String sanitizeName(java.lang.String r2) {
            int r0 = r2.length()
            r1 = 40
            if (r0 <= r1) goto Ld
            java.lang.String r2 = com.google.firebase.crashlytics.internal.common.CommonUtils.sha1(r2)
            return r2
        Ld:
            java.lang.String r0 = "[^a-zA-Z0-9.]"
            java.lang.String r1 = "_"
            java.lang.String r2 = r2.replaceAll(r0, r1)
            return r2
    }

    private boolean useV3FileSystem() {
            r1 = this;
            java.lang.String r0 = r1.processName
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    public void cleanupPreviousFileSystems() {
            r2 = this;
            java.lang.String r0 = ".com.google.firebase.crashlytics"
            r2.cleanupFileSystemDir(r0)
            java.lang.String r0 = ".com.google.firebase.crashlytics-ndk"
            r2.cleanupFileSystemDir(r0)
            boolean r0 = r2.useV3FileSystem()
            if (r0 == 0) goto L2b
            java.lang.String r0 = ".com.google.firebase.crashlytics.files.v1"
            r2.cleanupFileSystemDir(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ".com.google.firebase.crashlytics.files.v2"
            r0.append(r1)
            java.lang.String r1 = java.io.File.pathSeparator
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.cleanupFileSystemDirs(r0)
        L2b:
            return
    }

    public boolean deleteSessionFiles(java.lang.String r3) {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r2.sessionsDir
            r0.<init>(r1, r3)
            boolean r3 = recursiveDelete(r0)
            return r3
    }

    public java.util.List<java.lang.String> getAllOpenSessionIds() {
            r1 = this;
            java.io.File r0 = r1.sessionsDir
            java.lang.String[] r0 = r0.list()
            java.util.List r0 = safeArrayToList(r0)
            return r0
    }

    public java.io.File getCommonFile(java.lang.String r3) {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r2.crashlyticsDir
            r0.<init>(r1, r3)
            return r0
    }

    public java.util.List<java.io.File> getCommonFiles(java.io.FilenameFilter r2) {
            r1 = this;
            java.io.File r0 = r1.crashlyticsDir
            java.io.File[] r2 = r0.listFiles(r2)
            java.util.List r2 = safeArrayToList(r2)
            return r2
    }

    public java.io.File getNativeReport(java.lang.String r3) {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r2.nativeReportsDir
            r0.<init>(r1, r3)
            return r0
    }

    public java.util.List<java.io.File> getNativeReports() {
            r1 = this;
            java.io.File r0 = r1.nativeReportsDir
            java.io.File[] r0 = r0.listFiles()
            java.util.List r0 = safeArrayToList(r0)
            return r0
    }

    public java.io.File getNativeSessionDir(java.lang.String r3) {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.io.File r3 = r2.getSessionDir(r3)
            java.lang.String r1 = "native"
            r0.<init>(r3, r1)
            java.io.File r3 = prepareDir(r0)
            return r3
    }

    public java.io.File getPriorityReport(java.lang.String r3) {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r2.priorityReportsDir
            r0.<init>(r1, r3)
            return r0
    }

    public java.util.List<java.io.File> getPriorityReports() {
            r1 = this;
            java.io.File r0 = r1.priorityReportsDir
            java.io.File[] r0 = r0.listFiles()
            java.util.List r0 = safeArrayToList(r0)
            return r0
    }

    public java.io.File getReport(java.lang.String r3) {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r2.reportsDir
            r0.<init>(r1, r3)
            return r0
    }

    public java.util.List<java.io.File> getReports() {
            r1 = this;
            java.io.File r0 = r1.reportsDir
            java.io.File[] r0 = r0.listFiles()
            java.util.List r0 = safeArrayToList(r0)
            return r0
    }

    public java.io.File getSessionFile(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.io.File r0 = new java.io.File
            java.io.File r2 = r1.getSessionDir(r2)
            r0.<init>(r2, r3)
            return r0
    }

    public java.util.List<java.io.File> getSessionFiles(java.lang.String r1, java.io.FilenameFilter r2) {
            r0 = this;
            java.io.File r1 = r0.getSessionDir(r1)
            java.io.File[] r1 = r1.listFiles(r2)
            java.util.List r1 = safeArrayToList(r1)
            return r1
    }
}
