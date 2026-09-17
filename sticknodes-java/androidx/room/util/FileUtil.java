package androidx.room.util;

/* loaded from: classes.dex */
public class FileUtil {
    @android.annotation.SuppressLint({"LambdaLast"})
    public static void copy(java.nio.channels.ReadableByteChannel r9, java.nio.channels.FileChannel r10) throws java.io.IOException {
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L34
            r1 = 23
            r2 = 0
            if (r0 <= r1) goto L14
            r5 = 0
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = r10
            r4 = r9
            r3.transferFrom(r4, r5, r7)     // Catch: java.lang.Throwable -> L34
            goto L2a
        L14:
            java.io.InputStream r0 = java.nio.channels.Channels.newInputStream(r9)     // Catch: java.lang.Throwable -> L34
            java.io.OutputStream r1 = java.nio.channels.Channels.newOutputStream(r10)     // Catch: java.lang.Throwable -> L34
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L34
        L20:
            int r4 = r0.read(r3)     // Catch: java.lang.Throwable -> L34
            if (r4 <= 0) goto L2a
            r1.write(r3, r2, r4)     // Catch: java.lang.Throwable -> L34
            goto L20
        L2a:
            r10.force(r2)     // Catch: java.lang.Throwable -> L34
            r9.close()
            r10.close()
            return
        L34:
            r0 = move-exception
            r9.close()
            r10.close()
            throw r0
    }
}
