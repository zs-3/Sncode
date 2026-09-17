package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class MovieclipIsSavingDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private float _angle;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _loadingSpinnerTRRef;
    private org.fortheloss.sticknodes.movieclip.MCMovieclipSource _mcToReadFromRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _statusLabel;


    /* renamed from: -$$Nest$fget_angle, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m592$$Nest$fget_angle(org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipIsSavingDialog r0) {
            float r0 = r0._angle
            return r0
    }

    /* renamed from: -$$Nest$fget_mcToReadFromRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.movieclip.MCMovieclipSource m593$$Nest$fget_mcToReadFromRef(org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipIsSavingDialog r0) {
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r0._mcToReadFromRef
            return r0
    }

    /* renamed from: -$$Nest$fget_statusLabel, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Label m594$$Nest$fget_statusLabel(org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipIsSavingDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0._statusLabel
            return r0
    }

    /* renamed from: -$$Nest$fput_angle, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m595$$Nest$fput_angle(org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipIsSavingDialog r0, float r1) {
            r0._angle = r1
            return
    }

    public MovieclipIsSavingDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, com.badlogic.gdx.graphics.g2d.TextureRegion r2) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0._angle = r1
            r0._loadingSpinnerTRRef = r2
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._mcToReadFromRef = r0
            r1._loadingSpinnerTRRef = r0
            r1._statusLabel = r0
            super.dispose()
            return
    }

    public void initialize() {
            r5 = this;
            java.lang.String r0 = "isSavingMCTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "isSavingMCInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r5.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            r0.width(r2)
            r5.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r2)
            com.badlogic.gdx.graphics.Color r2 = r0.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r3 = r3.fontColor
            r2.set(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "isSavingMCWarning1"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r2.<init>(r3, r0)
            r2.setWrap(r1)
            r2.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r5.addContent(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            r0.width(r2)
            r5.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = "isSavingMCWarning2"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r2, r3)
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r5.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            r0.width(r2)
            r5.addContentRow()
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipIsSavingDialog$1 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipIsSavingDialog$1
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r5._loadingSpinnerTRRef
            r0.<init>(r5, r2)
            float r2 = r0.getWidth()
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r3
            float r4 = r0.getHeight()
            float r4 = r4 * r3
            r0.setOrigin(r2, r4)
            r5.addContent(r0)
            r5.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            java.lang.String r3 = ""
            r0.<init>(r3, r2)
            r5._statusLabel = r0
            r2 = 0
            r0.setWrap(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r5._statusLabel
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r5._statusLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r5.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            r0.width(r1)
            return
    }

    public void setMCToReadFrom(org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1) {
            r0 = this;
            r0._mcToReadFromRef = r1
            return
    }
}
