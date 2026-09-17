package com.badlogic.gdx.graphics.glutils;

/* loaded from: classes.dex */
public class FileTextureData implements com.badlogic.gdx.graphics.TextureData {
    final com.badlogic.gdx.files.FileHandle file;
    com.badlogic.gdx.graphics.Pixmap.Format format;
    int height;
    boolean isPrepared;
    com.badlogic.gdx.graphics.Pixmap pixmap;
    boolean useMipMaps;
    int width;

    public FileTextureData(com.badlogic.gdx.files.FileHandle r2, com.badlogic.gdx.graphics.Pixmap r3, com.badlogic.gdx.graphics.Pixmap.Format r4, boolean r5) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.width = r0
            r1.height = r0
            r1.isPrepared = r0
            r1.file = r2
            r1.pixmap = r3
            r1.format = r4
            r1.useMipMaps = r5
            if (r3 == 0) goto L2c
            int r2 = r3.getWidth()
            r1.width = r2
            com.badlogic.gdx.graphics.Pixmap r2 = r1.pixmap
            int r2 = r2.getHeight()
            r1.height = r2
            if (r4 != 0) goto L2c
            com.badlogic.gdx.graphics.Pixmap r2 = r1.pixmap
            com.badlogic.gdx.graphics.Pixmap$Format r2 = r2.getFormat()
            r1.format = r2
        L2c:
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
            r2 = this;
            boolean r0 = r2.isPrepared
            if (r0 == 0) goto Ld
            r0 = 0
            r2.isPrepared = r0
            com.badlogic.gdx.graphics.Pixmap r0 = r2.pixmap
            r1 = 0
            r2.pixmap = r1
            return r0
        Ld:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "Call prepare() before calling getPixmap()"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean disposePixmap() {
            r1 = this;
            r0 = 1
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
            int r0 = r1.height
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
            if (r0 != 0) goto L48
            com.badlogic.gdx.graphics.Pixmap r0 = r2.pixmap
            if (r0 != 0) goto L44
            com.badlogic.gdx.files.FileHandle r0 = r2.file
            java.lang.String r0 = r0.extension()
            java.lang.String r1 = "cim"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1f
            com.badlogic.gdx.files.FileHandle r0 = r2.file
            com.badlogic.gdx.graphics.Pixmap r0 = com.badlogic.gdx.graphics.PixmapIO.readCIM(r0)
            r2.pixmap = r0
            goto L28
        L1f:
            com.badlogic.gdx.graphics.Pixmap r0 = new com.badlogic.gdx.graphics.Pixmap
            com.badlogic.gdx.files.FileHandle r1 = r2.file
            r0.<init>(r1)
            r2.pixmap = r0
        L28:
            com.badlogic.gdx.graphics.Pixmap r0 = r2.pixmap
            int r0 = r0.getWidth()
            r2.width = r0
            com.badlogic.gdx.graphics.Pixmap r0 = r2.pixmap
            int r0 = r0.getHeight()
            r2.height = r0
            com.badlogic.gdx.graphics.Pixmap$Format r0 = r2.format
            if (r0 != 0) goto L44
            com.badlogic.gdx.graphics.Pixmap r0 = r2.pixmap
            com.badlogic.gdx.graphics.Pixmap$Format r0 = r0.getFormat()
            r2.format = r0
        L44:
            r0 = 1
            r2.isPrepared = r0
            return
        L48:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "Already prepared"
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String toString() {
            r1 = this;
            com.badlogic.gdx.files.FileHandle r0 = r1.file
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean useMipMaps() {
            r1 = this;
            boolean r0 = r1.useMipMaps
            return r0
    }
}
