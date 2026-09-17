package org.fortheloss.framework;

/* loaded from: classes2.dex */
public class RepeatingImageTextButton extends com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton {
    private boolean _alternatingFlag;
    private float _delaySeconds;
    private boolean _flagCountPressSeconds;
    private float _pressSeconds;
    private boolean _repeatingHasBegun;

    public RepeatingImageTextButton(java.lang.String r1, com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle r2, float r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0._pressSeconds = r1
            r1 = 0
            r0._flagCountPressSeconds = r1
            r2 = 1
            r0._alternatingFlag = r2
            r0._repeatingHasBegun = r1
            r0._delaySeconds = r3
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.addVibration(r0, r1)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r2) {
            r1 = this;
            super.act(r2)
            boolean r0 = r1._flagCountPressSeconds
            if (r0 == 0) goto L29
            float r0 = r1._pressSeconds
            float r0 = r0 + r2
            r1._pressSeconds = r0
            float r2 = r1._delaySeconds
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L29
            boolean r2 = r1._repeatingHasBegun
            if (r2 != 0) goto L1a
            r2 = 4
            org.fortheloss.sticknodes.App.vibrate(r2)
        L1a:
            r2 = 1
            r1._repeatingHasBegun = r2
            boolean r0 = r1._alternatingFlag
            if (r0 == 0) goto L24
            r1.repeatFunction()
        L24:
            boolean r0 = r1._alternatingFlag
            r2 = r2 ^ r0
            r1._alternatingFlag = r2
        L29:
            return
    }

    public void beginPressCount() {
            r1 = this;
            r0 = 1
            r1._flagCountPressSeconds = r0
            return
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
            return
    }
}
