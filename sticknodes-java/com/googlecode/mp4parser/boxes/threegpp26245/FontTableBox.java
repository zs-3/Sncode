package com.googlecode.mp4parser.boxes.threegpp26245;

/* loaded from: classes2.dex */
public class FontTableBox extends com.googlecode.mp4parser.AbstractBox {
    public static final java.lang.String TYPE = "ftab";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    java.util.List<com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox.FontRecord> entries;

    public static class FontRecord {
        int fontId;
        java.lang.String fontname;

        public FontRecord() {
                r0 = this;
                r0.<init>()
                return
        }

        public FontRecord(int r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.fontId = r1
                r0.fontname = r2
                return
        }

        public void getContent(java.nio.ByteBuffer r2) {
                r1 = this;
                int r0 = r1.fontId
                com.coremedia.iso.IsoTypeWriter.writeUInt16(r2, r0)
                java.lang.String r0 = r1.fontname
                int r0 = r0.length()
                com.coremedia.iso.IsoTypeWriter.writeUInt8(r2, r0)
                java.lang.String r0 = r1.fontname
                byte[] r0 = com.coremedia.iso.Utf8.convert(r0)
                r2.put(r0)
                return
        }

        public int getSize() {
                r1 = this;
                java.lang.String r0 = r1.fontname
                int r0 = com.coremedia.iso.Utf8.utf8StringLengthInBytes(r0)
                int r0 = r0 + 3
                return r0
        }

        public void parse(java.nio.ByteBuffer r2) {
                r1 = this;
                int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r2)
                r1.fontId = r0
                int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r2)
                java.lang.String r2 = com.coremedia.iso.IsoTypeReader.readString(r2, r0)
                r1.fontname = r2
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "FontRecord{fontId="
                r0.<init>(r1)
                int r1 = r2.fontId
                r0.append(r1)
                java.lang.String r1 = ", fontname='"
                r0.append(r1)
                java.lang.String r1 = r2.fontname
                r0.append(r1)
                r1 = 39
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

    public FontTableBox() {
            r1 = this;
            java.lang.String r0 = "ftab"
            r1.<init>(r0)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.entries = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox> r0 = com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox.class
            java.lang.String r1 = "FontTableBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getEntries"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.List"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 52
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setEntries"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox"
            java.lang.String r4 = "java.util.List"
            java.lang.String r5 = "entries"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 56
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox.ajc$tjp_1 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r5) {
            r4 = this;
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r5)
            r1 = 0
        L5:
            if (r1 < r0) goto L8
            return
        L8:
            com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox$FontRecord r2 = new com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox$FontRecord
            r2.<init>()
            r2.parse(r5)
            java.util.List<com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox$FontRecord> r3 = r4.entries
            r3.add(r2)
            int r1 = r1 + 1
            goto L5
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r3) {
            r2 = this;
            java.util.List<com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox$FontRecord> r0 = r2.entries
            int r0 = r0.size()
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r3, r0)
            java.util.List<com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox$FontRecord> r0 = r2.entries
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L16
            return
        L16:
            java.lang.Object r1 = r0.next()
            com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox$FontRecord r1 = (com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox.FontRecord) r1
            r1.getContent(r3)
            goto Lf
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r3 = this;
            java.util.List<com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox$FontRecord> r0 = r3.entries
            java.util.Iterator r0 = r0.iterator()
            r1 = 2
        L7:
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto Lf
            long r0 = (long) r1
            return r0
        Lf:
            java.lang.Object r2 = r0.next()
            com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox$FontRecord r2 = (com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox.FontRecord) r2
            int r2 = r2.getSize()
            int r1 = r1 + r2
            goto L7
    }

    public java.util.List<com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox.FontRecord> getEntries() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.List<com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox$FontRecord> r0 = r2.entries
            return r0
    }

    public void setEntries(java.util.List<com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox.FontRecord> r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.entries = r3
            return
    }
}
