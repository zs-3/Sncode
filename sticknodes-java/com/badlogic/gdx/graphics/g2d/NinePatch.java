package com.badlogic.gdx.graphics.g2d;

/* loaded from: classes.dex */
public class NinePatch {
    private static final com.badlogic.gdx.graphics.Color tmpDrawColor = null;
    private int bottomCenter;
    private float bottomHeight;
    private int bottomLeft;
    private int bottomRight;
    private final com.badlogic.gdx.graphics.Color color;
    private int idx;
    private float leftWidth;
    private int middleCenter;
    private float middleHeight;
    private int middleLeft;
    private int middleRight;
    private float middleWidth;
    private float padBottom;
    private float padLeft;
    private float padRight;
    private float padTop;
    private float rightWidth;
    private com.badlogic.gdx.graphics.Texture texture;
    private int topCenter;
    private float topHeight;
    private int topLeft;
    private int topRight;
    private float[] vertices;

    static {
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>()
            com.badlogic.gdx.graphics.g2d.NinePatch.tmpDrawColor = r0
            return
    }

    public NinePatch(com.badlogic.gdx.graphics.g2d.NinePatch r6, com.badlogic.gdx.graphics.Color r7) {
            r5 = this;
            r5.<init>()
            r0 = 180(0xb4, float:2.52E-43)
            float[] r0 = new float[r0]
            r5.vertices = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.WHITE
            r0.<init>(r1)
            r5.color = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5.padLeft = r1
            r5.padRight = r1
            r5.padTop = r1
            r5.padBottom = r1
            com.badlogic.gdx.graphics.Texture r1 = r6.texture
            r5.texture = r1
            int r1 = r6.bottomLeft
            r5.bottomLeft = r1
            int r1 = r6.bottomCenter
            r5.bottomCenter = r1
            int r1 = r6.bottomRight
            r5.bottomRight = r1
            int r1 = r6.middleLeft
            r5.middleLeft = r1
            int r1 = r6.middleCenter
            r5.middleCenter = r1
            int r1 = r6.middleRight
            r5.middleRight = r1
            int r1 = r6.topLeft
            r5.topLeft = r1
            int r1 = r6.topCenter
            r5.topCenter = r1
            int r1 = r6.topRight
            r5.topRight = r1
            float r1 = r6.leftWidth
            r5.leftWidth = r1
            float r1 = r6.rightWidth
            r5.rightWidth = r1
            float r1 = r6.middleWidth
            r5.middleWidth = r1
            float r1 = r6.middleHeight
            r5.middleHeight = r1
            float r1 = r6.topHeight
            r5.topHeight = r1
            float r1 = r6.bottomHeight
            r5.bottomHeight = r1
            float r1 = r6.padLeft
            r5.padLeft = r1
            float r1 = r6.padTop
            r5.padTop = r1
            float r1 = r6.padBottom
            r5.padBottom = r1
            float r1 = r6.padRight
            r5.padRight = r1
            float[] r1 = r6.vertices
            int r1 = r1.length
            float[] r1 = new float[r1]
            r5.vertices = r1
            float[] r2 = r6.vertices
            int r3 = r2.length
            r4 = 0
            java.lang.System.arraycopy(r2, r4, r1, r4, r3)
            int r6 = r6.idx
            r5.idx = r6
            r0.set(r7)
            return
    }

    public NinePatch(com.badlogic.gdx.graphics.g2d.TextureRegion r4) {
            r3 = this;
            r3.<init>()
            r0 = 180(0xb4, float:2.52E-43)
            float[] r0 = new float[r0]
            r3.vertices = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.WHITE
            r0.<init>(r1)
            r3.color = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.padLeft = r0
            r3.padRight = r0
            r3.padTop = r0
            r3.padBottom = r0
            r0 = 9
            com.badlogic.gdx.graphics.g2d.TextureRegion[] r0 = new com.badlogic.gdx.graphics.g2d.TextureRegion[r0]
            r1 = 0
            r2 = 0
            r0[r1] = r2
            r1 = 1
            r0[r1] = r2
            r1 = 2
            r0[r1] = r2
            r1 = 3
            r0[r1] = r2
            r1 = 4
            r0[r1] = r4
            r4 = 5
            r0[r4] = r2
            r4 = 6
            r0[r4] = r2
            r4 = 7
            r0[r4] = r2
            r4 = 8
            r0[r4] = r2
            r3.load(r0)
            return
    }

