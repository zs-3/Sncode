package com.badlogic.gdx.scenes.scene2d.utils;

/* loaded from: classes.dex */
public class ClickListener extends com.badlogic.gdx.scenes.scene2d.InputListener {
    public static float visualPressedDuration = 0.1f;
    private int button;
    private boolean cancelled;
    private long lastTapTime;
    private boolean over;
    private boolean pressed;
    private int pressedButton;
    private int pressedPointer;
    private int tapCount;
    private long tapCountInterval;
    private float tapSquareSize;
    private float touchDownX;
    private float touchDownY;
    private long visualPressedTime;

    static {
            return
    }

    public ClickListener() {
            r2 = this;
            r2.<init>()
            r0 = 1096810496(0x41600000, float:14.0)
            r2.tapSquareSize = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.touchDownX = r0
            r2.touchDownY = r0
            r0 = -1
            r2.pressedPointer = r0
            r2.pressedButton = r0
            r0 = 400000000(0x17d78400, double:1.976262583E-315)
            r2.tapCountInterval = r0
            return
    }

    public void cancel() {
            r2 = this;
            int r0 = r2.pressedPointer
            r1 = -1
            if (r0 != r1) goto L6
            return
        L6:
            r0 = 1
            r2.cancelled = r0
            r0 = 0
            r2.pressed = r0
            return
    }

    public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3) {
            r0 = this;
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.InputListener
    public void enter(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3, int r4, com.badlogic.gdx.scenes.scene2d.Actor r5) {
            r0 = this;
            r1 = -1
            if (r4 != r1) goto La
            boolean r1 = r0.cancelled
            if (r1 != 0) goto La
            r1 = 1
            r0.over = r1
        La:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.InputListener
    public void exit(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3, int r4, com.badlogic.gdx.scenes.scene2d.Actor r5) {
            r0 = this;
            r1 = -1
            if (r4 != r1) goto La
            boolean r1 = r0.cancelled
            if (r1 != 0) goto La
            r1 = 0
            r0.over = r1
        La:
            return
    }

    public int getPressedPointer() {
            r1 = this;
            int r0 = r1.pressedPointer
            return r0
    }

    public int getTapCount() {
            r1 = this;
            int r0 = r1.tapCount
            return r0
    }

    public float getTouchDownX() {
            r1 = this;
            float r0 = r1.touchDownX
            return r0
    }

    public float getTouchDownY() {
            r1 = this;
            float r0 = r1.touchDownY
            return r0
    }

    public boolean inTapSquare(float r5, float r6) {
            r4 = this;
            float r0 = r4.touchDownX
            r1 = 0
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L10
            float r3 = r4.touchDownY
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto L10
            return r1
        L10:
            float r5 = r5 - r0
            float r5 = java.lang.Math.abs(r5)
            float r0 = r4.tapSquareSize
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 >= 0) goto L29
            float r5 = r4.touchDownY
            float r6 = r6 - r5
            float r5 = java.lang.Math.abs(r6)
            float r6 = r4.tapSquareSize
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L29
            r1 = 1
        L29:
            return r1
    }

    public void invalidateTapSquare() {
            r1 = this;
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.touchDownX = r0
            r1.touchDownY = r0
            return
    }

    public boolean isOver() {
            r1 = this;
            boolean r0 = r1.over
            if (r0 != 0) goto Lb
            boolean r0 = r1.pressed
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    public boolean isOver(com.badlogic.gdx.scenes.scene2d.Actor r3, float r4, float r5) {
            r2 = this;
            r0 = 1
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r3.hit(r4, r5, r0)
            if (r1 == 0) goto Lf
            boolean r3 = r1.isDescendantOf(r3)
            if (r3 != 0) goto Le
            goto Lf
        Le:
            return r0
        Lf:
            boolean r3 = r2.inTapSquare(r4, r5)
            return r3
    }

    public boolean isPressed() {
            r1 = this;
            boolean r0 = r1.pressed
            return r0
    }

    public boolean isVisualPressed() {
            r9 = this;
            boolean r0 = r9.pressed
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            long r2 = r9.visualPressedTime
            r0 = 0
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L10
            return r0
        L10:
            long r6 = com.badlogic.gdx.utils.TimeUtils.millis()
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 <= 0) goto L19
            return r1
        L19:
            r9.visualPressedTime = r4
            return r0
    }

    public void setTapCountInterval(float r3) {
            r2 = this;
            r0 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 * r0
            long r0 = (long) r3
            r2.tapCountInterval = r0
            return
    }

    public void setVisualPressed(boolean r5) {
            r4 = this;
            if (r5 == 0) goto L11
            long r0 = com.badlogic.gdx.utils.TimeUtils.millis()
            float r5 = com.badlogic.gdx.scenes.scene2d.utils.ClickListener.visualPressedDuration
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r5 * r2
            long r2 = (long) r5
            long r0 = r0 + r2
            r4.visualPressedTime = r0
            goto L15
        L11:
            r0 = 0
            r4.visualPressedTime = r0
        L15:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.InputListener
    public boolean touchDown(com.badlogic.gdx.scenes.scene2d.InputEvent r3, float r4, float r5, int r6, int r7) {
            r2 = this;
            boolean r3 = r2.pressed
            r0 = 0
            if (r3 == 0) goto L6
            return r0
        L6:
            if (r6 != 0) goto L10
            int r3 = r2.button
            r1 = -1
            if (r3 == r1) goto L10
            if (r7 == r3) goto L10
            return r0
        L10:
            r3 = 1
            r2.pressed = r3
            r2.pressedPointer = r6
            r2.pressedButton = r7
            r2.touchDownX = r4
            r2.touchDownY = r5
            r2.setVisualPressed(r3)
            return r3
    }

    @Override // com.badlogic.gdx.scenes.scene2d.InputListener
    public void touchDragged(com.badlogic.gdx.scenes.scene2d.InputEvent r2, float r3, float r4, int r5) {
            r1 = this;
            int r0 = r1.pressedPointer
            if (r5 != r0) goto L18
            boolean r5 = r1.cancelled
            if (r5 == 0) goto L9
            goto L18
        L9:
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r2.getListenerActor()
            boolean r2 = r1.isOver(r2, r3, r4)
            r1.pressed = r2
            if (r2 != 0) goto L18
            r1.invalidateTapSquare()
        L18:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.InputListener
    public void touchUp(com.badlogic.gdx.scenes.scene2d.InputEvent r8, float r9, float r10, int r11, int r12) {
            r7 = this;
            int r0 = r7.pressedPointer
            if (r11 != r0) goto L42
            boolean r0 = r7.cancelled
            r1 = -1
            r2 = 0
            if (r0 != 0) goto L3a
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r8.getListenerActor()
            boolean r0 = r7.isOver(r0, r9, r10)
            if (r0 == 0) goto L1d
            if (r11 != 0) goto L1d
            int r11 = r7.button
            if (r11 == r1) goto L1d
            if (r12 == r11) goto L1d
            r0 = 0
        L1d:
            if (r0 == 0) goto L3a
            long r11 = com.badlogic.gdx.utils.TimeUtils.nanoTime()
            long r3 = r7.lastTapTime
            long r3 = r11 - r3
            long r5 = r7.tapCountInterval
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L2f
            r7.tapCount = r2
        L2f:
            int r0 = r7.tapCount
            int r0 = r0 + 1
            r7.tapCount = r0
            r7.lastTapTime = r11
            r7.clicked(r8, r9, r10)
        L3a:
            r7.pressed = r2
            r7.pressedPointer = r1
            r7.pressedButton = r1
            r7.cancelled = r2
        L42:
            return
    }
}
