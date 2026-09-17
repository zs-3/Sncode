package org.fortheloss.sticknodes.animationscreen;

/* loaded from: classes2.dex */
public interface IStageObject extends com.badlogic.gdx.utils.Disposable {
    float getRotation();

    float getScale();

    float getX();

    float getY();

    void rotateFigureBy(float r1);

    void setFigureRotation(float r1);

    void setPosition(float r1, float r2);

    void setScale(float r1);
}
