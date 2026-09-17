package com.mp4parser.iso23001.part7;

/* loaded from: classes2.dex */
public class ProtectionSystemSpecificHeaderBox extends com.googlecode.mp4parser.AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static byte[] OMA2_SYSTEM_ID = null;
    public static byte[] PLAYREADY_SYSTEM_ID = null;
    public static final java.lang.String TYPE = "pssh";
    public static byte[] WIDEVINE;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5 = null;
    byte[] content;
    java.util.List<java.util.UUID> keyIds;
    byte[] systemId;

    static {
            ajc$preClinit()
            java.lang.String r0 = "A2B55680-6F43-11E0-9A3F-0002A5D5C51B"
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            byte[] r0 = com.googlecode.mp4parser.util.UUIDConverter.convert(r0)
            com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox.OMA2_SYSTEM_ID = r0
            java.lang.String r0 = "edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            byte[] r0 = com.googlecode.mp4parser.util.UUIDConverter.convert(r0)
            com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox.WIDEVINE = r0
            java.lang.String r0 = "9A04F079-9840-4286-AB92-E65BE0885F95"
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            byte[] r0 = com.googlecode.mp4parser.util.UUIDConverter.convert(r0)
            com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox.PLAYREADY_SYSTEM_ID = r0
            return
    }

    public ProtectionSystemSpecificHeaderBox() {
            r1 = this;
            java.lang.String r0 = "pssh"
            r1.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.keyIds = r0
            return
    }

    public ProtectionSystemSpecificHeaderBox(byte[] r2, byte[] r3) {
            r1 = this;
            java.lang.String r0 = "pssh"
            r1.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.keyIds = r0
            r1.content = r3
            r1.systemId = r2
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox> r0 = com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox.class
            java.lang.String r1 = "ProtectionSystemSpecificHeaderBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getKeyIds"
            java.lang.String r3 = "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.List"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 50
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setKeyIds"
            java.lang.String r3 = "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox"
            java.lang.String r4 = "java.util.List"
            java.lang.String r5 = "keyIds"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 54
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getSystemId"
            java.lang.String r3 = "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "[B"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 61
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setSystemId"
            java.lang.String r3 = "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox"
            java.lang.String r4 = "[B"
            java.lang.String r5 = "systemId"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 65
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getContent"
            java.lang.String r3 = "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "[B"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 70
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox.ajc$tjp_4 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setContent"
            java.lang.String r3 = "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox"
            java.lang.String r4 = "[B"
            java.lang.String r5 = "content"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 74
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox.ajc$tjp_5 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(java.nio.ByteBuffer r5) {
            r4 = this;
            r4.parseVersionAndFlags(r5)
            r0 = 16
            byte[] r1 = new byte[r0]
            r4.systemId = r1
            r5.get(r1)
            int r1 = r4.getVersion()
            if (r1 <= 0) goto L2f
            long r1 = com.coremedia.iso.IsoTypeReader.readUInt32(r5)
            int r1 = com.googlecode.mp4parser.util.CastUtils.l2i(r1)
        L1a:
            int r2 = r1 + (-1)
            if (r1 > 0) goto L1f
            goto L2f
        L1f:
            byte[] r1 = new byte[r0]
            r5.get(r1)
            java.util.List<java.util.UUID> r3 = r4.keyIds
            java.util.UUID r1 = com.googlecode.mp4parser.util.UUIDConverter.convert(r1)
            r3.add(r1)
            r1 = r2
            goto L1a
        L2f:
            com.coremedia.iso.IsoTypeReader.readUInt32(r5)
            int r0 = r5.remaining()
            byte[] r0 = new byte[r0]
            r4.content = r0
            r5.get(r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r4) {
            r3 = this;
            r3.writeVersionAndFlags(r4)
            byte[] r0 = r3.systemId
            r1 = 0
            r2 = 16
            r4.put(r0, r1, r2)
            int r0 = r3.getVersion()
            if (r0 <= 0) goto L36
            java.util.List<java.util.UUID> r0 = r3.keyIds
            int r0 = r0.size()
            long r0 = (long) r0
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r4, r0)
            java.util.List<java.util.UUID> r0 = r3.keyIds
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L28
            goto L36
        L28:
            java.lang.Object r1 = r0.next()
            java.util.UUID r1 = (java.util.UUID) r1
            byte[] r1 = com.googlecode.mp4parser.util.UUIDConverter.convert(r1)
            r4.put(r1)
            goto L21
        L36:
            byte[] r0 = r3.content
            int r0 = r0.length
            long r0 = (long) r0
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r4, r0)
            byte[] r0 = r3.content
            r4.put(r0)
            return
    }

    public byte[] getContent() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            byte[] r0 = r2.content
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r4 = this;
            byte[] r0 = r4.content
            int r0 = r0.length
            int r0 = r0 + 24
            long r0 = (long) r0
            int r2 = r4.getVersion()
            if (r2 <= 0) goto L19
            r2 = 4
            long r0 = r0 + r2
            java.util.List<java.util.UUID> r2 = r4.keyIds
            int r2 = r2.size()
            int r2 = r2 * 16
            long r2 = (long) r2
            long r0 = r0 + r2
        L19:
            return r0
    }

    public java.util.List<java.util.UUID> getKeyIds() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.List<java.util.UUID> r0 = r2.keyIds
            return r0
    }

    public byte[] getSystemId() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            byte[] r0 = r2.systemId
            return r0
    }

    public void setContent(byte[] r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox.ajc$tjp_5
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.content = r3
            return
    }

    public void setKeyIds(java.util.List<java.util.UUID> r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.keyIds = r3
            return
    }

    public void setSystemId(byte[] r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox.ajc$tjp_3
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.systemId = r3
            return
    }
}
