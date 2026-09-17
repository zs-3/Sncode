package org.jcodec.common.io;

/* loaded from: classes2.dex */
public class IOUtils {
    public static void closeQuietly(java.io.Closeable r0) {
            if (r0 != 0) goto L3
            return
        L3:
            r0.close()     // Catch: java.io.IOException -> L6
        L6:
            return
    }

    public static int copy(java.io.InputStream r5, java.io.OutputStream r6) throws java.io.IOException {
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            r1 = 0
            r2 = 0
        L6:
            r3 = -1
            int r4 = r5.read(r0)
            if (r3 == r4) goto L12
            r6.write(r0, r1, r4)
            int r2 = r2 + r4
            goto L6
        L12:
            return r2
    }
}
