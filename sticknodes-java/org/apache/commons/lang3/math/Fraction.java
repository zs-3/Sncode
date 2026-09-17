package org.apache.commons.lang3.math;

/* loaded from: classes2.dex */
public final class Fraction extends java.lang.Number implements java.lang.Comparable<org.apache.commons.lang3.math.Fraction> {
    public static final org.apache.commons.lang3.math.Fraction FOUR_FIFTHS = null;
    public static final org.apache.commons.lang3.math.Fraction ONE = null;
    public static final org.apache.commons.lang3.math.Fraction ONE_FIFTH = null;
    public static final org.apache.commons.lang3.math.Fraction ONE_HALF = null;
    public static final org.apache.commons.lang3.math.Fraction ONE_QUARTER = null;
    public static final org.apache.commons.lang3.math.Fraction ONE_THIRD = null;
    public static final org.apache.commons.lang3.math.Fraction THREE_FIFTHS = null;
    public static final org.apache.commons.lang3.math.Fraction THREE_QUARTERS = null;
    public static final org.apache.commons.lang3.math.Fraction TWO_FIFTHS = null;
    public static final org.apache.commons.lang3.math.Fraction TWO_QUARTERS = null;
    public static final org.apache.commons.lang3.math.Fraction TWO_THIRDS = null;
    public static final org.apache.commons.lang3.math.Fraction ZERO = null;
    private static final long serialVersionUID = 65382027393090L;
    private final int denominator;
    private transient int hashCode;
    private final int numerator;
    private transient java.lang.String toProperString;
    private transient java.lang.String toString;

