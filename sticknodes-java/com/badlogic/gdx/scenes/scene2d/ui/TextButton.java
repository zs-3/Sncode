package com.badlogic.gdx.scenes.scene2d.ui;

/* loaded from: classes.dex */
public class TextButton extends com.badlogic.gdx.scenes.scene2d.ui.Button {
    private com.badlogic.gdx.scenes.scene2d.ui.Label label;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle style;

    public static class TextButtonStyle extends com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle {
        public com.badlogic.gdx.graphics.Color checkedDownFontColor;
        public com.badlogic.gdx.graphics.Color checkedFocusedFontColor;
        public com.badlogic.gdx.graphics.Color checkedFontColor;
        public com.badlogic.gdx.graphics.Color checkedOverFontColor;
        public com.badlogic.gdx.graphics.Color disabledFontColor;
        public com.badlogic.gdx.graphics.Color downFontColor;
        public com.badlogic.gdx.graphics.Color focusedFontColor;
        public com.badlogic.gdx.graphics.g2d.BitmapFont font;
        public com.badlogic.gdx.graphics.Color fontColor;
        public com.badlogic.gdx.graphics.Color overFontColor;

        public TextButtonStyle() {
                r0 = this;
                r0.<init>()
                return
        }

        public TextButtonStyle(com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle r3) {
                r2 = this;
                r2.<init>(r3)
                com.badlogic.gdx.graphics.g2d.BitmapFont r0 = r3.font
                r2.font = r0
                com.badlogic.gdx.graphics.Color r0 = r3.fontColor
                if (r0 == 0) goto L14
                com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
                com.badlogic.gdx.graphics.Color r1 = r3.fontColor
                r0.<init>(r1)
                r2.fontColor = r0
            L14:
                com.badlogic.gdx.graphics.Color r0 = r3.downFontColor
                if (r0 == 0) goto L21
                com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
                com.badlogic.gdx.graphics.Color r1 = r3.downFontColor
                r0.<init>(r1)
                r2.downFontColor = r0
            L21:
                com.badlogic.gdx.graphics.Color r0 = r3.overFontColor
                if (r0 == 0) goto L2e
                com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
                com.badlogic.gdx.graphics.Color r1 = r3.overFontColor
                r0.<init>(r1)
                r2.overFontColor = r0
            L2e:
                com.badlogic.gdx.graphics.Color r0 = r3.focusedFontColor
                if (r0 == 0) goto L3b
                com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
                com.badlogic.gdx.graphics.Color r1 = r3.focusedFontColor
                r0.<init>(r1)
                r2.focusedFontColor = r0
            L3b:
                com.badlogic.gdx.graphics.Color r0 = r3.disabledFontColor
                if (r0 == 0) goto L48
                com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
                com.badlogic.gdx.graphics.Color r1 = r3.disabledFontColor
                r0.<init>(r1)
                r2.disabledFontColor = r0
            L48:
                com.badlogic.gdx.graphics.Color r0 = r3.checkedFontColor
                if (r0 == 0) goto L55
                com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
                com.badlogic.gdx.graphics.Color r1 = r3.checkedFontColor
                r0.<init>(r1)
                r2.checkedFontColor = r0
            L55:
                com.badlogic.gdx.graphics.Color r0 = r3.checkedDownFontColor
                if (r0 == 0) goto L62
                com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
                com.badlogic.gdx.graphics.Color r1 = r3.checkedDownFontColor
                r0.<init>(r1)
                r2.checkedDownFontColor = r0
            L62:
                com.badlogic.gdx.graphics.Color r0 = r3.checkedOverFontColor
                if (r0 == 0) goto L6f
                com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
                com.badlogic.gdx.graphics.Color r1 = r3.checkedOverFontColor
                r0.<init>(r1)
                r2.checkedOverFontColor = r0
            L6f:
                com.badlogic.gdx.graphics.Color r0 = r3.checkedFocusedFontColor
                if (r0 == 0) goto L7c
                com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
                com.badlogic.gdx.graphics.Color r3 = r3.checkedFocusedFontColor
                r0.<init>(r3)
                r2.checkedFocusedFontColor = r0
            L7c:
                return
        }
    }

