package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class IntSet {
    boolean hasZeroValue;
    int[] keyTable;
    private final float loadFactor;
    protected int mask;
    protected int shift;
    public int size;
    private int threshold;

    public IntSet() {
            r2 = this;
            r0 = 51
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            r2.<init>(r0, r1)
            return
    }

    public IntSet(int r3, float r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L2a
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L2a
            r2.loadFactor = r4
            int r3 = com.badlogic.gdx.utils.ObjectSet.tableSize(r3, r4)
            float r0 = (float) r3
            float r0 = r0 * r4
            int r4 = (int) r0
            r2.threshold = r4
            int r4 = r3 + (-1)
            r2.mask = r4
            long r0 = (long) r4
            int r4 = java.lang.Long.numberOfLeadingZeros(r0)
            r2.shift = r4
            int[] r3 = new int[r3]
            r2.keyTable = r3
            return
        L2a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "loadFactor must be > 0 and < 1: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    private void addResize(int r4) {
            r3 = this;
            int[] r0 = r3.keyTable
            int r1 = r3.place(r4)
        L6:
            r2 = r0[r1]
            if (r2 != 0) goto Ld
            r0[r1] = r4
            return
        Ld:
            int r1 = r1 + 1
            int r2 = r3.mask
            r1 = r1 & r2
            goto L6
    }

    private int locateKey(int r4) {
            r3 = this;
            int[] r0 = r3.keyTable
            int r1 = r3.place(r4)
        L6:
            r2 = r0[r1]
            if (r2 != 0) goto Le
            int r1 = r1 + 1
            int r4 = -r1
            return r4
        Le:
            if (r2 != r4) goto L11
            return r1
        L11:
            int r1 = r1 + 1
            int r2 = r3.mask
            r1 = r1 & r2
            goto L6
    }

    private void resize(int r4) {
            r3 = this;
            int[] r0 = r3.keyTable
            int r0 = r0.length
            float r1 = (float) r4
            float r2 = r3.loadFactor
            float r1 = r1 * r2
            int r1 = (int) r1
            r3.threshold = r1
            int r1 = r4 + (-1)
            r3.mask = r1
            long r1 = (long) r1
            int r1 = java.lang.Long.numberOfLeadingZeros(r1)
            r3.shift = r1
            int[] r1 = r3.keyTable
            int[] r4 = new int[r4]
            r3.keyTable = r4
            int r4 = r3.size
            if (r4 <= 0) goto L2d
            r4 = 0
        L21:
            if (r4 >= r0) goto L2d
            r2 = r1[r4]
            if (r2 == 0) goto L2a
            r3.addResize(r2)
        L2a:
            int r4 = r4 + 1
            goto L21
        L2d:
            return
    }

    public boolean add(int r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 != 0) goto L11
            boolean r4 = r3.hasZeroValue
            if (r4 == 0) goto L9
            return r0
        L9:
            r3.hasZeroValue = r1
            int r4 = r3.size
            int r4 = r4 + r1
            r3.size = r4
            return r1
        L11:
            int r2 = r3.locateKey(r4)
            if (r2 < 0) goto L18
            return r0
        L18:
            int r2 = r2 + r1
            int r0 = -r2
            int[] r2 = r3.keyTable
            r2[r0] = r4
            int r4 = r3.size
            int r4 = r4 + r1
            r3.size = r4
            int r0 = r3.threshold
            if (r4 < r0) goto L2c
            int r4 = r2.length
            int r4 = r4 << r1
            r3.resize(r4)
        L2c:
            return r1
    }

    public boolean contains(int r1) {
            r0 = this;
            if (r1 != 0) goto L5
            boolean r1 = r0.hasZeroValue
            return r1
        L5:
            int r1 = r0.locateKey(r1)
            if (r1 < 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof com.badlogic.gdx.utils.IntSet
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.badlogic.gdx.utils.IntSet r6 = (com.badlogic.gdx.utils.IntSet) r6
            int r0 = r6.size
            int r2 = r5.size
            if (r0 == r2) goto Lf
            return r1
        Lf:
            boolean r0 = r6.hasZeroValue
            boolean r2 = r5.hasZeroValue
            if (r0 == r2) goto L16
            return r1
        L16:
            int[] r0 = r5.keyTable
            int r2 = r0.length
            r3 = 0
        L1a:
            if (r3 >= r2) goto L2c
            r4 = r0[r3]
            if (r4 == 0) goto L29
            r4 = r0[r3]
            boolean r4 = r6.contains(r4)
            if (r4 != 0) goto L29
            return r1
        L29:
            int r3 = r3 + 1
            goto L1a
        L2c:
            r6 = 1
            return r6
    }

    public int hashCode() {
            r5 = this;
            int r0 = r5.size
            int[] r1 = r5.keyTable
            int r2 = r1.length
            r3 = 0
        L6:
            if (r3 >= r2) goto L10
            r4 = r1[r3]
            if (r4 == 0) goto Ld
            int r0 = r0 + r4
        Ld:
            int r3 = r3 + 1
            goto L6
        L10:
            return r0
    }

    protected int place(int r5) {
            r4 = this;
            long r0 = (long) r5
            r2 = -7046029254386353131(0x9e3779b97f4a7c15, double:-4.0765893351549374E-163)
            long r0 = r0 * r2
            int r5 = r4.shift
            long r0 = r0 >>> r5
            int r5 = (int) r0
            return r5
    }

    public boolean remove(int r9) {
            r8 = this;
            r0 = 0
            r1 = 1
            if (r9 != 0) goto L11
            boolean r9 = r8.hasZeroValue
            if (r9 != 0) goto L9
            return r0
        L9:
            r8.hasZeroValue = r0
            int r9 = r8.size
            int r9 = r9 - r1
            r8.size = r9
            return r1
        L11:
            int r9 = r8.locateKey(r9)
            if (r9 >= 0) goto L18
            return r0
        L18:
            int[] r2 = r8.keyTable
            int r3 = r8.mask
            int r4 = r9 + 1
        L1e:
            r4 = r4 & r3
            r5 = r2[r4]
            if (r5 == 0) goto L35
            int r6 = r8.place(r5)
            int r7 = r4 - r6
            r7 = r7 & r3
            int r6 = r9 - r6
            r6 = r6 & r3
            if (r7 <= r6) goto L32
            r2[r9] = r5
            r9 = r4
        L32:
            int r4 = r4 + 1
            goto L1e
        L35:
            r2[r9] = r0
            int r9 = r8.size
            int r9 = r9 - r1
            r8.size = r9
            return r1
    }

    public java.lang.String toString() {
            r5 = this;
            int r0 = r5.size
            if (r0 != 0) goto L7
            java.lang.String r0 = "[]"
            return r0
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 32
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            int[] r1 = r5.keyTable
            int r2 = r1.length
            boolean r3 = r5.hasZeroValue
            if (r3 == 0) goto L20
            java.lang.String r3 = "0"
            r0.append(r3)
            goto L2e
        L20:
            int r3 = r2 + (-1)
            if (r2 <= 0) goto L2d
            r2 = r1[r3]
            if (r2 != 0) goto L2a
            r2 = r3
            goto L20
        L2a:
            r0.append(r2)
        L2d:
            r2 = r3
        L2e:
            int r3 = r2 + (-1)
            if (r2 <= 0) goto L40
            r2 = r1[r3]
            if (r2 != 0) goto L37
            goto L2d
        L37:
            java.lang.String r4 = ", "
            r0.append(r4)
            r0.append(r2)
            goto L2d
        L40:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
