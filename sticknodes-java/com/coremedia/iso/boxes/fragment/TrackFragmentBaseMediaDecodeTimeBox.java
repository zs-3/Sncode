package com.coremedia.iso.boxes.fragment;

/* loaded from: classes.dex */
public class TrackFragmentBaseMediaDecodeTimeBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "tfdt";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private long baseMediaDecodeTime;

    static {
            ajc$preClinit()
            return
    }

    public TrackFragmentBaseMediaDecodeTimeBox() {
            r1 = this;
            java.lang.String r0 = "tfdt"
            r1.<init>(r0)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox> r0 = com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox.class
            java.lang.String r1 = "TrackFragmentBaseMediaDecodeTimeBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getBaseMediaDecodeTime"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 65
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setBaseMediaDecodeTime"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "baseMediaDecodeTime"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 69
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 74
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox.ajc$tjp_2 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.parseVersionAndFlags(r3)
            int r0 = r2.getVersion()
            r1 = 1
            if (r0 != r1) goto L11
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt64(r3)
            r2.baseMediaDecodeTime = r0
            goto L17
        L11:
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r3)
            r2.baseMediaDecodeTime = r0
        L17:
            return
    }

    public long getBaseMediaDecodeTime() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.baseMediaDecodeTime
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.writeVersionAndFlags(r3)
            int r0 = r2.getVersion()
            r1 = 1
            if (r0 != r1) goto L10
            long r0 = r2.baseMediaDecodeTime
            com.coremedia.iso.IsoTypeWriter.writeUInt64(r3, r0)
            goto L15
        L10:
            long r0 = r2.baseMediaDecodeTime
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
        L15:
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            int r0 = r2.getVersion()
            if (r0 != 0) goto L9
            r0 = 8
            goto Lb
        L9:
            r0 = 12
        Lb:
            long r0 = (long) r0
            return r0
    }

    public void setBaseMediaDecodeTime(long r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox.ajc$tjp_1
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.baseMediaDecodeTime = r3
            return
    }

    public java.lang.String toString() {
            r3 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r3, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TrackFragmentBaseMediaDecodeTimeBox{baseMediaDecodeTime="
            r0.<init>(r1)
            long r1 = r3.baseMediaDecodeTime
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
