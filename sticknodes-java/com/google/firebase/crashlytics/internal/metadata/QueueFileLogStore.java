package com.google.firebase.crashlytics.internal.metadata;

/* loaded from: classes2.dex */
class QueueFileLogStore implements com.google.firebase.crashlytics.internal.metadata.FileLogStore {
    private static final java.nio.charset.Charset UTF_8 = null;
    private com.google.firebase.crashlytics.internal.metadata.QueueFile logFile;
    private final int maxLogSize;
    private final java.io.File workingFile;


    private static class LogBytes {
        public final byte[] bytes;
        public final int offset;

        LogBytes(byte[] r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.bytes = r1
                r0.offset = r2
                return
        }
    }

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore.UTF_8 = r0
            return
    }

    QueueFileLogStore(java.io.File r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.workingFile = r1
            r0.maxLogSize = r2
            return
    }

    private void doWriteToLog(long r5, java.lang.String r7) {
            r4 = this;
            java.lang.String r0 = " "
            com.google.firebase.crashlytics.internal.metadata.QueueFile r1 = r4.logFile
            if (r1 != 0) goto L7
            return
        L7:
            if (r7 != 0) goto Lb
            java.lang.String r7 = "null"
        Lb:
            int r1 = r4.maxLogSize     // Catch: java.io.IOException -> L73
            int r1 = r1 / 4
            int r2 = r7.length()     // Catch: java.io.IOException -> L73
            if (r2 <= r1) goto L2f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L73
            r2.<init>()     // Catch: java.io.IOException -> L73
            java.lang.String r3 = "..."
            r2.append(r3)     // Catch: java.io.IOException -> L73
            int r3 = r7.length()     // Catch: java.io.IOException -> L73
            int r3 = r3 - r1
            java.lang.String r7 = r7.substring(r3)     // Catch: java.io.IOException -> L73
            r2.append(r7)     // Catch: java.io.IOException -> L73
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L73
        L2f:
            java.lang.String r1 = "\r"
            java.lang.String r7 = r7.replaceAll(r1, r0)     // Catch: java.io.IOException -> L73
            java.lang.String r1 = "\n"
            java.lang.String r7 = r7.replaceAll(r1, r0)     // Catch: java.io.IOException -> L73
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.io.IOException -> L73
            java.lang.String r1 = "%d %s%n"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.io.IOException -> L73
            r3 = 0
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.io.IOException -> L73
            r2[r3] = r5     // Catch: java.io.IOException -> L73
            r5 = 1
            r2[r5] = r7     // Catch: java.io.IOException -> L73
            java.lang.String r5 = java.lang.String.format(r0, r1, r2)     // Catch: java.io.IOException -> L73
            java.nio.charset.Charset r6 = com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore.UTF_8     // Catch: java.io.IOException -> L73
            byte[] r5 = r5.getBytes(r6)     // Catch: java.io.IOException -> L73
            com.google.firebase.crashlytics.internal.metadata.QueueFile r6 = r4.logFile     // Catch: java.io.IOException -> L73
            r6.add(r5)     // Catch: java.io.IOException -> L73
        L5b:
            com.google.firebase.crashlytics.internal.metadata.QueueFile r5 = r4.logFile     // Catch: java.io.IOException -> L73
            boolean r5 = r5.isEmpty()     // Catch: java.io.IOException -> L73
            if (r5 != 0) goto L7d
            com.google.firebase.crashlytics.internal.metadata.QueueFile r5 = r4.logFile     // Catch: java.io.IOException -> L73
            int r5 = r5.usedBytes()     // Catch: java.io.IOException -> L73
            int r6 = r4.maxLogSize     // Catch: java.io.IOException -> L73
            if (r5 <= r6) goto L7d
            com.google.firebase.crashlytics.internal.metadata.QueueFile r5 = r4.logFile     // Catch: java.io.IOException -> L73
            r5.remove()     // Catch: java.io.IOException -> L73
            goto L5b
        L73:
            r5 = move-exception
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r7 = "There was a problem writing to the Crashlytics log."
            r6.e(r7, r5)
        L7d:
            return
    }

    private com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore.LogBytes getLogBytes() {
            r6 = this;
            java.io.File r0 = r6.workingFile
            boolean r0 = r0.exists()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            r6.openLogFile()
            com.google.firebase.crashlytics.internal.metadata.QueueFile r0 = r6.logFile
            if (r0 != 0) goto L12
            return r1
        L12:
            r1 = 1
            int[] r1 = new int[r1]
            r2 = 0
            r1[r2] = r2
            int r0 = r0.usedBytes()
            byte[] r0 = new byte[r0]
            com.google.firebase.crashlytics.internal.metadata.QueueFile r3 = r6.logFile     // Catch: java.io.IOException -> L29
            com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore$1 r4 = new com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore$1     // Catch: java.io.IOException -> L29
            r4.<init>(r6, r0, r1)     // Catch: java.io.IOException -> L29
            r3.forEach(r4)     // Catch: java.io.IOException -> L29
            goto L33
        L29:
            r3 = move-exception
            com.google.firebase.crashlytics.internal.Logger r4 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r5 = "A problem occurred while reading the Crashlytics log file."
            r4.e(r5, r3)
        L33:
            com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore$LogBytes r3 = new com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore$LogBytes
            r1 = r1[r2]
            r3.<init>(r0, r1)
            return r3
    }

    private void openLogFile() {
            r4 = this;
            com.google.firebase.crashlytics.internal.metadata.QueueFile r0 = r4.logFile
            if (r0 != 0) goto L29
            com.google.firebase.crashlytics.internal.metadata.QueueFile r0 = new com.google.firebase.crashlytics.internal.metadata.QueueFile     // Catch: java.io.IOException -> Le
            java.io.File r1 = r4.workingFile     // Catch: java.io.IOException -> Le
            r0.<init>(r1)     // Catch: java.io.IOException -> Le
            r4.logFile = r0     // Catch: java.io.IOException -> Le
            goto L29
        Le:
            r0 = move-exception
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Could not open log file: "
            r2.append(r3)
            java.io.File r3 = r4.workingFile
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.e(r2, r0)
        L29:
            return
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public void closeLogFile() {
            r2 = this;
            com.google.firebase.crashlytics.internal.metadata.QueueFile r0 = r2.logFile
            java.lang.String r1 = "There was a problem closing the Crashlytics log file."
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r0, r1)
            r0 = 0
            r2.logFile = r0
            return
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public void deleteLogFile() {
            r1 = this;
            r1.closeLogFile()
            java.io.File r0 = r1.workingFile
            r0.delete()
            return
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public byte[] getLogAsBytes() {
            r4 = this;
            com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore$LogBytes r0 = r4.getLogBytes()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r1 = r0.offset
            byte[] r2 = new byte[r1]
            byte[] r0 = r0.bytes
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r2, r3, r1)
            return r2
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public java.lang.String getLogAsString() {
            r3 = this;
            byte[] r0 = r3.getLogAsBytes()
            if (r0 == 0) goto Le
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore.UTF_8
            r1.<init>(r0, r2)
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public void writeToLog(long r1, java.lang.String r3) {
            r0 = this;
            r0.openLogFile()
            r0.doWriteToLog(r1, r3)
            return
    }
}
