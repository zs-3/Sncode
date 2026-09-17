package com.coremedia.iso.boxes.apple;

/* loaded from: classes.dex */
public class AppleDataReferenceBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "rdrf";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private java.lang.String dataReference;
    private int dataReferenceSize;
    private java.lang.String dataReferenceType;

    static {
            ajc$preClinit()
            return
    }

    public AppleDataReferenceBox() {
            r1 = this;
            java.lang.String r0 = "rdrf"
            r1.<init>(r0)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.apple.AppleDataReferenceBox> r0 = com.coremedia.iso.boxes.apple.AppleDataReferenceBox.class
            java.lang.String r1 = "AppleDataReferenceBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDataReferenceSize"
            java.lang.String r3 = "com.coremedia.iso.boxes.apple.AppleDataReferenceBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 63
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.apple.AppleDataReferenceBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDataReferenceType"
            java.lang.String r3 = "com.coremedia.iso.boxes.apple.AppleDataReferenceBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 67
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.apple.AppleDataReferenceBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDataReference"
            java.lang.String r3 = "com.coremedia.iso.boxes.apple.AppleDataReferenceBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 71
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.apple.AppleDataReferenceBox.ajc$tjp_2 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.parseVersionAndFlags(r3)
            java.lang.String r0 = com.coremedia.iso.IsoTypeReader.read4cc(r3)
            r2.dataReferenceType = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r3)
            int r0 = com.googlecode.mp4parser.util.CastUtils.l2i(r0)
            r2.dataReferenceSize = r0
            java.lang.String r3 = com.coremedia.iso.IsoTypeReader.readString(r3, r0)
            r2.dataReference = r3
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.writeVersionAndFlags(r3)
            java.lang.String r0 = r2.dataReferenceType
            byte[] r0 = com.coremedia.iso.IsoFile.fourCCtoBytes(r0)
            r3.put(r0)
            int r0 = r2.dataReferenceSize
            long r0 = (long) r0
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            java.lang.String r0 = r2.dataReference
            byte[] r0 = com.coremedia.iso.Utf8.convert(r0)
            r3.put(r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            int r0 = r2.dataReferenceSize
            int r0 = r0 + 12
            long r0 = (long) r0
            return r0
    }

    public java.lang.String getDataReference() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.apple.AppleDataReferenceBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.String r0 = r2.dataReference
            return r0
    }

    public long getDataReferenceSize() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.apple.AppleDataReferenceBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.dataReferenceSize
            long r0 = (long) r0
            return r0
    }

    public java.lang.String getDataReferenceType() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.apple.AppleDataReferenceBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.String r0 = r2.dataReferenceType
            return r0
    }
}
