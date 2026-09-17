package org.fortheloss.sticknodes.sprite;

/* loaded from: classes2.dex */
public class SpriteSource implements org.fortheloss.sticknodes.sprite.ISpriteSource {
    private float mDefaultOriginX;
    private float mDefaultOriginY;
    private boolean mHasRawRgbData;
    private float mInternalScaleX;
    private float mInternalScaleY;
    private boolean mIsAntiAlias;
    private boolean mIsTransparent;
    private int mLibraryID;
    private java.lang.String mName;
    private java.lang.String mPixmapFilename;
    private com.badlogic.gdx.graphics.Texture mTexture;


    /* renamed from: -$$Nest$minitTexture, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1346$$Nest$minitTexture(org.fortheloss.sticknodes.sprite.SpriteSource r0, com.badlogic.gdx.graphics.Pixmap r1) {
            r0.initTexture(r1)
            return
    }

    public SpriteSource(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mLibraryID = r0
            r0 = 1
            r1.mIsTransparent = r0
            r1.mIsAntiAlias = r0
            r1.mHasRawRgbData = r0
            r1.mName = r2
            return
    }

    public SpriteSource(java.lang.String r2, com.badlogic.gdx.graphics.Pixmap r3, boolean r4, boolean r5, float r6, float r7, float r8, float r9) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mLibraryID = r0
            r0 = 1
            r1.mHasRawRgbData = r0
            r1.mName = r2
            r1.mIsTransparent = r4
            r1.mIsAntiAlias = r5
            r1.mDefaultOriginX = r6
            r1.mDefaultOriginY = r7
            r1.mInternalScaleX = r8
            r1.mInternalScaleY = r9
            r1.initTexture(r3)
            return
    }

    private void initTexture(com.badlogic.gdx.graphics.Pixmap r14) {
            r13 = this;
            com.badlogic.gdx.graphics.Texture r0 = r13.mTexture
            if (r0 != 0) goto Lc2
            com.badlogic.gdx.graphics.Pixmap$Format r0 = r14.getFormat()
            com.badlogic.gdx.graphics.Pixmap$Format r1 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            com.badlogic.gdx.graphics.Pixmap$Blending r1 = com.badlogic.gdx.graphics.Pixmap.Blending.None
            r14.setBlending(r1)
            java.nio.ByteBuffer r1 = r14.getPixels()
            r1.rewind()
            int r4 = r1.remaining()
            byte[] r5 = new byte[r4]
            r1.get(r5)
            boolean r6 = r13.mHasRawRgbData
            r7 = 0
            if (r6 == 0) goto L83
            if (r0 == 0) goto L83
            boolean r0 = org.fortheloss.sticknodes.App.STORAGE_LIMITED
            if (r0 != 0) goto L38
            java.lang.String r0 = org.fortheloss.sticknodes.App.pixmapBytesToFile(r5)
            r13.mPixmapFilename = r0
            goto L3c
        L38:
            r13.mPixmapFilename = r7
            r13.mHasRawRgbData = r3
        L3c:
            r0 = 0
        L3d:
            if (r0 >= r4) goto L94
            r6 = r5[r0]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r7 = r0 + 1
            r8 = r5[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r9 = r0 + 2
            r10 = r5[r9]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r11 = r0 + 3
            r11 = r5[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            if (r11 != 0) goto L5b
            r6 = 0
            r8 = 0
            r10 = 0
            goto L74
        L5b:
            float r6 = (float) r6
            float r11 = (float) r11
            r12 = 1132396544(0x437f0000, float:255.0)
            float r11 = r11 / r12
            float r6 = r6 * r11
            int r6 = java.lang.Math.round(r6)
            float r8 = (float) r8
            float r8 = r8 * r11
            int r8 = java.lang.Math.round(r8)
            float r10 = (float) r10
            float r10 = r10 * r11
            int r10 = java.lang.Math.round(r10)
        L74:
            byte r6 = (byte) r6
            r1.put(r0, r6)
            byte r6 = (byte) r8
            r1.put(r7, r6)
            byte r6 = (byte) r10
            r1.put(r9, r6)
            int r0 = r0 + 4
            goto L3d
        L83:
            if (r6 == 0) goto L90
            boolean r0 = org.fortheloss.sticknodes.App.STORAGE_LIMITED
            if (r0 != 0) goto L90
            java.lang.String r0 = org.fortheloss.sticknodes.App.pixmapBytesToFile(r5)
            r13.mPixmapFilename = r0
            goto L94
        L90:
            r13.mPixmapFilename = r7
            r13.mHasRawRgbData = r3
        L94:
            java.lang.String r0 = r13.mPixmapFilename
            if (r0 == 0) goto L9a
            r8 = 1
            goto L9b
        L9a:
            r8 = 0
        L9b:
            r1.rewind()
            com.badlogic.gdx.graphics.Texture r0 = new com.badlogic.gdx.graphics.Texture
            com.badlogic.gdx.graphics.glutils.PixmapTextureData r1 = new com.badlogic.gdx.graphics.glutils.PixmapTextureData
            com.badlogic.gdx.graphics.Pixmap$Format r6 = r14.getFormat()
            r7 = 0
            r9 = 0
            r4 = r1
            r5 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            r0.<init>(r1)
            r13.mTexture = r0
            boolean r14 = r13.mIsAntiAlias
            if (r14 == 0) goto Lbc
            com.badlogic.gdx.graphics.Texture$TextureFilter r14 = com.badlogic.gdx.graphics.Texture.TextureFilter.Linear
            r0.setFilter(r14, r14)
            goto Lc1
        Lbc:
            com.badlogic.gdx.graphics.Texture$TextureFilter r14 = com.badlogic.gdx.graphics.Texture.TextureFilter.Nearest
            r0.setFilter(r14, r14)
        Lc1:
            return
        Lc2:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Texture is already initialized"
            r14.<init>(r0)
            throw r14
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2.mName = r0
            r2.mPixmapFilename = r0
            com.badlogic.gdx.graphics.Texture r1 = r2.mTexture
            if (r1 == 0) goto Le
            r1.dispose()
            r2.mTexture = r0
        Le:
            return
    }

    public float getInternalScaleX() {
            r1 = this;
            float r0 = r1.mInternalScaleX
            return r0
    }

    public float getInternalScaleY() {
            r1 = this;
            float r0 = r1.mInternalScaleY
            return r0
    }

    @Override // org.fortheloss.sticknodes.sprite.ISpriteSource
    public int getLibraryId() {
            r1 = this;
            int r0 = r1.mLibraryID
            return r0
    }

    @Override // org.fortheloss.sticknodes.sprite.ISpriteSource
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.mName
            return r0
    }

    public float getOriginX() {
            r1 = this;
            float r0 = r1.mDefaultOriginX
            return r0
    }

    public float getOriginY() {
            r1 = this;
            float r0 = r1.mDefaultOriginY
            return r0
    }

    public byte[] getPixels() {
            r4 = this;
            java.lang.String r0 = r4.mPixmapFilename
            byte[] r0 = org.fortheloss.sticknodes.App.getPixmapBytesFromFile(r0)
            if (r0 != 0) goto L57
            com.badlogic.gdx.graphics.Texture r0 = r4.mTexture
            com.badlogic.gdx.graphics.TextureData r0 = r0.getTextureData()
            boolean r0 = r0.isPrepared()
            if (r0 != 0) goto L1d
            com.badlogic.gdx.graphics.Texture r0 = r4.mTexture
            com.badlogic.gdx.graphics.TextureData r0 = r0.getTextureData()
            r0.prepare()
        L1d:
            com.badlogic.gdx.graphics.Texture r0 = r4.mTexture
            com.badlogic.gdx.graphics.TextureData r0 = r0.getTextureData()
            com.badlogic.gdx.graphics.Pixmap r0 = r0.consumePixmap()
            boolean r1 = r0.isDisposed()
            java.lang.String r2 = "error"
            if (r1 != 0) goto L48
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            java.lang.String r3 = "sprite_save_issue_no_file_pixmap"
            r1.analyticsSendEvent(r2, r3)
            java.nio.ByteBuffer r0 = r0.getPixels()
            r0.rewind()
            int r1 = r0.remaining()
            byte[] r1 = new byte[r1]
            r0.get(r1)
            r0 = r1
            goto L57
        L48:
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "sprite_save_issue_no_texture_pixmap"
            r0.analyticsSendEvent(r2, r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Pixmap is null yo"
            r0.<init>(r1)
            throw r0
        L57:
            return r0
    }

    public com.badlogic.gdx.graphics.Texture getTexture() {
            r1 = this;
            com.badlogic.gdx.graphics.Texture r0 = r1.mTexture
            return r0
    }

    public boolean hasPixmapFile() {
            r1 = this;
            java.lang.String r0 = r1.mPixmapFilename
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean hasRawRgbData() {
            r1 = this;
            boolean r0 = r1.mHasRawRgbData
            return r0
    }

    @Override // org.fortheloss.sticknodes.sprite.ISpriteSource
    public void readLibraryData(int r8, int r9, java.io.DataInputStream r10) throws java.io.IOException {
            r7 = this;
            int r8 = r10.read()
            r0 = 1
            r1 = 0
            if (r8 == 0) goto La
            r8 = 1
            goto Lb
        La:
            r8 = 0
        Lb:
            r7.mIsTransparent = r8
            int r8 = r10.read()
            if (r8 == 0) goto L15
            r8 = 1
            goto L16
        L15:
            r8 = 0
        L16:
            r7.mIsAntiAlias = r8
            float r8 = r10.readFloat()
            r7.mDefaultOriginX = r8
            float r8 = r10.readFloat()
            r7.mDefaultOriginY = r8
            float r8 = r10.readFloat()
            r7.mInternalScaleX = r8
            float r8 = r10.readFloat()
            r7.mInternalScaleY = r8
            r8 = 9
            if (r9 < r8) goto L3d
            int r8 = r10.read()
            if (r8 == 0) goto L3b
            goto L3d
        L3b:
            r8 = 0
            goto L3e
        L3d:
            r8 = 1
        L3e:
            r7.mHasRawRgbData = r8
            int r8 = r10.readInt()
            int r9 = r10.readInt()
            int r2 = r10.readInt()
            byte[] r3 = new byte[r2]
            r10.readFully(r3, r1, r2)
            com.badlogic.gdx.graphics.Pixmap r10 = new com.badlogic.gdx.graphics.Pixmap
            boolean r4 = r7.mIsTransparent
            if (r4 == 0) goto L5a
            com.badlogic.gdx.graphics.Pixmap$Format r4 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888
            goto L5c
        L5a:
            com.badlogic.gdx.graphics.Pixmap$Format r4 = com.badlogic.gdx.graphics.Pixmap.Format.RGB888
        L5c:
            r10.<init>(r8, r9, r4)
            boolean r9 = r7.mIsTransparent
            if (r9 == 0) goto L90
            r9 = 0
        L64:
            if (r1 >= r2) goto Lb8
            r4 = r3[r1]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 24
            int r5 = r1 + 1
            r5 = r3[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 16
            r4 = r4 | r5
            int r5 = r1 + 2
            r5 = r3[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            r4 = r4 | r5
            int r5 = r1 + 3
            r5 = r3[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r4 = r4 | r5
            int r5 = r9 % r8
            int r6 = r9 / r8
            r10.drawPixel(r5, r6, r4)
            int r1 = r1 + 4
            int r9 = r9 + r0
            goto L64
        L90:
            r9 = 0
        L91:
            if (r1 >= r2) goto Lb8
            r4 = r3[r1]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 24
            int r5 = r1 + 1
            r5 = r3[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 16
            r4 = r4 | r5
            int r5 = r1 + 2
            r5 = r3[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            r4 = r4 | r5
            r4 = r4 | 255(0xff, float:3.57E-43)
            int r5 = r9 % r8
            int r6 = r9 / r8
            r10.drawPixel(r5, r6, r4)
            int r1 = r1 + 3
            int r9 = r9 + r0
            goto L91
        Lb8:
            com.badlogic.gdx.Application r8 = com.badlogic.gdx.Gdx.app
            org.fortheloss.sticknodes.sprite.SpriteSource$1 r9 = new org.fortheloss.sticknodes.sprite.SpriteSource$1
            r9.<init>(r7, r10)
            r8.postRunnable(r9)
            return
    }

    @Override // org.fortheloss.sticknodes.sprite.ISpriteSource
    public void setLibraryId(int r1) {
            r0 = this;
            r0.mLibraryID = r1
            return
    }

    @Override // org.fortheloss.sticknodes.sprite.ISpriteSource
    public void setName(java.lang.String r1) {
            r0 = this;
            r0.mName = r1
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.mName
            return r0
    }

    @Override // org.fortheloss.sticknodes.sprite.ISpriteSource
    public void writeLibraryData(java.io.OutputStream r4) throws java.io.IOException {
            r3 = this;
            boolean r0 = r3.mIsTransparent
            r4.write(r0)
            boolean r0 = r3.mIsAntiAlias
            r4.write(r0)
            float r0 = r3.mDefaultOriginX
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r4)
            float r0 = r3.mDefaultOriginY
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r4)
            float r0 = r3.mInternalScaleX
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r4)
            float r0 = r3.mInternalScaleY
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r4)
            boolean r0 = r3.mHasRawRgbData
            r1 = 0
            if (r0 == 0) goto L33
            java.lang.String r0 = r3.mPixmapFilename
            if (r0 == 0) goto L33
            byte[] r0 = org.fortheloss.sticknodes.App.getPixmapBytesFromFile(r0)
            if (r0 != 0) goto L2e
            goto L33
        L2e:
            r0 = 1
            r4.write(r0)
            goto L36
        L33:
            r4.write(r1)
        L36:
            byte[] r0 = r3.getPixels()
            com.badlogic.gdx.graphics.Texture r2 = r3.mTexture
            int r2 = r2.getWidth()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r2, r4)
            com.badlogic.gdx.graphics.Texture r2 = r3.mTexture
            int r2 = r2.getHeight()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r2, r4)
            int r2 = r0.length
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r2, r4)
            int r2 = r0.length
            r4.write(r0, r1, r2)
            return
    }
}
