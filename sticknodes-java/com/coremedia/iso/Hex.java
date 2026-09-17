package com.coremedia.iso;

/* loaded from: classes.dex */
public class Hex {
    private static final char[] DIGITS = null;

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            com.coremedia.iso.Hex.DIGITS = r0
            return
    }

    public Hex() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] decodeHex(java.lang.String r4) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.length()
            if (r1 < r2) goto L11
            byte[] r4 = r0.toByteArray()
            return r4
        L11:
            int r2 = r1 + 2
            java.lang.String r1 = r4.substring(r1, r2)
            r3 = 16
            int r1 = java.lang.Integer.parseInt(r1, r3)
            r0.write(r1)
            r1 = r2
            goto L6
    }

    public static java.lang.String encodeHex(byte[] r1) {
            r0 = 0
            java.lang.String r1 = encodeHex(r1, r0)
            return r1
    }

    public static java.lang.String encodeHex(byte[] r7, int r8) {
            int r0 = r7.length
            int r1 = r0 << 1
            r2 = 0
            if (r8 <= 0) goto L9
            int r3 = r0 / r8
            goto La
        L9:
            r3 = 0
        La:
            int r1 = r1 + r3
            char[] r1 = new char[r1]
            r3 = 0
        Le:
            if (r2 < r0) goto L16
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1)
            return r7
        L16:
            if (r8 <= 0) goto L25
            int r4 = r2 % r8
            if (r4 != 0) goto L25
            if (r3 <= 0) goto L25
            int r4 = r3 + 1
            r5 = 45
            r1[r3] = r5
            r3 = r4
        L25:
            int r4 = r3 + 1
            char[] r5 = com.coremedia.iso.Hex.DIGITS
            r6 = r7[r2]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >>> 4
            char r6 = r5[r6]
            r1[r3] = r6
            int r3 = r4 + 1
            r6 = r7[r2]
            r6 = r6 & 15
            char r5 = r5[r6]
            r1[r4] = r5
            int r2 = r2 + 1
            goto Le
    }
}
