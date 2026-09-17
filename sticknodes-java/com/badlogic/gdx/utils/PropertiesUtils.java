package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public final class PropertiesUtils {
    public static void load(com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.String> r16, java.io.Reader r17) throws java.io.IOException {
            r0 = r16
            r1 = r17
            java.lang.String r2 = "properties cannot be null"
            java.util.Objects.requireNonNull(r0, r2)
            java.lang.String r2 = "reader cannot be null"
            java.util.Objects.requireNonNull(r1, r2)
            r2 = 40
            char[] r2 = new char[r2]
            java.io.BufferedReader r3 = new java.io.BufferedReader
            r3.<init>(r1)
            r4 = 2
            r6 = 4
            r7 = 1
            r8 = -1
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L20:
            r14 = -1
            r15 = 1
        L22:
            int r5 = r3.read()
            if (r5 != r8) goto L60
            if (r11 != r4) goto L35
            if (r12 <= r6) goto L2d
            goto L35
        L2d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid Unicode sequence: expected format \\uxxxx"
            r0.<init>(r1)
            throw r0
        L35:
            if (r14 != r8) goto L3a
            if (r10 <= 0) goto L3a
            r14 = r10
        L3a:
            if (r14 < 0) goto L5f
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2, r9, r10)
            java.lang.String r2 = r1.substring(r9, r14)
            java.lang.String r1 = r1.substring(r14)
            if (r11 != r7) goto L5c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = "\u0000"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L5c:
            r0.put(r2, r1)
        L5f:
            return
        L60:
            char r5 = (char) r5
            int r1 = r2.length
            if (r10 != r1) goto L6d
            int r1 = r2.length
            int r1 = r1 * 2
            char[] r1 = new char[r1]
            java.lang.System.arraycopy(r2, r9, r1, r9, r10)
            r2 = r1
        L6d:
            r1 = 10
            if (r11 != r4) goto L99
            r4 = 16
            int r4 = java.lang.Character.digit(r5, r4)
            if (r4 < 0) goto L82
            int r13 = r13 << 4
            int r13 = r13 + r4
            int r12 = r12 + 1
            if (r12 >= r6) goto L84
            r4 = 2
            goto L22
        L82:
            if (r12 <= r6) goto L91
        L84:
            int r4 = r10 + 1
            char r11 = (char) r13
            r2[r10] = r11
            r10 = r4
            if (r5 == r1) goto L8f
            r4 = 2
            goto L100
        L8f:
            r11 = 0
            goto L99
        L91:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid Unicode sequence: illegal character"
            r0.<init>(r1)
            throw r0
        L99:
            r4 = 13
            if (r11 != r7) goto Lda
            if (r5 == r1) goto Ld6
            if (r5 == r4) goto Ld2
            r11 = 98
            if (r5 == r11) goto Lcc
            r11 = 102(0x66, float:1.43E-43)
            if (r5 == r11) goto Lc9
            r11 = 110(0x6e, float:1.54E-43)
            if (r5 == r11) goto Lc6
            r1 = 114(0x72, float:1.6E-43)
            if (r5 == r1) goto Lc3
            r1 = 116(0x74, float:1.63E-43)
            if (r5 == r1) goto Lc0
            r1 = 117(0x75, float:1.64E-43)
            if (r5 == r1) goto Lba
            goto Lce
        Lba:
            r4 = 2
            r11 = 2
            r12 = 0
            r13 = 0
            goto L22
        Lc0:
            r5 = 9
            goto Lce
        Lc3:
            r5 = 13
            goto Lce
        Lc6:
            r5 = 10
            goto Lce
        Lc9:
            r5 = 12
            goto Lce
        Lcc:
            r5 = 8
        Lce:
            r1 = 5
        Lcf:
            r11 = 0
            goto L137
        Ld2:
            r4 = 2
            r11 = 3
            goto L22
        Ld6:
            r4 = 2
        Ld7:
            r11 = 5
            goto L22
        Lda:
            if (r5 == r1) goto L148
            if (r5 == r4) goto L145
            r7 = 33
            if (r5 == r7) goto L103
            r7 = 35
            if (r5 == r7) goto L103
            r1 = 58
            if (r5 == r1) goto Lfb
            r1 = 61
            if (r5 == r1) goto Lfb
            r1 = 92
            if (r5 == r1) goto Lf3
            goto L112
        Lf3:
            if (r11 != r6) goto Lf6
            r14 = r10
        Lf6:
            r4 = 2
            r7 = 1
            r11 = 1
            goto L22
        Lfb:
            if (r14 != r8) goto L112
            r14 = r10
            r4 = 2
            r7 = 1
        L100:
            r11 = 0
            goto L22
        L103:
            if (r15 == 0) goto L112
        L105:
            int r5 = r3.read()
            if (r5 != r8) goto L10c
            goto L111
        L10c:
            char r5 = (char) r5
            if (r5 == r4) goto L12c
            if (r5 != r1) goto L105
        L111:
            goto L12c
        L112:
            boolean r1 = java.lang.Character.isSpace(r5)
            if (r1 == 0) goto L130
            r1 = 3
            if (r11 != r1) goto L11c
            r11 = 5
        L11c:
            if (r10 == 0) goto L12b
            if (r10 == r14) goto L12b
            r1 = 5
            if (r11 != r1) goto L124
            goto L12c
        L124:
            if (r14 != r8) goto L131
            r4 = 2
            r7 = 1
            r11 = 4
            goto L22
        L12b:
            r1 = 5
        L12c:
            r4 = 2
            r7 = 1
            goto L22
        L130:
            r1 = 5
        L131:
            if (r11 == r1) goto Lcf
            r4 = 3
            if (r11 != r4) goto L137
            goto Lcf
        L137:
            if (r11 != r6) goto L13b
            r14 = r10
            r11 = 0
        L13b:
            int r4 = r10 + 1
            r2[r10] = r5
            r10 = r4
            r4 = 2
            r7 = 1
            r15 = 0
            goto L22
        L145:
            r1 = 5
            r4 = 3
            goto L14f
        L148:
            r1 = 5
            r4 = 3
            if (r11 != r4) goto L14f
            r4 = 2
            r7 = 1
            goto Ld7
        L14f:
            if (r10 > 0) goto L155
            if (r10 != 0) goto L168
            if (r14 != 0) goto L168
        L155:
            if (r14 != r8) goto L158
            r14 = r10
        L158:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2, r9, r10)
            java.lang.String r7 = r5.substring(r9, r14)
            java.lang.String r5 = r5.substring(r14)
            r0.put(r7, r5)
        L168:
            r4 = 2
            r7 = 1
            r10 = 0
            r11 = 0
            goto L20
    }
}
