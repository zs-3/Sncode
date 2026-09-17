package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class BackgroundQualityDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private int _quality;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _qualityHighButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _qualityNormalButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _qualityVeryHighButton;




    /* renamed from: -$$Nest$fput_quality, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m368$$Nest$fput_quality(org.fortheloss.sticknodes.animationscreen.dialogs.BackgroundQualityDialog r0, int r1) {
            r0._quality = r1
            return
    }

    public BackgroundQualityDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0._quality = r1
            return
    }

    protected void continueLoading() {
            r0 = this;
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r1) {
            r0 = this;
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lb
            r0.continueLoading()
        Lb:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._qualityNormalButton = r0
            r1._qualityHighButton = r0
            r1._qualityVeryHighButton = r0
            super.dispose()
            return
    }

    public int getQuality() {
            r1 = this;
            int r0 = r1._quality
            return r0
    }

    public void initialize() {
            r5 = this;
            java.lang.String r0 = "backgroundQualityTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "backgroundQualityInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r5.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r2)
            r2 = 3
            r0.colspan(r2)
            r5.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r5._qualityNormalButton = r0
            org.fortheloss.sticknodes.animationscreen.dialogs.BackgroundQualityDialog$1 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.BackgroundQualityDialog$1
            r3.<init>(r5)
            r0.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r5._qualityNormalButton
            r5.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r5._qualityHighButton = r0
            org.fortheloss.sticknodes.animationscreen.dialogs.BackgroundQualityDialog$2 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.BackgroundQualityDialog$2
            r3.<init>(r5)
            r0.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r5._qualityHighButton
            r5.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r5._qualityVeryHighButton = r0
            org.fortheloss.sticknodes.animationscreen.dialogs.BackgroundQualityDialog$3 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.BackgroundQualityDialog$3
            r3.<init>(r5)
            r0.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r5._qualityVeryHighButton
            r5.addContent(r0)
            r5.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r0 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r2 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r2]
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r5._qualityNormalButton
            r4 = 0
            r2[r4] = r3
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r5._qualityHighButton
            r2[r1] = r3
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r5._qualityVeryHighButton
            r4 = 2
            r2[r4] = r3
            r0.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r5._qualityNormalButton
            r0.setChecked(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = "normal"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r2, r3)
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r5.addContent(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = "high"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r2, r3)
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r5.addContent(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = "veryHigh"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r2, r3)
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r5.addContent(r0)
            r0.fillX()
            java.lang.String r0 = "loadBGImage"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r5.createTextButton(r0)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r5.addButton(r0, r1)
            java.lang.String r0 = "cancel"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r5.createTextButton(r0)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r5.addButton(r0, r1)
            return
    }
}
