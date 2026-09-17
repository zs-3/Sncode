package com.badlogic.gdx.scenes.scene2d.utils;

/* loaded from: classes.dex */
public class TiledDrawable extends com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable {
    private int align;
    private final com.badlogic.gdx.graphics.Color color;
    private float scale;

    public TiledDrawable() {
            r2 = this;
            r2.<init>()
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r1, r1, r1)
            r2.color = r0
            r2.scale = r1
            r0 = 12
            r2.align = r0
            return
    }

    public TiledDrawable(com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable r2) {
            r1 = this;
            r1.<init>(r2)
            com.badlogic.gdx.graphics.Color r2 = new com.badlogic.gdx.graphics.Color
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r0, r0, r0, r0)
            r1.color = r2
            r1.scale = r0
            r2 = 12
            r1.align = r2
            return
    }

    public static void draw(com.badlogic.gdx.graphics.g2d.Batch r44, com.badlogic.gdx.graphics.g2d.TextureRegion r45, float r46, float r47, float r48, float r49, float r50, int r51) {
            int r0 = r45.getRegionWidth()
            float r0 = (float) r0
            float r11 = r0 * r50
            int r0 = r45.getRegionHeight()
            float r0 = (float) r0
            float r12 = r0 * r50
            com.badlogic.gdx.graphics.Texture r13 = r45.getTexture()
            int r0 = r13.getWidth()
            float r0 = (float) r0
            float r14 = r0 * r50
            int r0 = r13.getHeight()
            float r0 = (float) r0
            float r15 = r0 * r50
            float r16 = r45.getU()
            float r17 = r45.getV()
            float r18 = r45.getU2()
            float r19 = r45.getV2()
            float r10 = r48 / r11
            int r0 = (int) r10
            boolean r1 = com.badlogic.gdx.utils.Align.isLeft(r51)
            r20 = 1056964608(0x3f000000, float:0.5)
            r9 = 1
            r21 = 0
            if (r1 == 0) goto L49
            float r1 = (float) r0
            float r1 = r1 * r11
            float r1 = r48 - r1
            r8 = r0
            r23 = r1
            r22 = 0
            goto L74
        L49:
            boolean r1 = com.badlogic.gdx.utils.Align.isRight(r51)
            if (r1 == 0) goto L5a
            float r1 = (float) r0
            float r1 = r1 * r11
            float r1 = r48 - r1
            r8 = r0
            r22 = r1
        L57:
            r23 = 0
            goto L74
        L5a:
            if (r0 == 0) goto L70
            int r1 = r0 % 2
            if (r1 != r9) goto L61
            goto L63
        L61:
            int r0 = r0 + (-1)
        L63:
            float r1 = (float) r0
            float r1 = r1 * r11
            float r1 = r48 - r1
            float r1 = r1 * r20
            r8 = r0
            r22 = r1
            r23 = r22
            goto L74
        L70:
            r8 = r0
            r22 = 0
            goto L57
        L74:
            float r7 = r49 / r12
            int r0 = (int) r7
            boolean r1 = com.badlogic.gdx.utils.Align.isTop(r51)
            if (r1 == 0) goto L88
            float r1 = (float) r0
            float r1 = r1 * r12
            float r1 = r49 - r1
            r6 = r0
            r24 = r1
        L85:
            r25 = 0
            goto Lb3
        L88:
            boolean r1 = com.badlogic.gdx.utils.Align.isBottom(r51)
            if (r1 == 0) goto L99
            float r1 = (float) r0
            float r1 = r1 * r12
            float r1 = r49 - r1
            r6 = r0
            r25 = r1
            r24 = 0
            goto Lb3
        L99:
            if (r0 == 0) goto Laf
            int r1 = r0 % 2
            if (r1 != r9) goto La0
            goto La2
        La0:
            int r0 = r0 + (-1)
        La2:
            float r1 = (float) r0
            float r1 = r1 * r12
            float r1 = r49 - r1
            float r1 = r1 * r20
            r6 = r0
            r24 = r1
            r25 = r24
            goto Lb3
        Laf:
            r6 = r0
            r24 = 0
            goto L85
        Lb3:
            r26 = 1065353216(0x3f800000, float:1.0)
            r27 = 0
            int r0 = (r22 > r21 ? 1 : (r22 == r21 ? 0 : -1))
            if (r0 <= 0) goto L15d
            float r0 = r22 / r14
            float r28 = r18 - r0
            int r0 = (r24 > r21 ? 1 : (r24 == r21 ? 0 : -1))
            if (r0 <= 0) goto Lec
            float r0 = r24 / r15
            float r29 = r17 + r0
            r0 = r44
            r1 = r13
            r2 = r46
            r3 = r47
            r4 = r22
            r5 = r24
            r30 = r14
            r14 = r6
            r6 = r28
            r31 = r7
            r7 = r29
            r29 = r11
            r11 = r8
            r8 = r18
            r32 = 1
            r9 = r17
            r0.draw(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            float r0 = r47 + r24
            r33 = r0
            goto Lf8
        Lec:
            r31 = r7
            r29 = r11
            r30 = r14
            r32 = 1
            r14 = r6
            r11 = r8
            r33 = r47
        Lf8:
            if (r14 != 0) goto L121
            boolean r0 = com.badlogic.gdx.utils.Align.isCenterVertical(r51)
            if (r0 == 0) goto L121
            float r0 = r19 - r17
            float r0 = r0 * r20
            float r1 = r26 - r31
            float r0 = r0 * r1
            float r7 = r19 - r0
            float r9 = r17 + r0
            r0 = r44
            r1 = r13
            r2 = r46
            r3 = r33
            r4 = r22
            r5 = r49
            r6 = r28
            r8 = r18
            r0.draw(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            float r33 = r33 + r49
            goto L140
        L121:
            r9 = 0
        L122:
            if (r9 >= r14) goto L140
            r0 = r44
            r1 = r13
            r2 = r46
            r3 = r33
            r4 = r22
            r5 = r12
            r6 = r28
            r7 = r19
            r8 = r18
            r34 = r9
            r9 = r17
            r0.draw(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            float r33 = r33 + r12
            int r9 = r34 + 1
            goto L122
        L140:
            int r0 = (r25 > r21 ? 1 : (r25 == r21 ? 0 : -1))
            if (r0 <= 0) goto L169
            float r0 = r25 / r15
            float r9 = r19 - r0
            r0 = r44
            r1 = r13
            r2 = r46
            r3 = r33
            r4 = r22
            r5 = r25
            r6 = r28
            r7 = r19
            r8 = r18
            r0.draw(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L169
        L15d:
            r31 = r7
            r29 = r11
            r30 = r14
            r32 = 1
            r14 = r6
            r11 = r8
            r33 = r47
        L169:
            int r28 = (r24 > r21 ? 1 : (r24 == r21 ? 0 : -1))
            if (r28 <= 0) goto L1bc
            float r2 = r46 + r22
            float r0 = r24 / r15
            float r33 = r17 + r0
            if (r11 != 0) goto L198
            boolean r0 = com.badlogic.gdx.utils.Align.isCenterHorizontal(r51)
            if (r0 == 0) goto L198
            float r0 = r18 - r16
            float r0 = r0 * r20
            float r1 = r26 - r10
            float r0 = r0 * r1
            float r6 = r16 + r0
            float r8 = r18 - r0
            r0 = r44
            r1 = r13
            r3 = r47
            r4 = r48
            r5 = r24
            r7 = r33
            r9 = r17
            r0.draw(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L1ba
        L198:
            r34 = r2
            r9 = 0
        L19b:
            if (r9 >= r11) goto L1ba
            r0 = r44
            r1 = r13
            r2 = r34
            r3 = r47
            r4 = r29
            r5 = r24
            r6 = r16
            r7 = r33
            r8 = r18
            r35 = r9
            r9 = r17
            r0.draw(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            float r34 = r34 + r29
            int r9 = r35 + 1
            goto L19b
        L1ba:
            r33 = r47
        L1bc:
            float r22 = r46 + r22
            if (r11 != 0) goto L1da
            boolean r0 = com.badlogic.gdx.utils.Align.isCenterHorizontal(r51)
            if (r0 == 0) goto L1da
            float r0 = r18 - r16
            float r0 = r0 * r20
            float r1 = r26 - r10
            float r0 = r0 * r1
            float r1 = r16 + r0
            float r0 = r18 - r0
            r36 = r48
            r34 = r0
            r35 = r1
            r9 = 1
            goto L1e1
        L1da:
            r9 = r11
            r35 = r16
            r34 = r18
            r36 = r29
        L1e1:
            if (r14 != 0) goto L1fd
            boolean r0 = com.badlogic.gdx.utils.Align.isCenterVertical(r51)
            if (r0 == 0) goto L1fd
            float r0 = r19 - r17
            float r0 = r0 * r20
            float r1 = r26 - r31
            float r0 = r0 * r1
            float r1 = r19 - r0
            float r0 = r17 + r0
            r38 = r49
            r32 = r0
            r37 = r1
            r8 = 1
            goto L204
        L1fd:
            r38 = r12
            r8 = r14
            r32 = r17
            r37 = r19
        L204:
            r39 = r22
            r7 = 0
        L207:
            if (r7 >= r9) goto L244
            float r0 = r47 + r24
            r33 = r0
            r6 = 0
        L20e:
            if (r6 >= r8) goto L239
            r0 = r44
            r1 = r13
            r2 = r39
            r3 = r33
            r4 = r36
            r5 = r38
            r40 = r6
            r6 = r35
            r41 = r7
            r7 = r37
            r42 = r8
            r8 = r34
            r43 = r9
            r9 = r32
            r0.draw(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            float r33 = r33 + r38
            int r6 = r40 + 1
            r7 = r41
            r8 = r42
            r9 = r43
            goto L20e
        L239:
            r41 = r7
            r42 = r8
            r43 = r9
            float r39 = r39 + r36
            int r7 = r41 + 1
            goto L207
        L244:
            int r32 = (r25 > r21 ? 1 : (r25 == r21 ? 0 : -1))
            if (r32 <= 0) goto L293
            float r0 = r25 / r15
            float r34 = r19 - r0
            if (r11 != 0) goto L275
            boolean r0 = com.badlogic.gdx.utils.Align.isCenterHorizontal(r51)
            if (r0 == 0) goto L275
            float r0 = r18 - r16
            float r0 = r0 * r20
            float r1 = r26 - r10
            float r0 = r0 * r1
            float r6 = r16 + r0
            float r8 = r18 - r0
            r0 = r44
            r1 = r13
            r2 = r22
            r3 = r33
            r4 = r48
            r5 = r25
            r7 = r19
            r9 = r34
            r0.draw(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            float r22 = r22 + r48
            goto L295
        L275:
            r0 = 0
        L276:
            if (r0 >= r11) goto L295
            r1 = r44
            r2 = r13
            r3 = r22
            r4 = r33
            r5 = r29
            r6 = r25
            r7 = r16
            r8 = r19
            r9 = r18
            r10 = r34
            r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            float r22 = r22 + r29
            int r0 = r0 + 1
            goto L276
        L293:
            r22 = r39
        L295:
            int r0 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r0 <= 0) goto L319
            float r0 = r23 / r30
            float r11 = r16 + r0
            if (r28 <= 0) goto L2ba
            float r0 = r24 / r15
            float r7 = r17 + r0
            r0 = r44
            r1 = r13
            r2 = r22
            r3 = r47
            r4 = r23
            r5 = r24
            r6 = r16
            r8 = r11
            r9 = r17
            r0.draw(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            float r0 = r47 + r24
            r10 = r0
            goto L2bc
        L2ba:
            r10 = r47
        L2bc:
            if (r14 != 0) goto L2e4
            boolean r0 = com.badlogic.gdx.utils.Align.isCenterVertical(r51)
            if (r0 == 0) goto L2e4
            float r0 = r19 - r17
            float r0 = r0 * r20
            float r26 = r26 - r31
            float r0 = r0 * r26
            float r7 = r19 - r0
            float r9 = r17 + r0
            r0 = r44
            r1 = r13
            r2 = r22
            r3 = r10
            r4 = r23
            r5 = r49
            r6 = r16
            r8 = r11
            r0.draw(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            float r10 = r10 + r49
            r3 = r10
            goto L302
        L2e4:
            r0 = r10
            r10 = 0
        L2e6:
            if (r10 >= r14) goto L301
            r1 = r44
            r2 = r13
            r3 = r22
            r4 = r0
            r5 = r23
            r6 = r12
            r7 = r16
            r8 = r19
            r9 = r11
            r27 = r10
            r10 = r17
            r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            float r0 = r0 + r12
            int r10 = r27 + 1
            goto L2e6
        L301:
            r3 = r0
        L302:
            if (r32 <= 0) goto L319
            float r0 = r25 / r15
            float r9 = r19 - r0
            r0 = r44
            r1 = r13
            r2 = r22
            r4 = r23
            r5 = r25
            r6 = r16
            r7 = r19
            r8 = r11
            r0.draw(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L319:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable, com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable, com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r11, float r12, float r13, float r14, float r15) {
            r10 = this;
            float r0 = r11.getPackedColor()
            com.badlogic.gdx.graphics.Color r1 = r11.getColor()
            com.badlogic.gdx.graphics.Color r2 = r10.color
            com.badlogic.gdx.graphics.Color r1 = r1.mul(r2)
            r11.setColor(r1)
            com.badlogic.gdx.graphics.g2d.TextureRegion r3 = r10.getRegion()
            float r8 = r10.scale
            int r9 = r10.align
            r2 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            draw(r2, r3, r4, r5, r6, r7, r8, r9)
            r11.setPackedColor(r0)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable, com.badlogic.gdx.scenes.scene2d.utils.TransformDrawable
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r1, float r2, float r3, float r4, float r5, float r6, float r7, float r8, float r9, float r10) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
    public /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.utils.Drawable tint(com.badlogic.gdx.graphics.Color r1) {
            r0 = this;
            com.badlogic.gdx.scenes.scene2d.utils.TiledDrawable r1 = r0.tint(r1)
            return r1
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
    public com.badlogic.gdx.scenes.scene2d.utils.TiledDrawable tint(com.badlogic.gdx.graphics.Color r3) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.utils.TiledDrawable r0 = new com.badlogic.gdx.scenes.scene2d.utils.TiledDrawable
            r0.<init>(r2)
            com.badlogic.gdx.graphics.Color r1 = r0.color
            r1.set(r3)
            float r3 = r2.getLeftWidth()
            r0.setLeftWidth(r3)
            float r3 = r2.getRightWidth()
            r0.setRightWidth(r3)
            float r3 = r2.getTopHeight()
            r0.setTopHeight(r3)
            float r3 = r2.getBottomHeight()
            r0.setBottomHeight(r3)
            return r0
    }
}
