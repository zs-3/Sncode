package org.fortheloss.framework;

/* loaded from: classes2.dex */
public class RepeatingTextButton extends com.badlogic.gdx.scenes.scene2d.ui.TextButton {
    private boolean _alternatingFlag;
    private float _delaySeconds;
    private boolean _flagCountPressSeconds;
    private float _pressSeconds;
    private boolean _repeatingHasBegun;
    private float mRepeatSpeed;

    public RepeatingTextButton(java.lang.String r2, com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle r3, float r4) {
            r1 = this;
            r1.<init>(r2, r3)
            r2 = 0
            r1._pressSeconds = r2
            r3 = 0
            r1._flagCountPressSeconds = r3
            r0 = 1
            r1._alternatingFlag = r0
            r1._repeatingHasBegun = r3
            r1.mRepeatSpeed = r2
            r1._delaySeconds = r4
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.addVibration(r1, r3)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r5) {
            r4 = this;
            super.act(r5)
            boolean r0 = r4._flagCountPressSeconds
            if (r0 == 0) goto L43
            float r0 = r4._pressSeconds
            float r0 = r0 + r5
            r4._pressSeconds = r0
            float r5 = r4._delaySeconds
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 <= 0) goto L29
            boolean r5 = r4._repeatingHasBegun
            if (r5 != 0) goto L1a
            r5 = 4
            org.fortheloss.sticknodes.App.vibrate(r5)
        L1a:
            r5 = 1
            r4._repeatingHasBegun = r5
            boolean r0 = r4._alternatingFlag
            if (r0 == 0) goto L24
            r4.repeatFunction()
        L24:
            boolean r0 = r4._alternatingFlag
            r5 = r5 ^ r0
            r4._alternatingFlag = r5
        L29:
            float r5 = r4._pressSeconds
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r5 = com.badlogic.gdx.math.MathUtils.clamp(r5, r0, r1)
            r2 = 1056964608(0x3f000000, float:0.5)
            com.badlogic.gdx.math.Interpolation r3 = com.badlogic.gdx.math.Interpolation.sineIn
            float r5 = r3.apply(r0, r1, r5)
            float r5 = java.lang.Math.max(r2, r5)
            r4.mRepeatSpeed = r5
        L43:
            return
    }

    public void beginPressCount() {
            r1 = this;
            r0 = 1
            r1._flagCountPressSeconds = r0
            return
    }

    public float getNormalizedSpeed() {
            r1 = this;
            float r0 = r1.mRepeatSpeed
            return r0
    }

    public boolean isRepeating() {
            r1 = this;
            boolean r0 = r1._repeatingHasBegun
            return r0
    }

    protected void repeatFunction() {
            r0 = this;
            return
    }

    public void stopPressCount() {
            r1 = this;
            r0 = 0
            r1._flagCountPressSeconds = r0
            r1._repeatingHasBegun = r0
            r0 = 0
            r1._pressSeconds = r0
            r1.mRepeatSpeed = r0
            return
    }
}
