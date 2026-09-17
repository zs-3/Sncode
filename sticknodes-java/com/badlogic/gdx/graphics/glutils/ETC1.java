package com.badlogic.gdx.graphics.glutils;

/* loaded from: classes.dex */
public class ETC1 {
    public static int ETC1_RGB8_OES = 36196;
    public static int PKM_HEADER_SIZE = 16;

    public static final class ETC1Data implements com.badlogic.gdx.utils.Disposable {
        public final java.nio.ByteBuffer compressedData;
        public final int dataOffset;
        public final int height;
        public final int width;

        public ETC1Data(int r1, int r2, java.nio.ByteBuffer r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.width = r1
                r0.height = r2
                r0.compressedData = r3
                r0.dataOffset = r4
                r0.checkNPOT()
                return
        }

        public ETC1Data(com.badlogic.gdx.files.FileHandle r7) {
                r6 = this;
                r6.<init>()
                r0 = 10240(0x2800, float:1.4349E-41)
                byte[] r0 = new byte[r0]
                r1 = 0
                java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
                java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
                java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
                java.io.InputStream r5 = r7.read()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
                r4.<init>(r5)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
                int r1 = r2.readInt()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                java.nio.ByteBuffer r1 = com.badlogic.gdx.utils.BufferUtils.newUnsafeByteBuffer(r1)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                r6.compressedData = r1     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            L25:
                int r1 = r2.read(r0)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                r3 = -1
                r4 = 0
                if (r1 == r3) goto L33
                java.nio.ByteBuffer r3 = r6.compressedData     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                r3.put(r0, r4, r1)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                goto L25
            L33:
                java.nio.ByteBuffer r0 = r6.compressedData     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                r0.position(r4)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                java.nio.ByteBuffer r0 = r6.compressedData     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                int r1 = r0.capacity()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                r0.limit(r1)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                com.badlogic.gdx.utils.StreamUtils.closeQuietly(r2)
                java.nio.ByteBuffer r7 = r6.compressedData
                int r7 = com.badlogic.gdx.graphics.glutils.ETC1.getWidthPKM(r7, r4)
                r6.width = r7
                java.nio.ByteBuffer r7 = r6.compressedData
                int r7 = com.badlogic.gdx.graphics.glutils.ETC1.getHeightPKM(r7, r4)
                r6.height = r7
                int r7 = com.badlogic.gdx.graphics.glutils.ETC1.PKM_HEADER_SIZE
                r6.dataOffset = r7
                java.nio.ByteBuffer r0 = r6.compressedData
                r0.position(r7)
                r6.checkNPOT()
                return
            L61:
                r7 = move-exception
                r1 = r2
                goto L86
            L64:
                r0 = move-exception
                r1 = r2
                goto L6a
            L67:
                r7 = move-exception
                goto L86
            L69:
                r0 = move-exception
            L6a:
                com.badlogic.gdx.utils.GdxRuntimeException r2 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> L67
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
                r3.<init>()     // Catch: java.lang.Throwable -> L67
                java.lang.String r4 = "Couldn't load pkm file '"
                r3.append(r4)     // Catch: java.lang.Throwable -> L67
                r3.append(r7)     // Catch: java.lang.Throwable -> L67
                java.lang.String r7 = "'"
                r3.append(r7)     // Catch: java.lang.Throwable -> L67
                java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L67
                r2.<init>(r7, r0)     // Catch: java.lang.Throwable -> L67
                throw r2     // Catch: java.lang.Throwable -> L67
            L86:
                com.badlogic.gdx.utils.StreamUtils.closeQuietly(r1)
                throw r7
        }

        private void checkNPOT() {
                r2 = this;
                int r0 = r2.width
                boolean r0 = com.badlogic.gdx.math.MathUtils.isPowerOfTwo(r0)
                if (r0 == 0) goto L10
                int r0 = r2.height
                boolean r0 = com.badlogic.gdx.math.MathUtils.isPowerOfTwo(r0)
                if (r0 != 0) goto L17
            L10:
                java.io.PrintStream r0 = java.lang.System.out
                java.lang.String r1 = "ETC1Data warning: non-power-of-two ETC1 textures may crash the driver of PowerVR GPUs"
                r0.println(r1)
            L17:
                return
        }

