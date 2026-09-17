package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class KeywordsBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "kywd";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private java.lang.String[] keywords;
    private java.lang.String language;

    static {
            ajc$preClinit()
            return
    }

    public KeywordsBox() {
            r1 = this;
            java.lang.String r0 = "kywd"
            r1.<init>(r0)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.KeywordsBox> r0 = com.coremedia.iso.boxes.KeywordsBox.class
            java.lang.String r1 = "KeywordsBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getLanguage"
            java.lang.String r3 = "com.coremedia.iso.boxes.KeywordsBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 40
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.KeywordsBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getKeywords"
            java.lang.String r3 = "com.coremedia.iso.boxes.KeywordsBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "[Ljava.lang.String;"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 44
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.KeywordsBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setLanguage"
            java.lang.String r3 = "com.coremedia.iso.boxes.KeywordsBox"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "language"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 48
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.KeywordsBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setKeywords"
            java.lang.String r3 = "com.coremedia.iso.boxes.KeywordsBox"
            java.lang.String r4 = "[Ljava.lang.String;"
            java.lang.String r5 = "keywords"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 52
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.KeywordsBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.coremedia.iso.boxes.KeywordsBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 87
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.KeywordsBox.ajc$tjp_4 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r5) {
            r4 = this;
            r4.parseVersionAndFlags(r5)
            java.lang.String r0 = com.coremedia.iso.IsoTypeReader.readIso639(r5)
            r4.language = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r5)
            java.lang.String[] r1 = new java.lang.String[r0]
            r4.keywords = r1
            r1 = 0
        L12:
            if (r1 < r0) goto L15
            return
        L15:
            com.coremedia.iso.IsoTypeReader.readUInt8(r5)
            java.lang.String[] r2 = r4.keywords
            java.lang.String r3 = com.coremedia.iso.IsoTypeReader.readString(r5)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L12
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r6) {
            r5 = this;
            r5.writeVersionAndFlags(r6)
            java.lang.String r0 = r5.language
            com.coremedia.iso.IsoTypeWriter.writeIso639(r6, r0)
            java.lang.String[] r0 = r5.keywords
            int r0 = r0.length
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r6, r0)
            java.lang.String[] r0 = r5.keywords
            int r1 = r0.length
            r2 = 0
        L12:
            if (r2 < r1) goto L15
            return
        L15:
            r3 = r0[r2]
            int r4 = com.coremedia.iso.Utf8.utf8StringLengthInBytes(r3)
            int r4 = r4 + 1
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r6, r4)
            byte[] r3 = com.coremedia.iso.Utf8.convert(r3)
            r6.put(r3)
            int r2 = r2 + 1
            goto L12
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r7 = this;
            java.lang.String[] r0 = r7.keywords
            int r1 = r0.length
            r2 = 7
            r4 = 0
        L6:
            if (r4 < r1) goto L9
            return r2
        L9:
            r5 = r0[r4]
            int r5 = com.coremedia.iso.Utf8.utf8StringLengthInBytes(r5)
            int r5 = r5 + 1
            int r5 = r5 + 1
            long r5 = (long) r5
            long r2 = r2 + r5
            int r4 = r4 + 1
            goto L6
    }

    public java.lang.String[] getKeywords() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.KeywordsBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.String[] r0 = r2.keywords
            return r0
    }

    public java.lang.String getLanguage() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.KeywordsBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.String r0 = r2.language
            return r0
    }

    public void setKeywords(java.lang.String[] r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.KeywordsBox.ajc$tjp_3
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.keywords = r3
            return
    }

    public void setLanguage(java.lang.String r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.KeywordsBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.language = r3
            return
    }

    public java.lang.String toString() {
            r3 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.KeywordsBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r3, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "KeywordsBox[language="
            r0.append(r1)
            java.lang.String r1 = r3.getLanguage()
            r0.append(r1)
            r1 = 0
        L1f:
            java.lang.String[] r2 = r3.keywords
            int r2 = r2.length
            if (r1 < r2) goto L2e
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L2e:
            java.lang.String r2 = ";keyword"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "="
            r0.append(r2)
            java.lang.String[] r2 = r3.keywords
            r2 = r2[r1]
            r0.append(r2)
            int r1 = r1 + 1
            goto L1f
    }
}
