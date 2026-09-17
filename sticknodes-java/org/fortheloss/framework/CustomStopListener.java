package org.fortheloss.framework;

/* loaded from: classes2.dex */
public class CustomStopListener extends com.badlogic.gdx.scenes.scene2d.InputListener {
    public CustomStopListener() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.InputListener
    public boolean touchDown(com.badlogic.gdx.scenes.scene2d.InputEvent r1, float r2, float r3, int r4, int r5) {
            r0 = this;
            super.touchDown(r1, r2, r3, r4, r5)
            r1.stop()
            r1 = 0
            return r1
    }
}
