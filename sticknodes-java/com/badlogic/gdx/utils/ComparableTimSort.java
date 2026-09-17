package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
class ComparableTimSort {
    private java.lang.Object[] a;
    private int minGallop;
    private final int[] runBase;
    private final int[] runLen;
    private int stackSize;
    private java.lang.Object[] tmp;
    private int tmpCount;

    ComparableTimSort() {
            r2 = this;
            r2.<init>()
            r0 = 7
            r2.minGallop = r0
            r0 = 0
            r2.stackSize = r0
            r0 = 256(0x100, float:3.59E-43)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2.tmp = r0
            r0 = 40
            int[] r1 = new int[r0]
            r2.runBase = r1
            int[] r0 = new int[r0]
            r2.runLen = r0
            return
    }

    private static void binarySort(java.lang.Object[] r5, int r6, int r7, int r8) {
            if (r8 != r6) goto L4
        L2:
            int r8 = r8 + 1
        L4:
            if (r8 >= r7) goto L3e
            r0 = r5[r8]
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            r1 = r6
            r2 = r8
        Lc:
            r3 = 1
            if (r1 >= r2) goto L20
            int r4 = r1 + r2
            int r3 = r4 >>> 1
            r4 = r5[r3]
            int r4 = r0.compareTo(r4)
            if (r4 >= 0) goto L1d
            r2 = r3
            goto Lc
        L1d:
            int r1 = r3 + 1
            goto Lc
        L20:
            int r2 = r8 - r1
            if (r2 == r3) goto L35
            r3 = 2
            if (r2 == r3) goto L2d
            int r3 = r1 + 1
            java.lang.System.arraycopy(r5, r1, r5, r3, r2)
            goto L3b
        L2d:
            int r2 = r1 + 2
            int r3 = r1 + 1
            r3 = r5[r3]
            r5[r2] = r3
        L35:
            int r2 = r1 + 1
            r3 = r5[r1]
            r5[r2] = r3
        L3b:
            r5[r1] = r0
            goto L2
        L3e:
            return
    }

    private static int countRunAndMakeAscending(java.lang.Object[] r3, int r4, int r5) {
            int r0 = r4 + 1
            if (r0 != r5) goto L6
            r3 = 1
            return r3
        L6:
            int r1 = r0 + 1
            r0 = r3[r0]
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            r2 = r3[r4]
            int r0 = r0.compareTo(r2)
            if (r0 >= 0) goto L2b
        L14:
            if (r1 >= r5) goto L27
            r0 = r3[r1]
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            int r2 = r1 + (-1)
            r2 = r3[r2]
            int r0 = r0.compareTo(r2)
            if (r0 >= 0) goto L27
            int r1 = r1 + 1
            goto L14
        L27:
            reverseRange(r3, r4, r1)
            goto L3e
        L2b:
            if (r1 >= r5) goto L3e
            r0 = r3[r1]
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            int r2 = r1 + (-1)
            r2 = r3[r2]
            int r0 = r0.compareTo(r2)
            if (r0 < 0) goto L3e
            int r1 = r1 + 1
            goto L2b
        L3e:
            int r1 = r1 - r4
            return r1
    }

    private java.lang.Object[] ensureCapacity(int r3) {
            r2 = this;
            int r0 = r2.tmpCount
            int r0 = java.lang.Math.max(r0, r3)
            r2.tmpCount = r0
            java.lang.Object[] r0 = r2.tmp
            int r0 = r0.length
            if (r0 >= r3) goto L2e
            int r0 = r3 >> 1
            r0 = r0 | r3
            int r1 = r0 >> 2
            r0 = r0 | r1
            int r1 = r0 >> 4
            r0 = r0 | r1
            int r1 = r0 >> 8
            r0 = r0 | r1
            int r1 = r0 >> 16
            r0 = r0 | r1
            int r0 = r0 + 1
            if (r0 >= 0) goto L21
            goto L2a
        L21:
            java.lang.Object[] r3 = r2.a
            int r3 = r3.length
            int r3 = r3 >>> 1
            int r3 = java.lang.Math.min(r0, r3)
        L2a:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.tmp = r3
        L2e:
            java.lang.Object[] r3 = r2.tmp
            return r3
    }

