package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class StickfigureToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _centerStickfigureButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _copyAllPropertiesButton;
    private org.fortheloss.sticknodes.TextButtonLongPress _copyStickfigureButton;
    private org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu _copyStickfigureContextMenu;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _copyWithJoinedFiguresButton;
    private org.fortheloss.sticknodes.ImageTextButtonLongPress _deleteStickfigureButton;
    private org.fortheloss.sticknodes.animationscreen.modules.contextmenus.DeleteStickfigureContextMenu _deleteStickfigureContextMenu;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _editStickfigureButton;
    private org.fortheloss.framework.RepeatingImageButton _flipXButton;
    private org.fortheloss.framework.RepeatingImageButton _flipYButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _joinAnchorNameLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _joinAnchorTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> _joinAnchorTableCell;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _joinStickfigureButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable> _joinedFiguresCell;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable _joinedFiguresTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _joinedStuffTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> _joinedStuffTableCell;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _keepStickfigureDuringTweenButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _lockStickfigureButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _pasteAllPropertiesButton;
    private org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu _pasteContextMenu;
    private org.fortheloss.sticknodes.TextButtonLongPress _pasteStickfigureButton;
    private org.fortheloss.framework.RepeatingImageButton _pushBackwardButton;
    private org.fortheloss.framework.RepeatingImageButton _pushForwardButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _pushJoinedFiguresButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _scaleJoinedStickfiguresButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _scaleJoinedStickfiguresLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _selectNextFigureButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _selectPreviousFigureButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _showInOnionSkinButton;
    private org.fortheloss.framework.ColorPicker _stickfigureColorPicker;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _stickfigureNameLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _titleLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _tweenModeButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _tweenStickfigureColorsButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _unjoinStickfigureButton;
    private org.fortheloss.framework.DegreesLabelInputIncrementField mAngleField;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton> mJoinButtonsCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mLayerPositionLabel;
    private float mRememberedAngleOffset;
    private org.fortheloss.framework.LabelInputIncrementField mScaleField;
    private org.fortheloss.framework.CheckBoxInputIncrementField mStateField;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton mUnlockFromCameraButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.TextButton> mUnlockFromCameraCellRef;
    private boolean mUseRememberedAngleOffset;






































    /* renamed from: -$$Nest$fget_copyStickfigureContextMenu, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu m1202$$Nest$fget_copyStickfigureContextMenu(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r0 = r0._copyStickfigureContextMenu
            return r0
    }

    /* renamed from: -$$Nest$fget_deleteStickfigureContextMenu, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.contextmenus.DeleteStickfigureContextMenu m1203$$Nest$fget_deleteStickfigureContextMenu(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.DeleteStickfigureContextMenu r0 = r0._deleteStickfigureContextMenu
            return r0
    }

    /* renamed from: -$$Nest$fget_flipXButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.RepeatingImageButton m1204$$Nest$fget_flipXButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            org.fortheloss.framework.RepeatingImageButton r0 = r0._flipXButton
            return r0
    }

    /* renamed from: -$$Nest$fget_flipYButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.RepeatingImageButton m1205$$Nest$fget_flipYButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            org.fortheloss.framework.RepeatingImageButton r0 = r0._flipYButton
            return r0
    }

    /* renamed from: -$$Nest$fget_pasteContextMenu, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu m1206$$Nest$fget_pasteContextMenu(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu r0 = r0._pasteContextMenu
            return r0
    }

    /* renamed from: -$$Nest$fget_showInOnionSkinButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1207$$Nest$fget_showInOnionSkinButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._showInOnionSkinButton
            return r0
    }

    /* renamed from: -$$Nest$fget_stickfigureColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m1208$$Nest$fget_stickfigureColorPicker(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            org.fortheloss.framework.ColorPicker r0 = r0._stickfigureColorPicker
            return r0
    }

    /* renamed from: -$$Nest$fgetmRememberedAngleOffset, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m1209$$Nest$fgetmRememberedAngleOffset(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            float r0 = r0.mRememberedAngleOffset
            return r0
    }

    /* renamed from: -$$Nest$fgetmUseRememberedAngleOffset, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m1210$$Nest$fgetmUseRememberedAngleOffset(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            boolean r0 = r0.mUseRememberedAngleOffset
            return r0
    }

    /* renamed from: -$$Nest$monCenterStickfigureClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1211$$Nest$monCenterStickfigureClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            r0.onCenterStickfigureClick()
            return
    }

    /* renamed from: -$$Nest$monChangeStateIndexOfStickfigureJoins, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1212$$Nest$monChangeStateIndexOfStickfigureJoins(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0, int r1) {
            r0.onChangeStateIndexOfStickfigureJoins(r1)
            return
    }

    /* renamed from: -$$Nest$monChangeStickfigureDoesSetJoinsState, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1213$$Nest$monChangeStickfigureDoesSetJoinsState(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0, boolean r1) {
            r0.onChangeStickfigureDoesSetJoinsState(r1)
            return
    }

    /* renamed from: -$$Nest$monCopyAllPropertiesClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1214$$Nest$monCopyAllPropertiesClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            r0.onCopyAllPropertiesClick()
            return
    }

    /* renamed from: -$$Nest$monCopyStickfigureClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1215$$Nest$monCopyStickfigureClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0, boolean r1) {
            r0.onCopyStickfigureClick(r1)
            return
    }

    /* renamed from: -$$Nest$monDeleteStickfigureClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1216$$Nest$monDeleteStickfigureClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            r0.onDeleteStickfigureClick()
            return
    }

    /* renamed from: -$$Nest$monEditStickfigureButtonClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1217$$Nest$monEditStickfigureButtonClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            r0.onEditStickfigureButtonClick()
            return
    }

    /* renamed from: -$$Nest$monFlipXClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1218$$Nest$monFlipXClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0, boolean r1) {
            r0.onFlipXClick(r1)
            return
    }

    /* renamed from: -$$Nest$monFlipYClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1219$$Nest$monFlipYClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0, boolean r1) {
            r0.onFlipYClick(r1)
            return
    }

    /* renamed from: -$$Nest$monGoToJoinAnchorClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1220$$Nest$monGoToJoinAnchorClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            r0.onGoToJoinAnchorClick()
            return
    }

    /* renamed from: -$$Nest$monJoinStickfigureClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1221$$Nest$monJoinStickfigureClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            r0.onJoinStickfigureClick()
            return
    }

    /* renamed from: -$$Nest$monKeepStickfigureDuringTweenClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1222$$Nest$monKeepStickfigureDuringTweenClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            r0.onKeepStickfigureDuringTweenClick()
            return
    }

    /* renamed from: -$$Nest$monLockStickfigureClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1223$$Nest$monLockStickfigureClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            r0.onLockStickfigureClick()
            return
    }

    /* renamed from: -$$Nest$monPasteAllPropertiesClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1224$$Nest$monPasteAllPropertiesClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            r0.onPasteAllPropertiesClick()
            return
    }

    /* renamed from: -$$Nest$monPasteStickfigureClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1225$$Nest$monPasteStickfigureClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            r0.onPasteStickfigureClick()
            return
    }

    /* renamed from: -$$Nest$monPushBackwardClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1226$$Nest$monPushBackwardClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            r0.onPushBackwardClick()
            return
    }

    /* renamed from: -$$Nest$monPushForwardClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1227$$Nest$monPushForwardClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            r0.onPushForwardClick()
            return
    }

    /* renamed from: -$$Nest$monPushJoinedFiguresClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1228$$Nest$monPushJoinedFiguresClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            r0.onPushJoinedFiguresClick()
            return
    }

    /* renamed from: -$$Nest$monScaleJoinedStickfiguresClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1229$$Nest$monScaleJoinedStickfiguresClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            r0.onScaleJoinedStickfiguresClick()
            return
    }

    /* renamed from: -$$Nest$monSelectNextFigureClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1230$$Nest$monSelectNextFigureClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            r0.onSelectNextFigureClick()
            return
    }

    /* renamed from: -$$Nest$monSelectPreviousFigureClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1231$$Nest$monSelectPreviousFigureClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            r0.onSelectPreviousFigureClick()
            return
    }

    /* renamed from: -$$Nest$monStickfigureColorSelect, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1232$$Nest$monStickfigureColorSelect(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            r0.onStickfigureColorSelect()
            return
    }

    /* renamed from: -$$Nest$monTweenModeButtonClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1233$$Nest$monTweenModeButtonClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            r0.onTweenModeButtonClick()
            return
    }

    /* renamed from: -$$Nest$monTweenStickfigureColors, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1234$$Nest$monTweenStickfigureColors(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            r0.onTweenStickfigureColors()
            return
    }

    /* renamed from: -$$Nest$monUnjoinStickfigureClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1235$$Nest$monUnjoinStickfigureClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0) {
            r0.onUnjoinStickfigureClick()
            return
    }

    public StickfigureToolTable(org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r1, org.fortheloss.sticknodes.data.ProjectData r2, org.fortheloss.sticknodes.data.SessionData r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.mUseRememberedAngleOffset = r1
            return
    }

    private void onCenterStickfigureClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.centerFigure()
            return
    }

    private void onChangeStateIndexOfStickfigureJoins(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.setStickfigureStateIndexOfJoins(r2)
            return
    }

    private void onChangeStickfigureDoesSetJoinsState(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.setStickfigureDoesSetJoinsState(r2)
            return
    }

    private void onCopyAllPropertiesClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.copyStickfigurePropertiesBundle()
            return
    }

    private void onCopyStickfigureClick(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.copyStickfigure(r2)
            return
    }

    private void onDeleteStickfigureClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            r1 = 0
            r0.deleteStickfigure(r1)
            return
    }

    private void onEditStickfigureButtonClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.editSelectedStickfigure()
            return
    }

    private void onFlipXClick(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.flipFigureX(r2)
            return
    }

    private void onFlipYClick(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.flipFigureY(r2)
            return
    }

    private void onGoToJoinAnchorClick() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r2._joinAnchorNameLabel
            java.lang.Object r0 = r0.getUserObject()
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r0 == 0) goto L17
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r2._joinAnchorNameLabel
            java.lang.Object r1 = r1.getUserObject()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.selectFigure(r1)
        L17:
            return
    }

    private void onJoinStickfigureClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.joinFigure()
            return
    }

    private void onKeepStickfigureDuringTweenClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._keepStickfigureDuringTweenButton
            boolean r1 = r1.isChecked()
            r0.persistFigure(r1)
            return
    }

    private void onLockStickfigureClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._lockStickfigureButton
            boolean r1 = r1.isChecked()
            r0.lockFigure(r1)
            return
    }

    private void onPasteAllPropertiesClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.pasteStickfigurePropertiesBundle()
            return
    }

    private void onPasteStickfigureClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.pasteStickfigure()
            return
    }

    private void onPushBackwardClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.pushFigureBackward()
            return
    }

    private void onPushForwardClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.pushFigureForward()
            return
    }

    private void onPushJoinedFiguresClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._pushJoinedFiguresButton
            boolean r1 = r1.isChecked()
            r0.setPushJoinedFigures(r1)
            return
    }

    private void onScaleJoinedStickfiguresClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._scaleJoinedStickfiguresButton
            boolean r1 = r1.isChecked()
            r0.setStickfigureScaleJoinedStickfigures(r1)
            return
    }

    private void onSelectNextFigureClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.selectNextFigure()
            return
    }

    private void onSelectPreviousFigureClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.selectPreviousFigure()
            return
    }

    private void onStickfigureColorSelect() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            org.fortheloss.framework.ColorPicker r1 = r2._stickfigureColorPicker
            com.badlogic.gdx.graphics.Color r1 = r1.getColor()
            r0.setStickfigureColor(r1)
            return
    }

    private void onTweenModeButtonClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.toggleFigureTweenMode()
            return
    }

    private void onTweenStickfigureColors() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._tweenStickfigureColorsButton
            boolean r1 = r1.isChecked()
            r0.tweenStickfigureColors(r1)
            return
    }

    private void onUnjoinStickfigureClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.unjoinFigure()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._titleLabel = r0
            r2._stickfigureNameLabel = r0
            r2._copyWithJoinedFiguresButton = r0
            r2._copyStickfigureButton = r0
            r2._pasteStickfigureButton = r0
            r2._copyAllPropertiesButton = r0
            r2._pasteAllPropertiesButton = r0
            r2._deleteStickfigureButton = r0
            r2._editStickfigureButton = r0
            r2._centerStickfigureButton = r0
            r2._flipXButton = r0
            r2._flipYButton = r0
            r2._pushBackwardButton = r0
            r2._pushForwardButton = r0
            r2.mLayerPositionLabel = r0
            r2._pushJoinedFiguresButton = r0
            r2._lockStickfigureButton = r0
            r2._showInOnionSkinButton = r0
            r2._keepStickfigureDuringTweenButton = r0
            r2._tweenStickfigureColorsButton = r0
            r2._tweenModeButton = r0
            r2._joinStickfigureButton = r0
            r2._unjoinStickfigureButton = r0
            r2.mJoinButtonsCellRef = r0
            r2.mUnlockFromCameraButton = r0
            r2._scaleJoinedStickfiguresButton = r0
            r2._scaleJoinedStickfiguresLabel = r0
            r2._selectPreviousFigureButton = r0
            r2._selectNextFigureButton = r0
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r2.mStateField
            if (r1 == 0) goto L44
            r1.dispose()
            r2.mStateField = r0
        L44:
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mScaleField
            if (r1 == 0) goto L4d
            r1.dispose()
            r2.mScaleField = r0
        L4d:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable r1 = r2._joinedFiguresTable
            if (r1 == 0) goto L56
            r1.dispose()
            r2._joinedFiguresTable = r0
        L56:
            r2._joinedFiguresCell = r0
            r2._joinedStuffTable = r0
            r2._joinedStuffTableCell = r0
            r2._joinAnchorTable = r0
            r2._joinAnchorTableCell = r0
            r2._joinAnchorNameLabel = r0
            r2.mUnlockFromCameraCellRef = r0
            org.fortheloss.framework.ColorPicker r1 = r2._stickfigureColorPicker
            if (r1 == 0) goto L6d
            r1.dispose()
            r2._stickfigureColorPicker = r0
        L6d:
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r1 = r2._copyStickfigureContextMenu
            if (r1 == 0) goto L76
            r1.dispose()
            r2._copyStickfigureContextMenu = r0
        L76:
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu r1 = r2._pasteContextMenu
            if (r1 == 0) goto L7f
            r1.dispose()
            r2._pasteContextMenu = r0
        L7f:
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.DeleteStickfigureContextMenu r1 = r2._deleteStickfigureContextMenu
            if (r1 == 0) goto L88
            r1.dispose()
            r2._deleteStickfigureContextMenu = r0
        L88:
            org.fortheloss.framework.DegreesLabelInputIncrementField r1 = r2.mAngleField
            if (r1 == 0) goto L91
            r1.dispose()
            r2.mAngleField = r0
        L91:
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r26, com.badlogic.gdx.graphics.g2d.TextureAtlas r27, com.badlogic.gdx.scenes.scene2d.utils.Drawable r28) {
            r25 = this;
            r7 = r25
            r8 = r26
            r0 = r28
            super.initialize(r0)
            java.lang.String r0 = "stickfigureTools"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r9 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9, r1)
            r7._titleLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r10 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            r25.row()
            java.lang.String r11 = ""
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r11, r9)
            r7._stickfigureNameLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            r25.row()
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.DeleteStickfigureContextMenu r0 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.DeleteStickfigureContextMenu
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getContextMenuBackgroundDrawable()
            r0.<init>(r7, r1)
            r7._deleteStickfigureContextMenu = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.defaults()
            r12 = 0
            r1.uniform(r12, r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r10)
            r1.fillX()
            r25.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$1 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$1
            java.lang.String r2 = "deleteStickfigure"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            org.fortheloss.sticknodes.ImageTextButtonLongPress$ImageTextButtonLongPressStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeDeleteButtonLongPressStyle()
            r1.<init>(r7, r2, r3)
            r7._deleteStickfigureButton = r1
            r2 = 130(0x82, float:1.82E-43)
            r7.registerWidget(r1, r2)
            org.fortheloss.sticknodes.ImageTextButtonLongPress r1 = r7._deleteStickfigureButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$2 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$2
            r2.<init>(r7)
            r1.addListener(r2)
            org.fortheloss.sticknodes.ImageTextButtonLongPress r1 = r7._deleteStickfigureButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r1)
            org.fortheloss.sticknodes.ImageTextButtonLongPress r2 = r7._deleteStickfigureButton
            float r2 = r2.getWidth()
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            float r2 = r2 * r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.width(r2)
            r2 = 16
            r1.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getEditButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton(r11, r1)
            r7._editStickfigureButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$3 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$3
            r3.<init>(r7)
            r1.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r7._editStickfigureButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r7._editStickfigureButton
            float r1 = r1.getWidth()
            r3 = 1051931443(0x3eb33333, float:0.35)
            float r1 = r1 * r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            r13 = 8
            r0.align(r13)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalMenuLeftStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r0)
            r7._selectPreviousFigureButton = r0
            r1 = 131(0x83, float:1.84E-43)
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r7._selectPreviousFigureButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$4 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$4
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r7._selectPreviousFigureButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = r7._selectPreviousFigureButton
            float r1 = r1.getHeight()
            r3 = 1060320051(0x3f333333, float:0.7)
            float r1 = r1 * r3
            r0.height(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalMenuRightStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r0)
            r7._selectNextFigureButton = r0
            r1 = 132(0x84, float:1.85E-43)
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r7._selectNextFigureButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$5 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$5
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r7._selectNextFigureButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r13)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = r7._selectNextFigureButton
            float r1 = r1.getHeight()
            float r1 = r1 * r3
            r0.height(r1)
            r25.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r14 = "separator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r8.findRegion(r14)
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r1)
            r0.fillX()
            r25.row()
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r0 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getContextMenuBackgroundDrawable()
            r0.<init>(r1)
            r7._copyStickfigureContextMenu = r0
            org.fortheloss.sticknodes.animationscreen.modules.Module r0 = r25.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r0.getContext()
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r0 = r0.getNerdModeEnabled()
            if (r0 != 0) goto L199
            java.lang.String r0 = "copyWithJoinedFiguresInfo"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r1 = r7._copyStickfigureContextMenu
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            r3 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r3
            r0.width(r1)
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r0 = r7._copyStickfigureContextMenu
            r0.row()
        L199:
            java.lang.String r0 = "copyWithJoinedFigures"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r0, r1)
            r7._copyWithJoinedFiguresButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$6 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$6
            r1.<init>(r7)
            r0.addListener(r1)
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r0 = r7._copyStickfigureContextMenu
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r7._copyWithJoinedFiguresButton
            r0.add(r1)
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r0 = r7._copyStickfigureContextMenu
            r0.pack()
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu r0 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu
            org.fortheloss.sticknodes.data.SessionData r1 = r7.mSessionDataRef
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getContextMenuBackgroundDrawable()
            r0.<init>(r1, r3)
            r7._pasteContextMenu = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$7 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$7
            java.lang.String r1 = "copyStickfigure"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            org.fortheloss.sticknodes.TextButtonLongPress$TextButtonLongPressStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonLongPressStyle()
            r0.<init>(r7, r1, r3)
            r7._copyStickfigureButton = r0
            r1 = 133(0x85, float:1.86E-43)
            r7.registerWidget(r0, r1)
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r7._copyStickfigureButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0.getLabel()
            r0.setWrap(r9)
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r7._copyStickfigureButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.getCell(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1082130432(0x40800000, float:4.0)
            float r4 = r1 * r3
            float r1 = r1 * r3
            r15 = 0
            r0.pad(r15, r4, r15, r1)
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r7._copyStickfigureButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$8 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$8
            r1.<init>(r7)
            r0.addListener(r1)
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r7._copyStickfigureButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.align(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$9 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$9
            java.lang.String r1 = "pasteStickfigure"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            org.fortheloss.sticknodes.TextButtonLongPress$TextButtonLongPressStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonLongPressStyle()
            r0.<init>(r7, r1, r4)
            r7._pasteStickfigureButton = r0
            r1 = 134(0x86, float:1.88E-43)
            r7.registerWidget(r0, r1)
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r7._pasteStickfigureButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0.getLabel()
            r0.setWrap(r9)
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r7._pasteStickfigureButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.getCell(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r1 * r3
            float r1 = r1 * r3
            r0.pad(r15, r4, r15, r1)
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r7._pasteStickfigureButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$10 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$10
            r1.<init>(r7)
            r0.addListener(r1)
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r7._pasteStickfigureButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.align(r13)
            r25.row()
            java.lang.String r0 = "copyAllProperties"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r0, r1)
            r7._copyAllPropertiesButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$11 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$11
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._copyAllPropertiesButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.align(r2)
            java.lang.String r0 = "pasteAllProperties"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r0, r1)
            r7._pasteAllPropertiesButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$12 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$12
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._pasteAllPropertiesButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.align(r13)
            r25.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r8.findRegion(r14)
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r1)
            r0.fillX()
            r25.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$13 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$13
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalFlipFigureX()
            r3 = 1050253722(0x3e99999a, float:0.3)
            r0.<init>(r7, r1, r3)
            r7._flipXButton = r0
            r1 = 135(0x87, float:1.89E-43)
            r7.registerWidget(r0, r1)
            org.fortheloss.framework.RepeatingImageButton r0 = r7._flipXButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$14 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$14
            r1.<init>(r7)
            r0.addListener(r1)
            org.fortheloss.framework.RepeatingImageButton r0 = r7._flipXButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.align(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$15 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$15
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalFlipFigureY()
            r0.<init>(r7, r1, r3)
            r7._flipYButton = r0
            r1 = 136(0x88, float:1.9E-43)
            r7.registerWidget(r0, r1)
            org.fortheloss.framework.RepeatingImageButton r0 = r7._flipYButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$16 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$16
            r1.<init>(r7)
            r0.addListener(r1)
            org.fortheloss.framework.RepeatingImageButton r0 = r7._flipYButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.align(r13)
            r25.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$17 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$17
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalFigurePushBackwardStyle()
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            r0.<init>(r7, r1, r3)
            r7._pushBackwardButton = r0
            r1 = 137(0x89, float:1.92E-43)
            r7.registerWidget(r0, r1)
            org.fortheloss.framework.RepeatingImageButton r0 = r7._pushBackwardButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$18 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$18
            r1.<init>(r7)
            r0.addListener(r1)
            org.fortheloss.framework.RepeatingImageButton r0 = r7._pushBackwardButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.align(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$19 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$19
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalFigurePushForwardStyle()
            r0.<init>(r7, r1, r3)
            r7._pushForwardButton = r0
            r1 = 138(0x8a, float:1.93E-43)
            r7.registerWidget(r0, r1)
            org.fortheloss.framework.RepeatingImageButton r0 = r7._pushForwardButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$20 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$20
            r1.<init>(r7)
            r0.addListener(r1)
            org.fortheloss.framework.RepeatingImageButton r0 = r7._pushForwardButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.align(r13)
            r25.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r11, r9)
            r7.mLayerPositionLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r0.colspan(r10)
            r25.row()
            java.lang.String r0 = "centerStickfigure"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r0, r1)
            r7._centerStickfigureButton = r0
            r1 = 139(0x8b, float:1.95E-43)
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._centerStickfigureButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$21 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$21
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._centerStickfigureButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.colspan(r10)
            r25.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r8.findRegion(r14)
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r1)
            r0.fillX()
            r25.row()
            java.lang.String r0 = "stickfigureColor"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.fillX()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$22 r6 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$22
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r7.mAnimationBasedModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0.getScreenFBO()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r16 = 1092616192(0x41200000, float:10.0)
            float r5 = r0 * r16
            org.fortheloss.sticknodes.data.SessionData r0 = r7.mSessionDataRef
            boolean r17 = r0.getIsLeftHandMode()
            r0 = r6
            r1 = r25
            r4 = r27
            r15 = r6
            r6 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7._stickfigureColorPicker = r15
            r0 = 1065353216(0x3f800000, float:1.0)
            r15.setColor(r0, r0, r0, r0)
            org.fortheloss.framework.ColorPicker r0 = r7._stickfigureColorPicker
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$23 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$23
            r1.<init>(r7)
            r0.addListener(r1)
            org.fortheloss.framework.ColorPicker r0 = r7._stickfigureColorPicker
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r1)
            r0.align(r13)
            r25.row()
            org.fortheloss.framework.LabelInputIncrementField r0 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r1 = r25.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r18 = r1.getContext()
            java.lang.String r1 = "stickfigureScale"
            java.lang.String r19 = org.fortheloss.sticknodes.App.localize(r1)
            r21 = 5
            r22 = 0
            r23 = 1101004800(0x41a00000, float:20.0)
            r24 = 1
            java.lang.String r20 = "1.00"
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r7.mScaleField = r0
            r1 = 140(0x8c, float:1.96E-43)
            r7.registerWidget(r0, r1)
            org.fortheloss.framework.LabelInputIncrementField r0 = r7.mScaleField
            r0.setIncrementType(r12)
            org.fortheloss.framework.LabelInputIncrementField r0 = r7.mScaleField
            r0.allowZeroDefault(r12)
            org.fortheloss.framework.LabelInputIncrementField r0 = r7.mScaleField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$24 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$24
            r1.<init>(r7)
            r0.setFieldListener(r1)
            org.fortheloss.framework.LabelInputIncrementField r0 = r7.mScaleField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            r25.row()
            org.fortheloss.framework.DegreesLabelInputIncrementField r0 = new org.fortheloss.framework.DegreesLabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r1 = r25.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r18 = r1.getContext()
            java.lang.String r1 = "stickfigureAngle"
            java.lang.String r19 = org.fortheloss.sticknodes.App.localize(r1)
            r21 = 3
            r23 = 1135837184(0x43b38000, float:359.0)
            r24 = 0
            java.lang.String r20 = "0"
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r7.mAngleField = r0
            r1 = 15
            r7.registerWidget(r0, r1)
            org.fortheloss.framework.DegreesLabelInputIncrementField r0 = r7.mAngleField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$25 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$25
            r1.<init>(r7)
            r0.setFieldListener(r1)
            org.fortheloss.framework.DegreesLabelInputIncrementField r0 = r7.mAngleField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            r25.row()
            java.lang.String r0 = "lockStickfigure"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._lockStickfigureButton = r0
            r1 = 141(0x8d, float:1.98E-43)
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._lockStickfigureButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$26 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$26
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._lockStickfigureButton
            r7.add(r0)
            r25.row()
            java.lang.String r0 = "visibleInOnionSkin"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._showInOnionSkinButton = r0
            r1 = 143(0x8f, float:2.0E-43)
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._showInOnionSkinButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$27 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$27
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._showInOnionSkinButton
            r7.add(r0)
            r25.row()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r8.findRegion(r14)
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r1)
            r0.fillX()
            r25.row()
            java.lang.String r0 = "keepStickfigureTween"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._keepStickfigureDuringTweenButton = r0
            r1 = 142(0x8e, float:1.99E-43)
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._keepStickfigureDuringTweenButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$28 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$28
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._keepStickfigureDuringTweenButton
            r7.add(r0)
            r25.row()
            java.lang.String r0 = "tweenStickfigureColors"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._tweenStickfigureColorsButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$29 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$29
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._tweenStickfigureColorsButton
            r7.add(r0)
            r25.row()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r11, r0)
            r7._tweenModeButton = r0
            r1 = 146(0x92, float:2.05E-43)
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._tweenModeButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$30 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$30
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._tweenModeButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            r0.colspan(r10)
            r25.row()
            org.fortheloss.sticknodes.animationscreen.modules.Module r0 = r25.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r0.getContext()
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r0 = r0.getNerdModeEnabled()
            if (r0 != 0) goto L5ed
            java.lang.String r0 = "stickfigureTweenInfo"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r0.fillX()
            r25.row()
        L5ed:
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r8.findRegion(r14)
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padTop(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r1)
            r0.fillX()
            r25.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            r7._joinAnchorTable = r0
            r1 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.pad(r1)
            r0.align(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._joinAnchorTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.space(r1)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceRight(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r9)
            r0.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._joinAnchorTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r7._joinAnchorTableCell = r0
            r25.row()
            java.lang.String r0 = "joinedTo"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ":\n"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            r7._joinAnchorNameLabel = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$31 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$31
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._joinAnchorTable
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r7._joinAnchorNameLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            r1 = 1134559232(0x43a00000, float:320.0)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r1
            r0.width(r2)
            java.lang.String r0 = "join"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargeJoin()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r0, r1)
            r7._joinStickfigureButton = r0
            r1 = 144(0x90, float:2.02E-43)
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r7._joinStickfigureButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$32 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$32
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r7._joinStickfigureButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r7.mJoinButtonsCellRef = r0
            r25.row()
            java.lang.String r0 = "unjoin"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargeUnjoin()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r0, r1)
            r7._unjoinStickfigureButton = r0
            r1 = 145(0x91, float:2.03E-43)
            r7.registerWidget(r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r7._unjoinStickfigureButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$33 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$33
            r1.<init>(r7)
            r0.addListener(r1)
            java.lang.String r0 = "unlockFromCamera"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getShortLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r0, r1)
            r7.mUnlockFromCameraButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$34 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$34
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7.mUnlockFromCameraButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r7.mUnlockFromCameraCellRef = r0
            r25.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r7._joinedStuffTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            r7._joinedStuffTableCell = r0
            r25.row()
            java.lang.String r0 = "scaleJoinedStickfigures"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            r7._scaleJoinedStickfiguresLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._joinedStuffTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._scaleJoinedStickfiguresButton = r0
            r0.setChecked(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r7._scaleJoinedStickfiguresButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$35 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$35
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._joinedStuffTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._scaleJoinedStickfiguresButton
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._joinedStuffTable
            r0.row()
            java.lang.String r0 = "pushJoinedFigures"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r7._joinedStuffTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            r0.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r0)
            r7._pushJoinedFiguresButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$36 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$36
            r1.<init>(r7)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._joinedStuffTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r7._pushJoinedFiguresButton
            r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._joinedStuffTable
            r0.row()
            org.fortheloss.framework.CheckBoxInputIncrementField r0 = new org.fortheloss.framework.CheckBoxInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r1 = r25.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r16 = r1.getContext()
            java.lang.String r1 = "stateOfJoinsInfo"
            java.lang.String r17 = org.fortheloss.sticknodes.App.localize(r1)
            r19 = 3
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 1148829696(0x4479c000, float:999.0)
            r22 = 0
            java.lang.String r18 = "1"
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r7.mStateField = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$37 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable$37
            r1.<init>(r7)
            r0.setFieldListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._joinedStuffTable
            org.fortheloss.framework.CheckBoxInputIncrementField r1 = r7.mStateField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r0.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._joinedStuffTable
            r0.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r1 = r7.mAnimationBasedModuleRef
            r0.<init>(r1)
            r7._joinedFiguresTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r8.findRegion(r14)
            r1.<init>(r2)
            r0.initialize(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable r0 = r7._joinedFiguresTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.fillX()
            r7._joinedFiguresCell = r0
            r25.pack()
            return
    }

    public void onDeleteStickfigureWithJoinsClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            r1 = 1
            r0.deleteStickfigure(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r16 = this;
            r0 = r16
            org.fortheloss.sticknodes.data.SessionData r1 = r0.mSessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getCurrentlySelectedStickfigure()
            r2 = 1
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r1 != 0) goto L26
            com.badlogic.gdx.scenes.scene2d.Touchable r5 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r5)
            r0.setColor(r4, r4, r4, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable> r5 = r0._joinedFiguresCell
            com.badlogic.gdx.scenes.scene2d.Actor r5 = r5.getActor()
            if (r5 == 0) goto L356
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable> r5 = r0._joinedFiguresCell
            r5.clearActor()
            goto L356
        L26:
            com.badlogic.gdx.scenes.scene2d.Touchable r5 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r0.setTouchable(r5)
            r0.setColor(r4, r4, r4, r4)
            java.lang.String r5 = r1.getName()
            int r6 = r5.length()
            java.lang.String r7 = "..."
            r8 = 50
            r9 = 23
            r10 = 0
            if (r6 <= r8) goto L62
            java.lang.String r6 = r5.substring(r10, r9)
            int r11 = r5.length()
            int r11 = r11 - r9
            int r12 = r5.length()
            java.lang.String r5 = r5.substring(r11, r12)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            r11.append(r7)
            r11.append(r5)
            java.lang.String r5 = r11.toString()
        L62:
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r0._stickfigureNameLabel
            int r11 = r1.getID()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            java.lang.String r5 = " (ID: "
            r12.append(r5)
            r12.append(r11)
            java.lang.String r11 = ")"
            r12.append(r11)
            java.lang.String r12 = r12.toString()
            r6.setText(r12)
            org.fortheloss.framework.ColorPicker r6 = r0._stickfigureColorPicker
            com.badlogic.gdx.graphics.Color r12 = r1.getColor()
            r6.setColor(r12, r10)
            org.fortheloss.framework.LabelInputIncrementField r6 = r0.mScaleField
            float r12 = r1.getScale()
            r6.setValue(r12)
            boolean r6 = r1.isJoined()
            if (r6 == 0) goto Lb2
            r0.mUseRememberedAngleOffset = r2
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r1.getJoinedToNode()
            float r6 = r6.getAngle()
            r0.mRememberedAngleOffset = r6
            org.fortheloss.framework.DegreesLabelInputIncrementField r6 = r0.mAngleField
            float r12 = r1.getRotation()
            r6.setValue(r12)
            goto Lbd
        Lb2:
            r0.mUseRememberedAngleOffset = r10
            org.fortheloss.framework.DegreesLabelInputIncrementField r6 = r0.mAngleField
            float r12 = r1.getRotation()
            r6.setValue(r12)
        Lbd:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r0._lockStickfigureButton
            boolean r12 = r1.isLocked()
            r6.setChecked(r12)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r0._showInOnionSkinButton
            boolean r12 = r1.isVisibleInOnionSkin()
            r6.setChecked(r12)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r0._keepStickfigureDuringTweenButton
            boolean r12 = r1.isPersistent()
            r6.setChecked(r12)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r0._tweenStickfigureColorsButton
            boolean r12 = r1.isTweeningColors()
            r6.setChecked(r12)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r0._scaleJoinedStickfiguresButton
            boolean r12 = r1.getIsScalingJoinedStickfigures()
            r6.setChecked(r12)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r0._pushJoinedFiguresButton
            boolean r12 = r1.getPushJoinedFigures()
            r6.setChecked(r12)
            org.fortheloss.framework.CheckBoxInputIncrementField r6 = r0.mStateField
            int r12 = r1.getStateIndexOfJoins()
            int r12 = r12 + r2
            float r12 = (float) r12
            boolean r13 = r1.getDoesSetStateOfJoins()
            r6.setValue(r12, r13)
            byte r6 = r1.getTweenMode()
            r12 = 2
            java.lang.String r13 = ": "
            java.lang.String r14 = "tween"
            if (r6 != 0) goto L130
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r0._tweenModeButton
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            java.lang.String r15 = "none"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r14)
            r9.append(r13)
            r9.append(r15)
            java.lang.String r9 = r9.toString()
            r6.setText(r9)
            goto L1c1
        L130:
            if (r6 != r2) goto L154
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r0._tweenModeButton
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r14)
            java.lang.String r14 = "linear"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r9)
            r15.append(r13)
            r15.append(r14)
            java.lang.String r9 = r15.toString()
            r6.setText(r9)
            goto L1c1
        L154:
            if (r6 != r12) goto L178
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r0._tweenModeButton
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r14)
            java.lang.String r14 = "ease"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r9)
            r15.append(r13)
            r15.append(r14)
            java.lang.String r9 = r15.toString()
            r6.setText(r9)
            goto L1c1
        L178:
            r9 = 3
            if (r6 != r9) goto L19d
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r0._tweenModeButton
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r14)
            java.lang.String r14 = "easeIn"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r9)
            r15.append(r13)
            r15.append(r14)
            java.lang.String r9 = r15.toString()
            r6.setText(r9)
            goto L1c1
        L19d:
            r9 = 4
            if (r6 != r9) goto L1c1
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r0._tweenModeButton
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r14)
            java.lang.String r14 = "easeOut"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r9)
            r15.append(r13)
            r15.append(r14)
            java.lang.String r9 = r15.toString()
            r6.setText(r9)
        L1c1:
            boolean r6 = r1.isJoined()
            if (r6 != 0) goto L1fb
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton> r5 = r0.mJoinButtonsCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r5 = r5.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r6 = r0._joinStickfigureButton
            if (r5 == r6) goto L1d6
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton> r5 = r0.mJoinButtonsCellRef
            r5.setActor(r6)
        L1d6:
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r5 = r0._joinStickfigureButton
            com.badlogic.gdx.scenes.scene2d.Touchable r6 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r5.setTouchable(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r5 = r0._joinStickfigureButton
            r5.setColor(r4, r4, r4, r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r5 = r0._unjoinStickfigureButton
            com.badlogic.gdx.scenes.scene2d.Touchable r6 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r5.setTouchable(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r5 = r0._unjoinStickfigureButton
            r5.setColor(r4, r4, r4, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r5 = r0._joinAnchorTableCell
            r5.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r0._joinAnchorNameLabel
            r6 = 0
            r5.setUserObject(r6)
            goto L299
        L1fb:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton> r6 = r0.mJoinButtonsCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r6 = r6.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r9 = r0._unjoinStickfigureButton
            if (r6 == r9) goto L20a
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton> r6 = r0.mJoinButtonsCellRef
            r6.setActor(r9)
        L20a:
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r6 = r0._joinStickfigureButton
            com.badlogic.gdx.scenes.scene2d.Touchable r9 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r6.setTouchable(r9)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r6 = r0._joinStickfigureButton
            r6.setColor(r4, r4, r4, r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r6 = r0._unjoinStickfigureButton
            com.badlogic.gdx.scenes.scene2d.Touchable r9 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r6.setTouchable(r9)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r6 = r0._unjoinStickfigureButton
            r6.setColor(r4, r4, r4, r4)
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r1.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r6 = r6.getStickfigure()
            java.lang.String r9 = r6.getName()
            int r13 = r9.length()
            if (r13 <= r8) goto L255
            r8 = 23
            java.lang.String r13 = r9.substring(r10, r8)
            int r14 = r9.length()
            int r14 = r14 - r8
            java.lang.String r8 = r9.substring(r14)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r13)
            r9.append(r7)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
        L255:
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = r0._joinAnchorNameLabel
            org.fortheloss.sticknodes.stickfigure.StickNode r8 = r1.getJoinedToNode()
            r7.setUserObject(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = r0._joinAnchorNameLabel
            java.lang.String r8 = "joinedTo"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            int r6 = r6.getID()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r8)
            java.lang.String r8 = ":\n"
            r13.append(r8)
            r13.append(r9)
            r13.append(r5)
            r13.append(r6)
            r13.append(r11)
            java.lang.String r5 = r13.toString()
            r7.setText(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r5 = r0._joinAnchorTableCell
            com.badlogic.gdx.scenes.scene2d.Actor r5 = r5.getActor()
            if (r5 != 0) goto L299
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r5 = r0._joinAnchorTableCell
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r0._joinAnchorTable
            r5.setActor(r6)
        L299:
            byte r5 = r1.isLockedToCamera()
            if (r5 == 0) goto L2bb
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r5 = r0._joinStickfigureButton
            com.badlogic.gdx.scenes.scene2d.Touchable r6 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r5.setTouchable(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r5 = r0._joinStickfigureButton
            r5.setColor(r4, r4, r4, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.TextButton> r5 = r0.mUnlockFromCameraCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r5 = r5.getActor()
            if (r5 != 0) goto L2c0
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.TextButton> r5 = r0.mUnlockFromCameraCellRef
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r0.mUnlockFromCameraButton
            r5.setActor(r6)
            goto L2c0
        L2bb:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.TextButton> r5 = r0.mUnlockFromCameraCellRef
            r5.clearActor()
        L2c0:
            boolean r5 = r1.hasJoinAnchorNode()
            if (r5 != 0) goto L2e1
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable> r5 = r0._joinedFiguresCell
            com.badlogic.gdx.scenes.scene2d.Actor r5 = r5.getActor()
            if (r5 == 0) goto L2d3
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable> r5 = r0._joinedFiguresCell
            r5.clearActor()
        L2d3:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r5 = r0._joinedStuffTableCell
            com.badlogic.gdx.scenes.scene2d.Actor r5 = r5.getActor()
            if (r5 == 0) goto L33b
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r5 = r0._joinedStuffTableCell
            r5.clearActor()
            goto L33b
        L2e1:
            org.fortheloss.sticknodes.data.SessionData r5 = r0.mSessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r5 = r5.getCurrentlySelectedNode()
            boolean r6 = r5 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r6 == 0) goto L31f
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = (org.fortheloss.sticknodes.stickfigure.StickNode) r5
            boolean r6 = r5.isJoinAnchor()
            if (r6 == 0) goto L31f
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable> r6 = r0._joinedFiguresCell
            com.badlogic.gdx.scenes.scene2d.Actor r6 = r6.getActor()
            if (r6 != 0) goto L302
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable> r6 = r0._joinedFiguresCell
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable r7 = r0._joinedFiguresTable
            r6.setActor(r7)
        L302:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable r6 = r0._joinedFiguresTable
            r6.clearAll()
            java.util.ArrayList r5 = r5.getJoinedFigures()
            int r6 = r5.size()
        L30f:
            if (r10 >= r6) goto L32c
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable r7 = r0._joinedFiguresTable
            java.lang.Object r8 = r5.get(r10)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r8 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r8
            r7.addJoinBundle(r8)
            int r10 = r10 + 1
            goto L30f
        L31f:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable> r5 = r0._joinedFiguresCell
            com.badlogic.gdx.scenes.scene2d.Actor r5 = r5.getActor()
            if (r5 == 0) goto L32c
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.modules.tooltables.JoinedFiguresSubToolTable> r5 = r0._joinedFiguresCell
            r5.clearActor()
        L32c:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r5 = r0._joinedStuffTableCell
            com.badlogic.gdx.scenes.scene2d.Actor r5 = r5.getActor()
            if (r5 != 0) goto L33b
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r5 = r0._joinedStuffTableCell
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r0._joinedStuffTable
            r5.setActor(r6)
        L33b:
            byte r5 = r1.isLockedToCamera()
            if (r5 != r12) goto L34c
            org.fortheloss.framework.LabelInputIncrementField r5 = r0.mScaleField
            r5.disable()
            org.fortheloss.framework.DegreesLabelInputIncrementField r5 = r0.mAngleField
            r5.disable()
            goto L356
        L34c:
            org.fortheloss.framework.LabelInputIncrementField r5 = r0.mScaleField
            r5.enable()
            org.fortheloss.framework.DegreesLabelInputIncrementField r5 = r0.mAngleField
            r5.enable()
        L356:
            org.fortheloss.sticknodes.data.SessionData r5 = r0.mSessionDataRef
            java.util.ArrayList r5 = r5.getCopiedStickfigureWithJoins()
            if (r5 != 0) goto L36b
            org.fortheloss.sticknodes.TextButtonLongPress r5 = r0._pasteStickfigureButton
            com.badlogic.gdx.scenes.scene2d.Touchable r6 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r5.setTouchable(r6)
            org.fortheloss.sticknodes.TextButtonLongPress r5 = r0._pasteStickfigureButton
            r5.setColor(r4, r4, r4, r3)
            goto L377
        L36b:
            org.fortheloss.sticknodes.TextButtonLongPress r5 = r0._pasteStickfigureButton
            com.badlogic.gdx.scenes.scene2d.Touchable r6 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r5.setTouchable(r6)
            org.fortheloss.sticknodes.TextButtonLongPress r5 = r0._pasteStickfigureButton
            r5.setColor(r4, r4, r4, r4)
        L377:
            org.fortheloss.sticknodes.data.SessionData r5 = r0.mSessionDataRef
            org.fortheloss.sticknodes.data.StickfigurePropertiesBundle r5 = r5.getCopiedStickfigurePropertiesBundle()
            if (r5 != 0) goto L38c
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r0._pasteAllPropertiesButton
            com.badlogic.gdx.scenes.scene2d.Touchable r6 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r5.setTouchable(r6)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r0._pasteAllPropertiesButton
            r5.setColor(r4, r4, r4, r3)
            goto L398
        L38c:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r0._pasteAllPropertiesButton
            com.badlogic.gdx.scenes.scene2d.Touchable r5 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r3.setTouchable(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r0._pasteAllPropertiesButton
            r3.setColor(r4, r4, r4, r4)
        L398:
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r0.mLayerPositionLabel
            java.lang.String r4 = "? / ?"
            r3.setText(r4)
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r3 = r0.mAnimationBasedModuleRef
            org.fortheloss.sticknodes.data.IFrameData r3 = r3.getCurrentFrame()
            if (r3 == 0) goto L3e1
            java.util.ArrayList r3 = r3.getDrawableFigures()
            int r4 = r3.size()
            int r5 = r4 + (-1)
        L3b1:
            if (r5 < 0) goto L3bd
            java.lang.Object r6 = r3.get(r5)
            if (r6 != r1) goto L3ba
            goto L3be
        L3ba:
            int r5 = r5 + (-1)
            goto L3b1
        L3bd:
            r5 = -1
        L3be:
            if (r5 < 0) goto L3c6
            int r5 = r5 + r2
            java.lang.String r1 = java.lang.String.valueOf(r5)
            goto L3c8
        L3c6:
            java.lang.String r1 = "?"
        L3c8:
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0.mLayerPositionLabel
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " / "
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
            r2.setText(r1)
        L3e1:
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu r1 = r0._pasteContextMenu
            r1.update()
            return
    }
}
