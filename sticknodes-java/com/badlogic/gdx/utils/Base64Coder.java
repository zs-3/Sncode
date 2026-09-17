package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class Base64Coder {
    public static final com.badlogic.gdx.utils.Base64Coder.CharMap regularMap = null;
    public static final com.badlogic.gdx.utils.Base64Coder.CharMap urlsafeMap = null;

    public static class CharMap {
        protected final byte[] decodingMap;
        protected final char[] encodingMap;

        public CharMap(char r7, char r8) {
                r6 = this;
                r6.<init>()
                r0 = 64
                char[] r1 = new char[r0]
                r6.encodingMap = r1
                r1 = 128(0x80, float:1.794E-43)
                byte[] r1 = new byte[r1]
                r6.decodingMap = r1
                r1 = 0
                r2 = 65
                r3 = 0
            L13:
                r4 = 90
                if (r2 > r4) goto L22
                char[] r4 = r6.encodingMap
                int r5 = r3 + 1
                r4[r3] = r2
                int r2 = r2 + 1
                char r2 = (char) r2
                r3 = r5
                goto L13
            L22:
                r2 = 97
            L24:
                r4 = 122(0x7a, float:1.71E-43)
                if (r2 > r4) goto L33
                char[] r4 = r6.encodingMap
                int r5 = r3 + 1
                r4[r3] = r2
                int r2 = r2 + 1
                char r2 = (char) r2
                r3 = r5
                goto L24
            L33:
                r2 = 48
            L35:
                r4 = 57
                if (r2 > r4) goto L44
                char[] r4 = r6.encodingMap
                int r5 = r3 + 1
                r4[r3] = r2
                int r2 = r2 + 1
                char r2 = (char) r2
                r3 = r5
                goto L35
            L44:
                char[] r2 = r6.encodingMap
                int r4 = r3 + 1
                r2[r3] = r7
                r2[r4] = r8
                r7 = 0
            L4d:
                byte[] r8 = r6.decodingMap
                int r2 = r8.length
                if (r7 >= r2) goto L58
                r2 = -1
                r8[r7] = r2
                int r7 = r7 + 1
                goto L4d
            L58:
                if (r1 >= r0) goto L66
                byte[] r7 = r6.decodingMap
                char[] r8 = r6.encodingMap
                char r8 = r8[r1]
                byte r2 = (byte) r1
                r7[r8] = r2
                int r1 = r1 + 1
                goto L58
            L66:
                return
        }
    }

    static {
            com.badlogic.gdx.utils.Base64Coder$CharMap r0 = new com.badlogic.gdx.utils.Base64Coder$CharMap
            r1 = 43
            r2 = 47
            r0.<init>(r1, r2)
            com.badlogic.gdx.utils.Base64Coder.regularMap = r0
            com.badlogic.gdx.utils.Base64Coder$CharMap r0 = new com.badlogic.gdx.utils.Base64Coder$CharMap
            r1 = 45
            r2 = 95
            r0.<init>(r1, r2)
            com.badlogic.gdx.utils.Base64Coder.urlsafeMap = r0
            return
    }

    public static byte[] decode(java.lang.String r0) {
            char[] r0 = r0.toCharArray()
            byte[] r0 = decode(r0)
            return r0
    }

    public static byte[] decode(char[] r3) {
            int r0 = r3.length
            com.badlogic.gdx.utils.Base64Coder$CharMap r1 = com.badlogic.gdx.utils.Base64Coder.regularMap
            byte[] r1 = r1.decodingMap
            r2 = 0
            byte[] r3 = decode(r3, r2, r0, r1)
            return r3
    }

    public static byte[] decode(char[] r9, int r10, int r11, byte[] r12) {
            int r0 = r11 % 4
            if (r0 != 0) goto L8e
        L4:
            if (r11 <= 0) goto L13
            int r0 = r10 + r11
            int r0 = r0 + (-1)
            char r0 = r9[r0]
            r1 = 61
            if (r0 != r1) goto L13
            int r11 = r11 + (-1)
            goto L4
        L13:
            int r0 = r11 * 3
            int r0 = r0 / 4
            byte[] r1 = new byte[r0]
            int r11 = r11 + r10
            r2 = 0
        L1b:
            if (r10 >= r11) goto L8d
            int r3 = r10 + 1
            char r10 = r9[r10]
            int r4 = r3 + 1
            char r3 = r9[r3]
            r5 = 65
            if (r4 >= r11) goto L2e
            int r6 = r4 + 1
            char r4 = r9[r4]
            goto L31
        L2e:
            r6 = r4
            r4 = 65
        L31:
            if (r6 >= r11) goto L38
            int r5 = r6 + 1
            char r6 = r9[r6]
            goto L3b
        L38:
            r5 = r6
            r6 = 65
        L3b:
            java.lang.String r7 = "Illegal character in Base64 encoded data."
            r8 = 127(0x7f, float:1.78E-43)
            if (r10 > r8) goto L87
            if (r3 > r8) goto L87
            if (r4 > r8) goto L87
            if (r6 > r8) goto L87
            r10 = r12[r10]
            r3 = r12[r3]
            r4 = r12[r4]
            r6 = r12[r6]
            if (r10 < 0) goto L81
            if (r3 < 0) goto L81
            if (r4 < 0) goto L81
            if (r6 < 0) goto L81
            int r10 = r10 << 2
            int r7 = r3 >>> 4
            r10 = r10 | r7
            r3 = r3 & 15
            int r3 = r3 << 4
            int r7 = r4 >>> 2
            r3 = r3 | r7
            r4 = r4 & 3
            int r4 = r4 << 6
            r4 = r4 | r6
            int r6 = r2 + 1
            byte r10 = (byte) r10
            r1[r2] = r10
            if (r6 >= r0) goto L75
            int r10 = r6 + 1
            byte r2 = (byte) r3
            r1[r6] = r2
            r6 = r10
        L75:
            if (r6 >= r0) goto L7e
            int r10 = r6 + 1
            byte r2 = (byte) r4
            r1[r6] = r2
            r2 = r10
            goto L7f
        L7e:
            r2 = r6
        L7f:
            r10 = r5
            goto L1b
        L81:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r7)
            throw r9
        L87:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r7)
            throw r9
        L8d:
            return r1
        L8e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Length of Base64 encoded input string is not a multiple of 4."
            r9.<init>(r10)
            throw r9
    }
}
