package org.fortheloss.sticknodes;

/* loaded from: classes2.dex */
public class TransitionAdScreenForParrots extends org.fortheloss.framework.AppScreen implements org.fortheloss.framework.IAdListener {
    public static long lastShowTime;
    private int _frameDelay;
    private boolean _isFirstAnimationScreenSinceAppStart;
    private org.fortheloss.sticknodes.data.ProjectData _projectDataRef;
    private int _state;

    static {
            return
    }

    public TransitionAdScreenForParrots(org.fortheloss.sticknodes.App r4, org.fortheloss.sticknodes.data.ProjectData r5, boolean r6) {
            r3 = this;
            r3.<init>(r4)
            r4 = 0
            r3._state = r4
            r3._frameDelay = r4
            r3._projectDataRef = r5
            r3._isFirstAnimationScreenSinceAppStart = r6
            long r5 = java.lang.System.nanoTime()
            long r0 = org.fortheloss.sticknodes.TransitionAdScreenForParrots.lastShowTime
            long r5 = r5 - r0
            double r5 = (double) r5
            r0 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r5 = r5 / r0
            r0 = 4633641066610819072(0x404e000000000000, double:60.0)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L24
            r4 = 2
            r3._state = r4
            goto L26
        L24:
            r3._state = r4
        L26:
            return
    }

    @Override // org.fortheloss.framework.AppScreen, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._projectDataRef = r0
            super.dispose()
            return
    }

    @Override // org.fortheloss.framework.AppScreen
    protected void loadAssets() {
            r1 = this;
            r0 = 0
            r1._screenState = r0
            return
    }

    @Override // org.fortheloss.framework.IAdListener
    public void onAdClosed() {
            r1 = this;
            r0 = 2
            r1._state = r0
            return
    }

    @Override // org.fortheloss.framework.AppScreen
    public void update(float r5) {
            r4 = this;
            int r5 = r4._screenState
            if (r5 != 0) goto L37
            int r5 = r4._state
            r0 = 1
            if (r5 != 0) goto L17
            r4._state = r0
            long r0 = java.lang.System.nanoTime()
            org.fortheloss.sticknodes.TransitionAdScreenForParrots.lastShowTime = r0
            org.fortheloss.framework.IPlatform r5 = org.fortheloss.sticknodes.App.platform
            r5.displayInterstitialAd(r4)
            goto L37
        L17:
            r1 = 2
            if (r5 != r1) goto L37
            int r5 = r4._frameDelay
            r1 = 60
            if (r5 >= r1) goto L24
            int r5 = r5 + r0
            r4._frameDelay = r5
            goto L37
        L24:
            r5 = 3
            r4._state = r5
            org.fortheloss.sticknodes.App r5 = r4._appRef
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = new org.fortheloss.sticknodes.animationscreen.AnimationScreen
            org.fortheloss.sticknodes.App r1 = r4._appRef
            org.fortheloss.sticknodes.data.ProjectData r2 = r4._projectDataRef
            boolean r3 = r4._isFirstAnimationScreenSinceAppStart
            r0.<init>(r1, r2, r3)
            r5.setScreen(r0)
        L37:
            return
    }
}
