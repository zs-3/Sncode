package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class HandlerBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "hdlr";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5 = null;
    public static final java.util.Map<java.lang.String, java.lang.String> readableTypes = null;
    private long a;
    private long b;
    private long c;
    private java.lang.String handlerType;
    private java.lang.String name;
    private long shouldBeZeroButAppleWritesHereSomeValue;
    private boolean zeroTerm;

    static {
            ajc$preClinit()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "odsm"
            java.lang.String r2 = "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO"
            r0.put(r1, r2)
            java.lang.String r1 = "crsm"
            java.lang.String r2 = "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO"
            r0.put(r1, r2)
            java.lang.String r1 = "sdsm"
            java.lang.String r2 = "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO"
            r0.put(r1, r2)
            java.lang.String r1 = "m7sm"
            java.lang.String r2 = "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO"
            r0.put(r1, r2)
            java.lang.String r1 = "ocsm"
            java.lang.String r2 = "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO"
            r0.put(r1, r2)
            java.lang.String r1 = "ipsm"
            java.lang.String r2 = "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO"
            r0.put(r1, r2)
            java.lang.String r1 = "mjsm"
            java.lang.String r2 = "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO"
            r0.put(r1, r2)
            java.lang.String r1 = "mdir"
            java.lang.String r2 = "Apple Meta Data iTunes Reader"
            r0.put(r1, r2)
            java.lang.String r1 = "mp7b"
            java.lang.String r2 = "MPEG-7 binary XML"
            r0.put(r1, r2)
            java.lang.String r1 = "mp7t"
            java.lang.String r2 = "MPEG-7 XML"
            r0.put(r1, r2)
            java.lang.String r1 = "vide"
            java.lang.String r2 = "Video Track"
            r0.put(r1, r2)
            java.lang.String r1 = "soun"
            java.lang.String r2 = "Sound Track"
            r0.put(r1, r2)
            java.lang.String r1 = "hint"
            java.lang.String r2 = "Hint Track"
            r0.put(r1, r2)
            java.lang.String r1 = "appl"
            java.lang.String r2 = "Apple specific"
            r0.put(r1, r2)
            java.lang.String r1 = "meta"
            java.lang.String r2 = "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO"
            r0.put(r1, r2)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            com.coremedia.iso.boxes.HandlerBox.readableTypes = r0
            return
    }

    public HandlerBox() {
            r1 = this;
            java.lang.String r0 = "hdlr"
            r1.<init>(r0)
            r0 = 0
            r1.name = r0
            r0 = 1
            r1.zeroTerm = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.HandlerBox> r0 = com.coremedia.iso.boxes.HandlerBox.class
            java.lang.String r1 = "HandlerBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getHandlerType"
            java.lang.String r3 = "com.coremedia.iso.boxes.HandlerBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 78
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.HandlerBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setName"
            java.lang.String r3 = "com.coremedia.iso.boxes.HandlerBox"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "name"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 87
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.HandlerBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setHandlerType"
            java.lang.String r3 = "com.coremedia.iso.boxes.HandlerBox"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "handlerType"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 91
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.HandlerBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getName"
            java.lang.String r3 = "com.coremedia.iso.boxes.HandlerBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 95
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.HandlerBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getHumanReadableTrackType"
            java.lang.String r3 = "com.coremedia.iso.boxes.HandlerBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 99
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.HandlerBox.ajc$tjp_4 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.coremedia.iso.boxes.HandlerBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 149(0x95, float:2.09E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.HandlerBox.ajc$tjp_5 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r4) {
            r3 = this;
            r3.parseVersionAndFlags(r4)
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r4)
            r3.shouldBeZeroButAppleWritesHereSomeValue = r0
            java.lang.String r0 = com.coremedia.iso.IsoTypeReader.read4cc(r4)
            r3.handlerType = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r4)
            r3.a = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r4)
            r3.b = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r4)
            r3.c = r0
            int r0 = r4.remaining()
            r1 = 0
            if (r0 <= 0) goto L4e
            int r0 = r4.remaining()
            java.lang.String r4 = com.coremedia.iso.IsoTypeReader.readString(r4, r0)
            r3.name = r4
            java.lang.String r0 = "\u0000"
            boolean r4 = r4.endsWith(r0)
            if (r4 == 0) goto L4b
            java.lang.String r4 = r3.name
            int r0 = r4.length()
            r2 = 1
            int r0 = r0 - r2
            java.lang.String r4 = r4.substring(r1, r0)
            r3.name = r4
            r3.zeroTerm = r2
            goto L50
        L4b:
            r3.zeroTerm = r1
            goto L50
        L4e:
            r3.zeroTerm = r1
        L50:
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.writeVersionAndFlags(r3)
            long r0 = r2.shouldBeZeroButAppleWritesHereSomeValue
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            java.lang.String r0 = r2.handlerType
            byte[] r0 = com.coremedia.iso.IsoFile.fourCCtoBytes(r0)
            r3.put(r0)
            long r0 = r2.a
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            long r0 = r2.b
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            long r0 = r2.c
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            java.lang.String r0 = r2.name
            if (r0 == 0) goto L2b
            byte[] r0 = com.coremedia.iso.Utf8.convert(r0)
            r3.put(r0)
        L2b:
            boolean r0 = r2.zeroTerm
            if (r0 == 0) goto L33
            r0 = 0
            r3.put(r0)
        L33:
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            boolean r0 = r2.zeroTerm
            if (r0 == 0) goto Le
            java.lang.String r0 = r2.name
            int r0 = com.coremedia.iso.Utf8.utf8StringLengthInBytes(r0)
            int r0 = r0 + 25
        Lc:
            long r0 = (long) r0
            return r0
        Le:
            java.lang.String r0 = r2.name
            int r0 = com.coremedia.iso.Utf8.utf8StringLengthInBytes(r0)
            int r0 = r0 + 24
            goto Lc
    }

    public java.lang.String getHandlerType() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.HandlerBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.String r0 = r2.handlerType
            return r0
    }

    public java.lang.String getHumanReadableTrackType() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.HandlerBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.coremedia.iso.boxes.HandlerBox.readableTypes
            java.lang.String r1 = r2.handlerType
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L20
            java.lang.String r1 = r2.handlerType
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            goto L22
        L20:
            java.lang.String r0 = "Unknown Handler Type"
        L22:
            return r0
    }

    public java.lang.String getName() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.HandlerBox.ajc$tjp_3
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.String r0 = r2.name
            return r0
    }

    public void setHandlerType(java.lang.String r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.HandlerBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.handlerType = r3
            return
    }

    public void setName(java.lang.String r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.HandlerBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.name = r3
            return
    }

    public java.lang.String toString() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.HandlerBox.ajc$tjp_5
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HandlerBox[handlerType="
            r0.<init>(r1)
            java.lang.String r1 = r2.getHandlerType()
            r0.append(r1)
            java.lang.String r1 = ";name="
            r0.append(r1)
            java.lang.String r1 = r2.getName()
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
