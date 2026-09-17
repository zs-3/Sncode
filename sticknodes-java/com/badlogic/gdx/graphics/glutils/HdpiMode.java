package com.badlogic.gdx.graphics.glutils;

/* loaded from: classes.dex */
public enum HdpiMode extends java.lang.Enum<com.badlogic.gdx.graphics.glutils.HdpiMode> {
    private static final /* synthetic */ com.badlogic.gdx.graphics.glutils.HdpiMode[] $VALUES = null;
    public static final com.badlogic.gdx.graphics.glutils.HdpiMode Logical = null;
    public static final com.badlogic.gdx.graphics.glutils.HdpiMode Pixels = null;

    static {
            com.badlogic.gdx.graphics.glutils.HdpiMode r0 = new com.badlogic.gdx.graphics.glutils.HdpiMode
            java.lang.String r1 = "Logical"
            r2 = 0
            r0.<init>(r1, r2)
            com.badlogic.gdx.graphics.glutils.HdpiMode.Logical = r0
            com.badlogic.gdx.graphics.glutils.HdpiMode r1 = new com.badlogic.gdx.graphics.glutils.HdpiMode
            java.lang.String r3 = "Pixels"
            r4 = 1
            r1.<init>(r3, r4)
            com.badlogic.gdx.graphics.glutils.HdpiMode.Pixels = r1
            r3 = 2
            com.badlogic.gdx.graphics.glutils.HdpiMode[] r3 = new com.badlogic.gdx.graphics.glutils.HdpiMode[r3]
            r3[r2] = r0
            r3[r4] = r1
            com.badlogic.gdx.graphics.glutils.HdpiMode.$VALUES = r3
            return
    }

    HdpiMode(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.badlogic.gdx.graphics.glutils.HdpiMode valueOf(java.lang.String r1) {
            java.lang.Class<com.badlogic.gdx.graphics.glutils.HdpiMode> r0 = com.badlogic.gdx.graphics.glutils.HdpiMode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.badlogic.gdx.graphics.glutils.HdpiMode r1 = (com.badlogic.gdx.graphics.glutils.HdpiMode) r1
            return r1
    }

    public static com.badlogic.gdx.graphics.glutils.HdpiMode[] values() {
            com.badlogic.gdx.graphics.glutils.HdpiMode[] r0 = com.badlogic.gdx.graphics.glutils.HdpiMode.$VALUES
            java.lang.Object r0 = r0.clone()
            com.badlogic.gdx.graphics.glutils.HdpiMode[] r0 = (com.badlogic.gdx.graphics.glutils.HdpiMode[]) r0
            return r0
    }
}
