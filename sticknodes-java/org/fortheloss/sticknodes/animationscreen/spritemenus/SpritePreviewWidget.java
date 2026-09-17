package org.fortheloss.sticknodes.animationscreen.spritemenus;

/* loaded from: classes2.dex */
public class SpritePreviewWidget extends com.badlogic.gdx.scenes.scene2d.ui.Widget implements com.badlogic.gdx.utils.Disposable {
    private com.badlogic.gdx.graphics.Color mBackgroundColor;
    private boolean mIsTransparent;
    private int mMaskState;
    private com.badlogic.gdx.graphics.g2d.TextureRegion mOpaqueTextureRef;
    private com.badlogic.gdx.graphics.Texture mSpriteMaskTextureRef;
    private com.badlogic.gdx.graphics.Texture mTextureRef;
    private com.badlogic.gdx.graphics.g2d.TextureRegion mTransparencyTextureRef;
    private com.badlogic.gdx.math.Rectangle mUVs;

    public SpritePreviewWidget(com.badlogic.gdx.graphics.g2d.TextureRegion r4, com.badlogic.gdx.graphics.g2d.TextureRegion r5, com.badlogic.gdx.graphics.Texture r6) {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.mIsTransparent = r0
            r0 = 0
            r3.mMaskState = r0
            com.badlogic.gdx.math.Rectangle r0 = new com.badlogic.gdx.math.Rectangle
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r1, r2, r2)
            r3.mUVs = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r1 = 1063675494(0x3f666666, float:0.9)
            r0.<init>(r1, r1, r1, r2)
            r3.mBackgroundColor = r0
            r3.mTransparencyTextureRef = r4
            r3.mOpaqueTextureRef = r5
            r3.mSpriteMaskTextureRef = r6
            return
    }

    public void computeSize() {
            r7 = this;
            com.badlogic.gdx.graphics.Texture r0 = r7.mTextureRef
            if (r0 == 0) goto L72
            com.badlogic.gdx.scenes.scene2d.Group r0 = r7.getParent()
            if (r0 != 0) goto Lb
            goto L72
        Lb:
            float r0 = r7.getHeight()
            com.badlogic.gdx.scenes.scene2d.Group r1 = r7.getParent()
            float r1 = r1.getWidth()
            r7.setWidth(r1)
            com.badlogic.gdx.math.Rectangle r1 = r7.mUVs
            float r1 = r1.width
            com.badlogic.gdx.graphics.Texture r2 = r7.mTextureRef
            int r2 = r2.getWidth()
            float r2 = (float) r2
            float r1 = r1 * r2
            com.badlogic.gdx.math.Rectangle r2 = r7.mUVs
            float r2 = r2.height
            com.badlogic.gdx.graphics.Texture r3 = r7.mTextureRef
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 * r3
            float r3 = r7.getWidth()
            float r3 = r3 * r2
            float r3 = r3 / r1
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r5 = 1153138688(0x44bb8000, float:1500.0)
            float r6 = r4 * r5
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 <= 0) goto L56
            float r4 = r4 * r5
            r7.setHeight(r4)
            float r3 = r7.getHeight()
            float r3 = r3 * r1
            float r3 = r3 / r2
            r7.setWidth(r3)
            goto L59
        L56:
            r7.setHeight(r3)
        L59:
            float r1 = r7.getHeight()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L72
            com.badlogic.gdx.scenes.scene2d.Group r0 = r7.getParent()
            boolean r0 = r0 instanceof com.badlogic.gdx.scenes.scene2d.utils.Layout
            if (r0 == 0) goto L72
            com.badlogic.gdx.scenes.scene2d.Group r0 = r7.getParent()
            com.badlogic.gdx.scenes.scene2d.utils.Layout r0 = (com.badlogic.gdx.scenes.scene2d.utils.Layout) r0
            r0.invalidateHierarchy()
        L72:
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.mTextureRef = r0
            r1.mUVs = r0
            r1.mTransparencyTextureRef = r0
            r1.mOpaqueTextureRef = r0
            r1.mSpriteMaskTextureRef = r0
            r1.mBackgroundColor = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r20, float r21) {
            r19 = this;
            r0 = r19
            r11 = r20
            super.draw(r20, r21)
            com.badlogic.gdx.graphics.Texture r1 = r0.mTextureRef
            if (r1 == 0) goto L1a4
            float r1 = r19.getHeight()
            r12 = 0
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 != 0) goto L16
            goto L1a4
        L16:
            com.badlogic.gdx.graphics.Color r13 = r19.getColor()
            boolean r1 = r0.mIsTransparent
            if (r1 == 0) goto L4b
            float r1 = r13.r
            float r2 = r13.g
            float r3 = r13.b
            float r4 = r13.a
            float r4 = r4 * r21
            r11.setColor(r1, r2, r3, r4)
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r19.getStage()
            com.badlogic.gdx.graphics.Camera r1 = r1.getCamera()
            com.badlogic.gdx.graphics.g2d.TextureRegion r3 = r0.mTransparencyTextureRef
            float r4 = r19.getX()
            float r5 = r19.getY()
            float r6 = r19.getWidth()
            float r7 = r19.getHeight()
            r2 = r20
            org.fortheloss.framework.RenderUtils.tile(r1, r2, r3, r4, r5, r6, r7)
            goto L8a
        L4b:
            float r1 = r13.r
            com.badlogic.gdx.graphics.Color r2 = r0.mBackgroundColor
            float r3 = r2.r
            float r1 = r1 * r3
            float r3 = r13.g
            float r4 = r2.g
            float r3 = r3 * r4
            float r4 = r13.b
            float r2 = r2.b
            float r4 = r4 * r2
            float r2 = r13.a
            float r2 = r2 * r21
            r11.setColor(r1, r3, r4, r2)
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0.mOpaqueTextureRef
            float r3 = r19.getX()
            float r4 = r19.getY()
            float r5 = r19.getWidth()
            float r6 = r19.getHeight()
            r1 = r20
            r1.draw(r2, r3, r4, r5, r6)
            float r1 = r13.r
            float r2 = r13.g
            float r3 = r13.b
            float r4 = r13.a
            float r4 = r4 * r21
            r11.setColor(r1, r2, r3, r4)
        L8a:
            com.badlogic.gdx.graphics.Texture r2 = r0.mTextureRef
            float r3 = r19.getX()
            float r4 = r19.getY()
            float r5 = r19.getWidth()
            float r6 = r19.getHeight()
            com.badlogic.gdx.math.Rectangle r1 = r0.mUVs
            float r7 = r1.x
            float r8 = r1.y
            r14 = 1065353216(0x3f800000, float:1.0)
            float r9 = r14 - r8
            float r10 = r1.width
            float r10 = r10 + r7
            float r1 = r1.height
            float r8 = r8 + r1
            float r15 = r14 - r8
            r1 = r20
            r8 = r9
            r9 = r10
            r10 = r15
            r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int r1 = r0.mMaskState
            if (r1 == 0) goto L1a4
            float r15 = r19.getWidth()
            float r16 = r19.getHeight()
            com.badlogic.gdx.graphics.Texture r1 = r0.mSpriteMaskTextureRef
            int r1 = r1.getWidth()
            float r1 = (float) r1
            com.badlogic.gdx.graphics.Texture r2 = r0.mSpriteMaskTextureRef
            int r2 = r2.getHeight()
            float r2 = (float) r2
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r3
            int r4 = (r16 > r15 ? 1 : (r16 == r15 ? 0 : -1))
            if (r4 <= 0) goto Ldd
            float r4 = r1 / r15
            float r5 = r2 / r16
            goto Le1
        Ldd:
            float r4 = r1 / r16
            float r5 = r2 / r15
        Le1:
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 <= 0) goto Lec
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 <= 0) goto Lec
            float r1 = r1 / r4
            float r2 = r2 / r4
            goto Lf2
        Lec:
            int r4 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r4 <= 0) goto Lf2
            float r1 = r1 / r5
            float r2 = r2 / r5
        Lf2:
            r12 = r2
            float r17 = r1 * r3
            float r1 = r13.a
            float r1 = r1 * r21
            r11.setColor(r14, r14, r14, r1)
            com.badlogic.gdx.graphics.Texture r1 = r0.mSpriteMaskTextureRef
            com.badlogic.gdx.graphics.Texture$TextureFilter r2 = com.badlogic.gdx.graphics.Texture.TextureFilter.Linear
            r1.setFilter(r2, r2)
            int r1 = r0.mMaskState
            r13 = 4
            r14 = 1
            r10 = 5
            if (r1 == r14) goto L111
            if (r1 == r13) goto L111
            if (r1 != r10) goto L10f
            goto L111
        L10f:
            r13 = 5
            goto L131
        L111:
            com.badlogic.gdx.graphics.Texture r2 = r0.mSpriteMaskTextureRef
            float r3 = r19.getX()
            float r1 = r19.getY()
            float r1 = r1 + r16
            float r4 = r1 - r12
            r7 = 0
            r8 = 1056964608(0x3f000000, float:0.5)
            r9 = 1056964608(0x3f000000, float:0.5)
            r18 = 0
            r1 = r20
            r5 = r17
            r6 = r12
            r13 = 5
            r10 = r18
            r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L131:
            int r1 = r0.mMaskState
            r10 = 2
            if (r1 == r14) goto L13a
            if (r1 == r10) goto L13a
            if (r1 != r13) goto L15b
        L13a:
            com.badlogic.gdx.graphics.Texture r2 = r0.mSpriteMaskTextureRef
            float r1 = r19.getX()
            float r1 = r1 + r15
            float r3 = r1 - r17
            float r1 = r19.getY()
            float r1 = r1 + r16
            float r4 = r1 - r12
            r7 = 1056964608(0x3f000000, float:0.5)
            r8 = 1056964608(0x3f000000, float:0.5)
            r9 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            r1 = r20
            r5 = r17
            r6 = r12
            r10 = r14
            r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L15b:
            int r1 = r0.mMaskState
            r14 = 3
            if (r1 == r14) goto L165
            r2 = 4
            if (r1 == r2) goto L165
            if (r1 != r13) goto L17e
        L165:
            com.badlogic.gdx.graphics.Texture r2 = r0.mSpriteMaskTextureRef
            float r3 = r19.getX()
            float r4 = r19.getY()
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 1056964608(0x3f000000, float:0.5)
            r10 = 1056964608(0x3f000000, float:0.5)
            r1 = r20
            r5 = r17
            r6 = r12
            r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L17e:
            int r1 = r0.mMaskState
            if (r1 == r14) goto L187
            r2 = 2
            if (r1 == r2) goto L187
            if (r1 != r13) goto L1a4
        L187:
            com.badlogic.gdx.graphics.Texture r2 = r0.mSpriteMaskTextureRef
            float r1 = r19.getX()
            float r1 = r1 + r15
            float r3 = r1 - r17
            float r4 = r19.getY()
            r7 = 1056964608(0x3f000000, float:0.5)
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 1056964608(0x3f000000, float:0.5)
            r1 = r20
            r5 = r17
            r6 = r12
            r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L1a4:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinHeight() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinWidth() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
            r1 = this;
            float r0 = r1.getHeight()
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
            r1 = this;
            float r0 = r1.getWidth()
            return r0
    }

    public void setBackgroundColor(com.badlogic.gdx.graphics.Color r2) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.mBackgroundColor
            r0.set(r2)
            return
    }

    public void setIsTransparent(boolean r1) {
            r0 = this;
            r0.mIsTransparent = r1
            return
    }

    public void setMaskState(int r1) {
            r0 = this;
            r0.mMaskState = r1
            return
    }

    public void setTexture(com.badlogic.gdx.graphics.Texture r2) {
            r1 = this;
            r1.mTextureRef = r2
            com.badlogic.gdx.graphics.Texture$TextureFilter r0 = com.badlogic.gdx.graphics.Texture.TextureFilter.Linear
            r2.setFilter(r0, r0)
            r1.invalidate()
            return
    }

    public void setUVs(float r2, float r3, float r4, float r5) {
            r1 = this;
            com.badlogic.gdx.math.Rectangle r0 = r1.mUVs
            r0.set(r2, r3, r4, r5)
            r1.computeSize()
            return
    }
}
