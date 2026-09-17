package com.badlogic.gdx.graphics.g2d;

/* loaded from: classes.dex */
public class TextureRegion {
    int regionHeight;
    int regionWidth;
    com.badlogic.gdx.graphics.Texture texture;
    float u;
    float u2;
    float v;
    float v2;

    public TextureRegion() {
            r0 = this;
            r0.<init>()
            return
    }

    public TextureRegion(com.badlogic.gdx.graphics.Texture r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L14
            r2.texture = r3
            int r0 = r3.getWidth()
            int r3 = r3.getHeight()
            r1 = 0
            r2.setRegion(r1, r1, r0, r3)
            return
        L14:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "texture cannot be null."
            r3.<init>(r0)
            throw r3
    }

    public TextureRegion(com.badlogic.gdx.graphics.Texture r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.texture = r1
            r0.setRegion(r2, r3, r4, r5)
            return
    }

    public TextureRegion(com.badlogic.gdx.graphics.g2d.TextureRegion r1) {
            r0 = this;
            r0.<init>()
            r0.setRegion(r1)
            return
    }

    public TextureRegion(com.badlogic.gdx.graphics.g2d.TextureRegion r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.setRegion(r1, r2, r3, r4, r5)
            return
    }

    public void flip(boolean r2, boolean r3) {
            r1 = this;
            if (r2 == 0) goto La
            float r2 = r1.u
            float r0 = r1.u2
            r1.u = r0
            r1.u2 = r2
        La:
            if (r3 == 0) goto L14
            float r2 = r1.v
            float r3 = r1.v2
            r1.v = r3
            r1.v2 = r2
        L14:
            return
    }

    public int getRegionHeight() {
            r1 = this;
            int r0 = r1.regionHeight
            return r0
    }

    public int getRegionWidth() {
            r1 = this;
            int r0 = r1.regionWidth
            return r0
    }

    public int getRegionX() {
            r2 = this;
            float r0 = r2.u
            com.badlogic.gdx.graphics.Texture r1 = r2.texture
            int r1 = r1.getWidth()
            float r1 = (float) r1
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            return r0
    }

    public int getRegionY() {
            r2 = this;
            float r0 = r2.v
            com.badlogic.gdx.graphics.Texture r1 = r2.texture
            int r1 = r1.getHeight()
            float r1 = (float) r1
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            return r0
    }

    public com.badlogic.gdx.graphics.Texture getTexture() {
            r1 = this;
            com.badlogic.gdx.graphics.Texture r0 = r1.texture
            return r0
    }

    public float getU() {
            r1 = this;
            float r0 = r1.u
            return r0
    }

    public float getU2() {
            r1 = this;
            float r0 = r1.u2
            return r0
    }

    public float getV() {
            r1 = this;
            float r0 = r1.v
            return r0
    }

    public float getV2() {
            r1 = this;
            float r0 = r1.v2
            return r0
    }

    public void setRegion(float r6, float r7, float r8, float r9) {
            r5 = this;
            com.badlogic.gdx.graphics.Texture r0 = r5.texture
            int r0 = r0.getWidth()
            com.badlogic.gdx.graphics.Texture r1 = r5.texture
            int r1 = r1.getHeight()
            float r2 = r8 - r6
            float r2 = java.lang.Math.abs(r2)
            float r0 = (float) r0
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            r5.regionWidth = r2
            float r2 = r9 - r7
            float r2 = java.lang.Math.abs(r2)
            float r1 = (float) r1
            float r2 = r2 * r1
            int r2 = java.lang.Math.round(r2)
            r5.regionHeight = r2
            int r3 = r5.regionWidth
            r4 = 1
            if (r3 != r4) goto L3a
            if (r2 != r4) goto L3a
            r2 = 1048576000(0x3e800000, float:0.25)
            float r0 = r2 / r0
            float r6 = r6 + r0
            float r8 = r8 - r0
            float r2 = r2 / r1
            float r7 = r7 + r2
            float r9 = r9 - r2
        L3a:
            r5.u = r6
            r5.v = r7
            r5.u2 = r8
            r5.v2 = r9
            return
    }

    public void setRegion(int r5, int r6, int r7, int r8) {
            r4 = this;
            com.badlogic.gdx.graphics.Texture r0 = r4.texture
            int r0 = r0.getWidth()
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r1 / r0
            com.badlogic.gdx.graphics.Texture r2 = r4.texture
            int r2 = r2.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = (float) r5
            float r2 = r2 * r0
            float r3 = (float) r6
            float r3 = r3 * r1
            int r5 = r5 + r7
            float r5 = (float) r5
            float r5 = r5 * r0
            int r6 = r6 + r8
            float r6 = (float) r6
            float r6 = r6 * r1
            r4.setRegion(r2, r3, r5, r6)
            int r5 = java.lang.Math.abs(r7)
            r4.regionWidth = r5
            int r5 = java.lang.Math.abs(r8)
            r4.regionHeight = r5
            return
    }

    public void setRegion(com.badlogic.gdx.graphics.g2d.TextureRegion r4) {
            r3 = this;
            com.badlogic.gdx.graphics.Texture r0 = r4.texture
            r3.texture = r0
            float r0 = r4.u
            float r1 = r4.v
            float r2 = r4.u2
            float r4 = r4.v2
            r3.setRegion(r0, r1, r2, r4)
            return
    }

    public void setRegion(com.badlogic.gdx.graphics.g2d.TextureRegion r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            com.badlogic.gdx.graphics.Texture r0 = r2.texture
            r1.texture = r0
            int r0 = r2.getRegionX()
            int r0 = r0 + r3
            int r2 = r2.getRegionY()
            int r2 = r2 + r4
            r1.setRegion(r0, r2, r5, r6)
            return
    }
}
