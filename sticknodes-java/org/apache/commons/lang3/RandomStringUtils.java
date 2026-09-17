package org.apache.commons.lang3;

/* loaded from: classes2.dex */
public class RandomStringUtils {
    private static final java.util.Random RANDOM = null;

    static {
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            org.apache.commons.lang3.RandomStringUtils.RANDOM = r0
            return
    }

    public RandomStringUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String random(int r1) {
            r0 = 0
            java.lang.String r1 = random(r1, r0, r0)
            return r1
    }

    public static java.lang.String random(int r7, int r8, int r9, boolean r10, boolean r11) {
            java.util.Random r6 = org.apache.commons.lang3.RandomStringUtils.RANDOM
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            java.lang.String r7 = random(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static java.lang.String random(int r7, int r8, int r9, boolean r10, boolean r11, char... r12) {
            java.util.Random r6 = org.apache.commons.lang3.RandomStringUtils.RANDOM
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            java.lang.String r7 = random(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static java.lang.String random(int r4, int r5, int r6, boolean r7, boolean r8, char[] r9, java.util.Random r10) {
            if (r4 != 0) goto L5
            java.lang.String r4 = ""
            return r4
        L5:
            if (r4 < 0) goto Le3
            if (r9 == 0) goto L15
            int r0 = r9.length
            if (r0 == 0) goto Ld
            goto L15
        Ld:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "The chars array must not be empty"
            r4.<init>(r5)
            throw r4
        L15:
            java.lang.String r0 = "Parameter end ("
            if (r5 != 0) goto L2c
            if (r6 != 0) goto L2c
            if (r9 == 0) goto L1f
            int r6 = r9.length
            goto L2e
        L1f:
            if (r7 != 0) goto L27
            if (r8 != 0) goto L27
            r6 = 1114111(0x10ffff, float:1.561202E-39)
            goto L2e
        L27:
            r6 = 123(0x7b, float:1.72E-43)
            r5 = 32
            goto L2e
        L2c:
            if (r6 <= r5) goto Lc1
        L2e:
            if (r9 != 0) goto L67
            r1 = 65
            r2 = 48
            if (r8 == 0) goto L38
            if (r6 <= r2) goto L3d
        L38:
            if (r7 == 0) goto L67
            if (r6 <= r1) goto L3d
            goto L67
        L3d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r6)
            java.lang.String r6 = ") must be greater then ("
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = ") for generating digits or greater then ("
            r5.append(r6)
            r5.append(r1)
            java.lang.String r6 = ") for generating letters."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L67:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            int r6 = r6 - r5
        L6d:
            int r1 = r4 + (-1)
            if (r4 == 0) goto Lbc
            if (r9 != 0) goto L8a
            int r4 = r10.nextInt(r6)
            int r4 = r4 + r5
            int r2 = java.lang.Character.getType(r4)
            if (r2 == 0) goto L87
            r3 = 18
            if (r2 == r3) goto L87
            r3 = 19
            if (r2 == r3) goto L87
            goto L91
        L87:
            int r4 = r1 + 1
            goto L6d
        L8a:
            int r4 = r10.nextInt(r6)
            int r4 = r4 + r5
            char r4 = r9[r4]
        L91:
            int r2 = java.lang.Character.charCount(r4)
            if (r1 != 0) goto L9b
            r3 = 1
            if (r2 <= r3) goto L9b
            goto L87
        L9b:
            if (r7 == 0) goto La3
            boolean r3 = java.lang.Character.isLetter(r4)
            if (r3 != 0) goto Laf
        La3:
            if (r8 == 0) goto Lab
            boolean r3 = java.lang.Character.isDigit(r4)
            if (r3 != 0) goto Laf
        Lab:
            if (r7 != 0) goto Lb9
            if (r8 != 0) goto Lb9
        Laf:
            r0.appendCodePoint(r4)
            r4 = 2
            if (r2 != r4) goto Lb7
            int r1 = r1 + (-1)
        Lb7:
            r4 = r1
            goto L6d
        Lb9:
            int r1 = r1 + 1
            goto Lb7
        Lbc:
            java.lang.String r4 = r0.toString()
            return r4
        Lc1:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = ") must be greater than start ("
            r7.append(r6)
            r7.append(r5)
            java.lang.String r5 = ")"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r4.<init>(r5)
            throw r4
        Le3:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Requested random string length "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = " is less than 0."
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
    }

    public static java.lang.String random(int r7, java.lang.String r8) {
            if (r8 != 0) goto Lf
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            java.util.Random r6 = org.apache.commons.lang3.RandomStringUtils.RANDOM
            r0 = r7
            java.lang.String r7 = random(r0, r1, r2, r3, r4, r5, r6)
            return r7
        Lf:
            char[] r8 = r8.toCharArray()
            java.lang.String r7 = random(r7, r8)
            return r7
    }

    public static java.lang.String random(int r1, boolean r2, boolean r3) {
            r0 = 0
            java.lang.String r1 = random(r1, r0, r0, r2, r3)
            return r1
    }

    public static java.lang.String random(int r7, char... r8) {
            if (r8 != 0) goto Lf
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            java.util.Random r6 = org.apache.commons.lang3.RandomStringUtils.RANDOM
            r0 = r7
            java.lang.String r7 = random(r0, r1, r2, r3, r4, r5, r6)
            return r7
        Lf:
            r1 = 0
            int r2 = r8.length
            r3 = 0
            r4 = 0
            java.util.Random r6 = org.apache.commons.lang3.RandomStringUtils.RANDOM
            r0 = r7
            r5 = r8
            java.lang.String r7 = random(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static java.lang.String randomAlphabetic(int r2) {
            r0 = 1
            r1 = 0
            java.lang.String r2 = random(r2, r0, r1)
            return r2
    }

    public static java.lang.String randomAlphabetic(int r0, int r1) {
            int r0 = org.apache.commons.lang3.RandomUtils.nextInt(r0, r1)
            java.lang.String r0 = randomAlphabetic(r0)
            return r0
    }

    public static java.lang.String randomAlphanumeric(int r1) {
            r0 = 1
            java.lang.String r1 = random(r1, r0, r0)
            return r1
    }

    public static java.lang.String randomAlphanumeric(int r0, int r1) {
            int r0 = org.apache.commons.lang3.RandomUtils.nextInt(r0, r1)
            java.lang.String r0 = randomAlphanumeric(r0)
            return r0
    }

    public static java.lang.String randomAscii(int r3) {
            r0 = 32
            r1 = 127(0x7f, float:1.78E-43)
            r2 = 0
            java.lang.String r3 = random(r3, r0, r1, r2, r2)
            return r3
    }

    public static java.lang.String randomAscii(int r0, int r1) {
            int r0 = org.apache.commons.lang3.RandomUtils.nextInt(r0, r1)
            java.lang.String r0 = randomAscii(r0)
            return r0
    }

    public static java.lang.String randomGraph(int r3) {
            r0 = 33
            r1 = 126(0x7e, float:1.77E-43)
            r2 = 0
            java.lang.String r3 = random(r3, r0, r1, r2, r2)
            return r3
    }

    public static java.lang.String randomGraph(int r0, int r1) {
            int r0 = org.apache.commons.lang3.RandomUtils.nextInt(r0, r1)
            java.lang.String r0 = randomGraph(r0)
            return r0
    }

    public static java.lang.String randomNumeric(int r2) {
            r0 = 0
            r1 = 1
            java.lang.String r2 = random(r2, r0, r1)
            return r2
    }

    public static java.lang.String randomNumeric(int r0, int r1) {
            int r0 = org.apache.commons.lang3.RandomUtils.nextInt(r0, r1)
            java.lang.String r0 = randomNumeric(r0)
            return r0
    }

    public static java.lang.String randomPrint(int r3) {
            r0 = 32
            r1 = 126(0x7e, float:1.77E-43)
            r2 = 0
            java.lang.String r3 = random(r3, r0, r1, r2, r2)
            return r3
    }

    public static java.lang.String randomPrint(int r0, int r1) {
            int r0 = org.apache.commons.lang3.RandomUtils.nextInt(r0, r1)
            java.lang.String r0 = randomPrint(r0)
            return r0
    }
}
