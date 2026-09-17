package com.mp4parser.iso14496.part12;

/* loaded from: classes2.dex */
public class TrackReferenceTypeBox extends com.googlecode.mp4parser.AbstractBox {
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    long[] trackIds;

    static {
            ajc$preClinit()
            return
    }

    public TrackReferenceTypeBox(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            long[] r1 = new long[r1]
            r0.trackIds = r1
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.mp4parser.iso14496.part12.TrackReferenceTypeBox> r0 = com.mp4parser.iso14496.part12.TrackReferenceTypeBox.class
            java.lang.String r1 = "TrackReferenceTypeBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getTrackIds"
            java.lang.String r3 = "com.mp4parser.iso14496.part12.TrackReferenceTypeBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "[J"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 58
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso14496.part12.TrackReferenceTypeBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setTrackIds"
            java.lang.String r3 = "com.mp4parser.iso14496.part12.TrackReferenceTypeBox"
            java.lang.String r4 = "[J"
            java.lang.String r5 = "trackIds"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 62
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.mp4parser.iso14496.part12.TrackReferenceTypeBox.ajc$tjp_1 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(java.nio.ByteBuffer r6) {
            r5 = this;
        L0:
            int r0 = r6.remaining()
            r1 = 4
            if (r0 >= r1) goto L8
            return
        L8:
            long[] r0 = r5.trackIds
            r1 = 1
            long[] r1 = new long[r1]
            r2 = 0
            long r3 = com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            r1[r2] = r3
            long[] r0 = com.googlecode.mp4parser.util.Mp4Arrays.copyOfAndAppend(r0, r1)
            r5.trackIds = r0
            goto L0
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r6) {
            r5 = this;
            long[] r0 = r5.trackIds
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 < r1) goto L7
            return
        L7:
            r3 = r0[r2]
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r3)
            int r2 = r2 + 1
            goto L4
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            long[] r0 = r2.trackIds
            int r0 = r0.length
            int r0 = r0 * 4
            long r0 = (long) r0
            return r0
    }

    public long[] getTrackIds() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso14496.part12.TrackReferenceTypeBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long[] r0 = r2.trackIds
            return r0
    }

    public void setTrackIds(long[] r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.mp4parser.iso14496.part12.TrackReferenceTypeBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.trackIds = r3
            return
    }
}
