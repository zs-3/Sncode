package com.googlecode.mp4parser.boxes.apple;

/* loaded from: classes2.dex */
public abstract class Utf8AppleDataBox extends com.googlecode.mp4parser.boxes.apple.AppleDataBox {
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    java.lang.String value;

    static {
            ajc$preClinit()
            return
    }

    protected Utf8AppleDataBox(java.lang.String r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.googlecode.mp4parser.boxes.apple.Utf8AppleDataBox> r0 = com.googlecode.mp4parser.boxes.apple.Utf8AppleDataBox.class
            java.lang.String r1 = "Utf8AppleDataBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getValue"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.Utf8AppleDataBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 21
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.Utf8AppleDataBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setValue"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.Utf8AppleDataBox"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "value"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 30
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.Utf8AppleDataBox.ajc$tjp_1 = r0
            return
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected int getDataLength() {
            r2 = this;
            java.lang.String r0 = r2.value
            java.lang.String r1 = "UTF-8"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            byte[] r0 = r0.getBytes(r1)
            int r0 = r0.length
            return r0
    }

    public java.lang.String getValue() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.Utf8AppleDataBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            boolean r0 = r2.isParsed()
            if (r0 != 0) goto L16
            r2.parseDetails()
        L16:
            java.lang.String r0 = r2.value
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected void parseData(java.nio.ByteBuffer r2) {
            r1 = this;
            int r0 = r2.remaining()
            java.lang.String r2 = com.coremedia.iso.IsoTypeReader.readString(r2, r0)
            r1.value = r2
            return
    }

    public void setValue(java.lang.String r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.Utf8AppleDataBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.value = r3
            return
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    @com.googlecode.mp4parser.annotations.DoNotParseDetail
    public byte[] writeData() {
            r1 = this;
            java.lang.String r0 = r1.value
            byte[] r0 = com.coremedia.iso.Utf8.convert(r0)
            return r0
    }
}
