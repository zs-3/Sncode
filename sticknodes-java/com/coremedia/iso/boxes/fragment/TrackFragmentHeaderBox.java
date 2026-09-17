package com.coremedia.iso.boxes.fragment;

/* loaded from: classes.dex */
public class TrackFragmentHeaderBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "tfhd";
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
    private long baseDataOffset;
    private boolean defaultBaseIsMoof;
    private long defaultSampleDuration;
    private com.coremedia.iso.boxes.fragment.SampleFlags defaultSampleFlags;
    private long defaultSampleSize;
    private boolean durationIsEmpty;
    private long sampleDescriptionIndex;
    private long trackId;

    static {
            ajc$preClinit()
            return
    }

    public TrackFragmentHeaderBox() {
            r2 = this;
            java.lang.String r0 = "tfhd"
            r2.<init>(r0)
            r0 = -1
            r2.baseDataOffset = r0
            r2.defaultSampleDuration = r0
            r2.defaultSampleSize = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox> r0 = com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.class
            java.lang.String r1 = "TrackFragmentHeaderBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "hasBaseDataOffset"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "boolean"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 126(0x7e, float:1.77E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "hasSampleDescriptionIndex"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "boolean"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 130(0x82, float:1.82E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDefaultSampleFlags"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "com.coremedia.iso.boxes.fragment.SampleFlags"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 166(0xa6, float:2.33E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_10 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "isDurationIsEmpty"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "boolean"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 170(0xaa, float:2.38E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_11 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "isDefaultBaseIsMoof"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "boolean"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 174(0xae, float:2.44E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_12 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setTrackId"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "trackId"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 178(0xb2, float:2.5E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_13 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setBaseDataOffset"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "baseDataOffset"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 182(0xb6, float:2.55E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_14 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setSampleDescriptionIndex"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "sampleDescriptionIndex"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 191(0xbf, float:2.68E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_15 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setDefaultSampleDuration"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "defaultSampleDuration"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 200(0xc8, float:2.8E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_16 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setDefaultSampleSize"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "defaultSampleSize"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 205(0xcd, float:2.87E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_17 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setDefaultSampleFlags"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox"
            java.lang.String r4 = "com.coremedia.iso.boxes.fragment.SampleFlags"
            java.lang.String r5 = "defaultSampleFlags"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 210(0xd2, float:2.94E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_18 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setDurationIsEmpty"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox"
            java.lang.String r4 = "boolean"
            java.lang.String r5 = "durationIsEmpty"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 215(0xd7, float:3.01E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_19 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "hasDefaultSampleDuration"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "boolean"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 134(0x86, float:1.88E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setDefaultBaseIsMoof"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox"
            java.lang.String r4 = "boolean"
            java.lang.String r5 = "defaultBaseIsMoof"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 220(0xdc, float:3.08E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_20 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 226(0xe2, float:3.17E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_21 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "hasDefaultSampleSize"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "boolean"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 138(0x8a, float:1.93E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "hasDefaultSampleFlags"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "boolean"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 142(0x8e, float:1.99E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_4 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getTrackId"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 146(0x92, float:2.05E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_5 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getBaseDataOffset"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 150(0x96, float:2.1E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_6 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getSampleDescriptionIndex"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 154(0x9a, float:2.16E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_7 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDefaultSampleDuration"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 158(0x9e, float:2.21E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_8 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDefaultSampleSize"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 162(0xa2, float:2.27E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_9 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r5) {
            r4 = this;
            r4.parseVersionAndFlags(r5)
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r5)
            r4.trackId = r0
            int r0 = r4.getFlags()
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L17
            long r2 = com.coremedia.iso.IsoTypeReader.readUInt64(r5)
            r4.baseDataOffset = r2
        L17:
            int r0 = r4.getFlags()
            r2 = 2
            r0 = r0 & r2
            if (r0 != r2) goto L25
            long r2 = com.coremedia.iso.IsoTypeReader.readUInt32(r5)
            r4.sampleDescriptionIndex = r2
        L25:
            int r0 = r4.getFlags()
            r2 = 8
            r0 = r0 & r2
            if (r0 != r2) goto L34
            long r2 = com.coremedia.iso.IsoTypeReader.readUInt32(r5)
            r4.defaultSampleDuration = r2
        L34:
            int r0 = r4.getFlags()
            r2 = 16
            r0 = r0 & r2
            if (r0 != r2) goto L43
            long r2 = com.coremedia.iso.IsoTypeReader.readUInt32(r5)
            r4.defaultSampleSize = r2
        L43:
            int r0 = r4.getFlags()
            r2 = 32
            r0 = r0 & r2
            if (r0 != r2) goto L53
            com.coremedia.iso.boxes.fragment.SampleFlags r0 = new com.coremedia.iso.boxes.fragment.SampleFlags
            r0.<init>(r5)
            r4.defaultSampleFlags = r0
        L53:
            int r5 = r4.getFlags()
            r0 = 65536(0x10000, float:9.18355E-41)
            r5 = r5 & r0
            if (r5 != r0) goto L5e
            r4.durationIsEmpty = r1
        L5e:
            int r5 = r4.getFlags()
            r0 = 131072(0x20000, float:1.83671E-40)
            r5 = r5 & r0
            if (r5 != r0) goto L69
            r4.defaultBaseIsMoof = r1
        L69:
            return
    }

    public long getBaseDataOffset() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_6
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.baseDataOffset
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.writeVersionAndFlags(r3)
            long r0 = r2.trackId
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            int r0 = r2.getFlags()
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L17
            long r0 = r2.getBaseDataOffset()
            com.coremedia.iso.IsoTypeWriter.writeUInt64(r3, r0)
        L17:
            int r0 = r2.getFlags()
            r1 = 2
            r0 = r0 & r1
            if (r0 != r1) goto L26
            long r0 = r2.getSampleDescriptionIndex()
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
        L26:
            int r0 = r2.getFlags()
            r1 = 8
            r0 = r0 & r1
            if (r0 != r1) goto L36
            long r0 = r2.getDefaultSampleDuration()
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
        L36:
            int r0 = r2.getFlags()
            r1 = 16
            r0 = r0 & r1
            if (r0 != r1) goto L46
            long r0 = r2.getDefaultSampleSize()
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
        L46:
            int r0 = r2.getFlags()
            r1 = 32
            r0 = r0 & r1
            if (r0 != r1) goto L54
            com.coremedia.iso.boxes.fragment.SampleFlags r0 = r2.defaultSampleFlags
            r0.getContent(r3)
        L54:
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r7 = this;
            int r0 = r7.getFlags()
            r1 = r0 & 1
            r2 = 1
            if (r1 != r2) goto Lc
            r1 = 16
            goto Le
        Lc:
            r1 = 8
        Le:
            r3 = r0 & 2
            r4 = 2
            r5 = 4
            if (r3 != r4) goto L16
            long r1 = r1 + r5
        L16:
            r3 = r0 & 8
            r4 = 8
            if (r3 != r4) goto L1d
            long r1 = r1 + r5
        L1d:
            r3 = r0 & 16
            r4 = 16
            if (r3 != r4) goto L24
            long r1 = r1 + r5
        L24:
            r3 = 32
            r0 = r0 & r3
            if (r0 != r3) goto L2a
            long r1 = r1 + r5
        L2a:
            return r1
    }

    public long getDefaultSampleDuration() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_8
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.defaultSampleDuration
            return r0
    }

    public com.coremedia.iso.boxes.fragment.SampleFlags getDefaultSampleFlags() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_10
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            com.coremedia.iso.boxes.fragment.SampleFlags r0 = r2.defaultSampleFlags
            return r0
    }

    public long getDefaultSampleSize() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_9
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.defaultSampleSize
            return r0
    }

    public long getSampleDescriptionIndex() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_7
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.sampleDescriptionIndex
            return r0
    }

    public long getTrackId() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_5
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.trackId
            return r0
    }

    public boolean hasBaseDataOffset() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.getFlags()
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L16
            return r1
        L16:
            r0 = 0
            return r0
    }

    public boolean hasDefaultSampleDuration() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.getFlags()
            r0 = r0 & 8
            if (r0 == 0) goto L17
            r0 = 1
            return r0
        L17:
            r0 = 0
            return r0
    }

    public boolean hasDefaultSampleFlags() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.getFlags()
            r0 = r0 & 32
            if (r0 == 0) goto L17
            r0 = 1
            return r0
        L17:
            r0 = 0
            return r0
    }

    public boolean hasDefaultSampleSize() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_3
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.getFlags()
            r0 = r0 & 16
            if (r0 == 0) goto L17
            r0 = 1
            return r0
        L17:
            r0 = 0
            return r0
    }

    public boolean hasSampleDescriptionIndex() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.getFlags()
            r0 = r0 & 2
            if (r0 == 0) goto L17
            r0 = 1
            return r0
        L17:
            r0 = 0
            return r0
    }

    public boolean isDefaultBaseIsMoof() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_12
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            boolean r0 = r2.defaultBaseIsMoof
            return r0
    }

    public boolean isDurationIsEmpty() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_11
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            boolean r0 = r2.durationIsEmpty
            return r0
    }

    public void setBaseDataOffset(long r4) {
            r3 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_14
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r4)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r3, r3, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r0 = -1
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L23
            int r0 = r3.getFlags()
            r1 = 2147483646(0x7ffffffe, float:NaN)
            r0 = r0 & r1
            r3.setFlags(r0)
            goto L2c
        L23:
            int r0 = r3.getFlags()
            r0 = r0 | 1
            r3.setFlags(r0)
        L2c:
            r3.baseDataOffset = r4
            return
    }

    public void setDefaultBaseIsMoof(boolean r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_20
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.booleanObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.getFlags()
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 | r1
            r2.setFlags(r0)
            r2.defaultBaseIsMoof = r3
            return
    }

    public void setDefaultSampleDuration(long r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_16
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.getFlags()
            r0 = r0 | 8
            r2.setFlags(r0)
            r2.defaultSampleDuration = r3
            return
    }

    public void setDefaultSampleFlags(com.coremedia.iso.boxes.fragment.SampleFlags r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_18
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.getFlags()
            r0 = r0 | 32
            r2.setFlags(r0)
            r2.defaultSampleFlags = r3
            return
    }

    public void setDefaultSampleSize(long r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_17
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.getFlags()
            r0 = r0 | 16
            r2.setFlags(r0)
            r2.defaultSampleSize = r3
            return
    }

    public void setDurationIsEmpty(boolean r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_19
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.booleanObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.getFlags()
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 | r1
            r2.setFlags(r0)
            r2.durationIsEmpty = r3
            return
    }

    public void setSampleDescriptionIndex(long r4) {
            r3 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_15
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r4)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r3, r3, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r0 = -1
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L23
            int r0 = r3.getFlags()
            r1 = 2147483645(0x7ffffffd, float:NaN)
            r0 = r0 & r1
            r3.setFlags(r0)
            goto L2c
        L23:
            int r0 = r3.getFlags()
            r0 = r0 | 2
            r3.setFlags(r0)
        L2c:
            r3.sampleDescriptionIndex = r4
            return
    }

    public void setTrackId(long r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_13
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.trackId = r3
            return
    }

    public java.lang.String toString() {
            r3 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.ajc$tjp_21
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r3, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TrackFragmentHeaderBox"
            r0.append(r1)
            java.lang.String r1 = "{trackId="
            r0.append(r1)
            long r1 = r3.trackId
            r0.append(r1)
            java.lang.String r1 = ", baseDataOffset="
            r0.append(r1)
            long r1 = r3.baseDataOffset
            r0.append(r1)
            java.lang.String r1 = ", sampleDescriptionIndex="
            r0.append(r1)
            long r1 = r3.sampleDescriptionIndex
            r0.append(r1)
            java.lang.String r1 = ", defaultSampleDuration="
            r0.append(r1)
            long r1 = r3.defaultSampleDuration
            r0.append(r1)
            java.lang.String r1 = ", defaultSampleSize="
            r0.append(r1)
            long r1 = r3.defaultSampleSize
            r0.append(r1)
            java.lang.String r1 = ", defaultSampleFlags="
            r0.append(r1)
            com.coremedia.iso.boxes.fragment.SampleFlags r1 = r3.defaultSampleFlags
            r0.append(r1)
            java.lang.String r1 = ", durationIsEmpty="
            r0.append(r1)
            boolean r1 = r3.durationIsEmpty
            r0.append(r1)
            java.lang.String r1 = ", defaultBaseIsMoof="
            r0.append(r1)
            boolean r1 = r3.defaultBaseIsMoof
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
