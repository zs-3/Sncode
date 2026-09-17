package com.badlogic.gdx.scenes.scene2d.ui;

/* loaded from: classes.dex */
public class ImageButton extends com.badlogic.gdx.scenes.scene2d.ui.Button {
    private final com.badlogic.gdx.scenes.scene2d.ui.Image image;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle style;

    public static class ImageButtonStyle extends com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle {
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable imageChecked;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable imageCheckedDown;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable imageCheckedOver;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable imageDisabled;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable imageDown;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable imageOver;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable imageUp;

        public ImageButtonStyle() {
                r0 = this;
                r0.<init>()
                return
        }

        public ImageButtonStyle(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public ImageButtonStyle(com.badlogic.gdx.scenes.scene2d.utils.Drawable r1, com.badlogic.gdx.scenes.scene2d.utils.Drawable r2, com.badlogic.gdx.scenes.scene2d.utils.Drawable r3, com.badlogic.gdx.scenes.scene2d.utils.Drawable r4, com.badlogic.gdx.scenes.scene2d.utils.Drawable r5, com.badlogic.gdx.scenes.scene2d.utils.Drawable r6) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r0.imageUp = r4
                r0.imageDown = r5
                r0.imageChecked = r6
                return
        }
    }

    public ImageButton(com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle r2) {
            r1 = this;
            r1.<init>(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r1.newImage()
            r1.image = r0
            r1.add(r0)
            r1.setStyle(r2)
            float r2 = r1.getPrefWidth()
            float r0 = r1.getPrefHeight()
            r1.setSize(r2, r0)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Button, com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r1, float r2) {
            r0 = this;
            r0.updateImage()
            super.draw(r1, r2)
            return
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
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = r1.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.imageDisabled
            if (r0 == 0) goto Ld
            return r0
        Ld:
            boolean r0 = r1.isPressed()
            if (r0 == 0) goto L27
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto L20
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = r1.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.imageCheckedDown
            if (r0 == 0) goto L20
            return r0
        L20:
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = r1.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.imageDown
            if (r0 == 0) goto L27
            return r0
        L27:
            boolean r0 = r1.isOver()
            if (r0 == 0) goto L41
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto L3a
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = r1.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.imageCheckedOver
            if (r0 == 0) goto L41
            return r0
        L3a:
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = r1.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.imageOver
            if (r0 == 0) goto L41
            return r0
        L41:
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto L5b
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = r1.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.imageChecked
            if (r0 == 0) goto L4e
            return r0
        L4e:
            boolean r0 = r1.isOver()
            if (r0 == 0) goto L5b
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = r1.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.imageOver
            if (r0 == 0) goto L5b
            return r0
        L5b:
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = r1.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.imageUp
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle getStyle() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = r1.style
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

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Button
    public void setStyle(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle
            if (r0 == 0) goto L14
            r0 = r2
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = (com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle) r0
            r1.style = r0
            super.setStyle(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = r1.image
            if (r2 == 0) goto L13
            r1.updateImage()
        L13:
            return
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "style must be an ImageButtonStyle."
            r2.<init>(r0)
            throw r2
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
            java.lang.String r2 = "ImageButton "
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
