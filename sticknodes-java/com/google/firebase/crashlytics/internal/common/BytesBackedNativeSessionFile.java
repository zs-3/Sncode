package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
class BytesBackedNativeSessionFile implements com.google.firebase.crashlytics.internal.common.NativeSessionFile {
    private final byte[] bytes;
    private final java.lang.String dataTransportFilename;
    private final java.lang.String reportsEndpointFilename;

    BytesBackedNativeSessionFile(java.lang.String r1, java.lang.String r2, byte[] r3) {
            r0 = this;
            r0.<init>()
            r0.dataTransportFilename = r1
            r0.reportsEndpointFilename = r2
            r0.bytes = r3
            return
    }

    private byte[] asGzippedBytes() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L39
            r0.<init>()     // Catch: java.io.IOException -> L39
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2f
            byte[] r3 = r4.bytes     // Catch: java.lang.Throwable -> L25
            r2.write(r3)     // Catch: java.lang.Throwable -> L25
            r2.finish()     // Catch: java.lang.Throwable -> L25
            byte[] r3 = r0.toByteArray()     // Catch: java.lang.Throwable -> L25
            r2.close()     // Catch: java.lang.Throwable -> L2f
            r0.close()     // Catch: java.io.IOException -> L39
            return r3
        L25:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L2a
            goto L2e
        L2a:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch: java.lang.Throwable -> L2f
        L2e:
            throw r3     // Catch: java.lang.Throwable -> L2f
        L2f:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L34
            goto L38
        L34:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.io.IOException -> L39
        L38:
            throw r2     // Catch: java.io.IOException -> L39
        L39:
            return r1
    }

    private boolean isEmpty() {
            r1 = this;
            byte[] r0 = r1.bytes
            if (r0 == 0) goto La
            int r0 = r0.length
            if (r0 != 0) goto L8
            goto La
        L8:
            r0 = 0
            goto Lb
        La:
            r0 = 1
        Lb:
            return r0
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File asFilePayload() {
            r2 = this;
            byte[] r0 = r2.asGzippedBytes()
            if (r0 != 0) goto L8
            r0 = 0
            goto L1a
        L8:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File$Builder r1 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.builder()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File$Builder r0 = r1.setContents(r0)
            java.lang.String r1 = r2.dataTransportFilename
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File$Builder r0 = r0.setFilename(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File r0 = r0.build()
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
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            goto Lf
        L8:
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            byte[] r1 = r2.bytes
            r0.<init>(r1)
        Lf:
            return r0
    }
}
