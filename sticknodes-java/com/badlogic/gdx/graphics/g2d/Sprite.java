package com.badlogic.gdx.graphics.g2d;

/* loaded from: classes.dex */
public class Sprite extends com.badlogic.gdx.graphics.g2d.TextureRegion {
    private final com.badlogic.gdx.graphics.Color color;
    private boolean dirty;
    float height;
    private float originX;
    private float originY;
    private float rotation;
    private float scaleX;
    private float scaleY;
    final float[] vertices;
    float width;
    private float x;
    private float y;

    public Sprite() {
            r2 = this;
            r2.<init>()
            r0 = 20
            float[] r0 = new float[r0]
            r2.vertices = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r1, r1, r1)
            r2.color = r0
            r2.scaleX = r1
            r2.scaleY = r1
            r0 = 1
            r2.dirty = r0
            r2.setColor(r1, r1, r1, r1)
            return
    }

    public Sprite(com.badlogic.gdx.graphics.Texture r7) {
            r6 = this;
            int r4 = r7.getWidth()
            int r5 = r7.getHeight()
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public Sprite(com.badlogic.gdx.graphics.Texture r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            r2.<init>()
            r0 = 20
            float[] r0 = new float[r0]
            r2.vertices = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r1, r1, r1)
            r2.color = r0
            r2.scaleX = r1
            r2.scaleY = r1
            r0 = 1
            r2.dirty = r0
            if (r3 == 0) goto L3c
            r2.texture = r3
            r2.setRegion(r4, r5, r6, r7)
            r2.setColor(r1, r1, r1, r1)
            int r3 = java.lang.Math.abs(r6)
            float r3 = (float) r3
            int r4 = java.lang.Math.abs(r7)
            float r4 = (float) r4
            r2.setSize(r3, r4)
            float r3 = r2.width
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r5 = r2.height
            float r5 = r5 / r4
            r2.setOrigin(r3, r5)
            return
        L3c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "texture cannot be null."
            r3.<init>(r4)
            throw r3
    }

    public Sprite(com.badlogic.gdx.graphics.g2d.Sprite r3) {
            r2 = this;
            r2.<init>()
            r0 = 20
            float[] r0 = new float[r0]
            r2.vertices = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r1, r1, r1)
            r2.color = r0
            r2.scaleX = r1
            r2.scaleY = r1
            r0 = 1
            r2.dirty = r0
            r2.set(r3)
            return
    }

    public Sprite(com.badlogic.gdx.graphics.g2d.TextureRegion r3) {
            r2 = this;
            r2.<init>()
            r0 = 20
            float[] r0 = new float[r0]
            r2.vertices = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r1, r1, r1)
            r2.color = r0
            r2.scaleX = r1
            r2.scaleY = r1
            r0 = 1
            r2.dirty = r0
            r2.setRegion(r3)
            r2.setColor(r1, r1, r1, r1)
            int r0 = r3.getRegionWidth()
            float r0 = (float) r0
            int r3 = r3.getRegionHeight()
            float r3 = (float) r3
            r2.setSize(r0, r3)
            float r3 = r2.width
            r0 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r0
            float r1 = r2.height
            float r1 = r1 / r0
            r2.setOrigin(r3, r1)
            return
    }

    public void draw(com.badlogic.gdx.graphics.g2d.Batch r5) {
            r4 = this;
            com.badlogic.gdx.graphics.Texture r0 = r4.texture
            float[] r1 = r4.getVertices()
            r2 = 0
            r3 = 20
            r5.draw(r0, r1, r2, r3)
            return
    }

    @Override // com.badlogic.gdx.graphics.g2d.TextureRegion
    public void flip(boolean r5, boolean r6) {
            r4 = this;
            super.flip(r5, r6)
            float[] r0 = r4.vertices
            if (r5 == 0) goto L1e
            r5 = 3
            r1 = r0[r5]
            r2 = 13
            r3 = r0[r2]
            r0[r5] = r3
            r0[r2] = r1
            r5 = 8
            r1 = r0[r5]
            r2 = 18
            r3 = r0[r2]
            r0[r5] = r3
            r0[r2] = r1
        L1e:
            if (r6 == 0) goto L37
            r5 = 4
            r6 = r0[r5]
            r1 = 14
            r2 = r0[r1]
            r0[r5] = r2
            r0[r1] = r6
            r5 = 9
            r6 = r0[r5]
            r1 = 19
            r2 = r0[r1]
            r0[r5] = r2
            r0[r1] = r6
        L37:
            return
    }

    public com.badlogic.gdx.graphics.Color getColor() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.color
            return r0
    }

    public float getHeight() {
            r1 = this;
            float r0 = r1.height
            return r0
    }

    public float getOriginX() {
            r1 = this;
            float r0 = r1.originX
            return r0
    }

    public float getOriginY() {
            r1 = this;
            float r0 = r1.originY
            return r0
    }

    public float[] getVertices() {
            r21 = this;
            r0 = r21
            boolean r1 = r0.dirty
            if (r1 == 0) goto La2
            r1 = 0
            r0.dirty = r1
            float[] r2 = r0.vertices
            float r3 = r0.originX
            float r3 = -r3
            float r4 = r0.originY
            float r4 = -r4
            float r5 = r0.width
            float r5 = r5 + r3
            float r6 = r0.height
            float r6 = r6 + r4
            float r7 = r0.x
            float r7 = r7 - r3
            float r8 = r0.y
            float r8 = r8 - r4
            float r9 = r0.scaleX
            r10 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r11 != 0) goto L2b
            float r11 = r0.scaleY
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 == 0) goto L35
        L2b:
            float r3 = r3 * r9
            float r10 = r0.scaleY
            float r4 = r4 * r10
            float r5 = r5 * r9
            float r6 = r6 * r10
        L35:
            float r9 = r0.rotation
            r10 = 0
            r11 = 16
            r12 = 15
            r13 = 11
            r14 = 10
            r15 = 6
            r16 = 5
            r17 = 1
            int r10 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r10 == 0) goto L8e
            float r9 = com.badlogic.gdx.math.MathUtils.cosDeg(r9)
            float r10 = r0.rotation
            float r10 = com.badlogic.gdx.math.MathUtils.sinDeg(r10)
            float r18 = r3 * r9
            float r3 = r3 * r10
            float r19 = r4 * r9
            float r4 = r4 * r10
            float r20 = r5 * r9
            float r5 = r5 * r10
            float r9 = r9 * r6
            float r6 = r6 * r10
            float r4 = r18 - r4
            float r4 = r4 + r7
            float r19 = r19 + r3
            float r19 = r19 + r8
            r2[r1] = r4
            r2[r17] = r19
            float r18 = r18 - r6
            float r18 = r18 + r7
            float r3 = r3 + r9
            float r3 = r3 + r8
            r2[r16] = r18
            r2[r15] = r3
            float r20 = r20 - r6
            float r20 = r20 + r7
            float r9 = r9 + r5
            float r9 = r9 + r8
            r2[r14] = r20
            r2[r13] = r9
            float r20 = r20 - r18
            float r4 = r4 + r20
            r2[r12] = r4
            float r3 = r3 - r19
            float r9 = r9 - r3
            r2[r11] = r9
            goto La2
        L8e:
            float r3 = r3 + r7
            float r4 = r4 + r8
            float r5 = r5 + r7
            float r6 = r6 + r8
            r2[r1] = r3
            r2[r17] = r4
            r2[r16] = r3
            r2[r15] = r6
            r2[r14] = r5
            r2[r13] = r6
            r2[r12] = r5
            r2[r11] = r4
        La2:
            float[] r1 = r0.vertices
            return r1
    }

    public float getWidth() {
            r1 = this;
            float r0 = r1.width
            return r0
    }

    public float getX() {
            r1 = this;
            float r0 = r1.x
            return r0
    }

    public float getY() {
            r1 = this;
            float r0 = r1.y
            return r0
    }

    public void rotate90(boolean r11) {
            r10 = this;
            float[] r0 = r10.vertices
            r1 = 18
            r2 = 13
            r3 = 8
            r4 = 3
            r5 = 19
            r6 = 14
            r7 = 9
            r8 = 4
            if (r11 == 0) goto L33
            r11 = r0[r8]
            r9 = r0[r5]
            r0[r8] = r9
            r8 = r0[r6]
            r0[r5] = r8
            r5 = r0[r7]
            r0[r6] = r5
            r0[r7] = r11
            r11 = r0[r4]
            r5 = r0[r1]
            r0[r4] = r5
            r4 = r0[r2]
            r0[r1] = r4
            r1 = r0[r3]
            r0[r2] = r1
            r0[r3] = r11
            goto L53
        L33:
            r11 = r0[r8]
            r9 = r0[r7]
            r0[r8] = r9
            r8 = r0[r6]
            r0[r7] = r8
            r7 = r0[r5]
            r0[r6] = r7
            r0[r5] = r11
            r11 = r0[r4]
            r5 = r0[r3]
            r0[r4] = r5
            r4 = r0[r2]
            r0[r3] = r4
            r3 = r0[r1]
            r0[r2] = r3
            r0[r1] = r11
        L53:
            return
    }

    public void set(com.badlogic.gdx.graphics.g2d.Sprite r5) {
            r4 = this;
            if (r5 == 0) goto L58
            float[] r0 = r5.vertices
            float[] r1 = r4.vertices
            r2 = 20
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            com.badlogic.gdx.graphics.Texture r0 = r5.texture
            r4.texture = r0
            float r0 = r5.u
            r4.u = r0
            float r0 = r5.v
            r4.v = r0
            float r0 = r5.u2
            r4.u2 = r0
            float r0 = r5.v2
            r4.v2 = r0
            float r0 = r5.x
            r4.x = r0
            float r0 = r5.y
            r4.y = r0
            float r0 = r5.width
            r4.width = r0
            float r0 = r5.height
            r4.height = r0
            int r0 = r5.regionWidth
            r4.regionWidth = r0
            int r0 = r5.regionHeight
            r4.regionHeight = r0
            float r0 = r5.originX
            r4.originX = r0
            float r0 = r5.originY
            r4.originY = r0
            float r0 = r5.rotation
            r4.rotation = r0
            float r0 = r5.scaleX
            r4.scaleX = r0
            float r0 = r5.scaleY
            r4.scaleY = r0
            com.badlogic.gdx.graphics.Color r0 = r4.color
            com.badlogic.gdx.graphics.Color r1 = r5.color
            r0.set(r1)
            boolean r5 = r5.dirty
            r4.dirty = r5
            return
        L58:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "sprite cannot be null."
            r5.<init>(r0)
            throw r5
    }

    public void setBounds(float r4, float r5, float r6, float r7) {
            r3 = this;
            r3.x = r4
            r3.y = r5
            r3.width = r6
            r3.height = r7
            boolean r0 = r3.dirty
            if (r0 == 0) goto Ld
            return
        Ld:
            float r0 = r3.rotation
            r1 = 0
            r2 = 1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L44
            float r0 = r3.scaleX
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L44
            float r0 = r3.scaleY
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L24
            goto L44
        L24:
            float r6 = r6 + r4
            float r7 = r7 + r5
            float[] r0 = r3.vertices
            r1 = 0
            r0[r1] = r4
            r0[r2] = r5
            r1 = 5
            r0[r1] = r4
            r4 = 6
            r0[r4] = r7
            r4 = 10
            r0[r4] = r6
            r4 = 11
            r0[r4] = r7
            r4 = 15
            r0[r4] = r6
            r4 = 16
            r0[r4] = r5
            return
        L44:
            r3.dirty = r2
            return
    }

    public void setColor(float r2, float r3, float r4, float r5) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1.color
            r0.set(r2, r3, r4, r5)
            com.badlogic.gdx.graphics.Color r2 = r1.color
            float r2 = r2.toFloatBits()
            float[] r3 = r1.vertices
            r4 = 2
            r3[r4] = r2
            r4 = 7
            r3[r4] = r2
            r4 = 12
            r3[r4] = r2
            r4 = 17
            r3[r4] = r2
            return
    }

    public void setColor(com.badlogic.gdx.graphics.Color r3) {
            r2 = this;
            com.badlogic.gdx.graphics.Color r0 = r2.color
            r0.set(r3)
            float r3 = r3.toFloatBits()
            float[] r0 = r2.vertices
            r1 = 2
            r0[r1] = r3
            r1 = 7
            r0[r1] = r3
            r1 = 12
            r0[r1] = r3
            r1 = 17
            r0[r1] = r3
            return
    }

    public void setOrigin(float r1, float r2) {
            r0 = this;
            r0.originX = r1
            r0.originY = r2
            r1 = 1
            r0.dirty = r1
            return
    }

    public void setPackedColor(float r3) {
            r2 = this;
            com.badlogic.gdx.graphics.Color r0 = r2.color
            com.badlogic.gdx.graphics.Color.abgr8888ToColor(r0, r3)
            float[] r0 = r2.vertices
            r1 = 2
            r0[r1] = r3
            r1 = 7
            r0[r1] = r3
            r1 = 12
            r0[r1] = r3
            r1 = 17
            r0[r1] = r3
            return
    }

    public void setPosition(float r6, float r7) {
            r5 = this;
            r5.x = r6
            r5.y = r7
            boolean r0 = r5.dirty
            if (r0 == 0) goto L9
            return
        L9:
            float r0 = r5.rotation
            r1 = 0
            r2 = 1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L44
            float r0 = r5.scaleX
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L44
            float r0 = r5.scaleY
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L20
            goto L44
        L20:
            float r0 = r5.width
            float r0 = r0 + r6
            float r1 = r5.height
            float r1 = r1 + r7
            float[] r3 = r5.vertices
            r4 = 0
            r3[r4] = r6
            r3[r2] = r7
            r2 = 5
            r3[r2] = r6
            r6 = 6
            r3[r6] = r1
            r6 = 10
            r3[r6] = r0
            r6 = 11
            r3[r6] = r1
            r6 = 15
            r3[r6] = r0
            r6 = 16
            r3[r6] = r7
            return
        L44:
            r5.dirty = r2
            return
    }

    @Override // com.badlogic.gdx.graphics.g2d.TextureRegion
    public void setRegion(float r3, float r4, float r5, float r6) {
            r2 = this;
            super.setRegion(r3, r4, r5, r6)
            float[] r0 = r2.vertices
            r1 = 3
            r0[r1] = r3
            r1 = 4
            r0[r1] = r6
            r1 = 8
            r0[r1] = r3
            r3 = 9
            r0[r3] = r4
            r3 = 13
            r0[r3] = r5
            r3 = 14
            r0[r3] = r4
            r3 = 18
            r0[r3] = r5
            r3 = 19
            r0[r3] = r6
            return
    }

    public void setRotation(float r1) {
            r0 = this;
            r0.rotation = r1
            r1 = 1
            r0.dirty = r1
            return
    }

    public void setScale(float r1, float r2) {
            r0 = this;
            r0.scaleX = r1
            r0.scaleY = r2
            r1 = 1
            r0.dirty = r1
            return
    }

    public void setSize(float r6, float r7) {
            r5 = this;
            r5.width = r6
            r5.height = r7
            boolean r0 = r5.dirty
            if (r0 == 0) goto L9
            return
        L9:
            float r0 = r5.rotation
            r1 = 0
            r2 = 1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L44
            float r0 = r5.scaleX
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L44
            float r0 = r5.scaleY
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L20
            goto L44
        L20:
            float r0 = r5.x
            float r6 = r6 + r0
            float r1 = r5.y
            float r7 = r7 + r1
            float[] r3 = r5.vertices
            r4 = 0
            r3[r4] = r0
            r3[r2] = r1
            r2 = 5
            r3[r2] = r0
            r0 = 6
            r3[r0] = r7
            r0 = 10
            r3[r0] = r6
            r0 = 11
            r3[r0] = r7
            r7 = 15
            r3[r7] = r6
            r6 = 16
            r3[r6] = r1
            return
        L44:
            r5.dirty = r2
            return
    }

    public void translate(float r5, float r6) {
            r4 = this;
            float r0 = r4.x
            float r0 = r0 + r5
            r4.x = r0
            float r0 = r4.y
            float r0 = r0 + r6
            r4.y = r0
            boolean r0 = r4.dirty
            if (r0 == 0) goto Lf
            return
        Lf:
            float r0 = r4.rotation
            r1 = 0
            r2 = 1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L5c
            float r0 = r4.scaleX
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L5c
            float r0 = r4.scaleY
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L26
            goto L5c
        L26:
            float[] r0 = r4.vertices
            r1 = 0
            r3 = r0[r1]
            float r3 = r3 + r5
            r0[r1] = r3
            r1 = r0[r2]
            float r1 = r1 + r6
            r0[r2] = r1
            r1 = 5
            r2 = r0[r1]
            float r2 = r2 + r5
            r0[r1] = r2
            r1 = 6
            r2 = r0[r1]
            float r2 = r2 + r6
            r0[r1] = r2
            r1 = 10
            r2 = r0[r1]
            float r2 = r2 + r5
            r0[r1] = r2
            r1 = 11
            r2 = r0[r1]
            float r2 = r2 + r6
            r0[r1] = r2
            r1 = 15
            r2 = r0[r1]
            float r2 = r2 + r5
            r0[r1] = r2
            r5 = 16
            r1 = r0[r5]
            float r1 = r1 + r6
            r0[r5] = r1
            return
        L5c:
            r4.dirty = r2
            return
    }
}
