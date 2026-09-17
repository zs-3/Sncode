package com.badlogic.gdx.scenes.scene2d.ui;

/* loaded from: classes.dex */
public class Dialog extends com.badlogic.gdx.scenes.scene2d.ui.Window {
    com.badlogic.gdx.scenes.scene2d.ui.Table buttonTable;
    boolean cancelHide;
    com.badlogic.gdx.scenes.scene2d.ui.Table contentTable;
    com.badlogic.gdx.scenes.scene2d.utils.FocusListener focusListener;
    protected com.badlogic.gdx.scenes.scene2d.InputListener ignoreTouchDown;
    com.badlogic.gdx.scenes.scene2d.Actor previousKeyboardFocus;
    com.badlogic.gdx.scenes.scene2d.Actor previousScrollFocus;
    private com.badlogic.gdx.scenes.scene2d.ui.Skin skin;
    com.badlogic.gdx.utils.ObjectMap<com.badlogic.gdx.scenes.scene2d.Actor, java.lang.Object> values;




    public Dialog(java.lang.String r1, com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle r2) {
            r0 = this;
            r0.<init>(r1, r2)
            com.badlogic.gdx.utils.ObjectMap r1 = new com.badlogic.gdx.utils.ObjectMap
            r1.<init>()
            r0.values = r1
            com.badlogic.gdx.scenes.scene2d.ui.Dialog$1 r1 = new com.badlogic.gdx.scenes.scene2d.ui.Dialog$1
            r1.<init>(r0)
            r0.ignoreTouchDown = r1
            r0.initialize()
            return
    }

    private void initialize() {
            r3 = this;
            r0 = 1
            r3.setModal(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r3.defaults()
            r1 = 1086324736(0x40c00000, float:6.0)
            r0.space(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = r3.skin
            r0.<init>(r2)
            r3.contentTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r3.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expand()
            r0.fill()
            r3.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            com.badlogic.gdx.scenes.scene2d.ui.Skin r2 = r3.skin
            r0.<init>(r2)
            r3.buttonTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r3.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r3.contentTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            r0.space(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r3.buttonTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            r0.space(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r3.buttonTable
            com.badlogic.gdx.scenes.scene2d.ui.Dialog$2 r1 = new com.badlogic.gdx.scenes.scene2d.ui.Dialog$2
            r1.<init>(r3)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Dialog$3 r0 = new com.badlogic.gdx.scenes.scene2d.ui.Dialog$3
            r0.<init>(r3)
            r3.focusListener = r0
            return
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Dialog button(com.badlogic.gdx.scenes.scene2d.ui.Button r2, java.lang.Object r3) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r1.buttonTable
            r0.add(r2)
            r1.setObject(r2, r3)
            return r1
    }

    public void cancel() {
            r1 = this;
            r0 = 1
            r1.cancelHide = r0
            return
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Table getButtonTable() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r1.buttonTable
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Table getContentTable() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r1.contentTable
            return r0
    }

    public void hide() {
            r2 = this;
            com.badlogic.gdx.math.Interpolation r0 = com.badlogic.gdx.math.Interpolation.fade
            r1 = 1053609165(0x3ecccccd, float:0.4)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.fadeOut(r1, r0)
            r2.hide(r0)
            return
    }

    public void hide(com.badlogic.gdx.scenes.scene2d.Action r4) {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r3.getStage()
            if (r0 == 0) goto L46
            com.badlogic.gdx.scenes.scene2d.utils.FocusListener r1 = r3.focusListener
            r3.removeListener(r1)
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r3.previousKeyboardFocus
            r2 = 0
            if (r1 == 0) goto L18
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r1.getStage()
            if (r1 != 0) goto L18
            r3.previousKeyboardFocus = r2
        L18:
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r0.getKeyboardFocus()
            if (r1 == 0) goto L24
            boolean r1 = r1.isDescendantOf(r3)
            if (r1 == 0) goto L29
        L24:
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r3.previousKeyboardFocus
            r0.setKeyboardFocus(r1)
        L29:
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r3.previousScrollFocus
            if (r1 == 0) goto L35
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r1.getStage()
            if (r1 != 0) goto L35
            r3.previousScrollFocus = r2
        L35:
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r0.getScrollFocus()
            if (r1 == 0) goto L41
            boolean r1 = r1.isDescendantOf(r3)
            if (r1 == 0) goto L46
        L41:
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r3.previousScrollFocus
            r0.setScrollFocus(r1)
        L46:
            if (r4 == 0) goto L60
            com.badlogic.gdx.scenes.scene2d.InputListener r0 = r3.ignoreTouchDown
            r3.addCaptureListener(r0)
            com.badlogic.gdx.scenes.scene2d.InputListener r0 = r3.ignoreTouchDown
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.actions.RemoveListenerAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.removeListener(r0, r1)
            com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.removeActor()
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r4, r0, r1)
            r3.addAction(r4)
            goto L63
        L60:
            r3.remove()
        L63:
            return
    }

    protected void result(java.lang.Object r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    public void setObject(com.badlogic.gdx.scenes.scene2d.Actor r2, java.lang.Object r3) {
            r1 = this;
            com.badlogic.gdx.utils.ObjectMap<com.badlogic.gdx.scenes.scene2d.Actor, java.lang.Object> r0 = r1.values
            r0.put(r2, r3)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    protected void setStage(com.badlogic.gdx.scenes.scene2d.Stage r2) {
            r1 = this;
            if (r2 != 0) goto L8
            com.badlogic.gdx.scenes.scene2d.utils.FocusListener r0 = r1.focusListener
            r1.addListener(r0)
            goto Ld
        L8:
            com.badlogic.gdx.scenes.scene2d.utils.FocusListener r0 = r1.focusListener
            r1.removeListener(r0)
        Ld:
            super.setStage(r2)
            return
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Dialog show(com.badlogic.gdx.scenes.scene2d.Stage r4, com.badlogic.gdx.scenes.scene2d.Action r5) {
            r3 = this;
            r3.clearActions()
            com.badlogic.gdx.scenes.scene2d.InputListener r0 = r3.ignoreTouchDown
            r3.removeCaptureListener(r0)
            r0 = 0
            r3.previousKeyboardFocus = r0
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r4.getKeyboardFocus()
            if (r1 == 0) goto L19
            boolean r2 = r1.isDescendantOf(r3)
            if (r2 != 0) goto L19
            r3.previousKeyboardFocus = r1
        L19:
            r3.previousScrollFocus = r0
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r4.getScrollFocus()
            if (r0 == 0) goto L29
            boolean r1 = r0.isDescendantOf(r3)
            if (r1 != 0) goto L29
            r3.previousScrollFocus = r0
        L29:
            r4.addActor(r3)
            r3.pack()
            r4.cancelTouchFocus()
            r4.setKeyboardFocus(r3)
            r4.setScrollFocus(r3)
            if (r5 == 0) goto L3d
            r3.addAction(r5)
        L3d:
            return r3
    }
}
