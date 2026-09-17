package org.fortheloss.sticknodes;

/* loaded from: classes2.dex */
public class Screenshotter implements com.badlogic.gdx.utils.Disposable {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private com.badlogic.gdx.graphics.g2d.Batch _batchRef;
    private com.badlogic.gdx.graphics.Color _bgColor1;
    private com.badlogic.gdx.graphics.Color _bgColor2;
    private java.nio.ByteBuffer _byteBufferPixels;
    private org.fortheloss.sticknodes.animationscreen.modules.CanvasModule _canvasModuleRef;
    private com.badlogic.gdx.graphics.glutils.FrameBuffer _fbo1;
    private com.badlogic.gdx.graphics.glutils.FrameBuffer _fbo2;
    private com.badlogic.gdx.utils.viewport.Viewport _fbo2Viewport;
    private int _fboHeight;
    private int _fboWidth;
    private org.fortheloss.sticknodes.animationscreen.FilterBundle _filterBundle;
    private org.fortheloss.sticknodes.animationscreen.modules.FramesModule _framesModuleRef;
    private int _nextStickfigureIndex;
    private org.fortheloss.sticknodes.animationscreen.NodeDrawTools _nodeDrawToolsRef;
    private boolean _packMode;
    private byte[] _pixelsRGBA;
    private org.fortheloss.sticknodes.data.ProjectData _projectDataRef;
    private com.badlogic.gdx.math.Matrix4 _rememberedBatchMatrix;
    private java.lang.String _screenshotsDirectory;
    private org.fortheloss.sticknodes.SNShapeRenderer _shapeRendererRef;
    private com.badlogic.gdx.files.FileHandle[] _stickfigureFiles;
    private org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator _stickfigureSizeCalculator;
    private com.badlogic.gdx.graphics.glutils.ShaderProgram _vignetteShader;

    public Screenshotter(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2, org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3, org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._fboWidth = r0
            r1._fboHeight = r0
            r1._nextStickfigureIndex = r0
            r1._packMode = r0
            r1._animationScreenRef = r2
            r1._canvasModuleRef = r3
            r1._framesModuleRef = r4
            org.fortheloss.sticknodes.data.ProjectData r2 = r2.getProjectData()
            r1._projectDataRef = r2
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r1._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.NodeDrawTools r2 = r2.getNodeDrawTools()
            r1._nodeDrawToolsRef = r2
            com.badlogic.gdx.graphics.g2d.Batch r2 = r2.getBatch()
            r1._batchRef = r2
            org.fortheloss.sticknodes.animationscreen.NodeDrawTools r2 = r1._nodeDrawToolsRef
            org.fortheloss.sticknodes.SNShapeRenderer r2 = r2.getShapeRenderer()
            r1._shapeRendererRef = r2
            return
    }

