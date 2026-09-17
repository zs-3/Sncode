package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class FloatArray {
    public float[] items;
    public boolean ordered;
    public int size;

    public FloatArray() {
            r2 = this;
            r0 = 1
            r1 = 16
            r2.<init>(r0, r1)
            return
    }

    public FloatArray(int r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0, r2)
            return
    }

    public FloatArray(boolean r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.ordered = r1
            float[] r1 = new float[r2]
            r0.items = r1
            return
    }

    public void add(float r4) {
            r3 = this;
            float[] r0 = r3.items
            int r1 = r3.size
            int r2 = r0.length
            if (r1 != r2) goto L17
            r0 = 8
            float r1 = (float) r1
            r2 = 1071644672(0x3fe00000, float:1.75)
            float r1 = r1 * r2
            int r1 = (int) r1
            int r0 = java.lang.Math.max(r0, r1)
            float[] r0 = r3.resize(r0)
        L17:
            int r1 = r3.size
            int r2 = r1 + 1
            r3.size = r2
            r0[r1] = r4
            return
    }

    public void addAll(com.badlogic.gdx.utils.FloatArray r3) {
            r2 = this;
            float[] r0 = r3.items
            int r3 = r3.size
            r1 = 0
            r2.addAll(r0, r1, r3)
            return
    }

    public void addAll(com.badlogic.gdx.utils.FloatArray r4, int r5, int r6) {
            r3 = this;
            int r0 = r5 + r6
            int r1 = r4.size
            if (r0 > r1) goto Lc
            float[] r4 = r4.items
            r3.addAll(r4, r5, r6)
            return
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "offset + length must be <= size: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " + "
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = " <= "
            r1.append(r5)
            int r4 = r4.size
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public void addAll(float[] r4, int r5, int r6) {
            r3 = this;
            float[] r0 = r3.items
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
            float[] r0 = r3.resize(r0)
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

    public float[] ensureCapacity(int r4) {
            r3 = this;
            if (r4 < 0) goto L22
            int r0 = r3.size
            int r0 = r0 + r4
            float[] r4 = r3.items
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
            float[] r4 = r3.items
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
            boolean r1 = r8 instanceof com.badlogic.gdx.utils.FloatArray
            if (r1 != 0) goto Lf
            return r2
        Lf:
            com.badlogic.gdx.utils.FloatArray r8 = (com.badlogic.gdx.utils.FloatArray) r8
            boolean r1 = r8.ordered
            if (r1 != 0) goto L16
            return r2
        L16:
            int r1 = r7.size
            int r3 = r8.size
            if (r1 == r3) goto L1d
            return r2
        L1d:
            float[] r3 = r7.items
            float[] r8 = r8.items
            r4 = 0
        L22:
            if (r4 >= r1) goto L30
            r5 = r3[r4]
            r6 = r8[r4]
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 == 0) goto L2d
            return r2
        L2d:
            int r4 = r4 + 1
            goto L22
        L30:
            return r0
    }

    public float first() {
            r2 = this;
            int r0 = r2.size
            if (r0 == 0) goto La
            float[] r0 = r2.items
            r1 = 0
            r0 = r0[r1]
            return r0
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Array is empty."
            r0.<init>(r1)
            throw r0
    }

    public float get(int r4) {
            r3 = this;
            int r0 = r3.size
            if (r4 >= r0) goto L9
            float[] r0 = r3.items
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
            float[] r0 = r5.items
            r1 = 0
            int r2 = r5.size
            r3 = 1
        Lf:
            if (r1 >= r2) goto L1d
            int r3 = r3 * 31
            r4 = r0[r1]
            int r4 = com.badlogic.gdx.utils.NumberUtils.floatToRawIntBits(r4)
            int r3 = r3 + r4
            int r1 = r1 + 1
            goto Lf
        L1d:
            return r3
    }

    public boolean notEmpty() {
            r1 = this;
            int r0 = r1.size
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public void removeRange(int r5, int r6) {
            r4 = this;
            int r0 = r4.size
            if (r6 >= r0) goto L46
            if (r5 > r6) goto L27
            int r1 = r6 - r5
            int r1 = r1 + 1
            int r2 = r0 - r1
            boolean r3 = r4.ordered
            if (r3 == 0) goto L18
            float[] r6 = r4.items
            int r1 = r1 + r5
            int r0 = r0 - r1
            java.lang.System.arraycopy(r6, r1, r6, r5, r0)
            goto L24
        L18:
            int r6 = r6 + 1
            int r6 = java.lang.Math.max(r2, r6)
            float[] r1 = r4.items
            int r0 = r0 - r6
            java.lang.System.arraycopy(r1, r6, r1, r5, r0)
        L24:
            r4.size = r2
            return
        L27:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "start can't be > end: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " > "
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L46:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "end can't be >= size: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = " >= "
            r0.append(r6)
            int r6 = r4.size
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
    }

    protected float[] resize(int r4) {
            r3 = this;
            float[] r0 = new float[r4]
            float[] r1 = r3.items
            int r2 = r3.size
            int r4 = java.lang.Math.min(r2, r4)
            r2 = 0
            java.lang.System.arraycopy(r1, r2, r0, r2, r4)
            r3.items = r0
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.size
            if (r0 != 0) goto L7
            java.lang.String r0 = "[]"
            return r0
        L7:
            float[] r0 = r4.items
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

    public void truncate(int r2) {
            r1 = this;
            int r0 = r1.size
            if (r0 <= r2) goto L6
            r1.size = r2
        L6:
            return
    }
}