    public NinePatch(com.badlogic.gdx.graphics.g2d.TextureRegion r20, int r21, int r22, int r23, int r24) {
            r19 = this;
            r0 = r19
            r19.<init>()
            r1 = 180(0xb4, float:2.52E-43)
            float[] r1 = new float[r1]
            r0.vertices = r1
            com.badlogic.gdx.graphics.Color r1 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r2 = com.badlogic.gdx.graphics.Color.WHITE
            r1.<init>(r2)
            r0.color = r1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.padLeft = r1
            r0.padRight = r1
            r0.padTop = r1
            r0.padBottom = r1
            if (r20 == 0) goto L121
            int r1 = r20.getRegionWidth()
            int r1 = r1 - r21
            int r7 = r1 - r22
            int r1 = r20.getRegionHeight()
            int r1 = r1 - r23
            int r8 = r1 - r24
            r1 = 9
            com.badlogic.gdx.graphics.g2d.TextureRegion[] r9 = new com.badlogic.gdx.graphics.g2d.TextureRegion[r1]
            r10 = 1
            r11 = 2
            if (r23 <= 0) goto L70
            if (r21 <= 0) goto L4b
            r12 = 0
            com.badlogic.gdx.graphics.g2d.TextureRegion r13 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            r3 = 0
            r4 = 0
            r1 = r13
            r2 = r20
            r5 = r21
            r6 = r23
            r1.<init>(r2, r3, r4, r5, r6)
            r9[r12] = r13
        L4b:
            if (r7 <= 0) goto L5d
            com.badlogic.gdx.graphics.g2d.TextureRegion r12 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            r4 = 0
            r1 = r12
            r2 = r20
            r3 = r21
            r5 = r7
            r6 = r23
            r1.<init>(r2, r3, r4, r5, r6)
            r9[r10] = r12
        L5d:
            if (r22 <= 0) goto L70
            com.badlogic.gdx.graphics.g2d.TextureRegion r12 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            int r3 = r21 + r7
            r4 = 0
            r1 = r12
            r2 = r20
            r5 = r22
            r6 = r23
            r1.<init>(r2, r3, r4, r5, r6)
            r9[r11] = r12
        L70:
            r12 = 3
            r13 = 4
            r14 = 5
            if (r8 <= 0) goto Lac
            if (r21 <= 0) goto L87
            com.badlogic.gdx.graphics.g2d.TextureRegion r15 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            r3 = 0
            r1 = r15
            r2 = r20
            r4 = r23
            r5 = r21
            r6 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r9[r12] = r15
        L87:
            if (r7 <= 0) goto L99
            com.badlogic.gdx.graphics.g2d.TextureRegion r15 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            r1 = r15
            r2 = r20
            r3 = r21
            r4 = r23
            r5 = r7
            r6 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r9[r13] = r15
        L99:
            if (r22 <= 0) goto Lac
            com.badlogic.gdx.graphics.g2d.TextureRegion r15 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            int r3 = r21 + r7
            r1 = r15
            r2 = r20
            r4 = r23
            r5 = r22
            r6 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r9[r14] = r15
        Lac:
            r15 = 6
            r16 = 7
            r17 = 8
            if (r24 <= 0) goto Lf0
            if (r21 <= 0) goto Lc7
            com.badlogic.gdx.graphics.g2d.TextureRegion r18 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            r3 = 0
            int r4 = r23 + r8
            r1 = r18
            r2 = r20
            r5 = r21
            r6 = r24
            r1.<init>(r2, r3, r4, r5, r6)
            r9[r15] = r18
        Lc7:
            if (r7 <= 0) goto Ldb
            com.badlogic.gdx.graphics.g2d.TextureRegion r18 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            int r4 = r23 + r8
            r1 = r18
            r2 = r20
            r3 = r21
            r5 = r7
            r6 = r24
            r1.<init>(r2, r3, r4, r5, r6)
            r9[r16] = r18
        Ldb:
            if (r22 <= 0) goto Lf0
            com.badlogic.gdx.graphics.g2d.TextureRegion r18 = new com.badlogic.gdx.graphics.g2d.TextureRegion
            int r3 = r21 + r7
            int r4 = r23 + r8
            r1 = r18
            r2 = r20
            r5 = r22
            r6 = r24
            r1.<init>(r2, r3, r4, r5, r6)
            r9[r17] = r18
        Lf0:
            r1 = 0
            if (r21 != 0) goto L107
            if (r7 != 0) goto L107
            r2 = r9[r11]
            r9[r10] = r2
            r2 = r9[r14]
            r9[r13] = r2
            r2 = r9[r17]
            r9[r16] = r2
            r9[r11] = r1
            r9[r14] = r1
            r9[r17] = r1
        L107:
            if (r23 != 0) goto L11d
            if (r8 != 0) goto L11d
            r2 = r9[r15]
            r9[r12] = r2
            r2 = r9[r16]
            r9[r13] = r2
            r2 = r9[r17]
            r9[r14] = r2
            r9[r15] = r1
            r9[r16] = r1
            r9[r17] = r1
        L11d:
            r0.load(r9)
            return
        L121:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "region cannot be null."
            r1.<init>(r2)
            throw r1
    }

