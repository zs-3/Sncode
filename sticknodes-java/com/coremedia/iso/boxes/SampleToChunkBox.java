package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class SampleToChunkBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "stsc";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    java.util.List<com.coremedia.iso.boxes.SampleToChunkBox.Entry> entries;

    public static class Entry {
        long firstChunk;
        long sampleDescriptionIndex;
        long samplesPerChunk;

        public Entry(long r1, long r3, long r5) {
                r0 = this;
                r0.<init>()
                r0.firstChunk = r1
                r0.samplesPerChunk = r3
                r0.sampleDescriptionIndex = r5
                return
        }

        public boolean equals(java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                r1 = 0
                if (r8 == 0) goto L30
                java.lang.Class r2 = r7.getClass()
                java.lang.Class r3 = r8.getClass()
                if (r2 == r3) goto L12
                goto L30
            L12:
                com.coremedia.iso.boxes.SampleToChunkBox$Entry r8 = (com.coremedia.iso.boxes.SampleToChunkBox.Entry) r8
                long r2 = r7.firstChunk
                long r4 = r8.firstChunk
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L1d
                return r1
            L1d:
                long r2 = r7.sampleDescriptionIndex
                long r4 = r8.sampleDescriptionIndex
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L26
                return r1
            L26:
                long r2 = r7.samplesPerChunk
                long r4 = r8.samplesPerChunk
                int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r8 == 0) goto L2f
                return r1
            L2f:
                return r0
            L30:
                return r1
        }

        public long getFirstChunk() {
                r2 = this;
                long r0 = r2.firstChunk
                return r0
        }

        public long getSampleDescriptionIndex() {
                r2 = this;
                long r0 = r2.sampleDescriptionIndex
                return r0
        }

        public long getSamplesPerChunk() {
                r2 = this;
                long r0 = r2.samplesPerChunk
                return r0
        }

        public int hashCode() {
                r7 = this;
                long r0 = r7.firstChunk
                r2 = 32
                long r3 = r0 >>> r2
                long r0 = r0 ^ r3
                int r1 = (int) r0
                int r1 = r1 * 31
                long r3 = r7.samplesPerChunk
                long r5 = r3 >>> r2
                long r3 = r3 ^ r5
                int r0 = (int) r3
                int r1 = r1 + r0
                int r1 = r1 * 31
                long r3 = r7.sampleDescriptionIndex
                long r5 = r3 >>> r2
                long r2 = r3 ^ r5
                int r0 = (int) r2
                int r1 = r1 + r0
                return r1
        }

        public void setFirstChunk(long r1) {
                r0 = this;
                r0.firstChunk = r1
                return
        }

        public void setSampleDescriptionIndex(long r1) {
                r0 = this;
                r0.sampleDescriptionIndex = r1
                return
        }

        public void setSamplesPerChunk(long r1) {
                r0 = this;
                r0.samplesPerChunk = r1
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Entry{firstChunk="
                r0.<init>(r1)
                long r1 = r3.firstChunk
                r0.append(r1)
                java.lang.String r1 = ", samplesPerChunk="
                r0.append(r1)
                long r1 = r3.samplesPerChunk
                r0.append(r1)
                java.lang.String r1 = ", sampleDescriptionIndex="
                r0.append(r1)
                long r1 = r3.sampleDescriptionIndex
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

    public SampleToChunkBox() {
            r1 = this;
            java.lang.String r0 = "stsc"
            r1.<init>(r0)
            java.util.List r0 = java.util.Collections.emptyList()
            r1.entries = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.SampleToChunkBox> r0 = com.coremedia.iso.boxes.SampleToChunkBox.class
            java.lang.String r1 = "SampleToChunkBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getEntries"
            java.lang.String r3 = "com.coremedia.iso.boxes.SampleToChunkBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.List"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 47
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.SampleToChunkBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setEntries"
            java.lang.String r3 = "com.coremedia.iso.boxes.SampleToChunkBox"
            java.lang.String r4 = "java.util.List"
            java.lang.String r5 = "entries"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 51
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.SampleToChunkBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.coremedia.iso.boxes.SampleToChunkBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 84
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.SampleToChunkBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "blowup"
            java.lang.String r3 = "com.coremedia.iso.boxes.SampleToChunkBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "chunkCount"
            java.lang.String r6 = ""
            java.lang.String r7 = "[J"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 95
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.SampleToChunkBox.ajc$tjp_3 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r12) {
            r11 = this;
            r11.parseVersionAndFlags(r12)
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r12)
            int r0 = com.googlecode.mp4parser.util.CastUtils.l2i(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r11.entries = r1
            r1 = 0
        L13:
            if (r1 < r0) goto L16
            return
        L16:
            java.util.List<com.coremedia.iso.boxes.SampleToChunkBox$Entry> r2 = r11.entries
            com.coremedia.iso.boxes.SampleToChunkBox$Entry r10 = new com.coremedia.iso.boxes.SampleToChunkBox$Entry
            long r4 = com.coremedia.iso.IsoTypeReader.readUInt32(r12)
            long r6 = com.coremedia.iso.IsoTypeReader.readUInt32(r12)
            long r8 = com.coremedia.iso.IsoTypeReader.readUInt32(r12)
            r3 = r10
            r3.<init>(r4, r6, r8)
            r2.add(r10)
            int r1 = r1 + 1
            goto L13
    }

    public long[] blowup(int r9) {
            r8 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.SampleToChunkBox.ajc$tjp_3
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r9)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r8, r8, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long[] r0 = new long[r9]
            java.util.LinkedList r1 = new java.util.LinkedList
            java.util.List<com.coremedia.iso.boxes.SampleToChunkBox$Entry> r2 = r8.entries
            r1.<init>(r2)
            java.util.Collections.reverse(r1)
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r2 = r1.next()
            com.coremedia.iso.boxes.SampleToChunkBox$Entry r2 = (com.coremedia.iso.boxes.SampleToChunkBox.Entry) r2
        L27:
            r3 = 1
            if (r9 > r3) goto L32
            r9 = 0
            long r1 = r2.getSamplesPerChunk()
            r0[r9] = r1
            return r0
        L32:
            int r3 = r9 + (-1)
            long r4 = r2.getSamplesPerChunk()
            r0[r3] = r4
            long r3 = (long) r9
            long r5 = r2.getFirstChunk()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L49
            java.lang.Object r2 = r1.next()
            com.coremedia.iso.boxes.SampleToChunkBox$Entry r2 = (com.coremedia.iso.boxes.SampleToChunkBox.Entry) r2
        L49:
            int r9 = r9 + (-1)
            goto L27
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r5) {
            r4 = this;
            r4.writeVersionAndFlags(r5)
            java.util.List<com.coremedia.iso.boxes.SampleToChunkBox$Entry> r0 = r4.entries
            int r0 = r0.size()
            long r0 = (long) r0
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r5, r0)
            java.util.List<com.coremedia.iso.boxes.SampleToChunkBox$Entry> r0 = r4.entries
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L1a
            return
        L1a:
            java.lang.Object r1 = r0.next()
            com.coremedia.iso.boxes.SampleToChunkBox$Entry r1 = (com.coremedia.iso.boxes.SampleToChunkBox.Entry) r1
            long r2 = r1.getFirstChunk()
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r5, r2)
            long r2 = r1.getSamplesPerChunk()
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r5, r2)
            long r1 = r1.getSampleDescriptionIndex()
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r5, r1)
            goto L13
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            java.util.List<com.coremedia.iso.boxes.SampleToChunkBox$Entry> r0 = r2.entries
            int r0 = r0.size()
            int r0 = r0 * 12
            int r0 = r0 + 8
            long r0 = (long) r0
            return r0
    }

    public java.util.List<com.coremedia.iso.boxes.SampleToChunkBox.Entry> getEntries() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.SampleToChunkBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.List<com.coremedia.iso.boxes.SampleToChunkBox$Entry> r0 = r2.entries
            return r0
    }

    public void setEntries(java.util.List<com.coremedia.iso.boxes.SampleToChunkBox.Entry> r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.SampleToChunkBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.entries = r3
            return
    }

    public java.lang.String toString() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.SampleToChunkBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SampleToChunkBox[entryCount="
            r0.<init>(r1)
            java.util.List<com.coremedia.iso.boxes.SampleToChunkBox$Entry> r1 = r2.entries
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
