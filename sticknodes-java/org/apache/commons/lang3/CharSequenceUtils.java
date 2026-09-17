package org.apache.commons.lang3;

/* loaded from: classes2.dex */
public class CharSequenceUtils {
    private static final int NOT_FOUND = -1;

    public CharSequenceUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static int indexOf(java.lang.CharSequence r7, int r8, int r9) {
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto Lb
            java.lang.String r7 = (java.lang.String) r7
            int r7 = r7.indexOf(r8, r9)
            return r7
        Lb:
            int r0 = r7.length()
            r1 = 0
            if (r9 >= 0) goto L13
            r9 = 0
        L13:
            r2 = 65536(0x10000, float:9.18355E-41)
            if (r8 >= r2) goto L24
            r2 = r9
        L18:
            if (r2 >= r0) goto L24
            char r3 = r7.charAt(r2)
            if (r3 != r8) goto L21
            return r2
        L21:
            int r2 = r2 + 1
            goto L18
        L24:
            r2 = 1114111(0x10ffff, float:1.561202E-39)
            if (r8 > r2) goto L47
            char[] r8 = java.lang.Character.toChars(r8)
        L2d:
            r2 = 1
            int r3 = r0 + (-1)
            if (r9 >= r3) goto L47
            char r3 = r7.charAt(r9)
            int r4 = r9 + 1
            char r5 = r7.charAt(r4)
            char r6 = r8[r1]
            if (r3 != r6) goto L45
            char r2 = r8[r2]
            if (r5 != r2) goto L45
            return r9
        L45:
            r9 = r4
            goto L2d
        L47:
            r7 = -1
            return r7
    }

    static int indexOf(java.lang.CharSequence r0, java.lang.CharSequence r1, int r2) {
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r1.toString()
            int r0 = r0.indexOf(r1, r2)
            return r0
    }

    static int lastIndexOf(java.lang.CharSequence r5, int r6, int r7) {
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto Lb
            java.lang.String r5 = (java.lang.String) r5
            int r5 = r5.lastIndexOf(r6, r7)
            return r5
        Lb:
            int r0 = r5.length()
            r1 = -1
            if (r7 >= 0) goto L13
            return r1
        L13:
            if (r7 < r0) goto L17
            int r7 = r0 + (-1)
        L17:
            r2 = 65536(0x10000, float:9.18355E-41)
            if (r6 >= r2) goto L28
            r2 = r7
        L1c:
            if (r2 < 0) goto L28
            char r3 = r5.charAt(r2)
            if (r3 != r6) goto L25
            return r2
        L25:
            int r2 = r2 + (-1)
            goto L1c
        L28:
            r2 = 1114111(0x10ffff, float:1.561202E-39)
            if (r6 > r2) goto L4f
            char[] r6 = java.lang.Character.toChars(r6)
            r2 = 1
            int r0 = r0 - r2
            if (r7 != r0) goto L36
            return r1
        L36:
            if (r7 < 0) goto L4f
            char r0 = r5.charAt(r7)
            int r3 = r7 + 1
            char r3 = r5.charAt(r3)
            r4 = 0
            char r4 = r6[r4]
            if (r4 != r0) goto L4c
            char r0 = r6[r2]
            if (r0 != r3) goto L4c
            return r7
        L4c:
            int r7 = r7 + (-1)
            goto L36
        L4f:
            return r1
    }

    static int lastIndexOf(java.lang.CharSequence r0, java.lang.CharSequence r1, int r2) {
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r1.toString()
            int r0 = r0.lastIndexOf(r1, r2)
            return r0
    }

    static boolean regionMatches(java.lang.CharSequence r7, boolean r8, int r9, java.lang.CharSequence r10, int r11, int r12) {
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L17
            boolean r0 = r10 instanceof java.lang.String
            if (r0 == 0) goto L17
            r1 = r7
            java.lang.String r1 = (java.lang.String) r1
            r4 = r10
            java.lang.String r4 = (java.lang.String) r4
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            boolean r7 = r1.regionMatches(r2, r3, r4, r5, r6)
            return r7
        L17:
            int r0 = r7.length()
            int r0 = r0 - r9
            int r1 = r10.length()
            int r1 = r1 - r11
            r2 = 0
            if (r9 < 0) goto L5f
            if (r11 < 0) goto L5f
            if (r12 >= 0) goto L29
            goto L5f
        L29:
            if (r0 < r12) goto L5f
            if (r1 >= r12) goto L2e
            goto L5f
        L2e:
            int r0 = r12 + (-1)
            if (r12 <= 0) goto L5d
            int r12 = r9 + 1
            char r9 = r7.charAt(r9)
            int r1 = r11 + 1
            char r11 = r10.charAt(r11)
            if (r9 != r11) goto L41
            goto L59
        L41:
            if (r8 != 0) goto L44
            return r2
        L44:
            char r3 = java.lang.Character.toUpperCase(r9)
            char r4 = java.lang.Character.toUpperCase(r11)
            if (r3 == r4) goto L59
            char r9 = java.lang.Character.toLowerCase(r9)
            char r11 = java.lang.Character.toLowerCase(r11)
            if (r9 == r11) goto L59
            return r2
        L59:
            r9 = r12
            r12 = r0
            r11 = r1
            goto L2e
        L5d:
            r7 = 1
            return r7
        L5f:
            return r2
    }

    public static java.lang.CharSequence subSequence(java.lang.CharSequence r1, int r2) {
            if (r1 != 0) goto L4
            r1 = 0
            goto Lc
        L4:
            int r0 = r1.length()
            java.lang.CharSequence r1 = r1.subSequence(r2, r0)
        Lc:
            return r1
    }

    static char[] toCharArray(java.lang.CharSequence r4) {
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto Lb
            java.lang.String r4 = (java.lang.String) r4
            char[] r4 = r4.toCharArray()
            return r4
        Lb:
            int r0 = r4.length()
            int r1 = r4.length()
            char[] r1 = new char[r1]
            r2 = 0
        L16:
            if (r2 >= r0) goto L21
            char r3 = r4.charAt(r2)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L16
        L21:
            return r1
    }
}
