package com.badlogic.gdx.graphics.glutils;

/* loaded from: classes.dex */
public class ETC1TextureData implements com.badlogic.gdx.graphics.TextureData {
    com.badlogic.gdx.graphics.glutils.ETC1.ETC1Data data;
    com.badlogic.gdx.files.FileHandle file;
    int height;
    boolean isPrepared;
    boolean useMipMaps;
    int width;

    public ETC1TextureData(com.badlogic.gdx.files.FileHandle r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.width = r0
            r1.height = r0
            r1.isPrepared = r0
            r1.file = r2
            r1.useMipMaps = r3
            return
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void consumeCustomData(int r14) {
            r13 = this;
            boolean r0 = r13.isPrepared
            if (r0 == 0) goto L82
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
            java.lang.String r1 = "GL_OES_compressed_ETC1_RGB8_texture"
            boolean r0 = r0.supportsExtension(r1)
            r1 = 0
            if (r0 != 0) goto L4c
            com.badlogic.gdx.graphics.glutils.ETC1$ETC1Data r0 = r13.data
            com.badlogic.gdx.graphics.Pixmap$Format r2 = com.badlogic.gdx.graphics.Pixmap.Format.RGB565
            com.badlogic.gdx.graphics.Pixmap r0 = com.badlogic.gdx.graphics.glutils.ETC1.decodeImage(r0, r2)
            com.badlogic.gdx.graphics.GL20 r2 = com.badlogic.gdx.Gdx.gl
            r4 = 0
            int r5 = r0.getGLInternalFormat()
            int r6 = r0.getWidth()
            int r7 = r0.getHeight()
            r8 = 0
            int r9 = r0.getGLFormat()
            int r10 = r0.getGLType()
            java.nio.ByteBuffer r11 = r0.getPixels()
            r3 = r14
            r2.glTexImage2D(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r2 = r13.useMipMaps
            if (r2 == 0) goto L46
            int r2 = r0.getWidth()
            int r3 = r0.getHeight()
            com.badlogic.gdx.graphics.glutils.MipMapGenerator.generateMipMap(r14, r0, r2, r3)
        L46:
            r0.dispose()
            r13.useMipMaps = r1
            goto L77
        L4c:
            com.badlogic.gdx.graphics.GL20 r4 = com.badlogic.gdx.Gdx.gl
            r6 = 0
            int r7 = com.badlogic.gdx.graphics.glutils.ETC1.ETC1_RGB8_OES
            int r8 = r13.width
            int r9 = r13.height
            r10 = 0
            com.badlogic.gdx.graphics.glutils.ETC1$ETC1Data r0 = r13.data
            java.nio.ByteBuffer r0 = r0.compressedData
            int r0 = r0.capacity()
            com.badlogic.gdx.graphics.glutils.ETC1$ETC1Data r2 = r13.data
            int r3 = r2.dataOffset
            int r11 = r0 - r3
            java.nio.ByteBuffer r12 = r2.compressedData
            r5 = r14
            r4.glCompressedTexImage2D(r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r14 = r13.useMipMaps()
            if (r14 == 0) goto L77
            com.badlogic.gdx.graphics.GL20 r14 = com.badlogic.gdx.Gdx.gl20
            r0 = 3553(0xde1, float:4.979E-42)
            r14.glGenerateMipmap(r0)
        L77:
            com.badlogic.gdx.graphics.glutils.ETC1$ETC1Data r14 = r13.data
            r14.dispose()
            r14 = 0
            r13.data = r14
            r13.isPrepared = r1
            return
        L82:
            com.badlogic.gdx.utils.GdxRuntimeException r14 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r0 = "Call prepare() before calling consumeCompressedData()"
            r14.<init>(r0)
            throw r14
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

    @Override // com.badlogic.gdx.graphics.TextureData
    public com.badlogic.gdx.graphics.Pixmap.Format getFormat() {
            r1 = this;
            com.badlogic.gdx.graphics.Pixmap$Format r0 = com.badlogic.gdx.graphics.Pixmap.Format.RGB565
            return r0
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getHeight() {
            r1 = this;
            int r0 = r1.height
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
            int r0 = r1.width
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
            boolean r0 = r1.isPrepared
            return r0
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void prepare() {
            r2 = this;
            boolean r0 = r2.isPrepared
            if (r0 != 0) goto L2c
            com.badlogic.gdx.files.FileHandle r0 = r2.file
            if (r0 != 0) goto L15
            com.badlogic.gdx.graphics.glutils.ETC1$ETC1Data r1 = r2.data
            if (r1 == 0) goto Ld
            goto L15
        Ld:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "Can only load once from ETC1Data"
            r0.<init>(r1)
            throw r0
        L15:
            if (r0 == 0) goto L1e
            com.badlogic.gdx.graphics.glutils.ETC1$ETC1Data r1 = new com.badlogic.gdx.graphics.glutils.ETC1$ETC1Data
            r1.<init>(r0)
            r2.data = r1
        L1e:
            com.badlogic.gdx.graphics.glutils.ETC1$ETC1Data r0 = r2.data
            int r1 = r0.width
            r2.width = r1
            int r0 = r0.height
            r2.height = r0
            r0 = 1
            r2.isPrepared = r0
            return
        L2c:
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