    public TextButton(java.lang.String r3, com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle r4) {
            r2 = this;
            r2.<init>()
            r2.setStyle(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.graphics.g2d.BitmapFont r1 = r4.font
            com.badlogic.gdx.graphics.Color r4 = r4.fontColor
            r0.<init>(r1, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r2.newLabel(r3, r0)
            r2.label = r3
            r4 = 1
            r3.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r2.label
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r2.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.expand()
            r3.fill()
            float r3 = r2.getPrefWidth()
            float r4 = r2.getPrefHeight()
            r2.setSize(r3, r4)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Button, com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r3, float r4) {
            r2 = this;
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
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = r2.style
            com.badlogic.gdx.graphics.Color r0 = r0.disabledFontColor
            if (r0 == 0) goto Ld
            return r0
        Ld:
            boolean r0 = r2.isPressed()
            if (r0 == 0) goto L27
            boolean r0 = r2.isChecked()
            if (r0 == 0) goto L20
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = r2.style
            com.badlogic.gdx.graphics.Color r0 = r0.checkedDownFontColor
            if (r0 == 0) goto L20
            return r0
        L20:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = r2.style
            com.badlogic.gdx.graphics.Color r0 = r0.downFontColor
            if (r0 == 0) goto L27
            return r0
        L27:
            boolean r0 = r2.isOver()
            if (r0 == 0) goto L41
            boolean r0 = r2.isChecked()
            if (r0 == 0) goto L3a
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = r2.style
            com.badlogic.gdx.graphics.Color r0 = r0.checkedOverFontColor
            if (r0 == 0) goto L41
            return r0
        L3a:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = r2.style
            com.badlogic.gdx.graphics.Color r0 = r0.overFontColor
            if (r0 == 0) goto L41
            return r0
        L41:
            boolean r0 = r2.hasKeyboardFocus()
            boolean r1 = r2.isChecked()
            if (r1 == 0) goto L68
            if (r0 == 0) goto L54
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = r2.style
            com.badlogic.gdx.graphics.Color r1 = r1.checkedFocusedFontColor
            if (r1 == 0) goto L54
            return r1
        L54:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = r2.style
            com.badlogic.gdx.graphics.Color r1 = r1.checkedFontColor
            if (r1 == 0) goto L5b
            return r1
        L5b:
            boolean r1 = r2.isOver()
            if (r1 == 0) goto L68
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = r2.style
            com.badlogic.gdx.graphics.Color r1 = r1.overFontColor
            if (r1 == 0) goto L68
            return r1
        L68:
            if (r0 == 0) goto L71
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = r2.style
            com.badlogic.gdx.graphics.Color r0 = r0.focusedFontColor
            if (r0 == 0) goto L71
            return r0
        L71:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = r2.style
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Label getLabel() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r1.label
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle getStyle() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = r1.style
            return r0
    }

    protected com.badlogic.gdx.scenes.scene2d.ui.Label newLabel(java.lang.String r2, com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle r3) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            r0.<init>(r2, r3)
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Button
    public void setStyle(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle r3) {
            r2 = this;
            java.lang.String r0 = "style cannot be null"
            java.util.Objects.requireNonNull(r3, r0)
            boolean r0 = r3 instanceof com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle
            if (r0 == 0) goto L27
            r0 = r3
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = (com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle) r0
            r2.style = r0
            super.setStyle(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r2.label
            if (r3 == 0) goto L26
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = r3.getStyle()
            com.badlogic.gdx.graphics.g2d.BitmapFont r1 = r0.font
            r3.font = r1
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r3.fontColor = r0
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r2.label
            r0.setStyle(r3)
        L26:
            return
        L27:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "style must be a TextButtonStyle."
            r3.<init>(r0)
            throw r3
    }

    public void setText(java.lang.String r2) {
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
            java.lang.String r2 = "TextButton "
            goto L30
        L2e:
            java.lang.String r2 = ""
        L30:
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ": "
            r1.append(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r4.label
            com.badlogic.gdx.utils.StringBuilder r0 = r0.getText()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
