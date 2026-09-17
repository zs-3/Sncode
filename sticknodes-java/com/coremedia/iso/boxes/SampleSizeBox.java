package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class SampleSizeBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "stsz";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6 = null;
    int sampleCount;
    private long sampleSize;
    private long[] sampleSizes;

    static {
            ajc$preClinit()
            return
    }

    public SampleSizeBox() {
            r1 = this;
            java.lang.String r0 = "stsz"
            r1.<init>(r0)
            r0 = 0
            long[] r0 = new long[r0]
            r1.sampleSizes = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.SampleSizeBox> r0 = com.coremedia.iso.boxes.SampleSizeBox.class
            java.lang.String r1 = "SampleSizeBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getSampleSize"
            java.lang.String r3 = "com.coremedia.iso.boxes.SampleSizeBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 50
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.SampleSizeBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setSampleSize"
            java.lang.String r3 = "com.coremedia.iso.boxes.SampleSizeBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "sampleSize"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 54
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.SampleSizeBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getSampleSizeAtIndex"
            java.lang.String r3 = "com.coremedia.iso.boxes.SampleSizeBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "index"
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 59
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.SampleSizeBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getSampleCount"
            java.lang.String r3 = "com.coremedia.iso.boxes.SampleSizeBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 67
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.SampleSizeBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getSampleSizes"
            java.lang.String r3 = "com.coremedia.iso.boxes.SampleSizeBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "[J"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 76
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.SampleSizeBox.ajc$tjp_4 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setSampleSizes"
            java.lang.String r3 = "com.coremedia.iso.boxes.SampleSizeBox"
            java.lang.String r4 = "[J"
            java.lang.String r5 = "sampleSizes"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 80
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.SampleSizeBox.ajc$tjp_5 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.coremedia.iso.boxes.SampleSizeBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 119(0x77, float:1.67E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.SampleSizeBox.ajc$tjp_6 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r7) {
            r6 = this;
            r6.parseVersionAndFlags(r7)
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r7)
            r6.sampleSize = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r7)
            int r0 = com.googlecode.mp4parser.util.CastUtils.l2i(r0)
            r6.sampleCount = r0
            long r1 = r6.sampleSize
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L30
            long[] r0 = new long[r0]
            r6.sampleSizes = r0
            r0 = 0
        L20:
            int r1 = r6.sampleCount
            if (r0 < r1) goto L25
            goto L30
        L25:
            long[] r1 = r6.sampleSizes
            long r2 = com.coremedia.iso.IsoTypeReader.readUInt32(r7)
            r1[r0] = r2
            int r0 = r0 + 1
            goto L20
        L30:
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r6) {
            r5 = this;
            r5.writeVersionAndFlags(r6)
            long r0 = r5.sampleSize
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r0)
            long r0 = r5.sampleSize
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L26
            long[] r0 = r5.sampleSizes
            int r0 = r0.length
            long r0 = (long) r0
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r0)
            long[] r0 = r5.sampleSizes
            int r1 = r0.length
            r2 = 0
        L1b:
            if (r2 < r1) goto L1e
            goto L2c
        L1e:
            r3 = r0[r2]
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r3)
            int r2 = r2 + 1
            goto L1b
        L26:
            int r0 = r5.sampleCount
            long r0 = (long) r0
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r0)
        L2c:
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r5 = this;
            long r0 = r5.sampleSize
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            long[] r0 = r5.sampleSizes
            int r0 = r0.length
            int r0 = r0 * 4
            goto Lf
        Le:
            r0 = 0
        Lf:
            int r0 = r0 + 12
            long r0 = (long) r0
            return r0
    }

    public long getSampleCount() {
            r5 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.SampleSizeBox.ajc$tjp_3
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r5, r5)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r5.sampleSize
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L19
            int r0 = r5.sampleCount
        L17:
            long r0 = (long) r0
            return r0
        L19:
            long[] r0 = r5.sampleSizes
            int r0 = r0.length
            goto L17
    }

    public long getSampleSize() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.SampleSizeBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.sampleSize
            return r0
    }

    public long getSampleSizeAtIndex(int r6) {
            r5 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.SampleSizeBox.ajc$tjp_2
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r6)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r5, r5, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r5.sampleSize
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1a
            return r0
        L1a:
            long[] r0 = r5.sampleSizes
            r1 = r0[r6]
            return r1
    }

    public long[] getSampleSizes() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.SampleSizeBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long[] r0 = r2.sampleSizes
            return r0
    }

    public void setSampleSize(long r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.SampleSizeBox.ajc$tjp_1
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.sampleSize = r3
            return
    }

    public void setSampleSizes(long[] r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.SampleSizeBox.ajc$tjp_5
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.sampleSizes = r3
            return
    }

    public java.lang.String toString() {
            r3 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.SampleSizeBox.ajc$tjp_6
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r3, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SampleSizeBox[sampleSize="
            r0.<init>(r1)
            long r1 = r3.getSampleSize()
            r0.append(r1)
            java.lang.String r1 = ";sampleCount="
            r0.append(r1)
            long r1 = r3.getSampleCount()
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
