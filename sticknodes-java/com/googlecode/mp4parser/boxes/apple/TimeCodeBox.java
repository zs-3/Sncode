package com.googlecode.mp4parser.boxes.apple;

/* loaded from: classes2.dex */
public class TimeCodeBox extends com.googlecode.mp4parser.AbstractBox implements com.coremedia.iso.boxes.sampleentry.SampleEntry, com.coremedia.iso.boxes.Container {
    public static final java.lang.String TYPE = "tmcd";
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
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_22 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_9 = null;
    int dataReferenceIndex;
    long flags;
    int frameDuration;
    int numberOfFrames;
    int reserved1;
    int reserved2;
    byte[] rest;
    int timeScale;

    static {
            ajc$preClinit()
            return
    }

    public TimeCodeBox() {
            r1 = this;
            java.lang.String r0 = "tmcd"
            r1.<init>(r0)
            r0 = 0
            byte[] r0 = new byte[r0]
            r1.rest = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.googlecode.mp4parser.boxes.apple.TimeCodeBox> r0 = com.googlecode.mp4parser.boxes.apple.TimeCodeBox.class
            java.lang.String r1 = "TimeCodeBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDataReferenceIndex"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.TimeCodeBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 88
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setDataReferenceIndex"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.TimeCodeBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "dataReferenceIndex"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 92
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setReserved1"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.TimeCodeBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "reserved1"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 137(0x89, float:1.92E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_10 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getReserved2"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.TimeCodeBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 141(0x8d, float:1.98E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_11 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setReserved2"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.TimeCodeBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "reserved2"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 145(0x91, float:2.03E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_12 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getFlags"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.TimeCodeBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 149(0x95, float:2.09E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_13 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setFlags"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.TimeCodeBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "flags"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 153(0x99, float:2.14E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_14 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getRest"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.TimeCodeBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "[B"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 157(0x9d, float:2.2E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_15 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setRest"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.TimeCodeBox"
            java.lang.String r4 = "[B"
            java.lang.String r5 = "rest"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 161(0xa1, float:2.26E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_16 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getBoxes"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.TimeCodeBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.List"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 166(0xa6, float:2.33E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_17 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setBoxes"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.TimeCodeBox"
            java.lang.String r4 = "java.util.List"
            java.lang.String r5 = "boxes"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 170(0xaa, float:2.38E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_18 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getBoxes"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.TimeCodeBox"
            java.lang.String r4 = "java.lang.Class"
            java.lang.String r5 = "clazz"
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.List"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 174(0xae, float:2.44E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_19 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.TimeCodeBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 98
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getBoxes"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.TimeCodeBox"
            java.lang.String r4 = "java.lang.Class:boolean"
            java.lang.String r5 = "clazz:recursive"
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.List"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 178(0xb2, float:2.5E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_20 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getByteBuffer"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.TimeCodeBox"
            java.lang.String r4 = "long:long"
            java.lang.String r5 = "start:size"
            java.lang.String r6 = "java.io.IOException"
            java.lang.String r7 = "java.nio.ByteBuffer"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 182(0xb6, float:2.55E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_21 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "writeContainer"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.TimeCodeBox"
            java.lang.String r4 = "java.nio.channels.WritableByteChannel"
            java.lang.String r5 = "bb"
            java.lang.String r6 = "java.io.IOException"
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 186(0xba, float:2.6E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_22 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getTimeScale"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.TimeCodeBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 109(0x6d, float:1.53E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setTimeScale"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.TimeCodeBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "timeScale"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 113(0x71, float:1.58E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_4 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getFrameDuration"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.TimeCodeBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 117(0x75, float:1.64E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_5 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setFrameDuration"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.TimeCodeBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "frameDuration"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 121(0x79, float:1.7E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_6 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getNumberOfFrames"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.TimeCodeBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 125(0x7d, float:1.75E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_7 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setNumberOfFrames"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.TimeCodeBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "numberOfFrames"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 129(0x81, float:1.81E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_8 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getReserved1"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.TimeCodeBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 133(0x85, float:1.86E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_9 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(java.nio.ByteBuffer r3) {
            r2 = this;
            r0 = 6
            r3.position(r0)
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r3)
            r2.dataReferenceIndex = r0
            int r0 = r3.getInt()
            r2.reserved1 = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r3)
            r2.flags = r0
            int r0 = r3.getInt()
            r2.timeScale = r0
            int r0 = r3.getInt()
            r2.frameDuration = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r3)
            r2.numberOfFrames = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt24(r3)
            r2.reserved2 = r0
            int r0 = r3.remaining()
            byte[] r0 = new byte[r0]
            r2.rest = r0
            r3.get(r0)
            return
    }

    @Override // com.coremedia.iso.boxes.Container
    public java.util.List<com.coremedia.iso.boxes.Box> getBoxes() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_17
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    @Override // com.coremedia.iso.boxes.Container
    public <T extends com.coremedia.iso.boxes.Box> java.util.List<T> getBoxes(java.lang.Class<T> r2) {
            r1 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_19
            org.mp4parser.aspectj.lang.JoinPoint r2 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r1, r1, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r0 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r0.before(r2)
            java.util.List r2 = java.util.Collections.emptyList()
            return r2
    }

    @Override // com.coremedia.iso.boxes.Container
    public <T extends com.coremedia.iso.boxes.Box> java.util.List<T> getBoxes(java.lang.Class<T> r2, boolean r3) {
            r1 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_20
            java.lang.Object r3 = org.mp4parser.aspectj.runtime.internal.Conversions.booleanObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r2 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r1, r1, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r3 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r3.before(r2)
            java.util.List r2 = java.util.Collections.emptyList()
            return r2
    }

    @Override // com.coremedia.iso.boxes.Container
    public java.nio.ByteBuffer getByteBuffer(long r2, long r4) throws java.io.IOException {
            r1 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_21
            java.lang.Object r2 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r2)
            java.lang.Object r3 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r4)
            org.mp4parser.aspectj.lang.JoinPoint r2 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r1, r1, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r3 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r3.before(r2)
            r2 = 0
            return r2
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r3) {
            r2 = this;
            r0 = 6
            byte[] r0 = new byte[r0]
            r3.put(r0)
            int r0 = r2.dataReferenceIndex
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r3, r0)
            int r0 = r2.reserved1
            r3.putInt(r0)
            long r0 = r2.flags
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            int r0 = r2.timeScale
            r3.putInt(r0)
            int r0 = r2.frameDuration
            r3.putInt(r0)
            int r0 = r2.numberOfFrames
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r3, r0)
            int r0 = r2.reserved2
            com.coremedia.iso.IsoTypeWriter.writeUInt24(r3, r0)
            byte[] r0 = r2.rest
            r3.put(r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            byte[] r0 = r2.rest
            int r0 = r0.length
            int r0 = r0 + 28
            long r0 = (long) r0
            return r0
    }

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry
    public int getDataReferenceIndex() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.dataReferenceIndex
            return r0
    }

    public long getFlags() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_13
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.flags
            return r0
    }

    public int getFrameDuration() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_5
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.frameDuration
            return r0
    }

    public int getNumberOfFrames() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_7
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.numberOfFrames
            return r0
    }

    public int getReserved1() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_9
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.reserved1
            return r0
    }

