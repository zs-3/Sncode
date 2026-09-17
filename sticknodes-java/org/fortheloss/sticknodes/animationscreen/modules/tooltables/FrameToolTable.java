package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class FrameToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu _addInbetweenFramesContextMenu;
    private org.fortheloss.sticknodes.TextButtonLongPress _addTweenedFrameButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _addTweenedFrameRadioButtonsTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _addTweenedFrameTable;
    private org.fortheloss.framework.ColorPicker _backgroundColorPicker;
    private org.fortheloss.framework.ColorPicker _backgroundGradientColorPicker;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _clearFrameButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _clearSoundButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _copySoundButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _deleteSoundButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _doNotTweenButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _expandGradientButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _expandGradientLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _frameDelayTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> _frameDelayTableCell;
    private org.fortheloss.sticknodes.animationscreen.FramesContainer _framesContainerRef;
    private boolean _ignoreNextSoundChangeEvent;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _importSoundButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _moveCamDuringDelayButton;
    private org.fortheloss.sticknodes.animationscreen.modules.contextmenus.MoveCameraDuringDelayContextMenu _moveCamDuringDelayContextMenu;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _moveCamDuringDelayLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _moveCamDuringDelaySettingsButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _pasteSoundButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _playSoundButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _questionAddTweenedFrameButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _repeatButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _repeatInfoLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _repeatLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _repeatTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> _repeatTableCell;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _repeatUseTweenPropertiesButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _repeatUseTweenPropertiesLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _silenceSoundsButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _soundCheckButton;
    private com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> _soundLibraryNameStrings;
    private org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> _soundLibrarySelectBox;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _soundPanLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Slider _soundPanSlider;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _soundPitchLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Slider _soundPitchSlider;
    private com.badlogic.gdx.scenes.scene2d.ui.Slider _soundVolumeSlider;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _soundVolumeTextField;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable _soundsTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _stickfigureCountLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _subSoundsTable;
    private com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable _texRefTweenedFrameBarLeft10;
    private com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable _texRefTweenedFrameBarLeft33;
    private com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable _texRefTweenedFrameBarLeft50;
    private com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable _texRefTweenedFrameBarLeftNone;
    private com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable _texRefTweenedFrameBarRight50;
    private com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable _texRefTweenedFrameBarRight67;
    private com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable _texRefTweenedFrameBarRight90;
    private com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable _texRefTweenedFrameBarRightNone;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _titleLabel;
    private int _tracedFrameIndex;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _tween1090Button;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _tween3367Button;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _tween50Button;
    private boolean _tweenedFrameEndEnabled;
    private com.badlogic.gdx.scenes.scene2d.ui.Image _tweenedFrameImageLeft;
    private com.badlogic.gdx.scenes.scene2d.ui.Image _tweenedFrameImageRight;
    private int _tweenedFramePercentageState;
    private boolean _tweenedFrameStartEnabled;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _useBackgroundGradientButton;
    private org.fortheloss.framework.CheckBoxInputIncrementField mFrameDelayField;
    private org.fortheloss.framework.LabelInputIncrementSmallField mRepeatGoBackFramesField;
    private org.fortheloss.framework.LabelInputIncrementSmallField mRepeatLoopsField;
    private org.fortheloss.framework.CheckBoxInputIncrementField mSlowMotionField;










































    /* renamed from: -$$Nest$fget_addInbetweenFramesContextMenu, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu m936$$Nest$fget_addInbetweenFramesContextMenu(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r0 = r0._addInbetweenFramesContextMenu
            return r0
    }

    /* renamed from: -$$Nest$fget_backgroundColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m937$$Nest$fget_backgroundColorPicker(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            org.fortheloss.framework.ColorPicker r0 = r0._backgroundColorPicker
            return r0
    }

    /* renamed from: -$$Nest$fget_backgroundGradientColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m938$$Nest$fget_backgroundGradientColorPicker(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            org.fortheloss.framework.ColorPicker r0 = r0._backgroundGradientColorPicker
            return r0
    }

    /* renamed from: -$$Nest$fget_frameDelayTable, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Table m939$$Nest$fget_frameDelayTable(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0._frameDelayTable
            return r0
    }

    /* renamed from: -$$Nest$fget_frameDelayTableCell, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Cell m940$$Nest$fget_frameDelayTableCell(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r0._frameDelayTableCell
            return r0
    }

    /* renamed from: -$$Nest$fget_moveCamDuringDelayButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m941$$Nest$fget_moveCamDuringDelayButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._moveCamDuringDelayButton
            return r0
    }

    /* renamed from: -$$Nest$fget_moveCamDuringDelayContextMenu, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.contextmenus.MoveCameraDuringDelayContextMenu m942$$Nest$fget_moveCamDuringDelayContextMenu(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.MoveCameraDuringDelayContextMenu r0 = r0._moveCamDuringDelayContextMenu
            return r0
    }

    /* renamed from: -$$Nest$fget_moveCamDuringDelaySettingsButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextButton m943$$Nest$fget_moveCamDuringDelaySettingsButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r0._moveCamDuringDelaySettingsButton
            return r0
    }

    /* renamed from: -$$Nest$fget_repeatButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m944$$Nest$fget_repeatButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._repeatButton
            return r0
    }

    /* renamed from: -$$Nest$fget_repeatTable, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Table m945$$Nest$fget_repeatTable(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0._repeatTable
            return r0
    }

    /* renamed from: -$$Nest$fget_repeatTableCell, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Cell m946$$Nest$fget_repeatTableCell(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r0._repeatTableCell
            return r0
    }

    /* renamed from: -$$Nest$fget_repeatUseTweenPropertiesButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m947$$Nest$fget_repeatUseTweenPropertiesButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._repeatUseTweenPropertiesButton
            return r0
    }

    /* renamed from: -$$Nest$fget_soundLibrarySelectBox, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter m948$$Nest$fget_soundLibrarySelectBox(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r0._soundLibrarySelectBox
            return r0
    }

    /* renamed from: -$$Nest$fget_soundPanLabel, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Label m949$$Nest$fget_soundPanLabel(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0._soundPanLabel
            return r0
    }

    /* renamed from: -$$Nest$fget_soundPanSlider, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Slider m950$$Nest$fget_soundPanSlider(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r0._soundPanSlider
            return r0
    }

    /* renamed from: -$$Nest$fget_soundPitchLabel, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Label m951$$Nest$fget_soundPitchLabel(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0._soundPitchLabel
            return r0
    }

    /* renamed from: -$$Nest$fget_soundPitchSlider, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Slider m952$$Nest$fget_soundPitchSlider(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r0._soundPitchSlider
            return r0
    }

    /* renamed from: -$$Nest$fget_soundVolumeSlider, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Slider m953$$Nest$fget_soundVolumeSlider(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r0._soundVolumeSlider
            return r0
    }

    /* renamed from: -$$Nest$fget_soundVolumeTextField, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextField m954$$Nest$fget_soundVolumeTextField(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r0._soundVolumeTextField
            return r0
    }

    /* renamed from: -$$Nest$fget_tweenedFramePercentageState, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m955$$Nest$fget_tweenedFramePercentageState(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            int r0 = r0._tweenedFramePercentageState
            return r0
    }

    /* renamed from: -$$Nest$monAddTweenedFrameClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m956$$Nest$monAddTweenedFrameClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            r0.onAddTweenedFrameClick()
            return
    }

    /* renamed from: -$$Nest$monAddTweenedFrameQuestionClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m957$$Nest$monAddTweenedFrameQuestionClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            r0.onAddTweenedFrameQuestionClick()
            return
    }

    /* renamed from: -$$Nest$monAddTweenedFramesBarClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m958$$Nest$monAddTweenedFramesBarClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            r0.onAddTweenedFramesBarClick()
            return
    }

    /* renamed from: -$$Nest$monBackgroundColorSelect, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m959$$Nest$monBackgroundColorSelect(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            r0.onBackgroundColorSelect()
            return
    }

    /* renamed from: -$$Nest$monBackgroundGradientSelect, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m960$$Nest$monBackgroundGradientSelect(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            r0.onBackgroundGradientSelect()
            return
    }

    /* renamed from: -$$Nest$monClearFrameClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m961$$Nest$monClearFrameClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            r0.onClearFrameClick()
            return
    }

    /* renamed from: -$$Nest$monClearSoundClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m962$$Nest$monClearSoundClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            r0.onClearSoundClick()
            return
    }

    /* renamed from: -$$Nest$monCopySoundClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m963$$Nest$monCopySoundClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            r0.onCopySoundClick()
            return
    }

    /* renamed from: -$$Nest$monDeleteSoundClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m964$$Nest$monDeleteSoundClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0, int r1) {
            r0.onDeleteSoundClick(r1)
            return
    }

    /* renamed from: -$$Nest$monDoNotTweenClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m965$$Nest$monDoNotTweenClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            r0.onDoNotTweenClick()
            return
    }

    /* renamed from: -$$Nest$monExpandGradientClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m966$$Nest$monExpandGradientClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            r0.onExpandGradientClick()
            return
    }

    /* renamed from: -$$Nest$monImportSoundClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m967$$Nest$monImportSoundClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            r0.onImportSoundClick()
            return
    }

    /* renamed from: -$$Nest$monPasteSoundClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m968$$Nest$monPasteSoundClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            r0.onPasteSoundClick()
            return
    }

    /* renamed from: -$$Nest$monPlaySoundClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m969$$Nest$monPlaySoundClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0, int r1) {
            r0.onPlaySoundClick(r1)
            return
    }

    /* renamed from: -$$Nest$monSetSoundPanEnter, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m970$$Nest$monSetSoundPanEnter(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            r0.onSetSoundPanEnter()
            return
    }

    /* renamed from: -$$Nest$monSetSoundPitchEnter, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m971$$Nest$monSetSoundPitchEnter(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            r0.onSetSoundPitchEnter()
            return
    }

    /* renamed from: -$$Nest$monSetSoundVolumeEnter, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m972$$Nest$monSetSoundVolumeEnter(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0, boolean r1) {
            r0.onSetSoundVolumeEnter(r1)
            return
    }

    /* renamed from: -$$Nest$monSilenceSoundsClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m973$$Nest$monSilenceSoundsClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            r0.onSilenceSoundsClick()
            return
    }

    /* renamed from: -$$Nest$monSoundSelection, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m974$$Nest$monSoundSelection(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0, int r1) {
            r0.onSoundSelection(r1)
            return
    }

    /* renamed from: -$$Nest$monTweenedFramePercentageClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m975$$Nest$monTweenedFramePercentageClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            r0.onTweenedFramePercentageClick()
            return
    }

    /* renamed from: -$$Nest$monUseBackgroundGradientClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m976$$Nest$monUseBackgroundGradientClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0) {
            r0.onUseBackgroundGradientClick()
            return
    }

    public FrameToolTable(org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r1, org.fortheloss.sticknodes.data.ProjectData r2, org.fortheloss.sticknodes.data.SessionData r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 3
            r0._tweenedFramePercentageState = r1
            r1 = 1
            r0._tweenedFrameStartEnabled = r1
            r0._tweenedFrameEndEnabled = r1
            r1 = 0
            r0._ignoreNextSoundChangeEvent = r1
            r0._tracedFrameIndex = r1
            return
    }

    private void onAddTweenedFrameClick() {
            r4 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r4.mAnimationBasedModuleRef
            int r1 = r4._tweenedFramePercentageState
            boolean r2 = r4._tweenedFrameStartEnabled
            boolean r3 = r4._tweenedFrameEndEnabled
            r0.addTweenedFrame(r1, r2, r3)
            return
    }

    private void onAddTweenedFrameQuestionClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.showAddTweenedFrameDialog()
            return
    }

    private void onAddTweenedFramesBarClick() {
            r4 = this;
            boolean r0 = r4._tweenedFrameStartEnabled
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Ld
            boolean r3 = r4._tweenedFrameEndEnabled
            if (r3 == 0) goto Ld
            r4._tweenedFrameEndEnabled = r1
            goto L18
        Ld:
            if (r0 == 0) goto L14
            r4._tweenedFrameStartEnabled = r1
            r4._tweenedFrameEndEnabled = r2
            goto L18
        L14:
            r4._tweenedFrameStartEnabled = r2
            r4._tweenedFrameEndEnabled = r2
        L18:
            int r0 = r4._tweenedFramePercentageState
            r1 = 3
            if (r0 != r1) goto L21
            r4._tweenedFrameStartEnabled = r2
            r4._tweenedFrameEndEnabled = r2
        L21:
            r4.updateAddTweenedFrameDisplay()
            return
    }

    private void onBackgroundColorSelect() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = (org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule) r0
            org.fortheloss.framework.ColorPicker r1 = r2._backgroundColorPicker
            com.badlogic.gdx.graphics.Color r1 = r1.getColor()
            r0.setFrameBackgroundColor(r1)
            return
    }

    private void onBackgroundGradientSelect() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = (org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule) r0
            org.fortheloss.framework.ColorPicker r1 = r2._backgroundGradientColorPicker
            com.badlogic.gdx.graphics.Color r1 = r1.getColor()
            r0.setFrameGradient(r1)
            return
    }

    private void onClearFrameClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.clearFrame()
            return
    }

    private void onClearSoundClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.clearSound()
            return
    }

    private void onCopySoundClick() {
            r1 = this;
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r1._soundLibrarySelectBox
            int r0 = r0.getSelectedIndex()
            if (r0 > 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.copySound()
            return
    }

    private void onDeleteSoundClick(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            int r2 = r2 + (-1)
            r0.deleteSound(r2)
            return
    }

    private void onDoNotTweenClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = (org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule) r0
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._doNotTweenButton
            boolean r1 = r1.isChecked()
            r1 = r1 ^ 1
            r0.setFrameTweening(r1)
            return
    }

    private void onExpandGradientClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = (org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule) r0
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._expandGradientButton
            boolean r1 = r1.isChecked()
            r0.setFrameExpandedGradient(r1)
            return
    }

    private void onImportSoundClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.importSound()
            return
    }

    private void onPasteSoundClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.pasteSound()
            return
    }

    private void onPlaySoundClick(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            int r2 = r2 + (-1)
            r0.playSound(r2)
            return
    }

    private void onSetSoundPanEnter() {
            r4 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r4._soundPanSlider
            float r0 = r0.getValue()
            r1 = 1101004800(0x41a00000, float:20.0)
            float r0 = r0 / r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            r2 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 * r2
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            float r0 = r0 / r2
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 >= 0) goto L23
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L29
        L23:
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L28
            goto L29
        L28:
            r1 = r0
        L29:
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r4.mAnimationBasedModuleRef
            r0.setFrameSoundPan(r1)
            return
    }

    private void onSetSoundPitchEnter() {
            r4 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r4._soundPitchSlider
            float r0 = r0.getValue()
            r1 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 / r1
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L14
            float r0 = r0 * r1
            float r0 = r0 + r1
        L14:
            r2 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r2
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            float r0 = r0 / r2
            r2 = 1073741824(0x40000000, float:2.0)
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 >= 0) goto L25
            goto L2d
        L25:
            int r1 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r1 <= 0) goto L2c
            r1 = 1073741824(0x40000000, float:2.0)
            goto L2d
        L2c:
            r1 = r0
        L2d:
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r4.mAnimationBasedModuleRef
            r0.setFrameSoundPitch(r1)
            return
    }

    private void onSetSoundVolumeEnter(boolean r5) {
            r4 = this;
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r4._soundVolumeTextField
            java.lang.String r0 = r0.getText()
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            r1 = 100
            r2 = 1
            if (r0 == 0) goto L13
            r0 = 1
            goto L24
        L13:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r4._soundVolumeTextField     // Catch: java.lang.NumberFormatException -> L22
            java.lang.String r0 = r0.getText()     // Catch: java.lang.NumberFormatException -> L22
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L22
            int r0 = r0.intValue()     // Catch: java.lang.NumberFormatException -> L22
            goto L24
        L22:
            r0 = 100
        L24:
            if (r0 >= r2) goto L28
            r1 = 1
            goto L2c
        L28:
            if (r0 <= r1) goto L2b
            goto L2c
        L2b:
            r1 = r0
        L2c:
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r4._soundVolumeSlider
            float r2 = (float) r1
            r0.setValue(r2)
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r4.mAnimationBasedModuleRef
            r3 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r3
            r0.setFrameSoundVolume(r2)
            if (r5 == 0) goto L45
            com.badlogic.gdx.scenes.scene2d.ui.TextField r5 = r4._soundVolumeTextField
            java.lang.String r0 = java.lang.String.valueOf(r1)
            r5.setText(r0)
        L45:
            return
    }

    private void onSilenceSoundsClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = (org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule) r0
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._silenceSoundsButton
            boolean r1 = r1.isChecked()
            r0.setFrameSilencesSounds(r1)
            return
    }

    private void onSoundSelection(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            int r2 = r2 + (-1)
            r0.setFrameSound(r2)
            return
    }

    private void onTweenedFramePercentageClick() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r2._tween1090Button
            boolean r0 = r0.isChecked()
            r1 = 1
            if (r0 == 0) goto Lc
            r2._tweenedFramePercentageState = r1
            goto L1b
        Lc:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r2._tween3367Button
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L18
            r0 = 2
            r2._tweenedFramePercentageState = r0
            goto L1b
        L18:
            r0 = 3
            r2._tweenedFramePercentageState = r0
        L1b:
            r2._tweenedFrameStartEnabled = r1
            r2._tweenedFrameEndEnabled = r1
            r2.updateAddTweenedFrameDisplay()
            return
    }

    private void onUseBackgroundGradientClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = (org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule) r0
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._useBackgroundGradientButton
            boolean r1 = r1.isChecked()
            r0.useFrameGradient(r1)
            return
    }

    private void updateAddTweenedFrameDisplay() {
            r6 = this;
            int r0 = r6._tweenedFramePercentageState
            java.lang.String r1 = "addTweenedFrame"
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L72
            boolean r0 = r6._tweenedFrameStartEnabled
            if (r0 == 0) goto L2e
            boolean r4 = r6._tweenedFrameEndEnabled
            if (r4 == 0) goto L2e
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r6._addTweenedFrameButton
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "10%, 90%"
            r3[r2] = r4
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1, r3)
            r0.setText(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r6._tweenedFrameImageLeft
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r1 = r6._texRefTweenedFrameBarLeft10
            r0.setDrawable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r6._tweenedFrameImageRight
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r1 = r6._texRefTweenedFrameBarRight90
            r0.setDrawable(r1)
            goto L6b
        L2e:
            if (r0 == 0) goto L4e
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r6._addTweenedFrameButton
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "10%"
            r3[r2] = r4
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1, r3)
            r0.setText(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r6._tweenedFrameImageLeft
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r1 = r6._texRefTweenedFrameBarLeft10
            r0.setDrawable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r6._tweenedFrameImageRight
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r1 = r6._texRefTweenedFrameBarRightNone
            r0.setDrawable(r1)
            goto L6b
        L4e:
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r6._addTweenedFrameButton
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "90%"
            r3[r2] = r4
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1, r3)
            r0.setText(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r6._tweenedFrameImageLeft
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r1 = r6._texRefTweenedFrameBarLeftNone
            r0.setDrawable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r6._tweenedFrameImageRight
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r1 = r6._texRefTweenedFrameBarRight90
            r0.setDrawable(r1)
        L6b:
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r6._addTweenedFrameButton
            r0.setLongPressEnabled(r2)
            goto L100
        L72:
            r4 = 2
            if (r0 != r4) goto Lde
            boolean r0 = r6._tweenedFrameStartEnabled
            if (r0 == 0) goto L9b
            boolean r4 = r6._tweenedFrameEndEnabled
            if (r4 == 0) goto L9b
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r6._addTweenedFrameButton
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "33%, 67%"
            r3[r2] = r4
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1, r3)
            r0.setText(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r6._tweenedFrameImageLeft
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r1 = r6._texRefTweenedFrameBarLeft33
            r0.setDrawable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r6._tweenedFrameImageRight
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r1 = r6._texRefTweenedFrameBarRight67
            r0.setDrawable(r1)
            goto Ld8
        L9b:
            if (r0 == 0) goto Lbb
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r6._addTweenedFrameButton
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "33%"
            r3[r2] = r4
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1, r3)
            r0.setText(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r6._tweenedFrameImageLeft
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r1 = r6._texRefTweenedFrameBarLeft33
            r0.setDrawable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r6._tweenedFrameImageRight
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r1 = r6._texRefTweenedFrameBarRightNone
            r0.setDrawable(r1)
            goto Ld8
        Lbb:
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r6._addTweenedFrameButton
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "67%"
            r3[r2] = r4
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1, r3)
            r0.setText(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r6._tweenedFrameImageLeft
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r1 = r6._texRefTweenedFrameBarLeftNone
            r0.setDrawable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r6._tweenedFrameImageRight
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r1 = r6._texRefTweenedFrameBarRight67
            r0.setDrawable(r1)
        Ld8:
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r6._addTweenedFrameButton
            r0.setLongPressEnabled(r2)
            goto L100
        Lde:
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r6._addTweenedFrameButton
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "50%"
            r4[r2] = r5
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1, r4)
            r0.setText(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r6._tweenedFrameImageLeft
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r1 = r6._texRefTweenedFrameBarLeft50
            r0.setDrawable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = r6._tweenedFrameImageRight
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r1 = r6._texRefTweenedFrameBarRight50
            r0.setDrawable(r1)
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r6._addTweenedFrameButton
            r0.setLongPressEnabled(r3)
        L100:
            return
    }

    private void updateSoundLibrary() {
            r6 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.isPro()
            if (r0 != 0) goto L9
            return
        L9:
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r6._soundLibraryNameStrings
            r0.clear()
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r6._soundLibraryNameStrings
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex
            java.lang.String r2 = "noneLowercase"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "<"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = ">"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r3 = 0
            r1.<init>(r2, r3)
            r0.add(r1)
            org.fortheloss.sticknodes.data.ProjectData r0 = r6._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r0 = r0.librarySoundDatas
            int r0 = r0.size()
            r1 = 0
        L3e:
            if (r1 >= r0) goto L59
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r2 = r6._soundLibraryNameStrings
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex
            org.fortheloss.sticknodes.data.ProjectData r5 = r6._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r5 = r5.librarySoundDatas
            java.lang.Object r5 = r5.get(r1)
            org.fortheloss.sticknodes.data.SoundData r5 = (org.fortheloss.sticknodes.data.SoundData) r5
            java.lang.String r5 = r5.fileName
            int r1 = r1 + 1
            r4.<init>(r5, r1)
            r2.add(r4)
            goto L3e
        L59:
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r6._soundLibraryNameStrings
            int r0 = r0.size
            if (r0 > 0) goto L6d
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r6._soundLibrarySelectBox
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r1)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r6._soundLibrarySelectBox
            r1 = 1
            r0.setDisabled(r1)
            goto L79
        L6d:
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r6._soundLibrarySelectBox
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r1)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r6._soundLibrarySelectBox
            r0.setDisabled(r3)
        L79:
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r6._soundLibrarySelectBox
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r1 = r6._soundLibraryNameStrings
            r0.setItems(r1)
            return
    }

    public void clearSoundSearchFilter() {
            r1 = this;
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r1._soundLibrarySelectBox
            r0.clearSearch()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._framesContainerRef = r0
            r2._titleLabel = r0
            r2._stickfigureCountLabel = r0
            r2._addTweenedFrameButton = r0
            r2._questionAddTweenedFrameButton = r0
            r2._tweenedFrameImageLeft = r0
            r2._tweenedFrameImageRight = r0
            r2._tween1090Button = r0
            r2._tween3367Button = r0
            r2._tween50Button = r0
            r2._useBackgroundGradientButton = r0
            r2._expandGradientLabel = r0
            r2._expandGradientButton = r0
            r2._doNotTweenButton = r0
            r2._silenceSoundsButton = r0
            r2._moveCamDuringDelayLabel = r0
            r2._moveCamDuringDelayButton = r0
            r2._moveCamDuringDelaySettingsButton = r0
            r2._importSoundButton = r0
            r2._playSoundButton = r0
            r2._deleteSoundButton = r0
            r2._soundLibrarySelectBox = r0
            r2._soundCheckButton = r0
            r2._soundVolumeTextField = r0
            r2._soundVolumeSlider = r0
            r2._soundPanLabel = r0
            r2._soundPanSlider = r0
            r2._soundPitchLabel = r0
            r2._soundPitchSlider = r0
            r2._copySoundButton = r0
            r2._pasteSoundButton = r0
            r2._clearSoundButton = r0
            r2._clearFrameButton = r0
            r2._repeatButton = r0
            r2._repeatLabel = r0
            r2._repeatInfoLabel = r0
            r2._repeatUseTweenPropertiesButton = r0
            r2._repeatUseTweenPropertiesLabel = r0
            r2._texRefTweenedFrameBarLeftNone = r0
            r2._texRefTweenedFrameBarLeft50 = r0
            r2._texRefTweenedFrameBarLeft33 = r0
            r2._texRefTweenedFrameBarLeft10 = r0
            r2._texRefTweenedFrameBarRightNone = r0
            r2._texRefTweenedFrameBarRight50 = r0
            r2._texRefTweenedFrameBarRight67 = r0
            r2._texRefTweenedFrameBarRight90 = r0
            r2._soundLibraryNameStrings = r0
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r2.mFrameDelayField
            if (r1 == 0) goto L68
            r1.dispose()
            r2.mFrameDelayField = r0
        L68:
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r2.mSlowMotionField
            if (r1 == 0) goto L71
            r1.dispose()
            r2.mSlowMotionField = r0
        L71:
            org.fortheloss.framework.LabelInputIncrementSmallField r1 = r2.mRepeatGoBackFramesField
            if (r1 == 0) goto L7a
            r1.dispose()
            r2.mRepeatGoBackFramesField = r0
        L7a:
            org.fortheloss.framework.LabelInputIncrementSmallField r1 = r2.mRepeatLoopsField
            if (r1 == 0) goto L83
            r1.dispose()
            r2.mRepeatLoopsField = r0
        L83:
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r1 = r2._addInbetweenFramesContextMenu
            if (r1 == 0) goto L8c
            r1.dispose()
            r2._addInbetweenFramesContextMenu = r0
        L8c:
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.MoveCameraDuringDelayContextMenu r1 = r2._moveCamDuringDelayContextMenu
            if (r1 == 0) goto L95
            r1.dispose()
            r2._moveCamDuringDelayContextMenu = r0
        L95:
            org.fortheloss.framework.ColorPicker r1 = r2._backgroundColorPicker
            if (r1 == 0) goto L9e
            r1.dispose()
            r2._backgroundColorPicker = r0
        L9e:
            org.fortheloss.framework.ColorPicker r1 = r2._backgroundGradientColorPicker
            if (r1 == 0) goto La7
            r1.dispose()
            r2._backgroundGradientColorPicker = r0
        La7:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable r1 = r2._soundsTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._soundsTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._addTweenedFrameTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._addTweenedFrameTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._addTweenedFrameRadioButtonsTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._addTweenedFrameRadioButtonsTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._subSoundsTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._subSoundsTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._frameDelayTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._frameDelayTable = r0
            r2._frameDelayTableCell = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._repeatTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._repeatTable = r0
            r2._repeatTableCell = r0
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r31, com.badlogic.gdx.graphics.g2d.TextureAtlas r32, com.badlogic.gdx.scenes.scene2d.utils.Drawable r33) {
            r30 = this;
            r7 = r30
            r8 = r31
            r9 = r33
            super.initialize(r9)
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r7.mAnimationBasedModuleRef
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule
            java.lang.String r1 = "frameTools"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r10 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r10, r2)
            r7._titleLabel = r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            r11 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r11)
            r1.fillX()
            r30.row()
            org.fortheloss.sticknodes.animationscreen.modules.Module r1 = r30.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r1.getContext()
            org.fortheloss.sticknodes.data.SessionData r1 = r1.getSessionData()
            boolean r1 = r1.getNerdModeEnabled()
            java.lang.String r12 = "separator"
            if (r1 != 0) goto L8e
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            boolean r1 = r1.isPro()
            if (r1 == 0) goto L8e
            java.lang.String r1 = "scrollDownForSounds"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r10, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r11)
            r1.fillX()
            r30.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r8.findRegion(r12)
            r1.<init>(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r11)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padTop(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padBottom(r2)
            r1.fillX()
            r30.row()
        L8e:
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            java.lang.String r13 = ""
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r13, r10, r1)
            r7._stickfigureCountLabel = r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r11)
            r1.fillX()
            r30.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r8.findRegion(r12)
            r1.<init>(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r11)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padTop(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padBottom(r2)
            r1.fillX()
            r30.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r1.<init>()
            r7._addTweenedFrameTable = r1
            r14 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r1.pad(r14)
            r1.align(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._addTweenedFrameTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.pad(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.space(r14)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r15 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 * r15
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.spaceRight(r2)
            r1.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._addTweenedFrameTable
            r6 = 0
            r1.setRound(r6)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$1 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$1
            java.lang.Object[] r2 = new java.lang.Object[r10]
            java.lang.String r3 = "50%"
            r2[r6] = r3
            java.lang.String r3 = "addTweenedFrame"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r3, r2)
            org.fortheloss.sticknodes.TextButtonLongPress$TextButtonLongPressStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonLongPressStyle()
            r1.<init>(r7, r2, r3)
            r7._addTweenedFrameButton = r1
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r1.getLabel()
            r1.setWrap(r10)
            org.fortheloss.sticknodes.TextButtonLongPress r1 = r7._addTweenedFrameButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r1.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.getCell(r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1082130432(0x40800000, float:4.0)
            float r4 = r2 * r3
            float r2 = r2 * r3
            r1.pad(r14, r4, r14, r2)
            org.fortheloss.sticknodes.TextButtonLongPress r1 = r7._addTweenedFrameButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$2 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$2
            r2.<init>(r7)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._addTweenedFrameTable
            org.fortheloss.sticknodes.TextButtonLongPress r2 = r7._addTweenedFrameButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r2)
            org.fortheloss.sticknodes.TextButtonLongPress r2 = r7._addTweenedFrameButton
            float r2 = r2.getWidth()
            r3 = 1060320051(0x3f333333, float:0.7)
            float r2 = r2 * r3
            r1.width(r2)
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.AddInbetweenFramesContextMenu r1 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.AddInbetweenFramesContextMenu
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getContextMenuBackgroundDrawable()
            r1.<init>(r7, r2)
            r7._addInbetweenFramesContextMenu = r1
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            java.lang.String r2 = "?"
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r2, r1)
            r7._questionAddTweenedFrameButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$3 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$3
            r2.<init>(r7)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._addTweenedFrameTable
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r7._questionAddTweenedFrameButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r7._questionAddTweenedFrameButton
            float r2 = r2.getWidth()
            r5 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r5
            r1.width(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._addTweenedFrameTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            r1.colspan(r11)
            r30.row()
            java.lang.String r1 = "tweenedFrameBar"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r10, r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$4 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$4
            r2.<init>(r7)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r11)
            r1.fillX()
            r30.row()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r1 = new com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup
            r1.<init>()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$5 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$5
            r2.<init>(r7)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r1.space(r14)
            r3 = 1101004800(0x41a00000, float:20.0)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r3
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = r2.pad(r14, r14, r4, r14)
            r4 = 8
            r2.align(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r7.add(r1)
            r2.colspan(r11)
            r30.row()
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r2 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            java.lang.String r3 = "tweened-frames-bar-left-none"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r3 = r8.findRegion(r3)
            r2.<init>(r3)
            r7._texRefTweenedFrameBarLeftNone = r2
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r2 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            java.lang.String r3 = "tweened-frames-bar-left-50"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r3 = r8.findRegion(r3)
            r2.<init>(r3)
            r7._texRefTweenedFrameBarLeft50 = r2
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r2 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            java.lang.String r3 = "tweened-frames-bar-left-33"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r3 = r8.findRegion(r3)
            r2.<init>(r3)
            r7._texRefTweenedFrameBarLeft33 = r2
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r2 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            java.lang.String r3 = "tweened-frames-bar-left-10"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r3 = r8.findRegion(r3)
            r2.<init>(r3)
            r7._texRefTweenedFrameBarLeft10 = r2
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r2 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            java.lang.String r3 = "tweened-frames-bar-right-none"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r3 = r8.findRegion(r3)
            r2.<init>(r3)
            r7._texRefTweenedFrameBarRightNone = r2
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r2 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            java.lang.String r3 = "tweened-frames-bar-right-50"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r3 = r8.findRegion(r3)
            r2.<init>(r3)
            r7._texRefTweenedFrameBarRight50 = r2
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r2 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            java.lang.String r3 = "tweened-frames-bar-right-67"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r3 = r8.findRegion(r3)
            r2.<init>(r3)
            r7._texRefTweenedFrameBarRight67 = r2
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r2 = new com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
            java.lang.String r3 = "tweened-frames-bar-right-90"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r3 = r8.findRegion(r3)
            r2.<init>(r3)
            r7._texRefTweenedFrameBarRight90 = r2
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r3 = r7._texRefTweenedFrameBarLeft50
            r2.<init>(r3)
            r7._tweenedFrameImageLeft = r2
            r1.addActor(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r3 = r7._texRefTweenedFrameBarRight50
            r2.<init>(r3)
            r7._tweenedFrameImageRight = r2
            r1.addActor(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r1.<init>()
            r7._addTweenedFrameRadioButtonsTable = r1
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r1.pad(r14)
            r1.align(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._addTweenedFrameRadioButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.pad(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.space(r14)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r15
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.spaceRight(r2)
            r1.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._addTweenedFrameRadioButtonsTable
            r1.setRound(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._addTweenedFrameRadioButtonsTable
            java.lang.String r2 = "50"
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r2, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r2)
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._addTweenedFrameRadioButtonsTable
            java.lang.String r2 = "33/67"
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r2, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r2)
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._addTweenedFrameRadioButtonsTable
            java.lang.String r2 = "10/90"
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r2, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r2)
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._addTweenedFrameRadioButtonsTable
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r1)
            r7._tween50Button = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$6 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$6
            r2.<init>(r7)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._addTweenedFrameRadioButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r7._tween50Button
            r1.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r1)
            r7._tween3367Button = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$7 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$7
            r2.<init>(r7)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._addTweenedFrameRadioButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r7._tween3367Button
            r1.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r1)
            r7._tween1090Button = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$8 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$8
            r2.<init>(r7)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._addTweenedFrameRadioButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r7._tween1090Button
            r1.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r1 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r1.<init>()
            r3 = 3
            com.badlogic.gdx.scenes.scene2d.ui.Button[] r2 = new com.badlogic.gdx.scenes.scene2d.ui.Button[r3]
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r7._tween1090Button
            r2[r6] = r3
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r7._tween3367Button
            r2[r10] = r3
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r7._tween50Button
            r2[r11] = r3
            r1.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._tween50Button
            r1.setChecked(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._addTweenedFrameRadioButtonsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r11)
            r1.fillX()
            r30.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r8.findRegion(r12)
            r1.<init>(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r11)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padTop(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padBottom(r2)
            r1.fillX()
            r30.row()
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L7e4
            java.lang.String r0 = "backgroundColor"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.fillX()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$9 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$9
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r7.mAnimationBasedModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r16 = r0.getScreenFBO()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r17 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r18 = r0 * r15
            org.fortheloss.sticknodes.data.SessionData r0 = r7.mSessionDataRef
            boolean r19 = r0.getIsLeftHandMode()
            r0 = r2
            r1 = r30
            r14 = r2
            r2 = r16
            r15 = 1065353216(0x3f800000, float:1.0)
            r3 = r17
            r11 = 8
            r4 = r32
            r5 = r18
            r6 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7._backgroundColorPicker = r14
            r14.setColor(r15, r15, r15, r15)
            org.fortheloss.framework.ColorPicker r0 = r7._backgroundColorPicker
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$10 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$10
            r1.<init>(r7)
            r0.addListener(r1)
            org.fortheloss.framework.ColorPicker r0 = r7._backgroundColorPicker
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r1)
            r0.align(r11)
            r30.row()
            java.lang.String r0 = "useGradient"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r1 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r1)
            r0.fillX()
            r30.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._useBackgroundGradientButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$11 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$11
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._useBackgroundGradientButton
            r7.add(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$12 r14 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$12
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r7.mAnimationBasedModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0.getScreenFBO()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1092616192(0x41200000, float:10.0)
            float r5 = r0 * r1
            org.fortheloss.sticknodes.data.SessionData r0 = r7.mSessionDataRef
            boolean r6 = r0.getIsLeftHandMode()
            r0 = r14
            r1 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7._backgroundGradientColorPicker = r14
            r0 = 1056964608(0x3f000000, float:0.5)
            r14.setColor(r0, r0, r0, r15)
            org.fortheloss.framework.ColorPicker r1 = r7._backgroundGradientColorPicker
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$13 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$13
            r2.<init>(r7)
            r1.addListener(r2)
            org.fortheloss.framework.ColorPicker r1 = r7._backgroundGradientColorPicker
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.width(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.height(r2)
            r1.align(r11)
            r30.row()
            java.lang.String r1 = "expandGradient"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r10)
            r7._expandGradientLabel = r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r1)
            r7._expandGradientButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$14 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$14
            r2.<init>(r7)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._expandGradientButton
            r7.add(r1)
            r30.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r8.findRegion(r12)
            r1.<init>(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            r2 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padTop(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padBottom(r2)
            r1.fillX()
            r30.row()
            java.lang.String r1 = "doNotTween"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r1)
            r7._doNotTweenButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$15 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$15
            r2.<init>(r7)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._doNotTweenButton
            r7.add(r1)
            r30.row()
            java.lang.String r1 = "silenceSounds"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r1)
            r7._silenceSoundsButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$16 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$16
            r2.<init>(r7)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._silenceSoundsButton
            r7.add(r1)
            r30.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r8.findRegion(r12)
            r1.<init>(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            r2 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padTop(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padBottom(r2)
            r1.fillX()
            r30.row()
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = new org.fortheloss.framework.CheckBoxInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r2 = r30.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r23 = r2.getContext()
            java.lang.String r2 = "txtFrameDelay"
            java.lang.String r24 = org.fortheloss.sticknodes.App.localize(r2)
            r26 = 5
            r27 = 0
            r28 = 1106247680(0x41f00000, float:30.0)
            r29 = 1
            java.lang.String r25 = "0.00"
            r22 = r1
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            r7.mFrameDelayField = r1
            r2 = 0
            r1.setIncrementType(r2)
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r7.mFrameDelayField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$17 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$17
            r3.<init>(r7)
            r1.setFieldListener(r3)
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r7.mFrameDelayField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            r3 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r3)
            r1.fillX()
            r30.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7._frameDelayTable = r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.fillX()
            r7._frameDelayTableCell = r1
            java.lang.String r1 = "moveCameraDuringDelay"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r10)
            r7._moveCamDuringDelayLabel = r1
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r7._frameDelayTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r4.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.fillX()
            r1.colspan(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._frameDelayTable
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r1)
            r7._moveCamDuringDelayButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$18 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$18
            r3.<init>(r7)
            r1.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._frameDelayTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r7._moveCamDuringDelayButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r3)
            r1.align(r10)
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.MoveCameraDuringDelayContextMenu r1 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.MoveCameraDuringDelayContextMenu
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getContextMenuBackgroundDrawable()
            r1.<init>(r7, r3)
            r7._moveCamDuringDelayContextMenu = r1
            java.lang.String r1 = "settings"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r1, r3)
            r7._moveCamDuringDelaySettingsButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$19 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$19
            r3.<init>(r7)
            r1.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._frameDelayTable
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r7._moveCamDuringDelaySettingsButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r3)
            r1.align(r11)
            r30.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r3 = r8.findRegion(r12)
            r1.<init>(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            r3 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padTop(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padBottom(r3)
            r1.fillX()
            r30.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r1)
            r7._repeatButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$20 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$20
            r3.<init>(r7)
            r1.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._repeatButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            r1.align(r10)
            java.lang.String r1 = "repeatFramesMenuTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r11)
            r7._repeatLabel = r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.fillX()
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1092616192(0x41200000, float:10.0)
            float r3 = r3 * r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padRight(r3)
            r1.align(r11)
            r30.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7._repeatTable = r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.defaults()
            r3 = 2
            r1.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._repeatTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.fillX()
            r7._repeatTableCell = r1
            r30.row()
            org.fortheloss.sticknodes.animationscreen.modules.Module r1 = r30.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r1.getContext()
            org.fortheloss.sticknodes.data.SessionData r1 = r1.getSessionData()
            boolean r1 = r1.getNerdModeEnabled()
            if (r1 != 0) goto L6ae
            java.lang.String r1 = "repeatFramesMenuInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r10)
            r7._repeatInfoLabel = r1
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r7._repeatTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r3.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.fillX()
            r3 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r3)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1092616192(0x41200000, float:10.0)
            float r3 = r3 * r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padLeft(r3)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r4
            r1.padRight(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._repeatTable
            r1.row()
        L6ae:
            org.fortheloss.framework.LabelInputIncrementSmallField r1 = new org.fortheloss.framework.LabelInputIncrementSmallField
            org.fortheloss.sticknodes.animationscreen.modules.Module r3 = r30.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r21 = r3.getContext()
            java.lang.String r3 = "repeatFramesMenuFrames"
            java.lang.String r22 = org.fortheloss.sticknodes.App.localize(r3)
            r24 = 5
            r25 = 1065353216(0x3f800000, float:1.0)
            r26 = 1203982208(0x47c34f80, float:99999.0)
            r27 = 0
            java.lang.String r23 = "1"
            r20 = r1
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r7.mRepeatGoBackFramesField = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$21 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$21
            r3.<init>(r7)
            r1.setFieldListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._repeatTable
            org.fortheloss.framework.LabelInputIncrementSmallField r3 = r7.mRepeatGoBackFramesField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r3)
            r1.fillX()
            org.fortheloss.framework.LabelInputIncrementSmallField r1 = new org.fortheloss.framework.LabelInputIncrementSmallField
            org.fortheloss.sticknodes.animationscreen.modules.Module r3 = r30.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r21 = r3.getContext()
            java.lang.String r3 = "repeatFramesMenuLoops"
            java.lang.String r22 = org.fortheloss.sticknodes.App.localize(r3)
            r24 = 3
            r26 = 1148829696(0x4479c000, float:999.0)
            java.lang.String r23 = "1"
            r20 = r1
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r7.mRepeatLoopsField = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$22 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$22
            r3.<init>(r7)
            r1.setFieldListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._repeatTable
            org.fortheloss.framework.LabelInputIncrementSmallField r3 = r7.mRepeatLoopsField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r3)
            r1.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._repeatTable
            r1.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r1)
            r7._repeatUseTweenPropertiesButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$23 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$23
            r3.<init>(r7)
            r1.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._repeatTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r7._repeatUseTweenPropertiesButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r3)
            r1.align(r10)
            java.lang.String r1 = "repeatFramesMenuProperties"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r10)
            r7._repeatUseTweenPropertiesLabel = r1
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r7._repeatTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r3.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.fillX()
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1092616192(0x41200000, float:10.0)
            float r3 = r3 * r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padRight(r3)
            r1.align(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r3 = r8.findRegion(r12)
            r1.<init>(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            r3 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padTop(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padBottom(r3)
            r1.fillX()
            r30.row()
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = new org.fortheloss.framework.CheckBoxInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r3 = r30.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r21 = r3.getContext()
            java.lang.String r3 = "slowMotionLabel"
            java.lang.String r22 = org.fortheloss.sticknodes.App.localize(r3)
            r24 = 4
            r26 = 1176255488(0x461c3c00, float:9999.0)
            java.lang.String r23 = "20.00"
            r20 = r1
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r7.mSlowMotionField = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$24 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$24
            r3.<init>(r7)
            r1.setFieldListener(r3)
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r7.mSlowMotionField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            r3 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r3)
            r1.fillX()
            r30.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r4 = r8.findRegion(r12)
            r1.<init>(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padTop(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padBottom(r3)
            r1.fillX()
            r30.row()
            goto L7eb
        L7e4:
            r0 = 1056964608(0x3f000000, float:0.5)
            r2 = 0
            r11 = 8
            r15 = 1065353216(0x3f800000, float:1.0)
        L7eb:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable
            r1.<init>(r9)
            r7._soundsTable = r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.fillX()
            r3 = 2
            r1.colspan(r3)
            r30.row()
            java.lang.String r1 = "importSound"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r1, r3)
            r7._importSoundButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$25 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$25
            r3.<init>(r7)
            r1.addListener(r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable r1 = r7._soundsTable
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r7._importSoundButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.add(r3)
            r3 = 2
            r1.colspan(r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable r1 = r7._soundsTable
            r1.row()
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            boolean r1 = r1.isPro()
            if (r1 == 0) goto L83d
            java.lang.String r1 = "txtSoundsPro"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r10)
            goto L847
        L83d:
            java.lang.String r1 = "txtSounds"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r10)
        L847:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable r3 = r7._soundsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.add(r1)
            r4 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.colspan(r4)
            r3.fillX()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable r3 = r7._soundsTable
            r3.row()
            com.badlogic.gdx.utils.Array r3 = new com.badlogic.gdx.utils.Array
            r3.<init>()
            r7._soundLibraryNameStrings = r3
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.defaults()
            r4.uniform(r2, r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable r4 = r7._soundsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.add(r3)
            r5 = 2
            r4.colspan(r5)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable r4 = r7._soundsTable
            r4.row()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r7.createTextField(r13)
            java.lang.String r5 = "filter"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = "..."
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.setMessageText(r5)
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r5 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r5.<init>()
            r4.setTextFieldFilter(r5)
            int r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r5 = (float) r5
            int r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r6 = (float) r6
            r4.setSize(r5, r6)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r5 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getFilterClearButtonStyle()
            r5.<init>(r6)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex r6 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex
            java.lang.String r9 = "noneLowercase"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "<"
            r14.append(r0)
            r14.append(r9)
            java.lang.String r0 = ">"
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            r9 = -1
            r6.<init>(r0, r9)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createSelectBoxWithFilter(r4, r5, r6)
            r7._soundLibrarySelectBox = r0
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r4 = r7._soundLibraryNameStrings
            r0.setItems(r4)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r7._soundLibrarySelectBox
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$26 r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$26
            r4.<init>(r7)
            r0.addListener(r4)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r7._soundLibrarySelectBox
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r3.add(r0)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r4 = (float) r4
            r5 = 1061158912(0x3f400000, float:0.75)
            float r4 = r4 * r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r4)
            r0.align(r11)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getApplyButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton(r13, r0)
            r7._soundCheckButton = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.getImageCell()
            r4 = 1090519040(0x41000000, float:8.0)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r4
            r0.padLeft(r5)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r7._soundCheckButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$27 r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$27
            r4.<init>(r7)
            r0.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r7._soundCheckButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r3.add(r0)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r3 = (float) r3
            r4 = 1046562734(0x3e6147ae, float:0.22)
            float r3 = r3 * r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r3)
            r3 = 16
            r0.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            r7._subSoundsTable = r0
            r4 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.pad(r4)
            r0.align(r10)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r5 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 * r5
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r7._subSoundsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.pad(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r5.space(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r4.spaceRight(r0)
            r0.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._subSoundsTable
            r0.setRound(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._subSoundsTable
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r0.setTouchable(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable r0 = r7._soundsTable
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7._subSoundsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r2)
            r2 = 2
            r0.colspan(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable r0 = r7._soundsTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getShortPlaySoundButtonStyle()
            r0.<init>(r2)
            r7._playSoundButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$28 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$28
            r2.<init>(r7)
            r0.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._subSoundsTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r2 = r7._playSoundButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r2)
            r0.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getShortDeleteButtonStyle()
            r0.<init>(r2)
            r7._deleteSoundButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$29 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$29
            r2.<init>(r7)
            r0.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._subSoundsTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r2 = r7._deleteSoundButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r2)
            r0.align(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._subSoundsTable
            r0.row()
            java.lang.String r0 = "soundVolume"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7._subSoundsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter r0 = new com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter
            r0.<init>()
            java.lang.String r2 = "100"
            r4 = 3
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r7.createTextField(r2, r4, r0)
            r7._soundVolumeTextField = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$30 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$30
            r2.<init>(r7)
            r0.setTextFieldListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r7._soundVolumeTextField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$31 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$31
            r2.<init>(r7)
            r0.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._subSoundsTable
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r7._soundVolumeTextField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r2 = (float) r2
            int r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.size(r2, r4)
            r0.align(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._subSoundsTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = new com.badlogic.gdx.scenes.scene2d.ui.Slider
            r22 = 1065353216(0x3f800000, float:1.0)
            r23 = 1120403456(0x42c80000, float:100.0)
            r24 = 1065353216(0x3f800000, float:1.0)
            r25 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle r26 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsSliderStyle()
            r21 = r0
            r21.<init>(r22, r23, r24, r25, r26)
            r7._soundVolumeSlider = r0
            r2 = 1120403456(0x42c80000, float:100.0)
            r0.setValue(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r7._soundVolumeSlider
            org.fortheloss.framework.CustomStopListener r2 = new org.fortheloss.framework.CustomStopListener
            r2.<init>()
            r0.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r7._soundVolumeSlider
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$32 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$32
            r2.<init>(r7)
            r0.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r7._soundVolumeSlider
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$33 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$33
            r2.<init>(r7)
            r0.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._subSoundsTable
            com.badlogic.gdx.scenes.scene2d.ui.Slider r2 = r7._soundVolumeSlider
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r2)
            r2 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r2 = (float) r2
            r0.width(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._subSoundsTable
            r0.row()
            java.lang.String r0 = "soundPan"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7._subSoundsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.add(r0)
            r0.fillX()
            java.lang.String r0 = "0.0"
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r10)
            r7._soundPanLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7._subSoundsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._subSoundsTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = new com.badlogic.gdx.scenes.scene2d.ui.Slider
            r22 = 0
            r23 = 1101004800(0x41a00000, float:20.0)
            com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle r26 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsSliderStyle()
            r21 = r0
            r21.<init>(r22, r23, r24, r25, r26)
            r7._soundPanSlider = r0
            r2 = 1092616192(0x41200000, float:10.0)
            r0.setValue(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r7._soundPanSlider
            org.fortheloss.framework.CustomStopListener r2 = new org.fortheloss.framework.CustomStopListener
            r2.<init>()
            r0.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r7._soundPanSlider
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$34 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$34
            r2.<init>(r7)
            r0.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r7._soundPanSlider
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$35 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$35
            r2.<init>(r7)
            r0.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._subSoundsTable
            com.badlogic.gdx.scenes.scene2d.ui.Slider r2 = r7._soundPanSlider
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r2)
            r2 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r2 = (float) r2
            r0.width(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._subSoundsTable
            r0.row()
            java.lang.String r0 = "soundPitch"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7._subSoundsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.add(r0)
            r0.fillX()
            java.lang.String r0 = "1.0"
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r10)
            r7._soundPitchLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r7._subSoundsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._subSoundsTable
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = new com.badlogic.gdx.scenes.scene2d.ui.Slider
            com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle r26 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsSliderStyle()
            r21 = r0
            r21.<init>(r22, r23, r24, r25, r26)
            r7._soundPitchSlider = r0
            r2 = 1092616192(0x41200000, float:10.0)
            r0.setValue(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r7._soundPitchSlider
            org.fortheloss.framework.CustomStopListener r2 = new org.fortheloss.framework.CustomStopListener
            r2.<init>()
            r0.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r7._soundPitchSlider
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$36 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$36
            r2.<init>(r7)
            r0.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r7._soundPitchSlider
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$37 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$37
            r2.<init>(r7)
            r0.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._subSoundsTable
            com.badlogic.gdx.scenes.scene2d.ui.Slider r2 = r7._soundPitchSlider
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r2)
            r2 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r2 = (float) r2
            r0.width(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._subSoundsTable
            r0.row()
            java.lang.String r0 = "copy"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r0, r2)
            r7._copySoundButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$38 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$38
            r2.<init>(r7)
            r0.addListener(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable r0 = r7._soundsTable
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r7._copySoundButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r7._copySoundButton
            float r2 = r2.getHeight()
            r3 = 1059481190(0x3f266666, float:0.65)
            float r2 = r2 * r3
            r0.height(r2)
            java.lang.String r0 = "paste"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r0, r2)
            r7._pasteSoundButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$39 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$39
            r2.<init>(r7)
            r0.addListener(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable r0 = r7._soundsTable
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r7._pasteSoundButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r11)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r7._pasteSoundButton
            float r2 = r2.getHeight()
            float r2 = r2 * r3
            r0.height(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable r0 = r7._soundsTable
            r0.row()
            java.lang.String r0 = "clearSound"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r0, r2)
            r7._clearSoundButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$40 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$40
            r2.<init>(r7)
            r0.addListener(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.BackgroundColorTable r0 = r7._soundsTable
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r7._clearSoundButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r2)
            r2 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r7._clearSoundButton
            float r4 = r4.getHeight()
            float r4 = r4 * r3
            r0.height(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r3 = r8.findRegion(r12)
            r0.<init>(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r2)
            r0.fillX()
            r30.row()
            java.lang.String r0 = "clearFrame"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeDeleteButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r0, r2)
            r7._clearFrameButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$41 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable$41
            r2.<init>(r7)
            r0.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r7._clearFrameButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r2 = 2
            r0.colspan(r2)
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.isPro()
            if (r0 != 0) goto Lc92
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._importSoundButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._importSoundButton
            r3 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r15, r15, r15, r3)
            r1.setColor(r15, r15, r15, r3)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r7._soundLibrarySelectBox
            r0.setTouchable(r2)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r7._soundLibrarySelectBox
            r0.setColor(r15, r15, r15, r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r7._soundCheckButton
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r7._soundCheckButton
            r0.setColor(r15, r15, r15, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._subSoundsTable
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._subSoundsTable
            r0.setColor(r15, r15, r15, r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._copySoundButton
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._copySoundButton
            r0.setColor(r15, r15, r15, r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._pasteSoundButton
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._pasteSoundButton
            r0.setColor(r15, r15, r15, r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._clearSoundButton
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._clearSoundButton
            r0.setColor(r15, r15, r15, r3)
        Lc92:
            r30.pack()
            return
    }

    public void onAddInbetweenFrames(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.addTweenedFrames(r2)
            return
    }

    public void setCameraMoveDuringDelayProperties(boolean r2, boolean r3, short r4) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = (org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule) r0
            r0.setFrameCameraMoveDuringDelayProperties(r2, r3, r4)
            return
    }

    public void setFramesContainerRef(org.fortheloss.sticknodes.animationscreen.FramesContainer r1) {
            r0 = this;
            r0._framesContainerRef = r1
            return
    }

    public void setTracedFrameIndex(int r1) {
            r0 = this;
            r0._tracedFrameIndex = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r23 = this;
            r0 = r23
            org.fortheloss.sticknodes.animationscreen.FramesContainer r1 = r0._framesContainerRef
            if (r1 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.data.SessionData r1 = r0.mSessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentlySelectedFrameData()
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 != 0) goto L1e
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r1)
            r0.setColor(r3, r3, r3, r2)
            r1 = r0
            goto L4a8
        L1e:
            r4 = 0
            boolean r5 = r1 instanceof org.fortheloss.sticknodes.data.FrameData
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L2a
            r4 = r1
            org.fortheloss.sticknodes.data.FrameData r4 = (org.fortheloss.sticknodes.data.FrameData) r4
            r5 = 1
            goto L2b
        L2a:
            r5 = 0
        L2b:
            com.badlogic.gdx.scenes.scene2d.Touchable r8 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r0.setTouchable(r8)
            r0.setColor(r3, r3, r3, r3)
            r23.updateSoundLibrary()
            java.lang.String r8 = " / "
            java.lang.String r9 = "nodes"
            java.lang.String r10 = ": "
            java.lang.String r11 = "%,d"
            if (r5 == 0) goto L8b
            int r12 = r1.getFrameTotalNodeCount()
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = r0._stickfigureCountLabel
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            java.util.Locale r14 = java.util.Locale.US
            java.lang.Object[] r15 = new java.lang.Object[r7]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r15[r6] = r12
            java.lang.String r12 = java.lang.String.format(r14, r11, r15)
            java.lang.Object[] r15 = new java.lang.Object[r7]
            int r16 = org.fortheloss.sticknodes.App.getMaxNodesPerFrame()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)
            r15[r6] = r16
            java.lang.String r11 = java.lang.String.format(r14, r11, r15)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r9)
            r14.append(r10)
            r14.append(r12)
            r14.append(r8)
            r14.append(r11)
            java.lang.String r8 = r14.toString()
            r13.setText(r8)
            r18 = r1
            r21 = r4
            r20 = r5
            goto L188
        L8b:
            int r12 = r1.getFrameTotalNodeCount()
            org.fortheloss.sticknodes.animationscreen.FramesContainer r13 = r0._framesContainerRef
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r13 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r13
            int r13 = r13.getTotalNodeCount()
            org.fortheloss.sticknodes.animationscreen.FramesContainer r14 = r0._framesContainerRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r14 = r14.frames
            int r14 = r14.size()
            com.badlogic.gdx.scenes.scene2d.ui.Label r15 = r0._stickfigureCountLabel
            java.lang.String r2 = ""
            r15.setText(r2)
            int r2 = r0._tracedFrameIndex
            java.lang.String r15 = "\n"
            if (r2 < 0) goto Lcf
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0._stickfigureCountLabel
            java.lang.String r17 = "tracingFrame"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r17)
            int r6 = r0._tracedFrameIndex
            int r6 = r6 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            r7.append(r10)
            r7.append(r6)
            r7.append(r15)
            java.lang.String r3 = r7.toString()
            r2.setText(r3)
        Lcf:
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0._stickfigureCountLabel
            com.badlogic.gdx.utils.StringBuilder r3 = r2.getText()
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r9)
            java.util.Locale r7 = java.util.Locale.US
            r18 = r1
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r17 = 0
            r0[r17] = r12
            java.lang.String r0 = java.lang.String.format(r7, r11, r0)
            java.lang.Object[] r12 = new java.lang.Object[r1]
            int r1 = org.fortheloss.sticknodes.App.getMaxNodesPerFrame()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12[r17] = r1
            java.lang.String r1 = java.lang.String.format(r7, r11, r12)
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r19 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r19)
            r12[r17] = r19
            r19 = 256000(0x3e800, float:3.58732E-40)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r19)
            r21 = r4
            r4 = 1
            r12[r4] = r20
            java.lang.String r4 = "mcLimitsInfo"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4, r12)
            java.lang.String r12 = "frames"
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r12)
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            r22 = r2
            r20 = r5
            r5 = 1
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r2[r17] = r13
            java.lang.String r2 = java.lang.String.format(r7, r11, r2)
            java.lang.Object[] r13 = new java.lang.Object[r5]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r19)
            r13[r17] = r5
            java.lang.String r5 = java.lang.String.format(r7, r11, r13)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            r7.append(r6)
            r7.append(r10)
            r7.append(r0)
            r7.append(r8)
            r7.append(r1)
            java.lang.String r0 = "\n\n"
            r7.append(r0)
            r7.append(r4)
            r7.append(r15)
            r7.append(r12)
            r7.append(r10)
            r7.append(r14)
            java.lang.String r0 = " / 200\n"
            r7.append(r0)
            r7.append(r9)
            r7.append(r10)
            r7.append(r2)
            r7.append(r8)
            r7.append(r5)
            java.lang.String r0 = r7.toString()
            r1 = r22
            r1.setText(r0)
        L188:
            if (r20 == 0) goto L30f
            boolean r0 = r21.isDelayed()
            r1 = r23
            org.fortheloss.framework.CheckBoxInputIncrementField r2 = r1.mFrameDelayField
            float r3 = r21.getDelaySeconds()
            r2.setValue(r3, r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r1._moveCamDuringDelayButton
            boolean r3 = r21.getCameraIsMovingDuringDelay()
            r2.setChecked(r3)
            boolean r2 = r21.isTweened()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r1._doNotTweenButton
            r4 = r2 ^ 1
            r3.setChecked(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r1._doNotTweenButton
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r3.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r1._doNotTweenButton
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.setColor(r5, r5, r5, r5)
            org.fortheloss.framework.ColorPicker r3 = r1._backgroundColorPicker
            com.badlogic.gdx.graphics.Color r5 = r21.getBackgroundColor()
            r6 = 0
            r3.setColor(r5, r6)
            org.fortheloss.framework.ColorPicker r3 = r1._backgroundGradientColorPicker
            com.badlogic.gdx.graphics.Color r5 = r21.getGradientColor()
            r3.setColor(r5, r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r1._useBackgroundGradientButton
            boolean r5 = r21.isUsingGradient()
            r3.setChecked(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r1._expandGradientButton
            boolean r5 = r21.isExpandedGradient()
            r3.setChecked(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r1._silenceSoundsButton
            boolean r5 = r21.willStopSounds()
            r3.setChecked(r5)
            boolean r3 = r21.isUsingGradient()
            if (r3 == 0) goto L20c
            org.fortheloss.framework.ColorPicker r3 = r1._backgroundGradientColorPicker
            r3.setTouchable(r4)
            org.fortheloss.framework.ColorPicker r3 = r1._backgroundGradientColorPicker
            r5 = 0
            r3.disableWithAlpha(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r1._expandGradientLabel
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.setColor(r5, r5, r5, r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r1._expandGradientButton
            r3.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r1._expandGradientButton
            r3.setColor(r5, r5, r5, r5)
            goto L22c
        L20c:
            r5 = 1065353216(0x3f800000, float:1.0)
            org.fortheloss.framework.ColorPicker r3 = r1._backgroundGradientColorPicker
            com.badlogic.gdx.scenes.scene2d.Touchable r6 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r3.setTouchable(r6)
            org.fortheloss.framework.ColorPicker r3 = r1._backgroundGradientColorPicker
            r7 = 1
            r3.disableWithAlpha(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r1._expandGradientLabel
            r7 = 1056964608(0x3f000000, float:0.5)
            r3.setColor(r5, r5, r5, r7)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r1._expandGradientButton
            r3.setTouchable(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r1._expandGradientButton
            r3.setColor(r5, r5, r5, r7)
        L22c:
            boolean r3 = r21.getIsRepeating()
            if (r3 != 0) goto L23e
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r1._repeatButton
            r5 = 0
            r3.setChecked(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r3 = r1._repeatTableCell
            r3.clearActor()
            goto L268
        L23e:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r3 = r1._repeatTableCell
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r1._repeatTable
            r3.setActor(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r1._repeatButton
            r5 = 1
            r3.setChecked(r5)
            org.fortheloss.framework.LabelInputIncrementSmallField r3 = r1.mRepeatGoBackFramesField
            int r5 = r21.getRepeatGoBackFrames()
            float r5 = (float) r5
            r3.setValue(r5)
            org.fortheloss.framework.LabelInputIncrementSmallField r3 = r1.mRepeatLoopsField
            int r5 = r21.getRepeatLoops()
            float r5 = (float) r5
            r3.setValue(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r1._repeatUseTweenPropertiesButton
            boolean r5 = r21.getUseTweenPropertiesDuringRepeating()
            r3.setChecked(r5)
        L268:
            if (r0 != 0) goto L28f
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r1._frameDelayTableCell
            r0.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r1._moveCamDuringDelayLabel
            r3 = 1056964608(0x3f000000, float:0.5)
            r5 = 1065353216(0x3f800000, float:1.0)
            r0.setColor(r5, r5, r5, r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r1._moveCamDuringDelayButton
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r1._moveCamDuringDelayButton
            r0.setColor(r5, r5, r5, r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r1._moveCamDuringDelaySettingsButton
            r0.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r1._moveCamDuringDelaySettingsButton
            r0.setColor(r5, r5, r5, r3)
            goto L2e6
        L28f:
            r5 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r1._frameDelayTableCell
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r1._frameDelayTable
            r0.setActor(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r1._moveCamDuringDelayLabel
            r0.setColor(r5, r5, r5, r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r1._moveCamDuringDelayButton
            r0.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r1._moveCamDuringDelayButton
            r0.setColor(r5, r5, r5, r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r1._moveCamDuringDelayButton
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L2c8
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r1._moveCamDuringDelaySettingsButton
            com.badlogic.gdx.scenes.scene2d.Touchable r3 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r1._moveCamDuringDelaySettingsButton
            r3 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r5, r5, r5, r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r1._doNotTweenButton
            r0.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r1._doNotTweenButton
            r0.setColor(r5, r5, r5, r5)
            goto L2e6
        L2c8:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r1._moveCamDuringDelaySettingsButton
            r0.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r1._moveCamDuringDelaySettingsButton
            r0.setColor(r5, r5, r5, r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r1._doNotTweenButton
            r3 = 1
            r0.setChecked(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r1._doNotTweenButton
            com.badlogic.gdx.scenes.scene2d.Touchable r3 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r1._doNotTweenButton
            r3 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r5, r5, r5, r3)
        L2e6:
            boolean r0 = r21.getIsUsingSlowMotionTweenedFrames()
            org.fortheloss.framework.CheckBoxInputIncrementField r3 = r1.mSlowMotionField
            int r4 = r21.getSlowMotionTweenedFrames()
            float r4 = (float) r4
            r3.setValue(r4, r0)
            if (r2 == 0) goto L302
            org.fortheloss.sticknodes.data.ProjectData r0 = r1._projectDataRef
            boolean r0 = r0.tweeningEnabled
            if (r0 == 0) goto L302
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = r1.mSlowMotionField
            r0.enable()
            goto L307
        L302:
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = r1.mSlowMotionField
            r0.disable()
        L307:
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.MoveCameraDuringDelayContextMenu r0 = r1._moveCamDuringDelayContextMenu
            r4 = r21
            r0.update(r4)
            goto L311
        L30f:
            r1 = r23
        L311:
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r1._soundLibrarySelectBox
            int r0 = r0.getSelectedIndex()
            int r2 = r18.getSoundToPlayLibraryID()
            r3 = 1
            int r2 = r2 + r3
            if (r0 == r2) goto L348
            r1._ignoreNextSoundChangeEvent = r3
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r1._soundLibrarySelectBox
            com.badlogic.gdx.utils.Array r0 = r0.getItems()
            int r0 = r0.size
            int r0 = r0 - r3
        L32a:
            if (r0 < 0) goto L342
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r3 = r1._soundLibrarySelectBox
            com.badlogic.gdx.utils.Array r3 = r3.getItems()
            java.lang.Object r3 = r3.get(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex r3 = (org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex) r3
            int r3 = r3.getIndex()
            if (r2 != r3) goto L33f
            goto L343
        L33f:
            int r0 = r0 + (-1)
            goto L32a
        L342:
            r0 = 0
        L343:
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r2 = r1._soundLibrarySelectBox
            r2.setSelectedIndex(r0)
        L348:
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r1._soundLibraryNameStrings
            int r0 = r0.size
            r2 = 1
            if (r0 > r2) goto L36a
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r1._soundLibrarySelectBox
            com.badlogic.gdx.scenes.scene2d.Touchable r3 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r3)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r1._soundLibrarySelectBox
            r0.setDisabled(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r1._soundCheckButton
            r0.setTouchable(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r1._soundCheckButton
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.setColor(r3, r3, r3, r2)
            goto L383
        L36a:
            r3 = 1065353216(0x3f800000, float:1.0)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r1._soundLibrarySelectBox
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r2)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r1._soundLibrarySelectBox
            r4 = 0
            r0.setDisabled(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r1._soundCheckButton
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r1._soundCheckButton
            r0.setColor(r3, r3, r3, r3)
        L383:
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r1._soundLibrarySelectBox
            int r0 = r0.getSelectedIndex()
            if (r0 != 0) goto L3c1
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r1._soundLibraryNameStrings
            int r0 = r0.size
            r2 = 1
            if (r0 > r2) goto L3c1
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r1._subSoundsTable
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r1._subSoundsTable
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.setColor(r4, r4, r4, r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r1._copySoundButton
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r1._copySoundButton
            r0.setColor(r4, r4, r4, r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r1._pasteSoundButton
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r1._pasteSoundButton
            r0.setColor(r4, r4, r4, r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r1._clearSoundButton
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r1._clearSoundButton
            r0.setColor(r4, r4, r4, r3)
            goto L3ef
        L3c1:
            r4 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r1._subSoundsTable
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r1._subSoundsTable
            r0.setColor(r4, r4, r4, r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r1._copySoundButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r1._copySoundButton
            r0.setColor(r4, r4, r4, r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r1._pasteSoundButton
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r1._pasteSoundButton
            r0.setColor(r4, r4, r4, r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r1._clearSoundButton
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r1._clearSoundButton
            r0.setColor(r4, r4, r4, r4)
        L3ef:
            float r0 = r18.getSoundVolume()
            r2 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r2
            int r0 = java.lang.Math.round(r0)
            r2 = 100
            r3 = 1
            if (r0 >= r3) goto L402
            r0 = 1
            goto L406
        L402:
            if (r0 <= r2) goto L406
            r0 = 100
        L406:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r1._soundVolumeTextField
            java.lang.String r3 = java.lang.String.valueOf(r0)
            r2.setText(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r2 = r1._soundVolumeSlider
            float r3 = (float) r0
            r2.setValue(r3)
            float r2 = r18.getSoundPan()
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r1._soundPanLabel
            java.util.Locale r4 = java.util.Locale.US
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Float r5 = java.lang.Float.valueOf(r2)
            r7 = 0
            r6[r7] = r5
            java.lang.String r5 = "%.1f"
            java.lang.String r5 = java.lang.String.format(r4, r5, r6)
            r3.setText(r5)
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 + r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r3
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r1._soundVolumeTextField
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.setText(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r1._soundPanSlider
            r3 = 1101004800(0x41a00000, float:20.0)
            float r2 = r2 * r3
            r0.setValue(r2)
            float r0 = r18.getSoundPitch()
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r1._soundPitchLabel
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Float r5 = java.lang.Float.valueOf(r0)
            r6 = 0
            r3[r6] = r5
            java.lang.String r5 = "%.2f"
            java.lang.String r3 = java.lang.String.format(r4, r5, r3)
            r2.setText(r3)
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 >= 0) goto L46c
            r2 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 - r2
            float r0 = r0 / r2
        L46c:
            r2 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Slider r2 = r1._soundPitchSlider
            r2.setValue(r0)
            org.fortheloss.sticknodes.data.SessionData r0 = r1.mSessionDataRef
            int r0 = r0.getCopiedSoundID()
            if (r0 < 0) goto L498
            org.fortheloss.sticknodes.data.SessionData r0 = r1.mSessionDataRef
            float r0 = r0.getCopiedSoundVolume()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L489
            goto L498
        L489:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r1._pasteSoundButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r1._pasteSoundButton
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.setColor(r2, r2, r2, r2)
            goto L4a8
        L498:
            r2 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r1._pasteSoundButton
            com.badlogic.gdx.scenes.scene2d.Touchable r3 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r1._pasteSoundButton
            r3 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r2, r2, r2, r3)
        L4a8:
            return
    }
}
