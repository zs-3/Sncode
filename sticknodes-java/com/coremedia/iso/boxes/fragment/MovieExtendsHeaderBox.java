package com.coremedia.iso.boxes.fragment;

/* loaded from: classes.dex */
public class MovieExtendsHeaderBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "mehd";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private long fragmentDuration;

    static {
            ajc$preClinit()
            return
    }

    public MovieExtendsHeaderBox() {
            r1 = this;
            java.lang.String r0 = "mehd"
            r1.<init>(r0)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox> r0 = com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox.class
            java.lang.String r1 = "MovieExtendsHeaderBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getFragmentDuration"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 65
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setFragmentDuration"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "fragmentDuration"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 69
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox.ajc$tjp_1 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.parseVersionAndFlags(r3)
            int r0 = r2.getVersion()
            r1 = 1
            if (r0 != r1) goto Lf
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt64(r3)
            goto L13
        Lf:
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r3)
        L13:
            r2.fragmentDuration = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.writeVersionAndFlags(r3)
            int r0 = r2.getVersion()
            r1 = 1
            if (r0 != r1) goto L10
            long r0 = r2.fragmentDuration
            com.coremedia.iso.IsoTypeWriter.writeUInt64(r3, r0)
            goto L15
        L10:
            long r0 = r2.fragmentDuration
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
        L15:
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            int r0 = r2.getVersion()
            r1 = 1
            if (r0 != r1) goto La
            r0 = 12
            goto Lc
        La:
            r0 = 8
        Lc:
            long r0 = (long) r0
            return r0
    }

    public long getFragmentDuration() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.fragmentDuration
            return r0
    }

    public void setFragmentDuration(long r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox.ajc$tjp_1
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.fragmentDuration = r3
            return
    }
}
