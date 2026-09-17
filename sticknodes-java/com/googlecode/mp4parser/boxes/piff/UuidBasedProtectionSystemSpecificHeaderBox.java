package com.googlecode.mp4parser.boxes.piff;

/* loaded from: classes2.dex */
public class UuidBasedProtectionSystemSpecificHeaderBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static byte[] USER_TYPE;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6 = null;
    com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader protectionSpecificHeader;
    java.util.UUID systemId;

    static {
            ajc$preClinit()
            r0 = 16
            byte[] r0 = new byte[r0]
            r0 = {x000e: FILL_ARRAY_DATA , data: [-48, -118, 79, 24, 16, -13, 74, -126, -74, -56, 50, -40, -85, -95, -125, -45} // fill-array
            com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox.USER_TYPE = r0
            return
    }

    public UuidBasedProtectionSystemSpecificHeaderBox() {
            r2 = this;
            byte[] r0 = com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox.USER_TYPE
            java.lang.String r1 = "uuid"
            r2.<init>(r1, r0)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox> r0 = com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox.class
            java.lang.String r1 = "UuidBasedProtectionSystemSpecificHeaderBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getSystemId"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.UUID"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 67
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setSystemId"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox"
            java.lang.String r4 = "java.util.UUID"
            java.lang.String r5 = "systemId"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 71
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getSystemIdString"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 75
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getProtectionSpecificHeader"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 79
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getProtectionSpecificHeaderString"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 83
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_4 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setProtectionSpecificHeader"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox"
            java.lang.String r4 = "com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader"
            java.lang.String r5 = "protectionSpecificHeader"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 87
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_5 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 92
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_6 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.parseVersionAndFlags(r3)
            r0 = 16
            byte[] r0 = new byte[r0]
            r3.get(r0)
            java.util.UUID r0 = com.googlecode.mp4parser.util.UUIDConverter.convert(r0)
            r2.systemId = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r3)
            com.googlecode.mp4parser.util.CastUtils.l2i(r0)
            java.util.UUID r0 = r2.systemId
            com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader r3 = com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader.createFor(r0, r3)
            r2.protectionSpecificHeader = r3
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r4) {
            r3 = this;
            r3.writeVersionAndFlags(r4)
            java.util.UUID r0 = r3.systemId
            long r0 = r0.getMostSignificantBits()
            com.coremedia.iso.IsoTypeWriter.writeUInt64(r4, r0)
            java.util.UUID r0 = r3.systemId
            long r0 = r0.getLeastSignificantBits()
            com.coremedia.iso.IsoTypeWriter.writeUInt64(r4, r0)
            com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader r0 = r3.protectionSpecificHeader
            java.nio.ByteBuffer r0 = r0.getData()
            r0.rewind()
            int r1 = r0.limit()
            long r1 = (long) r1
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r4, r1)
            r4.put(r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader r0 = r2.protectionSpecificHeader
            java.nio.ByteBuffer r0 = r0.getData()
            int r0 = r0.limit()
            int r0 = r0 + 24
            long r0 = (long) r0
            return r0
    }

    public com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader getProtectionSpecificHeader() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_3
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader r0 = r2.protectionSpecificHeader
            return r0
    }

    public java.lang.String getProtectionSpecificHeaderString() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader r0 = r2.protectionSpecificHeader
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.util.UUID getSystemId() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.UUID r0 = r2.systemId
            return r0
    }

    public java.lang.String getSystemIdString() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.UUID r0 = r2.systemId
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public byte[] getUserType() {
            r1 = this;
            byte[] r0 = com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox.USER_TYPE
            return r0
    }

    public void setProtectionSpecificHeader(com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_5
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.protectionSpecificHeader = r3
            return
    }

    public void setSystemId(java.util.UUID r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.systemId = r3
            return
    }

    public java.lang.String toString() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_6
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "UuidBasedProtectionSystemSpecificHeaderBox"
            r0.append(r1)
            java.lang.String r1 = "{systemId="
            r0.append(r1)
            java.util.UUID r1 = r2.systemId
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = ", dataSize="
            r0.append(r1)
            com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader r1 = r2.protectionSpecificHeader
            java.nio.ByteBuffer r1 = r1.getData()
            int r1 = r1.limit()
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
