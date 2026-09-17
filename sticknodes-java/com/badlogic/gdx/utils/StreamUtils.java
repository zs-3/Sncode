package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public final class StreamUtils {
    public static final byte[] EMPTY_BYTES = null;

    public static class OptimizedByteArrayOutputStream extends java.io.ByteArrayOutputStream {
        public OptimizedByteArrayOutputStream(int r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.io.ByteArrayOutputStream
        public synchronized byte[] toByteArray() {
                r3 = this;
                monitor-enter(r3)
                int r0 = r3.count     // Catch: java.lang.Throwable -> L10
                byte[] r1 = r3.buf     // Catch: java.lang.Throwable -> L10
                int r2 = r1.length     // Catch: java.lang.Throwable -> L10
                if (r0 != r2) goto La
                monitor-exit(r3)
                return r1
            La:
                byte[] r0 = super.toByteArray()     // Catch: java.lang.Throwable -> L10
                monitor-exit(r3)
                return r0
            L10:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
        }
    }

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            com.badlogic.gdx.utils.StreamUtils.EMPTY_BYTES = r0
            return
    }

    public static void closeQuietly(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public static void copyStream(java.io.InputStream r1, java.io.OutputStream r2) throws java.io.IOException {
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            copyStream(r1, r2, r0)
            return
    }

    public static void copyStream(java.io.InputStream r2, java.io.OutputStream r3, byte[] r4) throws java.io.IOException {
        L0:
            int r0 = r2.read(r4)
            r1 = -1
            if (r0 == r1) goto Lc
            r1 = 0
            r3.write(r4, r1, r0)
            goto L0
        Lc:
            return
    }

    public static byte[] copyStreamToByteArray(java.io.InputStream r2, int r3) throws java.io.IOException {
            com.badlogic.gdx.utils.StreamUtils$OptimizedByteArrayOutputStream r0 = new com.badlogic.gdx.utils.StreamUtils$OptimizedByteArrayOutputStream
            r1 = 0
            int r3 = java.lang.Math.max(r1, r3)
            r0.<init>(r3)
            copyStream(r2, r0)
            byte[] r2 = r0.toByteArray()
            return r2
    }
}
