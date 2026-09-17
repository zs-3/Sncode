package org.fortheloss.sticknodes.animationscreen;

/* loaded from: classes2.dex */
public class TooltipManager extends com.badlogic.gdx.scenes.scene2d.Actor implements com.badlogic.gdx.utils.Disposable {
    private boolean _isComplete;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.Tooltip> _tooltips;

    public TooltipManager() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._isComplete = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r5) {
            r4 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.Tooltip> r0 = r4._tooltips
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L27
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.Tooltip> r2 = r4._tooltips
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.animationscreen.Tooltip r2 = (org.fortheloss.sticknodes.animationscreen.Tooltip) r2
            boolean r3 = r2.isComplete()
            if (r3 == 0) goto L21
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.Tooltip> r3 = r4._tooltips
            r3.remove(r2)
            r2.dispose()
            goto L24
        L21:
            r2.act(r5)
        L24:
            int r0 = r0 + (-1)
            goto L8
        L27:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.Tooltip> r5 = r4._tooltips
            int r5 = r5.size()
            if (r5 > 0) goto L31
            r4._isComplete = r1
        L31:
            return
    }

    public void addTooltip(org.fortheloss.sticknodes.animationscreen.Tooltip r2) {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.Tooltip> r0 = r1._tooltips
            r0.add(r2)
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.Tooltip> r0 = r2._tooltips
            if (r0 == 0) goto L1d
            int r0 = r0.size()
            int r0 = r0 + (-1)
        La:
            if (r0 < 0) goto L1a
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.Tooltip> r1 = r2._tooltips
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.animationscreen.Tooltip r1 = (org.fortheloss.sticknodes.animationscreen.Tooltip) r1
            r1.dispose()
            int r0 = r0 + (-1)
            goto La
        L1a:
            r0 = 0
            r2._tooltips = r0
        L1d:
            r2.remove()
            r2.clear()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r2, float r3) {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.Tooltip> r3 = r1._tooltips
            if (r3 == 0) goto L1a
            int r3 = r3.size()
            int r3 = r3 + (-1)
        La:
            if (r3 < 0) goto L1a
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.Tooltip> r0 = r1._tooltips
            java.lang.Object r0 = r0.get(r3)
            org.fortheloss.sticknodes.animationscreen.Tooltip r0 = (org.fortheloss.sticknodes.animationscreen.Tooltip) r0
            r0.draw(r2)
            int r3 = r3 + (-1)
            goto La
        L1a:
            return
    }

    public void initialize() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 5
            r0.<init>(r1)
            r2._tooltips = r0
            return
    }

    public boolean isComplete() {
            r1 = this;
            boolean r0 = r1._isComplete
            return r0
    }
}
