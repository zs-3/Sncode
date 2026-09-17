package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class StringBuilder implements java.lang.Appendable, java.lang.CharSequence {
    private static final char[] digits = null;
    public char[] chars;
    public int length;

    static {
            r0 = 10
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57} // fill-array
            com.badlogic.gdx.utils.StringBuilder.digits = r0
            return
    }

    public StringBuilder() {
            r1 = this;
            r1.<init>()
            r0 = 16
            char[] r0 = new char[r0]
            r1.chars = r0
            return
    }

    public StringBuilder(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 < 0) goto La
            char[] r1 = new char[r1]
            r0.chars = r1
            return
        La:
            java.lang.NegativeArraySizeException r1 = new java.lang.NegativeArraySizeException
            r1.<init>()
            throw r1
    }

    public StringBuilder(java.lang.String r4) {
            r3 = this;
            r3.<init>()
            int r0 = r4.length()
            r3.length = r0
            int r1 = r0 + 16
            char[] r1 = new char[r1]
            r3.chars = r1
            r2 = 0
            r4.getChars(r2, r0, r1, r2)
            return
    }

    private void enlargeBuffer(int r4) {
            r3 = this;
            char[] r0 = r3.chars
            int r1 = r0.length
            int r1 = r1 >> 1
            int r2 = r0.length
            int r1 = r1 + r2
            int r1 = r1 + 2
            if (r4 <= r1) goto Lc
            goto Ld
        Lc:
            r4 = r1
        Ld:
            char[] r4 = new char[r4]
            int r1 = r3.length
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            r3.chars = r4
            return
    }

    private void move(int r4, int r5) {
            r3 = this;
            char[] r0 = r3.chars
            int r1 = r0.length
            int r2 = r3.length
            int r1 = r1 - r2
            if (r1 < r4) goto Le
            int r4 = r4 + r5
            int r2 = r2 - r5
            java.lang.System.arraycopy(r0, r5, r0, r4, r2)
            return
        Le:
            int r2 = r2 + r4
            int r1 = r0.length
            int r1 = r1 << 1
            int r1 = r1 + 2
            if (r2 <= r1) goto L17
            goto L18
        L17:
            r2 = r1
        L18:
            char[] r1 = new char[r2]
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r1, r2, r5)
            char[] r0 = r3.chars
            int r4 = r4 + r5
            int r2 = r3.length
            int r2 = r2 - r5
            java.lang.System.arraycopy(r0, r5, r1, r4, r2)
            r3.chars = r1
            return
    }

    public static int numChars(int r1, int r2) {
            if (r1 >= 0) goto L4
            r0 = 2
            goto L5
        L4:
            r0 = 1
        L5:
            int r1 = r1 / r2
            if (r1 == 0) goto Lb
            int r0 = r0 + 1
            goto L5
        Lb:
            return r0
    }

    public static int numChars(long r5, int r7) {
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8
            r2 = 2
            goto L9
        L8:
            r2 = 1
        L9:
            long r3 = (long) r7
            long r5 = r5 / r3
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 == 0) goto L12
            int r2 = r2 + 1
            goto L9
        L12:
            return r2
    }

    @Override // java.lang.Appendable
    public com.badlogic.gdx.utils.StringBuilder append(char r1) {
            r0 = this;
            r0.append0(r1)
            return r0
    }

    public com.badlogic.gdx.utils.StringBuilder append(double r1) {
            r0 = this;
            java.lang.String r1 = java.lang.Double.toString(r1)
            r0.append0(r1)
            return r0
    }

    public com.badlogic.gdx.utils.StringBuilder append(float r1) {
            r0 = this;
            java.lang.String r1 = java.lang.Float.toString(r1)
            r0.append0(r1)
            return r0
    }

    public com.badlogic.gdx.utils.StringBuilder append(int r2) {
            r1 = this;
            r0 = 0
            com.badlogic.gdx.utils.StringBuilder r2 = r1.append(r2, r0)
            return r2
    }

    public com.badlogic.gdx.utils.StringBuilder append(int r2, int r3) {
            r1 = this;
            r0 = 48
            com.badlogic.gdx.utils.StringBuilder r2 = r1.append(r2, r3, r0)
            return r2
    }

    public com.badlogic.gdx.utils.StringBuilder append(int r7, int r8, char r9) {
            r6 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 != r0) goto La
            java.lang.String r7 = "-2147483648"
            r6.append0(r7)
            return r6
        La:
            if (r7 >= 0) goto L12
            r0 = 45
            r6.append0(r0)
            int r7 = -r7
        L12:
            r0 = 1
            r1 = 10
            if (r8 <= r0) goto L24
            int r0 = numChars(r7, r1)
            int r8 = r8 - r0
        L1c:
            if (r8 <= 0) goto L24
            r6.append(r9)
            int r8 = r8 + (-1)
            goto L1c
        L24:
            r8 = 10000(0x2710, float:1.4013E-41)
            if (r7 < r8) goto L86
            r9 = 1000000000(0x3b9aca00, float:0.0047237873)
            if (r7 < r9) goto L40
            char[] r0 = com.badlogic.gdx.utils.StringBuilder.digits
            long r2 = (long) r7
            r4 = 10000000000(0x2540be400, double:4.9406564584E-314)
            long r2 = r2 % r4
            r4 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r2 = r2 / r4
            int r3 = (int) r2
            char r0 = r0[r3]
            r6.append0(r0)
        L40:
            r0 = 100000000(0x5f5e100, float:2.3122341E-35)
            if (r7 < r0) goto L4f
            char[] r2 = com.badlogic.gdx.utils.StringBuilder.digits
            int r9 = r7 % r9
            int r9 = r9 / r0
            char r9 = r2[r9]
            r6.append0(r9)
        L4f:
            r9 = 10000000(0x989680, float:1.4012985E-38)
            if (r7 < r9) goto L5e
            char[] r2 = com.badlogic.gdx.utils.StringBuilder.digits
            int r0 = r7 % r0
            int r0 = r0 / r9
            char r0 = r2[r0]
            r6.append0(r0)
        L5e:
            r0 = 1000000(0xf4240, float:1.401298E-39)
            if (r7 < r0) goto L6d
            char[] r2 = com.badlogic.gdx.utils.StringBuilder.digits
            int r9 = r7 % r9
            int r9 = r9 / r0
            char r9 = r2[r9]
            r6.append0(r9)
        L6d:
            r9 = 100000(0x186a0, float:1.4013E-40)
            if (r7 < r9) goto L7c
            char[] r2 = com.badlogic.gdx.utils.StringBuilder.digits
            int r0 = r7 % r0
            int r0 = r0 / r9
            char r0 = r2[r0]
            r6.append0(r0)
        L7c:
            char[] r0 = com.badlogic.gdx.utils.StringBuilder.digits
            int r9 = r7 % r9
            int r9 = r9 / r8
            char r8 = r0[r9]
            r6.append0(r8)
        L86:
            r8 = 1000(0x3e8, float:1.401E-42)
            if (r7 < r8) goto L94
            char[] r9 = com.badlogic.gdx.utils.StringBuilder.digits
            int r0 = r7 % 10000
            int r0 = r0 / r8
            char r8 = r9[r0]
            r6.append0(r8)
        L94:
            r8 = 100
            if (r7 < r8) goto La2
            char[] r9 = com.badlogic.gdx.utils.StringBuilder.digits
            int r0 = r7 % 1000
            int r0 = r0 / r8
            char r8 = r9[r0]
            r6.append0(r8)
        La2:
            if (r7 < r1) goto Lae
            char[] r8 = com.badlogic.gdx.utils.StringBuilder.digits
            int r9 = r7 % 100
            int r9 = r9 / r1
            char r8 = r8[r9]
            r6.append0(r8)
        Lae:
            char[] r8 = com.badlogic.gdx.utils.StringBuilder.digits
            int r7 = r7 % r1
            char r7 = r8[r7]
            r6.append0(r7)
            return r6
    }

    public com.badlogic.gdx.utils.StringBuilder append(long r2) {
            r1 = this;
            r0 = 0
            com.badlogic.gdx.utils.StringBuilder r2 = r1.append(r2, r0)
            return r2
    }

    public com.badlogic.gdx.utils.StringBuilder append(long r2, int r4) {
            r1 = this;
            r0 = 48
            com.badlogic.gdx.utils.StringBuilder r2 = r1.append(r2, r4, r0)
            return r2
    }

    public com.badlogic.gdx.utils.StringBuilder append(long r8, int r10, char r11) {
            r7 = this;
            r0 = -9223372036854775808
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 != 0) goto Lc
            java.lang.String r8 = "-9223372036854775808"
            r7.append0(r8)
            return r7
        Lc:
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 >= 0) goto L18
            r0 = 45
            r7.append0(r0)
            long r8 = -r8
        L18:
            r0 = 1
            if (r10 <= r0) goto L2a
            r0 = 10
            int r0 = numChars(r8, r0)
            int r10 = r10 - r0
        L22:
            if (r10 <= 0) goto L2a
            r7.append(r11)
            int r10 = r10 + (-1)
            goto L22
        L2a:
            r10 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 < 0) goto L153
            r0 = 1000000000000000000(0xde0b6b3a7640000, double:7.832953389245686E-242)
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L4e
            char[] r2 = com.badlogic.gdx.utils.StringBuilder.digits
            double r3 = (double) r8
            r5 = 4891288408196988160(0x43e158e460913d00, double:1.0E19)
            double r3 = r3 % r5
            r5 = 4876203697187506176(0x43abc16d674ec800, double:1.0E18)
            double r3 = r3 / r5
            int r3 = (int) r3
            char r2 = r2[r3]
            r7.append0(r2)
        L4e:
            r2 = 100000000000000000(0x16345785d8a0000, double:5.620395787888205E-302)
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 < 0) goto L62
            char[] r4 = com.badlogic.gdx.utils.StringBuilder.digits
            long r0 = r8 % r0
            long r0 = r0 / r2
            int r1 = (int) r0
            char r0 = r4[r1]
            r7.append0(r0)
        L62:
            r0 = 10000000000000000(0x2386f26fc10000, double:5.431165199810528E-308)
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 < 0) goto L76
            char[] r4 = com.badlogic.gdx.utils.StringBuilder.digits
            long r2 = r8 % r2
            long r2 = r2 / r0
            int r3 = (int) r2
            char r2 = r4[r3]
            r7.append0(r2)
        L76:
            r2 = 1000000000000000(0x38d7ea4c68000, double:4.940656458412465E-309)
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 < 0) goto L8a
            char[] r4 = com.badlogic.gdx.utils.StringBuilder.digits
            long r0 = r8 % r0
            long r0 = r0 / r2
            int r1 = (int) r0
            char r0 = r4[r1]
            r7.append0(r0)
        L8a:
            r0 = 100000000000000(0x5af3107a4000, double:4.94065645841247E-310)
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 < 0) goto L9e
            char[] r4 = com.badlogic.gdx.utils.StringBuilder.digits
            long r2 = r8 % r2
            long r2 = r2 / r0
            int r3 = (int) r2
            char r2 = r4[r3]
            r7.append0(r2)
        L9e:
            r2 = 10000000000000(0x9184e72a000, double:4.9406564584125E-311)
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 < 0) goto Lb2
            char[] r4 = com.badlogic.gdx.utils.StringBuilder.digits
            long r0 = r8 % r0
            long r0 = r0 / r2
            int r1 = (int) r0
            char r0 = r4[r1]
            r7.append0(r0)
        Lb2:
            r0 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 < 0) goto Lc6
            char[] r4 = com.badlogic.gdx.utils.StringBuilder.digits
            long r2 = r8 % r2
            long r2 = r2 / r0
            int r3 = (int) r2
            char r2 = r4[r3]
            r7.append0(r2)
        Lc6:
            r2 = 100000000000(0x174876e800, double:4.9406564584E-313)
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 < 0) goto Lda
            char[] r4 = com.badlogic.gdx.utils.StringBuilder.digits
            long r0 = r8 % r0
            long r0 = r0 / r2
            int r1 = (int) r0
            char r0 = r4[r1]
            r7.append0(r0)
        Lda:
            r0 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 < 0) goto Lee
            char[] r4 = com.badlogic.gdx.utils.StringBuilder.digits
            long r2 = r8 % r2
            long r2 = r2 / r0
            int r3 = (int) r2
            char r2 = r4[r3]
            r7.append0(r2)
        Lee:
            r2 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 < 0) goto L100
            char[] r4 = com.badlogic.gdx.utils.StringBuilder.digits
            long r0 = r8 % r0
            long r0 = r0 / r2
            int r1 = (int) r0
            char r0 = r4[r1]
            r7.append0(r0)
        L100:
            r0 = 100000000(0x5f5e100, double:4.94065646E-316)
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 < 0) goto L112
            char[] r4 = com.badlogic.gdx.utils.StringBuilder.digits
            long r2 = r8 % r2
            long r2 = r2 / r0
            int r3 = (int) r2
            char r2 = r4[r3]
            r7.append0(r2)
        L112:
            r2 = 10000000(0x989680, double:4.9406565E-317)
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 < 0) goto L124
            char[] r4 = com.badlogic.gdx.utils.StringBuilder.digits
            long r0 = r8 % r0
            long r0 = r0 / r2
            int r1 = (int) r0
            char r0 = r4[r1]
            r7.append0(r0)
        L124:
            r0 = 1000000(0xf4240, double:4.940656E-318)
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 < 0) goto L136
            char[] r4 = com.badlogic.gdx.utils.StringBuilder.digits
            long r2 = r8 % r2
            long r2 = r2 / r0
            int r3 = (int) r2
            char r2 = r4[r3]
            r7.append0(r2)
        L136:
            r2 = 100000(0x186a0, double:4.94066E-319)
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 < 0) goto L148
            char[] r4 = com.badlogic.gdx.utils.StringBuilder.digits
            long r0 = r8 % r0
            long r0 = r0 / r2
            int r1 = (int) r0
            char r0 = r4[r1]
            r7.append0(r0)
        L148:
            char[] r0 = com.badlogic.gdx.utils.StringBuilder.digits
            long r1 = r8 % r2
            long r1 = r1 / r10
            int r2 = (int) r1
            char r0 = r0[r2]
            r7.append0(r0)
        L153:
            r0 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L164
            char[] r2 = com.badlogic.gdx.utils.StringBuilder.digits
            long r10 = r8 % r10
            long r10 = r10 / r0
            int r11 = (int) r10
            char r10 = r2[r11]
            r7.append0(r10)
        L164:
            r10 = 100
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 < 0) goto L175
            char[] r2 = com.badlogic.gdx.utils.StringBuilder.digits
            long r0 = r8 % r0
            long r0 = r0 / r10
            int r1 = (int) r0
            char r0 = r2[r1]
            r7.append0(r0)
        L175:
            r0 = 10
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L186
            char[] r2 = com.badlogic.gdx.utils.StringBuilder.digits
            long r10 = r8 % r10
            long r10 = r10 / r0
            int r11 = (int) r10
            char r10 = r2[r11]
            r7.append0(r10)
        L186:
            char[] r10 = com.badlogic.gdx.utils.StringBuilder.digits
            long r8 = r8 % r0
            int r9 = (int) r8
            char r8 = r10[r9]
            r7.append0(r8)
            return r7
    }

    public com.badlogic.gdx.utils.StringBuilder append(com.badlogic.gdx.utils.StringBuilder r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r2.appendNull()
            goto Le
        L6:
            char[] r0 = r3.chars
            r1 = 0
            int r3 = r3.length
            r2.append0(r0, r1, r3)
        Le:
            return r2
    }

    @Override // java.lang.Appendable
    public com.badlogic.gdx.utils.StringBuilder append(java.lang.CharSequence r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r2.appendNull()
            goto L1c
        L6:
            boolean r0 = r3 instanceof com.badlogic.gdx.utils.StringBuilder
            if (r0 == 0) goto L15
            com.badlogic.gdx.utils.StringBuilder r3 = (com.badlogic.gdx.utils.StringBuilder) r3
            char[] r0 = r3.chars
            r1 = 0
            int r3 = r3.length
            r2.append0(r0, r1, r3)
            goto L1c
        L15:
            java.lang.String r3 = r3.toString()
            r2.append0(r3)
        L1c:
            return r2
    }

    @Override // java.lang.Appendable
    public com.badlogic.gdx.utils.StringBuilder append(java.lang.CharSequence r1, int r2, int r3) {
            r0 = this;
            r0.append0(r1, r2, r3)
            return r0
    }

    public com.badlogic.gdx.utils.StringBuilder append(java.lang.Object r1) {
            r0 = this;
            if (r1 != 0) goto L6
            r0.appendNull()
            goto Ld
        L6:
            java.lang.String r1 = r1.toString()
            r0.append0(r1)
        Ld:
            return r0
    }

    public com.badlogic.gdx.utils.StringBuilder append(java.lang.String r1) {
            r0 = this;
            r0.append0(r1)
            return r0
    }

    public com.badlogic.gdx.utils.StringBuilder append(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            java.lang.String r1 = "true"
            goto L7
        L5:
            java.lang.String r1 = "false"
        L7:
            r0.append0(r1)
            return r0
    }

    public com.badlogic.gdx.utils.StringBuilder append(char[] r1) {
            r0 = this;
            r0.append0(r1)
            return r0
    }

    @Override // java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(char r1) throws java.io.IOException {
            r0 = this;
            com.badlogic.gdx.utils.StringBuilder r1 = r0.append(r1)
            return r1
    }

    @Override // java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1) throws java.io.IOException {
            r0 = this;
            com.badlogic.gdx.utils.StringBuilder r1 = r0.append(r1)
            return r1
    }

    @Override // java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            com.badlogic.gdx.utils.StringBuilder r1 = r0.append(r1, r2, r3)
            return r1
    }

    final void append0(char r4) {
            r3 = this;
            int r0 = r3.length
            char[] r1 = r3.chars
            int r1 = r1.length
            if (r0 != r1) goto Lc
            int r0 = r0 + 1
            r3.enlargeBuffer(r0)
        Lc:
            char[] r0 = r3.chars
            int r1 = r3.length
            int r2 = r1 + 1
            r3.length = r2
            r0[r1] = r4
            return
    }

    final void append0(java.lang.CharSequence r2, int r3, int r4) {
            r1 = this;
            if (r2 != 0) goto L4
            java.lang.String r2 = "null"
        L4:
            if (r3 < 0) goto L1c
            if (r4 < 0) goto L1c
            if (r3 > r4) goto L1c
            int r0 = r2.length()
            if (r4 > r0) goto L1c
            java.lang.CharSequence r2 = r2.subSequence(r3, r4)
            java.lang.String r2 = r2.toString()
            r1.append0(r2)
            return
        L1c:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    final void append0(java.lang.String r6) {
            r5 = this;
            if (r6 != 0) goto L6
            r5.appendNull()
            return
        L6:
            int r0 = r6.length()
            int r1 = r5.length
            int r1 = r1 + r0
            char[] r2 = r5.chars
            int r2 = r2.length
            if (r1 <= r2) goto L15
            r5.enlargeBuffer(r1)
        L15:
            r2 = 0
            char[] r3 = r5.chars
            int r4 = r5.length
            r6.getChars(r2, r0, r3, r4)
            r5.length = r1
            return
    }

    final void append0(char[] r6) {
            r5 = this;
            int r0 = r5.length
            int r1 = r6.length
            int r0 = r0 + r1
            char[] r1 = r5.chars
            int r1 = r1.length
            if (r0 <= r1) goto Lc
            r5.enlargeBuffer(r0)
        Lc:
            r1 = 0
            char[] r2 = r5.chars
            int r3 = r5.length
            int r4 = r6.length
            java.lang.System.arraycopy(r6, r1, r2, r3, r4)
            r5.length = r0
            return
    }

    final void append0(char[] r4, int r5, int r6) {
            r3 = this;
            int r0 = r4.length
            if (r5 > r0) goto L37
            if (r5 < 0) goto L37
            if (r6 < 0) goto L20
            int r0 = r4.length
            int r0 = r0 - r5
            if (r0 < r6) goto L20
            int r0 = r3.length
            int r0 = r0 + r6
            char[] r1 = r3.chars
            int r1 = r1.length
            if (r0 <= r1) goto L16
            r3.enlargeBuffer(r0)
        L16:
            char[] r1 = r3.chars
            int r2 = r3.length
            java.lang.System.arraycopy(r4, r5, r1, r2, r6)
            r3.length = r0
            return
        L20:
            java.lang.ArrayIndexOutOfBoundsException r4 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Length out of bounds: "
            r5.append(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L37:
            java.lang.ArrayIndexOutOfBoundsException r4 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Offset out of bounds: "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
    }

    final void appendNull() {
            r4 = this;
            int r0 = r4.length
            int r0 = r0 + 4
            char[] r1 = r4.chars
            int r1 = r1.length
            if (r0 <= r1) goto Lc
            r4.enlargeBuffer(r0)
        Lc:
            char[] r0 = r4.chars
            int r1 = r4.length
            int r2 = r1 + 1
            r4.length = r2
            r3 = 110(0x6e, float:1.54E-43)
            r0[r1] = r3
            int r1 = r2 + 1
            r4.length = r1
            r3 = 117(0x75, float:1.64E-43)
            r0[r2] = r3
            int r2 = r1 + 1
            r4.length = r2
            r3 = 108(0x6c, float:1.51E-43)
            r0[r1] = r3
            int r1 = r2 + 1
            r4.length = r1
            r0[r2] = r3
            return
    }

    @Override // java.lang.CharSequence
    public char charAt(int r2) {
            r1 = this;
            if (r2 < 0) goto Lb
            int r0 = r1.length
            if (r2 >= r0) goto Lb
            char[] r0 = r1.chars
            char r2 = r0[r2]
            return r2
        Lb:
            java.lang.StringIndexOutOfBoundsException r0 = new java.lang.StringIndexOutOfBoundsException
            r0.<init>(r2)
            throw r0
    }

    public void clear() {
            r1 = this;
            r0 = 0
            r1.length = r0
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 != 0) goto L8
            return r1
        L8:
            java.lang.Class r2 = r7.getClass()
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L13
            return r1
        L13:
            com.badlogic.gdx.utils.StringBuilder r8 = (com.badlogic.gdx.utils.StringBuilder) r8
            int r2 = r7.length
            int r3 = r8.length
            if (r2 == r3) goto L1c
            return r1
        L1c:
            char[] r3 = r7.chars
            char[] r8 = r8.chars
            r4 = 0
        L21:
            if (r4 >= r2) goto L2d
            char r5 = r3[r4]
            char r6 = r8[r4]
            if (r5 == r6) goto L2a
            return r1
        L2a:
            int r4 = r4 + 1
            goto L21
        L2d:
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.length
            int r0 = r0 + 31
            r1 = 0
        L5:
            int r2 = r3.length
            if (r1 >= r2) goto L13
            int r0 = r0 * 31
            char[] r2 = r3.chars
            char r2 = r2[r1]
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L5
        L13:
            return r0
    }

    public int indexOf(java.lang.String r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.indexOf(r2, r0)
            return r2
    }

    public int indexOf(java.lang.String r11, int r12) {
            r10 = this;
            r0 = 0
            if (r12 >= 0) goto L4
            r12 = 0
        L4:
            int r1 = r11.length()
            if (r1 != 0) goto L13
            int r11 = r10.length
            if (r12 < r11) goto L12
            if (r12 != 0) goto L11
            goto L12
        L11:
            r12 = r11
        L12:
            return r12
        L13:
            int r2 = r10.length
            int r2 = r2 - r1
            r3 = -1
            if (r12 <= r2) goto L1a
            return r3
        L1a:
            char r4 = r11.charAt(r0)
        L1e:
            r5 = 1
            if (r12 > r2) goto L2c
            char[] r6 = r10.chars
            char r6 = r6[r12]
            if (r6 != r4) goto L29
            r6 = 1
            goto L2d
        L29:
            int r12 = r12 + 1
            goto L1e
        L2c:
            r6 = 0
        L2d:
            if (r6 != 0) goto L30
            return r3
        L30:
            r7 = r12
            r6 = 0
        L32:
            int r6 = r6 + r5
            if (r6 >= r1) goto L41
            char[] r8 = r10.chars
            int r7 = r7 + r5
            char r8 = r8[r7]
            char r9 = r11.charAt(r6)
            if (r8 != r9) goto L41
            goto L32
        L41:
            if (r6 != r1) goto L29
            return r12
    }

    final void insert0(int r4, java.lang.String r5) {
            r3 = this;
            if (r4 < 0) goto L1f
            int r0 = r3.length
            if (r4 > r0) goto L1f
            if (r5 != 0) goto La
            java.lang.String r5 = "null"
        La:
            int r0 = r5.length()
            if (r0 == 0) goto L1e
            r3.move(r0, r4)
            r1 = 0
            char[] r2 = r3.chars
            r5.getChars(r1, r0, r2, r4)
            int r4 = r3.length
            int r4 = r4 + r0
            r3.length = r4
        L1e:
            return
        L1f:
            java.lang.StringIndexOutOfBoundsException r5 = new java.lang.StringIndexOutOfBoundsException
            r5.<init>(r4)
            throw r5
    }

    @Override // java.lang.CharSequence
    public int length() {
            r1 = this;
            int r0 = r1.length
            return r0
    }

    public com.badlogic.gdx.utils.StringBuilder replace(char r4, java.lang.String r5) {
            r3 = this;
            int r0 = r5.length()
            r1 = 0
        L5:
            int r2 = r3.length
            if (r1 != r2) goto La
            return r3
        La:
            char[] r2 = r3.chars
            char r2 = r2[r1]
            if (r2 != r4) goto L17
            int r2 = r1 + 1
            r3.replace0(r1, r2, r5)
            int r1 = r1 + r0
            goto L5
        L17:
            int r1 = r1 + 1
            goto L5
    }

    final void replace0(int r6, int r7, java.lang.String r8) {
            r5 = this;
            if (r6 < 0) goto L38
            int r0 = r5.length
            if (r7 <= r0) goto L7
            r7 = r0
        L7:
            if (r7 <= r6) goto L2f
            int r0 = r8.length()
            int r1 = r7 - r6
            int r1 = r1 - r0
            if (r1 <= 0) goto L1d
            char[] r2 = r5.chars
            int r3 = r6 + r0
            int r4 = r5.length
            int r4 = r4 - r7
            java.lang.System.arraycopy(r2, r7, r2, r3, r4)
            goto L23
        L1d:
            if (r1 >= 0) goto L23
            int r2 = -r1
            r5.move(r2, r7)
        L23:
            r7 = 0
            char[] r2 = r5.chars
            r8.getChars(r7, r0, r2, r6)
            int r6 = r5.length
            int r6 = r6 - r1
            r5.length = r6
            return
        L2f:
            if (r6 != r7) goto L38
            java.util.Objects.requireNonNull(r8)
            r5.insert0(r6, r8)
            return
        L38:
            java.lang.StringIndexOutOfBoundsException r6 = new java.lang.StringIndexOutOfBoundsException
            r6.<init>()
            throw r6
    }

    public void setLength(int r4) {
            r3 = this;
            if (r4 < 0) goto L16
            char[] r0 = r3.chars
            int r1 = r0.length
            if (r4 <= r1) goto Lb
            r3.enlargeBuffer(r4)
            goto L13
        Lb:
            int r1 = r3.length
            if (r1 >= r4) goto L13
            r2 = 0
            java.util.Arrays.fill(r0, r1, r4, r2)
        L13:
            r3.length = r4
            return
        L16:
            java.lang.StringIndexOutOfBoundsException r0 = new java.lang.StringIndexOutOfBoundsException
            r0.<init>(r4)
            throw r0
    }

    @Override // java.lang.CharSequence
    public java.lang.CharSequence subSequence(int r1, int r2) {
            r0 = this;
            java.lang.String r1 = r0.substring(r1, r2)
            return r1
    }

    public java.lang.String substring(int r3, int r4) {
            r2 = this;
            if (r3 < 0) goto L16
            if (r3 > r4) goto L16
            int r0 = r2.length
            if (r4 > r0) goto L16
            if (r3 != r4) goto Ld
            java.lang.String r3 = ""
            return r3
        Ld:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r2.chars
            int r4 = r4 - r3
            r0.<init>(r1, r3, r4)
            return r0
        L16:
            java.lang.StringIndexOutOfBoundsException r3 = new java.lang.StringIndexOutOfBoundsException
            r3.<init>()
            throw r3
    }

    @Override // java.lang.CharSequence
    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.length
            if (r0 != 0) goto L7
            java.lang.String r0 = ""
            return r0
        L7:
            java.lang.String r1 = new java.lang.String
            char[] r2 = r4.chars
            r3 = 0
            r1.<init>(r2, r3, r0)
            return r1
    }
}
