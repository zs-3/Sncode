package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
class NativeSessionFileGzipper {
    private static void gzipInputStream(java.io.InputStream r4, java.io.File r5) throws java.io.IOException {
            if (r4 != 0) goto L3
            return
        L3:
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]
            r1 = 0
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L27
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L27
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L27
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L27
        L12:
            int r5 = r4.read(r0)     // Catch: java.lang.Throwable -> L24
            if (r5 <= 0) goto L1d
            r1 = 0
            r2.write(r0, r1, r5)     // Catch: java.lang.Throwable -> L24
            goto L12
        L1d:
            r2.finish()     // Catch: java.lang.Throwable -> L24
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeQuietly(r2)
            return
        L24:
            r4 = move-exception
            r1 = r2
            goto L28
        L27:
            r4 = move-exception
        L28:
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeQuietly(r1)
            throw r4
    }

    static void processNativeSessions(java.io.File r3, java.util.List<com.google.firebase.crashlytics.internal.common.NativeSessionFile> r4) {
            java.util.Iterator r4 = r4.iterator()
        L4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r4.next()
            com.google.firebase.crashlytics.internal.common.NativeSessionFile r0 = (com.google.firebase.crashlytics.internal.common.NativeSessionFile) r0
            r1 = 0
            java.io.InputStream r1 = r0.getStream()     // Catch: java.io.IOException -> L17 java.lang.Throwable -> L28
            if (r1 != 0) goto L1b
        L17:
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeQuietly(r1)
            goto L4
        L1b:
            java.io.File r2 = new java.io.File     // Catch: java.io.IOException -> L17 java.lang.Throwable -> L28
            java.lang.String r0 = r0.getReportsEndpointFilename()     // Catch: java.io.IOException -> L17 java.lang.Throwable -> L28
            r2.<init>(r3, r0)     // Catch: java.io.IOException -> L17 java.lang.Throwable -> L28
            gzipInputStream(r1, r2)     // Catch: java.io.IOException -> L17 java.lang.Throwable -> L28
            goto L17
        L28:
            r3 = move-exception
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeQuietly(r1)
            throw r3
        L2d:
            return
    }
}
