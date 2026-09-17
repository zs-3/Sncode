package com.googlecode.mp4parser.boxes;

/* loaded from: classes2.dex */
public class EC3SpecificBox extends com.googlecode.mp4parser.AbstractBox {
    public static final java.lang.String TYPE = "dec3";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_8 = null;
    int dataRate;
    java.util.List<com.googlecode.mp4parser.boxes.EC3SpecificBox.Entry> entries;
    int numIndSub;

    public static class Entry {
        public int acmod;
        public int bsid;
        public int bsmod;
        public int chan_loc;
        public int fscod;
        public int lfeon;
        public int num_dep_sub;
        public int reserved;
        public int reserved2;

        public Entry() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Entry{fscod="
                r0.<init>(r1)
                int r1 = r2.fscod
                r0.append(r1)
                java.lang.String r1 = ", bsid="
                r0.append(r1)
                int r1 = r2.bsid
                r0.append(r1)
                java.lang.String r1 = ", bsmod="
                r0.append(r1)
                int r1 = r2.bsmod
                r0.append(r1)
                java.lang.String r1 = ", acmod="
                r0.append(r1)
                int r1 = r2.acmod
                r0.append(r1)
                java.lang.String r1 = ", lfeon="
                r0.append(r1)
                int r1 = r2.lfeon
                r0.append(r1)
                java.lang.String r1 = ", reserved="
                r0.append(r1)
                int r1 = r2.reserved
                r0.append(r1)
                java.lang.String r1 = ", num_dep_sub="
                r0.append(r1)
                int r1 = r2.num_dep_sub
                r0.append(r1)
                java.lang.String r1 = ", chan_loc="
                r0.append(r1)
                int r1 = r2.chan_loc
                r0.append(r1)
                java.lang.String r1 = ", reserved2="
                r0.append(r1)
                int r1 = r2.reserved2
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

    public EC3SpecificBox() {
            r1 = this;
            java.lang.String r0 = "dec3"
            r1.<init>(r0)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.entries = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.googlecode.mp4parser.boxes.EC3SpecificBox> r0 = com.googlecode.mp4parser.boxes.EC3SpecificBox.class
            java.lang.String r1 = "EC3SpecificBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getContentSize"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.EC3SpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 25
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.EC3SpecificBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getContent"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.EC3SpecificBox"
            java.lang.String r4 = "java.nio.ByteBuffer"
            java.lang.String r5 = "byteBuffer"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 65
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.EC3SpecificBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getEntries"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.EC3SpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.List"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 86
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.EC3SpecificBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setEntries"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.EC3SpecificBox"
            java.lang.String r4 = "java.util.List"
            java.lang.String r5 = "entries"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 90
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.EC3SpecificBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "addEntry"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.EC3SpecificBox"
            java.lang.String r4 = "com.googlecode.mp4parser.boxes.EC3SpecificBox$Entry"
            java.lang.String r5 = "entry"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 94
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.EC3SpecificBox.ajc$tjp_4 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDataRate"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.EC3SpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 98
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.EC3SpecificBox.ajc$tjp_5 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setDataRate"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.EC3SpecificBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "dataRate"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 102(0x66, float:1.43E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.EC3SpecificBox.ajc$tjp_6 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getNumIndSub"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.EC3SpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 106(0x6a, float:1.49E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.EC3SpecificBox.ajc$tjp_7 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setNumIndSub"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.EC3SpecificBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "numIndSub"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 110(0x6e, float:1.54E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.EC3SpecificBox.ajc$tjp_8 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r7) {
            r6 = this;
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r0 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer
            r0.<init>(r7)
            r7 = 13
            int r7 = r0.readBits(r7)
            r6.dataRate = r7
            r7 = 3
            int r1 = r0.readBits(r7)
            r2 = 1
            int r1 = r1 + r2
            r6.numIndSub = r1
            r1 = 0
        L17:
            int r3 = r6.numIndSub
            if (r1 < r3) goto L1c
            return
        L1c:
            com.googlecode.mp4parser.boxes.EC3SpecificBox$Entry r3 = new com.googlecode.mp4parser.boxes.EC3SpecificBox$Entry
            r3.<init>()
            r4 = 2
            int r4 = r0.readBits(r4)
            r3.fscod = r4
            r4 = 5
            int r5 = r0.readBits(r4)
            r3.bsid = r5
            int r4 = r0.readBits(r4)
            r3.bsmod = r4
            int r4 = r0.readBits(r7)
            r3.acmod = r4
            int r4 = r0.readBits(r2)
            r3.lfeon = r4
            int r4 = r0.readBits(r7)
            r3.reserved = r4
            r4 = 4
            int r4 = r0.readBits(r4)
            r3.num_dep_sub = r4
            if (r4 <= 0) goto L59
            r4 = 9
            int r4 = r0.readBits(r4)
            r3.chan_loc = r4
            goto L5f
        L59:
            int r4 = r0.readBits(r2)
            r3.reserved2 = r4
        L5f:
            java.util.List<com.googlecode.mp4parser.boxes.EC3SpecificBox$Entry> r4 = r6.entries
            r4.add(r3)
            int r1 = r1 + 1
            goto L17
    }

    public void addEntry(com.googlecode.mp4parser.boxes.EC3SpecificBox.Entry r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.EC3SpecificBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.List<com.googlecode.mp4parser.boxes.EC3SpecificBox$Entry> r0 = r2.entries
            r0.add(r3)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(java.nio.ByteBuffer r7) {
            r6 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.EC3SpecificBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r6, r6, r7)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer r0 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer
            r0.<init>(r7)
            int r7 = r6.dataRate
            r1 = 13
            r0.writeBits(r7, r1)
            java.util.List<com.googlecode.mp4parser.boxes.EC3SpecificBox$Entry> r7 = r6.entries
            int r7 = r7.size()
            r1 = 1
            int r7 = r7 - r1
            r2 = 3
            r0.writeBits(r7, r2)
            java.util.List<com.googlecode.mp4parser.boxes.EC3SpecificBox$Entry> r7 = r6.entries
            java.util.Iterator r7 = r7.iterator()
        L2b:
            boolean r3 = r7.hasNext()
            if (r3 != 0) goto L32
            return
        L32:
            java.lang.Object r3 = r7.next()
            com.googlecode.mp4parser.boxes.EC3SpecificBox$Entry r3 = (com.googlecode.mp4parser.boxes.EC3SpecificBox.Entry) r3
            int r4 = r3.fscod
            r5 = 2
            r0.writeBits(r4, r5)
            int r4 = r3.bsid
            r5 = 5
            r0.writeBits(r4, r5)
            int r4 = r3.bsmod
            r0.writeBits(r4, r5)
            int r4 = r3.acmod
            r0.writeBits(r4, r2)
            int r4 = r3.lfeon
            r0.writeBits(r4, r1)
            int r4 = r3.reserved
            r0.writeBits(r4, r2)
            int r4 = r3.num_dep_sub
            r5 = 4
            r0.writeBits(r4, r5)
            int r4 = r3.num_dep_sub
            if (r4 <= 0) goto L6a
            int r3 = r3.chan_loc
            r4 = 9
            r0.writeBits(r3, r4)
            goto L2b
        L6a:
            int r3 = r3.reserved2
            r0.writeBits(r3, r1)
            goto L2b
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
            r5 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.EC3SpecificBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r5, r5)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.List<com.googlecode.mp4parser.boxes.EC3SpecificBox$Entry> r0 = r5.entries
            java.util.Iterator r0 = r0.iterator()
            r1 = 2
        L15:
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L1c
            return r1
        L1c:
            java.lang.Object r3 = r0.next()
            com.googlecode.mp4parser.boxes.EC3SpecificBox$Entry r3 = (com.googlecode.mp4parser.boxes.EC3SpecificBox.Entry) r3
            int r3 = r3.num_dep_sub
            if (r3 <= 0) goto L29
            r3 = 4
            goto L2b
        L29:
            r3 = 3
        L2b:
            long r1 = r1 + r3
            goto L15
    }

    public int getDataRate() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.EC3SpecificBox.ajc$tjp_5
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.dataRate
            return r0
    }

    public java.util.List<com.googlecode.mp4parser.boxes.EC3SpecificBox.Entry> getEntries() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.EC3SpecificBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.List<com.googlecode.mp4parser.boxes.EC3SpecificBox$Entry> r0 = r2.entries
            return r0
    }

    public int getNumIndSub() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.EC3SpecificBox.ajc$tjp_7
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.numIndSub
            return r0
    }

    public void setDataRate(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.EC3SpecificBox.ajc$tjp_6
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.dataRate = r3
            return
    }

    public void setEntries(java.util.List<com.googlecode.mp4parser.boxes.EC3SpecificBox.Entry> r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.EC3SpecificBox.ajc$tjp_3
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.entries = r3
            return
    }

    public void setNumIndSub(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.EC3SpecificBox.ajc$tjp_8
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.numIndSub = r3
            return
    }
}
