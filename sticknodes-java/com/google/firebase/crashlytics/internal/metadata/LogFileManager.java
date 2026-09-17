package com.google.firebase.crashlytics.internal.metadata;

/* loaded from: classes2.dex */
public class LogFileManager {
    private static final com.google.firebase.crashlytics.internal.metadata.LogFileManager.NoopLogStore NOOP_LOG_STORE = null;
    private com.google.firebase.crashlytics.internal.metadata.FileLogStore currentLog;
    private final com.google.firebase.crashlytics.internal.persistence.FileStore fileStore;

    /* renamed from: com.google.firebase.crashlytics.internal.metadata.LogFileManager$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static final class NoopLogStore implements com.google.firebase.crashlytics.internal.metadata.FileLogStore {
        private NoopLogStore() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ NoopLogStore(com.google.firebase.crashlytics.internal.metadata.LogFileManager.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public void closeLogFile() {
                r0 = this;
                return
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public void deleteLogFile() {
                r0 = this;
                return
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public byte[] getLogAsBytes() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public java.lang.String getLogAsString() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
        public void writeToLog(long r1, java.lang.String r3) {
                r0 = this;
                return
        }
    }

    static {
            com.google.firebase.crashlytics.internal.metadata.LogFileManager$NoopLogStore r0 = new com.google.firebase.crashlytics.internal.metadata.LogFileManager$NoopLogStore
            r1 = 0
            r0.<init>(r1)
            com.google.firebase.crashlytics.internal.metadata.LogFileManager.NOOP_LOG_STORE = r0
            return
    }

    public LogFileManager(com.google.firebase.crashlytics.internal.persistence.FileStore r1) {
            r0 = this;
            r0.<init>()
            r0.fileStore = r1
            com.google.firebase.crashlytics.internal.metadata.LogFileManager$NoopLogStore r1 = com.google.firebase.crashlytics.internal.metadata.LogFileManager.NOOP_LOG_STORE
            r0.currentLog = r1
            return
    }

    public LogFileManager(com.google.firebase.crashlytics.internal.persistence.FileStore r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1)
            r0.setCurrentSession(r2)
            return
    }

    private java.io.File getWorkingFileForSession(java.lang.String r3) {
            r2 = this;
            com.google.firebase.crashlytics.internal.persistence.FileStore r0 = r2.fileStore
            java.lang.String r1 = "userlog"
            java.io.File r3 = r0.getSessionFile(r3, r1)
            return r3
    }

    public void clearLog() {
            r1 = this;
            com.google.firebase.crashlytics.internal.metadata.FileLogStore r0 = r1.currentLog
            r0.deleteLogFile()
            return
    }

    public byte[] getBytesForLog() {
            r1 = this;
            com.google.firebase.crashlytics.internal.metadata.FileLogStore r0 = r1.currentLog
            byte[] r0 = r0.getLogAsBytes()
            return r0
    }

    public java.lang.String getLogString() {
            r1 = this;
            com.google.firebase.crashlytics.internal.metadata.FileLogStore r0 = r1.currentLog
            java.lang.String r0 = r0.getLogAsString()
            return r0
    }

    public final void setCurrentSession(java.lang.String r2) {
            r1 = this;
            com.google.firebase.crashlytics.internal.metadata.FileLogStore r0 = r1.currentLog
            r0.closeLogFile()
            com.google.firebase.crashlytics.internal.metadata.LogFileManager$NoopLogStore r0 = com.google.firebase.crashlytics.internal.metadata.LogFileManager.NOOP_LOG_STORE
            r1.currentLog = r0
            if (r2 != 0) goto Lc
            return
        Lc:
            java.io.File r2 = r1.getWorkingFileForSession(r2)
            r0 = 65536(0x10000, float:9.18355E-41)
            r1.setLogFile(r2, r0)
            return
    }

    void setLogFile(java.io.File r2, int r3) {
            r1 = this;
            com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore r0 = new com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore
            r0.<init>(r2, r3)
            r1.currentLog = r0
            return
    }

    public void writeToLog(long r2, java.lang.String r4) {
            r1 = this;
            com.google.firebase.crashlytics.internal.metadata.FileLogStore r0 = r1.currentLog
            r0.writeToLog(r2, r4)
            return
    }
}
