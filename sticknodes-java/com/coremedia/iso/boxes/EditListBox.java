package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class EditListBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "elst";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private java.util.List<com.coremedia.iso.boxes.EditListBox.Entry> entries;

    public static class Entry {
        com.coremedia.iso.boxes.EditListBox editListBox;
        private double mediaRate;
        private long mediaTime;
        private long segmentDuration;

        public Entry(com.coremedia.iso.boxes.EditListBox r1, long r2, long r4, double r6) {
                r0 = this;
                r0.<init>()
                r0.segmentDuration = r2
                r0.mediaTime = r4
                r0.mediaRate = r6
                r0.editListBox = r1
                return
        }

        public Entry(com.coremedia.iso.boxes.EditListBox r3, java.nio.ByteBuffer r4) {
                r2 = this;
                r2.<init>()
                int r0 = r3.getVersion()
                r1 = 1
                if (r0 != r1) goto L1d
                long r0 = com.coremedia.iso.IsoTypeReader.readUInt64(r4)
                r2.segmentDuration = r0
                long r0 = r4.getLong()
                r2.mediaTime = r0
                double r0 = com.coremedia.iso.IsoTypeReader.readFixedPoint1616(r4)
                r2.mediaRate = r0
                goto L30
            L1d:
                long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r4)
                r2.segmentDuration = r0
                int r0 = r4.getInt()
                long r0 = (long) r0
                r2.mediaTime = r0
                double r0 = com.coremedia.iso.IsoTypeReader.readFixedPoint1616(r4)
                r2.mediaRate = r0
            L30:
                r2.editListBox = r3
                return
        }

        public boolean equals(java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                r1 = 0
                if (r8 == 0) goto L27
                java.lang.Class r2 = r7.getClass()
                java.lang.Class r3 = r8.getClass()
                if (r2 == r3) goto L12
                goto L27
            L12:
                com.coremedia.iso.boxes.EditListBox$Entry r8 = (com.coremedia.iso.boxes.EditListBox.Entry) r8
                long r2 = r7.mediaTime
                long r4 = r8.mediaTime
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L1d
                return r1
            L1d:
                long r2 = r7.segmentDuration
                long r4 = r8.segmentDuration
                int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r8 == 0) goto L26
                return r1
            L26:
                return r0
            L27:
                return r1
        }

        public void getContent(java.nio.ByteBuffer r3) {
                r2 = this;
                com.coremedia.iso.boxes.EditListBox r0 = r2.editListBox
                int r0 = r0.getVersion()
                r1 = 1
                if (r0 != r1) goto L14
                long r0 = r2.segmentDuration
                com.coremedia.iso.IsoTypeWriter.writeUInt64(r3, r0)
                long r0 = r2.mediaTime
                r3.putLong(r0)
                goto L27
            L14:
                long r0 = r2.segmentDuration
                int r0 = com.googlecode.mp4parser.util.CastUtils.l2i(r0)
                long r0 = (long) r0
                com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
                long r0 = r2.mediaTime
                int r0 = com.googlecode.mp4parser.util.CastUtils.l2i(r0)
                r3.putInt(r0)
            L27:
                double r0 = r2.mediaRate
                com.coremedia.iso.IsoTypeWriter.writeFixedPoint1616(r3, r0)
                return
        }

        public double getMediaRate() {
                r2 = this;
                double r0 = r2.mediaRate
                return r0
        }

        public long getMediaTime() {
                r2 = this;
                long r0 = r2.mediaTime
                return r0
        }

        public long getSegmentDuration() {
                r2 = this;
                long r0 = r2.segmentDuration
                return r0
        }

        public int hashCode() {
                r7 = this;
                long r0 = r7.segmentDuration
                r2 = 32
                long r3 = r0 >>> r2
                long r0 = r0 ^ r3
                int r1 = (int) r0
                int r1 = r1 * 31
                long r3 = r7.mediaTime
                long r5 = r3 >>> r2
                long r2 = r3 ^ r5
                int r0 = (int) r2
                int r1 = r1 + r0
                return r1
        }

        public void setMediaRate(double r1) {
                r0 = this;
                r0.mediaRate = r1
                return
        }

        public void setMediaTime(long r1) {
                r0 = this;
                r0.mediaTime = r1
                return
        }

        public void setSegmentDuration(long r1) {
                r0 = this;
                r0.segmentDuration = r1
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Entry{segmentDuration="
                r0.<init>(r1)
                long r1 = r3.segmentDuration
                r0.append(r1)
                java.lang.String r1 = ", mediaTime="
                r0.append(r1)
                long r1 = r3.mediaTime
                r0.append(r1)
                java.lang.String r1 = ", mediaRate="
                r0.append(r1)
                double r1 = r3.mediaRate
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

    public EditListBox() {
            r1 = this;
            java.lang.String r0 = "elst"
            r1.<init>(r0)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.entries = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.EditListBox> r0 = com.coremedia.iso.boxes.EditListBox.class
            java.lang.String r1 = "EditListBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getEntries"
            java.lang.String r3 = "com.coremedia.iso.boxes.EditListBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.List"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 68
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.EditListBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setEntries"
            java.lang.String r3 = "com.coremedia.iso.boxes.EditListBox"
            java.lang.String r4 = "java.util.List"
            java.lang.String r5 = "entries"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 72
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.EditListBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.coremedia.iso.boxes.EditListBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 108(0x6c, float:1.51E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.EditListBox.ajc$tjp_2 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r5) {
            r4 = this;
            r4.parseVersionAndFlags(r5)
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r5)
            int r0 = com.googlecode.mp4parser.util.CastUtils.l2i(r0)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r4.entries = r1
            r1 = 0
        L13:
            if (r1 < r0) goto L16
            return
        L16:
            java.util.List<com.coremedia.iso.boxes.EditListBox$Entry> r2 = r4.entries
            com.coremedia.iso.boxes.EditListBox$Entry r3 = new com.coremedia.iso.boxes.EditListBox$Entry
            r3.<init>(r4, r5)
            r2.add(r3)
            int r1 = r1 + 1
            goto L13
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.writeVersionAndFlags(r3)
            java.util.List<com.coremedia.iso.boxes.EditListBox$Entry> r0 = r2.entries
            int r0 = r0.size()
            long r0 = (long) r0
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            java.util.List<com.coremedia.iso.boxes.EditListBox$Entry> r0 = r2.entries
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L1a
            return
        L1a:
            java.lang.Object r1 = r0.next()
            com.coremedia.iso.boxes.EditListBox$Entry r1 = (com.coremedia.iso.boxes.EditListBox.Entry) r1
            r1.getContent(r3)
            goto L13
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r5 = this;
            int r0 = r5.getVersion()
            r1 = 8
            r3 = 1
            if (r0 != r3) goto L12
            java.util.List<com.coremedia.iso.boxes.EditListBox$Entry> r0 = r5.entries
            int r0 = r0.size()
            int r0 = r0 * 20
            goto L1a
        L12:
            java.util.List<com.coremedia.iso.boxes.EditListBox$Entry> r0 = r5.entries
            int r0 = r0.size()
            int r0 = r0 * 12
        L1a:
            long r3 = (long) r0
            long r3 = r3 + r1
            return r3
    }

    public java.util.List<com.coremedia.iso.boxes.EditListBox.Entry> getEntries() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.EditListBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.List<com.coremedia.iso.boxes.EditListBox$Entry> r0 = r2.entries
            return r0
    }

    public void setEntries(java.util.List<com.coremedia.iso.boxes.EditListBox.Entry> r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.EditListBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.entries = r3
            return
    }

    public java.lang.String toString() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.EditListBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "EditListBox{entries="
            r0.<init>(r1)
            java.util.List<com.coremedia.iso.boxes.EditListBox$Entry> r1 = r2.entries
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
