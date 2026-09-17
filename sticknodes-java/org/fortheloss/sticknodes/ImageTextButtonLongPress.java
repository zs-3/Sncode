package org.fortheloss.sticknodes;

/* loaded from: classes2.dex */
public class ImageTextButtonLongPress extends com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton {
    public static float longPressSeconds = 0.25f;
    private boolean _flagIsPressed;
    private boolean _hasTriggeredLongPress;
    private boolean _longPressEnabled;
    private float _pressSeconds;

    public static class ImageTextButtonLongPressStyle extends com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle {
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable indicator;

        public ImageTextButtonLongPressStyle() {
                r0 = this;
                r0.<init>()
                return
        }

        public ImageTextButtonLongPressStyle(com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle r1, com.badlogic.gdx.scenes.scene2d.utils.Drawable r2) {
                r0 = this;
                r0.<init>(r1)
                r0.indicator = r2
                return
        }
    }

    static {
            return
    }

    public ImageTextButtonLongPress(java.lang.String r5, org.fortheloss.sticknodes.ImageTextButtonLongPress.ImageTextButtonLongPressStyle r6) {
            r4 = this;
            r4.<init>(r5, r6)
            r5 = 0
            r4._pressSeconds = r5
            r6 = 0
            r4._flagIsPressed = r6
            r4._hasTriggeredLongPress = r6
            r6 = 1
            r4._longPressEnabled = r6
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r4.getLabel()
            r1 = 8
            r0.setAlignment(r1, r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r4.getImageCell()
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1111490560(0x42400000, float:48.0)
            float r2 = r2 * r1
            r3 = 1098907648(0x41800000, float:16.0)
            float r1 = r1 * r3
            r0.pad(r5, r2, r5, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.getLabelCell()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.expandX()
            r5.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4.getLabel()
            r5.setWrap(r6)
            r4.invalidate()
            r4.pack()
            return
    }

    private void redrawParent() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.Group r0 = r2.getParent()
        L4:
            if (r0 == 0) goto L23
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
            if (r1 == 0) goto L14
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable r0 = (org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable) r0
            org.fortheloss.sticknodes.animationscreen.modules.Module r0 = r0.getModule()
            r0.setNeedsToBeDrawn()
            goto L23
        L14:
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.animationscreen.modules.Module
            if (r1 == 0) goto L1e
            org.fortheloss.sticknodes.animationscreen.modules.Module r0 = (org.fortheloss.sticknodes.animationscreen.modules.Module) r0
            r0.setNeedsToBeDrawn()
            goto L23
        L1e:
            com.badlogic.gdx.scenes.scene2d.Group r0 = r0.getParent()
            goto L4
        L23:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r4) {
            r3 = this;
            super.act(r4)
            boolean r0 = r3._flagIsPressed
            if (r0 == 0) goto L3a
            float r0 = r3._pressSeconds
            float r1 = org.fortheloss.sticknodes.ImageTextButtonLongPress.longPressSeconds
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto L3a
            float r0 = r0 + r4
            r3._pressSeconds = r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 < 0) goto L3a
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r4 = r3.getClickListener()
            if (r4 == 0) goto L30
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r4 = r3.getClickListener()
            boolean r4 = r4.isPressed()
            if (r4 == 0) goto L30
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r4 = r3.getClickListener()
            r4.cancel()
            r3.redrawParent()
        L30:
            r3.onLongPress()
            r4 = 1
            r3._hasTriggeredLongPress = r4
            r4 = 4
            org.fortheloss.sticknodes.App.vibrate(r4)
        L3a:
            return
    }

    public void beginPressCount() {
            r1 = this;
            boolean r0 = r1._longPressEnabled
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 1
            r1._flagIsPressed = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton, com.badlogic.gdx.scenes.scene2d.ui.Button, com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r11, float r12) {
            r10 = this;
            super.draw(r11, r12)
            boolean r0 = r10._longPressEnabled
            if (r0 == 0) goto L7a
            boolean r0 = r10.isDisabled()
            boolean r1 = r10.isPressed()
            boolean r2 = r10.isChecked()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r3 = r10.getStyle()
            if (r1 == 0) goto L20
            if (r0 != 0) goto L20
            float r0 = r3.pressedOffsetX
            float r1 = r3.pressedOffsetY
            goto L2d
        L20:
            if (r2 == 0) goto L29
            if (r0 != 0) goto L29
            float r0 = r3.checkedOffsetX
            float r1 = r3.checkedOffsetY
            goto L2d
        L29:
            float r0 = r3.unpressedOffsetX
            float r1 = r3.unpressedOffsetY
        L2d:
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r2 = r10.getStyle()
            org.fortheloss.sticknodes.ImageTextButtonLongPress$ImageTextButtonLongPressStyle r2 = (org.fortheloss.sticknodes.ImageTextButtonLongPress.ImageTextButtonLongPressStyle) r2
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r3 = r2.indicator
            float r7 = r3.getMinWidth()
            float r8 = r3.getMinHeight()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r2 = r10.getStyle()
            com.badlogic.gdx.graphics.Color r2 = r2.fontColor
            float r4 = r2.r
            float r5 = r2.g
            float r6 = r2.b
            float r2 = r2.a
            com.badlogic.gdx.graphics.Color r9 = r10.getColor()
            float r9 = r9.a
            float r2 = r2 * r9
            float r2 = r2 * r12
            r11.setColor(r4, r5, r6, r2)
            float r12 = r10.getX()
            float r2 = r10.getWidth()
            float r12 = r12 + r2
            float r12 = r12 - r7
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1096810496(0x41600000, float:14.0)
            float r2 = r2 * r4
            float r12 = r12 - r2
            float r5 = r12 + r0
            float r12 = r10.getY()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r4
            float r12 = r12 + r0
            float r6 = r12 + r1
            r4 = r11
            r3.draw(r4, r5, r6, r7, r8)
        L7a:
            return
    }

    public boolean hasTriggeredLongPress() {
            r1 = this;
            boolean r0 = r1._hasTriggeredLongPress
            return r0
    }

    protected void onLongPress() {
            r0 = this;
            return
    }

    public void stopPressCount() {
            r1 = this;
            r0 = 0
            r1._flagIsPressed = r0
            r1._hasTriggeredLongPress = r0
            r0 = 0
            r1._pressSeconds = r0
            return
    }
}
