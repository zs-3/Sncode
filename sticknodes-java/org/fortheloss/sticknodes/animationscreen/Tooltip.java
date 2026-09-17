package org.fortheloss.sticknodes.animationscreen;

/* loaded from: classes2.dex */
public class Tooltip implements com.badlogic.gdx.utils.Disposable {
    private float _alpha;
    private float _arrowOffsetX;
    private float _arrowOffsetY;
    private float _arrowRotation;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _arrowTR;
    private com.badlogic.gdx.scenes.scene2d.utils.ClickListener _focusActorClickListener;
    private com.badlogic.gdx.scenes.scene2d.Actor _focusActorRef;
    private float _height;
    private boolean _isComplete;
    private boolean _isUp;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _label;
    private int _mode;
    private float _offsetX;
    private float _offsetY;
    private org.fortheloss.sticknodes.data.SessionData _sessionDataRef;
    private int _sessionSelectionGoal;
    private float _squareHeight;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _squareTR;
    private float _squareWidth;
    private float _timePassed;
    private float _width;
    private float _x;
    private float _y;

    public Tooltip(org.fortheloss.sticknodes.data.SessionData r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3._sessionSelectionGoal = r0
            r1 = 0
            r3._x = r1
            r3._y = r1
            r3._width = r1
            r3._height = r1
            r3._squareWidth = r1
            r3._squareHeight = r1
            r3._arrowOffsetX = r1
            r3._arrowOffsetY = r1
            r3._arrowRotation = r1
            r3._isUp = r0
            r3._offsetX = r1
            r3._offsetY = r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r3._alpha = r2
            r3._timePassed = r1
            r3._isComplete = r0
            r3._mode = r0
            r3._sessionDataRef = r4
            return
    }

    private void beginFading() {
            r1 = this;
            r0 = 1
            r1._mode = r0
            return
    }

    public void act(float r4) {
            r3 = this;
            float r0 = r3._timePassed
            r1 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 * r4
            float r0 = r0 + r1
            r3._timePassed = r0
            double r0 = (double) r0
            double r0 = java.lang.Math.sin(r0)
            float r0 = (float) r0
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 * r2
            boolean r2 = r3._isUp
            if (r2 == 0) goto L20
            float r2 = -r1
            float r1 = r1 * r0
            float r2 = r2 - r1
            r3._offsetY = r2
            goto L25
        L20:
            float r0 = r0 * r1
            float r1 = r1 + r0
            r3._offsetX = r1
        L25:
            int r0 = r3._mode
            if (r0 != 0) goto L3a
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r3._focusActorRef
            if (r0 != 0) goto L3a
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            int r0 = r0.getCurrentlySelected()
            int r1 = r3._sessionSelectionGoal
            if (r0 != r1) goto L3a
            r3.beginFading()
        L3a:
            int r0 = r3._mode
            r1 = 1
            if (r0 != r1) goto L4d
            float r0 = r3._alpha
            float r0 = r0 - r4
            r3._alpha = r0
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L4d
            r3._alpha = r4
            r3._isComplete = r1
        L4d:
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            r0 = 0
            r3._sessionDataRef = r0
            r3._squareTR = r0
            r3._arrowTR = r0
            r3._label = r0
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r3._focusActorRef
            if (r1 == 0) goto L14
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r2 = r3._focusActorClickListener
            if (r2 == 0) goto L14
            r1.removeListener(r2)
        L14:
            r3._focusActorRef = r0
            r3._focusActorClickListener = r0
            return
    }

