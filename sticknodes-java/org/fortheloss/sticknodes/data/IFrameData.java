package org.fortheloss.sticknodes.data;

/* loaded from: classes2.dex */
public interface IFrameData extends com.badlogic.gdx.utils.Disposable {
    void addFigure(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1, int r2, org.fortheloss.sticknodes.animationscreen.FramesContainer r3);

    void addFigureAt(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1, int r2, int r3, org.fortheloss.sticknodes.animationscreen.FramesContainer r4);

    void clear();

    void deleteFigure(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1);

    java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> getDrawableFigures();

    void getFigureOrder(java.util.ArrayList<java.lang.Integer> r1);

    int getFigurePosition(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1);

    int getFrameTotalNodeCount();

    boolean getIsUsingSlowMotionTweenedFrames();

    void getProperties(org.fortheloss.sticknodes.data.useractions.FrameDataProperties r1);

    int getSlowMotionTweenedFrames();

    float getSoundPan();

    float getSoundPitch();

    int getSoundToPlayLibraryID();

    float getSoundVolume();

    java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> getTweenedDrawableFigures();

    boolean isTweened();

    void onFigureFlippedX(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1, boolean r2);

    void onFigureFlippedY(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1, boolean r2);

    void onFigureJoined(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1, org.fortheloss.sticknodes.stickfigure.StickNode r2);

    void onFigureUnjoined(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1);

    void onStickNodeColorModified(org.fortheloss.sticknodes.stickfigure.StickNode r1);

    void onStickNodeFlippedX(int r1, int r2);

    void onStickNodeFlippedY(int r1, int r2);

    void restoreReferences(org.fortheloss.sticknodes.data.IFrameData r1, org.fortheloss.sticknodes.data.IFrameData r2);

    void setFigureOrder(java.util.ArrayList<java.lang.Integer> r1);

    void setFigureOrder(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1, int r2);

    void setFigureOrderUndoRedo(java.lang.Integer[] r1);

    void setIsFirstFrame(boolean r1);

    void setIsLastFrame(boolean r1);

    void setNextFrame(org.fortheloss.sticknodes.data.IFrameData r1);

    void setPreviousFrame(org.fortheloss.sticknodes.data.IFrameData r1);

    void setProperties(org.fortheloss.sticknodes.data.useractions.FrameDataProperties r1);

    void setSoundPan(float r1);

    void setSoundPitch(float r1);

    void setSoundToPlay(int r1);

    void setSoundVolume(float r1);

    void sortFiguresArrayByLayerOrder(java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1);

    void swapFigures(int r1, int r2);

    void tweenEverything(org.fortheloss.sticknodes.data.IFrameData r1, org.fortheloss.sticknodes.data.IFrameData r2, float r3);
}
