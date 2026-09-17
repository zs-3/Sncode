package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class SubtitleMediaHeaderBox extends com.coremedia.iso.boxes.AbstractMediaHeaderBox {
    public static final java.lang.String TYPE = "sthd";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;

    static {
            ajc$preClinit()
            return
    }

    public SubtitleMediaHeaderBox() {
            r1 = this;
            java.lang.String r0 = "sthd"
            r1.<init>(r0)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.SubtitleMediaHeaderBox> r0 = com.coremedia.iso.boxes.SubtitleMediaHeaderBox.class
            java.lang.String r1 = "SubtitleMediaHeaderBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.coremedia.iso.boxes.SubtitleMediaHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r1 = "method-execution"
            r2 = 30
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r1, r0, r2)
            com.coremedia.iso.boxes.SubtitleMediaHeaderBox.ajc$tjp_0 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r1) {
            r0 = this;
            r0.parseVersionAndFlags(r1)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r1) {
            r0 = this;
            r0.writeVersionAndFlags(r1)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            r0 = 4
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.SubtitleMediaHeaderBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.String r0 = "SubtitleMediaHeaderBox"
            return r0
    }
}
