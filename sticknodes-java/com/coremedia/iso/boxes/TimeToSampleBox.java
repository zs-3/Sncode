package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class TimeToSampleBox extends com.googlecode.mp4parser.AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final java.lang.String TYPE = "stts";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    static java.util.Map<java.util.List<com.coremedia.iso.boxes.TimeToSampleBox.Entry>, java.lang.ref.SoftReference<long[]>> cache;
    java.util.List<com.coremedia.iso.boxes.TimeToSampleBox.Entry> entries;

    public static class Entry {
        long count;
        long delta;

        public Entry(long r1, long r3) {
                r0 = this;
                r0.<init>()
                r0.count = r1
                r0.delta = r3
                return
        }

        public long getCount() {
                r2 = this;
                long r0 = r2.count
                return r0
        }

        public long getDelta() {
                r2 = this;
                long r0 = r2.delta
                return r0
        }

        public void setCount(long r1) {
                r0 = this;
                r0.count = r1
                return
        }

        public void setDelta(long r1) {
                r0 = this;
                r0.delta = r1
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Entry{count="
                r0.<init>(r1)
                long r1 = r3.count
                r0.append(r1)
                java.lang.String r1 = ", delta="
                r0.append(r1)
                long r1 = r3.delta
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            ajc$preClinit()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            com.coremedia.iso.boxes.TimeToSampleBox.cache = r0
            return
    }

    public TimeToSampleBox() {
            r1 = this;
            java.lang.String r0 = "stts"
            r1.<init>(r0)
            java.util.List r0 = java.util.Collections.emptyList()
            r1.entries = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.TimeToSampleBox> r0 = com.coremedia.iso.boxes.TimeToSampleBox.class
            java.lang.String r1 = "TimeToSampleBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getEntries"
            java.lang.String r3 = "com.coremedia.iso.boxes.TimeToSampleBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.List"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 79
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TimeToSampleBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setEntries"
            java.lang.String r3 = "com.coremedia.iso.boxes.TimeToSampleBox"
            java.lang.String r4 = "java.util.List"
            java.lang.String r5 = "entries"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 83
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TimeToSampleBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.coremedia.iso.boxes.TimeToSampleBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 87
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TimeToSampleBox.ajc$tjp_2 = r0
            return
    }

    public static synchronized long[] blowupTimeToSamples(java.util.List<com.coremedia.iso.boxes.TimeToSampleBox.Entry> r12) {
            java.lang.Class<com.coremedia.iso.boxes.TimeToSampleBox> r0 = com.coremedia.iso.boxes.TimeToSampleBox.class
            monitor-enter(r0)
            java.util.Map<java.util.List<com.coremedia.iso.boxes.TimeToSampleBox$Entry>, java.lang.ref.SoftReference<long[]>> r1 = com.coremedia.iso.boxes.TimeToSampleBox.cache     // Catch: java.lang.Throwable -> L67
            java.lang.Object r1 = r1.get(r12)     // Catch: java.lang.Throwable -> L67
            java.lang.ref.SoftReference r1 = (java.lang.ref.SoftReference) r1     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L17
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L67
            long[] r1 = (long[]) r1     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L17
            monitor-exit(r0)
            return r1
        L17:
            r1 = 0
            java.util.Iterator r3 = r12.iterator()     // Catch: java.lang.Throwable -> L67
        L1d:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L67
            if (r4 != 0) goto L5b
            int r2 = (int) r1     // Catch: java.lang.Throwable -> L67
            long[] r1 = new long[r2]     // Catch: java.lang.Throwable -> L67
            java.util.Iterator r2 = r12.iterator()     // Catch: java.lang.Throwable -> L67
            r3 = 0
            r4 = 0
        L2c:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L67
            if (r5 != 0) goto L3e
            java.util.Map<java.util.List<com.coremedia.iso.boxes.TimeToSampleBox$Entry>, java.lang.ref.SoftReference<long[]>> r2 = com.coremedia.iso.boxes.TimeToSampleBox.cache     // Catch: java.lang.Throwable -> L67
            java.lang.ref.SoftReference r3 = new java.lang.ref.SoftReference     // Catch: java.lang.Throwable -> L67
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L67
            r2.put(r12, r3)     // Catch: java.lang.Throwable -> L67
            monitor-exit(r0)
            return r1
        L3e:
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L67
            com.coremedia.iso.boxes.TimeToSampleBox$Entry r5 = (com.coremedia.iso.boxes.TimeToSampleBox.Entry) r5     // Catch: java.lang.Throwable -> L67
            r6 = 0
        L45:
            long r7 = (long) r6     // Catch: java.lang.Throwable -> L67
            long r9 = r5.getCount()     // Catch: java.lang.Throwable -> L67
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L4f
            goto L2c
        L4f:
            int r7 = r4 + 1
            long r8 = r5.getDelta()     // Catch: java.lang.Throwable -> L67
            r1[r4] = r8     // Catch: java.lang.Throwable -> L67
            int r6 = r6 + 1
            r4 = r7
            goto L45
        L5b:
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L67
            com.coremedia.iso.boxes.TimeToSampleBox$Entry r4 = (com.coremedia.iso.boxes.TimeToSampleBox.Entry) r4     // Catch: java.lang.Throwable -> L67
            long r4 = r4.getCount()     // Catch: java.lang.Throwable -> L67
            long r1 = r1 + r4
            goto L1d
        L67:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r9) {
            r8 = this;
            r8.parseVersionAndFlags(r9)
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r9)
            int r0 = com.googlecode.mp4parser.util.CastUtils.l2i(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r8.entries = r1
            r1 = 0
        L13:
            if (r1 < r0) goto L16
            return
        L16:
            java.util.List<com.coremedia.iso.boxes.TimeToSampleBox$Entry> r2 = r8.entries
            com.coremedia.iso.boxes.TimeToSampleBox$Entry r3 = new com.coremedia.iso.boxes.TimeToSampleBox$Entry
            long r4 = com.coremedia.iso.IsoTypeReader.readUInt32(r9)
            long r6 = com.coremedia.iso.IsoTypeReader.readUInt32(r9)
            r3.<init>(r4, r6)
            r2.add(r3)
            int r1 = r1 + 1
            goto L13
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r5) {
            r4 = this;
            r4.writeVersionAndFlags(r5)
            java.util.List<com.coremedia.iso.boxes.TimeToSampleBox$Entry> r0 = r4.entries
            int r0 = r0.size()
            long r0 = (long) r0
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r5, r0)
            java.util.List<com.coremedia.iso.boxes.TimeToSampleBox$Entry> r0 = r4.entries
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L1a
            return
        L1a:
            java.lang.Object r1 = r0.next()
            com.coremedia.iso.boxes.TimeToSampleBox$Entry r1 = (com.coremedia.iso.boxes.TimeToSampleBox.Entry) r1
            long r2 = r1.getCount()
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r5, r2)
            long r1 = r1.getDelta()
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r5, r1)
            goto L13
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            java.util.List<com.coremedia.iso.boxes.TimeToSampleBox$Entry> r0 = r2.entries
            int r0 = r0.size()
            int r0 = r0 * 8
            int r0 = r0 + 8
            long r0 = (long) r0
            return r0
    }

    public java.util.List<com.coremedia.iso.boxes.TimeToSampleBox.Entry> getEntries() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TimeToSampleBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.List<com.coremedia.iso.boxes.TimeToSampleBox$Entry> r0 = r2.entries
            return r0
    }

    public void setEntries(java.util.List<com.coremedia.iso.boxes.TimeToSampleBox.Entry> r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TimeToSampleBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.entries = r3
            return
    }

    public java.lang.String toString() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TimeToSampleBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TimeToSampleBox[entryCount="
            r0.<init>(r1)
            java.util.List<com.coremedia.iso.boxes.TimeToSampleBox$Entry> r1 = r2.entries
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
