package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public abstract class ChunkOffsetBox extends com.googlecode.mp4parser.AbstractFullBox {
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;

    static {
            ajc$preClinit()
            return
    }

    public ChunkOffsetBox(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.ChunkOffsetBox> r0 = com.coremedia.iso.boxes.ChunkOffsetBox.class
            java.lang.String r1 = "ChunkOffsetBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.coremedia.iso.boxes.ChunkOffsetBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r1 = "method-execution"
            r2 = 18
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r1, r0, r2)
            com.coremedia.iso.boxes.ChunkOffsetBox.ajc$tjp_0 = r0
            return
    }

    public abstract long[] getChunkOffsets();

    public abstract void setChunkOffsets(long[] r1);

    public java.lang.String toString() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.ChunkOffsetBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            java.lang.String r1 = "[entryCount="
            r0.append(r1)
            long[] r1 = r2.getChunkOffsets()
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
