package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class SyncSampleBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "stss";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private long[] sampleNumber;

    static {
            ajc$preClinit()
            return
    }

    public SyncSampleBox() {
            r1 = this;
            java.lang.String r0 = "stss"
            r1.<init>(r0)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.SyncSampleBox> r0 = com.coremedia.iso.boxes.SyncSampleBox.class
            java.lang.String r1 = "SyncSampleBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getSampleNumber"
            java.lang.String r3 = "com.coremedia.iso.boxes.SyncSampleBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "[J"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 46
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.SyncSampleBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.coremedia.iso.boxes.SyncSampleBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 77
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.SyncSampleBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setSampleNumber"
            java.lang.String r3 = "com.coremedia.iso.boxes.SyncSampleBox"
            java.lang.String r4 = "[J"
            java.lang.String r5 = "sampleNumber"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 81
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.SyncSampleBox.ajc$tjp_2 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r6) {
            r5 = this;
            r5.parseVersionAndFlags(r6)
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            int r0 = com.googlecode.mp4parser.util.CastUtils.l2i(r0)
            long[] r1 = new long[r0]
            r5.sampleNumber = r1
            r1 = 0
        L10:
            if (r1 < r0) goto L13
            return
        L13:
            long[] r2 = r5.sampleNumber
            long r3 = com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L10
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r6) {
            r5 = this;
            r5.writeVersionAndFlags(r6)
            long[] r0 = r5.sampleNumber
            int r0 = r0.length
            long r0 = (long) r0
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r0)
            long[] r0 = r5.sampleNumber
            int r1 = r0.length
            r2 = 0
        Le:
            if (r2 < r1) goto L11
            return
        L11:
            r3 = r0[r2]
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r3)
            int r2 = r2 + 1
            goto Le
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            long[] r0 = r2.sampleNumber
            int r0 = r0.length
            int r0 = r0 * 4
            int r0 = r0 + 8
            long r0 = (long) r0
            return r0
    }

    public long[] getSampleNumber() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.SyncSampleBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long[] r0 = r2.sampleNumber
            return r0
    }

    public void setSampleNumber(long[] r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.SyncSampleBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.sampleNumber = r3
            return
    }

    public java.lang.String toString() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.SyncSampleBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SyncSampleBox[entryCount="
            r0.<init>(r1)
            long[] r1 = r2.sampleNumber
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
