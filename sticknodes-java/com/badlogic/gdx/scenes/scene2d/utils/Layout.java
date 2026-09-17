package com.badlogic.gdx.scenes.scene2d.utils;

/* loaded from: classes.dex */
public interface Layout {
    float getMaxHeight();

    float getMaxWidth();

    float getMinHeight();

    float getMinWidth();

    float getPrefHeight();

    float getPrefWidth();

    void invalidateHierarchy();

    void validate();
}