    public int getReserved2() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_11
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.reserved2
            return r0
    }

    public byte[] getRest() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_15
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            byte[] r0 = r2.rest
            return r0
    }

    public int getTimeScale() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_3
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.timeScale
            return r0
    }

    @Override // com.coremedia.iso.boxes.Container
    public void setBoxes(java.util.List<com.coremedia.iso.boxes.Box> r2) {
            r1 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_18
            org.mp4parser.aspectj.lang.JoinPoint r2 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r1, r1, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r0 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r0.before(r2)
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "Time Code Box doesn't accept any children"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry
    public void setDataReferenceIndex(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_1
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.dataReferenceIndex = r3
            return
    }

    public void setFlags(long r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_14
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.flags = r3
            return
    }

    public void setFrameDuration(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_6
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.frameDuration = r3
            return
    }

    public void setNumberOfFrames(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_8
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.numberOfFrames = r3
            return
    }

    public void setReserved1(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_10
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.reserved1 = r3
            return
    }

    public void setReserved2(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_12
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.reserved2 = r3
            return
    }

    public void setRest(byte[] r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_16
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.rest = r3
            return
    }

    public void setTimeScale(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_4
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.timeScale = r3
            return
    }

    public java.lang.String toString() {
            r3 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r3, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TimeCodeBox{timeScale="
            r0.<init>(r1)
            int r1 = r3.timeScale
            r0.append(r1)
            java.lang.String r1 = ", frameDuration="
            r0.append(r1)
            int r1 = r3.frameDuration
            r0.append(r1)
            java.lang.String r1 = ", numberOfFrames="
            r0.append(r1)
            int r1 = r3.numberOfFrames
            r0.append(r1)
            java.lang.String r1 = ", reserved1="
            r0.append(r1)
            int r1 = r3.reserved1
            r0.append(r1)
            java.lang.String r1 = ", reserved2="
            r0.append(r1)
            int r1 = r3.reserved2
            r0.append(r1)
            java.lang.String r1 = ", flags="
            r0.append(r1)
            long r1 = r3.flags
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.coremedia.iso.boxes.Container
    public void writeContainer(java.nio.channels.WritableByteChannel r2) throws java.io.IOException {
            r1 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.TimeCodeBox.ajc$tjp_22
            org.mp4parser.aspectj.lang.JoinPoint r2 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r1, r1, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r0 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r0.before(r2)
            return
    }
}
