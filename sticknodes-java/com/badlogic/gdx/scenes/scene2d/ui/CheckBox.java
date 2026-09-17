package com.badlogic.gdx.scenes.scene2d.ui;

/* loaded from: classes.dex */
public class CheckBox extends com.badlogic.gdx.scenes.scene2d.ui.TextButton {
    private com.badlogic.gdx.scenes.scene2d.ui.Image image;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell imageCell;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle style;

    public static class CheckBoxStyle extends com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle {
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable checkboxOff;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable checkboxOffDisabled;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable checkboxOn;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable checkboxOnDisabled;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable checkboxOnOver;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable checkboxOver;

        public CheckBoxStyle() {
                r0 = this;
                r0.<init>()
                return
        }

        public CheckBoxStyle(com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle r2) {
                r1 = this;
                r1.<init>(r2)
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r2.checkboxOff
                r1.checkboxOff = r0
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r2.checkboxOn
                r1.checkboxOn = r0
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r2.checkboxOnOver
                r1.checkboxOnOver = r0
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r2.checkboxOver
                r1.checkboxOver = r0
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r2.checkboxOnDisabled
                r1.checkboxOnDisabled = r0
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.checkboxOffDisabled
                r1.checkboxOffDisabled = r2
                return
        }

        public CheckBoxStyle(com.badlogic.gdx.scenes.scene2d.utils.Drawable r1, com.badlogic.gdx.scenes.scene2d.utils.Drawable r2, com.badlogic.gdx.graphics.g2d.BitmapFont r3, com.badlogic.gdx.graphics.Color r4) {
                r0 = this;
                r0.<init>()
                r0.checkboxOff = r1
                r0.checkboxOn = r2
                r0.font = r3
                r0.fontColor = r4
                return
        }
    }

    public CheckBox(java.lang.String r2, com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle r3) {
            r1 = this;
            r1.<init>(r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r1.getLabel()
            r0 = 8
            r2.setAlignment(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r1.newImage()
            r1.image = r0
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r3 = r3.checkboxOff
            r0.setDrawable(r3)
            r1.clearChildren()
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = r1.image
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r1.add(r3)
            r1.imageCell = r3
            r1.add(r2)
            float r2 = r1.getPrefWidth()
            float r3 = r1.getPrefHeight()
            r1.setSize(r2, r3)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextButton, com.badlogic.gdx.scenes.scene2d.ui.Button, com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r3, float r4) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r2.image
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r2.getImageDrawable()
            r0.setDrawable(r1)
            super.draw(r3, r4)
            return
    }

    protected com.badlogic.gdx.scenes.scene2d.utils.Drawable getImageDrawable() {
            r3 = this;
            boolean r0 = r3.isDisabled()
            if (r0 == 0) goto L16
            boolean r0 = r3.isChecked
            if (r0 == 0) goto L11
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = r3.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.checkboxOnDisabled
            if (r0 == 0) goto L11
            return r0
        L11:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = r3.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.checkboxOffDisabled
            return r0
        L16:
            boolean r0 = r3.isOver()
            if (r0 == 0) goto L24
            boolean r0 = r3.isDisabled()
            if (r0 != 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            boolean r1 = r3.isChecked
            if (r1 == 0) goto L37
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = r3.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r1.checkboxOn
            if (r2 == 0) goto L37
            if (r0 == 0) goto L36
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r1.checkboxOnOver
            if (r0 == 0) goto L36
            r2 = r0
        L36:
            return r2
        L37:
            if (r0 == 0) goto L40
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = r3.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.checkboxOver
            if (r0 == 0) goto L40
            return r0
        L40:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = r3.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.checkboxOff
            return r0
    }

    protected com.badlogic.gdx.scenes.scene2d.ui.Image newImage() {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.utils.Scaling r1 = com.badlogic.gdx.utils.Scaling.none
            r2 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextButton, com.badlogic.gdx.scenes.scene2d.ui.Button
    public void setStyle(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle
            if (r0 == 0) goto Ld
            r0 = r2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = (com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle) r0
            r1.style = r0
            super.setStyle(r2)
            return
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "style must be a CheckBoxStyle."
            r2.<init>(r0)
            throw r2
    }
}
