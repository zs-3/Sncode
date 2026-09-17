package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.graphics.GLTexture;

/* loaded from: classes.dex */
public abstract class GLFrameBuffer<T extends com.badlogic.gdx.graphics.GLTexture> implements com.badlogic.gdx.utils.Disposable {
    protected static final java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.glutils.GLFrameBuffer>> buffers = null;
    protected static int defaultFramebufferHandle;
    protected static boolean defaultFramebufferHandleInitialized;
    protected com.badlogic.gdx.graphics.glutils.GLFrameBuffer.GLFrameBufferBuilder<? extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<T>> bufferBuilder;
    protected int depthStencilPackedBufferHandle;
    protected int depthbufferHandle;
    protected int framebufferHandle;
    protected boolean hasDepthStencilPackedBuffer;
    protected boolean isMRT;
    protected int stencilbufferHandle;
    protected com.badlogic.gdx.utils.Array<T> textureAttachments;

    public static class FrameBufferBuilder extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer.GLFrameBufferBuilder<com.badlogic.gdx.graphics.glutils.FrameBuffer> {
        public FrameBufferBuilder(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    protected static class FrameBufferRenderBufferAttachmentSpec {
        int internalFormat;

        public FrameBufferRenderBufferAttachmentSpec(int r1) {
                r0 = this;
                r0.<init>()
                r0.internalFormat = r1
                return
        }
    }

    protected static class FrameBufferTextureAttachmentSpec {
        int format;
        int internalFormat;
        boolean isDepth;
        boolean isFloat;
        boolean isStencil;
        int type;

        public FrameBufferTextureAttachmentSpec(int r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.internalFormat = r1
                r0.format = r2
                r0.type = r3
                return
        }

        public boolean isColorTexture() {
                r1 = this;
                boolean r0 = r1.isDepth
                if (r0 != 0) goto La
                boolean r0 = r1.isStencil
                if (r0 != 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }
    }

    public static abstract class GLFrameBufferBuilder<U extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<? extends com.badlogic.gdx.graphics.GLTexture>> {
        protected com.badlogic.gdx.graphics.glutils.GLFrameBuffer.FrameBufferRenderBufferAttachmentSpec depthRenderBufferSpec;
        protected boolean hasDepthRenderBuffer;
        protected boolean hasPackedStencilDepthRenderBuffer;
        protected boolean hasStencilRenderBuffer;
        protected int height;
        protected com.badlogic.gdx.graphics.glutils.GLFrameBuffer.FrameBufferRenderBufferAttachmentSpec packedStencilDepthRenderBufferSpec;
        protected com.badlogic.gdx.graphics.glutils.GLFrameBuffer.FrameBufferRenderBufferAttachmentSpec stencilRenderBufferSpec;
        protected com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.glutils.GLFrameBuffer.FrameBufferTextureAttachmentSpec> textureAttachmentSpecs;
        protected int width;

        public GLFrameBufferBuilder(int r2, int r3) {
                r1 = this;
                r1.<init>()
                com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
                r0.<init>()
                r1.textureAttachmentSpecs = r0
                r1.width = r2
                r1.height = r3
                return
        }

        public com.badlogic.gdx.graphics.glutils.GLFrameBuffer.GLFrameBufferBuilder<U> addBasicColorTextureAttachment(com.badlogic.gdx.graphics.Pixmap.Format r2) {
                r1 = this;
                int r0 = com.badlogic.gdx.graphics.Pixmap.Format.toGlFormat(r2)
                int r2 = com.badlogic.gdx.graphics.Pixmap.Format.toGlType(r2)
                com.badlogic.gdx.graphics.glutils.GLFrameBuffer$GLFrameBufferBuilder r2 = r1.addColorTextureAttachment(r0, r0, r2)
                return r2
        }

        public com.badlogic.gdx.graphics.glutils.GLFrameBuffer.GLFrameBufferBuilder<U> addBasicDepthRenderBuffer() {
                r1 = this;
                r0 = 33189(0x81a5, float:4.6508E-41)
                com.badlogic.gdx.graphics.glutils.GLFrameBuffer$GLFrameBufferBuilder r0 = r1.addDepthRenderBuffer(r0)
                return r0
        }

        public com.badlogic.gdx.graphics.glutils.GLFrameBuffer.GLFrameBufferBuilder<U> addBasicStencilRenderBuffer() {
                r1 = this;
                r0 = 36168(0x8d48, float:5.0682E-41)
                com.badlogic.gdx.graphics.glutils.GLFrameBuffer$GLFrameBufferBuilder r0 = r1.addStencilRenderBuffer(r0)
                return r0
        }

        public com.badlogic.gdx.graphics.glutils.GLFrameBuffer.GLFrameBufferBuilder<U> addColorTextureAttachment(int r3, int r4, int r5) {
                r2 = this;
                com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.glutils.GLFrameBuffer$FrameBufferTextureAttachmentSpec> r0 = r2.textureAttachmentSpecs
                com.badlogic.gdx.graphics.glutils.GLFrameBuffer$FrameBufferTextureAttachmentSpec r1 = new com.badlogic.gdx.graphics.glutils.GLFrameBuffer$FrameBufferTextureAttachmentSpec
                r1.<init>(r3, r4, r5)
                r0.add(r1)
                return r2
        }

        public com.badlogic.gdx.graphics.glutils.GLFrameBuffer.GLFrameBufferBuilder<U> addDepthRenderBuffer(int r2) {
                r1 = this;
                com.badlogic.gdx.graphics.glutils.GLFrameBuffer$FrameBufferRenderBufferAttachmentSpec r0 = new com.badlogic.gdx.graphics.glutils.GLFrameBuffer$FrameBufferRenderBufferAttachmentSpec
                r0.<init>(r2)
                r1.depthRenderBufferSpec = r0
                r2 = 1
                r1.hasDepthRenderBuffer = r2
                return r1
        }

        public com.badlogic.gdx.graphics.glutils.GLFrameBuffer.GLFrameBufferBuilder<U> addStencilRenderBuffer(int r2) {
                r1 = this;
                com.badlogic.gdx.graphics.glutils.GLFrameBuffer$FrameBufferRenderBufferAttachmentSpec r0 = new com.badlogic.gdx.graphics.glutils.GLFrameBuffer$FrameBufferRenderBufferAttachmentSpec
                r0.<init>(r2)
                r1.stencilRenderBufferSpec = r0
                r2 = 1
                r1.hasStencilRenderBuffer = r2
                return r1
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer.buffers = r0
            r0 = 0
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer.defaultFramebufferHandleInitialized = r0
            return
    }

    GLFrameBuffer() {
            r1 = this;
            r1.<init>()
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r1.textureAttachments = r0
            return
    }

    protected GLFrameBuffer(com.badlogic.gdx.graphics.glutils.GLFrameBuffer.GLFrameBufferBuilder<? extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<T>> r2) {
            r1 = this;
            r1.<init>()
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r1.textureAttachments = r0
            r1.bufferBuilder = r2
            r1.build()
            return
    }

    private static void addManagedFrameBuffer(com.badlogic.gdx.Application r2, com.badlogic.gdx.graphics.glutils.GLFrameBuffer r3) {
            java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.glutils.GLFrameBuffer>> r0 = com.badlogic.gdx.graphics.glutils.GLFrameBuffer.buffers
            java.lang.Object r1 = r0.get(r2)
            com.badlogic.gdx.utils.Array r1 = (com.badlogic.gdx.utils.Array) r1
            if (r1 != 0) goto Lf
            com.badlogic.gdx.utils.Array r1 = new com.badlogic.gdx.utils.Array
            r1.<init>()
        Lf:
            r1.add(r3)
            r0.put(r2, r1)
            return
    }

    private void checkValidBuilder() {
            r4 = this;
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
            boolean r0 = r0.isGL30Available()
            if (r0 != 0) goto L7f
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
            java.lang.String r1 = "GL_OES_packed_depth_stencil"
            boolean r0 = r0.supportsExtension(r1)
            r1 = 1
            if (r0 != 0) goto L20
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
            java.lang.String r2 = "GL_EXT_packed_depth_stencil"
            boolean r0 = r0.supportsExtension(r2)
            if (r0 == 0) goto L1e
            goto L20
        L1e:
            r0 = 0
            goto L21
        L20:
            r0 = 1
        L21:
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$GLFrameBufferBuilder<? extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<T extends com.badlogic.gdx.graphics.GLTexture>> r2 = r4.bufferBuilder
            boolean r3 = r2.hasPackedStencilDepthRenderBuffer
            if (r3 == 0) goto L32
            if (r0 == 0) goto L2a
            goto L32
        L2a:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "Packed Stencil/Render render buffers are not available on GLES 2.0"
            r0.<init>(r1)
            throw r0
        L32:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.glutils.GLFrameBuffer$FrameBufferTextureAttachmentSpec> r0 = r2.textureAttachmentSpecs
            int r2 = r0.size
            if (r2 > r1) goto L77
            com.badlogic.gdx.utils.Array$ArrayIterator r0 = r0.iterator()
        L3c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7f
            java.lang.Object r1 = r0.next()
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$FrameBufferTextureAttachmentSpec r1 = (com.badlogic.gdx.graphics.glutils.GLFrameBuffer.FrameBufferTextureAttachmentSpec) r1
            boolean r2 = r1.isDepth
            if (r2 != 0) goto L6f
            boolean r2 = r1.isStencil
            if (r2 != 0) goto L67
            boolean r1 = r1.isFloat
            if (r1 == 0) goto L3c
            com.badlogic.gdx.Graphics r1 = com.badlogic.gdx.Gdx.graphics
            java.lang.String r2 = "OES_texture_float"
            boolean r1 = r1.supportsExtension(r2)
            if (r1 == 0) goto L5f
            goto L3c
        L5f:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "Float texture FrameBuffer Attachment not available on GLES 2.0"
            r0.<init>(r1)
            throw r0
        L67:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "Stencil texture FrameBuffer Attachment not available on GLES 2.0"
            r0.<init>(r1)
            throw r0
        L6f:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "Depth texture FrameBuffer Attachment not available on GLES 2.0"
            r0.<init>(r1)
            throw r0
        L77:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "Multiple render targets not available on GLES 2.0"
            r0.<init>(r1)
            throw r0
        L7f:
            return
    }

    public static void clearAllFrameBuffers(com.badlogic.gdx.Application r1) {
            java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.glutils.GLFrameBuffer>> r0 = com.badlogic.gdx.graphics.glutils.GLFrameBuffer.buffers
            r0.remove(r1)
            return
    }

    public static java.lang.String getManagedStatus() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = getManagedStatus(r0)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.StringBuilder getManagedStatus(java.lang.StringBuilder r3) {
            java.lang.String r0 = "Managed buffers/app: { "
            r3.append(r0)
            java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.glutils.GLFrameBuffer>> r0 = com.badlogic.gdx.graphics.glutils.GLFrameBuffer.buffers
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            com.badlogic.gdx.Application r1 = (com.badlogic.gdx.Application) r1
            java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.glutils.GLFrameBuffer>> r2 = com.badlogic.gdx.graphics.glutils.GLFrameBuffer.buffers
            java.lang.Object r1 = r2.get(r1)
            com.badlogic.gdx.utils.Array r1 = (com.badlogic.gdx.utils.Array) r1
            int r1 = r1.size
            r3.append(r1)
            java.lang.String r1 = " "
            r3.append(r1)
            goto Lf
        L2e:
            java.lang.String r0 = "}"
            r3.append(r0)
            return r3
    }

    public static void invalidateAllFrameBuffers(com.badlogic.gdx.Application r2) {
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            if (r0 != 0) goto L5
            return
        L5:
            java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.glutils.GLFrameBuffer>> r0 = com.badlogic.gdx.graphics.glutils.GLFrameBuffer.buffers
            java.lang.Object r2 = r0.get(r2)
            com.badlogic.gdx.utils.Array r2 = (com.badlogic.gdx.utils.Array) r2
            if (r2 != 0) goto L10
            return
        L10:
            r0 = 0
        L11:
            int r1 = r2.size
            if (r0 >= r1) goto L21
            java.lang.Object r1 = r2.get(r0)
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer r1 = (com.badlogic.gdx.graphics.glutils.GLFrameBuffer) r1
            r1.build()
            int r0 = r0 + 1
            goto L11
        L21:
            return
    }

    public static void unbind() {
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            int r1 = com.badlogic.gdx.graphics.glutils.GLFrameBuffer.defaultFramebufferHandle
            r2 = 36160(0x8d40, float:5.0671E-41)
            r0.glBindFramebuffer(r2, r1)
            return
    }

    protected abstract void attachFrameBufferColorTexture(T r1);

    public void begin() {
            r0 = this;
            r0.bind()
            r0.setFrameBufferViewport()
            return
    }

    public void bind() {
            r3 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            int r1 = r3.framebufferHandle
            r2 = 36160(0x8d40, float:5.0671E-41)
            r0.glBindFramebuffer(r2, r1)
            return
    }

    protected void build() {
            r18 = this;
            r0 = r18
            com.badlogic.gdx.graphics.GL20 r7 = com.badlogic.gdx.Gdx.gl20
            r18.checkValidBuilder()
            boolean r1 = com.badlogic.gdx.graphics.glutils.GLFrameBuffer.defaultFramebufferHandleInitialized
            r8 = 1
            r9 = 0
            if (r1 != 0) goto L3a
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer.defaultFramebufferHandleInitialized = r8
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r1 = r1.getType()
            com.badlogic.gdx.Application$ApplicationType r2 = com.badlogic.gdx.Application.ApplicationType.iOS
            if (r1 != r2) goto L38
            r1 = 64
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r1 = r1.order(r2)
            java.nio.IntBuffer r1 = r1.asIntBuffer()
            r2 = 36006(0x8ca6, float:5.0455E-41)
            r7.glGetIntegerv(r2, r1)
            int r1 = r1.get(r9)
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer.defaultFramebufferHandle = r1
            goto L3a
        L38:
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer.defaultFramebufferHandle = r9
        L3a:
            int r1 = r7.glGenFramebuffer()
            r0.framebufferHandle = r1
            r10 = 36160(0x8d40, float:5.0671E-41)
            r7.glBindFramebuffer(r10, r1)
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$GLFrameBufferBuilder<? extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<T extends com.badlogic.gdx.graphics.GLTexture>> r1 = r0.bufferBuilder
            int r11 = r1.width
            int r12 = r1.height
            boolean r1 = r1.hasDepthRenderBuffer
            r13 = 36161(0x8d41, float:5.0672E-41)
            if (r1 == 0) goto L65
            int r1 = r7.glGenRenderbuffer()
            r0.depthbufferHandle = r1
            r7.glBindRenderbuffer(r13, r1)
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$GLFrameBufferBuilder<? extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<T extends com.badlogic.gdx.graphics.GLTexture>> r1 = r0.bufferBuilder
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$FrameBufferRenderBufferAttachmentSpec r1 = r1.depthRenderBufferSpec
            int r1 = r1.internalFormat
            r7.glRenderbufferStorage(r13, r1, r11, r12)
        L65:
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$GLFrameBufferBuilder<? extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<T extends com.badlogic.gdx.graphics.GLTexture>> r1 = r0.bufferBuilder
            boolean r1 = r1.hasStencilRenderBuffer
            if (r1 == 0) goto L7d
            int r1 = r7.glGenRenderbuffer()
            r0.stencilbufferHandle = r1
            r7.glBindRenderbuffer(r13, r1)
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$GLFrameBufferBuilder<? extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<T extends com.badlogic.gdx.graphics.GLTexture>> r1 = r0.bufferBuilder
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$FrameBufferRenderBufferAttachmentSpec r1 = r1.stencilRenderBufferSpec
            int r1 = r1.internalFormat
            r7.glRenderbufferStorage(r13, r1, r11, r12)
        L7d:
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$GLFrameBufferBuilder<? extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<T extends com.badlogic.gdx.graphics.GLTexture>> r1 = r0.bufferBuilder
            boolean r1 = r1.hasPackedStencilDepthRenderBuffer
            if (r1 == 0) goto L97
            int r1 = r7.glGenRenderbuffer()
            r0.depthStencilPackedBufferHandle = r1
            r7.glBindRenderbuffer(r13, r1)
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$GLFrameBufferBuilder<? extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<T extends com.badlogic.gdx.graphics.GLTexture>> r1 = r0.bufferBuilder
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$FrameBufferRenderBufferAttachmentSpec r1 = r1.packedStencilDepthRenderBufferSpec
            int r1 = r1.internalFormat
            r7.glRenderbufferStorage(r13, r1, r11, r12)
            r0.hasDepthStencilPackedBuffer = r8
        L97:
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$GLFrameBufferBuilder<? extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<T extends com.badlogic.gdx.graphics.GLTexture>> r1 = r0.bufferBuilder
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.glutils.GLFrameBuffer$FrameBufferTextureAttachmentSpec> r1 = r1.textureAttachmentSpecs
            int r2 = r1.size
            if (r2 <= r8) goto La1
            r2 = 1
            goto La2
        La1:
            r2 = 0
        La2:
            r0.isMRT = r2
            r14 = 36064(0x8ce0, float:5.0536E-41)
            if (r2 == 0) goto L121
            com.badlogic.gdx.utils.Array$ArrayIterator r15 = r1.iterator()
            r16 = 0
        Laf:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L11e
            java.lang.Object r1 = r15.next()
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$FrameBufferTextureAttachmentSpec r1 = (com.badlogic.gdx.graphics.glutils.GLFrameBuffer.FrameBufferTextureAttachmentSpec) r1
            com.badlogic.gdx.graphics.GLTexture r2 = r0.createTexture(r1)
            com.badlogic.gdx.utils.Array<T extends com.badlogic.gdx.graphics.GLTexture> r3 = r0.textureAttachments
            r3.add(r2)
            boolean r3 = r1.isColorTexture()
            if (r3 == 0) goto Le4
            r3 = 36160(0x8d40, float:5.0671E-41)
            int r4 = r16 + r14
            r5 = 3553(0xde1, float:4.979E-42)
            int r6 = r2.getTextureObjectHandle()
            r17 = 0
            r1 = r7
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r17
            r1.glFramebufferTexture2D(r2, r3, r4, r5, r6)
            int r16 = r16 + 1
            goto Laf
        Le4:
            boolean r3 = r1.isDepth
            if (r3 == 0) goto L101
            r3 = 36160(0x8d40, float:5.0671E-41)
            r4 = 36096(0x8d00, float:5.0581E-41)
            r5 = 3553(0xde1, float:4.979E-42)
            int r6 = r2.getTextureObjectHandle()
            r17 = 0
            r1 = r7
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r17
            r1.glFramebufferTexture2D(r2, r3, r4, r5, r6)
            goto Laf
        L101:
            boolean r1 = r1.isStencil
            if (r1 == 0) goto Laf
            r3 = 36160(0x8d40, float:5.0671E-41)
            r4 = 36128(0x8d20, float:5.0626E-41)
            r5 = 3553(0xde1, float:4.979E-42)
            int r6 = r2.getTextureObjectHandle()
            r17 = 0
            r1 = r7
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r17
            r1.glFramebufferTexture2D(r2, r3, r4, r5, r6)
            goto Laf
        L11e:
            r1 = r16
            goto L13a
        L121:
            java.lang.Object r1 = r1.first()
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$FrameBufferTextureAttachmentSpec r1 = (com.badlogic.gdx.graphics.glutils.GLFrameBuffer.FrameBufferTextureAttachmentSpec) r1
            com.badlogic.gdx.graphics.GLTexture r1 = r0.createTexture(r1)
            com.badlogic.gdx.utils.Array<T extends com.badlogic.gdx.graphics.GLTexture> r2 = r0.textureAttachments
            r2.add(r1)
            int r2 = r1.glTarget
            int r1 = r1.getTextureObjectHandle()
            r7.glBindTexture(r2, r1)
            r1 = 0
        L13a:
            boolean r2 = r0.isMRT
            if (r2 == 0) goto L156
            java.nio.IntBuffer r2 = com.badlogic.gdx.utils.BufferUtils.newIntBuffer(r1)
            r3 = 0
        L143:
            if (r3 >= r1) goto L14d
            int r4 = r3 + r14
            r2.put(r4)
            int r3 = r3 + 1
            goto L143
        L14d:
            r2.position(r9)
            com.badlogic.gdx.graphics.GL30 r3 = com.badlogic.gdx.Gdx.gl30
            r3.glDrawBuffers(r1, r2)
            goto L161
        L156:
            com.badlogic.gdx.utils.Array<T extends com.badlogic.gdx.graphics.GLTexture> r1 = r0.textureAttachments
            java.lang.Object r1 = r1.first()
            com.badlogic.gdx.graphics.GLTexture r1 = (com.badlogic.gdx.graphics.GLTexture) r1
            r0.attachFrameBufferColorTexture(r1)
        L161:
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$GLFrameBufferBuilder<? extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<T extends com.badlogic.gdx.graphics.GLTexture>> r1 = r0.bufferBuilder
            boolean r1 = r1.hasDepthRenderBuffer
            r2 = 36096(0x8d00, float:5.0581E-41)
            if (r1 == 0) goto L16f
            int r1 = r0.depthbufferHandle
            r7.glFramebufferRenderbuffer(r10, r2, r13, r1)
        L16f:
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$GLFrameBufferBuilder<? extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<T extends com.badlogic.gdx.graphics.GLTexture>> r1 = r0.bufferBuilder
            boolean r1 = r1.hasStencilRenderBuffer
            r3 = 36128(0x8d20, float:5.0626E-41)
            if (r1 == 0) goto L17d
            int r1 = r0.stencilbufferHandle
            r7.glFramebufferRenderbuffer(r10, r3, r13, r1)
        L17d:
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$GLFrameBufferBuilder<? extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<T extends com.badlogic.gdx.graphics.GLTexture>> r1 = r0.bufferBuilder
            boolean r1 = r1.hasPackedStencilDepthRenderBuffer
            if (r1 == 0) goto L18b
            r1 = 33306(0x821a, float:4.6672E-41)
            int r4 = r0.depthStencilPackedBufferHandle
            r7.glFramebufferRenderbuffer(r10, r1, r13, r4)
        L18b:
            r7.glBindRenderbuffer(r13, r9)
            com.badlogic.gdx.utils.Array<T extends com.badlogic.gdx.graphics.GLTexture> r1 = r0.textureAttachments
            com.badlogic.gdx.utils.Array$ArrayIterator r1 = r1.iterator()
        L194:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L1a6
            java.lang.Object r4 = r1.next()
            com.badlogic.gdx.graphics.GLTexture r4 = (com.badlogic.gdx.graphics.GLTexture) r4
            int r4 = r4.glTarget
            r7.glBindTexture(r4, r9)
            goto L194
        L1a6:
            int r1 = r7.glCheckFramebufferStatus(r10)
            r4 = 36061(0x8cdd, float:5.0532E-41)
            if (r1 != r4) goto L216
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$GLFrameBufferBuilder<? extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<T extends com.badlogic.gdx.graphics.GLTexture>> r5 = r0.bufferBuilder
            boolean r6 = r5.hasDepthRenderBuffer
            if (r6 == 0) goto L216
            boolean r5 = r5.hasStencilRenderBuffer
            if (r5 == 0) goto L216
            com.badlogic.gdx.Graphics r5 = com.badlogic.gdx.Gdx.graphics
            java.lang.String r6 = "GL_OES_packed_depth_stencil"
            boolean r5 = r5.supportsExtension(r6)
            if (r5 != 0) goto L1cd
            com.badlogic.gdx.Graphics r5 = com.badlogic.gdx.Gdx.graphics
            java.lang.String r6 = "GL_EXT_packed_depth_stencil"
            boolean r5 = r5.supportsExtension(r6)
            if (r5 == 0) goto L216
        L1cd:
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$GLFrameBufferBuilder<? extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<T extends com.badlogic.gdx.graphics.GLTexture>> r1 = r0.bufferBuilder
            boolean r1 = r1.hasDepthRenderBuffer
            if (r1 == 0) goto L1da
            int r1 = r0.depthbufferHandle
            r7.glDeleteRenderbuffer(r1)
            r0.depthbufferHandle = r9
        L1da:
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$GLFrameBufferBuilder<? extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<T extends com.badlogic.gdx.graphics.GLTexture>> r1 = r0.bufferBuilder
            boolean r1 = r1.hasStencilRenderBuffer
            if (r1 == 0) goto L1e7
            int r1 = r0.stencilbufferHandle
            r7.glDeleteRenderbuffer(r1)
            r0.stencilbufferHandle = r9
        L1e7:
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$GLFrameBufferBuilder<? extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<T extends com.badlogic.gdx.graphics.GLTexture>> r1 = r0.bufferBuilder
            boolean r1 = r1.hasPackedStencilDepthRenderBuffer
            if (r1 == 0) goto L1f4
            int r1 = r0.depthStencilPackedBufferHandle
            r7.glDeleteRenderbuffer(r1)
            r0.depthStencilPackedBufferHandle = r9
        L1f4:
            int r1 = r7.glGenRenderbuffer()
            r0.depthStencilPackedBufferHandle = r1
            r0.hasDepthStencilPackedBuffer = r8
            r7.glBindRenderbuffer(r13, r1)
            r1 = 35056(0x88f0, float:4.9124E-41)
            r7.glRenderbufferStorage(r13, r1, r11, r12)
            r7.glBindRenderbuffer(r13, r9)
            int r1 = r0.depthStencilPackedBufferHandle
            r7.glFramebufferRenderbuffer(r10, r2, r13, r1)
            int r1 = r0.depthStencilPackedBufferHandle
            r7.glFramebufferRenderbuffer(r10, r3, r13, r1)
            int r1 = r7.glCheckFramebufferStatus(r10)
        L216:
            int r2 = com.badlogic.gdx.graphics.glutils.GLFrameBuffer.defaultFramebufferHandle
            r7.glBindFramebuffer(r10, r2)
            r2 = 36053(0x8cd5, float:5.0521E-41)
            if (r1 == r2) goto L2a3
            com.badlogic.gdx.utils.Array<T extends com.badlogic.gdx.graphics.GLTexture> r2 = r0.textureAttachments
            com.badlogic.gdx.utils.Array$ArrayIterator r2 = r2.iterator()
        L226:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L236
            java.lang.Object r3 = r2.next()
            com.badlogic.gdx.graphics.GLTexture r3 = (com.badlogic.gdx.graphics.GLTexture) r3
            r0.disposeColorTexture(r3)
            goto L226
        L236:
            boolean r2 = r0.hasDepthStencilPackedBuffer
            if (r2 == 0) goto L240
            int r2 = r0.depthStencilPackedBufferHandle
            r7.glDeleteBuffer(r2)
            goto L256
        L240:
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$GLFrameBufferBuilder<? extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<T extends com.badlogic.gdx.graphics.GLTexture>> r2 = r0.bufferBuilder
            boolean r2 = r2.hasDepthRenderBuffer
            if (r2 == 0) goto L24b
            int r2 = r0.depthbufferHandle
            r7.glDeleteRenderbuffer(r2)
        L24b:
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$GLFrameBufferBuilder<? extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<T extends com.badlogic.gdx.graphics.GLTexture>> r2 = r0.bufferBuilder
            boolean r2 = r2.hasStencilRenderBuffer
            if (r2 == 0) goto L256
            int r2 = r0.stencilbufferHandle
            r7.glDeleteRenderbuffer(r2)
        L256:
            int r2 = r0.framebufferHandle
            r7.glDeleteFramebuffer(r2)
            r2 = 36054(0x8cd6, float:5.0522E-41)
            if (r1 == r2) goto L29b
            r2 = 36057(0x8cd9, float:5.0527E-41)
            if (r1 == r2) goto L293
            r2 = 36055(0x8cd7, float:5.0524E-41)
            if (r1 == r2) goto L28b
            if (r1 != r4) goto L274
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Frame buffer couldn't be constructed: unsupported combination of formats"
            r1.<init>(r2)
            throw r1
        L274:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Frame buffer couldn't be constructed: unknown error "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L28b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Frame buffer couldn't be constructed: missing attachment"
            r1.<init>(r2)
            throw r1
        L293:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Frame buffer couldn't be constructed: incomplete dimensions"
            r1.<init>(r2)
            throw r1
        L29b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Frame buffer couldn't be constructed: incomplete attachment"
            r1.<init>(r2)
            throw r1
        L2a3:
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            addManagedFrameBuffer(r1, r0)
            return
    }

    protected abstract T createTexture(com.badlogic.gdx.graphics.glutils.GLFrameBuffer.FrameBufferTextureAttachmentSpec r1);

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            com.badlogic.gdx.utils.Array<T extends com.badlogic.gdx.graphics.GLTexture> r1 = r3.textureAttachments
            com.badlogic.gdx.utils.Array$ArrayIterator r1 = r1.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L18
            java.lang.Object r2 = r1.next()
            com.badlogic.gdx.graphics.GLTexture r2 = (com.badlogic.gdx.graphics.GLTexture) r2
            r3.disposeColorTexture(r2)
            goto L8
        L18:
            boolean r1 = r3.hasDepthStencilPackedBuffer
            if (r1 == 0) goto L22
            int r1 = r3.depthStencilPackedBufferHandle
            r0.glDeleteRenderbuffer(r1)
            goto L38
        L22:
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$GLFrameBufferBuilder<? extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<T extends com.badlogic.gdx.graphics.GLTexture>> r1 = r3.bufferBuilder
            boolean r1 = r1.hasDepthRenderBuffer
            if (r1 == 0) goto L2d
            int r1 = r3.depthbufferHandle
            r0.glDeleteRenderbuffer(r1)
        L2d:
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$GLFrameBufferBuilder<? extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<T extends com.badlogic.gdx.graphics.GLTexture>> r1 = r3.bufferBuilder
            boolean r1 = r1.hasStencilRenderBuffer
            if (r1 == 0) goto L38
            int r1 = r3.stencilbufferHandle
            r0.glDeleteRenderbuffer(r1)
        L38:
            int r1 = r3.framebufferHandle
            r0.glDeleteFramebuffer(r1)
            java.util.Map<com.badlogic.gdx.Application, com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.glutils.GLFrameBuffer>> r0 = com.badlogic.gdx.graphics.glutils.GLFrameBuffer.buffers
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L53
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.Object r0 = r0.get(r1)
            com.badlogic.gdx.utils.Array r0 = (com.badlogic.gdx.utils.Array) r0
            r1 = 1
            r0.removeValue(r3, r1)
        L53:
            return
    }

    protected abstract void disposeColorTexture(T r1);

    public void end() {
            r3 = this;
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
            int r0 = r0.getBackBufferWidth()
            com.badlogic.gdx.Graphics r1 = com.badlogic.gdx.Gdx.graphics
            int r1 = r1.getBackBufferHeight()
            r2 = 0
            r3.end(r2, r2, r0, r1)
            return
    }

    public void end(int r2, int r3, int r4, int r5) {
            r1 = this;
            unbind()
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            r0.glViewport(r2, r3, r4, r5)
            return
    }

    public T getColorBufferTexture() {
            r1 = this;
            com.badlogic.gdx.utils.Array<T extends com.badlogic.gdx.graphics.GLTexture> r0 = r1.textureAttachments
            java.lang.Object r0 = r0.first()
            com.badlogic.gdx.graphics.GLTexture r0 = (com.badlogic.gdx.graphics.GLTexture) r0
            return r0
    }

    public int getHeight() {
            r1 = this;
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$GLFrameBufferBuilder<? extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<T extends com.badlogic.gdx.graphics.GLTexture>> r0 = r1.bufferBuilder
            int r0 = r0.height
            return r0
    }

    public int getWidth() {
            r1 = this;
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$GLFrameBufferBuilder<? extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<T extends com.badlogic.gdx.graphics.GLTexture>> r0 = r1.bufferBuilder
            int r0 = r0.width
            return r0
    }

    protected void setFrameBufferViewport() {
            r4 = this;
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            com.badlogic.gdx.graphics.glutils.GLFrameBuffer$GLFrameBufferBuilder<? extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer<T extends com.badlogic.gdx.graphics.GLTexture>> r1 = r4.bufferBuilder
            int r2 = r1.width
            int r1 = r1.height
            r3 = 0
            r0.glViewport(r3, r3, r2, r1)
            return
    }
}
