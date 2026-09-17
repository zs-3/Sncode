package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class CopyrightBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "cprt";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private java.lang.String copyright;
    private java.lang.String language;

    static {
            ajc$preClinit()
            return
    }

    public CopyrightBox() {
            r1 = this;
            java.lang.String r0 = "cprt"
            r1.<init>(r0)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.CopyrightBox> r0 = com.coremedia.iso.boxes.CopyrightBox.class
            java.lang.String r1 = "CopyrightBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getLanguage"
            java.lang.String r3 = "com.coremedia.iso.boxes.CopyrightBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 46
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.CopyrightBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getCopyright"
            java.lang.String r3 = "com.coremedia.iso.boxes.CopyrightBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 50
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.CopyrightBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setLanguage"
            java.lang.String r3 = "com.coremedia.iso.boxes.CopyrightBox"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "language"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 54
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.CopyrightBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setCopyright"
            java.lang.String r3 = "com.coremedia.iso.boxes.CopyrightBox"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "copyright"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 58
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.CopyrightBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.coremedia.iso.boxes.CopyrightBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 81
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.CopyrightBox.ajc$tjp_4 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r2) {
            r1 = this;
            r1.parseVersionAndFlags(r2)
            java.lang.String r0 = com.coremedia.iso.IsoTypeReader.readIso639(r2)
            r1.language = r0
            java.lang.String r2 = com.coremedia.iso.IsoTypeReader.readString(r2)
            r1.copyright = r2
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r2) {
            r1 = this;
            r1.writeVersionAndFlags(r2)
            java.lang.String r0 = r1.language
            com.coremedia.iso.IsoTypeWriter.writeIso639(r2, r0)
            java.lang.String r0 = r1.copyright
            byte[] r0 = com.coremedia.iso.Utf8.convert(r0)
            r2.put(r0)
            r0 = 0
            r2.put(r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            java.lang.String r0 = r2.copyright
            int r0 = com.coremedia.iso.Utf8.utf8StringLengthInBytes(r0)
            int r0 = r0 + 7
            long r0 = (long) r0
            return r0
    }

    public java.lang.String getCopyright() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.CopyrightBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.String r0 = r2.copyright
            return r0
    }

    public java.lang.String getLanguage() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.CopyrightBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.String r0 = r2.language
            return r0
    }

    public void setCopyright(java.lang.String r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.CopyrightBox.ajc$tjp_3
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.copyright = r3
            return
    }

    public void setLanguage(java.lang.String r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.CopyrightBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.language = r3
            return
    }

    public java.lang.String toString() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.CopyrightBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CopyrightBox[language="
            r0.<init>(r1)
            java.lang.String r1 = r2.getLanguage()
            r0.append(r1)
            java.lang.String r1 = ";copyright="
            r0.append(r1)
            java.lang.String r1 = r2.getCopyright()
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
