package com.badlogic.gdx.graphics.glutils;

/* loaded from: classes.dex */
public class IndexArray implements com.badlogic.gdx.graphics.glutils.IndexData {
    final java.nio.ShortBuffer buffer;
    final java.nio.ByteBuffer byteBuffer;
    private final boolean empty;

    public IndexArray(int r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            if (r3 != 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            r2.empty = r1
            if (r1 == 0) goto Le
            r3 = 1
        Le:
            int r3 = r3 * 2
            java.nio.ByteBuffer r3 = com.badlogic.gdx.utils.BufferUtils.newUnsafeByteBuffer(r3)
            r2.byteBuffer = r3
            java.nio.ShortBuffer r0 = r3.asShortBuffer()
            r2.buffer = r0
            r0.flip()
            r3.flip()
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.IndexData
    public void bind() {
            r0 = this;
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.IndexData, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.byteBuffer
            com.badlogic.gdx.utils.BufferUtils.disposeUnsafeByteBuffer(r0)
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.IndexData
    public java.nio.ShortBuffer getBuffer(boolean r1) {
            r0 = this;
            java.nio.ShortBuffer r1 = r0.buffer
            return r1
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
            r0 = this;
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.IndexData
    public void setIndices(short[] r2, int r3, int r4) {
            r1 = this;
            java.nio.ShortBuffer r0 = r1.buffer
            r0.clear()
            java.nio.ShortBuffer r0 = r1.buffer
            r0.put(r2, r3, r4)
            java.nio.ShortBuffer r2 = r1.buffer
            r2.flip()
            java.nio.ByteBuffer r2 = r1.byteBuffer
            r3 = 0
            r2.position(r3)
            java.nio.ByteBuffer r2 = r1.byteBuffer
            int r3 = r4 << 1
            r2.limit(r3)
            return
    }

    @Override // com.badlogic.gdx.graphics.glutils.IndexData
    public void unbind() {
            r0 = this;
            return
    }
}