    private int add(com.badlogic.gdx.graphics.g2d.TextureRegion r6, boolean r7, boolean r8) {
            r5 = this;
            com.badlogic.gdx.graphics.Texture r0 = r5.texture
            if (r0 != 0) goto Lb
            com.badlogic.gdx.graphics.Texture r0 = r6.getTexture()
            r5.texture = r0
            goto L11
        Lb:
            com.badlogic.gdx.graphics.Texture r1 = r6.getTexture()
            if (r0 != r1) goto L6f
        L11:
            float r0 = r6.u
            float r1 = r6.v2
            float r2 = r6.u2
            float r6 = r6.v
            com.badlogic.gdx.graphics.Texture r3 = r5.texture
            com.badlogic.gdx.graphics.Texture$TextureFilter r3 = r3.getMagFilter()
            com.badlogic.gdx.graphics.Texture$TextureFilter r4 = com.badlogic.gdx.graphics.Texture.TextureFilter.Linear
            if (r3 == r4) goto L2b
            com.badlogic.gdx.graphics.Texture r3 = r5.texture
            com.badlogic.gdx.graphics.Texture$TextureFilter r3 = r3.getMinFilter()
            if (r3 != r4) goto L46
        L2b:
            r3 = 1056964608(0x3f000000, float:0.5)
            if (r7 == 0) goto L3a
            com.badlogic.gdx.graphics.Texture r7 = r5.texture
            int r7 = r7.getWidth()
            float r7 = (float) r7
            float r7 = r3 / r7
            float r0 = r0 + r7
            float r2 = r2 - r7
        L3a:
            if (r8 == 0) goto L46
            com.badlogic.gdx.graphics.Texture r7 = r5.texture
            int r7 = r7.getHeight()
            float r7 = (float) r7
            float r3 = r3 / r7
            float r1 = r1 - r3
            float r6 = r6 + r3
        L46:
            float[] r7 = r5.vertices
            int r8 = r5.idx
            int r3 = r8 + 3
            r7[r3] = r0
            int r3 = r8 + 4
            r7[r3] = r1
            int r3 = r8 + 8
            r7[r3] = r0
            int r0 = r8 + 9
            r7[r0] = r6
            int r0 = r8 + 13
            r7[r0] = r2
            int r0 = r8 + 14
            r7[r0] = r6
            int r6 = r8 + 18
            r7[r6] = r2
            int r6 = r8 + 19
            r7[r6] = r1
            int r6 = r8 + 20
            r5.idx = r6
            return r8
        L6f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "All regions must be from the same texture."
            r6.<init>(r7)
            throw r6
    }

