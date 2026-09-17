package org.fortheloss.framework;

/* loaded from: classes2.dex */
public class SizeWidget extends com.badlogic.gdx.scenes.scene2d.ui.Widget {
    private float _height;
    private float _width;

    public SizeWidget(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0._width = r1
            r0._height = r2
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public float getHeight() {
            r1 = this;
            float r0 = r1._height
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
            r1 = this;
            float r0 = r1._height
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
            r1 = this;
            float r0 = r1._width
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public float getWidth() {
            r1 = this;
            float r0 = r1._width
            return r0
    }
}
