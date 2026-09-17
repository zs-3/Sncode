package org.fortheloss.sticknodes.animationscreen;

/* loaded from: classes2.dex */
public class ZoomButtons extends com.badlogic.gdx.scenes.scene2d.Group implements com.badlogic.gdx.utils.Disposable {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private int _buttonPressed;
    private float _buttonTimer;
    private org.fortheloss.sticknodes.animationscreen.modules.CanvasModule _canvasModuleRef;
    private float _delay;
    private boolean _incrementing;
    private com.badlogic.gdx.scenes.scene2d.ui.Button _minusButton;
    private int _padding;
    private com.badlogic.gdx.scenes.scene2d.ui.Button _plusButton;



    /* renamed from: -$$Nest$fget_canvasModuleRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.CanvasModule m329$$Nest$fget_canvasModuleRef(org.fortheloss.sticknodes.animationscreen.ZoomButtons r0) {
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r0._canvasModuleRef
            return r0
    }

    /* renamed from: -$$Nest$fget_minusButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Button m330$$Nest$fget_minusButton(org.fortheloss.sticknodes.animationscreen.ZoomButtons r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Button r0 = r0._minusButton
            return r0
    }

    /* renamed from: -$$Nest$fget_plusButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Button m331$$Nest$fget_plusButton(org.fortheloss.sticknodes.animationscreen.ZoomButtons r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Button r0 = r0._plusButton
            return r0
    }

    /* renamed from: -$$Nest$fput_buttonPressed, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m332$$Nest$fput_buttonPressed(org.fortheloss.sticknodes.animationscreen.ZoomButtons r0, int r1) {
            r0._buttonPressed = r1
            return
    }

    /* renamed from: -$$Nest$fput_buttonTimer, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m333$$Nest$fput_buttonTimer(org.fortheloss.sticknodes.animationscreen.ZoomButtons r0, float r1) {
            r0._buttonTimer = r1
            return
    }

    /* renamed from: -$$Nest$fput_delay, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m334$$Nest$fput_delay(org.fortheloss.sticknodes.animationscreen.ZoomButtons r0, float r1) {
            r0._delay = r1
            return
    }

    /* renamed from: -$$Nest$fput_incrementing, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m335$$Nest$fput_incrementing(org.fortheloss.sticknodes.animationscreen.ZoomButtons r0, boolean r1) {
            r0._incrementing = r1
            return
    }

    public ZoomButtons(org.fortheloss.sticknodes.animationscreen.AnimationScreen r4, org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3._padding = r0
            r3._buttonPressed = r0
            r3._incrementing = r0
            r1 = 0
            r3._buttonTimer = r1
            r3._delay = r1
            r3._animationScreenRef = r4
            r3._canvasModuleRef = r5
            com.badlogic.gdx.scenes.scene2d.ui.Button r4 = new com.badlogic.gdx.scenes.scene2d.ui.Button
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getZoomMinusButtonStyle()
            r4.<init>(r5)
            r3._minusButton = r4
            r5 = 1065353216(0x3f800000, float:1.0)
            r1 = 1056964608(0x3f000000, float:0.5)
            r4.setColor(r5, r5, r5, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Button r4 = r3._minusButton
            org.fortheloss.sticknodes.animationscreen.ZoomButtons$1 r2 = new org.fortheloss.sticknodes.animationscreen.ZoomButtons$1
            r2.<init>(r3)
            r4.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Button r4 = r3._minusButton
            r3.addActor(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Button r4 = new com.badlogic.gdx.scenes.scene2d.ui.Button
            com.badlogic.gdx.scenes.scene2d.ui.Button$ButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getZoomPlusButtonStyle()
            r4.<init>(r2)
            r3._plusButton = r4
            r4.setColor(r5, r5, r5, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Button r4 = r3._plusButton
            org.fortheloss.sticknodes.animationscreen.ZoomButtons$2 r5 = new org.fortheloss.sticknodes.animationscreen.ZoomButtons$2
            r5.<init>(r3)
            r4.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Button r4 = r3._plusButton
            r3.addActor(r4)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r5 = 1109393408(0x42200000, float:40.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            r3._padding = r4
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r3._animationScreenRef
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r4.getStage()
            r3.setTransform(r0)
            com.badlogic.gdx.scenes.scene2d.Touchable r5 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r3.setTouchable(r5)
            float r5 = r4.getWidth()
            float r4 = r4.getHeight()
            r3.setSize(r5, r4)
            r3.setLayout()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r3) {
            r2 = this;
            super.act(r3)
            int r0 = r2._buttonPressed
            if (r0 != 0) goto L8
            return
        L8:
            float r0 = r2._buttonTimer
            float r0 = r0 + r3
            r2._buttonTimer = r0
            float r3 = r2._delay
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 <= 0) goto L36
            boolean r3 = r2._incrementing
            r0 = 1
            if (r3 != 0) goto L1e
            r3 = 3
            org.fortheloss.sticknodes.App.vibrate(r3)
            r2._incrementing = r0
        L1e:
            float r3 = r2._delay
            r1 = 1028443341(0x3d4ccccd, float:0.05)
            float r3 = r3 + r1
            r2._delay = r3
            int r3 = r2._buttonPressed
            if (r3 != r0) goto L30
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.onZoomButtonClick(r0)
            goto L36
        L30:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r0 = -1
            r3.onZoomButtonClick(r0)
        L36:
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._animationScreenRef = r0
            r2._canvasModuleRef = r0
            com.badlogic.gdx.scenes.scene2d.ui.Button r1 = r2._minusButton
            if (r1 == 0) goto Le
            r1.clear()
            r2._minusButton = r0
        Le:
            com.badlogic.gdx.scenes.scene2d.ui.Button r1 = r2._plusButton
            if (r1 == 0) goto L17
            r1.clear()
            r2._plusButton = r0
        L17:
            r2.clear()
            r2.remove()
            return
    }

    public void setEnabled(boolean r1) {
            r0 = this;
            r0.setVisible(r1)
            return
    }

    public void setLayout() {
            r4 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            float r0 = r0.getWidth()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r4._animationScreenRef
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r1.getStage()
            r1.getHeight()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r4._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r1 = r1.getSessionData()
            boolean r1 = r1.getIsLeftHandMode()
            if (r1 != 0) goto L4d
            com.badlogic.gdx.scenes.scene2d.ui.Button r1 = r4._minusButton
            com.badlogic.gdx.scenes.scene2d.ui.Button r2 = r4._plusButton
            float r2 = r2.getWidth()
            float r0 = r0 - r2
            int r2 = r4._padding
            float r3 = (float) r2
            float r0 = r0 - r3
            float r2 = (float) r2
            r1.setPosition(r0, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Button r0 = r4._plusButton
            com.badlogic.gdx.scenes.scene2d.ui.Button r1 = r4._minusButton
            float r1 = r1.getX()
            com.badlogic.gdx.scenes.scene2d.ui.Button r2 = r4._minusButton
            float r2 = r2.getY()
            com.badlogic.gdx.scenes.scene2d.ui.Button r3 = r4._minusButton
            float r3 = r3.getHeight()
            float r2 = r2 + r3
            int r3 = r4._padding
            float r3 = (float) r3
            float r2 = r2 + r3
            r0.setPosition(r1, r2)
            goto L72
        L4d:
            com.badlogic.gdx.scenes.scene2d.ui.Button r0 = r4._minusButton
            int r1 = r4._padding
            float r2 = (float) r1
            float r1 = (float) r1
            r0.setPosition(r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Button r0 = r4._plusButton
            com.badlogic.gdx.scenes.scene2d.ui.Button r1 = r4._minusButton
            float r1 = r1.getX()
            com.badlogic.gdx.scenes.scene2d.ui.Button r2 = r4._minusButton
            float r2 = r2.getY()
            com.badlogic.gdx.scenes.scene2d.ui.Button r3 = r4._minusButton
            float r3 = r3.getHeight()
            float r2 = r2 + r3
            int r3 = r4._padding
            float r3 = (float) r3
            float r2 = r2 + r3
            r0.setPosition(r1, r2)
        L72:
            return
    }
}
