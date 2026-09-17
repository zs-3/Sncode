package com.badlogic.gdx.graphics;

/* loaded from: classes.dex */
public class TextureArray extends com.badlogic.gdx.graphics.GLTexture {
    static final java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.TextureArray>> managedTextureArrays = null;
    private com.badlogic.gdx.graphics.TextureArrayData data;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.badlogic.gdx.graphics.TextureArray.managedTextureArrays = r0
            return
    }

    public static void clearAllTextureArrays(com.badlogic.gdx.Application r1) {
            java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.TextureArray>> r0 = com.badlogic.gdx.graphics.TextureArray.managedTextureArrays
            r0.remove(r1)
            return
    }

    public static void invalidateAllTextureArrays(com.badlogic.gdx.Application r2) {
            java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.TextureArray>> r0 = com.badlogic.gdx.graphics.TextureArray.managedTextureArrays
            java.lang.Object r2 = r0.get(r2)
            com.badlogic.gdx.utils.Array r2 = (com.badlogic.gdx.utils.Array) r2
            if (r2 != 0) goto Lb
            return
        Lb:
            r0 = 0
        Lc:
            int r1 = r2.size
            if (r0 >= r1) goto L1c
            java.lang.Object r1 = r2.get(r0)
            com.badlogic.gdx.graphics.TextureArray r1 = (com.badlogic.gdx.graphics.TextureArray) r1
            r1.reload()
            int r0 = r0 + 1
            goto Lc
        L1c:
            return
    }

    private void load(com.badlogic.gdx.graphics.TextureArrayData r13) {
            r12 = this;
            com.badlogic.gdx.graphics.TextureArrayData r0 = r12.data
            if (r0 == 0) goto L19
            boolean r0 = r13.isManaged()
            com.badlogic.gdx.graphics.TextureArrayData r1 = r12.data
            boolean r1 = r1.isManaged()
            if (r0 != r1) goto L11
            goto L19
        L11:
            com.badlogic.gdx.utils.GdxRuntimeException r13 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r0 = "New data must have the same managed status as the old data"
            r13.<init>(r0)
            throw r13
        L19:
            r12.data = r13
            r12.bind()
            com.badlogic.gdx.graphics.GL30 r1 = com.badlogic.gdx.Gdx.gl30
            r2 = 35866(0x8c1a, float:5.0259E-41)
            r3 = 0
            int r4 = r13.getInternalFormat()
            int r5 = r13.getWidth()
            int r6 = r13.getHeight()
            int r7 = r13.getDepth()
            r8 = 0
            int r9 = r13.getInternalFormat()
            int r10 = r13.getGLType()
            r11 = 0
            r1.glTexImage3D(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = r13.isPrepared()
            if (r0 != 0) goto L4a
            r13.prepare()
        L4a:
            r13.consumeTextureArrayData()
            com.badlogic.gdx.graphics.Texture$TextureFilter r13 = r12.minFilter
            com.badlogic.gdx.graphics.Texture$TextureFilter r0 = r12.magFilter
            r12.setFilter(r13, r0)
            com.badlogic.gdx.graphics.Texture$TextureWrap r13 = r12.uWrap
            com.badlogic.gdx.graphics.Texture$TextureWrap r0 = r12.vWrap
            r12.setWrap(r13, r0)
            com.badlogic.gdx.graphics.GL20 r13 = com.badlogic.gdx.Gdx.gl
            int r0 = r12.glTarget
            r1 = 0
            r13.glBindTexture(r0, r1)
            return
    }

    public boolean isManaged() {
            r1 = this;
            com.badlogic.gdx.graphics.TextureArrayData r0 = r1.data
            boolean r0 = r0.isManaged()
            return r0
    }

    protected void reload() {
            r2 = this;
            boolean r0 = r2.isManaged()
            if (r0 == 0) goto L14
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            int r0 = r0.glGenTexture()
            r2.glHandle = r0
            com.badlogic.gdx.graphics.TextureArrayData r0 = r2.data
            r2.load(r0)
            return
        L14:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "Tried to reload an unmanaged TextureArray"
            r0.<init>(r1)
            throw r0
    }
}
