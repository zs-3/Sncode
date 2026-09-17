package com.badlogic.gdx;

/* loaded from: classes.dex */
public interface Preferences {
    boolean contains(java.lang.String r1);

    void flush();

    boolean getBoolean(java.lang.String r1);

    boolean getBoolean(java.lang.String r1, boolean r2);

    float getFloat(java.lang.String r1, float r2);

    int getInteger(java.lang.String r1);

    int getInteger(java.lang.String r1, int r2);

    java.lang.String getString(java.lang.String r1, java.lang.String r2);

    com.badlogic.gdx.Preferences putBoolean(java.lang.String r1, boolean r2);

    com.badlogic.gdx.Preferences putFloat(java.lang.String r1, float r2);

    com.badlogic.gdx.Preferences putInteger(java.lang.String r1, int r2);

    com.badlogic.gdx.Preferences putString(java.lang.String r1, java.lang.String r2);

    void remove(java.lang.String r1);
}
