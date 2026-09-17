package com.coremedia.iso.boxes.dece;

/* loaded from: classes.dex */
public class TrickPlayBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "trik";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private java.util.List<com.coremedia.iso.boxes.dece.TrickPlayBox.Entry> entries;

    public static class Entry {
        private int value;

        public Entry() {
                r0 = this;
                r0.<init>()
                return
        }

        public Entry(int r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        static /* synthetic */ int access$0(com.coremedia.iso.boxes.dece.TrickPlayBox.Entry r0) {
                int r0 = r0.value
                return r0
        }

        public int getDependencyLevel() {
                r1 = this;
                int r0 = r1.value
                r0 = r0 & 63
                return r0
        }

        public int getPicType() {
                r1 = this;
                int r0 = r1.value
                int r0 = r0 >> 6
                r0 = r0 & 3
                return r0
        }

        public void setDependencyLevel(int r2) {
                r1 = this;
                r2 = r2 & 63
                int r0 = r1.value
                r2 = r2 | r0
                r1.value = r2
                return
        }

        public void setPicType(int r2) {
                r1 = this;
                int r0 = r1.value
                r0 = r0 & 31
                r2 = r2 & 3
                int r2 = r2 << 6
                r2 = r2 | r0
                r1.value = r2
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Entry"
                r0.append(r1)
                java.lang.String r1 = "{picType="
                r0.append(r1)
                int r1 = r2.getPicType()
                r0.append(r1)
                java.lang.String r1 = ",dependencyLevel="
                r0.append(r1)
                int r1 = r2.getDependencyLevel()
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

    public TrickPlayBox() {
            r1 = this;
            java.lang.String r0 = "trik"
            r1.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.entries = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.dece.TrickPlayBox> r0 = com.coremedia.iso.boxes.dece.TrickPlayBox.class
            java.lang.String r1 = "TrickPlayBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "setEntries"
            java.lang.String r3 = "com.coremedia.iso.boxes.dece.TrickPlayBox"
            java.lang.String r4 = "java.util.List"
            java.lang.String r5 = "entries"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 32
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.dece.TrickPlayBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getEntries"
            java.lang.String r3 = "com.coremedia.iso.boxes.dece.TrickPlayBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.List"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 36
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.dece.TrickPlayBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.coremedia.iso.boxes.dece.TrickPlayBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 103(0x67, float:1.44E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.dece.TrickPlayBox.ajc$tjp_2 = r0
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
            java.util.List<com.coremedia.iso.boxes.dece.TrickPlayBox$Entry> r0 = r3.entries
            com.coremedia.iso.boxes.dece.TrickPlayBox$Entry r1 = new com.coremedia.iso.boxes.dece.TrickPlayBox$Entry
            int r2 = com.coremedia.iso.IsoTypeReader.readUInt8(r4)
            r1.<init>(r2)
            r0.add(r1)
            goto L3
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.writeVersionAndFlags(r3)
            java.util.List<com.coremedia.iso.boxes.dece.TrickPlayBox$Entry> r0 = r2.entries
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L10
            return
        L10:
            java.lang.Object r1 = r0.next()
            com.coremedia.iso.boxes.dece.TrickPlayBox$Entry r1 = (com.coremedia.iso.boxes.dece.TrickPlayBox.Entry) r1
            int r1 = com.coremedia.iso.boxes.dece.TrickPlayBox.Entry.access$0(r1)
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r3, r1)
            goto L9
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            java.util.List<com.coremedia.iso.boxes.dece.TrickPlayBox$Entry> r0 = r2.entries
            int r0 = r0.size()
            int r0 = r0 + 4
            long r0 = (long) r0
            return r0
    }

    public java.util.List<com.coremedia.iso.boxes.dece.TrickPlayBox.Entry> getEntries() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.dece.TrickPlayBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.List<com.coremedia.iso.boxes.dece.TrickPlayBox$Entry> r0 = r2.entries
            return r0
    }

    public void setEntries(java.util.List<com.coremedia.iso.boxes.dece.TrickPlayBox.Entry> r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.dece.TrickPlayBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.entries = r3
            return
    }

    public java.lang.String toString() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.dece.TrickPlayBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TrickPlayBox"
            r0.append(r1)
            java.lang.String r1 = "{entries="
            r0.append(r1)
            java.util.List<com.coremedia.iso.boxes.dece.TrickPlayBox$Entry> r1 = r2.entries
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
