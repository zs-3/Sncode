package com.googlecode.mp4parser;

/* loaded from: classes2.dex */
public abstract class AbstractFullBox extends com.googlecode.mp4parser.AbstractBox implements com.coremedia.iso.boxes.FullBox {
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private int flags;
    private int version;

    static {
            ajc$preClinit()
            return
    }

    protected AbstractFullBox(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    protected AbstractFullBox(java.lang.String r1, byte[] r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.googlecode.mp4parser.AbstractFullBox> r0 = com.googlecode.mp4parser.AbstractFullBox.class
            java.lang.String r1 = "AbstractFullBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "setVersion"
            java.lang.String r3 = "com.googlecode.mp4parser.AbstractFullBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "version"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 51
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.AbstractFullBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setFlags"
            java.lang.String r3 = "com.googlecode.mp4parser.AbstractFullBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "flags"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 64
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.AbstractFullBox.ajc$tjp_1 = r0
            return
    }

    @Override // com.coremedia.iso.boxes.FullBox
    @com.googlecode.mp4parser.annotations.DoNotParseDetail
    public int getFlags() {
            r1 = this;
            boolean r0 = r1.isParsed
            if (r0 != 0) goto L7
            r1.parseDetails()
        L7:
            int r0 = r1.flags
            return r0
    }

    @Override // com.coremedia.iso.boxes.FullBox
    @com.googlecode.mp4parser.annotations.DoNotParseDetail
    public int getVersion() {
            r1 = this;
            boolean r0 = r1.isParsed
            if (r0 != 0) goto L7
            r1.parseDetails()
        L7:
            int r0 = r1.version
            return r0
    }

    protected final long parseVersionAndFlags(java.nio.ByteBuffer r3) {
            r2 = this;
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r3)
            r2.version = r0
            int r3 = com.coremedia.iso.IsoTypeReader.readUInt24(r3)
            r2.flags = r3
            r0 = 4
            return r0
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public void setFlags(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.AbstractFullBox.ajc$tjp_1
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.flags = r3
            return
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public void setVersion(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.AbstractFullBox.ajc$tjp_0
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.version = r3
            return
    }

    protected final void writeVersionAndFlags(java.nio.ByteBuffer r2) {
            r1 = this;
            int r0 = r1.version
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r2, r0)
            int r0 = r1.flags
            com.coremedia.iso.IsoTypeWriter.writeUInt24(r2, r0)
            return
    }
}
