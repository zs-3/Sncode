package com.badlogic.gdx.graphics.glutils;

/* loaded from: classes.dex */
public class PixmapTextureData implements com.badlogic.gdx.graphics.TextureData {
    final boolean disposePixmap;
    final com.badlogic.gdx.graphics.Pixmap.Format format;
    final boolean managed;
    final com.badlogic.gdx.graphics.Pixmap pixmap;
    final boolean useMipMaps;

    public PixmapTextureData(com.badlogic.gdx.graphics.Pixmap r7, com.badlogic.gdx.graphics.Pixmap.Format r8, boolean r9, boolean r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public PixmapTextureData(com.badlogic.gdx.graphics.Pixmap r1, com.badlogic.gdx.graphics.Pixmap.Format r2, boolean r3, boolean r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.pixmap = r1
            if (r2 != 0) goto Lb
            com.badlogic.gdx.graphics.Pixmap$Format r2 = r1.getFormat()
        Lb:
            r0.format = r2
            r0.useMipMaps = r3
            r0.disposePixmap = r4
            r0.managed = r5
            return
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void consumeCustomData(int r2) {
            r1 = this;
            com.badlogic.gdx.utils.GdxRuntimeException r2 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r0 = "This TextureData implementation does not upload data itself"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public com.badlogic.gdx.graphics.Pixmap consumePixmap() {
            r1 = this;
            com.badlogic.gdx.graphics.Pixmap r0 = r1.pixmap
            return r0
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean disposePixmap() {
            r1 = this;
            boolean r0 = r1.disposePixmap
            return r0
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public com.badlogic.gdx.graphics.Pixmap.Format getFormat() {
            r1 = this;
            com.badlogic.gdx.graphics.Pixmap$Format r0 = r1.format
            return r0
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getHeight() {
            r1 = this;
            com.badlogic.gdx.graphics.Pixmap r0 = r1.pixmap
            int r0 = r0.getHeight()
            return r0
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public com.badlogic.gdx.graphics.TextureData.TextureDataType getType() {
            r1 = this;
            com.badlogic.gdx.graphics.TextureData$TextureDataType r0 = com.badlogic.gdx.graphics.TextureData.TextureDataType.Pixmap
            return r0
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getWidth() {
            r1 = this;
            com.badlogic.gdx.graphics.Pixmap r0 = r1.pixmap
            int r0 = r0.getWidth()
            return r0
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean isManaged() {
            r1 = this;
            boolean r0 = r1.managed
            return r0
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean isPrepared() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void prepare() {
            r2 = this;
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "prepare() must not be called on a PixmapTextureData instance as it is already prepared."
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