    private void load(com.badlogic.gdx.graphics.g2d.TextureRegion[] r11) {
            r10 = this;
            r0 = 6
            r1 = r11[r0]
            r2 = -1
            r3 = 0
            if (r1 == 0) goto L22
            r1 = r11[r0]
            int r1 = r10.add(r1, r3, r3)
            r10.bottomLeft = r1
            r1 = r11[r0]
            int r1 = r1.getRegionWidth()
            float r1 = (float) r1
            r10.leftWidth = r1
            r1 = r11[r0]
            int r1 = r1.getRegionHeight()
            float r1 = (float) r1
            r10.bottomHeight = r1
            goto L24
        L22:
            r10.bottomLeft = r2
        L24:
            r1 = 7
            r4 = r11[r1]
            r5 = 8
            r6 = 1
            if (r4 == 0) goto L5f
            r4 = r11[r1]
            r7 = r11[r0]
            if (r7 != 0) goto L39
            r7 = r11[r5]
            if (r7 == 0) goto L37
            goto L39
        L37:
            r7 = 0
            goto L3a
        L39:
            r7 = 1
        L3a:
            int r4 = r10.add(r4, r7, r3)
            r10.bottomCenter = r4
            float r4 = r10.middleWidth
            r7 = r11[r1]
            int r7 = r7.getRegionWidth()
            float r7 = (float) r7
            float r4 = java.lang.Math.max(r4, r7)
            r10.middleWidth = r4
            float r4 = r10.bottomHeight
            r7 = r11[r1]
            int r7 = r7.getRegionHeight()
            float r7 = (float) r7
            float r4 = java.lang.Math.max(r4, r7)
            r10.bottomHeight = r4
            goto L61
        L5f:
            r10.bottomCenter = r2
        L61:
            r4 = r11[r5]
            if (r4 == 0) goto L8c
            r4 = r11[r5]
            int r4 = r10.add(r4, r3, r3)
            r10.bottomRight = r4
            float r4 = r10.rightWidth
            r7 = r11[r5]
            int r7 = r7.getRegionWidth()
            float r7 = (float) r7
            float r4 = java.lang.Math.max(r4, r7)
            r10.rightWidth = r4
            float r4 = r10.bottomHeight
            r7 = r11[r5]
            int r7 = r7.getRegionHeight()
            float r7 = (float) r7
            float r4 = java.lang.Math.max(r4, r7)
            r10.bottomHeight = r4
            goto L8e
        L8c:
            r10.bottomRight = r2
        L8e:
            r4 = 3
            r7 = r11[r4]
            if (r7 == 0) goto Lc6
            r7 = r11[r4]
            r8 = r11[r3]
            if (r8 != 0) goto La0
            r0 = r11[r0]
            if (r0 == 0) goto L9e
            goto La0
        L9e:
            r0 = 0
            goto La1
        La0:
            r0 = 1
        La1:
            int r0 = r10.add(r7, r3, r0)
            r10.middleLeft = r0
            float r0 = r10.leftWidth
            r7 = r11[r4]
            int r7 = r7.getRegionWidth()
            float r7 = (float) r7
            float r0 = java.lang.Math.max(r0, r7)
            r10.leftWidth = r0
            float r0 = r10.middleHeight
            r7 = r11[r4]
            int r7 = r7.getRegionHeight()
            float r7 = (float) r7
            float r0 = java.lang.Math.max(r0, r7)
            r10.middleHeight = r0
            goto Lc8
        Lc6:
            r10.middleLeft = r2
        Lc8:
            r0 = 4
            r7 = r11[r0]
            r8 = 5
            if (r7 == 0) goto L10d
            r7 = r11[r0]
            r4 = r11[r4]
            if (r4 != 0) goto Ldb
            r4 = r11[r8]
            if (r4 == 0) goto Ld9
            goto Ldb
        Ld9:
            r4 = 0
            goto Ldc
        Ldb:
            r4 = 1
        Ldc:
            r9 = r11[r6]
            if (r9 != 0) goto Le7
            r1 = r11[r1]
            if (r1 == 0) goto Le5
            goto Le7
        Le5:
            r1 = 0
            goto Le8
        Le7:
            r1 = 1
        Le8:
            int r1 = r10.add(r7, r4, r1)
            r10.middleCenter = r1
            float r1 = r10.middleWidth
            r4 = r11[r0]
            int r4 = r4.getRegionWidth()
            float r4 = (float) r4
            float r1 = java.lang.Math.max(r1, r4)
            r10.middleWidth = r1
            float r1 = r10.middleHeight
            r0 = r11[r0]
            int r0 = r0.getRegionHeight()
            float r0 = (float) r0
            float r0 = java.lang.Math.max(r1, r0)
            r10.middleHeight = r0
            goto L10f
        L10d:
            r10.middleCenter = r2
        L10f:
            r0 = r11[r8]
            r1 = 2
            if (r0 == 0) goto L147
            r0 = r11[r8]
            r4 = r11[r1]
            if (r4 != 0) goto L121
            r4 = r11[r5]
            if (r4 == 0) goto L11f
            goto L121
        L11f:
            r4 = 0
            goto L122
        L121:
            r4 = 1
        L122:
            int r0 = r10.add(r0, r3, r4)
            r10.middleRight = r0
            float r0 = r10.rightWidth
            r4 = r11[r8]
            int r4 = r4.getRegionWidth()
            float r4 = (float) r4
            float r0 = java.lang.Math.max(r0, r4)
            r10.rightWidth = r0
            float r0 = r10.middleHeight
            r4 = r11[r8]
            int r4 = r4.getRegionHeight()
            float r4 = (float) r4
            float r0 = java.lang.Math.max(r0, r4)
            r10.middleHeight = r0
            goto L149
        L147:
            r10.middleRight = r2
        L149:
            r0 = r11[r3]
            if (r0 == 0) goto L174
            r0 = r11[r3]
            int r0 = r10.add(r0, r3, r3)
            r10.topLeft = r0
            float r0 = r10.leftWidth
            r4 = r11[r3]
            int r4 = r4.getRegionWidth()
            float r4 = (float) r4
            float r0 = java.lang.Math.max(r0, r4)
            r10.leftWidth = r0
            float r0 = r10.topHeight
            r4 = r11[r3]
            int r4 = r4.getRegionHeight()
            float r4 = (float) r4
            float r0 = java.lang.Math.max(r0, r4)
            r10.topHeight = r0
            goto L176
        L174:
            r10.topLeft = r2
        L176:
            r0 = r11[r6]
            if (r0 == 0) goto L1ad
            r0 = r11[r6]
            r4 = r11[r3]
            if (r4 != 0) goto L187
            r4 = r11[r1]
            if (r4 == 0) goto L185
            goto L187
        L185:
            r4 = 0
            goto L188
        L187:
            r4 = 1
        L188:
            int r0 = r10.add(r0, r4, r3)
            r10.topCenter = r0
            float r0 = r10.middleWidth
            r4 = r11[r6]
            int r4 = r4.getRegionWidth()
            float r4 = (float) r4
            float r0 = java.lang.Math.max(r0, r4)
            r10.middleWidth = r0
            float r0 = r10.topHeight
            r4 = r11[r6]
            int r4 = r4.getRegionHeight()
            float r4 = (float) r4
            float r0 = java.lang.Math.max(r0, r4)
            r10.topHeight = r0
            goto L1af
        L1ad:
            r10.topCenter = r2
        L1af:
            r0 = r11[r1]
            if (r0 == 0) goto L1da
            r0 = r11[r1]
            int r0 = r10.add(r0, r3, r3)
            r10.topRight = r0
            float r0 = r10.rightWidth
            r2 = r11[r1]
            int r2 = r2.getRegionWidth()
            float r2 = (float) r2
            float r0 = java.lang.Math.max(r0, r2)
            r10.rightWidth = r0
            float r0 = r10.topHeight
            r11 = r11[r1]
            int r11 = r11.getRegionHeight()
            float r11 = (float) r11
            float r11 = java.lang.Math.max(r0, r11)
            r10.topHeight = r11
            goto L1dc
        L1da:
            r10.topRight = r2
        L1dc:
            int r11 = r10.idx
            float[] r0 = r10.vertices
            int r1 = r0.length
            if (r11 >= r1) goto L1ea
            float[] r1 = new float[r11]
            java.lang.System.arraycopy(r0, r3, r1, r3, r11)
            r10.vertices = r1
        L1ea:
            return
    }

