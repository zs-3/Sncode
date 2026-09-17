package org.jcodec.common.model;

/* loaded from: classes2.dex */
public class Rational {
    public static final org.jcodec.common.model.Rational HALF = null;
    public static final org.jcodec.common.model.Rational ONE = null;
    public static final org.jcodec.common.model.Rational ZERO = null;
    final int den;
    final int num;

    static {
            org.jcodec.common.model.Rational r0 = new org.jcodec.common.model.Rational
            r1 = 1
            r0.<init>(r1, r1)
            org.jcodec.common.model.Rational.ONE = r0
            org.jcodec.common.model.Rational r0 = new org.jcodec.common.model.Rational
            r2 = 2
            r0.<init>(r1, r2)
            org.jcodec.common.model.Rational.HALF = r0
            org.jcodec.common.model.Rational r0 = new org.jcodec.common.model.Rational
            r2 = 0
            r0.<init>(r2, r1)
            org.jcodec.common.model.Rational.ZERO = r0
            return
    }

    public Rational(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.num = r1
            r0.den = r2
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L13
            return r1
        L13:
            org.jcodec.common.model.Rational r5 = (org.jcodec.common.model.Rational) r5
            int r2 = r4.den
            int r3 = r5.den
            if (r2 == r3) goto L1c
            return r1
        L1c:
            int r2 = r4.num
            int r5 = r5.num
            if (r2 == r5) goto L23
            return r1
        L23:
            return r0
    }

    public int getDen() {
            r1 = this;
            int r0 = r1.den
            return r0
    }

    public int getNum() {
            r1 = this;
            int r0 = r1.num
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.den
            r1 = 31
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.num
            int r0 = r0 + r1
            return r0
    }
}
