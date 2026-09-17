package com.badlogic.gdx.scenes.scene2d.ui;

/* loaded from: classes.dex */
public class Stack extends com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup {
    private float maxHeight;
    private float maxWidth;
    private float minHeight;
    private float minWidth;
    private float prefHeight;
    private float prefWidth;
    private boolean sizeInvalid;

    public Stack() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.sizeInvalid = r0
            r0 = 0
            r1.setTransform(r0)
            r0 = 1125515264(0x43160000, float:150.0)
            r1.setWidth(r0)
            r1.setHeight(r0)
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r1.setTouchable(r0)
            return
    }

    public Stack(com.badlogic.gdx.scenes.scene2d.Actor... r4) {
            r3 = this;
            r3.<init>()
            int r0 = r4.length
            r1 = 0
        L5:
            if (r1 >= r0) goto Lf
            r2 = r4[r1]
            r3.addActor(r2)
            int r1 = r1 + 1
            goto L5
        Lf:
            return
    }

    private void computeSize() {
            r8 = this;
            r0 = 0
            r8.sizeInvalid = r0
            r1 = 0
            r8.prefWidth = r1
            r8.prefHeight = r1
            r8.minWidth = r1
            r8.minHeight = r1
            r8.maxWidth = r1
            r8.maxHeight = r1
            com.badlogic.gdx.utils.SnapshotArray r2 = r8.getChildren()
            int r3 = r2.size
        L16:
            if (r0 >= r3) goto Lb5
            java.lang.Object r4 = r2.get(r0)
            com.badlogic.gdx.scenes.scene2d.Actor r4 = (com.badlogic.gdx.scenes.scene2d.Actor) r4
            boolean r5 = r4 instanceof com.badlogic.gdx.scenes.scene2d.utils.Layout
            if (r5 == 0) goto L5d
            com.badlogic.gdx.scenes.scene2d.utils.Layout r4 = (com.badlogic.gdx.scenes.scene2d.utils.Layout) r4
            float r5 = r8.prefWidth
            float r6 = r4.getPrefWidth()
            float r5 = java.lang.Math.max(r5, r6)
            r8.prefWidth = r5
            float r5 = r8.prefHeight
            float r6 = r4.getPrefHeight()
            float r5 = java.lang.Math.max(r5, r6)
            r8.prefHeight = r5
            float r5 = r8.minWidth
            float r6 = r4.getMinWidth()
            float r5 = java.lang.Math.max(r5, r6)
            r8.minWidth = r5
            float r5 = r8.minHeight
            float r6 = r4.getMinHeight()
            float r5 = java.lang.Math.max(r5, r6)
            r8.minHeight = r5
            float r5 = r4.getMaxWidth()
            float r4 = r4.getMaxHeight()
            goto L8f
        L5d:
            float r5 = r8.prefWidth
            float r6 = r4.getWidth()
            float r5 = java.lang.Math.max(r5, r6)
            r8.prefWidth = r5
            float r5 = r8.prefHeight
            float r6 = r4.getHeight()
            float r5 = java.lang.Math.max(r5, r6)
            r8.prefHeight = r5
            float r5 = r8.minWidth
            float r6 = r4.getWidth()
            float r5 = java.lang.Math.max(r5, r6)
            r8.minWidth = r5
            float r5 = r8.minHeight
            float r4 = r4.getHeight()
            float r4 = java.lang.Math.max(r5, r4)
            r8.minHeight = r4
            r4 = 0
            r5 = 0
        L8f:
            int r6 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r6 <= 0) goto La0
            float r6 = r8.maxWidth
            int r7 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r7 != 0) goto L9a
            goto L9e
        L9a:
            float r5 = java.lang.Math.min(r6, r5)
        L9e:
            r8.maxWidth = r5
        La0:
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 <= 0) goto Lb1
            float r5 = r8.maxHeight
            int r6 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r6 != 0) goto Lab
            goto Laf
        Lab:
            float r4 = java.lang.Math.min(r5, r4)
        Laf:
            r8.maxHeight = r4
        Lb1:
            int r0 = r0 + 1
            goto L16
        Lb5:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMaxHeight() {
            r1 = this;
            boolean r0 = r1.sizeInvalid
            if (r0 == 0) goto L7
            r1.computeSize()
        L7:
            float r0 = r1.maxHeight
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMaxWidth() {
            r1 = this;
            boolean r0 = r1.sizeInvalid
            if (r0 == 0) goto L7
            r1.computeSize()
        L7:
            float r0 = r1.maxWidth
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinHeight() {
            r1 = this;
            boolean r0 = r1.sizeInvalid
            if (r0 == 0) goto L7
            r1.computeSize()
        L7:
            float r0 = r1.minHeight
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinWidth() {
            r1 = this;
            boolean r0 = r1.sizeInvalid
            if (r0 == 0) goto L7
            r1.computeSize()
        L7:
            float r0 = r1.minWidth
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
            r1 = this;
            boolean r0 = r1.sizeInvalid
            if (r0 == 0) goto L7
            r1.computeSize()
        L7:
            float r0 = r1.prefHeight
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
            r1 = this;
            boolean r0 = r1.sizeInvalid
            if (r0 == 0) goto L7
            r1.computeSize()
        L7:
            float r0 = r1.prefWidth
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup
    public void invalidate() {
            r1 = this;
            super.invalidate()
            r0 = 1
            r1.sizeInvalid = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup
    public void layout() {
            r7 = this;
            boolean r0 = r7.sizeInvalid
            if (r0 == 0) goto L7
            r7.computeSize()
        L7:
            float r0 = r7.getWidth()
            float r1 = r7.getHeight()
            com.badlogic.gdx.utils.SnapshotArray r2 = r7.getChildren()
            r3 = 0
            int r4 = r2.size
        L16:
            if (r3 >= r4) goto L2e
            java.lang.Object r5 = r2.get(r3)
            com.badlogic.gdx.scenes.scene2d.Actor r5 = (com.badlogic.gdx.scenes.scene2d.Actor) r5
            r6 = 0
            r5.setBounds(r6, r6, r0, r1)
            boolean r6 = r5 instanceof com.badlogic.gdx.scenes.scene2d.utils.Layout
            if (r6 == 0) goto L2b
            com.badlogic.gdx.scenes.scene2d.utils.Layout r5 = (com.badlogic.gdx.scenes.scene2d.utils.Layout) r5
            r5.validate()
        L2b:
            int r3 = r3 + 1
            goto L16
        L2e:
            return
    }
}
