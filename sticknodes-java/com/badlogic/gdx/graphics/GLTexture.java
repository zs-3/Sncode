package com.badlogic.gdx.graphics;

/* loaded from: classes.dex */
public abstract class GLTexture implements com.badlogic.gdx.utils.Disposable {
    private static float maxAnisotropicFilterLevel;
    protected float anisotropicFilterLevel;
    protected int glHandle;
    public final int glTarget;
    protected com.badlogic.gdx.graphics.Texture.TextureFilter magFilter;
    protected com.badlogic.gdx.graphics.Texture.TextureFilter minFilter;
    protected com.badlogic.gdx.graphics.Texture.TextureWrap uWrap;
    protected com.badlogic.gdx.graphics.Texture.TextureWrap vWrap;

    static {
            return
    }

    public GLTexture(int r2) {
            r1 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            int r0 = r0.glGenTexture()
            r1.<init>(r2, r0)
            return
    }

    public GLTexture(int r2, int r3) {
            r1 = this;
            r1.<init>()
            com.badlogic.gdx.graphics.Texture$TextureFilter r0 = com.badlogic.gdx.graphics.Texture.TextureFilter.Nearest
            r1.minFilter = r0
            r1.magFilter = r0
            com.badlogic.gdx.graphics.Texture$TextureWrap r0 = com.badlogic.gdx.graphics.Texture.TextureWrap.ClampToEdge
            r1.uWrap = r0
            r1.vWrap = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.anisotropicFilterLevel = r0
            r1.glTarget = r2
            r1.glHandle = r3
            return
    }

    public static float getMaxAnisotropicFilterLevel() {
            float r0 = com.badlogic.gdx.graphics.GLTexture.maxAnisotropicFilterLevel
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L8
            return r0
        L8:
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
            java.lang.String r1 = "GL_EXT_texture_filter_anisotropic"
            boolean r0 = r0.supportsExtension(r1)
            if (r0 == 0) goto L32
            r0 = 16
            java.nio.FloatBuffer r0 = com.badlogic.gdx.utils.BufferUtils.newFloatBuffer(r0)
            r1 = 0
            r0.position(r1)
            int r2 = r0.capacity()
            r0.limit(r2)
            com.badlogic.gdx.graphics.GL20 r2 = com.badlogic.gdx.Gdx.gl20
            r3 = 34047(0x84ff, float:4.771E-41)
            r2.glGetFloatv(r3, r0)
            float r0 = r0.get(r1)
            com.badlogic.gdx.graphics.GLTexture.maxAnisotropicFilterLevel = r0
            return r0
        L32:
            r0 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.graphics.GLTexture.maxAnisotropicFilterLevel = r0
            return r0
    }

    protected static void uploadImageData(int r1, com.badlogic.gdx.graphics.TextureData r2) {
            r0 = 0
            uploadImageData(r1, r2, r0)
            return
    }