    public void draw(com.badlogic.gdx.graphics.g2d.Batch r17) {
            r16 = this;
            r0 = r16
            r12 = r17
            float r1 = r0._alpha
            r13 = 1065353216(0x3f800000, float:1.0)
            r2 = 1062836634(0x3f59999a, float:0.85)
            r3 = 1057300152(0x3f051eb8, float:0.52)
            r12.setColor(r13, r2, r3, r1)
            float r1 = r0._x
            float r2 = r0._offsetX
            float r14 = r1 + r2
            float r1 = r0._y
            float r2 = r0._offsetY
            float r15 = r1 + r2
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0._squareTR
            float r5 = r0._squareWidth
            float r6 = r0._squareHeight
            r1 = r17
            r3 = r14
            r4 = r15
            r1.draw(r2, r3, r4, r5, r6)
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0._arrowTR
            float r1 = r0._arrowOffsetX
            float r3 = r14 + r1
            float r1 = r0._arrowOffsetY
            float r4 = r15 + r1
            int r1 = r2.getRegionWidth()
            float r7 = (float) r1
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r0._arrowTR
            int r1 = r1.getRegionHeight()
            float r8 = (float) r1
            float r11 = r0._arrowRotation
            r5 = 0
            r6 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 1065353216(0x3f800000, float:1.0)
            r1 = r17
            r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            float r1 = r0._alpha
            r12.setColor(r13, r13, r13, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0._label
            float r2 = r0._alpha
            r1.setColor(r13, r13, r13, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0._label
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1101004800(0x41a00000, float:20.0)
            float r4 = r2 * r3
            float r14 = r14 + r4
            float r2 = r2 * r3
            float r15 = r15 + r2
            r1.setPosition(r14, r15)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0._label
            r1.draw(r12, r13)
            r12.setColor(r13, r13, r13, r13)
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r2, float r3, float r4, java.lang.String r5, boolean r6, int r7) {
            r1 = this;
            r1._isUp = r6
            r1._sessionSelectionGoal = r7
            java.lang.String r7 = "square"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r7 = r2.findRegion(r7)
            r1._squareTR = r7
            java.lang.String r7 = "arrow"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r7)
            r1._arrowTR = r2
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r2.<init>(r5, r7)
            r1._label = r2
            r5 = 1
            r2.setAlignment(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r1._label
            float r2 = r2.getWidth()
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r7 = 1101004800(0x41a00000, float:20.0)
            float r5 = r5 * r7
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r0
            float r2 = r2 + r5
            r1._squareWidth = r2
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r1._label
            float r2 = r2.getHeight()
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r7
            float r5 = r5 * r0
            float r2 = r2 + r5
            r1._squareHeight = r2
            r5 = 0
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r6 == 0) goto L77
            float r2 = r1._squareWidth
            com.badlogic.gdx.graphics.g2d.TextureRegion r6 = r1._arrowTR
            int r6 = r6.getRegionWidth()
            float r6 = (float) r6
            float r2 = r2 - r6
            float r2 = r2 * r7
            r1._arrowOffsetX = r2
            float r2 = r1._squareHeight
            r1._arrowOffsetY = r2
            r1._arrowRotation = r5
            float r5 = r1._squareWidth
            r1._width = r5
            com.badlogic.gdx.graphics.g2d.TextureRegion r5 = r1._arrowTR
            int r5 = r5.getRegionHeight()
            float r5 = (float) r5
            float r2 = r2 + r5
            r1._height = r2
            float r5 = r1._width
            float r5 = r5 * r7
            float r3 = r3 - r5
            r1._x = r3
            float r4 = r4 - r2
            r1._y = r4
            goto Laa
        L77:
            r1._arrowOffsetX = r5
            com.badlogic.gdx.graphics.g2d.TextureRegion r5 = r1._arrowTR
            int r5 = r5.getRegionWidth()
            float r5 = (float) r5
            float r2 = r2 - r5
            float r2 = r2 * r7
            r1._arrowOffsetY = r2
            r2 = 1119092736(0x42b40000, float:90.0)
            r1._arrowRotation = r2
            float r2 = r1._squareWidth
            com.badlogic.gdx.graphics.g2d.TextureRegion r5 = r1._arrowTR
            int r5 = r5.getRegionHeight()
            float r5 = (float) r5
            float r2 = r2 + r5
            r1._width = r2
            float r2 = r1._squareHeight
            r1._height = r2
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r1._arrowTR
            int r2 = r2.getRegionHeight()
            float r2 = (float) r2
            float r3 = r3 + r2
            r1._x = r3
            float r2 = r1._height
            float r2 = r2 * r7
            float r4 = r4 - r2
            r1._y = r4
        Laa:
            return
    }

    public boolean isComplete() {
            r1 = this;
            boolean r0 = r1._isComplete
            return r0
    }
}
