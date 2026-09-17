package com.googlecode.mp4parser.boxes.apple;

/* loaded from: classes2.dex */
public class AppleGPSCoordinatesBox extends com.googlecode.mp4parser.AbstractBox {
    private static final int DEFAULT_LANG = 5575;
    public static final java.lang.String TYPE = "©xyz";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    java.lang.String coords;
    int lang;

    static {
            ajc$preClinit()
            return
    }

    public AppleGPSCoordinatesBox() {
            r1 = this;
            java.lang.String r0 = "©xyz"
            r1.<init>(r0)
            r0 = 5575(0x15c7, float:7.812E-42)
            r1.lang = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.googlecode.mp4parser.boxes.apple.AppleGPSCoordinatesBox> r0 = com.googlecode.mp4parser.boxes.apple.AppleGPSCoordinatesBox.class
            java.lang.String r1 = "AppleGPSCoordinatesBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getValue"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.AppleGPSCoordinatesBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 22
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.AppleGPSCoordinatesBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setValue"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.AppleGPSCoordinatesBox"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "iso6709String"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 26
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.AppleGPSCoordinatesBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.AppleGPSCoordinatesBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 52
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.AppleGPSCoordinatesBox.ajc$tjp_2 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(java.nio.ByteBuffer r3) {
            r2 = this;
            short r0 = r3.getShort()
            short r1 = r3.getShort()
            r2.lang = r1
            byte[] r0 = new byte[r0]
            r3.get(r0)
            java.lang.String r3 = com.coremedia.iso.Utf8.convert(r0)
            r2.coords = r3
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r2) {
            r1 = this;
            java.lang.String r0 = r1.coords
            int r0 = r0.length()
            short r0 = (short) r0
            r2.putShort(r0)
            int r0 = r1.lang
            short r0 = (short) r0
            r2.putShort(r0)
            java.lang.String r0 = r1.coords
            byte[] r0 = com.coremedia.iso.Utf8.convert(r0)
            r2.put(r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            java.lang.String r0 = r2.coords
            int r0 = com.coremedia.iso.Utf8.utf8StringLengthInBytes(r0)
            int r0 = r0 + 4
            long r0 = (long) r0
            return r0
    }

    public java.lang.String getValue() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.AppleGPSCoordinatesBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.String r0 = r2.coords
            return r0
    }

    public void setValue(java.lang.String r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.AppleGPSCoordinatesBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r0 = 5575(0x15c7, float:7.812E-42)
            r2.lang = r0
            r2.coords = r3
            return
    }

    public java.lang.String toString() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.AppleGPSCoordinatesBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AppleGPSCoordinatesBox["
            r0.<init>(r1)
            java.lang.String r1 = r2.coords
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