        @Override // com.badlogic.gdx.utils.Disposable
        public void dispose() {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.compressedData
                com.badlogic.gdx.utils.BufferUtils.disposeUnsafeByteBuffer(r0)
                return
        }

        public boolean hasPKMHeader() {
                r2 = this;
                int r0 = r2.dataOffset
                r1 = 16
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public java.lang.String toString() {
                r5 = this;
                boolean r0 = r5.hasPKMHeader()
                java.lang.String r1 = "], compressed: "
                java.lang.String r2 = "x"
                if (r0 == 0) goto L4e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.nio.ByteBuffer r3 = r5.compressedData
                r4 = 0
                boolean r3 = com.badlogic.gdx.graphics.glutils.ETC1.isValidPKM(r3, r4)
                if (r3 == 0) goto L1b
                java.lang.String r3 = "valid"
                goto L1d
            L1b:
                java.lang.String r3 = "invalid"
            L1d:
                r0.append(r3)
                java.lang.String r3 = " pkm ["
                r0.append(r3)
                java.nio.ByteBuffer r3 = r5.compressedData
                int r3 = com.badlogic.gdx.graphics.glutils.ETC1.getWidthPKM(r3, r4)
                r0.append(r3)
                r0.append(r2)
                java.nio.ByteBuffer r2 = r5.compressedData
                int r2 = com.badlogic.gdx.graphics.glutils.ETC1.getHeightPKM(r2, r4)
                r0.append(r2)
                r0.append(r1)
                java.nio.ByteBuffer r1 = r5.compressedData
                int r1 = r1.capacity()
                int r2 = com.badlogic.gdx.graphics.glutils.ETC1.PKM_HEADER_SIZE
                int r1 = r1 - r2
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            L4e:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "raw ["
                r0.append(r3)
                int r3 = r5.width
                r0.append(r3)
                r0.append(r2)
                int r2 = r5.height
                r0.append(r2)
                r0.append(r1)
                java.nio.ByteBuffer r1 = r5.compressedData
                int r1 = r1.capacity()
                int r2 = com.badlogic.gdx.graphics.glutils.ETC1.PKM_HEADER_SIZE
                int r1 = r1 - r2
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            return
    }

    public static com.badlogic.gdx.graphics.Pixmap decodeImage(com.badlogic.gdx.graphics.glutils.ETC1.ETC1Data r10, com.badlogic.gdx.graphics.Pixmap.Format r11) {
            boolean r0 = r10.hasPKMHeader()
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = 16
            java.nio.ByteBuffer r2 = r10.compressedData
            int r2 = getWidthPKM(r2, r1)
            java.nio.ByteBuffer r3 = r10.compressedData
            int r1 = getHeightPKM(r3, r1)
            r8 = r1
            r7 = r2
            r4 = 16
            goto L21
        L1a:
            int r2 = r10.width
            int r0 = r10.height
            r8 = r0
            r7 = r2
            r4 = 0
        L21:
            int r9 = getPixelSize(r11)
            com.badlogic.gdx.graphics.Pixmap r0 = new com.badlogic.gdx.graphics.Pixmap
            r0.<init>(r7, r8, r11)
            java.nio.ByteBuffer r3 = r10.compressedData
            java.nio.ByteBuffer r5 = r0.getPixels()
            r6 = 0
            decodeImage(r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    private static native void decodeImage(java.nio.ByteBuffer r0, int r1, java.nio.ByteBuffer r2, int r3, int r4, int r5, int r6);

    static native int getHeightPKM(java.nio.ByteBuffer r0, int r1);

    private static int getPixelSize(com.badlogic.gdx.graphics.Pixmap.Format r1) {
            com.badlogic.gdx.graphics.Pixmap$Format r0 = com.badlogic.gdx.graphics.Pixmap.Format.RGB565
            if (r1 != r0) goto L6
            r1 = 2
            return r1
        L6:
            com.badlogic.gdx.graphics.Pixmap$Format r0 = com.badlogic.gdx.graphics.Pixmap.Format.RGB888
            if (r1 != r0) goto Lc
            r1 = 3
            return r1
        Lc:
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r0 = "Can only handle RGB565 or RGB888 images"
            r1.<init>(r0)
            throw r1
    }

    static native int getWidthPKM(java.nio.ByteBuffer r0, int r1);

    static native boolean isValidPKM(java.nio.ByteBuffer r0, int r1);
}
