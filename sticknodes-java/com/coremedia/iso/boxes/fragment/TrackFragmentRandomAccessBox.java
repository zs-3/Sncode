package com.coremedia.iso.boxes.fragment;

/* loaded from: classes.dex */
public class TrackFragmentRandomAccessBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "tfra";
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
    private java.util.List<com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry> entries;
    private int lengthSizeOfSampleNum;
    private int lengthSizeOfTrafNum;
    private int lengthSizeOfTrunNum;
    private int reserved;
    private long trackId;

    public static class Entry {
        private long moofOffset;
        private long sampleNumber;
        private long time;
        private long trafNumber;
        private long trunNumber;

        public Entry() {
                r0 = this;
                r0.<init>()
                return
        }

        public Entry(long r1, long r3, long r5, long r7, long r9) {
                r0 = this;
                r0.<init>()
                r0.moofOffset = r3
                r0.sampleNumber = r9
                r0.time = r1
                r0.trafNumber = r5
                r0.trunNumber = r7
                return
        }

        static /* synthetic */ void access$0(com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry r0, long r1) {
                r0.time = r1
                return
        }

        static /* synthetic */ void access$1(com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry r0, long r1) {
                r0.moofOffset = r1
                return
        }

        static /* synthetic */ void access$2(com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry r0, long r1) {
                r0.trafNumber = r1
                return
        }

        static /* synthetic */ void access$3(com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry r0, long r1) {
                r0.trunNumber = r1
                return
        }

        static /* synthetic */ void access$4(com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry r0, long r1) {
                r0.sampleNumber = r1
                return
        }

        static /* synthetic */ long access$5(com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry r2) {
                long r0 = r2.time
                return r0
        }

        static /* synthetic */ long access$6(com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry r2) {
                long r0 = r2.moofOffset
                return r0
        }

        static /* synthetic */ long access$7(com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry r2) {
                long r0 = r2.trafNumber
                return r0
        }

        static /* synthetic */ long access$8(com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry r2) {
                long r0 = r2.trunNumber
                return r0
        }

        static /* synthetic */ long access$9(com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry r2) {
                long r0 = r2.sampleNumber
                return r0
        }

        public boolean equals(java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                r1 = 0
                if (r8 == 0) goto L42
                java.lang.Class r2 = r7.getClass()
                java.lang.Class r3 = r8.getClass()
                if (r2 == r3) goto L12
                goto L42
            L12:
                com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox$Entry r8 = (com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry) r8
                long r2 = r7.moofOffset
                long r4 = r8.moofOffset
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L1d
                return r1
            L1d:
                long r2 = r7.sampleNumber
                long r4 = r8.sampleNumber
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L26
                return r1
            L26:
                long r2 = r7.time
                long r4 = r8.time
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L2f
                return r1
            L2f:
                long r2 = r7.trafNumber
                long r4 = r8.trafNumber
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L38
                return r1
            L38:
                long r2 = r7.trunNumber
                long r4 = r8.trunNumber
                int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r8 == 0) goto L41
                return r1
            L41:
                return r0
            L42:
                return r1
        }

        public long getMoofOffset() {
                r2 = this;
                long r0 = r2.moofOffset
                return r0
        }

        public long getSampleNumber() {
                r2 = this;
                long r0 = r2.sampleNumber
                return r0
        }

        public long getTime() {
                r2 = this;
                long r0 = r2.time
                return r0
        }

        public long getTrafNumber() {
                r2 = this;
                long r0 = r2.trafNumber
                return r0
        }

        public long getTrunNumber() {
                r2 = this;
                long r0 = r2.trunNumber
                return r0
        }

        public int hashCode() {
                r7 = this;
                long r0 = r7.time
                r2 = 32
                long r3 = r0 >>> r2
                long r0 = r0 ^ r3
                int r1 = (int) r0
                int r1 = r1 * 31
                long r3 = r7.moofOffset
                long r5 = r3 >>> r2
                long r3 = r3 ^ r5
                int r0 = (int) r3
                int r1 = r1 + r0
                int r1 = r1 * 31
                long r3 = r7.trafNumber
                long r5 = r3 >>> r2
                long r3 = r3 ^ r5
                int r0 = (int) r3
                int r1 = r1 + r0
                int r1 = r1 * 31
                long r3 = r7.trunNumber
                long r5 = r3 >>> r2
                long r3 = r3 ^ r5
                int r0 = (int) r3
                int r1 = r1 + r0
                int r1 = r1 * 31
                long r3 = r7.sampleNumber
                long r5 = r3 >>> r2
                long r2 = r3 ^ r5
                int r0 = (int) r2
                int r1 = r1 + r0
                return r1
        }

        public void setMoofOffset(long r1) {
                r0 = this;
                r0.moofOffset = r1
                return
        }

        public void setSampleNumber(long r1) {
                r0 = this;
                r0.sampleNumber = r1
                return
        }

        public void setTime(long r1) {
                r0 = this;
                r0.time = r1
                return
        }

        public void setTrafNumber(long r1) {
                r0 = this;
                r0.trafNumber = r1
                return
        }

        public void setTrunNumber(long r1) {
                r0 = this;
                r0.trunNumber = r1
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Entry{time="
                r0.<init>(r1)
                long r1 = r3.time
                r0.append(r1)
                java.lang.String r1 = ", moofOffset="
                r0.append(r1)
                long r1 = r3.moofOffset
                r0.append(r1)
                java.lang.String r1 = ", trafNumber="
                r0.append(r1)
                long r1 = r3.trafNumber
                r0.append(r1)
                java.lang.String r1 = ", trunNumber="
                r0.append(r1)
                long r1 = r3.trunNumber
                r0.append(r1)
                java.lang.String r1 = ", sampleNumber="
                r0.append(r1)
                long r1 = r3.sampleNumber
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

    public TrackFragmentRandomAccessBox() {
            r1 = this;
            java.lang.String r0 = "tfra"
            r1.<init>(r0)
            r0 = 2
            r1.lengthSizeOfTrafNum = r0
            r1.lengthSizeOfTrunNum = r0
            r1.lengthSizeOfSampleNum = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r1.entries = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox> r0 = com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.class
            java.lang.String r1 = "TrackFragmentRandomAccessBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "setTrackId"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "trackId"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 145(0x91, float:2.03E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setLengthSizeOfTrafNum"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "lengthSizeOfTrafNum"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 149(0x95, float:2.09E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getEntries"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.List"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 185(0xb9, float:2.59E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.ajc$tjp_10 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setEntries"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox"
            java.lang.String r4 = "java.util.List"
            java.lang.String r5 = "entries"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 189(0xbd, float:2.65E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.ajc$tjp_11 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 290(0x122, float:4.06E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.ajc$tjp_12 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setLengthSizeOfTrunNum"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "lengthSizeOfTrunNum"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 153(0x99, float:2.14E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setLengthSizeOfSampleNum"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "lengthSizeOfSampleNum"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 157(0x9d, float:2.2E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getTrackId"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 161(0xa1, float:2.26E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.ajc$tjp_4 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getReserved"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 165(0xa5, float:2.31E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.ajc$tjp_5 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getLengthSizeOfTrafNum"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 169(0xa9, float:2.37E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.ajc$tjp_6 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getLengthSizeOfTrunNum"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 173(0xad, float:2.42E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.ajc$tjp_7 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getLengthSizeOfSampleNum"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 177(0xb1, float:2.48E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.ajc$tjp_8 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getNumberOfEntries"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 181(0xb5, float:2.54E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.ajc$tjp_9 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r8) {
            r7 = this;
            r7.parseVersionAndFlags(r8)
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r8)
            r7.trackId = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r8)
            r2 = 6
            long r2 = r0 >> r2
            int r3 = (int) r2
            r7.reserved = r3
            r2 = 63
            long r2 = r2 & r0
            int r3 = (int) r2
            int r2 = r3 >> 4
            r3 = 1
            int r2 = r2 + r3
            r7.lengthSizeOfTrafNum = r2
            r4 = 12
            long r4 = r4 & r0
            int r2 = (int) r4
            int r2 = r2 >> 2
            int r2 = r2 + r3
            r7.lengthSizeOfTrunNum = r2
            r4 = 3
            long r0 = r0 & r4
            int r1 = (int) r0
            int r1 = r1 + r3
            r7.lengthSizeOfSampleNum = r1
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r8)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r7.entries = r2
            r2 = 0
        L39:
            long r4 = (long) r2
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 < 0) goto L3f
            return
        L3f:
            com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox$Entry r4 = new com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox$Entry
            r4.<init>()
            int r5 = r7.getVersion()
            if (r5 != r3) goto L59
            long r5 = com.coremedia.iso.IsoTypeReader.readUInt64(r8)
            com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry.access$0(r4, r5)
            long r5 = com.coremedia.iso.IsoTypeReader.readUInt64(r8)
            com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry.access$1(r4, r5)
            goto L67
        L59:
            long r5 = com.coremedia.iso.IsoTypeReader.readUInt32(r8)
            com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry.access$0(r4, r5)
            long r5 = com.coremedia.iso.IsoTypeReader.readUInt32(r8)
            com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry.access$1(r4, r5)
        L67:
            int r5 = r7.lengthSizeOfTrafNum
            long r5 = com.coremedia.iso.IsoTypeReaderVariable.read(r8, r5)
            com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry.access$2(r4, r5)
            int r5 = r7.lengthSizeOfTrunNum
            long r5 = com.coremedia.iso.IsoTypeReaderVariable.read(r8, r5)
            com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry.access$3(r4, r5)
            int r5 = r7.lengthSizeOfSampleNum
            long r5 = com.coremedia.iso.IsoTypeReaderVariable.read(r8, r5)
            com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry.access$4(r4, r5)
            java.util.List<com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox$Entry> r5 = r7.entries
            r5.add(r4)
            int r2 = r2 + 1
            goto L39
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r7) {
            r6 = this;
            r6.writeVersionAndFlags(r7)
            long r0 = r6.trackId
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r7, r0)
            int r0 = r6.reserved
            int r0 = r0 << 6
            long r0 = (long) r0
            int r2 = r6.lengthSizeOfTrafNum
            r3 = 1
            int r2 = r2 - r3
            r2 = r2 & 3
            int r2 = r2 << 4
            long r4 = (long) r2
            long r0 = r0 | r4
            int r2 = r6.lengthSizeOfTrunNum
            int r2 = r2 - r3
            r2 = r2 & 3
            int r2 = r2 << 2
            long r4 = (long) r2
            long r0 = r0 | r4
            int r2 = r6.lengthSizeOfSampleNum
            int r2 = r2 - r3
            r2 = r2 & 3
            long r4 = (long) r2
            long r0 = r0 | r4
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r7, r0)
            java.util.List<com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox$Entry> r0 = r6.entries
            int r0 = r0.size()
            long r0 = (long) r0
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r7, r0)
            java.util.List<com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox$Entry> r0 = r6.entries
            java.util.Iterator r0 = r0.iterator()
        L3a:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L41
            return
        L41:
            java.lang.Object r1 = r0.next()
            com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox$Entry r1 = (com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry) r1
            int r2 = r6.getVersion()
            if (r2 != r3) goto L5c
            long r4 = com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry.access$5(r1)
            com.coremedia.iso.IsoTypeWriter.writeUInt64(r7, r4)
            long r4 = com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry.access$6(r1)
            com.coremedia.iso.IsoTypeWriter.writeUInt64(r7, r4)
            goto L6a
        L5c:
            long r4 = com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry.access$5(r1)
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r7, r4)
            long r4 = com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry.access$6(r1)
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r7, r4)
        L6a:
            long r4 = com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry.access$7(r1)
            int r2 = r6.lengthSizeOfTrafNum
            com.coremedia.iso.IsoTypeWriterVariable.write(r4, r7, r2)
            long r4 = com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry.access$8(r1)
            int r2 = r6.lengthSizeOfTrunNum
            com.coremedia.iso.IsoTypeWriterVariable.write(r4, r7, r2)
            long r1 = com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry.access$9(r1)
            int r4 = r6.lengthSizeOfSampleNum
            com.coremedia.iso.IsoTypeWriterVariable.write(r1, r7, r4)
            goto L3a
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r5 = this;
            int r0 = r5.getVersion()
            r1 = 16
            r3 = 1
            if (r0 != r3) goto L12
            java.util.List<com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox$Entry> r0 = r5.entries
            int r0 = r0.size()
            int r0 = r0 * 16
            goto L1a
        L12:
            java.util.List<com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox$Entry> r0 = r5.entries
            int r0 = r0.size()
            int r0 = r0 * 8
        L1a:
            long r3 = (long) r0
            long r1 = r1 + r3
            int r0 = r5.lengthSizeOfTrafNum
            java.util.List<com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox$Entry> r3 = r5.entries
            int r3 = r3.size()
            int r0 = r0 * r3
            long r3 = (long) r0
            long r1 = r1 + r3
            int r0 = r5.lengthSizeOfTrunNum
            java.util.List<com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox$Entry> r3 = r5.entries
            int r3 = r3.size()
            int r0 = r0 * r3
            long r3 = (long) r0
            long r1 = r1 + r3
            int r0 = r5.lengthSizeOfSampleNum
            java.util.List<com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox$Entry> r3 = r5.entries
            int r3 = r3.size()
            int r0 = r0 * r3
            long r3 = (long) r0
            long r1 = r1 + r3
            return r1
    }

    public java.util.List<com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry> getEntries() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.ajc$tjp_10
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.List<com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox$Entry> r0 = r2.entries
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public int getLengthSizeOfSampleNum() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.ajc$tjp_8
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.lengthSizeOfSampleNum
            return r0
    }

    public int getLengthSizeOfTrafNum() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.ajc$tjp_6
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.lengthSizeOfTrafNum
            return r0
    }

    public int getLengthSizeOfTrunNum() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.ajc$tjp_7
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.lengthSizeOfTrunNum
            return r0
    }

    public long getNumberOfEntries() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.ajc$tjp_9
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.List<com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox$Entry> r0 = r2.entries
            int r0 = r0.size()
            long r0 = (long) r0
            return r0
    }

    public int getReserved() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.ajc$tjp_5
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.reserved
            return r0
    }

    public long getTrackId() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.trackId
            return r0
    }

    public void setEntries(java.util.List<com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry> r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.ajc$tjp_11
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.entries = r3
            return
    }

    public void setLengthSizeOfSampleNum(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.ajc$tjp_3
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.lengthSizeOfSampleNum = r3
            return
    }

    public void setLengthSizeOfTrafNum(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.ajc$tjp_1
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.lengthSizeOfTrafNum = r3
            return
    }

    public void setLengthSizeOfTrunNum(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.ajc$tjp_2
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.lengthSizeOfTrunNum = r3
            return
    }

    public void setTrackId(long r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.ajc$tjp_0
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.trackId = r3
            return
    }

    public java.lang.String toString() {
            r3 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.ajc$tjp_12
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r3, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TrackFragmentRandomAccessBox{trackId="
            r0.<init>(r1)
            long r1 = r3.trackId
            r0.append(r1)
            java.lang.String r1 = ", entries="
            r0.append(r1)
            java.util.List<com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox$Entry> r1 = r3.entries
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
