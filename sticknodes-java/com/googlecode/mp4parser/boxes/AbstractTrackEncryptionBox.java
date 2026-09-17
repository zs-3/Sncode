package com.googlecode.mp4parser.boxes;

/* loaded from: classes2.dex */
public abstract class AbstractTrackEncryptionBox extends com.googlecode.mp4parser.AbstractFullBox {
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7 = null;
    int defaultAlgorithmId;
    int defaultIvSize;
    byte[] default_KID;

    static {
            ajc$preClinit()
            return
    }

    protected AbstractTrackEncryptionBox(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox> r0 = com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox.class
            java.lang.String r1 = "AbstractTrackEncryptionBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDefaultAlgorithmId"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 24
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setDefaultAlgorithmId"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "defaultAlgorithmId"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 28
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDefaultIvSize"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 32
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setDefaultIvSize"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "defaultIvSize"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 36
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDefault_KID"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.UUID"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 40
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox.ajc$tjp_4 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setDefault_KID"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox"
            java.lang.String r4 = "java.util.UUID"
            java.lang.String r5 = "uuid"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 46
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox.ajc$tjp_5 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "equals"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox"
            java.lang.String r4 = "java.lang.Object"
            java.lang.String r5 = "o"
            java.lang.String r6 = ""
            java.lang.String r7 = "boolean"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 76
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox.ajc$tjp_6 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "hashCode"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 90
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox.ajc$tjp_7 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r2) {
            r1 = this;
            r1.parseVersionAndFlags(r2)
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt24(r2)
            r1.defaultAlgorithmId = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r2)
            r1.defaultIvSize = r0
            r0 = 16
            byte[] r0 = new byte[r0]
            r1.default_KID = r0
            r2.get(r0)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox.ajc$tjp_6
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r4, r4, r5)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r0 = 1
            if (r4 != r5) goto L11
            return r0
        L11:
            r1 = 0
            if (r5 == 0) goto L3b
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L1f
            goto L3b
        L1f:
            com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox r5 = (com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox) r5
            int r2 = r4.defaultAlgorithmId
            int r3 = r5.defaultAlgorithmId
            if (r2 == r3) goto L28
            return r1
        L28:
            int r2 = r4.defaultIvSize
            int r3 = r5.defaultIvSize
            if (r2 == r3) goto L2f
            return r1
        L2f:
            byte[] r2 = r4.default_KID
            byte[] r5 = r5.default_KID
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 != 0) goto L3a
            return r1
        L3a:
            return r0
        L3b:
            return r1
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r2) {
            r1 = this;
            r1.writeVersionAndFlags(r2)
            int r0 = r1.defaultAlgorithmId
            com.coremedia.iso.IsoTypeWriter.writeUInt24(r2, r0)
            int r0 = r1.defaultIvSize
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r2, r0)
            byte[] r0 = r1.default_KID
            r2.put(r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            r0 = 24
            return r0
    }

    public int getDefaultAlgorithmId() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.defaultAlgorithmId
            return r0
    }

    public int getDefaultIvSize() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.defaultIvSize
            return r0
    }

    public java.util.UUID getDefault_KID() {
            r6 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r6, r6)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            byte[] r0 = r6.default_KID
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r0.order(r1)
            java.util.UUID r1 = new java.util.UUID
            long r2 = r0.getLong()
            long r4 = r0.getLong()
            r1.<init>(r2, r4)
            return r1
    }

    public int hashCode() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox.ajc$tjp_7
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.defaultAlgorithmId
            int r0 = r0 * 31
            int r1 = r2.defaultIvSize
            int r0 = r0 + r1
            int r0 = r0 * 31
            byte[] r1 = r2.default_KID
            if (r1 == 0) goto L1f
            int r1 = java.util.Arrays.hashCode(r1)
            goto L20
        L1f:
            r1 = 0
        L20:
            int r0 = r0 + r1
            return r0
    }

    public void setDefaultAlgorithmId(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox.ajc$tjp_1
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.defaultAlgorithmId = r3
            return
    }

    public void setDefaultIvSize(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox.ajc$tjp_3
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.defaultIvSize = r3
            return
    }

    public void setDefault_KID(java.util.UUID r4) {
            r3 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox.ajc$tjp_5
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r3, r3, r4)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r0 = 16
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            long r1 = r4.getMostSignificantBits()
            r0.putLong(r1)
            long r1 = r4.getLeastSignificantBits()
            r0.putLong(r1)
            byte[] r4 = r0.array()
            r3.default_KID = r4
            return
    }
}
