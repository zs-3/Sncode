package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class AnimationToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private org.fortheloss.sticknodes.animationscreen.FramesContainer _framesContainerRef;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _fullscreenButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _lagExpandLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _lagLabel;
    private boolean _lagLabelExpanded;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _loopButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _showFiltersButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _titleLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _tweenButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _tweenLoopProtectionButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _tweenLoopProtectionHelpButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _tweeningInformationLabel;
    private org.fortheloss.framework.LabelInputIncrementField mFpsField;
    private org.fortheloss.framework.LabelInputIncrementField mTweenedFramesField;













    /* renamed from: -$$Nest$monFullscreenClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m850$$Nest$monFullscreenClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r0) {
            r0.onFullscreenClick()
            return
    }

    /* renamed from: -$$Nest$monLoopClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m851$$Nest$monLoopClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r0) {
            r0.onLoopClick()
            return
    }

    /* renamed from: -$$Nest$monShowFiltersClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m852$$Nest$monShowFiltersClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r0) {
            r0.onShowFiltersClick()
            return
    }

    /* renamed from: -$$Nest$monTweenClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m853$$Nest$monTweenClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r0) {
            r0.onTweenClick()
            return
    }

    /* renamed from: -$$Nest$monTweenLoopProtectionClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m854$$Nest$monTweenLoopProtectionClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r0) {
            r0.onTweenLoopProtectionClick()
            return
    }

    /* renamed from: -$$Nest$monTweenLoopProtectionQuestionClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m855$$Nest$monTweenLoopProtectionQuestionClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r0) {
            r0.onTweenLoopProtectionQuestionClick()
            return
    }

    /* renamed from: -$$Nest$mtoggleLagLabel, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m856$$Nest$mtoggleLagLabel(org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r0) {
            r0.toggleLagLabel()
            return
    }

    public AnimationToolTable(org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r1, org.fortheloss.sticknodes.data.ProjectData r2, org.fortheloss.sticknodes.data.SessionData r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 1
            r0._lagLabelExpanded = r1
            return
    }

    private void onFullscreenClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._fullscreenButton
            boolean r1 = r1.isChecked()
            r0.setPlayFullscreen(r1)
            return
    }

    private void onLoopClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = (org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule) r0
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._loopButton
            boolean r1 = r1.isChecked()
            r0.setLoop(r1)
            return
    }

    private void onShowFiltersClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._showFiltersButton
            boolean r1 = r1.isChecked()
            r0.setShowFilters(r1)
            return
    }

    private void onTweenClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._tweenButton
            boolean r1 = r1.isChecked()
            r0.setTweening(r1)
            return
    }

    private void onTweenLoopProtectionClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = (org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule) r0
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._tweenLoopProtectionButton
            boolean r1 = r1.isChecked()
            r0.setTweenLoopProtection(r1)
            return
    }

    private void onTweenLoopProtectionQuestionClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = (org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule) r0
            r0.showTweenLoopProtectionDialog()
            return
    }

    private void toggleLagLabel() {
            r6 = this;
            boolean r0 = r6._lagLabelExpanded
            java.lang.String r1 = "]"
            java.lang.String r2 = "["
            java.lang.String r3 = "expLag1"
            if (r0 == 0) goto L34
            r0 = 0
            r6._lagLabelExpanded = r0
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r6._lagLabel
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r0.setText(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r6._lagExpandLabel
            java.lang.String r3 = "more"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.setText(r1)
            goto L77
        L34:
            r0 = 1
            r6._lagLabelExpanded = r0
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r6._lagLabel
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.String r4 = "expLag2"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = "\n"
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            r0.setText(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r6._lagExpandLabel
            java.lang.String r3 = "less"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.setText(r1)
        L77:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._framesContainerRef = r0
            r2._titleLabel = r0
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mFpsField
            if (r1 == 0) goto Le
            r1.dispose()
            r2.mFpsField = r0
        Le:
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mTweenedFramesField
            if (r1 == 0) goto L17
            r1.dispose()
            r2.mTweenedFramesField = r0
        L17:
            r2._showFiltersButton = r0
            r2._fullscreenButton = r0
            r2._tweenButton = r0
            r2._loopButton = r0
            r2._tweenLoopProtectionButton = r0
            r2._tweenLoopProtectionHelpButton = r0
            r2._tweeningInformationLabel = r0
            r2._lagLabel = r0
            r2._lagExpandLabel = r0
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r17, com.badlogic.gdx.scenes.scene2d.utils.Drawable r18, boolean r19) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            super.initialize(r2)
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r2 = r0.mAnimationBasedModuleRef
            boolean r2 = r2 instanceof org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule
            java.lang.String r3 = "animationTools"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r5 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r3, r5, r4)
            r0._titleLabel = r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r0.add(r3)
            r4 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.colspan(r4)
            r3.fillX()
            r16.row()
            org.fortheloss.sticknodes.animationscreen.modules.Module r3 = r16.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r3.getContext()
            org.fortheloss.sticknodes.data.SessionData r3 = r3.getSessionData()
            boolean r3 = r3.getNerdModeEnabled()
            java.lang.String r6 = "separator"
            if (r3 != 0) goto L84
            if (r2 != 0) goto L84
            java.lang.String r3 = "mcAnimationInfo"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r3, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r0.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.colspan(r4)
            r3.fillX()
            r16.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r1.findRegion(r6)
            r3.<init>(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r0.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.colspan(r4)
            int r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r7 = (float) r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.padTop(r7)
            int r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r7 = (float) r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.padBottom(r7)
            r3.fillX()
            r16.row()
        L84:
            org.fortheloss.framework.LabelInputIncrementField r3 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r7 = r16.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r8 = r7.getContext()
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r15 = 0
            r7[r15] = r9
            r9 = 60
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7[r5] = r9
            java.lang.String r9 = "animationFPS"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9, r7)
            r11 = 2
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 1114636288(0x42700000, float:60.0)
            r14 = 0
            java.lang.String r10 = "10"
            r7 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r0.mFpsField = r3
            if (r19 == 0) goto Lb8
            r3.setIncrementButtonVisibilityPermanent(r5)
        Lb8:
            org.fortheloss.framework.LabelInputIncrementField r3 = r0.mFpsField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable$1 r7 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable$1
            r7.<init>(r0)
            r3.setFieldListener(r7)
            org.fortheloss.framework.LabelInputIncrementField r3 = r0.mFpsField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r0.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.colspan(r4)
            r3.fillX()
            r16.row()
            org.fortheloss.sticknodes.animationscreen.modules.Module r3 = r16.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r3.getContext()
            org.fortheloss.sticknodes.data.SessionData r3 = r3.getSessionData()
            boolean r3 = r3.getNerdModeEnabled()
            if (r3 != 0) goto L19d
            if (r19 == 0) goto L19d
            r0._lagLabelExpanded = r5
            java.lang.String r3 = "expLag1"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.String r7 = "expLag2"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r3)
            java.lang.String r3 = "\n"
            r8.append(r3)
            r8.append(r7)
            java.lang.String r3 = r8.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r3, r5, r7)
            r0._lagLabel = r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r0.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.colspan(r4)
            r3.fillX()
            r16.row()
            java.lang.String r3 = "less"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "["
            r7.append(r8)
            r7.append(r3)
            java.lang.String r3 = "]"
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r7 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r7.<init>(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r3, r5, r7)
            r0._lagExpandLabel = r3
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = r3.getStyle()
            com.badlogic.gdx.graphics.Color r3 = r3.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.graphics.Color r7 = r7.fontColor
            r3.set(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r0._lagExpandLabel
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable$2 r7 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable$2
            r7.<init>(r0)
            r3.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r0._lagExpandLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r0.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.colspan(r4)
            r3.fillX()
            r16.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r1.findRegion(r6)
            r3.<init>(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r0.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.colspan(r4)
            int r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r7 = (float) r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.padTop(r7)
            int r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r7 = (float) r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.padBottom(r7)
            r3.fillX()
            r16.row()
        L19d:
            if (r19 == 0) goto L1d7
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            boolean r3 = r3.isPro()
            if (r3 == 0) goto L1d7
            java.lang.String r3 = "showFilters"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r3, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r0.add(r3)
            r3.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r3)
            r0._showFiltersButton = r3
            r3.setChecked(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r0._showFiltersButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable$3 r7 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable$3
            r7.<init>(r0)
            r3.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r0._showFiltersButton
            r0.add(r3)
            r16.row()
        L1d7:
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            boolean r3 = r3.isPro()
            if (r3 == 0) goto L1e2
            java.lang.String r3 = "fullscreen"
            goto L1e4
        L1e2:
            java.lang.String r3 = "fullscreenProOnly"
        L1e4:
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r3, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r0.add(r3)
            r7.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r7)
            r0._fullscreenButton = r7
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable$4 r8 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable$4
            r8.<init>(r0)
            r7.addListener(r8)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = r0._fullscreenButton
            r0.add(r7)
            r16.row()
            org.fortheloss.framework.IPlatform r7 = org.fortheloss.sticknodes.App.platform
            boolean r7 = r7.isPro()
            if (r7 != 0) goto L228
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 1056964608(0x3f000000, float:0.5)
            r3.setColor(r7, r7, r7, r8)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r0._fullscreenButton
            com.badlogic.gdx.scenes.scene2d.Touchable r9 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r3.setTouchable(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r0._fullscreenButton
            r3.setColor(r7, r7, r7, r8)
        L228:
            java.lang.String r3 = "isLooping"
            java.lang.String r7 = "tweenLoopProtection"
            java.lang.String r8 = "tweeningOn"
            if (r19 != 0) goto L364
            com.badlogic.gdx.scenes.scene2d.ui.Image r9 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r10 = r1.findRegion(r6)
            r9.<init>(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r0.add(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.colspan(r4)
            int r10 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r10 = (float) r10
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.padTop(r10)
            int r10 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r10 = (float) r10
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.padBottom(r10)
            r9.fillX()
            r16.row()
            if (r2 == 0) goto L285
            org.fortheloss.sticknodes.animationscreen.modules.Module r9 = r16.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r9 = r9.getContext()
            org.fortheloss.sticknodes.data.SessionData r9 = r9.getSessionData()
            boolean r9 = r9.getNerdModeEnabled()
            if (r9 != 0) goto L285
            java.lang.String r9 = "txtTweening"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r9, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r0.add(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.colspan(r4)
            r9.fillX()
            r16.row()
        L285:
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r8, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r0.add(r8)
            r8.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r8)
            r0._tweenButton = r8
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable$5 r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable$5
            r9.<init>(r0)
            r8.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = r0._tweenButton
            r0.add(r8)
            r16.row()
            if (r2 == 0) goto L2db
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r2, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.add(r2)
            r2.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r2)
            r0._loopButton = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable$6 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable$6
            r3.<init>(r0)
            r2.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r0._loopButton
            r0.add(r2)
            r16.row()
            goto L3e2
        L2db:
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r2, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.add(r2)
            r2.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r2.<init>()
            r3 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r2.pad(r3)
            r7.align(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r2.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.pad(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r7.space(r3)
            r7 = 1092616192(0x41200000, float:10.0)
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.spaceRight(r8)
            r3.expandX()
            r2.setRound(r15)
            r0.add(r2)
            r16.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r3)
            r0._tweenLoopProtectionButton = r3
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable$7 r7 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable$7
            r7.<init>(r0)
            r3.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r0._tweenLoopProtectionButton
            r2.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            java.lang.String r7 = "?"
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r7, r3)
            r0._tweenLoopProtectionHelpButton = r3
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable$8 r7 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable$8
            r7.<init>(r0)
            r3.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r0._tweenLoopProtectionHelpButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r0._tweenLoopProtectionHelpButton
            float r3 = r3.getWidth()
            r7 = 1053609165(0x3ecccccd, float:0.4)
            float r3 = r3 * r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.width(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r0._tweenLoopProtectionButton
            float r3 = r3.getHeight()
            r2.height(r3)
            goto L3e2
        L364:
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r8, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r0.add(r8)
            r8.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r8)
            r0._tweenButton = r8
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable$9 r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable$9
            r9.<init>(r0)
            r8.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = r0._tweenButton
            r0.add(r8)
            r16.row()
            if (r2 == 0) goto L3b9
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r2, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.add(r2)
            r2.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r2)
            r0._loopButton = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable$10 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable$10
            r3.<init>(r0)
            r2.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r0._loopButton
            r0.add(r2)
            r16.row()
            goto L3e2
        L3b9:
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r2, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.add(r2)
            r2.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r2)
            r0._tweenLoopProtectionButton = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable$11 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable$11
            r3.<init>(r0)
            r2.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r0._tweenLoopProtectionButton
            r0.add(r2)
            r16.row()
        L3e2:
            org.fortheloss.framework.LabelInputIncrementField r2 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r3 = r16.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r8 = r3.getContext()
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
            r3[r15] = r7
            r7 = 8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3[r5] = r7
            java.lang.String r7 = "tweenedFrames"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r7, r3)
            r11 = 1
            r12 = 0
            r13 = 1090519040(0x41000000, float:8.0)
            r14 = 0
            java.lang.String r10 = "5"
            r7 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r0.mTweenedFramesField = r2
            if (r19 == 0) goto L414
            r2.setIncrementButtonVisibilityPermanent(r5)
        L414:
            org.fortheloss.framework.LabelInputIncrementField r2 = r0.mTweenedFramesField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable$12 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable$12
            r3.<init>(r0)
            r2.setFieldListener(r3)
            org.fortheloss.framework.LabelInputIncrementField r2 = r0.mTweenedFramesField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r4)
            r2.fillX()
            r16.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r1.findRegion(r6)
            r2.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r4)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padTop(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padBottom(r2)
            r1.fillX()
            r16.row()
            java.lang.String r1 = ""
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r5)
            r0._tweeningInformationLabel = r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r4)
            r1.fillX()
            r16.pack()
            return
    }

    public void setFramesContainerRef(org.fortheloss.sticknodes.animationscreen.FramesContainer r1) {
            r0 = this;
            r0._framesContainerRef = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r1 = this;
            r0 = 0
            r1.update(r0)
            return
    }

    public void update(boolean r5) {
            r4 = this;
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r4._framesContainerRef
            if (r0 != 0) goto L5
            return
        L5:
            if (r5 == 0) goto L19
            org.fortheloss.framework.LabelInputIncrementField r5 = r4.mFpsField
            int r0 = r0.fps
            float r0 = (float) r0
            r5.setValue(r0)
            org.fortheloss.framework.LabelInputIncrementField r5 = r4.mTweenedFramesField
            org.fortheloss.sticknodes.animationscreen.FramesContainer r0 = r4._framesContainerRef
            int r0 = r0.numTweenedFrames
            float r0 = (float) r0
            r5.setValue(r0)
        L19:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r5 = r4._showFiltersButton
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L2d
            org.fortheloss.sticknodes.data.SessionData r2 = r4.mSessionDataRef
            int r2 = r2.getFilterShowingState()
            if (r2 == 0) goto L29
            r2 = 1
            goto L2a
        L29:
            r2 = 0
        L2a:
            r5.setChecked(r2)
        L2d:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r5 = r4._tweenButton
            org.fortheloss.sticknodes.animationscreen.FramesContainer r2 = r4._framesContainerRef
            boolean r2 = r2.tweeningEnabled
            r5.setChecked(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r5 = r4._loopButton
            if (r5 == 0) goto L41
            org.fortheloss.sticknodes.animationscreen.FramesContainer r2 = r4._framesContainerRef
            boolean r2 = r2.isLoop
            r5.setChecked(r2)
        L41:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r5 = r4._tweenLoopProtectionButton
            if (r5 == 0) goto L50
            org.fortheloss.sticknodes.animationscreen.FramesContainer r2 = r4._framesContainerRef
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r2 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r2
            boolean r2 = r2.getTweenLoopProtectionEnabled()
            r5.setChecked(r2)
        L50:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r5 = r4._fullscreenButton
            org.fortheloss.sticknodes.data.SessionData r2 = r4.mSessionDataRef
            boolean r2 = r2.getIsPlayFullscreen()
            r5.setChecked(r2)
            org.fortheloss.sticknodes.animationscreen.FramesContainer r5 = r4._framesContainerRef
            boolean r5 = r5.tweeningEnabled
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r5 != 0) goto L84
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r5 = r4._loopButton
            if (r5 == 0) goto L73
            r0 = 1056964608(0x3f000000, float:0.5)
            r5.setColor(r2, r2, r2, r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r5 = r4._loopButton
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r5.setTouchable(r0)
        L73:
            org.fortheloss.framework.LabelInputIncrementField r5 = r4.mTweenedFramesField
            r5.disable()
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4._tweeningInformationLabel
            java.lang.String r0 = "txtTweeningDisabled"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r5.setText(r0)
            goto Lc6
        L84:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r5 = r4._loopButton
            if (r5 == 0) goto L92
            r5.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r5 = r4._loopButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r5.setTouchable(r2)
        L92:
            org.fortheloss.framework.LabelInputIncrementField r5 = r4.mTweenedFramesField
            r5.enable()
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4._tweeningInformationLabel
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            org.fortheloss.sticknodes.animationscreen.FramesContainer r3 = r4._framesContainerRef
            int r3 = r3.getActualFPS()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r1] = r3
            org.fortheloss.sticknodes.animationscreen.FramesContainer r1 = r4._framesContainerRef
            int r1 = r1.getActualNumTweenedFrames()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r0] = r1
            r0 = 2
            r1 = 60
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r0] = r1
            java.lang.String r0 = "txtTweeningInfo"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0, r2)
            r5.setText(r0)
        Lc6:
            return
    }
}
