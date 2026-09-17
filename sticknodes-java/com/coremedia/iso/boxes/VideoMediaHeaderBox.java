package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class VideoMediaHeaderBox extends com.coremedia.iso.boxes.AbstractMediaHeaderBox {
    public static final java.lang.String TYPE = "vmhd";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private int graphicsmode;
    private int[] opcolor;

    static {
            ajc$preClinit()
            return
    }

    public VideoMediaHeaderBox() {
            r1 = this;
            java.lang.String r0 = "vmhd"
            r1.<init>(r0)
            r0 = 0
            r1.graphicsmode = r0
            r0 = 3
            int[] r0 = new int[r0]
            r1.opcolor = r0
            r0 = 1
            r1.setFlags(r0)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.VideoMediaHeaderBox> r0 = com.coremedia.iso.boxes.VideoMediaHeaderBox.class
            java.lang.String r1 = "VideoMediaHeaderBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getGraphicsmode"
            java.lang.String r3 = "com.coremedia.iso.boxes.VideoMediaHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 39
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.VideoMediaHeaderBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getOpcolor"
            java.lang.String r3 = "com.coremedia.iso.boxes.VideoMediaHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "[I"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 43
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.VideoMediaHeaderBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.coremedia.iso.boxes.VideoMediaHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 71
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.VideoMediaHeaderBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setOpcolor"
            java.lang.String r3 = "com.coremedia.iso.boxes.VideoMediaHeaderBox"
            java.lang.String r4 = "[I"
            java.lang.String r5 = "opcolor"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 75
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.VideoMediaHeaderBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setGraphicsmode"
            java.lang.String r3 = "com.coremedia.iso.boxes.VideoMediaHeaderBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "graphicsmode"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 79
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.VideoMediaHeaderBox.ajc$tjp_4 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r5) {
            r4 = this;
            r4.parseVersionAndFlags(r5)
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r5)
            r4.graphicsmode = r0
            r0 = 3
            int[] r1 = new int[r0]
            r4.opcolor = r1
            r1 = 0
        Lf:
            if (r1 < r0) goto L12
            return
        L12:
            int[] r2 = r4.opcolor
            int r3 = com.coremedia.iso.IsoTypeReader.readUInt16(r5)
            r2[r1] = r3
            int r1 = r1 + 1
            goto Lf
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r5) {
            r4 = this;
            r4.writeVersionAndFlags(r5)
            int r0 = r4.graphicsmode
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r5, r0)
            int[] r0 = r4.opcolor
            int r1 = r0.length
            r2 = 0
        Lc:
            if (r2 < r1) goto Lf
            return
        Lf:
            r3 = r0[r2]
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r5, r3)
            int r2 = r2 + 1
            goto Lc
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            r0 = 12
            return r0
    }

    public int getGraphicsmode() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.VideoMediaHeaderBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.graphicsmode
            return r0
    }

    public int[] getOpcolor() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.VideoMediaHeaderBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int[] r0 = r2.opcolor
            return r0
    }

    public void setGraphicsmode(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.VideoMediaHeaderBox.ajc$tjp_4
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.graphicsmode = r3
            return
    }

    public void setOpcolor(int[] r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.VideoMediaHeaderBox.ajc$tjp_3
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.opcolor = r3
            return
    }

    public java.lang.String toString() {
            r3 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.VideoMediaHeaderBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r3, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VideoMediaHeaderBox[graphicsmode="
            r0.<init>(r1)
            int r1 = r3.getGraphicsmode()
            r0.append(r1)
            java.lang.String r1 = ";opcolor0="
            r0.append(r1)
            int[] r1 = r3.getOpcolor()
            r2 = 0
            r1 = r1[r2]
            r0.append(r1)
            java.lang.String r1 = ";opcolor1="
            r0.append(r1)
            int[] r1 = r3.getOpcolor()
            r2 = 1
            r1 = r1[r2]
            r0.append(r1)
            java.lang.String r1 = ";opcolor2="
            r0.append(r1)
            int[] r1 = r3.getOpcolor()
            r2 = 2
            r1 = r1[r2]
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
