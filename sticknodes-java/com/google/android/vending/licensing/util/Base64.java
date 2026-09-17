package com.google.android.vending.licensing.util;

/* loaded from: classes2.dex */
public class Base64 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final byte[] ALPHABET = null;
    private static final byte[] DECODABET = null;
    public static final boolean DECODE = false;
    public static final boolean ENCODE = true;
    private static final byte EQUALS_SIGN = 61;
    private static final byte EQUALS_SIGN_ENC = -1;
    private static final byte NEW_LINE = 10;
    private static final byte[] WEBSAFE_ALPHABET = null;
    private static final byte[] WEBSAFE_DECODABET = null;
    private static final byte WHITE_SPACE_ENC = -5;

    static {
            r0 = 64
            byte[] r1 = new byte[r0]
            r1 = {x0022: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47} // fill-array
            com.google.android.vending.licensing.util.Base64.ALPHABET = r1
            byte[] r0 = new byte[r0]
            r0 = {x0046: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95} // fill-array
            com.google.android.vending.licensing.util.Base64.WEBSAFE_ALPHABET = r0
            r0 = 128(0x80, float:1.794E-43)
            byte[] r1 = new byte[r0]
            r1 = {x006a: FILL_ARRAY_DATA , data: [-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9} // fill-array
            com.google.android.vending.licensing.util.Base64.DECODABET = r1
            byte[] r0 = new byte[r0]
            r0 = {x00ae: FILL_ARRAY_DATA , data: [-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9} // fill-array
            com.google.android.vending.licensing.util.Base64.WEBSAFE_DECODABET = r0
            return
    }

    private Base64() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] decode(java.lang.String r2) throws com.google.android.vending.licensing.util.Base64DecoderException {
            byte[] r2 = r2.getBytes()
            int r0 = r2.length
            r1 = 0
            byte[] r2 = decode(r2, r1, r0)
            return r2
    }

    public static byte[] decode(byte[] r2) throws com.google.android.vending.licensing.util.Base64DecoderException {
            int r0 = r2.length
            r1 = 0
            byte[] r2 = decode(r2, r1, r0)
            return r2
    }

    public static byte[] decode(byte[] r1, int r2, int r3) throws com.google.android.vending.licensing.util.Base64DecoderException {
            byte[] r0 = com.google.android.vending.licensing.util.Base64.DECODABET
            byte[] r1 = decode(r1, r2, r3, r0)
            return r1
    }

    public static byte[] decode(byte[] r16, int r17, int r18, byte[] r19) throws com.google.android.vending.licensing.util.Base64DecoderException {
            r0 = r18
            r1 = r19
            int r2 = r0 * 3
            r3 = 4
            int r2 = r2 / r3
            r4 = 2
            int r2 = r2 + r4
            byte[] r2 = new byte[r2]
            byte[] r5 = new byte[r3]
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
        L12:
            r10 = 61
            r11 = 1
            if (r7 >= r0) goto Lb5
            int r12 = r7 + r17
            r13 = r16[r12]
            r13 = r13 & 127(0x7f, float:1.78E-43)
            byte r13 = (byte) r13
            r14 = r1[r13]
            r15 = -5
            if (r14 < r15) goto L8f
            r12 = -1
            if (r14 < r12) goto L8c
            if (r13 != r10) goto L7e
            int r12 = r0 - r7
            int r13 = r0 + (-1)
            int r13 = r13 + r17
            r13 = r16[r13]
            r13 = r13 & 127(0x7f, float:1.78E-43)
            byte r13 = (byte) r13
            if (r8 == 0) goto L67
            if (r8 == r11) goto L67
            r14 = 3
            if (r8 != r14) goto L3c
            if (r12 > r4) goto L41
        L3c:
            if (r8 != r3) goto L58
            if (r12 > r11) goto L41
            goto L58
        L41:
            com.google.android.vending.licensing.util.Base64DecoderException r0 = new com.google.android.vending.licensing.util.Base64DecoderException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "padding byte '=' falsely signals end of encoded value at offset "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L58:
            if (r13 == r10) goto Lb5
            r3 = 10
            if (r13 != r3) goto L5f
            goto Lb5
        L5f:
            com.google.android.vending.licensing.util.Base64DecoderException r0 = new com.google.android.vending.licensing.util.Base64DecoderException
            java.lang.String r1 = "encoded value has invalid trailing byte"
            r0.<init>(r1)
            throw r0
        L67:
            com.google.android.vending.licensing.util.Base64DecoderException r0 = new com.google.android.vending.licensing.util.Base64DecoderException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "invalid padding byte '=' at byte offset "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L7e:
            int r10 = r8 + 1
            r5[r8] = r13
            if (r10 != r3) goto L8b
            int r8 = decode4to3(r5, r6, r2, r9, r1)
            int r9 = r9 + r8
            r8 = 0
            goto L8c
        L8b:
            r8 = r10
        L8c:
            int r7 = r7 + 1
            goto L12
        L8f:
            com.google.android.vending.licensing.util.Base64DecoderException r0 = new com.google.android.vending.licensing.util.Base64DecoderException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Bad Base64 input character at "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = ": "
            r1.append(r2)
            r2 = r16[r12]
            r1.append(r2)
            java.lang.String r2 = "(decimal)"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lb5:
            if (r8 == 0) goto Ld9
            if (r8 == r11) goto Lc1
            r5[r8] = r10
            int r0 = decode4to3(r5, r6, r2, r9, r1)
            int r9 = r9 + r0
            goto Ld9
        Lc1:
            com.google.android.vending.licensing.util.Base64DecoderException r1 = new com.google.android.vending.licensing.util.Base64DecoderException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "single trailing character at offset "
            r2.append(r3)
            int r0 = r0 - r11
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        Ld9:
            byte[] r0 = new byte[r9]
            java.lang.System.arraycopy(r2, r6, r0, r6, r9)
            return r0
    }

    private static int decode4to3(byte[] r6, int r7, byte[] r8, int r9, byte[] r10) {
            int r0 = r7 + 2
            r1 = r6[r0]
            r2 = 61
            r3 = 1
            if (r1 != r2) goto L21
            r0 = r6[r7]
            r0 = r10[r0]
            int r0 = r0 << 24
            int r0 = r0 >>> 6
            int r7 = r7 + r3
            r6 = r6[r7]
            r6 = r10[r6]
            int r6 = r6 << 24
            int r6 = r6 >>> 12
            r6 = r6 | r0
            int r6 = r6 >>> 16
            byte r6 = (byte) r6
            r8[r9] = r6
            return r3
        L21:
            int r1 = r7 + 3
            r4 = r6[r1]
            r5 = 2
            if (r4 != r2) goto L4f
            r1 = r6[r7]
            r1 = r10[r1]
            int r1 = r1 << 24
            int r1 = r1 >>> 6
            int r7 = r7 + r3
            r7 = r6[r7]
            r7 = r10[r7]
            int r7 = r7 << 24
            int r7 = r7 >>> 12
            r7 = r7 | r1
            r6 = r6[r0]
            r6 = r10[r6]
            int r6 = r6 << 24
            int r6 = r6 >>> 18
            r6 = r6 | r7
            int r7 = r6 >>> 16
            byte r7 = (byte) r7
            r8[r9] = r7
            int r9 = r9 + r3
            int r6 = r6 >>> 8
            byte r6 = (byte) r6
            r8[r9] = r6
            return r5
        L4f:
            r2 = r6[r7]
            r2 = r10[r2]
            int r2 = r2 << 24
            int r2 = r2 >>> 6
            int r7 = r7 + r3
            r7 = r6[r7]
            r7 = r10[r7]
            int r7 = r7 << 24
            int r7 = r7 >>> 12
            r7 = r7 | r2
            r0 = r6[r0]
            r0 = r10[r0]
            int r0 = r0 << 24
            int r0 = r0 >>> 18
            r7 = r7 | r0
            r6 = r6[r1]
            r6 = r10[r6]
            int r6 = r6 << 24
            int r6 = r6 >>> 24
            r6 = r6 | r7
            int r7 = r6 >> 16
            byte r7 = (byte) r7
            r8[r9] = r7
            int r7 = r9 + 1
            int r10 = r6 >> 8
            byte r10 = (byte) r10
            r8[r7] = r10
            int r9 = r9 + r5
            byte r6 = (byte) r6
            r8[r9] = r6
            r6 = 3
            return r6
    }

    public static byte[] decodeWebSafe(java.lang.String r2) throws com.google.android.vending.licensing.util.Base64DecoderException {
            byte[] r2 = r2.getBytes()
            int r0 = r2.length
            r1 = 0
            byte[] r2 = decodeWebSafe(r2, r1, r0)
            return r2
    }

    public static byte[] decodeWebSafe(byte[] r2) throws com.google.android.vending.licensing.util.Base64DecoderException {
            int r0 = r2.length
            r1 = 0
            byte[] r2 = decodeWebSafe(r2, r1, r0)
            return r2
    }

    public static byte[] decodeWebSafe(byte[] r1, int r2, int r3) throws com.google.android.vending.licensing.util.Base64DecoderException {
            byte[] r0 = com.google.android.vending.licensing.util.Base64.WEBSAFE_DECODABET
            byte[] r1 = decode(r1, r2, r3, r0)
            return r1
    }

    public static java.lang.String encode(byte[] r4) {
            int r0 = r4.length
            byte[] r1 = com.google.android.vending.licensing.util.Base64.ALPHABET
            r2 = 0
            r3 = 1
            java.lang.String r4 = encode(r4, r2, r0, r1, r3)
            return r4
    }

    public static java.lang.String encode(byte[] r1, int r2, int r3, byte[] r4, boolean r5) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            byte[] r1 = encode(r1, r2, r3, r4, r0)
            int r2 = r1.length
        L8:
            if (r5 != 0) goto L18
            if (r2 <= 0) goto L18
            int r3 = r2 + (-1)
            r3 = r1[r3]
            r4 = 61
            if (r3 == r4) goto L15
            goto L18
        L15:
            int r2 = r2 + (-1)
            goto L8
        L18:
            java.lang.String r3 = new java.lang.String
            r4 = 0
            r3.<init>(r1, r4, r2)
            return r3
    }

    public static byte[] encode(byte[] r11, int r12, int r13, byte[] r14, int r15) {
            int r0 = r13 + 2
            int r0 = r0 / 3
            int r0 = r0 * 4
            int r1 = r0 / r15
            int r0 = r0 + r1
            byte[] r0 = new byte[r0]
            int r1 = r13 + (-2)
            r2 = 0
            r3 = 0
            r7 = 0
            r8 = 0
        L11:
            r9 = 10
            if (r3 >= r1) goto L62
            int r4 = r3 + r12
            r4 = r11[r4]
            int r4 = r4 << 24
            int r4 = r4 >>> 8
            int r5 = r3 + 1
            int r5 = r5 + r12
            r5 = r11[r5]
            int r5 = r5 << 24
            int r5 = r5 >>> 16
            r4 = r4 | r5
            int r5 = r3 + 2
            int r5 = r5 + r12
            r5 = r11[r5]
            int r5 = r5 << 24
            int r5 = r5 >>> 24
            r4 = r4 | r5
            int r5 = r4 >>> 18
            r5 = r14[r5]
            r0[r7] = r5
            int r5 = r7 + 1
            int r6 = r4 >>> 12
            r6 = r6 & 63
            r6 = r14[r6]
            r0[r5] = r6
            int r6 = r7 + 2
            int r10 = r4 >>> 6
            r10 = r10 & 63
            r10 = r14[r10]
            r0[r6] = r10
            int r6 = r7 + 3
            r4 = r4 & 63
            r4 = r14[r4]
            r0[r6] = r4
            int r8 = r8 + 4
            if (r8 != r15) goto L5d
            int r7 = r7 + 4
            r0[r7] = r9
            r7 = r5
            r8 = 0
        L5d:
            int r3 = r3 + 3
            int r7 = r7 + 4
            goto L11
        L62:
            if (r3 >= r13) goto L77
            int r2 = r3 + r12
            int r3 = r13 - r3
            r1 = r11
            r4 = r0
            r5 = r7
            r6 = r14
            encode3to4(r1, r2, r3, r4, r5, r6)
            int r8 = r8 + 4
            if (r8 != r15) goto L77
            int r7 = r7 + 4
            r0[r7] = r9
        L77:
            return r0
    }

    private static byte[] encode3to4(byte[] r4, int r5, int r6, byte[] r7, int r8, byte[] r9) {
            r0 = 0
            if (r6 <= 0) goto La
            r1 = r4[r5]
            int r1 = r1 << 24
            int r1 = r1 >>> 8
            goto Lb
        La:
            r1 = 0
        Lb:
            r2 = 1
            if (r6 <= r2) goto L17
            int r3 = r5 + 1
            r3 = r4[r3]
            int r3 = r3 << 24
            int r3 = r3 >>> 16
            goto L18
        L17:
            r3 = 0
        L18:
            r1 = r1 | r3
            r3 = 2
            if (r6 <= r3) goto L23
            int r5 = r5 + r3
            r4 = r4[r5]
            int r4 = r4 << 24
            int r0 = r4 >>> 24
        L23:
            r4 = r1 | r0
            r5 = 61
            r0 = 3
            if (r6 == r2) goto L6f
            if (r6 == r3) goto L51
            if (r6 == r0) goto L2f
            return r7
        L2f:
            int r5 = r4 >>> 18
            r5 = r9[r5]
            r7[r8] = r5
            int r5 = r8 + 1
            int r6 = r4 >>> 12
            r6 = r6 & 63
            r6 = r9[r6]
            r7[r5] = r6
            int r5 = r8 + 2
            int r6 = r4 >>> 6
            r6 = r6 & 63
            r6 = r9[r6]
            r7[r5] = r6
            int r8 = r8 + r0
            r4 = r4 & 63
            r4 = r9[r4]
            r7[r8] = r4
            return r7
        L51:
            int r6 = r4 >>> 18
            r6 = r9[r6]
            r7[r8] = r6
            int r6 = r8 + 1
            int r1 = r4 >>> 12
            r1 = r1 & 63
            r1 = r9[r1]
            r7[r6] = r1
            int r6 = r8 + 2
            int r4 = r4 >>> 6
            r4 = r4 & 63
            r4 = r9[r4]
            r7[r6] = r4
            int r8 = r8 + r0
            r7[r8] = r5
            return r7
        L6f:
            int r6 = r4 >>> 18
            r6 = r9[r6]
            r7[r8] = r6
            int r6 = r8 + 1
            int r4 = r4 >>> 12
            r4 = r4 & 63
            r4 = r9[r4]
            r7[r6] = r4
            int r4 = r8 + 2
            r7[r4] = r5
            int r8 = r8 + r0
            r7[r8] = r5
            return r7
    }

    public static java.lang.String encodeWebSafe(byte[] r3, boolean r4) {
            int r0 = r3.length
            byte[] r1 = com.google.android.vending.licensing.util.Base64.WEBSAFE_ALPHABET
            r2 = 0
            java.lang.String r3 = encode(r3, r2, r0, r1, r4)
            return r3
    }
}