    private static int gallopLeft(java.lang.Comparable<java.lang.Object> r6, java.lang.Object[] r7, int r8, int r9, int r10) {
            int r0 = r8 + r10
            r1 = r7[r0]
            int r1 = r6.compareTo(r1)
            r2 = 1
            r3 = 0
            if (r1 <= 0) goto L2e
            int r9 = r9 - r10
            r1 = 0
            r3 = 1
        Lf:
            if (r3 >= r9) goto L27
            int r4 = r0 + r3
            r4 = r7[r4]
            int r4 = r6.compareTo(r4)
            if (r4 <= 0) goto L27
            int r1 = r3 << 1
            int r1 = r1 + r2
            if (r1 > 0) goto L23
            r1 = r3
            r3 = r9
            goto Lf
        L23:
            r5 = r3
            r3 = r1
            r1 = r5
            goto Lf
        L27:
            if (r3 <= r9) goto L2a
            goto L2b
        L2a:
            r9 = r3
        L2b:
            int r1 = r1 + r10
            int r9 = r9 + r10
            goto L53
        L2e:
            int r9 = r10 + 1
            r1 = 0
            r3 = 1
        L32:
            if (r3 >= r9) goto L4a
            int r4 = r0 - r3
            r4 = r7[r4]
            int r4 = r6.compareTo(r4)
            if (r4 > 0) goto L4a
            int r1 = r3 << 1
            int r1 = r1 + r2
            if (r1 > 0) goto L46
            r1 = r3
            r3 = r9
            goto L32
        L46:
            r5 = r3
            r3 = r1
            r1 = r5
            goto L32
        L4a:
            if (r3 <= r9) goto L4d
            goto L4e
        L4d:
            r9 = r3
        L4e:
            int r9 = r10 - r9
            int r10 = r10 - r1
            r1 = r9
            r9 = r10
        L53:
            int r1 = r1 + r2
        L54:
            if (r1 >= r9) goto L6a
            int r10 = r9 - r1
            int r10 = r10 >>> r2
            int r10 = r10 + r1
            int r0 = r8 + r10
            r0 = r7[r0]
            int r0 = r6.compareTo(r0)
            if (r0 <= 0) goto L68
            int r10 = r10 + 1
            r1 = r10
            goto L54
        L68:
            r9 = r10
            goto L54
        L6a:
            return r9
    }

    private static int gallopRight(java.lang.Comparable<java.lang.Object> r6, java.lang.Object[] r7, int r8, int r9, int r10) {
            int r0 = r8 + r10
            r1 = r7[r0]
            int r1 = r6.compareTo(r1)
            r2 = 1
            r3 = 0
            if (r1 >= 0) goto L30
            int r9 = r10 + 1
            r1 = 0
            r3 = 1
        L10:
            if (r3 >= r9) goto L28
            int r4 = r0 - r3
            r4 = r7[r4]
            int r4 = r6.compareTo(r4)
            if (r4 >= 0) goto L28
            int r1 = r3 << 1
            int r1 = r1 + r2
            if (r1 > 0) goto L24
            r1 = r3
            r3 = r9
            goto L10
        L24:
            r5 = r3
            r3 = r1
            r1 = r5
            goto L10
        L28:
            if (r3 <= r9) goto L2b
            goto L2c
        L2b:
            r9 = r3
        L2c:
            int r9 = r10 - r9
            int r10 = r10 - r1
            goto L53
        L30:
            int r9 = r9 - r10
            r1 = 0
            r3 = 1
        L33:
            if (r3 >= r9) goto L4b
            int r4 = r0 + r3
            r4 = r7[r4]
            int r4 = r6.compareTo(r4)
            if (r4 < 0) goto L4b
            int r1 = r3 << 1
            int r1 = r1 + r2
            if (r1 > 0) goto L47
            r1 = r3
            r3 = r9
            goto L33
        L47:
            r5 = r3
            r3 = r1
            r1 = r5
            goto L33
        L4b:
            if (r3 <= r9) goto L4e
            goto L4f
        L4e:
            r9 = r3
        L4f:
            int r0 = r1 + r10
            int r10 = r10 + r9
            r9 = r0
        L53:
            int r9 = r9 + r2
        L54:
            if (r9 >= r10) goto L6a
            int r0 = r10 - r9
            int r0 = r0 >>> r2
            int r0 = r0 + r9
            int r1 = r8 + r0
            r1 = r7[r1]
            int r1 = r6.compareTo(r1)
            if (r1 >= 0) goto L66
            r10 = r0
            goto L54
        L66:
            int r0 = r0 + 1
            r9 = r0
            goto L54
        L6a:
            return r10
    }

