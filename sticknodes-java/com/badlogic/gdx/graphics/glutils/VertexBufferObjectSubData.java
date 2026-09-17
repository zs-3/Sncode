package com.badlogic.gdx.graphics.glutils;

/* loaded from: classes.dex */
public class VertexBufferObjectSubData implements com.badlogic.gdx.graphics.glutils.VertexData {
    final com.badlogic.gdx.graphics.VertexAttributes attributes;
    final java.nio.FloatBuffer buffer;
    int bufferHandle;
    final java.nio.ByteBuffer byteBuffer;
    boolean isBound;
    final boolean isDirect;
    boolean isDirty;
    final boolean isStatic;
    final int usage;

    public VertexBufferObjectSubData(boolean r2, int r3, com.badlogic.gdx.graphics.VertexAttributes r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.isDirty = r0
            r1.isBound = r0
            r1.isStatic = r2
            r1.attributes = r4
            int r4 = r4.vertexSize
            int r4 = r4 * r3
            java.nio.ByteBuffer r3 = com.badlogic.gdx.utils.BufferUtils.newByteBuffer(r4)
            r1.byteBuffer = r3
            r4 = 1
            r1.isDirect = r4
            if (r2 == 0) goto L1f
            r2 = 35044(0x88e4, float:4.9107E-41)
            goto L22
        L1f:
            r2 = 35048(0x88e8, float:4.9113E-41)
        L22:
            r1.usage = r2
            java.nio.FloatBuffer r2 = r3.asFloatBuffer()
            r1.buffer = r2
            int r4 = r1.createBufferObject()
            r1.bufferHandle = r4
            r2.flip()
            r3.flip()
            return
    }

    private void bufferChanged() {
            r5 = this;
            boolean r0 = r5.isBound
            if (r0 == 0) goto L17
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            r1 = 34962(0x8892, float:4.8992E-41)
            java.nio.ByteBuffer r2 = r5.byteBuffer
            int r2 = r2.limit()
            java.nio.ByteBuffer r3 = r5.byteBuffer
            r4 = 0
            r0.glBufferSubData(r1, r4, r2, r3)
            r5.isDirty = r4
        L17:
            return
    }

