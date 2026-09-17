package com.badlogic.gdx.scenes.scene2d.ui;

/* loaded from: classes.dex */
public class Image extends com.badlogic.gdx.scenes.scene2d.ui.Widget {
    private int align;
    private com.badlogic.gdx.scenes.scene2d.utils.Drawable drawable;
    private float imageHeight;
    private float imageWidth;
    private float imageX;
    private float imageY;
    private com.badlogic.gdx.utils.Scaling scaling;

    public Image() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public Image(com.badlogic.gdx.graphics.Texture r3) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r0 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            r1.<init>(r3)
            r0.<init>(r1)
            r2.<init>(r0)
            return
    }

    public Image(com.badlogic.gdx.graphics.g2d.TextureRegion r3) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r0 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            r0.<init>(r3)
            com.badlogic.gdx.utils.Scaling r3 = com.badlogic.gdx.utils.Scaling.stretch
            r1 = 1
            r2.<init>(r0, r3, r1)
            return
    }

    public Image(com.badlogic.gdx.scenes.scene2d.utils.Drawable r3) {
            r2 = this;
            com.badlogic.gdx.utils.Scaling r0 = com.badlogic.gdx.utils.Scaling.stretch
            r1 = 1
            r2.<init>(r3, r0, r1)
            return
    }

    public Image(com.badlogic.gdx.scenes.scene2d.utils.Drawable r2, com.badlogic.gdx.utils.Scaling r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    public Image(com.badlogic.gdx.scenes.scene2d.utils.Drawable r2, com.badlogic.gdx.utils.Scaling r3, int r4) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.align = r0
            r1.setDrawable(r2)
            r1.scaling = r3
            r1.align = r4
            float r2 = r1.getPrefWidth()
            float r3 = r1.getPrefHeight()
            r1.setSize(r2, r3)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r17, float r18) {
            r16 = this;
            r0 = r16
            r16.validate()
            com.badlogic.gdx.graphics.Color r1 = r16.getColor()
            float r2 = r1.r
            float r3 = r1.g
            float r4 = r1.b
            float r1 = r1.a
            float r1 = r1 * r18
            r6 = r17
            r6.setColor(r2, r3, r4, r1)
            float r1 = r16.getX()
            float r2 = r16.getY()
            float r13 = r16.getScaleX()
            float r14 = r16.getScaleY()
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r3 = r0.drawable
            boolean r3 = r3 instanceof com.badlogic.gdx.scenes.scene2d.utils.TransformDrawable
            if (r3 == 0) goto L68
            float r15 = r16.getRotation()
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r4 != 0) goto L41
            int r3 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r3 != 0) goto L41
            r3 = 0
            int r3 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r3 == 0) goto L68
        L41:
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r3 = r0.drawable
            r5 = r3
            com.badlogic.gdx.scenes.scene2d.utils.TransformDrawable r5 = (com.badlogic.gdx.scenes.scene2d.utils.TransformDrawable) r5
            float r3 = r0.imageX
            float r7 = r1 + r3
            float r1 = r0.imageY
            float r8 = r2 + r1
            float r1 = r16.getOriginX()
            float r2 = r0.imageX
            float r9 = r1 - r2
            float r1 = r16.getOriginY()
            float r2 = r0.imageY
            float r10 = r1 - r2
            float r11 = r0.imageWidth
            float r12 = r0.imageHeight
            r6 = r17
            r5.draw(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L68:
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = r0.drawable
            if (r5 == 0) goto L81
            float r3 = r0.imageX
            float r7 = r1 + r3
            float r1 = r0.imageY
            float r8 = r2 + r1
            float r1 = r0.imageWidth
            float r9 = r1 * r13
            float r1 = r0.imageHeight
            float r10 = r1 * r14
            r6 = r17
            r5.draw(r6, r7, r8, r9, r10)
        L81:
            return
    }

    public com.badlogic.gdx.scenes.scene2d.utils.Drawable getDrawable() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r1.drawable
            return r0
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
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r3 = 36
            int r3 = r0.indexOf(r3)
            if (r3 == r2) goto L2e
            java.lang.String r2 = "Image "
            goto L30
        L2e:
            java.lang.String r2 = ""
        L30:
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ": "
            r1.append(r0)
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r4.drawable
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
