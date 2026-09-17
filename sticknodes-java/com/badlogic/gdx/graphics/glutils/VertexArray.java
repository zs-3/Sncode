package com.badlogic.gdx.graphics.glutils;

/* loaded from: classes.dex */
public class VertexArray implements com.badlogic.gdx.graphics.glutils.VertexData {
    final com.badlogic.gdx.graphics.VertexAttributes attributes;
    final java.nio.FloatBuffer buffer;
    final java.nio.ByteBuffer byteBuffer;
    boolean isBound;

    public VertexArray(int r2, com.badlogic.gdx.graphics.VertexAttributes r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.isBound = r0
            r1.attributes = r3
            int r3 = r3.vertexSize
            int r3 = r3 * r2
            java.nio.ByteBuffer r2 = com.badlogic.gdx.utils.BufferUtils.newUnsafeByteBuffer(r3)
            r1.byteBuffer = r2
            java.nio.FloatBuffer r3 = r2.asFloatBuffer()
            r1.buffer = r3
            r3.flip()
            r2.flip()
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData
    public void bind(com.badlogic.gdx.graphics.glutils.ShaderProgram r12, int[] r13) {
            r11 = this;
            com.badlogic.gdx.graphics.VertexAttributes r0 = r11.attributes
            int r0 = r0.size()
            java.nio.ByteBuffer r1 = r11.byteBuffer
            java.nio.FloatBuffer r2 = r11.buffer
            int r2 = r2.limit()
            int r2 = r2 * 4
            r1.limit(r2)
            r1 = 5126(0x1406, float:7.183E-42)
            r2 = 0
            if (r13 != 0) goto L64
        L18:
            if (r2 >= r0) goto Lac
            com.badlogic.gdx.graphics.VertexAttributes r13 = r11.attributes
            com.badlogic.gdx.graphics.VertexAttribute r13 = r13.get(r2)
            java.lang.String r3 = r13.alias
            int r5 = r12.getAttributeLocation(r3)
            if (r5 >= 0) goto L29
            goto L61
        L29:
            r12.enableVertexAttribute(r5)
            int r3 = r13.type
            if (r3 != r1) goto L4a
            java.nio.FloatBuffer r3 = r11.buffer
            int r4 = r13.offset
            int r4 = r4 / 4
            r3.position(r4)
            int r6 = r13.numComponents
            int r7 = r13.type
            boolean r8 = r13.normalized
            com.badlogic.gdx.graphics.VertexAttributes r13 = r11.attributes
            int r9 = r13.vertexSize
            java.nio.FloatBuffer r10 = r11.buffer
            r4 = r12
            r4.setVertexAttribute(r5, r6, r7, r8, r9, r10)
            goto L61
        L4a:
            java.nio.ByteBuffer r3 = r11.byteBuffer
            int r4 = r13.offset
            r3.position(r4)
            int r6 = r13.numComponents
            int r7 = r13.type
            boolean r8 = r13.normalized
            com.badlogic.gdx.graphics.VertexAttributes r13 = r11.attributes
            int r9 = r13.vertexSize
            java.nio.ByteBuffer r10 = r11.byteBuffer
            r4 = r12
            r4.setVertexAttribute(r5, r6, r7, r8, r9, r10)
        L61:
            int r2 = r2 + 1
            goto L18
        L64:
            if (r2 >= r0) goto Lac
            com.badlogic.gdx.graphics.VertexAttributes r3 = r11.attributes
            com.badlogic.gdx.graphics.VertexAttribute r3 = r3.get(r2)
            r5 = r13[r2]
            if (r5 >= 0) goto L71
            goto La9
        L71:
            r12.enableVertexAttribute(r5)
            int r4 = r3.type
            if (r4 != r1) goto L92
            java.nio.FloatBuffer r4 = r11.buffer
            int r6 = r3.offset
            int r6 = r6 / 4
            r4.position(r6)
            int r6 = r3.numComponents
            int r7 = r3.type
            boolean r8 = r3.normalized
            com.badlogic.gdx.graphics.VertexAttributes r3 = r11.attributes
            int r9 = r3.vertexSize
            java.nio.FloatBuffer r10 = r11.buffer
            r4 = r12
            r4.setVertexAttribute(r5, r6, r7, r8, r9, r10)
            goto La9
        L92:
            java.nio.ByteBuffer r4 = r11.byteBuffer
            int r6 = r3.offset
            r4.position(r6)
            int r6 = r3.numComponents
            int r7 = r3.type
            boolean r8 = r3.normalized
            com.badlogic.gdx.graphics.VertexAttributes r3 = r11.attributes
            int r9 = r3.vertexSize
            java.nio.ByteBuffer r10 = r11.byteBuffer
            r4 = r12
            r4.setVertexAttribute(r5, r6, r7, r8, r9, r10)
        La9:
            int r2 = r2 + 1
            goto L64
        Lac:
            r12 = 1
            r11.isBound = r12
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.byteBuffer
            com.badlogic.gdx.utils.BufferUtils.disposeUnsafeByteBuffer(r0)
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData
    public com.badlogic.gdx.graphics.VertexAttributes getAttributes() {
            r1 = this;
            com.badlogic.gdx.graphics.VertexAttributes r0 = r1.attributes
            return r0
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData
    public java.nio.FloatBuffer getBuffer(boolean r1) {
            r0 = this;
            java.nio.FloatBuffer r1 = r0.buffer
            return r1
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData
    public int getNumVertices() {
            r2 = this;
            java.nio.FloatBuffer r0 = r2.buffer
            int r0 = r0.limit()
            int r0 = r0 * 4
            com.badlogic.gdx.graphics.VertexAttributes r1 = r2.attributes
            int r1 = r1.vertexSize
            int r0 = r0 / r1
            return r0
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData
    public void invalidate() {
            r0 = this;
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData
    public void setVertices(float[] r2, int r3, int r4) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.byteBuffer
            com.badlogic.gdx.utils.BufferUtils.copy(r2, r0, r4, r3)
            java.nio.FloatBuffer r2 = r1.buffer
            r3 = 0
            r2.position(r3)
            java.nio.FloatBuffer r2 = r1.buffer
            r2.limit(r4)
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData
    public void unbind(com.badlogic.gdx.graphics.glutils.ShaderProgram r5, int[] r6) {
            r4 = this;
            com.badlogic.gdx.graphics.VertexAttributes r0 = r4.attributes
            int r0 = r0.size()
            r1 = 0
            if (r6 != 0) goto L1a
            r6 = 0
        La:
            if (r6 >= r0) goto L27
            com.badlogic.gdx.graphics.VertexAttributes r2 = r4.attributes
            com.badlogic.gdx.graphics.VertexAttribute r2 = r2.get(r6)
            java.lang.String r2 = r2.alias
            r5.disableVertexAttribute(r2)
            int r6 = r6 + 1
            goto La
        L1a:
            r2 = 0
        L1b:
            if (r2 >= r0) goto L27
            r3 = r6[r2]
            if (r3 < 0) goto L24
            r5.disableVertexAttribute(r3)
        L24:
            int r2 = r2 + 1
            goto L1b
        L27:
            r4.isBound = r1
            return
    }
}
