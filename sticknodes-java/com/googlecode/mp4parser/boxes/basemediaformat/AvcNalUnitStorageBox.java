package com.googlecode.mp4parser.boxes.basemediaformat;

/* loaded from: classes2.dex */
public class AvcNalUnitStorageBox extends com.googlecode.mp4parser.AbstractBox {
    public static final java.lang.String TYPE = "avcn";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7 = null;
    com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord avcDecoderConfigurationRecord;

    static {
            ajc$preClinit()
            return
    }

    public AvcNalUnitStorageBox() {
            r1 = this;
            java.lang.String r0 = "avcn"
            r1.<init>(r0)
            return
    }

    public AvcNalUnitStorageBox(com.mp4parser.iso14496.part15.AvcConfigurationBox r2) {
            r1 = this;
            java.lang.String r0 = "avcn"
            r1.<init>(r0)
            com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord r2 = r2.getavcDecoderConfigurationRecord()
            r1.avcDecoderConfigurationRecord = r2
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox> r0 = com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox.class
            java.lang.String r1 = "AvcNalUnitStorageBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getAvcDecoderConfigurationRecord"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 44
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getLengthSizeMinusOne"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 49
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getSPS"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "[Ljava.lang.String;"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 53
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getPPS"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "[Ljava.lang.String;"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 57
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getSequenceParameterSetsAsStrings"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.List"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 61
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox.ajc$tjp_4 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getSequenceParameterSetExtsAsStrings"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.List"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 65
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox.ajc$tjp_5 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getPictureParameterSetsAsStrings"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.List"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 69
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox.ajc$tjp_6 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 89
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox.ajc$tjp_7 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r2) {
            r1 = this;
            com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord r0 = new com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord
            r0.<init>(r2)
            r1.avcDecoderConfigurationRecord = r0
            return
    }

    public com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord getAvcDecoderConfigurationRecord() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord r0 = r2.avcDecoderConfigurationRecord
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r2) {
            r1 = this;
            com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord r0 = r1.avcDecoderConfigurationRecord
            r0.getContent(r2)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord r0 = r2.avcDecoderConfigurationRecord
            long r0 = r0.getContentSize()
            return r0
    }

    public int getLengthSizeMinusOne() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord r0 = r2.avcDecoderConfigurationRecord
            int r0 = r0.lengthSizeMinusOne
            return r0
    }

    public java.lang.String[] getPPS() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox.ajc$tjp_3
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord r0 = r2.avcDecoderConfigurationRecord
            java.lang.String[] r0 = r0.getPPS()
            return r0
    }

    public java.util.List<java.lang.String> getPictureParameterSetsAsStrings() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox.ajc$tjp_6
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord r0 = r2.avcDecoderConfigurationRecord
            java.util.List r0 = r0.getPictureParameterSetsAsStrings()
            return r0
    }

    public java.lang.String[] getSPS() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord r0 = r2.avcDecoderConfigurationRecord
            java.lang.String[] r0 = r0.getSPS()
            return r0
    }

    public java.util.List<java.lang.String> getSequenceParameterSetExtsAsStrings() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox.ajc$tjp_5
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord r0 = r2.avcDecoderConfigurationRecord
            java.util.List r0 = r0.getSequenceParameterSetExtsAsStrings()
            return r0
    }

    public java.util.List<java.lang.String> getSequenceParameterSetsAsStrings() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord r0 = r2.avcDecoderConfigurationRecord
            java.util.List r0 = r0.getSequenceParameterSetsAsStrings()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox.ajc$tjp_7
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AvcNalUnitStorageBox{SPS="
            r0.<init>(r1)
            com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord r1 = r2.avcDecoderConfigurationRecord
            java.util.List r1 = r1.getSequenceParameterSetsAsStrings()
            r0.append(r1)
            java.lang.String r1 = ",PPS="
            r0.append(r1)
            com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord r1 = r2.avcDecoderConfigurationRecord
            java.util.List r1 = r1.getPictureParameterSetsAsStrings()
            r0.append(r1)
            java.lang.String r1 = ",lengthSize="
            r0.append(r1)
            com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord r1 = r2.avcDecoderConfigurationRecord
            int r1 = r1.lengthSizeMinusOne
            int r1 = r1 + 1
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
