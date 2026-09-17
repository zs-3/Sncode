package org.fortheloss.sticknodes.animationscreen.modules;

/* loaded from: classes2.dex */
public interface IAnimationBasedModule {
    void addSprite(int r1);

    void addStickfigure(int r1);

    void addTweenedFrame(int r1, boolean r2, boolean r3);

    void addTweenedFrames(int r1);

    void centerFigure();

    void clearFigureFilters();

    void clearFrame();

    void clearSound();

    void copyFigureFilters();

    void copySound();

    void copySprite();

    void copyStickfigure(boolean r1);

    void copyStickfigurePropertiesBundle();

    void createNewStickfigure();

    void deleteSound(int r1);

    void deleteSprite();

    void deleteStickfigure(boolean r1);

    void editSelectedStickfigure();

    void editSpriteImportsList();

    void editStickfigure(int r1);

    void editStickfigureImportsList();

    void flipFigureX(boolean r1);

    void flipFigureY(boolean r1);

    void flipSegmentX(boolean r1);

    void flipSegmentY(boolean r1);

    org.fortheloss.sticknodes.data.IFrameData getCurrentFrame();

    com.badlogic.gdx.graphics.glutils.FrameBuffer getScreenFBO();

    void importSound();

    void importStickfigure(java.lang.String r1);

    void invertFigureColor(boolean r1);

    boolean isSpriteNameUnique(java.lang.String r1);

    void joinFigure();

    void loadSpriteImage();

    void lockFigure(boolean r1);

    void lockNode(boolean r1);

    void pasteFigureFilters();

    void pasteSound();

    void pasteSprite();

    void pasteStickfigure();

    void pasteStickfigurePropertiesBundle();

    void persistFigure(boolean r1);

    void playSound(int r1);

    void pushFigureBackward();

    void pushFigureForward();

    void resetSegmentLength();

    void resetSegmentThickness();

    void reverseSegmentGradient(boolean r1);

    void rotateSegmentTo(int r1);

    void rotateSpriteTo(float r1);

    void rotateStickfigureTo(int r1);

    void scaleFigureTo(float r1);

    void scaleSegmentTo(float r1);

    void selectFigure(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1);

    void selectFigure(org.fortheloss.sticknodes.stickfigure.INode r1);

    void selectNextFigure();

    void selectPreviousFigure();

    void setCircleIsHollow(boolean r1);

    void setCircleOutlineColor(com.badlogic.gdx.graphics.Color r1);

    void setFPS(int r1);

    void setFigureBlurTo(float r1);

    void setFigureDropShadowAlphaTo(float r1);

    void setFigureDropShadowAngleTo(int r1);

    void setFigureDropShadowBlurTo(float r1);

    void setFigureDropShadowColor(com.badlogic.gdx.graphics.Color r1);

    void setFigureDropShadowDistanceTo(int r1);

    void setFigureGlowAmountTo(float r1);

    void setFigureGlowColor(com.badlogic.gdx.graphics.Color r1);

    void setFigureGlowIntensityAmountTo(float r1);

    void setFigureHueShiftTo(float r1);

    void setFigureMotionBlurAngle(int r1);

    void setFigureMotionBlurEnabled(boolean r1);

    void setFigureMotionBlurIsOmniDirectional(boolean r1);

    void setFigureOutlineAlphaTo(float r1);

    void setFigureOutlineColor(com.badlogic.gdx.graphics.Color r1);

    void setFigureOutlineThicknessTo(float r1);

    void setFigurePixelationTo(int r1);

    void setFigureSaturationTo(float r1);

    void setFigureTintAmountTo(float r1);

    void setFigureTintColor(com.badlogic.gdx.graphics.Color r1);

    void setFigureTransparencyTo(float r1);

    void setFigureUseJoinParentFilters(boolean r1);

    void setFigureVisibleInOnionSkin(boolean r1);

    void setFrameSound(int r1);

    void setFrameSoundPan(float r1);

    void setFrameSoundPitch(float r1);

    void setFrameSoundVolume(float r1);

    void setGradientMode(short r1);

    void setNeedsToBeDrawn();

    void setPlayFullscreen(boolean r1);

    void setPolyfillColor(com.badlogic.gdx.graphics.Color r1);

    void setPushJoinedFigures(boolean r1);

    void setSegmentColor(com.badlogic.gdx.graphics.Color r1);

    void setSegmentDragLockAngle(float r1);

    void setSegmentGradient(com.badlogic.gdx.graphics.Color r1);

    void setSegmentIsDragLocked(boolean r1);

    void setSegmentIsFloaty(boolean r1);

    void setSegmentIsStretchy(boolean r1);

    void setSegmentLength(int r1);

    void setSegmentThickness(int r1);

    void setShapeSegmentCirculization(boolean r1);

    void setShapeSegmentCurve(int r1);

    void setShapeSegmentCurvePolyfillPrecision(short r1);

    void setShapeTrapezoidIsRounded1(boolean r1);

    void setShapeTrapezoidIsRounded2(boolean r1);

    void setShapeTrapezoidRatio(boolean r1);

    void setShapeTrapezoidThickness1(int r1);

    void setShapeTrapezoidThickness2(int r1);

    void setShowFilters(boolean r1);

    void setSpriteGroupStateIndex(int r1);

    void setSpriteOriginX(float r1);

    void setSpriteOriginY(float r1);

    void setSpriteScaleLinked(boolean r1);

    void setSpriteScaleMode(boolean r1);

    void setSpriteScaleX(float r1);

    void setSpriteScaleY(float r1);

    void setStickfigureColor(com.badlogic.gdx.graphics.Color r1);

    void setStickfigureDoesSetJoinsState(boolean r1);

    void setStickfigureScaleJoinedStickfigures(boolean r1);

    void setStickfigureStateIndexOfJoins(int r1);

    void setTweenedFrames(int r1);

    void setTweening(boolean r1);

    void setUsePolyfillColor(boolean r1);

    void showAddTweenedFrameDialog();

    void showMultiSoundImportErrorDialog(java.util.ArrayList<java.lang.String> r1, int r2);

    void showMultiStickfigureImportErrorDialog(java.util.ArrayList<java.lang.String> r1, int r2);

    void toggleFigureTweenMode();

    void toggleSpriteLockState();

    void toggleSpriteSmartStretchState();

    void tweenStickfigureColors(boolean r1);

    void unjoinFigure();

    void unjoinFigure(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1);

    void unlockFigureFromCamera();

    void useCircleOutline(boolean r1);

    void useSegmentColor(boolean r1);

    void useSegmentGradient(boolean r1);

    void useSegmentScale(boolean r1);
}
