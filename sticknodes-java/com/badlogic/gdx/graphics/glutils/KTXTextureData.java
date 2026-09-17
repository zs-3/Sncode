package com.badlogic.gdx.graphics.glutils;

/* loaded from: classes.dex */
public class KTXTextureData implements com.badlogic.gdx.graphics.TextureData, com.badlogic.gdx.graphics.CubemapData {
    private java.nio.ByteBuffer compressedData;
    private com.badlogic.gdx.files.FileHandle file;
    private int glBaseInternalFormat;
    private int glFormat;
    private int glInternalFormat;
    private int glType;
    private int glTypeSize;
    private int imagePos;
    private int numberOfArrayElements;
    private int numberOfFaces;
    private int numberOfMipmapLevels;
    private int pixelDepth;
    private int pixelHeight;
    private int pixelWidth;
    private boolean useMipMaps;

    public KTXTextureData(com.badlogic.gdx.files.FileHandle r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.pixelWidth = r0
            r1.pixelHeight = r0
            r1.pixelDepth = r0
            r1.file = r2
            r1.useMipMaps = r3
            return
    }

    @Override // com.badlogic.gdx.graphics.CubemapData
    public void consumeCubemapData() {
            r1 = this;
            r0 = 34067(0x8513, float:4.7738E-41)
            r1.consumeCustomData(r0)
            return
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void consumeCustomData(int r29) {
            r28 = this;
            r0 = r28
            r1 = r29
            java.nio.ByteBuffer r2 = r0.compressedData
            if (r2 == 0) goto L207
            r2 = 16
            java.nio.IntBuffer r2 = com.badlogic.gdx.utils.BufferUtils.newIntBuffer(r2)
            int r3 = r0.glType
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L1b
            int r6 = r0.glFormat
            if (r6 != 0) goto L19
            goto L1b
        L19:
            r3 = 0
            goto L21
        L1b:
            int r6 = r0.glFormat
            int r3 = r3 + r6
            if (r3 != 0) goto L1ff
            r3 = 1
        L21:
            int r6 = r0.pixelHeight
            r7 = 3553(0xde1, float:4.979E-42)
            r8 = 2
            r9 = 4660(0x1234, float:6.53E-42)
            if (r6 <= 0) goto L2e
            r6 = 2
            r10 = 3553(0xde1, float:4.979E-42)
            goto L31
        L2e:
            r6 = 1
            r10 = 4660(0x1234, float:6.53E-42)
        L31:
            int r11 = r0.pixelDepth
            if (r11 <= 0) goto L38
            r6 = 3
            r10 = 4660(0x1234, float:6.53E-42)
        L38:
            int r11 = r0.numberOfFaces
            r13 = 34067(0x8513, float:4.7738E-41)
            r14 = 6
            if (r11 != r14) goto L4e
            if (r6 != r8) goto L46
            r10 = 34067(0x8513, float:4.7738E-41)
            goto L50
        L46:
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r2 = "cube map needs 2D faces"
            r1.<init>(r2)
            throw r1
        L4e:
            if (r11 != r5) goto L1f7
        L50:
            int r15 = r0.numberOfArrayElements
            if (r15 <= 0) goto L66
            if (r10 != r9) goto L57
            goto L59
        L57:
            if (r10 != r7) goto L5e
        L59:
            int r6 = r6 + 1
            r10 = 4660(0x1234, float:6.53E-42)
            goto L66
        L5e:
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r2 = "No API for 3D and cube arrays yet"
            r1.<init>(r2)
            throw r1
        L66:
            if (r10 == r9) goto L1ef
            r9 = 34074(0x851a, float:4.7748E-41)
            r12 = 34069(0x8515, float:4.7741E-41)
            if (r11 != r14) goto L80
            if (r1 == r13) goto L80
            if (r12 > r1) goto L78
            if (r1 > r9) goto L78
            int r1 = r1 - r12
            goto Lb7
        L78:
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r2 = "You must specify either GL_TEXTURE_CUBE_MAP to bind all 6 faces of the cube or the requested face GL_TEXTURE_CUBE_MAP_POSITIVE_X and followings."
            r1.<init>(r2)
            throw r1
        L80:
            if (r11 != r14) goto L85
            if (r1 != r13) goto L85
            goto Lb6
        L85:
            if (r1 == r10) goto Lb5
            if (r12 > r1) goto L8e
            if (r1 > r9) goto L8e
            if (r1 != r7) goto L8e
            goto Lb5
        L8e:
            com.badlogic.gdx.utils.GdxRuntimeException r2 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Invalid target requested : 0x"
            r3.append(r4)
            java.lang.String r1 = java.lang.Integer.toHexString(r29)
            r3.append(r1)
            java.lang.String r1 = ", expecting : 0x"
            r3.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r10)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        Lb5:
            r12 = r1
        Lb6:
            r1 = -1
        Lb7:
            com.badlogic.gdx.graphics.GL20 r7 = com.badlogic.gdx.Gdx.gl
            r9 = 3317(0xcf5, float:4.648E-42)
            r7.glGetIntegerv(r9, r2)
            int r2 = r2.get(r4)
            r7 = 4
            if (r2 == r7) goto Lca
            com.badlogic.gdx.graphics.GL20 r10 = com.badlogic.gdx.Gdx.gl
            r10.glPixelStorei(r9, r7)
        Lca:
            int r10 = r0.glInternalFormat
            int r11 = r0.glFormat
            int r13 = r0.imagePos
            r14 = 0
        Ld1:
            int r9 = r0.numberOfMipmapLevels
            if (r14 >= r9) goto L1d6
            int r9 = r0.pixelWidth
            int r9 = r9 >> r14
            int r9 = java.lang.Math.max(r5, r9)
            int r4 = r0.pixelHeight
            int r4 = r4 >> r14
            int r4 = java.lang.Math.max(r5, r4)
            int r8 = r0.pixelDepth
            int r8 = r8 >> r14
            java.lang.Math.max(r5, r8)
            java.nio.ByteBuffer r8 = r0.compressedData
            r8.position(r13)
            java.nio.ByteBuffer r8 = r0.compressedData
            int r8 = r8.getInt()
            int r16 = r8 + 3
            r5 = r16 & (-4)
            int r13 = r13 + r7
            r7 = 0
        Lfa:
            int r15 = r0.numberOfFaces
            if (r7 >= r15) goto L1c4
            java.nio.ByteBuffer r15 = r0.compressedData
            r15.position(r13)
            int r13 = r13 + r5
            r15 = -1
            if (r1 == r15) goto L10d
            if (r1 == r7) goto L10d
            r26 = r1
            goto L1b8
        L10d:
            java.nio.ByteBuffer r15 = r0.compressedData
            java.nio.ByteBuffer r15 = r15.slice()
            r15.limit(r5)
            r26 = r1
            r1 = 1
            if (r6 != r1) goto L11d
            goto L1b8
        L11d:
            r1 = 2
            if (r6 != r1) goto L1b8
            int r1 = r0.numberOfArrayElements
            if (r1 <= 0) goto L125
            r4 = r1
        L125:
            if (r3 == 0) goto L19a
            int r1 = com.badlogic.gdx.graphics.glutils.ETC1.ETC1_RGB8_OES
            if (r10 != r1) goto L181
            com.badlogic.gdx.Graphics r1 = com.badlogic.gdx.Gdx.graphics
            r27 = r3
            java.lang.String r3 = "GL_OES_compressed_ETC1_RGB8_texture"
            boolean r1 = r1.supportsExtension(r3)
            if (r1 != 0) goto L16a
            com.badlogic.gdx.graphics.glutils.ETC1$ETC1Data r1 = new com.badlogic.gdx.graphics.glutils.ETC1$ETC1Data
            r3 = 0
            r1.<init>(r9, r4, r15, r3)
            com.badlogic.gdx.graphics.Pixmap$Format r15 = com.badlogic.gdx.graphics.Pixmap.Format.RGB888
            com.badlogic.gdx.graphics.Pixmap r1 = com.badlogic.gdx.graphics.glutils.ETC1.decodeImage(r1, r15)
            com.badlogic.gdx.graphics.GL20 r16 = com.badlogic.gdx.Gdx.gl
            int r17 = r12 + r7
            int r19 = r1.getGLInternalFormat()
            int r20 = r1.getWidth()
            int r21 = r1.getHeight()
            r22 = 0
            int r23 = r1.getGLFormat()
            int r24 = r1.getGLType()
            java.nio.ByteBuffer r25 = r1.getPixels()
            r18 = r14
            r16.glTexImage2D(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1.dispose()
            goto L1b6
        L16a:
            r3 = 0
            com.badlogic.gdx.graphics.GL20 r16 = com.badlogic.gdx.Gdx.gl
            int r17 = r12 + r7
            r22 = 0
            r18 = r14
            r19 = r10
            r20 = r9
            r21 = r4
            r23 = r8
            r24 = r15
            r16.glCompressedTexImage2D(r17, r18, r19, r20, r21, r22, r23, r24)
            goto L1b6
        L181:
            r27 = r3
            r3 = 0
            com.badlogic.gdx.graphics.GL20 r16 = com.badlogic.gdx.Gdx.gl
            int r17 = r12 + r7
            r22 = 0
            r18 = r14
            r19 = r10
            r20 = r9
            r21 = r4
            r23 = r8
            r24 = r15
            r16.glCompressedTexImage2D(r17, r18, r19, r20, r21, r22, r23, r24)
            goto L1b6
        L19a:
            r27 = r3
            r3 = 0
            com.badlogic.gdx.graphics.GL20 r16 = com.badlogic.gdx.Gdx.gl
            int r17 = r12 + r7
            r22 = 0
            int r1 = r0.glType
            r18 = r14
            r19 = r10
            r20 = r9
            r21 = r4
            r23 = r11
            r24 = r1
            r25 = r15
            r16.glTexImage2D(r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L1b6:
            r1 = 3
            goto L1bc
        L1b8:
            r27 = r3
            r1 = 3
            r3 = 0
        L1bc:
            int r7 = r7 + 1
            r1 = r26
            r3 = r27
            goto Lfa
        L1c4:
            r26 = r1
            r27 = r3
            r1 = 3
            r3 = 0
            int r14 = r14 + 1
            r1 = r26
            r3 = r27
            r4 = 0
            r5 = 1
            r7 = 4
            r8 = 2
            goto Ld1
        L1d6:
            r4 = 4
            if (r2 == r4) goto L1e0
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r3 = 3317(0xcf5, float:4.648E-42)
            r1.glPixelStorei(r3, r2)
        L1e0:
            boolean r1 = r28.useMipMaps()
            if (r1 == 0) goto L1eb
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r1.glGenerateMipmap(r12)
        L1eb:
            r28.disposePreparedData()
            return
        L1ef:
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r2 = "Unsupported texture format (only 2D texture are supported in LibGdx for the time being)"
            r1.<init>(r2)
            throw r1
        L1f7:
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r2 = "numberOfFaces must be either 1 or 6"
            r1.<init>(r2)
            throw r1
        L1ff:
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r2 = "either both or none of glType, glFormat must be zero"
            r1.<init>(r2)
            throw r1
        L207:
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r2 = "Call prepare() before calling consumeCompressedData()"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public com.badlogic.gdx.graphics.Pixmap consumePixmap() {
            r2 = this;
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "This TextureData implementation does not return a Pixmap"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean disposePixmap() {
            r2 = this;
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "This TextureData implementation does not return a Pixmap"
            r0.<init>(r1)
            throw r0
    }

    public void disposePreparedData() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.compressedData
            if (r0 == 0) goto L7
            com.badlogic.gdx.utils.BufferUtils.disposeUnsafeByteBuffer(r0)
        L7:
            r0 = 0
            r1.compressedData = r0
            return
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public com.badlogic.gdx.graphics.Pixmap.Format getFormat() {
            r2 = this;
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "This TextureData implementation directly handles texture formats."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getHeight() {
            r1 = this;
            int r0 = r1.pixelHeight
            return r0
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public com.badlogic.gdx.graphics.TextureData.TextureDataType getType() {
            r1 = this;
            com.badlogic.gdx.graphics.TextureData$TextureDataType r0 = com.badlogic.gdx.graphics.TextureData.TextureDataType.Custom
            return r0
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getWidth() {
            r1 = this;
            int r0 = r1.pixelWidth
            return r0
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean isManaged() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean isPrepared() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.compressedData
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void prepare() {
            r7 = this;
            java.nio.ByteBuffer r0 = r7.compressedData
            if (r0 != 0) goto L22d
            com.badlogic.gdx.files.FileHandle r0 = r7.file
            if (r0 == 0) goto L225
            java.lang.String r0 = r0.name()
            java.lang.String r1 = ".zktx"
            boolean r0 = r0.endsWith(r1)
            r1 = 0
            if (r0 == 0) goto L83
            r0 = 10240(0x2800, float:1.4349E-41)
            byte[] r0 = new byte[r0]
            r2 = 0
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            com.badlogic.gdx.files.FileHandle r6 = r7.file     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            java.io.InputStream r6 = r6.read()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            int r2 = r3.readInt()     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            java.nio.ByteBuffer r2 = com.badlogic.gdx.utils.BufferUtils.newUnsafeByteBuffer(r2)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            r7.compressedData = r2     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
        L39:
            int r2 = r3.read(r0)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            r4 = -1
            if (r2 == r4) goto L46
            java.nio.ByteBuffer r4 = r7.compressedData     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            r4.put(r0, r1, r2)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            goto L39
        L46:
            java.nio.ByteBuffer r0 = r7.compressedData     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            r0.position(r1)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            java.nio.ByteBuffer r0 = r7.compressedData     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            int r2 = r0.capacity()     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            r0.limit(r2)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r3)
            goto L8f
        L58:
            r0 = move-exception
            r2 = r3
            goto L7f
        L5b:
            r0 = move-exception
            r2 = r3
            goto L61
        L5e:
            r0 = move-exception
            goto L7f
        L60:
            r0 = move-exception
        L61:
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> L5e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            r3.<init>()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = "Couldn't load zktx file '"
            r3.append(r4)     // Catch: java.lang.Throwable -> L5e
            com.badlogic.gdx.files.FileHandle r4 = r7.file     // Catch: java.lang.Throwable -> L5e
            r3.append(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L5e
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L5e
            throw r1     // Catch: java.lang.Throwable -> L5e
        L7f:
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r2)
            throw r0
        L83:
            com.badlogic.gdx.files.FileHandle r0 = r7.file
            byte[] r0 = r0.readBytes()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r7.compressedData = r0
        L8f:
            java.nio.ByteBuffer r0 = r7.compressedData
            byte r0 = r0.get()
            r2 = -85
            java.lang.String r3 = "Invalid KTX Header"
            if (r0 != r2) goto L21f
            java.nio.ByteBuffer r0 = r7.compressedData
            byte r0 = r0.get()
            r2 = 75
            if (r0 != r2) goto L219
            java.nio.ByteBuffer r0 = r7.compressedData
            byte r0 = r0.get()
            r2 = 84
            if (r0 != r2) goto L213
            java.nio.ByteBuffer r0 = r7.compressedData
            byte r0 = r0.get()
            r2 = 88
            if (r0 != r2) goto L20d
            java.nio.ByteBuffer r0 = r7.compressedData
            byte r0 = r0.get()
            r2 = 32
            if (r0 != r2) goto L207
            java.nio.ByteBuffer r0 = r7.compressedData
            byte r0 = r0.get()
            r2 = 49
            if (r0 != r2) goto L201
            java.nio.ByteBuffer r0 = r7.compressedData
            byte r0 = r0.get()
            if (r0 != r2) goto L1fb
            java.nio.ByteBuffer r0 = r7.compressedData
            byte r0 = r0.get()
            r2 = -69
            if (r0 != r2) goto L1f5
            java.nio.ByteBuffer r0 = r7.compressedData
            byte r0 = r0.get()
            r2 = 13
            if (r0 != r2) goto L1ef
            java.nio.ByteBuffer r0 = r7.compressedData
            byte r0 = r0.get()
            r2 = 10
            if (r0 != r2) goto L1e9
            java.nio.ByteBuffer r0 = r7.compressedData
            byte r0 = r0.get()
            r4 = 26
            if (r0 != r4) goto L1e3
            java.nio.ByteBuffer r0 = r7.compressedData
            byte r0 = r0.get()
            if (r0 != r2) goto L1dd
            java.nio.ByteBuffer r0 = r7.compressedData
            int r0 = r0.getInt()
            r2 = 67305985(0x4030201, float:1.5399896E-36)
            if (r0 == r2) goto L11c
            r4 = 16909060(0x1020304, float:2.3879393E-38)
            if (r0 != r4) goto L116
            goto L11c
        L116:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            r0.<init>(r3)
            throw r0
        L11c:
            if (r0 == r2) goto L12d
            java.nio.ByteBuffer r0 = r7.compressedData
            java.nio.ByteOrder r2 = r0.order()
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
            if (r2 != r3) goto L12a
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
        L12a:
            r0.order(r3)
        L12d:
            java.nio.ByteBuffer r0 = r7.compressedData
            int r0 = r0.getInt()
            r7.glType = r0
            java.nio.ByteBuffer r0 = r7.compressedData
            int r0 = r0.getInt()
            r7.glTypeSize = r0
            java.nio.ByteBuffer r0 = r7.compressedData
            int r0 = r0.getInt()
            r7.glFormat = r0
            java.nio.ByteBuffer r0 = r7.compressedData
            int r0 = r0.getInt()
            r7.glInternalFormat = r0
            java.nio.ByteBuffer r0 = r7.compressedData
            int r0 = r0.getInt()
            r7.glBaseInternalFormat = r0
            java.nio.ByteBuffer r0 = r7.compressedData
            int r0 = r0.getInt()
            r7.pixelWidth = r0
            java.nio.ByteBuffer r0 = r7.compressedData
            int r0 = r0.getInt()
            r7.pixelHeight = r0
            java.nio.ByteBuffer r0 = r7.compressedData
            int r0 = r0.getInt()
            r7.pixelDepth = r0
            java.nio.ByteBuffer r0 = r7.compressedData
            int r0 = r0.getInt()
            r7.numberOfArrayElements = r0
            java.nio.ByteBuffer r0 = r7.compressedData
            int r0 = r0.getInt()
            r7.numberOfFaces = r0
            java.nio.ByteBuffer r0 = r7.compressedData
            int r0 = r0.getInt()
            r7.numberOfMipmapLevels = r0
            if (r0 != 0) goto L18c
            r0 = 1
            r7.numberOfMipmapLevels = r0
            r7.useMipMaps = r0
        L18c:
            java.nio.ByteBuffer r0 = r7.compressedData
            int r0 = r0.getInt()
            java.nio.ByteBuffer r2 = r7.compressedData
            int r2 = r2.position()
            int r2 = r2 + r0
            r7.imagePos = r2
            java.nio.ByteBuffer r0 = r7.compressedData
            boolean r0 = r0.isDirect()
            if (r0 != 0) goto L1dc
            int r0 = r7.imagePos
            r2 = 0
        L1a6:
            int r3 = r7.numberOfMipmapLevels
            if (r2 >= r3) goto L1be
            java.nio.ByteBuffer r3 = r7.compressedData
            int r3 = r3.getInt(r0)
            int r3 = r3 + 3
            r3 = r3 & (-4)
            int r4 = r7.numberOfFaces
            int r3 = r3 * r4
            int r3 = r3 + 4
            int r0 = r0 + r3
            int r2 = r2 + 1
            goto L1a6
        L1be:
            java.nio.ByteBuffer r2 = r7.compressedData
            r2.limit(r0)
            java.nio.ByteBuffer r2 = r7.compressedData
            r2.position(r1)
            java.nio.ByteBuffer r0 = com.badlogic.gdx.utils.BufferUtils.newUnsafeByteBuffer(r0)
            java.nio.ByteBuffer r1 = r7.compressedData
            java.nio.ByteOrder r1 = r1.order()
            r0.order(r1)
            java.nio.ByteBuffer r1 = r7.compressedData
            r0.put(r1)
            r7.compressedData = r0
        L1dc:
            return
        L1dd:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            r0.<init>(r3)
            throw r0
        L1e3:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            r0.<init>(r3)
            throw r0
        L1e9:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            r0.<init>(r3)
            throw r0
        L1ef:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            r0.<init>(r3)
            throw r0
        L1f5:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            r0.<init>(r3)
            throw r0
        L1fb:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            r0.<init>(r3)
            throw r0
        L201:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            r0.<init>(r3)
            throw r0
        L207:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            r0.<init>(r3)
            throw r0
        L20d:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            r0.<init>(r3)
            throw r0
        L213:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            r0.<init>(r3)
            throw r0
        L219:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            r0.<init>(r3)
            throw r0
        L21f:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            r0.<init>(r3)
            throw r0
        L225:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "Need a file to load from"
            r0.<init>(r1)
            throw r0
        L22d:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "Already prepared"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean useMipMaps() {
            r1 = this;
            boolean r0 = r1.useMipMaps
            return r0
    }
}
