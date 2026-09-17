package com.googlecode.mp4parser.boxes.mp4;

/* loaded from: classes2.dex */
public class AbstractDescriptorBox extends com.googlecode.mp4parser.AbstractFullBox {
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private static java.util.logging.Logger log;
    protected java.nio.ByteBuffer data;
    protected com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor descriptor;

    static {
            ajc$preClinit()
            java.lang.Class<com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox> r0 = com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox.log = r0
            return
    }

    public AbstractDescriptorBox(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox> r0 = com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox.class
            java.lang.String r1 = "AbstractDescriptorBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getData"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.nio.ByteBuffer"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 42
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDescriptor"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 58
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDescriptorAsString"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 62
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setDescriptor"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox"
            java.lang.String r4 = "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor"
            java.lang.String r5 = "descriptor"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 66
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setData"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox"
            java.lang.String r4 = "java.nio.ByteBuffer"
            java.lang.String r5 = "data"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 70
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox.ajc$tjp_4 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r4) {
            r3 = this;
            java.lang.String r0 = "Error parsing ObjectDescriptor"
            r3.parseVersionAndFlags(r4)
            java.nio.ByteBuffer r1 = r4.slice()
            r3.data = r1
            int r1 = r4.position()
            int r2 = r4.remaining()
            int r1 = r1 + r2
            r4.position(r1)
            java.nio.ByteBuffer r4 = r3.data     // Catch: java.lang.IndexOutOfBoundsException -> L26 java.io.IOException -> L2f
            r4.rewind()     // Catch: java.lang.IndexOutOfBoundsException -> L26 java.io.IOException -> L2f
            r4 = -1
            java.nio.ByteBuffer r1 = r3.data     // Catch: java.lang.IndexOutOfBoundsException -> L26 java.io.IOException -> L2f
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor r4 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory.createFrom(r4, r1)     // Catch: java.lang.IndexOutOfBoundsException -> L26 java.io.IOException -> L2f
            r3.descriptor = r4     // Catch: java.lang.IndexOutOfBoundsException -> L26 java.io.IOException -> L2f
            goto L37
        L26:
            r4 = move-exception
            java.util.logging.Logger r1 = com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox.log
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            r1.log(r2, r0, r4)
            goto L37
        L2f:
            r4 = move-exception
            java.util.logging.Logger r1 = com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox.log
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            r1.log(r2, r0, r4)
        L37:
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r2) {
            r1 = this;
            r1.writeVersionAndFlags(r2)
            java.nio.ByteBuffer r0 = r1.data
            r0.rewind()
            java.nio.ByteBuffer r0 = r1.data
            r2.put(r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.data
            int r0 = r0.limit()
            int r0 = r0 + 4
            long r0 = (long) r0
            return r0
    }

    public java.nio.ByteBuffer getData() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.nio.ByteBuffer r0 = r2.data
            return r0
    }

    public com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor getDescriptor() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor r0 = r2.descriptor
            return r0
    }

    public java.lang.String getDescriptorAsString() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor r0 = r2.descriptor
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void setData(java.nio.ByteBuffer r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.data = r3
            return
    }

    public void setDescriptor(com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox.ajc$tjp_3
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.descriptor = r3
            return
    }
}
