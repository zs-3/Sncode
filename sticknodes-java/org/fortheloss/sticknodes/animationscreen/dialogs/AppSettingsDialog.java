package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class AppSettingsDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    protected static float dialogLastScrollY;
    private boolean _applyAndroidKeepAppAliveToggle;
    private boolean _applyApproximatePrecisionTo;
    private boolean _applyAxisLockingEnabledTo;
    private float _applyAxisLockingSensitivityTo;
    private int _applyCustomSkinEnabledTo;
    private boolean _applyIncrementButtonsVisibleInitially;
    private boolean _applyLeftHandModeEnabledTo;
    private int _applyLeftPaddingTo;
    private int _applyLineWidthTo;
    private boolean _applyMovieclipDoubleTapEnabledTo;
    private boolean _applyNerdModeEnabledTo;
    private float _applyNodeSelectionSensitivityTo;
    private int _applyNodeSkinTo;
    private boolean _applyNoneDoubleTapEnabledTo;
    private boolean _applyPersistentFiguresEnabledTo;
    private boolean _applyPreserveSelectionWhenChangingFramesTo;
    private boolean _applyRiggerModeEnabledTo;
    private int _applyRightPaddingTo;
    private boolean _applyScopedStorageDoneTo;
    private boolean _applyStickfigureBackupEnabledTo;
    private boolean _applyUnlimitedNodesEnabledTo;
    private float _applyVibrationIntensityTo;
    private org.fortheloss.sticknodes.animationscreen.modules.CanvasModule _canvasModuleRef;
    private int _customSkinEnabledBefore;
    private int _languageIndexAfter;
    private int _languageIndexBefore;
    private org.fortheloss.framework.ListCustomItemHeight<java.lang.String> _languageList;
    private boolean _leftHandModeEnabledBefore;
    private int _leftPaddingBefore;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _nodeSkinsTable;
    private int _rightPaddingBefore;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _saveMinutesTextfield;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane _scrollPane;
    private org.fortheloss.sticknodes.data.SessionData _sessionDataRef;
    private boolean _vibrationAllButtonsBefore;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _vibrationAllButtonsDisableButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _vibrationAllButtonsEnableButton;
    private boolean _vibrationLongPressBefore;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _vibrationLongPressDisableButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _vibrationLongPressEnableButton;
    private boolean _vibrationProcessCompletionBefore;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _vibrationProcessCompletionDisableButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _vibrationProcessCompletionEnableButton;
    private boolean _vibrationQrtButtonsBefore;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _vibrationQrtButtonsDisableButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _vibrationQrtButtonsEnableButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label mNewSkinWarningLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Label> mNewSkinWarningLabelCellRef;










































    /* renamed from: -$$Nest$fput_applyLeftPaddingTo, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m342$$Nest$fput_applyLeftPaddingTo(org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r0, int r1) {
            r0._applyLeftPaddingTo = r1
            return
    }

    /* renamed from: -$$Nest$fput_applyNodeSkinTo, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m343$$Nest$fput_applyNodeSkinTo(org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r0, int r1) {
            r0._applyNodeSkinTo = r1
            return
    }

    /* renamed from: -$$Nest$fput_applyRightPaddingTo, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m344$$Nest$fput_applyRightPaddingTo(org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r0, int r1) {
            r0._applyRightPaddingTo = r1
            return
    }

    /* renamed from: -$$Nest$monApproximateClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m345$$Nest$monApproximateClick(org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r0) {
            r0.onApproximateClick()
            return
    }

    /* renamed from: -$$Nest$monEnableDisableAxisLockingClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m346$$Nest$monEnableDisableAxisLockingClick(org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r0, boolean r1) {
            r0.onEnableDisableAxisLockingClick(r1)
            return
    }

    /* renamed from: -$$Nest$monEnableDisableIncrementButtonsVisibleInitiallyClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m347$$Nest$monEnableDisableIncrementButtonsVisibleInitiallyClick(org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r0, boolean r1) {
            r0.onEnableDisableIncrementButtonsVisibleInitiallyClick(r1)
            return
    }

    /* renamed from: -$$Nest$monEnableDisableLeftHandModeClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m348$$Nest$monEnableDisableLeftHandModeClick(org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r0, boolean r1) {
            r0.onEnableDisableLeftHandModeClick(r1)
            return
    }

    /* renamed from: -$$Nest$monEnableDisableStickfigureBackupClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m349$$Nest$monEnableDisableStickfigureBackupClick(org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r0, boolean r1) {
            r0.onEnableDisableStickfigureBackupClick(r1)
            return
    }

    /* renamed from: -$$Nest$monEnableUnlimitedNodesClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m350$$Nest$monEnableUnlimitedNodesClick(org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r0, boolean r1) {
            r0.onEnableUnlimitedNodesClick(r1)
            return
    }

    /* renamed from: -$$Nest$monMovieclipDoubleTapClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m351$$Nest$monMovieclipDoubleTapClick(org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r0, boolean r1) {
            r0.onMovieclipDoubleTapClick(r1)
            return
    }

    /* renamed from: -$$Nest$monNoneDoubleTapClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m352$$Nest$monNoneDoubleTapClick(org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r0, boolean r1) {
            r0.onNoneDoubleTapClick(r1)
            return
    }

    /* renamed from: -$$Nest$monPreciseClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m353$$Nest$monPreciseClick(org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r0) {
            r0.onPreciseClick()
            return
    }

    /* renamed from: -$$Nest$monScopedStorageCompleteClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m354$$Nest$monScopedStorageCompleteClick(org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r0) {
            r0.onScopedStorageCompleteClick()
            return
    }

    /* renamed from: -$$Nest$monScopedStorageNotCompleteClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m355$$Nest$monScopedStorageNotCompleteClick(org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r0) {
            r0.onScopedStorageNotCompleteClick()
            return
    }

    /* renamed from: -$$Nest$monSkinOptionClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m356$$Nest$monSkinOptionClick(org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r0, int r1) {
            r0.onSkinOptionClick(r1)
            return
    }

    /* renamed from: -$$Nest$msetAndroidKeepAppAlive, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m357$$Nest$msetAndroidKeepAppAlive(org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r0, boolean r1) {
            r0.setAndroidKeepAppAlive(r1)
            return
    }

    /* renamed from: -$$Nest$msetAxisLockingSensitivity, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m358$$Nest$msetAxisLockingSensitivity(org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r0, float r1) {
            r0.setAxisLockingSensitivity(r1)
            return
    }

    /* renamed from: -$$Nest$msetLineWidthTo, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m359$$Nest$msetLineWidthTo(org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r0, int r1) {
            r0.setLineWidthTo(r1)
            return
    }

    /* renamed from: -$$Nest$msetNerdModeEnabled, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m360$$Nest$msetNerdModeEnabled(org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r0, boolean r1) {
            r0.setNerdModeEnabled(r1)
            return
    }

    /* renamed from: -$$Nest$msetNodeSelectionSensitivity, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m361$$Nest$msetNodeSelectionSensitivity(org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r0, float r1) {
            r0.setNodeSelectionSensitivity(r1)
            return
    }

    /* renamed from: -$$Nest$msetPersistentFiguredEnabled, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m362$$Nest$msetPersistentFiguredEnabled(org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r0, boolean r1) {
            r0.setPersistentFiguredEnabled(r1)
            return
    }

    /* renamed from: -$$Nest$msetPreserveSelectionEnabled, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m363$$Nest$msetPreserveSelectionEnabled(org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r0, boolean r1) {
            r0.setPreserveSelectionEnabled(r1)
            return
    }

    /* renamed from: -$$Nest$msetRiggerModeEnabled, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m364$$Nest$msetRiggerModeEnabled(org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r0, boolean r1) {
            r0.setRiggerModeEnabled(r1)
            return
    }

    /* renamed from: -$$Nest$msetVibrationIntensity, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m365$$Nest$msetVibrationIntensity(org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r0, float r1) {
            r0.setVibrationIntensity(r1)
            return
    }

    static {
            return
    }

    public AppSettingsDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r4, org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5) {
            r3 = this;
            r3.<init>(r4)
            r0 = 0
            r3._applyUnlimitedNodesEnabledTo = r0
            r3._applyAxisLockingEnabledTo = r0
            r1 = 1
            r3._customSkinEnabledBefore = r1
            r3._applyCustomSkinEnabledTo = r1
            r3._leftHandModeEnabledBefore = r0
            r3._applyLeftHandModeEnabledTo = r0
            r3._applyStickfigureBackupEnabledTo = r0
            r3._applyIncrementButtonsVisibleInitially = r0
            r3._applyMovieclipDoubleTapEnabledTo = r0
            r3._applyNoneDoubleTapEnabledTo = r0
            r3._applyPreserveSelectionWhenChangingFramesTo = r0
            r3._applyNerdModeEnabledTo = r0
            r3._applyRiggerModeEnabledTo = r0
            r3._applyPersistentFiguresEnabledTo = r1
            r3._applyAndroidKeepAppAliveToggle = r0
            r2 = 1065353216(0x3f800000, float:1.0)
            r3._applyNodeSelectionSensitivityTo = r2
            r3._applyAxisLockingSensitivityTo = r2
            r2 = 0
            r3._applyVibrationIntensityTo = r2
            r3._applyLineWidthTo = r1
            r3._applyApproximatePrecisionTo = r1
            r3._applyScopedStorageDoneTo = r0
            r3._languageIndexBefore = r0
            r3._languageIndexAfter = r0
            r0 = -1
            r3._applyNodeSkinTo = r0
            r3._canvasModuleRef = r5
            org.fortheloss.sticknodes.data.SessionData r4 = r4.getSessionData()
            r3._sessionDataRef = r4
            return
    }

    private java.lang.String getOS() {
            r2 = this;
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r0 = r0.getType()
            com.badlogic.gdx.Application$ApplicationType r1 = com.badlogic.gdx.Application.ApplicationType.Android
            if (r0 != r1) goto Ld
            java.lang.String r0 = "Android"
            return r0
        Ld:
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r0 = r0.getType()
            com.badlogic.gdx.Application$ApplicationType r1 = com.badlogic.gdx.Application.ApplicationType.iOS
            if (r0 != r1) goto L1a
            java.lang.String r0 = "iOS"
            return r0
        L1a:
            java.lang.String r0 = "Desktop"
            return r0
    }

    private void onApproximateClick() {
            r1 = this;
            r0 = 1
            r1._applyApproximatePrecisionTo = r0
            return
    }

    private void onEnableDisableAxisLockingClick(boolean r1) {
            r0 = this;
            r0._applyAxisLockingEnabledTo = r1
            return
    }

    private void onEnableDisableIncrementButtonsVisibleInitiallyClick(boolean r1) {
            r0 = this;
            r0._applyIncrementButtonsVisibleInitially = r1
            return
    }

    private void onEnableDisableLeftHandModeClick(boolean r1) {
            r0 = this;
            r0._applyLeftHandModeEnabledTo = r1
            return
    }

    private void onEnableDisableStickfigureBackupClick(boolean r1) {
            r0 = this;
            r0._applyStickfigureBackupEnabledTo = r1
            return
    }

    private void onEnableUnlimitedNodesClick(boolean r1) {
            r0 = this;
            r0._applyUnlimitedNodesEnabledTo = r1
            return
    }

    private void onMovieclipDoubleTapClick(boolean r1) {
            r0 = this;
            r0._applyMovieclipDoubleTapEnabledTo = r1
            return
    }

    private void onNoneDoubleTapClick(boolean r1) {
            r0 = this;
            r0._applyNoneDoubleTapEnabledTo = r1
            return
    }

    private void onPreciseClick() {
            r1 = this;
            r0 = 0
            r1._applyApproximatePrecisionTo = r0
            return
    }

    private void onScopedStorageCompleteClick() {
            r1 = this;
            r0 = 1
            r1._applyScopedStorageDoneTo = r0
            return
    }

    private void onScopedStorageNotCompleteClick() {
            r1 = this;
            r0 = 0
            r1._applyScopedStorageDoneTo = r0
            return
    }

    private void onSkinOptionClick(int r2) {
            r1 = this;
            r1._applyCustomSkinEnabledTo = r2
            r0 = 3
            if (r2 != r0) goto L15
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Label> r2 = r1.mNewSkinWarningLabelCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r2.getActor()
            if (r2 != 0) goto L1a
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Label> r2 = r1.mNewSkinWarningLabelCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r1.mNewSkinWarningLabel
            r2.setActor(r0)
            goto L1a
        L15:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Label> r2 = r1.mNewSkinWarningLabelCellRef
            r2.clearActor()
        L1a:
            return
    }

    private void setAndroidKeepAppAlive(boolean r1) {
            r0 = this;
            r0._applyAndroidKeepAppAliveToggle = r1
            return
    }

    private void setAxisLockingSensitivity(float r1) {
            r0 = this;
            r0._applyAxisLockingSensitivityTo = r1
            return
    }

    private void setLineWidthTo(int r1) {
            r0 = this;
            r0._applyLineWidthTo = r1
            return
    }

    private void setNerdModeEnabled(boolean r1) {
            r0 = this;
            r0._applyNerdModeEnabledTo = r1
            return
    }

    private void setNodeSelectionSensitivity(float r1) {
            r0 = this;
            r0._applyNodeSelectionSensitivityTo = r1
            return
    }

    private void setPersistentFiguredEnabled(boolean r1) {
            r0 = this;
            r0._applyPersistentFiguresEnabledTo = r1
            return
    }

    private void setPreserveSelectionEnabled(boolean r1) {
            r0 = this;
            r0._applyPreserveSelectionWhenChangingFramesTo = r1
            return
    }

    private void setRiggerModeEnabled(boolean r1) {
            r0 = this;
            r0._applyRiggerModeEnabledTo = r1
            return
    }

    private void setVibrationIntensity(float r1) {
            r0 = this;
            r0._applyVibrationIntensityTo = r1
            return
    }

    private void showChangelog() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.showChangelog()
            return
    }

    private void showCredits() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.showCredits()
            return
    }

    public void applyChanges() {
            r13 = this;
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            java.lang.String r1 = org.fortheloss.sticknodes.App.preferencesString
            com.badlogic.gdx.Preferences r0 = r0.getPreferences(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r13._sessionDataRef
            boolean r1 = r1.getNerdModeEnabled()
            org.fortheloss.sticknodes.data.SessionData r2 = r13._sessionDataRef
            boolean r2 = r2.getRiggerModeEnabled()
            org.fortheloss.sticknodes.data.SessionData r3 = r13._sessionDataRef
            boolean r3 = r3.getAndroidKeepAppAlive()
            org.fortheloss.sticknodes.data.SessionData r4 = r13._sessionDataRef
            boolean r5 = r13._applyUnlimitedNodesEnabledTo
            r4.setUnlimitedNodesEnabled(r5)
            org.fortheloss.sticknodes.data.SessionData r4 = r13._sessionDataRef
            boolean r5 = r13._applyAxisLockingEnabledTo
            r4.setAxisLockingEnabled(r5)
            org.fortheloss.sticknodes.data.SessionData r4 = r13._sessionDataRef
            float r5 = r13._applyNodeSelectionSensitivityTo
            r4.setNodeSelectionSensitivity(r5)
            org.fortheloss.sticknodes.data.SessionData r4 = r13._sessionDataRef
            float r5 = r13._applyAxisLockingSensitivityTo
            r4.setAxisLockingSensitivity(r5)
            org.fortheloss.sticknodes.data.SessionData r4 = r13._sessionDataRef
            int r5 = r13._applyLineWidthTo
            r4.setOpenGLLineWidth(r5)
            org.fortheloss.sticknodes.data.SessionData r4 = r13._sessionDataRef
            boolean r5 = r13._applyMovieclipDoubleTapEnabledTo
            r4.setDoubleTapForMovieclipsEnabled(r5)
            org.fortheloss.sticknodes.data.SessionData r4 = r13._sessionDataRef
            boolean r5 = r13._applyNoneDoubleTapEnabledTo
            r4.setDoubleTapForNoneSelectionEnabled(r5)
            org.fortheloss.sticknodes.data.SessionData r4 = r13._sessionDataRef
            boolean r5 = r13._applyPreserveSelectionWhenChangingFramesTo
            r4.setPreserveSelectionWhenChangingFrames(r5)
            org.fortheloss.sticknodes.data.SessionData r4 = r13._sessionDataRef
            boolean r5 = r13._applyNerdModeEnabledTo
            r4.setNerdModeEnabled(r5)
            org.fortheloss.sticknodes.data.SessionData r4 = r13._sessionDataRef
            boolean r5 = r13._applyRiggerModeEnabledTo
            r4.setRiggerModeEnabled(r5)
            com.badlogic.gdx.Application r4 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r4 = r4.getType()
            com.badlogic.gdx.Application$ApplicationType r5 = com.badlogic.gdx.Application.ApplicationType.iOS
            if (r4 == r5) goto L71
            org.fortheloss.sticknodes.data.SessionData r4 = r13._sessionDataRef
            boolean r6 = r13._applyAndroidKeepAppAliveToggle
            r4.setAndroidKeepAppAlive(r6)
        L71:
            int r4 = r13._applyNodeSkinTo
            java.lang.String r6 = "nodeSkinType"
            r0.putInteger(r6, r4)
            boolean r4 = r13._applyUnlimitedNodesEnabledTo
            java.lang.String r6 = "unlimitedNodesEnabled"
            r0.putBoolean(r6, r4)
            boolean r4 = r13._applyAxisLockingEnabledTo
            java.lang.String r6 = "axisLockingEnabled"
            r0.putBoolean(r6, r4)
            int r4 = r13._applyCustomSkinEnabledTo
            java.lang.String r6 = "customSkinSetting"
            r0.putInteger(r6, r4)
            boolean r4 = r13._applyLeftHandModeEnabledTo
            java.lang.String r6 = "leftHandModeEnabled"
            r0.putBoolean(r6, r4)
            boolean r4 = r13._applyStickfigureBackupEnabledTo
            java.lang.String r6 = "enableStickfigureBackup"
            r0.putBoolean(r6, r4)
            boolean r4 = r13._applyIncrementButtonsVisibleInitially
            java.lang.String r6 = "incrementButtonsVisibleInitially"
            r0.putBoolean(r6, r4)
            boolean r4 = r13._applyMovieclipDoubleTapEnabledTo
            java.lang.String r6 = "movieclipDoubleTapEnabled"
            r0.putBoolean(r6, r4)
            boolean r4 = r13._applyNoneDoubleTapEnabledTo
            java.lang.String r6 = "noneDoubleTapEnabled"
            r0.putBoolean(r6, r4)
            boolean r4 = r13._applyPreserveSelectionWhenChangingFramesTo
            java.lang.String r6 = "preserveSelectionWhenChangingFrames"
            r0.putBoolean(r6, r4)
            boolean r4 = r13._applyNerdModeEnabledTo
            java.lang.String r6 = "nerdModeEnabled"
            r0.putBoolean(r6, r4)
            boolean r4 = r13._applyRiggerModeEnabledTo
            java.lang.String r6 = "riggerModeEnabled"
            r0.putBoolean(r6, r4)
            boolean r4 = r13._applyPersistentFiguresEnabledTo
            java.lang.String r6 = "persistentFiguresEnabled"
            r0.putBoolean(r6, r4)
            com.badlogic.gdx.Application r4 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r4 = r4.getType()
            if (r4 == r5) goto Ldb
            boolean r4 = r13._applyAndroidKeepAppAliveToggle
            java.lang.String r5 = "androidKeepAppAlive"
            r0.putBoolean(r5, r4)
        Ldb:
            org.fortheloss.sticknodes.data.SessionData r4 = r13._sessionDataRef
            float r4 = r4.getNodeSelectionSensitivity()
            java.lang.String r5 = "sensitivityNodeSelection"
            r0.putFloat(r5, r4)
            org.fortheloss.sticknodes.data.SessionData r4 = r13._sessionDataRef
            float r4 = r4.getAxisLockingSensitivity()
            java.lang.String r5 = "sensitivityAxisLocking"
            r0.putFloat(r5, r4)
            org.fortheloss.sticknodes.data.SessionData r4 = r13._sessionDataRef
            int r4 = r4.getOpenGLLineWidth()
            java.lang.String r5 = "lineWidth"
            r0.putInteger(r5, r4)
            boolean r4 = r13._applyApproximatePrecisionTo
            java.lang.String r5 = "precisionIsApproximate"
            r0.putBoolean(r5, r4)
            int r4 = r13._applyLeftPaddingTo
            java.lang.String r5 = "screenPaddingLeft"
            r0.putInteger(r5, r4)
            int r4 = r13._applyRightPaddingTo
            java.lang.String r5 = "screenPaddingRight"
            r0.putInteger(r5, r4)
            com.badlogic.gdx.Application r4 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r4 = r4.getType()
            com.badlogic.gdx.Application$ApplicationType r5 = com.badlogic.gdx.Application.ApplicationType.Android
            if (r4 != r5) goto L122
            boolean r4 = r13._applyScopedStorageDoneTo
            java.lang.String r5 = "scopedStorageDone"
            r0.putBoolean(r5, r4)
        L122:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r13._vibrationAllButtonsEnableButton
            r5 = 0
            if (r4 == 0) goto L15f
            boolean r4 = r4.isChecked()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r13._vibrationQrtButtonsEnableButton
            boolean r6 = r6.isChecked()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = r13._vibrationLongPressEnableButton
            boolean r7 = r7.isChecked()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = r13._vibrationProcessCompletionEnableButton
            boolean r8 = r8.isChecked()
            java.lang.String r9 = "vibrationAllButtons"
            r0.putBoolean(r9, r4)
            java.lang.String r9 = "vibrationQrtButtons"
            r0.putBoolean(r9, r6)
            java.lang.String r9 = "vibrationLongPress"
            r0.putBoolean(r9, r7)
            java.lang.String r9 = "vibrationProcessCompletion"
            r0.putBoolean(r9, r8)
            float r9 = r13._applyVibrationIntensityTo
            int r9 = (int) r9
            java.lang.String r10 = "vibrationIntensity"
            r0.putInteger(r10, r9)
            float r9 = r13._applyVibrationIntensityTo
            int r9 = (int) r9
            org.fortheloss.sticknodes.App.vibrationIntensity = r9
            goto L163
        L15f:
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L163:
            r0.flush()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r9 = r13._animationScreenRef
            com.badlogic.gdx.scenes.scene2d.Stage r9 = r9.getStage()
            com.badlogic.gdx.utils.viewport.Viewport r9 = r9.getViewport()
            int r9 = r9.getScreenWidth()
            float r9 = (float) r9
            com.badlogic.gdx.Graphics r10 = com.badlogic.gdx.Gdx.graphics
            int r10 = r10.getWidth()
            float r10 = (float) r10
            float r9 = r9 / r10
            boolean r10 = r13._applyApproximatePrecisionTo
            org.fortheloss.sticknodes.data.SessionData r11 = r13._sessionDataRef
            float r11 = r11.getNodeSelectionSensitivity()
            org.fortheloss.sticknodes.stickfigure.Stickfigure.setTouchPrecision(r10, r11, r9)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r9 = r13._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.NodeDrawTools r9 = r9.getNodeDrawTools()
            int r10 = r9.getType()
            int r11 = r13._applyNodeSkinTo
            if (r10 == r11) goto L199
            r9.setType(r11)
        L199:
            boolean r9 = r13._applyStickfigureBackupEnabledTo
            r10 = 1
            if (r9 == 0) goto L1a4
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r9 = r13._animationScreenRef
            r9.enableStickfigureBackup(r10)
            goto L1a9
        L1a4:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r9 = r13._animationScreenRef
            r9.enableStickfigureBackup(r5)
        L1a9:
            boolean r9 = r13._applyUnlimitedNodesEnabledTo
            org.fortheloss.sticknodes.App.setUnlimitedNodesPerFrame(r9)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r9 = r13._canvasModuleRef
            r9.setNeedsToBeDrawn()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r9 = r13._saveMinutesTextfield
            java.lang.String r9 = r9.getText()
            java.lang.String r11 = ""
            boolean r9 = r9.equals(r11)
            r11 = 3
            if (r9 != 0) goto L1eb
            com.badlogic.gdx.scenes.scene2d.ui.TextField r9 = r13._saveMinutesTextfield     // Catch: java.lang.Exception -> L1ce
            java.lang.String r9 = r9.getText()     // Catch: java.lang.Exception -> L1ce
            int r9 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.Exception -> L1ce
            r12 = 0
            goto L1d0
        L1ce:
            r9 = 0
            r12 = 1
        L1d0:
            if (r12 != 0) goto L1eb
            r12 = 99
            if (r9 <= 0) goto L1da
            if (r9 >= r11) goto L1da
            r9 = 3
            goto L1de
        L1da:
            if (r9 <= r12) goto L1de
            r9 = 99
        L1de:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r13._animationScreenRef
            r12.setSavePromptSeconds(r9)
            java.lang.String r12 = "savePromptMinutes"
            r0.putInteger(r12, r9)
            r0.flush()
        L1eb:
            int r0 = r13._customSkinEnabledBefore
            int r9 = r13._applyCustomSkinEnabledTo
            if (r0 == r9) goto L1f3
            r0 = 1
            goto L1f4
        L1f3:
            r0 = 0
        L1f4:
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r9 = r13._languageList
            int r9 = r9.getSelectedIndex()
            r13._languageIndexAfter = r9
            int r12 = r13._languageIndexBefore
            if (r12 == r9) goto L23a
            r1 = 7
            r2 = 6
            r3 = 4
            r4 = 5
            r6 = 2
            if (r9 != 0) goto L208
            goto L223
        L208:
            if (r9 != r10) goto L20c
            r5 = 1
            goto L223
        L20c:
            if (r9 != r6) goto L210
            r5 = 5
            goto L223
        L210:
            if (r9 != r11) goto L214
            r5 = 2
            goto L223
        L214:
            if (r9 != r3) goto L218
            r5 = 6
            goto L223
        L218:
            if (r9 != r4) goto L21c
            r5 = 3
            goto L223
        L21c:
            if (r9 != r2) goto L220
            r5 = 7
            goto L223
        L220:
            if (r9 != r1) goto L223
            r5 = 4
        L223:
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            double r2 = (double) r5
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.String r3 = "language_fix"
            java.lang.String r4 = "(app settings)"
            r1.analyticsSendValue(r3, r4, r2)
            org.fortheloss.sticknodes.App.setLanguage(r5)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r13._animationScreenRef
            r1.startNewProject(r0)
            return
        L23a:
            com.badlogic.gdx.Application r5 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r5 = r5.getType()
            com.badlogic.gdx.Application$ApplicationType r9 = com.badlogic.gdx.Application.ApplicationType.iOS
            if (r5 == r9) goto L24d
            boolean r5 = r13._applyAndroidKeepAppAliveToggle
            if (r3 == r5) goto L24d
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r13._animationScreenRef
            r3.androidKeepAppAlive(r5)
        L24d:
            int r3 = r13._customSkinEnabledBefore
            int r5 = r13._applyCustomSkinEnabledTo
            if (r3 == r5) goto L259
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r13._animationScreenRef
            r1.startNewProject(r10)
            goto L28a
        L259:
            boolean r3 = r13._leftHandModeEnabledBefore
            boolean r5 = r13._applyLeftHandModeEnabledTo
            if (r3 == r5) goto L265
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r13._animationScreenRef
            r1.startNewProject(r0)
            goto L28a
        L265:
            boolean r3 = r13._applyNerdModeEnabledTo
            if (r1 == r3) goto L26f
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r13._animationScreenRef
            r1.startNewProject(r0)
            goto L28a
        L26f:
            boolean r1 = r13._applyRiggerModeEnabledTo
            if (r2 == r1) goto L279
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r13._animationScreenRef
            r1.startNewProject(r0)
            goto L28a
        L279:
            int r1 = r13._applyLeftPaddingTo
            int r2 = r13._leftPaddingBefore
            if (r1 != r2) goto L285
            int r1 = r13._applyRightPaddingTo
            int r2 = r13._rightPaddingBefore
            if (r1 == r2) goto L28a
        L285:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r13._animationScreenRef
            r1.startNewProject(r0)
        L28a:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r13._vibrationAllButtonsEnableButton
            if (r1 == 0) goto L2a3
            boolean r1 = r13._vibrationAllButtonsBefore
            if (r1 != r4) goto L29e
            boolean r1 = r13._vibrationQrtButtonsBefore
            if (r1 != r6) goto L29e
            boolean r1 = r13._vibrationLongPressBefore
            if (r1 != r7) goto L29e
            boolean r1 = r13._vibrationProcessCompletionBefore
            if (r1 == r8) goto L2a3
        L29e:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r13._animationScreenRef
            r1.startNewProject(r0)
        L2a3:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r3) {
            r2 = this;
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r0 = r3.intValue()
            if (r0 != 0) goto Lf9
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r3 = r2._languageList
            int r3 = r3.getSelectedIndex()
            r2._languageIndexAfter = r3
            int r0 = r2._languageIndexBefore
            if (r0 == r3) goto L28
            org.fortheloss.sticknodes.animationscreen.dialogs.LanguageAppResetDialog r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.LanguageAppResetDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r3.<init>(r0)
            r3.initialize(r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r0.addDialogToStage(r3)
            r2.doNotHideDialog()
            goto L10e
        L28:
            int r3 = r2._customSkinEnabledBefore
            int r0 = r2._applyCustomSkinEnabledTo
            if (r3 == r0) goto L42
            org.fortheloss.sticknodes.animationscreen.dialogs.SkinAppResetDialog r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.SkinAppResetDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r3.<init>(r0)
            r3.initialize(r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r0.addDialogToStage(r3)
            r2.doNotHideDialog()
            goto L10e
        L42:
            boolean r3 = r2._leftHandModeEnabledBefore
            boolean r0 = r2._applyLeftHandModeEnabledTo
            if (r3 == r0) goto L5c
            org.fortheloss.sticknodes.animationscreen.dialogs.LeftHandModeResetDialog r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.LeftHandModeResetDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r3.<init>(r0)
            r3.initialize(r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r0.addDialogToStage(r3)
            r2.doNotHideDialog()
            goto L10e
        L5c:
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionDataRef
            boolean r3 = r3.getNerdModeEnabled()
            boolean r0 = r2._applyNerdModeEnabledTo
            if (r3 == r0) goto L7a
            org.fortheloss.sticknodes.animationscreen.dialogs.LeftHandModeResetDialog r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.LeftHandModeResetDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r3.<init>(r0)
            r3.initialize(r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r0.addDialogToStage(r3)
            r2.doNotHideDialog()
            goto L10e
        L7a:
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionDataRef
            boolean r3 = r3.getRiggerModeEnabled()
            boolean r0 = r2._applyRiggerModeEnabledTo
            if (r3 == r0) goto L98
            org.fortheloss.sticknodes.animationscreen.dialogs.LeftHandModeResetDialog r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.LeftHandModeResetDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r3.<init>(r0)
            r3.initialize(r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r0.addDialogToStage(r3)
            r2.doNotHideDialog()
            goto L10e
        L98:
            int r3 = r2._applyLeftPaddingTo
            int r0 = r2._leftPaddingBefore
            if (r3 != r0) goto Le6
            int r3 = r2._applyRightPaddingTo
            int r0 = r2._rightPaddingBefore
            if (r3 == r0) goto La5
            goto Le6
        La5:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r2._vibrationAllButtonsEnableButton
            if (r3 == 0) goto Le2
            boolean r0 = r2._vibrationAllButtonsBefore
            boolean r3 = r3.isChecked()
            if (r0 != r3) goto Lcf
            boolean r3 = r2._vibrationQrtButtonsBefore
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r2._vibrationQrtButtonsEnableButton
            boolean r0 = r0.isChecked()
            if (r3 != r0) goto Lcf
            boolean r3 = r2._vibrationLongPressBefore
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r2._vibrationLongPressEnableButton
            boolean r0 = r0.isChecked()
            if (r3 != r0) goto Lcf
            boolean r3 = r2._vibrationProcessCompletionBefore
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r2._vibrationProcessCompletionEnableButton
            boolean r0 = r0.isChecked()
            if (r3 == r0) goto Le2
        Lcf:
            org.fortheloss.sticknodes.animationscreen.dialogs.LeftHandModeResetDialog r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.LeftHandModeResetDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r3.<init>(r0)
            r3.initialize(r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r0.addDialogToStage(r3)
            r2.doNotHideDialog()
            goto L10e
        Le2:
            r2.applyChanges()
            goto L10e
        Le6:
            org.fortheloss.sticknodes.animationscreen.dialogs.LeftHandModeResetDialog r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.LeftHandModeResetDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r3.<init>(r0)
            r3.initialize(r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r0.addDialogToStage(r3)
            r2.doNotHideDialog()
            goto L10e
        Lf9:
            int r0 = r3.intValue()
            r1 = 2
            if (r0 != r1) goto L104
            r2.showChangelog()
            goto L10e
        L104:
            int r3 = r3.intValue()
            r0 = 3
            if (r3 != r0) goto L10e
            r2.showCredits()
        L10e:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r3 = r2.getDialogScrollPane()
            float r3 = r3.getScrollPercentY()
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog.dialogLastScrollY = r3
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r4 = this;
            r0 = 0
            r4._vibrationAllButtonsEnableButton = r0
            r4._vibrationAllButtonsDisableButton = r0
            r4._vibrationQrtButtonsEnableButton = r0
            r4._vibrationQrtButtonsDisableButton = r0
            r4._vibrationLongPressEnableButton = r0
            r4._vibrationLongPressDisableButton = r0
            r4._vibrationProcessCompletionEnableButton = r0
            r4._vibrationProcessCompletionDisableButton = r0
            r4._canvasModuleRef = r0
            r4._sessionDataRef = r0
            r4._saveMinutesTextfield = r0
            r4._scrollPane = r0
            r4._languageList = r0
            r4.mNewSkinWarningLabelCellRef = r0
            r4.mNewSkinWarningLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4._nodeSkinsTable
            if (r1 == 0) goto L41
            com.badlogic.gdx.utils.Array r1 = r1.getCells()
            int r2 = r1.size
            int r2 = r2 + (-1)
        L2b:
            if (r2 < 0) goto L3f
            java.lang.Object r3 = r1.get(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r3
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            if (r3 == 0) goto L3c
            r3.clear()
        L3c:
            int r2 = r2 + (-1)
            goto L2b
        L3f:
            r4._nodeSkinsTable = r0
        L41:
            super.dispose()
            return
    }

    public void initialize() {
            r57 = this;
            r0 = r57
            java.lang.String r1 = "appSettingsTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            super.initialize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r57.getTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.defaults()
            r1.fillX()
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.String r2 = org.fortheloss.sticknodes.App.preferencesString
            com.badlogic.gdx.Preferences r1 = r1.getPreferences(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "4.2.5 (100)"
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = r57.getOS()
            r7 = 1
            r4[r7] = r5
            org.fortheloss.framework.IPlatform r5 = org.fortheloss.sticknodes.App.platform
            java.lang.String r5 = r5.getOSVersion()
            java.lang.String r8 = "os.arch"
            java.lang.String r8 = java.lang.System.getProperty(r8)
            boolean r9 = org.fortheloss.sticknodes.App.isParroted
            java.lang.String r10 = ""
            if (r9 == 0) goto L44
            java.lang.String r9 = "..."
            goto L45
        L44:
            r9 = r10
        L45:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r5)
            java.lang.String r5 = " "
            r11.append(r5)
            r11.append(r8)
            r11.append(r9)
            java.lang.String r5 = r11.toString()
            r8 = 2
            r4[r8] = r5
            java.lang.String r5 = "appSettingsInfo"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r5, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r4, r5)
            r2.setWrap(r7)
            r2.setAlignment(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.addContent(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r8)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r4 = (float) r4
            r2.width(r4)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r5 = "count"
            int r5 = r1.getInteger(r5, r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r6] = r5
            java.lang.String r5 = "openCount"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r5, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r4, r5)
            r2.setWrap(r7)
            r2.setAlignment(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.addContent(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r8)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r4 = (float) r4
            r2.width(r4)
            r57.addContentRow()
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            long r4 = r2.getFreeStorageSpace()
            r11 = 0
            java.lang.String r2 = "remainingStorageSpace"
            int r9 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r9 < 0) goto L10f
            r11 = 1024(0x400, double:5.06E-321)
            long r4 = r4 / r11
            long r4 = r4 / r11
            int r9 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r9 <= 0) goto Le8
            long r4 = r4 / r11
            java.lang.String r9 = "gb"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r4)
            r11.append(r9)
            java.lang.String r4 = r11.toString()
            goto Lfd
        Le8:
            java.lang.String r9 = "mb"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r4)
            r11.append(r9)
            java.lang.String r4 = r11.toString()
        Lfd:
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r9[r6] = r4
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r5.<init>(r2, r4)
            goto L122
        L10f:
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r9 = "?"
            r4[r6] = r9
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r5.<init>(r2, r4)
        L122:
            r5.setWrap(r7)
            r5.setAlignment(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.addContent(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r8)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r4 = (float) r4
            r2.width(r4)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = org.fortheloss.sticknodes.App.uuid
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "ID: "
            r5.append(r9)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r4, r5)
            r2.setWrap(r7)
            r2.setAlignment(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.addContent(r2)
            r2.colspan(r8)
            r57.addContentRow()
            java.lang.String r2 = "copy"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = " ID"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getShortLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r4, r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$1 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$1
            r5.<init>(r0, r4)
            r4.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.addContent(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.colspan(r8)
            float r4 = r4.getWidth()
            r9 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 * r9
            r5.width(r4)
            r57.addContentRow()
            com.badlogic.gdx.Application r4 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r4 = r4.getType()
            com.badlogic.gdx.Application$ApplicationType r5 = com.badlogic.gdx.Application.ApplicationType.iOS
            if (r4 == r5) goto L1e7
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = " logcat"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getShortLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r2, r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$2 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$2
            r4.<init>(r0, r2)
            r2.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.addContent(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.colspan(r8)
            float r2 = r2.getWidth()
            float r2 = r2 * r9
            r4.width(r2)
            r57.addContentRow()
        L1e7:
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r10, r4)
            r2.setWrap(r7)
            r2.setAlignment(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.addContent(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.colspan(r8)
            int r11 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r11 = (float) r11
            r4.width(r11)
            r57.addContentRow()
            com.badlogic.gdx.Application r4 = com.badlogic.gdx.Gdx.app
            long r11 = r4.getJavaHeap()
            r13 = 1048576(0x100000, double:5.180654E-318)
            long r11 = r11 / r13
            float r4 = (float) r11
            com.badlogic.gdx.Application r11 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r11 = r11.getType()
            if (r11 != r5) goto L23f
            java.lang.String r11 = "appSettingsInfo2IOS"
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r11)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r11 = "\n\n"
            r12.append(r11)
            r12.append(r4)
            java.lang.String r4 = "MB"
            r12.append(r4)
            java.lang.String r4 = r12.toString()
            r2.setText(r4)
            goto L275
        L23f:
            java.lang.Runtime r11 = java.lang.Runtime.getRuntime()
            long r11 = r11.maxMemory()
            r13 = 1048576(0x100000, double:5.180654E-318)
            long r11 = r11 / r13
            java.lang.String r13 = "appSettingsInfo2Android"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r13)
            java.lang.String r13 = "\n\n"
            r14.append(r13)
            r14.append(r4)
            java.lang.String r4 = "MB / "
            r14.append(r4)
            r14.append(r11)
            java.lang.String r4 = "MB"
            r14.append(r4)
            java.lang.String r4 = r14.toString()
            r2.setText(r4)
        L275:
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "enableDisableTitle"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r11 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r2.<init>(r4, r11)
            r2.setWrap(r7)
            r2.setAlignment(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.addContent(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r8)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r4 = (float) r4
            r2.width(r4)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "appSettingsUnlimitedNodes"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r11 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r4, r11)
            r2.setWrap(r7)
            r2.setAlignment(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.addContent(r2)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r4 = (float) r4
            float r4 = r4 * r9
            r2.width(r4)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r2 = new com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup
            r2.<init>()
            r4 = 0
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r11 = r2.pad(r4)
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            r13 = 1109393408(0x42200000, float:40.0)
            float r12 = r12 * r13
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r11 = r11.space(r12)
            r11.align(r7)
            r0.addContent(r2)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r11 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r11.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r12 = r11.pad(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r12 = r12.space(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r12 = r12.align(r7)
            r12.fill()
            r2.addActor(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label r12 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r14 = "enabled"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r12.<init>(r15, r3)
            r12.setWrap(r6)
            r12.setAlignment(r7)
            r11.addActor(r12)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$3 r12 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$3
            r12.<init>(r0)
            r3.addListener(r12)
            r11.addActor(r3)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r11 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r11.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r12 = r11.pad(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r12 = r12.space(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r12 = r12.align(r7)
            r12.fill()
            r2.addActor(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r12 = "disabled"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r15, r13)
            r2.setWrap(r6)
            r2.setAlignment(r7)
            r11.addActor(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$4 r13 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$4
            r13.<init>(r0)
            r2.addListener(r13)
            r11.addActor(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r11 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r11.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r13 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r8]
            r13[r6] = r3
            r13[r7] = r2
            r11.add(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r11 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r13 = "axisLockingInfo"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r11.<init>(r13, r15)
            r11.setWrap(r7)
            r11.setAlignment(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r0.addContent(r11)
            int r13 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r13 = (float) r13
            float r13 = r13 * r9
            r11.width(r13)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r11 = new com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup
            r11.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r13 = r11.pad(r4)
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            r16 = 1109393408(0x42200000, float:40.0)
            float r15 = r15 * r16
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r13 = r13.space(r15)
            r13.align(r7)
            r0.addContent(r11)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r13 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r13.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r13.pad(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.space(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.align(r7)
            r15.fill()
            r11.addActor(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r15 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r15.<init>(r9, r8)
            r15.setWrap(r6)
            r15.setAlignment(r7)
            r13.addActor(r15)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r8)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$5 r9 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$5
            r9.<init>(r0)
            r8.addListener(r9)
            r13.addActor(r8)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r9.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r13 = r9.pad(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r13 = r13.space(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r13 = r13.align(r7)
            r13.fill()
            r11.addActor(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label r11 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r11.<init>(r13, r15)
            r11.setWrap(r6)
            r11.setAlignment(r7)
            r9.addActor(r11)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r11 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r11 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r11)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$6 r13 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$6
            r13.<init>(r0)
            r11.addListener(r13)
            r9.addActor(r11)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r9.<init>()
            r13 = 2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r15 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r13]
            r15[r6] = r8
            r15[r7] = r11
            r9.add(r15)
            org.fortheloss.framework.SizeWidget r9 = new org.fortheloss.framework.SizeWidget
            r13 = 1092616192(0x41200000, float:10.0)
            r15 = 1092616192(0x41200000, float:10.0)
            r9.<init>(r13, r15)
            r0.addContent(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r13 = "newSkinWarning424"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r9.<init>(r13, r15)
            r0.mNewSkinWarningLabel = r9
            r9.setWrap(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = r0.mNewSkinWarningLabel
            r9.setAlignment(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = r0.mNewSkinWarningLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r0.addContent(r9)
            r0.mNewSkinWarningLabelCellRef = r9
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.Object[] r13 = new java.lang.Object[r7]
            java.lang.String r15 = "http://sticknodes.com/go/skins"
            r13[r6] = r15
            java.lang.String r15 = "skinSetting"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r15, r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r9.<init>(r13, r15)
            r9.setWrap(r7)
            r9.setAlignment(r7)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$7 r13 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$7
            r13.<init>(r0)
            r9.addListener(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r0.addContent(r9)
            int r13 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r13 = (float) r13
            r15 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 * r15
            r9.width(r13)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup
            r9.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r13 = r9.pad(r4)
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            r16 = 1109393408(0x42200000, float:40.0)
            float r15 = r15 * r16
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r13 = r13.space(r15)
            r13.align(r7)
            r0.addContent(r9)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r13 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r13.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r13.pad(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.space(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.align(r7)
            r15.fill()
            r9.addActor(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r15 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r19 = "default"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r19)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r15.<init>(r4, r7)
            r15.setWrap(r6)
            r4 = 1
            r15.setAlignment(r4)
            r13.addActor(r15)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$8 r7 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$8
            r7.<init>(r0)
            r4.addListener(r7)
            r13.addActor(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r7.<init>()
            r13 = 0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r7.pad(r13)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.space(r13)
            r13 = 1
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.align(r13)
            r15.fill()
            r9.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label r15 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r19 = "dark"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r19)
            r20 = r10
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r15.<init>(r13, r10)
            r15.setWrap(r6)
            r10 = 1
            r15.setAlignment(r10)
            r7.addActor(r15)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r10)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$9 r13 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$9
            r13.<init>(r0)
            r10.addListener(r13)
            r7.addActor(r10)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r7.<init>()
            r13 = 0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r7.pad(r13)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.space(r13)
            r13 = 1
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.align(r13)
            r15.fill()
            r9.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = "custom"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r9.<init>(r15, r13)
            r9.setWrap(r6)
            r13 = 1
            r9.setAlignment(r13)
            r7.addActor(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r9)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$10 r13 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$10
            r13.<init>(r0)
            r9.addListener(r13)
            r7.addActor(r9)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r7 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r7.<init>()
            r13 = 3
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r15 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r13]
            r15[r6] = r4
            r13 = 1
            r15[r13] = r10
            r18 = 2
            r15[r18] = r9
            r7.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = "useLeftHandModeSetting"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r7.<init>(r15, r6)
            r7.setWrap(r13)
            r7.setAlignment(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r0.addContent(r7)
            int r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r7 = (float) r7
            r13 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 * r13
            r6.width(r7)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r6 = new com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup
            r6.<init>()
            r7 = 0
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r13 = r6.pad(r7)
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            r16 = 1109393408(0x42200000, float:40.0)
            float r15 = r15 * r16
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r13 = r13.space(r15)
            r15 = 1
            r13.align(r15)
            r0.addContent(r6)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r13 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r13.<init>()
            r21 = r9
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r9 = r13.pad(r7)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r9 = r9.space(r7)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = r9.align(r15)
            r7.fill()
            r6.addActor(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r7.<init>(r9, r15)
            r9 = 0
            r7.setWrap(r9)
            r9 = 1
            r7.setAlignment(r9)
            r13.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r7)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$11 r9 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$11
            r9.<init>(r0)
            r7.addListener(r9)
            r13.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r9.<init>()
            r13 = 0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r9.pad(r13)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.space(r13)
            r13 = 1
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.align(r13)
            r15.fill()
            r6.addActor(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r6.<init>(r15, r13)
            r13 = 0
            r6.setWrap(r13)
            r13 = 1
            r6.setAlignment(r13)
            r9.addActor(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r6)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$12 r13 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$12
            r13.<init>(r0)
            r6.addListener(r13)
            r9.addActor(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r9.<init>()
            r13 = 2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r15 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r13]
            r13 = 0
            r15[r13] = r7
            r13 = 1
            r15[r13] = r6
            r9.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = "automaticStickfigureBackup"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            r22 = r6
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r9.<init>(r15, r6)
            r9.setWrap(r13)
            r9.setAlignment(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r0.addContent(r9)
            int r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r9 = (float) r9
            r13 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 * r13
            r6.width(r9)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r6 = new com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup
            r6.<init>()
            r9 = 0
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r13 = r6.pad(r9)
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            r16 = 1109393408(0x42200000, float:40.0)
            float r15 = r15 * r16
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r13 = r13.space(r15)
            r15 = 1
            r13.align(r15)
            r0.addContent(r6)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r13 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r13.<init>()
            r23 = r7
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = r13.pad(r9)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = r7.space(r9)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = r7.align(r15)
            r7.fill()
            r6.addActor(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r7.<init>(r9, r15)
            r9 = 0
            r7.setWrap(r9)
            r9 = 1
            r7.setAlignment(r9)
            r13.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r7)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$13 r9 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$13
            r9.<init>(r0)
            r7.addListener(r9)
            r13.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r9.<init>()
            r13 = 0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r9.pad(r13)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.space(r13)
            r13 = 1
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.align(r13)
            r15.fill()
            r6.addActor(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r6.<init>(r15, r13)
            r13 = 0
            r6.setWrap(r13)
            r13 = 1
            r6.setAlignment(r13)
            r9.addActor(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r6)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$14 r13 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$14
            r13.<init>(r0)
            r6.addListener(r13)
            r9.addActor(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r9.<init>()
            r13 = 2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r15 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r13]
            r13 = 0
            r15[r13] = r7
            r13 = 1
            r15[r13] = r6
            r9.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = "showPlusMinusButtons"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            r24 = r6
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r9.<init>(r15, r6)
            r9.setWrap(r13)
            r9.setAlignment(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r0.addContent(r9)
            int r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r9 = (float) r9
            r13 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 * r13
            r6.width(r9)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r6 = new com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup
            r6.<init>()
            r9 = 0
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r13 = r6.pad(r9)
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            r16 = 1109393408(0x42200000, float:40.0)
            float r15 = r15 * r16
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r13 = r13.space(r15)
            r15 = 1
            r13.align(r15)
            r0.addContent(r6)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r13 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r13.<init>()
            r25 = r7
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = r13.pad(r9)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = r7.space(r9)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = r7.align(r15)
            r7.fill()
            r6.addActor(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r7.<init>(r9, r15)
            r9 = 0
            r7.setWrap(r9)
            r9 = 1
            r7.setAlignment(r9)
            r13.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r7)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$15 r9 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$15
            r9.<init>(r0)
            r7.addListener(r9)
            r13.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r9.<init>()
            r13 = 0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r9.pad(r13)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.space(r13)
            r13 = 1
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.align(r13)
            r15.fill()
            r6.addActor(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r6.<init>(r15, r13)
            r13 = 0
            r6.setWrap(r13)
            r13 = 1
            r6.setAlignment(r13)
            r9.addActor(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r6)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$16 r13 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$16
            r13.<init>(r0)
            r6.addListener(r13)
            r9.addActor(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r9.<init>()
            r13 = 2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r15 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r13]
            r13 = 0
            r15[r13] = r7
            r13 = 1
            r15[r13] = r6
            r9.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = "movieclipDoubleTapSetting"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            r26 = r6
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r9.<init>(r15, r6)
            r9.setWrap(r13)
            r9.setAlignment(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r0.addContent(r9)
            int r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r9 = (float) r9
            r13 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 * r13
            r6.width(r9)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r6 = new com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup
            r6.<init>()
            r9 = 0
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r13 = r6.pad(r9)
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            r16 = 1109393408(0x42200000, float:40.0)
            float r15 = r15 * r16
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r13 = r13.space(r15)
            r15 = 1
            r13.align(r15)
            r0.addContent(r6)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r13 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r13.<init>()
            r27 = r7
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = r13.pad(r9)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = r7.space(r9)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = r7.align(r15)
            r7.fill()
            r6.addActor(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r7.<init>(r9, r15)
            r9 = 0
            r7.setWrap(r9)
            r9 = 1
            r7.setAlignment(r9)
            r13.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r7)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$17 r9 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$17
            r9.<init>(r0)
            r7.addListener(r9)
            r13.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r9.<init>()
            r13 = 0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r9.pad(r13)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.space(r13)
            r13 = 1
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.align(r13)
            r15.fill()
            r6.addActor(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r6.<init>(r15, r13)
            r13 = 0
            r6.setWrap(r13)
            r13 = 1
            r6.setAlignment(r13)
            r9.addActor(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r6)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$18 r13 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$18
            r13.<init>(r0)
            r6.addListener(r13)
            r9.addActor(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r9.<init>()
            r13 = 2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r15 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r13]
            r13 = 0
            r15[r13] = r7
            r13 = 1
            r15[r13] = r6
            r9.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = "noneDoubleTapSetting"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            r28 = r6
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r9.<init>(r15, r6)
            r9.setWrap(r13)
            r9.setAlignment(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r0.addContent(r9)
            int r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r9 = (float) r9
            r13 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 * r13
            r6.width(r9)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r6 = new com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup
            r6.<init>()
            r9 = 0
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r13 = r6.pad(r9)
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            r16 = 1109393408(0x42200000, float:40.0)
            float r15 = r15 * r16
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r13 = r13.space(r15)
            r15 = 1
            r13.align(r15)
            r0.addContent(r6)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r13 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r13.<init>()
            r29 = r7
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = r13.pad(r9)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = r7.space(r9)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = r7.align(r15)
            r7.fill()
            r6.addActor(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r7.<init>(r9, r15)
            r9 = 0
            r7.setWrap(r9)
            r9 = 1
            r7.setAlignment(r9)
            r13.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r7)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$19 r9 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$19
            r9.<init>(r0)
            r7.addListener(r9)
            r13.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r9.<init>()
            r13 = 0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r9.pad(r13)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.space(r13)
            r13 = 1
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.align(r13)
            r15.fill()
            r6.addActor(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r6.<init>(r15, r13)
            r13 = 0
            r6.setWrap(r13)
            r13 = 1
            r6.setAlignment(r13)
            r9.addActor(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r6)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$20 r13 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$20
            r13.<init>(r0)
            r6.addListener(r13)
            r9.addActor(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r9.<init>()
            r13 = 2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r15 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r13]
            r13 = 0
            r15[r13] = r7
            r13 = 1
            r15[r13] = r6
            r9.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = "preserveSelectionWhenChangingFrames"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            r30 = r6
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r9.<init>(r15, r6)
            r9.setWrap(r13)
            r9.setAlignment(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r0.addContent(r9)
            int r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r9 = (float) r9
            r13 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 * r13
            r6.width(r9)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r6 = new com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup
            r6.<init>()
            r9 = 0
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r13 = r6.pad(r9)
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            r16 = 1109393408(0x42200000, float:40.0)
            float r15 = r15 * r16
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r13 = r13.space(r15)
            r15 = 1
            r13.align(r15)
            r0.addContent(r6)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r13 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r13.<init>()
            r31 = r7
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = r13.pad(r9)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = r7.space(r9)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = r7.align(r15)
            r7.fill()
            r6.addActor(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r7.<init>(r9, r15)
            r9 = 0
            r7.setWrap(r9)
            r9 = 1
            r7.setAlignment(r9)
            r13.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r7)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$21 r9 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$21
            r9.<init>(r0)
            r7.addListener(r9)
            r13.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r9.<init>()
            r13 = 0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r9.pad(r13)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.space(r13)
            r13 = 1
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.align(r13)
            r15.fill()
            r6.addActor(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r6.<init>(r15, r13)
            r13 = 0
            r6.setWrap(r13)
            r13 = 1
            r6.setAlignment(r13)
            r9.addActor(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r6)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$22 r13 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$22
            r13.<init>(r0)
            r6.addListener(r13)
            r9.addActor(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r9.<init>()
            r13 = 2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r15 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r13]
            r13 = 0
            r15[r13] = r7
            r13 = 1
            r15[r13] = r6
            r9.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = "nerdModeDescription"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            r32 = r6
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r9.<init>(r15, r6)
            r9.setWrap(r13)
            r9.setAlignment(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r0.addContent(r9)
            int r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r9 = (float) r9
            r13 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 * r13
            r6.width(r9)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r6 = new com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup
            r6.<init>()
            r9 = 0
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r13 = r6.pad(r9)
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            r16 = 1109393408(0x42200000, float:40.0)
            float r15 = r15 * r16
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r13 = r13.space(r15)
            r15 = 1
            r13.align(r15)
            r0.addContent(r6)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r13 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r13.<init>()
            r33 = r7
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = r13.pad(r9)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = r7.space(r9)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = r7.align(r15)
            r7.fill()
            r6.addActor(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r7.<init>(r9, r15)
            r9 = 0
            r7.setWrap(r9)
            r9 = 1
            r7.setAlignment(r9)
            r13.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r7)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$23 r9 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$23
            r9.<init>(r0)
            r7.addListener(r9)
            r13.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r9.<init>()
            r13 = 0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r9.pad(r13)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.space(r13)
            r13 = 1
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.align(r13)
            r15.fill()
            r6.addActor(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r6.<init>(r15, r13)
            r13 = 0
            r6.setWrap(r13)
            r13 = 1
            r6.setAlignment(r13)
            r9.addActor(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r6)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$24 r13 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$24
            r13.<init>(r0)
            r6.addListener(r13)
            r9.addActor(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r9.<init>()
            r13 = 2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r15 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r13]
            r13 = 0
            r15[r13] = r7
            r13 = 1
            r15[r13] = r6
            r9.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = "riggerModeDescription"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            r34 = r6
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r9.<init>(r15, r6)
            r9.setWrap(r13)
            r9.setAlignment(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r0.addContent(r9)
            int r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r9 = (float) r9
            r13 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 * r13
            r6.width(r9)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r6 = new com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup
            r6.<init>()
            r9 = 0
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r13 = r6.pad(r9)
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            r16 = 1109393408(0x42200000, float:40.0)
            float r15 = r15 * r16
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r13 = r13.space(r15)
            r15 = 1
            r13.align(r15)
            r0.addContent(r6)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r13 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r13.<init>()
            r35 = r7
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = r13.pad(r9)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = r7.space(r9)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = r7.align(r15)
            r7.fill()
            r6.addActor(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r7.<init>(r9, r15)
            r9 = 0
            r7.setWrap(r9)
            r9 = 1
            r7.setAlignment(r9)
            r13.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r7)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$25 r9 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$25
            r9.<init>(r0)
            r7.addListener(r9)
            r13.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r9.<init>()
            r13 = 0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r9.pad(r13)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.space(r13)
            r13 = 1
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.align(r13)
            r15.fill()
            r6.addActor(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r6.<init>(r15, r13)
            r13 = 0
            r6.setWrap(r13)
            r13 = 1
            r6.setAlignment(r13)
            r9.addActor(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r6)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$26 r13 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$26
            r13.<init>(r0)
            r6.addListener(r13)
            r9.addActor(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r9.<init>()
            r13 = 2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r15 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r13]
            r13 = 0
            r15[r13] = r7
            r13 = 1
            r15[r13] = r6
            r9.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = "persistentFiguresDescription"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            r36 = r6
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r9.<init>(r15, r6)
            r9.setWrap(r13)
            r9.setAlignment(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r0.addContent(r9)
            int r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r9 = (float) r9
            r13 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 * r13
            r6.width(r9)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r6 = new com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup
            r6.<init>()
            r9 = 0
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r13 = r6.pad(r9)
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            r16 = 1109393408(0x42200000, float:40.0)
            float r15 = r15 * r16
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r13 = r13.space(r15)
            r15 = 1
            r13.align(r15)
            r0.addContent(r6)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r13 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r13.<init>()
            r37 = r7
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = r13.pad(r9)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = r7.space(r9)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r7 = r7.align(r15)
            r7.fill()
            r6.addActor(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r7.<init>(r9, r15)
            r9 = 0
            r7.setWrap(r9)
            r9 = 1
            r7.setAlignment(r9)
            r13.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r7)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$27 r9 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$27
            r9.<init>(r0)
            r7.addListener(r9)
            r13.addActor(r7)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r9.<init>()
            r13 = 0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r9.pad(r13)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.space(r13)
            r13 = 1
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.align(r13)
            r15.fill()
            r6.addActor(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r6.<init>(r15, r13)
            r13 = 0
            r6.setWrap(r13)
            r13 = 1
            r6.setAlignment(r13)
            r9.addActor(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r6)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$28 r13 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$28
            r13.<init>(r0)
            r6.addListener(r13)
            r9.addActor(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r9.<init>()
            r13 = 2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r15 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r13]
            r13 = 0
            r15[r13] = r7
            r13 = 1
            r15[r13] = r6
            r9.add(r15)
            com.badlogic.gdx.Application r9 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r9 = r9.getType()
            if (r9 == r5) goto Le50
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r9 = "androidKeepAppAliveDescription"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r5.<init>(r9, r15)
            r5.setWrap(r13)
            r5.setAlignment(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.addContent(r5)
            int r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r9 = (float) r9
            r13 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 * r13
            r5.width(r9)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r5 = new com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup
            r5.<init>()
            r9 = 0
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r13 = r5.pad(r9)
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            r16 = 1109393408(0x42200000, float:40.0)
            float r15 = r15 * r16
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r13 = r13.space(r15)
            r15 = 1
            r13.align(r15)
            r0.addContent(r5)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r13 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r13.<init>()
            r38 = r6
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r6 = r13.pad(r9)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r6 = r6.space(r9)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r6 = r6.align(r15)
            r6.fill()
            r5.addActor(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r6.<init>(r9, r15)
            r9 = 0
            r6.setWrap(r9)
            r9 = 1
            r6.setAlignment(r9)
            r13.addActor(r6)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r6)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$29 r9 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$29
            r9.<init>(r0)
            r6.addListener(r9)
            r13.addActor(r6)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r9.<init>()
            r13 = 0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r9.pad(r13)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.space(r13)
            r13 = 1
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.align(r13)
            r15.fill()
            r5.addActor(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r5.<init>(r15, r13)
            r13 = 0
            r5.setWrap(r13)
            r13 = 1
            r5.setAlignment(r13)
            r9.addActor(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$30 r13 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$30
            r13.<init>(r0)
            r5.addListener(r13)
            r9.addActor(r5)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r9.<init>()
            r13 = 2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r15 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r13]
            r13 = 0
            r15[r13] = r6
            r13 = 1
            r15[r13] = r5
            r9.add(r15)
            goto Le54
        Le50:
            r38 = r6
            r5 = 0
            r6 = 0
        Le54:
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = "nodeStyleTitle"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            r39 = r5
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r9.<init>(r15, r5)
            r9.setWrap(r13)
            r9.setAlignment(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.addContent(r9)
            r9 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.colspan(r9)
            int r13 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r13 = (float) r13
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.width(r13)
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            r15 = 1109393408(0x42200000, float:40.0)
            float r13 = r13 * r15
            r5.padTop(r13)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r0._nodeSkinsTable = r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.addContent(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.colspan(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.expandX()
            r5.fillX()
            r57.addContentRow()
            java.lang.String[] r5 = org.fortheloss.sticknodes.animationscreen.NodeDrawTools.TEXTURE_FILES
            java.lang.String[] r9 = org.fortheloss.sticknodes.animationscreen.NodeDrawTools.TEXTURE_NAMES
            r13 = 0
        Lea6:
            int r15 = r9.length
            if (r13 >= r15) goto Led7
            com.badlogic.gdx.scenes.scene2d.ui.Label r15 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            r40 = r6
            r6 = r9[r13]
            r41 = r9
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r15.<init>(r6, r9)
            r6 = 1
            r15.setWrap(r6)
            r15.setAlignment(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r0._nodeSkinsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.add(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.fillX()
            r9.align(r6)
            int r13 = r13 + 1
            r6 = r40
            r9 = r41
            goto Lea6
        Led7:
            r40 = r6
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r0._nodeSkinsTable
            r6.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = r6.checkboxOn
            float r6 = r6.getMinWidth()
            r9 = 1077936128(0x40400000, float:3.0)
            float r6 = r6 * r9
            int r6 = (int) r6
            r9 = 0
        Leee:
            int r13 = r5.length
            if (r9 >= r13) goto Lf3d
            com.badlogic.gdx.scenes.scene2d.ui.Image r13 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.Texture r15 = new com.badlogic.gdx.graphics.Texture
            r41 = r7
            com.badlogic.gdx.Files r7 = com.badlogic.gdx.Gdx.files
            r42 = r10
            r10 = r5[r9]
            r43 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r44 = r11
            java.lang.String r11 = "node_styles/covers/"
            r4.append(r11)
            r4.append(r10)
            java.lang.String r10 = ".png"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            com.badlogic.gdx.files.FileHandle r4 = r7.internal(r4)
            r15.<init>(r4)
            r13.<init>(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._nodeSkinsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.add(r13)
            float r7 = (float) r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.width(r7)
            r10 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r10
            r4.height(r7)
            int r9 = r9 + 1
            r7 = r41
            r10 = r42
            r4 = r43
            r11 = r44
            goto Leee
        Lf3d:
            r43 = r4
            r41 = r7
            r42 = r10
            r44 = r11
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._nodeSkinsTable
            r4.row()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r0._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.NodeDrawTools r4 = r4.getNodeDrawTools()
            int r6 = r4.getType()
            r0._applyNodeSkinTo = r6
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r6 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r6.<init>()
            r7 = 0
        Lf5c:
            int r9 = r5.length
            if (r7 >= r9) goto Lf90
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r9.setUserObject(r10)
            r6.add(r9)
            int r10 = r4.getType()
            if (r7 != r10) goto Lf7c
            r10 = 1
            r9.setChecked(r10)
            goto Lf80
        Lf7c:
            r10 = 0
            r9.setChecked(r10)
        Lf80:
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$31 r10 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$31
            r10.<init>(r0, r9)
            r9.addListener(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r0._nodeSkinsTable
            r10.add(r9)
            int r7 = r7 + 1
            goto Lf5c
        Lf90:
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r5 = "sensitivityTitle"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r4.<init>(r5, r6)
            r5 = 1
            r4.setWrap(r5)
            r4.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.addContent(r4)
            r5 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.colspan(r5)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r5 = (float) r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.width(r5)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r6 = 1109393408(0x42200000, float:40.0)
            float r5 = r5 * r6
            r4.padTop(r5)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r5 = "nodePrecision"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r5, r6)
            r5 = 1
            r4.setWrap(r5)
            r4.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.addContent(r4)
            r5 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.colspan(r5)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r5 = (float) r5
            r4.width(r5)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r4.<init>()
            r5 = 0
            r4.pad(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r4.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.pad(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.space(r5)
            r5 = 1
            r6.align(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r0.addContent(r4)
            r7 = 2
            r6.colspan(r7)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r7 = "low"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r6.<init>(r9, r10)
            r6.setWrap(r5)
            r6.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.add(r6)
            int r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r6 = (float) r6
            r9 = 1048576000(0x3e800000, float:0.25)
            float r6 = r6 * r9
            r5.width(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r5 = new com.badlogic.gdx.scenes.scene2d.ui.Slider
            r46 = 1056964608(0x3f000000, float:0.5)
            r47 = 1069547520(0x3fc00000, float:1.5)
            r48 = 1036831949(0x3dcccccd, float:0.1)
            r49 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle r50 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsSliderStyle()
            r45 = r5
            r45.<init>(r46, r47, r48, r49, r50)
            r6 = 1065353216(0x3f800000, float:1.0)
            r5.setValue(r6)
            org.fortheloss.framework.CustomStopListener r10 = new org.fortheloss.framework.CustomStopListener
            r10.<init>()
            r5.addListener(r10)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$32 r10 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$32
            r10.<init>(r0, r5)
            r5.addListener(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r4.add(r5)
            int r11 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r11 = (float) r11
            r13 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 * r13
            r10.width(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label r10 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r11 = "high"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r10.<init>(r13, r15)
            r13 = 1
            r10.setWrap(r13)
            r10.setAlignment(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.add(r10)
            int r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r10 = (float) r10
            float r10 = r10 * r9
            r4.width(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r10 = "axisPrecision"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r10, r15)
            r4.setWrap(r13)
            r4.setAlignment(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.addContent(r4)
            r10 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.colspan(r10)
            int r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r10 = (float) r10
            r4.width(r10)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r4.<init>()
            r10 = 0
            r4.pad(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r4.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.pad(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.space(r10)
            r10 = 1
            r13.align(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r0.addContent(r4)
            r15 = 2
            r13.colspan(r15)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r13.<init>(r15, r6)
            r13.setWrap(r10)
            r13.setAlignment(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r4.add(r13)
            int r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r10 = (float) r10
            float r10 = r10 * r9
            r6.width(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r6 = new com.badlogic.gdx.scenes.scene2d.ui.Slider
            r47 = 1056964608(0x3f000000, float:0.5)
            r48 = 1069547520(0x3fc00000, float:1.5)
            r49 = 1036831949(0x3dcccccd, float:0.1)
            r50 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle r51 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsSliderStyle()
            r46 = r6
            r46.<init>(r47, r48, r49, r50, r51)
            r10 = 1065353216(0x3f800000, float:1.0)
            r6.setValue(r10)
            org.fortheloss.framework.CustomStopListener r10 = new org.fortheloss.framework.CustomStopListener
            r10.<init>()
            r6.addListener(r10)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$33 r10 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$33
            r10.<init>(r0, r6)
            r6.addListener(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r4.add(r6)
            int r13 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r13 = (float) r13
            r15 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 * r15
            r10.width(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r10 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r10.<init>(r13, r15)
            r13 = 1
            r10.setWrap(r13)
            r10.setAlignment(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.add(r10)
            int r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r10 = (float) r10
            float r10 = r10 * r9
            r4.width(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r10 = "lineWidth"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r4.<init>(r10, r15)
            r4.setWrap(r13)
            r4.setAlignment(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.addContent(r4)
            r10 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.colspan(r10)
            int r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r10 = (float) r10
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.width(r10)
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            r13 = 1109393408(0x42200000, float:40.0)
            float r10 = r10 * r13
            r4.padTop(r10)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r10 = "lineWidthInfo"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r10, r13)
            r10 = 1
            r4.setWrap(r10)
            r4.setAlignment(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.addContent(r4)
            r10 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.colspan(r10)
            int r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r10 = (float) r10
            r4.width(r10)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r4.<init>()
            r10 = 0
            r4.pad(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r4.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.pad(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.space(r10)
            r10 = 1
            r13.align(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r0.addContent(r4)
            r15 = 2
            r13.colspan(r15)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = "thin"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r13.<init>(r15, r9)
            r13.setWrap(r10)
            r13.setAlignment(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r4.add(r13)
            int r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r10 = (float) r10
            r13 = 1048576000(0x3e800000, float:0.25)
            float r10 = r10 * r13
            r9.width(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r9 = new com.badlogic.gdx.scenes.scene2d.ui.Slider
            r48 = 1065353216(0x3f800000, float:1.0)
            r49 = 1084227584(0x40a00000, float:5.0)
            r50 = 1065353216(0x3f800000, float:1.0)
            r51 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle r52 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsSliderStyle()
            r47 = r9
            r47.<init>(r48, r49, r50, r51, r52)
            r10 = 1065353216(0x3f800000, float:1.0)
            r9.setValue(r10)
            org.fortheloss.framework.CustomStopListener r10 = new org.fortheloss.framework.CustomStopListener
            r10.<init>()
            r9.addListener(r10)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$34 r10 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$34
            r10.<init>(r0, r9)
            r9.addListener(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r4.add(r9)
            int r13 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r13 = (float) r13
            r15 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 * r15
            r10.width(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r10 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r13 = "thick"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r10.<init>(r13, r15)
            r13 = 1
            r10.setWrap(r13)
            r10.setAlignment(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.add(r10)
            int r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r10 = (float) r10
            r15 = 1048576000(0x3e800000, float:0.25)
            float r10 = r10 * r15
            r4.width(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r10 = "setTouchPrecision"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r4.<init>(r10, r15)
            r4.setWrap(r13)
            r4.setAlignment(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.addContent(r4)
            r10 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.colspan(r10)
            int r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r10 = (float) r10
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.width(r10)
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            r13 = 1109393408(0x42200000, float:40.0)
            float r10 = r10 * r13
            r4.padTop(r10)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r10 = "appSettingsTouchPrecision"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r10, r13)
            r10 = 1
            r4.setWrap(r10)
            r4.setAlignment(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.addContent(r4)
            r10 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.colspan(r10)
            int r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r10 = (float) r10
            r4.width(r10)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r10 = "approximateTouches"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r10, r13)
            r10 = 1
            r4.setWrap(r10)
            r4.setAlignment(r10)
            r0.addContent(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r13 = "preciseTouches"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r13, r15)
            r4.setWrap(r10)
            r4.setAlignment(r10)
            r0.addContent(r4)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$35 r10 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$35
            r10.<init>(r0)
            r4.addListener(r10)
            r0.addContent(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r10)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$36 r13 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$36
            r13.<init>(r0)
            r10.addListener(r13)
            r0.addContent(r10)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r13 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r13.<init>()
            r45 = r9
            r15 = 2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r9 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r15]
            r15 = 0
            r9[r15] = r4
            r15 = 1
            r9[r15] = r10
            r13.add(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r13 = "setScreenPadding"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            r47 = r10
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r9.<init>(r13, r10)
            r9.setWrap(r15)
            r9.setAlignment(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r0.addContent(r9)
            r10 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.colspan(r10)
            int r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r10 = (float) r10
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.width(r10)
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            r13 = 1109393408(0x42200000, float:40.0)
            float r10 = r10 * r13
            r9.padTop(r10)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r10 = "screenPaddingInfo"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r9.<init>(r10, r13)
            r10 = 1
            r9.setWrap(r10)
            r9.setAlignment(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r0.addContent(r9)
            r10 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.colspan(r10)
            int r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r10 = (float) r10
            r9.width(r10)
            r57.addContentRow()
            org.fortheloss.framework.LabelInputIncrementSmallField r9 = new org.fortheloss.framework.LabelInputIncrementSmallField
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r10 = r0._animationScreenRef
            java.lang.String r13 = "leftSidePadding"
            java.lang.String r50 = org.fortheloss.sticknodes.App.localize(r13)
            r52 = 3
            r53 = 0
            r54 = 1128792064(0x43480000, float:200.0)
            r55 = 0
            java.lang.String r51 = "0"
            r48 = r9
            r49 = r10
            r48.<init>(r49, r50, r51, r52, r53, r54, r55)
            r10 = 1
            r9.setIncrementButtonVisibilityPermanent(r10)
            r10 = 0
            r9.setIncrementType(r10)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$37 r10 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$37
            r10.<init>(r0)
            r9.setFieldListener(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r0.addContent(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.fillX()
            r13 = 2
            r10.align(r13)
            org.fortheloss.framework.LabelInputIncrementSmallField r10 = new org.fortheloss.framework.LabelInputIncrementSmallField
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r13 = r0._animationScreenRef
            java.lang.String r15 = "rightSidePadding"
            java.lang.String r50 = org.fortheloss.sticknodes.App.localize(r15)
            java.lang.String r51 = "0"
            r48 = r10
            r49 = r13
            r48.<init>(r49, r50, r51, r52, r53, r54, r55)
            r13 = 1
            r10.setIncrementButtonVisibilityPermanent(r13)
            r13 = 0
            r10.setIncrementType(r13)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$38 r13 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$38
            r13.<init>(r0)
            r10.setFieldListener(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r0.addContent(r10)
            r13.fillX()
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = "hapticFeedback"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r13.<init>(r15, r10)
            r10 = 1
            r13.setWrap(r10)
            r13.setAlignment(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r0.addContent(r13)
            r13 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.colspan(r13)
            int r13 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r13 = (float) r13
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.width(r13)
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            r15 = 1109393408(0x42200000, float:40.0)
            float r13 = r13 * r15
            r10.padTop(r13)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r10 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r13 = "hapticInfo"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r10.<init>(r13, r15)
            r13 = 1
            r10.setWrap(r13)
            r10.setAlignment(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r0.addContent(r10)
            r13 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.colspan(r13)
            int r13 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r13 = (float) r13
            r10.width(r13)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r10.<init>()
            r13 = 0
            r10.pad(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r10.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.pad(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.space(r13)
            r13 = 1
            r15.align(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r0.addContent(r10)
            r13 = 2
            r15.colspan(r13)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r13.<init>(r7, r15)
            r7 = 1
            r13.setWrap(r7)
            r13.setAlignment(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r10.add(r13)
            int r13 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r13 = (float) r13
            r15 = 1048576000(0x3e800000, float:0.25)
            float r13 = r13 * r15
            r7.width(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r7 = new com.badlogic.gdx.scenes.scene2d.ui.Slider
            r50 = 0
            r51 = 1073741824(0x40000000, float:2.0)
            r52 = 1065353216(0x3f800000, float:1.0)
            r53 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle r54 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsSliderStyle()
            r49 = r7
            r49.<init>(r50, r51, r52, r53, r54)
            r13 = 0
            r7.setValue(r13)
            org.fortheloss.framework.CustomStopListener r13 = new org.fortheloss.framework.CustomStopListener
            r13.<init>()
            r7.addListener(r13)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$39 r13 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$39
            r13.<init>(r0, r7)
            r7.addListener(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r10.add(r7)
            int r15 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r15 = (float) r15
            r17 = 1056964608(0x3f000000, float:0.5)
            float r15 = r15 * r17
            r13.width(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r13.<init>(r11, r15)
            r11 = 1
            r13.setWrap(r11)
            r13.setAlignment(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.add(r13)
            int r13 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r13 = (float) r13
            r15 = 1048576000(0x3e800000, float:0.25)
            float r13 = r13 * r15
            r10.width(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r10 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r13 = "haptic1"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r10.<init>(r13, r15)
            r10.setWrap(r11)
            r10.setAlignment(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r0.addContent(r10)
            int r11 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r11 = (float) r11
            r13 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 * r13
            r10.width(r11)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r10 = new com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup
            r10.<init>()
            r11 = 0
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r13 = r10.pad(r11)
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            r16 = 1109393408(0x42200000, float:40.0)
            float r15 = r15 * r16
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r13 = r13.space(r15)
            r15 = 1
            r13.align(r15)
            r0.addContent(r10)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r13 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r13.<init>()
            r46 = r9
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r9 = r13.pad(r11)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r9 = r9.space(r11)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r9 = r9.align(r15)
            r9.fill()
            r10.addActor(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r9.<init>(r11, r15)
            r11 = 0
            r9.setWrap(r11)
            r11 = 1
            r9.setAlignment(r11)
            r13.addActor(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r9)
            r0._vibrationAllButtonsEnableButton = r9
            r13.addActor(r9)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r9.<init>()
            r13 = 0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r9.pad(r13)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.space(r13)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r13 = r15.align(r11)
            r13.fill()
            r10.addActor(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label r10 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r10.<init>(r13, r15)
            r13 = 0
            r10.setWrap(r13)
            r10.setAlignment(r11)
            r9.addActor(r10)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r10)
            r0._vibrationAllButtonsDisableButton = r10
            r9.addActor(r10)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r9.<init>()
            r10 = 2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r11 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r10]
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r10 = r0._vibrationAllButtonsEnableButton
            r11[r13] = r10
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r10 = r0._vibrationAllButtonsDisableButton
            r13 = 1
            r11[r13] = r10
            r9.add(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r10 = "haptic2"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r11 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r9.<init>(r10, r11)
            r9.setWrap(r13)
            r9.setAlignment(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r0.addContent(r9)
            int r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r10 = (float) r10
            r11 = 1056964608(0x3f000000, float:0.5)
            float r10 = r10 * r11
            r9.width(r10)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup
            r9.<init>()
            r10 = 0
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r11 = r9.pad(r10)
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            r15 = 1109393408(0x42200000, float:40.0)
            float r13 = r13 * r15
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r11 = r11.space(r13)
            r13 = 1
            r11.align(r13)
            r0.addContent(r9)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r11 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r11.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r11.pad(r10)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.space(r10)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r10 = r15.align(r13)
            r10.fill()
            r9.addActor(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label r10 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r10.<init>(r15, r13)
            r13 = 0
            r10.setWrap(r13)
            r13 = 1
            r10.setAlignment(r13)
            r11.addActor(r10)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r10)
            r0._vibrationQrtButtonsEnableButton = r10
            r11.addActor(r10)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r10 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r10.<init>()
            r11 = 0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r10.pad(r11)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.space(r11)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r11 = r15.align(r13)
            r11.fill()
            r9.addActor(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r9.<init>(r11, r15)
            r11 = 0
            r9.setWrap(r11)
            r9.setAlignment(r13)
            r10.addActor(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r9)
            r0._vibrationQrtButtonsDisableButton = r9
            r10.addActor(r9)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r9.<init>()
            r10 = 2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r13 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r10]
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r10 = r0._vibrationQrtButtonsEnableButton
            r13[r11] = r10
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r10 = r0._vibrationQrtButtonsDisableButton
            r11 = 1
            r13[r11] = r10
            r9.add(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r10 = "haptic3"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r9.<init>(r10, r13)
            r9.setWrap(r11)
            r9.setAlignment(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r0.addContent(r9)
            int r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r10 = (float) r10
            r11 = 1056964608(0x3f000000, float:0.5)
            float r10 = r10 * r11
            r9.width(r10)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup
            r9.<init>()
            r10 = 0
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r11 = r9.pad(r10)
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            r15 = 1109393408(0x42200000, float:40.0)
            float r13 = r13 * r15
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r11 = r11.space(r13)
            r13 = 1
            r11.align(r13)
            r0.addContent(r9)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r11 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r11.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r11.pad(r10)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.space(r10)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r10 = r15.align(r13)
            r10.fill()
            r9.addActor(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label r10 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r10.<init>(r15, r13)
            r13 = 0
            r10.setWrap(r13)
            r13 = 1
            r10.setAlignment(r13)
            r11.addActor(r10)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r10)
            r0._vibrationLongPressEnableButton = r10
            r11.addActor(r10)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r10 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r10.<init>()
            r11 = 0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r10.pad(r11)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.space(r11)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r11 = r15.align(r13)
            r11.fill()
            r9.addActor(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r9.<init>(r11, r15)
            r11 = 0
            r9.setWrap(r11)
            r9.setAlignment(r13)
            r10.addActor(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r9)
            r0._vibrationLongPressDisableButton = r9
            r10.addActor(r9)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r9.<init>()
            r10 = 2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r13 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r10]
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r10 = r0._vibrationLongPressEnableButton
            r13[r11] = r10
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r10 = r0._vibrationLongPressDisableButton
            r11 = 1
            r13[r11] = r10
            r9.add(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r10 = "haptic4"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r9.<init>(r10, r13)
            r9.setWrap(r11)
            r9.setAlignment(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r0.addContent(r9)
            int r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r10 = (float) r10
            r11 = 1056964608(0x3f000000, float:0.5)
            float r10 = r10 * r11
            r9.width(r10)
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup
            r9.<init>()
            r10 = 0
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r11 = r9.pad(r10)
            float r13 = org.fortheloss.sticknodes.App.assetScaling
            r15 = 1109393408(0x42200000, float:40.0)
            float r13 = r13 * r15
            com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup r11 = r11.space(r13)
            r13 = 1
            r11.align(r13)
            r0.addContent(r9)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r11 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r11.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r11.pad(r10)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r15 = r15.space(r10)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r10 = r15.align(r13)
            r10.fill()
            r9.addActor(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label r10 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r15 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r10.<init>(r14, r15)
            r14 = 0
            r10.setWrap(r14)
            r10.setAlignment(r13)
            r11.addActor(r10)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r10)
            r0._vibrationProcessCompletionEnableButton = r10
            r11.addActor(r10)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r10 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r10.<init>()
            r11 = 0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r14 = r10.pad(r11)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r11 = r14.space(r11)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r11 = r11.align(r13)
            r11.fill()
            r9.addActor(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r12 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r9.<init>(r11, r12)
            r11 = 0
            r9.setWrap(r11)
            r9.setAlignment(r13)
            r10.addActor(r9)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r9)
            r0._vibrationProcessCompletionDisableButton = r9
            r10.addActor(r9)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r9 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r9.<init>()
            r10 = 2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r12 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r10]
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r10 = r0._vibrationProcessCompletionEnableButton
            r12[r11] = r10
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r10 = r0._vibrationProcessCompletionDisableButton
            r11 = 1
            r12[r11] = r10
            r9.add(r12)
            com.badlogic.gdx.Application r9 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r9 = r9.getType()
            com.badlogic.gdx.Application$ApplicationType r10 = com.badlogic.gdx.Application.ApplicationType.Android
            if (r9 != r10) goto L190a
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r10 = "storageAppSettingsTitle"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r12 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r9.<init>(r10, r12)
            r9.setWrap(r11)
            r9.setAlignment(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r0.addContent(r9)
            r10 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.colspan(r10)
            int r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r10 = (float) r10
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.width(r10)
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            r11 = 1109393408(0x42200000, float:40.0)
            float r10 = r10 * r11
            r9.padTop(r10)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r10 = "storageAppSettingsMessage"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r11 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r9.<init>(r10, r11)
            r10 = 1
            r9.setWrap(r10)
            r9.setAlignment(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r0.addContent(r9)
            r10 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.colspan(r10)
            int r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r10 = (float) r10
            r9.width(r10)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r10 = "completedIgnored"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r11 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r9.<init>(r10, r11)
            r10 = 1
            r9.setWrap(r10)
            r9.setAlignment(r10)
            r0.addContent(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r11 = "notCompleted"
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r12 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r9.<init>(r11, r12)
            r9.setWrap(r10)
            r9.setAlignment(r10)
            r0.addContent(r9)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r15 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r9)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$40 r9 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$40
            r9.<init>(r0)
            r15.addListener(r9)
            r0.addContent(r15)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r9)
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$41 r10 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog$41
            r10.<init>(r0)
            r9.addListener(r10)
            r0.addContent(r9)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r10 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r10.<init>()
            r11 = 2
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r12 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r11]
            r11 = 0
            r12[r11] = r15
            r11 = 1
            r12[r11] = r9
            r10.add(r12)
            r56 = r15
            r15 = r9
            r9 = r56
            goto L190c
        L190a:
            r9 = 0
            r15 = 0
        L190c:
            org.fortheloss.sticknodes.data.SessionData r10 = r0._sessionDataRef
            boolean r10 = r10.getUnlimitedNodesIsEnabled()
            r0._applyUnlimitedNodesEnabledTo = r10
            org.fortheloss.sticknodes.data.SessionData r10 = r0._sessionDataRef
            boolean r10 = r10.getAxisLockingIsEnabled()
            r0._applyAxisLockingEnabledTo = r10
            java.lang.String r10 = "customSkinSetting"
            int r10 = r1.getInteger(r10, r11)
            r0._customSkinEnabledBefore = r10
            r0._applyCustomSkinEnabledTo = r10
            java.lang.String r10 = "leftHandModeEnabled"
            r12 = 0
            boolean r10 = r1.getBoolean(r10, r12)
            r0._leftHandModeEnabledBefore = r10
            r0._applyLeftHandModeEnabledTo = r10
            java.lang.String r10 = "enableStickfigureBackup"
            boolean r10 = r1.getBoolean(r10, r11)
            r0._applyStickfigureBackupEnabledTo = r10
            java.lang.String r10 = "incrementButtonsVisibleInitially"
            boolean r10 = r1.getBoolean(r10, r12)
            r0._applyIncrementButtonsVisibleInitially = r10
            java.lang.String r10 = "movieclipDoubleTapEnabled"
            boolean r10 = r1.getBoolean(r10, r12)
            r0._applyMovieclipDoubleTapEnabledTo = r10
            java.lang.String r10 = "noneDoubleTapEnabled"
            boolean r10 = r1.getBoolean(r10, r12)
            r0._applyNoneDoubleTapEnabledTo = r10
            java.lang.String r10 = "nerdModeEnabled"
            boolean r10 = r1.getBoolean(r10, r12)
            r0._applyNerdModeEnabledTo = r10
            java.lang.String r10 = "riggerModeEnabled"
            boolean r10 = r1.getBoolean(r10, r12)
            r0._applyRiggerModeEnabledTo = r10
            java.lang.String r10 = "persistentFiguresEnabled"
            r11 = 1
            boolean r10 = r1.getBoolean(r10, r11)
            r0._applyPersistentFiguresEnabledTo = r10
            com.badlogic.gdx.Application r10 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r10 = r10.getType()
            com.badlogic.gdx.Application$ApplicationType r11 = com.badlogic.gdx.Application.ApplicationType.iOS
            if (r10 == r11) goto L197c
            java.lang.String r10 = "androidKeepAppAlive"
            boolean r10 = r1.getBoolean(r10, r12)
            r0._applyAndroidKeepAppAliveToggle = r10
        L197c:
            org.fortheloss.sticknodes.data.SessionData r10 = r0._sessionDataRef
            boolean r10 = r10.getPreserveSelectionWhenChangingFrames()
            r0._applyPreserveSelectionWhenChangingFramesTo = r10
            org.fortheloss.sticknodes.data.SessionData r10 = r0._sessionDataRef
            float r10 = r10.getNodeSelectionSensitivity()
            r0._applyNodeSelectionSensitivityTo = r10
            org.fortheloss.sticknodes.data.SessionData r10 = r0._sessionDataRef
            float r10 = r10.getAxisLockingSensitivity()
            r0._applyAxisLockingSensitivityTo = r10
            int r10 = org.fortheloss.sticknodes.App.vibrationIntensity
            float r10 = (float) r10
            r0._applyVibrationIntensityTo = r10
            org.fortheloss.sticknodes.data.SessionData r10 = r0._sessionDataRef
            int r10 = r10.getOpenGLLineWidth()
            r0._applyLineWidthTo = r10
            boolean r10 = org.fortheloss.sticknodes.stickfigure.Stickfigure.isUsingApproximateTouch()
            r0._applyApproximatePrecisionTo = r10
            java.lang.String r10 = "screenPaddingLeft"
            r11 = 0
            int r10 = r1.getInteger(r10, r11)
            r12 = 200(0xc8, float:2.8E-43)
            int r10 = com.badlogic.gdx.math.MathUtils.clamp(r10, r11, r12)
            r0._applyLeftPaddingTo = r10
            java.lang.String r10 = "screenPaddingRight"
            int r10 = r1.getInteger(r10, r11)
            int r10 = com.badlogic.gdx.math.MathUtils.clamp(r10, r11, r12)
            r0._applyRightPaddingTo = r10
            int r12 = r0._applyLeftPaddingTo
            r0._leftPaddingBefore = r12
            r0._rightPaddingBefore = r10
            java.lang.String r10 = "scopedStorageDone"
            boolean r10 = r1.getBoolean(r10, r11)
            r0._applyScopedStorageDoneTo = r10
            java.lang.String r10 = "vibrationAllButtons"
            boolean r10 = r1.getBoolean(r10, r11)
            r0._vibrationAllButtonsBefore = r10
            java.lang.String r10 = "vibrationQrtButtons"
            boolean r10 = r1.getBoolean(r10, r11)
            r0._vibrationQrtButtonsBefore = r10
            java.lang.String r10 = "vibrationLongPress"
            boolean r10 = r1.getBoolean(r10, r11)
            r0._vibrationLongPressBefore = r10
            java.lang.String r10 = "vibrationProcessCompletion"
            boolean r10 = r1.getBoolean(r10, r11)
            r0._vibrationProcessCompletionBefore = r10
            boolean r10 = r0._applyUnlimitedNodesEnabledTo
            r3.setChecked(r10)
            boolean r3 = r0._applyUnlimitedNodesEnabledTo
            r10 = 1
            r3 = r3 ^ r10
            r2.setChecked(r3)
            boolean r2 = r0._applyAxisLockingEnabledTo
            r8.setChecked(r2)
            boolean r2 = r0._applyAxisLockingEnabledTo
            r2 = r2 ^ r10
            r3 = r44
            r3.setChecked(r2)
            int r2 = r0._applyCustomSkinEnabledTo
            if (r2 != r10) goto L1a15
            r3 = r43
            r3.setChecked(r10)
        L1a12:
            r2 = r21
            goto L1a23
        L1a15:
            r3 = 2
            if (r2 != r3) goto L1a1e
            r2 = r42
            r2.setChecked(r10)
            goto L1a12
        L1a1e:
            r2 = r21
            r2.setChecked(r10)
        L1a23:
            boolean r2 = r2.isChecked()
            if (r2 != 0) goto L1a2e
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Label> r2 = r0.mNewSkinWarningLabelCellRef
            r2.clearActor()
        L1a2e:
            boolean r2 = r0._applyLeftHandModeEnabledTo
            r3 = r23
            r3.setChecked(r2)
            boolean r2 = r0._applyLeftHandModeEnabledTo
            r3 = 1
            r2 = r2 ^ r3
            r8 = r22
            r8.setChecked(r2)
            boolean r2 = r0._applyIncrementButtonsVisibleInitially
            r8 = r27
            r8.setChecked(r2)
            boolean r2 = r0._applyIncrementButtonsVisibleInitially
            r2 = r2 ^ r3
            r8 = r26
            r8.setChecked(r2)
            boolean r2 = r0._applyMovieclipDoubleTapEnabledTo
            r8 = r29
            r8.setChecked(r2)
            boolean r2 = r0._applyMovieclipDoubleTapEnabledTo
            r2 = r2 ^ r3
            r8 = r28
            r8.setChecked(r2)
            boolean r2 = r0._applyNoneDoubleTapEnabledTo
            r8 = r31
            r8.setChecked(r2)
            boolean r2 = r0._applyNoneDoubleTapEnabledTo
            r2 = r2 ^ r3
            r8 = r30
            r8.setChecked(r2)
            boolean r2 = r0._applyNerdModeEnabledTo
            r8 = r35
            r8.setChecked(r2)
            boolean r2 = r0._applyNerdModeEnabledTo
            r2 = r2 ^ r3
            r8 = r34
            r8.setChecked(r2)
            boolean r2 = r0._applyRiggerModeEnabledTo
            r8 = r37
            r8.setChecked(r2)
            boolean r2 = r0._applyRiggerModeEnabledTo
            r2 = r2 ^ r3
            r8 = r36
            r8.setChecked(r2)
            boolean r2 = r0._applyPersistentFiguresEnabledTo
            r8 = r41
            r8.setChecked(r2)
            boolean r2 = r0._applyPersistentFiguresEnabledTo
            r2 = r2 ^ r3
            r8 = r38
            r8.setChecked(r2)
            if (r40 == 0) goto L1aab
            if (r39 == 0) goto L1aab
            boolean r2 = r0._applyAndroidKeepAppAliveToggle
            r8 = r40
            r8.setChecked(r2)
            boolean r2 = r0._applyAndroidKeepAppAliveToggle
            r2 = r2 ^ r3
            r8 = r39
            r8.setChecked(r2)
        L1aab:
            boolean r2 = r0._applyPreserveSelectionWhenChangingFramesTo
            r8 = r33
            r8.setChecked(r2)
            boolean r2 = r0._applyPreserveSelectionWhenChangingFramesTo
            r2 = r2 ^ r3
            r8 = r32
            r8.setChecked(r2)
            boolean r2 = r0._applyStickfigureBackupEnabledTo
            r8 = r25
            r8.setChecked(r2)
            boolean r2 = r0._applyStickfigureBackupEnabledTo
            r2 = r2 ^ r3
            r3 = r24
            r3.setChecked(r2)
            float r2 = r0._applyNodeSelectionSensitivityTo
            r5.setValue(r2)
            float r2 = r0._applyAxisLockingSensitivityTo
            r6.setValue(r2)
            float r2 = r0._applyVibrationIntensityTo
            r7.setValue(r2)
            int r2 = r0._applyLineWidthTo
            float r2 = (float) r2
            r3 = r45
            r3.setValue(r2)
            boolean r2 = r0._applyApproximatePrecisionTo
            r4.setChecked(r2)
            boolean r2 = r0._applyApproximatePrecisionTo
            r3 = 1
            r2 = r2 ^ r3
            r3 = r47
            r3.setChecked(r2)
            int r2 = r0._leftPaddingBefore
            float r2 = (float) r2
            r3 = r46
            r3.setValue(r2)
            int r2 = r0._rightPaddingBefore
            float r2 = (float) r2
            r3 = r48
            r3.setValue(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r0._vibrationAllButtonsEnableButton
            if (r2 == 0) goto L1b3d
            boolean r3 = r0._vibrationAllButtonsBefore
            r2.setChecked(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r0._vibrationAllButtonsDisableButton
            boolean r3 = r0._vibrationAllButtonsBefore
            r4 = 1
            r3 = r3 ^ r4
            r2.setChecked(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r0._vibrationQrtButtonsEnableButton
            boolean r3 = r0._vibrationQrtButtonsBefore
            r2.setChecked(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r0._vibrationQrtButtonsDisableButton
            boolean r3 = r0._vibrationQrtButtonsBefore
            r3 = r3 ^ r4
            r2.setChecked(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r0._vibrationLongPressEnableButton
            boolean r3 = r0._vibrationLongPressBefore
            r2.setChecked(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r0._vibrationLongPressDisableButton
            boolean r3 = r0._vibrationLongPressBefore
            r3 = r3 ^ r4
            r2.setChecked(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r0._vibrationProcessCompletionEnableButton
            boolean r3 = r0._vibrationProcessCompletionBefore
            r2.setChecked(r3)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r0._vibrationProcessCompletionDisableButton
            boolean r3 = r0._vibrationProcessCompletionBefore
            r3 = r3 ^ r4
            r2.setChecked(r3)
        L1b3d:
            if (r9 == 0) goto L1b44
            boolean r2 = r0._applyScopedStorageDoneTo
            r9.setChecked(r2)
        L1b44:
            if (r15 == 0) goto L1b4d
            boolean r2 = r0._applyScopedStorageDoneTo
            r3 = 1
            r2 = r2 ^ r3
            r15.setChecked(r2)
        L1b4d:
            java.lang.String r2 = "savePromptMinutes"
            r3 = 5
            int r2 = r1.getInteger(r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r5 = "saveReminder"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r4.<init>(r5, r6)
            r5 = 1
            r4.setWrap(r5)
            r4.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.addContent(r4)
            r5 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.colspan(r5)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r5 = (float) r5
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.width(r5)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r6 = 1109393408(0x42200000, float:40.0)
            float r5 = r5 * r6
            r4.padTop(r5)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r5 = "saveReminderInfo"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r5, r6)
            r5 = 1
            r4.setWrap(r5)
            r4.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.addContent(r4)
            r5 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.colspan(r5)
            int r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r6 = (float) r6
            r4.width(r6)
            r57.addContentRow()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter r4 = new com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldFilter$DigitsOnlyFilter
            r4.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r0.createTextField(r2, r5, r4)
            r0._saveMinutesTextfield = r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.addContent(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r5)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            r5 = 4
            int r4 = r4 / r5
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.width(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r4 = (float) r4
            r2.height(r4)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "selectLanguage"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r2.<init>(r4, r6)
            r4 = 1
            r2.setWrap(r4)
            r2.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.addContent(r2)
            r4 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.width(r4)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r6 = 1109393408(0x42200000, float:40.0)
            float r4 = r4 * r6
            r2.padTop(r4)
            r57.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "appSettingsLanguage"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r4, r6)
            r4 = 1
            r2.setWrap(r4)
            r2.setAlignment(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.addContent(r2)
            r4 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r4 = (float) r4
            r2.width(r4)
            r57.addContentRow()
            org.fortheloss.framework.ListCustomItemHeight r2 = new org.fortheloss.framework.ListCustomItemHeight
            com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogListStyle()
            r6 = 1120927744(0x42d00000, float:104.0)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r6
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.<init>(r4, r7, r6)
            r0._languageList = r2
            boolean r2 = org.fortheloss.sticknodes.App.isInternationalUI()
            if (r2 == 0) goto L1c5b
            java.lang.String r2 = "日本語 (JP)"
            java.lang.String r4 = "Русский (RU)"
            goto L1c5f
        L1c5b:
            java.lang.String r2 = "Japanese (JP)"
            java.lang.String r4 = "Russian (RU)"
        L1c5f:
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r6 = r0._languageList
            r7 = 8
            java.lang.String[] r7 = new java.lang.String[r7]
            java.lang.String r8 = "English (EN)"
            r9 = 0
            r7[r9] = r8
            java.lang.String r8 = "Español (ES)"
            r9 = 1
            r7[r9] = r8
            java.lang.String r8 = "Filipino (FL)"
            r9 = 2
            r7[r9] = r8
            java.lang.String r8 = "Français (FR)"
            r9 = 3
            r7[r9] = r8
            r7[r5] = r2
            java.lang.String r2 = "Português (PT)"
            r7[r3] = r2
            r2 = 6
            r7[r2] = r4
            java.lang.String r4 = "Türkçe (TR)"
            r8 = 7
            r7[r8] = r4
            r6.setItems(r7)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r4 = new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r6 = r0._languageList
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneStyle()
            r4.<init>(r6, r7)
            r0._scrollPane = r4
            r6 = 0
            r4.setFadeScrollBars(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r4 = r0._scrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.addContent(r4)
            r6 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.colspan(r6)
            int r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r6 = (float) r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.width(r6)
            int r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getListHeight()
            float r6 = (float) r6
            r7 = 1061158912(0x3f400000, float:0.75)
            float r6 = r6 * r7
            r4.height(r6)
            java.lang.String r4 = "language"
            int r1 = r1.getInteger(r4)
            if (r1 != 0) goto L1cca
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r1 = r0._languageList
            r2 = 0
            r1.setSelectedIndex(r2)
            goto L1d06
        L1cca:
            r4 = 1
            if (r1 != r4) goto L1cd3
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r1 = r0._languageList
            r1.setSelectedIndex(r4)
            goto L1d06
        L1cd3:
            if (r1 != r3) goto L1cdc
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r1 = r0._languageList
            r4 = 2
            r1.setSelectedIndex(r4)
            goto L1d06
        L1cdc:
            r4 = 2
            if (r1 != r4) goto L1ce6
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r1 = r0._languageList
            r4 = 3
            r1.setSelectedIndex(r4)
            goto L1d06
        L1ce6:
            r4 = 3
            if (r1 != r2) goto L1cef
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r1 = r0._languageList
            r1.setSelectedIndex(r5)
            goto L1d06
        L1cef:
            if (r1 != r4) goto L1cf7
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r1 = r0._languageList
            r1.setSelectedIndex(r3)
            goto L1d06
        L1cf7:
            if (r1 != r8) goto L1cff
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r1 = r0._languageList
            r1.setSelectedIndex(r2)
            goto L1d06
        L1cff:
            if (r1 != r5) goto L1d06
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r1 = r0._languageList
            r1.setSelectedIndex(r8)
        L1d06:
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r1 = r0._languageList
            int r1 = r1.getSelectedIndex()
            r0._languageIndexBefore = r1
            r0._languageIndexAfter = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getApplyButtonStyle()
            r2 = r20
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r0.createImageTextButton(r2, r1)
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r0.addButton(r1, r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCancelButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r0.createImageTextButton(r2, r1)
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.addButton(r1, r3)
            java.lang.String r1 = "viewCredits"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0.createTextButton(r1)
            r3 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.addButton(r1, r3)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "4.2.5"
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "viewChangelog"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0.createTextButton(r1)
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.addButton(r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r1 = r57.getDialog()
            r1.validate()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = r57.getDialogScrollPane()
            float r2 = org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog.dialogLastScrollY
            r1.setScrollPercentY(r2)
            return
    }
}
