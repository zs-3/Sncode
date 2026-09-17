package com.badlogic.gdx.graphics.glutils;

/* loaded from: classes.dex */
public class IndexBufferObject implements com.badlogic.gdx.graphics.glutils.IndexData {
    final java.nio.ShortBuffer buffer;
    int bufferHandle;
    final java.nio.ByteBuffer byteBuffer;
    private final boolean empty;
    boolean isBound;
    final boolean isDirect;
    boolean isDirty;
    final boolean ownsBuffer;
    final int usage;

    public IndexBufferObject(boolean r3, int r4) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.isDirty = r0
            r1 = 0
            r2.isBound = r1
            if (r4 != 0) goto Lc
            r1 = 1
        Lc:
            r2.empty = r1
            if (r1 == 0) goto L11
            r4 = 1
        L11:
            int r4 = r4 * 2
            java.nio.ByteBuffer r4 = com.badlogic.gdx.utils.BufferUtils.newUnsafeByteBuffer(r4)
            r2.byteBuffer = r4
            r2.isDirect = r0
            java.nio.ShortBuffer r1 = r4.asShortBuffer()
            r2.buffer = r1
            r2.ownsBuffer = r0
            r1.flip()
            r4.flip()
            com.badlogic.gdx.graphics.GL20 r4 = com.badlogic.gdx.Gdx.gl20
            int r4 = r4.glGenBuffer()
            r2.bufferHandle = r4
            if (r3 == 0) goto L37
            r3 = 35044(0x88e4, float:4.9107E-41)
            goto L3a
        L37:
            r3 = 35048(0x88e8, float:4.9113E-41)
        L3a:
            r2.usage = r3
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.IndexData
    public void bind() {
            r5 = this;
            int r0 = r5.bufferHandle
            if (r0 == 0) goto L33
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl20
            r2 = 34963(0x8893, float:4.8994E-41)
            r1.glBindBuffer(r2, r0)
            boolean r0 = r5.isDirty
            if (r0 == 0) goto L2f
            java.nio.ByteBuffer r0 = r5.byteBuffer
            java.nio.ShortBuffer r1 = r5.buffer
            int r1 = r1.limit()
            int r1 = r1 * 2
            r0.limit(r1)
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            java.nio.ByteBuffer r1 = r5.byteBuffer
            int r1 = r1.limit()
            java.nio.ByteBuffer r3 = r5.byteBuffer
            int r4 = r5.usage
            r0.glBufferData(r2, r1, r3, r4)
            r0 = 0
            r5.isDirty = r0
        L2f:
            r0 = 1
            r5.isBound = r0
            return
        L33:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "No buffer allocated!"
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
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            int r1 = r3.bufferHandle
            r0.glDeleteBuffer(r1)
            r3.bufferHandle = r2
            boolean r0 = r3.ownsBuffer
            if (r0 == 0) goto L1b
            java.nio.ByteBuffer r0 = r3.byteBuffer
            com.badlogic.gdx.utils.BufferUtils.disposeUnsafeByteBuffer(r0)
        L1b:
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
            boolean r0 = r1.empty
            if (r0 == 0) goto L6
            r0 = 0
            goto Lc
        L6:
            java.nio.ShortBuffer r0 = r1.buffer
            int r0 = r0.limit()
        Lc:
            return r0
    }

    @Override // com.badlogic.gdx.graphics.glutils.IndexData
    public int getNumMaxIndices() {
            r1 = this;
            boolean r0 = r1.empty
            if (r0 == 0) goto L6
            r0 = 0
            goto Lc
        L6:
            java.nio.ShortBuffer r0 = r1.buffer
            int r0 = r0.capacity()
        Lc:
            return r0
    }

    @Override // com.badlogic.gdx.graphics.glutils.IndexData
    public void invalidate() {
            r1 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            int r0 = r0.glGenBuffer()
            r1.bufferHandle = r0
            r0 = 1
            r1.isDirty = r0
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.IndexData
    public void setIndices(short[] r4, int r5, int r6) {
            r3 = this;
            r0 = 1
            r3.isDirty = r0
            java.nio.ShortBuffer r1 = r3.buffer
            r1.clear()
            java.nio.ShortBuffer r1 = r3.buffer
            r1.put(r4, r5, r6)
            java.nio.ShortBuffer r4 = r3.buffer
            r4.flip()
            java.nio.ByteBuffer r4 = r3.byteBuffer
            r5 = 0
            r4.position(r5)
            java.nio.ByteBuffer r4 = r3.byteBuffer
            int r6 = r6 << r0
            r4.limit(r6)
            boolean r4 = r3.isBound
            if (r4 == 0) goto L36
            com.badlogic.gdx.graphics.GL20 r4 = com.badlogic.gdx.Gdx.gl20
            r6 = 34963(0x8893, float:4.8994E-41)
            java.nio.ByteBuffer r0 = r3.byteBuffer
            int r0 = r0.limit()
            java.nio.ByteBuffer r1 = r3.byteBuffer
            int r2 = r3.usage
            r4.glBufferData(r6, r0, r1, r2)
            r3.isDirty = r5
        L36:
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
