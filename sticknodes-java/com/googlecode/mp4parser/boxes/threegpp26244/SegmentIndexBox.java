package com.googlecode.mp4parser.boxes.threegpp26244;

/* loaded from: classes2.dex */
public class SegmentIndexBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "sidx";
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
    long earliestPresentationTime;
    java.util.List<com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.Entry> entries;
    long firstOffset;
    long referenceId;
    int reserved;
    long timeScale;

    public static class Entry {
        byte referenceType;
        int referencedSize;
        int sapDeltaTime;
        byte sapType;
        byte startsWithSap;
        long subsegmentDuration;

        public Entry() {
                r0 = this;
                r0.<init>()
                return
        }

        public Entry(int r1, int r2, long r3, boolean r5, int r6, int r7) {
                r0 = this;
                r0.<init>()
                byte r1 = (byte) r1
                r0.referenceType = r1
                r0.referencedSize = r2
                r0.subsegmentDuration = r3
                byte r1 = (byte) r5
                r0.startsWithSap = r1
                byte r1 = (byte) r6
                r0.sapType = r1
                r0.sapDeltaTime = r7
                return
        }

        public boolean equals(java.lang.Object r7) {
                r6 = this;
                r0 = 1
                if (r6 != r7) goto L4
                return r0
            L4:
                r1 = 0
                if (r7 == 0) goto L41
                java.lang.Class r2 = r6.getClass()
                java.lang.Class r3 = r7.getClass()
                if (r2 == r3) goto L12
                goto L41
            L12:
                com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox$Entry r7 = (com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.Entry) r7
                byte r2 = r6.referenceType
                byte r3 = r7.referenceType
                if (r2 == r3) goto L1b
                return r1
            L1b:
                int r2 = r6.referencedSize
                int r3 = r7.referencedSize
                if (r2 == r3) goto L22
                return r1
            L22:
                int r2 = r6.sapDeltaTime
                int r3 = r7.sapDeltaTime
                if (r2 == r3) goto L29
                return r1
            L29:
                byte r2 = r6.sapType
                byte r3 = r7.sapType
                if (r2 == r3) goto L30
                return r1
            L30:
                byte r2 = r6.startsWithSap
                byte r3 = r7.startsWithSap
                if (r2 == r3) goto L37
                return r1
            L37:
                long r2 = r6.subsegmentDuration
                long r4 = r7.subsegmentDuration
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 == 0) goto L40
                return r1
            L40:
                return r0
            L41:
                return r1
        }

        public byte getReferenceType() {
                r1 = this;
                byte r0 = r1.referenceType
                return r0
        }

        public int getReferencedSize() {
                r1 = this;
                int r0 = r1.referencedSize
                return r0
        }

        public int getSapDeltaTime() {
                r1 = this;
                int r0 = r1.sapDeltaTime
                return r0
        }

        public byte getSapType() {
                r1 = this;
                byte r0 = r1.sapType
                return r0
        }

        public byte getStartsWithSap() {
                r1 = this;
                byte r0 = r1.startsWithSap
                return r0
        }

        public long getSubsegmentDuration() {
                r2 = this;
                long r0 = r2.subsegmentDuration
                return r0
        }

        public int hashCode() {
                r5 = this;
                byte r0 = r5.referenceType
                int r0 = r0 * 31
                int r1 = r5.referencedSize
                int r0 = r0 + r1
                int r0 = r0 * 31
                long r1 = r5.subsegmentDuration
                r3 = 32
                long r3 = r1 >>> r3
                long r1 = r1 ^ r3
                int r2 = (int) r1
                int r0 = r0 + r2
                int r0 = r0 * 31
                byte r1 = r5.startsWithSap
                int r0 = r0 + r1
                int r0 = r0 * 31
                byte r1 = r5.sapType
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r5.sapDeltaTime
                int r0 = r0 + r1
                return r0
        }

        public void setReferenceType(byte r1) {
                r0 = this;
                r0.referenceType = r1
                return
        }

        public void setReferencedSize(int r1) {
                r0 = this;
                r0.referencedSize = r1
                return
        }

        public void setSapDeltaTime(int r1) {
                r0 = this;
                r0.sapDeltaTime = r1
                return
        }

        public void setSapType(byte r1) {
                r0 = this;
                r0.sapType = r1
                return
        }

        public void setStartsWithSap(byte r1) {
                r0 = this;
                r0.startsWithSap = r1
                return
        }

        public void setSubsegmentDuration(long r1) {
                r0 = this;
                r0.subsegmentDuration = r1
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Entry{referenceType="
                r0.<init>(r1)
                byte r1 = r3.referenceType
                r0.append(r1)
                java.lang.String r1 = ", referencedSize="
                r0.append(r1)
                int r1 = r3.referencedSize
                r0.append(r1)
                java.lang.String r1 = ", subsegmentDuration="
                r0.append(r1)
                long r1 = r3.subsegmentDuration
                r0.append(r1)
                java.lang.String r1 = ", startsWithSap="
                r0.append(r1)
                byte r1 = r3.startsWithSap
                r0.append(r1)
                java.lang.String r1 = ", sapType="
                r0.append(r1)
                byte r1 = r3.sapType
                r0.append(r1)
                java.lang.String r1 = ", sapDeltaTime="
                r0.append(r1)
                int r1 = r3.sapDeltaTime
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

    public SegmentIndexBox() {
            r1 = this;
            java.lang.String r0 = "sidx"
            r1.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.entries = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox> r0 = com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.class
            java.lang.String r1 = "SegmentIndexBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getEntries"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.List"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 128(0x80, float:1.794E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setEntries"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox"
            java.lang.String r4 = "java.util.List"
            java.lang.String r5 = "entries"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 132(0x84, float:1.85E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getReserved"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 168(0xa8, float:2.35E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.ajc$tjp_10 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setReserved"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "reserved"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 172(0xac, float:2.41E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.ajc$tjp_11 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 298(0x12a, float:4.18E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.ajc$tjp_12 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getReferenceId"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 136(0x88, float:1.9E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setReferenceId"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "referenceId"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 140(0x8c, float:1.96E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getTimeScale"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 144(0x90, float:2.02E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.ajc$tjp_4 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setTimeScale"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "timeScale"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 148(0x94, float:2.07E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.ajc$tjp_5 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getEarliestPresentationTime"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 152(0x98, float:2.13E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.ajc$tjp_6 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setEarliestPresentationTime"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "earliestPresentationTime"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 156(0x9c, float:2.19E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.ajc$tjp_7 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getFirstOffset"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 160(0xa0, float:2.24E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.ajc$tjp_8 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setFirstOffset"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "firstOffset"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 164(0xa4, float:2.3E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.ajc$tjp_9 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(java.nio.ByteBuffer r8) {
            r7 = this;
            r7.parseVersionAndFlags(r8)
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r8)
            r7.referenceId = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r8)
            r7.timeScale = r0
            int r0 = r7.getVersion()
            if (r0 != 0) goto L22
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r8)
            r7.earliestPresentationTime = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r8)
            r7.firstOffset = r0
            goto L2e
        L22:
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt64(r8)
            r7.earliestPresentationTime = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt64(r8)
            r7.firstOffset = r0
        L2e:
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r8)
            r7.reserved = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r8)
            r1 = 0
        L39:
            if (r1 < r0) goto L3c
            return
        L3c:
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r2 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer
            r2.<init>(r8)
            com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox$Entry r3 = new com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox$Entry
            r3.<init>()
            r4 = 1
            int r5 = r2.readBits(r4)
            byte r5 = (byte) r5
            r3.setReferenceType(r5)
            r5 = 31
            int r2 = r2.readBits(r5)
            r3.setReferencedSize(r2)
            long r5 = com.coremedia.iso.IsoTypeReader.readUInt32(r8)
            r3.setSubsegmentDuration(r5)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r2 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer
            r2.<init>(r8)
            int r4 = r2.readBits(r4)
            byte r4 = (byte) r4
            r3.setStartsWithSap(r4)
            r4 = 3
            int r4 = r2.readBits(r4)
            byte r4 = (byte) r4
            r3.setSapType(r4)
            r4 = 28
            int r2 = r2.readBits(r4)
            r3.setSapDeltaTime(r2)
            java.util.List<com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox$Entry> r2 = r7.entries
            r2.add(r3)
            int r1 = r1 + 1
            goto L39
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r7) {
            r6 = this;
            r6.writeVersionAndFlags(r7)
            long r0 = r6.referenceId
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r7, r0)
            long r0 = r6.timeScale
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r7, r0)
            int r0 = r6.getVersion()
            if (r0 != 0) goto L1e
            long r0 = r6.earliestPresentationTime
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r7, r0)
            long r0 = r6.firstOffset
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r7, r0)
            goto L28
        L1e:
            long r0 = r6.earliestPresentationTime
            com.coremedia.iso.IsoTypeWriter.writeUInt64(r7, r0)
            long r0 = r6.firstOffset
            com.coremedia.iso.IsoTypeWriter.writeUInt64(r7, r0)
        L28:
            int r0 = r6.reserved
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r7, r0)
            java.util.List<com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox$Entry> r0 = r6.entries
            int r0 = r0.size()
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r7, r0)
            java.util.List<com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox$Entry> r0 = r6.entries
            java.util.Iterator r0 = r0.iterator()
        L3c:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L43
            return
        L43:
            java.lang.Object r1 = r0.next()
            com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox$Entry r1 = (com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.Entry) r1
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer r2 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer
            r2.<init>(r7)
            byte r3 = r1.getReferenceType()
            r4 = 1
            r2.writeBits(r3, r4)
            int r3 = r1.getReferencedSize()
            r5 = 31
            r2.writeBits(r3, r5)
            long r2 = r1.getSubsegmentDuration()
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r7, r2)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer r2 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer
            r2.<init>(r7)
            byte r3 = r1.getStartsWithSap()
            r2.writeBits(r3, r4)
            byte r3 = r1.getSapType()
            r4 = 3
            r2.writeBits(r3, r4)
            int r1 = r1.getSapDeltaTime()
            r3 = 28
            r2.writeBits(r1, r3)
            goto L3c
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r4 = this;
            int r0 = r4.getVersion()
            if (r0 != 0) goto L9
            r0 = 8
            goto Lb
        L9:
            r0 = 16
        Lb:
            long r0 = (long) r0
            r2 = 12
            long r2 = r2 + r0
            r0 = 2
            long r2 = r2 + r0
            long r2 = r2 + r0
            java.util.List<com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox$Entry> r0 = r4.entries
            int r0 = r0.size()
            int r0 = r0 * 12
            long r0 = (long) r0
            long r2 = r2 + r0
            return r2
    }

    public long getEarliestPresentationTime() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.ajc$tjp_6
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.earliestPresentationTime
            return r0
    }

    public java.util.List<com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.Entry> getEntries() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.List<com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox$Entry> r0 = r2.entries
            return r0
    }

    public long getFirstOffset() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.ajc$tjp_8
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.firstOffset
            return r0
    }

    public long getReferenceId() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.referenceId
            return r0
    }

    public int getReserved() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.ajc$tjp_10
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.reserved
            return r0
    }

    public long getTimeScale() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.timeScale
            return r0
    }

    public void setEarliestPresentationTime(long r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.ajc$tjp_7
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.earliestPresentationTime = r3
            return
    }

    public void setEntries(java.util.List<com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.Entry> r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.entries = r3
            return
    }

    public void setFirstOffset(long r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.ajc$tjp_9
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.firstOffset = r3
            return
    }

    public void setReferenceId(long r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.ajc$tjp_3
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.referenceId = r3
            return
    }

    public void setReserved(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.ajc$tjp_11
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.reserved = r3
            return
    }

    public void setTimeScale(long r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.ajc$tjp_5
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.timeScale = r3
            return
    }

    public java.lang.String toString() {
            r3 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.ajc$tjp_12
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r3, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SegmentIndexBox{entries="
            r0.<init>(r1)
            java.util.List<com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox$Entry> r1 = r3.entries
            r0.append(r1)
            java.lang.String r1 = ", referenceId="
            r0.append(r1)
            long r1 = r3.referenceId
            r0.append(r1)
            java.lang.String r1 = ", timeScale="
            r0.append(r1)
            long r1 = r3.timeScale
            r0.append(r1)
            java.lang.String r1 = ", earliestPresentationTime="
            r0.append(r1)
            long r1 = r3.earliestPresentationTime
            r0.append(r1)
            java.lang.String r1 = ", firstOffset="
            r0.append(r1)
            long r1 = r3.firstOffset
            r0.append(r1)
            java.lang.String r1 = ", reserved="
            r0.append(r1)
            int r1 = r3.reserved
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
