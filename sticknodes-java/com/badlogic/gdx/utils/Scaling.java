package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public abstract class Scaling {
    public static final com.badlogic.gdx.utils.Scaling contain = null;
    public static final com.badlogic.gdx.utils.Scaling fill = null;
    public static final com.badlogic.gdx.utils.Scaling fillX = null;
    public static final com.badlogic.gdx.utils.Scaling fillY = null;
    public static final com.badlogic.gdx.utils.Scaling fit = null;
    public static final com.badlogic.gdx.utils.Scaling none = null;
    public static final com.badlogic.gdx.utils.Scaling stretch = null;
    public static final com.badlogic.gdx.utils.Scaling stretchX = null;
    public static final com.badlogic.gdx.utils.Scaling stretchY = null;
    protected static final com.badlogic.gdx.math.Vector2 temp = null;










    static {
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            com.badlogic.gdx.utils.Scaling.temp = r0
            com.badlogic.gdx.utils.Scaling$1 r0 = new com.badlogic.gdx.utils.Scaling$1
            r0.<init>()
            com.badlogic.gdx.utils.Scaling.fit = r0
            com.badlogic.gdx.utils.Scaling$2 r0 = new com.badlogic.gdx.utils.Scaling$2
            r0.<init>()
            com.badlogic.gdx.utils.Scaling.contain = r0
            com.badlogic.gdx.utils.Scaling$3 r0 = new com.badlogic.gdx.utils.Scaling$3
            r0.<init>()
            com.badlogic.gdx.utils.Scaling.fill = r0
            com.badlogic.gdx.utils.Scaling$4 r0 = new com.badlogic.gdx.utils.Scaling$4
            r0.<init>()
            com.badlogic.gdx.utils.Scaling.fillX = r0
            com.badlogic.gdx.utils.Scaling$5 r0 = new com.badlogic.gdx.utils.Scaling$5
            r0.<init>()
            com.badlogic.gdx.utils.Scaling.fillY = r0
            com.badlogic.gdx.utils.Scaling$6 r0 = new com.badlogic.gdx.utils.Scaling$6
            r0.<init>()
            com.badlogic.gdx.utils.Scaling.stretch = r0
            com.badlogic.gdx.utils.Scaling$7 r0 = new com.badlogic.gdx.utils.Scaling$7
            r0.<init>()
            com.badlogic.gdx.utils.Scaling.stretchX = r0
            com.badlogic.gdx.utils.Scaling$8 r0 = new com.badlogic.gdx.utils.Scaling$8
            r0.<init>()
            com.badlogic.gdx.utils.Scaling.stretchY = r0
            com.badlogic.gdx.utils.Scaling$9 r0 = new com.badlogic.gdx.utils.Scaling$9
            r0.<init>()
            com.badlogic.gdx.utils.Scaling.none = r0
            return
    }

    public Scaling() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract com.badlogic.gdx.math.Vector2 apply(float r1, float r2, float r3, float r4);
}
