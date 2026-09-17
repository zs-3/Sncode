package org.fortheloss.sticknodes.animationscreen.qrt;

/* loaded from: classes2.dex */
public class QrtButtonPressAndHold extends org.fortheloss.sticknodes.animationscreen.qrt.QrtButton {
    private float mHoldSeconds;
    private boolean mThresholdPassed;

    public QrtButtonPressAndHold(org.fortheloss.sticknodes.animationscreen.qrt.QrtButton.QrtButtonStyle r1, org.fortheloss.sticknodes.animationscreen.qrt.QuickResizeToolDocked r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.mHoldSeconds = r1
            r1 = 0
            r0.mThresholdPassed = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.qrt.QrtButton, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r3) {
            r2 = this;
            super.act(r3)
            boolean r0 = r2.isPressed()
            if (r0 == 0) goto L32
            float r0 = r2.mHoldSeconds
            float r0 = r0 + r3
            r2.mHoldSeconds = r0
            boolean r3 = r2.mThresholdPassed
            r1 = 0
            if (r3 != 0) goto L26
            r3 = 1048576000(0x3e800000, float:0.25)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 <= 0) goto L32
            r3 = 1
            r2.mThresholdPassed = r3
            r2.mHoldSeconds = r1
            r2.onClick()
            r3 = 4
            org.fortheloss.sticknodes.App.vibrate(r3)
            goto L32
        L26:
            r3 = 1028443341(0x3d4ccccd, float:0.05)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 <= 0) goto L32
            r2.onClick()
            r2.mHoldSeconds = r1
        L32:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.qrt.QrtButton
    protected void doClickVibration() {
            r1 = this;
            boolean r0 = r1.mThresholdPassed
            if (r0 != 0) goto L7
            super.doClickVibration()
        L7:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.qrt.QrtButton
    public void onTouchUp(float r1, float r2) {
            r0 = this;
            super.onTouchUp(r1, r2)
            boolean r1 = r0.mThresholdPassed
            if (r1 == 0) goto Lb
            r1 = 2
            org.fortheloss.sticknodes.App.vibrate(r1)
        Lb:
            r1 = 0
            r0.mHoldSeconds = r1
            r1 = 0
            r0.mThresholdPassed = r1
            return
    }
}
