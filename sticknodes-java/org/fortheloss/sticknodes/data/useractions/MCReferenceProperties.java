package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class MCReferenceProperties implements com.badlogic.gdx.utils.Disposable {
    public float blur;
    public boolean colorIsInverted;
    public int currentFrameIndex;
    public float dsAlpha;
    public int dsAngle;
    public float dsBlur;
    public com.badlogic.gdx.graphics.Color dsColor;
    public int dsDistance;
    public int flipX;
    public int flipY;
    public float glow;
    public com.badlogic.gdx.graphics.Color glowColor;
    public float glowIntensity;
    public float hueShift;
    public boolean isLocked;
    public boolean isMotionBlur;
    public boolean isPersistentWhenTweening;
    public boolean isUsingJoinParentFilters;
    public byte mTweenMode;
    public int motionBlurAngle;
    public boolean motionBlurIsOmniDirectional;
    public float outlineAlpha;
    public com.badlogic.gdx.graphics.Color outlineColor;
    public float outlineThickness;
    public int pixelation;
    public boolean playDuringDelay;
    public int playmode;
    public float saturation;
    public float scale;
    public int startFrameIndex;
    public float tintAmount;
    public com.badlogic.gdx.graphics.Color tintColor;
    public float transparency;
    public boolean visibleInOnionSkin;
    public float volumeScale;
    public float x;
    public float y;

    public MCReferenceProperties(org.fortheloss.sticknodes.movieclip.MCReference r6) {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.x = r0
            r5.y = r0
            r1 = 0
            r5.startFrameIndex = r1
            r5.currentFrameIndex = r1
            r2 = 2
            r5.playmode = r2
            r2 = 1
            r5.playDuringDelay = r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r5.volumeScale = r3
            r5.flipX = r2
            r5.flipY = r2
            r5.scale = r0
            r5.transparency = r3
            r5.blur = r0
            r5.isMotionBlur = r1
            r5.motionBlurIsOmniDirectional = r1
            r5.motionBlurAngle = r1
            r5.saturation = r3
            r5.pixelation = r2
            r5.tintAmount = r0
            r5.hueShift = r0
            r5.colorIsInverted = r1
            r5.glow = r0
            r5.glowIntensity = r3
            r5.outlineAlpha = r3
            r5.outlineThickness = r0
            r5.dsAlpha = r0
            r4 = 10
            r5.dsDistance = r4
            r4 = 135(0x87, float:1.89E-43)
            r5.dsAngle = r4
            r4 = 1056964608(0x3f000000, float:0.5)
            r5.dsBlur = r4
            r5.isUsingJoinParentFilters = r1
            r5.isLocked = r1
            r5.isPersistentWhenTweening = r1
            r5.mTweenMode = r2
            r5.visibleInOnionSkin = r2
            com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
            r1.<init>()
            r5.tintColor = r1
            com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
            r1.<init>()
            r5.glowColor = r1
            com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
            r1.<init>()
            r5.outlineColor = r1
            com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
            r1.<init>(r0, r0, r0, r3)
            r5.dsColor = r1
            r5.getProperties(r6)
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

    public void getProperties(org.fortheloss.sticknodes.movieclip.MCReference r1) {
            r0 = this;
            r1.getProperties(r0)
            return
    }
}
