package org.fortheloss.sticknodes.stickfigure;

/* loaded from: classes2.dex */
public interface INode extends com.badlogic.gdx.utils.Disposable {
    com.badlogic.gdx.math.Vector2 dragTo(float r1, float r2);

    void flagPositionAsDirty();

    float getAngle();

    int getDrawOrderIndex();

    org.fortheloss.sticknodes.animationscreen.IDrawableFigure getDrawableFigure();

    float getGlobalX();

    float getGlobalY();

    float getX();

    float getY();

    boolean isMainNode();
}
