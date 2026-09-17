package com.badlogic.gdx.scenes.scene2d.utils;

/* loaded from: classes.dex */
public class BaseDrawable implements com.badlogic.gdx.scenes.scene2d.utils.Drawable {
    private float bottomHeight;
    private float leftWidth;
    private float minHeight;
    private float minWidth;
    private java.lang.String name;
    private float rightWidth;
    private float topHeight;

    public BaseDrawable() {
            r0 = this;
            r0.<init>()
            return
    }

    public BaseDrawable(com.badlogic.gdx.scenes.scene2d.utils.Drawable r2) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2 instanceof com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable
            if (r0 == 0) goto L10
            r0 = r2
            com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable r0 = (com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable) r0
            java.lang.String r0 = r0.getName()
            r1.name = r0
        L10:
            float r0 = r2.getLeftWidth()
            r1.leftWidth = r0
            float r0 = r2.getRightWidth()
            r1.rightWidth = r0
            float r0 = r2.getTopHeight()
            r1.topHeight = r0
            float r0 = r2.getBottomHeight()
            r1.bottomHeight = r0
            float r0 = r2.getMinWidth()
            r1.minWidth = r0
            float r2 = r2.getMinHeight()
            r1.minHeight = r2
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r1, float r2, float r3, float r4, float r5) {
            r0 = this;
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public float getBottomHeight() {
            r1 = this;
            float r0 = r1.bottomHeight
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public float getLeftWidth() {
            r1 = this;
            float r0 = r1.leftWidth
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public float getMinHeight() {
            r1 = this;
            float r0 = r1.minHeight
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public float getMinWidth() {
            r1 = this;
            float r0 = r1.minWidth
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public float getRightWidth() {
            r1 = this;
            float r0 = r1.rightWidth
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public float getTopHeight() {
            r1 = this;
            float r0 = r1.topHeight
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public void setBottomHeight(float r1) {
            r0 = this;
            r0.bottomHeight = r1
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public void setLeftWidth(float r1) {
            r0 = this;
            r0.leftWidth = r1
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public void setMinHeight(float r1) {
            r0 = this;
            r0.minHeight = r1
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public void setMinWidth(float r1) {
            r0 = this;
            r0.minWidth = r1
            return
    }

    public void setName(java.lang.String r1) {
            r0 = this;
            r0.name = r1
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public void setRightWidth(float r1) {
            r0 = this;
            r0.rightWidth = r1
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public void setTopHeight(float r1) {
            r0 = this;
            r0.topHeight = r1
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.name
            if (r0 != 0) goto Lc
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = com.badlogic.gdx.utils.reflect.ClassReflection.getSimpleName(r0)
        Lc:
            return r0
    }
}
