package com.badlogic.gdx.scenes.scene2d.ui;

/* loaded from: classes.dex */
public class WidgetGroup extends com.badlogic.gdx.scenes.scene2d.Group implements com.badlogic.gdx.scenes.scene2d.utils.Layout {
    private boolean fillParent;
    private boolean layoutEnabled;
    private boolean needsLayout;

    public WidgetGroup() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.needsLayout = r0
            r1.layoutEnabled = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    protected void childrenChanged() {
            r0 = this;
            r0.invalidateHierarchy()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r1, float r2) {
            r0 = this;
            r0.validate()
            super.draw(r1, r2)
            return
    }

    public float getMaxHeight() {
            r1 = this;
            r0 = 0
            return r0
    }

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
            r0 = this;
            r0 = 0
            throw r0
    }

    public float getPrefWidth() {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public com.badlogic.gdx.scenes.scene2d.Actor hit(float r1, float r2, boolean r3) {
            r0 = this;
            r0.validate()
            com.badlogic.gdx.scenes.scene2d.Actor r1 = super.hit(r1, r2, r3)
            return r1
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
            r2.invalidate()
            com.badlogic.gdx.scenes.scene2d.Group r0 = r2.getParent()
            boolean r1 = r0 instanceof com.badlogic.gdx.scenes.scene2d.utils.Layout
            if (r1 == 0) goto L10
            com.badlogic.gdx.scenes.scene2d.utils.Layout r0 = (com.badlogic.gdx.scenes.scene2d.utils.Layout) r0
            r0.invalidateHierarchy()
        L10:
            return
    }

    public void layout() {
            r0 = this;
            return
    }

    public void pack() {
            r2 = this;
            float r0 = r2.getPrefWidth()
            float r1 = r2.getPrefHeight()
            r2.setSize(r0, r1)
            r2.validate()
            float r0 = r2.getPrefWidth()
            float r1 = r2.getPrefHeight()
            r2.setSize(r0, r1)
            r2.validate()
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
            r3 = this;
            boolean r0 = r3.layoutEnabled
            if (r0 != 0) goto L5
            return
        L5:
            com.badlogic.gdx.scenes.scene2d.Group r0 = r3.getParent()
            boolean r1 = r3.fillParent
            if (r1 == 0) goto L32
            if (r0 == 0) goto L32
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r3.getStage()
            if (r1 == 0) goto L27
            com.badlogic.gdx.scenes.scene2d.Group r2 = r1.getRoot()
            if (r0 != r2) goto L27
            float r2 = r1.getWidth()
            float r1 = r1.getHeight()
            r3.setSize(r2, r1)
            goto L32
        L27:
            float r1 = r0.getWidth()
            float r2 = r0.getHeight()
            r3.setSize(r1, r2)
        L32:
            boolean r1 = r3.needsLayout
            if (r1 != 0) goto L37
            return
        L37:
            r1 = 0
            r3.needsLayout = r1
            r3.layout()
            boolean r2 = r3.needsLayout
            if (r2 == 0) goto L57
            boolean r0 = r0 instanceof com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup
            if (r0 == 0) goto L46
            return
        L46:
            r0 = 0
        L47:
            r2 = 5
            if (r0 >= r2) goto L57
            r3.needsLayout = r1
            r3.layout()
            boolean r2 = r3.needsLayout
            if (r2 != 0) goto L54
            goto L57
        L54:
            int r0 = r0 + 1
            goto L47
        L57:
            return
    }
}
