package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class PreSubmitStickfigureFormDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private com.badlogic.gdx.graphics.Texture mTexture1;
    private com.badlogic.gdx.graphics.Texture mTexture2;
    private com.badlogic.gdx.graphics.Texture mTexture3;

    public PreSubmitStickfigureFormDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r3) {
            r2 = this;
            super.dialogResult(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0 = 1
            if (r3 != r0) goto L13
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            r0 = 0
            r3.showSubmitStickfigureFormDialog(r0)
            goto L1b
        L13:
            r1 = 2
            if (r3 != r1) goto L1b
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            r3.showSubmitStickfigureFormDialog(r0)
        L1b:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            super.dispose()
            com.badlogic.gdx.graphics.Texture r0 = r2.mTexture1
            r1 = 0
            if (r0 == 0) goto Ld
            r0.dispose()
            r2.mTexture1 = r1
        Ld:
            com.badlogic.gdx.graphics.Texture r0 = r2.mTexture2
            if (r0 == 0) goto L16
            r0.dispose()
            r2.mTexture2 = r1
        L16:
            com.badlogic.gdx.graphics.Texture r0 = r2.mTexture3
            if (r0 == 0) goto L1f
            r0.dispose()
            r2.mTexture3 = r1
        L1f:
            return
    }

    public void initialize(org.fortheloss.framework.Assets r14) {
            r13 = this;
            java.lang.String r0 = "presubmitTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r13._animationScreenRef
            org.fortheloss.framework.Assets r0 = r0.getAssets()
            java.lang.String r1 = org.fortheloss.sticknodes.App.animationMenuAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r2 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            r3 = 1
            java.lang.Object r0 = r0.get(r1, r2, r3)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r0 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r13.getTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.defaults()
            r2 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.uniform(r2, r2)
            r1.expand(r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = "presubmitSummary"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r1.<init>(r2, r4)
            r1.setWrap(r3)
            r1.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r13.addContent(r1)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            r4 = 1069547520(0x3fc00000, float:1.5)
            float r2 = r2 * r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.width(r2)
            r2 = 2
            r1.colspan(r2)
            r13.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r5 = "presubmitTitle1"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r1.<init>(r5, r6)
            r1.setWrap(r3)
            r1.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r13.addContent(r1)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r5 = (float) r5
            float r5 = r5 * r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.width(r5)
            r1.colspan(r2)
            r13.addContentRow()
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            r5 = 1058642330(0x3f19999a, float:0.6)
            float r1 = r1 * r5
            com.badlogic.gdx.graphics.Texture r5 = new com.badlogic.gdx.graphics.Texture
            java.lang.String r6 = org.fortheloss.sticknodes.App.submitExampleMovieclipTexture
            com.badlogic.gdx.files.FileHandle r6 = r14.getPathFromResolutionFolder(r6)
            r5.<init>(r6)
            r13.mTexture1 = r5
            com.badlogic.gdx.scenes.scene2d.ui.Image r6 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r6.<init>(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r13.addContent(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.width(r1)
            float r7 = r6.getHeight()
            float r6 = r6.getWidth()
            float r7 = r7 / r6
            float r7 = r7 * r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.height(r7)
            r5.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.fillX()
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            r8 = 1109393408(0x42200000, float:40.0)
            float r7 = r7 * r8
            r6.space(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r13.addContent(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.align(r2)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            r9 = 1101004800(0x41a00000, float:20.0)
            float r7 = r7 * r9
            r6.padLeft(r7)
            r13.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r7 = "presubmitMovieclip1"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r6.<init>(r7, r10)
            r6.setWrap(r3)
            r7 = 8
            r6.setAlignment(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.add(r6)
            r6.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r10 = "presubmitMovieclip2"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r11 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r6.<init>(r10, r11)
            r6.setWrap(r3)
            r6.setAlignment(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.add(r6)
            r6.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r10 = "presubmitThumb1"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r11 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r12 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r11.<init>(r12)
            r6.<init>(r10, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r10 = r6.getStyle()
            com.badlogic.gdx.graphics.Color r10 = r10.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r11 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r11 = r11.fontColor
            r10.set(r11)
            r6.setWrap(r3)
            r6.setAlignment(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.fillX()
            r5.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r6 = "separator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r10 = r0.findRegion(r6)
            r5.<init>(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r13.addContent(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.colspan(r2)
            int r10 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r10 = (float) r10
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.padTop(r10)
            r5.fillX()
            r13.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r10 = "presubmitTitle2"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r11 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r5.<init>(r10, r11)
            r5.setWrap(r3)
            r5.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r13.addContent(r5)
            int r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r10 = (float) r10
            float r10 = r10 * r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.width(r10)
            r5.colspan(r2)
            r13.addContentRow()
            com.badlogic.gdx.graphics.Texture r5 = new com.badlogic.gdx.graphics.Texture
            java.lang.String r10 = org.fortheloss.sticknodes.App.submitExamplePackTexture
            com.badlogic.gdx.files.FileHandle r10 = r14.getPathFromResolutionFolder(r10)
            r5.<init>(r10)
            r13.mTexture2 = r5
            com.badlogic.gdx.scenes.scene2d.ui.Image r10 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r10.<init>(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r13.addContent(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.width(r1)
            float r11 = r10.getHeight()
            float r10 = r10.getWidth()
            float r11 = r11 / r10
            float r11 = r11 * r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r5.height(r11)
            r1.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.fillX()
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            float r10 = r10 * r8
            r5.space(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r13.addContent(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.align(r2)
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r9
            r5.padLeft(r8)
            r13.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r8 = "presubmitPack1"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r5.<init>(r8, r9)
            r5.setWrap(r3)
            r5.setAlignment(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r1.add(r5)
            r5.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r8 = "presubmitPack2"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r5.<init>(r8, r9)
            r5.setWrap(r3)
            r5.setAlignment(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r1.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.fillX()
            r5.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r8 = "presubmitThumb2"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r9.<init>(r10)
            r5.<init>(r8, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r8 = r5.getStyle()
            com.badlogic.gdx.graphics.Color r8 = r8.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r9 = r9.fontColor
            r8.set(r9)
            r5.setWrap(r3)
            r5.setAlignment(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.fillX()
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r0 = r0.findRegion(r6)
            r1.<init>(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r13.addContent(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r2)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            r0.fillX()
            r13.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "submissionGuidelinesThumbnail"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r0.<init>(r1, r5)
            r0.setWrap(r3)
            r0.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r13.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            float r1 = r1 * r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            r0.colspan(r2)
            r13.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "submissionGuidelinesInfo3"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r0.<init>(r1, r5)
            r0.setWrap(r3)
            r0.setAlignment(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r13.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            float r1 = r1 * r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            r0.colspan(r2)
            r13.addContentRow()
            com.badlogic.gdx.graphics.Texture r0 = new com.badlogic.gdx.graphics.Texture
            java.lang.String r1 = org.fortheloss.sticknodes.App.submitThumbnailInstructionsTexture
            com.badlogic.gdx.files.FileHandle r14 = r14.getPathFromResolutionFolder(r1)
            r0.<init>(r14)
            r13.mTexture3 = r0
            com.badlogic.gdx.scenes.scene2d.ui.Image r14 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r14.<init>(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r13.addContent(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.align(r3)
            r14.colspan(r2)
            java.lang.String r14 = "cancel"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "< "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r14 = r13.createTextButton(r14)
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13.addButton(r14, r0)
            java.lang.String r14 = "submitMovieclipButton"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            java.lang.String r14 = " >"
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r13.createTextButton(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r13.addButton(r0, r1)
            java.lang.String r0 = "submitSinglePackButton"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r14 = r13.createTextButton(r14)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r13.addButton(r14, r0)
            return
    }
}
