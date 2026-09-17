package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
class TimSort<T> {
    private T[] a;
    private java.util.Comparator<? super T> c;
    private int minGallop;
    private final int[] runBase;
    private final int[] runLen;
    private int stackSize;
    private T[] tmp;
    private int tmpCount;

    TimSort() {
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

    private static <T> void binarySort(T[] r5, int r6, int r7, int r8, java.util.Comparator<? super T> r9) {
            if (r8 != r6) goto L4
        L2:
            int r8 = r8 + 1
        L4:
            if (r8 >= r7) goto L3c
            r0 = r5[r8]
            r1 = r6
            r2 = r8
        La:
            r3 = 1
            if (r1 >= r2) goto L1e
            int r4 = r1 + r2
            int r3 = r4 >>> 1
            r4 = r5[r3]
            int r4 = r9.compare(r0, r4)
            if (r4 >= 0) goto L1b
            r2 = r3
            goto La
        L1b:
            int r1 = r3 + 1
            goto La
        L1e:
            int r2 = r8 - r1
            if (r2 == r3) goto L33
            r3 = 2
            if (r2 == r3) goto L2b
            int r3 = r1 + 1
            java.lang.System.arraycopy(r5, r1, r5, r3, r2)
            goto L39
        L2b:
            int r2 = r1 + 2
            int r3 = r1 + 1
            r3 = r5[r3]
            r5[r2] = r3
        L33:
            int r2 = r1 + 1
            r3 = r5[r1]
            r5[r2] = r3
        L39:
            r5[r1] = r0
            goto L2
        L3c:
            return
    }

    private static <T> int countRunAndMakeAscending(T[] r3, int r4, int r5, java.util.Comparator<? super T> r6) {
            int r0 = r4 + 1
            if (r0 != r5) goto L6
            r3 = 1
            return r3
        L6:
            int r1 = r0 + 1
            r0 = r3[r0]
            r2 = r3[r4]
            int r0 = r6.compare(r0, r2)
            if (r0 >= 0) goto L27
        L12:
            if (r1 >= r5) goto L23
            r0 = r3[r1]
            int r2 = r1 + (-1)
            r2 = r3[r2]
            int r0 = r6.compare(r0, r2)
            if (r0 >= 0) goto L23
            int r1 = r1 + 1
            goto L12
        L23:
            reverseRange(r3, r4, r1)
            goto L38
        L27:
            if (r1 >= r5) goto L38
            r0 = r3[r1]
            int r2 = r1 + (-1)
            r2 = r3[r2]
            int r0 = r6.compare(r0, r2)
            if (r0 < 0) goto L38
            int r1 = r1 + 1
            goto L27
        L38:
            int r1 = r1 - r4
            return r1
    }

    private T[] ensureCapacity(int r3) {
            r2 = this;
            int r0 = r2.tmpCount
            int r0 = java.lang.Math.max(r0, r3)
            r2.tmpCount = r0
            T[] r0 = r2.tmp
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
            T[] r3 = r2.a
            int r3 = r3.length
            int r3 = r3 >>> 1
            int r3 = java.lang.Math.min(r0, r3)
        L2a:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.tmp = r3
        L2e:
            T[] r3 = r2.tmp
            return r3
    }

    private static <T> int gallopLeft(T r6, T[] r7, int r8, int r9, int r10, java.util.Comparator<? super T> r11) {
            int r0 = r8 + r10
            r1 = r7[r0]
            int r1 = r11.compare(r6, r1)
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
            int r4 = r11.compare(r6, r4)
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
            int r4 = r11.compare(r6, r4)
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
            int r0 = r11.compare(r6, r0)
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

    private static <T> int gallopRight(T r6, T[] r7, int r8, int r9, int r10, java.util.Comparator<? super T> r11) {
            int r0 = r8 + r10
            r1 = r7[r0]
            int r1 = r11.compare(r6, r1)
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
            int r4 = r11.compare(r6, r4)
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
            int r4 = r11.compare(r6, r4)
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
            int r1 = r11.compare(r6, r1)
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

    private void mergeAt(int r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            int[] r2 = r0.runBase
            r9 = r2[r1]
            int[] r3 = r0.runLen
            r10 = r3[r1]
            int r4 = r1 + 1
            r15 = r2[r4]
            r14 = r3[r4]
            int r5 = r10 + r14
            r3[r1] = r5
            int r5 = r0.stackSize
            int r6 = r5 + (-3)
            if (r1 != r6) goto L26
            int r1 = r1 + 2
            r6 = r2[r1]
            r2[r4] = r6
            r1 = r3[r1]
            r3[r4] = r1
        L26:
            int r5 = r5 + (-1)
            r0.stackSize = r5
            T[] r4 = r0.a
            r3 = r4[r15]
            r7 = 0
            java.util.Comparator<? super T> r8 = r0.c
            r5 = r9
            r6 = r10
            int r1 = gallopRight(r3, r4, r5, r6, r7, r8)
            int r9 = r9 + r1
            int r10 = r10 - r1
            if (r10 != 0) goto L3c
            return
        L3c:
            T[] r12 = r0.a
            int r1 = r9 + r10
            int r1 = r1 + (-1)
            r11 = r12[r1]
            int r1 = r14 + (-1)
            java.util.Comparator<? super T> r2 = r0.c
            r13 = r15
            r3 = r15
            r15 = r1
            r16 = r2
            int r1 = gallopLeft(r11, r12, r13, r14, r15, r16)
            if (r1 != 0) goto L54
            return
        L54:
            if (r10 > r1) goto L5a
            r0.mergeLo(r9, r10, r3, r1)
            goto L5d
        L5a:
            r0.mergeHi(r9, r10, r3, r1)
        L5d:
            return
    }

    private void mergeCollapse() {
            r5 = this;
        L0:
            int r0 = r5.stackSize
            r1 = 1
            if (r0 <= r1) goto L48
            int r0 = r0 + (-2)
            if (r0 < r1) goto L18
            int[] r1 = r5.runLen
            int r2 = r0 + (-1)
            r2 = r1[r2]
            r3 = r1[r0]
            int r4 = r0 + 1
            r1 = r1[r4]
            int r3 = r3 + r1
            if (r2 <= r3) goto L2a
        L18:
            r1 = 2
            if (r0 < r1) goto L39
            int[] r1 = r5.runLen
            int r2 = r0 + (-2)
            r2 = r1[r2]
            r3 = r1[r0]
            int r4 = r0 + (-1)
            r1 = r1[r4]
            int r3 = r3 + r1
            if (r2 > r3) goto L39
        L2a:
            int[] r1 = r5.runLen
            int r2 = r0 + (-1)
            r2 = r1[r2]
            int r3 = r0 + 1
            r1 = r1[r3]
            if (r2 >= r1) goto L44
            int r0 = r0 + (-1)
            goto L44
        L39:
            int[] r1 = r5.runLen
            r2 = r1[r0]
            int r3 = r0 + 1
            r1 = r1[r3]
            if (r2 <= r1) goto L44
            goto L48
        L44:
            r5.mergeAt(r0)
            goto L0
        L48:
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

    private void mergeHi(int r21, int r22, int r23, int r24) {
            r20 = this;
            r0 = r20
            r1 = r23
            r2 = r24
            T[] r7 = r0.a
            java.lang.Object[] r8 = r0.ensureCapacity(r2)
            r9 = 0
            java.lang.System.arraycopy(r7, r1, r8, r9, r2)
            int r3 = r21 + r22
            r10 = 1
            int r3 = r3 - r10
            int r4 = r2 + (-1)
            int r1 = r1 + r2
            int r1 = r1 - r10
            int r5 = r1 + (-1)
            int r6 = r3 + (-1)
            r3 = r7[r3]
            r7[r1] = r3
            int r1 = r22 + (-1)
            if (r1 != 0) goto L29
            int r5 = r5 - r4
            java.lang.System.arraycopy(r8, r9, r7, r5, r2)
            return
        L29:
            if (r2 != r10) goto L38
            int r5 = r5 - r1
            int r6 = r6 - r1
            int r6 = r6 + r10
            int r2 = r5 + 1
            java.lang.System.arraycopy(r7, r6, r7, r2, r1)
            r1 = r8[r4]
            r7[r5] = r1
            return
        L38:
            java.util.Comparator<? super T> r11 = r0.c
            int r3 = r0.minGallop
        L3c:
            r12 = 0
            r13 = 0
        L3e:
            r14 = r8[r4]
            r15 = r7[r6]
            int r14 = r11.compare(r14, r15)
            if (r14 >= 0) goto L5c
            int r12 = r5 + (-1)
            int r14 = r6 + (-1)
            r6 = r7[r6]
            r7[r5] = r6
            int r13 = r13 + r10
            int r1 = r1 + (-1)
            if (r1 != 0) goto L58
            r6 = r14
            goto Lfe
        L58:
            r5 = r12
            r6 = r14
            r12 = 0
            goto L70
        L5c:
            int r13 = r5 + (-1)
            int r14 = r4 + (-1)
            r4 = r8[r4]
            r7[r5] = r4
            int r12 = r12 + r10
            int r2 = r2 + (-1)
            if (r2 != r10) goto L6d
            r12 = r13
            r4 = r14
            goto Lfe
        L6d:
            r5 = r13
            r4 = r14
            r13 = 0
        L70:
            r14 = r13 | r12
            if (r14 < r3) goto L3e
            r12 = r1
            r13 = r2
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
        L7c:
            r1 = r8[r15]
            int r5 = r12 + (-1)
            r2 = r7
            r3 = r21
            r4 = r12
            r6 = r11
            int r1 = gallopRight(r1, r2, r3, r4, r5, r6)
            int r6 = r12 - r1
            if (r6 == 0) goto La9
            int r1 = r16 - r6
            int r2 = r17 - r6
            int r3 = r12 - r6
            int r4 = r2 + 1
            int r5 = r1 + 1
            java.lang.System.arraycopy(r7, r4, r7, r5, r6)
            if (r3 != 0) goto La4
            r12 = r1
            r6 = r2
            r1 = r3
            r2 = r13
            r3 = r14
            r4 = r15
            goto Lfe
        La4:
            r16 = r1
            r17 = r2
            r12 = r3
        La9:
            int r18 = r16 + (-1)
            int r19 = r15 + (-1)
            r1 = r8[r15]
            r7[r16] = r1
            int r13 = r13 + (-1)
            if (r13 != r10) goto Lbf
            r1 = r12
            r2 = r13
            r3 = r14
            r6 = r17
            r12 = r18
        Lbc:
            r4 = r19
            goto Lfe
        Lbf:
            r1 = r7[r17]
            r3 = 0
            int r5 = r13 + (-1)
            r2 = r8
            r4 = r13
            r15 = r6
            r6 = r11
            int r1 = gallopLeft(r1, r2, r3, r4, r5, r6)
            int r1 = r13 - r1
            if (r1 == 0) goto Leb
            int r2 = r18 - r1
            int r4 = r19 - r1
            int r3 = r13 - r1
            int r5 = r4 + 1
            int r6 = r2 + 1
            java.lang.System.arraycopy(r8, r5, r7, r6, r1)
            if (r3 > r10) goto Le6
            r1 = r12
            r6 = r17
            r12 = r2
            r2 = r3
            r3 = r14
            goto Lfe
        Le6:
            r18 = r2
            r13 = r3
            r19 = r4
        Leb:
            int r16 = r18 + (-1)
            int r2 = r17 + (-1)
            r3 = r7[r17]
            r7[r18] = r3
            int r12 = r12 + (-1)
            if (r12 != 0) goto L123
            r6 = r2
            r1 = r12
            r2 = r13
            r3 = r14
            r12 = r16
            goto Lbc
        Lfe:
            if (r3 >= r10) goto L101
            r3 = 1
        L101:
            r0.minGallop = r3
            if (r2 != r10) goto L112
            int r12 = r12 - r1
            int r6 = r6 - r1
            int r6 = r6 + r10
            int r2 = r12 + 1
            java.lang.System.arraycopy(r7, r6, r7, r2, r1)
            r1 = r8[r4]
            r7[r12] = r1
            goto L11a
        L112:
            if (r2 == 0) goto L11b
            int r1 = r2 + (-1)
            int r12 = r12 - r1
            java.lang.System.arraycopy(r8, r9, r7, r12, r2)
        L11a:
            return
        L11b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Comparison method violates its general contract!"
            r1.<init>(r2)
            throw r1
        L123:
            int r14 = r14 + (-1)
            r3 = 7
            if (r15 < r3) goto L12a
            r4 = 1
            goto L12b
        L12a:
            r4 = 0
        L12b:
            if (r1 < r3) goto L12f
            r1 = 1
            goto L130
        L12f:
            r1 = 0
        L130:
            r1 = r1 | r4
            if (r1 != 0) goto L141
            if (r14 >= 0) goto L136
            r14 = 0
        L136:
            int r3 = r14 + 2
            r6 = r2
            r1 = r12
            r2 = r13
            r5 = r16
            r4 = r19
            goto L3c
        L141:
            r17 = r2
            r15 = r19
            goto L7c
    }

    private void mergeLo(int r19, int r20, int r21, int r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            T[] r7 = r0.a
            java.lang.Object[] r8 = r0.ensureCapacity(r2)
            r9 = 0
            java.lang.System.arraycopy(r7, r1, r8, r9, r2)
            int r3 = r1 + 1
            int r4 = r21 + 1
            r5 = r7[r21]
            r7[r1] = r5
            int r1 = r22 + (-1)
            if (r1 != 0) goto L20
            java.lang.System.arraycopy(r8, r9, r7, r3, r2)
            return
        L20:
            r10 = 1
            if (r2 != r10) goto L2c
            java.lang.System.arraycopy(r7, r4, r7, r3, r1)
            int r3 = r3 + r1
            r1 = r8[r9]
            r7[r3] = r1
            return
        L2c:
            java.util.Comparator<? super T> r11 = r0.c
            int r5 = r0.minGallop
            r6 = 0
        L31:
            r12 = 0
            r13 = 0
        L33:
            r14 = r7[r4]
            r15 = r8[r6]
            int r14 = r11.compare(r14, r15)
            if (r14 >= 0) goto L50
            int r12 = r3 + 1
            int r14 = r4 + 1
            r4 = r7[r4]
            r7[r3] = r4
            int r13 = r13 + r10
            int r1 = r1 + (-1)
            if (r1 != 0) goto L4c
            r4 = r14
            goto L5f
        L4c:
            r3 = r12
            r4 = r14
            r12 = 0
            goto L65
        L50:
            int r13 = r3 + 1
            int r14 = r6 + 1
            r6 = r8[r6]
            r7[r3] = r6
            int r12 = r12 + r10
            int r2 = r2 + (-1)
            if (r2 != r10) goto L62
            r12 = r13
            r6 = r14
        L5f:
            r9 = 1
            goto Le7
        L62:
            r3 = r13
            r6 = r14
            r13 = 0
        L65:
            r14 = r12 | r13
            if (r14 < r5) goto L128
            r12 = r1
            r13 = r2
            r14 = r3
            r15 = r4
            r16 = r5
        L6f:
            r1 = r7[r15]
            r5 = 0
            r2 = r8
            r3 = r6
            r4 = r13
            r9 = r6
            r6 = r11
            int r6 = gallopRight(r1, r2, r3, r4, r5, r6)
            if (r6 == 0) goto L98
            java.lang.System.arraycopy(r8, r9, r7, r14, r6)
            int r1 = r14 + r6
            int r2 = r9 + r6
            int r3 = r13 - r6
            if (r3 > r10) goto L95
            r6 = r2
            r2 = r3
            r4 = r15
            r5 = r16
            r9 = 1
            r17 = r12
            r12 = r1
            r1 = r17
            goto Le7
        L95:
            r14 = r1
            r9 = r2
            r13 = r3
        L98:
            int r5 = r14 + 1
            int r4 = r15 + 1
            r1 = r7[r15]
            r7[r14] = r1
            int r12 = r12 + (-1)
            if (r12 != 0) goto Lac
            r6 = r9
            r1 = r12
            r2 = r13
            r9 = 1
            r12 = r5
            r5 = r16
            goto Le7
        Lac:
            r1 = r8[r9]
            r14 = 0
            r2 = r7
            r3 = r4
            r15 = r4
            r4 = r12
            r10 = r5
            r5 = r14
            r14 = r6
            r6 = r11
            int r1 = gallopLeft(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto Ld3
            java.lang.System.arraycopy(r7, r15, r7, r10, r1)
            int r2 = r10 + r1
            int r4 = r15 + r1
            int r3 = r12 - r1
            if (r3 != 0) goto Lcf
            r12 = r2
            r1 = r3
            r6 = r9
            r2 = r13
            r5 = r16
            goto L5f
        Lcf:
            r5 = r2
            r12 = r3
            r15 = r4
            goto Ld4
        Ld3:
            r5 = r10
        Ld4:
            int r2 = r5 + 1
            int r6 = r9 + 1
            r3 = r8[r9]
            r7[r5] = r3
            int r13 = r13 + (-1)
            r9 = 1
            if (r13 != r9) goto L105
            r1 = r12
            r4 = r15
            r5 = r16
            r12 = r2
            r2 = r13
        Le7:
            if (r5 >= r9) goto Lea
            r5 = 1
        Lea:
            r0.minGallop = r5
            if (r2 != r9) goto Lf7
            java.lang.System.arraycopy(r7, r4, r7, r12, r1)
            int r12 = r12 + r1
            r1 = r8[r6]
            r7[r12] = r1
            goto Lfc
        Lf7:
            if (r2 == 0) goto Lfd
            java.lang.System.arraycopy(r8, r6, r7, r12, r2)
        Lfc:
            return
        Lfd:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Comparison method violates its general contract!"
            r1.<init>(r2)
            throw r1
        L105:
            int r16 = r16 + (-1)
            r3 = 7
            if (r14 < r3) goto L10c
            r4 = 1
            goto L10d
        L10c:
            r4 = 0
        L10d:
            if (r1 < r3) goto L111
            r1 = 1
            goto L112
        L111:
            r1 = 0
        L112:
            r1 = r1 | r4
            if (r1 != 0) goto L123
            if (r16 >= 0) goto L119
            r16 = 0
        L119:
            int r5 = r16 + 2
            r3 = r2
            r1 = r12
            r2 = r13
            r4 = r15
            r9 = 0
            r10 = 1
            goto L31
        L123:
            r14 = r2
            r9 = 0
            r10 = 1
            goto L6f
        L128:
            r9 = 0
            goto L33
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

    public void doSort(T[] r7, java.util.Comparator<T> r8, int r9, int r10) {
            r6 = this;
            r0 = 0
            r6.stackSize = r0
            int r1 = r7.length
            rangeCheck(r1, r9, r10)
            int r1 = r10 - r9
            r2 = 2
            if (r1 >= r2) goto Ld
            return
        Ld:
            r2 = 32
            if (r1 >= r2) goto L1a
            int r0 = countRunAndMakeAscending(r7, r9, r10, r8)
            int r0 = r0 + r9
            binarySort(r7, r9, r10, r0, r8)
            return
        L1a:
            r6.a = r7
            r6.c = r8
            r6.tmpCount = r0
            int r2 = minRunLength(r1)
        L24:
            int r3 = countRunAndMakeAscending(r7, r9, r10, r8)
            if (r3 >= r2) goto L36
            if (r1 > r2) goto L2e
            r4 = r1
            goto L2f
        L2e:
            r4 = r2
        L2f:
            int r5 = r9 + r4
            int r3 = r3 + r9
            binarySort(r7, r9, r5, r3, r8)
            r3 = r4
        L36:
            r6.pushRun(r9, r3)
            r6.mergeCollapse()
            int r9 = r9 + r3
            int r1 = r1 - r3
            if (r1 != 0) goto L24
            r6.mergeForceCollapse()
            r7 = 0
            r6.a = r7
            r6.c = r7
            T[] r8 = r6.tmp
            int r9 = r6.tmpCount
        L4c:
            if (r0 >= r9) goto L53
            r8[r0] = r7
            int r0 = r0 + 1
            goto L4c
        L53:
            return
    }
}
