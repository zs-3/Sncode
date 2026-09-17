package com.badlogic.gdx.scenes.scene2d;

/* loaded from: classes.dex */
public enum Touchable extends java.lang.Enum<com.badlogic.gdx.scenes.scene2d.Touchable> {
    private static final /* synthetic */ com.badlogic.gdx.scenes.scene2d.Touchable[] $VALUES = null;
    public static final com.badlogic.gdx.scenes.scene2d.Touchable childrenOnly = null;
    public static final com.badlogic.gdx.scenes.scene2d.Touchable disabled = null;
    public static final com.badlogic.gdx.scenes.scene2d.Touchable enabled = null;

    static {
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = new com.badlogic.gdx.scenes.scene2d.Touchable
            java.lang.String r1 = "enabled"
            r2 = 0
            r0.<init>(r1, r2)
            com.badlogic.gdx.scenes.scene2d.Touchable.enabled = r0
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = new com.badlogic.gdx.scenes.scene2d.Touchable
            java.lang.String r3 = "disabled"
            r4 = 1
            r1.<init>(r3, r4)
            com.badlogic.gdx.scenes.scene2d.Touchable.disabled = r1
            com.badlogic.gdx.scenes.scene2d.Touchable r3 = new com.badlogic.gdx.scenes.scene2d.Touchable
            java.lang.String r5 = "childrenOnly"
            r6 = 2
            r3.<init>(r5, r6)
            com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly = r3
            r5 = 3
            com.badlogic.gdx.scenes.scene2d.Touchable[] r5 = new com.badlogic.gdx.scenes.scene2d.Touchable[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            com.badlogic.gdx.scenes.scene2d.Touchable.$VALUES = r5
            return
    }

    Touchable(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.badlogic.gdx.scenes.scene2d.Touchable valueOf(java.lang.String r1) {
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.Touchable> r0 = com.badlogic.gdx.scenes.scene2d.Touchable.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = (com.badlogic.gdx.scenes.scene2d.Touchable) r1
            return r1
    }

    public static com.badlogic.gdx.scenes.scene2d.Touchable[] values() {
            com.badlogic.gdx.scenes.scene2d.Touchable[] r0 = com.badlogic.gdx.scenes.scene2d.Touchable.$VALUES
            java.lang.Object r0 = r0.clone()
            com.badlogic.gdx.scenes.scene2d.Touchable[] r0 = (com.badlogic.gdx.scenes.scene2d.Touchable[]) r0
            return r0
    }
}
