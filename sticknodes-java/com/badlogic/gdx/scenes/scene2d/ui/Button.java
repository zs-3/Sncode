package com.badlogic.gdx.scenes.scene2d.ui;

/* loaded from: classes.dex */
public class Button extends com.badlogic.gdx.scenes.scene2d.ui.Table {
    com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup buttonGroup;
    private com.badlogic.gdx.scenes.scene2d.utils.ClickListener clickListener;
    boolean isChecked;
    boolean isDisabled;
    private boolean programmaticChangeEvents;
    private com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle style;


    public static class ButtonStyle {
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable checked;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable checkedDown;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable checkedFocused;
        public float checkedOffsetX;
        public float checkedOffsetY;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable checkedOver;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable disabled;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable down;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable focused;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable over;
        public float pressedOffsetX;
        public float pressedOffsetY;
        public float unpressedOffsetX;
        public float unpressedOffsetY;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable up;

        public ButtonStyle() {
                r0 = this;
                r0.<init>()
                return
        }

        public ButtonStyle(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle r2) {
                r1 = this;
                r1.<init>()
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r2.up
                r1.up = r0
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r2.down
                r1.down = r0
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r2.over
                r1.over = r0
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r2.focused
                r1.focused = r0
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r2.disabled
                r1.disabled = r0
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r2.checked
                r1.checked = r0
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r2.checkedOver
                r1.checkedOver = r0
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r2.checkedDown
                r1.checkedDown = r0
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r2.checkedFocused
                r1.checkedFocused = r0
                float r0 = r2.pressedOffsetX
                r1.pressedOffsetX = r0
                float r0 = r2.pressedOffsetY
                r1.pressedOffsetY = r0
                float r0 = r2.unpressedOffsetX
                r1.unpressedOffsetX = r0
                float r0 = r2.unpressedOffsetY
                r1.unpressedOffsetY = r0
                float r0 = r2.checkedOffsetX
                r1.checkedOffsetX = r0
                float r2 = r2.checkedOffsetY
                r1.checkedOffsetY = r2
                return
        }

        public ButtonStyle(com.badlogic.gdx.scenes.scene2d.utils.Drawable r1, com.badlogic.gdx.scenes.scene2d.utils.Drawable r2, com.badlogic.gdx.scenes.scene2d.utils.Drawable r3) {
                r0 = this;
                r0.<init>()
                r0.up = r1
                r0.down = r2
                r0.checked = r3
                return
        }
    }

