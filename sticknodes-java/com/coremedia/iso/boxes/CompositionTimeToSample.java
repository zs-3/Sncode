package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class CompositionTimeToSample extends com.googlecode.mp4parser.AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final java.lang.String TYPE = "ctts";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> entries;

    public static class Entry {
        int count;
        int offset;

        public Entry(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.count = r1
                r0.offset = r2
                return
        }

        public int getCount() {
                r1 = this;
                int r0 = r1.count
                return r0
        }

        public int getOffset() {
                r1 = this;
                int r0 = r1.offset
                return r0
        }

        public void setCount(int r1) {
                r0 = this;
                r0.count = r1
                return
        }

        public void setOffset(int r1) {
                r0 = this;
                r0.offset = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Entry{count="
                r0.<init>(r1)
                int r1 = r2.count
                r0.append(r1)
                java.lang.String r1 = ", offset="
                r0.append(r1)
                int r1 = r2.offset
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

    public CompositionTimeToSample() {
            r1 = this;
            java.lang.String r0 = "ctts"
            r1.<init>(r0)
            java.util.List r0 = java.util.Collections.emptyList()
            r1.entries = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.CompositionTimeToSample> r0 = com.coremedia.iso.boxes.CompositionTimeToSample.class
            java.lang.String r1 = "CompositionTimeToSample.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getEntries"
            java.lang.String r3 = "com.coremedia.iso.boxes.CompositionTimeToSample"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.List"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 57
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.CompositionTimeToSample.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setEntries"
            java.lang.String r3 = "com.coremedia.iso.boxes.CompositionTimeToSample"
            java.lang.String r4 = "java.util.List"
            java.lang.String r5 = "entries"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 61
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.CompositionTimeToSample.ajc$tjp_1 = r0
            return
    }

    public static int[] blowupCompositionTimes(java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> r7) {
            java.util.Iterator r0 = r7.iterator()
            r1 = 0
        L6:
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L37
            int r0 = (int) r1
            int[] r3 = new int[r0]
            java.util.Iterator r4 = r7.iterator()
            r5 = 0
            r7 = 0
        L15:
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L1c
            return r3
        L1c:
            java.lang.Object r0 = r4.next()
            r6 = r0
            com.coremedia.iso.boxes.CompositionTimeToSample$Entry r6 = (com.coremedia.iso.boxes.CompositionTimeToSample.Entry) r6
            r0 = 0
        L24:
            int r1 = r6.getCount()
            if (r0 < r1) goto L2b
            goto L15
        L2b:
            int r1 = r7 + 1
            int r2 = r6.getOffset()
            r3[r7] = r2
            int r0 = r0 + 1
            r7 = r1
            goto L24
        L37:
            java.lang.Object r3 = r0.next()
            com.coremedia.iso.boxes.CompositionTimeToSample$Entry r3 = (com.coremedia.iso.boxes.CompositionTimeToSample.Entry) r3
            int r3 = r3.getCount()
            long r3 = (long) r3
            long r1 = r1 + r3
            goto L6
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r6) {
            r5 = this;
            r5.parseVersionAndFlags(r6)
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            int r0 = com.googlecode.mp4parser.util.CastUtils.l2i(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r5.entries = r1
            r1 = 0
        L13:
            if (r1 < r0) goto L16
            return
        L16:
            com.coremedia.iso.boxes.CompositionTimeToSample$Entry r2 = new com.coremedia.iso.boxes.CompositionTimeToSample$Entry
            long r3 = com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            int r3 = com.googlecode.mp4parser.util.CastUtils.l2i(r3)
            int r4 = r6.getInt()
            r2.<init>(r3, r4)
            java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample$Entry> r3 = r5.entries
            r3.add(r2)
            int r1 = r1 + 1
            goto L13
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r5) {
            r4 = this;
            r4.writeVersionAndFlags(r5)
            java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample$Entry> r0 = r4.entries
            int r0 = r0.size()
            long r0 = (long) r0
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r5, r0)
            java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample$Entry> r0 = r4.entries
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L1a
            return
        L1a:
            java.lang.Object r1 = r0.next()
            com.coremedia.iso.boxes.CompositionTimeToSample$Entry r1 = (com.coremedia.iso.boxes.CompositionTimeToSample.Entry) r1
            int r2 = r1.getCount()
            long r2 = (long) r2
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r5, r2)
            int r1 = r1.getOffset()
            r5.putInt(r1)
            goto L13
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample$Entry> r0 = r2.entries
            int r0 = r0.size()
            int r0 = r0 * 8
            int r0 = r0 + 8
            long r0 = (long) r0
            return r0
    }

    public java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> getEntries() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.CompositionTimeToSample.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample$Entry> r0 = r2.entries
            return r0
    }

    public void setEntries(java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.CompositionTimeToSample.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.entries = r3
            return
    }
}