    private void mergeAt(int r10) {
            r9 = this;
            int[] r0 = r9.runBase
            r1 = r0[r10]
            int[] r2 = r9.runLen
            r3 = r2[r10]
            int r4 = r10 + 1
            r5 = r0[r4]
            r6 = r2[r4]
            int r7 = r3 + r6
            r2[r10] = r7
            int r7 = r9.stackSize
            int r8 = r7 + (-3)
            if (r10 != r8) goto L22
            int r10 = r10 + 2
            r8 = r0[r10]
            r0[r4] = r8
            r10 = r2[r10]
            r2[r4] = r10
        L22:
            int r7 = r7 + (-1)
            r9.stackSize = r7
            java.lang.Object[] r10 = r9.a
            r0 = r10[r5]
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            r2 = 0
            int r10 = gallopRight(r0, r10, r1, r3, r2)
            int r1 = r1 + r10
            int r3 = r3 - r10
            if (r3 != 0) goto L36
            return
        L36:
            java.lang.Object[] r10 = r9.a
            int r0 = r1 + r3
            int r0 = r0 + (-1)
            r0 = r10[r0]
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            int r2 = r6 + (-1)
            int r10 = gallopLeft(r0, r10, r5, r6, r2)
            if (r10 != 0) goto L49
            return
        L49:
            if (r3 > r10) goto L4f
            r9.mergeLo(r1, r3, r5, r10)
            goto L52
        L4f:
            r9.mergeHi(r1, r3, r5, r10)
        L52:
            return
    }

    private void mergeCollapse() {
            r7 = this;
        L0:
            int r0 = r7.stackSize
            r1 = 1
            if (r0 <= r1) goto L32
            int r0 = r0 + (-2)
            if (r0 <= 0) goto L24
            int[] r1 = r7.runLen
            int r2 = r0 + (-1)
            r3 = r1[r2]
            r4 = r1[r0]
            int r5 = r0 + 1
            r6 = r1[r5]
            int r4 = r4 + r6
            if (r3 > r4) goto L24
            r2 = r1[r2]
            r1 = r1[r5]
            if (r2 >= r1) goto L20
            int r0 = r0 + (-1)
        L20:
            r7.mergeAt(r0)
            goto L0
        L24:
            int[] r1 = r7.runLen
            r2 = r1[r0]
            int r3 = r0 + 1
            r1 = r1[r3]
            if (r2 > r1) goto L32
            r7.mergeAt(r0)
            goto L0
        L32:
            return
    }

    private void mergeForceCollapse() {
            r4 = this;
        L0:
            int r0 = r4.stackSize
            r1 = 1
            if (r0 <= r1) goto L1b
            int r0 = r0 + (-2)
            if (r0 <= 0) goto L17
            int[] r1 = r4.runLen
            int r2 = r0 + (-1)
            r2 = r1[r2]
            int r3 = r0 + 1
            r1 = r1[r3]
            if (r2 >= r1) goto L17
            int r0 = r0 + (-1)
        L17:
            r4.mergeAt(r0)
            goto L0
        L1b:
            return
    }

