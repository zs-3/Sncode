package com.badlogic.gdx.graphics;

/* loaded from: classes.dex */
public class PixmapIO {

    private static class CIM {
        private static final byte[] readBuffer = null;
        private static final byte[] writeBuffer = null;

        static {
                r0 = 32000(0x7d00, float:4.4842E-41)
                byte[] r1 = new byte[r0]
                com.badlogic.gdx.graphics.PixmapIO.CIM.writeBuffer = r1
                byte[] r0 = new byte[r0]
                com.badlogic.gdx.graphics.PixmapIO.CIM.readBuffer = r0
                return
        }

        public static com.badlogic.gdx.graphics.Pixmap read(com.badlogic.gdx.files.FileHandle r8) {
                r0 = 0
                java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
                java.util.zip.InflaterInputStream r2 = new java.util.zip.InflaterInputStream     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
                java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
                java.io.InputStream r4 = r8.read()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d
                int r0 = r1.readInt()     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L7d
                int r2 = r1.readInt()     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L7d
                int r3 = r1.readInt()     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L7d
                com.badlogic.gdx.graphics.Pixmap$Format r3 = com.badlogic.gdx.graphics.Pixmap.Format.fromGdx2DPixmapFormat(r3)     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L7d
                com.badlogic.gdx.graphics.Pixmap r4 = new com.badlogic.gdx.graphics.Pixmap     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L7d
                r4.<init>(r0, r2, r3)     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L7d
                java.nio.ByteBuffer r0 = r4.getPixels()     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L7d
                r2 = 0
                r0.position(r2)     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L7d
                int r3 = r0.capacity()     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L7d
                r0.limit(r3)     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L7d
                byte[] r3 = com.badlogic.gdx.graphics.PixmapIO.CIM.readBuffer     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L7d
                monitor-enter(r3)     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L7d
            L3b:
                byte[] r5 = com.badlogic.gdx.graphics.PixmapIO.CIM.readBuffer     // Catch: java.lang.Throwable -> L56
                int r6 = r1.read(r5)     // Catch: java.lang.Throwable -> L56
                if (r6 <= 0) goto L47
                r0.put(r5, r2, r6)     // Catch: java.lang.Throwable -> L56
                goto L3b
            L47:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L56
                r0.position(r2)     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L7d
                int r2 = r0.capacity()     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L7d
                r0.limit(r2)     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L7d
                com.badlogic.gdx.utils.StreamUtils.closeQuietly(r1)
                return r4
            L56:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L56
                throw r0     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L7d
            L59:
                r0 = move-exception
                goto L61
            L5b:
                r8 = move-exception
                goto L7f
            L5d:
                r1 = move-exception
                r7 = r1
                r1 = r0
                r0 = r7
            L61:
                com.badlogic.gdx.utils.GdxRuntimeException r2 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> L7d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
                r3.<init>()     // Catch: java.lang.Throwable -> L7d
                java.lang.String r4 = "Couldn't read Pixmap from file '"
                r3.append(r4)     // Catch: java.lang.Throwable -> L7d
                r3.append(r8)     // Catch: java.lang.Throwable -> L7d
                java.lang.String r8 = "'"
                r3.append(r8)     // Catch: java.lang.Throwable -> L7d
                java.lang.String r8 = r3.toString()     // Catch: java.lang.Throwable -> L7d
                r2.<init>(r8, r0)     // Catch: java.lang.Throwable -> L7d
                throw r2     // Catch: java.lang.Throwable -> L7d
            L7d:
                r8 = move-exception
                r0 = r1
            L7f:
                com.badlogic.gdx.utils.StreamUtils.closeQuietly(r0)
                throw r8
        }
    }

    public static com.badlogic.gdx.graphics.Pixmap readCIM(com.badlogic.gdx.files.FileHandle r0) {
            com.badlogic.gdx.graphics.Pixmap r0 = com.badlogic.gdx.graphics.PixmapIO.CIM.read(r0)
            return r0
    }
}
