package org.apache.commons.lang3.math;

/* loaded from: classes2.dex */
public class NumberUtils {
    public static final java.lang.Byte BYTE_MINUS_ONE = null;
    public static final java.lang.Byte BYTE_ONE = null;
    public static final java.lang.Byte BYTE_ZERO = null;
    public static final java.lang.Double DOUBLE_MINUS_ONE = null;
    public static final java.lang.Double DOUBLE_ONE = null;
    public static final java.lang.Double DOUBLE_ZERO = null;
    public static final java.lang.Float FLOAT_MINUS_ONE = null;
    public static final java.lang.Float FLOAT_ONE = null;
    public static final java.lang.Float FLOAT_ZERO = null;
    public static final java.lang.Integer INTEGER_MINUS_ONE = null;
    public static final java.lang.Integer INTEGER_ONE = null;
    public static final java.lang.Integer INTEGER_TWO = null;
    public static final java.lang.Integer INTEGER_ZERO = null;
    public static final java.lang.Long LONG_MINUS_ONE = null;
    public static final java.lang.Long LONG_ONE = null;
    public static final java.lang.Long LONG_ZERO = null;
    public static final java.lang.Short SHORT_MINUS_ONE = null;
    public static final java.lang.Short SHORT_ONE = null;
    public static final java.lang.Short SHORT_ZERO = null;

