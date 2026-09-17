package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public abstract class Pool<T> {
    private final com.badlogic.gdx.utils.Array<T> freeObjects;
    public final int max;
    public int peak;

    public interface Poolable {
        void reset();
    }

    public Pool() {
            r2 = this;
            r0 = 16
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2.<init>(r0, r1)
            return
    }

    public Pool(int r2) {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.<init>(r2, r0)
            return
    }

    public Pool(int r3, int r4) {
            r2 = this;
            r2.<init>()
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r1 = 0
            r0.<init>(r1, r3)
            r2.freeObjects = r0
            r2.max = r4
            return
    }

    public void clear() {
            r4 = this;
            com.badlogic.gdx.utils.Array<T> r0 = r4.freeObjects
            int r1 = r0.size
            r2 = 0
        L5:
            if (r2 >= r1) goto L11
            java.lang.Object r3 = r0.get(r2)
            r4.discard(r3)
            int r2 = r2 + 1
            goto L5
        L11:
            r0.clear()
            return
    }

    protected void discard(T r1) {
            r0 = this;
            r0.reset(r1)
            return
    }

    public void fill(int r5) {
            r4 = this;
            r0 = 0
        L1:
            if (r0 >= r5) goto L15
            com.badlogic.gdx.utils.Array<T> r1 = r4.freeObjects
            int r2 = r1.size
            int r3 = r4.max
            if (r2 >= r3) goto L12
            java.lang.Object r2 = r4.newObject()
            r1.add(r2)
        L12:
            int r0 = r0 + 1
            goto L1
        L15:
            int r5 = r4.peak
            com.badlogic.gdx.utils.Array<T> r0 = r4.freeObjects
            int r0 = r0.size
            int r5 = java.lang.Math.max(r5, r0)
            r4.peak = r5
            return
    }

    public void free(T r4) {
            r3 = this;
            if (r4 == 0) goto L21
            com.badlogic.gdx.utils.Array<T> r0 = r3.freeObjects
            int r1 = r0.size
            int r2 = r3.max
            if (r1 >= r2) goto L1d
            r0.add(r4)
            int r0 = r3.peak
            com.badlogic.gdx.utils.Array<T> r1 = r3.freeObjects
            int r1 = r1.size
            int r0 = java.lang.Math.max(r0, r1)
            r3.peak = r0
            r3.reset(r4)
            goto L20
        L1d:
            r3.discard(r4)
        L20:
            return
        L21:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "object cannot be null."
            r4.<init>(r0)
            throw r4
    }

    public void freeAll(com.badlogic.gdx.utils.Array<T> r7) {
            r6 = this;
            if (r7 == 0) goto L2e
            com.badlogic.gdx.utils.Array<T> r0 = r6.freeObjects
            int r1 = r6.max
            r2 = 0
            int r3 = r7.size
        L9:
            if (r2 >= r3) goto L23
            java.lang.Object r4 = r7.get(r2)
            if (r4 != 0) goto L12
            goto L20
        L12:
            int r5 = r0.size
            if (r5 >= r1) goto L1d
            r0.add(r4)
            r6.reset(r4)
            goto L20
        L1d:
            r6.discard(r4)
        L20:
            int r2 = r2 + 1
            goto L9
        L23:
            int r7 = r6.peak
            int r0 = r0.size
            int r7 = java.lang.Math.max(r7, r0)
            r6.peak = r7
            return
        L2e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "objects cannot be null."
            r7.<init>(r0)
            throw r7
    }

    public int getFree() {
            r1 = this;
            com.badlogic.gdx.utils.Array<T> r0 = r1.freeObjects
            int r0 = r0.size
            return r0
    }

    protected abstract T newObject();

    public T obtain() {
            r2 = this;
            com.badlogic.gdx.utils.Array<T> r0 = r2.freeObjects
            int r1 = r0.size
            if (r1 != 0) goto Lb
            java.lang.Object r0 = r2.newObject()
            goto Lf
        Lb:
            java.lang.Object r0 = r0.pop()
        Lf:
            return r0
    }

    protected void reset(T r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.badlogic.gdx.utils.Pool.Poolable
            if (r0 == 0) goto L9
            com.badlogic.gdx.utils.Pool$Poolable r2 = (com.badlogic.gdx.utils.Pool.Poolable) r2
            r2.reset()
        L9:
            return
    }
}
