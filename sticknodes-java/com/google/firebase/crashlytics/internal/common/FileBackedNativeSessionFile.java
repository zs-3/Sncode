package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
class FileBackedNativeSessionFile implements com.google.firebase.crashlytics.internal.common.NativeSessionFile {
    private final java.lang.String dataTransportFilename;
    private final java.io.File file;
    private final java.lang.String reportsEndpointFilename;

    FileBackedNativeSessionFile(java.lang.String r1, java.lang.String r2, java.io.File r3) {
            r0 = this;
            r0.<init>()
            r0.dataTransportFilename = r1
            r0.reportsEndpointFilename = r2
            r0.file = r3
            return
    }

    private byte[] asGzippedBytes() {
            r7 = this;
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]
            r1 = 0
            java.io.InputStream r2 = r7.getStream()     // Catch: java.io.IOException -> L5d
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L51
            r3.<init>()     // Catch: java.lang.Throwable -> L51
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L47
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L21
            r4.close()     // Catch: java.lang.Throwable -> L47
            r3.close()     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L20
            r2.close()     // Catch: java.io.IOException -> L5d
        L20:
            return r1
        L21:
            int r5 = r2.read(r0)     // Catch: java.lang.Throwable -> L3d
            if (r5 <= 0) goto L2c
            r6 = 0
            r4.write(r0, r6, r5)     // Catch: java.lang.Throwable -> L3d
            goto L21
        L2c:
            r4.finish()     // Catch: java.lang.Throwable -> L3d
            byte[] r0 = r3.toByteArray()     // Catch: java.lang.Throwable -> L3d
            r4.close()     // Catch: java.lang.Throwable -> L47
            r3.close()     // Catch: java.lang.Throwable -> L51
            r2.close()     // Catch: java.io.IOException -> L5d
            return r0
        L3d:
            r0 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L42
            goto L46
        L42:
            r4 = move-exception
            r0.addSuppressed(r4)     // Catch: java.lang.Throwable -> L47
        L46:
            throw r0     // Catch: java.lang.Throwable -> L47
        L47:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L4c
            goto L50
        L4c:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Throwable -> L51
        L50:
            throw r0     // Catch: java.lang.Throwable -> L51
        L51:
            r0 = move-exception
            if (r2 == 0) goto L5c
            r2.close()     // Catch: java.lang.Throwable -> L58
            goto L5c
        L58:
            r2 = move-exception
            r0.addSuppressed(r2)     // Catch: java.io.IOException -> L5d
        L5c:
            throw r0     // Catch: java.io.IOException -> L5d
        L5d:
            return r1
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File asFilePayload() {
            r2 = this;
            byte[] r0 = r2.asGzippedBytes()
            if (r0 == 0) goto L19
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File$Builder r1 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.builder()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File$Builder r0 = r1.setContents(r0)
            java.lang.String r1 = r2.dataTransportFilename
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File$Builder r0 = r0.setFilename(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File r0 = r0.build()
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public java.lang.String getReportsEndpointFilename() {
            r1 = this;
            java.lang.String r0 = r1.reportsEndpointFilename
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public java.io.InputStream getStream() {
            r3 = this;
            java.io.File r0 = r3.file
            boolean r0 = r0.exists()
            r1 = 0
            if (r0 == 0) goto L1a
            java.io.File r0 = r3.file
            boolean r0 = r0.isFile()
            if (r0 != 0) goto L12
            goto L1a
        L12:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L1a
            java.io.File r2 = r3.file     // Catch: java.io.FileNotFoundException -> L1a
            r0.<init>(r2)     // Catch: java.io.FileNotFoundException -> L1a
            return r0
        L1a:
            return r1
    }
}