    private void mergeHi(int r12, int r13, int r14, int r15) {
            r11 = this;
            java.lang.Object[] r0 = r11.a
            java.lang.Object[] r1 = r11.ensureCapacity(r15)
            r2 = 0
            java.lang.System.arraycopy(r0, r14, r1, r2, r15)
            int r3 = r12 + r13
            r4 = 1
            int r3 = r3 - r4
            int r5 = r15 + (-1)
            int r14 = r14 + r15
            int r14 = r14 - r4
            int r6 = r14 + (-1)
            int r7 = r3 + (-1)
            r3 = r0[r3]
            r0[r14] = r3
            int r13 = r13 + (-1)
            if (r13 != 0) goto L23
            int r6 = r6 - r5
            java.lang.System.arraycopy(r1, r2, r0, r6, r15)
            return
        L23:
            if (r15 != r4) goto L32
            int r6 = r6 - r13
            int r7 = r7 - r13
            int r7 = r7 + r4
            int r12 = r6 + 1
            java.lang.System.arraycopy(r0, r7, r0, r12, r13)
            r12 = r1[r5]
            r0[r6] = r12
            return
        L32:
            int r14 = r11.minGallop
        L34:
            r3 = 0
            r8 = 0
        L36:
            r9 = r1[r5]
            java.lang.Comparable r9 = (java.lang.Comparable) r9
            r10 = r0[r7]
            int r9 = r9.compareTo(r10)
            if (r9 >= 0) goto L56
            int r3 = r6 + (-1)
            int r9 = r7 + (-1)
            r7 = r0[r7]
            r0[r6] = r7
            int r8 = r8 + r4
            int r13 = r13 + (-1)
            if (r13 != 0) goto L52
            r7 = r9
            goto Lc7
        L52:
            r6 = r3
            r7 = r9
            r3 = 0
            goto L6a
        L56:
            int r8 = r6 + (-1)
            int r9 = r5 + (-1)
            r5 = r1[r5]
            r0[r6] = r5
            int r3 = r3 + r4
            int r15 = r15 + (-1)
            if (r15 != r4) goto L67
        L63:
            r3 = r8
            r5 = r9
            goto Lc7
        L67:
            r6 = r8
            r5 = r9
            r8 = 0
        L6a:
            r9 = r8 | r3
            if (r9 < r14) goto L36
        L6e:
            r3 = r1[r5]
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r8 = r13 + (-1)
            int r3 = gallopRight(r3, r0, r12, r13, r8)
            int r3 = r13 - r3
            if (r3 == 0) goto L8a
            int r6 = r6 - r3
            int r7 = r7 - r3
            int r13 = r13 - r3
            int r8 = r7 + 1
            int r9 = r6 + 1
            java.lang.System.arraycopy(r0, r8, r0, r9, r3)
            if (r13 != 0) goto L8a
            r3 = r6
            goto Lc7
        L8a:
            int r8 = r6 + (-1)
            int r9 = r5 + (-1)
            r5 = r1[r5]
            r0[r6] = r5
            int r15 = r15 + (-1)
            if (r15 != r4) goto L97
            goto L63
        L97:
            r5 = r0[r7]
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r6 = r15 + (-1)
            int r5 = gallopLeft(r5, r1, r2, r15, r6)
            int r5 = r15 - r5
            if (r5 == 0) goto Lb6
            int r6 = r8 - r5
            int r8 = r9 - r5
            int r15 = r15 - r5
            int r9 = r8 + 1
            int r10 = r6 + 1
            java.lang.System.arraycopy(r1, r9, r0, r10, r5)
            if (r15 > r4) goto Lb8
            r3 = r6
            r5 = r8
            goto Lc7
        Lb6:
            r6 = r8
            r8 = r9
        Lb8:
            int r9 = r6 + (-1)
            int r10 = r7 + (-1)
            r7 = r0[r7]
            r0[r6] = r7
            int r13 = r13 + (-1)
            if (r13 != 0) goto Lec
            r5 = r8
            r3 = r9
            r7 = r10
        Lc7:
            if (r14 >= r4) goto Lca
            r14 = 1
        Lca:
            r11.minGallop = r14
            if (r15 != r4) goto Ldb
            int r3 = r3 - r13
            int r7 = r7 - r13
            int r7 = r7 + r4
            int r12 = r3 + 1
            java.lang.System.arraycopy(r0, r7, r0, r12, r13)
            r12 = r1[r5]
            r0[r3] = r12
            goto Le3
        Ldb:
            if (r15 == 0) goto Le4
            int r12 = r15 + (-1)
            int r3 = r3 - r12
            java.lang.System.arraycopy(r1, r2, r0, r3, r15)
        Le3:
            return
        Le4:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Comparison method violates its general contract!"
            r12.<init>(r13)
            throw r12
        Lec:
            int r14 = r14 + (-1)
            r6 = 7
            if (r3 < r6) goto Lf3
            r3 = 1
            goto Lf4
        Lf3:
            r3 = 0
        Lf4:
            if (r5 < r6) goto Lf8
            r5 = 1
            goto Lf9
        Lf8:
            r5 = 0
        Lf9:
            r3 = r3 | r5
            if (r3 != 0) goto L106
            if (r14 >= 0) goto Lff
            r14 = 0
        Lff:
            int r14 = r14 + 2
            r5 = r8
            r6 = r9
            r7 = r10
            goto L34
        L106:
            r5 = r8
            r6 = r9
            r7 = r10
            goto L6e
    }

