package com.googlecode.mp4parser.boxes.piff;

/* loaded from: classes2.dex */
public class TfrfBox extends com.googlecode.mp4parser.AbstractFullBox {
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    public java.util.List<com.googlecode.mp4parser.boxes.piff.TfrfBox.Entry> entries;

    public class Entry {
        long fragmentAbsoluteDuration;
        long fragmentAbsoluteTime;
        final /* synthetic */ com.googlecode.mp4parser.boxes.piff.TfrfBox this$0;

        public Entry(com.googlecode.mp4parser.boxes.piff.TfrfBox r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public long getFragmentAbsoluteDuration() {
                r2 = this;
                long r0 = r2.fragmentAbsoluteDuration
                return r0
        }

        public long getFragmentAbsoluteTime() {
                r2 = this;
                long r0 = r2.fragmentAbsoluteTime
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Entry"
                r0.append(r1)
                java.lang.String r1 = "{fragmentAbsoluteTime="
                r0.append(r1)
                long r1 = r3.fragmentAbsoluteTime
                r0.append(r1)
                java.lang.String r1 = ", fragmentAbsoluteDuration="
                r0.append(r1)
                long r1 = r3.fragmentAbsoluteDuration
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

    public TfrfBox() {
            r1 = this;
            java.lang.String r0 = "uuid"
            r1.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.entries = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.googlecode.mp4parser.boxes.piff.TfrfBox> r0 = com.googlecode.mp4parser.boxes.piff.TfrfBox.class
            java.lang.String r1 = "TfrfBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getFragmentCount"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.piff.TfrfBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 91
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.piff.TfrfBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getEntries"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.piff.TfrfBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.List"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 95
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.piff.TfrfBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.piff.TfrfBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 100
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.piff.TfrfBox.ajc$tjp_2 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r6) {
            r5 = this;
            r5.parseVersionAndFlags(r6)
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r6)
            r1 = 0
        L8:
            if (r1 < r0) goto Lb
            return
        Lb:
            com.googlecode.mp4parser.boxes.piff.TfrfBox$Entry r2 = new com.googlecode.mp4parser.boxes.piff.TfrfBox$Entry
            r2.<init>(r5)
            int r3 = r5.getVersion()
            r4 = 1
            if (r3 != r4) goto L24
            long r3 = com.coremedia.iso.IsoTypeReader.readUInt64(r6)
            r2.fragmentAbsoluteTime = r3
            long r3 = com.coremedia.iso.IsoTypeReader.readUInt64(r6)
            r2.fragmentAbsoluteDuration = r3
            goto L30
        L24:
            long r3 = com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            r2.fragmentAbsoluteTime = r3
            long r3 = com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            r2.fragmentAbsoluteDuration = r3
        L30:
            java.util.List<com.googlecode.mp4parser.boxes.piff.TfrfBox$Entry> r3 = r5.entries
            r3.add(r2)
            int r1 = r1 + 1
            goto L8
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r5) {
            r4 = this;
            r4.writeVersionAndFlags(r5)
            java.util.List<com.googlecode.mp4parser.boxes.piff.TfrfBox$Entry> r0 = r4.entries
            int r0 = r0.size()
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r5, r0)
            java.util.List<com.googlecode.mp4parser.boxes.piff.TfrfBox$Entry> r0 = r4.entries
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L19
            return
        L19:
            java.lang.Object r1 = r0.next()
            com.googlecode.mp4parser.boxes.piff.TfrfBox$Entry r1 = (com.googlecode.mp4parser.boxes.piff.TfrfBox.Entry) r1
            int r2 = r4.getVersion()
            r3 = 1
            if (r2 != r3) goto L31
            long r2 = r1.fragmentAbsoluteTime
            com.coremedia.iso.IsoTypeWriter.writeUInt64(r5, r2)
            long r1 = r1.fragmentAbsoluteDuration
            com.coremedia.iso.IsoTypeWriter.writeUInt64(r5, r1)
            goto L12
        L31:
            long r2 = r1.fragmentAbsoluteTime
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r5, r2)
            long r1 = r1.fragmentAbsoluteDuration
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r5, r1)
            goto L12
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r3 = this;
            java.util.List<com.googlecode.mp4parser.boxes.piff.TfrfBox$Entry> r0 = r3.entries
            int r0 = r0.size()
            int r1 = r3.getVersion()
            r2 = 1
            if (r1 != r2) goto L10
            r1 = 16
            goto L12
        L10:
            r1 = 8
        L12:
            int r0 = r0 * r1
            int r0 = r0 + 5
            long r0 = (long) r0
            return r0
    }

    public java.util.List<com.googlecode.mp4parser.boxes.piff.TfrfBox.Entry> getEntries() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.piff.TfrfBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.List<com.googlecode.mp4parser.boxes.piff.TfrfBox$Entry> r0 = r2.entries
            return r0
    }

    public long getFragmentCount() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.piff.TfrfBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.List<com.googlecode.mp4parser.boxes.piff.TfrfBox$Entry> r0 = r2.entries
            int r0 = r0.size()
            long r0 = (long) r0
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public byte[] getUserType() {
            r1 = this;
            r0 = 16
            byte[] r0 = new byte[r0]
            r0 = {x0008: FILL_ARRAY_DATA , data: [-44, -128, 126, -14, -54, 57, 70, -107, -114, 84, 38, -53, -98, 70, -89, -97} // fill-array
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.piff.TfrfBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TfrfBox"
            r0.append(r1)
            java.lang.String r1 = "{entries="
            r0.append(r1)
            java.util.List<com.googlecode.mp4parser.boxes.piff.TfrfBox$Entry> r1 = r2.entries
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
