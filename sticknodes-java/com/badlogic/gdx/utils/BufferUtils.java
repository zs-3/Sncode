package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public final class BufferUtils {
    static int allocatedUnsafe;
    static com.badlogic.gdx.utils.Array<java.nio.ByteBuffer> unsafeBuffers;

    static {
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            com.badlogic.gdx.utils.BufferUtils.unsafeBuffers = r0
            r0 = 0
            com.badlogic.gdx.utils.BufferUtils.allocatedUnsafe = r0
            return
    }

    public static void copy(float[] r1, java.nio.Buffer r2, int r3, int r4) {
            boolean r0 = r2 instanceof java.nio.ByteBuffer
            if (r0 == 0) goto La
            int r0 = r3 << 2
            r2.limit(r0)
            goto L11
        La:
            boolean r0 = r2 instanceof java.nio.FloatBuffer
            if (r0 == 0) goto L11
            r2.limit(r3)
        L11:
            copyJni(r1, r2, r3, r4)
            r1 = 0
            r2.position(r1)
            return
    }

    private static native void copyJni(float[] r0, java.nio.Buffer r1, int r2, int r3);

    public static void disposeUnsafeByteBuffer(java.nio.ByteBuffer r4) {
            int r0 = r4.capacity()
            com.badlogic.gdx.utils.Array<java.nio.ByteBuffer> r1 = com.badlogic.gdx.utils.BufferUtils.unsafeBuffers
            monitor-enter(r1)
            com.badlogic.gdx.utils.Array<java.nio.ByteBuffer> r2 = com.badlogic.gdx.utils.BufferUtils.unsafeBuffers     // Catch: java.lang.Throwable -> L22
            r3 = 1
            boolean r2 = r2.removeValue(r4, r3)     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L1a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
            int r1 = com.badlogic.gdx.utils.BufferUtils.allocatedUnsafe
            int r1 = r1 - r0
            com.badlogic.gdx.utils.BufferUtils.allocatedUnsafe = r1
            freeMemory(r4)
            return
        L1a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = "buffer not allocated with newUnsafeByteBuffer or already disposed"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L22
            throw r4     // Catch: java.lang.Throwable -> L22
        L22:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
            throw r4
    }

    private static native void freeMemory(java.nio.ByteBuffer r0);

    public static java.nio.ByteBuffer newByteBuffer(int r1) {
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r1.order(r0)
            return r1
    }

    private static native java.nio.ByteBuffer newDisposableByteBuffer(int r0);

    public static java.nio.FloatBuffer newFloatBuffer(int r1) {
            int r1 = r1 * 4
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r1.order(r0)
            java.nio.FloatBuffer r1 = r1.asFloatBuffer()
            return r1
    }

    public static java.nio.IntBuffer newIntBuffer(int r1) {
            int r1 = r1 * 4
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r1.order(r0)
            java.nio.IntBuffer r1 = r1.asIntBuffer()
            return r1
    }

    public static java.nio.ByteBuffer newUnsafeByteBuffer(int r2) {
            java.nio.ByteBuffer r0 = newDisposableByteBuffer(r2)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            r0.order(r1)
            int r1 = com.badlogic.gdx.utils.BufferUtils.allocatedUnsafe
            int r1 = r1 + r2
            com.badlogic.gdx.utils.BufferUtils.allocatedUnsafe = r1
            com.badlogic.gdx.utils.Array<java.nio.ByteBuffer> r2 = com.badlogic.gdx.utils.BufferUtils.unsafeBuffers
            monitor-enter(r2)
            com.badlogic.gdx.utils.Array<java.nio.ByteBuffer> r1 = com.badlogic.gdx.utils.BufferUtils.unsafeBuffers     // Catch: java.lang.Throwable -> L1a
            r1.add(r0)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            return r0
        L1a:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            throw r0
    }
}
