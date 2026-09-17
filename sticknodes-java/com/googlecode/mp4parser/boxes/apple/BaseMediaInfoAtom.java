package com.googlecode.mp4parser.boxes.apple;

/* loaded from: classes2.dex */
public class BaseMediaInfoAtom extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "gmin";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_10 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_11 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_12 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_9 = null;
    short balance;
    short graphicsMode;
    int opColorB;
    int opColorG;
    int opColorR;
    short reserved;

    static {
            ajc$preClinit()
            return
    }

    public BaseMediaInfoAtom() {
            r1 = this;
            java.lang.String r0 = "gmin"
            r1.<init>(r0)
            r0 = 64
            r1.graphicsMode = r0
            r0 = 32768(0x8000, float:4.5918E-41)
            r1.opColorR = r0
            r1.opColorG = r0
            r1.opColorB = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom> r0 = com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom.class
            java.lang.String r1 = "BaseMediaInfoAtom.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getGraphicsMode"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "short"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 54
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setGraphicsMode"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom"
            java.lang.String r4 = "short"
            java.lang.String r5 = "graphicsMode"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 58
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getReserved"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "short"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 94
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom.ajc$tjp_10 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setReserved"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom"
            java.lang.String r4 = "short"
            java.lang.String r5 = "reserved"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 98
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom.ajc$tjp_11 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 103(0x67, float:1.44E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom.ajc$tjp_12 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getOpColorR"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 62
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setOpColorR"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom"
            java.lang.String r4 = "int"
            java.lang.String r5 = "opColorR"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 66
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getOpColorG"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 70
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom.ajc$tjp_4 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setOpColorG"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom"
            java.lang.String r4 = "int"
            java.lang.String r5 = "opColorG"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 74
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom.ajc$tjp_5 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getOpColorB"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 78
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom.ajc$tjp_6 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setOpColorB"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom"
            java.lang.String r4 = "int"
            java.lang.String r5 = "opColorB"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 82
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom.ajc$tjp_7 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getBalance"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "short"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 86
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom.ajc$tjp_8 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setBalance"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom"
            java.lang.String r4 = "short"
            java.lang.String r5 = "balance"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 90
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom.ajc$tjp_9 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(java.nio.ByteBuffer r2) {
            r1 = this;
            r1.parseVersionAndFlags(r2)
            short r0 = r2.getShort()
            r1.graphicsMode = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r2)
            r1.opColorR = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r2)
            r1.opColorG = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r2)
            r1.opColorB = r0
            short r0 = r2.getShort()
            r1.balance = r0
            short r2 = r2.getShort()
            r1.reserved = r2
            return
    }

    public short getBalance() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom.ajc$tjp_8
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            short r0 = r2.balance
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r2) {
            r1 = this;
            r1.writeVersionAndFlags(r2)
            short r0 = r1.graphicsMode
            r2.putShort(r0)
            int r0 = r1.opColorR
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r2, r0)
            int r0 = r1.opColorG
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r2, r0)
            int r0 = r1.opColorB
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r2, r0)
            short r0 = r1.balance
            r2.putShort(r0)
            short r0 = r1.reserved
            r2.putShort(r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            r0 = 16
            return r0
    }

    public short getGraphicsMode() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            short r0 = r2.graphicsMode
            return r0
    }

    public int getOpColorB() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom.ajc$tjp_6
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.opColorB
            return r0
    }

    public int getOpColorG() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.opColorG
            return r0
    }

    public int getOpColorR() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.opColorR
            return r0
    }

    public short getReserved() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom.ajc$tjp_10
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            short r0 = r2.reserved
            return r0
    }

    public void setBalance(short r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom.ajc$tjp_9
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.shortObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.balance = r3
            return
    }

    public void setGraphicsMode(short r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom.ajc$tjp_1
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.shortObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.graphicsMode = r3
            return
    }

    public void setOpColorB(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom.ajc$tjp_7
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.opColorB = r3
            return
    }

    public void setOpColorG(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom.ajc$tjp_5
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.opColorG = r3
            return
    }

    public void setOpColorR(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom.ajc$tjp_3
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.opColorR = r3
            return
    }

    public void setReserved(short r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom.ajc$tjp_11
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.shortObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.reserved = r3
            return
    }

    public java.lang.String toString() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom.ajc$tjp_12
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BaseMediaInfoAtom{graphicsMode="
            r0.<init>(r1)
            short r1 = r2.graphicsMode
            r0.append(r1)
            java.lang.String r1 = ", opColorR="
            r0.append(r1)
            int r1 = r2.opColorR
            r0.append(r1)
            java.lang.String r1 = ", opColorG="
            r0.append(r1)
            int r1 = r2.opColorG
            r0.append(r1)
            java.lang.String r1 = ", opColorB="
            r0.append(r1)
            int r1 = r2.opColorB
            r0.append(r1)
            java.lang.String r1 = ", balance="
            r0.append(r1)
            short r1 = r2.balance
            r0.append(r1)
            java.lang.String r1 = ", reserved="
            r0.append(r1)
            short r1 = r2.reserved
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
