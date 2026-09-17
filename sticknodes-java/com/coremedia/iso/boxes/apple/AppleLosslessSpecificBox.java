package com.coremedia.iso.boxes.apple;

/* loaded from: classes.dex */
public final class AppleLosslessSpecificBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "alac";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_10 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_11 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_12 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_13 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_14 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_15 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_16 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_17 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_18 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_19 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_20 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_21 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_9 = null;
    private long bitRate;
    private int channels;
    private int historyMult;
    private int initialHistory;
    private int kModifier;
    private long maxCodedFrameSize;
    private long maxSamplePerFrame;
    private long sampleRate;
    private int sampleSize;
    private int unknown1;
    private int unknown2;

    static {
            ajc$preClinit()
            return
    }

    public AppleLosslessSpecificBox() {
            r1 = this;
            java.lang.String r0 = "alac"
            r1.<init>(r0)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox> r0 = com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.class
            java.lang.String r1 = "AppleLosslessSpecificBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getMaxSamplePerFrame"
            java.lang.String r3 = "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 34
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setMaxSamplePerFrame"
            java.lang.String r3 = "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "maxSamplePerFrame"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 38
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getKModifier"
            java.lang.String r3 = "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 74
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_10 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setKModifier"
            java.lang.String r3 = "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "kModifier"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 78
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_11 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getChannels"
            java.lang.String r3 = "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 82
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_12 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setChannels"
            java.lang.String r3 = "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "channels"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 86
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_13 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getUnknown2"
            java.lang.String r3 = "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 90
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_14 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setUnknown2"
            java.lang.String r3 = "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "unknown2"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 94
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_15 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getMaxCodedFrameSize"
            java.lang.String r3 = "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 98
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_16 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setMaxCodedFrameSize"
            java.lang.String r3 = "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "maxCodedFrameSize"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 102(0x66, float:1.43E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_17 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getBitRate"
            java.lang.String r3 = "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 106(0x6a, float:1.49E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_18 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setBitRate"
            java.lang.String r3 = "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "bitRate"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 110(0x6e, float:1.54E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_19 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getUnknown1"
            java.lang.String r3 = "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 42
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getSampleRate"
            java.lang.String r3 = "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 114(0x72, float:1.6E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_20 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setSampleRate"
            java.lang.String r3 = "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "sampleRate"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 118(0x76, float:1.65E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_21 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setUnknown1"
            java.lang.String r3 = "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "unknown1"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 46
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getSampleSize"
            java.lang.String r3 = "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 50
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_4 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setSampleSize"
            java.lang.String r3 = "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "sampleSize"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 54
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_5 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getHistoryMult"
            java.lang.String r3 = "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 58
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_6 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setHistoryMult"
            java.lang.String r3 = "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "historyMult"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 62
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_7 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getInitialHistory"
            java.lang.String r3 = "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 66
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_8 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setInitialHistory"
            java.lang.String r3 = "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "initialHistory"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 70
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_9 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.parseVersionAndFlags(r3)
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r3)
            r2.maxSamplePerFrame = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r3)
            r2.unknown1 = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r3)
            r2.sampleSize = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r3)
            r2.historyMult = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r3)
            r2.initialHistory = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r3)
            r2.kModifier = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r3)
            r2.channels = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r3)
            r2.unknown2 = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r3)
            r2.maxCodedFrameSize = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r3)
            r2.bitRate = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r3)
            r2.sampleRate = r0
            return
    }

    public long getBitRate() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_18
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.bitRate
            return r0
    }

    public int getChannels() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_12
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.channels
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.writeVersionAndFlags(r3)
            long r0 = r2.maxSamplePerFrame
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            int r0 = r2.unknown1
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r3, r0)
            int r0 = r2.sampleSize
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r3, r0)
            int r0 = r2.historyMult
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r3, r0)
            int r0 = r2.initialHistory
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r3, r0)
            int r0 = r2.kModifier
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r3, r0)
            int r0 = r2.channels
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r3, r0)
            int r0 = r2.unknown2
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r3, r0)
            long r0 = r2.maxCodedFrameSize
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            long r0 = r2.bitRate
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            long r0 = r2.sampleRate
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            r0 = 28
            return r0
    }

    public int getHistoryMult() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_6
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.historyMult
            return r0
    }

    public int getInitialHistory() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_8
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.initialHistory
            return r0
    }

    public int getKModifier() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_10
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.kModifier
            return r0
    }

    public long getMaxCodedFrameSize() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_16
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.maxCodedFrameSize
            return r0
    }

    public long getMaxSamplePerFrame() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.maxSamplePerFrame
            return r0
    }

    public long getSampleRate() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_20
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.sampleRate
            return r0
    }

    public int getSampleSize() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.sampleSize
            return r0
    }

    public int getUnknown1() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.unknown1
            return r0
    }

    public int getUnknown2() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_14
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.unknown2
            return r0
    }

    public void setBitRate(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_19
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = (long) r3
            r2.bitRate = r0
            return
    }

    public void setChannels(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_13
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.channels = r3
            return
    }

    public void setHistoryMult(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_7
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.historyMult = r3
            return
    }

    public void setInitialHistory(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_9
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.initialHistory = r3
            return
    }

    public void setKModifier(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_11
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.kModifier = r3
            return
    }

    public void setMaxCodedFrameSize(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_17
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = (long) r3
            r2.maxCodedFrameSize = r0
            return
    }

    public void setMaxSamplePerFrame(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_1
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = (long) r3
            r2.maxSamplePerFrame = r0
            return
    }

    public void setSampleRate(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_21
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = (long) r3
            r2.sampleRate = r0
            return
    }

    public void setSampleSize(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_5
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.sampleSize = r3
            return
    }

    public void setUnknown1(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_3
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.unknown1 = r3
            return
    }

    public void setUnknown2(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox.ajc$tjp_15
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.unknown2 = r3
            return
    }
}
