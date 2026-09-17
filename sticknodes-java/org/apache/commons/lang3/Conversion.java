package org.apache.commons.lang3;

/* loaded from: classes2.dex */
public class Conversion {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean[] FFFF = null;
    private static final boolean[] FFFT = null;
    private static final boolean[] FFTF = null;
    private static final boolean[] FFTT = null;
    private static final boolean[] FTFF = null;
    private static final boolean[] FTFT = null;
    private static final boolean[] FTTF = null;
    private static final boolean[] FTTT = null;
    private static final boolean[] TFFF = null;
    private static final boolean[] TFFT = null;
    private static final boolean[] TFTF = null;
    private static final boolean[] TFTT = null;
    private static final boolean[] TTFF = null;
    private static final boolean[] TTFT = null;
    private static final boolean[] TTTF = null;
    private static final boolean[] TTTT = null;

    static {
            r0 = 4
            boolean[] r1 = new boolean[r0]
            r1 = {x0072: FILL_ARRAY_DATA , data: [1, 1, 1, 1} // fill-array
            org.apache.commons.lang3.Conversion.TTTT = r1
            boolean[] r1 = new boolean[r0]
            r1 = {x0078: FILL_ARRAY_DATA , data: [0, 1, 1, 1} // fill-array
            org.apache.commons.lang3.Conversion.FTTT = r1
            boolean[] r1 = new boolean[r0]
            r1 = {x007e: FILL_ARRAY_DATA , data: [1, 0, 1, 1} // fill-array
            org.apache.commons.lang3.Conversion.TFTT = r1
            boolean[] r1 = new boolean[r0]
            r1 = {x0084: FILL_ARRAY_DATA , data: [0, 0, 1, 1} // fill-array
            org.apache.commons.lang3.Conversion.FFTT = r1
            boolean[] r1 = new boolean[r0]
            r1 = {x008a: FILL_ARRAY_DATA , data: [1, 1, 0, 1} // fill-array
            org.apache.commons.lang3.Conversion.TTFT = r1
            boolean[] r1 = new boolean[r0]
            r1 = {x0090: FILL_ARRAY_DATA , data: [0, 1, 0, 1} // fill-array
            org.apache.commons.lang3.Conversion.FTFT = r1
            boolean[] r1 = new boolean[r0]
            r1 = {x0096: FILL_ARRAY_DATA , data: [1, 0, 0, 1} // fill-array
            org.apache.commons.lang3.Conversion.TFFT = r1
            boolean[] r1 = new boolean[r0]
            r1 = {x009c: FILL_ARRAY_DATA , data: [0, 0, 0, 1} // fill-array
            org.apache.commons.lang3.Conversion.FFFT = r1
            boolean[] r1 = new boolean[r0]
            r1 = {x00a2: FILL_ARRAY_DATA , data: [1, 1, 1, 0} // fill-array
            org.apache.commons.lang3.Conversion.TTTF = r1
            boolean[] r1 = new boolean[r0]
            r1 = {x00a8: FILL_ARRAY_DATA , data: [0, 1, 1, 0} // fill-array
            org.apache.commons.lang3.Conversion.FTTF = r1
            boolean[] r1 = new boolean[r0]
            r1 = {x00ae: FILL_ARRAY_DATA , data: [1, 0, 1, 0} // fill-array
            org.apache.commons.lang3.Conversion.TFTF = r1
            boolean[] r1 = new boolean[r0]
            r1 = {x00b4: FILL_ARRAY_DATA , data: [0, 0, 1, 0} // fill-array
            org.apache.commons.lang3.Conversion.FFTF = r1
            boolean[] r1 = new boolean[r0]
            r1 = {x00ba: FILL_ARRAY_DATA , data: [1, 1, 0, 0} // fill-array
            org.apache.commons.lang3.Conversion.TTFF = r1
            boolean[] r1 = new boolean[r0]
            r1 = {x00c0: FILL_ARRAY_DATA , data: [0, 1, 0, 0} // fill-array
            org.apache.commons.lang3.Conversion.FTFF = r1
            boolean[] r1 = new boolean[r0]
            r1 = {x00c6: FILL_ARRAY_DATA , data: [1, 0, 0, 0} // fill-array
            org.apache.commons.lang3.Conversion.TFFF = r1
            boolean[] r0 = new boolean[r0]
            r0 = {x00cc: FILL_ARRAY_DATA , data: [0, 0, 0, 0} // fill-array
            org.apache.commons.lang3.Conversion.FFFF = r0
            return
    }

    public Conversion() {
            r0 = this;
            r0.<init>()
            return
    }

    public static char binaryBeMsb0ToHexDigit(boolean[] r1) {
            r0 = 0
            char r1 = binaryBeMsb0ToHexDigit(r1, r0)
            return r1
    }

    public static char binaryBeMsb0ToHexDigit(boolean[] r4, int r5) {
            int r0 = r4.length
            if (r0 == 0) goto L84
            int r0 = r4.length
            r1 = 1
            int r0 = r0 - r1
            int r0 = r0 - r5
            int r0 = r0 + r1
            r5 = 4
            int r2 = java.lang.Math.min(r5, r0)
            boolean[] r5 = new boolean[r5]
            int r0 = r0 - r2
            int r3 = 4 - r2
            java.lang.System.arraycopy(r4, r0, r5, r3, r2)
            r4 = 0
            boolean r4 = r5[r4]
            r0 = 2
            r2 = 3
            if (r4 == 0) goto L50
            boolean r4 = r5[r1]
            if (r4 == 0) goto L38
            boolean r4 = r5[r0]
            if (r4 == 0) goto L2e
            boolean r4 = r5[r2]
            if (r4 == 0) goto L2b
            r4 = 102(0x66, float:1.43E-43)
            goto L2d
        L2b:
            r4 = 101(0x65, float:1.42E-43)
        L2d:
            return r4
        L2e:
            boolean r4 = r5[r2]
            if (r4 == 0) goto L35
            r4 = 100
            goto L37
        L35:
            r4 = 99
        L37:
            return r4
        L38:
            boolean r4 = r5[r0]
            if (r4 == 0) goto L46
            boolean r4 = r5[r2]
            if (r4 == 0) goto L43
            r4 = 98
            goto L45
        L43:
            r4 = 97
        L45:
            return r4
        L46:
            boolean r4 = r5[r2]
            if (r4 == 0) goto L4d
            r4 = 57
            goto L4f
        L4d:
            r4 = 56
        L4f:
            return r4
        L50:
            boolean r4 = r5[r1]
            if (r4 == 0) goto L6c
            boolean r4 = r5[r0]
            if (r4 == 0) goto L62
            boolean r4 = r5[r2]
            if (r4 == 0) goto L5f
            r4 = 55
            goto L61
        L5f:
            r4 = 54
        L61:
            return r4
        L62:
            boolean r4 = r5[r2]
            if (r4 == 0) goto L69
            r4 = 53
            goto L6b
        L69:
            r4 = 52
        L6b:
            return r4
        L6c:
            boolean r4 = r5[r0]
            if (r4 == 0) goto L7a
            boolean r4 = r5[r2]
            if (r4 == 0) goto L77
            r4 = 51
            goto L79
        L77:
            r4 = 50
        L79:
            return r4
        L7a:
            boolean r4 = r5[r2]
            if (r4 == 0) goto L81
            r4 = 49
            goto L83
        L81:
            r4 = 48
        L83:
            return r4
        L84:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Cannot convert an empty array."
            r4.<init>(r5)
            throw r4
    }

    public static byte binaryToByte(boolean[] r4, int r5, byte r6, int r7, int r8) {
            int r0 = r4.length
            if (r0 != 0) goto L5
            if (r5 == 0) goto L7
        L5:
            if (r8 != 0) goto L8
        L7:
            return r6
        L8:
            int r0 = r8 + (-1)
            int r0 = r0 + r7
            r1 = 8
            if (r0 >= r1) goto L24
            r0 = 0
        L10:
            if (r0 >= r8) goto L23
            int r1 = r0 + r7
            int r2 = r0 + r5
            boolean r2 = r4[r2]
            int r2 = r2 << r1
            r3 = 1
            int r1 = r3 << r1
            int r1 = ~r1
            r6 = r6 & r1
            r6 = r6 | r2
            byte r6 = (byte) r6
            int r0 = r0 + 1
            goto L10
        L23:
            return r6
        L24:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "nBools-1+dstPos is greater or equal to than 8"
            r4.<init>(r5)
            throw r4
    }

    public static char binaryToHexDigit(boolean[] r1) {
            r0 = 0
            char r1 = binaryToHexDigit(r1, r0)
            return r1
    }

    public static char binaryToHexDigit(boolean[] r2, int r3) {
            int r0 = r2.length
            if (r0 == 0) goto L92
            int r0 = r2.length
            int r1 = r3 + 3
            if (r0 <= r1) goto L4f
            boolean r0 = r2[r1]
            if (r0 == 0) goto L4f
            int r0 = r2.length
            int r1 = r3 + 2
            if (r0 <= r1) goto L32
            boolean r0 = r2[r1]
            if (r0 == 0) goto L32
            int r0 = r2.length
            int r1 = r3 + 1
            if (r0 <= r1) goto L28
            boolean r0 = r2[r1]
            if (r0 == 0) goto L28
            boolean r2 = r2[r3]
            if (r2 == 0) goto L25
            r2 = 102(0x66, float:1.43E-43)
            goto L27
        L25:
            r2 = 101(0x65, float:1.42E-43)
        L27:
            return r2
        L28:
            boolean r2 = r2[r3]
            if (r2 == 0) goto L2f
            r2 = 100
            goto L31
        L2f:
            r2 = 99
        L31:
            return r2
        L32:
            int r0 = r2.length
            int r1 = r3 + 1
            if (r0 <= r1) goto L45
            boolean r0 = r2[r1]
            if (r0 == 0) goto L45
            boolean r2 = r2[r3]
            if (r2 == 0) goto L42
            r2 = 98
            goto L44
        L42:
            r2 = 97
        L44:
            return r2
        L45:
            boolean r2 = r2[r3]
            if (r2 == 0) goto L4c
            r2 = 57
            goto L4e
        L4c:
            r2 = 56
        L4e:
            return r2
        L4f:
            int r0 = r2.length
            int r1 = r3 + 2
            if (r0 <= r1) goto L75
            boolean r0 = r2[r1]
            if (r0 == 0) goto L75
            int r0 = r2.length
            int r1 = r3 + 1
            if (r0 <= r1) goto L6b
            boolean r0 = r2[r1]
            if (r0 == 0) goto L6b
            boolean r2 = r2[r3]
            if (r2 == 0) goto L68
            r2 = 55
            goto L6a
        L68:
            r2 = 54
        L6a:
            return r2
        L6b:
            boolean r2 = r2[r3]
            if (r2 == 0) goto L72
            r2 = 53
            goto L74
        L72:
            r2 = 52
        L74:
            return r2
        L75:
            int r0 = r2.length
            int r1 = r3 + 1
            if (r0 <= r1) goto L88
            boolean r0 = r2[r1]
            if (r0 == 0) goto L88
            boolean r2 = r2[r3]
            if (r2 == 0) goto L85
            r2 = 51
            goto L87
        L85:
            r2 = 50
        L87:
            return r2
        L88:
            boolean r2 = r2[r3]
            if (r2 == 0) goto L8f
            r2 = 49
            goto L91
        L8f:
            r2 = 48
        L91:
            return r2
        L92:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Cannot convert an empty array."
            r2.<init>(r3)
            throw r2
    }

    public static char binaryToHexDigitMsb0_4bits(boolean[] r1) {
            r0 = 0
            char r1 = binaryToHexDigitMsb0_4bits(r1, r0)
            return r1
    }

    public static char binaryToHexDigitMsb0_4bits(boolean[] r3, int r4) {
            int r0 = r3.length
            r1 = 8
            if (r0 > r1) goto La4
            int r0 = r3.length
            int r0 = r0 - r4
            r1 = 4
            if (r0 < r1) goto L84
            int r0 = r4 + 3
            boolean r0 = r3[r0]
            if (r0 == 0) goto L4a
            int r0 = r4 + 2
            boolean r0 = r3[r0]
            if (r0 == 0) goto L30
            int r0 = r4 + 1
            boolean r0 = r3[r0]
            if (r0 == 0) goto L26
            boolean r3 = r3[r4]
            if (r3 == 0) goto L23
            r3 = 102(0x66, float:1.43E-43)
            goto L25
        L23:
            r3 = 55
        L25:
            return r3
        L26:
            boolean r3 = r3[r4]
            if (r3 == 0) goto L2d
            r3 = 98
            goto L2f
        L2d:
            r3 = 51
        L2f:
            return r3
        L30:
            int r0 = r4 + 1
            boolean r0 = r3[r0]
            if (r0 == 0) goto L40
            boolean r3 = r3[r4]
            if (r3 == 0) goto L3d
            r3 = 100
            goto L3f
        L3d:
            r3 = 53
        L3f:
            return r3
        L40:
            boolean r3 = r3[r4]
            if (r3 == 0) goto L47
            r3 = 57
            goto L49
        L47:
            r3 = 49
        L49:
            return r3
        L4a:
            int r0 = r4 + 2
            boolean r0 = r3[r0]
            if (r0 == 0) goto L6a
            int r0 = r4 + 1
            boolean r0 = r3[r0]
            if (r0 == 0) goto L60
            boolean r3 = r3[r4]
            if (r3 == 0) goto L5d
            r3 = 101(0x65, float:1.42E-43)
            goto L5f
        L5d:
            r3 = 54
        L5f:
            return r3
        L60:
            boolean r3 = r3[r4]
            if (r3 == 0) goto L67
            r3 = 97
            goto L69
        L67:
            r3 = 50
        L69:
            return r3
        L6a:
            int r0 = r4 + 1
            boolean r0 = r3[r0]
            if (r0 == 0) goto L7a
            boolean r3 = r3[r4]
            if (r3 == 0) goto L77
            r3 = 99
            goto L79
        L77:
            r3 = 52
        L79:
            return r3
        L7a:
            boolean r3 = r3[r4]
            if (r3 == 0) goto L81
            r3 = 56
            goto L83
        L81:
            r3 = 48
        L83:
            return r3
        L84:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "src.length-srcPos<4: src.length="
            r1.append(r2)
            int r3 = r3.length
            r1.append(r3)
            java.lang.String r3 = ", srcPos="
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        La4:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "src.length>8: src.length="
            r0.append(r1)
            int r3 = r3.length
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    public static int binaryToInt(boolean[] r4, int r5, int r6, int r7, int r8) {
            int r0 = r4.length
            if (r0 != 0) goto L5
            if (r5 == 0) goto L7
        L5:
            if (r8 != 0) goto L8
        L7:
            return r6
        L8:
            int r0 = r8 + (-1)
            int r0 = r0 + r7
            r1 = 32
            if (r0 >= r1) goto L23
            r0 = 0
        L10:
            if (r0 >= r8) goto L22
            int r1 = r0 + r7
            int r2 = r0 + r5
            boolean r2 = r4[r2]
            int r2 = r2 << r1
            r3 = 1
            int r1 = r3 << r1
            int r1 = ~r1
            r6 = r6 & r1
            r6 = r6 | r2
            int r0 = r0 + 1
            goto L10
        L22:
            return r6
        L23:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "nBools-1+dstPos is greater or equal to than 32"
            r4.<init>(r5)
            throw r4
    }

    public static long binaryToLong(boolean[] r7, int r8, long r9, int r11, int r12) {
            int r0 = r7.length
            if (r0 != 0) goto L5
            if (r8 == 0) goto L7
        L5:
            if (r12 != 0) goto L8
        L7:
            return r9
        L8:
            int r0 = r12 + (-1)
            int r0 = r0 + r11
            r1 = 64
            if (r0 >= r1) goto L2a
            r0 = 0
        L10:
            if (r0 >= r12) goto L29
            int r1 = r0 + r11
            int r2 = r0 + r8
            boolean r2 = r7[r2]
            r3 = 1
            if (r2 == 0) goto L1e
            r5 = r3
            goto L20
        L1e:
            r5 = 0
        L20:
            long r5 = r5 << r1
            long r1 = r3 << r1
            long r1 = ~r1
            long r9 = r9 & r1
            long r9 = r9 | r5
            int r0 = r0 + 1
            goto L10
        L29:
            return r9
        L2a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "nBools-1+dstPos is greater or equal to than 64"
            r7.<init>(r8)
            throw r7
    }

    public static short binaryToShort(boolean[] r4, int r5, short r6, int r7, int r8) {
            int r0 = r4.length
            if (r0 != 0) goto L5
            if (r5 == 0) goto L7
        L5:
            if (r8 != 0) goto L8
        L7:
            return r6
        L8:
            int r0 = r8 + (-1)
            int r0 = r0 + r7
            r1 = 16
            if (r0 >= r1) goto L24
            r0 = 0
        L10:
            if (r0 >= r8) goto L23
            int r1 = r0 + r7
            int r2 = r0 + r5
            boolean r2 = r4[r2]
            int r2 = r2 << r1
            r3 = 1
            int r1 = r3 << r1
            int r1 = ~r1
            r6 = r6 & r1
            r6 = r6 | r2
            short r6 = (short) r6
            int r0 = r0 + 1
            goto L10
        L23:
            return r6
        L24:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "nBools-1+dstPos is greater or equal to than 16"
            r4.<init>(r5)
            throw r4
    }

    public static int byteArrayToInt(byte[] r4, int r5, int r6, int r7, int r8) {
            int r0 = r4.length
            if (r0 != 0) goto L5
            if (r5 == 0) goto L7
        L5:
            if (r8 != 0) goto L8
        L7:
            return r6
        L8:
            int r0 = r8 + (-1)
            int r0 = r0 * 8
            int r0 = r0 + r7
            r1 = 32
            if (r0 >= r1) goto L28
            r0 = 0
        L12:
            if (r0 >= r8) goto L27
            int r1 = r0 * 8
            int r1 = r1 + r7
            int r2 = r0 + r5
            r2 = r4[r2]
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            int r2 = r2 << r1
            int r1 = r3 << r1
            int r1 = ~r1
            r6 = r6 & r1
            r6 = r6 | r2
            int r0 = r0 + 1
            goto L12
        L27:
            return r6
        L28:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "(nBytes-1)*8+dstPos is greater or equal to than 32"
            r4.<init>(r5)
            throw r4
    }

    public static long byteArrayToLong(byte[] r6, int r7, long r8, int r10, int r11) {
            int r0 = r6.length
            if (r0 != 0) goto L5
            if (r7 == 0) goto L7
        L5:
            if (r11 != 0) goto L8
        L7:
            return r8
        L8:
            int r0 = r11 + (-1)
            int r0 = r0 * 8
            int r0 = r0 + r10
            r1 = 64
            if (r0 >= r1) goto L28
            r0 = 0
        L12:
            if (r0 >= r11) goto L27
            int r1 = r0 * 8
            int r1 = r1 + r10
            int r2 = r0 + r7
            r2 = r6[r2]
            long r2 = (long) r2
            r4 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r4
            long r2 = r2 << r1
            long r4 = r4 << r1
            long r4 = ~r4
            long r8 = r8 & r4
            long r8 = r8 | r2
            int r0 = r0 + 1
            goto L12
        L27:
            return r8
        L28:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "(nBytes-1)*8+dstPos is greater or equal to than 64"
            r6.<init>(r7)
            throw r6
    }

    public static short byteArrayToShort(byte[] r4, int r5, short r6, int r7, int r8) {
            int r0 = r4.length
            if (r0 != 0) goto L5
            if (r5 == 0) goto L7
        L5:
            if (r8 != 0) goto L8
        L7:
            return r6
        L8:
            int r0 = r8 + (-1)
            int r0 = r0 * 8
            int r0 = r0 + r7
            r1 = 16
            if (r0 >= r1) goto L29
            r0 = 0
        L12:
            if (r0 >= r8) goto L28
            int r1 = r0 * 8
            int r1 = r1 + r7
            int r2 = r0 + r5
            r2 = r4[r2]
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            int r2 = r2 << r1
            int r1 = r3 << r1
            int r1 = ~r1
            r6 = r6 & r1
            r6 = r6 | r2
            short r6 = (short) r6
            int r0 = r0 + 1
            goto L12
        L28:
            return r6
        L29:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "(nBytes-1)*8+dstPos is greater or equal to than 16"
            r4.<init>(r5)
            throw r4
    }

    public static java.util.UUID byteArrayToUuid(byte[] r9, int r10) {
            int r0 = r9.length
            int r0 = r0 - r10
            r1 = 16
            if (r0 < r1) goto L23
            java.util.UUID r0 = new java.util.UUID
            r3 = 0
            r5 = 0
            r6 = 8
            r1 = r9
            r2 = r10
            long r1 = byteArrayToLong(r1, r2, r3, r5, r6)
            int r4 = r10 + 8
            r5 = 0
            r7 = 0
            r8 = 8
            r3 = r9
            long r9 = byteArrayToLong(r3, r4, r5, r7, r8)
            r0.<init>(r1, r9)
            return r0
        L23:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Need at least 16 bytes for UUID"
            r9.<init>(r10)
            throw r9
    }

    public static boolean[] byteToBinary(byte r5, int r6, boolean[] r7, int r8, int r9) {
            if (r9 != 0) goto L3
            return r7
        L3:
            int r0 = r9 + (-1)
            int r0 = r0 + r6
            r1 = 8
            if (r0 >= r1) goto L20
            r0 = 0
            r1 = 0
        Lc:
            if (r1 >= r9) goto L1f
            int r2 = r1 + r6
            int r3 = r8 + r1
            int r2 = r5 >> r2
            r4 = 1
            r2 = r2 & r4
            if (r2 == 0) goto L19
            goto L1a
        L19:
            r4 = 0
        L1a:
            r7[r3] = r4
            int r1 = r1 + 1
            goto Lc
        L1f:
            return r7
        L20:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "nBools-1+srcPos is greater or equal to than 8"
            r5.<init>(r6)
            throw r5
    }

    public static java.lang.String byteToHex(byte r4, int r5, java.lang.String r6, int r7, int r8) {
            if (r8 != 0) goto L3
            return r6
        L3:
            int r0 = r8 + (-1)
            int r0 = r0 * 4
            int r0 = r0 + r5
            r1 = 8
            if (r0 >= r1) goto L3c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r6)
            int r6 = r0.length()
            r1 = 0
        L16:
            if (r1 >= r8) goto L37
            int r2 = r1 * 4
            int r2 = r2 + r5
            int r2 = r4 >> r2
            r2 = r2 & 15
            int r3 = r7 + r1
            if (r3 != r6) goto L2d
            int r6 = r6 + 1
            char r2 = intToHexDigit(r2)
            r0.append(r2)
            goto L34
        L2d:
            char r2 = intToHexDigit(r2)
            r0.setCharAt(r3, r2)
        L34:
            int r1 = r1 + 1
            goto L16
        L37:
            java.lang.String r4 = r0.toString()
            return r4
        L3c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "(nHexs-1)*4+srcPos is greater or equal to than 8"
            r4.<init>(r5)
            throw r4
    }

    public static boolean[] hexDigitMsb0ToBinary(char r3) {
            switch(r3) {
                case 48: goto Lac;
                case 49: goto La3;
                case 50: goto L9a;
                case 51: goto L91;
                case 52: goto L88;
                case 53: goto L7f;
                case 54: goto L76;
                case 55: goto L6d;
                case 56: goto L64;
                case 57: goto L5b;
                default: goto L3;
            }
        L3:
            switch(r3) {
                case 65: goto L52;
                case 66: goto L49;
                case 67: goto L40;
                case 68: goto L37;
                case 69: goto L2e;
                case 70: goto L25;
                default: goto L6;
            }
        L6:
            switch(r3) {
                case 97: goto L52;
                case 98: goto L49;
                case 99: goto L40;
                case 100: goto L37;
                case 101: goto L2e;
                case 102: goto L25;
                default: goto L9;
            }
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot interpret '"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "' as a hexadecimal digit"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L25:
            boolean[] r3 = org.apache.commons.lang3.Conversion.TTTT
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L2e:
            boolean[] r3 = org.apache.commons.lang3.Conversion.TTTF
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L37:
            boolean[] r3 = org.apache.commons.lang3.Conversion.TTFT
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L40:
            boolean[] r3 = org.apache.commons.lang3.Conversion.TTFF
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L49:
            boolean[] r3 = org.apache.commons.lang3.Conversion.TFTT
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L52:
            boolean[] r3 = org.apache.commons.lang3.Conversion.TFTF
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L5b:
            boolean[] r3 = org.apache.commons.lang3.Conversion.TFFT
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L64:
            boolean[] r3 = org.apache.commons.lang3.Conversion.TFFF
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L6d:
            boolean[] r3 = org.apache.commons.lang3.Conversion.FTTT
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L76:
            boolean[] r3 = org.apache.commons.lang3.Conversion.FTTF
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L7f:
            boolean[] r3 = org.apache.commons.lang3.Conversion.FTFT
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L88:
            boolean[] r3 = org.apache.commons.lang3.Conversion.FTFF
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L91:
            boolean[] r3 = org.apache.commons.lang3.Conversion.FFTT
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L9a:
            boolean[] r3 = org.apache.commons.lang3.Conversion.FFTF
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        La3:
            boolean[] r3 = org.apache.commons.lang3.Conversion.FFFT
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        Lac:
            boolean[] r3 = org.apache.commons.lang3.Conversion.FFFF
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
    }

    public static int hexDigitMsb0ToInt(char r3) {
            switch(r3) {
                case 48: goto L4b;
                case 49: goto L48;
                case 50: goto L46;
                case 51: goto L43;
                case 52: goto L41;
                case 53: goto L3e;
                case 54: goto L3c;
                case 55: goto L39;
                case 56: goto L37;
                case 57: goto L34;
                default: goto L3;
            }
        L3:
            switch(r3) {
                case 65: goto L32;
                case 66: goto L2f;
                case 67: goto L2d;
                case 68: goto L2a;
                case 69: goto L28;
                case 70: goto L25;
                default: goto L6;
            }
        L6:
            switch(r3) {
                case 97: goto L32;
                case 98: goto L2f;
                case 99: goto L2d;
                case 100: goto L2a;
                case 101: goto L28;
                case 102: goto L25;
                default: goto L9;
            }
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot interpret '"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "' as a hexadecimal digit"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L25:
            r3 = 15
            return r3
        L28:
            r3 = 7
            return r3
        L2a:
            r3 = 11
            return r3
        L2d:
            r3 = 3
            return r3
        L2f:
            r3 = 13
            return r3
        L32:
            r3 = 5
            return r3
        L34:
            r3 = 9
            return r3
        L37:
            r3 = 1
            return r3
        L39:
            r3 = 14
            return r3
        L3c:
            r3 = 6
            return r3
        L3e:
            r3 = 10
            return r3
        L41:
            r3 = 2
            return r3
        L43:
            r3 = 12
            return r3
        L46:
            r3 = 4
            return r3
        L48:
            r3 = 8
            return r3
        L4b:
            r3 = 0
            return r3
    }

    public static boolean[] hexDigitToBinary(char r3) {
            switch(r3) {
                case 48: goto Lac;
                case 49: goto La3;
                case 50: goto L9a;
                case 51: goto L91;
                case 52: goto L88;
                case 53: goto L7f;
                case 54: goto L76;
                case 55: goto L6d;
                case 56: goto L64;
                case 57: goto L5b;
                default: goto L3;
            }
        L3:
            switch(r3) {
                case 65: goto L52;
                case 66: goto L49;
                case 67: goto L40;
                case 68: goto L37;
                case 69: goto L2e;
                case 70: goto L25;
                default: goto L6;
            }
        L6:
            switch(r3) {
                case 97: goto L52;
                case 98: goto L49;
                case 99: goto L40;
                case 100: goto L37;
                case 101: goto L2e;
                case 102: goto L25;
                default: goto L9;
            }
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot interpret '"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "' as a hexadecimal digit"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L25:
            boolean[] r3 = org.apache.commons.lang3.Conversion.TTTT
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L2e:
            boolean[] r3 = org.apache.commons.lang3.Conversion.FTTT
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L37:
            boolean[] r3 = org.apache.commons.lang3.Conversion.TFTT
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L40:
            boolean[] r3 = org.apache.commons.lang3.Conversion.FFTT
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L49:
            boolean[] r3 = org.apache.commons.lang3.Conversion.TTFT
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L52:
            boolean[] r3 = org.apache.commons.lang3.Conversion.FTFT
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L5b:
            boolean[] r3 = org.apache.commons.lang3.Conversion.TFFT
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L64:
            boolean[] r3 = org.apache.commons.lang3.Conversion.FFFT
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L6d:
            boolean[] r3 = org.apache.commons.lang3.Conversion.TTTF
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L76:
            boolean[] r3 = org.apache.commons.lang3.Conversion.FTTF
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L7f:
            boolean[] r3 = org.apache.commons.lang3.Conversion.TFTF
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L88:
            boolean[] r3 = org.apache.commons.lang3.Conversion.FFTF
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L91:
            boolean[] r3 = org.apache.commons.lang3.Conversion.TTFF
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L9a:
            boolean[] r3 = org.apache.commons.lang3.Conversion.FTFF
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        La3:
            boolean[] r3 = org.apache.commons.lang3.Conversion.TFFF
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        Lac:
            boolean[] r3 = org.apache.commons.lang3.Conversion.FFFF
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
    }

    public static int hexDigitToInt(char r3) {
            r0 = 16
            int r0 = java.lang.Character.digit(r3, r0)
            if (r0 < 0) goto L9
            return r0
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot interpret '"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "' as a hexadecimal digit"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static byte hexToByte(java.lang.String r4, int r5, byte r6, int r7, int r8) {
            if (r8 != 0) goto L3
            return r6
        L3:
            int r0 = r8 + (-1)
            int r0 = r0 * 4
            int r0 = r0 + r7
            r1 = 8
            if (r0 >= r1) goto L2a
            r0 = 0
        Ld:
            if (r0 >= r8) goto L29
            int r1 = r0 * 4
            int r1 = r1 + r7
            int r2 = r0 + r5
            char r2 = r4.charAt(r2)
            int r2 = hexDigitToInt(r2)
            r3 = 15
            r2 = r2 & r3
            int r2 = r2 << r1
            int r1 = r3 << r1
            int r1 = ~r1
            r6 = r6 & r1
            r6 = r6 | r2
            byte r6 = (byte) r6
            int r0 = r0 + 1
            goto Ld
        L29:
            return r6
        L2a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "(nHexs-1)*4+dstPos is greater or equal to than 8"
            r4.<init>(r5)
            throw r4
    }

    public static int hexToInt(java.lang.String r4, int r5, int r6, int r7, int r8) {
            if (r8 != 0) goto L3
            return r6
        L3:
            int r0 = r8 + (-1)
            int r0 = r0 * 4
            int r0 = r0 + r7
            r1 = 32
            if (r0 >= r1) goto L29
            r0 = 0
        Ld:
            if (r0 >= r8) goto L28
            int r1 = r0 * 4
            int r1 = r1 + r7
            int r2 = r0 + r5
            char r2 = r4.charAt(r2)
            int r2 = hexDigitToInt(r2)
            r3 = 15
            r2 = r2 & r3
            int r2 = r2 << r1
            int r1 = r3 << r1
            int r1 = ~r1
            r6 = r6 & r1
            r6 = r6 | r2
            int r0 = r0 + 1
            goto Ld
        L28:
            return r6
        L29:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "(nHexs-1)*4+dstPos is greater or equal to than 32"
            r4.<init>(r5)
            throw r4
    }

    public static long hexToLong(java.lang.String r6, int r7, long r8, int r10, int r11) {
            if (r11 != 0) goto L3
            return r8
        L3:
            int r0 = r11 + (-1)
            int r0 = r0 * 4
            int r0 = r0 + r10
            r1 = 64
            if (r0 >= r1) goto L29
            r0 = 0
        Ld:
            if (r0 >= r11) goto L28
            int r1 = r0 * 4
            int r1 = r1 + r10
            int r2 = r0 + r7
            char r2 = r6.charAt(r2)
            int r2 = hexDigitToInt(r2)
            long r2 = (long) r2
            r4 = 15
            long r2 = r2 & r4
            long r2 = r2 << r1
            long r4 = r4 << r1
            long r4 = ~r4
            long r8 = r8 & r4
            long r8 = r8 | r2
            int r0 = r0 + 1
            goto Ld
        L28:
            return r8
        L29:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "(nHexs-1)*4+dstPos is greater or equal to than 64"
            r6.<init>(r7)
            throw r6
    }

    public static short hexToShort(java.lang.String r4, int r5, short r6, int r7, int r8) {
            if (r8 != 0) goto L3
            return r6
        L3:
            int r0 = r8 + (-1)
            int r0 = r0 * 4
            int r0 = r0 + r7
            r1 = 16
            if (r0 >= r1) goto L2a
            r0 = 0
        Ld:
            if (r0 >= r8) goto L29
            int r1 = r0 * 4
            int r1 = r1 + r7
            int r2 = r0 + r5
            char r2 = r4.charAt(r2)
            int r2 = hexDigitToInt(r2)
            r3 = 15
            r2 = r2 & r3
            int r2 = r2 << r1
            int r1 = r3 << r1
            int r1 = ~r1
            r6 = r6 & r1
            r6 = r6 | r2
            short r6 = (short) r6
            int r0 = r0 + 1
            goto Ld
        L29:
            return r6
        L2a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "(nHexs-1)*4+dstPos is greater or equal to than 16"
            r4.<init>(r5)
            throw r4
    }

    public static long intArrayToLong(int[] r6, int r7, long r8, int r10, int r11) {
            int r0 = r6.length
            if (r0 != 0) goto L5
            if (r7 == 0) goto L7
        L5:
            if (r11 != 0) goto L8
        L7:
            return r8
        L8:
            int r0 = r11 + (-1)
            int r0 = r0 * 32
            int r0 = r0 + r10
            r1 = 64
            if (r0 >= r1) goto L2b
            r0 = 0
        L12:
            if (r0 >= r11) goto L2a
            int r1 = r0 * 32
            int r1 = r1 + r10
            int r2 = r0 + r7
            r2 = r6[r2]
            long r2 = (long) r2
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r2 = r2 << r1
            long r4 = r4 << r1
            long r4 = ~r4
            long r8 = r8 & r4
            long r8 = r8 | r2
            int r0 = r0 + 1
            goto L12
        L2a:
            return r8
        L2b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "(nInts-1)*32+dstPos is greater or equal to than 64"
            r6.<init>(r7)
            throw r6
    }

    public static boolean[] intToBinary(int r5, int r6, boolean[] r7, int r8, int r9) {
            if (r9 != 0) goto L3
            return r7
        L3:
            int r0 = r9 + (-1)
            int r0 = r0 + r6
            r1 = 32
            if (r0 >= r1) goto L20
            r0 = 0
            r1 = 0
        Lc:
            if (r1 >= r9) goto L1f
            int r2 = r1 + r6
            int r3 = r8 + r1
            int r2 = r5 >> r2
            r4 = 1
            r2 = r2 & r4
            if (r2 == 0) goto L19
            goto L1a
        L19:
            r4 = 0
        L1a:
            r7[r3] = r4
            int r1 = r1 + 1
            goto Lc
        L1f:
            return r7
        L20:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "nBools-1+srcPos is greater or equal to than 32"
            r5.<init>(r6)
            throw r5
    }

    public static byte[] intToByteArray(int r3, int r4, byte[] r5, int r6, int r7) {
            if (r7 != 0) goto L3
            return r5
        L3:
            int r0 = r7 + (-1)
            int r0 = r0 * 8
            int r0 = r0 + r4
            r1 = 32
            if (r0 >= r1) goto L1f
            r0 = 0
        Ld:
            if (r0 >= r7) goto L1e
            int r1 = r0 * 8
            int r1 = r1 + r4
            int r2 = r6 + r0
            int r1 = r3 >> r1
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r5[r2] = r1
            int r0 = r0 + 1
            goto Ld
        L1e:
            return r5
        L1f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "(nBytes-1)*8+srcPos is greater or equal to than 32"
            r3.<init>(r4)
            throw r3
    }

    public static java.lang.String intToHex(int r4, int r5, java.lang.String r6, int r7, int r8) {
            if (r8 != 0) goto L3
            return r6
        L3:
            int r0 = r8 + (-1)
            int r0 = r0 * 4
            int r0 = r0 + r5
            r1 = 32
            if (r0 >= r1) goto L3c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r6)
            int r6 = r0.length()
            r1 = 0
        L16:
            if (r1 >= r8) goto L37
            int r2 = r1 * 4
            int r2 = r2 + r5
            int r2 = r4 >> r2
            r2 = r2 & 15
            int r3 = r7 + r1
            if (r3 != r6) goto L2d
            int r6 = r6 + 1
            char r2 = intToHexDigit(r2)
            r0.append(r2)
            goto L34
        L2d:
            char r2 = intToHexDigit(r2)
            r0.setCharAt(r3, r2)
        L34:
            int r1 = r1 + 1
            goto L16
        L37:
            java.lang.String r4 = r0.toString()
            return r4
        L3c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "(nHexs-1)*4+srcPos is greater or equal to than 32"
            r4.<init>(r5)
            throw r4
    }

    public static char intToHexDigit(int r3) {
            r0 = 16
            char r0 = java.lang.Character.forDigit(r3, r0)
            if (r0 == 0) goto L9
            return r0
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "nibble value not between 0 and 15: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static char intToHexDigitMsb0(int r3) {
            switch(r3) {
                case 0: goto L47;
                case 1: goto L44;
                case 2: goto L41;
                case 3: goto L3e;
                case 4: goto L3b;
                case 5: goto L38;
                case 6: goto L35;
                case 7: goto L32;
                case 8: goto L2f;
                case 9: goto L2c;
                case 10: goto L29;
                case 11: goto L26;
                case 12: goto L23;
                case 13: goto L20;
                case 14: goto L1d;
                case 15: goto L1a;
                default: goto L3;
            }
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "nibble value not between 0 and 15: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L1a:
            r3 = 102(0x66, float:1.43E-43)
            return r3
        L1d:
            r3 = 55
            return r3
        L20:
            r3 = 98
            return r3
        L23:
            r3 = 51
            return r3
        L26:
            r3 = 100
            return r3
        L29:
            r3 = 53
            return r3
        L2c:
            r3 = 57
            return r3
        L2f:
            r3 = 49
            return r3
        L32:
            r3 = 101(0x65, float:1.42E-43)
            return r3
        L35:
            r3 = 54
            return r3
        L38:
            r3 = 97
            return r3
        L3b:
            r3 = 50
            return r3
        L3e:
            r3 = 99
            return r3
        L41:
            r3 = 52
            return r3
        L44:
            r3 = 56
            return r3
        L47:
            r3 = 48
            return r3
    }

    public static short[] intToShortArray(int r4, int r5, short[] r6, int r7, int r8) {
            if (r8 != 0) goto L3
            return r6
        L3:
            int r0 = r8 + (-1)
            int r0 = r0 * 16
            int r0 = r0 + r5
            r1 = 32
            if (r0 >= r1) goto L21
            r0 = 0
        Ld:
            if (r0 >= r8) goto L20
            int r1 = r0 * 16
            int r1 = r1 + r5
            int r2 = r7 + r0
            r3 = 65535(0xffff, float:9.1834E-41)
            int r1 = r4 >> r1
            r1 = r1 & r3
            short r1 = (short) r1
            r6[r2] = r1
            int r0 = r0 + 1
            goto Ld
        L20:
            return r6
        L21:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "(nShorts-1)*16+srcPos is greater or equal to than 32"
            r4.<init>(r5)
            throw r4
    }

    public static boolean[] longToBinary(long r8, int r10, boolean[] r11, int r12, int r13) {
            if (r13 != 0) goto L3
            return r11
        L3:
            int r0 = r13 + (-1)
            int r0 = r0 + r10
            r1 = 64
            if (r0 >= r1) goto L26
            r0 = 0
            r1 = 0
        Lc:
            if (r1 >= r13) goto L25
            int r2 = r1 + r10
            int r3 = r12 + r1
            r4 = 1
            long r6 = r8 >> r2
            long r4 = r4 & r6
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L1f
            r2 = 1
            goto L20
        L1f:
            r2 = 0
        L20:
            r11[r3] = r2
            int r1 = r1 + 1
            goto Lc
        L25:
            return r11
        L26:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "nBools-1+srcPos is greater or equal to than 64"
            r8.<init>(r9)
            throw r8
    }

    public static byte[] longToByteArray(long r7, int r9, byte[] r10, int r11, int r12) {
            if (r12 != 0) goto L3
            return r10
        L3:
            int r0 = r12 + (-1)
            int r0 = r0 * 8
            int r0 = r0 + r9
            r1 = 64
            if (r0 >= r1) goto L21
            r0 = 0
        Ld:
            if (r0 >= r12) goto L20
            int r1 = r0 * 8
            int r1 = r1 + r9
            int r2 = r11 + r0
            r3 = 255(0xff, double:1.26E-321)
            long r5 = r7 >> r1
            long r3 = r3 & r5
            int r1 = (int) r3
            byte r1 = (byte) r1
            r10[r2] = r1
            int r0 = r0 + 1
            goto Ld
        L20:
            return r10
        L21:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "(nBytes-1)*8+srcPos is greater or equal to than 64"
            r7.<init>(r8)
            throw r7
    }

    public static java.lang.String longToHex(long r7, int r9, java.lang.String r10, int r11, int r12) {
            if (r12 != 0) goto L3
            return r10
        L3:
            int r0 = r12 + (-1)
            int r0 = r0 * 4
            int r0 = r0 + r9
            r1 = 64
            if (r0 >= r1) goto L3f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r10)
            int r10 = r0.length()
            r1 = 0
        L16:
            if (r1 >= r12) goto L3a
            int r2 = r1 * 4
            int r2 = r2 + r9
            r3 = 15
            long r5 = r7 >> r2
            long r2 = r5 & r3
            int r3 = (int) r2
            int r2 = r11 + r1
            if (r2 != r10) goto L30
            int r10 = r10 + 1
            char r2 = intToHexDigit(r3)
            r0.append(r2)
            goto L37
        L30:
            char r3 = intToHexDigit(r3)
            r0.setCharAt(r2, r3)
        L37:
            int r1 = r1 + 1
            goto L16
        L3a:
            java.lang.String r7 = r0.toString()
            return r7
        L3f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "(nHexs-1)*4+srcPos is greater or equal to than 64"
            r7.<init>(r8)
            throw r7
    }

    public static int[] longToIntArray(long r7, int r9, int[] r10, int r11, int r12) {
            if (r12 != 0) goto L3
            return r10
        L3:
            int r0 = r12 + (-1)
            int r0 = r0 * 32
            int r0 = r0 + r9
            r1 = 64
            if (r0 >= r1) goto L20
            r0 = 0
        Ld:
            if (r0 >= r12) goto L1f
            int r1 = r0 * 32
            int r1 = r1 + r9
            int r2 = r11 + r0
            r3 = -1
            long r5 = r7 >> r1
            long r3 = r3 & r5
            int r1 = (int) r3
            r10[r2] = r1
            int r0 = r0 + 1
            goto Ld
        L1f:
            return r10
        L20:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "(nInts-1)*32+srcPos is greater or equal to than 64"
            r7.<init>(r8)
            throw r7
    }

    public static short[] longToShortArray(long r7, int r9, short[] r10, int r11, int r12) {
            if (r12 != 0) goto L3
            return r10
        L3:
            int r0 = r12 + (-1)
            int r0 = r0 * 16
            int r0 = r0 + r9
            r1 = 64
            if (r0 >= r1) goto L22
            r0 = 0
        Ld:
            if (r0 >= r12) goto L21
            int r1 = r0 * 16
            int r1 = r1 + r9
            int r2 = r11 + r0
            r3 = 65535(0xffff, double:3.23786E-319)
            long r5 = r7 >> r1
            long r3 = r3 & r5
            int r1 = (int) r3
            short r1 = (short) r1
            r10[r2] = r1
            int r0 = r0 + 1
            goto Ld
        L21:
            return r10
        L22:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "(nShorts-1)*16+srcPos is greater or equal to than 64"
            r7.<init>(r8)
            throw r7
    }

    public static int shortArrayToInt(short[] r4, int r5, int r6, int r7, int r8) {
            int r0 = r4.length
            if (r0 != 0) goto L5
            if (r5 == 0) goto L7
        L5:
            if (r8 != 0) goto L8
        L7:
            return r6
        L8:
            int r0 = r8 + (-1)
            int r0 = r0 * 16
            int r0 = r0 + r7
            r1 = 32
            if (r0 >= r1) goto L29
            r0 = 0
        L12:
            if (r0 >= r8) goto L28
            int r1 = r0 * 16
            int r1 = r1 + r7
            int r2 = r0 + r5
            short r2 = r4[r2]
            r3 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r3
            int r2 = r2 << r1
            int r1 = r3 << r1
            int r1 = ~r1
            r6 = r6 & r1
            r6 = r6 | r2
            int r0 = r0 + 1
            goto L12
        L28:
            return r6
        L29:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "(nShorts-1)*16+dstPos is greater or equal to than 32"
            r4.<init>(r5)
            throw r4
    }

    public static long shortArrayToLong(short[] r6, int r7, long r8, int r10, int r11) {
            int r0 = r6.length
            if (r0 != 0) goto L5
            if (r7 == 0) goto L7
        L5:
            if (r11 != 0) goto L8
        L7:
            return r8
        L8:
            int r0 = r11 + (-1)
            int r0 = r0 * 16
            int r0 = r0 + r10
            r1 = 64
            if (r0 >= r1) goto L29
            r0 = 0
        L12:
            if (r0 >= r11) goto L28
            int r1 = r0 * 16
            int r1 = r1 + r10
            int r2 = r0 + r7
            short r2 = r6[r2]
            long r2 = (long) r2
            r4 = 65535(0xffff, double:3.23786E-319)
            long r2 = r2 & r4
            long r2 = r2 << r1
            long r4 = r4 << r1
            long r4 = ~r4
            long r8 = r8 & r4
            long r8 = r8 | r2
            int r0 = r0 + 1
            goto L12
        L28:
            return r8
        L29:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "(nShorts-1)*16+dstPos is greater or equal to than 64"
            r6.<init>(r7)
            throw r6
    }

    public static boolean[] shortToBinary(short r5, int r6, boolean[] r7, int r8, int r9) {
            if (r9 != 0) goto L3
            return r7
        L3:
            int r0 = r9 + (-1)
            int r0 = r0 + r6
            r1 = 16
            if (r0 >= r1) goto L20
            r0 = 0
            r1 = 0
        Lc:
            if (r1 >= r9) goto L1f
            int r2 = r1 + r6
            int r3 = r8 + r1
            int r2 = r5 >> r2
            r4 = 1
            r2 = r2 & r4
            if (r2 == 0) goto L19
            goto L1a
        L19:
            r4 = 0
        L1a:
            r7[r3] = r4
            int r1 = r1 + 1
            goto Lc
        L1f:
            return r7
        L20:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "nBools-1+srcPos is greater or equal to than 16"
            r5.<init>(r6)
            throw r5
    }

    public static byte[] shortToByteArray(short r3, int r4, byte[] r5, int r6, int r7) {
            if (r7 != 0) goto L3
            return r5
        L3:
            int r0 = r7 + (-1)
            int r0 = r0 * 8
            int r0 = r0 + r4
            r1 = 16
            if (r0 >= r1) goto L1f
            r0 = 0
        Ld:
            if (r0 >= r7) goto L1e
            int r1 = r0 * 8
            int r1 = r1 + r4
            int r2 = r6 + r0
            int r1 = r3 >> r1
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r5[r2] = r1
            int r0 = r0 + 1
            goto Ld
        L1e:
            return r5
        L1f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "(nBytes-1)*8+srcPos is greater or equal to than 16"
            r3.<init>(r4)
            throw r3
    }

    public static java.lang.String shortToHex(short r4, int r5, java.lang.String r6, int r7, int r8) {
            if (r8 != 0) goto L3
            return r6
        L3:
            int r0 = r8 + (-1)
            int r0 = r0 * 4
            int r0 = r0 + r5
            r1 = 16
            if (r0 >= r1) goto L3c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r6)
            int r6 = r0.length()
            r1 = 0
        L16:
            if (r1 >= r8) goto L37
            int r2 = r1 * 4
            int r2 = r2 + r5
            int r2 = r4 >> r2
            r2 = r2 & 15
            int r3 = r7 + r1
            if (r3 != r6) goto L2d
            int r6 = r6 + 1
            char r2 = intToHexDigit(r2)
            r0.append(r2)
            goto L34
        L2d:
            char r2 = intToHexDigit(r2)
            r0.setCharAt(r3, r2)
        L34:
            int r1 = r1 + 1
            goto L16
        L37:
            java.lang.String r4 = r0.toString()
            return r4
        L3c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "(nHexs-1)*4+srcPos is greater or equal to than 16"
            r4.<init>(r5)
            throw r4
    }

    public static byte[] uuidToByteArray(java.util.UUID r7, byte[] r8, int r9, int r10) {
            if (r10 != 0) goto L3
            return r8
        L3:
            r0 = 16
            if (r10 > r0) goto L29
            long r0 = r7.getMostSignificantBits()
            r2 = 0
            r6 = 8
            if (r10 <= r6) goto L13
            r5 = 8
            goto L14
        L13:
            r5 = r10
        L14:
            r3 = r8
            r4 = r9
            longToByteArray(r0, r2, r3, r4, r5)
            if (r10 < r6) goto L28
            long r0 = r7.getLeastSignificantBits()
            r2 = 0
            int r4 = r9 + 8
            int r5 = r10 + (-8)
            r3 = r8
            longToByteArray(r0, r2, r3, r4, r5)
        L28:
            return r8
        L29:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "nBytes is greater than 16"
            r0.<init>(r1)
            throw r0
    }
}
