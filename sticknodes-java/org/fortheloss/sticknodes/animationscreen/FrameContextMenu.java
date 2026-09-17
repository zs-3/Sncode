package org.fortheloss.sticknodes.animationscreen;

/* loaded from: classes2.dex */
public class FrameContextMenu extends com.badlogic.gdx.scenes.scene2d.ui.Window implements com.badlogic.gdx.utils.Disposable {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _copyAmountLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _copyButton;
    private org.fortheloss.framework.RepeatingTextButton _copyMinus;
    private org.fortheloss.framework.RepeatingTextButton _copyPlus;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _copyPlusButton;
    private org.fortheloss.sticknodes.data.IFrameData _frameDataRef;
    private org.fortheloss.sticknodes.animationscreen.modules.FramesModule _framesModuleRef;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _iconTR;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _instructionsLabel;
    private int _numExtraFramesToCopy;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _pasteButton;
    private com.badlogic.gdx.scenes.scene2d.InputListener _stageListener;









    /* renamed from: -$$Nest$fget_numExtraFramesToCopy, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m225$$Nest$fget_numExtraFramesToCopy(org.fortheloss.sticknodes.animationscreen.FrameContextMenu r0) {
            int r0 = r0._numExtraFramesToCopy
            return r0
    }

    /* renamed from: -$$Nest$monCopyFrameClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m226$$Nest$monCopyFrameClick(org.fortheloss.sticknodes.animationscreen.FrameContextMenu r0, int r1) {
            r0.onCopyFrameClick(r1)
            return
    }

    /* renamed from: -$$Nest$monIncrementNumFramesToCopy, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m227$$Nest$monIncrementNumFramesToCopy(org.fortheloss.sticknodes.animationscreen.FrameContextMenu r0, int r1) {
            r0.onIncrementNumFramesToCopy(r1)
            return
    }

    /* renamed from: -$$Nest$monPasteFrameClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m228$$Nest$monPasteFrameClick(org.fortheloss.sticknodes.animationscreen.FrameContextMenu r0) {
            r0.onPasteFrameClick()
            return
    }

    public FrameContextMenu(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2, com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle r3) {
            r1 = this;
            java.lang.String r0 = ""
            r1.<init>(r0, r3)
            r3 = 1
            r1._numExtraFramesToCopy = r3
            r1._animationScreenRef = r2
            return
    }

    private void onCopyFrameClick(int r4) {
            r3 = this;
            if (r4 != 0) goto L13
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r3._frameDataRef
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2 = r3._framesModuleRef
            org.fortheloss.sticknodes.animationscreen.FramesContainer r2 = r2.getFramesContainer()
            int r2 = r2.getUID()
            r0.copyFrame(r1, r2)
        L13:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r3._frameDataRef
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2 = r3._framesModuleRef
            org.fortheloss.sticknodes.animationscreen.FramesContainer r2 = r2.getFramesContainer()
            int r2 = r2.getUID()
            r0.copyFrames(r1, r4, r2)
            return
    }

    private void onIncrementNumFramesToCopy(int r2) {
            r1 = this;
            int r0 = r1._numExtraFramesToCopy
            int r0 = r0 + r2
            r1._numExtraFramesToCopy = r0
            r2 = 1
            if (r0 >= r2) goto Lb
            r1._numExtraFramesToCopy = r2
            goto L11
        Lb:
            r2 = 25
            if (r0 <= r2) goto L11
            r1._numExtraFramesToCopy = r2
        L11:
            r1.updateTexts()
            return
    }

    private void onPasteFrameClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.pasteFrame()
            return
    }

    private void updateTexts() {
            r4 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            int r0 = r0.getNumCopiedFrames()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= 0) goto L1b
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._pasteButton
            r0.setColor(r1, r1, r1, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._pasteButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r1)
            goto L29
        L1b:
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._pasteButton
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r1, r1, r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._pasteButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r1)
        L29:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r4._copyPlusButton
            java.lang.String r1 = "copy"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            int r2 = r4._numExtraFramesToCopy
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = "\n+"
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.setText(r1)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r4._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r4._frameDataRef
            int r0 = r0.getFrameIndex(r1)
            int r1 = r4._numExtraFramesToCopy
            int r0 = r0 + r1
            r1 = 1
            int r0 = r0 + r1
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2 = r4._framesModuleRef
            org.fortheloss.sticknodes.animationscreen.FramesContainer r2 = r2.getFramesContainer()
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r2.frames
            int r2 = r2.size()
            int r0 = java.lang.Math.min(r0, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r4._copyAmountLabel
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r3] = r0
            java.lang.String r0 = "copyContextFrames"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0, r1)
            r2.setText(r0)
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 1
            r1.hide(r0)
            r0 = 0
            r1._animationScreenRef = r0
            r1._frameDataRef = r0
            r1._framesModuleRef = r0
            r1._stageListener = r0
            r1._iconTR = r0
            r1._copyButton = r0
            r1._pasteButton = r0
            r1._instructionsLabel = r0
            r1._copyPlusButton = r0
            r1._copyPlus = r0
            r1._copyMinus = r0
            r1._copyAmountLabel = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Window, com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r5, float r6) {
            r4 = this;
            super.draw(r5, r6)
            com.badlogic.gdx.graphics.Color r6 = r4.getColor()
            float r6 = r6.a
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.setColor(r0, r0, r0, r6)
            com.badlogic.gdx.graphics.g2d.TextureRegion r6 = r4._iconTR
            float r0 = r4.getX()
            float r1 = r4.getY()
            float r2 = r4.getHeight()
            float r1 = r1 + r2
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1090519040(0x41000000, float:8.0)
            float r2 = r2 * r3
            float r1 = r1 - r2
            r5.draw(r6, r0, r1)
            return
    }

    public void hide(boolean r3) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r2.getStage()
            if (r0 == 0) goto L28
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r2.getStage()
            com.badlogic.gdx.scenes.scene2d.InputListener r1 = r2._stageListener
            r0.removeListener(r1)
            if (r3 != 0) goto L25
            r3 = 0
            r0 = 1053609165(0x3ecccccd, float:0.4)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r3, r0)
            com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.removeActor()
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r3, r0)
            r2.addAction(r3)
            goto L28
        L25:
            r2.remove()
        L28:
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r12) {
            r11 = this;
            java.lang.String r0 = "frame-copy-button-selected"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r12 = r12.findRegion(r0)
            r11._iconTR = r12
            r12 = 0
            r11.setModal(r12)
            r11.setMovable(r12)
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            r0 = 1139146752(0x43e60000, float:460.0)
            float r12 = r12 * r0
            r11.setWidth(r12)
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            r0 = 1092616192(0x41200000, float:10.0)
            float r12 = r12 * r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            r1 = 2
            r0.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.defaults()
            r3 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.space(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.spaceRight(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.spaceBottom(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.pad(r3)
            r2.expand()
            r2 = 1082130432(0x40800000, float:4.0)
            float r4 = r12 * r2
            r5 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 * r5
            r0.pad(r4, r12, r4, r12)
            r11.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r4 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCopyButtonStyle()
            r4.<init>(r5)
            r11._copyButton = r4
            org.fortheloss.sticknodes.animationscreen.FrameContextMenu$1 r5 = new org.fortheloss.sticknodes.animationscreen.FrameContextMenu$1
            r5.<init>(r11)
            r4.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r4 = r11._copyButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.add(r4)
            r5 = 16
            r4.align(r5)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r4 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getPasteButtonStyle()
            r4.<init>(r6)
            r11._pasteButton = r4
            org.fortheloss.sticknodes.animationscreen.FrameContextMenu$2 r6 = new org.fortheloss.sticknodes.animationscreen.FrameContextMenu$2
            r6.<init>(r11)
            r4.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r4 = r11._pasteButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.add(r4)
            r6 = 8
            r4.align(r6)
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r7 = "copyContextInfoNew"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r4.<init>(r7, r8)
            r11._instructionsLabel = r4
            r7 = 1
            r4.setWrap(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r11._instructionsLabel
            r4.setAlignment(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r11._instructionsLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.add(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.align(r7)
            float r8 = r11.getWidth()
            float r8 = r8 - r12
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.width(r8)
            r4.colspan(r1)
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            java.lang.String r8 = "copy"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = "\n+1"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            r4.<init>(r8, r9)
            r11._copyPlusButton = r4
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r4.getLabel()
            r4.setWrap(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r11._copyPlusButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = r4.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.getCell(r8)
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r8 * r2
            float r8 = r8 * r2
            r4.pad(r3, r9, r3, r8)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r11._copyPlusButton
            org.fortheloss.sticknodes.animationscreen.FrameContextMenu$3 r8 = new org.fortheloss.sticknodes.animationscreen.FrameContextMenu$3
            r8.<init>(r11)
            r4.addListener(r8)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r11._copyPlusButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.add(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.align(r7)
            r4.colspan(r1)
            r0.row()
            org.fortheloss.sticknodes.animationscreen.FrameContextMenu$4 r4 = new org.fortheloss.sticknodes.animationscreen.FrameContextMenu$4
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            java.lang.String r9 = "-"
            r10 = 1045220557(0x3e4ccccd, float:0.2)
            r4.<init>(r11, r9, r8, r10)
            r11._copyMinus = r4
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r4.getLabel()
            r4.setWrap(r7)
            org.fortheloss.framework.RepeatingTextButton r4 = r11._copyMinus
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = r4.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.getCell(r8)
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r8 * r2
            float r8 = r8 * r2
            r4.pad(r3, r9, r3, r8)
            org.fortheloss.framework.RepeatingTextButton r4 = r11._copyMinus
            org.fortheloss.sticknodes.animationscreen.FrameContextMenu$5 r8 = new org.fortheloss.sticknodes.animationscreen.FrameContextMenu$5
            r8.<init>(r11)
            r4.addListener(r8)
            org.fortheloss.framework.RepeatingTextButton r4 = r11._copyMinus
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.add(r4)
            r4.align(r5)
            org.fortheloss.sticknodes.animationscreen.FrameContextMenu$6 r4 = new org.fortheloss.sticknodes.animationscreen.FrameContextMenu$6
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            java.lang.String r8 = "+"
            r4.<init>(r11, r8, r5, r10)
            r11._copyPlus = r4
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r4.getLabel()
            r4.setWrap(r7)
            org.fortheloss.framework.RepeatingTextButton r4 = r11._copyPlus
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.getCell(r5)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r5 * r2
            float r5 = r5 * r2
            r4.pad(r3, r8, r3, r5)
            org.fortheloss.framework.RepeatingTextButton r2 = r11._copyPlus
            org.fortheloss.sticknodes.animationscreen.FrameContextMenu$7 r3 = new org.fortheloss.sticknodes.animationscreen.FrameContextMenu$7
            r3.<init>(r11)
            r2.addListener(r3)
            org.fortheloss.framework.RepeatingTextButton r2 = r11._copyPlus
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.add(r2)
            r2.align(r6)
            r0.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            java.lang.String r4 = ""
            r2.<init>(r4, r3)
            r11._copyAmountLabel = r2
            r2.setWrap(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r11._copyAmountLabel
            r2.setAlignment(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r11._copyAmountLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r7)
            float r2 = r11.getWidth()
            float r2 = r2 - r12
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = r0.width(r2)
            r12.colspan(r1)
            r11.pack()
            return
    }

    public void show(com.badlogic.gdx.scenes.scene2d.Stage r1, org.fortheloss.sticknodes.data.IFrameData r2, org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3, float r4, float r5) {
            r0 = this;
            r0._frameDataRef = r2
            r0._framesModuleRef = r3
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1082130432(0x40800000, float:4.0)
            float r2 = r2 * r3
            float r4 = r4 - r2
            int r2 = (int) r4
            float r2 = (float) r2
            float r3 = r0.getHeight()
            float r5 = r5 - r3
            com.badlogic.gdx.graphics.g2d.TextureRegion r3 = r0._iconTR
            int r3 = r3.getRegionHeight()
            float r3 = (float) r3
            float r5 = r5 + r3
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1109393408(0x42200000, float:40.0)
            float r3 = r3 * r4
            float r5 = r5 - r3
            int r3 = (int) r5
            float r3 = (float) r3
            r0.setPosition(r2, r3)
            com.badlogic.gdx.scenes.scene2d.InputListener r2 = r0._stageListener
            if (r2 != 0) goto L31
            org.fortheloss.sticknodes.animationscreen.FrameContextMenu$8 r2 = new org.fortheloss.sticknodes.animationscreen.FrameContextMenu$8
            r2.<init>(r0)
            r0._stageListener = r2
        L31:
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.setColor(r3, r3, r3, r2)
            r1.addActor(r0)
            com.badlogic.gdx.scenes.scene2d.InputListener r2 = r0._stageListener
            r1.addListener(r2)
            r1 = 1050253722(0x3e99999a, float:0.3)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.alpha(r3, r1)
            r0.addAction(r1)
            r0.updateTexts()
            return
    }
}