    static {
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            org.apache.commons.lang3.math.NumberUtils.LONG_ZERO = r0
            r0 = 1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            org.apache.commons.lang3.math.NumberUtils.LONG_ONE = r0
            r0 = -1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            org.apache.commons.lang3.math.NumberUtils.LONG_MINUS_ONE = r0
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            org.apache.commons.lang3.math.NumberUtils.INTEGER_ZERO = r1
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            org.apache.commons.lang3.math.NumberUtils.INTEGER_ONE = r2
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            org.apache.commons.lang3.math.NumberUtils.INTEGER_TWO = r2
            r2 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            org.apache.commons.lang3.math.NumberUtils.INTEGER_MINUS_ONE = r3
            java.lang.Short r3 = java.lang.Short.valueOf(r0)
            org.apache.commons.lang3.math.NumberUtils.SHORT_ZERO = r3
            java.lang.Short r3 = java.lang.Short.valueOf(r1)
            org.apache.commons.lang3.math.NumberUtils.SHORT_ONE = r3
            java.lang.Short r3 = java.lang.Short.valueOf(r2)
            org.apache.commons.lang3.math.NumberUtils.SHORT_MINUS_ONE = r3
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            org.apache.commons.lang3.math.NumberUtils.BYTE_ZERO = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r1)
            org.apache.commons.lang3.math.NumberUtils.BYTE_ONE = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r2)
            org.apache.commons.lang3.math.NumberUtils.BYTE_MINUS_ONE = r0
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            org.apache.commons.lang3.math.NumberUtils.DOUBLE_ZERO = r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            org.apache.commons.lang3.math.NumberUtils.DOUBLE_ONE = r0
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            org.apache.commons.lang3.math.NumberUtils.DOUBLE_MINUS_ONE = r0
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            org.apache.commons.lang3.math.NumberUtils.FLOAT_ZERO = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            org.apache.commons.lang3.math.NumberUtils.FLOAT_ONE = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            org.apache.commons.lang3.math.NumberUtils.FLOAT_MINUS_ONE = r0
            return
    }

    public NumberUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int compare(byte r0, byte r1) {
            int r0 = r0 - r1
            return r0
    }

    public static int compare(int r0, int r1) {
            if (r0 != r1) goto L4
            r0 = 0
            return r0
        L4:
            if (r0 >= r1) goto L8
            r0 = -1
            goto L9
        L8:
            r0 = 1
        L9:
            return r0
    }

    public static int compare(long r1, long r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            if (r0 >= 0) goto La
            r1 = -1
            goto Lb
        La:
            r1 = 1
        Lb:
            return r1
    }

    public static int compare(short r0, short r1) {
            if (r0 != r1) goto L4
            r0 = 0
            return r0
        L4:
            if (r0 >= r1) goto L8
            r0 = -1
            goto L9
        L8:
            r0 = 1
        L9:
            return r0
    }

    public static java.math.BigDecimal createBigDecimal(java.lang.String r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            boolean r0 = org.apache.commons.lang3.StringUtils.isBlank(r2)
            if (r0 != 0) goto L33
            java.lang.String r0 = r2.trim()
            java.lang.String r1 = "--"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L1c
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r2)
            return r0
        L1c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = " is not a valid number."
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
        L33:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r0 = "A blank string is not a valid number"
            r2.<init>(r0)
            throw r2
    }

    public static java.math.BigInteger createBigInteger(java.lang.String r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            r0 = 10
            java.lang.String r1 = "-"
            boolean r1 = r4.startsWith(r1)
            java.lang.String r2 = "0x"
            boolean r2 = r4.startsWith(r2, r1)
            r3 = 16
            if (r2 != 0) goto L44
            java.lang.String r2 = "0X"
            boolean r2 = r4.startsWith(r2, r1)
            if (r2 == 0) goto L1f
            goto L44
        L1f:
            java.lang.String r2 = "#"
            boolean r2 = r4.startsWith(r2, r1)
            if (r2 == 0) goto L2a
            int r0 = r1 + 1
            goto L46
        L2a:
            java.lang.String r2 = "0"
            boolean r2 = r4.startsWith(r2, r1)
            if (r2 == 0) goto L40
            int r2 = r4.length()
            int r3 = r1 + 1
            if (r2 <= r3) goto L40
            r0 = 8
            r0 = r3
            r3 = 8
            goto L46
        L40:
            r0 = r1
            r3 = 10
            goto L46
        L44:
            int r0 = r1 + 2
        L46:
            java.math.BigInteger r2 = new java.math.BigInteger
            java.lang.String r4 = r4.substring(r0)
            r2.<init>(r4, r3)
            if (r1 == 0) goto L55
            java.math.BigInteger r2 = r2.negate()
        L55:
            return r2
    }

    public static java.lang.Double createDouble(java.lang.String r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    public static java.lang.Float createFloat(java.lang.String r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }

    public static java.lang.Integer createInteger(java.lang.String r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.Integer r0 = java.lang.Integer.decode(r0)
            return r0
    }

    public static java.lang.Long createLong(java.lang.String r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.Long r0 = java.lang.Long.decode(r0)
            return r0
    }

    public static java.lang.Number createNumber(java.lang.String r14) {
            r0 = 0
            if (r14 != 0) goto L4
            return r0
        L4:
            boolean r1 = org.apache.commons.lang3.StringUtils.isBlank(r14)
            if (r1 != 0) goto L240
            r1 = 6
            java.lang.String r2 = "0x"
            java.lang.String r3 = "0X"
            java.lang.String r4 = "-0x"
            java.lang.String r5 = "-0X"
            java.lang.String r6 = "#"
            java.lang.String r7 = "-#"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7}
            r3 = 0
            r4 = 0
        L1d:
            if (r4 >= r1) goto L30
            r5 = r2[r4]
            boolean r6 = r14.startsWith(r5)
            if (r6 == 0) goto L2d
            int r1 = r5.length()
            int r1 = r1 + r3
            goto L31
        L2d:
            int r4 = r4 + 1
            goto L1d
        L30:
            r1 = 0
        L31:
            if (r1 <= 0) goto L6f
            r0 = r1
        L34:
            int r2 = r14.length()
            if (r1 >= r2) goto L47
            char r3 = r14.charAt(r1)
            r2 = 48
            if (r3 != r2) goto L47
            int r0 = r0 + 1
            int r1 = r1 + 1
            goto L34
        L47:
            int r1 = r14.length()
            int r1 = r1 - r0
            r0 = 16
            if (r1 > r0) goto L6a
            r2 = 55
            if (r1 != r0) goto L57
            if (r3 <= r2) goto L57
            goto L6a
        L57:
            r0 = 8
            if (r1 > r0) goto L65
            if (r1 != r0) goto L60
            if (r3 <= r2) goto L60
            goto L65
        L60:
            java.lang.Integer r14 = createInteger(r14)
            return r14
        L65:
            java.lang.Long r14 = createLong(r14)
            return r14
        L6a:
            java.math.BigInteger r14 = createBigInteger(r14)
            return r14
        L6f:
            int r1 = r14.length()
            r2 = 1
            int r1 = r1 - r2
            char r1 = r14.charAt(r1)
            r4 = 46
            int r5 = r14.indexOf(r4)
            r6 = 101(0x65, float:1.42E-43)
            int r6 = r14.indexOf(r6)
            r7 = 69
            int r7 = r14.indexOf(r7)
            int r6 = r6 + r7
            int r6 = r6 + r2
            java.lang.String r7 = " is not a valid number."
            r8 = -1
            if (r5 <= r8) goto Lc3
            if (r6 <= r8) goto Lb8
            if (r6 < r5) goto La3
            int r9 = r14.length()
            if (r6 > r9) goto La3
            int r9 = r5 + 1
            java.lang.String r9 = r14.substring(r9, r6)
            goto Lbe
        La3:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            r1.append(r7)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        Lb8:
            int r9 = r5 + 1
            java.lang.String r9 = r14.substring(r9)
        Lbe:
            java.lang.String r5 = getMantissa(r14, r5)
            goto Lea
        Lc3:
            if (r6 <= r8) goto Le5
            int r5 = r14.length()
            if (r6 > r5) goto Ld0
            java.lang.String r5 = getMantissa(r14, r6)
            goto Le9
        Ld0:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            r1.append(r7)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        Le5:
            java.lang.String r5 = getMantissa(r14)
        Le9:
            r9 = r0
        Lea:
            boolean r10 = java.lang.Character.isDigit(r1)
            r11 = 0
            r12 = 0
            if (r10 != 0) goto L1be
            if (r1 == r4) goto L1be
            if (r6 <= r8) goto L108
            int r4 = r14.length()
            int r4 = r4 - r2
            if (r6 >= r4) goto L108
            int r6 = r6 + r2
            int r0 = r14.length()
            int r0 = r0 - r2
            java.lang.String r0 = r14.substring(r6, r0)
        L108:
            int r4 = r14.length()
            int r4 = r4 - r2
            java.lang.String r4 = r14.substring(r3, r4)
            boolean r5 = isAllZeros(r5)
            if (r5 == 0) goto L11f
            boolean r5 = isAllZeros(r0)
            if (r5 == 0) goto L11f
            r5 = 1
            goto L120
        L11f:
            r5 = 0
        L120:
            r6 = 68
            if (r1 == r6) goto L18e
            r6 = 70
            if (r1 == r6) goto L179
            r6 = 76
            if (r1 == r6) goto L138
            r6 = 100
            if (r1 == r6) goto L18e
            r6 = 102(0x66, float:1.43E-43)
            if (r1 == r6) goto L179
            r5 = 108(0x6c, float:1.51E-43)
            if (r1 != r5) goto L1a9
        L138:
            if (r9 != 0) goto L164
            if (r0 != 0) goto L164
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L154
            char r0 = r4.charAt(r3)
            r1 = 45
            if (r0 != r1) goto L154
            java.lang.String r0 = r4.substring(r2)
            boolean r0 = isDigits(r0)
            if (r0 != 0) goto L15a
        L154:
            boolean r0 = isDigits(r4)
            if (r0 == 0) goto L164
        L15a:
            java.lang.Long r14 = createLong(r4)     // Catch: java.lang.NumberFormatException -> L15f
            return r14
        L15f:
            java.math.BigInteger r14 = createBigInteger(r4)
            return r14
        L164:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            r1.append(r7)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L179:
            java.lang.Float r0 = createFloat(r14)     // Catch: java.lang.NumberFormatException -> L18e
            boolean r1 = r0.isInfinite()     // Catch: java.lang.NumberFormatException -> L18e
            if (r1 != 0) goto L18e
            float r1 = r0.floatValue()     // Catch: java.lang.NumberFormatException -> L18e
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L18d
            if (r5 == 0) goto L18e
        L18d:
            return r0
        L18e:
            java.lang.Double r0 = createDouble(r14)     // Catch: java.lang.NumberFormatException -> L1a4
            boolean r1 = r0.isInfinite()     // Catch: java.lang.NumberFormatException -> L1a4
            if (r1 != 0) goto L1a4
            float r1 = r0.floatValue()     // Catch: java.lang.NumberFormatException -> L1a4
            double r1 = (double) r1
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 != 0) goto L1a3
            if (r5 == 0) goto L1a4
        L1a3:
            return r0
        L1a4:
            java.math.BigDecimal r14 = createBigDecimal(r4)     // Catch: java.lang.NumberFormatException -> L1a9
            return r14
        L1a9:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            r1.append(r7)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L1be:
            if (r6 <= r8) goto L1d0
            int r1 = r14.length()
            int r1 = r1 - r2
            if (r6 >= r1) goto L1d0
            int r6 = r6 + r2
            int r0 = r14.length()
            java.lang.String r0 = r14.substring(r6, r0)
        L1d0:
            if (r9 != 0) goto L1e3
            if (r0 != 0) goto L1e3
            java.lang.Integer r14 = createInteger(r14)     // Catch: java.lang.NumberFormatException -> L1d9
            return r14
        L1d9:
            java.lang.Long r14 = createLong(r14)     // Catch: java.lang.NumberFormatException -> L1de
            return r14
        L1de:
            java.math.BigInteger r14 = createBigInteger(r14)
            return r14
        L1e3:
            boolean r1 = isAllZeros(r5)
            if (r1 == 0) goto L1f0
            boolean r0 = isAllZeros(r0)
            if (r0 == 0) goto L1f0
            r3 = 1
        L1f0:
            java.lang.Float r0 = createFloat(r14)     // Catch: java.lang.NumberFormatException -> L23b
            java.lang.Double r1 = createDouble(r14)     // Catch: java.lang.NumberFormatException -> L23b
            boolean r2 = r0.isInfinite()     // Catch: java.lang.NumberFormatException -> L23b
            if (r2 != 0) goto L217
            float r2 = r0.floatValue()     // Catch: java.lang.NumberFormatException -> L23b
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L208
            if (r3 == 0) goto L217
        L208:
            java.lang.String r2 = r0.toString()     // Catch: java.lang.NumberFormatException -> L23b
            java.lang.String r4 = r1.toString()     // Catch: java.lang.NumberFormatException -> L23b
            boolean r2 = r2.equals(r4)     // Catch: java.lang.NumberFormatException -> L23b
            if (r2 == 0) goto L217
            return r0
        L217:
            boolean r0 = r1.isInfinite()     // Catch: java.lang.NumberFormatException -> L23b
            if (r0 != 0) goto L23b
            double r4 = r1.doubleValue()     // Catch: java.lang.NumberFormatException -> L23b
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 != 0) goto L227
            if (r3 == 0) goto L23b
        L227:
            java.math.BigDecimal r0 = createBigDecimal(r14)     // Catch: java.lang.NumberFormatException -> L23b
            double r2 = r1.doubleValue()     // Catch: java.lang.NumberFormatException -> L23b
            java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L23b
            int r14 = r0.compareTo(r2)     // Catch: java.lang.NumberFormatException -> L23b
            if (r14 != 0) goto L23a
            return r1
        L23a:
            return r0
        L23b:
            java.math.BigDecimal r14 = createBigDecimal(r14)
            return r14
        L240:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.String r0 = "A blank string is not a valid number"
            r14.<init>(r0)
            throw r14
    }

    private static java.lang.String getMantissa(java.lang.String r1) {
            int r0 = r1.length()
            java.lang.String r1 = getMantissa(r1, r0)
            return r1
    }

    private static java.lang.String getMantissa(java.lang.String r4, int r5) {
            r0 = 0
            char r1 = r4.charAt(r0)
            r2 = 1
            r3 = 45
            if (r1 == r3) goto L11
            r3 = 43
            if (r1 != r3) goto Lf
            goto L11
        Lf:
            r1 = 0
            goto L12
        L11:
            r1 = 1
        L12:
            if (r1 == 0) goto L19
            java.lang.String r4 = r4.substring(r2, r5)
            goto L1d
        L19:
            java.lang.String r4 = r4.substring(r0, r5)
        L1d:
            return r4
    }

    private static boolean isAllZeros(java.lang.String r4) {
            r0 = 1
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.length()
            int r1 = r1 - r0
        L9:
            if (r1 < 0) goto L18
            char r2 = r4.charAt(r1)
            r3 = 48
            if (r2 == r3) goto L15
            r4 = 0
            return r4
        L15:
            int r1 = r1 + (-1)
            goto L9
        L18:
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r0
            return r4
    }

    public static boolean isCreatable(java.lang.String r16) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r16)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            char[] r0 = r16.toCharArray()
            int r2 = r0.length
            char r3 = r0[r1]
            r4 = 43
            r5 = 45
            r6 = 1
            if (r3 == r5) goto L1d
            char r3 = r0[r1]
            if (r3 != r4) goto L1b
            goto L1d
        L1b:
            r3 = 0
            goto L1e
        L1d:
            r3 = 1
        L1e:
            int r7 = r3 + 1
            r8 = 70
            r9 = 102(0x66, float:1.43E-43)
            r10 = 57
            r11 = 46
            r12 = 48
            if (r2 <= r7) goto L8a
            char r13 = r0[r3]
            if (r13 != r12) goto L8a
            r13 = r16
            boolean r13 = org.apache.commons.lang3.StringUtils.contains(r13, r11)
            if (r13 != 0) goto L8a
            char r13 = r0[r7]
            r14 = 120(0x78, float:1.68E-43)
            if (r13 == r14) goto L60
            char r13 = r0[r7]
            r14 = 88
            if (r13 != r14) goto L45
            goto L60
        L45:
            char r13 = r0[r7]
            boolean r13 = java.lang.Character.isDigit(r13)
            if (r13 == 0) goto L8a
        L4d:
            int r2 = r0.length
            if (r7 >= r2) goto L5f
            char r2 = r0[r7]
            if (r2 < r12) goto L5e
            char r2 = r0[r7]
            r3 = 55
            if (r2 <= r3) goto L5b
            goto L5e
        L5b:
            int r7 = r7 + 1
            goto L4d
        L5e:
            return r1
        L5f:
            return r6
        L60:
            int r3 = r3 + 2
            if (r3 != r2) goto L65
            return r1
        L65:
            int r2 = r0.length
            if (r3 >= r2) goto L89
            char r2 = r0[r3]
            if (r2 < r12) goto L70
            char r2 = r0[r3]
            if (r2 <= r10) goto L85
        L70:
            char r2 = r0[r3]
            r4 = 97
            if (r2 < r4) goto L7a
            char r2 = r0[r3]
            if (r2 <= r9) goto L85
        L7a:
            char r2 = r0[r3]
            r4 = 65
            if (r2 < r4) goto L88
            char r2 = r0[r3]
            if (r2 <= r8) goto L85
            goto L88
        L85:
            int r3 = r3 + 1
            goto L65
        L88:
            return r1
        L89:
            return r6
        L8a:
            int r2 = r2 + (-1)
            r7 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L90:
            r5 = 69
            r4 = 101(0x65, float:1.42E-43)
            if (r3 < r2) goto Lf6
            int r8 = r2 + 1
            if (r3 >= r8) goto La1
            if (r7 == 0) goto La1
            if (r13 != 0) goto La1
            r8 = 70
            goto Lf6
        La1:
            int r2 = r0.length
            if (r3 >= r2) goto Lf0
            char r2 = r0[r3]
            if (r2 < r12) goto Lad
            char r2 = r0[r3]
            if (r2 > r10) goto Lad
            return r6
        Lad:
            char r2 = r0[r3]
            if (r2 == r4) goto Lef
            char r2 = r0[r3]
            if (r2 != r5) goto Lb6
            goto Lef
        Lb6:
            char r2 = r0[r3]
            if (r2 != r11) goto Lc1
            if (r15 != 0) goto Lc0
            if (r14 == 0) goto Lbf
            goto Lc0
        Lbf:
            return r13
        Lc0:
            return r1
        Lc1:
            if (r7 != 0) goto Lda
            char r2 = r0[r3]
            r4 = 100
            if (r2 == r4) goto Ld9
            char r2 = r0[r3]
            r4 = 68
            if (r2 == r4) goto Ld9
            char r2 = r0[r3]
            if (r2 == r9) goto Ld9
            char r2 = r0[r3]
            r8 = 70
            if (r2 != r8) goto Lda
        Ld9:
            return r13
        Lda:
            char r2 = r0[r3]
            r4 = 108(0x6c, float:1.51E-43)
            if (r2 == r4) goto Le8
            char r0 = r0[r3]
            r2 = 76
            if (r0 != r2) goto Le7
            goto Le8
        Le7:
            return r1
        Le8:
            if (r13 == 0) goto Lef
            if (r14 != 0) goto Lef
            if (r15 != 0) goto Lef
            r1 = 1
        Lef:
            return r1
        Lf0:
            if (r7 != 0) goto Lf5
            if (r13 == 0) goto Lf5
            r1 = 1
        Lf5:
            return r1
        Lf6:
            char r6 = r0[r3]
            if (r6 < r12) goto L105
            char r6 = r0[r3]
            if (r6 > r10) goto L105
            r5 = 43
            r6 = 45
            r7 = 0
            r13 = 1
            goto L140
        L105:
            char r6 = r0[r3]
            if (r6 != r11) goto L115
            if (r15 != 0) goto L114
            if (r14 == 0) goto L10e
            goto L114
        L10e:
            r5 = 43
            r6 = 45
            r15 = 1
            goto L140
        L114:
            return r1
        L115:
            char r6 = r0[r3]
            if (r6 == r4) goto L134
            char r4 = r0[r3]
            if (r4 != r5) goto L11e
            goto L134
        L11e:
            char r4 = r0[r3]
            r5 = 43
            if (r4 == r5) goto L12c
            char r4 = r0[r3]
            r6 = 45
            if (r4 != r6) goto L12b
            goto L12e
        L12b:
            return r1
        L12c:
            r6 = 45
        L12e:
            if (r7 != 0) goto L131
            return r1
        L131:
            r7 = 0
            r13 = 0
            goto L140
        L134:
            r5 = 43
            r6 = 45
            if (r14 == 0) goto L13b
            return r1
        L13b:
            if (r13 != 0) goto L13e
            return r1
        L13e:
            r7 = 1
            r14 = 1
        L140:
            int r3 = r3 + 1
            r4 = 43
            r6 = 1
            goto L90
    }

    public static boolean isDigits(java.lang.String r0) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isNumeric(r0)
            return r0
    }

    @java.lang.Deprecated
    public static boolean isNumber(java.lang.String r0) {
            boolean r0 = isCreatable(r0)
            return r0
    }

    public static boolean isParsable(java.lang.String r4) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r4.length()
            r2 = 1
            int r0 = r0 - r2
            char r0 = r4.charAt(r0)
            r3 = 46
            if (r0 != r3) goto L17
            return r1
        L17:
            char r0 = r4.charAt(r1)
            r3 = 45
            if (r0 != r3) goto L2b
            int r0 = r4.length()
            if (r0 != r2) goto L26
            return r1
        L26:
            boolean r4 = withDecimalsParsing(r4, r2)
            return r4
        L2b:
            boolean r4 = withDecimalsParsing(r4, r1)
            return r4
    }

    public static byte max(byte r0, byte r1, byte r2) {
            if (r1 <= r0) goto L3
            r0 = r1
        L3:
            if (r2 <= r0) goto L6
            goto L7
        L6:
            r2 = r0
        L7:
            return r2
    }

    public static byte max(byte... r3) {
            validateArray(r3)
            r0 = 0
            r0 = r3[r0]
            r1 = 1
        L7:
            int r2 = r3.length
            if (r1 >= r2) goto L13
            r2 = r3[r1]
            if (r2 <= r0) goto L10
            r0 = r3[r1]
        L10:
            int r1 = r1 + 1
            goto L7
        L13:
            return r0
    }

    public static double max(double r0, double r2, double r4) {
            double r0 = java.lang.Math.max(r0, r2)
            double r0 = java.lang.Math.max(r0, r4)
            return r0
    }

    public static double max(double... r6) {
            validateArray(r6)
            r0 = 0
            r0 = r6[r0]
            r2 = 1
        L7:
            int r3 = r6.length
            if (r2 >= r3) goto L20
            r3 = r6[r2]
            boolean r3 = java.lang.Double.isNaN(r3)
            if (r3 == 0) goto L15
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L15:
            r3 = r6[r2]
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 <= 0) goto L1d
            r0 = r6[r2]
        L1d:
            int r2 = r2 + 1
            goto L7
        L20:
            return r0
    }

    public static float max(float r0, float r1, float r2) {
            float r0 = java.lang.Math.max(r0, r1)
            float r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    public static float max(float... r3) {
            validateArray(r3)
            r0 = 0
            r0 = r3[r0]
            r1 = 1
        L7:
            int r2 = r3.length
            if (r1 >= r2) goto L20
            r2 = r3[r1]
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 == 0) goto L15
            r3 = 2143289344(0x7fc00000, float:NaN)
            return r3
        L15:
            r2 = r3[r1]
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1d
            r0 = r3[r1]
        L1d:
            int r1 = r1 + 1
            goto L7
        L20:
            return r0
    }

    public static int max(int r0, int r1, int r2) {
            if (r1 <= r0) goto L3
            r0 = r1
        L3:
            if (r2 <= r0) goto L6
            goto L7
        L6:
            r2 = r0
        L7:
            return r2
    }

    public static int max(int... r3) {
            validateArray(r3)
            r0 = 0
            r0 = r3[r0]
            r1 = 1
        L7:
            int r2 = r3.length
            if (r1 >= r2) goto L13
            r2 = r3[r1]
            if (r2 <= r0) goto L10
            r0 = r3[r1]
        L10:
            int r1 = r1 + 1
            goto L7
        L13:
            return r0
    }

    public static long max(long r1, long r3, long r5) {
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5
            r1 = r3
        L5:
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 <= 0) goto La
            goto Lb
        La:
            r5 = r1
        Lb:
            return r5
    }

    public static long max(long... r6) {
            validateArray(r6)
            r0 = 0
            r0 = r6[r0]
            r2 = 1
        L7:
            int r3 = r6.length
            if (r2 >= r3) goto L15
            r3 = r6[r2]
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 <= 0) goto L12
            r0 = r6[r2]
        L12:
            int r2 = r2 + 1
            goto L7
        L15:
            return r0
    }

    public static short max(short r0, short r1, short r2) {
            if (r1 <= r0) goto L3
            r0 = r1
        L3:
            if (r2 <= r0) goto L6
            goto L7
        L6:
            r2 = r0
        L7:
            return r2
    }

    public static short max(short... r3) {
            validateArray(r3)
            r0 = 0
            short r0 = r3[r0]
            r1 = 1
        L7:
            int r2 = r3.length
            if (r1 >= r2) goto L13
            short r2 = r3[r1]
            if (r2 <= r0) goto L10
            short r0 = r3[r1]
        L10:
            int r1 = r1 + 1
            goto L7
        L13:
            return r0
    }

    public static byte min(byte r0, byte r1, byte r2) {
            if (r1 >= r0) goto L3
            r0 = r1
        L3:
            if (r2 >= r0) goto L6
            goto L7
        L6:
            r2 = r0
        L7:
            return r2
    }

    public static byte min(byte... r3) {
            validateArray(r3)
            r0 = 0
            r0 = r3[r0]
            r1 = 1
        L7:
            int r2 = r3.length
            if (r1 >= r2) goto L13
            r2 = r3[r1]
            if (r2 >= r0) goto L10
            r0 = r3[r1]
        L10:
            int r1 = r1 + 1
            goto L7
        L13:
            return r0
    }

    public static double min(double r0, double r2, double r4) {
            double r0 = java.lang.Math.min(r0, r2)
            double r0 = java.lang.Math.min(r0, r4)
            return r0
    }

    public static double min(double... r6) {
            validateArray(r6)
            r0 = 0
            r0 = r6[r0]
            r2 = 1
        L7:
            int r3 = r6.length
            if (r2 >= r3) goto L20
            r3 = r6[r2]
            boolean r3 = java.lang.Double.isNaN(r3)
            if (r3 == 0) goto L15
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L15:
            r3 = r6[r2]
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 >= 0) goto L1d
            r0 = r6[r2]
        L1d:
            int r2 = r2 + 1
            goto L7
        L20:
            return r0
    }

    public static float min(float r0, float r1, float r2) {
            float r0 = java.lang.Math.min(r0, r1)
            float r0 = java.lang.Math.min(r0, r2)
            return r0
    }

    public static float min(float... r3) {
            validateArray(r3)
            r0 = 0
            r0 = r3[r0]
            r1 = 1
        L7:
            int r2 = r3.length
            if (r1 >= r2) goto L20
            r2 = r3[r1]
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 == 0) goto L15
            r3 = 2143289344(0x7fc00000, float:NaN)
            return r3
        L15:
            r2 = r3[r1]
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L1d
            r0 = r3[r1]
        L1d:
            int r1 = r1 + 1
            goto L7
        L20:
            return r0
    }

    public static int min(int r0, int r1, int r2) {
            if (r1 >= r0) goto L3
            r0 = r1
        L3:
            if (r2 >= r0) goto L6
            goto L7
        L6:
            r2 = r0
        L7:
            return r2
    }

    public static int min(int... r3) {
            validateArray(r3)
            r0 = 0
            r0 = r3[r0]
            r1 = 1
        L7:
            int r2 = r3.length
            if (r1 >= r2) goto L13
            r2 = r3[r1]
            if (r2 >= r0) goto L10
            r0 = r3[r1]
        L10:
            int r1 = r1 + 1
            goto L7
        L13:
            return r0
    }

    public static long min(long r1, long r3, long r5) {
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L5
            r1 = r3
        L5:
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 >= 0) goto La
            goto Lb
        La:
            r5 = r1
        Lb:
            return r5
    }

    public static long min(long... r6) {
            validateArray(r6)
            r0 = 0
            r0 = r6[r0]
            r2 = 1
        L7:
            int r3 = r6.length
            if (r2 >= r3) goto L15
            r3 = r6[r2]
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 >= 0) goto L12
            r0 = r6[r2]
        L12:
            int r2 = r2 + 1
            goto L7
        L15:
            return r0
    }

    public static short min(short r0, short r1, short r2) {
            if (r1 >= r0) goto L3
            r0 = r1
        L3:
            if (r2 >= r0) goto L6
            goto L7
        L6:
            r2 = r0
        L7:
            return r2
    }

    public static short min(short... r3) {
            validateArray(r3)
            r0 = 0
            short r0 = r3[r0]
            r1 = 1
        L7:
            int r2 = r3.length
            if (r1 >= r2) goto L13
            short r2 = r3[r1]
            if (r2 >= r0) goto L10
            short r0 = r3[r1]
        L10:
            int r1 = r1 + 1
            goto L7
        L13:
            return r0
    }

    public static byte toByte(java.lang.String r1) {
            r0 = 0
            byte r1 = toByte(r1, r0)
            return r1
    }

    public static byte toByte(java.lang.String r0, byte r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            byte r0 = java.lang.Byte.parseByte(r0)     // Catch: java.lang.NumberFormatException -> L8
            return r0
        L8:
            return r1
    }

    public static double toDouble(java.lang.String r2) {
            r0 = 0
            double r0 = toDouble(r2, r0)
            return r0
    }

    public static double toDouble(java.lang.String r0, double r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            double r0 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.NumberFormatException -> L8
            return r0
        L8:
            return r1
    }

    public static double toDouble(java.math.BigDecimal r2) {
            r0 = 0
            double r0 = toDouble(r2, r0)
            return r0
    }

    public static double toDouble(java.math.BigDecimal r0, double r1) {
            if (r0 != 0) goto L3
            goto L7
        L3:
            double r1 = r0.doubleValue()
        L7:
            return r1
    }

    public static float toFloat(java.lang.String r1) {
            r0 = 0
            float r1 = toFloat(r1, r0)
            return r1
    }

    public static float toFloat(java.lang.String r0, float r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L8
            return r0
        L8:
            return r1
    }

    public static int toInt(java.lang.String r1) {
            r0 = 0
            int r1 = toInt(r1, r0)
            return r1
    }

    public static int toInt(java.lang.String r0, int r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L8
            return r0
        L8:
            return r1
    }

    public static long toLong(java.lang.String r2) {
            r0 = 0
            long r0 = toLong(r2, r0)
            return r0
    }

    public static long toLong(java.lang.String r0, long r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L8
            return r0
        L8:
            return r1
    }

    public static java.math.BigDecimal toScaledBigDecimal(java.lang.Double r2) {
            java.lang.Integer r0 = org.apache.commons.lang3.math.NumberUtils.INTEGER_TWO
            int r0 = r0.intValue()
            java.math.RoundingMode r1 = java.math.RoundingMode.HALF_EVEN
            java.math.BigDecimal r2 = toScaledBigDecimal(r2, r0, r1)
            return r2
    }

    public static java.math.BigDecimal toScaledBigDecimal(java.lang.Double r2, int r3, java.math.RoundingMode r4) {
            if (r2 != 0) goto L5
            java.math.BigDecimal r2 = java.math.BigDecimal.ZERO
            return r2
        L5:
            double r0 = r2.doubleValue()
            java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r0)
            java.math.BigDecimal r2 = toScaledBigDecimal(r2, r3, r4)
            return r2
    }

    public static java.math.BigDecimal toScaledBigDecimal(java.lang.Float r2) {
            java.lang.Integer r0 = org.apache.commons.lang3.math.NumberUtils.INTEGER_TWO
            int r0 = r0.intValue()
            java.math.RoundingMode r1 = java.math.RoundingMode.HALF_EVEN
            java.math.BigDecimal r2 = toScaledBigDecimal(r2, r0, r1)
            return r2
    }

    public static java.math.BigDecimal toScaledBigDecimal(java.lang.Float r2, int r3, java.math.RoundingMode r4) {
            if (r2 != 0) goto L5
            java.math.BigDecimal r2 = java.math.BigDecimal.ZERO
            return r2
        L5:
            float r2 = r2.floatValue()
            double r0 = (double) r2
            java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r0)
            java.math.BigDecimal r2 = toScaledBigDecimal(r2, r3, r4)
            return r2
    }

    public static java.math.BigDecimal toScaledBigDecimal(java.lang.String r2) {
            java.lang.Integer r0 = org.apache.commons.lang3.math.NumberUtils.INTEGER_TWO
            int r0 = r0.intValue()
            java.math.RoundingMode r1 = java.math.RoundingMode.HALF_EVEN
            java.math.BigDecimal r2 = toScaledBigDecimal(r2, r0, r1)
            return r2
    }

    public static java.math.BigDecimal toScaledBigDecimal(java.lang.String r0, int r1, java.math.RoundingMode r2) {
            if (r0 != 0) goto L5
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
            return r0
        L5:
            java.math.BigDecimal r0 = createBigDecimal(r0)
            java.math.BigDecimal r0 = toScaledBigDecimal(r0, r1, r2)
            return r0
    }

    public static java.math.BigDecimal toScaledBigDecimal(java.math.BigDecimal r2) {
            java.lang.Integer r0 = org.apache.commons.lang3.math.NumberUtils.INTEGER_TWO
            int r0 = r0.intValue()
            java.math.RoundingMode r1 = java.math.RoundingMode.HALF_EVEN
            java.math.BigDecimal r2 = toScaledBigDecimal(r2, r0, r1)
            return r2
    }

    public static java.math.BigDecimal toScaledBigDecimal(java.math.BigDecimal r0, int r1, java.math.RoundingMode r2) {
            if (r0 != 0) goto L5
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
            return r0
        L5:
            if (r2 != 0) goto L9
            java.math.RoundingMode r2 = java.math.RoundingMode.HALF_EVEN
        L9:
            java.math.BigDecimal r0 = r0.setScale(r1, r2)
            return r0
    }

    public static short toShort(java.lang.String r1) {
            r0 = 0
            short r1 = toShort(r1, r0)
            return r1
    }

    public static short toShort(java.lang.String r0, short r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            short r0 = java.lang.Short.parseShort(r0)     // Catch: java.lang.NumberFormatException -> L8
            return r0
        L8:
            return r1
    }

    private static void validateArray(java.lang.Object r5) {
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "The Array must not be null"
            org.apache.commons.lang3.Validate.isTrue(r2, r4, r3)
            int r5 = java.lang.reflect.Array.getLength(r5)
            if (r5 == 0) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r1 = "Array cannot be empty."
            org.apache.commons.lang3.Validate.isTrue(r0, r1, r5)
            return
    }

    private static boolean withDecimalsParsing(java.lang.String r5, int r6) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r5.length()
            r3 = 1
            if (r6 >= r2) goto L2b
            char r2 = r5.charAt(r6)
            r4 = 46
            if (r2 != r4) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            if (r2 == 0) goto L18
            int r1 = r1 + 1
        L18:
            if (r1 <= r3) goto L1b
            return r0
        L1b:
            if (r2 != 0) goto L28
            char r2 = r5.charAt(r6)
            boolean r2 = java.lang.Character.isDigit(r2)
            if (r2 != 0) goto L28
            return r0
        L28:
            int r6 = r6 + 1
            goto L2
        L2b:
            return r3
    }
}
