package com.mp4parser.iso14496.part12;

/* loaded from: classes2.dex */
public class SampleAuxiliaryInformationSizesBox extends com.googlecode.mp4parser.AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final java.lang.String TYPE = "saiz";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_10 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_11 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_9 = null;
    private java.lang.String auxInfoType;
    private java.lang.String auxInfoTypeParameter;
    private short defaultSampleInfoSize;
    private int sampleCount;
    private short[] sampleInfoSizes;

    static {
            ajc$preClinit()
            return
    }

    public SampleAuxiliaryInformationSizesBox() {
            r1 = this;
            java.lang.String r0 = "saiz"
            r1.<init>(r0)
            r0 = 0
            short[] r0 = new short[r0]
            r1.sampleInfoSizes = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox> r0 = com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox.class
            java.lang.String r1 = "SampleAuxiliaryInformationSizesBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getSize"
            java.lang.String r3 = "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "index"
            java.lang.String r6 = ""
            java.lang.String r7 = "short"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 57
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getAuxInfoType"
            java.lang.String r3 = "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 106(0x6a, float:1.49E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setSampleCount"
            java.lang.String r3 = "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "sampleCount"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 146(0x92, float:2.05E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox.ajc$tjp_10 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 151(0x97, float:2.12E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox.ajc$tjp_11 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setAuxInfoType"
            java.lang.String r3 = "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "auxInfoType"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 110(0x6e, float:1.54E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getAuxInfoTypeParameter"
            java.lang.String r3 = "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 114(0x72, float:1.6E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setAuxInfoTypeParameter"
            java.lang.String r3 = "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "auxInfoTypeParameter"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 118(0x76, float:1.65E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox.ajc$tjp_4 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDefaultSampleInfoSize"
            java.lang.String r3 = "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 122(0x7a, float:1.71E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox.ajc$tjp_5 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setDefaultSampleInfoSize"
            java.lang.String r3 = "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "defaultSampleInfoSize"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 126(0x7e, float:1.77E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox.ajc$tjp_6 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getSampleInfoSizes"
            java.lang.String r3 = "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "[S"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 131(0x83, float:1.84E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox.ajc$tjp_7 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setSampleInfoSizes"
            java.lang.String r3 = "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox"
            java.lang.String r4 = "[S"
            java.lang.String r5 = "sampleInfoSizes"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 137(0x89, float:1.92E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox.ajc$tjp_8 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getSampleCount"
            java.lang.String r3 = "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 142(0x8e, float:1.99E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox.ajc$tjp_9 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r4) {
            r3 = this;
            r3.parseVersionAndFlags(r4)
            int r0 = r3.getFlags()
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L17
            java.lang.String r0 = com.coremedia.iso.IsoTypeReader.read4cc(r4)
            r3.auxInfoType = r0
            java.lang.String r0 = com.coremedia.iso.IsoTypeReader.read4cc(r4)
            r3.auxInfoTypeParameter = r0
        L17:
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r4)
            short r0 = (short) r0
            r3.defaultSampleInfoSize = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r4)
            int r0 = com.googlecode.mp4parser.util.CastUtils.l2i(r0)
            r3.sampleCount = r0
            short r1 = r3.defaultSampleInfoSize
            if (r1 != 0) goto L42
            short[] r0 = new short[r0]
            r3.sampleInfoSizes = r0
            r0 = 0
        L31:
            int r1 = r3.sampleCount
            if (r0 < r1) goto L36
            goto L42
        L36:
            short[] r1 = r3.sampleInfoSizes
            int r2 = com.coremedia.iso.IsoTypeReader.readUInt8(r4)
            short r2 = (short) r2
            r1[r0] = r2
            int r0 = r0 + 1
            goto L31
        L42:
            return
    }

    public java.lang.String getAuxInfoType() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.String r0 = r2.auxInfoType
            return r0
    }

    public java.lang.String getAuxInfoTypeParameter() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox.ajc$tjp_3
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.String r0 = r2.auxInfoTypeParameter
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r5) {
            r4 = this;
            r4.writeVersionAndFlags(r5)
            int r0 = r4.getFlags()
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L1d
            java.lang.String r0 = r4.auxInfoType
            byte[] r0 = com.coremedia.iso.IsoFile.fourCCtoBytes(r0)
            r5.put(r0)
            java.lang.String r0 = r4.auxInfoTypeParameter
            byte[] r0 = com.coremedia.iso.IsoFile.fourCCtoBytes(r0)
            r5.put(r0)
        L1d:
            short r0 = r4.defaultSampleInfoSize
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r5, r0)
            short r0 = r4.defaultSampleInfoSize
            if (r0 != 0) goto L3c
            short[] r0 = r4.sampleInfoSizes
            int r0 = r0.length
            long r0 = (long) r0
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r5, r0)
            short[] r0 = r4.sampleInfoSizes
            int r1 = r0.length
            r2 = 0
        L31:
            if (r2 < r1) goto L34
            goto L42
        L34:
            short r3 = r0[r2]
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r5, r3)
            int r2 = r2 + 1
            goto L31
        L3c:
            int r0 = r4.sampleCount
            long r0 = (long) r0
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r5, r0)
        L42:
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            int r0 = r2.getFlags()
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto Lb
            r0 = 12
            goto Lc
        Lb:
            r0 = 4
        Lc:
            int r0 = r0 + 5
            short r1 = r2.defaultSampleInfoSize
            if (r1 != 0) goto L16
            short[] r1 = r2.sampleInfoSizes
            int r1 = r1.length
            goto L17
        L16:
            r1 = 0
        L17:
            int r0 = r0 + r1
            long r0 = (long) r0
            return r0
    }

    public int getDefaultSampleInfoSize() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox.ajc$tjp_5
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            short r0 = r2.defaultSampleInfoSize
            return r0
    }

    public int getSampleCount() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox.ajc$tjp_9
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.sampleCount
            return r0
    }

    public short[] getSampleInfoSizes() {
            r4 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox.ajc$tjp_7
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r4, r4)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            short[] r0 = r4.sampleInfoSizes
            int r1 = r0.length
            short[] r1 = new short[r1]
            int r2 = r0.length
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            return r1
    }

    public short getSize(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox.ajc$tjp_0
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.getDefaultSampleInfoSize()
            if (r0 != 0) goto L1c
            short[] r0 = r2.sampleInfoSizes
            short r3 = r0[r3]
            return r3
        L1c:
            short r3 = r2.defaultSampleInfoSize
            return r3
    }

    public void setAuxInfoType(java.lang.String r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.auxInfoType = r3
            return
    }

    public void setAuxInfoTypeParameter(java.lang.String r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.auxInfoTypeParameter = r3
            return
    }

    public void setDefaultSampleInfoSize(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox.ajc$tjp_6
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            short r3 = (short) r3
            r2.defaultSampleInfoSize = r3
            return
    }

    public void setSampleCount(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox.ajc$tjp_10
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.sampleCount = r3
            return
    }

    public void setSampleInfoSizes(short[] r4) {
            r3 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox.ajc$tjp_8
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r3, r3, r4)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r4.length
            short[] r0 = new short[r0]
            r3.sampleInfoSizes = r0
            int r1 = r4.length
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r0, r2, r1)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox.ajc$tjp_11
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r3, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SampleAuxiliaryInformationSizesBox{defaultSampleInfoSize="
            r0.<init>(r1)
            short r1 = r3.defaultSampleInfoSize
            r0.append(r1)
            java.lang.String r1 = ", sampleCount="
            r0.append(r1)
            int r1 = r3.sampleCount
            r0.append(r1)
            java.lang.String r1 = ", auxInfoType='"
            r0.append(r1)
            java.lang.String r1 = r3.auxInfoType
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", auxInfoTypeParameter='"
            r0.append(r2)
            java.lang.String r2 = r3.auxInfoTypeParameter
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
