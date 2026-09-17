package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class IntArray {
    public int[] items;
    public boolean ordered;
    public int size;

    public IntArray() {
            r2 = this;
            r0 = 1
            r1 = 16
            r2.<init>(r0, r1)
            return
    }

    public IntArray(int r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0, r2)
            return
    }

    public IntArray(boolean r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.ordered = r1
            int[] r1 = new int[r2]
            r0.items = r1
            return
    }

    public void add(int r4) {
            r3 = this;
            int[] r0 = r3.items
            int r1 = r3.size
            int r2 = r0.length
            if (r1 != r2) goto L17
            r0 = 8
            float r1 = (float) r1
            r2 = 1071644672(0x3fe00000, float:1.75)
            float r1 = r1 * r2
            int r1 = (int) r1
            int r0 = java.lang.Math.max(r0, r1)
            int[] r0 = r3.resize(r0)
        L17:
            int r1 = r3.size
            int r2 = r1 + 1
            r3.size = r2
            r0[r1] = r4
            return
    }

    public void add(int r5, int r6) {
            r4 = this;
            int[] r0 = r4.items
            int r1 = r4.size
            int r2 = r1 + 1
            int r3 = r0.length
            if (r2 < r3) goto L19
            r0 = 8
            float r1 = (float) r1
            r2 = 1071644672(0x3fe00000, float:1.75)
            float r1 = r1 * r2
            int r1 = (int) r1
            int r0 = java.lang.Math.max(r0, r1)
            int[] r0 = r4.resize(r0)
        L19:
            int r1 = r4.size
            r0[r1] = r5
            int r5 = r1 + 1
            r0[r5] = r6
            int r1 = r1 + 2
            r4.size = r1
            return
    }

    public void addAll(int... r3) {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            r2.addAll(r3, r1, r0)
            return
    }

    public void addAll(int[] r4, int r5, int r6) {
            r3 = this;
            int[] r0 = r3.items
            int r1 = r3.size
            int r1 = r1 + r6
            int r2 = r0.length
            if (r1 <= r2) goto L1e
            r0 = 8
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r3.size
            float r1 = (float) r1
            r2 = 1071644672(0x3fe00000, float:1.75)
            float r1 = r1 * r2
            int r1 = (int) r1
            int r0 = java.lang.Math.max(r0, r1)
            int[] r0 = r3.resize(r0)
        L1e:
            int r1 = r3.size
            java.lang.System.arraycopy(r4, r5, r0, r1, r6)
            int r4 = r3.size
            int r4 = r4 + r6
            r3.size = r4
            return
    }

    public void clear() {
            r1 = this;
            r0 = 0
            r1.size = r0
            return
    }

    public int[] ensureCapacity(int r4) {
            r3 = this;
            if (r4 < 0) goto L22
            int r0 = r3.size
            int r0 = r0 + r4
            int[] r4 = r3.items
            int r4 = r4.length
            if (r0 <= r4) goto L1f
            r4 = 8
            int r4 = java.lang.Math.max(r4, r0)
            int r0 = r3.size
            float r0 = (float) r0
            r1 = 1071644672(0x3fe00000, float:1.75)
            float r0 = r0 * r1
            int r0 = (int) r0
            int r4 = java.lang.Math.max(r4, r0)
            r3.resize(r4)
        L1f:
            int[] r4 = r3.items
            return r4
        L22:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "additionalCapacity must be >= 0: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r7.ordered
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            boolean r1 = r8 instanceof com.badlogic.gdx.utils.IntArray
            if (r1 != 0) goto Lf
            return r2
        Lf:
            com.badlogic.gdx.utils.IntArray r8 = (com.badlogic.gdx.utils.IntArray) r8
            boolean r1 = r8.ordered
            if (r1 != 0) goto L16
            return r2
        L16:
            int r1 = r7.size
            int r3 = r8.size
            if (r1 == r3) goto L1d
            return r2
        L1d:
            int[] r3 = r7.items
            int[] r8 = r8.items
            r4 = 0
        L22:
            if (r4 >= r1) goto L2e
            r5 = r3[r4]
            r6 = r8[r4]
            if (r5 == r6) goto L2b
            return r2
        L2b:
            int r4 = r4 + 1
            goto L22
        L2e:
            return r0
    }

    public int get(int r4) {
            r3 = this;
            int r0 = r3.size
            if (r4 >= r0) goto L9
            int[] r0 = r3.items
            r4 = r0[r4]
            return r4
        L9:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "index can't be >= size: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " >= "
            r1.append(r4)
            int r4 = r3.size
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public int hashCode() {
            r5 = this;
            boolean r0 = r5.ordered
            if (r0 != 0) goto L9
            int r0 = super.hashCode()
            return r0
        L9:
            int[] r0 = r5.items
            r1 = 0
            int r2 = r5.size
            r3 = 1
        Lf:
            if (r1 >= r2) goto L19
            int r3 = r3 * 31
            r4 = r0[r1]
            int r3 = r3 + r4
            int r1 = r1 + 1
            goto Lf
        L19:
            return r3
    }

    public void insert(int r4, int r5) {
            r3 = this;
            int r0 = r3.size
            if (r4 > r0) goto L35
            int[] r1 = r3.items
            int r2 = r1.length
            if (r0 != r2) goto L19
            r1 = 8
            float r0 = (float) r0
            r2 = 1071644672(0x3fe00000, float:1.75)
            float r0 = r0 * r2
            int r0 = (int) r0
            int r0 = java.lang.Math.max(r1, r0)
            int[] r1 = r3.resize(r0)
        L19:
            boolean r0 = r3.ordered
            if (r0 == 0) goto L26
            int r0 = r4 + 1
            int r2 = r3.size
            int r2 = r2 - r4
            java.lang.System.arraycopy(r1, r4, r1, r0, r2)
            goto L2c
        L26:
            int r0 = r3.size
            r2 = r1[r4]
            r1[r0] = r2
        L2c:
            int r0 = r3.size
            int r0 = r0 + 1
            r3.size = r0
            r1[r4] = r5
            return
        L35:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "index can't be > size: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " > "
            r0.append(r4)
            int r4 = r3.size
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
    }

    public int peek() {
            r2 = this;
            int[] r0 = r2.items
            int r1 = r2.size
            int r1 = r1 + (-1)
            r0 = r0[r1]
            return r0
    }

    public int pop() {
            r2 = this;
            int[] r0 = r2.items
            int r1 = r2.size
            int r1 = r1 + (-1)
            r2.size = r1
            r0 = r0[r1]
            return r0
    }

    public int removeIndex(int r5) {
            r4 = this;
            int r0 = r4.size
            if (r5 >= r0) goto L1c
            int[] r1 = r4.items
            r2 = r1[r5]
            int r0 = r0 + (-1)
            r4.size = r0
            boolean r3 = r4.ordered
            if (r3 == 0) goto L17
            int r3 = r5 + 1
            int r0 = r0 - r5
            java.lang.System.arraycopy(r1, r3, r1, r5, r0)
            goto L1b
        L17:
            r0 = r1[r0]
            r1[r5] = r0
        L1b:
            return r2
        L1c:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "index can't be >= size: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " >= "
            r1.append(r5)
            int r5 = r4.size
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    protected int[] resize(int r4) {
            r3 = this;
            int[] r0 = new int[r4]
            int[] r1 = r3.items
            int r2 = r3.size
            int r4 = java.lang.Math.min(r2, r4)
            r2 = 0
            java.lang.System.arraycopy(r1, r2, r0, r2, r4)
            r3.items = r0
            return r0
    }

    public void set(int r3, int r4) {
            r2 = this;
            int r0 = r2.size
            if (r3 >= r0) goto L9
            int[] r0 = r2.items
            r0[r3] = r4
            return
        L9:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "index can't be >= size: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " >= "
            r0.append(r3)
            int r3 = r2.size
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.size
            if (r0 != 0) goto L7
            java.lang.String r0 = "[]"
            return r0
        L7:
            int[] r0 = r4.items
            com.badlogic.gdx.utils.StringBuilder r1 = new com.badlogic.gdx.utils.StringBuilder
            r2 = 32
            r1.<init>(r2)
            r2 = 91
            r1.append(r2)
            r2 = 0
            r2 = r0[r2]
            r1.append(r2)
            r2 = 1
        L1c:
            int r3 = r4.size
            if (r2 >= r3) goto L2d
            java.lang.String r3 = ", "
            r1.append(r3)
            r3 = r0[r2]
            r1.append(r3)
            int r2 = r2 + 1
            goto L1c
        L2d:
            r0 = 93
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
