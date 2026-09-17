package org.fortheloss.sticknodes.data;

/* loaded from: classes2.dex */
public class FigureFilterProperties implements com.badlogic.gdx.utils.Disposable {
    public float blur;
    public boolean colorIsInverted;
    public float dsAlpha;
    public int dsAngle;
    public float dsBlur;
    public com.badlogic.gdx.graphics.Color dsColor;
    public int dsDistance;
    public float glow;
    public com.badlogic.gdx.graphics.Color glowColor;
    public float glowIntensity;
    public float hueShift;
    public boolean isMotionBlur;
    public int motionBlurAngle;
    public boolean motionBlurIsOneDirection;
    public float outlineAlpha;
    public com.badlogic.gdx.graphics.Color outlineColor;
    public float outlineThickness;
    public int pixelation;
    public float saturation;
    public float tintAmount;
    public com.badlogic.gdx.graphics.Color tintColor;
    public float transparency;

    public FigureFilterProperties() {
            r4 = this;
            r4.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.transparency = r0
            r1 = 0
            r4.colorIsInverted = r1
            r2 = 0
            r4.tintAmount = r2
            r4.hueShift = r2
            r4.saturation = r0
            r3 = 1
            r4.pixelation = r3
            r4.blur = r2
            r4.isMotionBlur = r1
            r4.motionBlurIsOneDirection = r1
            r4.motionBlurAngle = r1
            r4.glow = r2
            r4.glowIntensity = r0
            r4.outlineAlpha = r0
            r4.outlineThickness = r2
            r4.dsAlpha = r2
            r1 = 10
            r4.dsDistance = r1
            r1 = 135(0x87, float:1.89E-43)
            r4.dsAngle = r1
            r1 = 1056964608(0x3f000000, float:0.5)
            r4.dsBlur = r1
            com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
            r1.<init>(r0, r0, r0, r0)
            r4.tintColor = r1
            com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
            r1.<init>(r0, r0, r0, r0)
            r4.glowColor = r1
            com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
            r1.<init>(r0, r0, r0, r0)
            r4.outlineColor = r1
            com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
            r1.<init>(r2, r2, r2, r0)
            r4.dsColor = r1
            return
    }

    public FigureFilterProperties(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r5) {
            r4 = this;
            r4.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.transparency = r0
            r1 = 0
            r4.colorIsInverted = r1
            r2 = 0
            r4.tintAmount = r2
            r4.hueShift = r2
            r4.saturation = r0
            r3 = 1
            r4.pixelation = r3
            r4.blur = r2
            r4.isMotionBlur = r1
            r4.motionBlurIsOneDirection = r1
            r4.motionBlurAngle = r1
            r4.glow = r2
            r4.glowIntensity = r0
            r4.outlineAlpha = r0
            r4.outlineThickness = r2
            r4.dsAlpha = r2
            r1 = 10
            r4.dsDistance = r1
            r1 = 135(0x87, float:1.89E-43)
            r4.dsAngle = r1
            r1 = 1056964608(0x3f000000, float:0.5)
            r4.dsBlur = r1
            com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
            r1.<init>(r0, r0, r0, r0)
            r4.tintColor = r1
            com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
            r1.<init>(r0, r0, r0, r0)
            r4.glowColor = r1
            com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
            r1.<init>(r0, r0, r0, r0)
            r4.outlineColor = r1
            com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
            r1.<init>(r2, r2, r2, r0)
            r4.dsColor = r1
            r4.getProperties(r5)
            return
    }

    public FigureFilterProperties(org.fortheloss.sticknodes.data.FigureFilterProperties r5) {
            r4 = this;
            r4.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.transparency = r0
            r1 = 0
            r4.colorIsInverted = r1
            r2 = 0
            r4.tintAmount = r2
            r4.hueShift = r2
            r4.saturation = r0
            r3 = 1
            r4.pixelation = r3
            r4.blur = r2
            r4.isMotionBlur = r1
            r4.motionBlurIsOneDirection = r1
            r4.motionBlurAngle = r1
            r4.glow = r2
            r4.glowIntensity = r0
            r4.outlineAlpha = r0
            r4.outlineThickness = r2
            r4.dsAlpha = r2
            r1 = 10
            r4.dsDistance = r1
            r1 = 135(0x87, float:1.89E-43)
            r4.dsAngle = r1
            r1 = 1056964608(0x3f000000, float:0.5)
            r4.dsBlur = r1
            com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
            r1.<init>(r0, r0, r0, r0)
            r4.tintColor = r1
            com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
            r1.<init>(r0, r0, r0, r0)
            r4.glowColor = r1
            com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
            r1.<init>(r0, r0, r0, r0)
            r4.outlineColor = r1
            com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
            r1.<init>(r2, r2, r2, r0)
            r4.dsColor = r1
            r4.cloneFrom(r5)
            return
    }

