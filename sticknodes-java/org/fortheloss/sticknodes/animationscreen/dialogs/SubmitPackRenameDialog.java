package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class SubmitPackRenameDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private java.lang.String _authorName;
    private java.lang.String _category;
    private java.lang.String _copiedText;
    private java.lang.String _description;
    private java.lang.String[] _filepaths;
    private java.lang.String _hashtag1;
    private java.lang.String _hashtag2;
    private java.lang.String _hashtag3;
    private com.badlogic.gdx.scenes.scene2d.ui.Label[] _labels;
    private java.lang.String _stickfigureName;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField[] _textfields;





    /* renamed from: -$$Nest$fget_copiedText, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m642$$Nest$fget_copiedText(org.fortheloss.sticknodes.animationscreen.dialogs.SubmitPackRenameDialog r0) {
            java.lang.String r0 = r0._copiedText
            return r0
    }

    /* renamed from: -$$Nest$fput_copiedText, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m643$$Nest$fput_copiedText(org.fortheloss.sticknodes.animationscreen.dialogs.SubmitPackRenameDialog r0, java.lang.String r1) {
            r0._copiedText = r1
            return
    }

    public SubmitPackRenameDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r12) {
            r11 = this;
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            r0 = 0
            if (r12 == 0) goto Lf2
            java.lang.String[] r12 = r11._filepaths
            int r12 = r12.length
            r1 = 0
            r2 = 0
        Le:
            if (r1 >= r12) goto L84
            com.badlogic.gdx.scenes.scene2d.ui.TextField[] r3 = r11._textfields
            r3 = r3[r1]
            java.lang.String r3 = r3.getText()
            int r4 = r3.length()
            r5 = 1
            if (r4 > 0) goto L34
            com.badlogic.gdx.scenes.scene2d.ui.Label[] r2 = r11._labels
            r2 = r2[r1]
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = r2.getStyle()
            com.badlogic.gdx.graphics.Color r2 = r2.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r3 = r3.fontColor
            r2.set(r3)
        L32:
            r2 = 1
            goto L81
        L34:
            java.lang.String r4 = r3.trim()
            int r4 = r4.length()
            if (r4 > 0) goto L52
            com.badlogic.gdx.scenes.scene2d.ui.Label[] r2 = r11._labels
            r2 = r2[r1]
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = r2.getStyle()
            com.badlogic.gdx.graphics.Color r2 = r2.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r3 = r3.fontColor
            r2.set(r3)
            goto L32
        L52:
            java.lang.String r4 = ".*[a-zA-Z0-9]+.*"
            boolean r3 = r3.matches(r4)
            if (r3 != 0) goto L6e
            com.badlogic.gdx.scenes.scene2d.ui.Label[] r2 = r11._labels
            r2 = r2[r1]
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = r2.getStyle()
            com.badlogic.gdx.graphics.Color r2 = r2.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r3 = r3.fontColor
            r2.set(r3)
            goto L32
        L6e:
            com.badlogic.gdx.scenes.scene2d.ui.Label[] r3 = r11._labels
            r3 = r3[r1]
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = r3.getStyle()
            com.badlogic.gdx.graphics.Color r3 = r3.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            com.badlogic.gdx.graphics.Color r4 = r4.fontColor
            r3.set(r4)
        L81:
            int r1 = r1 + 1
            goto Le
        L84:
            if (r2 == 0) goto L92
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r12 = r11.getDialogScrollPane()
            r0 = 0
            r12.setScrollY(r0)
            r11.doNotHideDialog()
            return
        L92:
            java.lang.String[] r3 = new java.lang.String[r12]
            r1 = 0
        L95:
            if (r1 >= r12) goto Lb5
            com.badlogic.gdx.scenes.scene2d.ui.TextField[] r2 = r11._textfields
            r2 = r2[r1]
            java.lang.String r2 = r2.getText()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = ".nodes"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3[r1] = r2
            int r1 = r1 + 1
            goto L95
        Lb5:
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            java.lang.String[] r2 = r11._filepaths
            java.lang.String r4 = r11._authorName
            java.lang.String r5 = r11._stickfigureName
            java.lang.String r6 = r11._category
            java.lang.String r7 = r11._description
            java.lang.String r8 = r11._hashtag1
            java.lang.String r9 = r11._hashtag2
            java.lang.String r10 = r11._hashtag3
            int r12 = r1.emailStickfigureSubmission(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 2
            java.lang.String r2 = "errorSubmittingTitle"
            if (r12 != r1) goto Le0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r11._animationScreenRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r2 = "errorSubmittingInfo"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r12.showErrorDialog(r1, r2)
            goto Lf2
        Le0:
            r1 = 3
            if (r12 != r1) goto Lf2
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r11._animationScreenRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r2 = "errorSubmittingInfo3"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r12.showErrorDialog(r1, r2)
        Lf2:
            com.badlogic.gdx.Input r12 = com.badlogic.gdx.Gdx.input
            r12.setOnscreenKeyboardVisible(r0)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._filepaths = r0
            r1._authorName = r0
            r1._stickfigureName = r0
            r1._category = r0
            r1._description = r0
            r1._hashtag1 = r0
            r1._hashtag2 = r0
            r1._hashtag3 = r0
            r1._textfields = r0
            r1._labels = r0
            r1._copiedText = r0
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r7, java.lang.String[] r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
            r6 = this;
            java.lang.String r0 = "packRenameTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            r6._filepaths = r8
            r6._authorName = r9
            r6._stickfigureName = r10
            r6._category = r11
            r6._description = r12
            r6._hashtag1 = r13
            r6._hashtag2 = r14
            r6._hashtag3 = r15
            int r9 = r8.length
            com.badlogic.gdx.scenes.scene2d.ui.TextField[] r10 = new com.badlogic.gdx.scenes.scene2d.ui.TextField[r9]
            r6._textfields = r10
            com.badlogic.gdx.scenes.scene2d.ui.Label[] r10 = new com.badlogic.gdx.scenes.scene2d.ui.Label[r9]
            r6._labels = r10
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            r11 = 1092616192(0x41200000, float:10.0)
            float r10 = r10 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Label r12 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r13 = "packRenameInfo1"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r14 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r12.<init>(r13, r14)
            r13 = 1
            r12.setWrap(r13)
            r12.setAlignment(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r6.addContent(r12)
            int r14 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r14 = (float) r14
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.width(r14)
            r14 = 2
            r12.colspan(r14)
            r6.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r12 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = "packRenameInfo2"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1)
            r12.<init>(r15, r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = r12.getStyle()
            com.badlogic.gdx.graphics.Color r15 = r15.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r15.set(r0)
            r12.setWrap(r13)
            r12.setAlignment(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r6.addContent(r12)
            int r15 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r15 = (float) r15
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.width(r15)
            r12.colspan(r14)
            r6.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r12 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = "bad"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            java.lang.String r15 = ":\nstickfigu_leg-1 (1)\nstickFIGure LEG (2) (fix)\nstick_stickfigure better Body\nmy head for stickfigure"
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r12.<init>(r15, r0)
            r12.setWrap(r13)
            r12.setAlignment(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r6.addContent(r12)
            int r15 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r15 = (float) r15
            r0 = 1056964608(0x3f000000, float:0.5)
            float r15 = r15 * r0
            r12.width(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label r12 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = "good"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            java.lang.String r15 = ":\nStickfigure Leg 1\nStickfigure Leg 2\nStickfigure Body\nStickfigure Head"
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r12.<init>(r15, r1)
            r12.setWrap(r13)
            r12.setAlignment(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r6.addContent(r12)
            int r15 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r15 = (float) r15
            float r15 = r15 * r0
            r12.width(r15)
            r6.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r12 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = "packRenameBadText"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r2)
            r12.<init>(r15, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = r12.getStyle()
            com.badlogic.gdx.graphics.Color r15 = r15.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r1 = r1.fontColor
            r15.set(r1)
            r12.setWrap(r13)
            r12.setAlignment(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r6.addContent(r12)
            int r15 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r15 = (float) r15
            float r15 = r15 * r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.width(r15)
            r12.align(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Label r12 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = "packRenameGoodText"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r2)
            r12.<init>(r15, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = r12.getStyle()
            com.badlogic.gdx.graphics.Color r15 = r15.fontColor
            com.badlogic.gdx.graphics.Color r1 = org.fortheloss.sticknodes.App.COLOR_GREEN
            r15.set(r1)
            r12.setWrap(r13)
            r12.setAlignment(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r6.addContent(r12)
            int r15 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r15 = (float) r15
            float r15 = r15 * r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.width(r15)
            r12.align(r14)
            r6.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r12 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = "packRenameInfo4"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r12.<init>(r15, r0)
            r12.setWrap(r13)
            r12.setAlignment(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r6.addContent(r12)
            int r15 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r15 = (float) r15
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.width(r15)
            r12.colspan(r14)
            r6.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Image r12 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r15 = "separator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r0 = r7.findRegion(r15)
            r12.<init>(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r6.addContent(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.colspan(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.padTop(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.padBottom(r10)
            r12.fillX()
            r6.addContentRow()
            r12 = 0
        L1ba:
            if (r12 >= r9) goto L300
            r0 = r8[r12]
            java.lang.String r1 = java.io.File.separator
            int r2 = r0.lastIndexOf(r1)
            int r2 = r2 + r13
            java.lang.String r2 = r0.substring(r2)
            int r1 = r0.lastIndexOf(r1)
            int r1 = r1 + r13
            r3 = 46
            int r3 = r0.lastIndexOf(r3)
            java.lang.String r0 = r0.substring(r1, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "rename"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = " \""
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = "\" ?"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r3.<init>(r4)
            r1.<init>(r2, r3)
            r1.setWrap(r13)
            r2 = 8
            r1.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r6.addContent(r1)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.width(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r3.align(r2)
            r2.colspan(r14)
            r6.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r2.<init>()
            r3 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r2.pad(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r4.pad(r3)
            r3.space(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r6.addContent(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.colspan(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.expandX()
            r3.fillX()
            r6.addContentRow()
            r3 = 128(0x80, float:1.794E-43)
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r4 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r4.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r6.createTextField(r0, r3, r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.SubmitPackRenameDialog$1 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.SubmitPackRenameDialog$1
            r3.<init>(r6)
            r0.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r2.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.fillX()
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r4 = (float) r4
            r3.height(r4)
            java.lang.String r3 = "copy"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r6.createTextButton(r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.SubmitPackRenameDialog$2 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.SubmitPackRenameDialog$2
            r4.<init>(r6, r0)
            r3.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r2.add(r3)
            float r3 = r3.getWidth()
            r5 = 1061158912(0x3f400000, float:0.75)
            float r3 = r3 * r5
            r4.width(r3)
            java.lang.String r3 = "paste"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r6.createTextButton(r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.SubmitPackRenameDialog$3 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.SubmitPackRenameDialog$3
            r4.<init>(r6, r0)
            r3.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r2.add(r3)
            float r3 = r3.getWidth()
            float r3 = r3 * r5
            r4.width(r3)
            java.lang.String r3 = "clear"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r6.createTextButton(r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.SubmitPackRenameDialog$4 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.SubmitPackRenameDialog$4
            r4.<init>(r6, r0)
            r3.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r3)
            float r3 = r3.getWidth()
            float r3 = r3 * r5
            r2.width(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label[] r2 = r6._labels
            r2[r12] = r1
            com.badlogic.gdx.scenes.scene2d.ui.TextField[] r1 = r6._textfields
            r1[r12] = r0
            int r0 = r9 + (-1)
            if (r12 == r0) goto L2fc
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r7.findRegion(r15)
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r6.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r10)
            r0.fillX()
            r6.addContentRow()
        L2fc:
            int r12 = r12 + 1
            goto L1ba
        L300:
            org.fortheloss.framework.SizeWidget r7 = new org.fortheloss.framework.SizeWidget
            r8 = 1145569280(0x44480000, float:800.0)
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r8
            r7.<init>(r11, r9)
            r6.addContent(r7)
            java.lang.String r7 = "submitPack"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = r6.createTextButton(r7)
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r6.addButton(r7, r8)
            java.lang.String r7 = "cancel"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = r6.createTextButton(r7)
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r6.addButton(r7, r8)
            return
    }
}