    private boolean doNormalScreenshot() {
            r25 = this;
            r0 = r25
            int r1 = r0._nextStickfigureIndex
            com.badlogic.gdx.files.FileHandle[] r2 = r0._stickfigureFiles
            int r3 = r2.length
            r4 = 1
            if (r1 < r3) goto Lb
            return r4
        Lb:
            int r3 = r1 + 1
            r0._nextStickfigureIndex = r3
            r1 = r2[r1]
            java.io.PrintStream r2 = java.lang.System.out
            r2.println()
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.String r3 = "----------"
            r2.println(r3)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println()
            java.io.PrintStream r2 = java.lang.System.out
            int r3 = r0._nextStickfigureIndex
            com.badlogic.gdx.files.FileHandle[] r5 = r0._stickfigureFiles
            int r5 = r5.length
            java.lang.String r6 = r1.nameWithoutExtension()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "New stickfigure ("
            r7.append(r8)
            r7.append(r3)
            java.lang.String r3 = " / "
            r7.append(r3)
            r7.append(r5)
            java.lang.String r3 = "): "
            r7.append(r3)
            r7.append(r6)
            java.lang.String r3 = r7.toString()
            r2.println(r3)
            java.lang.String r2 = r1.extension()
            java.lang.String r3 = "nodes"
            boolean r2 = r2.equalsIgnoreCase(r3)
            r3 = 0
            if (r2 != 0) goto L66
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "[Fail] File is not a stickfigure."
            r1.println(r2)
            return r3
        L66:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r0._animationScreenRef
            boolean r2 = r2.importStickfigure(r1)
            if (r2 != 0) goto L74
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r0._animationScreenRef
            boolean r2 = r2.importStickfigureOld(r1)
        L74:
            if (r2 != 0) goto L7e
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "[Fail] Stickfigure could not be imported."
            r1.println(r2)
            return r3
        L7e:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            org.fortheloss.sticknodes.data.ProjectData r5 = r0._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r5 = r5.libraryStickfigures
            int r6 = r5.size()
            int r6 = r6 - r4
            java.lang.Object r5 = r5.get(r6)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r5
            r2.<init>(r5)
            org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator r5 = r0._stickfigureSizeCalculator
            com.badlogic.gdx.math.Rectangle r5 = r5.getSize(r2)
            float r6 = r5.x
            float r7 = r5.y
            float r8 = r5.width
            float r8 = r8 - r6
            float r5 = r5.height
            float r5 = r5 - r7
            r15 = 0
            int r9 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r9 <= 0) goto L2e4
            int r9 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r9 > 0) goto Lad
            goto L2e4
        Lad:
            float r9 = r2.getScale()
            int r10 = r0._fboWidth
            float r11 = (float) r10
            r12 = 1063675494(0x3f666666, float:0.9)
            float r11 = r11 * r12
            int r13 = r0._fboHeight
            float r14 = (float) r13
            float r14 = r14 * r12
            float r10 = (float) r10
            r12 = 1060320051(0x3f333333, float:0.7)
            float r10 = r10 * r12
            float r13 = (float) r13
            float r13 = r13 * r12
            r12 = 1065353216(0x3f800000, float:1.0)
            int r16 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r16 >= 0) goto Lde
            int r16 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r16 >= 0) goto Lde
            float r11 = r8 / r10
            float r14 = r5 / r13
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 <= 0) goto Ldb
            float r10 = r10 / r8
            goto Lfa
        Ldb:
            float r10 = r13 / r5
            goto Lfa
        Lde:
            int r10 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r10 <= 0) goto Le5
            float r11 = r11 / r8
            r10 = r11
            goto Le7
        Le5:
            r10 = 1065353216(0x3f800000, float:1.0)
        Le7:
            int r11 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r11 <= 0) goto Lfa
            float r11 = r14 / r5
            float r13 = java.lang.Math.abs(r11)
            float r14 = java.lang.Math.abs(r10)
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 >= 0) goto Lfa
            r10 = r11
        Lfa:
            int r11 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r11 >= 0) goto L10b
            r9 = 953267991(0x38d1b717, float:1.0E-4)
            float r11 = r2.getScale()
            float r11 = r11 * r10
            float r9 = java.lang.Math.max(r9, r11)
        L10b:
            int r11 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r11 <= 0) goto L11b
            r9 = 1101004800(0x41a00000, float:20.0)
            float r13 = r2.getScale()
            float r13 = r13 * r10
            float r9 = java.lang.Math.min(r9, r13)
        L11b:
            if (r11 == 0) goto L12b
            r2.setScale(r9)
            r2.validateDirtyNodes()
            float r8 = r8 * r10
            float r5 = r5 * r10
            float r6 = r6 * r10
            float r7 = r7 * r10
        L12b:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r9 = r0._animationScreenRef
            com.badlogic.gdx.graphics.Color[] r9 = r9.debugGetColorBackgroundPresets()
            int r10 = r9.length
            int r10 = r10 / 2
            double r13 = java.lang.Math.random()
            float r11 = (float) r13
            int r10 = r10 - r4
            float r10 = (float) r10
            float r11 = r11 * r10
            int r10 = java.lang.Math.round(r11)
            double r13 = java.lang.Math.random()
            r16 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r11 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r11 >= 0) goto L15b
            com.badlogic.gdx.graphics.Color r11 = r0._bgColor1
            r13 = r9[r10]
            r11.set(r13)
            com.badlogic.gdx.graphics.Color r11 = r0._bgColor2
            int r10 = r10 + r4
            r9 = r9[r10]
            r11.set(r9)
            goto L16a
        L15b:
            com.badlogic.gdx.graphics.Color r11 = r0._bgColor2
            r13 = r9[r10]
            r11.set(r13)
            com.badlogic.gdx.graphics.Color r11 = r0._bgColor1
            int r10 = r10 + r4
            r9 = r9[r10]
            r11.set(r9)
        L16a:
            r9 = 1056964608(0x3f000000, float:0.5)
            r2.setGlow(r9)
            com.badlogic.gdx.graphics.Color r10 = com.badlogic.gdx.graphics.Color.WHITE
            r2.setGlowColor(r10)
            r2.setGlowIntensity(r9)
            com.badlogic.gdx.graphics.glutils.FrameBuffer r10 = r0._fbo1
            r10.begin()
            com.badlogic.gdx.graphics.GL20 r10 = com.badlogic.gdx.Gdx.gl
            r10.glClearColor(r12, r12, r12, r12)
            com.badlogic.gdx.graphics.GL20 r10 = com.badlogic.gdx.Gdx.gl
            r14 = 16384(0x4000, float:2.2959E-41)
            r10.glClear(r14)
            com.badlogic.gdx.utils.viewport.Viewport r10 = r0._fbo2Viewport
            r10.apply(r3)
            org.fortheloss.sticknodes.SNShapeRenderer r10 = r0._shapeRendererRef
            com.badlogic.gdx.utils.viewport.Viewport r11 = r0._fbo2Viewport
            com.badlogic.gdx.graphics.Camera r11 = r11.getCamera()
            com.badlogic.gdx.math.Matrix4 r11 = r11.combined
            r10.setProjectionMatrix(r11)
            com.badlogic.gdx.math.Matrix4 r10 = r0._rememberedBatchMatrix
            com.badlogic.gdx.graphics.g2d.Batch r11 = r0._batchRef
            com.badlogic.gdx.math.Matrix4 r11 = r11.getProjectionMatrix()
            r10.set(r11)
            com.badlogic.gdx.graphics.g2d.Batch r10 = r0._batchRef
            com.badlogic.gdx.utils.viewport.Viewport r11 = r0._fbo2Viewport
            com.badlogic.gdx.graphics.Camera r11 = r11.getCamera()
            com.badlogic.gdx.math.Matrix4 r11 = r11.combined
            r10.setProjectionMatrix(r11)
            org.fortheloss.sticknodes.SNShapeRenderer r10 = r0._shapeRendererRef
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r11 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r10.begin(r11)
            org.fortheloss.sticknodes.SNShapeRenderer r10 = r0._shapeRendererRef
            r17 = 0
            r18 = 0
            int r11 = r0._fboWidth
            float r11 = (float) r11
            int r13 = r0._fboHeight
            float r13 = (float) r13
            com.badlogic.gdx.graphics.Color r12 = r0._bgColor1
            com.badlogic.gdx.graphics.Color r14 = r0._bgColor2
            r16 = r10
            r19 = r11
            r20 = r13
            r21 = r12
            r22 = r12
            r23 = r14
            r24 = r14
            r16.rect(r17, r18, r19, r20, r21, r22, r23, r24)
            org.fortheloss.sticknodes.SNShapeRenderer r10 = r0._shapeRendererRef
            r10.flush()
            com.badlogic.gdx.graphics.GL20 r10 = com.badlogic.gdx.Gdx.gl
            r14 = 3042(0xbe2, float:4.263E-42)
            r10.glEnable(r14)
            int r10 = r0._fboWidth
            float r10 = (float) r10
            float r10 = r10 - r8
            float r10 = r10 * r9
            float r18 = r10 - r6
            int r6 = r0._fboHeight
            float r6 = (float) r6
            float r6 = r6 - r5
            float r6 = r6 * r9
            float r19 = r6 - r7
            org.fortheloss.sticknodes.SNShapeRenderer r6 = r0._shapeRendererRef
            com.badlogic.gdx.graphics.g2d.Batch r7 = r0._batchRef
            org.fortheloss.sticknodes.animationscreen.FilterBundle r8 = r0._filterBundle
            r11 = 0
            r12 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            r16 = 0
            r17 = 0
            r20 = 1
            r21 = 0
            r5 = r2
            r9 = r18
            r10 = r19
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 3042(0xbe2, float:4.263E-42)
            r14 = r16
            r15 = r17
            r16 = r20
            r17 = r21
            r5.drawLimbs(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            org.fortheloss.sticknodes.SNShapeRenderer r5 = r0._shapeRendererRef
            r5.end()
            com.badlogic.gdx.graphics.GL20 r5 = com.badlogic.gdx.Gdx.gl
            r5.glDisable(r4)
            com.badlogic.gdx.graphics.g2d.Batch r4 = r0._batchRef
            r4.begin()
            com.badlogic.gdx.graphics.g2d.Batch r4 = r0._batchRef
            r4.setColor(r3, r3, r3, r3)
            org.fortheloss.sticknodes.animationscreen.NodeDrawTools r6 = r0._nodeDrawToolsRef
            r9 = 0
            r10 = 0
            r11 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
            r13 = 1
            org.fortheloss.sticknodes.stickfigure.StickNode r14 = r2.getMainNode()
            r15 = 0
            r5 = r2
            r7 = r18
            r8 = r19
            r5.drawNodes(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            com.badlogic.gdx.graphics.g2d.Batch r2 = r0._batchRef
            r2.end()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0._fbo1
            r2.end()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0._fbo2
            r2.bind()
            com.badlogic.gdx.graphics.GL20 r2 = com.badlogic.gdx.Gdx.gl
            r2.glClearColor(r3, r3, r3, r3)
            com.badlogic.gdx.graphics.GL20 r2 = com.badlogic.gdx.Gdx.gl
            r4 = 16384(0x4000, float:2.2959E-41)
            r2.glClear(r4)
            com.badlogic.gdx.graphics.g2d.Batch r2 = r0._batchRef
            com.badlogic.gdx.math.Matrix4 r4 = r0._rememberedBatchMatrix
            r2.setProjectionMatrix(r4)
            com.badlogic.gdx.graphics.g2d.Batch r2 = r0._batchRef
            com.badlogic.gdx.graphics.glutils.ShaderProgram r4 = r0._vignetteShader
            r2.setShader(r4)
            com.badlogic.gdx.graphics.g2d.Batch r2 = r0._batchRef
            r2.begin()
            com.badlogic.gdx.graphics.glutils.ShaderProgram r2 = r0._vignetteShader
            com.badlogic.gdx.graphics.glutils.FrameBuffer r4 = r0._fbo2
            int r4 = r4.getWidth()
            float r4 = (float) r4
            com.badlogic.gdx.graphics.glutils.FrameBuffer r5 = r0._fbo2
            int r5 = r5.getHeight()
            float r5 = (float) r5
            java.lang.String r6 = "resolution"
            r2.setUniformf(r6, r4, r5)
            com.badlogic.gdx.graphics.g2d.Batch r2 = r0._batchRef
            r2.setColor(r3, r3, r3, r3)
            com.badlogic.gdx.graphics.g2d.Batch r2 = r0._batchRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r0._fbo1
            com.badlogic.gdx.graphics.GLTexture r3 = r3.getColorBufferTexture()
            com.badlogic.gdx.graphics.Texture r3 = (com.badlogic.gdx.graphics.Texture) r3
            r4 = 0
            r2.draw(r3, r4, r4)
            com.badlogic.gdx.graphics.g2d.Batch r2 = r0._batchRef
            r2.end()
            com.badlogic.gdx.graphics.g2d.Batch r2 = r0._batchRef
            r3 = 0
            r2.setShader(r3)
            com.badlogic.gdx.graphics.GL20 r2 = com.badlogic.gdx.Gdx.gl
            r3 = 3333(0xd05, float:4.67E-42)
            r4 = 1
            r2.glPixelStorei(r3, r4)
            java.nio.ByteBuffer r2 = r0._byteBufferPixels
            r2.clear()
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl
            r4 = 0
            r5 = 0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0._fbo2
            int r6 = r2.getWidth()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0._fbo2
            int r7 = r2.getHeight()
            r8 = 6408(0x1908, float:8.98E-42)
            r9 = 5121(0x1401, float:7.176E-42)
            java.nio.ByteBuffer r10 = r0._byteBufferPixels
            r3.glReadPixels(r4, r5, r6, r7, r8, r9, r10)
            java.nio.ByteBuffer r2 = r0._byteBufferPixels
            r2.clear()
            java.nio.ByteBuffer r2 = r0._byteBufferPixels
            byte[] r3 = r0._pixelsRGBA
            r2.get(r3)
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0._fbo2
            r2.end()
            byte[] r2 = r0._pixelsRGBA
            r0.saveToFile(r2, r1)
        L2e2:
            r1 = 0
            return r1
        L2e4:
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[Fail] Stickfigure is invalid size ("
            r2.append(r3)
            r2.append(r8)
            java.lang.String r3 = " x "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = ")."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.println(r2)
            goto L2e2
    }

    private boolean doPackScreenshot() {
            r26 = this;
            r0 = r26
            int r1 = r0._nextStickfigureIndex
            com.badlogic.gdx.files.FileHandle[] r2 = r0._stickfigureFiles
            int r3 = r2.length
            r4 = 1
            if (r1 < r3) goto Lb
            return r4
        Lb:
            int r3 = r1 + 1
            r0._nextStickfigureIndex = r3
            r1 = r2[r1]
            java.io.PrintStream r2 = java.lang.System.out
            r2.println()
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.String r3 = "----------"
            r2.println(r3)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println()
            java.io.PrintStream r2 = java.lang.System.out
            int r3 = r0._nextStickfigureIndex
            com.badlogic.gdx.files.FileHandle[] r5 = r0._stickfigureFiles
            int r5 = r5.length
            java.lang.String r6 = r1.name()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "New pack  ("
            r7.append(r8)
            r7.append(r3)
            java.lang.String r3 = " / "
            r7.append(r3)
            r7.append(r5)
            java.lang.String r3 = "): "
            r7.append(r3)
            r7.append(r6)
            java.lang.String r3 = r7.toString()
            r2.println(r3)
            java.lang.String r2 = r1.extension()
            java.lang.String r3 = "zip"
            boolean r2 = r2.equalsIgnoreCase(r3)
            r3 = 0
            if (r2 != 0) goto L66
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "[Fail] File is not a ZIP pack."
            r1.println(r2)
            return r3
        L66:
            com.badlogic.gdx.Files r2 = com.badlogic.gdx.Gdx.files
            java.lang.String r5 = org.fortheloss.sticknodes.App.stickfiguresPath
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = "zip_contents/"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.badlogic.gdx.files.FileHandle r2 = r2.absolute(r5)
            r2.mkdirs()
            r2.emptyDirectory()
            java.io.File r5 = r2.file()
            java.io.File r6 = r1.file()
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r5 = "/"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            boolean r5 = r0.extractFromZIP(r6, r5)
            if (r5 != 0) goto La9
            return r3
        La9:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r0._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r5 = r5.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r5 = (org.fortheloss.sticknodes.data.FrameData) r5
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r6 = r0._framesModuleRef
            r6.clearFrame(r5)
            com.badlogic.gdx.files.FileHandle[] r2 = r2.list()
            r6 = 1175233536(0x460ca400, float:9001.0)
            r7 = 0
            r7 = 1175233536(0x460ca400, float:9001.0)
            r8 = 0
            r9 = 0
            r10 = 0
        Lc4:
            int r11 = r2.length
            if (r10 >= r11) goto L10e
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r11 = r0._animationScreenRef
            r12 = r2[r10]
            boolean r11 = r11.importStickfigure(r12)
            if (r11 != 0) goto Ld2
            goto L10b
        Ld2:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r11 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            org.fortheloss.sticknodes.data.ProjectData r12 = r0._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r12 = r12.libraryStickfigures
            int r13 = r12.size()
            int r13 = r13 - r4
            java.lang.Object r12 = r12.get(r13)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r12 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r12
            r11.<init>(r12)
            org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator r12 = r0._stickfigureSizeCalculator
            com.badlogic.gdx.math.Rectangle r12 = r12.getSize(r11)
            float r13 = r12.x
            float r14 = r12.y
            float r15 = r12.width
            float r15 = r15 - r13
            float r12 = r12.height
            float r12 = r12 - r14
            float r8 = java.lang.Math.max(r8, r15)
            float r9 = java.lang.Math.max(r9, r12)
            float r6 = java.lang.Math.min(r6, r15)
            float r7 = java.lang.Math.min(r7, r12)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r12 = r0._animationScreenRef
            r12.addStickfigure(r11, r4, r3)
        L10b:
            int r10 = r10 + 1
            goto Lc4
        L10e:
            java.util.ArrayList r2 = r5.getDrawableFigures()
            int r10 = r0._fboWidth
            float r11 = (float) r10
            r12 = 1058642330(0x3f19999a, float:0.6)
            float r11 = r11 * r12
            int r13 = r0._fboHeight
            float r14 = (float) r13
            float r14 = r14 * r12
            float r10 = (float) r10
            r12 = 1050253722(0x3e99999a, float:0.3)
            float r10 = r10 * r12
            float r13 = (float) r13
            float r13 = r13 * r12
            r12 = 1065353216(0x3f800000, float:1.0)
            int r15 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r15 > 0) goto L132
            int r16 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r16 <= 0) goto L13b
        L132:
            int r16 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r16 < 0) goto L17d
            int r16 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r16 >= 0) goto L13b
            goto L17d
        L13b:
            if (r15 > 0) goto L163
            int r16 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r16 <= 0) goto L142
            goto L163
        L142:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 < 0) goto L14a
            int r9 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r9 >= 0) goto L17d
        L14a:
            if (r8 >= 0) goto L14e
            float r6 = r6 / r10
            goto L150
        L14e:
            r6 = 1065353216(0x3f800000, float:1.0)
        L150:
            int r8 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r8 >= 0) goto L17f
            float r7 = r7 / r13
            float r8 = java.lang.Math.abs(r7)
            float r9 = java.lang.Math.abs(r6)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L17f
            r6 = r7
            goto L17f
        L163:
            if (r15 <= 0) goto L168
            float r11 = r11 / r8
            r6 = r11
            goto L16a
        L168:
            r6 = 1065353216(0x3f800000, float:1.0)
        L16a:
            int r7 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r7 <= 0) goto L17f
            float r14 = r14 / r9
            float r7 = java.lang.Math.abs(r14)
            float r8 = java.lang.Math.abs(r6)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L17f
            r6 = r14
            goto L17f
        L17d:
            r6 = 1065353216(0x3f800000, float:1.0)
        L17f:
            int r7 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r7 >= 0) goto L18b
            r7 = 953267991(0x38d1b717, float:1.0E-4)
            float r7 = java.lang.Math.max(r7, r6)
            goto L18d
        L18b:
            r7 = 1065353216(0x3f800000, float:1.0)
        L18d:
            int r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r8 <= 0) goto L197
            r7 = 1101004800(0x41a00000, float:20.0)
            float r7 = java.lang.Math.min(r7, r6)
        L197:
            r6 = 0
        L198:
            int r8 = r2.size()
            if (r6 >= r8) goto L1ac
            java.lang.Object r8 = r2.get(r6)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r8 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r8
            float r9 = r12 / r7
            r8.setScale(r9)
            int r6 = r6 + 1
            goto L198
        L1ac:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r6 = r0._animationScreenRef
            r6.debugSeparateStickfigures()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r6 = r0._fbo1
            r6.begin()
            com.badlogic.gdx.graphics.GL20 r6 = com.badlogic.gdx.Gdx.gl
            r6.glClearColor(r12, r12, r12, r12)
            com.badlogic.gdx.graphics.GL20 r6 = com.badlogic.gdx.Gdx.gl
            r7 = 16384(0x4000, float:2.2959E-41)
            r6.glClear(r7)
            com.badlogic.gdx.utils.viewport.Viewport r6 = r0._fbo2Viewport
            r6.apply(r3)
            org.fortheloss.sticknodes.SNShapeRenderer r6 = r0._shapeRendererRef
            com.badlogic.gdx.utils.viewport.Viewport r7 = r0._fbo2Viewport
            com.badlogic.gdx.graphics.Camera r7 = r7.getCamera()
            com.badlogic.gdx.math.Matrix4 r7 = r7.combined
            r6.setProjectionMatrix(r7)
            com.badlogic.gdx.math.Matrix4 r6 = r0._rememberedBatchMatrix
            com.badlogic.gdx.graphics.g2d.Batch r7 = r0._batchRef
            com.badlogic.gdx.math.Matrix4 r7 = r7.getProjectionMatrix()
            r6.set(r7)
            com.badlogic.gdx.graphics.g2d.Batch r6 = r0._batchRef
            com.badlogic.gdx.utils.viewport.Viewport r7 = r0._fbo2Viewport
            com.badlogic.gdx.graphics.Camera r7 = r7.getCamera()
            com.badlogic.gdx.math.Matrix4 r7 = r7.combined
            r6.setProjectionMatrix(r7)
            org.fortheloss.sticknodes.SNShapeRenderer r6 = r0._shapeRendererRef
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r7 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r6.begin(r7)
            org.fortheloss.sticknodes.SNShapeRenderer r13 = r0._shapeRendererRef
            r14 = 0
            r15 = 0
            int r6 = r0._fboWidth
            float r6 = (float) r6
            int r7 = r0._fboHeight
            float r7 = (float) r7
            com.badlogic.gdx.graphics.Color r8 = r0._bgColor1
            com.badlogic.gdx.graphics.Color r9 = r0._bgColor2
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r8
            r20 = r9
            r21 = r9
            r13.rect(r14, r15, r16, r17, r18, r19, r20, r21)
            org.fortheloss.sticknodes.SNShapeRenderer r6 = r0._shapeRendererRef
            r6.end()
            r6 = 0
        L216:
            int r7 = r2.size()
            if (r6 >= r7) goto L27e
            java.lang.Object r7 = r2.get(r6)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r7 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r7
            com.badlogic.gdx.graphics.GL20 r8 = com.badlogic.gdx.Gdx.gl
            r9 = 3042(0xbe2, float:4.263E-42)
            r8.glEnable(r9)
            org.fortheloss.sticknodes.SNShapeRenderer r8 = r0._shapeRendererRef
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r10 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r8.begin(r10)
            org.fortheloss.sticknodes.SNShapeRenderer r14 = r0._shapeRendererRef
            com.badlogic.gdx.graphics.g2d.Batch r15 = r0._batchRef
            org.fortheloss.sticknodes.animationscreen.FilterBundle r8 = r0._filterBundle
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 1065353216(0x3f800000, float:1.0)
            r22 = 0
            r23 = 0
            r24 = 1
            r25 = 0
            r13 = r7
            r16 = r8
            r13.drawLimbs(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            org.fortheloss.sticknodes.SNShapeRenderer r8 = r0._shapeRendererRef
            r8.end()
            com.badlogic.gdx.graphics.GL20 r8 = com.badlogic.gdx.Gdx.gl
            r8.glDisable(r9)
            com.badlogic.gdx.graphics.g2d.Batch r8 = r0._batchRef
            r8.begin()
            com.badlogic.gdx.graphics.g2d.Batch r8 = r0._batchRef
            r8.setColor(r12, r12, r12, r12)
            org.fortheloss.sticknodes.animationscreen.NodeDrawTools r14 = r0._nodeDrawToolsRef
            r15 = 0
            r16 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r21 = 1
            org.fortheloss.sticknodes.stickfigure.StickNode r22 = r7.getMainNode()
            r23 = 0
            r13.drawNodes(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            com.badlogic.gdx.graphics.g2d.Batch r7 = r0._batchRef
            r7.end()
            int r6 = r6 + 1
            goto L216
        L27e:
            com.badlogic.gdx.graphics.GL20 r2 = com.badlogic.gdx.Gdx.gl
            r6 = 3333(0xd05, float:4.67E-42)
            r2.glPixelStorei(r6, r4)
            java.nio.ByteBuffer r2 = r0._byteBufferPixels
            r2.clear()
            com.badlogic.gdx.graphics.GL20 r6 = com.badlogic.gdx.Gdx.gl
            r7 = 0
            r8 = 0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0._fbo1
            int r9 = r2.getWidth()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0._fbo1
            int r10 = r2.getHeight()
            r11 = 6408(0x1908, float:8.98E-42)
            r12 = 5121(0x1401, float:7.176E-42)
            java.nio.ByteBuffer r13 = r0._byteBufferPixels
            r6.glReadPixels(r7, r8, r9, r10, r11, r12, r13)
            java.nio.ByteBuffer r2 = r0._byteBufferPixels
            r2.clear()
            java.nio.ByteBuffer r2 = r0._byteBufferPixels
            byte[] r6 = r0._pixelsRGBA
            r2.get(r6)
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0._fbo1
            r2.end()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0._fbo1
            int r2 = r2.getHeight()
            int r2 = r2 - r4
            com.badlogic.gdx.graphics.glutils.FrameBuffer r4 = r0._fbo1
            int r4 = r4.getWidth()
            r6 = 0
            r7 = 0
        L2c3:
            int r8 = r2 * r4
            int r8 = r8 + r6
            int r8 = r8 * 4
            if (r8 >= r7) goto L2d5
            byte[] r2 = r0._pixelsRGBA
            r0.saveToFile(r2, r1)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r0._framesModuleRef
            r1.clearFrame(r5)
            return r3
        L2d5:
            byte[] r9 = r0._pixelsRGBA
            r10 = r9[r7]
            int r11 = r7 + 1
            r12 = r9[r11]
            int r13 = r7 + 2
            r14 = r9[r13]
            int r15 = r7 + 3
            r16 = r9[r15]
            r17 = r9[r8]
            r9[r7] = r17
            int r17 = r8 + 1
            r18 = r9[r17]
            r9[r11] = r18
            int r11 = r8 + 2
            r18 = r9[r11]
            r9[r13] = r18
            int r13 = r8 + 3
            r18 = r9[r13]
            r9[r15] = r18
            r9[r8] = r10
            r9[r17] = r12
            r9[r11] = r14
            r9[r13] = r16
            int r7 = r7 + 4
            int r6 = r6 + 1
            if (r6 < r4) goto L2c3
            int r2 = r2 + (-1)
            r6 = 0
            goto L2c3
    }

    private boolean extractFromZIP(java.io.File r11, java.lang.String r12) {
            r10 = this;
            r0 = 0
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch: java.io.IOException -> Ld0
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.ISO_8859_1     // Catch: java.io.IOException -> Ld0
            r1.<init>(r11, r2)     // Catch: java.io.IOException -> Ld0
            java.util.Enumeration r11 = r1.entries()
        Lc:
            boolean r2 = r11.hasMoreElements()
            r3 = 1
            if (r2 == 0) goto Lcc
            java.lang.Object r2 = r11.nextElement()
            java.util.zip.ZipEntry r2 = (java.util.zip.ZipEntry) r2
            java.lang.String r4 = r2.getName()
            java.lang.String r5 = r10.stripExtension(r4)
            java.lang.String r4 = r10.getFileExtension(r4)
            java.lang.String r6 = "nodes"
            boolean r6 = r4.equalsIgnoreCase(r6)
            if (r6 != 0) goto L2e
            goto Lc
        L2e:
            r6 = 47
            r7 = 95
            java.lang.String r5 = r5.replace(r6, r7)
            com.badlogic.gdx.Files r6 = com.badlogic.gdx.Gdx.files
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r12)
            r7.append(r5)
            java.lang.String r8 = "."
            r7.append(r8)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            com.badlogic.gdx.files.FileHandle r6 = r6.absolute(r7)
            java.io.File r6 = r6.file()
            r7 = 0
        L58:
            boolean r8 = r6.exists()
            if (r8 == 0) goto L89
            com.badlogic.gdx.Files r6 = com.badlogic.gdx.Gdx.files
            int r7 = r7 + r3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r12)
            r8.append(r5)
            java.lang.String r9 = " ("
            r8.append(r9)
            r8.append(r7)
            java.lang.String r9 = ")."
            r8.append(r9)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            com.badlogic.gdx.files.FileHandle r6 = r6.absolute(r8)
            java.io.File r6 = r6.file()
            goto L58
        L89:
            java.io.InputStream r2 = r1.getInputStream(r2)     // Catch: java.io.IOException -> Lc6
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lbd
            r3.<init>(r6)     // Catch: java.io.IOException -> Lbd
            r4 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r4]
        L96:
            int r5 = r2.read(r4)     // Catch: java.lang.Throwable -> La9 java.io.IOException -> Lab
            r6 = -1
            if (r5 == r6) goto La1
            r3.write(r4, r0, r5)     // Catch: java.lang.Throwable -> La9 java.io.IOException -> Lab
            goto L96
        La1:
            org.jcodec.common.io.IOUtils.closeQuietly(r2)
            org.jcodec.common.io.IOUtils.closeQuietly(r3)
            goto Lc
        La9:
            r11 = move-exception
            goto Lb6
        Lab:
            r11 = move-exception
            r11.printStackTrace()     // Catch: java.lang.Throwable -> La9
            org.jcodec.common.io.IOUtils.closeQuietly(r2)
            org.jcodec.common.io.IOUtils.closeQuietly(r3)
            return r0
        Lb6:
            org.jcodec.common.io.IOUtils.closeQuietly(r2)
            org.jcodec.common.io.IOUtils.closeQuietly(r3)
            throw r11
        Lbd:
            r3 = move-exception
            r3.printStackTrace()
            org.jcodec.common.io.IOUtils.closeQuietly(r2)
            goto Lc
        Lc6:
            r2 = move-exception
            r2.printStackTrace()
            goto Lc
        Lcc:
            r1.close()     // Catch: java.io.IOException -> Lcf
        Lcf:
            return r3
        Ld0:
            r11 = move-exception
            r11.printStackTrace()
            return r0
    }

    private java.lang.String getFileExtension(java.lang.String r2) {
            r1 = this;
            r0 = 46
            int r0 = r2.lastIndexOf(r0)
            if (r0 <= 0) goto Lf
            int r0 = r0 + 1
            java.lang.String r2 = r2.substring(r0)
            goto L11
        Lf:
            java.lang.String r2 = ""
        L11:
            return r2
    }

    private com.badlogic.gdx.graphics.glutils.ShaderProgram getVignetteShader() {
            r3 = this;
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = new com.badlogic.gdx.graphics.glutils.ShaderProgram
            java.lang.String r1 = "// Custom uniforms\nuniform mat4 u_projTrans;               // Combined projection and view matrix\n\n// Attributes (in) from SpriteBatch\nattribute vec2 a_position;\nattribute vec2 a_texCoord0;\nattribute vec4 a_color;\n\n// Varyings (out) to fragment shader\nvarying vec4 v_color;\nvarying vec2 v_texCoord0;\n\nvoid main()\n{\n    v_color = a_color;\n    v_texCoord0 = a_texCoord0;\n    gl_Position = u_projTrans * vec4(a_position, 0.0, 1.0);\n}"
            java.lang.String r2 = "// Custom uniforms\nuniform sampler2D u_texture;                // Texture0\nuniform vec2 resolution;                    // Screen resolution\n\n// Varyings (in) from vertex shader\nvarying vec4 v_color;\nvarying vec2 v_texCoord0;\n\nconst float RADIUS = 0.8;                  // Radius of our vignette, where 0.5 results in a circle fitting the screen\nconst float SOFTNESS = 0.4;                 // Softness of our vignette, between 0.0 and 1.0\nconst float INTENSITY = 0.2;                // Transparency of the vignette, between 0.0 and 1.0\nconst vec3 SEPIA = vec3(1.2, 1.0, 0.8);     // Sepia colour, adjust to taste\n\nvoid main() {\n    // Sample the texture.\n    vec4 texColor = vec4(texture2D(u_texture, v_texCoord0).rgb, 1);\n\n    // VIGNETTE\n    // Determine center position.\n    vec2 position = (gl_FragCoord.xy / resolution.xy) - vec2(0.5);\n\n    // Determine the vector length of the center position.\n    float len = length(position);\n\n    // Use smoothstep to create a smooth vignette.\n    float vignette = smoothstep(RADIUS, RADIUS-SOFTNESS, len);\n\n    // Apply the vignette with 50% opacity.\n    texColor.rgb = mix(texColor.rgb, texColor.rgb * vignette, INTENSITY);\n\n    // GRAYSCALE\n    // Convert to grayscale using NTSC conversion weights.\n    float gray = dot(texColor.rgb, vec3(0.299, 0.587, 0.114));\n\n    // SEPIA\n    // Create sepia tone from some constant value.\n//    vec3 sepiaColor = vec3(gray) * SEPIA;\n\n    // Again mix so that the sepia effect is at 75%.\n//    texColor.rgb = mix(texColor.rgb, sepiaColor, 0.75);\n\n    // Final color, multiplied by vertex color.\n    gl_FragColor = texColor * v_color;\n}"
            r0.<init>(r1, r2)
            return r0
    }

    private void saveToFile(byte[] r12, com.badlogic.gdx.files.FileHandle r13) {
            r11 = this;
            int r0 = r11._fboWidth
            int r1 = r11._fboHeight
            int r0 = r0 * r1
            int[] r6 = new int[r0]
            int r0 = r12.length
            r9 = 0
            r1 = 0
            r2 = 0
        Lc:
            if (r1 >= r0) goto L2c
            int r3 = r2 + 1
            r4 = r12[r1]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            int r5 = r1 + 1
            r5 = r12[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            int r4 = r4 + r5
            int r5 = r1 + 2
            r5 = r12[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r5
            r6[r2] = r4
            int r1 = r1 + 4
            r2 = r3
            goto Lc
        L2c:
            java.awt.image.BufferedImage r12 = new java.awt.image.BufferedImage
            int r0 = r11._fboWidth
            int r1 = r11._fboHeight
            r10 = 1
            r12.<init>(r0, r1, r10)
            r2 = 0
            r3 = 0
            int r8 = r11._fboWidth
            int r5 = r11._fboHeight
            r7 = 0
            r1 = r12
            r4 = r8
            r1.setRGB(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = r13.nameWithoutExtension()
            java.lang.String r1 = "[^\\p{IsAlphabetic}^\\p{IsDigit}]"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replaceAll(r1, r2)
            java.lang.String r0 = r0.toLowerCase()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r11._screenshotsDirectory
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r0)
            java.lang.String r2 = ".jpg"
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r1.<init>(r3)
        L6d:
            boolean r3 = r1.exists()
            if (r3 == 0) goto L96
            java.io.File r1 = new java.io.File
            java.lang.String r3 = r11._screenshotsDirectory
            int r9 = r9 + r10
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r0)
            java.lang.String r3 = "____"
            r4.append(r3)
            r4.append(r9)
            r4.append(r2)
            java.lang.String r3 = r4.toString()
            r1.<init>(r3)
            goto L6d
        L96:
            java.lang.String r0 = "jpg"
            java.util.Iterator r0 = javax.imageio.ImageIO.getImageWritersByFormatName(r0)
            java.lang.Object r0 = r0.next()
            javax.imageio.ImageWriter r0 = (javax.imageio.ImageWriter) r0
            javax.imageio.stream.FileImageOutputStream r2 = new javax.imageio.stream.FileImageOutputStream     // Catch: java.io.IOException -> L107
            r2.<init>(r1)     // Catch: java.io.IOException -> L107
            r0.setOutput(r2)     // Catch: java.io.IOException -> L107
            javax.imageio.plugins.jpeg.JPEGImageWriteParam r2 = new javax.imageio.plugins.jpeg.JPEGImageWriteParam
            r3 = 0
            r2.<init>(r3)
            r4 = 2
            r2.setCompressionMode(r4)
            r4 = 1065353216(0x3f800000, float:1.0)
            r2.setCompressionQuality(r4)
            javax.imageio.IIOImage r4 = new javax.imageio.IIOImage     // Catch: java.io.IOException -> Lfb
            r4.<init>(r12, r3, r3)     // Catch: java.io.IOException -> Lfb
            r0.write(r3, r4, r2)     // Catch: java.io.IOException -> Lfb
            java.io.PrintStream r12 = java.lang.System.out
            java.lang.String r0 = "[Success] Done, stickfigure/JPG filenames are:"
            r12.println(r0)
            java.io.PrintStream r12 = java.lang.System.out
            java.lang.String r13 = r13.name()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "  "
            r0.append(r2)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.println(r13)
            java.io.PrintStream r12 = java.lang.System.out
            java.lang.String r13 = r1.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.println(r13)
            return
        Lfb:
            r12 = move-exception
            java.io.PrintStream r13 = java.lang.System.out
            java.lang.String r0 = "[Fail] Failed to write JPG file."
            r13.println(r0)
            r12.printStackTrace()
            return
        L107:
            r12 = move-exception
            java.io.PrintStream r13 = java.lang.System.out
            java.lang.String r0 = "[Fail] Failed to create writer for JPG file."
            r13.println(r0)
            r12.printStackTrace()
            return
    }

    private java.lang.String stripExtension(java.lang.String r3) {
            r2 = this;
            r0 = 46
            int r0 = r3.lastIndexOf(r0)
            if (r0 <= 0) goto Le
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)
            goto L10
        Le:
            java.lang.String r3 = ""
        L10:
            return r3
    }

    public void begin(org.fortheloss.framework.Assets r14, boolean r15) {
            r13 = this;
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "\nBeginning Screenshotter..."
            r0.println(r1)
            r13._packMode = r15
            com.badlogic.gdx.math.Matrix4 r15 = new com.badlogic.gdx.math.Matrix4
            r15.<init>()
            r13._rememberedBatchMatrix = r15
            r15 = 1920(0x780, float:2.69E-42)
            r13._fboWidth = r15
            r15 = 1080(0x438, float:1.513E-42)
            r13._fboHeight = r15
            float r15 = org.fortheloss.sticknodes.App.assetScaling
            r0 = 1065353216(0x3f800000, float:1.0)
            int r15 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r15 >= 0) goto L2c
            r15 = 1920(0x780, float:2.69E-42)
            int r15 = r15 / 2
            r13._fboWidth = r15
            r15 = 1080(0x438, float:1.513E-42)
            int r15 = r15 / 2
            r13._fboHeight = r15
        L2c:
            com.badlogic.gdx.graphics.Pixmap$Format r15 = com.badlogic.gdx.graphics.Pixmap.Format.RGB888
            int r1 = r13._fboWidth
            int r2 = r13._fboHeight
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r15
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r0, r1, r2, r3, r4, r5)
            r13._fbo1 = r0
            int r1 = r13._fboWidth
            int r2 = r13._fboHeight
            r0 = r15
            com.badlogic.gdx.graphics.glutils.FrameBuffer r15 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r0, r1, r2, r3, r4, r5)
            r13._fbo2 = r15
            com.badlogic.gdx.utils.viewport.ScreenViewport r15 = new com.badlogic.gdx.utils.viewport.ScreenViewport
            r15.<init>()
            r13._fbo2Viewport = r15
            com.badlogic.gdx.graphics.Camera r15 = r15.getCamera()
            com.badlogic.gdx.math.Vector3 r15 = r15.position
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r13._fbo2
            int r0 = r0.getWidth()
            int r0 = r0 / 2
            float r0 = (float) r0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r13._fbo2
            int r1 = r1.getHeight()
            int r1 = r1 / 2
            float r1 = (float) r1
            r2 = 0
            r15.set(r0, r1, r2)
            com.badlogic.gdx.utils.viewport.Viewport r15 = r13._fbo2Viewport
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r13._fbo2
            int r0 = r0.getWidth()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r13._fbo2
            int r1 = r1.getHeight()
            r2 = 0
            r15.update(r0, r1, r2)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r15 = r13.getVignetteShader()
            r13._vignetteShader = r15
            int r15 = r13._fboWidth
            int r0 = r13._fboHeight
            int r15 = r15 * r0
            int r15 = r15 * 4
            java.nio.ByteBuffer r0 = com.badlogic.gdx.utils.BufferUtils.newByteBuffer(r15)
            r13._byteBufferPixels = r0
            byte[] r15 = new byte[r15]
            r13._pixelsRGBA = r15
            org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator r15 = new org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator
            r15.<init>()
            r13._stickfigureSizeCalculator = r15
            com.badlogic.gdx.graphics.Color r15 = new com.badlogic.gdx.graphics.Color
            r15.<init>()
            r13._bgColor1 = r15
            com.badlogic.gdx.graphics.Color r15 = new com.badlogic.gdx.graphics.Color
            r15.<init>()
            r13._bgColor2 = r15
            com.badlogic.gdx.Files r15 = com.badlogic.gdx.Gdx.files
            java.lang.String r0 = org.fortheloss.sticknodes.App.stickfiguresPath
            com.badlogic.gdx.files.FileHandle r15 = r15.absolute(r0)
            com.badlogic.gdx.files.FileHandle[] r15 = r15.list()
            r13._stickfigureFiles = r15
            java.io.PrintStream r0 = java.lang.System.out
            int r15 = r15.length
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Number of files in folder: "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.println(r15)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r2 = "./screenshots/"
            r15.append(r2)
            r15.append(r0)
            java.lang.String r0 = "/"
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            r13._screenshotsDirectory = r15
            java.io.File r15 = new java.io.File
            java.lang.String r0 = r13._screenshotsDirectory
            r15.<init>(r0)
            boolean r0 = r15.exists()
            if (r0 != 0) goto Lfa
            r15.mkdirs()
        Lfa:
            org.fortheloss.sticknodes.animationscreen.FilterBundle r15 = new org.fortheloss.sticknodes.animationscreen.FilterBundle
            r2 = 3
            int r3 = r13._fboWidth
            int r4 = r13._fboHeight
            com.badlogic.gdx.graphics.glutils.FrameBuffer r5 = r13._fbo1
            r6 = 0
            com.badlogic.gdx.graphics.g2d.Batch r7 = r13._batchRef
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r1 = r15
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13._filterBundle = r15
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._animationScreenRef = r0
            r2._canvasModuleRef = r0
            r2._framesModuleRef = r0
            r2._projectDataRef = r0
            r2._nodeDrawToolsRef = r0
            r2._shapeRendererRef = r0
            r2._batchRef = r0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r2._fbo1
            if (r1 == 0) goto L18
            r1.dispose()
            r2._fbo1 = r0
        L18:
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r2._fbo2
            if (r1 == 0) goto L21
            r1.dispose()
            r2._fbo2 = r0
        L21:
            r2._byteBufferPixels = r0
            r2._pixelsRGBA = r0
            r2._fbo2Viewport = r0
            r2._bgColor1 = r0
            r2._bgColor2 = r0
            r2._stickfigureSizeCalculator = r0
            com.badlogic.gdx.graphics.glutils.ShaderProgram r1 = r2._vignetteShader
            if (r1 == 0) goto L36
            r1.dispose()
            r2._vignetteShader = r0
        L36:
            r2._stickfigureFiles = r0
            org.fortheloss.sticknodes.animationscreen.FilterBundle r1 = r2._filterBundle
            if (r1 == 0) goto L41
            r1.dispose()
            r2._filterBundle = r0
        L41:
            r2._rememberedBatchMatrix = r0
            return
    }

    public boolean doScreenshot() {
            r5 = this;
            boolean r0 = r5._packMode
            if (r0 == 0) goto L24
            com.badlogic.gdx.graphics.Color r0 = r5._bgColor1
            r1 = 1059168674(0x3f21a1a2, float:0.6313726)
            r2 = 1063839977(0x3f68e8e9, float:0.9098039)
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.set(r1, r2, r3, r3)
            com.badlogic.gdx.graphics.Color r0 = r5._bgColor2
            r1 = 1041272977(0x3e109091, float:0.14117648)
            r2 = 1053740751(0x3ecececf, float:0.40392157)
            r4 = 1062655703(0x3f56d6d7, float:0.8392157)
            r0.set(r1, r2, r4, r3)
            boolean r0 = r5.doPackScreenshot()
            return r0
        L24:
            boolean r0 = r5.doNormalScreenshot()
            return r0
    }
}