    private void mergeLo(int r12, int r13, int r14, int r15) {
            r11 = this;
            java.lang.Object[] r0 = r11.a
            java.lang.Object[] r1 = r11.ensureCapacity(r13)
            r2 = 0
            java.lang.System.arraycopy(r0, r12, r1, r2, r13)
            int r3 = r12 + 1
            int r4 = r14 + 1
            r14 = r0[r14]
            r0[r12] = r14
            int r15 = r15 + (-1)
            if (r15 != 0) goto L1a
            java.lang.System.arraycopy(r1, r2, r0, r3, r13)
            return
        L1a:
            r12 = 1
            if (r13 != r12) goto L26
            java.lang.System.arraycopy(r0, r4, r0, r3, r15)
            int r3 = r3 + r15
            r12 = r1[r2]
            r0[r3] = r12
            return
        L26:
            int r14 = r11.minGallop
            r5 = 0
        L29:
            r6 = 0
            r7 = 0
        L2b:
            r8 = r0[r4]
            java.lang.Comparable r8 = (java.lang.Comparable) r8
            r9 = r1[r5]
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto L4b
            int r6 = r3 + 1
            int r8 = r4 + 1
            r4 = r0[r4]
            r0[r3] = r4
            int r7 = r7 + r12
            int r15 = r15 + (-1)
            if (r15 != 0) goto L47
        L44:
            r4 = r8
            goto Lae
        L47:
            r3 = r6
            r4 = r8
            r6 = 0
            goto L5e
        L4b:
            int r7 = r3 + 1
            int r8 = r5 + 1
            r5 = r1[r5]
            r0[r3] = r5
            int r6 = r6 + r12
            int r13 = r13 + (-1)
            if (r13 != r12) goto L5b
            r6 = r7
            r5 = r8
            goto Lae
        L5b:
            r3 = r7
            r5 = r8
            r7 = 0
        L5e:
            r8 = r6 | r7
            if (r8 < r14) goto L2b
        L62:
            r6 = r0[r4]
            java.lang.Comparable r6 = (java.lang.Comparable) r6
            int r6 = gallopRight(r6, r1, r5, r13, r2)
            if (r6 == 0) goto L76
            java.lang.System.arraycopy(r1, r5, r0, r3, r6)
            int r3 = r3 + r6
            int r5 = r5 + r6
            int r13 = r13 - r6
            if (r13 > r12) goto L76
            r6 = r3
            goto Lae
        L76:
            int r7 = r3 + 1
            int r8 = r4 + 1
            r4 = r0[r4]
            r0[r3] = r4
            int r15 = r15 + (-1)
            if (r15 != 0) goto L84
            r6 = r7
            goto L44
        L84:
            r3 = r1[r5]
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r3 = gallopLeft(r3, r0, r8, r15, r2)
            if (r3 == 0) goto L9f
            java.lang.System.arraycopy(r0, r8, r0, r7, r3)
            int r4 = r7 + r3
            int r7 = r8 + r3
            int r15 = r15 - r3
            if (r15 != 0) goto L9b
            r6 = r4
            r4 = r7
            goto Lae
        L9b:
            r10 = r7
            r7 = r4
            r4 = r10
            goto La0
        L9f:
            r4 = r8
        La0:
            int r8 = r7 + 1
            int r9 = r5 + 1
            r5 = r1[r5]
            r0[r7] = r5
            int r13 = r13 + (-1)
            if (r13 != r12) goto Lcc
            r6 = r8
            r5 = r9
        Lae:
            if (r14 >= r12) goto Lb1
            r14 = 1
        Lb1:
            r11.minGallop = r14
            if (r13 != r12) goto Lbe
            java.lang.System.arraycopy(r0, r4, r0, r6, r15)
            int r6 = r6 + r15
            r12 = r1[r5]
            r0[r6] = r12
            goto Lc3
        Lbe:
            if (r13 == 0) goto Lc4
            java.lang.System.arraycopy(r1, r5, r0, r6, r13)
        Lc3:
            return
        Lc4:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Comparison method violates its general contract!"
            r12.<init>(r13)
            throw r12
        Lcc:
            int r14 = r14 + (-1)
            r5 = 7
            if (r6 < r5) goto Ld3
            r6 = 1
            goto Ld4
        Ld3:
            r6 = 0
        Ld4:
            if (r3 < r5) goto Ld8
            r3 = 1
            goto Ld9
        Ld8:
            r3 = 0
        Ld9:
            r3 = r3 | r6
            if (r3 != 0) goto Le5
            if (r14 >= 0) goto Ldf
            r14 = 0
        Ldf:
            int r14 = r14 + 2
            r3 = r8
            r5 = r9
            goto L29
        Le5:
            r3 = r8
            r5 = r9
            goto L62
    }

