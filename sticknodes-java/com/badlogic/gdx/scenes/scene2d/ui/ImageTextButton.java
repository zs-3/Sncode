package com.badlogic.gdx.scenes.scene2d.ui;

/* loaded from: classes.dex */
public class ImageTextButton extends com.badlogic.gdx.scenes.scene2d.ui.Button {
    private final com.badlogic.gdx.scenes.scene2d.ui.Image image;
    private com.badlogic.gdx.scenes.scene2d.ui.Label label;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle style;

    public static class ImageTextButtonStyle extends com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle {
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable imageChecked;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable imageCheckedDown;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable imageCheckedOver;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable imageDisabled;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable imageDown;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable imageOver;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable imageUp;

        public ImageTextButtonStyle() {
                r0 = this;
                r0.<init>()
                return
        }

        public ImageTextButtonStyle(com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle r2) {
                r1 = this;
                r1.<init>(r2)
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r2.imageUp
                r1.imageUp = r0
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r2.imageDown
                r1.imageDown = r0
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r2.imageOver
                r1.imageOver = r0
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r2.imageDisabled
                r1.imageDisabled = r0
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r2.imageChecked
                r1.imageChecked = r0
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r2.imageCheckedDown
                r1.imageCheckedDown = r0
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.imageCheckedOver
                r1.imageCheckedOver = r2
                return
        }

