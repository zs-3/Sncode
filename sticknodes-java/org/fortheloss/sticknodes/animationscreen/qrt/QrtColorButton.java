package org.fortheloss.sticknodes.animationscreen.qrt;

/* loaded from: classes2.dex */
public class QrtColorButton extends com.badlogic.gdx.scenes.scene2d.ui.Widget implements com.badlogic.gdx.utils.Disposable {
    private org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked mDock;
    private short mDragState;
    private boolean mIsChecked;
    private boolean mIsPressed;
    private boolean mIsToggleable;
    private boolean mJustCenterToggle;
    private org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton.QrtColorButtonStyle mStyle;
    private com.badlogic.gdx.graphics.Color mSwabColor;


    public static class QrtColorButtonStyle {
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable bg;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable checked;
        public com.badlogic.gdx.graphics.g2d.TextureRegion swab;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable unchecked;

        public QrtColorButtonStyle(com.badlogic.gdx.scenes.scene2d.utils.Drawable r1, com.badlogic.gdx.scenes.scene2d.utils.Drawable r2, com.badlogic.gdx.scenes.scene2d.utils.Drawable r3, com.badlogic.gdx.graphics.g2d.TextureRegion r4) {
                r0 = this;
                r0.<init>()
                r0.swab = r4
                r0.bg = r1
                r0.checked = r2
                r0.unchecked = r3
                return
        }
    }

