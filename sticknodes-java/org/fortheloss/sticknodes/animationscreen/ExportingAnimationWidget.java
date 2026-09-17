package org.fortheloss.sticknodes.animationscreen;

/* loaded from: classes2.dex */
public class ExportingAnimationWidget extends com.badlogic.gdx.scenes.scene2d.ui.Widget implements com.badlogic.gdx.utils.Disposable {
    private com.badlogic.gdx.graphics.g2d.Animation _animationRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _label;
    private float _timePassed;

    public ExportingAnimationWidget(com.badlogic.gdx.graphics.g2d.Animation<com.badlogic.gdx.graphics.g2d.TextureRegion> r4, com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle r5) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3._timePassed = r0
            r3._animationRef = r4
            java.lang.Object r4 = r4.getKeyFrame(r0)
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = (com.badlogic.gdx.graphics.g2d.TextureRegion) r4
            int r0 = r4.getRegionWidth()
            float r0 = (float) r0
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1096810496(0x41600000, float:14.0)
            float r1 = r1 * r2
            float r0 = r0 + r1
            int r4 = r4.getRegionHeight()
            float r4 = (float) r4
            r3.setSize(r0, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r0 = ""
            r4.<init>(r0, r5)
            r3._label = r4
            r5 = 1
            r4.setAlignment(r5)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r2) {
            r1 = this;
            float r0 = r1._timePassed
            float r0 = r0 + r2
            r1._timePassed = r0
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animationRef = r0
            r1._label = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r6, float r7) {
            r5 = this;
            super.draw(r6, r7)
            com.badlogic.gdx.graphics.g2d.Animation r0 = r5._animationRef
            float r1 = r5._timePassed
            java.lang.Object r0 = r0.getKeyFrame(r1)
            com.badlogic.gdx.graphics.g2d.TextureRegion r0 = (com.badlogic.gdx.graphics.g2d.TextureRegion) r0
            float r1 = r5.getX()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1096810496(0x41600000, float:14.0)
            float r2 = r2 * r3
            float r1 = r1 + r2
            float r2 = r5.getY()
            r6.draw(r0, r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r5._label
            float r1 = r5.getX()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1119354880(0x42b80000, float:92.0)
            float r2 = r2 * r3
            float r1 = r1 + r2
            float r2 = r5.getY()
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1116209152(0x42880000, float:68.0)
            float r3 = r3 * r4
            float r2 = r2 + r3
            r0.setPosition(r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r5._label
            r0.draw(r6, r7)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
            r1 = this;
            float r0 = r1.getHeight()
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
            r1 = this;
            float r0 = r1.getWidth()
            return r0
    }

    public void setText(java.lang.String r2) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r1._label
            r0.setText(r2)
            return
    }
}
