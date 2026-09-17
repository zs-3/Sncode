package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class SnapshotArray<T> extends com.badlogic.gdx.utils.Array<T> {
    private T[] recycled;
    private T[] snapshot;
    private int snapshots;

    public SnapshotArray(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public SnapshotArray(java.lang.Class r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public SnapshotArray(boolean r1, int r2, java.lang.Class r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private void modified() {
            r4 = this;
            T[] r0 = r4.snapshot
            if (r0 == 0) goto L22
            T[] r1 = r4.items
            if (r0 == r1) goto L9
            goto L22
        L9:
            T[] r0 = r4.recycled
            if (r0 == 0) goto L1e
            int r2 = r0.length
            int r3 = r4.size
            if (r2 < r3) goto L1e
            r2 = 0
            java.lang.System.arraycopy(r1, r2, r0, r2, r3)
            T[] r0 = r4.recycled
            r4.items = r0
            r0 = 0
            r4.recycled = r0
            goto L22
        L1e:
            int r0 = r1.length
            r4.resize(r0)
        L22:
            return
    }

    public T[] begin() {
            r2 = this;
            r2.modified()
            T[] r0 = r2.items
            r2.snapshot = r0
            int r1 = r2.snapshots
            int r1 = r1 + 1
            r2.snapshots = r1
            return r0
    }

    @Override // com.badlogic.gdx.utils.Array
    public void clear() {
            r0 = this;
            r0.modified()
            super.clear()
            return
    }

    public void end() {
            r5 = this;
            int r0 = r5.snapshots
            int r0 = r0 + (-1)
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            r5.snapshots = r0
            T[] r2 = r5.snapshot
            if (r2 != 0) goto L10
            return
        L10:
            T[] r3 = r5.items
            r4 = 0
            if (r2 == r3) goto L23
            if (r0 != 0) goto L23
            r5.recycled = r2
            int r0 = r2.length
        L1a:
            if (r1 >= r0) goto L23
            T[] r2 = r5.recycled
            r2[r1] = r4
            int r1 = r1 + 1
            goto L1a
        L23:
            r5.snapshot = r4
            return
    }

    @Override // com.badlogic.gdx.utils.Array
    public void insert(int r1, T r2) {
            r0 = this;
            r0.modified()
            super.insert(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.utils.Array
    public T pop() {
            r1 = this;
            r1.modified()
            java.lang.Object r0 = super.pop()
            return r0
    }

    @Override // com.badlogic.gdx.utils.Array
    public T removeIndex(int r1) {
            r0 = this;
            r0.modified()
            java.lang.Object r1 = super.removeIndex(r1)
            return r1
    }

    @Override // com.badlogic.gdx.utils.Array
    public void removeRange(int r1, int r2) {
            r0 = this;
            r0.modified()
            super.removeRange(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.utils.Array
    public boolean removeValue(T r1, boolean r2) {
            r0 = this;
            r0.modified()
            boolean r1 = super.removeValue(r1, r2)
            return r1
    }

    @Override // com.badlogic.gdx.utils.Array
    public void set(int r1, T r2) {
            r0 = this;
            r0.modified()
            super.set(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.utils.Array
    public void sort() {
            r0 = this;
            r0.modified()
            super.sort()
            return
    }

    @Override // com.badlogic.gdx.utils.Array
    public void sort(java.util.Comparator<? super T> r1) {
            r0 = this;
            r0.modified()
            super.sort(r1)
            return
    }

    @Override // com.badlogic.gdx.utils.Array
    public void truncate(int r1) {
            r0 = this;
            r0.modified()
            super.truncate(r1)
            return
    }
}
