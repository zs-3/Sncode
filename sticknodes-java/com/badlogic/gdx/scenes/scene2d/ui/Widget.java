package com.badlogic.gdx.scenes.scene2d.ui;

/* loaded from: classes.dex */
public class Widget extends com.badlogic.gdx.scenes.scene2d.Actor implements com.badlogic.gdx.scenes.scene2d.utils.Layout {
    private boolean fillParent;
    private boolean layoutEnabled;
    private boolean needsLayout;

    public Widget() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.needsLayout = r0
            r1.layoutEnabled = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r1, float r2) {
            r0 = this;
            r0.validate()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMaxHeight() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMaxWidth() {
            r1 = this;
            r0 = 0
            return r0
    }

    public float getMinHeight() {
            r1 = this;
            float r0 = r1.getPrefHeight()
            return r0
    }

    public float getMinWidth() {
            r1 = this;
            float r0 = r1.getPrefWidth()
            return r0
    }

    public float getPrefHeight() {
            r1 = this;
            r0 = 0
            return r0
    }

    public float getPrefWidth() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void invalidate() {
            r1 = this;
            r0 = 1
            r1.needsLayout = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Layout
    public void invalidateHierarchy() {
            r2 = this;
            boolean r0 = r2.layoutEnabled
            if (r0 != 0) goto L5
            return
        L5:
            r2.invalidate()
            com.badlogic.gdx.scenes.scene2d.Group r0 = r2.getParent()
            boolean r1 = r0 instanceof com.badlogic.gdx.scenes.scene2d.utils.Layout
            if (r1 == 0) goto L15
            com.badlogic.gdx.scenes.scene2d.utils.Layout r0 = (com.badlogic.gdx.scenes.scene2d.utils.Layout) r0
            r0.invalidateHierarchy()
        L15:
            return
    }

    public void layout() {
            r0 = this;
            return
    }

    public void setLayoutEnabled(boolean r1) {
            r0 = this;
            r0.layoutEnabled = r1
            if (r1 == 0) goto L7
            r0.invalidateHierarchy()
        L7:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    protected void sizeChanged() {
            r0 = this;
            r0.invalidate()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Layout
    public void validate() {
            r4 = this;
            boolean r0 = r4.layoutEnabled
            if (r0 != 0) goto L5
            return
        L5:
            com.badlogic.gdx.scenes.scene2d.Group r0 = r4.getParent()
            boolean r1 = r4.fillParent
            if (r1 == 0) goto L32
            if (r0 == 0) goto L32
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r4.getStage()
            if (r1 == 0) goto L24
            com.badlogic.gdx.scenes.scene2d.Group r2 = r1.getRoot()
            if (r0 != r2) goto L24
            float r0 = r1.getWidth()
            float r1 = r1.getHeight()
            goto L2f
        L24:
            float r1 = r0.getWidth()
            float r0 = r0.getHeight()
            r3 = r1
            r1 = r0
            r0 = r3
        L2f:
            r4.setSize(r0, r1)
        L32:
            boolean r0 = r4.needsLayout
            if (r0 != 0) goto L37
            return
        L37:
            r0 = 0
            r4.needsLayout = r0
            r4.layout()
            return
    }
}
