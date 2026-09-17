package com.badlogic.gdx.graphics.glutils;

/* loaded from: classes.dex */
public class VertexBufferObjectWithVAO implements com.badlogic.gdx.graphics.glutils.VertexData {
    static final java.nio.IntBuffer tmpHandle = null;
    final com.badlogic.gdx.graphics.VertexAttributes attributes;
    final java.nio.FloatBuffer buffer;
    int bufferHandle;
    final java.nio.ByteBuffer byteBuffer;
    com.badlogic.gdx.utils.IntArray cachedLocations;
    boolean isBound;
    boolean isDirty;
    final boolean isStatic;
    final boolean ownsBuffer;
    final int usage;
    int vaoHandle;

    static {
            r0 = 1
            java.nio.IntBuffer r0 = com.badlogic.gdx.utils.BufferUtils.newIntBuffer(r0)
            com.badlogic.gdx.graphics.glutils.VertexBufferObjectWithVAO.tmpHandle = r0
            return
    }

    public VertexBufferObjectWithVAO(boolean r2, int r3, com.badlogic.gdx.graphics.VertexAttributes r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.isDirty = r0
            r1.isBound = r0
            r0 = -1
            r1.vaoHandle = r0
            com.badlogic.gdx.utils.IntArray r0 = new com.badlogic.gdx.utils.IntArray
            r0.<init>()
            r1.cachedLocations = r0
            r1.isStatic = r2
            r1.attributes = r4
            int r4 = r4.vertexSize
            int r4 = r4 * r3
            java.nio.ByteBuffer r3 = com.badlogic.gdx.utils.BufferUtils.newUnsafeByteBuffer(r4)
            r1.byteBuffer = r3
            java.nio.FloatBuffer r4 = r3.asFloatBuffer()
            r1.buffer = r4
            r0 = 1
            r1.ownsBuffer = r0
            r4.flip()
            r3.flip()
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl20
            int r3 = r3.glGenBuffer()
            r1.bufferHandle = r3
            if (r2 == 0) goto L3d
            r2 = 35044(0x88e4, float:4.9107E-41)
            goto L40
        L3d:
            r2 = 35048(0x88e8, float:4.9113E-41)
        L40:
            r1.usage = r2
            r1.createVAO()
            return
    }

    private void bindAttributes(com.badlogic.gdx.graphics.glutils.ShaderProgram r12, int[] r13) {
            r11 = this;
            com.badlogic.gdx.utils.IntArray r0 = r11.cachedLocations
            int r0 = r0.size
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.badlogic.gdx.graphics.VertexAttributes r3 = r11.attributes
            int r3 = r3.size()
            if (r0 == 0) goto L53
            if (r13 != 0) goto L34
            r4 = 0
        L16:
            if (r0 == 0) goto L53
            if (r4 >= r3) goto L53
            com.badlogic.gdx.graphics.VertexAttributes r0 = r11.attributes
            com.badlogic.gdx.graphics.VertexAttribute r0 = r0.get(r4)
            java.lang.String r0 = r0.alias
            int r0 = r12.getAttributeLocation(r0)
            com.badlogic.gdx.utils.IntArray r5 = r11.cachedLocations
            int r5 = r5.get(r4)
            if (r0 != r5) goto L30
            r0 = 1
            goto L31
        L30:
            r0 = 0
        L31:
            int r4 = r4 + 1
            goto L16
        L34:
            int r0 = r13.length
            com.badlogic.gdx.utils.IntArray r4 = r11.cachedLocations
            int r4 = r4.size
            if (r0 != r4) goto L3d
            r0 = 1
            goto L3e
        L3d:
            r0 = 0
        L3e:
            r4 = 0
        L3f:
            if (r0 == 0) goto L53
            if (r4 >= r3) goto L53
            r0 = r13[r4]
            com.badlogic.gdx.utils.IntArray r5 = r11.cachedLocations
            int r5 = r5.get(r4)
            if (r0 != r5) goto L4f
            r0 = 1
            goto L50
        L4f:
            r0 = 0
        L50:
            int r4 = r4 + 1
            goto L3f
        L53:
            if (r0 != 0) goto La3
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r1 = 34962(0x8892, float:4.8992E-41)
            int r4 = r11.bufferHandle
            r0.glBindBuffer(r1, r4)
            r11.unbindAttributes(r12)
            com.badlogic.gdx.utils.IntArray r0 = r11.cachedLocations
            r0.clear()
        L67:
            if (r2 >= r3) goto La3
            com.badlogic.gdx.graphics.VertexAttributes r0 = r11.attributes
            com.badlogic.gdx.graphics.VertexAttribute r0 = r0.get(r2)
            if (r13 != 0) goto L7d
            com.badlogic.gdx.utils.IntArray r1 = r11.cachedLocations
            java.lang.String r4 = r0.alias
            int r4 = r12.getAttributeLocation(r4)
            r1.add(r4)
            goto L84
        L7d:
            com.badlogic.gdx.utils.IntArray r1 = r11.cachedLocations
            r4 = r13[r2]
            r1.add(r4)
        L84:
            com.badlogic.gdx.utils.IntArray r1 = r11.cachedLocations
            int r5 = r1.get(r2)
            if (r5 >= 0) goto L8d
            goto La0
        L8d:
            r12.enableVertexAttribute(r5)
            int r6 = r0.numComponents
            int r7 = r0.type
            boolean r8 = r0.normalized
            com.badlogic.gdx.graphics.VertexAttributes r1 = r11.attributes
            int r9 = r1.vertexSize
            int r10 = r0.offset
            r4 = r12
            r4.setVertexAttribute(r5, r6, r7, r8, r9, r10)
        La0:
            int r2 = r2 + 1
            goto L67
        La3:
            return
    }

