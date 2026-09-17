package com.coremedia.iso.boxes.apple;

/* loaded from: classes.dex */
public class AppleDataRateBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "rmdr";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private long dataRate;

    static {
            ajc$preClinit()
            return
    }

    public AppleDataRateBox() {
            r1 = this;
            java.lang.String r0 = "rmdr"
            r1.<init>(r0)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.apple.AppleDataRateBox> r0 = com.coremedia.iso.boxes.apple.AppleDataRateBox.class
            java.lang.String r1 = "AppleDataRateBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDataRate"
            java.lang.String r3 = "com.coremedia.iso.boxes.apple.AppleDataRateBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r1 = "method-execution"
            r2 = 53
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r1, r0, r2)
            com.coremedia.iso.boxes.apple.AppleDataRateBox.ajc$tjp_0 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.parseVersionAndFlags(r3)
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r3)
            r2.dataRate = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.writeVersionAndFlags(r3)
            long r0 = r2.dataRate
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            r0 = 8
            return r0
    }

    public long getDataRate() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.apple.AppleDataRateBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.dataRate
            return r0
    }
}