        public ImageTextButtonStyle(com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public ImageTextButton(java.lang.String r5, com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle r6) {
            r4 = this;
            r4.<init>(r6)
            r4.style = r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r4.defaults()
            r1 = 1077936128(0x40400000, float:3.0)
            r0.space(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r4.newImage()
            r4.image = r0
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.graphics.g2d.BitmapFont r2 = r6.font
            com.badlogic.gdx.graphics.Color r3 = r6.fontColor
            r1.<init>(r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4.newLabel(r5, r1)
            r4.label = r5
            r1 = 1
            r5.setAlignment(r1)
            r4.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4.label
            r4.add(r5)
            r4.setStyle(r6)
            float r5 = r4.getPrefWidth()
            float r6 = r4.getPrefHeight()
            r4.setSize(r5, r6)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Button, com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r3, float r4) {
            r2 = this;
            r2.updateImage()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r2.label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = r0.getStyle()
            com.badlogic.gdx.graphics.Color r1 = r2.getFontColor()
            r0.fontColor = r1
            super.draw(r3, r4)
            return
    }

    protected com.badlogic.gdx.graphics.Color getFontColor() {
            r2 = this;
            boolean r0 = r2.isDisabled()
            if (r0 == 0) goto Ld
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = r2.style
            com.badlogic.gdx.graphics.Color r0 = r0.disabledFontColor
            if (r0 == 0) goto Ld
            return r0
        Ld:
            boolean r0 = r2.isPressed()
            if (r0 == 0) goto L27
            boolean r0 = r2.isChecked()
            if (r0 == 0) goto L20
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = r2.style
            com.badlogic.gdx.graphics.Color r0 = r0.checkedDownFontColor
            if (r0 == 0) goto L20
            return r0
        L20:
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = r2.style
            com.badlogic.gdx.graphics.Color r0 = r0.downFontColor
            if (r0 == 0) goto L27
            return r0
        L27:
            boolean r0 = r2.isOver()
            if (r0 == 0) goto L41
            boolean r0 = r2.isChecked()
            if (r0 == 0) goto L3a
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = r2.style
            com.badlogic.gdx.graphics.Color r0 = r0.checkedOverFontColor
            if (r0 == 0) goto L41
            return r0
        L3a:
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = r2.style
            com.badlogic.gdx.graphics.Color r0 = r0.overFontColor
            if (r0 == 0) goto L41
            return r0
        L41:
            boolean r0 = r2.hasKeyboardFocus()
            boolean r1 = r2.isChecked()
            if (r1 == 0) goto L68
            if (r0 == 0) goto L54
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r1 = r2.style
            com.badlogic.gdx.graphics.Color r1 = r1.checkedFocusedFontColor
            if (r1 == 0) goto L54
            return r1
        L54:
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r1 = r2.style
            com.badlogic.gdx.graphics.Color r1 = r1.checkedFontColor
            if (r1 == 0) goto L5b
            return r1
        L5b:
            boolean r1 = r2.isOver()
            if (r1 == 0) goto L68
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r1 = r2.style
            com.badlogic.gdx.graphics.Color r1 = r1.overFontColor
            if (r1 == 0) goto L68
            return r1
        L68:
            if (r0 == 0) goto L71
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = r2.style
            com.badlogic.gdx.graphics.Color r0 = r0.focusedFontColor
            if (r0 == 0) goto L71
            return r0
        L71:
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = r2.style
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Image getImage() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r1.image
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell getImageCell() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r1.image
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.getCell(r0)
            return r0
    }

    protected com.badlogic.gdx.scenes.scene2d.utils.Drawable getImageDrawable() {
            r1 = this;
            boolean r0 = r1.isDisabled()
            if (r0 == 0) goto Ld
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = r1.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.imageDisabled
            if (r0 == 0) goto Ld
            return r0
        Ld:
            boolean r0 = r1.isPressed()
            if (r0 == 0) goto L27
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto L20
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = r1.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.imageCheckedDown
            if (r0 == 0) goto L20
            return r0
        L20:
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = r1.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.imageDown
            if (r0 == 0) goto L27
            return r0
        L27:
            boolean r0 = r1.isOver()
            if (r0 == 0) goto L41
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto L3a
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = r1.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.imageCheckedOver
            if (r0 == 0) goto L41
            return r0
        L3a:
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = r1.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.imageOver
            if (r0 == 0) goto L41
            return r0
        L41:
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto L5b
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = r1.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.imageChecked
            if (r0 == 0) goto L4e
            return r0
        L4e:
            boolean r0 = r1.isOver()
            if (r0 == 0) goto L5b
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = r1.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.imageOver
            if (r0 == 0) goto L5b
            return r0
        L5b:
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = r1.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.imageUp
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Label getLabel() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r1.label
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell getLabelCell() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r1.label
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.getCell(r0)
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle getStyle() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = r1.style
            return r0
    }

    protected com.badlogic.gdx.scenes.scene2d.ui.Image newImage() {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.utils.Scaling r1 = com.badlogic.gdx.utils.Scaling.fit
            r2 = 0
            r0.<init>(r2, r1)
            return r0
    }

    protected com.badlogic.gdx.scenes.scene2d.ui.Label newLabel(java.lang.String r2, com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle r3) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            r0.<init>(r2, r3)
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Button
    public void setStyle(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle
            if (r0 == 0) goto L2b
            r0 = r2
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = (com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle) r0
            r1.style = r0
            super.setStyle(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r1.image
            if (r2 == 0) goto L13
            r1.updateImage()
        L13:
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r1.label
            if (r2 == 0) goto L2a
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = r2.getStyle()
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = r0.font
            r2.font = r0
            com.badlogic.gdx.graphics.Color r0 = r1.getFontColor()
            r2.fontColor = r0
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r1.label
            r0.setStyle(r2)
        L2a:
            return
        L2b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "style must be a ImageTextButtonStyle."
            r2.<init>(r0)
            throw r2
    }

    public void setText(java.lang.CharSequence r2) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r1.label
            r0.setText(r2)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
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
            java.lang.String r2 = "ImageTextButton "
            goto L30
        L2e:
            java.lang.String r2 = ""
        L30:
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ": "
            r1.append(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r4.image
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.getDrawable()
            r1.append(r0)
            java.lang.String r0 = " "
            r1.append(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r4.label
            com.badlogic.gdx.utils.StringBuilder r0 = r0.getText()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    protected void updateImage() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r2.image
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r2.getImageDrawable()
            r0.setDrawable(r1)
            return
    }
}