    private void bindData(com.badlogic.gdx.graphics.GL20 r5) {
            r4 = this;
            boolean r0 = r4.isDirty
            if (r0 == 0) goto L29
            int r0 = r4.bufferHandle
            r1 = 34962(0x8892, float:4.8992E-41)
            r5.glBindBuffer(r1, r0)
            java.nio.ByteBuffer r0 = r4.byteBuffer
            java.nio.FloatBuffer r2 = r4.buffer
            int r2 = r2.limit()
            int r2 = r2 * 4
            r0.limit(r2)
            java.nio.ByteBuffer r0 = r4.byteBuffer
            int r0 = r0.limit()
            java.nio.ByteBuffer r2 = r4.byteBuffer
            int r3 = r4.usage
            r5.glBufferData(r1, r0, r2, r3)
            r5 = 0
            r4.isDirty = r5
        L29:
            return
    }

    private void bufferChanged() {
            r5 = this;
            boolean r0 = r5.isBound
            if (r0 == 0) goto L20
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            int r1 = r5.bufferHandle
            r2 = 34962(0x8892, float:4.8992E-41)
            r0.glBindBuffer(r2, r1)
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            java.nio.ByteBuffer r1 = r5.byteBuffer
            int r1 = r1.limit()
            java.nio.ByteBuffer r3 = r5.byteBuffer
            int r4 = r5.usage
            r0.glBufferData(r2, r1, r3, r4)
            r0 = 0
            r5.isDirty = r0
        L20:
            return
    }

    private void createVAO() {
            r3 = this;
            java.nio.IntBuffer r0 = com.badlogic.gdx.graphics.glutils.VertexBufferObjectWithVAO.tmpHandle
            r0.clear()
            com.badlogic.gdx.graphics.GL30 r1 = com.badlogic.gdx.Gdx.gl30
            r2 = 1
            r1.glGenVertexArrays(r2, r0)
            int r0 = r0.get()
            r3.vaoHandle = r0
            return
    }

    private void deleteVAO() {
            r4 = this;
            int r0 = r4.vaoHandle
            r1 = -1
            if (r0 == r1) goto L1a
            java.nio.IntBuffer r0 = com.badlogic.gdx.graphics.glutils.VertexBufferObjectWithVAO.tmpHandle
            r0.clear()
            int r2 = r4.vaoHandle
            r0.put(r2)
            r0.flip()
            com.badlogic.gdx.graphics.GL30 r2 = com.badlogic.gdx.Gdx.gl30
            r3 = 1
            r2.glDeleteVertexArrays(r3, r0)
            r4.vaoHandle = r1
        L1a:
            return
    }

    private void unbindAttributes(com.badlogic.gdx.graphics.glutils.ShaderProgram r4) {
            r3 = this;
            com.badlogic.gdx.utils.IntArray r0 = r3.cachedLocations
            int r0 = r0.size
            if (r0 != 0) goto L7
            return
        L7:
            com.badlogic.gdx.graphics.VertexAttributes r0 = r3.attributes
            int r0 = r0.size()
            r1 = 0
        Le:
            if (r1 >= r0) goto L1f
            com.badlogic.gdx.utils.IntArray r2 = r3.cachedLocations
            int r2 = r2.get(r1)
            if (r2 >= 0) goto L19
            goto L1c
        L19:
            r4.disableVertexAttribute(r2)
        L1c:
            int r1 = r1 + 1
            goto Le
        L1f:
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData
    public void bind(com.badlogic.gdx.graphics.glutils.ShaderProgram r3, int[] r4) {
            r2 = this;
            com.badlogic.gdx.graphics.GL30 r0 = com.badlogic.gdx.Gdx.gl30
            int r1 = r2.vaoHandle
            r0.glBindVertexArray(r1)
            r2.bindAttributes(r3, r4)
            r2.bindData(r0)
            r3 = 1
            r2.isBound = r3
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            com.badlogic.gdx.graphics.GL30 r0 = com.badlogic.gdx.Gdx.gl30
            r1 = 34962(0x8892, float:4.8992E-41)
            r2 = 0
            r0.glBindBuffer(r1, r2)
            int r1 = r3.bufferHandle
            r0.glDeleteBuffer(r1)
            r3.bufferHandle = r2
            boolean r0 = r3.ownsBuffer
            if (r0 == 0) goto L19
            java.nio.ByteBuffer r0 = r3.byteBuffer
            com.badlogic.gdx.utils.BufferUtils.disposeUnsafeByteBuffer(r0)
        L19:
            r3.deleteVAO()
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
            com.badlogic.gdx.graphics.GL30 r0 = com.badlogic.gdx.Gdx.gl30
            int r0 = r0.glGenBuffer()
            r1.bufferHandle = r0
            r1.createVAO()
            r0 = 1
            r1.isDirty = r0
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData
    public void setVertices(float[] r2, int r3, int r4) {
            r1 = this;
            r0 = 1
            r1.isDirty = r0
            java.nio.ByteBuffer r0 = r1.byteBuffer
            com.badlogic.gdx.utils.BufferUtils.copy(r2, r0, r4, r3)
            java.nio.FloatBuffer r2 = r1.buffer
            r3 = 0
            r2.position(r3)
            java.nio.FloatBuffer r2 = r1.buffer
            r2.limit(r4)
            r1.bufferChanged()
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.VertexData
    public void unbind(com.badlogic.gdx.graphics.glutils.ShaderProgram r1, int[] r2) {
            r0 = this;
            com.badlogic.gdx.graphics.GL30 r1 = com.badlogic.gdx.Gdx.gl30
            r2 = 0
            r1.glBindVertexArray(r2)
            r0.isBound = r2
            return
    }
}
