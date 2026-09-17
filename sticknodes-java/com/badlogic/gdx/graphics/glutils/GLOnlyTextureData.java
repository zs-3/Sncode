package com.badlogic.gdx.graphics.glutils;

/* loaded from: classes.dex */
public class GLOnlyTextureData implements com.badlogic.gdx.graphics.TextureData {
    int format;
    int height;
    int internalFormat;
    boolean isPrepared;
    int mipLevel;
    int type;
    int width;

    public GLOnlyTextureData(int r2, int r3, int r4, int r5, int r6, int r7) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.isPrepared = r0
            r1.width = r2
            r1.height = r3
            r1.mipLevel = r4
            r1.internalFormat = r5
            r1.format = r6
            r1.type = r7
            return
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void consumeCustomData(int r11) {
            r10 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            int r2 = r10.mipLevel
            int r3 = r10.internalFormat
            int r4 = r10.width
            int r5 = r10.height
            int r7 = r10.format
            int r8 = r10.type
            r6 = 0
            r9 = 0
            r1 = r11
            r0.glTexImage2D(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
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
            com.badlogic.gdx.graphics.Pixmap$Format r0 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888
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
            r0 = 0
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
            if (r0 != 0) goto L8
            r0 = 1
            r2.isPrepared = r0
            return
        L8:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "Already prepared"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean useMipMaps() {
            r1 = this;
            r0 = 0
            return r0
    }
}
