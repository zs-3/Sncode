package com.googlecode.mp4parser.boxes.apple;

/* loaded from: classes2.dex */
public abstract class AppleVariableSignedIntegerBox extends com.googlecode.mp4parser.boxes.apple.AppleDataBox {
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    int intLength;
    long value;

    static {
            ajc$preClinit()
            return
    }

    protected AppleVariableSignedIntegerBox(java.lang.String r2) {
            r1 = this;
            r0 = 15
            r1.<init>(r2, r0)
            r2 = 1
            r1.intLength = r2
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox> r0 = com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox.class
            java.lang.String r1 = "AppleVariableSignedIntegerBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getIntLength"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 19
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setIntLength"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "intLength"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 23
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getValue"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 27
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setValue"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "value"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 36
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox.ajc$tjp_3 = r0
            return
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected int getDataLength() {
            r1 = this;
            int r0 = r1.intLength
            return r0
    }

    public int getIntLength() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.intLength
            return r0
    }

    public long getValue() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            boolean r0 = r2.isParsed()
            if (r0 != 0) goto L16
            r2.parseDetails()
        L16:
            long r0 = r2.value
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected void parseData(java.nio.ByteBuffer r4) {
            r3 = this;
            int r0 = r4.remaining()
            long r1 = com.coremedia.iso.IsoTypeReaderVariable.read(r4, r0)
            r3.value = r1
            r3.intLength = r0
            return
    }

    public void setIntLength(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox.ajc$tjp_1
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.intLength = r3
            return
    }

    public void setValue(long r4) {
            r3 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox.ajc$tjp_3
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r4)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r3, r3, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r0 = 127(0x7f, double:6.27E-322)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L21
            r0 = -128(0xffffffffffffff80, double:NaN)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L21
            r0 = 1
            r3.intLength = r0
            goto L4e
        L21:
            r0 = 32767(0x7fff, double:1.6189E-319)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L35
            r0 = -32768(0xffffffffffff8000, double:NaN)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L35
            int r0 = r3.intLength
            r1 = 2
            if (r0 >= r1) goto L35
            r3.intLength = r1
            goto L4e
        L35:
            r0 = 8388607(0x7fffff, double:4.1445225E-317)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L4b
            r0 = -8388608(0xffffffffff800000, double:NaN)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L4b
            int r0 = r3.intLength
            r1 = 3
            if (r0 >= r1) goto L4b
            r3.intLength = r1
            goto L4e
        L4b:
            r0 = 4
            r3.intLength = r0
        L4e:
            r3.value = r4
            return
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected byte[] writeData() {
            r4 = this;
            int r0 = r4.getDataLength()
            byte[] r1 = new byte[r0]
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            long r2 = r4.value
            com.coremedia.iso.IsoTypeWriterVariable.write(r2, r1, r0)
            byte[] r0 = r1.array()
            return r0
    }
}