    /* renamed from: -$$Nest$fputmIsPressed, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1261$$Nest$fputmIsPressed(org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r0, boolean r1) {
            r0.mIsPressed = r1
            return
    }

    public QrtColorButton(org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton.QrtColorButtonStyle r2, org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public QrtColorButton(org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton.QrtColorButtonStyle r3, org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r4, boolean r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mDragState = r0
            r2.mIsPressed = r0
            r2.mIsChecked = r0
            r1 = 1
            r2.mIsToggleable = r1
            r2.mJustCenterToggle = r0
            r2.mDock = r4
            r2.mStyle = r3
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r4 = r3.bg
            float r4 = r4.getMinWidth()
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r3 = r3.bg
            float r3 = r3.getMinHeight()
            r2.setSize(r4, r3)
            com.badlogic.gdx.graphics.Color r3 = new com.badlogic.gdx.graphics.Color
            r4 = 0
            r0 = 1058642330(0x3f19999a, float:0.6)
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r4, r0, r1, r1)
            r2.mSwabColor = r3
            com.badlogic.gdx.scenes.scene2d.Touchable r3 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r2.setTouchable(r3)
            r2.mJustCenterToggle = r5
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$1 r3 = new org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$1
            r3.<init>(r2)
            r2.addListener(r3)
            return
    }

    private void showColorMap() {
            r7 = this;
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r7.mDock
            org.fortheloss.framework.ColorPicker r0 = r0.getColorPicker(r7)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r7.mDock
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r1.getStage()
            java.lang.Class<com.badlogic.gdx.math.Vector2> r2 = com.badlogic.gdx.math.Vector2.class
            java.lang.Object r2 = com.badlogic.gdx.utils.Pools.obtain(r2)
            com.badlogic.gdx.math.Vector2 r2 = (com.badlogic.gdx.math.Vector2) r2
            float r3 = r7.getX()
            float r4 = r7.getY()
            float r5 = r7.getHeight()
            float r4 = r4 + r5
            r2.set(r3, r4)
            com.badlogic.gdx.scenes.scene2d.Group r3 = r7.getParent()
            r3.localToStageCoordinates(r2)
            float r3 = r2.x
            float r4 = r0.getTotalWidth()
            float r3 = r3 + r4
            float r4 = r1.getWidth()
            r5 = 1109393408(0x42200000, float:40.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L4d
            float r3 = r1.getWidth()
            float r4 = r0.getTotalWidth()
            float r3 = r3 - r4
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r5
            float r3 = r3 - r4
            r2.x = r3
            goto L5b
        L4d:
            float r3 = r2.x
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r4 * r5
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 >= 0) goto L5b
            float r4 = r4 * r5
            r2.x = r4
        L5b:
            com.badlogic.gdx.graphics.Color r3 = r7.mSwabColor
            r0.setColor(r3)
            float r3 = r2.x
            float r4 = r2.y
            r0.showColorMap(r3, r4, r1)
            com.badlogic.gdx.utils.Pools.free(r2)
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.mDock = r0
            r1.mStyle = r0
            r1.mSwabColor = r0
            r1.clear()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r12, float r13) {
            r11 = this;
            super.draw(r12, r13)
            com.badlogic.gdx.graphics.Color r6 = r11.getColor()
            float r0 = r6.r
            float r1 = r6.g
            float r2 = r6.b
            float r3 = r6.a
            float r3 = r3 * r13
            r12.setColor(r0, r1, r2, r3)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r0 = r11.mStyle
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.bg
            float r2 = r11.getX()
            float r3 = r11.getY()
            float r4 = r11.getWidth()
            float r5 = r11.getHeight()
            r1 = r12
            r0.draw(r1, r2, r3, r4, r5)
            float r0 = r6.r
            float r1 = r6.g
            float r2 = r6.b
            float r3 = r6.a
            float r3 = r3 * r13
            boolean r4 = r11.mIsToggleable
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 1056964608(0x3f000000, float:0.5)
            if (r4 == 0) goto L41
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L43
        L41:
            r4 = 1056964608(0x3f000000, float:0.5)
        L43:
            float r3 = r3 * r4
            r12.setColor(r0, r1, r2, r3)
            boolean r0 = r11.mJustCenterToggle
            r9 = 1097859072(0x41700000, float:15.0)
            if (r0 == 0) goto L9c
            float r0 = r6.r
            float r1 = r6.g
            float r2 = r6.b
            float r3 = r6.a
            float r3 = r3 * r13
            r12.setColor(r0, r1, r2, r3)
            boolean r0 = r11.mIsChecked
            if (r0 == 0) goto L64
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r0 = r11.mStyle
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.checked
            goto L68
        L64:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r0 = r11.mStyle
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.unchecked
        L68:
            float r1 = r11.getX()
            float r2 = r11.getWidth()
            float r2 = r2 * r8
            float r1 = r1 + r2
            float r2 = r0.getMinWidth()
            float r2 = r2 * r8
            float r2 = r1 - r2
            float r1 = r11.getY()
            r3 = 1112014848(0x42480000, float:50.0)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r3
            float r1 = r1 + r4
            float r3 = r0.getMinHeight()
            float r3 = r3 * r8
            float r3 = r1 - r3
            float r4 = r0.getMinWidth()
            float r5 = r0.getMinHeight()
            r1 = r12
            r0.draw(r1, r2, r3, r4, r5)
            goto L113
        L9c:
            boolean r0 = r11.mIsPressed
            if (r0 == 0) goto Lab
            boolean r0 = r11.mIsToggleable
            if (r0 == 0) goto Lab
            r0 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r0
            goto Lac
        Lab:
            r1 = 0
        Lac:
            boolean r0 = r11.mIsChecked
            r2 = 1104150528(0x41d00000, float:26.0)
            if (r0 == 0) goto Le2
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r0 = r11.mStyle
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.checked
            float r3 = r11.getX()
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r9
            float r3 = r3 + r4
            float r4 = r11.getY()
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r2
            float r4 = r4 + r5
            float r4 = r4 + r1
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r1 = r11.mStyle
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.checked
            float r5 = r1.getMinWidth()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r1 = r11.mStyle
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.checked
            float r10 = r1.getMinHeight()
            r1 = r12
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r10
            r0.draw(r1, r2, r3, r4, r5)
            goto L113
        Le2:
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r0 = r11.mStyle
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.unchecked
            float r3 = r11.getX()
            r4 = 1093664768(0x41300000, float:11.0)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r4
            float r3 = r3 + r5
            float r4 = r11.getY()
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r2
            float r4 = r4 + r5
            float r4 = r4 + r1
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r1 = r11.mStyle
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.unchecked
            float r5 = r1.getMinWidth()
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r1 = r11.mStyle
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.unchecked
            float r10 = r1.getMinHeight()
            r1 = r12
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r10
            r0.draw(r1, r2, r3, r4, r5)
        L113:
            com.badlogic.gdx.graphics.Color r0 = r11.mSwabColor
            float r1 = r0.r
            float r2 = r6.r
            float r1 = r1 * r2
            float r2 = r0.g
            float r3 = r6.g
            float r2 = r2 * r3
            float r3 = r0.b
            float r4 = r6.b
            float r3 = r3 * r4
            float r0 = r0.a
            float r4 = r6.a
            float r0 = r0 * r4
            float r0 = r0 * r13
            boolean r4 = r11.mIsChecked
            if (r4 == 0) goto L134
            goto L136
        L134:
            r7 = 1056964608(0x3f000000, float:0.5)
        L136:
            float r0 = r0 * r7
            r12.setColor(r1, r2, r3, r0)
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r0 = r11.mStyle
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r0.swab
            float r0 = r11.getX()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r9
            float r2 = r2 + r0
            float r0 = r11.getY()
            r3 = 1119354880(0x42b80000, float:92.0)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r3
            float r3 = r0 + r4
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r0 = r11.mStyle
            com.badlogic.gdx.graphics.g2d.TextureRegion r0 = r0.swab
            int r0 = r0.getRegionWidth()
            float r4 = (float) r0
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton$QrtColorButtonStyle r0 = r11.mStyle
            com.badlogic.gdx.graphics.g2d.TextureRegion r0 = r0.swab
            int r0 = r0.getRegionHeight()
            float r5 = (float) r0
            r0 = r12
            r0.draw(r1, r2, r3, r4, r5)
            return
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

    public void onClick(float r2, float r3) {
            r1 = this;
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r0
            r0 = 2
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 < 0) goto L16
            boolean r2 = r1.mIsChecked
            if (r2 == 0) goto L24
            r1.showColorMap()
            org.fortheloss.sticknodes.App.vibrate(r0)
            goto L24
        L16:
            boolean r2 = r1.mIsToggleable
            if (r2 == 0) goto L24
            short r2 = r1.mDragState
            if (r2 == r0) goto L24
            r1.onToggleClick()
            org.fortheloss.sticknodes.App.vibrate(r0)
        L24:
            return
    }

    protected void onColorChanged(com.badlogic.gdx.graphics.Color r2) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.mSwabColor
            r0.set(r2)
            return
    }

    protected void onToggleClick() {
            r0 = this;
            return
    }

    public void onTouchDown(float r2, float r3) {
            r1 = this;
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r0
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 < 0) goto L12
            boolean r2 = r1.mIsChecked
            if (r2 != 0) goto Lf
            goto L12
        Lf:
            r2 = 1
            r1.mDragState = r2
        L12:
            return
    }

    public void onTouchDragged(float r8, float r9) {
            r7 = this;
            short r0 = r7.mDragState
            if (r0 != 0) goto L5
            return
        L5:
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r0 = r7.mDock
            org.fortheloss.framework.ColorPicker r0 = r0.getColorPicker(r7)
            short r1 = r7.mDragState
            r2 = 1
            if (r1 != r2) goto L2d
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = r0.getEyedropperRing()
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r3 = r7.mDock
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r3.getStage()
            r0.refreshScreenPixmap(r3)
            r1.setVisible(r2)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r3 = r7.mDock
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r3.getStage()
            r3.addActor(r1)
            r1 = 3
            org.fortheloss.sticknodes.App.vibrate(r1)
        L2d:
            r1 = 1128792064(0x43480000, float:200.0)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r1
            int r1 = (int) r3
            float r3 = r7.getX()
            float r3 = r3 + r8
            int r8 = (int) r3
            float r3 = r7.getY()
            float r3 = r3 + r9
            int r9 = (int) r3
            java.lang.Class<com.badlogic.gdx.math.Vector2> r3 = com.badlogic.gdx.math.Vector2.class
            java.lang.Object r3 = com.badlogic.gdx.utils.Pools.obtain(r3)
            com.badlogic.gdx.math.Vector2 r3 = (com.badlogic.gdx.math.Vector2) r3
            float r4 = (float) r8
            float r5 = (float) r9
            r3.set(r4, r5)
            com.badlogic.gdx.scenes.scene2d.Group r4 = r7.getParent()
            r4.localToStageCoordinates(r3)
            float r4 = r3.x
            float r5 = r3.y
            com.badlogic.gdx.utils.Pools.free(r3)
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r3 = r7.mDock
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r3.getStage()
            float r6 = (float) r1
            float r5 = r5 + r6
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r3.hit(r4, r5, r2)
            boolean r3 = r2 instanceof org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton
            r4 = 2
            if (r3 == 0) goto L7d
            org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton r2 = (org.fortheloss.sticknodes.animationscreen.qrt.QrtColorButton) r2
            r7.mDragState = r4
            int r9 = r9 + r1
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r7.mDock
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r1.getStage()
            com.badlogic.gdx.graphics.Color r2 = r2.mSwabColor
            r0.updateColorRing(r8, r9, r1, r2)
            goto L89
        L7d:
            r7.mDragState = r4
            int r9 = r9 + r1
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r1 = r7.mDock
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r1.getStage()
            r0.updateColorRing(r8, r9, r1)
        L89:
            return
    }

    public void onTouchUp(float r3, float r4) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r3 = r2.mDock
            org.fortheloss.framework.ColorPicker r3 = r3.getColorPicker(r2)
            short r4 = r2.mDragState
            r0 = 0
            r1 = 2
            if (r4 != r1) goto L26
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = r3.getEyedropperRing()
            com.badlogic.gdx.graphics.Color r4 = r4.getColor()
            r1 = 1
            r3.setColor(r4, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = r3.getEyedropperRing()
            r4.setVisible(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = r3.getEyedropperRing()
            r3.remove()
        L26:
            r2.mDragState = r0
            return
    }

    public void setChecked(boolean r1) {
            r0 = this;
            r0.mIsChecked = r1
            return
    }

    public void setProperties(com.badlogic.gdx.graphics.Color r2, boolean r3) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.mSwabColor
            r0.set(r2)
            r1.mIsChecked = r3
            return
    }

    public void setToggleable(boolean r1) {
            r0 = this;
            r0.mIsToggleable = r1
            return
    }
}
