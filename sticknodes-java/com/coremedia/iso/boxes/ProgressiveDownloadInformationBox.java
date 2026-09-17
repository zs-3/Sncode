package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class ProgressiveDownloadInformationBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "pdin";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    java.util.List<com.coremedia.iso.boxes.ProgressiveDownloadInformationBox.Entry> entries;

    public static class Entry {
        long initialDelay;
        long rate;

        public Entry(long r1, long r3) {
                r0 = this;
                r0.<init>()
                r0.rate = r1
                r0.initialDelay = r3
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
                com.coremedia.iso.boxes.ProgressiveDownloadInformationBox$Entry r8 = (com.coremedia.iso.boxes.ProgressiveDownloadInformationBox.Entry) r8
                long r2 = r7.initialDelay
                long r4 = r8.initialDelay
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L1d
                return r1
            L1d:
                long r2 = r7.rate
                long r4 = r8.rate
                int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r8 == 0) goto L26
                return r1
            L26:
                return r0
            L27:
                return r1
        }

        public long getInitialDelay() {
                r2 = this;
                long r0 = r2.initialDelay
                return r0
        }

        public long getRate() {
                r2 = this;
                long r0 = r2.rate
                return r0
        }

        public int hashCode() {
                r7 = this;
                long r0 = r7.rate
                r2 = 32
                long r3 = r0 >>> r2
                long r0 = r0 ^ r3
                int r1 = (int) r0
                int r1 = r1 * 31
                long r3 = r7.initialDelay
                long r5 = r3 >>> r2
                long r2 = r3 ^ r5
                int r0 = (int) r2
                int r1 = r1 + r0
                return r1
        }

        public void setInitialDelay(long r1) {
                r0 = this;
                r0.initialDelay = r1
                return
        }

        public void setRate(long r1) {
                r0 = this;
                r0.rate = r1
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Entry{rate="
                r0.<init>(r1)
                long r1 = r3.rate
                r0.append(r1)
                java.lang.String r1 = ", initialDelay="
                r0.append(r1)
                long r1 = r3.initialDelay
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

    public ProgressiveDownloadInformationBox() {
            r1 = this;
            java.lang.String r0 = "pdin"
            r1.<init>(r0)
            java.util.List r0 = java.util.Collections.emptyList()
            r1.entries = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.ProgressiveDownloadInformationBox> r0 = com.coremedia.iso.boxes.ProgressiveDownloadInformationBox.class
            java.lang.String r1 = "ProgressiveDownloadInformationBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getEntries"
            java.lang.String r3 = "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.List"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 38
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.ProgressiveDownloadInformationBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setEntries"
            java.lang.String r3 = "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox"
            java.lang.String r4 = "java.util.List"
            java.lang.String r5 = "entries"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 42
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.ProgressiveDownloadInformationBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 112(0x70, float:1.57E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.ProgressiveDownloadInformationBox.ajc$tjp_2 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r6) {
            r5 = this;
            r5.parseVersionAndFlags(r6)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r5.entries = r0
        La:
            int r0 = r6.remaining()
            r1 = 8
            if (r0 >= r1) goto L13
            return
        L13:
            com.coremedia.iso.boxes.ProgressiveDownloadInformationBox$Entry r0 = new com.coremedia.iso.boxes.ProgressiveDownloadInformationBox$Entry
            long r1 = com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            long r3 = com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            r0.<init>(r1, r3)
            java.util.List<com.coremedia.iso.boxes.ProgressiveDownloadInformationBox$Entry> r1 = r5.entries
            r1.add(r0)
            goto La
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r5) {
            r4 = this;
            r4.writeVersionAndFlags(r5)
            java.util.List<com.coremedia.iso.boxes.ProgressiveDownloadInformationBox$Entry> r0 = r4.entries
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L10
            return
        L10:
            java.lang.Object r1 = r0.next()
            com.coremedia.iso.boxes.ProgressiveDownloadInformationBox$Entry r1 = (com.coremedia.iso.boxes.ProgressiveDownloadInformationBox.Entry) r1
            long r2 = r1.getRate()
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r5, r2)
            long r1 = r1.getInitialDelay()
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r5, r1)
            goto L9
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            java.util.List<com.coremedia.iso.boxes.ProgressiveDownloadInformationBox$Entry> r0 = r2.entries
            int r0 = r0.size()
            int r0 = r0 * 8
            int r0 = r0 + 4
            long r0 = (long) r0
            return r0
    }

    public java.util.List<com.coremedia.iso.boxes.ProgressiveDownloadInformationBox.Entry> getEntries() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.ProgressiveDownloadInformationBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.List<com.coremedia.iso.boxes.ProgressiveDownloadInformationBox$Entry> r0 = r2.entries
            return r0
    }

    public void setEntries(java.util.List<com.coremedia.iso.boxes.ProgressiveDownloadInformationBox.Entry> r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.ProgressiveDownloadInformationBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.entries = r3
            return
    }

    public java.lang.String toString() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.ProgressiveDownloadInformationBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ProgressiveDownloadInfoBox{entries="
            r0.<init>(r1)
            java.util.List<com.coremedia.iso.boxes.ProgressiveDownloadInformationBox$Entry> r1 = r2.entries
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
