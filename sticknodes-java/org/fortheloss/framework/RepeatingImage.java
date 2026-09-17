package org.fortheloss.framework;

/* loaded from: classes2.dex */
public class RepeatingImage extends com.badlogic.gdx.scenes.scene2d.ui.Widget {
    private int align;
    private com.badlogic.gdx.scenes.scene2d.utils.Drawable drawable;
    private float drawableHeight;
    private float drawableWidth;
    private float imageHeight;
    private float imageWidth;
    private float imageX;
    private float imageY;
    private com.badlogic.gdx.math.Rectangle mScissors;
    private com.badlogic.gdx.utils.Scaling scaling;
    private boolean scissorsDirty;

    public RepeatingImage(com.badlogic.gdx.graphics.g2d.TextureRegion r4) {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r0 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r0.<init>(r4)
            com.badlogic.gdx.utils.Scaling r1 = com.badlogic.gdx.utils.Scaling.stretch
            r2 = 1
            r3.<init>(r0, r1, r2)
            int r0 = r4.getRegionWidth()
            float r0 = (float) r0
            r3.drawableWidth = r0
            int r4 = r4.getRegionHeight()
            float r4 = (float) r4
            r3.drawableHeight = r4
            return
    }

    public RepeatingImage(com.badlogic.gdx.scenes.scene2d.utils.Drawable r2, com.badlogic.gdx.utils.Scaling r3, int r4) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.align = r0
            r1.scissorsDirty = r0
            r1.setDrawable(r2)
            r1.scaling = r3
            r1.align = r4
            float r2 = r1.getPrefWidth()
            float r3 = r1.getPrefHeight()
            r1.setSize(r2, r3)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r14, float r15) {
            r13 = this;
            r13.validate()
            boolean r0 = r13.scissorsDirty
            if (r0 == 0) goto L3e
            r0 = 0
            r13.scissorsDirty = r0
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r13.getStage()
            if (r0 == 0) goto L3e
            com.badlogic.gdx.math.Rectangle r0 = new com.badlogic.gdx.math.Rectangle
            float r1 = r13.getX()
            float r2 = r13.getY()
            float r3 = r13.getWidth()
            float r4 = r13.getHeight()
            r0.<init>(r1, r2, r3, r4)
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r13.getStage()
            com.badlogic.gdx.graphics.Camera r1 = r1.getCamera()
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r13.getStage()
            com.badlogic.gdx.graphics.g2d.Batch r2 = r2.getBatch()
            com.badlogic.gdx.math.Matrix4 r2 = r2.getTransformMatrix()
            com.badlogic.gdx.math.Rectangle r3 = r13.mScissors
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.calculateScissors(r1, r2, r0, r3)
        L3e:
            com.badlogic.gdx.graphics.Color r0 = r13.getColor()
            float r1 = r0.r
            float r2 = r0.g
            float r3 = r0.b
            float r0 = r0.a
            float r0 = r0 * r15
            r14.setColor(r1, r2, r3, r0)
            float r15 = r13.getX()
            float r0 = r13.getY()
            float r9 = r13.getScaleX()
            float r10 = r13.getScaleY()
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r13.drawable
            boolean r1 = r1 instanceof com.badlogic.gdx.scenes.scene2d.utils.TransformDrawable
            r2 = 0
            if (r1 == 0) goto L9d
            float r11 = r13.getRotation()
            r1 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 != 0) goto L78
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 != 0) goto L78
            int r1 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r1 == 0) goto L9d
        L78:
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r13.drawable
            com.badlogic.gdx.scenes.scene2d.utils.TransformDrawable r1 = (com.badlogic.gdx.scenes.scene2d.utils.TransformDrawable) r1
            float r2 = r13.imageX
            float r3 = r15 + r2
            float r15 = r13.imageY
            float r4 = r0 + r15
            float r15 = r13.getOriginX()
            float r0 = r13.imageX
            float r5 = r15 - r0
            float r15 = r13.getOriginY()
            float r0 = r13.imageY
            float r6 = r15 - r0
            float r7 = r13.imageWidth
            float r8 = r13.imageHeight
            r2 = r14
            r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L9d:
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r13.drawable
            if (r1 == 0) goto Lda
            r14.flush()
            com.badlogic.gdx.math.Rectangle r1 = r13.mScissors
            boolean r1 = com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.pushScissors(r1)
            if (r1 == 0) goto Lda
            float r1 = r13.imageWidth
            float r1 = r1 * r9
            float r3 = r13.imageHeight
            float r3 = r3 * r10
            r4 = 0
        Lb5:
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 >= 0) goto Ld4
            r5 = 0
        Lba:
            int r6 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r6 >= 0) goto Ld0
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r7 = r13.drawable
            float r9 = r15 + r4
            float r10 = r0 + r5
            float r11 = r13.drawableWidth
            float r12 = r13.drawableHeight
            r8 = r14
            r7.draw(r8, r9, r10, r11, r12)
            float r6 = r13.drawableHeight
            float r5 = r5 + r6
            goto Lba
        Ld0:
            float r5 = r13.drawableWidth
            float r4 = r4 + r5
            goto Lb5
        Ld4:
            r14.flush()
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.popScissors()
        Lda:
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
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r1.drawable
            if (r0 == 0) goto L9
            float r0 = r0.getMinHeight()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r1.drawable
            if (r0 == 0) goto L9
            float r0 = r0.getMinWidth()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget
    public void layout() {
            r8 = this;
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r8.drawable
            if (r0 != 0) goto L5
            return
        L5:
            float r0 = r0.getMinWidth()
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r8.drawable
            float r1 = r1.getMinHeight()
            float r2 = r8.getWidth()
            float r3 = r8.getHeight()
            com.badlogic.gdx.utils.Scaling r4 = r8.scaling
            com.badlogic.gdx.math.Vector2 r0 = r4.apply(r0, r1, r2, r3)
            float r1 = r0.x
            r8.imageWidth = r1
            float r0 = r0.y
            r8.imageHeight = r0
            int r4 = r8.align
            r5 = r4 & 8
            r6 = 0
            r7 = 1073741824(0x40000000, float:2.0)
            if (r5 == 0) goto L31
            r8.imageX = r6
            goto L42
        L31:
            r5 = r4 & 16
            if (r5 == 0) goto L3b
            float r2 = r2 - r1
            int r1 = (int) r2
            float r1 = (float) r1
            r8.imageX = r1
            goto L42
        L3b:
            float r2 = r2 / r7
            float r1 = r1 / r7
            float r2 = r2 - r1
            int r1 = (int) r2
            float r1 = (float) r1
            r8.imageX = r1
        L42:
            r1 = r4 & 2
            if (r1 == 0) goto L4c
            float r3 = r3 - r0
            int r0 = (int) r3
            float r0 = (float) r0
            r8.imageY = r0
            goto L5a
        L4c:
            r1 = r4 & 4
            if (r1 == 0) goto L53
            r8.imageY = r6
            goto L5a
        L53:
            float r3 = r3 / r7
            float r0 = r0 / r7
            float r3 = r3 - r0
            int r0 = (int) r3
            float r0 = (float) r0
            r8.imageY = r0
        L5a:
            com.badlogic.gdx.math.Rectangle r0 = r8.mScissors
            if (r0 != 0) goto L65
            com.badlogic.gdx.math.Rectangle r0 = new com.badlogic.gdx.math.Rectangle
            r0.<init>()
            r8.mScissors = r0
        L65:
            r0 = 1
            r8.scissorsDirty = r0
            return
    }

    public void setAlign(int r1) {
            r0 = this;
            r0.align = r1
            r0.invalidate()
            return
    }

    public void setDrawable(com.badlogic.gdx.scenes.scene2d.utils.Drawable r3) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r2.drawable
            if (r0 != r3) goto L5
            return
        L5:
            if (r3 == 0) goto L23
            float r0 = r2.getPrefWidth()
            float r1 = r3.getMinWidth()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1f
            float r0 = r2.getPrefHeight()
            float r1 = r3.getMinHeight()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L26
        L1f:
            r2.invalidateHierarchy()
            goto L26
        L23:
            r2.invalidateHierarchy()
        L26:
            r2.drawable = r3
            return
    }

    public void setScaling(com.badlogic.gdx.utils.Scaling r2) {
            r1 = this;
            if (r2 == 0) goto L8
            r1.scaling = r2
            r1.invalidate()
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "scaling cannot be null."
            r2.<init>(r0)
            throw r2
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = r4.getName()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            r2 = -1
            if (r1 == r2) goto L1e
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L1e:
            r1 = 36
            int r1 = r0.indexOf(r1)
            if (r1 == r2) goto L29
            java.lang.String r1 = "Image "
            goto L2b
        L29:
            java.lang.String r1 = ""
        L2b:
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r4.drawable
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = ": "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            return r0
    }
}
