package com.googlecode.mp4parser.boxes.mp4;

/* loaded from: classes2.dex */
public class ESDescriptorBox extends com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox {
    public static final java.lang.String TYPE = "esds";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;

    static {
            ajc$preClinit()
            return
    }

    public ESDescriptorBox() {
            r1 = this;
            java.lang.String r0 = "esds"
            r1.<init>(r0)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox> r0 = com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox.class
            java.lang.String r1 = "ESDescriptorBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getEsDescriptor"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 35
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setEsDescriptor"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox"
            java.lang.String r4 = "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor"
            java.lang.String r5 = "esDescriptor"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 39
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "equals"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox"
            java.lang.String r4 = "java.lang.Object"
            java.lang.String r5 = "o"
            java.lang.String r6 = ""
            java.lang.String r7 = "boolean"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 44
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "hashCode"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 55
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox.ajc$tjp_3 = r0
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r4, r4, r5)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r0 = 1
            if (r4 != r5) goto L11
            return r0
        L11:
            r1 = 0
            if (r5 == 0) goto L32
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L1f
            goto L32
        L1f:
            com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox r5 = (com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox) r5
            java.nio.ByteBuffer r2 = r4.data
            java.nio.ByteBuffer r5 = r5.data
            if (r2 == 0) goto L2e
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L31
            goto L30
        L2e:
            if (r5 == 0) goto L31
        L30:
            return r1
        L31:
            return r0
        L32:
            return r1
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox, com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r2) {
            r1 = this;
            r1.writeVersionAndFlags(r2)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor r0 = r1.getEsDescriptor()
            java.nio.ByteBuffer r0 = r0.serialize()
            java.nio.Buffer r0 = r0.rewind()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r2.put(r0)
            return
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox, com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor r0 = r2.getEsDescriptor()
            int r0 = r0.getSize()
            int r0 = r0 + 4
            long r0 = (long) r0
            return r0
    }

    public com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor getEsDescriptor() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor r0 = super.getDescriptor()
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor r0 = (com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor) r0
            return r0
    }

    public int hashCode() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox.ajc$tjp_3
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.nio.ByteBuffer r0 = r2.data
            if (r0 == 0) goto L16
            int r0 = r0.hashCode()
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    public void setEsDescriptor(com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            super.setDescriptor(r3)
            return
    }
}
