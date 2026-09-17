package org.fortheloss.sticknodes;

/* loaded from: classes2.dex */
public class LanguageButton extends com.badlogic.gdx.scenes.scene2d.Actor implements com.badlogic.gdx.utils.Disposable {
    private float _constantCountryXOffset;
    private float _constantCountryYOffset;
    private float _countryOffsetY;
    private float _countryScale;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _countryTR;
    private com.badlogic.gdx.graphics.glutils.ShaderProgram _dfShaderRef;
    private boolean _isSelected;
    private boolean _isTransitioning;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _label;
    private int _languageID;
    private float _shadowOffsetX;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _shadowTR;
    private float _timerTransitioning;
    private float _timerWobble;
    private float _transitionOffsetEnd;
    private float _transitionOffsetStart;
    private float _transitionScaleEnd;
    private float _transitionScaleStart;
    private float _wobbleAngle;
    private int _wobbleDirection;

    public LanguageButton() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2._languageID = r0
            r2._isSelected = r0
            r2._isTransitioning = r0
            r1 = 0
            r2._timerTransitioning = r1
            r2._transitionScaleStart = r1
            r2._transitionScaleEnd = r1
            r2._transitionOffsetStart = r1
            r2._transitionOffsetEnd = r1
            r2._shadowOffsetX = r1
            r2._countryOffsetY = r1
            r2._countryScale = r1
            r2._constantCountryXOffset = r1
            r2._constantCountryYOffset = r1
            r2._wobbleDirection = r0
            r2._timerWobble = r1
            r2._wobbleAngle = r1
            return
    }

    private java.lang.String getLanguageCodeString() {
            r3 = this;
            int r0 = r3._languageID
            java.lang.String r1 = "EN"
            if (r0 != 0) goto L7
            goto L30
        L7:
            r2 = 1
            if (r0 != r2) goto Ld
            java.lang.String r1 = "ES"
            goto L30
        Ld:
            r2 = 5
            if (r0 != r2) goto L13
            java.lang.String r1 = "FL"
            goto L30
        L13:
            r2 = 2
            if (r0 != r2) goto L19
            java.lang.String r1 = "FR"
            goto L30
        L19:
            r2 = 6
            if (r0 != r2) goto L1f
            java.lang.String r1 = "JP"
            goto L30
        L1f:
            r2 = 3
            if (r0 != r2) goto L25
            java.lang.String r1 = "PT"
            goto L30
        L25:
            r2 = 7
            if (r0 != r2) goto L2b
            java.lang.String r1 = "RU"
            goto L30
        L2b:
            r2 = 4
            if (r0 != r2) goto L30
            java.lang.String r1 = "TR"
        L30:
            return r1
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r6) {
            r5 = this;
            super.act(r6)
            float r0 = r5._timerWobble
            float r0 = r0 + r6
            r5._timerWobble = r0
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r0, r1)
            com.badlogic.gdx.math.Interpolation r2 = com.badlogic.gdx.math.Interpolation.sine
            int r3 = r5._wobbleDirection
            int r4 = r3 * 3
            float r4 = (float) r4
            int r3 = -r3
            int r3 = r3 * 3
            float r3 = (float) r3
            float r2 = r2.apply(r4, r3, r0)
            r5._wobbleAngle = r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L30
            r0 = 0
            r5._timerWobble = r0
            int r0 = r5._wobbleDirection
            int r0 = r0 * (-1)
            r5._wobbleDirection = r0
        L30:
            boolean r0 = r5._isTransitioning
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L65
            float r0 = r5._timerTransitioning
            float r0 = r0 + r6
            r5._timerTransitioning = r0
            float r0 = r0 / r2
            float r6 = java.lang.Math.min(r0, r1)
            com.badlogic.gdx.math.Interpolation$Exp r0 = com.badlogic.gdx.math.Interpolation.exp10
            float r3 = r5._transitionScaleStart
            float r4 = r5._transitionScaleEnd
            float r3 = r0.apply(r3, r4, r6)
            r5._countryScale = r3
            float r3 = r5._transitionOffsetStart
            float r4 = r5._transitionOffsetEnd
            float r0 = r0.apply(r3, r4, r6)
            r5._countryOffsetY = r0
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 < 0) goto L65
            r6 = 0
            r5._isTransitioning = r6
            float r6 = r5._transitionScaleEnd
            r5._countryScale = r6
            float r6 = r5._transitionOffsetEnd
            r5._countryOffsetY = r6
        L65:
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r5._label
            float r0 = r5.getX()
            float r1 = r5.getWidth()
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r5._label
            float r3 = r3.getWidth()
            float r1 = r1 - r3
            float r1 = r1 * r2
            float r0 = r0 + r1
            float r1 = r5.getY()
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r5._label
            float r2 = r2.getHeight()
            float r1 = r1 - r2
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r5._shadowTR
            int r2 = r2.getRegionHeight()
            float r2 = (float) r2
            float r1 = r1 - r2
            r6.setPosition(r0, r1)
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r1.clear()
            r0 = 0
            r1._countryTR = r0
            r1._shadowTR = r0
            r1._label = r0
            r1._dfShaderRef = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r12, float r13) {
            r11 = this;
            super.draw(r12, r13)
            com.badlogic.gdx.graphics.g2d.TextureRegion r13 = r11._countryTR
            int r13 = r13.getRegionWidth()
            float r6 = (float) r13
            com.badlogic.gdx.graphics.g2d.TextureRegion r13 = r11._countryTR
            int r13 = r13.getRegionHeight()
            float r7 = (float) r13
            r13 = 1065353216(0x3f800000, float:1.0)
            r12.setColor(r13, r13, r13, r13)
            com.badlogic.gdx.graphics.g2d.TextureRegion r0 = r11._shadowTR
            float r1 = r11.getX()
            float r2 = r11._shadowOffsetX
            float r1 = r1 + r2
            float r2 = r11.getY()
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1117782016(0x42a00000, float:80.0)
            float r3 = r3 * r4
            float r2 = r2 - r3
            r12.draw(r0, r1, r2)
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r11._countryTR
            float r0 = r11.getX()
            float r2 = r11._constantCountryXOffset
            float r2 = r2 + r0
            float r0 = r11.getY()
            float r3 = r11._constantCountryYOffset
            float r0 = r0 + r3
            float r3 = r11._countryOffsetY
            float r3 = r3 + r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r4 = r6 * r0
            float r5 = r7 * r0
            float r9 = r11._countryScale
            float r10 = r11._wobbleAngle
            r0 = r12
            r8 = r9
            r0.draw(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r11._dfShaderRef
            r12.setShader(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r11._label
            com.badlogic.gdx.graphics.Color r0 = r0.getColor()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r11._dfShaderRef
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r11._label
            float r2 = r2.getFontScaleX()
            java.lang.String r3 = "u_scale"
            r1.setUniformf(r3, r2)
            r12.setColor(r0)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r11._dfShaderRef
            java.lang.String r1 = "u_textAlpha"
            r0.setUniformf(r1, r13)
            r12.flush()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r11._label
            r0.draw(r12, r13)
            r12.flush()
            r13 = 0
            r12.setShader(r13)
            return
    }

    public int getLanguageID() {
            r1 = this;
            int r0 = r1._languageID
            return r0
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureRegion r1, com.badlogic.gdx.graphics.g2d.TextureRegion r2, com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle r3, com.badlogic.gdx.graphics.glutils.ShaderProgram r4, int r5, boolean r6) {
            r0 = this;
            r0._countryTR = r1
            r0._shadowTR = r2
            r0._dfShaderRef = r4
            r0._languageID = r5
            int r1 = r1.getRegionWidth()
            float r1 = (float) r1
            r2 = 1069547520(0x3fc00000, float:1.5)
            float r1 = r1 * r2
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = r0._shadowTR
            int r4 = r4.getRegionWidth()
            float r4 = (float) r4
            float r1 = r1 - r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r4
            r0._shadowOffsetX = r1
            r1 = 0
            r0._countryOffsetY = r1
            r0._countryScale = r2
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r0._countryTR
            int r1 = r1.getRegionWidth()
            float r1 = (float) r1
            float r1 = r1 * r2
            com.badlogic.gdx.graphics.g2d.TextureRegion r5 = r0._countryTR
            int r5 = r5.getRegionWidth()
            float r5 = (float) r5
            float r1 = r1 - r5
            float r1 = r1 * r4
            r0._constantCountryXOffset = r1
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r0._countryTR
            int r1 = r1.getRegionHeight()
            float r1 = (float) r1
            float r1 = r1 * r2
            com.badlogic.gdx.graphics.g2d.TextureRegion r5 = r0._countryTR
            int r5 = r5.getRegionHeight()
            float r5 = (float) r5
            float r1 = r1 - r5
            float r1 = r1 * r4
            r0._constantCountryYOffset = r1
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = r0.getLanguageCodeString()
            r1.<init>(r4, r3)
            r0._label = r1
            r3 = 1073741824(0x40000000, float:2.0)
            r1.setFontScale(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0._label
            r3 = 1
            r1.setAlignment(r3)
            com.badlogic.gdx.graphics.g2d.TextureRegion r1 = r0._countryTR
            int r1 = r1.getRegionWidth()
            float r1 = (float) r1
            float r1 = r1 * r2
            com.badlogic.gdx.graphics.g2d.TextureRegion r4 = r0._countryTR
            int r4 = r4.getRegionHeight()
            float r4 = (float) r4
            float r4 = r4 * r2
            r0.setSize(r1, r4)
            if (r6 == 0) goto L82
            r0._wobbleDirection = r3
            r1 = 1077936128(0x40400000, float:3.0)
            r0._wobbleAngle = r1
            goto L89
        L82:
            r1 = -1
            r0._wobbleDirection = r1
            r1 = -1069547520(0xffffffffc0400000, float:-3.0)
            r0._wobbleAngle = r1
        L89:
            double r1 = java.lang.Math.random()
            float r1 = (float) r1
            r2 = 1053609165(0x3ecccccd, float:0.4)
            float r1 = r1 * r2
            r0._timerWobble = r1
            return
    }

    public void setSelected(boolean r3) {
            r2 = this;
            boolean r0 = r2._isSelected
            if (r0 != r3) goto L5
            return
        L5:
            r2._isSelected = r3
            r0 = 1
            r2._isTransitioning = r0
            r0 = 0
            r2._timerTransitioning = r0
            float r1 = r2._countryScale
            r2._transitionScaleStart = r1
            float r1 = r2._countryOffsetY
            r2._transitionOffsetStart = r1
            if (r3 == 0) goto L2b
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r2._label
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.sticknodes.App.COLOR_LIGHT_BLUE
            r3.setColor(r0)
            r3 = 1073741824(0x40000000, float:2.0)
            r2._transitionScaleEnd = r3
            r3 = 1117782016(0x42a00000, float:80.0)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r3
            r2._transitionOffsetEnd = r0
            goto L38
        L2b:
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r2._label
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.WHITE
            r3.setColor(r1)
            r3 = 1069547520(0x3fc00000, float:1.5)
            r2._transitionScaleEnd = r3
            r2._transitionOffsetEnd = r0
        L38:
            return
    }
}