    private int createBufferObject() {
            r6 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            int r0 = r0.glGenBuffer()
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl20
            r2 = 34962(0x8892, float:4.8992E-41)
            r1.glBindBuffer(r2, r0)
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl20
            java.nio.ByteBuffer r3 = r6.byteBuffer
            int r3 = r3.capacity()
            int r4 = r6.usage
            r5 = 0
            r1.glBufferData(r2, r3, r5, r4)
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl20
            r3 = 0
            r1.glBindBuffer(r2, r3)
            return r0
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData
    public void bind(com.badlogic.gdx.graphics.glutils.ShaderProgram r12, int[] r13) {
            r11 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            int r1 = r11.bufferHandle
            r2 = 34962(0x8892, float:4.8992E-41)
            r0.glBindBuffer(r2, r1)
            boolean r1 = r11.isDirty
            r3 = 0
            if (r1 == 0) goto L2b
            java.nio.ByteBuffer r1 = r11.byteBuffer
            java.nio.FloatBuffer r4 = r11.buffer
            int r4 = r4.limit()
            int r4 = r4 * 4
            r1.limit(r4)
            java.nio.ByteBuffer r1 = r11.byteBuffer
            int r1 = r1.limit()
            java.nio.ByteBuffer r4 = r11.byteBuffer
            int r5 = r11.usage
            r0.glBufferData(r2, r1, r4, r5)
            r11.isDirty = r3
        L2b:
            com.badlogic.gdx.graphics.VertexAttributes r0 = r11.attributes
            int r0 = r0.size()
            if (r13 != 0) goto L5a
        L33:
            if (r3 >= r0) goto L7d
            com.badlogic.gdx.graphics.VertexAttributes r13 = r11.attributes
            com.badlogic.gdx.graphics.VertexAttribute r13 = r13.get(r3)
            java.lang.String r1 = r13.alias
            int r5 = r12.getAttributeLocation(r1)
            if (r5 >= 0) goto L44
            goto L57
        L44:
            r12.enableVertexAttribute(r5)
            int r6 = r13.numComponents
            int r7 = r13.type
            boolean r8 = r13.normalized
            com.badlogic.gdx.graphics.VertexAttributes r1 = r11.attributes
            int r9 = r1.vertexSize
            int r10 = r13.offset
            r4 = r12
            r4.setVertexAttribute(r5, r6, r7, r8, r9, r10)
        L57:
            int r3 = r3 + 1
            goto L33
        L5a:
            if (r3 >= r0) goto L7d
            com.badlogic.gdx.graphics.VertexAttributes r1 = r11.attributes
            com.badlogic.gdx.graphics.VertexAttribute r1 = r1.get(r3)
            r5 = r13[r3]
            if (r5 >= 0) goto L67
            goto L7a
        L67:
            r12.enableVertexAttribute(r5)
            int r6 = r1.numComponents
            int r7 = r1.type
            boolean r8 = r1.normalized
            com.badlogic.gdx.graphics.VertexAttributes r2 = r11.attributes
            int r9 = r2.vertexSize
            int r10 = r1.offset
            r4 = r12
            r4.setVertexAttribute(r5, r6, r7, r8, r9, r10)
        L7a:
            int r3 = r3 + 1
            goto L5a
        L7d:
            r12 = 1
            r11.isBound = r12
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            r1 = 34962(0x8892, float:4.8992E-41)
            r2 = 0
            r0.glBindBuffer(r1, r2)
            int r1 = r3.bufferHandle
            r0.glDeleteBuffer(r1)
            r3.bufferHandle = r2
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData
    public com.badlogic.gdx.graphics.VertexAttributes getAttributes() {
            r1 = this;
            com.badlogic.gdx.graphics.VertexAttributes r0 = r1.attributes
            return r0
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData
    public java.nio.FloatBuffer getBuffer(boolean r2) {
            r1 = this;
            boolean r0 = r1.isDirty
            r2 = r2 | r0
            r1.isDirty = r2
            java.nio.FloatBuffer r2 = r1.buffer
            return r2
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
            r1 = this;
            int r0 = r1.createBufferObject()
            r1.bufferHandle = r0
            r0 = 1
            r1.isDirty = r0
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData
    public void setVertices(float[] r3, int r4, int r5) {
            r2 = this;
            r0 = 1
            r2.isDirty = r0
            boolean r0 = r2.isDirect
            r1 = 0
            if (r0 == 0) goto L18
            java.nio.ByteBuffer r0 = r2.byteBuffer
            com.badlogic.gdx.utils.BufferUtils.copy(r3, r0, r5, r4)
            java.nio.FloatBuffer r3 = r2.buffer
            r3.position(r1)
            java.nio.FloatBuffer r3 = r2.buffer
            r3.limit(r5)
            goto L39
        L18:
            java.nio.FloatBuffer r0 = r2.buffer
            r0.clear()
            java.nio.FloatBuffer r0 = r2.buffer
            r0.put(r3, r4, r5)
            java.nio.FloatBuffer r3 = r2.buffer
            r3.flip()
            java.nio.ByteBuffer r3 = r2.byteBuffer
            r3.position(r1)
            java.nio.ByteBuffer r3 = r2.byteBuffer
            java.nio.FloatBuffer r4 = r2.buffer
            int r4 = r4.limit()
            int r4 = r4 << 2
            r3.limit(r4)
        L39:
            r2.bufferChanged()
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData
    public void unbind(com.badlogic.gdx.graphics.glutils.ShaderProgram r6, int[] r7) {
            r5 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            com.badlogic.gdx.graphics.VertexAttributes r1 = r5.attributes
            int r1 = r1.size()
            r2 = 0
            if (r7 != 0) goto L1c
            r7 = 0
        Lc:
            if (r7 >= r1) goto L29
            com.badlogic.gdx.graphics.VertexAttributes r3 = r5.attributes
            com.badlogic.gdx.graphics.VertexAttribute r3 = r3.get(r7)
            java.lang.String r3 = r3.alias
            r6.disableVertexAttribute(r3)
            int r7 = r7 + 1
            goto Lc
        L1c:
            r3 = 0
        L1d:
            if (r3 >= r1) goto L29
            r4 = r7[r3]
            if (r4 < 0) goto L26
            r6.disableVertexAttribute(r4)
        L26:
            int r3 = r3 + 1
            goto L1d
        L29:
            r6 = 34962(0x8892, float:4.8992E-41)
            r0.glBindBuffer(r6, r2)
            r5.isBound = r2
            return
    }
}