    private void prepareVertices(com.badlogic.gdx.graphics.g2d.Batch r17, float r18, float r19, float r20, float r21) {
            r16 = this;
            r7 = r16
            float r0 = r7.leftWidth
            float r8 = r18 + r0
            float r1 = r7.bottomHeight
            float r9 = r19 + r1
            float r2 = r7.rightWidth
            float r3 = r20 - r2
            float r10 = r3 - r0
            float r0 = r7.topHeight
            float r3 = r21 - r0
            float r11 = r3 - r1
            float r1 = r18 + r20
            float r12 = r1 - r2
            float r1 = r19 + r21
            float r13 = r1 - r0
            com.badlogic.gdx.graphics.Color r0 = com.badlogic.gdx.graphics.g2d.NinePatch.tmpDrawColor
            com.badlogic.gdx.graphics.Color r1 = r7.color
            com.badlogic.gdx.graphics.Color r0 = r0.set(r1)
            com.badlogic.gdx.graphics.Color r1 = r17.getColor()
            com.badlogic.gdx.graphics.Color r0 = r0.mul(r1)
            float r14 = r0.toFloatBits()
            int r1 = r7.bottomLeft
            r15 = -1
            if (r1 == r15) goto L45
            float r4 = r7.leftWidth
            float r5 = r7.bottomHeight
            r0 = r16
            r2 = r18
            r3 = r19
            r6 = r14
            r0.set(r1, r2, r3, r4, r5, r6)
        L45:
            int r1 = r7.bottomCenter
            if (r1 == r15) goto L55
            float r5 = r7.bottomHeight
            r0 = r16
            r2 = r8
            r3 = r19
            r4 = r10
            r6 = r14
            r0.set(r1, r2, r3, r4, r5, r6)
        L55:
            int r1 = r7.bottomRight
            if (r1 == r15) goto L66
            float r4 = r7.rightWidth
            float r5 = r7.bottomHeight
            r0 = r16
            r2 = r12
            r3 = r19
            r6 = r14
            r0.set(r1, r2, r3, r4, r5, r6)
        L66:
            int r1 = r7.middleLeft
            if (r1 == r15) goto L76
            float r4 = r7.leftWidth
            r0 = r16
            r2 = r18
            r3 = r9
            r5 = r11
            r6 = r14
            r0.set(r1, r2, r3, r4, r5, r6)
        L76:
            int r1 = r7.middleCenter
            if (r1 == r15) goto L84
            r0 = r16
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r14
            r0.set(r1, r2, r3, r4, r5, r6)
        L84:
            int r1 = r7.middleRight
            if (r1 == r15) goto L93
            float r4 = r7.rightWidth
            r0 = r16
            r2 = r12
            r3 = r9
            r5 = r11
            r6 = r14
            r0.set(r1, r2, r3, r4, r5, r6)
        L93:
            int r1 = r7.topLeft
            if (r1 == r15) goto La4
            float r4 = r7.leftWidth
            float r5 = r7.topHeight
            r0 = r16
            r2 = r18
            r3 = r13
            r6 = r14
            r0.set(r1, r2, r3, r4, r5, r6)
        La4:
            int r1 = r7.topCenter
            if (r1 == r15) goto Lb3
            float r5 = r7.topHeight
            r0 = r16
            r2 = r8
            r3 = r13
            r4 = r10
            r6 = r14
            r0.set(r1, r2, r3, r4, r5, r6)
        Lb3:
            int r1 = r7.topRight
            if (r1 == r15) goto Lc3
            float r4 = r7.rightWidth
            float r5 = r7.topHeight
            r0 = r16
            r2 = r12
            r3 = r13
            r6 = r14
            r0.set(r1, r2, r3, r4, r5, r6)
        Lc3:
            return
    }

