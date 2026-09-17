package org.fortheloss.sticknodes;

/* loaded from: classes2.dex */
public class StickfigureDominantColorFinder implements com.badlogic.gdx.utils.Disposable {
    private java.nio.ByteBuffer _byteBufferPixels;
    private com.badlogic.gdx.graphics.glutils.FrameBuffer _fbo;
    private byte[] _pixelsRGBA;

    public StickfigureDominantColorFinder() {
            r8 = this;
            r8.<init>()
            com.badlogic.gdx.graphics.Pixmap$Format r0 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA4444     // Catch: java.lang.IllegalStateException -> L14
            r1 = 960(0x3c0, float:1.345E-42)
            r2 = 540(0x21c, float:7.57E-43)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.IllegalStateException -> L14
            r8._fbo = r0     // Catch: java.lang.IllegalStateException -> L14
            goto L24
        L14:
            com.badlogic.gdx.graphics.Pixmap$Format r1 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888
            r2 = 960(0x3c0, float:1.345E-42)
            r3 = 540(0x21c, float:7.57E-43)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r1, r2, r3, r4, r5, r6, r7)
            r8._fbo = r0
        L24:
            r0 = 2073600(0x1fa400, float:2.905732E-39)
            java.nio.ByteBuffer r1 = com.badlogic.gdx.utils.BufferUtils.newByteBuffer(r0)
            r8._byteBufferPixels = r1
            byte[] r0 = new byte[r0]
            r8._pixelsRGBA = r0
            return
    }

    private void renderStickfigure(java.lang.String r30, org.fortheloss.sticknodes.SNShapeRenderer r31, com.badlogic.gdx.graphics.g2d.Batch r32, org.fortheloss.sticknodes.stickfigure.Stickfigure r33) {
            r29 = this;
            r0 = r29
            r14 = r31
            r15 = r33
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r0._fbo
            int r13 = r1.getWidth()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r0._fbo
            int r12 = r1.getHeight()
            org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator r1 = new org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator
            r1.<init>()
            float r2 = (float) r13
            r3 = 1063675494(0x3f666666, float:0.9)
            float r4 = r2 * r3
            float r5 = (float) r12
            float r3 = r3 * r5
            r6 = 1060320051(0x3f333333, float:0.7)
            float r7 = r2 * r6
            float r6 = r6 * r5
            r8 = 0
            r15.setPosition(r8, r8)
            com.badlogic.gdx.math.Rectangle r1 = r1.getSize(r15)
            float r9 = r1.x
            float r10 = r1.y
            float r11 = r1.width
            float r11 = r11 - r9
            float r1 = r1.height
            float r1 = r1 - r10
            int r16 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r16 <= 0) goto L221
            int r16 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r16 > 0) goto L43
            goto L221
        L43:
            float r16 = r33.getScale()
            r17 = 1065353216(0x3f800000, float:1.0)
            int r18 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r18 >= 0) goto L5e
            int r18 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r18 >= 0) goto L5e
            float r3 = r11 / r7
            float r4 = r1 / r6
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L5b
            float r7 = r7 / r11
            goto L79
        L5b:
            float r7 = r6 / r1
            goto L79
        L5e:
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 <= 0) goto L65
            float r4 = r4 / r11
            r7 = r4
            goto L67
        L65:
            r7 = 1065353216(0x3f800000, float:1.0)
        L67:
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 <= 0) goto L79
            float r3 = r3 / r1
            float r4 = java.lang.Math.abs(r3)
            float r6 = java.lang.Math.abs(r7)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L79
            r7 = r3
        L79:
            int r3 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r3 >= 0) goto L8a
            r3 = 953267991(0x38d1b717, float:1.0E-4)
            float r4 = r33.getScale()
            float r4 = r4 * r7
            float r16 = java.lang.Math.max(r3, r4)
        L8a:
            int r3 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r3 <= 0) goto L9a
            r4 = 1101004800(0x41a00000, float:20.0)
            float r6 = r33.getScale()
            float r6 = r6 * r7
            float r16 = java.lang.Math.min(r4, r6)
        L9a:
            r4 = r16
            if (r3 == 0) goto Lac
            r15.setScale(r4)
            r33.validateDirtyNodes()
            float r11 = r11 * r7
            float r1 = r1 * r7
            float r9 = r9 * r7
            float r10 = r10 * r7
        Lac:
            r7 = r11
            r11 = r1
            r28 = r10
            r10 = r9
            r9 = r28
            com.badlogic.gdx.utils.viewport.ScreenViewport r1 = new com.badlogic.gdx.utils.viewport.ScreenViewport
            r1.<init>()
            com.badlogic.gdx.graphics.Camera r3 = r1.getCamera()
            com.badlogic.gdx.math.Vector3 r3 = r3.position
            r4 = 1056964608(0x3f000000, float:0.5)
            float r6 = r2 * r4
            r16 = r12
            float r12 = r5 * r4
            r3.set(r6, r12, r8)
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r0._fbo
            int r3 = r3.getWidth()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r6 = r0._fbo
            int r6 = r6.getHeight()
            r12 = 0
            r1.update(r3, r6, r12)
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r0._fbo
            r3.begin()
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl
            r3.glClearColor(r8, r8, r8, r8)
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl
            r6 = 16384(0x4000, float:2.2959E-41)
            r3.glClear(r6)
            r1.apply(r12)
            com.badlogic.gdx.graphics.Camera r1 = r1.getCamera()
            com.badlogic.gdx.math.Matrix4 r1 = r1.combined
            r14.setProjectionMatrix(r1)
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r1 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r14.begin(r1)
            float r2 = r2 - r7
            float r2 = r2 * r4
            float r6 = r2 - r10
            float r5 = r5 - r11
            float r5 = r5 * r4
            float r8 = r5 - r9
            r4 = 0
            r17 = 0
            r18 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r1 = r33
            r2 = r31
            r3 = r32
            r5 = r6
            r6 = r8
            r8 = r7
            r7 = r17
            r24 = r8
            r8 = r18
            r25 = r9
            r9 = r19
            r26 = r10
            r10 = r20
            r27 = r11
            r11 = r21
            r17 = r16
            r16 = 0
            r12 = r22
            r18 = r13
            r13 = r23
            r1.drawLimbs(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r11 = r24
            r2.append(r11)
            java.lang.String r3 = ", "
            r2.append(r3)
            r9 = r26
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r1.println(r2)
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r4 = r27
            r2.append(r4)
            r2.append(r3)
            r10 = r25
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r1.println(r2)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println()
            r31.end()
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r2 = 3333(0xd05, float:4.67E-42)
            r8 = 1
            r1.glPixelStorei(r2, r8)
            java.nio.ByteBuffer r1 = r0._byteBufferPixels
            r1.clear()
            com.badlogic.gdx.graphics.GL20 r19 = com.badlogic.gdx.Gdx.gl
            r21 = 0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r0._fbo
            int r22 = r1.getWidth()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r0._fbo
            int r23 = r1.getHeight()
            r24 = 6408(0x1908, float:8.98E-42)
            r25 = 5121(0x1401, float:7.176E-42)
            java.nio.ByteBuffer r1 = r0._byteBufferPixels
            r26 = r1
            r19.glReadPixels(r20, r21, r22, r23, r24, r25, r26)
            java.nio.ByteBuffer r1 = r0._byteBufferPixels
            r1.clear()
            java.nio.ByteBuffer r1 = r0._byteBufferPixels
            byte[] r2 = r0._pixelsRGBA
            r1.get(r2)
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r0._fbo
            int r1 = r1.getHeight()
            int r1 = r1 - r8
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0._fbo
            int r2 = r2.getWidth()
            r3 = 0
        L1be:
            r12 = 0
        L1bf:
            int r4 = r1 * r2
            int r4 = r4 + r12
            int r4 = r4 * 4
            if (r4 >= r3) goto L1ea
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r0._fbo
            r1.end()
            r33.dispose()
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            org.fortheloss.sticknodes.animationscreen.exporters.IPlatformPNGEncoder r1 = r1.getPlatformPNGEncoder()
            java.lang.String r5 = org.fortheloss.sticknodes.App.tempPath
            r7 = 0
            r2 = r1
            r3 = r18
            r4 = r17
            r6 = r30
            r2.begin(r3, r4, r5, r6, r7)
            byte[] r2 = r0._pixelsRGBA
            r1.passPixels(r2, r8)
            r1.dispose()
            return
        L1ea:
            byte[] r5 = r0._pixelsRGBA
            r6 = r5[r3]
            int r7 = r3 + 1
            r9 = r5[r7]
            int r10 = r3 + 2
            r11 = r5[r10]
            int r13 = r3 + 3
            r14 = r5[r13]
            int r19 = r4 + 3
            r20 = r5[r19]
            r5[r3] = r20
            r20 = r5[r4]
            r5[r7] = r20
            int r7 = r4 + 1
            r20 = r5[r7]
            r5[r10] = r20
            int r10 = r4 + 2
            r20 = r5[r10]
            r5[r13] = r20
            r5[r4] = r14
            r5[r7] = r6
            r5[r10] = r9
            r5[r19] = r11
            int r3 = r3 + 4
            int r12 = r12 + 1
            if (r12 < r2) goto L1bf
            int r1 = r1 + (-1)
            goto L1be
        L221:
            r33.dispose()
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r2._fbo
            r1 = 0
            if (r0 == 0) goto La
            r0.dispose()
            r2._fbo = r1
        La:
            r2._byteBufferPixels = r1
            r2._pixelsRGBA = r1
            return
    }

    public com.badlogic.gdx.graphics.Color getDominantColor(org.fortheloss.sticknodes.SNShapeRenderer r5, com.badlogic.gdx.graphics.g2d.Batch r6, org.fortheloss.sticknodes.stickfigure.Stickfigure r7) {
            r4 = this;
            double r0 = java.lang.Math.random()
            float r0 = (float) r0
            r1 = 1203982336(0x47c35000, float:100000.0)
            float r0 = r0 * r1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            r1.<init>(r7)
            r4.renderStickfigure(r0, r5, r6, r1)
            java.lang.String r5 = org.fortheloss.sticknodes.App.tempPath
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r0)
            java.lang.String r5 = "_0000.png"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.io.File r6 = new java.io.File     // Catch: java.io.IOException -> L65
            r6.<init>(r5)     // Catch: java.io.IOException -> L65
            java.awt.image.BufferedImage r5 = javax.imageio.ImageIO.read(r6)     // Catch: java.io.IOException -> L65
            int[] r5 = org.fortheloss.framework.colorthief.ColorThief.getColor(r5)
            com.badlogic.gdx.Files r6 = com.badlogic.gdx.Gdx.files
            java.lang.String r7 = org.fortheloss.sticknodes.App.tempPath
            com.badlogic.gdx.files.FileHandle r6 = r6.absolute(r7)
            r6.emptyDirectory()
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r5 != 0) goto L4e
            com.badlogic.gdx.graphics.Color r5 = new com.badlogic.gdx.graphics.Color
            r5.<init>(r6, r6, r6, r6)
            return r5
        L4e:
            com.badlogic.gdx.graphics.Color r7 = new com.badlogic.gdx.graphics.Color
            r0 = 0
            r0 = r5[r0]
            float r0 = (float) r0
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 / r1
            r2 = 1
            r2 = r5[r2]
            float r2 = (float) r2
            float r2 = r2 / r1
            r3 = 2
            r5 = r5[r3]
            float r5 = (float) r5
            float r5 = r5 / r1
            r7.<init>(r0, r2, r5, r6)
            return r7
        L65:
            r5 = move-exception
            r5.printStackTrace()
            r5 = 0
            return r5
    }
}
