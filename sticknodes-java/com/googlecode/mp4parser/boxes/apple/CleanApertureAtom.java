package com.googlecode.mp4parser.boxes.apple;

/* loaded from: classes2.dex */
public class CleanApertureAtom extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "clef";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    double height;
    double width;

    static {
            ajc$preClinit()
            return
    }

    public CleanApertureAtom() {
            r1 = this;
            java.lang.String r0 = "clef"
            r1.<init>(r0)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.googlecode.mp4parser.boxes.apple.CleanApertureAtom> r0 = com.googlecode.mp4parser.boxes.apple.CleanApertureAtom.class
            java.lang.String r1 = "CleanApertureAtom.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getWidth"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.CleanApertureAtom"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "double"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 45
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.CleanApertureAtom.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setWidth"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.CleanApertureAtom"
            java.lang.String r4 = "double"
            java.lang.String r5 = "width"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 49
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.CleanApertureAtom.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getHeight"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.CleanApertureAtom"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "double"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 53
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.CleanApertureAtom.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setHeight"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.CleanApertureAtom"
            java.lang.String r4 = "double"
            java.lang.String r5 = "height"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 57
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.CleanApertureAtom.ajc$tjp_3 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.parseVersionAndFlags(r3)
            double r0 = com.coremedia.iso.IsoTypeReader.readFixedPoint1616(r3)
            r2.width = r0
            double r0 = com.coremedia.iso.IsoTypeReader.readFixedPoint1616(r3)
            r2.height = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.writeVersionAndFlags(r3)
            double r0 = r2.width
            com.coremedia.iso.IsoTypeWriter.writeFixedPoint1616(r3, r0)
            double r0 = r2.height
            com.coremedia.iso.IsoTypeWriter.writeFixedPoint1616(r3, r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            r0 = 12
            return r0
    }

    public double getHeight() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.CleanApertureAtom.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            double r0 = r2.height
            return r0
    }

    public double getWidth() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.CleanApertureAtom.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            double r0 = r2.width
            return r0
    }

    public void setHeight(double r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.CleanApertureAtom.ajc$tjp_3
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.doubleObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.height = r3
            return
    }

    public void setWidth(double r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.CleanApertureAtom.ajc$tjp_1
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.doubleObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.width = r3
            return
    }
}
