package com.googlecode.mp4parser.boxes.apple;

/* loaded from: classes2.dex */
public class PixelAspectRationAtom extends com.googlecode.mp4parser.AbstractBox {
    public static final java.lang.String TYPE = "pasp";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private int hSpacing;
    private int vSpacing;

    static {
            ajc$preClinit()
            return
    }

    public PixelAspectRationAtom() {
            r1 = this;
            java.lang.String r0 = "pasp"
            r1.<init>(r0)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom> r0 = com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom.class
            java.lang.String r1 = "PixelAspectRationAtom.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "gethSpacing"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 35
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "sethSpacing"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom"
            java.lang.String r4 = "int"
            java.lang.String r5 = "hSpacing"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 39
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getvSpacing"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 43
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setvSpacing"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom"
            java.lang.String r4 = "int"
            java.lang.String r5 = "vSpacing"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 47
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom.ajc$tjp_3 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(java.nio.ByteBuffer r2) {
            r1 = this;
            int r0 = r2.getInt()
            r1.hSpacing = r0
            int r2 = r2.getInt()
            r1.vSpacing = r2
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r2) {
            r1 = this;
            int r0 = r1.hSpacing
            r2.putInt(r0)
            int r0 = r1.vSpacing
            r2.putInt(r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            r0 = 8
            return r0
    }

    public int gethSpacing() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.hSpacing
            return r0
    }

    public int getvSpacing() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.vSpacing
            return r0
    }

    public void sethSpacing(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom.ajc$tjp_1
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.hSpacing = r3
            return
    }

    public void setvSpacing(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom.ajc$tjp_3
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.vSpacing = r3
            return
    }
}