    public Button() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.programmaticChangeEvents = r0
            r1.initialize()
            return
    }

    public Button(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.programmaticChangeEvents = r0
            r1.initialize()
            r1.setStyle(r2)
            float r2 = r1.getPrefWidth()
            float r0 = r1.getPrefHeight()
            r1.setSize(r2, r0)
            return
    }

    private void initialize() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r1.setTouchable(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Button$1 r0 = new com.badlogic.gdx.scenes.scene2d.ui.Button$1
            r0.<init>(r1)
            r1.clickListener = r0
            r1.addListener(r0)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r8, float r9) {
            r7 = this;
            r7.validate()
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r7.getBackgroundDrawable()
            r7.setBackground(r0)
            boolean r0 = r7.isPressed()
            if (r0 == 0) goto L1d
            boolean r0 = r7.isDisabled()
            if (r0 != 0) goto L1d
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r0 = r7.style
            float r1 = r0.pressedOffsetX
            float r0 = r0.pressedOffsetY
            goto L36
        L1d:
            boolean r0 = r7.isChecked()
            if (r0 == 0) goto L30
            boolean r0 = r7.isDisabled()
            if (r0 != 0) goto L30
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r0 = r7.style
            float r1 = r0.checkedOffsetX
            float r0 = r0.checkedOffsetY
            goto L36
        L30:
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r0 = r7.style
            float r1 = r0.unpressedOffsetX
            float r0 = r0.unpressedOffsetY
        L36:
            r2 = 0
            r3 = 0
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 != 0) goto L43
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L41
            goto L43
        L41:
            r2 = 0
            goto L44
        L43:
            r2 = 1
        L44:
            com.badlogic.gdx.utils.SnapshotArray r4 = r7.getChildren()
            if (r2 == 0) goto L5b
            r5 = 0
        L4b:
            int r6 = r4.size
            if (r5 >= r6) goto L5b
            java.lang.Object r6 = r4.get(r5)
            com.badlogic.gdx.scenes.scene2d.Actor r6 = (com.badlogic.gdx.scenes.scene2d.Actor) r6
            r6.moveBy(r1, r0)
            int r5 = r5 + 1
            goto L4b
        L5b:
            super.draw(r8, r9)
            if (r2 == 0) goto L72
        L60:
            int r8 = r4.size
            if (r3 >= r8) goto L72
            java.lang.Object r8 = r4.get(r3)
            com.badlogic.gdx.scenes.scene2d.Actor r8 = (com.badlogic.gdx.scenes.scene2d.Actor) r8
            float r9 = -r1
            float r2 = -r0
            r8.moveBy(r9, r2)
            int r3 = r3 + 1
            goto L60
        L72:
            com.badlogic.gdx.scenes.scene2d.Stage r8 = r7.getStage()
            if (r8 == 0) goto L8f
            boolean r8 = r8.getActionsRequestRendering()
            if (r8 == 0) goto L8f
            boolean r8 = r7.isPressed()
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r9 = r7.clickListener
            boolean r9 = r9.isPressed()
            if (r8 == r9) goto L8f
            com.badlogic.gdx.Graphics r8 = com.badlogic.gdx.Gdx.graphics
            r8.requestRendering()
        L8f:
            return
    }

    protected com.badlogic.gdx.scenes.scene2d.utils.Drawable getBackgroundDrawable() {
            r2 = this;
            boolean r0 = r2.isDisabled()
            if (r0 == 0) goto Ld
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r0 = r2.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.disabled
            if (r0 == 0) goto Ld
            return r0
        Ld:
            boolean r0 = r2.isPressed()
            if (r0 == 0) goto L27
            boolean r0 = r2.isChecked()
            if (r0 == 0) goto L20
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r0 = r2.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.checkedDown
            if (r0 == 0) goto L20
            return r0
        L20:
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r0 = r2.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.down
            if (r0 == 0) goto L27
            return r0
        L27:
            boolean r0 = r2.isOver()
            if (r0 == 0) goto L41
            boolean r0 = r2.isChecked()
            if (r0 == 0) goto L3a
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r0 = r2.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.checkedOver
            if (r0 == 0) goto L41
            return r0
        L3a:
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r0 = r2.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.over
            if (r0 == 0) goto L41
            return r0
        L41:
            boolean r0 = r2.hasKeyboardFocus()
            boolean r1 = r2.isChecked()
            if (r1 == 0) goto L68
            if (r0 == 0) goto L54
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r1 = r2.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.checkedFocused
            if (r1 == 0) goto L54
            return r1
        L54:
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r1 = r2.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.checked
            if (r1 == 0) goto L5b
            return r1
        L5b:
            boolean r1 = r2.isOver()
            if (r1 == 0) goto L68
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r1 = r2.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.over
            if (r1 == 0) goto L68
            return r1
        L68:
            if (r0 == 0) goto L71
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r0 = r2.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.focused
            if (r0 == 0) goto L71
            return r0
        L71:
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r0 = r2.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.up
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.utils.ClickListener getClickListener() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r0 = r1.clickListener
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinHeight() {
            r1 = this;
            float r0 = r1.getPrefHeight()
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinWidth() {
            r1 = this;
            float r0 = r1.getPrefWidth()
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
            r2 = this;
            float r0 = super.getPrefHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r1 = r2.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.up
            if (r1 == 0) goto L12
            float r1 = r1.getMinHeight()
            float r0 = java.lang.Math.max(r0, r1)
        L12:
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r1 = r2.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.down
            if (r1 == 0) goto L20
            float r1 = r1.getMinHeight()
            float r0 = java.lang.Math.max(r0, r1)
        L20:
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r1 = r2.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.checked
            if (r1 == 0) goto L2e
            float r1 = r1.getMinHeight()
            float r0 = java.lang.Math.max(r0, r1)
        L2e:
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
            r2 = this;
            float r0 = super.getPrefWidth()
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r1 = r2.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.up
            if (r1 == 0) goto L12
            float r1 = r1.getMinWidth()
            float r0 = java.lang.Math.max(r0, r1)
        L12:
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r1 = r2.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.down
            if (r1 == 0) goto L20
            float r1 = r1.getMinWidth()
            float r0 = java.lang.Math.max(r0, r1)
        L20:
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r1 = r2.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.checked
            if (r1 == 0) goto L2e
            float r1 = r1.getMinWidth()
            float r0 = java.lang.Math.max(r0, r1)
        L2e:
            return r0
    }

    public boolean isChecked() {
            r1 = this;
            boolean r0 = r1.isChecked
            return r0
    }

    public boolean isDisabled() {
            r1 = this;
            boolean r0 = r1.isDisabled
            return r0
    }

    public boolean isOver() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r0 = r1.clickListener
            boolean r0 = r0.isOver()
            return r0
    }

    public boolean isPressed() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r0 = r1.clickListener
            boolean r0 = r0.isVisualPressed()
            return r0
    }

    public void setChecked(boolean r2) {
            r1 = this;
            boolean r0 = r1.programmaticChangeEvents
            r1.setChecked(r2, r0)
            return
    }

    void setChecked(boolean r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.isChecked
            if (r0 != r2) goto L5
            return
        L5:
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r0 = r1.buttonGroup
            if (r0 == 0) goto L10
            boolean r0 = r0.canCheck(r1, r2)
            if (r0 != 0) goto L10
            return
        L10:
            r1.isChecked = r2
            if (r3 == 0) goto L29
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.utils.ChangeListener$ChangeEvent> r3 = com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent.class
            java.lang.Object r3 = com.badlogic.gdx.utils.Pools.obtain(r3)
            com.badlogic.gdx.scenes.scene2d.utils.ChangeListener$ChangeEvent r3 = (com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent) r3
            boolean r0 = r1.fire(r3)
            if (r0 == 0) goto L26
            r2 = r2 ^ 1
            r1.isChecked = r2
        L26:
            com.badlogic.gdx.utils.Pools.free(r3)
        L29:
            return
    }

    public void setStyle(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            r1.style = r2
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r1.getBackgroundDrawable()
            r1.setBackground(r2)
            return
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "style cannot be null."
            r2.<init>(r0)
            throw r2
    }
}