    private void set(int r3, float r4, float r5, float r6, float r7, float r8) {
            r2 = this;
            float r6 = r6 + r4
            float r7 = r7 + r5
            float[] r0 = r2.vertices
            r0[r3] = r4
            int r1 = r3 + 1
            r0[r1] = r5
            int r1 = r3 + 2
            r0[r1] = r8
            int r1 = r3 + 5
            r0[r1] = r4
            int r4 = r3 + 6
            r0[r4] = r7
            int r4 = r3 + 7
            r0[r4] = r8
            int r4 = r3 + 10
            r0[r4] = r6
            int r4 = r3 + 11
            r0[r4] = r7
            int r4 = r3 + 12
            r0[r4] = r8
            int r4 = r3 + 15
            r0[r4] = r6
            int r4 = r3 + 16
            r0[r4] = r5
            int r3 = r3 + 17
            r0[r3] = r8
            return
    }

    public void draw(com.badlogic.gdx.graphics.g2d.Batch r1, float r2, float r3, float r4, float r5) {
            r0 = this;
            r0.prepareVertices(r1, r2, r3, r4, r5)
            com.badlogic.gdx.graphics.Texture r2 = r0.texture
            float[] r3 = r0.vertices
            int r4 = r0.idx
            r5 = 0
            r1.draw(r2, r3, r5, r4)
            return
    }

