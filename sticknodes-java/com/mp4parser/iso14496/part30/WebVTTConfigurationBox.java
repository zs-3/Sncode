package com.mp4parser.iso14496.part30;

/* loaded from: classes2.dex */
public class WebVTTConfigurationBox extends com.googlecode.mp4parser.AbstractBox {
    public static final java.lang.String TYPE = "vttC";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    java.lang.String config;

    static {
            ajc$preClinit()
            return
    }

    public WebVTTConfigurationBox() {
            r1 = this;
            java.lang.String r0 = "vttC"
            r1.<init>(r0)
            java.lang.String r0 = ""
            r1.config = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.mp4parser.iso14496.part30.WebVTTConfigurationBox> r0 = com.mp4parser.iso14496.part30.WebVTTConfigurationBox.class
            java.lang.String r1 = "WebVTTConfigurationBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getConfig"
            java.lang.String r3 = "com.mp4parser.iso14496.part30.WebVTTConfigurationBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 36
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso14496.part30.WebVTTConfigurationBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setConfig"
            java.lang.String r3 = "com.mp4parser.iso14496.part30.WebVTTConfigurationBox"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "config"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 40
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso14496.part30.WebVTTConfigurationBox.ajc$tjp_1 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(java.nio.ByteBuffer r2) {
            r1 = this;
            int r0 = r2.remaining()
            java.lang.String r2 = com.coremedia.iso.IsoTypeReader.readString(r2, r0)
            r1.config = r2
            return
    }

    public java.lang.String getConfig() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso14496.part30.WebVTTConfigurationBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.String r0 = r2.config
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r2) {
            r1 = this;
            java.lang.String r0 = r1.config
            byte[] r0 = com.coremedia.iso.Utf8.convert(r0)
            r2.put(r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            java.lang.String r0 = r2.config
            int r0 = com.coremedia.iso.Utf8.utf8StringLengthInBytes(r0)
            long r0 = (long) r0
            return r0
    }

    public void setConfig(java.lang.String r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso14496.part30.WebVTTConfigurationBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.config = r3
            return
    }
}
