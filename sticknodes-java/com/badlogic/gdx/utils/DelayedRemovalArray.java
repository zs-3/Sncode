package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class DelayedRemovalArray<T> extends com.badlogic.gdx.utils.Array<T> {
    private int clear;
    private int iterating;
    private com.badlogic.gdx.utils.IntArray remove;

    public DelayedRemovalArray(int r2) {
            r1 = this;
            r1.<init>(r2)
            com.badlogic.gdx.utils.IntArray r2 = new com.badlogic.gdx.utils.IntArray
            r0 = 0
            r2.<init>(r0)
            r1.remove = r2
            return
    }

    private void remove(int r4) {
            r3 = this;
            int r0 = r3.clear
            if (r4 >= r0) goto L5
            return
        L5:
            r0 = 0
            com.badlogic.gdx.utils.IntArray r1 = r3.remove
            int r1 = r1.size
        La:
            if (r0 >= r1) goto L20
            com.badlogic.gdx.utils.IntArray r2 = r3.remove
            int r2 = r2.get(r0)
            if (r4 != r2) goto L15
            return
        L15:
            if (r4 >= r2) goto L1d
            com.badlogic.gdx.utils.IntArray r1 = r3.remove
            r1.insert(r0, r4)
            return
        L1d:
            int r0 = r0 + 1
            goto La
        L20:
            com.badlogic.gdx.utils.IntArray r0 = r3.remove
            r0.add(r4)
            return
    }

    public void begin() {
            r1 = this;
            int r0 = r1.iterating
            int r0 = r0 + 1
            r1.iterating = r0
            return
    }

    @Override // com.badlogic.gdx.utils.Array
    public void clear() {
            r1 = this;
            int r0 = r1.iterating
            if (r0 <= 0) goto L9
            int r0 = r1.size
            r1.clear = r0
            return
        L9:
            super.clear()
            return
    }

    public void end() {
            r5 = this;
            int r0 = r5.iterating
            if (r0 == 0) goto L42
            int r0 = r0 + (-1)
            r5.iterating = r0
            if (r0 != 0) goto L41
            int r0 = r5.clear
            r1 = 0
            if (r0 <= 0) goto L1c
            int r2 = r5.size
            if (r0 != r2) goto L1c
            com.badlogic.gdx.utils.IntArray r0 = r5.remove
            r0.clear()
            r5.clear()
            goto L3f
        L1c:
            com.badlogic.gdx.utils.IntArray r0 = r5.remove
            int r0 = r0.size
            r2 = 0
        L21:
            if (r2 >= r0) goto L33
            com.badlogic.gdx.utils.IntArray r3 = r5.remove
            int r3 = r3.pop()
            int r4 = r5.clear
            if (r3 < r4) goto L30
            r5.removeIndex(r3)
        L30:
            int r2 = r2 + 1
            goto L21
        L33:
            int r0 = r5.clear
            int r0 = r0 + (-1)
        L37:
            if (r0 < 0) goto L3f
            r5.removeIndex(r0)
            int r0 = r0 + (-1)
            goto L37
        L3f:
            r5.clear = r1
        L41:
            return
        L42:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "begin must be called before end."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.badlogic.gdx.utils.Array
    public void insert(int r2, T r3) {
            r1 = this;
            int r0 = r1.iterating
            if (r0 > 0) goto L8
            super.insert(r2, r3)
            return
        L8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Invalid between begin/end."
            r2.<init>(r3)
            throw r2
    }

    @Override // com.badlogic.gdx.utils.Array
    public T pop() {
            r2 = this;
            int r0 = r2.iterating
            if (r0 > 0) goto L9
            java.lang.Object r0 = super.pop()
            return r0
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Invalid between begin/end."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.badlogic.gdx.utils.Array
    public T removeIndex(int r2) {
            r1 = this;
            int r0 = r1.iterating
            if (r0 <= 0) goto Lc
            r1.remove(r2)
            java.lang.Object r2 = r1.get(r2)
            return r2
        Lc:
            java.lang.Object r2 = super.removeIndex(r2)
            return r2
    }

    @Override // com.badlogic.gdx.utils.Array
    public void removeRange(int r2, int r3) {
            r1 = this;
            int r0 = r1.iterating
            if (r0 <= 0) goto Lc
        L4:
            if (r3 < r2) goto Lf
            r1.remove(r3)
            int r3 = r3 + (-1)
            goto L4
        Lc:
            super.removeRange(r2, r3)
        Lf:
            return
    }

    @Override // com.badlogic.gdx.utils.Array
    public boolean removeValue(T r2, boolean r3) {
            r1 = this;
            int r0 = r1.iterating
            if (r0 <= 0) goto L12
            int r2 = r1.indexOf(r2, r3)
            r3 = -1
            if (r2 != r3) goto Ld
            r2 = 0
            return r2
        Ld:
            r1.remove(r2)
            r2 = 1
            return r2
        L12:
            boolean r2 = super.removeValue(r2, r3)
            return r2
    }

    @Override // com.badlogic.gdx.utils.Array
    public void set(int r2, T r3) {
            r1 = this;
            int r0 = r1.iterating
            if (r0 > 0) goto L8
            super.set(r2, r3)
            return
        L8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Invalid between begin/end."
            r2.<init>(r3)
            throw r2
    }

    @Override // com.badlogic.gdx.utils.Array
    public void sort() {
            r2 = this;
            int r0 = r2.iterating
            if (r0 > 0) goto L8
            super.sort()
            return
        L8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Invalid between begin/end."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.badlogic.gdx.utils.Array
    public void sort(java.util.Comparator<? super T> r2) {
            r1 = this;
            int r0 = r1.iterating
            if (r0 > 0) goto L8
            super.sort(r2)
            return
        L8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Invalid between begin/end."
            r2.<init>(r0)
            throw r2
    }

    @Override // com.badlogic.gdx.utils.Array
    public void truncate(int r2) {
            r1 = this;
            int r0 = r1.iterating
            if (r0 > 0) goto L8
            super.truncate(r2)
            return
        L8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Invalid between begin/end."
            r2.<init>(r0)
            throw r2
    }
}
