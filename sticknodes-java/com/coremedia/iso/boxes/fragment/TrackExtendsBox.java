package com.coremedia.iso.boxes.fragment;

/* loaded from: classes.dex */
public class TrackExtendsBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "trex";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_10 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_9 = null;
    private long defaultSampleDescriptionIndex;
    private long defaultSampleDuration;
    private com.coremedia.iso.boxes.fragment.SampleFlags defaultSampleFlags;
    private long defaultSampleSize;
    private long trackId;

    static {
            ajc$preClinit()
            return
    }

    public TrackExtendsBox() {
            r1 = this;
            java.lang.String r0 = "trex"
            r1.<init>(r0)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.fragment.TrackExtendsBox> r0 = com.coremedia.iso.boxes.fragment.TrackExtendsBox.class
            java.lang.String r1 = "TrackExtendsBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getTrackId"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackExtendsBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 72
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackExtendsBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDefaultSampleDescriptionIndex"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackExtendsBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 76
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackExtendsBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setDefaultSampleFlags"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackExtendsBox"
            java.lang.String r4 = "com.coremedia.iso.boxes.fragment.SampleFlags"
            java.lang.String r5 = "defaultSampleFlags"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 112(0x70, float:1.57E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackExtendsBox.ajc$tjp_10 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDefaultSampleDuration"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackExtendsBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 80
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackExtendsBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDefaultSampleSize"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackExtendsBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 84
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackExtendsBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDefaultSampleFlags"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackExtendsBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "com.coremedia.iso.boxes.fragment.SampleFlags"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 88
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackExtendsBox.ajc$tjp_4 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDefaultSampleFlagsStr"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackExtendsBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 92
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackExtendsBox.ajc$tjp_5 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setTrackId"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackExtendsBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "trackId"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 96
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackExtendsBox.ajc$tjp_6 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setDefaultSampleDescriptionIndex"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackExtendsBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "defaultSampleDescriptionIndex"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 100
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackExtendsBox.ajc$tjp_7 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setDefaultSampleDuration"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackExtendsBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "defaultSampleDuration"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 104(0x68, float:1.46E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackExtendsBox.ajc$tjp_8 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setDefaultSampleSize"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackExtendsBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "defaultSampleSize"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 108(0x6c, float:1.51E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackExtendsBox.ajc$tjp_9 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.parseVersionAndFlags(r3)
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r3)
            r2.trackId = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r3)
            r2.defaultSampleDescriptionIndex = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r3)
            r2.defaultSampleDuration = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r3)
            r2.defaultSampleSize = r0
            com.coremedia.iso.boxes.fragment.SampleFlags r0 = new com.coremedia.iso.boxes.fragment.SampleFlags
            r0.<init>(r3)
            r2.defaultSampleFlags = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.writeVersionAndFlags(r3)
            long r0 = r2.trackId
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            long r0 = r2.defaultSampleDescriptionIndex
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            long r0 = r2.defaultSampleDuration
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            long r0 = r2.defaultSampleSize
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            com.coremedia.iso.boxes.fragment.SampleFlags r0 = r2.defaultSampleFlags
            r0.getContent(r3)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            r0 = 24
            return r0
    }

    public long getDefaultSampleDescriptionIndex() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackExtendsBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.defaultSampleDescriptionIndex
            return r0
    }

    public long getDefaultSampleDuration() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackExtendsBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.defaultSampleDuration
            return r0
    }

    public com.coremedia.iso.boxes.fragment.SampleFlags getDefaultSampleFlags() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackExtendsBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            com.coremedia.iso.boxes.fragment.SampleFlags r0 = r2.defaultSampleFlags
            return r0
    }

    public java.lang.String getDefaultSampleFlagsStr() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackExtendsBox.ajc$tjp_5
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            com.coremedia.iso.boxes.fragment.SampleFlags r0 = r2.defaultSampleFlags
            java.lang.String r0 = r0.toString()
            return r0
    }

    public long getDefaultSampleSize() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackExtendsBox.ajc$tjp_3
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.defaultSampleSize
            return r0
    }

    public long getTrackId() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackExtendsBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.trackId
            return r0
    }

    public void setDefaultSampleDescriptionIndex(long r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackExtendsBox.ajc$tjp_7
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.defaultSampleDescriptionIndex = r3
            return
    }

    public void setDefaultSampleDuration(long r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackExtendsBox.ajc$tjp_8
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.defaultSampleDuration = r3
            return
    }

    public void setDefaultSampleFlags(com.coremedia.iso.boxes.fragment.SampleFlags r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackExtendsBox.ajc$tjp_10
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.defaultSampleFlags = r3
            return
    }

    public void setDefaultSampleSize(long r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackExtendsBox.ajc$tjp_9
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.defaultSampleSize = r3
            return
    }

    public void setTrackId(long r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackExtendsBox.ajc$tjp_6
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.trackId = r3
            return
    }
}
