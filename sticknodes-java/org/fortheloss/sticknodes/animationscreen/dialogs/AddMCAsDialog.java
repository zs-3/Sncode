package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class AddMCAsDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _animatedButton;
    private org.fortheloss.sticknodes.data.FrameData _currentFrameRef;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _graphicButton;
    private org.fortheloss.sticknodes.movieclip.MCMovieclipSource _mcSource;



    /* renamed from: -$$Nest$monAnimatedClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m336$$Nest$monAnimatedClick(org.fortheloss.sticknodes.animationscreen.dialogs.AddMCAsDialog r0) {
            r0.onAnimatedClick()
            return
    }

    /* renamed from: -$$Nest$monGraphicClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m337$$Nest$monGraphicClick(org.fortheloss.sticknodes.animationscreen.dialogs.AddMCAsDialog r0) {
            r0.onGraphicClick()
            return
    }

    public AddMCAsDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void onAnimatedClick() {
            r4 = this;
            org.fortheloss.sticknodes.movieclip.MCReference r0 = new org.fortheloss.sticknodes.movieclip.MCReference
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1 = r4._mcSource
            org.fortheloss.sticknodes.data.FrameData r2 = r4._currentFrameRef
            r3 = 2
            r0.<init>(r1, r2, r3)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r4._animationScreenRef
            r2 = 1
            r3 = 0
            r1.addMC(r0, r2, r2, r3)
            r4.hideImmediately()
            return
    }

    private void onGraphicClick() {
            r4 = this;
            org.fortheloss.sticknodes.movieclip.MCReference r0 = new org.fortheloss.sticknodes.movieclip.MCReference
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1 = r4._mcSource
            org.fortheloss.sticknodes.data.FrameData r2 = r4._currentFrameRef
            r3 = 0
            r0.<init>(r1, r2, r3)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r4._animationScreenRef
            r2 = 1
            r1.addMC(r0, r2, r2, r3)
            r4.hideImmediately()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._mcSource = r0
            r1._currentFrameRef = r0
            r1._animatedButton = r0
            r1._graphicButton = r0
            super.dispose()
            return
    }

    public void initialize(org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3, org.fortheloss.sticknodes.data.FrameData r4) {
            r2 = this;
            r2._mcSource = r3
            r2._currentFrameRef = r4
            java.lang.String r3 = "addMovieclipAsTitle"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            super.initialize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r2.getTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.defaults()
            r4 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.uniform(r4, r4)
            r3.expand(r4, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "addMovieclipAsInfo"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r0.<init>(r1)
            r3.<init>(r4, r0)
            r4 = 1
            r3.setWrap(r4)
            r3.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r2.addContent(r3)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.width(r4)
            r4 = 2
            r3.colspan(r4)
            r2.addContentRow()
            java.lang.String r3 = "animated"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r2.createTextButton(r3)
            r2._animatedButton = r3
            org.fortheloss.sticknodes.animationscreen.dialogs.AddMCAsDialog$1 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.AddMCAsDialog$1
            r4.<init>(r2)
            r3.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r2._animatedButton
            r2.addContent(r3)
            java.lang.String r3 = "singleFrame"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r2.createTextButton(r3)
            r2._graphicButton = r3
            org.fortheloss.sticknodes.animationscreen.dialogs.AddMCAsDialog$2 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.AddMCAsDialog$2
            r4.<init>(r2)
            r3.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r2._graphicButton
            r2.addContent(r3)
            java.lang.String r3 = "cancel"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r2.createTextButton(r3)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r2.addButton(r3, r4)
            return
    }
}
