package org.fortheloss.framework;

/* loaded from: classes2.dex */
public class SubclassedFrameBufferBuilder extends com.badlogic.gdx.graphics.glutils.GLFrameBuffer.FrameBufferBuilder {
    protected boolean _hasNearestFilter;
    protected boolean _keepColorTextures;


    public SubclassedFrameBufferBuilder(int r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0._keepColorTextures = r1
            r0._hasNearestFilter = r1
            return
    }

    public static com.badlogic.gdx.graphics.glutils.FrameBuffer createBasicExtended(com.badlogic.gdx.graphics.Pixmap.Format r7, int r8, int r9, boolean r10, boolean r11, boolean r12) {
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            com.badlogic.gdx.graphics.glutils.FrameBuffer r7 = createBasicExtended(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static com.badlogic.gdx.graphics.glutils.FrameBuffer createBasicExtended(com.badlogic.gdx.graphics.Pixmap.Format r1, int r2, int r3, boolean r4, boolean r5, boolean r6, boolean r7) {
            org.fortheloss.framework.SubclassedFrameBufferBuilder r0 = new org.fortheloss.framework.SubclassedFrameBufferBuilder
            r0.<init>(r2, r3)
            r0.addBasicColorTextureAttachment(r1)
            r0.keepColorTextures(r6)
            r0.hasNearestFilter(r7)
            if (r4 == 0) goto L13
            r0.addBasicDepthRenderBuffer()
        L13:
            if (r5 == 0) goto L18
            r0.addBasicStencilRenderBuffer()
        L18:
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r0.build()
            return r1
    }

    public com.badlogic.gdx.graphics.glutils.FrameBuffer build() {
            r1 = this;
            org.fortheloss.framework.SubclassedFrameBufferBuilder$1 r0 = new org.fortheloss.framework.SubclassedFrameBufferBuilder$1
            r0.<init>(r1, r1)
            return r0
    }

    public void hasNearestFilter(boolean r1) {
            r0 = this;
            r0._hasNearestFilter = r1
            return
    }

    public void keepColorTextures(boolean r1) {
            r0 = this;
            r0._keepColorTextures = r1
            return
    }
}
