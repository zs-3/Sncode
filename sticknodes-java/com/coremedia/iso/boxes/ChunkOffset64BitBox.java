package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class ChunkOffset64BitBox extends com.coremedia.iso.boxes.ChunkOffsetBox {
    public static final java.lang.String TYPE = "co64";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private long[] chunkOffsets;

    static {
            ajc$preClinit()
            return
    }

    public ChunkOffset64BitBox() {
            r1 = this;
            java.lang.String r0 = "co64"
            r1.<init>(r0)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.ChunkOffset64BitBox> r0 = com.coremedia.iso.boxes.ChunkOffset64BitBox.class
            java.lang.String r1 = "ChunkOffset64BitBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getChunkOffsets"
            java.lang.String r3 = "com.coremedia.iso.boxes.ChunkOffset64BitBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "[J"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 23
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.ChunkOffset64BitBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setChunkOffsets"
            java.lang.String r3 = "com.coremedia.iso.boxes.ChunkOffset64BitBox"
            java.lang.String r4 = "[J"
            java.lang.String r5 = "chunkOffsets"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 28
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.ChunkOffset64BitBox.ajc$tjp_1 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r6) {
            r5 = this;
            r5.parseVersionAndFlags(r6)
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            int r0 = com.googlecode.mp4parser.util.CastUtils.l2i(r0)
            long[] r1 = new long[r0]
            r5.chunkOffsets = r1
            r1 = 0
        L10:
            if (r1 < r0) goto L13
            return
        L13:
            long[] r2 = r5.chunkOffsets
            long r3 = com.coremedia.iso.IsoTypeReader.readUInt64(r6)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L10
    }

    @Override // com.coremedia.iso.boxes.ChunkOffsetBox
    public long[] getChunkOffsets() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.ChunkOffset64BitBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long[] r0 = r2.chunkOffsets
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r6) {
            r5 = this;
            r5.writeVersionAndFlags(r6)
            long[] r0 = r5.chunkOffsets
            int r0 = r0.length
            long r0 = (long) r0
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r0)
            long[] r0 = r5.chunkOffsets
            int r1 = r0.length
            r2 = 0
        Le:
            if (r2 < r1) goto L11
            return
        L11:
            r3 = r0[r2]
            com.coremedia.iso.IsoTypeWriter.writeUInt64(r6, r3)
            int r2 = r2 + 1
            goto Le
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            long[] r0 = r2.chunkOffsets
            int r0 = r0.length
            int r0 = r0 * 8
            int r0 = r0 + 8
            long r0 = (long) r0
            return r0
    }

    @Override // com.coremedia.iso.boxes.ChunkOffsetBox
    public void setChunkOffsets(long[] r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.ChunkOffset64BitBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.chunkOffsets = r3
            return
    }
}
