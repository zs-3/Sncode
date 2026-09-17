package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class StickfigureProperties implements com.badlogic.gdx.utils.Disposable {
    public float blur;
    public com.badlogic.gdx.graphics.Color color;
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
    public boolean isLocked;
    public boolean isMotionBlur;
    public boolean isPersistentWhenTweening;
    public boolean isTweeningColors;
    public boolean isUsingJoinParentFilters;
    public int joinsState;
    public float lockedNodeX;
    public float lockedNodeY;
    public int lockedStickNodeIndex;
    public float mJoinOffsetAngle;
    public byte mTweenMode;
    public int motionBlurAngle;
    public boolean motionBlurIsOmniDirectional;
    public float outlineAlpha;
    public com.badlogic.gdx.graphics.Color outlineColor;
    public float outlineThickness;
    public int pixelation;
    public boolean pushJoinedStickfigures;
    public float saturation;
    public float scale;
    public boolean scaleJoinedStickfigures;
    public boolean setStateOfJoins;
    public float tintAmount;
    public com.badlogic.gdx.graphics.Color tintColor;
    public float transparency;
    public boolean visibleInOnionSkin;
    public float x;
    public float y;

    public StickfigureProperties(org.fortheloss.sticknodes.stickfigure.Stickfigure r6) {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.x = r0
            r5.y = r0
            r5.scale = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r5.transparency = r1
            r5.blur = r0
            r2 = 0
            r5.isMotionBlur = r2
            r5.motionBlurIsOmniDirectional = r2
            r5.motionBlurAngle = r2
            r5.saturation = r1
            r3 = 1
            r5.pixelation = r3
            r5.tintAmount = r0
            r5.hueShift = r0
            r5.colorIsInverted = r2
            r5.glow = r0
            r5.glowIntensity = r1
            r5.outlineAlpha = r1
            r5.outlineThickness = r0
            r5.dsAlpha = r0
            r4 = 10
            r5.dsDistance = r4
            r4 = 135(0x87, float:1.89E-43)
            r5.dsAngle = r4
            r4 = 1056964608(0x3f000000, float:0.5)
            r5.dsBlur = r4
            r5.isLocked = r2
            r5.isPersistentWhenTweening = r2
            r5.visibleInOnionSkin = r3
            r5.isTweeningColors = r2
            r5.mTweenMode = r3
            r5.scaleJoinedStickfigures = r3
            r5.pushJoinedStickfigures = r3
            r5.setStateOfJoins = r2
            r5.joinsState = r2
            r5.isUsingJoinParentFilters = r2
            r5.mJoinOffsetAngle = r0
            r2 = -1
            r5.lockedStickNodeIndex = r2
            r5.lockedNodeX = r0
            r5.lockedNodeY = r0
            com.badlogic.gdx.graphics.Color r2 = new com.badlogic.gdx.graphics.Color
            r2.<init>()
            r5.color = r2
            com.badlogic.gdx.graphics.Color r2 = new com.badlogic.gdx.graphics.Color
            r2.<init>()
            r5.tintColor = r2
            com.badlogic.gdx.graphics.Color r2 = new com.badlogic.gdx.graphics.Color
            r2.<init>()
            r5.glowColor = r2
            com.badlogic.gdx.graphics.Color r2 = new com.badlogic.gdx.graphics.Color
            r2.<init>()
            r5.outlineColor = r2
            com.badlogic.gdx.graphics.Color r2 = new com.badlogic.gdx.graphics.Color
            r2.<init>(r0, r0, r0, r1)
            r5.dsColor = r2
            r5.getProperties(r6)
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.color = r0
            r1.tintColor = r0
            r1.glowColor = r0
            r1.outlineColor = r0
            r1.dsColor = r0
            return
    }

    public void getProperties(org.fortheloss.sticknodes.stickfigure.Stickfigure r1) {
            r0 = this;
            r1.getProperties(r0)
            return
    }
}
