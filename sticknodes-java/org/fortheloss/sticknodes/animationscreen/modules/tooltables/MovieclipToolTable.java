package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class MovieclipToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _breakApartMCButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _centerMCButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _copyMCButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _deleteMCButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _editMCButton;
    private org.fortheloss.framework.RepeatingImageButton _flipXButton;
    private org.fortheloss.framework.RepeatingImageButton _flipYButton;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable.SubToolTableGraphic _graphicTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _joinAnchorNameLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _joinAnchorTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> _joinAnchorTableCell;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _joinMCButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _keepMCDuringTweenButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _lockMCButton;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable.SubToolTableLoopOnce _loopOnceTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _movieclipNameLabel;
    private org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu _pasteContextMenu;
    private org.fortheloss.sticknodes.TextButtonLongPress _pasteMCButton;
    private org.fortheloss.framework.RepeatingImageButton _pushBackwardButton;
    private org.fortheloss.framework.RepeatingImageButton _pushForwardButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _selectNextFigureButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _selectPreviousFigureButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _showInOnionSkinButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _titleLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _tweenModeButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable> _typeTableCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _unjoinMCButton;
    private org.fortheloss.framework.DegreesLabelInputIncrementField mAngleField;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton> mJoinButtonsCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mLayerPositionLabel;
    private org.fortheloss.framework.LabelInputIncrementField mScaleField;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton mUnlockFromCameraButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.TextButton> mUnlockFromCameraCellRef;




























    private class SubToolTableGraphic extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable implements com.badlogic.gdx.utils.Disposable {
        private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _cacheButton;
        private com.badlogic.gdx.scenes.scene2d.ui.Table _cacheTable;
        private com.badlogic.gdx.scenes.scene2d.ui.TextButton _editCacheButton;
        private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _graphicButton;
        private org.fortheloss.framework.LabelInputIncrementField mCurrentFrameField;
        private com.badlogic.gdx.scenes.scene2d.ui.Label mStateDisabledLabel;
        private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Label> mStateLabelCell;
        final /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable this$0;




        /* renamed from: -$$Nest$fget_cacheButton, reason: not valid java name */
        static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1055$$Nest$fget_cacheButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable.SubToolTableGraphic r0) {
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._cacheButton
                return r0
        }

        public SubToolTableGraphic(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r11, com.badlogic.gdx.scenes.scene2d.utils.Drawable r12) {
                r10 = this;
                r10.this$0 = r11
                r10.<init>(r12)
                r12 = 1
                r10.align(r12)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r10.defaults()
                r1 = 0
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.space(r1)
                float r2 = org.fortheloss.sticknodes.App.assetScaling
                r3 = 1092616192(0x41200000, float:10.0)
                float r2 = r2 * r3
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceRight(r2)
                float r2 = org.fortheloss.sticknodes.App.assetScaling
                float r2 = r2 * r3
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceBottom(r2)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r1)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r12)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
                r0.uniformX()
                java.lang.String r0 = "graphic"
                java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
                com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r12)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r10.add(r0)
                r0.fillX()
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
                r10._graphicButton = r0
                r0.setChecked(r12)
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r10._graphicButton
                com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
                r0.setTouchable(r1)
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r10._graphicButton
                r1 = 1065353216(0x3f800000, float:1.0)
                r2 = 1056964608(0x3f000000, float:0.5)
                r0.setColor(r1, r1, r1, r2)
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r10._graphicButton
                r10.add(r0)
                r10.row()
                java.lang.String r0 = "figureStateDisabled"
                java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
                com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r12)
                r10.mStateDisabledLabel = r0
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r10.add(r0)
                r1 = 2
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
                r10.mStateLabelCell = r0
                r10.row()
                org.fortheloss.framework.LabelInputIncrementField r0 = new org.fortheloss.framework.LabelInputIncrementField
                org.fortheloss.sticknodes.animationscreen.modules.Module r2 = r11.getModule()
                org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2.getContext()
                java.lang.String r2 = "currentFrame"
                java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r2)
                java.lang.String r5 = "0"
                r6 = 3
                r7 = 0
                r8 = 1148829696(0x4479c000, float:999.0)
                r9 = 0
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                r10.mCurrentFrameField = r0
                org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableGraphic$1 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableGraphic$1
                r2.<init>(r10, r11)
                r0.setFieldListener(r2)
                org.fortheloss.framework.LabelInputIncrementField r0 = r10.mCurrentFrameField
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r10.add(r0)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
                r0.fillX()
                r10.row()
                java.lang.String r0 = "cacheReduceLag"
                java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
                com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r12)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r10.add(r0)
                r0.fillX()
                com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
                r10._cacheTable = r0
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r10.add(r0)
                r0.fillX()
                r10.row()
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
                r10._cacheButton = r0
                r0.setChecked(r12)
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r12 = r10._cacheButton
                org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableGraphic$2 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableGraphic$2
                r0.<init>(r10, r11)
                r12.addListener(r0)
                com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r10._cacheTable
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r10._cacheButton
                r12.add(r0)
                com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r12 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
                java.lang.String r0 = "..."
                com.badlogic.gdx.scenes.scene2d.ui.TextButton r12 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r0, r12)
                r10._editCacheButton = r12
                org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableGraphic$3 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableGraphic$3
                r0.<init>(r10, r11)
                r12.addListener(r0)
                com.badlogic.gdx.scenes.scene2d.ui.Table r11 = r10._cacheTable
                com.badlogic.gdx.scenes.scene2d.ui.TextButton r12 = r10._editCacheButton
                com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r11.add(r12)
                com.badlogic.gdx.scenes.scene2d.ui.TextButton r12 = r10._editCacheButton
                float r12 = r12.getWidth()
                r0 = 1053609165(0x3ecccccd, float:0.4)
                float r12 = r12 * r0
                com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r11.width(r12)
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r12 = r10._cacheButton
                float r12 = r12.getHeight()
                com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r11.height(r12)
                r12 = 8
                r11.align(r12)
                return
        }

        @Override // com.badlogic.gdx.utils.Disposable
        public void dispose() {
                r4 = this;
                r0 = 0
                r4._graphicButton = r0
                org.fortheloss.framework.LabelInputIncrementField r1 = r4.mCurrentFrameField
                if (r1 == 0) goto Lc
                r1.dispose()
                r4.mCurrentFrameField = r0
            Lc:
                r4.mStateLabelCell = r0
                com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4._cacheTable
                if (r1 == 0) goto L30
                com.badlogic.gdx.utils.Array r1 = r1.getCells()
                int r2 = r1.size
                int r2 = r2 + (-1)
            L1a:
                if (r2 < 0) goto L2e
                java.lang.Object r3 = r1.get(r2)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r3
                com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
                if (r3 == 0) goto L2b
                r3.clear()
            L2b:
                int r2 = r2 + (-1)
                goto L1a
            L2e:
                r4._cacheTable = r0
            L30:
                r4._cacheButton = r0
                r4._editCacheButton = r0
                return
        }

        public void update(org.fortheloss.sticknodes.movieclip.MCReference r4) {
                r3 = this;
                r0 = 1065353216(0x3f800000, float:1.0)
                if (r4 != 0) goto Lf
                com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
                r3.setTouchable(r4)
                r4 = 1056964608(0x3f000000, float:0.5)
                r3.setColor(r0, r0, r0, r4)
                goto L5d
            Lf:
                com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
                r3.setTouchable(r1)
                r3.setColor(r0, r0, r0, r0)
                org.fortheloss.framework.LabelInputIncrementField r0 = r3.mCurrentFrameField
                int r1 = r4.getCurrentFrameIndex()
                r2 = 1
                int r1 = r1 + r2
                float r1 = (float) r1
                r0.setValue(r1)
                boolean r0 = r4.getIsStateControlled()
                if (r0 == 0) goto L3e
                com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Label> r0 = r3.mStateLabelCell
                com.badlogic.gdx.scenes.scene2d.Actor r0 = r0.getActor()
                if (r0 != 0) goto L38
                com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Label> r0 = r3.mStateLabelCell
                com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r3.mStateDisabledLabel
                r0.setActor(r1)
            L38:
                org.fortheloss.framework.LabelInputIncrementField r0 = r3.mCurrentFrameField
                r0.disable()
                goto L48
            L3e:
                com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Label> r0 = r3.mStateLabelCell
                r0.clearActor()
                org.fortheloss.framework.LabelInputIncrementField r0 = r3.mCurrentFrameField
                r0.enable()
            L48:
                int r0 = r4.getLibraryID()
                int r4 = r4.getCurrentFrameIndex()
                int r4 = org.fortheloss.sticknodes.movieclip.MCCache.getCachedIndex(r0, r4)
                if (r4 < 0) goto L57
                goto L58
            L57:
                r2 = 0
            L58:
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r3._cacheButton
                r4.setChecked(r2)
            L5d:
                return
        }
    }

    private class SubToolTableLoopOnce extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable implements com.badlogic.gdx.utils.Disposable {
        private com.badlogic.gdx.scenes.scene2d.ui.TextField _currentFrameTextfield;
        private org.fortheloss.sticknodes.animationscreen.modules.FramesModule _framesModuleRef;
        private com.badlogic.gdx.scenes.scene2d.ui.Label _infoLabel;
        private com.badlogic.gdx.scenes.scene2d.ui.Label _loopLabel;
        private com.badlogic.gdx.scenes.scene2d.ui.Label _onceLabel;
        private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _playDuringDelayCheckbox;
        private com.badlogic.gdx.scenes.scene2d.ui.Label _playDuringDelayLabel;
        private com.badlogic.gdx.scenes.scene2d.ui.Label _soundVolumeLabel;
        private com.badlogic.gdx.scenes.scene2d.ui.Slider _soundVolumeSlider;
        private com.badlogic.gdx.scenes.scene2d.ui.TextField _soundVolumeTextField;
        private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _typeLoop;
        private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _typeOnce;
        private com.badlogic.gdx.scenes.scene2d.ui.Table _typeTable;
        private org.fortheloss.framework.LabelInputIncrementField mStartFrameField;
        final /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable this$0;









        /* renamed from: -$$Nest$fget_playDuringDelayCheckbox, reason: not valid java name */
        static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1056$$Nest$fget_playDuringDelayCheckbox(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable.SubToolTableLoopOnce r0) {
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._playDuringDelayCheckbox
                return r0
        }

        /* renamed from: -$$Nest$fget_soundVolumeSlider, reason: not valid java name */
        static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Slider m1057$$Nest$fget_soundVolumeSlider(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable.SubToolTableLoopOnce r0) {
                com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r0._soundVolumeSlider
                return r0
        }

        /* renamed from: -$$Nest$fget_soundVolumeTextField, reason: not valid java name */
        static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextField m1058$$Nest$fget_soundVolumeTextField(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable.SubToolTableLoopOnce r0) {
                com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r0._soundVolumeTextField
                return r0
        }

        public SubToolTableLoopOnce(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r13, org.fortheloss.sticknodes.animationscreen.modules.FramesModule r14, com.badlogic.gdx.scenes.scene2d.utils.Drawable r15) {
                r12 = this;
                r12.this$0 = r13
                r12.<init>(r15)
                r15 = 1
                r12.align(r15)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r12.defaults()
                r1 = 0
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.space(r1)
                float r2 = org.fortheloss.sticknodes.App.assetScaling
                r3 = 1092616192(0x41200000, float:10.0)
                float r2 = r2 * r3
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceRight(r2)
                float r2 = org.fortheloss.sticknodes.App.assetScaling
                float r2 = r2 * r3
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceBottom(r2)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r1)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r15)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
                r0.uniformX()
                r12._framesModuleRef = r14
                java.lang.String r14 = ""
                com.badlogic.gdx.scenes.scene2d.ui.Label r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r14, r15)
                r12._infoLabel = r14
                com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r12.add(r14)
                r0 = 2
                com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.colspan(r0)
                r14.fillX()
                r12.row()
                com.badlogic.gdx.scenes.scene2d.ui.Table r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
                r12._typeTable = r14
                com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r12.add(r14)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.colspan(r0)
                r14.fillX()
                r12.row()
                java.lang.String r14 = "loop"
                java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
                com.badlogic.gdx.scenes.scene2d.ui.Label r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r14, r15)
                r12._loopLabel = r14
                com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r12._typeTable
                com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r1.add(r14)
                r14.fillX()
                java.lang.String r14 = "once"
                java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
                com.badlogic.gdx.scenes.scene2d.ui.Label r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r14, r15)
                r12._onceLabel = r14
                com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r12._typeTable
                com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r1.add(r14)
                r14.fillX()
                com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r12._typeTable
                r14.row()
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r14 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r14)
                r12._typeLoop = r14
                org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableLoopOnce$1 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableLoopOnce$1
                r1.<init>(r12, r13)
                r14.addListener(r1)
                com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r12._typeTable
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r12._typeLoop
                r14.add(r1)
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r14 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r14)
                r12._typeOnce = r14
                org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableLoopOnce$2 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableLoopOnce$2
                r1.<init>(r12, r13)
                r14.addListener(r1)
                com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r12._typeTable
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r12._typeOnce
                r14.add(r1)
                com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r14 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
                r14.<init>()
                com.badlogic.gdx.scenes.scene2d.ui.Button[] r1 = new com.badlogic.gdx.scenes.scene2d.ui.Button[r0]
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r12._typeLoop
                r3 = 0
                r1[r3] = r2
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r12._typeOnce
                r1[r15] = r2
                r14.add(r1)
                org.fortheloss.framework.LabelInputIncrementField r14 = new org.fortheloss.framework.LabelInputIncrementField
                org.fortheloss.sticknodes.animationscreen.modules.Module r1 = r13.getModule()
                org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r1.getContext()
                java.lang.String r1 = "startFrame2"
                java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r1)
                java.lang.String r6 = "0"
                r7 = 3
                r8 = 0
                r9 = 1148829696(0x4479c000, float:999.0)
                r10 = 0
                r3 = r14
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                r12.mStartFrameField = r14
                org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableLoopOnce$3 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableLoopOnce$3
                r1.<init>(r12, r13)
                r14.setFieldListener(r1)
                org.fortheloss.framework.LabelInputIncrementField r14 = r12.mStartFrameField
                com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r12.add(r14)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.colspan(r0)
                r14.fillX()
                r12.row()
                java.lang.String r14 = "currentFrame"
                java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
                com.badlogic.gdx.scenes.scene2d.ui.Label r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r14, r15)
                r1 = 1065353216(0x3f800000, float:1.0)
                r2 = 1056964608(0x3f000000, float:0.5)
                r14.setColor(r1, r1, r1, r2)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r12.add(r14)
                r14.fillX()
                com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter r14 = new com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter
                r14.<init>()
                java.lang.String r3 = "0"
                r4 = 3
                com.badlogic.gdx.scenes.scene2d.ui.TextField r14 = r13.createTextField(r3, r4, r14)
                r12._currentFrameTextfield = r14
                com.badlogic.gdx.scenes.scene2d.Touchable r3 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
                r14.setTouchable(r3)
                com.badlogic.gdx.scenes.scene2d.ui.TextField r14 = r12._currentFrameTextfield
                r14.setColor(r1, r1, r1, r2)
                com.badlogic.gdx.scenes.scene2d.ui.TextField r14 = r12._currentFrameTextfield
                com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r12.add(r14)
                int r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
                float r5 = (float) r5
                int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
                float r6 = (float) r6
                com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.size(r5, r6)
                r5 = 8
                r14.align(r5)
                r12.row()
                java.lang.String r14 = "playDuringDelay"
                java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
                com.badlogic.gdx.scenes.scene2d.ui.Label r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r14, r15)
                r12._playDuringDelayLabel = r14
                com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r12.add(r14)
                r14.fillX()
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r14 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r14)
                r12._playDuringDelayCheckbox = r14
                org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableLoopOnce$4 r6 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableLoopOnce$4
                r6.<init>(r12, r13)
                r14.addListener(r6)
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r14 = r12._playDuringDelayCheckbox
                r12.add(r14)
                r12.row()
                java.lang.String r14 = "mcSoundVolume"
                java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
                com.badlogic.gdx.scenes.scene2d.ui.Label r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r14, r15)
                r12._soundVolumeLabel = r14
                com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r12.add(r14)
                r14.fillX()
                com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter r14 = new com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter
                r14.<init>()
                java.lang.String r15 = "100"
                com.badlogic.gdx.scenes.scene2d.ui.TextField r14 = r13.createTextField(r15, r4, r14)
                r12._soundVolumeTextField = r14
                org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableLoopOnce$5 r15 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableLoopOnce$5
                r15.<init>(r12, r13)
                r14.setTextFieldListener(r15)
                com.badlogic.gdx.scenes.scene2d.ui.TextField r14 = r12._soundVolumeTextField
                org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableLoopOnce$6 r15 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableLoopOnce$6
                r15.<init>(r12, r13)
                r14.addListener(r15)
                com.badlogic.gdx.scenes.scene2d.ui.TextField r14 = r12._soundVolumeTextField
                com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r12.add(r14)
                int r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
                float r15 = (float) r15
                int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
                float r4 = (float) r4
                com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.size(r15, r4)
                r14.align(r5)
                r12.row()
                com.badlogic.gdx.scenes.scene2d.ui.Slider r14 = new com.badlogic.gdx.scenes.scene2d.ui.Slider
                com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle r11 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsSliderStyle()
                r7 = 1065353216(0x3f800000, float:1.0)
                r8 = 1120403456(0x42c80000, float:100.0)
                r9 = 1065353216(0x3f800000, float:1.0)
                r6 = r14
                r6.<init>(r7, r8, r9, r10, r11)
                r12._soundVolumeSlider = r14
                r15 = 1120403456(0x42c80000, float:100.0)
                r14.setValue(r15)
                com.badlogic.gdx.scenes.scene2d.ui.Slider r14 = r12._soundVolumeSlider
                org.fortheloss.framework.CustomStopListener r15 = new org.fortheloss.framework.CustomStopListener
                r15.<init>()
                r14.addListener(r15)
                com.badlogic.gdx.scenes.scene2d.ui.Slider r14 = r12._soundVolumeSlider
                org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableLoopOnce$7 r15 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableLoopOnce$7
                r15.<init>(r12, r13)
                r14.addListener(r15)
                com.badlogic.gdx.scenes.scene2d.ui.Slider r14 = r12._soundVolumeSlider
                org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableLoopOnce$8 r15 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableLoopOnce$8
                r15.<init>(r12, r13)
                r14.addListener(r15)
                com.badlogic.gdx.scenes.scene2d.ui.Slider r13 = r12._soundVolumeSlider
                com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r12.add(r13)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.colspan(r0)
                int r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
                float r14 = (float) r14
                r13.width(r14)
                org.fortheloss.framework.IPlatform r13 = org.fortheloss.sticknodes.App.platform
                boolean r13 = r13.isPro()
                if (r13 != 0) goto L237
                com.badlogic.gdx.scenes.scene2d.ui.TextField r13 = r12._soundVolumeTextField
                r13.setTouchable(r3)
                com.badlogic.gdx.scenes.scene2d.ui.TextField r13 = r12._soundVolumeTextField
                r13.setColor(r1, r1, r1, r2)
                com.badlogic.gdx.scenes.scene2d.ui.Slider r13 = r12._soundVolumeSlider
                r13.setTouchable(r3)
                com.badlogic.gdx.scenes.scene2d.ui.Slider r13 = r12._soundVolumeSlider
                r13.setColor(r1, r1, r1, r2)
                com.badlogic.gdx.scenes.scene2d.ui.Label r13 = r12._soundVolumeLabel
                r13.setColor(r1, r1, r1, r2)
            L237:
                return
        }

        @Override // com.badlogic.gdx.utils.Disposable
        public void dispose() {
                r4 = this;
                r0 = 0
                r4._infoLabel = r0
                r4._typeLoop = r0
                r4._typeOnce = r0
                r4._currentFrameTextfield = r0
                r4._playDuringDelayCheckbox = r0
                r4._soundVolumeLabel = r0
                r4._soundVolumeTextField = r0
                r4._soundVolumeSlider = r0
                org.fortheloss.framework.LabelInputIncrementField r1 = r4.mStartFrameField
                if (r1 == 0) goto L1a
                r1.dispose()
                r4.mStartFrameField = r0
            L1a:
                com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4._typeTable
                if (r1 == 0) goto L3a
                com.badlogic.gdx.utils.Array r1 = r1.getCells()
                int r2 = r1.size
                int r2 = r2 + (-1)
            L26:
                if (r2 < 0) goto L38
                java.lang.Object r3 = r1.get(r2)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r3
                com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
                r3.clear()
                int r2 = r2 + (-1)
                goto L26
            L38:
                r4._typeTable = r0
            L3a:
                return
        }

        public void update(org.fortheloss.sticknodes.movieclip.MCReference r7) {
                r6 = this;
                r0 = 1065353216(0x3f800000, float:1.0)
                if (r7 != 0) goto L10
                com.badlogic.gdx.scenes.scene2d.Touchable r7 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
                r6.setTouchable(r7)
                r7 = 1056964608(0x3f000000, float:0.5)
                r6.setColor(r0, r0, r0, r7)
                goto L1ba
            L10:
                com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
                r6.setTouchable(r1)
                r6.setColor(r0, r0, r0, r0)
                boolean r0 = r7.isOriginMCRef()
                r1 = 1
                if (r0 == 0) goto L26
                java.lang.String r0 = "isOriginYes"
                java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
                goto L5e
            L26:
                java.lang.String r0 = "isOriginNo"
                java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r3 = 0
                org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r6._framesModuleRef
                org.fortheloss.sticknodes.movieclip.MCReference r5 = r7.getOrigin()
                org.fortheloss.sticknodes.data.FrameData r5 = r5.getFrame()
                int r4 = r4.getFrameIndex(r5)
                int r4 = r4 + r1
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r2[r3] = r4
                java.lang.String r3 = "originFrame"
                java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r3, r2)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r0)
                java.lang.String r0 = "\n"
                r3.append(r0)
                r3.append(r2)
                java.lang.String r0 = r3.toString()
            L5e:
                com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r6._infoLabel
                r2.setText(r0)
                int r0 = r7.getPlaymode()
                r2 = 2
                if (r0 != r2) goto L70
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._typeLoop
                r0.setChecked(r1)
                goto L75
            L70:
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._typeOnce
                r0.setChecked(r1)
            L75:
                org.fortheloss.framework.LabelInputIncrementField r0 = r6.mStartFrameField
                int r3 = r7.getStartFrameIndex()
                int r3 = r3 + r1
                float r3 = (float) r3
                r0.setValue(r3)
                com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r6._currentFrameTextfield
                int r3 = r7.getCurrentFrameIndex()
                int r3 = r3 + r1
                java.lang.String r3 = java.lang.String.valueOf(r3)
                r0.setText(r3)
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._playDuringDelayCheckbox
                boolean r3 = r7.getPlayDuringDelay()
                r0.setChecked(r3)
                float r0 = r7.getVolumeScale()
                r3 = 1120403456(0x42c80000, float:100.0)
                float r0 = r0 * r3
                int r0 = java.lang.Math.round(r0)
                r3 = 100
                if (r0 >= r1) goto La9
                r0 = 1
                goto Lad
            La9:
                if (r0 <= r3) goto Lad
                r0 = 100
            Lad:
                com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r6._soundVolumeTextField
                java.lang.String r4 = java.lang.String.valueOf(r0)
                r3.setText(r4)
                com.badlogic.gdx.scenes.scene2d.ui.Slider r3 = r6._soundVolumeSlider
                float r0 = (float) r0
                r3.setValue(r0)
                byte r0 = r7.isLockedToCamera()
                if (r0 != r2) goto Ld5
                org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0 = r6.this$0
                org.fortheloss.framework.LabelInputIncrementField r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable.m1031$$Nest$fgetmScaleField(r0)
                r0.disable()
                org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0 = r6.this$0
                org.fortheloss.framework.DegreesLabelInputIncrementField r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable.m1030$$Nest$fgetmAngleField(r0)
                r0.disable()
                goto Le7
            Ld5:
                org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0 = r6.this$0
                org.fortheloss.framework.LabelInputIncrementField r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable.m1031$$Nest$fgetmScaleField(r0)
                r0.enable()
                org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0 = r6.this$0
                org.fortheloss.framework.DegreesLabelInputIncrementField r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable.m1030$$Nest$fgetmAngleField(r0)
                r0.enable()
            Le7:
                byte r7 = r7.getTweenMode()
                java.lang.String r0 = ": "
                java.lang.String r3 = "tween"
                if (r7 != 0) goto L118
                org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r7 = r6.this$0
                com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable.m1029$$Nest$fget_tweenModeButton(r7)
                java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r3)
                java.lang.String r2 = "none"
                java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r1)
                r3.append(r0)
                r3.append(r2)
                java.lang.String r0 = r3.toString()
                r7.setText(r0)
                goto L1ba
            L118:
                if (r7 != r1) goto L141
                org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r7 = r6.this$0
                com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable.m1029$$Nest$fget_tweenModeButton(r7)
                java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r3)
                java.lang.String r2 = "linear"
                java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r1)
                r3.append(r0)
                r3.append(r2)
                java.lang.String r0 = r3.toString()
                r7.setText(r0)
                goto L1ba
            L141:
                if (r7 != r2) goto L169
                org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r7 = r6.this$0
                com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable.m1029$$Nest$fget_tweenModeButton(r7)
                java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r3)
                java.lang.String r2 = "ease"
                java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r1)
                r3.append(r0)
                r3.append(r2)
                java.lang.String r0 = r3.toString()
                r7.setText(r0)
                goto L1ba
            L169:
                r1 = 3
                if (r7 != r1) goto L192
                org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r7 = r6.this$0
                com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable.m1029$$Nest$fget_tweenModeButton(r7)
                java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r3)
                java.lang.String r2 = "easeIn"
                java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r1)
                r3.append(r0)
                r3.append(r2)
                java.lang.String r0 = r3.toString()
                r7.setText(r0)
                goto L1ba
            L192:
                r1 = 4
                if (r7 != r1) goto L1ba
                org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r7 = r6.this$0
                com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable.m1029$$Nest$fget_tweenModeButton(r7)
                java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r3)
                java.lang.String r2 = "easeOut"
                java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r1)
                r3.append(r0)
                r3.append(r2)
                java.lang.String r0 = r3.toString()
                r7.setText(r0)
            L1ba:
                return
        }
    }

    /* renamed from: -$$Nest$fget_flipXButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.RepeatingImageButton m1025$$Nest$fget_flipXButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0) {
            org.fortheloss.framework.RepeatingImageButton r0 = r0._flipXButton
            return r0
    }

    /* renamed from: -$$Nest$fget_flipYButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.RepeatingImageButton m1026$$Nest$fget_flipYButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0) {
            org.fortheloss.framework.RepeatingImageButton r0 = r0._flipYButton
            return r0
    }

    /* renamed from: -$$Nest$fget_pasteContextMenu, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu m1027$$Nest$fget_pasteContextMenu(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0) {
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu r0 = r0._pasteContextMenu
            return r0
    }

    /* renamed from: -$$Nest$fget_showInOnionSkinButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1028$$Nest$fget_showInOnionSkinButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._showInOnionSkinButton
            return r0
    }

    /* renamed from: -$$Nest$fget_tweenModeButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextButton m1029$$Nest$fget_tweenModeButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r0._tweenModeButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmAngleField, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.DegreesLabelInputIncrementField m1030$$Nest$fgetmAngleField(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0) {
            org.fortheloss.framework.DegreesLabelInputIncrementField r0 = r0.mAngleField
            return r0
    }

    /* renamed from: -$$Nest$fgetmScaleField, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.LabelInputIncrementField m1031$$Nest$fgetmScaleField(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0) {
            org.fortheloss.framework.LabelInputIncrementField r0 = r0.mScaleField
            return r0
    }

    /* renamed from: -$$Nest$monBreakApartMCClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1032$$Nest$monBreakApartMCClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0) {
            r0.onBreakApartMCClick()
            return
    }

    /* renamed from: -$$Nest$monCacheClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1033$$Nest$monCacheClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0, boolean r1) {
            r0.onCacheClick(r1)
            return
    }

    /* renamed from: -$$Nest$monCenterMCClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1034$$Nest$monCenterMCClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0) {
            r0.onCenterMCClick()
            return
    }

    /* renamed from: -$$Nest$monCopyMCClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1035$$Nest$monCopyMCClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0) {
            r0.onCopyMCClick()
            return
    }

    /* renamed from: -$$Nest$monDeleteMCClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1036$$Nest$monDeleteMCClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0) {
            r0.onDeleteMCClick()
            return
    }

    /* renamed from: -$$Nest$monEditCacheClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1037$$Nest$monEditCacheClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0) {
            r0.onEditCacheClick()
            return
    }

    /* renamed from: -$$Nest$monEditMCClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1038$$Nest$monEditMCClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0) {
            r0.onEditMCClick()
            return
    }

    /* renamed from: -$$Nest$monFlipXClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1039$$Nest$monFlipXClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0, boolean r1) {
            r0.onFlipXClick(r1)
            return
    }

    /* renamed from: -$$Nest$monFlipYClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1040$$Nest$monFlipYClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0, boolean r1) {
            r0.onFlipYClick(r1)
            return
    }

    /* renamed from: -$$Nest$monGoToJoinAnchorClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1041$$Nest$monGoToJoinAnchorClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0) {
            r0.onGoToJoinAnchorClick()
            return
    }

    /* renamed from: -$$Nest$monJoinMCClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1042$$Nest$monJoinMCClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0) {
            r0.onJoinMCClick()
            return
    }

    /* renamed from: -$$Nest$monKeepMCDuringTweenClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1043$$Nest$monKeepMCDuringTweenClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0) {
            r0.onKeepMCDuringTweenClick()
            return
    }

    /* renamed from: -$$Nest$monLockMCClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1044$$Nest$monLockMCClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0) {
            r0.onLockMCClick()
            return
    }

    /* renamed from: -$$Nest$monPasteMCClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1045$$Nest$monPasteMCClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0) {
            r0.onPasteMCClick()
            return
    }

    /* renamed from: -$$Nest$monPlayDuringDelayClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1046$$Nest$monPlayDuringDelayClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0, boolean r1) {
            r0.onPlayDuringDelayClick(r1)
            return
    }

    /* renamed from: -$$Nest$monPlaymodeClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1047$$Nest$monPlaymodeClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0, boolean r1) {
            r0.onPlaymodeClick(r1)
            return
    }

    /* renamed from: -$$Nest$monPushBackwardClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1048$$Nest$monPushBackwardClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0) {
            r0.onPushBackwardClick()
            return
    }

    /* renamed from: -$$Nest$monPushForwardClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1049$$Nest$monPushForwardClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0) {
            r0.onPushForwardClick()
            return
    }

    /* renamed from: -$$Nest$monSelectNextFigureClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1050$$Nest$monSelectNextFigureClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0) {
            r0.onSelectNextFigureClick()
            return
    }

    /* renamed from: -$$Nest$monSelectPreviousFigureClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1051$$Nest$monSelectPreviousFigureClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0) {
            r0.onSelectPreviousFigureClick()
            return
    }

    /* renamed from: -$$Nest$monSetSoundVolumeEnter, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1052$$Nest$monSetSoundVolumeEnter(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0, boolean r1, com.badlogic.gdx.scenes.scene2d.ui.TextField r2, com.badlogic.gdx.scenes.scene2d.ui.Slider r3) {
            r0.onSetSoundVolumeEnter(r1, r2, r3)
            return
    }

    /* renamed from: -$$Nest$monTweenModeButtonClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1053$$Nest$monTweenModeButtonClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0) {
            r0.onTweenModeButtonClick()
            return
    }

    /* renamed from: -$$Nest$monUnjoinMCClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1054$$Nest$monUnjoinMCClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0) {
            r0.onUnjoinMCClick()
            return
    }

    public MovieclipToolTable(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r1, org.fortheloss.sticknodes.data.ProjectData r2, org.fortheloss.sticknodes.data.SessionData r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private void onBreakApartMCClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.breakApartMC()
            return
    }

    private void onCacheClick(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.setCacheGraphic(r2)
            return
    }

    private void onCenterMCClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.centerFigure()
            return
    }

    private void onCopyMCClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.copyMC()
            return
    }

    private void onDeleteMCClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.deleteMC()
            return
    }

    private void onEditCacheClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.showEditCacheDialog()
            return
    }

    private void onEditMCClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.editMCInPlace()
            return
    }

    private void onFlipXClick(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.flipFigureX(r2)
            return
    }

    private void onFlipYClick(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.flipFigureY(r2)
            return
    }

    private void onGoToJoinAnchorClick() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r2._joinAnchorNameLabel
            java.lang.Object r0 = r0.getUserObject()
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r0 == 0) goto L17
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animationToolsModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r2._joinAnchorNameLabel
            java.lang.Object r1 = r1.getUserObject()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.selectFigure(r1)
        L17:
            return
    }

    private void onJoinMCClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.joinFigure()
            return
    }

    private void onKeepMCDuringTweenClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animationToolsModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._keepMCDuringTweenButton
            boolean r1 = r1.isChecked()
            r0.persistFigure(r1)
            return
    }

    private void onLockMCClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animationToolsModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._lockMCButton
            boolean r1 = r1.isChecked()
            r0.lockFigure(r1)
            return
    }

    private void onPasteMCClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.pasteMC()
            return
    }

    private void onPlayDuringDelayClick(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.setMCPlayDuringDelay(r2)
            return
    }

    private void onPlaymodeClick(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            if (r2 == 0) goto L6
            r2 = 2
            goto L7
        L6:
            r2 = 1
        L7:
            r0.setMCPlaymode(r2)
            return
    }

    private void onPushBackwardClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.pushFigureBackward()
            return
    }

    private void onPushForwardClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.pushFigureForward()
            return
    }

    private void onSelectNextFigureClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.selectNextFigure()
            return
    }

    private void onSelectPreviousFigureClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.selectPreviousFigure()
            return
    }

    private void onSetSoundVolumeEnter(boolean r4, com.badlogic.gdx.scenes.scene2d.ui.TextField r5, com.badlogic.gdx.scenes.scene2d.ui.Slider r6) {
            r3 = this;
            java.lang.String r0 = r5.getText()
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            r1 = 100
            r2 = 1
            if (r0 == 0) goto L11
            r0 = 1
            goto L20
        L11:
            java.lang.String r0 = r5.getText()     // Catch: java.lang.NumberFormatException -> L1e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L1e
            int r0 = r0.intValue()     // Catch: java.lang.NumberFormatException -> L1e
            goto L20
        L1e:
            r0 = 100
        L20:
            if (r0 >= r2) goto L24
            r1 = 1
            goto L28
        L24:
            if (r0 <= r1) goto L27
            goto L28
        L27:
            r1 = r0
        L28:
            float r0 = (float) r1
            r6.setValue(r0)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r6 = r3._animationToolsModuleRef
            r2 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r2
            r6.setMCVolumeScale(r0)
            if (r4 == 0) goto L3d
            java.lang.String r4 = java.lang.String.valueOf(r1)
            r5.setText(r4)
        L3d:
            return
    }

    private void onTweenModeButtonClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.toggleFigureTweenMode()
            return
    }

    private void onUnjoinMCClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.unjoinFigure()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._titleLabel = r0
            r2._movieclipNameLabel = r0
            r2._copyMCButton = r0
            r2._pasteMCButton = r0
            r2._deleteMCButton = r0
            r2._breakApartMCButton = r0
            r2._editMCButton = r0
            r2._flipXButton = r0
            r2._flipYButton = r0
            r2._pushBackwardButton = r0
            r2._pushForwardButton = r0
            r2.mLayerPositionLabel = r0
            r2._centerMCButton = r0
            r2._lockMCButton = r0
            r2._showInOnionSkinButton = r0
            r2._keepMCDuringTweenButton = r0
            r2._tweenModeButton = r0
            r2._joinMCButton = r0
            r2._unjoinMCButton = r0
            r2.mJoinButtonsCellRef = r0
            r2._selectPreviousFigureButton = r0
            r2._selectNextFigureButton = r0
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mScaleField
            if (r1 == 0) goto L36
            r1.dispose()
            r2.mScaleField = r0
        L36:
            org.fortheloss.framework.DegreesLabelInputIncrementField r1 = r2.mAngleField
            if (r1 == 0) goto L3f
            r1.dispose()
            r2.mAngleField = r0
        L3f:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableLoopOnce r1 = r2._loopOnceTable
            if (r1 == 0) goto L48
            r1.dispose()
            r2._loopOnceTable = r0
        L48:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableGraphic r1 = r2._graphicTable
            if (r1 == 0) goto L51
            r1.dispose()
            r2._graphicTable = r0
        L51:
            r2._typeTableCellRef = r0
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu r1 = r2._pasteContextMenu
            if (r1 == 0) goto L5c
            r1.dispose()
            r2._pasteContextMenu = r0
        L5c:
            r2._joinAnchorTable = r0
            r2._joinAnchorTableCell = r0
            r2._joinAnchorNameLabel = r0
            r2.mUnlockFromCameraButton = r0
            r2.mUnlockFromCameraCellRef = r0
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r20, com.badlogic.gdx.graphics.g2d.TextureAtlas r21, com.badlogic.gdx.scenes.scene2d.utils.Drawable r22, org.fortheloss.sticknodes.animationscreen.modules.FramesModule r23) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            super.initialize(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableLoopOnce r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableLoopOnce
            r4 = r23
            r3.<init>(r0, r4, r2)
            r0._loopOnceTable = r3
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableGraphic r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableGraphic
            r3.<init>(r0, r2)
            r0._graphicTable = r3
            java.lang.String r2 = "movieclipTools"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r4 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r2, r4, r3)
            r0._titleLabel = r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.add(r2)
            r3 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r3)
            r2.fillX()
            r19.row()
            java.lang.String r2 = ""
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r2, r4)
            r0._movieclipNameLabel = r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.colspan(r3)
            r5.fillX()
            r19.row()
            java.lang.String r5 = "deleteMC"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeDeleteButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r5, r6)
            r0._deleteMCButton = r5
            r6 = 130(0x82, float:1.82E-43)
            r0.registerWidget(r5, r6)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r5 = r0._deleteMCButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$1 r6 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$1
            r6.<init>(r0)
            r5.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r5 = r0._deleteMCButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r5)
            r5.colspan(r3)
            r19.row()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalMenuLeftStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r5)
            r0._selectPreviousFigureButton = r5
            r6 = 131(0x83, float:1.84E-43)
            r0.registerWidget(r5, r6)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r5 = r0._selectPreviousFigureButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$2 r6 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$2
            r6.<init>(r0)
            r5.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r5 = r0._selectPreviousFigureButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r5)
            r6 = 16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.align(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r7 = r0._selectPreviousFigureButton
            float r7 = r7.getHeight()
            r8 = 1060320051(0x3f333333, float:0.7)
            float r7 = r7 * r8
            r5.height(r7)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalMenuRightStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r5)
            r0._selectNextFigureButton = r5
            r7 = 132(0x84, float:1.85E-43)
            r0.registerWidget(r5, r7)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r5 = r0._selectNextFigureButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$3 r7 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$3
            r7.<init>(r0)
            r5.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r5 = r0._selectNextFigureButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r5)
            r7 = 8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.align(r7)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r9 = r0._selectNextFigureButton
            float r9 = r9.getHeight()
            float r9 = r9 * r8
            r5.height(r9)
            r19.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r8 = "separator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r9 = r1.findRegion(r8)
            r5.<init>(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.colspan(r3)
            int r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r9 = (float) r9
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.padTop(r9)
            int r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r9 = (float) r9
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.padBottom(r9)
            r5.fillX()
            r19.row()
            java.lang.String r5 = "copyMC"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r5, r9)
            r0._copyMCButton = r5
            r9 = 133(0x85, float:1.86E-43)
            r0.registerWidget(r5, r9)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r0._copyMCButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$4 r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$4
            r9.<init>(r0)
            r5.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r0._copyMCButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r5)
            r5.align(r6)
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu r5 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu
            org.fortheloss.sticknodes.data.SessionData r9 = r0.mSessionDataRef
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getContextMenuBackgroundDrawable()
            r5.<init>(r9, r10)
            r0._pasteContextMenu = r5
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$5 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$5
            java.lang.String r9 = "pasteMC"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            org.fortheloss.sticknodes.TextButtonLongPress$TextButtonLongPressStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonLongPressStyle()
            r5.<init>(r0, r9, r10)
            r0._pasteMCButton = r5
            r9 = 134(0x86, float:1.88E-43)
            r0.registerWidget(r5, r9)
            org.fortheloss.sticknodes.TextButtonLongPress r5 = r0._pasteMCButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r5.getLabel()
            r5.setWrap(r4)
            org.fortheloss.sticknodes.TextButtonLongPress r5 = r0._pasteMCButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = r5.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.getCell(r9)
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            r10 = 1082130432(0x40800000, float:4.0)
            float r11 = r9 * r10
            float r9 = r9 * r10
            r10 = 0
            r5.pad(r10, r11, r10, r9)
            org.fortheloss.sticknodes.TextButtonLongPress r5 = r0._pasteMCButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$6 r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$6
            r9.<init>(r0)
            r5.addListener(r9)
            org.fortheloss.sticknodes.TextButtonLongPress r5 = r0._pasteMCButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r5)
            r5.align(r7)
            r19.row()
            java.lang.String r5 = "breakApartMC"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r5, r9)
            r0._breakApartMCButton = r5
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$7 r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$7
            r9.<init>(r0)
            r5.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r0._breakApartMCButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r5)
            r5.align(r6)
            java.lang.String r5 = "editMC"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            java.lang.String r5 = " >"
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r5, r9)
            r0._editMCButton = r5
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$8 r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$8
            r9.<init>(r0)
            r5.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r0._editMCButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r5)
            r5.align(r7)
            r19.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r9 = r1.findRegion(r8)
            r5.<init>(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.colspan(r3)
            int r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r9 = (float) r9
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.padTop(r9)
            int r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r9 = (float) r9
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.padBottom(r9)
            r5.fillX()
            r19.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$9 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$9
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalFlipFigureX()
            r11 = 1050253722(0x3e99999a, float:0.3)
            r5.<init>(r0, r9, r11)
            r0._flipXButton = r5
            r9 = 135(0x87, float:1.89E-43)
            r0.registerWidget(r5, r9)
            org.fortheloss.framework.RepeatingImageButton r5 = r0._flipXButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$10 r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$10
            r9.<init>(r0)
            r5.addListener(r9)
            org.fortheloss.framework.RepeatingImageButton r5 = r0._flipXButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r5)
            r5.align(r6)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$11 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$11
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalFlipFigureY()
            r5.<init>(r0, r9, r11)
            r0._flipYButton = r5
            r9 = 136(0x88, float:1.9E-43)
            r0.registerWidget(r5, r9)
            org.fortheloss.framework.RepeatingImageButton r5 = r0._flipYButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$12 r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$12
            r9.<init>(r0)
            r5.addListener(r9)
            org.fortheloss.framework.RepeatingImageButton r5 = r0._flipYButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r5)
            r5.align(r7)
            r19.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$13 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$13
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalFigurePushBackwardStyle()
            r11 = 1045220557(0x3e4ccccd, float:0.2)
            r5.<init>(r0, r9, r11)
            r0._pushBackwardButton = r5
            r9 = 137(0x89, float:1.92E-43)
            r0.registerWidget(r5, r9)
            org.fortheloss.framework.RepeatingImageButton r5 = r0._pushBackwardButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$14 r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$14
            r9.<init>(r0)
            r5.addListener(r9)
            org.fortheloss.framework.RepeatingImageButton r5 = r0._pushBackwardButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r5)
            r5.align(r6)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$15 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$15
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalFigurePushForwardStyle()
            r5.<init>(r0, r6, r11)
            r0._pushForwardButton = r5
            r6 = 138(0x8a, float:1.93E-43)
            r0.registerWidget(r5, r6)
            org.fortheloss.framework.RepeatingImageButton r5 = r0._pushForwardButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$16 r6 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$16
            r6.<init>(r0)
            r5.addListener(r6)
            org.fortheloss.framework.RepeatingImageButton r5 = r0._pushForwardButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r5)
            r5.align(r7)
            r19.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r2, r4)
            r0.mLayerPositionLabel = r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.fillX()
            r5.colspan(r3)
            r19.row()
            java.lang.String r5 = "centerMC"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r5, r6)
            r0._centerMCButton = r5
            r6 = 139(0x8b, float:1.95E-43)
            r0.registerWidget(r5, r6)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r0._centerMCButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$17 r6 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$17
            r6.<init>(r0)
            r5.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r0._centerMCButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r5)
            r5.colspan(r3)
            r19.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r6 = r1.findRegion(r8)
            r5.<init>(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.colspan(r3)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r6 = (float) r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.padTop(r6)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r6 = (float) r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.padBottom(r6)
            r5.fillX()
            r19.row()
            org.fortheloss.framework.LabelInputIncrementField r5 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r6 = r19.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r6.getContext()
            java.lang.String r6 = "mcScale"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.String r14 = "1.00"
            r15 = 5
            r16 = 953267991(0x38d1b717, float:1.0E-4)
            r17 = 1092616192(0x41200000, float:10.0)
            r18 = 1
            r11 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r0.mScaleField = r5
            r6 = 140(0x8c, float:1.96E-43)
            r0.registerWidget(r5, r6)
            org.fortheloss.framework.LabelInputIncrementField r5 = r0.mScaleField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$18 r6 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$18
            r6.<init>(r0)
            r5.setFieldListener(r6)
            org.fortheloss.framework.LabelInputIncrementField r5 = r0.mScaleField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.colspan(r3)
            r5.fillX()
            r19.row()
            org.fortheloss.framework.DegreesLabelInputIncrementField r5 = new org.fortheloss.framework.DegreesLabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r6 = r19.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r6.getContext()
            java.lang.String r6 = "rotateMC"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.String r14 = "0"
            r15 = 3
            r16 = 0
            r17 = 1135837184(0x43b38000, float:359.0)
            r18 = 0
            r11 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r0.mAngleField = r5
            r6 = 15
            r0.registerWidget(r5, r6)
            org.fortheloss.framework.DegreesLabelInputIncrementField r5 = r0.mAngleField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$19 r6 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$19
            r6.<init>(r0)
            r5.setFieldListener(r6)
            org.fortheloss.framework.DegreesLabelInputIncrementField r5 = r0.mAngleField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.colspan(r3)
            r5.fillX()
            r19.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r6 = r1.findRegion(r8)
            r5.<init>(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.colspan(r3)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r6 = (float) r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.padTop(r6)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r6 = (float) r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.padBottom(r6)
            r5.fillX()
            r19.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableLoopOnce r5 = r0._loopOnceTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.colspan(r3)
            r0._typeTableCellRef = r5
            r19.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r6 = r1.findRegion(r8)
            r5.<init>(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.colspan(r3)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r6 = (float) r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.padTop(r6)
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r6 = (float) r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.padBottom(r6)
            r5.fillX()
            r19.row()
            java.lang.String r5 = "lockMC"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r5, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r5)
            r5.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r5)
            r0._lockMCButton = r5
            r6 = 141(0x8d, float:1.98E-43)
            r0.registerWidget(r5, r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r5 = r0._lockMCButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$20 r6 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$20
            r6.<init>(r0)
            r5.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r5 = r0._lockMCButton
            r0.add(r5)
            r19.row()
            java.lang.String r5 = "keepMCDuringTween"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r5, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.add(r5)
            r5.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r5)
            r0._keepMCDuringTweenButton = r5
            r6 = 142(0x8e, float:1.99E-43)
            r0.registerWidget(r5, r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r5 = r0._keepMCDuringTweenButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$21 r6 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$21
            r6.<init>(r0)
            r5.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r5 = r0._keepMCDuringTweenButton
            r0.add(r5)
            r19.row()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r2, r5)
            r0._tweenModeButton = r2
            r5 = 146(0x92, float:2.05E-43)
            r0.registerWidget(r2, r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r0._tweenModeButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$22 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$22
            r5.<init>(r0)
            r2.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r0._tweenModeButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.add(r2)
            r2.colspan(r3)
            r19.row()
            java.lang.String r2 = "visibleInOnionSkin"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r2, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.add(r2)
            r2.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r2)
            r0._showInOnionSkinButton = r2
            r5 = 143(0x8f, float:2.0E-43)
            r0.registerWidget(r2, r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r0._showInOnionSkinButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$23 r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$23
            r5.<init>(r0)
            r2.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r0._showInOnionSkinButton
            r0.add(r2)
            r19.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r1.findRegion(r8)
            r2.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r3)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padTop(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padBottom(r2)
            r1.fillX()
            r19.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r1.<init>()
            r0._joinAnchorTable = r1
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r1.pad(r10)
            r1.align(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r0._joinAnchorTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.space(r10)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r5 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 * r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.spaceRight(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.pad(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.align(r4)
            r1.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r0._joinAnchorTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.fillX()
            r0._joinAnchorTableCell = r1
            r19.row()
            java.lang.String r1 = "joinedTo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ":\n"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r4)
            r0._joinAnchorNameLabel = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$24 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$24
            r2.<init>(r0)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r0._joinAnchorTable
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0._joinAnchorNameLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1134559232(0x43a00000, float:320.0)
            float r2 = r2 * r4
            r1.width(r2)
            java.lang.String r1 = "join"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargeJoin()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r1, r2)
            r0._joinMCButton = r1
            r2 = 144(0x90, float:2.02E-43)
            r0.registerWidget(r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r0._joinMCButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$25 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$25
            r2.<init>(r0)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r0._joinMCButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r3)
            r0.mJoinButtonsCellRef = r1
            r19.row()
            java.lang.String r1 = "unjoin"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargeUnjoin()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r1, r2)
            r0._unjoinMCButton = r1
            r2 = 145(0x91, float:2.03E-43)
            r0.registerWidget(r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r0._unjoinMCButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$26 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$26
            r2.<init>(r0)
            r1.addListener(r2)
            java.lang.String r1 = "unlockFromCamera"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getShortLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r1, r2)
            r0.mUnlockFromCameraButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$27 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$27
            r2.<init>(r0)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0.mUnlockFromCameraButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r3)
            r0.mUnlockFromCameraCellRef = r1
            r19.row()
            r19.pack()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r12 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r12.mSessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r0.getCurrentlySelectedMC()
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L16
            com.badlogic.gdx.scenes.scene2d.Touchable r3 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r12.setTouchable(r3)
            r12.setColor(r2, r2, r2, r1)
            goto L1db
        L16:
            com.badlogic.gdx.scenes.scene2d.Touchable r3 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r12.setTouchable(r3)
            r12.setColor(r2, r2, r2, r2)
            java.lang.String r3 = r0.getName()
            int r4 = r3.length()
            java.lang.String r5 = "..."
            r6 = 0
            r7 = 50
            r8 = 23
            if (r4 <= r7) goto L52
            java.lang.String r4 = r3.substring(r6, r8)
            int r9 = r3.length()
            int r9 = r9 - r8
            int r10 = r3.length()
            java.lang.String r3 = r3.substring(r9, r10)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            r9.append(r5)
            r9.append(r3)
            java.lang.String r3 = r9.toString()
        L52:
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r12._movieclipNameLabel
            int r9 = r0.getID()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r3)
            java.lang.String r3 = " (ID: "
            r10.append(r3)
            r10.append(r9)
            java.lang.String r9 = ")"
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            r4.setText(r10)
            org.fortheloss.framework.DegreesLabelInputIncrementField r4 = r12.mAngleField
            float r10 = r0.getRotation()
            r4.setValue(r10)
            org.fortheloss.framework.LabelInputIncrementField r4 = r12.mScaleField
            float r10 = r0.getScale()
            r4.setValue(r10)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r12._lockMCButton
            boolean r10 = r0.isLocked()
            r4.setChecked(r10)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r12._showInOnionSkinButton
            boolean r10 = r0.isVisibleInOnionSkin()
            r4.setChecked(r10)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r12._keepMCDuringTweenButton
            boolean r10 = r0.isPersistent()
            r4.setChecked(r10)
            boolean r4 = r0.isJoined()
            if (r4 != 0) goto Ldb
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton> r3 = r12.mJoinButtonsCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r12._joinMCButton
            if (r3 == r4) goto Lb6
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton> r3 = r12.mJoinButtonsCellRef
            r3.setActor(r4)
        Lb6:
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r12._joinMCButton
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r3.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r12._joinMCButton
            r3.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r12._unjoinMCButton
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r3.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r12._unjoinMCButton
            r3.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r3 = r12._joinAnchorTableCell
            r3.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r12._joinAnchorNameLabel
            r4 = 0
            r3.setUserObject(r4)
            goto L177
        Ldb:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton> r4 = r12.mJoinButtonsCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r4.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r10 = r12._unjoinMCButton
            if (r4 == r10) goto Lea
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton> r4 = r12.mJoinButtonsCellRef
            r4.setActor(r10)
        Lea:
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r12._joinMCButton
            com.badlogic.gdx.scenes.scene2d.Touchable r10 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r4.setTouchable(r10)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r12._joinMCButton
            r4.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r12._unjoinMCButton
            com.badlogic.gdx.scenes.scene2d.Touchable r10 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r4.setTouchable(r10)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r12._unjoinMCButton
            r4.setColor(r2, r2, r2, r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = r0.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r4.getStickfigure()
            java.lang.String r10 = r4.getName()
            int r11 = r10.length()
            if (r11 <= r7) goto L133
            java.lang.String r6 = r10.substring(r6, r8)
            int r7 = r10.length()
            int r7 = r7 - r8
            java.lang.String r7 = r10.substring(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r8.append(r5)
            r8.append(r7)
            java.lang.String r10 = r8.toString()
        L133:
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r12._joinAnchorNameLabel
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r0.getJoinedToNode()
            r5.setUserObject(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r12._joinAnchorNameLabel
            java.lang.String r6 = "joinedTo"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            int r4 = r4.getID()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = ":\n"
            r7.append(r6)
            r7.append(r10)
            r7.append(r3)
            r7.append(r4)
            r7.append(r9)
            java.lang.String r3 = r7.toString()
            r5.setText(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r3 = r12._joinAnchorTableCell
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            if (r3 != 0) goto L177
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r3 = r12._joinAnchorTableCell
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r12._joinAnchorTable
            r3.setActor(r4)
        L177:
            byte r3 = r0.isLockedToCamera()
            if (r3 == 0) goto L199
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r12._joinMCButton
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r3.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r12._joinMCButton
            r3.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.TextButton> r3 = r12.mUnlockFromCameraCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            if (r3 != 0) goto L19e
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.TextButton> r3 = r12.mUnlockFromCameraCellRef
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r12.mUnlockFromCameraButton
            r3.setActor(r4)
            goto L19e
        L199:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.TextButton> r3 = r12.mUnlockFromCameraCellRef
            r3.clearActor()
        L19e:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableLoopOnce r3 = r12._loopOnceTable
            r3.update(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableGraphic r3 = r12._graphicTable
            r3.update(r0)
            int r3 = r0.getPlaymode()
            if (r3 != 0) goto L1c5
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable> r3 = r12._typeTableCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableGraphic r4 = r12._graphicTable
            if (r3 == r4) goto L1db
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable> r3 = r12._typeTableCellRef
            r3.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable> r3 = r12._typeTableCellRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableGraphic r4 = r12._graphicTable
            r3.setActor(r4)
            goto L1db
        L1c5:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable> r3 = r12._typeTableCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableLoopOnce r4 = r12._loopOnceTable
            if (r3 == r4) goto L1db
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable> r3 = r12._typeTableCellRef
            r3.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable> r3 = r12._typeTableCellRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable$SubToolTableLoopOnce r4 = r12._loopOnceTable
            r3.setActor(r4)
        L1db:
            org.fortheloss.sticknodes.data.SessionData r3 = r12.mSessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r3 = r3.getCopiedMovieclip()
            if (r3 != 0) goto L1f0
            org.fortheloss.sticknodes.TextButtonLongPress r3 = r12._pasteMCButton
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r3.setTouchable(r4)
            org.fortheloss.sticknodes.TextButtonLongPress r3 = r12._pasteMCButton
            r3.setColor(r2, r2, r2, r1)
            goto L1fc
        L1f0:
            org.fortheloss.sticknodes.TextButtonLongPress r1 = r12._pasteMCButton
            com.badlogic.gdx.scenes.scene2d.Touchable r3 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r1.setTouchable(r3)
            org.fortheloss.sticknodes.TextButtonLongPress r1 = r12._pasteMCButton
            r1.setColor(r2, r2, r2, r2)
        L1fc:
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r12.mLayerPositionLabel
            java.lang.String r2 = "? / ?"
            r1.setText(r2)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r1 = r12._animationToolsModuleRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentFrame()
            if (r1 == 0) goto L246
            java.util.ArrayList r1 = r1.getDrawableFigures()
            int r2 = r1.size()
            int r3 = r2 + (-1)
        L215:
            if (r3 < 0) goto L221
            java.lang.Object r4 = r1.get(r3)
            if (r4 != r0) goto L21e
            goto L222
        L21e:
            int r3 = r3 + (-1)
            goto L215
        L221:
            r3 = -1
        L222:
            if (r3 < 0) goto L22b
            int r3 = r3 + 1
            java.lang.String r0 = java.lang.String.valueOf(r3)
            goto L22d
        L22b:
            java.lang.String r0 = "?"
        L22d:
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r12.mLayerPositionLabel
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = " / "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            r1.setText(r0)
        L246:
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu r0 = r12._pasteContextMenu
            r0.update()
            return
    }
}
