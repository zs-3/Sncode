package com.badlogic.gdx.math;

/* loaded from: classes.dex */
public class RandomXS128 extends java.util.Random {
    private long seed0;
    private long seed1;

    public RandomXS128() {
            r2 = this;
            r2.<init>()
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            long r0 = r0.nextLong()
            r2.setSeed(r0)
            return
    }

    private static final long murmurHash3(long r3) {
            r0 = 33
            long r1 = r3 >>> r0
            long r3 = r3 ^ r1
            r1 = -49064778989728563(0xff51afd7ed558ccd, double:-1.9406492979739223E305)
            long r3 = r3 * r1
            long r1 = r3 >>> r0
            long r3 = r3 ^ r1
            r1 = -4265267296055464877(0xc4ceb9fe1a85ec53, double:-2.902039044684214E23)
            long r3 = r3 * r1
            long r0 = r3 >>> r0
            long r3 = r3 ^ r0
            return r3
    }

    @Override // java.util.Random
    protected final int next(int r7) {
            r6 = this;
            long r0 = r6.nextLong()
            r2 = 1
            long r4 = r2 << r7
            long r4 = r4 - r2
            long r0 = r0 & r4
            int r7 = (int) r0
            return r7
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
            r5 = this;
            long r0 = r5.nextLong()
            r2 = 1
            long r0 = r0 & r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    @Override // java.util.Random
    public void nextBytes(byte[] r7) {
            r6 = this;
            int r0 = r7.length
        L1:
            if (r0 == 0) goto L1c
            r1 = 8
            if (r0 >= r1) goto L9
            r2 = r0
            goto Lb
        L9:
            r2 = 8
        Lb:
            long r3 = r6.nextLong()
        Lf:
            int r5 = r2 + (-1)
            if (r2 == 0) goto L1
            int r0 = r0 + (-1)
            int r2 = (int) r3
            byte r2 = (byte) r2
            r7[r0] = r2
            long r3 = r3 >> r1
            r2 = r5
            goto Lf
        L1c:
            return
    }

    @Override // java.util.Random
    public double nextDouble() {
            r4 = this;
            long r0 = r4.nextLong()
            r2 = 11
            long r0 = r0 >>> r2
            double r0 = (double) r0
            r2 = 4368491638549381120(0x3ca0000000000000, double:1.1102230246251565E-16)
            double r0 = r0 * r2
            return r0
    }

    @Override // java.util.Random
    public float nextFloat() {
            r4 = this;
            long r0 = r4.nextLong()
            r2 = 40
            long r0 = r0 >>> r2
            double r0 = (double) r0
            r2 = 4499096027743125504(0x3e70000000000000, double:5.9604644775390625E-8)
            double r0 = r0 * r2
            float r0 = (float) r0
            return r0
    }

    @Override // java.util.Random
    public int nextInt() {
            r2 = this;
            long r0 = r2.nextLong()
            int r1 = (int) r0
            return r1
    }

    @Override // java.util.Random
    public int nextInt(int r3) {
            r2 = this;
            long r0 = (long) r3
            long r0 = r2.nextLong(r0)
            int r3 = (int) r0
            return r3
    }

    @Override // java.util.Random
    public long nextLong() {
            r7 = this;
            long r0 = r7.seed0
            long r2 = r7.seed1
            r7.seed0 = r2
            r4 = 23
            long r4 = r0 << r4
            long r0 = r0 ^ r4
            long r4 = r0 ^ r2
            r6 = 17
            long r0 = r0 >>> r6
            long r0 = r0 ^ r4
            r4 = 26
            long r4 = r2 >>> r4
            long r0 = r0 ^ r4
            r7.seed1 = r0
            long r0 = r0 + r2
            return r0
    }

    public long nextLong(long r9) {
            r8 = this;
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L19
        L6:
            long r2 = r8.nextLong()
            r4 = 1
            long r2 = r2 >>> r4
            long r4 = r2 % r9
            long r2 = r2 - r4
            r6 = 1
            long r6 = r9 - r6
            long r2 = r2 + r6
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 < 0) goto L6
            return r4
        L19:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "n must be positive"
            r9.<init>(r10)
            throw r9
    }

    @Override // java.util.Random
    public void setSeed(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L8
            r4 = -9223372036854775808
        L8:
            long r4 = murmurHash3(r4)
            long r0 = murmurHash3(r4)
            r3.setState(r4, r0)
            return
    }

    public void setState(long r1, long r3) {
            r0 = this;
            r0.seed0 = r1
            r0.seed1 = r3
            return
    }
}
