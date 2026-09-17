package com.badlogic.gdx.graphics.g3d.utils;

import com.badlogic.gdx.graphics.GLTexture;

/* loaded from: classes.dex */
public class TextureDescriptor<T extends com.badlogic.gdx.graphics.GLTexture> implements java.lang.Comparable<com.badlogic.gdx.graphics.g3d.utils.TextureDescriptor<T>> {
    public com.badlogic.gdx.graphics.Texture.TextureFilter magFilter;
    public com.badlogic.gdx.graphics.Texture.TextureFilter minFilter;
    public T texture;
    public com.badlogic.gdx.graphics.Texture.TextureWrap uWrap;
    public com.badlogic.gdx.graphics.Texture.TextureWrap vWrap;

    public TextureDescriptor() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.texture = r0
            return
    }

    public TextureDescriptor(T r7) {
            r6 = this;
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public TextureDescriptor(T r2, com.badlogic.gdx.graphics.Texture.TextureFilter r3, com.badlogic.gdx.graphics.Texture.TextureFilter r4, com.badlogic.gdx.graphics.Texture.TextureWrap r5, com.badlogic.gdx.graphics.Texture.TextureWrap r6) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.texture = r0
            r1.set(r2, r3, r4, r5, r6)
            return
    }

    public int compareTo(com.badlogic.gdx.graphics.g3d.utils.TextureDescriptor<T> r5) {
            r4 = this;
            r0 = 0
            if (r5 != r4) goto L4
            return r0
        L4:
            T extends com.badlogic.gdx.graphics.GLTexture r1 = r4.texture
            if (r1 != 0) goto La
            r2 = 0
            goto Lc
        La:
            int r2 = r1.glTarget
        Lc:
            T extends com.badlogic.gdx.graphics.GLTexture r3 = r5.texture
            if (r3 != 0) goto L12
            r3 = 0
            goto L14
        L12:
            int r3 = r3.glTarget
        L14:
            if (r2 == r3) goto L18
            int r2 = r2 - r3
            return r2
        L18:
            if (r1 != 0) goto L1c
            r1 = 0
            goto L20
        L1c:
            int r1 = r1.getTextureObjectHandle()
        L20:
            T extends com.badlogic.gdx.graphics.GLTexture r2 = r5.texture
            if (r2 != 0) goto L26
            r2 = 0
            goto L2a
        L26:
            int r2 = r2.getTextureObjectHandle()
        L2a:
            if (r1 == r2) goto L2e
            int r1 = r1 - r2
            return r1
        L2e:
            com.badlogic.gdx.graphics.Texture$TextureFilter r1 = r4.minFilter
            com.badlogic.gdx.graphics.Texture$TextureFilter r2 = r5.minFilter
            if (r1 == r2) goto L47
            if (r1 != 0) goto L38
            r1 = 0
            goto L3c
        L38:
            int r1 = r1.getGLEnum()
        L3c:
            com.badlogic.gdx.graphics.Texture$TextureFilter r5 = r5.minFilter
            if (r5 != 0) goto L41
            goto L45
        L41:
            int r0 = r5.getGLEnum()
        L45:
            int r1 = r1 - r0
            return r1
        L47:
            com.badlogic.gdx.graphics.Texture$TextureFilter r1 = r4.magFilter
            com.badlogic.gdx.graphics.Texture$TextureFilter r2 = r5.magFilter
            if (r1 == r2) goto L60
            if (r1 != 0) goto L51
            r1 = 0
            goto L55
        L51:
            int r1 = r1.getGLEnum()
        L55:
            com.badlogic.gdx.graphics.Texture$TextureFilter r5 = r5.magFilter
            if (r5 != 0) goto L5a
            goto L5e
        L5a:
            int r0 = r5.getGLEnum()
        L5e:
            int r1 = r1 - r0
            return r1
        L60:
            com.badlogic.gdx.graphics.Texture$TextureWrap r1 = r4.uWrap
            com.badlogic.gdx.graphics.Texture$TextureWrap r2 = r5.uWrap
            if (r1 == r2) goto L79
            if (r1 != 0) goto L6a
            r1 = 0
            goto L6e
        L6a:
            int r1 = r1.getGLEnum()
        L6e:
            com.badlogic.gdx.graphics.Texture$TextureWrap r5 = r5.uWrap
            if (r5 != 0) goto L73
            goto L77
        L73:
            int r0 = r5.getGLEnum()
        L77:
            int r1 = r1 - r0
            return r1
        L79:
            com.badlogic.gdx.graphics.Texture$TextureWrap r1 = r4.vWrap
            com.badlogic.gdx.graphics.Texture$TextureWrap r2 = r5.vWrap
            if (r1 == r2) goto L92
            if (r1 != 0) goto L83
            r1 = 0
            goto L87
        L83:
            int r1 = r1.getGLEnum()
        L87:
            com.badlogic.gdx.graphics.Texture$TextureWrap r5 = r5.vWrap
            if (r5 != 0) goto L8c
            goto L90
        L8c:
            int r0 = r5.getGLEnum()
        L90:
            int r1 = r1 - r0
            return r1
        L92:
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            com.badlogic.gdx.graphics.g3d.utils.TextureDescriptor r1 = (com.badlogic.gdx.graphics.g3d.utils.TextureDescriptor) r1
            int r1 = r0.compareTo(r1)
            return r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r5 != r4) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.badlogic.gdx.graphics.g3d.utils.TextureDescriptor
            if (r2 != 0) goto Ld
            return r0
        Ld:
            com.badlogic.gdx.graphics.g3d.utils.TextureDescriptor r5 = (com.badlogic.gdx.graphics.g3d.utils.TextureDescriptor) r5
            T extends com.badlogic.gdx.graphics.GLTexture r2 = r5.texture
            T extends com.badlogic.gdx.graphics.GLTexture r3 = r4.texture
            if (r2 != r3) goto L2e
            com.badlogic.gdx.graphics.Texture$TextureFilter r2 = r5.minFilter
            com.badlogic.gdx.graphics.Texture$TextureFilter r3 = r4.minFilter
            if (r2 != r3) goto L2e
            com.badlogic.gdx.graphics.Texture$TextureFilter r2 = r5.magFilter
            com.badlogic.gdx.graphics.Texture$TextureFilter r3 = r4.magFilter
            if (r2 != r3) goto L2e
            com.badlogic.gdx.graphics.Texture$TextureWrap r2 = r5.uWrap
            com.badlogic.gdx.graphics.Texture$TextureWrap r3 = r4.uWrap
            if (r2 != r3) goto L2e
            com.badlogic.gdx.graphics.Texture$TextureWrap r5 = r5.vWrap
            com.badlogic.gdx.graphics.Texture$TextureWrap r2 = r4.vWrap
            if (r5 != r2) goto L2e
            r0 = 1
        L2e:
            return r0
    }

    public int hashCode() {
            r8 = this;
            T extends com.badlogic.gdx.graphics.GLTexture r0 = r8.texture
            r1 = 0
            if (r0 != 0) goto L7
            r2 = 0
            goto L9
        L7:
            int r2 = r0.glTarget
        L9:
            long r2 = (long) r2
            r4 = 811(0x32b, double:4.007E-321)
            long r2 = r2 * r4
            if (r0 != 0) goto L12
            r0 = 0
            goto L16
        L12:
            int r0 = r0.getTextureObjectHandle()
        L16:
            long r6 = (long) r0
            long r2 = r2 + r6
            long r2 = r2 * r4
            com.badlogic.gdx.graphics.Texture$TextureFilter r0 = r8.minFilter
            if (r0 != 0) goto L20
            r0 = 0
            goto L24
        L20:
            int r0 = r0.getGLEnum()
        L24:
            long r6 = (long) r0
            long r2 = r2 + r6
            long r2 = r2 * r4
            com.badlogic.gdx.graphics.Texture$TextureFilter r0 = r8.magFilter
            if (r0 != 0) goto L2e
            r0 = 0
            goto L32
        L2e:
            int r0 = r0.getGLEnum()
        L32:
            long r6 = (long) r0
            long r2 = r2 + r6
            long r2 = r2 * r4
            com.badlogic.gdx.graphics.Texture$TextureWrap r0 = r8.uWrap
            if (r0 != 0) goto L3c
            r0 = 0
            goto L40
        L3c:
            int r0 = r0.getGLEnum()
        L40:
            long r6 = (long) r0
            long r2 = r2 + r6
            long r2 = r2 * r4
            com.badlogic.gdx.graphics.Texture$TextureWrap r0 = r8.vWrap
            if (r0 != 0) goto L49
            goto L4d
        L49:
            int r1 = r0.getGLEnum()
        L4d:
            long r0 = (long) r1
            long r2 = r2 + r0
            r0 = 32
            long r0 = r2 >> r0
            long r0 = r0 ^ r2
            int r1 = (int) r0
            return r1
    }

    public void set(T r1, com.badlogic.gdx.graphics.Texture.TextureFilter r2, com.badlogic.gdx.graphics.Texture.TextureFilter r3, com.badlogic.gdx.graphics.Texture.TextureWrap r4, com.badlogic.gdx.graphics.Texture.TextureWrap r5) {
            r0 = this;
            r0.texture = r1
            r0.minFilter = r2
            r0.magFilter = r3
            r0.uWrap = r4
            r0.vWrap = r5
            return
    }

    public <V extends T> void set(com.badlogic.gdx.graphics.g3d.utils.TextureDescriptor<V> r2) {
            r1 = this;
            T extends com.badlogic.gdx.graphics.GLTexture r0 = r2.texture
            r1.texture = r0
            com.badlogic.gdx.graphics.Texture$TextureFilter r0 = r2.minFilter
            r1.minFilter = r0
            com.badlogic.gdx.graphics.Texture$TextureFilter r0 = r2.magFilter
            r1.magFilter = r0
            com.badlogic.gdx.graphics.Texture$TextureWrap r0 = r2.uWrap
            r1.uWrap = r0
            com.badlogic.gdx.graphics.Texture$TextureWrap r2 = r2.vWrap
            r1.vWrap = r2
            return
    }
}
