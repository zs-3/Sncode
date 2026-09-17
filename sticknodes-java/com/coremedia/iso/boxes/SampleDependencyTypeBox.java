package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class SampleDependencyTypeBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "sdtp";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry> entries;

    public static class Entry {
        private int value;

        public Entry(int r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        static /* synthetic */ int access$0(com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry r0) {
                int r0 = r0.value
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L1c
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L12
                goto L1c
            L12:
                com.coremedia.iso.boxes.SampleDependencyTypeBox$Entry r5 = (com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry) r5
                int r2 = r4.value
                int r5 = r5.value
                if (r2 == r5) goto L1b
                return r1
            L1b:
                return r0
            L1c:
                return r1
        }

        public int getIsLeading() {
                r1 = this;
                int r0 = r1.value
                int r0 = r0 >> 6
                r0 = r0 & 3
                return r0
        }

        public int getSampleDependsOn() {
                r1 = this;
                int r0 = r1.value
                int r0 = r0 >> 4
                r0 = r0 & 3
                return r0
        }

        public int getSampleHasRedundancy() {
                r1 = this;
                int r0 = r1.value
                r0 = r0 & 3
                return r0
        }

        public int getSampleIsDependentOn() {
                r1 = this;
                int r0 = r1.value
                int r0 = r0 >> 2
                r0 = r0 & 3
                return r0
        }

        public int hashCode() {
                r1 = this;
                int r0 = r1.value
                return r0
        }

        public void setIsLeading(int r2) {
                r1 = this;
                r2 = r2 & 3
                int r2 = r2 << 6
                int r0 = r1.value
                r0 = r0 & 63
                r2 = r2 | r0
                r1.value = r2
                return
        }

        public void setSampleDependsOn(int r2) {
                r1 = this;
                r2 = r2 & 3
                int r2 = r2 << 4
                int r0 = r1.value
                r0 = r0 & 207(0xcf, float:2.9E-43)
                r2 = r2 | r0
                r1.value = r2
                return
        }

        public void setSampleHasRedundancy(int r2) {
                r1 = this;
                r2 = r2 & 3
                int r0 = r1.value
                r0 = r0 & 252(0xfc, float:3.53E-43)
                r2 = r2 | r0
                r1.value = r2
                return
        }

        public void setSampleIsDependentOn(int r2) {
                r1 = this;
                r2 = r2 & 3
                int r2 = r2 << 2
                int r0 = r1.value
                r0 = r0 & 243(0xf3, float:3.4E-43)
                r2 = r2 | r0
                r1.value = r2
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Entry{isLeading="
                r0.<init>(r1)
                int r1 = r2.getIsLeading()
                r0.append(r1)
                java.lang.String r1 = ", sampleDependsOn="
                r0.append(r1)
                int r1 = r2.getSampleDependsOn()
                r0.append(r1)
                java.lang.String r1 = ", sampleIsDependentOn="
                r0.append(r1)
                int r1 = r2.getSampleIsDependentOn()
                r0.append(r1)
                java.lang.String r1 = ", sampleHasRedundancy="
                r0.append(r1)
                int r1 = r2.getSampleHasRedundancy()
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

    public SampleDependencyTypeBox() {
            r1 = this;
            java.lang.String r0 = "sdtp"
            r1.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.entries = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.SampleDependencyTypeBox> r0 = com.coremedia.iso.boxes.SampleDependencyTypeBox.class
            java.lang.String r1 = "SampleDependencyTypeBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getEntries"
            java.lang.String r3 = "com.coremedia.iso.boxes.SampleDependencyTypeBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.List"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 139(0x8b, float:1.95E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.SampleDependencyTypeBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setEntries"
            java.lang.String r3 = "com.coremedia.iso.boxes.SampleDependencyTypeBox"
            java.lang.String r4 = "java.util.List"
            java.lang.String r5 = "entries"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 143(0x8f, float:2.0E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.SampleDependencyTypeBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.coremedia.iso.boxes.SampleDependencyTypeBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 148(0x94, float:2.07E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.SampleDependencyTypeBox.ajc$tjp_2 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r4) {
            r3 = this;
            r3.parseVersionAndFlags(r4)
        L3:
            int r0 = r4.remaining()
            if (r0 > 0) goto La
            return
        La:
            java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox$Entry> r0 = r3.entries
            com.coremedia.iso.boxes.SampleDependencyTypeBox$Entry r1 = new com.coremedia.iso.boxes.SampleDependencyTypeBox$Entry
            int r2 = com.coremedia.iso.IsoTypeReader.readUInt8(r4)
            r1.<init>(r2)
            r0.add(r1)
            goto L3
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.writeVersionAndFlags(r3)
            java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox$Entry> r0 = r2.entries
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L10
            return
        L10:
            java.lang.Object r1 = r0.next()
            com.coremedia.iso.boxes.SampleDependencyTypeBox$Entry r1 = (com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry) r1
            int r1 = com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry.access$0(r1)
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r3, r1)
            goto L9
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox$Entry> r0 = r2.entries
            int r0 = r0.size()
            int r0 = r0 + 4
            long r0 = (long) r0
            return r0
    }

    public java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry> getEntries() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.SampleDependencyTypeBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox$Entry> r0 = r2.entries
            return r0
    }

    public void setEntries(java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry> r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.SampleDependencyTypeBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.entries = r3
            return
    }

    public java.lang.String toString() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.SampleDependencyTypeBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SampleDependencyTypeBox"
            r0.append(r1)
            java.lang.String r1 = "{entries="
            r0.append(r1)
            java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox$Entry> r1 = r2.entries
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