    private static int minRunLength(int r2) {
            r0 = 0
        L1:
            r1 = 32
            if (r2 < r1) goto Lb
            r1 = r2 & 1
            r0 = r0 | r1
            int r2 = r2 >> 1
            goto L1
        Lb:
            int r2 = r2 + r0
            return r2
    }

    private void pushRun(int r3, int r4) {
            r2 = this;
            int[] r0 = r2.runBase
            int r1 = r2.stackSize
            r0[r1] = r3
            int[] r3 = r2.runLen
            r3[r1] = r4
            int r1 = r1 + 1
            r2.stackSize = r1
            return
    }

    private static void rangeCheck(int r2, int r3, int r4) {
            if (r3 > r4) goto L13
            if (r3 < 0) goto Ld
            if (r4 > r2) goto L7
            return
        L7:
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>(r4)
            throw r2
        Ld:
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>(r3)
            throw r2
        L13:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "fromIndex("
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ") > toIndex("
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    private static void reverseRange(java.lang.Object[] r3, int r4, int r5) {
            int r5 = r5 + (-1)
        L2:
            if (r4 >= r5) goto L13
            r0 = r3[r4]
            int r1 = r4 + 1
            r2 = r3[r5]
            r3[r4] = r2
            int r4 = r5 + (-1)
            r3[r5] = r0
            r5 = r4
            r4 = r1
            goto L2
        L13:
            return
    }

    public void doSort(java.lang.Object[] r7, int r8, int r9) {
            r6 = this;
            r0 = 0
            r6.stackSize = r0
            int r1 = r7.length
            rangeCheck(r1, r8, r9)
            int r1 = r9 - r8
            r2 = 2
            if (r1 >= r2) goto Ld
            return
        Ld:
            r2 = 32
            if (r1 >= r2) goto L1a
            int r0 = countRunAndMakeAscending(r7, r8, r9)
            int r0 = r0 + r8
            binarySort(r7, r8, r9, r0)
            return
        L1a:
            r6.a = r7
            r6.tmpCount = r0
            int r2 = minRunLength(r1)
        L22:
            int r3 = countRunAndMakeAscending(r7, r8, r9)
            if (r3 >= r2) goto L34
            if (r1 > r2) goto L2c
            r4 = r1
            goto L2d
        L2c:
            r4 = r2
        L2d:
            int r5 = r8 + r4
            int r3 = r3 + r8
            binarySort(r7, r8, r5, r3)
            r3 = r4
        L34:
            r6.pushRun(r8, r3)
            r6.mergeCollapse()
            int r8 = r8 + r3
            int r1 = r1 - r3
            if (r1 != 0) goto L22
            r6.mergeForceCollapse()
            r7 = 0
            r6.a = r7
            java.lang.Object[] r8 = r6.tmp
            int r9 = r6.tmpCount
        L48:
            if (r0 >= r9) goto L4f
            r8[r0] = r7
            int r0 = r0 + 1
            goto L48
        L4f:
            return
    }
}
