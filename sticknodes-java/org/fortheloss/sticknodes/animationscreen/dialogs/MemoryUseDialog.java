package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class MemoryUseDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    public MemoryUseDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private java.lang.String comma(long r3) {
            r2 = this;
            java.util.Locale r0 = java.util.Locale.US
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 0
            r1[r4] = r3
            java.lang.String r3 = "%,d"
            java.lang.String r3 = java.lang.String.format(r0, r3, r1)
            return r3
    }

    private com.badlogic.gdx.scenes.scene2d.ui.Label smallLabel(java.lang.String r3, int r4) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r3, r1)
            r3 = 1
            r0.setWrap(r3)
            r0.setAlignment(r4)
            return r0
    }

    public void initialize(org.fortheloss.sticknodes.data.SessionMemoryData r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            int r4 = r1.memoryMB
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "memoryUsageTitle"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r4, r3)
            super.initialize(r3)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r0._animationScreenRef
            org.fortheloss.framework.Assets r3 = r3.getAssets()
            java.lang.String r4 = org.fortheloss.sticknodes.App.animationMenuAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r6 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            java.lang.Object r3 = r3.get(r4, r6, r2)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r3 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r3
            java.lang.String r4 = "memoryUsageInfo1"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            int r6 = r1.maxMemoryMB
            java.lang.String r7 = "mb"
            java.lang.String r8 = "\n\n"
            if (r6 <= 0) goto L72
            java.lang.Object[] r9 = new java.lang.Object[r2]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9[r5] = r6
            java.lang.String r6 = "memoryUsageInfo2"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            r9.append(r8)
            r9.append(r6)
            java.lang.String r4 = r9.toString()
            int r6 = r1.maxMemoryMB
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = " / "
            r10.append(r11)
            r10.append(r6)
            r10.append(r9)
            java.lang.String r6 = r10.toString()
            goto L74
        L72:
            java.lang.String r6 = ""
        L74:
            java.lang.String r9 = "memoryUsageInfo3"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r4)
            java.lang.String r4 = "\n"
            r10.append(r4)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r10 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r11 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r10.<init>(r9, r11)
            r10.setWrap(r2)
            r10.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r0.addContent(r10)
            int r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r10 = (float) r10
            r9.width(r10)
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Image r9 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r10 = "separator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r3.findRegion(r10)
            r9.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r0.addContent(r9)
            r11 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.colspan(r11)
            int r12 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r12 = (float) r12
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.padTop(r12)
            r9.fillX()
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r9.defaults()
            r13 = 1101004800(0x41a00000, float:20.0)
            float r14 = org.fortheloss.sticknodes.App.assetScaling
            float r14 = r14 * r13
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.space(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.uniform(r5, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.expand(r2, r5)
            r12.fill(r2, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r0.addContent(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r12.expandX()
            r12.fillX()
            r17.addContentRow()
            java.lang.String r12 = "totalMemoryUsage"
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r12)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            java.lang.String r12 = ":"
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            r14 = 16
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = r0.smallLabel(r13, r14)
            r9.add(r13)
            int r13 = r1.memoryMB
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r13)
            r11.append(r15)
            r11.append(r6)
            java.lang.String r6 = r11.toString()
            r11 = 8
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r0.smallLabel(r6, r11)
            r9.add(r6)
            r9.row()
            java.lang.String r6 = "frames"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r6)
            r13.append(r12)
            java.lang.String r6 = r13.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r0.smallLabel(r6, r14)
            r9.add(r6)
            int r6 = r1.numFrames
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r6)
            java.lang.String r6 = r13.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r0.smallLabel(r6, r11)
            r9.add(r6)
            r9.row()
            java.lang.String r6 = "nodesProject"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r6)
            r13.append(r12)
            java.lang.String r6 = r13.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r0.smallLabel(r6, r14)
            r9.add(r6)
            long r5 = r1.numNodesInProjectFrames
            java.lang.String r5 = r0.comma(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r0.smallLabel(r5, r11)
            r9.add(r5)
            r9.row()
            java.lang.String r5 = "nodesMCs"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r12)
            java.lang.String r5 = r6.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r0.smallLabel(r5, r14)
            r9.add(r5)
            long r5 = r1.numNodesInMovieclipFrames
            java.lang.String r5 = r0.comma(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r0.smallLabel(r5, r11)
            r9.add(r5)
            r9.row()
            java.lang.String r5 = "importedStickfigures"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r12)
            java.lang.String r5 = r6.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r0.smallLabel(r5, r14)
            r9.add(r5)
            int r5 = r1.numStickfigures
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r0.smallLabel(r5, r11)
            r9.add(r5)
            r9.row()
            java.lang.String r5 = "importedMovieclips"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r12)
            java.lang.String r5 = r6.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r0.smallLabel(r5, r14)
            r9.add(r5)
            int r5 = r1.numMovieclips
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r0.smallLabel(r5, r11)
            r9.add(r5)
            r9.row()
            java.lang.String r5 = "importedSounds"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r12)
            java.lang.String r5 = r6.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r0.smallLabel(r5, r14)
            r9.add(r5)
            int r5 = r1.numSounds
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r0.smallLabel(r5, r11)
            r9.add(r5)
            r9.row()
            java.lang.String r5 = "soundMemoryData"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r12)
            java.lang.String r5 = r6.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r0.smallLabel(r5, r14)
            r9.add(r5)
            java.util.Locale r5 = java.util.Locale.US
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r16 = r3
            long r2 = r1.soundsMB
            float r2 = (float) r2
            r3 = 1149239296(0x44800000, float:1024.0)
            float r2 = r2 / r3
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r3 = 0
            r6[r3] = r2
            java.lang.String r2 = "%.2f"
            java.lang.String r2 = java.lang.String.format(r5, r2, r6)
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0.smallLabel(r2, r11)
            r9.add(r2)
            r9.row()
            java.lang.String r2 = "importedFonts"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r12)
            java.lang.String r2 = r3.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0.smallLabel(r2, r14)
            r9.add(r2)
            int r2 = r1.numFonts
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0.smallLabel(r2, r11)
            r9.add(r2)
            r9.row()
            java.lang.String r2 = "importedSprites"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r12)
            java.lang.String r2 = r3.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0.smallLabel(r2, r14)
            r9.add(r2)
            int r2 = r1.numSprites
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0.smallLabel(r2, r11)
            r9.add(r2)
            r9.row()
            java.lang.String r2 = "spritePixels"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r12)
            java.lang.String r2 = r3.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0.smallLabel(r2, r14)
            r9.add(r2)
            long r2 = r1.numSpritePixels
            java.lang.String r2 = r0.comma(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0.smallLabel(r2, r11)
            r9.add(r2)
            r9.row()
            java.lang.String r2 = "spriteMemoryData"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r12)
            java.lang.String r2 = r3.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0.smallLabel(r2, r14)
            r9.add(r2)
            int r2 = r1.numSpritesWithDataInMemory
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0.smallLabel(r2, r11)
            r9.add(r2)
            int r2 = r1.numSprites
            if (r2 <= 0) goto L433
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            long r5 = r1.numSpritePixels
            java.lang.String r2 = r0.comma(r5)
            r5 = 0
            r3[r5] = r2
            java.lang.String r2 = "memorySpritesInfo1"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2, r3)
            java.lang.String r3 = "memorySpritesInfo2"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r4)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            java.lang.String r3 = "memorySpritesInfo3"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r8)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            java.lang.String r3 = "memorySpritesInfo4"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r8)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r1 = r1.numSpritesWithDataInMemory
            long r5 = (long) r1
            java.lang.String r1 = r0.comma(r5)
            r3 = 0
            r4[r3] = r1
            java.lang.String r1 = "memorySpritesInfo5"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r8)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r3.<init>(r4)
            r2.<init>(r1, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = r2.getStyle()
            com.badlogic.gdx.graphics.Color r1 = r1.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r3 = r3.fontColor
            r1.set(r3)
            r1 = 1
            r2.setWrap(r1)
            r2.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.addContent(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            r1.width(r2)
            r17.addContentRow()
        L433:
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            r3 = r16
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r3.findRegion(r10)
            r1.<init>(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.addContent(r1)
            r2 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padTop(r2)
            r1.fillX()
            r17.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = "protips"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r1.<init>(r2, r3)
            r2 = 1
            r1.setWrap(r2)
            r1.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.addContent(r1)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            r1.width(r2)
            r17.addContentRow()
            java.lang.String r1 = "memoryUsageInfo4"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r2 = "memoryUsageInfo5"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r8)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "memoryUsageInfo6"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r8)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "memoryUsageInfo7"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r8)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r1, r3)
            r1 = 1
            r2.setWrap(r1)
            r2.setAlignment(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.addContent(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            r1.width(r2)
            java.lang.String r1 = "okay"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0.createTextButton(r1)
            r2 = 0
            r0.addButton(r1, r2)
            return
    }
}
