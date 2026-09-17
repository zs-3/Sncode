package com.googlecode.mp4parser.boxes.dece;

/* loaded from: classes2.dex */
public class ContentInformationBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "cinf";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_10 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_11 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_12 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_13 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_9 = null;
    java.util.Map<java.lang.String, java.lang.String> brandEntries;
    java.lang.String codecs;
    java.util.Map<java.lang.String, java.lang.String> idEntries;
    java.lang.String languages;
    java.lang.String mimeSubtypeName;
    java.lang.String profileLevelIdc;
    java.lang.String protection;

    public static class BrandEntry {
        java.lang.String iso_brand;
        java.lang.String version;

        public BrandEntry(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.iso_brand = r1
                r0.version = r2
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L37
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L12
                goto L37
            L12:
                com.googlecode.mp4parser.boxes.dece.ContentInformationBox$BrandEntry r5 = (com.googlecode.mp4parser.boxes.dece.ContentInformationBox.BrandEntry) r5
                java.lang.String r2 = r4.iso_brand
                if (r2 == 0) goto L21
                java.lang.String r3 = r5.iso_brand
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L26
                goto L25
            L21:
                java.lang.String r2 = r5.iso_brand
                if (r2 == 0) goto L26
            L25:
                return r1
            L26:
                java.lang.String r2 = r4.version
                java.lang.String r5 = r5.version
                if (r2 == 0) goto L33
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L36
                goto L35
            L33:
                if (r5 == 0) goto L36
            L35:
                return r1
            L36:
                return r0
            L37:
                return r1
        }

        public int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.iso_brand
                r1 = 0
                if (r0 == 0) goto La
                int r0 = r0.hashCode()
                goto Lb
            La:
                r0 = 0
            Lb:
                int r0 = r0 * 31
                java.lang.String r2 = r3.version
                if (r2 == 0) goto L15
                int r1 = r2.hashCode()
            L15:
                int r0 = r0 + r1
                return r0
        }
    }

    static {
            ajc$preClinit()
            return
    }

    public ContentInformationBox() {
            r1 = this;
            java.lang.String r0 = "cinf"
            r1.<init>(r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.brandEntries = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.idEntries = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.googlecode.mp4parser.boxes.dece.ContentInformationBox> r0 = com.googlecode.mp4parser.boxes.dece.ContentInformationBox.class
            java.lang.String r1 = "ContentInformationBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getMimeSubtypeName"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.dece.ContentInformationBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 144(0x90, float:2.02E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setMimeSubtypeName"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.dece.ContentInformationBox"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "mimeSubtypeName"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 148(0x94, float:2.07E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getBrandEntries"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.dece.ContentInformationBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.Map"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 184(0xb8, float:2.58E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_10 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setBrandEntries"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.dece.ContentInformationBox"
            java.lang.String r4 = "java.util.Map"
            java.lang.String r5 = "brandEntries"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 188(0xbc, float:2.63E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_11 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getIdEntries"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.dece.ContentInformationBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.Map"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 192(0xc0, float:2.69E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_12 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setIdEntries"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.dece.ContentInformationBox"
            java.lang.String r4 = "java.util.Map"
            java.lang.String r5 = "idEntries"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 196(0xc4, float:2.75E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_13 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getProfileLevelIdc"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.dece.ContentInformationBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 152(0x98, float:2.13E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setProfileLevelIdc"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.dece.ContentInformationBox"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "profileLevelIdc"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 156(0x9c, float:2.19E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getCodecs"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.dece.ContentInformationBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 160(0xa0, float:2.24E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_4 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setCodecs"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.dece.ContentInformationBox"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "codecs"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 164(0xa4, float:2.3E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_5 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getProtection"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.dece.ContentInformationBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 168(0xa8, float:2.35E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_6 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setProtection"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.dece.ContentInformationBox"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "protection"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 172(0xac, float:2.41E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_7 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getLanguages"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.dece.ContentInformationBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 176(0xb0, float:2.47E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_8 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setLanguages"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.dece.ContentInformationBox"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "languages"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 180(0xb4, float:2.52E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_9 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(java.nio.ByteBuffer r5) {
            r4 = this;
            r4.parseVersionAndFlags(r5)
            java.lang.String r0 = com.coremedia.iso.IsoTypeReader.readString(r5)
            r4.mimeSubtypeName = r0
            java.lang.String r0 = com.coremedia.iso.IsoTypeReader.readString(r5)
            r4.profileLevelIdc = r0
            java.lang.String r0 = com.coremedia.iso.IsoTypeReader.readString(r5)
            r4.codecs = r0
            java.lang.String r0 = com.coremedia.iso.IsoTypeReader.readString(r5)
            r4.protection = r0
            java.lang.String r0 = com.coremedia.iso.IsoTypeReader.readString(r5)
            r4.languages = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r5)
        L25:
            int r1 = r0 + (-1)
            if (r0 > 0) goto L41
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r5)
        L2d:
            int r1 = r0 + (-1)
            if (r0 > 0) goto L32
            return
        L32:
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.idEntries
            java.lang.String r2 = com.coremedia.iso.IsoTypeReader.readString(r5)
            java.lang.String r3 = com.coremedia.iso.IsoTypeReader.readString(r5)
            r0.put(r2, r3)
            r0 = r1
            goto L2d
        L41:
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.brandEntries
            java.lang.String r2 = com.coremedia.iso.IsoTypeReader.readString(r5)
            java.lang.String r3 = com.coremedia.iso.IsoTypeReader.readString(r5)
            r0.put(r2, r3)
            r0 = r1
            goto L25
    }

    public java.util.Map<java.lang.String, java.lang.String> getBrandEntries() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_10
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.brandEntries
            return r0
    }

    public java.lang.String getCodecs() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.String r0 = r2.codecs
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r4) {
            r3 = this;
            r3.writeVersionAndFlags(r4)
            java.lang.String r0 = r3.mimeSubtypeName
            com.coremedia.iso.IsoTypeWriter.writeZeroTermUtf8String(r4, r0)
            java.lang.String r0 = r3.profileLevelIdc
            com.coremedia.iso.IsoTypeWriter.writeZeroTermUtf8String(r4, r0)
            java.lang.String r0 = r3.codecs
            com.coremedia.iso.IsoTypeWriter.writeZeroTermUtf8String(r4, r0)
            java.lang.String r0 = r3.protection
            com.coremedia.iso.IsoTypeWriter.writeZeroTermUtf8String(r4, r0)
            java.lang.String r0 = r3.languages
            com.coremedia.iso.IsoTypeWriter.writeZeroTermUtf8String(r4, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.brandEntries
            int r0 = r0.size()
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r4, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.brandEntries
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L68
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.idEntries
            int r0 = r0.size()
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r4, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.idEntries
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L48:
            boolean r0 = r1.hasNext()
            if (r0 != 0) goto L4f
            return
        L4f:
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            com.coremedia.iso.IsoTypeWriter.writeZeroTermUtf8String(r4, r2)
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            com.coremedia.iso.IsoTypeWriter.writeZeroTermUtf8String(r4, r0)
            goto L48
        L68:
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            com.coremedia.iso.IsoTypeWriter.writeZeroTermUtf8String(r4, r2)
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            com.coremedia.iso.IsoTypeWriter.writeZeroTermUtf8String(r4, r1)
            goto L2f
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r8 = this;
            java.lang.String r0 = r8.mimeSubtypeName
            int r0 = com.coremedia.iso.Utf8.utf8StringLengthInBytes(r0)
            int r0 = r0 + 1
            long r0 = (long) r0
            r2 = 4
            long r0 = r0 + r2
            java.lang.String r2 = r8.profileLevelIdc
            int r2 = com.coremedia.iso.Utf8.utf8StringLengthInBytes(r2)
            int r2 = r2 + 1
            long r2 = (long) r2
            long r0 = r0 + r2
            java.lang.String r2 = r8.codecs
            int r2 = com.coremedia.iso.Utf8.utf8StringLengthInBytes(r2)
            int r2 = r2 + 1
            long r2 = (long) r2
            long r0 = r0 + r2
            java.lang.String r2 = r8.protection
            int r2 = com.coremedia.iso.Utf8.utf8StringLengthInBytes(r2)
            int r2 = r2 + 1
            long r2 = (long) r2
            long r0 = r0 + r2
            java.lang.String r2 = r8.languages
            int r2 = com.coremedia.iso.Utf8.utf8StringLengthInBytes(r2)
            int r2 = r2 + 1
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 1
            long r0 = r0 + r2
            java.util.Map<java.lang.String, java.lang.String> r4 = r8.brandEntries
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L41:
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L7c
            long r0 = r0 + r2
            java.util.Map<java.lang.String, java.lang.String> r2 = r8.idEntries
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r5 = r2.iterator()
        L52:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L59
            return r0
        L59:
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.coremedia.iso.Utf8.utf8StringLengthInBytes(r3)
            int r3 = r3 + 1
            long r3 = (long) r3
            long r0 = r0 + r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            int r2 = com.coremedia.iso.Utf8.utf8StringLengthInBytes(r2)
            int r2 = r2 + 1
            long r2 = (long) r2
            long r0 = r0 + r2
            goto L52
        L7c:
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.coremedia.iso.Utf8.utf8StringLengthInBytes(r6)
            int r6 = r6 + 1
            long r6 = (long) r6
            long r0 = r0 + r6
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.coremedia.iso.Utf8.utf8StringLengthInBytes(r5)
            int r5 = r5 + 1
            long r5 = (long) r5
            long r0 = r0 + r5
            goto L41
    }

    public java.util.Map<java.lang.String, java.lang.String> getIdEntries() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_12
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.idEntries
            return r0
    }

    public java.lang.String getLanguages() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_8
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.String r0 = r2.languages
            return r0
    }

    public java.lang.String getMimeSubtypeName() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.String r0 = r2.mimeSubtypeName
            return r0
    }

    public java.lang.String getProfileLevelIdc() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.String r0 = r2.profileLevelIdc
            return r0
    }

    public java.lang.String getProtection() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_6
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.String r0 = r2.protection
            return r0
    }

    public void setBrandEntries(java.util.Map<java.lang.String, java.lang.String> r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_11
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.brandEntries = r3
            return
    }

    public void setCodecs(java.lang.String r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_5
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.codecs = r3
            return
    }

    public void setIdEntries(java.util.Map<java.lang.String, java.lang.String> r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_13
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.idEntries = r3
            return
    }

    public void setLanguages(java.lang.String r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_9
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.languages = r3
            return
    }

    public void setMimeSubtypeName(java.lang.String r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.mimeSubtypeName = r3
            return
    }

    public void setProfileLevelIdc(java.lang.String r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_3
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.profileLevelIdc = r3
            return
    }

    public void setProtection(java.lang.String r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.dece.ContentInformationBox.ajc$tjp_7
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.protection = r3
            return
    }
}
