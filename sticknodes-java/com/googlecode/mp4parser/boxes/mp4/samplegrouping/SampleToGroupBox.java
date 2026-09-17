package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

/* loaded from: classes2.dex */
public class SampleToGroupBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "sbgp";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5 = null;
    java.util.List<com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox.Entry> entries;
    private java.lang.String groupingType;
    private java.lang.String groupingTypeParameter;

    public static class Entry {
        private int groupDescriptionIndex;
        private long sampleCount;

        public Entry(long r1, int r3) {
                r0 = this;
                r0.<init>()
                r0.sampleCount = r1
                r0.groupDescriptionIndex = r3
                return
        }

        public boolean equals(java.lang.Object r7) {
                r6 = this;
                r0 = 1
                if (r6 != r7) goto L4
                return r0
            L4:
                r1 = 0
                if (r7 == 0) goto L25
                java.lang.Class r2 = r6.getClass()
                java.lang.Class r3 = r7.getClass()
                if (r2 == r3) goto L12
                goto L25
            L12:
                com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox$Entry r7 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox.Entry) r7
                int r2 = r6.groupDescriptionIndex
                int r3 = r7.groupDescriptionIndex
                if (r2 == r3) goto L1b
                return r1
            L1b:
                long r2 = r6.sampleCount
                long r4 = r7.sampleCount
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 == 0) goto L24
                return r1
            L24:
                return r0
            L25:
                return r1
        }

        public int getGroupDescriptionIndex() {
                r1 = this;
                int r0 = r1.groupDescriptionIndex
                return r0
        }

        public long getSampleCount() {
                r2 = this;
                long r0 = r2.sampleCount
                return r0
        }

        public int hashCode() {
                r4 = this;
                long r0 = r4.sampleCount
                r2 = 32
                long r2 = r0 >>> r2
                long r0 = r0 ^ r2
                int r1 = (int) r0
                int r1 = r1 * 31
                int r0 = r4.groupDescriptionIndex
                int r1 = r1 + r0
                return r1
        }

        public void setGroupDescriptionIndex(int r1) {
                r0 = this;
                r0.groupDescriptionIndex = r1
                return
        }

        public void setSampleCount(long r1) {
                r0 = this;
                r0.sampleCount = r1
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Entry{sampleCount="
                r0.<init>(r1)
                long r1 = r3.sampleCount
                r0.append(r1)
                java.lang.String r1 = ", groupDescriptionIndex="
                r0.append(r1)
                int r1 = r3.groupDescriptionIndex
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

    public SampleToGroupBox() {
            r1 = this;
            java.lang.String r0 = "sbgp"
            r1.<init>(r0)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.entries = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox> r0 = com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox.class
            java.lang.String r1 = "SampleToGroupBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getGroupingType"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 150(0x96, float:2.1E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setGroupingType"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "groupingType"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 154(0x9a, float:2.16E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getGroupingTypeParameter"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 158(0x9e, float:2.21E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setGroupingTypeParameter"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "groupingTypeParameter"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 162(0xa2, float:2.27E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getEntries"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.List"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 166(0xa6, float:2.33E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox.ajc$tjp_4 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setEntries"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox"
            java.lang.String r4 = "java.util.List"
            java.lang.String r5 = "entries"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 170(0xaa, float:2.38E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox.ajc$tjp_5 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(java.nio.ByteBuffer r9) {
            r8 = this;
            r8.parseVersionAndFlags(r9)
            java.lang.String r0 = com.coremedia.iso.IsoTypeReader.read4cc(r9)
            r8.groupingType = r0
            int r0 = r8.getVersion()
            r1 = 1
            if (r0 != r1) goto L16
            java.lang.String r0 = com.coremedia.iso.IsoTypeReader.read4cc(r9)
            r8.groupingTypeParameter = r0
        L16:
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r9)
        L1a:
            r2 = 1
            long r2 = r0 - r2
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 > 0) goto L25
            return
        L25:
            java.util.List<com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox$Entry> r0 = r8.entries
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox$Entry r1 = new com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox$Entry
            long r4 = com.coremedia.iso.IsoTypeReader.readUInt32(r9)
            int r4 = com.googlecode.mp4parser.util.CastUtils.l2i(r4)
            long r4 = (long) r4
            long r6 = com.coremedia.iso.IsoTypeReader.readUInt32(r9)
            int r6 = com.googlecode.mp4parser.util.CastUtils.l2i(r6)
            r1.<init>(r4, r6)
            r0.add(r1)
            r0 = r2
            goto L1a
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r5) {
            r4 = this;
            r4.writeVersionAndFlags(r5)
            java.lang.String r0 = r4.groupingType
            byte[] r0 = r0.getBytes()
            r5.put(r0)
            int r0 = r4.getVersion()
            r1 = 1
            if (r0 != r1) goto L1c
            java.lang.String r0 = r4.groupingTypeParameter
            byte[] r0 = r0.getBytes()
            r5.put(r0)
        L1c:
            java.util.List<com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox$Entry> r0 = r4.entries
            int r0 = r0.size()
            long r0 = (long) r0
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r5, r0)
            java.util.List<com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox$Entry> r0 = r4.entries
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L33
            return
        L33:
            java.lang.Object r1 = r0.next()
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox$Entry r1 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox.Entry) r1
            long r2 = r1.getSampleCount()
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r5, r2)
            int r1 = r1.getGroupDescriptionIndex()
            long r1 = (long) r1
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r5, r1)
            goto L2c
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            int r0 = r2.getVersion()
            r1 = 1
            if (r0 != r1) goto L12
            java.util.List<com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox$Entry> r0 = r2.entries
            int r0 = r0.size()
            int r0 = r0 * 8
            int r0 = r0 + 16
            goto L1c
        L12:
            java.util.List<com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox$Entry> r0 = r2.entries
            int r0 = r0.size()
            int r0 = r0 * 8
            int r0 = r0 + 12
        L1c:
            long r0 = (long) r0
            return r0
    }

    public java.util.List<com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox.Entry> getEntries() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.List<com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox$Entry> r0 = r2.entries
            return r0
    }

    public java.lang.String getGroupingType() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.String r0 = r2.groupingType
            return r0
    }

    public java.lang.String getGroupingTypeParameter() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.String r0 = r2.groupingTypeParameter
            return r0
    }

    public void setEntries(java.util.List<com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox.Entry> r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox.ajc$tjp_5
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.entries = r3
            return
    }

    public void setGroupingType(java.lang.String r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.groupingType = r3
            return
    }

    public void setGroupingTypeParameter(java.lang.String r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox.ajc$tjp_3
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.groupingTypeParameter = r3
            return
    }
}
