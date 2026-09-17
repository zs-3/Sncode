package com.googlecode.mp4parser.util;

/* loaded from: classes2.dex */
public class Matrix {
    public static final com.googlecode.mp4parser.util.Matrix ROTATE_0 = null;
    public static final com.googlecode.mp4parser.util.Matrix ROTATE_180 = null;
    public static final com.googlecode.mp4parser.util.Matrix ROTATE_270 = null;
    public static final com.googlecode.mp4parser.util.Matrix ROTATE_90 = null;
    double a;
    double b;
    double c;
    double d;
    double tx;
    double ty;
    double u;
    double v;
    double w;

    static {
            com.googlecode.mp4parser.util.Matrix r19 = new com.googlecode.mp4parser.util.Matrix
            r0 = r19
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r3 = 0
            r5 = 0
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r9 = 0
            r11 = 0
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r15 = 0
            r17 = 0
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r17)
            com.googlecode.mp4parser.util.Matrix.ROTATE_0 = r19
            com.googlecode.mp4parser.util.Matrix r0 = new com.googlecode.mp4parser.util.Matrix
            r20 = r0
            r21 = 0
            r23 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r25 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r35 = 0
            r37 = 0
            r20.<init>(r21, r23, r25, r27, r29, r31, r33, r35, r37)
            com.googlecode.mp4parser.util.Matrix.ROTATE_90 = r0
            com.googlecode.mp4parser.util.Matrix r0 = new com.googlecode.mp4parser.util.Matrix
            r1 = r0
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r4 = 0
            r6 = 0
            r8 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r10 = 0
            r12 = 0
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r16 = 0
            r18 = 0
            r1.<init>(r2, r4, r6, r8, r10, r12, r14, r16, r18)
            com.googlecode.mp4parser.util.Matrix.ROTATE_180 = r0
            com.googlecode.mp4parser.util.Matrix r0 = new com.googlecode.mp4parser.util.Matrix
            r20 = r0
            r23 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r25 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r20.<init>(r21, r23, r25, r27, r29, r31, r33, r35, r37)
            com.googlecode.mp4parser.util.Matrix.ROTATE_270 = r0
            return
    }

    public Matrix(double r4, double r6, double r8, double r10, double r12, double r14, double r16, double r18, double r20) {
            r3 = this;
            r0 = r3
            r3.<init>()
            r1 = r12
            r0.u = r1
            r1 = r14
            r0.v = r1
            r1 = r16
            r0.w = r1
            r1 = r4
            r0.a = r1
            r1 = r6
            r0.b = r1
            r1 = r8
            r0.c = r1
            r1 = r10
            r0.d = r1
            r1 = r18
            r0.tx = r1
            r1 = r20
            r0.ty = r1
            return
    }

    public static com.googlecode.mp4parser.util.Matrix fromByteBuffer(java.nio.ByteBuffer r18) {
            double r0 = com.coremedia.iso.IsoTypeReader.readFixedPoint1616(r18)
            double r2 = com.coremedia.iso.IsoTypeReader.readFixedPoint1616(r18)
            double r4 = com.coremedia.iso.IsoTypeReader.readFixedPoint0230(r18)
            double r6 = com.coremedia.iso.IsoTypeReader.readFixedPoint1616(r18)
            double r8 = com.coremedia.iso.IsoTypeReader.readFixedPoint1616(r18)
            double r10 = com.coremedia.iso.IsoTypeReader.readFixedPoint0230(r18)
            double r12 = com.coremedia.iso.IsoTypeReader.readFixedPoint1616(r18)
            double r14 = com.coremedia.iso.IsoTypeReader.readFixedPoint1616(r18)
            double r16 = com.coremedia.iso.IsoTypeReader.readFixedPoint0230(r18)
            com.googlecode.mp4parser.util.Matrix r0 = fromFileOrder(r0, r2, r4, r6, r8, r10, r12, r14, r16)
            return r0
    }

    public static com.googlecode.mp4parser.util.Matrix fromFileOrder(double r20, double r22, double r24, double r26, double r28, double r30, double r32, double r34, double r36) {
            r1 = r20
            r3 = r22
            r9 = r24
            r5 = r26
            r7 = r28
            r11 = r30
            r15 = r32
            r17 = r34
            r13 = r36
            com.googlecode.mp4parser.util.Matrix r19 = new com.googlecode.mp4parser.util.Matrix
            r0 = r19
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r17)
            return r19
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L78
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L12
            goto L78
        L12:
            com.googlecode.mp4parser.util.Matrix r7 = (com.googlecode.mp4parser.util.Matrix) r7
            double r2 = r7.a
            double r4 = r6.a
            int r2 = java.lang.Double.compare(r2, r4)
            if (r2 == 0) goto L1f
            return r1
        L1f:
            double r2 = r7.b
            double r4 = r6.b
            int r2 = java.lang.Double.compare(r2, r4)
            if (r2 == 0) goto L2a
            return r1
        L2a:
            double r2 = r7.c
            double r4 = r6.c
            int r2 = java.lang.Double.compare(r2, r4)
            if (r2 == 0) goto L35
            return r1
        L35:
            double r2 = r7.d
            double r4 = r6.d
            int r2 = java.lang.Double.compare(r2, r4)
            if (r2 == 0) goto L40
            return r1
        L40:
            double r2 = r7.tx
            double r4 = r6.tx
            int r2 = java.lang.Double.compare(r2, r4)
            if (r2 == 0) goto L4b
            return r1
        L4b:
            double r2 = r7.ty
            double r4 = r6.ty
            int r2 = java.lang.Double.compare(r2, r4)
            if (r2 == 0) goto L56
            return r1
        L56:
            double r2 = r7.u
            double r4 = r6.u
            int r2 = java.lang.Double.compare(r2, r4)
            if (r2 == 0) goto L61
            return r1
        L61:
            double r2 = r7.v
            double r4 = r6.v
            int r2 = java.lang.Double.compare(r2, r4)
            if (r2 == 0) goto L6c
            return r1
        L6c:
            double r2 = r7.w
            double r4 = r6.w
            int r7 = java.lang.Double.compare(r2, r4)
            if (r7 == 0) goto L77
            return r1
        L77:
            return r0
        L78:
            return r1
    }

    public void getContent(java.nio.ByteBuffer r3) {
            r2 = this;
            double r0 = r2.a
            com.coremedia.iso.IsoTypeWriter.writeFixedPoint1616(r3, r0)
            double r0 = r2.b
            com.coremedia.iso.IsoTypeWriter.writeFixedPoint1616(r3, r0)
            double r0 = r2.u
            com.coremedia.iso.IsoTypeWriter.writeFixedPoint0230(r3, r0)
            double r0 = r2.c
            com.coremedia.iso.IsoTypeWriter.writeFixedPoint1616(r3, r0)
            double r0 = r2.d
            com.coremedia.iso.IsoTypeWriter.writeFixedPoint1616(r3, r0)
            double r0 = r2.v
            com.coremedia.iso.IsoTypeWriter.writeFixedPoint0230(r3, r0)
            double r0 = r2.tx
            com.coremedia.iso.IsoTypeWriter.writeFixedPoint1616(r3, r0)
            double r0 = r2.ty
            com.coremedia.iso.IsoTypeWriter.writeFixedPoint1616(r3, r0)
            double r0 = r2.w
            com.coremedia.iso.IsoTypeWriter.writeFixedPoint0230(r3, r0)
            return
    }

    public int hashCode() {
            r7 = this;
            double r0 = r7.u
            long r0 = java.lang.Double.doubleToLongBits(r0)
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            double r3 = r7.v
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r1 = r1 * 31
            long r5 = r3 >>> r2
            long r3 = r3 ^ r5
            int r0 = (int) r3
            int r1 = r1 + r0
            double r3 = r7.w
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r1 = r1 * 31
            long r5 = r3 >>> r2
            long r3 = r3 ^ r5
            int r0 = (int) r3
            int r1 = r1 + r0
            double r3 = r7.a
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r1 = r1 * 31
            long r5 = r3 >>> r2
            long r3 = r3 ^ r5
            int r0 = (int) r3
            int r1 = r1 + r0
            double r3 = r7.b
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r1 = r1 * 31
            long r5 = r3 >>> r2
            long r3 = r3 ^ r5
            int r0 = (int) r3
            int r1 = r1 + r0
            double r3 = r7.c
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r1 = r1 * 31
            long r5 = r3 >>> r2
            long r3 = r3 ^ r5
            int r0 = (int) r3
            int r1 = r1 + r0
            double r3 = r7.d
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r1 = r1 * 31
            long r5 = r3 >>> r2
            long r3 = r3 ^ r5
            int r0 = (int) r3
            int r1 = r1 + r0
            double r3 = r7.tx
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r1 = r1 * 31
            long r5 = r3 >>> r2
            long r3 = r3 ^ r5
            int r0 = (int) r3
            int r1 = r1 + r0
            double r3 = r7.ty
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r1 = r1 * 31
            long r5 = r3 >>> r2
            long r2 = r3 ^ r5
            int r0 = (int) r2
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            com.googlecode.mp4parser.util.Matrix r0 = com.googlecode.mp4parser.util.Matrix.ROTATE_0
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = "Rotate 0°"
            return r0
        Lb:
            com.googlecode.mp4parser.util.Matrix r0 = com.googlecode.mp4parser.util.Matrix.ROTATE_90
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L16
            java.lang.String r0 = "Rotate 90°"
            return r0
        L16:
            com.googlecode.mp4parser.util.Matrix r0 = com.googlecode.mp4parser.util.Matrix.ROTATE_180
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L21
            java.lang.String r0 = "Rotate 180°"
            return r0
        L21:
            com.googlecode.mp4parser.util.Matrix r0 = com.googlecode.mp4parser.util.Matrix.ROTATE_270
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L2c
            java.lang.String r0 = "Rotate 270°"
            return r0
        L2c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Matrix{u="
            r0.<init>(r1)
            double r1 = r3.u
            r0.append(r1)
            java.lang.String r1 = ", v="
            r0.append(r1)
            double r1 = r3.v
            r0.append(r1)
            java.lang.String r1 = ", w="
            r0.append(r1)
            double r1 = r3.w
            r0.append(r1)
            java.lang.String r1 = ", a="
            r0.append(r1)
            double r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", b="
            r0.append(r1)
            double r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", c="
            r0.append(r1)
            double r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", d="
            r0.append(r1)
            double r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", tx="
            r0.append(r1)
            double r1 = r3.tx
            r0.append(r1)
            java.lang.String r1 = ", ty="
            r0.append(r1)
            double r1 = r3.ty
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
