package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class ItemDataBox extends com.googlecode.mp4parser.AbstractBox {
    public static final java.lang.String TYPE = "idat";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    java.nio.ByteBuffer data;

    static {
            ajc$preClinit()
            return
    }

    public ItemDataBox() {
            r1 = this;
            java.lang.String r0 = "idat"
            r1.<init>(r0)
            r0 = 0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r1.data = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.ItemDataBox> r0 = com.coremedia.iso.boxes.ItemDataBox.class
            java.lang.String r1 = "ItemDataBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getData"
            java.lang.String r3 = "com.coremedia.iso.boxes.ItemDataBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.nio.ByteBuffer"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 19
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.ItemDataBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setData"
            java.lang.String r3 = "com.coremedia.iso.boxes.ItemDataBox"
            java.lang.String r4 = "java.nio.ByteBuffer"
            java.lang.String r5 = "data"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 23
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.ItemDataBox.ajc$tjp_1 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r3.slice()
            r2.data = r0
            int r0 = r3.position()
            int r1 = r3.remaining()
            int r0 = r0 + r1
            r3.position(r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.data
            r2.put(r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.data
            int r0 = r0.limit()
            long r0 = (long) r0
            return r0
    }

    public java.nio.ByteBuffer getData() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.ItemDataBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.nio.ByteBuffer r0 = r2.data
            return r0
    }

    public void setData(java.nio.ByteBuffer r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.ItemDataBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.data = r3
            return
    }
}
