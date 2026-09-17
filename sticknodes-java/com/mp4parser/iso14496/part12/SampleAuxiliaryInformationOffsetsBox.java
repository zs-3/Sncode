package com.mp4parser.iso14496.part12;

/* loaded from: classes2.dex */
public class SampleAuxiliaryInformationOffsetsBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "saio";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5 = null;
    private java.lang.String auxInfoType;
    private java.lang.String auxInfoTypeParameter;
    private long[] offsets;

    static {
            ajc$preClinit()
            return
    }

    public SampleAuxiliaryInformationOffsetsBox() {
            r1 = this;
            java.lang.String r0 = "saio"
            r1.<init>(r0)
            r0 = 0
            long[] r0 = new long[r0]
            r1.offsets = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox> r0 = com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox.class
            java.lang.String r1 = "SampleAuxiliaryInformationOffsetsBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getAuxInfoType"
            java.lang.String r3 = "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 107(0x6b, float:1.5E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setAuxInfoType"
            java.lang.String r3 = "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "auxInfoType"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 111(0x6f, float:1.56E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getAuxInfoTypeParameter"
            java.lang.String r3 = "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 115(0x73, float:1.61E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setAuxInfoTypeParameter"
            java.lang.String r3 = "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "auxInfoTypeParameter"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 119(0x77, float:1.67E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getOffsets"
            java.lang.String r3 = "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "[J"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 123(0x7b, float:1.72E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox.ajc$tjp_4 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setOffsets"
            java.lang.String r3 = "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox"
            java.lang.String r4 = "[J"
            java.lang.String r5 = "offsets"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 127(0x7f, float:1.78E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox.ajc$tjp_5 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r6) {
            r5 = this;
            r5.parseVersionAndFlags(r6)
            int r0 = r5.getFlags()
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L17
            java.lang.String r0 = com.coremedia.iso.IsoTypeReader.read4cc(r6)
            r5.auxInfoType = r0
            java.lang.String r0 = com.coremedia.iso.IsoTypeReader.read4cc(r6)
            r5.auxInfoTypeParameter = r0
        L17:
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            int r0 = com.googlecode.mp4parser.util.CastUtils.l2i(r0)
            long[] r1 = new long[r0]
            r5.offsets = r1
            r1 = 0
        L24:
            if (r1 < r0) goto L27
            return
        L27:
            int r2 = r5.getVersion()
            if (r2 != 0) goto L36
            long[] r2 = r5.offsets
            long r3 = com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            r2[r1] = r3
            goto L3e
        L36:
            long[] r2 = r5.offsets
            long r3 = com.coremedia.iso.IsoTypeReader.readUInt64(r6)
            r2[r1] = r3
        L3e:
            int r1 = r1 + 1
            goto L24
    }

    public java.lang.String getAuxInfoType() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.String r0 = r2.auxInfoType
            return r0
    }

    public java.lang.String getAuxInfoTypeParameter() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.String r0 = r2.auxInfoTypeParameter
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r6) {
            r5 = this;
            r5.writeVersionAndFlags(r6)
            int r0 = r5.getFlags()
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L1d
            java.lang.String r0 = r5.auxInfoType
            byte[] r0 = com.coremedia.iso.IsoFile.fourCCtoBytes(r0)
            r6.put(r0)
            java.lang.String r0 = r5.auxInfoTypeParameter
            byte[] r0 = com.coremedia.iso.IsoFile.fourCCtoBytes(r0)
            r6.put(r0)
        L1d:
            long[] r0 = r5.offsets
            int r0 = r0.length
            long r0 = (long) r0
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r0)
            long[] r0 = r5.offsets
            int r1 = r0.length
            r2 = 0
        L28:
            if (r2 < r1) goto L2b
            return
        L2b:
            r3 = r0[r2]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            int r4 = r5.getVersion()
            if (r4 != 0) goto L3f
            long r3 = r3.longValue()
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r3)
            goto L46
        L3f:
            long r3 = r3.longValue()
            com.coremedia.iso.IsoTypeWriter.writeUInt64(r6, r3)
        L46:
            int r2 = r2 + 1
            goto L28
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r4 = this;
            int r0 = r4.getVersion()
            r1 = 8
            if (r0 != 0) goto Le
            long[] r0 = r4.offsets
            int r0 = r0.length
            int r0 = r0 * 4
            goto L13
        Le:
            long[] r0 = r4.offsets
            int r0 = r0.length
            int r0 = r0 * 8
        L13:
            int r0 = r0 + r1
            int r2 = r4.getFlags()
            r3 = 1
            r2 = r2 & r3
            if (r2 != r3) goto L1d
            goto L1e
        L1d:
            r1 = 0
        L1e:
            int r0 = r0 + r1
            long r0 = (long) r0
            return r0
    }

    public long[] getOffsets() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long[] r0 = r2.offsets
            return r0
    }

    public void setAuxInfoType(java.lang.String r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.auxInfoType = r3
            return
    }

    public void setAuxInfoTypeParameter(java.lang.String r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox.ajc$tjp_3
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.auxInfoTypeParameter = r3
            return
    }

    public void setOffsets(long[] r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox.ajc$tjp_5
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.offsets = r3
            return
    }
}
