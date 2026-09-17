package com.badlogic.gdx.graphics.glutils;

/* loaded from: classes.dex */
public class FrameBuffer extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<com.badlogic.gdx.graphics.Texture> {
    FrameBuffer() {
            r0 = this;
            r0.<init>()
            return
    }

    protected FrameBuffer(com.badlogic.gdx.graphics.glutils.GLFrameBuffer.GLFrameBufferBuilder<? extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<com.badlogic.gdx.graphics.Texture>> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static void unbind() {
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer.unbind()
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.GLFrameBuffer
    protected /* bridge */ /* synthetic */ void attachFrameBufferColorTexture(com.badlogic.gdx.graphics.GLTexture r1) {
            r0 = this;
            com.badlogic.gdx.graphics.Texture r1 = (com.badlogic.gdx.graphics.Texture) r1
            r0.attachFrameBufferColorTexture(r1)
            return
    }

    protected void attachFrameBufferColorTexture(com.badlogic.gdx.graphics.Texture r7) {
            r6 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            int r4 = r7.getTextureObjectHandle()
            r1 = 36160(0x8d40, float:5.0671E-41)
            r2 = 36064(0x8ce0, float:5.0536E-41)
            r3 = 3553(0xde1, float:4.979E-42)
            r5 = 0
            r0.glFramebufferTexture2D(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.GLFrameBuffer
    protected /* bridge */ /* synthetic */ com.badlogic.gdx.graphics.GLTexture createTexture(com.badlogic.gdx.graphics.glutils.GLFrameBuffer.FrameBufferTextureAttachmentSpec r1) {
            r0 = this;
            com.badlogic.gdx.graphics.Texture r1 = r0.createTexture(r1)
            return r1
    }

    @Override // com.badlogic.gdx.graphics.glutils.GLFrameBuffer
    protected com.badlogic.gdx.graphics.Texture createTexture(com.badlogic.gdx.graphics.glutils.GLFrameBuffer.FrameBufferTextureAttachmentSpec r9) {
            r8 = this;
            com.badlogic.gdx.graphics.glutils.GLOnlyTextureData r7 = new com.badlogic.gdx.graphics.glutils.GLOnlyTextureData
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$GLFrameBufferBuilder<? extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<T extends com.badlogic.gdx.graphics.GLTexture>> r0 = r8.bufferBuilder
            int r1 = r0.width
            int r2 = r0.height
            int r4 = r9.internalFormat
            int r5 = r9.format
            int r6 = r9.type
            r3 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.badlogic.gdx.graphics.Texture r0 = new com.badlogic.gdx.graphics.Texture
            r0.<init>(r7)
            boolean r9 = r9.isDepth
            if (r9 == 0) goto L28
            com.badlogic.gdx.Application r9 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r9 = r9.getType()
            com.badlogic.gdx.Application$ApplicationType r1 = com.badlogic.gdx.Application.ApplicationType.WebGL
            if (r9 != r1) goto L28
            r9 = 1
            goto L29
        L28:
            r9 = 0
        L29:
            if (r9 != 0) goto L30
            com.badlogic.gdx.graphics.Texture$TextureFilter r9 = com.badlogic.gdx.graphics.Texture.TextureFilter.Linear
            r0.setFilter(r9, r9)
        L30:
            com.badlogic.gdx.graphics.Texture$TextureWrap r9 = com.badlogic.gdx.graphics.Texture.TextureWrap.ClampToEdge
            r0.setWrap(r9, r9)
            return r0
    }

    @Override // com.badlogic.gdx.graphics.glutils.GLFrameBuffer
    protected /* bridge */ /* synthetic */ void disposeColorTexture(com.badlogic.gdx.graphics.GLTexture r1) {
            r0 = this;
            com.badlogic.gdx.graphics.Texture r1 = (com.badlogic.gdx.graphics.Texture) r1
            r0.disposeColorTexture(r1)
            return
    }

    protected void disposeColorTexture(com.badlogic.gdx.graphics.Texture r1) {
            r0 = this;
            r1.dispose()
            return
    }
}
