package net.sourceforge.jiu.util;

/* loaded from: classes2.dex */
public class Sort {
    public static void sort(java.lang.Object[] r18, int r19, int r20, net.sourceforge.jiu.util.ComparatorInterface r21) {
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            if (r0 == 0) goto L138
            java.lang.String r4 = ")."
            if (r1 > r2) goto L116
            int r5 = r0.length
            if (r2 >= r5) goto Lf3
            if (r3 == 0) goto Leb
            r4 = r1
        L14:
            if (r4 >= r2) goto L4a
            int r5 = r4 + 6
            int r6 = java.lang.Math.min(r5, r2)
            int r7 = r4 + 1
        L1e:
            if (r7 >= r6) goto L48
            int r8 = r7 + (-1)
            r8 = r0[r8]
            r9 = r0[r7]
            int r8 = r3.compare(r8, r9)
            if (r8 <= 0) goto L45
            r8 = r0[r7]
            r9 = r7
        L2f:
            int r10 = r9 + (-1)
            r10 = r0[r10]
            r0[r9] = r10
            int r9 = r9 + (-1)
            if (r9 <= r4) goto L43
            int r10 = r9 + (-1)
            r10 = r0[r10]
            int r10 = r3.compare(r10, r8)
            if (r10 > 0) goto L2f
        L43:
            r0[r9] = r8
        L45:
            int r7 = r7 + 1
            goto L1e
        L48:
            r4 = r5
            goto L14
        L4a:
            int r4 = r2 - r1
            r5 = 6
            if (r4 > r5) goto L50
            return
        L50:
            java.lang.Object[] r6 = new java.lang.Object[r4]
            int r7 = -r1
            r8 = r7
            r7 = r6
            r6 = r0
        L56:
            if (r5 >= r4) goto Le4
            r9 = r1
        L59:
            if (r9 >= r2) goto Ld6
            int r10 = r9 + r5
            int r11 = r10 + r5
            int r11 = java.lang.Math.min(r2, r11)
            if (r10 >= r11) goto Lc8
            int r12 = r10 + (-1)
            r12 = r6[r12]
            r13 = r6[r10]
            int r12 = r3.compare(r12, r13)
            if (r12 > 0) goto L72
            goto Lc8
        L72:
            r12 = r6[r9]
            int r13 = r11 + (-1)
            r13 = r6[r13]
            int r12 = r3.compare(r12, r13)
            if (r12 <= 0) goto L8d
            int r12 = r11 - r5
            int r12 = r12 + r8
            java.lang.System.arraycopy(r6, r9, r7, r12, r5)
            int r12 = r9 + r8
            int r11 = r11 - r10
            java.lang.System.arraycopy(r6, r10, r7, r12, r11)
            r16 = r4
            goto Ld0
        L8d:
            int r12 = r9 + r8
            r13 = r9
            r14 = r10
        L91:
            if (r13 >= r10) goto Lba
            if (r14 >= r11) goto Lba
            int r15 = r12 + 1
            r16 = r4
            r4 = r6[r13]
            r19 = r15
            r15 = r6[r14]
            int r4 = r3.compare(r4, r15)
            if (r4 > 0) goto La8
            int r4 = r13 + 1
            goto Lb0
        La8:
            int r4 = r14 + 1
            r17 = r14
            r14 = r4
            r4 = r13
            r13 = r17
        Lb0:
            r13 = r6[r13]
            r7[r12] = r13
            r12 = r19
            r13 = r4
            r4 = r16
            goto L91
        Lba:
            r16 = r4
            if (r13 >= r10) goto Lc3
            int r10 = r10 - r13
            java.lang.System.arraycopy(r6, r13, r7, r12, r10)
            goto Ld0
        Lc3:
            int r11 = r11 - r14
            java.lang.System.arraycopy(r6, r14, r7, r12, r11)
            goto Ld0
        Lc8:
            r16 = r4
            int r4 = r9 + r8
            int r11 = r11 - r9
            java.lang.System.arraycopy(r6, r9, r7, r4, r11)
        Ld0:
            int r4 = r5 << 1
            int r9 = r9 + r4
            r4 = r16
            goto L59
        Ld6:
            r16 = r4
            int r1 = r1 + r8
            int r2 = r2 + r8
            int r8 = -r8
            int r5 = r5 << 1
            r17 = r7
            r7 = r6
            r6 = r17
            goto L56
        Le4:
            if (r6 == r0) goto Lea
            r1 = 0
            java.lang.System.arraycopy(r6, r1, r0, r8, r2)
        Lea:
            return
        Leb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The comparator parameter must be non-null."
            r0.<init>(r1)
            throw r0
        Lf3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            int r0 = r0.length
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "The to parameter ("
            r3.append(r5)
            r3.append(r2)
            java.lang.String r2 = ") must be smaller than the array length ("
            r3.append(r2)
            r3.append(r0)
            r3.append(r4)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        L116:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "The from parameter ("
            r3.append(r5)
            r3.append(r1)
            java.lang.String r1 = ") must be smaller than or equal to the to parameter ("
            r3.append(r1)
            r3.append(r2)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L138:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The object array to be sorted must be non-null."
            r0.<init>(r1)
            throw r0
    }
}