    public static void uploadImageData(int r12, com.badlogic.gdx.graphics.TextureData r13, int r14) {
            if (r13 != 0) goto L3
            return
        L3:
            boolean r0 = r13.isPrepared()
            if (r0 != 0) goto Lc
            r13.prepare()
        Lc:
            com.badlogic.gdx.graphics.TextureData$TextureDataType r0 = r13.getType()
            com.badlogic.gdx.graphics.TextureData$TextureDataType r1 = com.badlogic.gdx.graphics.TextureData.TextureDataType.Custom
            if (r0 != r1) goto L18
            r13.consumeCustomData(r12)
            return
        L18:
            com.badlogic.gdx.graphics.Pixmap r0 = r13.consumePixmap()
            boolean r1 = r13.disposePixmap()
            com.badlogic.gdx.graphics.Pixmap$Format r2 = r13.getFormat()
            com.badlogic.gdx.graphics.Pixmap$Format r3 = r0.getFormat()
            r10 = 1
            if (r2 == r3) goto L5d
            com.badlogic.gdx.graphics.Pixmap r1 = new com.badlogic.gdx.graphics.Pixmap
            int r2 = r0.getWidth()
            int r3 = r0.getHeight()
            com.badlogic.gdx.graphics.Pixmap$Format r4 = r13.getFormat()
            r1.<init>(r2, r3, r4)
            com.badlogic.gdx.graphics.Pixmap$Blending r2 = com.badlogic.gdx.graphics.Pixmap.Blending.None
            r1.setBlending(r2)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            int r8 = r0.getWidth()
            int r9 = r0.getHeight()
            r2 = r1
            r3 = r0
            r2.drawPixmap(r3, r4, r5, r6, r7, r8, r9)
            boolean r2 = r13.disposePixmap()
            if (r2 == 0) goto L5b
            r0.dispose()
        L5b:
            r0 = r1
            r1 = 1
        L5d:
            com.badlogic.gdx.graphics.GL20 r2 = com.badlogic.gdx.Gdx.gl
            r3 = 3317(0xcf5, float:4.648E-42)
            r2.glPixelStorei(r3, r10)
            boolean r13 = r13.useMipMaps()
            if (r13 == 0) goto L76
            int r13 = r0.getWidth()
            int r14 = r0.getHeight()
            com.badlogic.gdx.graphics.glutils.MipMapGenerator.generateMipMap(r12, r0, r13, r14)
            goto L96
        L76:
            com.badlogic.gdx.graphics.GL20 r2 = com.badlogic.gdx.Gdx.gl
            int r5 = r0.getGLInternalFormat()
            int r6 = r0.getWidth()
            int r7 = r0.getHeight()
            r8 = 0
            int r9 = r0.getGLFormat()
            int r10 = r0.getGLType()
            java.nio.ByteBuffer r11 = r0.getPixels()
            r3 = r12
            r4 = r14
            r2.glTexImage2D(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L96:
            if (r1 == 0) goto L9b
            r0.dispose()
        L9b:
            return
    }

    public void bind() {
            r3 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            int r1 = r3.glTarget
            int r2 = r3.glHandle
            r0.glBindTexture(r1, r2)
            return
    }

    protected void delete() {
            r2 = this;
            int r0 = r2.glHandle
            if (r0 == 0) goto Lc
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r1.glDeleteTexture(r0)
            r0 = 0
            r2.glHandle = r0
        Lc:
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r0 = this;
            r0.delete()
            return
    }

    public com.badlogic.gdx.graphics.Texture.TextureFilter getMagFilter() {
            r1 = this;
            com.badlogic.gdx.graphics.Texture$TextureFilter r0 = r1.magFilter
            return r0
    }

    public com.badlogic.gdx.graphics.Texture.TextureFilter getMinFilter() {
            r1 = this;
            com.badlogic.gdx.graphics.Texture$TextureFilter r0 = r1.minFilter
            return r0
    }

    public int getTextureObjectHandle() {
            r1 = this;
            int r0 = r1.glHandle
            return r0
    }

    public com.badlogic.gdx.graphics.Texture.TextureWrap getUWrap() {
            r1 = this;
            com.badlogic.gdx.graphics.Texture$TextureWrap r0 = r1.uWrap
            return r0
    }

    public com.badlogic.gdx.graphics.Texture.TextureWrap getVWrap() {
            r1 = this;
            com.badlogic.gdx.graphics.Texture$TextureWrap r0 = r1.vWrap
            return r0
    }

    public void setFilter(com.badlogic.gdx.graphics.Texture.TextureFilter r4, com.badlogic.gdx.graphics.Texture.TextureFilter r5) {
            r3 = this;
            r3.minFilter = r4
            r3.magFilter = r5
            r3.bind()
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            int r1 = r3.glTarget
            int r4 = r4.getGLEnum()
            r2 = 10241(0x2801, float:1.435E-41)
            r0.glTexParameteri(r1, r2, r4)
            com.badlogic.gdx.graphics.GL20 r4 = com.badlogic.gdx.Gdx.gl
            int r0 = r3.glTarget
            int r5 = r5.getGLEnum()
            r1 = 10240(0x2800, float:1.4349E-41)
            r4.glTexParameteri(r0, r1, r5)
            return
    }

    public void setWrap(com.badlogic.gdx.graphics.Texture.TextureWrap r4, com.badlogic.gdx.graphics.Texture.TextureWrap r5) {
            r3 = this;
            r3.uWrap = r4
            r3.vWrap = r5
            r3.bind()
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            int r1 = r3.glTarget
            int r4 = r4.getGLEnum()
            r2 = 10242(0x2802, float:1.4352E-41)
            r0.glTexParameteri(r1, r2, r4)
            com.badlogic.gdx.graphics.GL20 r4 = com.badlogic.gdx.Gdx.gl
            int r0 = r3.glTarget
            int r5 = r5.getGLEnum()
            r1 = 10243(0x2803, float:1.4354E-41)
            r4.glTexParameteri(r0, r1, r5)
            return
    }

    public float unsafeSetAnisotropicFilter(float r4, boolean r5) {
            r3 = this;
            float r0 = getMaxAnisotropicFilterLevel()
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto Lb
            return r1
        Lb:
            float r4 = java.lang.Math.min(r4, r0)
            if (r5 != 0) goto L1f
            float r5 = r3.anisotropicFilterLevel
            r0 = 1036831949(0x3dcccccd, float:0.1)
            boolean r5 = com.badlogic.gdx.math.MathUtils.isEqual(r4, r5, r0)
            if (r5 == 0) goto L1f
            float r4 = r3.anisotropicFilterLevel
            return r4
        L1f:
            com.badlogic.gdx.graphics.GL20 r5 = com.badlogic.gdx.Gdx.gl20
            r0 = 3553(0xde1, float:4.979E-42)
            r1 = 34046(0x84fe, float:4.7709E-41)
            r5.glTexParameterf(r0, r1, r4)
            r3.anisotropicFilterLevel = r4
            return r4
    }

    public void unsafeSetFilter(com.badlogic.gdx.graphics.Texture.TextureFilter r5, com.badlogic.gdx.graphics.Texture.TextureFilter r6, boolean r7) {
            r4 = this;
            if (r5 == 0) goto L17
            if (r7 != 0) goto L8
            com.badlogic.gdx.graphics.Texture$TextureFilter r0 = r4.minFilter
            if (r0 == r5) goto L17
        L8:
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            int r1 = r4.glTarget
            r2 = 10241(0x2801, float:1.435E-41)
            int r3 = r5.getGLEnum()
            r0.glTexParameteri(r1, r2, r3)
            r4.minFilter = r5
        L17:
            if (r6 == 0) goto L2e
            if (r7 != 0) goto L1f
            com.badlogic.gdx.graphics.Texture$TextureFilter r5 = r4.magFilter
            if (r5 == r6) goto L2e
        L1f:
            com.badlogic.gdx.graphics.GL20 r5 = com.badlogic.gdx.Gdx.gl
            int r7 = r4.glTarget
            r0 = 10240(0x2800, float:1.4349E-41)
            int r1 = r6.getGLEnum()
            r5.glTexParameteri(r7, r0, r1)
            r4.magFilter = r6
        L2e:
            return
    }

    public void unsafeSetWrap(com.badlogic.gdx.graphics.Texture.TextureWrap r5, com.badlogic.gdx.graphics.Texture.TextureWrap r6, boolean r7) {
            r4 = this;
            if (r5 == 0) goto L17
            if (r7 != 0) goto L8
            com.badlogic.gdx.graphics.Texture$TextureWrap r0 = r4.uWrap
            if (r0 == r5) goto L17
        L8:
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            int r1 = r4.glTarget
            r2 = 10242(0x2802, float:1.4352E-41)
            int r3 = r5.getGLEnum()
            r0.glTexParameteri(r1, r2, r3)
            r4.uWrap = r5
        L17:
            if (r6 == 0) goto L2e
            if (r7 != 0) goto L1f
            com.badlogic.gdx.graphics.Texture$TextureWrap r5 = r4.vWrap
            if (r5 == r6) goto L2e
        L1f:
            com.badlogic.gdx.graphics.GL20 r5 = com.badlogic.gdx.Gdx.gl
            int r7 = r4.glTarget
            r0 = 10243(0x2803, float:1.4354E-41)
            int r1 = r6.getGLEnum()
            r5.glTexParameteri(r7, r0, r1)
            r4.vWrap = r6
        L2e:
            return
    }
}