    public void draw(com.badlogic.gdx.graphics.g2d.Batch r15, float r16, float r17, float r18, float r19, float r20, float r21, float r22, float r23, float r24) {
            r14 = this;
            r6 = r14
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r20
            r5 = r21
            r0.prepareVertices(r1, r2, r3, r4, r5)
            float r0 = r16 + r18
            float r1 = r17 + r19
            int r2 = r6.idx
            float[] r3 = r6.vertices
            r4 = 0
            r5 = 0
            int r5 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r5 == 0) goto L46
            r5 = 0
        L1d:
            if (r5 >= r2) goto L68
            r7 = r3[r5]
            float r7 = r7 - r0
            float r7 = r7 * r22
            int r8 = r5 + 1
            r9 = r3[r8]
            float r9 = r9 - r1
            float r9 = r9 * r23
            float r10 = com.badlogic.gdx.math.MathUtils.cosDeg(r24)
            float r11 = com.badlogic.gdx.math.MathUtils.sinDeg(r24)
            float r12 = r10 * r7
            float r13 = r11 * r9
            float r12 = r12 - r13
            float r12 = r12 + r0
            r3[r5] = r12
            float r11 = r11 * r7
            float r10 = r10 * r9
            float r11 = r11 + r10
            float r11 = r11 + r1
            r3[r8] = r11
            int r5 = r5 + 5
            goto L1d
        L46:
            r5 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r22 > r5 ? 1 : (r22 == r5 ? 0 : -1))
            if (r7 != 0) goto L50
            int r5 = (r23 > r5 ? 1 : (r23 == r5 ? 0 : -1))
            if (r5 == 0) goto L68
        L50:
            r5 = 0
        L51:
            if (r5 >= r2) goto L68
            r7 = r3[r5]
            float r7 = r7 - r0
            float r7 = r7 * r22
            float r7 = r7 + r0
            r3[r5] = r7
            int r7 = r5 + 1
            r8 = r3[r7]
            float r8 = r8 - r1
            float r8 = r8 * r23
            float r8 = r8 + r1
            r3[r7] = r8
            int r5 = r5 + 5
            goto L51
        L68:
            com.badlogic.gdx.graphics.Texture r0 = r6.texture
            r1 = r15
            r15.draw(r0, r3, r4, r2)
            return
    }

    public float getBottomHeight() {
            r1 = this;
            float r0 = r1.bottomHeight
            return r0
    }

    public float getLeftWidth() {
            r1 = this;
            float r0 = r1.leftWidth
            return r0
    }

    public float getPadBottom() {
            r2 = this;
            float r0 = r2.padBottom
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto Lc
            float r0 = r2.getBottomHeight()
        Lc:
            return r0
    }

    public float getPadLeft() {
            r2 = this;
            float r0 = r2.padLeft
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto Lc
            float r0 = r2.getLeftWidth()
        Lc:
            return r0
    }

    public float getPadRight() {
            r2 = this;
            float r0 = r2.padRight
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto Lc
            float r0 = r2.getRightWidth()
        Lc:
            return r0
    }

    public float getPadTop() {
            r2 = this;
            float r0 = r2.padTop
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto Lc
            float r0 = r2.getTopHeight()
        Lc:
            return r0
    }

    public float getRightWidth() {
            r1 = this;
            float r0 = r1.rightWidth
            return r0
    }

    public float getTopHeight() {
            r1 = this;
            float r0 = r1.topHeight
            return r0
    }

    public float getTotalHeight() {
            r2 = this;
            float r0 = r2.topHeight
            float r1 = r2.middleHeight
            float r0 = r0 + r1
            float r1 = r2.bottomHeight
            float r0 = r0 + r1
            return r0
    }

    public float getTotalWidth() {
            r2 = this;
            float r0 = r2.leftWidth
            float r1 = r2.middleWidth
            float r0 = r0 + r1
            float r1 = r2.rightWidth
            float r0 = r0 + r1
            return r0
    }

    public void scale(float r4, float r5) {
            r3 = this;
            float r0 = r3.leftWidth
            float r0 = r0 * r4
            r3.leftWidth = r0
            float r0 = r3.rightWidth
            float r0 = r0 * r4
            r3.rightWidth = r0
            float r0 = r3.topHeight
            float r0 = r0 * r5
            r3.topHeight = r0
            float r0 = r3.bottomHeight
            float r0 = r0 * r5
            r3.bottomHeight = r0
            float r0 = r3.middleWidth
            float r0 = r0 * r4
            r3.middleWidth = r0
            float r0 = r3.middleHeight
            float r0 = r0 * r5
            r3.middleHeight = r0
            float r0 = r3.padLeft
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 == 0) goto L30
            float r0 = r0 * r4
            r3.padLeft = r0
        L30:
            float r0 = r3.padRight
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 == 0) goto L3a
            float r0 = r0 * r4
            r3.padRight = r0
        L3a:
            float r4 = r3.padTop
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L44
            float r4 = r4 * r5
            r3.padTop = r4
        L44:
            float r4 = r3.padBottom
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L4e
            float r4 = r4 * r5
            r3.padBottom = r4
        L4e:
            return
    }

    public void setPadding(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.padLeft = r1
            r0.padRight = r2
            r0.padTop = r3
            r0.padBottom = r4
            return
    }
}
