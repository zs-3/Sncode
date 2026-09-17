package com.coremedia.iso.boxes.fragment;

/* loaded from: classes.dex */
public class MovieFragmentRandomAccessOffsetBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "mfro";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private long mfraSize;

    static {
            ajc$preClinit()
            return
    }

    public MovieFragmentRandomAccessOffsetBox() {
            r1 = this;
            java.lang.String r0 = "mfro"
            r1.<init>(r0)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessOffsetBox> r0 = com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessOffsetBox.class
            java.lang.String r1 = "MovieFragmentRandomAccessOffsetBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getMfraSize"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessOffsetBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 56
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessOffsetBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setMfraSize"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessOffsetBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "mfraSize"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 60
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessOffsetBox.ajc$tjp_1 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.parseVersionAndFlags(r3)
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r3)
            r2.mfraSize = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.writeVersionAndFlags(r3)
            long r0 = r2.mfraSize
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            r0 = 8
            return r0
    }

    public long getMfraSize() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessOffsetBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.mfraSize
            return r0
    }

    public void setMfraSize(long r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessOffsetBox.ajc$tjp_1
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.mfraSize = r3
            return
    }
}
