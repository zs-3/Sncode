package org.fortheloss.sticknodes.animationscreen;

/* loaded from: classes2.dex */
public interface IDrawableFigure extends org.fortheloss.sticknodes.animationscreen.IStageObject {
    boolean checkIsJoinedTo(org.fortheloss.sticknodes.stickfigure.Stickfigure r1);

    void doNotDraw();

    void drawLimbs(org.fortheloss.sticknodes.SNShapeRenderer r1, com.badlogic.gdx.graphics.g2d.Batch r2, org.fortheloss.sticknodes.animationscreen.FilterBundle r3, float r4, float r5, float r6, float r7, float r8, boolean r9, org.fortheloss.sticknodes.stickfigure.INode r10, boolean r11, boolean r12);

    void drawNodes(org.fortheloss.sticknodes.animationscreen.NodeDrawTools r1, float r2, float r3, float r4, float r5, float r6, boolean r7, boolean r8, org.fortheloss.sticknodes.stickfigure.INode r9, boolean r10);

    void flagLockedToCamera(byte r1);

    void flipX(boolean r1);

    void flipY(boolean r1);

    float getBlur();

    float getDsAlpha();

    int getDsAngle();

    float getDsBlur();

    com.badlogic.gdx.graphics.Color getDsColor();

    int getDsDistance();

    float getGlow();

    com.badlogic.gdx.graphics.Color getGlowColor();

    float getGlowIntensity();

    float getHueShift();

    int getID();

    boolean getIsInvertedColor();

    float getJoinOffsetAngle();

    org.fortheloss.sticknodes.stickfigure.StickNode getJoinedToNode();

    int getLibraryID();

    org.fortheloss.sticknodes.stickfigure.INode getMainNode();

    int getMotionBlurAngle();

    boolean getMotionBlurIsOneDirection();

    java.lang.String getName();

    org.fortheloss.sticknodes.stickfigure.INode getNodeAtDrawOrderIndex(int r1);

    int getNodeCount(boolean r1);

    float getOutlineAlpha();

    com.badlogic.gdx.graphics.Color getOutlineColor();

    float getOutlineThickness();

    int getPixelation();

    void getPositionalData(java.io.OutputStream r1) throws java.io.IOException;

    float getSaturation();

    org.fortheloss.sticknodes.stickfigure.INode getSelectedNode(float r1, float r2, float r3, boolean r4, boolean r5, org.fortheloss.sticknodes.NodeDigger r6);

    float getTintAmount();

    com.badlogic.gdx.graphics.Color getTintColor();

    float getTransparency();

    byte getTweenMode();

    boolean getUseJoinParentFilters();

    void interpolateValues(float r1, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3);

    boolean isJoined();

    boolean isLocked();

    byte isLockedToCamera();

    boolean isMotionBlur();

    boolean isPersistent();

    boolean isVisibleInOnionSkin();

    boolean joinTo(org.fortheloss.sticknodes.stickfigure.StickNode r1);

    boolean joinTo(org.fortheloss.sticknodes.stickfigure.StickNode r1, boolean r2);

    void setBlur(float r1);

    void setDsAlpha(float r1);

    void setDsAngle(int r1);

    void setDsBlur(float r1);

    void setDsColor(com.badlogic.gdx.graphics.Color r1);

    void setDsDistance(int r1);

    void setFilters(org.fortheloss.sticknodes.data.FigureFilterProperties r1);

    void setGlow(float r1);

    void setGlowColor(com.badlogic.gdx.graphics.Color r1);

    void setGlowIntensity(float r1);

    void setHueShift(float r1);

    void setID(int r1);

    void setInvertedColor(boolean r1);

    void setJoinOffsetAngle(float r1);

    void setKeepJoinDuringInterpolation(boolean r1);

    void setLibraryID(int r1);

    void setLocked(boolean r1);

    void setMotionBlur(boolean r1);

    void setMotionBlurAngle(int r1);

    void setMotionBlurIsOneDirection(boolean r1);

    void setOutlineAlpha(float r1);

    void setOutlineColor(com.badlogic.gdx.graphics.Color r1);

    void setOutlineThickness(float r1);

    void setPersist(boolean r1);

    void setPixelation(int r1);

    void setSaturation(float r1);

    void setTintAmount(float r1);

    void setTintColor(com.badlogic.gdx.graphics.Color r1);

    void setTransparency(float r1);

    void setTweenMode(byte r1);

    void setUseJoinParentFilters(boolean r1);

    void setVisibleInOnionSkin(boolean r1);

    void unjoin();

    void validateDirtyNodes();
}
