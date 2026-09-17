package org.fortheloss.sticknodes.animationscreen.drawables;

/* loaded from: classes2.dex */
public abstract class BaseNodeDrawable extends com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable {
    public BaseNodeDrawable() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void drawArrow(com.badlogic.gdx.graphics.g2d.Batch r1, float r2, float r3, float r4);

    public abstract void drawDashedLine(com.badlogic.gdx.graphics.g2d.Batch r1, float r2, float r3, float r4, float r5);

    public abstract void drawDashedLineThicker(com.badlogic.gdx.graphics.g2d.Batch r1, float r2, float r3, float r4, float r5);

    public abstract void drawLine(com.badlogic.gdx.graphics.g2d.Batch r1, float r2, float r3, float r4, float r5);

    public abstract void drawLine2(com.badlogic.gdx.graphics.g2d.Batch r1, float r2, float r3, float r4, float r5);

    public abstract void drawLineThicker(com.badlogic.gdx.graphics.g2d.Batch r1, float r2, float r3, float r4, float r5);

    public abstract void drawNode(com.badlogic.gdx.graphics.g2d.Batch r1, float r2, float r3, float r4);

    public abstract void drawNode(com.badlogic.gdx.graphics.g2d.Batch r1, float r2, float r3, float r4, float r5);

    public abstract void drawPatch(com.badlogic.gdx.graphics.g2d.Batch r1, float r2, float r3, float r4, float r5, float r6);
}