    public void cloneFrom(org.fortheloss.sticknodes.data.FigureFilterProperties r3) {
            r2 = this;
            float r0 = r3.transparency
            r2.transparency = r0
            boolean r0 = r3.colorIsInverted
            r2.colorIsInverted = r0
            float r0 = r3.tintAmount
            r2.tintAmount = r0
            com.badlogic.gdx.graphics.Color r0 = r2.tintColor
            com.badlogic.gdx.graphics.Color r1 = r3.tintColor
            r0.set(r1)
            float r0 = r3.hueShift
            r2.hueShift = r0
            float r0 = r3.saturation
            r2.saturation = r0
            int r0 = r3.pixelation
            r2.pixelation = r0
            float r0 = r3.blur
            r2.blur = r0
            boolean r0 = r3.isMotionBlur
            r2.isMotionBlur = r0
            int r0 = r3.motionBlurAngle
            r2.motionBlurAngle = r0
            float r0 = r3.glow
            r2.glow = r0
            com.badlogic.gdx.graphics.Color r0 = r2.glowColor
            com.badlogic.gdx.graphics.Color r1 = r3.glowColor
            r0.set(r1)
            float r0 = r3.glowIntensity
            r2.glowIntensity = r0
            com.badlogic.gdx.graphics.Color r0 = r2.outlineColor
            com.badlogic.gdx.graphics.Color r1 = r3.outlineColor
            r0.set(r1)
            float r0 = r3.outlineAlpha
            r2.outlineAlpha = r0
            float r0 = r3.outlineThickness
            r2.outlineThickness = r0
            com.badlogic.gdx.graphics.Color r0 = r2.dsColor
            com.badlogic.gdx.graphics.Color r1 = r3.dsColor
            r0.set(r1)
            float r0 = r3.dsAlpha
            r2.dsAlpha = r0
            int r0 = r3.dsDistance
            r2.dsDistance = r0
            int r0 = r3.dsAngle
            r2.dsAngle = r0
            float r3 = r3.dsBlur
            r2.dsBlur = r3
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.tintColor = r0
            r1.glowColor = r0
            r1.outlineColor = r0
            r1.dsColor = r0
            return
    }

    public void getProperties(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3) {
            r2 = this;
            float r0 = r3.getTransparency()
            r2.transparency = r0
            boolean r0 = r3.getIsInvertedColor()
            r2.colorIsInverted = r0
            float r0 = r3.getTintAmount()
            r2.tintAmount = r0
            com.badlogic.gdx.graphics.Color r0 = r2.tintColor
            com.badlogic.gdx.graphics.Color r1 = r3.getTintColor()
            r0.set(r1)
            float r0 = r3.getHueShift()
            r2.hueShift = r0
            float r0 = r3.getSaturation()
            r2.saturation = r0
            int r0 = r3.getPixelation()
            r2.pixelation = r0
            float r0 = r3.getBlur()
            r2.blur = r0
            boolean r0 = r3.isMotionBlur()
            r2.isMotionBlur = r0
            int r0 = r3.getMotionBlurAngle()
            r2.motionBlurAngle = r0
            boolean r0 = r3.getMotionBlurIsOneDirection()
            r2.motionBlurIsOneDirection = r0
            float r0 = r3.getGlow()
            r2.glow = r0
            com.badlogic.gdx.graphics.Color r0 = r2.glowColor
            com.badlogic.gdx.graphics.Color r1 = r3.getGlowColor()
            r0.set(r1)
            float r0 = r3.getGlowIntensity()
            r2.glowIntensity = r0
            com.badlogic.gdx.graphics.Color r0 = r2.outlineColor
            com.badlogic.gdx.graphics.Color r1 = r3.getOutlineColor()
            r0.set(r1)
            float r0 = r3.getOutlineAlpha()
            r2.outlineAlpha = r0
            float r0 = r3.getOutlineThickness()
            r2.outlineThickness = r0
            com.badlogic.gdx.graphics.Color r0 = r2.dsColor
            com.badlogic.gdx.graphics.Color r1 = r3.getDsColor()
            r0.set(r1)
            float r0 = r3.getDsAlpha()
            r2.dsAlpha = r0
            int r0 = r3.getDsDistance()
            r2.dsDistance = r0
            int r0 = r3.getDsAngle()
            r2.dsAngle = r0
            float r3 = r3.getDsBlur()
            r2.dsBlur = r3
            return
    }
}
