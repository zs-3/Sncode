package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class LockToCameraDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private com.badlogic.gdx.graphics.g2d.TextureAtlas _atlasRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _bundlesTable;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _copyAllLockDataButton;
    private org.fortheloss.sticknodes.animationscreen.FrameCamera _frameCameraRef;
    private org.fortheloss.sticknodes.animationscreen.modules.FramesModule _framesModuleRef;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog.LockedStickfigureTable> _lockedStickfigureTables;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _pasteAllLockDataButton;
    private org.fortheloss.sticknodes.data.ProjectData _projectDataRef;
    private org.fortheloss.sticknodes.data.SessionData _sessionDataRef;



    private class LockedStickfigureTable extends com.badlogic.gdx.scenes.scene2d.ui.Table implements com.badlogic.gdx.utils.Disposable {
        private org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle _figureCameraLockBundleRef;
        private org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog _lockToCameraDialogRef;
        private org.fortheloss.framework.RepeatingTextButton _minusButton;
        private com.badlogic.gdx.scenes.scene2d.ui.Label _parallaxLabel;
        private org.fortheloss.framework.RepeatingTextButton _plusButton;
        private com.badlogic.gdx.scenes.scene2d.ui.Table _plusMinusButtonsTable;
        private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _rotateAndScaleButton;
        private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _unlockButton;
        final /* synthetic */ org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog this$0;







        /* renamed from: -$$Nest$monParallaxClick, reason: not valid java name */
        static /* bridge */ /* synthetic */ void m531$$Nest$monParallaxClick(org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog.LockedStickfigureTable r0, int r1) {
                r0.onParallaxClick(r1)
                return
        }

        /* renamed from: -$$Nest$monRotateWithCameraClick, reason: not valid java name */
        static /* bridge */ /* synthetic */ void m532$$Nest$monRotateWithCameraClick(org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog.LockedStickfigureTable r0) {
                r0.onRotateWithCameraClick()
                return
        }

        /* renamed from: -$$Nest$monUnlockClick, reason: not valid java name */
        static /* bridge */ /* synthetic */ void m533$$Nest$monUnlockClick(org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog.LockedStickfigureTable r0) {
                r0.onUnlockClick()
                return
        }

        public LockedStickfigureTable(org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog r2, org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog r3) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                r1._lockToCameraDialogRef = r3
                float r2 = org.fortheloss.sticknodes.App.assetScaling
                r3 = 1101004800(0x41a00000, float:20.0)
                float r2 = r2 * r3
                r3 = 1056964608(0x3f000000, float:0.5)
                float r3 = r3 * r2
                r0 = 0
                r1.pad(r0)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.defaults()
                r0.space(r3, r2, r3, r2)
                return
        }

        private void onParallaxClick(int r2) {
                r1 = this;
                org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog r0 = r1._lockToCameraDialogRef
                org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog.m527$$Nest$monParallaxClick(r0, r1, r2)
                return
        }

        private void onRotateWithCameraClick() {
                r2 = this;
                org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog r0 = r2._lockToCameraDialogRef
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._rotateAndScaleButton
                boolean r1 = r1.isChecked()
                org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog.m529$$Nest$monRotateWithCameraClick(r0, r2, r1)
                return
        }

        private void onUnlockClick() {
                r1 = this;
                org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog r0 = r1._lockToCameraDialogRef
                org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog.m530$$Nest$monUnlockClick(r0, r1)
                return
        }

        @Override // com.badlogic.gdx.utils.Disposable
        public void dispose() {
                r2 = this;
                r0 = 0
                r2._lockToCameraDialogRef = r0
                r2._figureCameraLockBundleRef = r0
                com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r2._unlockButton
                if (r1 == 0) goto Lc
                r1.clear()
            Lc:
                r2._unlockButton = r0
                r2._parallaxLabel = r0
                org.fortheloss.framework.RepeatingTextButton r1 = r2._minusButton
                if (r1 == 0) goto L17
                r1.clear()
            L17:
                r2._minusButton = r0
                org.fortheloss.framework.RepeatingTextButton r1 = r2._plusButton
                if (r1 == 0) goto L20
                r1.clear()
            L20:
                r2._plusButton = r0
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._rotateAndScaleButton
                if (r1 == 0) goto L29
                r1.clear()
            L29:
                r2._rotateAndScaleButton = r0
                com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._plusMinusButtonsTable
                if (r1 == 0) goto L32
                org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            L32:
                r2._plusMinusButtonsTable = r0
                return
        }

        public org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle getBundle() {
                r1 = this;
                org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r0 = r1._figureCameraLockBundleRef
                return r0
        }

        public void initialize(org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r8, org.fortheloss.sticknodes.data.ProjectData r9) {
                r7 = this;
                r7._figureCameraLockBundleRef = r8
                int r0 = r8.getFigureType()
                r1 = 2
                if (r0 != 0) goto L1a
                java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r9 = r9.libraryStickfigures
                int r0 = r8.getLibraryID()
                java.lang.Object r9 = r9.get(r0)
                org.fortheloss.sticknodes.stickfigure.Stickfigure r9 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r9
                java.lang.String r9 = r9.getName()
                goto L41
            L1a:
                int r0 = r8.getFigureType()
                if (r0 != r1) goto L31
                java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r9 = r9.librarySprites
                int r0 = r8.getLibraryID()
                java.lang.Object r9 = r9.get(r0)
                org.fortheloss.sticknodes.sprite.ISpriteSource r9 = (org.fortheloss.sticknodes.sprite.ISpriteSource) r9
                java.lang.String r9 = r9.getName()
                goto L41
            L31:
                java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r9 = r9.libraryMovieclips
                int r0 = r8.getLibraryID()
                java.lang.Object r9 = r9.get(r0)
                org.fortheloss.sticknodes.movieclip.MCMovieclipSource r9 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r9
                java.lang.String r9 = r9.getName()
            L41:
                r0 = 54
                int r2 = r9.length()
                int r0 = java.lang.Math.min(r0, r2)
                r2 = 0
                java.lang.String r9 = r9.substring(r2, r0)
                com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
                int r3 = r8.getFigureID()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r9)
                java.lang.String r9 = " (ID: "
                r4.append(r9)
                r4.append(r3)
                java.lang.String r9 = ")"
                r4.append(r9)
                java.lang.String r9 = r4.toString()
                com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
                r0.<init>(r9, r3)
                r9 = 1
                r0.setWrap(r9)
                r0.setAlignment(r9)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r9)
                int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
                float r3 = (float) r3
                r4 = 1056964608(0x3f000000, float:0.5)
                float r3 = r3 * r4
                r0.width(r3)
                org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog r0 = r7.this$0
                java.lang.String r3 = "unlock"
                java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
                com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeDeleteButtonStyle()
                com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r0.createImageTextButton(r3, r4)
                r7._unlockButton = r0
                org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog$LockedStickfigureTable$1 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog$LockedStickfigureTable$1
                r3.<init>(r7)
                r0.addListener(r3)
                com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = r7._unlockButton
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
                r0.colspan(r1)
                r7.row()
                com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
                java.lang.String r3 = "parallax"
                java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
                java.util.Locale r4 = java.util.Locale.US
                java.lang.Object[] r5 = new java.lang.Object[r9]
                float r6 = r8.getParallax()
                java.lang.Float r6 = java.lang.Float.valueOf(r6)
                r5[r2] = r6
                java.lang.String r2 = "%.2f"
                java.lang.String r2 = java.lang.String.format(r4, r2, r5)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r3)
                java.lang.String r3 = ": "
                r4.append(r3)
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
                r0.<init>(r2, r3)
                r7._parallaxLabel = r0
                r0.setWrap(r9)
                com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r7._parallaxLabel
                r0.setAlignment(r9)
                com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r7._parallaxLabel
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r9)
                r0.fillX()
                java.lang.String r0 = "rotateAndScaleWithCamera"
                java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
                com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
                com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r9, r2)
                r0.setWrap(r9)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r9)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
                r0.fillX()
                r7.row()
                com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
                r7._plusMinusButtonsTable = r0
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r7.add(r0)
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
                r0.fillX()
                org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog$LockedStickfigureTable$2 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog$LockedStickfigureTable$2
                com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
                java.lang.String r3 = "-"
                r4 = 1045220557(0x3e4ccccd, float:0.2)
                r0.<init>(r7, r3, r2, r4)
                r7._minusButton = r0
                com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0.getLabel()
                r0.setWrap(r9)
                org.fortheloss.framework.RepeatingTextButton r0 = r7._minusButton
                com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0.getLabel()
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.getCell(r2)
                float r2 = org.fortheloss.sticknodes.App.assetScaling
                r3 = 1082130432(0x40800000, float:4.0)
                float r5 = r2 * r3
                float r2 = r2 * r3
                r6 = 0
                r0.pad(r6, r5, r6, r2)
                org.fortheloss.framework.RepeatingTextButton r0 = r7._minusButton
                org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog$LockedStickfigureTable$3 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog$LockedStickfigureTable$3
                r2.<init>(r7)
                r0.addListener(r2)
                com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r7._plusMinusButtonsTable
                org.fortheloss.framework.RepeatingTextButton r2 = r7._minusButton
                com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r2)
                r2 = 18
                r0.align(r2)
                org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog$LockedStickfigureTable$4 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog$LockedStickfigureTable$4
                com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
                java.lang.String r5 = "+"
                r0.<init>(r7, r5, r2, r4)
                r7._plusButton = r0
                com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0.getLabel()
                r0.setWrap(r9)
                org.fortheloss.framework.RepeatingTextButton r9 = r7._plusButton
                com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r9.getLabel()
                com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.getCell(r0)
                float r0 = org.fortheloss.sticknodes.App.assetScaling
                float r2 = r0 * r3
                float r0 = r0 * r3
                r9.pad(r6, r2, r6, r0)
                org.fortheloss.framework.RepeatingTextButton r9 = r7._plusButton
                org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog$LockedStickfigureTable$5 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog$LockedStickfigureTable$5
                r0.<init>(r7)
                r9.addListener(r0)
                com.badlogic.gdx.scenes.scene2d.ui.Table r9 = r7._plusMinusButtonsTable
                org.fortheloss.framework.RepeatingTextButton r0 = r7._plusButton
                com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.add(r0)
                r0 = 10
                r9.align(r0)
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r9)
                r7._rotateAndScaleButton = r9
                org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog$LockedStickfigureTable$6 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog$LockedStickfigureTable$6
                r0.<init>(r7)
                r9.addListener(r0)
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r9 = r7._rotateAndScaleButton
                com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r7.add(r9)
                r9.colspan(r1)
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r9 = r7._rotateAndScaleButton
                boolean r8 = r8.getFigureWillRotateAndScale()
                r9.setChecked(r8)
                return
        }

        public void update() {
                r6 = this;
                com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r6._parallaxLabel
                java.lang.String r1 = "parallax"
                java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
                java.util.Locale r2 = java.util.Locale.US
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]
                org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r4 = r6._figureCameraLockBundleRef
                float r4 = r4.getParallax()
                java.lang.Float r4 = java.lang.Float.valueOf(r4)
                r5 = 0
                r3[r5] = r4
                java.lang.String r4 = "%.2f"
                java.lang.String r2 = java.lang.String.format(r2, r4, r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r1)
                java.lang.String r1 = ": "
                r3.append(r1)
                r3.append(r2)
                java.lang.String r1 = r3.toString()
                r0.setText(r1)
                com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r6._rotateAndScaleButton
                org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r1 = r6._figureCameraLockBundleRef
                boolean r1 = r1.getFigureWillRotateAndScale()
                r0.setChecked(r1)
                return
        }
    }

    /* renamed from: -$$Nest$monCopyLockDataClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m526$$Nest$monCopyLockDataClick(org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog r0) {
            r0.onCopyLockDataClick()
            return
    }

    /* renamed from: -$$Nest$monParallaxClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m527$$Nest$monParallaxClick(org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog r0, org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog.LockedStickfigureTable r1, int r2) {
            r0.onParallaxClick(r1, r2)
            return
    }

    /* renamed from: -$$Nest$monPasteLockDataClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m528$$Nest$monPasteLockDataClick(org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog r0) {
            r0.onPasteLockDataClick()
            return
    }

    /* renamed from: -$$Nest$monRotateWithCameraClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m529$$Nest$monRotateWithCameraClick(org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog r0, org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog.LockedStickfigureTable r1, boolean r2) {
            r0.onRotateWithCameraClick(r1, r2)
            return
    }

    /* renamed from: -$$Nest$monUnlockClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m530$$Nest$monUnlockClick(org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog r0, org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog.LockedStickfigureTable r1) {
            r0.onUnlockClick(r1)
            return
    }

    public LockToCameraDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2) {
            r0 = this;
            r0.<init>(r1)
            r0._framesModuleRef = r2
            return
    }

    private void onChooseStickfigureClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r1._framesModuleRef
            r0.promptUserToChooseStickfigureToLockToCamera()
            r1.hideImmediately()
            return
    }

    private void onCopyLockDataClick() {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r3._copyAllLockDataButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r3._copyAllLockDataButton
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r1, r1, r1, r2)
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r3._frameCameraRef
            r0.setCopiedFigureCameraLockBundles(r1)
            return
    }

    private void onParallaxClick(org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog.LockedStickfigureTable r3, int r4) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r0 = r3.getBundle()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r2._framesModuleRef
            int r0 = r0.getFigureID()
            r1.modifyFigureCameraLockParallax(r0, r4)
            r3.update()
            return
    }

    private void onPasteLockDataClick() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle[] r0 = r0.getCopiedFigureCameraLockBundles()
            if (r0 == 0) goto L14
            int r1 = r0.length
            if (r1 > 0) goto Lc
            goto L14
        Lc:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r2._framesModuleRef
            r1.pasteFigureCameraLockBundles(r0)
            r2.rebuildBundlesTable()
        L14:
            return
    }

    private void onRotateWithCameraClick(org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog.LockedStickfigureTable r3, boolean r4) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r0 = r3.getBundle()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r2._framesModuleRef
            int r0 = r0.getFigureID()
            r1.modifyFigureCameraLockRotateWithCamera(r0, r4)
            r3.update()
            return
    }

    private void onUnlockClick(org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog.LockedStickfigureTable r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r3 = r3.getBundle()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModuleRef
            int r3 = r3.getFigureID()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r2._frameCameraRef
            org.fortheloss.sticknodes.data.FrameData r1 = r1.getFrameData()
            r0.removeFigureFromCameraLock(r3, r1)
            r2.rebuildBundlesTable()
            return
    }

    private void rebuildBundlesTable() {
            r9 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r9._bundlesTable
            r0.clear()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog$LockedStickfigureTable> r0 = r9._lockedStickfigureTables
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        Ld:
            if (r0 < 0) goto L1d
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog$LockedStickfigureTable> r2 = r9._lockedStickfigureTables
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog$LockedStickfigureTable r2 = (org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog.LockedStickfigureTable) r2
            r2.dispose()
            int r0 = r0 + (-1)
            goto Ld
        L1d:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog$LockedStickfigureTable> r0 = r9._lockedStickfigureTables
            r0.clear()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r9._frameCameraRef
            boolean r0 = r0.hasLockedStickfigures()
            r2 = 1109393408(0x42200000, float:40.0)
            if (r0 == 0) goto L86
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r2
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r9._frameCameraRef
            java.util.ArrayList r1 = r1.getLockedStickfigureBundles()
            r3 = 0
            int r4 = r1.size()
        L3b:
            if (r3 >= r4) goto Lce
            org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog$LockedStickfigureTable r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog$LockedStickfigureTable
            r5.<init>(r9, r9)
            java.lang.Object r6 = r1.get(r3)
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r6 = (org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle) r6
            org.fortheloss.sticknodes.data.ProjectData r7 = r9._projectDataRef
            r5.initialize(r6, r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r9._bundlesTable
            r6.add(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r9._bundlesTable
            r6.row()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog$LockedStickfigureTable> r6 = r9._lockedStickfigureTables
            r6.add(r5)
            int r5 = r4 + (-1)
            if (r3 >= r5) goto L83
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r9._bundlesTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r6 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas r7 = r9._atlasRef
            java.lang.String r8 = "separator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r7.findRegion(r8)
            r6.<init>(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.padTop(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.padBottom(r0)
            r5.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r9._bundlesTable
            r5.row()
        L83:
            int r3 = r3 + 1
            goto L3b
        L86:
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "none"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "("
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = ")"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r5)
            r0.<init>(r3, r4)
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r9._bundlesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.add(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            r1 = 2
            r0.colspan(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r9._bundlesTable
            r0.row()
        Lce:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog$LockedStickfigureTable> r0 = r9._lockedStickfigureTables
            int r0 = r0.size()
            if (r0 > 0) goto Le6
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r9._copyAllLockDataButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r9._copyAllLockDataButton
            r1 = 1056964608(0x3f000000, float:0.5)
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.setColor(r3, r3, r3, r1)
        Le6:
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r9.getDialog()
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            if (r0 == 0) goto L126
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r2
            int r0 = (int) r0
            float r0 = (float) r0
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r1 = r9.getDialog()
            r1.invalidate()
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r1 = r9.getDialog()
            r1.pack()
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r1 = r9.getDialog()
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r2 = r9.getDialog()
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r2.getStage()
            float r2 = r2.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r3 = r9.getDialog()
            float r3 = r3.getPrefHeight()
            float r2 = r2 - r3
            float r2 = r2 - r0
            int r0 = java.lang.Math.round(r2)
            float r0 = (float) r0
            r1.setY(r0)
        L126:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r2) {
            r1 = this;
            super.dialogResult(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0 = 1
            if (r2 != r0) goto L12
            r1.doNotHideDialog()
            r1.onChooseStickfigureClick()
        L12:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            r0 = 0
            r3._framesModuleRef = r0
            r3._frameCameraRef = r0
            r3._projectDataRef = r0
            r3._sessionDataRef = r0
            r3._atlasRef = r0
            r3._copyAllLockDataButton = r0
            r3._pasteAllLockDataButton = r0
            r3._bundlesTable = r0
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog$LockedStickfigureTable> r1 = r3._lockedStickfigureTables
            if (r1 == 0) goto L2d
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L1b:
            if (r1 < 0) goto L2b
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog$LockedStickfigureTable> r2 = r3._lockedStickfigureTables
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog$LockedStickfigureTable r2 = (org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog.LockedStickfigureTable) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L1b
        L2b:
            r3._lockedStickfigureTables = r0
        L2d:
            super.dispose()
            return
    }

    public void initialize(org.fortheloss.sticknodes.animationscreen.FrameCamera r5, org.fortheloss.sticknodes.data.ProjectData r6, org.fortheloss.sticknodes.data.SessionData r7, com.badlogic.gdx.graphics.g2d.TextureAtlas r8) {
            r4 = this;
            java.lang.String r0 = "lockStickfigureToCameraTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1109393408(0x42200000, float:40.0)
            float r0 = r0 * r1
            r4._frameCameraRef = r5
            r4._projectDataRef = r6
            r4._sessionDataRef = r7
            r4._atlasRef = r8
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4._lockedStickfigureTables = r5
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r4._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r5 = r5.getSessionData()
            boolean r5 = r5.getNerdModeEnabled()
            r6 = 2
            r7 = 1
            if (r5 != 0) goto L59
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "lockStickfigureToCameraInfo1"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r2.<init>(r3)
            r5.<init>(r1, r2)
            r5.setWrap(r7)
            r5.setAlignment(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.addContent(r5)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.width(r1)
            r5.colspan(r6)
            r4.addContentRow()
        L59:
            org.fortheloss.sticknodes.data.SessionData r5 = r4._sessionDataRef
            boolean r5 = r5.getNerdModeEnabled()
            java.lang.String r1 = "currentlyLockedStickfigures"
            if (r5 != 0) goto L76
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r2.<init>(r3)
            r5.<init>(r1, r2)
            goto L88
        L76:
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r2.<init>(r3)
            r5.<init>(r1, r2)
        L88:
            r5.setWrap(r7)
            r5.setAlignment(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.addContent(r5)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.width(r1)
            r5.colspan(r6)
            r4.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r5 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalCopyStyle()
            r5.<init>(r1)
            r4._copyAllLockDataButton = r5
            org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog$1 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog$1
            r1.<init>(r4)
            r5.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r5 = r4._copyAllLockDataButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.addContent(r5)
            r1 = 16
            r5.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r5 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalPasteStyle()
            r5.<init>(r1)
            r4._pasteAllLockDataButton = r5
            org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog$2 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog$2
            r1.<init>(r4)
            r5.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r5 = r4._pasteAllLockDataButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.addContent(r5)
            r1 = 8
            r5.align(r1)
            r4.addContentRow()
            org.fortheloss.sticknodes.data.SessionData r5 = r4._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle[] r5 = r5.getCopiedFigureCameraLockBundles()
            if (r5 == 0) goto Leb
            int r5 = r5.length
            if (r5 > 0) goto Lfb
        Leb:
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r5 = r4._pasteAllLockDataButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r5.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r5 = r4._pasteAllLockDataButton
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = 1065353216(0x3f800000, float:1.0)
            r5.setColor(r2, r2, r2, r1)
        Lfb:
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r1 = "separator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r8.findRegion(r1)
            r5.<init>(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.addContent(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.padTop(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.padBottom(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.fillX()
            r5.colspan(r6)
            r4.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r5.<init>()
            r4._bundlesTable = r5
            r2 = 0
            r5.pad(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r4._bundlesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.space(r2)
            r5.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r4._bundlesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.addContent(r5)
            r5.colspan(r6)
            r4.addContentRow()
            r4.rebuildBundlesTable()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r4._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r5 = r5.getSessionData()
            boolean r5 = r5.getNerdModeEnabled()
            if (r5 != 0) goto L1c5
            com.badlogic.gdx.scenes.scene2d.ui.Image r5 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r8 = r8.findRegion(r1)
            r5.<init>(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.addContent(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.padTop(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.padBottom(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.fillX()
            r5.colspan(r6)
            r4.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r8 = "parallaxTitle"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r0.<init>(r1)
            r5.<init>(r8, r0)
            r5.setWrap(r7)
            r5.setAlignment(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.addContent(r5)
            int r8 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r8 = (float) r8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.width(r8)
            r5.colspan(r6)
            r4.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r8 = "parallaxInfo"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1)
            r5.<init>(r8, r0)
            r5.setWrap(r7)
            r5.setAlignment(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.addContent(r5)
            int r8 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r8 = (float) r8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.width(r8)
            r5.colspan(r6)
        L1c5:
            java.lang.String r5 = "okay"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4.createTextButton(r5)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.addButton(r5, r6)
            java.lang.String r5 = "chooseStickfigureToLock"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4.createTextButton(r5, r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r4.addButton(r5, r6)
            return
    }
}
