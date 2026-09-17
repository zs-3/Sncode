package com.googlecode.mp4parser.boxes.dece;

/* loaded from: classes2.dex */
public class AssetInformationBox extends com.googlecode.mp4parser.AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final java.lang.String TYPE = "ainf";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    java.lang.String apid;
    java.lang.String profileVersion;

    public static class Entry {
        public java.lang.String assetId;
        public java.lang.String namespace;
        public java.lang.String profileLevelIdc;

        public Entry(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.namespace = r1
                r0.profileLevelIdc = r2
                r0.assetId = r3
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L36
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L12
                goto L36
            L12:
                com.googlecode.mp4parser.boxes.dece.AssetInformationBox$Entry r5 = (com.googlecode.mp4parser.boxes.dece.AssetInformationBox.Entry) r5
                java.lang.String r2 = r4.assetId
                java.lang.String r3 = r5.assetId
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L1f
                return r1
            L1f:
                java.lang.String r2 = r4.namespace
                java.lang.String r3 = r5.namespace
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L2a
                return r1
            L2a:
                java.lang.String r2 = r4.profileLevelIdc
                java.lang.String r5 = r5.profileLevelIdc
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L35
                return r1
            L35:
                return r0
            L36:
                return r1
        }

        public int getSize() {
                r2 = this;
                java.lang.String r0 = r2.namespace
                int r0 = com.coremedia.iso.Utf8.utf8StringLengthInBytes(r0)
                int r0 = r0 + 3
                java.lang.String r1 = r2.profileLevelIdc
                int r1 = com.coremedia.iso.Utf8.utf8StringLengthInBytes(r1)
                int r0 = r0 + r1
                java.lang.String r1 = r2.assetId
                int r1 = com.coremedia.iso.Utf8.utf8StringLengthInBytes(r1)
                int r0 = r0 + r1
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.namespace
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r2.profileLevelIdc
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r2.assetId
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "{namespace='"
                r0.<init>(r1)
                java.lang.String r1 = r3.namespace
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                java.lang.String r2 = ", profileLevelIdc='"
                r0.append(r2)
                java.lang.String r2 = r3.profileLevelIdc
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", assetId='"
                r0.append(r2)
                java.lang.String r2 = r3.assetId
                r0.append(r2)
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

    public AssetInformationBox() {
            r1 = this;
            java.lang.String r0 = "ainf"
            r1.<init>(r0)
            java.lang.String r0 = ""
            r1.apid = r0
            java.lang.String r0 = "0000"
            r1.profileVersion = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.googlecode.mp4parser.boxes.dece.AssetInformationBox> r0 = com.googlecode.mp4parser.boxes.dece.AssetInformationBox.class
            java.lang.String r1 = "AssetInformationBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getApid"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.dece.AssetInformationBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 131(0x83, float:1.84E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.dece.AssetInformationBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setApid"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.dece.AssetInformationBox"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "apid"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 135(0x87, float:1.89E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.dece.AssetInformationBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getProfileVersion"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.dece.AssetInformationBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 139(0x8b, float:1.95E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.dece.AssetInformationBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setProfileVersion"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.dece.AssetInformationBox"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "profileVersion"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 143(0x8f, float:2.0E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.dece.AssetInformationBox.ajc$tjp_3 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r2) {
            r1 = this;
            r1.parseVersionAndFlags(r2)
            r0 = 4
            java.lang.String r0 = com.coremedia.iso.IsoTypeReader.readString(r2, r0)
            r1.profileVersion = r0
            java.lang.String r2 = com.coremedia.iso.IsoTypeReader.readString(r2)
            r1.apid = r2
            return
    }

    public java.lang.String getApid() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.dece.AssetInformationBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.String r0 = r2.apid
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r4) {
            r3 = this;
            r3.writeVersionAndFlags(r4)
            int r0 = r3.getVersion()
            if (r0 != 0) goto L21
            java.lang.String r0 = r3.profileVersion
            byte[] r0 = com.coremedia.iso.Utf8.convert(r0)
            r1 = 4
            r2 = 0
            r4.put(r0, r2, r1)
            java.lang.String r0 = r3.apid
            byte[] r0 = com.coremedia.iso.Utf8.convert(r0)
            r4.put(r0)
            r4.put(r2)
            return
        L21:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown ainf version "
            r0.<init>(r1)
            int r1 = r3.getVersion()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            java.lang.String r0 = r2.apid
            int r0 = com.coremedia.iso.Utf8.utf8StringLengthInBytes(r0)
            int r0 = r0 + 9
            long r0 = (long) r0
            return r0
    }

    public java.lang.String getProfileVersion() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.dece.AssetInformationBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.String r0 = r2.profileVersion
            return r0
    }

    @com.googlecode.mp4parser.annotations.DoNotParseDetail
    public boolean isHidden() {
            r2 = this;
            int r0 = r2.getFlags()
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L9
            return r1
        L9:
            r0 = 0
            return r0
    }

    public void setApid(java.lang.String r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.dece.AssetInformationBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.apid = r3
            return
    }

    @com.googlecode.mp4parser.annotations.DoNotParseDetail
    public void setHidden(boolean r3) {
            r2 = this;
            int r0 = r2.getFlags()
            boolean r1 = r2.isHidden()
            r1 = r1 ^ r3
            if (r1 == 0) goto L1a
            if (r3 == 0) goto L13
            r3 = r0 | 1
            r2.setFlags(r3)
            goto L1a
        L13:
            r3 = 16777214(0xfffffe, float:2.3509884E-38)
            r3 = r3 & r0
            r2.setFlags(r3)
        L1a:
            return
    }

    public void setProfileVersion(java.lang.String r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.dece.AssetInformationBox.ajc$tjp_3
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.profileVersion = r3
            return
    }
}