    static {
            org.apache.commons.lang3.math.Fraction r0 = new org.apache.commons.lang3.math.Fraction
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2)
            org.apache.commons.lang3.math.Fraction.ZERO = r0
            org.apache.commons.lang3.math.Fraction r0 = new org.apache.commons.lang3.math.Fraction
            r0.<init>(r2, r2)
            org.apache.commons.lang3.math.Fraction.ONE = r0
            org.apache.commons.lang3.math.Fraction r0 = new org.apache.commons.lang3.math.Fraction
            r1 = 2
            r0.<init>(r2, r1)
            org.apache.commons.lang3.math.Fraction.ONE_HALF = r0
            org.apache.commons.lang3.math.Fraction r0 = new org.apache.commons.lang3.math.Fraction
            r3 = 3
            r0.<init>(r2, r3)
            org.apache.commons.lang3.math.Fraction.ONE_THIRD = r0
            org.apache.commons.lang3.math.Fraction r0 = new org.apache.commons.lang3.math.Fraction
            r0.<init>(r1, r3)
            org.apache.commons.lang3.math.Fraction.TWO_THIRDS = r0
            org.apache.commons.lang3.math.Fraction r0 = new org.apache.commons.lang3.math.Fraction
            r4 = 4
            r0.<init>(r2, r4)
            org.apache.commons.lang3.math.Fraction.ONE_QUARTER = r0
            org.apache.commons.lang3.math.Fraction r0 = new org.apache.commons.lang3.math.Fraction
            r0.<init>(r1, r4)
            org.apache.commons.lang3.math.Fraction.TWO_QUARTERS = r0
            org.apache.commons.lang3.math.Fraction r0 = new org.apache.commons.lang3.math.Fraction
            r0.<init>(r3, r4)
            org.apache.commons.lang3.math.Fraction.THREE_QUARTERS = r0
            org.apache.commons.lang3.math.Fraction r0 = new org.apache.commons.lang3.math.Fraction
            r5 = 5
            r0.<init>(r2, r5)
            org.apache.commons.lang3.math.Fraction.ONE_FIFTH = r0
            org.apache.commons.lang3.math.Fraction r0 = new org.apache.commons.lang3.math.Fraction
            r0.<init>(r1, r5)
            org.apache.commons.lang3.math.Fraction.TWO_FIFTHS = r0
            org.apache.commons.lang3.math.Fraction r0 = new org.apache.commons.lang3.math.Fraction
            r0.<init>(r3, r5)
            org.apache.commons.lang3.math.Fraction.THREE_FIFTHS = r0
            org.apache.commons.lang3.math.Fraction r0 = new org.apache.commons.lang3.math.Fraction
            r0.<init>(r4, r5)
            org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS = r0
            return
    }

    private Fraction(int r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.hashCode = r0
            r0 = 0
            r1.toString = r0
            r1.toProperString = r0
            r1.numerator = r2
            r1.denominator = r3
            return
    }

    private static int addAndCheck(int r3, int r4) {
            long r0 = (long) r3
            long r3 = (long) r4
            long r0 = r0 + r3
            r3 = -2147483648(0xffffffff80000000, double:NaN)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 < 0) goto L13
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 > 0) goto L13
            int r3 = (int) r0
            return r3
        L13:
            java.lang.ArithmeticException r3 = new java.lang.ArithmeticException
            java.lang.String r4 = "overflow: add"
            r3.<init>(r4)
            throw r3
    }

    private org.apache.commons.lang3.math.Fraction addSub(org.apache.commons.lang3.math.Fraction r6, boolean r7) {
            r5 = this;
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "The fraction must not be null"
            org.apache.commons.lang3.Validate.isTrue(r2, r3, r1)
            int r1 = r5.numerator
            if (r1 != 0) goto L1a
            if (r7 == 0) goto L15
            goto L19
        L15:
            org.apache.commons.lang3.math.Fraction r6 = r6.negate()
        L19:
            return r6
        L1a:
            int r1 = r6.numerator
            if (r1 != 0) goto L1f
            return r5
        L1f:
            int r1 = r5.denominator
            int r2 = r6.denominator
            int r1 = greatestCommonDivisor(r1, r2)
            if (r1 != r0) goto L52
            int r0 = r5.numerator
            int r1 = r6.denominator
            int r0 = mulAndCheck(r0, r1)
            int r1 = r6.numerator
            int r2 = r5.denominator
            int r1 = mulAndCheck(r1, r2)
            org.apache.commons.lang3.math.Fraction r2 = new org.apache.commons.lang3.math.Fraction
            if (r7 == 0) goto L42
            int r7 = addAndCheck(r0, r1)
            goto L46
        L42:
            int r7 = subAndCheck(r0, r1)
        L46:
            int r0 = r5.denominator
            int r6 = r6.denominator
            int r6 = mulPosAndCheck(r0, r6)
            r2.<init>(r7, r6)
            return r2
        L52:
            int r0 = r5.numerator
            long r2 = (long) r0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r2)
            int r2 = r6.denominator
            int r2 = r2 / r1
            long r2 = (long) r2
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r2)
            java.math.BigInteger r0 = r0.multiply(r2)
            int r2 = r6.numerator
            long r2 = (long) r2
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r2)
            int r3 = r5.denominator
            int r3 = r3 / r1
            long r3 = (long) r3
            java.math.BigInteger r3 = java.math.BigInteger.valueOf(r3)
            java.math.BigInteger r2 = r2.multiply(r3)
            if (r7 == 0) goto L7f
            java.math.BigInteger r7 = r0.add(r2)
            goto L83
        L7f:
            java.math.BigInteger r7 = r0.subtract(r2)
        L83:
            long r2 = (long) r1
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r2)
            java.math.BigInteger r0 = r7.mod(r0)
            int r0 = r0.intValue()
            if (r0 != 0) goto L94
            r0 = r1
            goto L98
        L94:
            int r0 = greatestCommonDivisor(r0, r1)
        L98:
            long r2 = (long) r0
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r2)
            java.math.BigInteger r7 = r7.divide(r2)
            int r2 = r7.bitLength()
            r3 = 31
            if (r2 > r3) goto Lbd
            org.apache.commons.lang3.math.Fraction r2 = new org.apache.commons.lang3.math.Fraction
            int r7 = r7.intValue()
            int r3 = r5.denominator
            int r3 = r3 / r1
            int r6 = r6.denominator
            int r6 = r6 / r0
            int r6 = mulPosAndCheck(r3, r6)
            r2.<init>(r7, r6)
            return r2
        Lbd:
            java.lang.ArithmeticException r6 = new java.lang.ArithmeticException
            java.lang.String r7 = "overflow: numerator too large after multiply"
            r6.<init>(r7)
            throw r6
    }

    public static org.apache.commons.lang3.math.Fraction getFraction(double r23) {
            r1 = 0
            int r3 = (r23 > r1 ? 1 : (r23 == r1 ? 0 : -1))
            if (r3 >= 0) goto L8
            r1 = -1
            goto L9
        L8:
            r1 = 1
        L9:
            double r2 = java.lang.Math.abs(r23)
            r4 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L87
            boolean r4 = java.lang.Double.isNaN(r2)
            if (r4 != 0) goto L87
            int r4 = (int) r2
            double r5 = (double) r4
            double r2 = r2 - r5
            int r5 = (int) r2
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r8 = (double) r5
            double r8 = r2 - r8
            r10 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r12 = 0
            r17 = r1
            r12 = 1
            r13 = 0
            r14 = 0
            r15 = 1
            r16 = 1
        L33:
            double r0 = r6 / r8
            int r0 = (int) r0
            r23 = r10
            double r10 = (double) r0
            double r10 = r10 * r8
            double r6 = r6 - r10
            int r1 = r5 * r12
            int r1 = r1 + r13
            int r5 = r5 * r14
            int r5 = r5 + r15
            double r10 = (double) r1
            r13 = r0
            r15 = r1
            double r0 = (double) r5
            double r10 = r10 / r0
            double r0 = r2 - r10
            double r10 = java.lang.Math.abs(r0)
            r0 = 1
            int r1 = r16 + 1
            r18 = r23
            int r16 = (r18 > r10 ? 1 : (r18 == r10 ? 0 : -1))
            if (r16 <= 0) goto L71
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r5 > r0) goto L71
            if (r5 <= 0) goto L71
            r0 = 25
            if (r1 < r0) goto L61
            goto L73
        L61:
            r16 = r1
            r20 = r14
            r14 = r5
            r5 = r13
            r13 = r12
            r12 = r15
            r15 = r20
            r21 = r6
            r6 = r8
            r8 = r21
            goto L33
        L71:
            r0 = 25
        L73:
            if (r1 == r0) goto L7f
            int r4 = r4 * r14
            int r12 = r12 + r4
            int r12 = r12 * r17
            org.apache.commons.lang3.math.Fraction r0 = getReducedFraction(r12, r14)
            return r0
        L7f:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Unable to convert double to fraction"
            r0.<init>(r1)
            throw r0
        L87:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "The value must not be greater than Integer.MAX_VALUE or NaN"
            r0.<init>(r1)
            throw r0
    }

    public static org.apache.commons.lang3.math.Fraction getFraction(int r1, int r2) {
            if (r2 == 0) goto L1b
            if (r2 >= 0) goto L15
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto Ld
            if (r2 == r0) goto Ld
            int r1 = -r1
            int r2 = -r2
            goto L15
        Ld:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r2 = "overflow: can't negate"
            r1.<init>(r2)
            throw r1
        L15:
            org.apache.commons.lang3.math.Fraction r0 = new org.apache.commons.lang3.math.Fraction
            r0.<init>(r1, r2)
            return r0
        L1b:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r2 = "The denominator must not be zero"
            r1.<init>(r2)
            throw r1
    }

    public static org.apache.commons.lang3.math.Fraction getFraction(int r4, int r5, int r6) {
            if (r6 == 0) goto L42
            if (r6 < 0) goto L3a
            if (r5 < 0) goto L32
            if (r4 >= 0) goto Lf
            long r0 = (long) r4
            long r2 = (long) r6
            long r0 = r0 * r2
            long r4 = (long) r5
            long r0 = r0 - r4
            goto L15
        Lf:
            long r0 = (long) r4
            long r2 = (long) r6
            long r0 = r0 * r2
            long r4 = (long) r5
            long r0 = r0 + r4
        L15:
            r4 = -2147483648(0xffffffff80000000, double:NaN)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L2a
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto L2a
            org.apache.commons.lang3.math.Fraction r4 = new org.apache.commons.lang3.math.Fraction
            int r5 = (int) r0
            r4.<init>(r5, r6)
            return r4
        L2a:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "Numerator too large to represent as an Integer."
            r4.<init>(r5)
            throw r4
        L32:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "The numerator must not be negative"
            r4.<init>(r5)
            throw r4
        L3a:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "The denominator must not be negative"
            r4.<init>(r5)
            throw r4
        L42:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "The denominator must not be zero"
            r4.<init>(r5)
            throw r4
    }

    public static org.apache.commons.lang3.math.Fraction getFraction(java.lang.String r5) {
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "The string must not be null"
            org.apache.commons.lang3.Validate.isTrue(r2, r4, r3)
            r2 = 46
            int r2 = r5.indexOf(r2)
            if (r2 < 0) goto L1f
            double r0 = java.lang.Double.parseDouble(r5)
            org.apache.commons.lang3.math.Fraction r5 = getFraction(r0)
            return r5
        L1f:
            r2 = 32
            int r2 = r5.indexOf(r2)
            r3 = 47
            if (r2 <= 0) goto L5a
            java.lang.String r4 = r5.substring(r1, r2)
            int r4 = java.lang.Integer.parseInt(r4)
            int r2 = r2 + r0
            java.lang.String r5 = r5.substring(r2)
            int r2 = r5.indexOf(r3)
            if (r2 < 0) goto L52
            java.lang.String r1 = r5.substring(r1, r2)
            int r1 = java.lang.Integer.parseInt(r1)
            int r2 = r2 + r0
            java.lang.String r5 = r5.substring(r2)
            int r5 = java.lang.Integer.parseInt(r5)
            org.apache.commons.lang3.math.Fraction r5 = getFraction(r4, r1, r5)
            return r5
        L52:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            java.lang.String r0 = "The fraction could not be parsed as the format X Y/Z"
            r5.<init>(r0)
            throw r5
        L5a:
            int r2 = r5.indexOf(r3)
            if (r2 >= 0) goto L69
            int r5 = java.lang.Integer.parseInt(r5)
            org.apache.commons.lang3.math.Fraction r5 = getFraction(r5, r0)
            return r5
        L69:
            java.lang.String r1 = r5.substring(r1, r2)
            int r1 = java.lang.Integer.parseInt(r1)
            int r2 = r2 + r0
            java.lang.String r5 = r5.substring(r2)
            int r5 = java.lang.Integer.parseInt(r5)
            org.apache.commons.lang3.math.Fraction r5 = getFraction(r1, r5)
            return r5
    }

    public static org.apache.commons.lang3.math.Fraction getReducedFraction(int r2, int r3) {
            if (r3 == 0) goto L30
            if (r2 != 0) goto L7
            org.apache.commons.lang3.math.Fraction r2 = org.apache.commons.lang3.math.Fraction.ZERO
            return r2
        L7:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r0) goto L13
            r1 = r2 & 1
            if (r1 != 0) goto L13
            int r2 = r2 / 2
            int r3 = r3 / 2
        L13:
            if (r3 >= 0) goto L24
            if (r2 == r0) goto L1c
            if (r3 == r0) goto L1c
            int r2 = -r2
            int r3 = -r3
            goto L24
        L1c:
            java.lang.ArithmeticException r2 = new java.lang.ArithmeticException
            java.lang.String r3 = "overflow: can't negate"
            r2.<init>(r3)
            throw r2
        L24:
            int r0 = greatestCommonDivisor(r2, r3)
            int r2 = r2 / r0
            int r3 = r3 / r0
            org.apache.commons.lang3.math.Fraction r0 = new org.apache.commons.lang3.math.Fraction
            r0.<init>(r2, r3)
            return r0
        L30:
            java.lang.ArithmeticException r2 = new java.lang.ArithmeticException
            java.lang.String r3 = "The denominator must not be zero"
            r2.<init>(r3)
            throw r2
    }

    private static int greatestCommonDivisor(int r6, int r7) {
            java.lang.String r0 = "overflow: gcd is 2^31"
            if (r6 == 0) goto L57
            if (r7 != 0) goto L7
            goto L57
        L7:
            int r1 = java.lang.Math.abs(r6)
            r2 = 1
            if (r1 == r2) goto L56
            int r1 = java.lang.Math.abs(r7)
            if (r1 != r2) goto L15
            goto L56
        L15:
            if (r6 <= 0) goto L18
            int r6 = -r6
        L18:
            if (r7 <= 0) goto L1b
            int r7 = -r7
        L1b:
            r1 = 0
        L1c:
            r3 = r6 & 1
            r4 = 31
            if (r3 != 0) goto L2f
            r5 = r7 & 1
            if (r5 != 0) goto L2f
            if (r1 >= r4) goto L2f
            int r6 = r6 / 2
            int r7 = r7 / 2
            int r1 = r1 + 1
            goto L1c
        L2f:
            if (r1 == r4) goto L50
            if (r3 != r2) goto L35
            r0 = r7
            goto L38
        L35:
            int r0 = r6 / 2
            int r0 = -r0
        L38:
            r3 = r0 & 1
            if (r3 != 0) goto L3f
            int r0 = r0 / 2
            goto L38
        L3f:
            if (r0 <= 0) goto L43
            int r6 = -r0
            goto L44
        L43:
            r7 = r0
        L44:
            int r0 = r7 - r6
            int r0 = r0 / 2
            if (r0 != 0) goto L38
            int r6 = -r6
            int r7 = r2 << r1
            int r6 = r6 * r7
            return r6
        L50:
            java.lang.ArithmeticException r6 = new java.lang.ArithmeticException
            r6.<init>(r0)
            throw r6
        L56:
            return r2
        L57:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r1) goto L67
            if (r7 == r1) goto L67
            int r6 = java.lang.Math.abs(r6)
            int r7 = java.lang.Math.abs(r7)
            int r6 = r6 + r7
            return r6
        L67:
            java.lang.ArithmeticException r6 = new java.lang.ArithmeticException
            r6.<init>(r0)
            throw r6
    }

    private static int mulAndCheck(int r3, int r4) {
            long r0 = (long) r3
            long r3 = (long) r4
            long r0 = r0 * r3
            r3 = -2147483648(0xffffffff80000000, double:NaN)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 < 0) goto L14
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 > 0) goto L14
            int r3 = (int) r0
            return r3
        L14:
            java.lang.ArithmeticException r3 = new java.lang.ArithmeticException
            java.lang.String r4 = "overflow: mul"
            r3.<init>(r4)
            throw r3
    }

    private static int mulPosAndCheck(int r3, int r4) {
            long r0 = (long) r3
            long r3 = (long) r4
            long r0 = r0 * r3
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 > 0) goto Ld
            int r3 = (int) r0
            return r3
        Ld:
            java.lang.ArithmeticException r3 = new java.lang.ArithmeticException
            java.lang.String r4 = "overflow: mulPos"
            r3.<init>(r4)
            throw r3
    }

    private static int subAndCheck(int r3, int r4) {
            long r0 = (long) r3
            long r3 = (long) r4
            long r0 = r0 - r3
            r3 = -2147483648(0xffffffff80000000, double:NaN)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 < 0) goto L13
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 > 0) goto L13
            int r3 = (int) r0
            return r3
        L13:
            java.lang.ArithmeticException r3 = new java.lang.ArithmeticException
            java.lang.String r4 = "overflow: add"
            r3.<init>(r4)
            throw r3
    }

    public org.apache.commons.lang3.math.Fraction abs() {
            r1 = this;
            int r0 = r1.numerator
            if (r0 < 0) goto L5
            return r1
        L5:
            org.apache.commons.lang3.math.Fraction r0 = r1.negate()
            return r0
    }

    public org.apache.commons.lang3.math.Fraction add(org.apache.commons.lang3.math.Fraction r2) {
            r1 = this;
            r0 = 1
            org.apache.commons.lang3.math.Fraction r2 = r1.addSub(r2, r0)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(org.apache.commons.lang3.math.Fraction r1) {
            r0 = this;
            org.apache.commons.lang3.math.Fraction r1 = (org.apache.commons.lang3.math.Fraction) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(org.apache.commons.lang3.math.Fraction r7) {
            r6 = this;
            r0 = 0
            if (r6 != r7) goto L4
            return r0
        L4:
            int r1 = r6.numerator
            int r2 = r7.numerator
            if (r1 != r2) goto L11
            int r3 = r6.denominator
            int r4 = r7.denominator
            if (r3 != r4) goto L11
            return r0
        L11:
            long r0 = (long) r1
            int r7 = r7.denominator
            long r3 = (long) r7
            long r0 = r0 * r3
            long r2 = (long) r2
            int r7 = r6.denominator
            long r4 = (long) r7
            long r2 = r2 * r4
            int r7 = java.lang.Long.compare(r0, r2)
            return r7
    }

    public org.apache.commons.lang3.math.Fraction divideBy(org.apache.commons.lang3.math.Fraction r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "The fraction must not be null"
            org.apache.commons.lang3.Validate.isTrue(r1, r2, r0)
            int r0 = r4.numerator
            if (r0 == 0) goto L1a
            org.apache.commons.lang3.math.Fraction r4 = r4.invert()
            org.apache.commons.lang3.math.Fraction r4 = r3.multiplyBy(r4)
            return r4
        L1a:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r0 = "The fraction to divide by must not be zero"
            r4.<init>(r0)
            throw r4
    }

    @Override // java.lang.Number
    public double doubleValue() {
            r4 = this;
            int r0 = r4.numerator
            double r0 = (double) r0
            int r2 = r4.denominator
            double r2 = (double) r2
            double r0 = r0 / r2
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof org.apache.commons.lang3.math.Fraction
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            org.apache.commons.lang3.math.Fraction r5 = (org.apache.commons.lang3.math.Fraction) r5
            int r1 = r4.getNumerator()
            int r3 = r5.getNumerator()
            if (r1 != r3) goto L21
            int r1 = r4.getDenominator()
            int r5 = r5.getDenominator()
            if (r1 != r5) goto L21
            goto L22
        L21:
            r0 = 0
        L22:
            return r0
    }

    @Override // java.lang.Number
    public float floatValue() {
            r2 = this;
            int r0 = r2.numerator
            float r0 = (float) r0
            int r1 = r2.denominator
            float r1 = (float) r1
            float r0 = r0 / r1
            return r0
    }

    public int getDenominator() {
            r1 = this;
            int r0 = r1.denominator
            return r0
    }

    public int getNumerator() {
            r1 = this;
            int r0 = r1.numerator
            return r0
    }

    public int getProperNumerator() {
            r2 = this;
            int r0 = r2.numerator
            int r1 = r2.denominator
            int r0 = r0 % r1
            int r0 = java.lang.Math.abs(r0)
            return r0
    }

    public int getProperWhole() {
            r2 = this;
            int r0 = r2.numerator
            int r1 = r2.denominator
            int r0 = r0 / r1
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.hashCode
            if (r0 != 0) goto L13
            int r0 = r2.getNumerator()
            int r0 = r0 + 629
            int r0 = r0 * 37
            int r1 = r2.getDenominator()
            int r0 = r0 + r1
            r2.hashCode = r0
        L13:
            int r0 = r2.hashCode
            return r0
    }

    @Override // java.lang.Number
    public int intValue() {
            r2 = this;
            int r0 = r2.numerator
            int r1 = r2.denominator
            int r0 = r0 / r1
            return r0
    }

    public org.apache.commons.lang3.math.Fraction invert() {
            r3 = this;
            int r0 = r3.numerator
            if (r0 == 0) goto L24
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L1c
            if (r0 >= 0) goto L14
            org.apache.commons.lang3.math.Fraction r1 = new org.apache.commons.lang3.math.Fraction
            int r2 = r3.denominator
            int r2 = -r2
            int r0 = -r0
            r1.<init>(r2, r0)
            return r1
        L14:
            org.apache.commons.lang3.math.Fraction r1 = new org.apache.commons.lang3.math.Fraction
            int r2 = r3.denominator
            r1.<init>(r2, r0)
            return r1
        L1c:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "overflow: can't negate numerator"
            r0.<init>(r1)
            throw r0
        L24:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Unable to invert zero."
            r0.<init>(r1)
            throw r0
    }

    @Override // java.lang.Number
    public long longValue() {
            r4 = this;
            int r0 = r4.numerator
            long r0 = (long) r0
            int r2 = r4.denominator
            long r2 = (long) r2
            long r0 = r0 / r2
            return r0
    }

    public org.apache.commons.lang3.math.Fraction multiplyBy(org.apache.commons.lang3.math.Fraction r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "The fraction must not be null"
            org.apache.commons.lang3.Validate.isTrue(r1, r2, r0)
            int r0 = r4.numerator
            if (r0 == 0) goto L3d
            int r1 = r5.numerator
            if (r1 != 0) goto L16
            goto L3d
        L16:
            int r1 = r5.denominator
            int r0 = greatestCommonDivisor(r0, r1)
            int r1 = r5.numerator
            int r2 = r4.denominator
            int r1 = greatestCommonDivisor(r1, r2)
            int r2 = r4.numerator
            int r2 = r2 / r0
            int r3 = r5.numerator
            int r3 = r3 / r1
            int r2 = mulAndCheck(r2, r3)
            int r3 = r4.denominator
            int r3 = r3 / r1
            int r5 = r5.denominator
            int r5 = r5 / r0
            int r5 = mulPosAndCheck(r3, r5)
            org.apache.commons.lang3.math.Fraction r5 = getReducedFraction(r2, r5)
            return r5
        L3d:
            org.apache.commons.lang3.math.Fraction r5 = org.apache.commons.lang3.math.Fraction.ZERO
            return r5
    }

    public org.apache.commons.lang3.math.Fraction negate() {
            r3 = this;
            int r0 = r3.numerator
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto Lf
            org.apache.commons.lang3.math.Fraction r1 = new org.apache.commons.lang3.math.Fraction
            int r0 = -r0
            int r2 = r3.denominator
            r1.<init>(r0, r2)
            return r1
        Lf:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "overflow: too large to negate"
            r0.<init>(r1)
            throw r0
    }

    public org.apache.commons.lang3.math.Fraction pow(int r4) {
            r3 = this;
            r0 = 1
            if (r4 != r0) goto L4
            return r3
        L4:
            if (r4 != 0) goto L9
            org.apache.commons.lang3.math.Fraction r4 = org.apache.commons.lang3.math.Fraction.ONE
            return r4
        L9:
            r0 = 2
            if (r4 >= 0) goto L29
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r1) goto L1f
            org.apache.commons.lang3.math.Fraction r1 = r3.invert()
            org.apache.commons.lang3.math.Fraction r1 = r1.pow(r0)
            int r4 = r4 / r0
            int r4 = -r4
            org.apache.commons.lang3.math.Fraction r4 = r1.pow(r4)
            return r4
        L1f:
            org.apache.commons.lang3.math.Fraction r0 = r3.invert()
            int r4 = -r4
            org.apache.commons.lang3.math.Fraction r4 = r0.pow(r4)
            return r4
        L29:
            org.apache.commons.lang3.math.Fraction r1 = r3.multiplyBy(r3)
            int r2 = r4 % 2
            if (r2 != 0) goto L37
            int r4 = r4 / r0
            org.apache.commons.lang3.math.Fraction r4 = r1.pow(r4)
            return r4
        L37:
            int r4 = r4 / r0
            org.apache.commons.lang3.math.Fraction r4 = r1.pow(r4)     // Catch: java.lang.Throwable -> L41
            org.apache.commons.lang3.math.Fraction r4 = r4.multiplyBy(r3)
            return r4
        L41:
            r4 = move-exception
            throw r4
    }

    public org.apache.commons.lang3.math.Fraction reduce() {
            r3 = this;
            int r0 = r3.numerator
            if (r0 != 0) goto Le
            org.apache.commons.lang3.math.Fraction r0 = org.apache.commons.lang3.math.Fraction.ZERO
            boolean r1 = r3.equals(r0)
            if (r1 == 0) goto Ld
            r0 = r3
        Ld:
            return r0
        Le:
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.denominator
            int r0 = greatestCommonDivisor(r0, r1)
            r1 = 1
            if (r0 != r1) goto L1c
            return r3
        L1c:
            int r1 = r3.numerator
            int r1 = r1 / r0
            int r2 = r3.denominator
            int r2 = r2 / r0
            org.apache.commons.lang3.math.Fraction r0 = getFraction(r1, r2)
            return r0
    }

    public org.apache.commons.lang3.math.Fraction subtract(org.apache.commons.lang3.math.Fraction r2) {
            r1 = this;
            r0 = 0
            org.apache.commons.lang3.math.Fraction r2 = r1.addSub(r2, r0)
            return r2
    }

    public java.lang.String toProperString() {
            r4 = this;
            java.lang.String r0 = r4.toProperString
            if (r0 != 0) goto L79
            int r0 = r4.numerator
            if (r0 != 0) goto Ld
            java.lang.String r0 = "0"
            r4.toProperString = r0
            goto L79
        Ld:
            int r1 = r4.denominator
            if (r0 != r1) goto L16
            java.lang.String r0 = "1"
            r4.toProperString = r0
            goto L79
        L16:
            int r2 = r1 * (-1)
            if (r0 != r2) goto L1f
            java.lang.String r0 = "-1"
            r4.toProperString = r0
            goto L79
        L1f:
            if (r0 <= 0) goto L22
            int r0 = -r0
        L22:
            int r1 = -r1
            java.lang.String r2 = "/"
            if (r0 >= r1) goto L5d
            int r0 = r4.getProperNumerator()
            if (r0 != 0) goto L38
            int r0 = r4.getProperWhole()
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r4.toProperString = r0
            goto L79
        L38:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r3 = r4.getProperWhole()
            r1.append(r3)
            java.lang.String r3 = " "
            r1.append(r3)
            r1.append(r0)
            r1.append(r2)
            int r0 = r4.getDenominator()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.toProperString = r0
            goto L79
        L5d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r4.getNumerator()
            r0.append(r1)
            r0.append(r2)
            int r1 = r4.getDenominator()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.toProperString = r0
        L79:
            java.lang.String r0 = r4.toProperString
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.toString
            if (r0 != 0) goto L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.getNumerator()
            r0.append(r1)
            java.lang.String r1 = "/"
            r0.append(r1)
            int r1 = r2.getDenominator()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.toString = r0
        L22:
            java.lang.String r0 = r2.toString
            return r0
    }
}
