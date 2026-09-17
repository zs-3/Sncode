package org.fortheloss.sticknodes.animationscreen.modules;

/* loaded from: classes2.dex */
public class FrameThumbnail extends com.badlogic.gdx.scenes.scene2d.Actor implements com.badlogic.gdx.utils.Disposable {
    private org.fortheloss.sticknodes.data.IFrameData _frameDataRef;
    private boolean _isNormalFrame;
    private float _newFrameEffectTimer;
    private float _thumbnailScaling;

    public FrameThumbnail(org.fortheloss.sticknodes.data.IFrameData r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._thumbnailScaling = r0
            r1._newFrameEffectTimer = r0
            r0 = 1
            r1._isNormalFrame = r0
            r1._frameDataRef = r2
            boolean r2 = r2 instanceof org.fortheloss.sticknodes.data.FrameData
            r1._isNormalFrame = r2
            if (r3 == 0) goto L17
            r2 = 1056964608(0x3f000000, float:0.5)
            r1._newFrameEffectTimer = r2
        L17:
            return
    }

    private void drawThumbnailMovieclipFrame(org.fortheloss.sticknodes.SNShapeRenderer r34, org.fortheloss.sticknodes.animationscreen.NodeDrawTools r35, float r36, float r37, float r38, float r39, boolean r40, boolean r41) {
            r33 = this;
            r0 = r33
            r14 = r34
            r15 = r38
            r13 = r39
            com.badlogic.gdx.graphics.g2d.Batch r12 = r35.getBatch()
            float r1 = r33.getX()
            float r11 = r1 + r36
            float r1 = r33.getY()
            float r10 = r1 + r37
            com.badlogic.gdx.graphics.Color r1 = org.fortheloss.sticknodes.data.MCFrameData.getBackgroundColor()
            com.badlogic.gdx.graphics.GL20 r2 = com.badlogic.gdx.Gdx.gl
            float r3 = r1.r
            float r4 = r1.g
            float r1 = r1.b
            r9 = 1065353216(0x3f800000, float:1.0)
            r2.glClearColor(r3, r4, r1, r9)
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r2 = 16384(0x4000, float:2.2959E-41)
            r1.glClear(r2)
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = org.fortheloss.sticknodes.animationscreen.FrameCamera.mcDefaultInstance
            float r16 = r1.getCameraScale()
            float r2 = r1.getCameraOffsetX()
            float r2 = -r2
            float r2 = r2 / r16
            float r3 = r0._thumbnailScaling
            float r17 = r2 * r3
            float r1 = r1.getCameraOffsetY()
            float r1 = -r1
            float r1 = r1 / r16
            float r2 = r0._thumbnailScaling
            float r18 = r1 * r2
            com.badlogic.gdx.math.Matrix4 r1 = r34.getTransformMatrix()
            r12.setTransformMatrix(r1)
            r19 = 1056964608(0x3f000000, float:0.5)
            float r1 = r15 * r19
            float r1 = r1 + r11
            float r2 = r13 * r19
            float r2 = r2 + r10
            r34.flush()
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl
            r8 = 3042(0xbe2, float:4.263E-42)
            r3.glEnable(r8)
            if (r41 == 0) goto L73
            org.fortheloss.sticknodes.stickfigure.StickNode.CULLING_CENTER_X = r1
            org.fortheloss.sticknodes.stickfigure.StickNode.CULLING_CENTER_Y = r2
            r1 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 * r15
            float r1 = r1 * r1
            org.fortheloss.sticknodes.stickfigure.StickNode.CULLING_DISTANCE_SQUARED = r1
        L73:
            org.fortheloss.sticknodes.data.IFrameData r1 = r0._frameDataRef
            java.util.ArrayList r7 = r1.getDrawableFigures()
            int r6 = r7.size()
            r20 = 0
            r1 = 0
        L80:
            if (r1 >= r6) goto L8e
            java.lang.Object r2 = r7.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            r2.validateDirtyNodes()
            int r1 = r1 + 1
            goto L80
        L8e:
            r5 = 0
        L8f:
            if (r5 >= r6) goto L125
            java.lang.Object r1 = r7.get(r5)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            float r2 = r1.getTransparency()
            r3 = 1036831949(0x3dcccccd, float:0.1)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto Laf
            r29 = r5
            r21 = r6
            r22 = r7
            r30 = r10
            r31 = r11
            r32 = r12
            goto L111
        Laf:
            float r2 = r1.getTransparency()
            r3 = 1063675494(0x3f666666, float:0.9)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto Lc9
            float r2 = r1.getTransparency()
            r14.setColor(r9, r9, r9, r2)
            float r1 = r1.getTransparency()
            r12.setColor(r9, r9, r9, r1)
            goto Lcf
        Lc9:
            r14.setColor(r9, r9, r9, r9)
            r12.setColor(r9, r9, r9, r9)
        Lcf:
            org.fortheloss.sticknodes.sprite.SpriteRef.FLAG_RESET_ALPHA = r20
            java.lang.Object r1 = r7.get(r5)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            r4 = 0
            float r21 = r11 + r17
            float r22 = r10 + r18
            r23 = 0
            r24 = 0
            float r2 = r0._thumbnailScaling
            float r25 = r2 / r16
            r26 = 0
            r27 = 0
            r28 = 0
            r2 = r34
            r3 = r12
            r29 = r5
            r5 = r21
            r21 = r6
            r6 = r22
            r22 = r7
            r7 = r23
            r8 = r24
            r9 = r25
            r30 = r10
            r10 = r26
            r31 = r11
            r11 = r27
            r32 = r12
            r12 = r28
            r13 = r41
            r1.drawLimbs(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = 1
            org.fortheloss.sticknodes.sprite.SpriteRef.FLAG_RESET_ALPHA = r1
        L111:
            int r5 = r29 + 1
            r13 = r39
            r6 = r21
            r7 = r22
            r10 = r30
            r11 = r31
            r12 = r32
            r8 = 3042(0xbe2, float:4.263E-42)
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L8f
        L125:
            r30 = r10
            r31 = r11
            r32 = r12
            r34.flush()
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r2 = 3042(0xbe2, float:4.263E-42)
            r1.glDisable(r2)
            float r1 = r0._newFrameEffectTimer
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L16a
            r34.flush()
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r1.glEnable(r2)
            com.badlogic.gdx.math.Interpolation r1 = com.badlogic.gdx.math.Interpolation.sineOut
            float r4 = r0._newFrameEffectTimer
            float r4 = r4 / r19
            r5 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1.apply(r3, r5, r4)
            r4 = 1052938076(0x3ec28f5c, float:0.38)
            float r1 = r1 * r19
            r14.setColor(r3, r4, r5, r1)
            r1 = r39
            r6 = r30
            r4 = r31
            r14.rect(r4, r6, r15, r1)
            r34.flush()
            com.badlogic.gdx.graphics.GL20 r7 = com.badlogic.gdx.Gdx.gl
            r7.glDisable(r2)
            goto L172
        L16a:
            r1 = r39
            r6 = r30
            r4 = r31
            r5 = 1065353216(0x3f800000, float:1.0)
        L172:
            r7 = 1120403456(0x42c80000, float:100.0)
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r8
            r9 = 1112014848(0x42480000, float:50.0)
            float r8 = r8 * r9
            r34.flush()
            com.badlogic.gdx.graphics.GL20 r9 = com.badlogic.gdx.Gdx.gl
            r9.glEnable(r2)
            if (r40 != 0) goto L18d
            r9 = 1045220557(0x3e4ccccd, float:0.2)
            r14.setColor(r3, r3, r3, r9)
            goto L19b
        L18d:
            com.badlogic.gdx.graphics.Color r3 = org.fortheloss.sticknodes.App.COLOR_NODE_ACTIVE
            float r9 = r3.r
            float r10 = r3.g
            float r3 = r3.b
            r11 = 1053609165(0x3ecccccd, float:0.4)
            r14.setColor(r9, r10, r3, r11)
        L19b:
            float r10 = r6 + r1
            float r10 = r10 - r8
            r14.rect(r4, r10, r7, r8)
            r34.flush()
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r1.glDisable(r2)
            r14.setColor(r5, r5, r5, r5)
            r1 = r32
            r1.setColor(r5, r5, r5, r5)
            return
    }

    private void drawThumbnailNormalFrame(org.fortheloss.sticknodes.SNShapeRenderer r36, org.fortheloss.sticknodes.animationscreen.NodeDrawTools r37, float r38, float r39, float r40, float r41, boolean r42, boolean r43, boolean r44) {
            r35 = this;
            r0 = r35
            r14 = r36
            r15 = r40
            r13 = r41
            org.fortheloss.sticknodes.data.IFrameData r1 = r0._frameDataRef
            r16 = r1
            org.fortheloss.sticknodes.data.FrameData r16 = (org.fortheloss.sticknodes.data.FrameData) r16
            com.badlogic.gdx.graphics.g2d.Batch r12 = r37.getBatch()
            float r1 = r35.getX()
            float r11 = r1 + r38
            float r1 = r35.getY()
            float r10 = r1 + r39
            org.fortheloss.sticknodes.animationscreen.FrameCamera r17 = r16.getFrameCamera()
            float r1 = r17.getCameraRotationDeg()
            float r1 = -r1
            float r18 = r17.getCameraScale()
            float r2 = r17.getCameraOffsetX()
            float r2 = -r2
            float r2 = r2 / r18
            float r3 = r0._thumbnailScaling
            float r19 = r2 * r3
            float r2 = r17.getCameraOffsetY()
            float r2 = -r2
            float r2 = r2 / r18
            float r3 = r0._thumbnailScaling
            float r20 = r2 * r3
            r21 = 1056964608(0x3f000000, float:0.5)
            r9 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            int r22 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r22 == 0) goto L6d
            float r2 = r15 * r21
            float r2 = r2 + r11
            float r3 = r13 * r21
            float r3 = r3 + r10
            r36.end()
            com.badlogic.gdx.math.Matrix4 r4 = r36.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r4 = r4.translate(r2, r3, r9)
            com.badlogic.gdx.math.Matrix4 r1 = r4.rotate(r9, r9, r8, r1)
            float r2 = -r2
            float r3 = -r3
            com.badlogic.gdx.math.Matrix4 r1 = r1.translate(r2, r3, r9)
            r14.setTransformMatrix(r1)
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r1 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r14.begin(r1)
        L6d:
            com.badlogic.gdx.math.Matrix4 r1 = r36.getTransformMatrix()
            r12.setTransformMatrix(r1)
            boolean r1 = r16.isUsingGradient()
            if (r1 == 0) goto L80
            boolean r1 = r16.isExpandedGradient()
            if (r1 != 0) goto L96
        L80:
            com.badlogic.gdx.graphics.Color r1 = r16.getBackgroundColor()
            com.badlogic.gdx.graphics.GL20 r2 = com.badlogic.gdx.Gdx.gl
            float r3 = r1.r
            float r4 = r1.g
            float r1 = r1.b
            r2.glClearColor(r3, r4, r1, r8)
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r2 = 16384(0x4000, float:2.2959E-41)
            r1.glClear(r2)
        L96:
            boolean r1 = r16.isUsingGradient()
            if (r1 == 0) goto Lf1
            com.badlogic.gdx.graphics.Color r7 = r16.getBackgroundColor()
            com.badlogic.gdx.graphics.Color r23 = r16.getGradientColor()
            boolean r1 = r16.isExpandedGradient()
            r2 = 1084227584(0x40a00000, float:5.0)
            if (r1 == 0) goto Laf
            float r1 = r15 * r2
            goto Lb0
        Laf:
            r1 = r15
        Lb0:
            double r3 = (double) r1
            double r3 = java.lang.Math.ceil(r3)
            int r1 = (int) r3
            boolean r3 = r16.isExpandedGradient()
            if (r3 == 0) goto Lbf
            float r2 = r2 * r13
            goto Lc0
        Lbf:
            r2 = r13
        Lc0:
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            float r1 = (float) r1
            float r3 = r1 - r15
            float r3 = r3 / r18
            float r3 = r3 * r21
            float r3 = r11 - r3
            float r3 = r3 + r19
            float r2 = (float) r2
            float r4 = r2 - r13
            float r4 = r4 / r18
            float r4 = r4 * r21
            float r4 = r10 - r4
            float r4 = r4 + r20
            float r5 = r1 / r18
            float r6 = r2 / r18
            r1 = r36
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r0 = 1065353216(0x3f800000, float:1.0)
            r8 = r23
            r9 = r23
            r1.rect(r2, r3, r4, r5, r6, r7, r8, r9)
            goto Lf3
        Lf1:
            r0 = 1065353216(0x3f800000, float:1.0)
        Lf3:
            float r1 = r15 * r21
            float r1 = r1 + r11
            float r2 = r13 * r21
            float r2 = r2 + r10
            r36.flush()
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl
            r9 = 3042(0xbe2, float:4.263E-42)
            r3.glEnable(r9)
            if (r43 == 0) goto L111
            org.fortheloss.sticknodes.stickfigure.StickNode.CULLING_CENTER_X = r1
            org.fortheloss.sticknodes.stickfigure.StickNode.CULLING_CENTER_Y = r2
            r1 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 * r15
            float r1 = r1 * r1
            org.fortheloss.sticknodes.stickfigure.StickNode.CULLING_DISTANCE_SQUARED = r1
        L111:
            java.util.ArrayList r8 = r16.getDrawableFigures()
            int r7 = r8.size()
            r23 = 0
            r1 = 0
        L11c:
            if (r1 >= r7) goto L12a
            java.lang.Object r2 = r8.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            r2.validateDirtyNodes()
            int r1 = r1 + 1
            goto L11c
        L12a:
            r6 = 0
        L12b:
            if (r6 >= r7) goto L1c5
            java.lang.Object r1 = r8.get(r6)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            float r2 = r1.getTransparency()
            r3 = 1036831949(0x3dcccccd, float:0.1)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L14d
            r0 = r35
            r32 = r6
            r24 = r7
            r25 = r8
            r33 = r10
            r34 = r11
            r38 = r12
            goto L1b1
        L14d:
            float r2 = r1.getTransparency()
            r3 = 1063675494(0x3f666666, float:0.9)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L167
            float r2 = r1.getTransparency()
            r14.setColor(r0, r0, r0, r2)
            float r1 = r1.getTransparency()
            r12.setColor(r0, r0, r0, r1)
            goto L16d
        L167:
            r14.setColor(r0, r0, r0, r0)
            r12.setColor(r0, r0, r0, r0)
        L16d:
            org.fortheloss.sticknodes.sprite.SpriteRef.FLAG_RESET_ALPHA = r23
            java.lang.Object r1 = r8.get(r6)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            r4 = 0
            float r5 = r11 + r19
            float r24 = r10 + r20
            r25 = 0
            r26 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r0 = r35
            float r2 = r0._thumbnailScaling
            float r27 = r2 / r18
            r28 = 0
            r29 = 0
            r30 = 0
            r2 = r36
            r3 = r12
            r32 = r6
            r6 = r24
            r24 = r7
            r7 = r25
            r25 = r8
            r8 = r26
            r9 = r27
            r33 = r10
            r10 = r28
            r34 = r11
            r11 = r29
            r38 = r12
            r12 = r30
            r13 = r43
            r1.drawLimbs(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = 1
            org.fortheloss.sticknodes.sprite.SpriteRef.FLAG_RESET_ALPHA = r1
        L1b1:
            int r6 = r32 + 1
            r12 = r38
            r13 = r41
            r7 = r24
            r8 = r25
            r10 = r33
            r11 = r34
            r0 = 1065353216(0x3f800000, float:1.0)
            r9 = 3042(0xbe2, float:4.263E-42)
            goto L12b
        L1c5:
            r0 = r35
            r33 = r10
            r34 = r11
            r38 = r12
            r36.flush()
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r2 = 3042(0xbe2, float:4.263E-42)
            r1.glDisable(r2)
            java.util.ArrayList r1 = r16.getTextfieldBoxes()
            if (r1 != 0) goto L1df
            r3 = 0
            goto L1e3
        L1df:
            int r3 = r1.size()
        L1e3:
            if (r3 <= 0) goto L226
            r36.end()
            r38.begin()
            r4 = r38
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.setColor(r5, r5, r5, r5)
            r6 = 0
        L1f3:
            if (r6 >= r3) goto L219
            java.lang.Object r7 = r1.get(r6)
            r24 = r7
            org.fortheloss.sticknodes.TextfieldBox r24 = (org.fortheloss.sticknodes.TextfieldBox) r24
            r7 = r34
            float r26 = r7 + r19
            r8 = r33
            float r27 = r8 + r20
            r28 = 0
            r29 = 0
            float r9 = r0._thumbnailScaling
            float r30 = r9 / r18
            r31 = 0
            r32 = 1
            r25 = r37
            r24.drawOutline(r25, r26, r27, r28, r29, r30, r31, r32)
            int r6 = r6 + 1
            goto L1f3
        L219:
            r8 = r33
            r7 = r34
            r4.end()
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r1 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r14.begin(r1)
            goto L22e
        L226:
            r4 = r38
            r8 = r33
            r7 = r34
            r5 = 1065353216(0x3f800000, float:1.0)
        L22e:
            if (r22 == 0) goto L243
            r36.end()
            com.badlogic.gdx.math.Matrix4 r1 = r36.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r1 = r1.idt()
            r14.setTransformMatrix(r1)
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r1 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r14.begin(r1)
        L243:
            boolean r1 = r17.isWidescreen()
            if (r1 == 0) goto L269
            if (r44 != 0) goto L269
            r1 = 1124335616(0x43040000, float:132.0)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r1
            float r1 = r0._thumbnailScaling
            float r3 = r3 * r1
            r1 = 0
            r14.setColor(r1, r1, r1, r1)
            r14.rect(r7, r8, r15, r3)
            r6 = r41
            float r10 = r8 + r6
            float r10 = r10 - r3
            r9 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r9
            r14.rect(r7, r10, r15, r3)
            goto L26c
        L269:
            r6 = r41
            r1 = 0
        L26c:
            float r3 = r0._newFrameEffectTimer
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 <= 0) goto L297
            r36.flush()
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl
            r3.glEnable(r2)
            com.badlogic.gdx.math.Interpolation r3 = com.badlogic.gdx.math.Interpolation.sineOut
            float r9 = r0._newFrameEffectTimer
            float r9 = r9 / r21
            float r3 = r3.apply(r1, r5, r9)
            r9 = 1052938076(0x3ec28f5c, float:0.38)
            float r3 = r3 * r21
            r14.setColor(r1, r9, r5, r3)
            r14.rect(r7, r8, r15, r6)
            r36.flush()
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl
            r3.glDisable(r2)
        L297:
            r3 = 1120403456(0x42c80000, float:100.0)
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r9
            r10 = 1112014848(0x42480000, float:50.0)
            float r9 = r9 * r10
            r36.flush()
            com.badlogic.gdx.graphics.GL20 r10 = com.badlogic.gdx.Gdx.gl
            r10.glEnable(r2)
            if (r42 != 0) goto L2b2
            r10 = 1045220557(0x3e4ccccd, float:0.2)
            r14.setColor(r1, r1, r1, r10)
            goto L2c0
        L2b2:
            com.badlogic.gdx.graphics.Color r1 = org.fortheloss.sticknodes.App.COLOR_NODE_ACTIVE
            float r10 = r1.r
            float r11 = r1.g
            float r1 = r1.b
            r12 = 1053609165(0x3ecccccd, float:0.4)
            r14.setColor(r10, r11, r1, r12)
        L2c0:
            float r10 = r8 + r6
            float r10 = r10 - r9
            r14.rect(r7, r10, r3, r9)
            r36.flush()
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r1.glDisable(r2)
            r14.setColor(r5, r5, r5, r5)
            r4.setColor(r5, r5, r5, r5)
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._frameDataRef = r0
            r1.clear()
            r1.remove()
            return
    }

    public void drawThumbnail(org.fortheloss.sticknodes.SNShapeRenderer r2, org.fortheloss.sticknodes.animationscreen.NodeDrawTools r3, float r4, float r5, float r6, float r7, boolean r8, boolean r9, boolean r10) {
            r1 = this;
            boolean r0 = r1._isNormalFrame
            if (r0 == 0) goto L8
            r1.drawThumbnailNormalFrame(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto Lb
        L8:
            r1.drawThumbnailMovieclipFrame(r2, r3, r4, r5, r6, r7, r8, r9)
        Lb:
            return
    }

    public org.fortheloss.sticknodes.data.IFrameData getFrameData() {
            r1 = this;
            org.fortheloss.sticknodes.data.IFrameData r0 = r1._frameDataRef
            return r0
    }

    public float getNewFrameEffectTimer() {
            r1 = this;
            float r0 = r1._newFrameEffectTimer
            return r0
    }

    public void setNewFrameEffectTimer(float r2) {
            r1 = this;
            r1._newFrameEffectTimer = r2
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L9
            r1._newFrameEffectTimer = r0
        L9:
            return
    }

    public void setThumbnailScaling(float r1) {
            r0 = this;
            r0._thumbnailScaling = r1
            return
    }
}
