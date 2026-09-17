package com.coremedia.iso.boxes.fragment;

/* loaded from: classes.dex */
public class TrackRunBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "trun";
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
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_9 = null;
    private int dataOffset;
    private java.util.List<com.coremedia.iso.boxes.fragment.TrackRunBox.Entry> entries;
    private com.coremedia.iso.boxes.fragment.SampleFlags firstSampleFlags;

    public static class Entry {
        private long sampleCompositionTimeOffset;
        private long sampleDuration;
        private com.coremedia.iso.boxes.fragment.SampleFlags sampleFlags;
        private long sampleSize;

        public Entry() {
                r0 = this;
                r0.<init>()
                return
        }

        public Entry(long r1, long r3, com.coremedia.iso.boxes.fragment.SampleFlags r5, int r6) {
                r0 = this;
                r0.<init>()
                r0.sampleDuration = r1
                r0.sampleSize = r3
                r0.sampleFlags = r5
                long r1 = (long) r6
                r0.sampleCompositionTimeOffset = r1
                return
        }

        static /* synthetic */ long access$0(com.coremedia.iso.boxes.fragment.TrackRunBox.Entry r2) {
                long r0 = r2.sampleDuration
                return r0
        }

        static /* synthetic */ long access$1(com.coremedia.iso.boxes.fragment.TrackRunBox.Entry r2) {
                long r0 = r2.sampleSize
                return r0
        }

        static /* synthetic */ com.coremedia.iso.boxes.fragment.SampleFlags access$2(com.coremedia.iso.boxes.fragment.TrackRunBox.Entry r0) {
                com.coremedia.iso.boxes.fragment.SampleFlags r0 = r0.sampleFlags
                return r0
        }

        static /* synthetic */ long access$3(com.coremedia.iso.boxes.fragment.TrackRunBox.Entry r2) {
                long r0 = r2.sampleCompositionTimeOffset
                return r0
        }

        static /* synthetic */ void access$4(com.coremedia.iso.boxes.fragment.TrackRunBox.Entry r0, long r1) {
                r0.sampleDuration = r1
                return
        }

        static /* synthetic */ void access$5(com.coremedia.iso.boxes.fragment.TrackRunBox.Entry r0, long r1) {
                r0.sampleSize = r1
                return
        }

        static /* synthetic */ void access$6(com.coremedia.iso.boxes.fragment.TrackRunBox.Entry r0, com.coremedia.iso.boxes.fragment.SampleFlags r1) {
                r0.sampleFlags = r1
                return
        }

        static /* synthetic */ void access$7(com.coremedia.iso.boxes.fragment.TrackRunBox.Entry r0, long r1) {
                r0.sampleCompositionTimeOffset = r1
                return
        }

        public long getSampleCompositionTimeOffset() {
                r2 = this;
                long r0 = r2.sampleCompositionTimeOffset
                return r0
        }

        public long getSampleDuration() {
                r2 = this;
                long r0 = r2.sampleDuration
                return r0
        }

        public com.coremedia.iso.boxes.fragment.SampleFlags getSampleFlags() {
                r1 = this;
                com.coremedia.iso.boxes.fragment.SampleFlags r0 = r1.sampleFlags
                return r0
        }

        public long getSampleSize() {
                r2 = this;
                long r0 = r2.sampleSize
                return r0
        }

        public void setSampleCompositionTimeOffset(int r3) {
                r2 = this;
                long r0 = (long) r3
                r2.sampleCompositionTimeOffset = r0
                return
        }

        public void setSampleDuration(long r1) {
                r0 = this;
                r0.sampleDuration = r1
                return
        }

        public void setSampleFlags(com.coremedia.iso.boxes.fragment.SampleFlags r1) {
                r0 = this;
                r0.sampleFlags = r1
                return
        }

        public void setSampleSize(long r1) {
                r0 = this;
                r0.sampleSize = r1
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Entry{duration="
                r0.<init>(r1)
                long r1 = r3.sampleDuration
                r0.append(r1)
                java.lang.String r1 = ", size="
                r0.append(r1)
                long r1 = r3.sampleSize
                r0.append(r1)
                java.lang.String r1 = ", dlags="
                r0.append(r1)
                com.coremedia.iso.boxes.fragment.SampleFlags r1 = r3.sampleFlags
                r0.append(r1)
                java.lang.String r1 = ", compTimeOffset="
                r0.append(r1)
                long r1 = r3.sampleCompositionTimeOffset
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            ajc$preClinit()
            return
    }

    public TrackRunBox() {
            r1 = this;
            java.lang.String r0 = "trun"
            r1.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.entries = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.fragment.TrackRunBox> r0 = com.coremedia.iso.boxes.fragment.TrackRunBox.class
            java.lang.String r1 = "TrackRunBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getEntries"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackRunBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.List"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 57
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setDataOffset"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackRunBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "dataOffset"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 120(0x78, float:1.68E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setDataOffsetPresent"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackRunBox"
            java.lang.String r4 = "boolean"
            java.lang.String r5 = "v"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 267(0x10b, float:3.74E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_10 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setSampleSizePresent"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackRunBox"
            java.lang.String r4 = "boolean"
            java.lang.String r5 = "v"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 275(0x113, float:3.85E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_11 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setSampleDurationPresent"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackRunBox"
            java.lang.String r4 = "boolean"
            java.lang.String r5 = "v"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 283(0x11b, float:3.97E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_12 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setSampleFlagsPresent"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackRunBox"
            java.lang.String r4 = "boolean"
            java.lang.String r5 = "v"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 292(0x124, float:4.09E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_13 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setSampleCompositionTimeOffsetPresent"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackRunBox"
            java.lang.String r4 = "boolean"
            java.lang.String r5 = "v"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 300(0x12c, float:4.2E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_14 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDataOffset"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackRunBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 309(0x135, float:4.33E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_15 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getFirstSampleFlags"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackRunBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "com.coremedia.iso.boxes.fragment.SampleFlags"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 313(0x139, float:4.39E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_16 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setFirstSampleFlags"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackRunBox"
            java.lang.String r4 = "com.coremedia.iso.boxes.fragment.SampleFlags"
            java.lang.String r5 = "firstSampleFlags"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 317(0x13d, float:4.44E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_17 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackRunBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 327(0x147, float:4.58E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_18 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setEntries"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackRunBox"
            java.lang.String r4 = "java.util.List"
            java.lang.String r5 = "entries"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 342(0x156, float:4.79E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_19 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getSampleCompositionTimeOffsets"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackRunBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "[J"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 129(0x81, float:1.81E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getSampleCount"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackRunBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 238(0xee, float:3.34E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "isDataOffsetPresent"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackRunBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "boolean"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 242(0xf2, float:3.39E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_4 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "isFirstSampleFlagsPresent"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackRunBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "boolean"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 246(0xf6, float:3.45E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_5 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "isSampleSizePresent"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackRunBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "boolean"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 251(0xfb, float:3.52E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_6 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "isSampleDurationPresent"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackRunBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "boolean"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 255(0xff, float:3.57E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_7 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "isSampleFlagsPresent"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackRunBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "boolean"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 259(0x103, float:3.63E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_8 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "isSampleCompositionTimeOffsetPresent"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackRunBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "boolean"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 263(0x107, float:3.69E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_9 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r7) {
            r6 = this;
            r6.parseVersionAndFlags(r7)
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r7)
            int r2 = r6.getFlags()
            r3 = 1
            r2 = r2 & r3
            if (r2 != r3) goto L1a
            long r2 = com.coremedia.iso.IsoTypeReader.readUInt32(r7)
            int r2 = com.googlecode.mp4parser.util.CastUtils.l2i(r2)
            r6.dataOffset = r2
            goto L1d
        L1a:
            r2 = -1
            r6.dataOffset = r2
        L1d:
            int r2 = r6.getFlags()
            r3 = 4
            r2 = r2 & r3
            if (r2 != r3) goto L2c
            com.coremedia.iso.boxes.fragment.SampleFlags r2 = new com.coremedia.iso.boxes.fragment.SampleFlags
            r2.<init>(r7)
            r6.firstSampleFlags = r2
        L2c:
            r2 = 0
        L2d:
            long r3 = (long) r2
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 < 0) goto L33
            return
        L33:
            com.coremedia.iso.boxes.fragment.TrackRunBox$Entry r3 = new com.coremedia.iso.boxes.fragment.TrackRunBox$Entry
            r3.<init>()
            int r4 = r6.getFlags()
            r5 = 256(0x100, float:3.59E-43)
            r4 = r4 & r5
            if (r4 != r5) goto L48
            long r4 = com.coremedia.iso.IsoTypeReader.readUInt32(r7)
            com.coremedia.iso.boxes.fragment.TrackRunBox.Entry.access$4(r3, r4)
        L48:
            int r4 = r6.getFlags()
            r5 = 512(0x200, float:7.175E-43)
            r4 = r4 & r5
            if (r4 != r5) goto L58
            long r4 = com.coremedia.iso.IsoTypeReader.readUInt32(r7)
            com.coremedia.iso.boxes.fragment.TrackRunBox.Entry.access$5(r3, r4)
        L58:
            int r4 = r6.getFlags()
            r5 = 1024(0x400, float:1.435E-42)
            r4 = r4 & r5
            if (r4 != r5) goto L69
            com.coremedia.iso.boxes.fragment.SampleFlags r4 = new com.coremedia.iso.boxes.fragment.SampleFlags
            r4.<init>(r7)
            com.coremedia.iso.boxes.fragment.TrackRunBox.Entry.access$6(r3, r4)
        L69:
            int r4 = r6.getFlags()
            r5 = 2048(0x800, float:2.87E-42)
            r4 = r4 & r5
            if (r4 != r5) goto L7a
            int r4 = r7.getInt()
            long r4 = (long) r4
            com.coremedia.iso.boxes.fragment.TrackRunBox.Entry.access$7(r3, r4)
        L7a:
            java.util.List<com.coremedia.iso.boxes.fragment.TrackRunBox$Entry> r4 = r6.entries
            r4.add(r3)
            int r2 = r2 + 1
            goto L2d
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r6) {
            r5 = this;
            r5.writeVersionAndFlags(r6)
            java.util.List<com.coremedia.iso.boxes.fragment.TrackRunBox$Entry> r0 = r5.entries
            int r0 = r0.size()
            long r0 = (long) r0
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r0)
            int r0 = r5.getFlags()
            r1 = r0 & 1
            r2 = 1
            if (r1 != r2) goto L1c
            int r1 = r5.dataOffset
            long r1 = (long) r1
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r1)
        L1c:
            r1 = r0 & 4
            r2 = 4
            if (r1 != r2) goto L26
            com.coremedia.iso.boxes.fragment.SampleFlags r1 = r5.firstSampleFlags
            r1.getContent(r6)
        L26:
            java.util.List<com.coremedia.iso.boxes.fragment.TrackRunBox$Entry> r1 = r5.entries
            java.util.Iterator r1 = r1.iterator()
        L2c:
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L33
            return
        L33:
            java.lang.Object r2 = r1.next()
            com.coremedia.iso.boxes.fragment.TrackRunBox$Entry r2 = (com.coremedia.iso.boxes.fragment.TrackRunBox.Entry) r2
            r3 = r0 & 256(0x100, float:3.59E-43)
            r4 = 256(0x100, float:3.59E-43)
            if (r3 != r4) goto L46
            long r3 = com.coremedia.iso.boxes.fragment.TrackRunBox.Entry.access$0(r2)
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r3)
        L46:
            r3 = r0 & 512(0x200, float:7.175E-43)
            r4 = 512(0x200, float:7.175E-43)
            if (r3 != r4) goto L53
            long r3 = com.coremedia.iso.boxes.fragment.TrackRunBox.Entry.access$1(r2)
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r3)
        L53:
            r3 = r0 & 1024(0x400, float:1.435E-42)
            r4 = 1024(0x400, float:1.435E-42)
            if (r3 != r4) goto L60
            com.coremedia.iso.boxes.fragment.SampleFlags r3 = com.coremedia.iso.boxes.fragment.TrackRunBox.Entry.access$2(r2)
            r3.getContent(r6)
        L60:
            r3 = r0 & 2048(0x800, float:2.87E-42)
            r4 = 2048(0x800, float:2.87E-42)
            if (r3 != r4) goto L2c
            int r3 = r5.getVersion()
            if (r3 != 0) goto L74
            long r2 = com.coremedia.iso.boxes.fragment.TrackRunBox.Entry.access$3(r2)
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r2)
            goto L2c
        L74:
            long r2 = com.coremedia.iso.boxes.fragment.TrackRunBox.Entry.access$3(r2)
            int r3 = (int) r2
            r6.putInt(r3)
            goto L2c
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r9 = this;
            int r0 = r9.getFlags()
            r1 = r0 & 1
            r2 = 1
            if (r1 != r2) goto Lc
            r1 = 12
            goto Le
        Lc:
            r1 = 8
        Le:
            r3 = r0 & 4
            r4 = 4
            r5 = 4
            if (r3 != r4) goto L16
            long r1 = r1 + r5
        L16:
            r3 = 0
            r7 = r0 & 256(0x100, float:3.59E-43)
            r8 = 256(0x100, float:3.59E-43)
            if (r7 != r8) goto L1f
            r3 = r5
        L1f:
            r7 = r0 & 512(0x200, float:7.175E-43)
            r8 = 512(0x200, float:7.175E-43)
            if (r7 != r8) goto L26
            long r3 = r3 + r5
        L26:
            r7 = r0 & 1024(0x400, float:1.435E-42)
            r8 = 1024(0x400, float:1.435E-42)
            if (r7 != r8) goto L2d
            long r3 = r3 + r5
        L2d:
            r7 = 2048(0x800, float:2.87E-42)
            r0 = r0 & r7
            if (r0 != r7) goto L33
            long r3 = r3 + r5
        L33:
            java.util.List<com.coremedia.iso.boxes.fragment.TrackRunBox$Entry> r0 = r9.entries
            int r0 = r0.size()
            long r5 = (long) r0
            long r3 = r3 * r5
            long r1 = r1 + r3
            return r1
    }

    public int getDataOffset() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_15
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.dataOffset
            return r0
    }

    public java.util.List<com.coremedia.iso.boxes.fragment.TrackRunBox.Entry> getEntries() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.List<com.coremedia.iso.boxes.fragment.TrackRunBox$Entry> r0 = r2.entries
            return r0
    }

    public com.coremedia.iso.boxes.fragment.SampleFlags getFirstSampleFlags() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_16
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            com.coremedia.iso.boxes.fragment.SampleFlags r0 = r2.firstSampleFlags
            return r0
    }

    public long[] getSampleCompositionTimeOffsets() {
            r5 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r5, r5)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            boolean r0 = r5.isSampleCompositionTimeOffsetPresent()
            if (r0 == 0) goto L30
            java.util.List<com.coremedia.iso.boxes.fragment.TrackRunBox$Entry> r0 = r5.entries
            int r0 = r0.size()
            long[] r1 = new long[r0]
            r2 = 0
        L1c:
            if (r2 < r0) goto L1f
            return r1
        L1f:
            java.util.List<com.coremedia.iso.boxes.fragment.TrackRunBox$Entry> r3 = r5.entries
            java.lang.Object r3 = r3.get(r2)
            com.coremedia.iso.boxes.fragment.TrackRunBox$Entry r3 = (com.coremedia.iso.boxes.fragment.TrackRunBox.Entry) r3
            long r3 = r3.getSampleCompositionTimeOffset()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L1c
        L30:
            r0 = 0
            return r0
    }

    public long getSampleCount() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_3
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.List<com.coremedia.iso.boxes.fragment.TrackRunBox$Entry> r0 = r2.entries
            int r0 = r0.size()
            long r0 = (long) r0
            return r0
    }

    public boolean isDataOffsetPresent() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.getFlags()
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L16
            return r1
        L16:
            r0 = 0
            return r0
    }

    public boolean isFirstSampleFlagsPresent() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_5
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.getFlags()
            r1 = 4
            r0 = r0 & r1
            if (r0 != r1) goto L17
            r0 = 1
            return r0
        L17:
            r0 = 0
            return r0
    }

    public boolean isSampleCompositionTimeOffsetPresent() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_9
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.getFlags()
            r1 = 2048(0x800, float:2.87E-42)
            r0 = r0 & r1
            if (r0 != r1) goto L18
            r0 = 1
            return r0
        L18:
            r0 = 0
            return r0
    }

    public boolean isSampleDurationPresent() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_7
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.getFlags()
            r1 = 256(0x100, float:3.59E-43)
            r0 = r0 & r1
            if (r0 != r1) goto L18
            r0 = 1
            return r0
        L18:
            r0 = 0
            return r0
    }

    public boolean isSampleFlagsPresent() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_8
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.getFlags()
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r1
            if (r0 != r1) goto L18
            r0 = 1
            return r0
        L18:
            r0 = 0
            return r0
    }

    public boolean isSampleSizePresent() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_6
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.getFlags()
            r1 = 512(0x200, float:7.175E-43)
            r0 = r0 & r1
            if (r0 != r1) goto L18
            r0 = 1
            return r0
        L18:
            r0 = 0
            return r0
    }

    public void setDataOffset(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_1
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r0 = -1
            if (r3 != r0) goto L20
            int r0 = r2.getFlags()
            r1 = 16777214(0xfffffe, float:2.3509884E-38)
            r0 = r0 & r1
            r2.setFlags(r0)
            goto L29
        L20:
            int r0 = r2.getFlags()
            r0 = r0 | 1
            r2.setFlags(r0)
        L29:
            r2.dataOffset = r3
            return
    }

    public void setDataOffsetPresent(boolean r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_10
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.booleanObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            if (r3 == 0) goto L1d
            int r3 = r2.getFlags()
            r3 = r3 | 1
            r2.setFlags(r3)
            goto L28
        L1d:
            int r3 = r2.getFlags()
            r0 = 16777214(0xfffffe, float:2.3509884E-38)
            r3 = r3 & r0
            r2.setFlags(r3)
        L28:
            return
    }

    public void setEntries(java.util.List<com.coremedia.iso.boxes.fragment.TrackRunBox.Entry> r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_19
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.entries = r3
            return
    }

    public void setFirstSampleFlags(com.coremedia.iso.boxes.fragment.SampleFlags r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_17
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            if (r3 != 0) goto L1b
            int r0 = r2.getFlags()
            r1 = 16777211(0xfffffb, float:2.350988E-38)
            r0 = r0 & r1
            r2.setFlags(r0)
            goto L24
        L1b:
            int r0 = r2.getFlags()
            r0 = r0 | 4
            r2.setFlags(r0)
        L24:
            r2.firstSampleFlags = r3
            return
    }

    public void setSampleCompositionTimeOffsetPresent(boolean r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_14
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.booleanObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            if (r3 == 0) goto L1d
            int r3 = r2.getFlags()
            r3 = r3 | 2048(0x800, float:2.87E-42)
            r2.setFlags(r3)
            goto L28
        L1d:
            int r3 = r2.getFlags()
            r0 = 16775167(0xfff7ff, float:2.3507016E-38)
            r3 = r3 & r0
            r2.setFlags(r3)
        L28:
            return
    }

    public void setSampleDurationPresent(boolean r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_12
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.booleanObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            if (r3 == 0) goto L1d
            int r3 = r2.getFlags()
            r3 = r3 | 256(0x100, float:3.59E-43)
            r2.setFlags(r3)
            goto L28
        L1d:
            int r3 = r2.getFlags()
            r0 = 16776959(0xfffeff, float:2.3509527E-38)
            r3 = r3 & r0
            r2.setFlags(r3)
        L28:
            return
    }

    public void setSampleFlagsPresent(boolean r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_13
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.booleanObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            if (r3 == 0) goto L1d
            int r3 = r2.getFlags()
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r2.setFlags(r3)
            goto L28
        L1d:
            int r3 = r2.getFlags()
            r0 = 16776191(0xfffbff, float:2.350845E-38)
            r3 = r3 & r0
            r2.setFlags(r3)
        L28:
            return
    }

    public void setSampleSizePresent(boolean r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_11
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.booleanObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            if (r3 == 0) goto L1d
            int r3 = r2.getFlags()
            r3 = r3 | 512(0x200, float:7.175E-43)
            r2.setFlags(r3)
            goto L28
        L1d:
            int r3 = r2.getFlags()
            r0 = 16776703(0xfffdff, float:2.3509168E-38)
            r3 = r3 & r0
            r2.setFlags(r3)
        L28:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackRunBox.ajc$tjp_18
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TrackRunBox"
            r0.append(r1)
            java.lang.String r1 = "{sampleCount="
            r0.append(r1)
            java.util.List<com.coremedia.iso.boxes.fragment.TrackRunBox$Entry> r1 = r2.entries
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = ", dataOffset="
            r0.append(r1)
            int r1 = r2.dataOffset
            r0.append(r1)
            java.lang.String r1 = ", dataOffsetPresent="
            r0.append(r1)
            boolean r1 = r2.isDataOffsetPresent()
            r0.append(r1)
            java.lang.String r1 = ", sampleSizePresent="
            r0.append(r1)
            boolean r1 = r2.isSampleSizePresent()
            r0.append(r1)
            java.lang.String r1 = ", sampleDurationPresent="
            r0.append(r1)
            boolean r1 = r2.isSampleDurationPresent()
            r0.append(r1)
            java.lang.String r1 = ", sampleFlagsPresentPresent="
            r0.append(r1)
            boolean r1 = r2.isSampleFlagsPresent()
            r0.append(r1)
            java.lang.String r1 = ", sampleCompositionTimeOffsetPresent="
            r0.append(r1)
            boolean r1 = r2.isSampleCompositionTimeOffsetPresent()
            r0.append(r1)
            java.lang.String r1 = ", firstSampleFlags="
            r0.append(r1)
            com.coremedia.iso.boxes.fragment.SampleFlags r1 = r2.firstSampleFlags
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
