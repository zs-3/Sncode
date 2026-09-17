package com.googlecode.mp4parser.boxes.piff;

/* loaded from: classes2.dex */
public class TfxdBox extends com.googlecode.mp4parser.AbstractFullBox {
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    public long fragmentAbsoluteDuration;
    public long fragmentAbsoluteTime;

    static {
            ajc$preClinit()
            return
    }

    public TfxdBox() {
            r1 = this;
            java.lang.String r0 = "uuid"
            r1.<init>(r0)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.googlecode.mp4parser.boxes.piff.TfxdBox> r0 = com.googlecode.mp4parser.boxes.piff.TfxdBox.class
            java.lang.String r1 = "TfxdBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getFragmentAbsoluteTime"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.piff.TfxdBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 79
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.piff.TfxdBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getFragmentAbsoluteDuration"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.piff.TfxdBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 83
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.piff.TfxdBox.ajc$tjp_1 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.parseVersionAndFlags(r3)
            int r0 = r2.getVersion()
            r1 = 1
            if (r0 != r1) goto L17
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt64(r3)
            r2.fragmentAbsoluteTime = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt64(r3)
            r2.fragmentAbsoluteDuration = r0
            goto L23
        L17:
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r3)
            r2.fragmentAbsoluteTime = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r3)
            r2.fragmentAbsoluteDuration = r0
        L23:
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.writeVersionAndFlags(r3)
            int r0 = r2.getVersion()
            r1 = 1
            if (r0 != r1) goto L15
            long r0 = r2.fragmentAbsoluteTime
            com.coremedia.iso.IsoTypeWriter.writeUInt64(r3, r0)
            long r0 = r2.fragmentAbsoluteDuration
            com.coremedia.iso.IsoTypeWriter.writeUInt64(r3, r0)
            goto L1f
        L15:
            long r0 = r2.fragmentAbsoluteTime
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            long r0 = r2.fragmentAbsoluteDuration
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
        L1f:
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            int r0 = r2.getVersion()
            r1 = 1
            if (r0 != r1) goto La
            r0 = 20
            goto Lc
        La:
            r0 = 12
        Lc:
            long r0 = (long) r0
            return r0
    }

    public long getFragmentAbsoluteDuration() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.piff.TfxdBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.fragmentAbsoluteDuration
            return r0
    }

    public long getFragmentAbsoluteTime() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.piff.TfxdBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.fragmentAbsoluteTime
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public byte[] getUserType() {
            r1 = this;
            r0 = 16
            byte[] r0 = new byte[r0]
            r0 = {x0008: FILL_ARRAY_DATA , data: [109, 29, -101, 5, 66, -43, 68, -26, -128, -30, 20, 29, -81, -9, 87, -78} // fill-array
            return r0
    }
}
