package com.badlogic.gdx.graphics.glutils;

/* loaded from: classes.dex */
public class IndexBufferObjectSubData implements com.badlogic.gdx.graphics.glutils.IndexData {
    final java.nio.ShortBuffer buffer;
    int bufferHandle;
    final java.nio.ByteBuffer byteBuffer;
    boolean isBound;
    final boolean isDirect;
    boolean isDirty;
    final int usage;

    public IndexBufferObjectSubData(boolean r3, int r4) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.isDirty = r0
            r1 = 0
            r2.isBound = r1
            int r4 = r4 * 2
            java.nio.ByteBuffer r4 = com.badlogic.gdx.utils.BufferUtils.newByteBuffer(r4)
            r2.byteBuffer = r4
            r2.isDirect = r0
            if (r3 == 0) goto L19
            r3 = 35044(0x88e4, float:4.9107E-41)
            goto L1c
        L19:
            r3 = 35048(0x88e8, float:4.9113E-41)
        L1c:
            r2.usage = r3
            java.nio.ShortBuffer r3 = r4.asShortBuffer()
            r2.buffer = r3
            r3.flip()
            r4.flip()
            int r3 = r2.createBufferObject()
            r2.bufferHandle = r3
            return
    }

    private int createBufferObject() {
            r6 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            int r0 = r0.glGenBuffer()
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl20
            r2 = 34963(0x8893, float:4.8994E-41)
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

    @Override // com.badlogic.gdx.graphics.glutils.IndexData
    public void bind() {
            r5 = this;
            int r0 = r5.bufferHandle
            if (r0 == 0) goto L31
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl20
            r2 = 34963(0x8893, float:4.8994E-41)
            r1.glBindBuffer(r2, r0)
            boolean r0 = r5.isDirty
            if (r0 == 0) goto L2d
            java.nio.ByteBuffer r0 = r5.byteBuffer
            java.nio.ShortBuffer r1 = r5.buffer
            int r1 = r1.limit()
            int r1 = r1 * 2
            r0.limit(r1)
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            java.nio.ByteBuffer r1 = r5.byteBuffer
            int r1 = r1.limit()
            java.nio.ByteBuffer r3 = r5.byteBuffer
            r4 = 0
            r0.glBufferSubData(r2, r4, r1, r3)
            r5.isDirty = r4
        L2d:
            r0 = 1
            r5.isBound = r0
            return
        L31:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "IndexBufferObject cannot be used after it has been disposed."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.badlogic.gdx.graphics.glutils.IndexData, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            r1 = 34963(0x8893, float:4.8994E-41)
            r2 = 0
            r0.glBindBuffer(r1, r2)
            int r1 = r3.bufferHandle
            r0.glDeleteBuffer(r1)
            r3.bufferHandle = r2
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.IndexData
    public java.nio.ShortBuffer getBuffer(boolean r2) {
            r1 = this;
            boolean r0 = r1.isDirty
            r2 = r2 | r0
            r1.isDirty = r2
            java.nio.ShortBuffer r2 = r1.buffer
            return r2
    }

    @Override // com.badlogic.gdx.graphics.glutils.IndexData
    public int getNumIndices() {
            r1 = this;
            java.nio.ShortBuffer r0 = r1.buffer
            int r0 = r0.limit()
            return r0
    }

    @Override // com.badlogic.gdx.graphics.glutils.IndexData
    public int getNumMaxIndices() {
            r1 = this;
            java.nio.ShortBuffer r0 = r1.buffer
            int r0 = r0.capacity()
            return r0
    }

    @Override // com.badlogic.gdx.graphics.glutils.IndexData
    public void invalidate() {
            r1 = this;
            int r0 = r1.createBufferObject()
            r1.bufferHandle = r0
            r0 = 1
            r1.isDirty = r0
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.IndexData
    public void setIndices(short[] r3, int r4, int r5) {
            r2 = this;
            r0 = 1
            r2.isDirty = r0
            java.nio.ShortBuffer r1 = r2.buffer
            r1.clear()
            java.nio.ShortBuffer r1 = r2.buffer
            r1.put(r3, r4, r5)
            java.nio.ShortBuffer r3 = r2.buffer
            r3.flip()
            java.nio.ByteBuffer r3 = r2.byteBuffer
            r4 = 0
            r3.position(r4)
            java.nio.ByteBuffer r3 = r2.byteBuffer
            int r5 = r5 << r0
            r3.limit(r5)
            boolean r3 = r2.isBound
            if (r3 == 0) goto L34
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl20
            r5 = 34963(0x8893, float:4.8994E-41)
            java.nio.ByteBuffer r0 = r2.byteBuffer
            int r0 = r0.limit()
            java.nio.ByteBuffer r1 = r2.byteBuffer
            r3.glBufferSubData(r5, r4, r0, r1)
            r2.isDirty = r4
        L34:
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.IndexData
    public void unbind() {
            r3 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            r1 = 34963(0x8893, float:4.8994E-41)
            r2 = 0
            r0.glBindBuffer(r1, r2)
            r3.isBound = r2
            return
    }
}
