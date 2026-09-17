package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class HintMediaHeaderBox extends com.coremedia.iso.boxes.AbstractMediaHeaderBox {
    public static final java.lang.String TYPE = "hmhd";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private long avgBitrate;
    private int avgPduSize;
    private long maxBitrate;
    private int maxPduSize;

    static {
            ajc$preClinit()
            return
    }

    public HintMediaHeaderBox() {
            r1 = this;
            java.lang.String r0 = "hmhd"
            r1.<init>(r0)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.HintMediaHeaderBox> r0 = com.coremedia.iso.boxes.HintMediaHeaderBox.class
            java.lang.String r1 = "HintMediaHeaderBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getMaxPduSize"
            java.lang.String r3 = "com.coremedia.iso.boxes.HintMediaHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 42
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.HintMediaHeaderBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getAvgPduSize"
            java.lang.String r3 = "com.coremedia.iso.boxes.HintMediaHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 46
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.HintMediaHeaderBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getMaxBitrate"
            java.lang.String r3 = "com.coremedia.iso.boxes.HintMediaHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 50
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.HintMediaHeaderBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getAvgBitrate"
            java.lang.String r3 = "com.coremedia.iso.boxes.HintMediaHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 54
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.HintMediaHeaderBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.coremedia.iso.boxes.HintMediaHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 84
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.HintMediaHeaderBox.ajc$tjp_4 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.parseVersionAndFlags(r3)
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r3)
            r2.maxPduSize = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r3)
            r2.avgPduSize = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r3)
            r2.maxBitrate = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r3)
            r2.avgBitrate = r0
            com.coremedia.iso.IsoTypeReader.readUInt32(r3)
            return
    }

    public long getAvgBitrate() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.HintMediaHeaderBox.ajc$tjp_3
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.avgBitrate
            return r0
    }

    public int getAvgPduSize() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.HintMediaHeaderBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.avgPduSize
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.writeVersionAndFlags(r3)
            int r0 = r2.maxPduSize
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r3, r0)
            int r0 = r2.avgPduSize
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r3, r0)
            long r0 = r2.maxBitrate
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            long r0 = r2.avgBitrate
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            r0 = 0
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            r0 = 20
            return r0
    }

    public long getMaxBitrate() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.HintMediaHeaderBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.maxBitrate
            return r0
    }

    public int getMaxPduSize() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.HintMediaHeaderBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.maxPduSize
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.HintMediaHeaderBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r3, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HintMediaHeaderBox{maxPduSize="
            r0.<init>(r1)
            int r1 = r3.maxPduSize
            r0.append(r1)
            java.lang.String r1 = ", avgPduSize="
            r0.append(r1)
            int r1 = r3.avgPduSize
            r0.append(r1)
            java.lang.String r1 = ", maxBitrate="
            r0.append(r1)
            long r1 = r3.maxBitrate
            r0.append(r1)
            java.lang.String r1 = ", avgBitrate="
            r0.append(r1)
            long r1 = r3.avgBitrate
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
