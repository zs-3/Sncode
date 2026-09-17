package org.fortheloss.sticknodes.movieclip;

/* loaded from: classes2.dex */
public class MCCache {
    public static boolean CACHE_ENABLED = true;
    private static com.badlogic.gdx.graphics.g2d.Batch _batchRef;
    private static org.fortheloss.sticknodes.animationscreen.FilterBundle _filterBundle;
    private static org.fortheloss.sticknodes.data.ProjectData _projectDataRef;
    private static com.badlogic.gdx.math.Matrix4 _rememberedProjectionMatrix;
    private static com.badlogic.gdx.graphics.g2d.SpriteBatch _renderBatch;
    private static com.badlogic.gdx.math.Matrix4 _renderProjectionMatrix;
    private static org.fortheloss.sticknodes.SNShapeRenderer _shapeRendererRef;
    private static org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator _sizeCalculator;
    private static float _stickfigureScale;
    private static float _viewportScaleX;
    private static float _viewportScaleY;
    public static int[][] cachedLibraryIDs;
    public static com.badlogic.gdx.graphics.glutils.FrameBuffer[] fbos;
    public static com.badlogic.gdx.math.Vector3[] offsets;

    static {
            return
    }

    public static int addToCache(int r6, int r7) {
            r0 = 0
            r1 = 0
        L2:
            r2 = 20
            r3 = -1
            r4 = 1
            if (r1 >= r2) goto L1a
            int[][] r2 = org.fortheloss.sticknodes.movieclip.MCCache.cachedLibraryIDs
            r5 = r2[r1]
            r5 = r5[r0]
            if (r5 != r6) goto L17
            r2 = r2[r1]
            r2 = r2[r4]
            if (r2 != r7) goto L17
            return r3
        L17:
            int r1 = r1 + 1
            goto L2
        L1a:
            r1 = 0
        L1b:
            if (r1 >= r2) goto L2a
            int[][] r5 = org.fortheloss.sticknodes.movieclip.MCCache.cachedLibraryIDs
            r5 = r5[r1]
            r5 = r5[r0]
            if (r5 != r3) goto L27
            r3 = r1
            goto L2a
        L27:
            int r1 = r1 + 1
            goto L1b
        L2a:
            if (r3 >= 0) goto L2d
            return r0
        L2d:
            cacheMovieclipInto(r6, r7, r3)
            return r4
    }

    private static void cacheMovieclipInto(int r27, int r28, int r29) {
            r0 = r27
            r1 = r28
            int[][] r2 = org.fortheloss.sticknodes.movieclip.MCCache.cachedLibraryIDs
            r3 = r2[r29]
            r4 = 0
            r3[r4] = r0
            r2 = r2[r29]
            r3 = 1
            r2[r3] = r1
            org.fortheloss.sticknodes.movieclip.MCCache.CACHE_ENABLED = r4
            com.badlogic.gdx.graphics.glutils.FrameBuffer[] r2 = org.fortheloss.sticknodes.movieclip.MCCache.fbos
            r2 = r2[r29]
            if (r2 != 0) goto L39
            com.badlogic.gdx.graphics.Pixmap$Format r5 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888     // Catch: java.lang.IllegalStateException -> L27
            r6 = 512(0x200, float:7.175E-43)
            r7 = 288(0x120, float:4.04E-43)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 1
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.IllegalStateException -> L27
            goto L35
        L27:
            com.badlogic.gdx.graphics.Pixmap$Format r5 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA4444
            r6 = 512(0x200, float:7.175E-43)
            r7 = 288(0x120, float:4.04E-43)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 1
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r5, r6, r7, r8, r9, r10, r11)
        L35:
            com.badlogic.gdx.graphics.glutils.FrameBuffer[] r5 = org.fortheloss.sticknodes.movieclip.MCCache.fbos
            r5[r29] = r2
        L39:
            org.fortheloss.sticknodes.animationscreen.FilterBundle r6 = org.fortheloss.sticknodes.movieclip.MCCache._filterBundle
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 1
            r7 = r2
            r6.setDefaultFBO(r7, r8, r9, r10, r11)
            com.badlogic.gdx.graphics.glutils.FrameBuffer.unbind()
            r2.begin()
            com.badlogic.gdx.math.Matrix4 r5 = org.fortheloss.sticknodes.movieclip.MCCache._rememberedProjectionMatrix
            com.badlogic.gdx.graphics.g2d.Batch r6 = org.fortheloss.sticknodes.movieclip.MCCache._batchRef
            com.badlogic.gdx.math.Matrix4 r6 = r6.getProjectionMatrix()
            r5.set(r6)
            com.badlogic.gdx.graphics.g2d.Batch r5 = org.fortheloss.sticknodes.movieclip.MCCache._batchRef
            com.badlogic.gdx.math.Matrix4 r6 = r5.getProjectionMatrix()
            float r7 = org.fortheloss.sticknodes.movieclip.MCCache._viewportScaleX
            float r8 = org.fortheloss.sticknodes.movieclip.MCCache._viewportScaleY
            r9 = 1065353216(0x3f800000, float:1.0)
            com.badlogic.gdx.math.Matrix4 r6 = r6.scale(r7, r8, r9)
            r5.setProjectionMatrix(r6)
            org.fortheloss.sticknodes.SNShapeRenderer r5 = org.fortheloss.sticknodes.movieclip.MCCache._shapeRendererRef
            com.badlogic.gdx.graphics.g2d.Batch r6 = org.fortheloss.sticknodes.movieclip.MCCache._batchRef
            com.badlogic.gdx.math.Matrix4 r6 = r6.getProjectionMatrix()
            r5.setProjectionMatrix(r6)
            org.fortheloss.sticknodes.data.ProjectData r5 = org.fortheloss.sticknodes.movieclip.MCCache._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r5 = r5.libraryMovieclips
            java.lang.Object r0 = r5.get(r0)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r0
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            java.lang.Object r0 = r0.get(r1)
            org.fortheloss.sticknodes.data.MCFrameData r0 = (org.fortheloss.sticknodes.data.MCFrameData) r0
            java.util.ArrayList r0 = r0.getDrawableFigures()
            int r1 = r0.size()
            r5 = 0
        L8d:
            if (r5 >= r1) goto L9b
            java.lang.Object r6 = r0.get(r5)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r6 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r6
            r6.validateDirtyNodes()
            int r5 = r5 + 1
            goto L8d
        L9b:
            com.badlogic.gdx.math.Rectangle r5 = new com.badlogic.gdx.math.Rectangle
            r5.<init>()
            r6 = 0
        La1:
            if (r6 >= r1) goto Lda
            org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator r7 = org.fortheloss.sticknodes.movieclip.MCCache._sizeCalculator
            java.lang.Object r8 = r0.get(r6)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r8 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r8
            com.badlogic.gdx.math.Rectangle r7 = r7.getSize(r8)
            float r8 = r7.x
            float r10 = r5.x
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 >= 0) goto Lb9
            r5.x = r8
        Lb9:
            float r8 = r7.y
            float r10 = r5.y
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 >= 0) goto Lc3
            r5.y = r8
        Lc3:
            float r8 = r7.width
            float r10 = r5.width
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 <= 0) goto Lcd
            r5.width = r8
        Lcd:
            float r7 = r7.height
            float r8 = r5.height
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 <= 0) goto Ld7
            r5.height = r7
        Ld7:
            int r6 = r6 + 1
            goto La1
        Lda:
            float r6 = r5.width
            float r7 = r5.x
            float r6 = r6 - r7
            float r7 = r5.height
            float r8 = r5.y
            float r7 = r7 - r8
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            r10 = 1156579328(0x44f00000, float:1920.0)
            float r8 = r8 * r10
            float r8 = r6 - r8
            r11 = 0
            float r8 = java.lang.Math.max(r11, r8)
            float r12 = org.fortheloss.sticknodes.App.assetScaling
            r13 = 1149698048(0x44870000, float:1080.0)
            float r12 = r12 * r13
            float r12 = r7 - r12
            float r12 = java.lang.Math.max(r11, r12)
            int r14 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r14 > 0) goto L105
            int r14 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r14 <= 0) goto L11c
        L105:
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 <= 0) goto L116
            r8 = 1140850688(0x44000000, float:512.0)
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 <= 0) goto L116
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r10
            float r9 = r7 / r6
            goto L11c
        L116:
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r13
            float r9 = r6 / r7
        L11c:
            float r6 = org.fortheloss.sticknodes.movieclip.MCCache._stickfigureScale
            float r6 = r6 * r9
            float r7 = r5.x
            float r7 = java.lang.Math.min(r11, r7)
            float r7 = -r7
            float r7 = r7 * r6
            float r8 = r5.y
            float r8 = java.lang.Math.min(r11, r8)
            float r8 = -r8
            float r8 = r8 * r6
            float r12 = org.fortheloss.sticknodes.movieclip.MCCache._stickfigureScale
            float r12 = r12 * r10
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            float r12 = r12 * r10
            r14 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 * r14
            float r15 = org.fortheloss.sticknodes.movieclip.MCCache._stickfigureScale
            float r15 = r15 * r13
            float r15 = r15 * r10
            float r15 = r15 * r14
            float r10 = r12 * r9
            float r12 = r12 - r10
            float r9 = r9 * r15
            float r15 = r15 - r9
            com.badlogic.gdx.math.Vector3[] r9 = org.fortheloss.sticknodes.movieclip.MCCache.offsets
            r9 = r9[r29]
            float r10 = r5.x
            float r10 = r10 * r6
            float r12 = r12 + r10
            float r5 = r5.y
            float r5 = r5 * r6
            float r15 = r15 + r5
            r9.set(r12, r15, r6)
            com.badlogic.gdx.graphics.GL20 r5 = com.badlogic.gdx.Gdx.gl
            r5.glClearColor(r11, r11, r11, r11)
            com.badlogic.gdx.graphics.GL20 r5 = com.badlogic.gdx.Gdx.gl
            r9 = 16384(0x4000, float:2.2959E-41)
            r5.glClear(r9)
            org.fortheloss.sticknodes.SNShapeRenderer r5 = org.fortheloss.sticknodes.movieclip.MCCache._shapeRendererRef
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r9 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r5.begin(r9)
        L170:
            if (r4 >= r1) goto L197
            java.lang.Object r5 = r0.get(r4)
            r14 = r5
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r14 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r14
            org.fortheloss.sticknodes.SNShapeRenderer r15 = org.fortheloss.sticknodes.movieclip.MCCache._shapeRendererRef
            com.badlogic.gdx.graphics.g2d.Batch r16 = org.fortheloss.sticknodes.movieclip.MCCache._batchRef
            org.fortheloss.sticknodes.animationscreen.FilterBundle r17 = org.fortheloss.sticknodes.movieclip.MCCache._filterBundle
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r18 = r7
            r19 = r8
            r22 = r6
            r14.drawLimbs(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r4 = r4 + 1
            goto L170
        L197:
            org.fortheloss.sticknodes.SNShapeRenderer r0 = org.fortheloss.sticknodes.movieclip.MCCache._shapeRendererRef
            r0.end()
            r2.end()
            org.fortheloss.sticknodes.SNShapeRenderer r0 = org.fortheloss.sticknodes.movieclip.MCCache._shapeRendererRef
            com.badlogic.gdx.math.Matrix4 r1 = org.fortheloss.sticknodes.movieclip.MCCache._rememberedProjectionMatrix
            r0.setProjectionMatrix(r1)
            com.badlogic.gdx.graphics.g2d.Batch r0 = org.fortheloss.sticknodes.movieclip.MCCache._batchRef
            com.badlogic.gdx.math.Matrix4 r1 = org.fortheloss.sticknodes.movieclip.MCCache._rememberedProjectionMatrix
            r0.setProjectionMatrix(r1)
            org.fortheloss.sticknodes.movieclip.MCCache.CACHE_ENABLED = r3
            return
    }

    public static void disposeCache() {
            r0 = 0
            org.fortheloss.sticknodes.movieclip.MCCache.CACHE_ENABLED = r0
            r1 = 0
            org.fortheloss.sticknodes.movieclip.MCCache._shapeRendererRef = r1
            org.fortheloss.sticknodes.movieclip.MCCache._batchRef = r1
            org.fortheloss.sticknodes.movieclip.MCCache._projectDataRef = r1
            com.badlogic.gdx.graphics.g2d.SpriteBatch r2 = org.fortheloss.sticknodes.movieclip.MCCache._renderBatch
            if (r2 == 0) goto L13
            r2.dispose()
            org.fortheloss.sticknodes.movieclip.MCCache._renderBatch = r1
        L13:
            org.fortheloss.sticknodes.animationscreen.FilterBundle r2 = org.fortheloss.sticknodes.movieclip.MCCache._filterBundle
            if (r2 == 0) goto L1c
            r2.dispose()
            org.fortheloss.sticknodes.movieclip.MCCache._filterBundle = r1
        L1c:
            org.fortheloss.sticknodes.movieclip.MCCache._sizeCalculator = r1
            org.fortheloss.sticknodes.movieclip.MCCache.cachedLibraryIDs = r1
            org.fortheloss.sticknodes.movieclip.MCCache.offsets = r1
            com.badlogic.gdx.graphics.glutils.FrameBuffer[] r2 = org.fortheloss.sticknodes.movieclip.MCCache.fbos
            if (r2 == 0) goto L38
        L26:
            r2 = 20
            if (r0 >= r2) goto L36
            com.badlogic.gdx.graphics.glutils.FrameBuffer[] r2 = org.fortheloss.sticknodes.movieclip.MCCache.fbos
            r2 = r2[r0]
            if (r2 == 0) goto L33
            r2.dispose()
        L33:
            int r0 = r0 + 1
            goto L26
        L36:
            org.fortheloss.sticknodes.movieclip.MCCache.fbos = r1
        L38:
            org.fortheloss.sticknodes.movieclip.MCCache._rememberedProjectionMatrix = r1
            org.fortheloss.sticknodes.movieclip.MCCache._renderProjectionMatrix = r1
            return
    }

    public static void disposeFBOs() {
            r0 = 0
        L1:
            r1 = 20
            if (r0 >= r1) goto L11
            com.badlogic.gdx.graphics.glutils.FrameBuffer[] r1 = org.fortheloss.sticknodes.movieclip.MCCache.fbos
            r1 = r1[r0]
            if (r1 == 0) goto Le
            r1.dispose()
        Le:
            int r0 = r0 + 1
            goto L1
        L11:
            r0 = 0
            org.fortheloss.sticknodes.movieclip.MCCache.fbos = r0
            java.lang.System.gc()
            return
    }

    public static void generateCache(org.fortheloss.sticknodes.data.ProjectData r14, com.badlogic.gdx.scenes.scene2d.Stage r15, org.fortheloss.sticknodes.SNShapeRenderer r16, com.badlogic.gdx.graphics.g2d.Batch r17, org.fortheloss.framework.Assets r18) {
            r0 = 1
            org.fortheloss.sticknodes.movieclip.MCCache.CACHE_ENABLED = r0
            org.fortheloss.sticknodes.movieclip.MCCache._projectDataRef = r14
            org.fortheloss.sticknodes.movieclip.MCCache._shapeRendererRef = r16
            org.fortheloss.sticknodes.movieclip.MCCache._batchRef = r17
            com.badlogic.gdx.graphics.g2d.SpriteBatch r0 = new com.badlogic.gdx.graphics.g2d.SpriteBatch
            r1 = 4
            r0.<init>(r1)
            org.fortheloss.sticknodes.movieclip.MCCache._renderBatch = r0
            org.fortheloss.sticknodes.animationscreen.FilterBundle r0 = new org.fortheloss.sticknodes.animationscreen.FilterBundle
            com.badlogic.gdx.graphics.g2d.Batch r8 = org.fortheloss.sticknodes.movieclip.MCCache._batchRef
            r3 = 3
            r4 = 512(0x200, float:7.175E-43)
            r5 = 288(0x120, float:4.04E-43)
            r6 = 0
            r7 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r2 = r0
            r9 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            org.fortheloss.sticknodes.movieclip.MCCache._filterBundle = r0
            org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator r0 = new org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator
            r0.<init>()
            org.fortheloss.sticknodes.movieclip.MCCache._sizeCalculator = r0
            r0 = 20
            int[][] r1 = new int[r0][]
            org.fortheloss.sticknodes.movieclip.MCCache.cachedLibraryIDs = r1
            com.badlogic.gdx.graphics.glutils.FrameBuffer[] r1 = new com.badlogic.gdx.graphics.glutils.FrameBuffer[r0]
            org.fortheloss.sticknodes.movieclip.MCCache.fbos = r1
            com.badlogic.gdx.math.Vector3[] r1 = new com.badlogic.gdx.math.Vector3[r0]
            org.fortheloss.sticknodes.movieclip.MCCache.offsets = r1
            r1 = 0
        L3e:
            if (r1 >= r0) goto L5c
            com.badlogic.gdx.graphics.glutils.FrameBuffer[] r2 = org.fortheloss.sticknodes.movieclip.MCCache.fbos
            r3 = 0
            r2[r1] = r3
            com.badlogic.gdx.math.Vector3[] r2 = org.fortheloss.sticknodes.movieclip.MCCache.offsets
            com.badlogic.gdx.math.Vector3 r3 = new com.badlogic.gdx.math.Vector3
            r4 = 0
            r3.<init>(r4, r4, r4)
            r2[r1] = r3
            int[][] r2 = org.fortheloss.sticknodes.movieclip.MCCache.cachedLibraryIDs
            r3 = 2
            int[] r3 = new int[r3]
            r3 = {x0098: FILL_ARRAY_DATA , data: [-1, -1} // fill-array
            r2[r1] = r3
            int r1 = r1 + 1
            goto L3e
        L5c:
            r0 = 1156579328(0x44f00000, float:1920.0)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r0
            r0 = 1140850688(0x44000000, float:512.0)
            float r1 = r0 / r1
            org.fortheloss.sticknodes.movieclip.MCCache._stickfigureScale = r1
            com.badlogic.gdx.utils.viewport.Viewport r1 = r15.getViewport()
            float r1 = r1.getWorldWidth()
            float r1 = r1 / r0
            org.fortheloss.sticknodes.movieclip.MCCache._viewportScaleX = r1
            com.badlogic.gdx.utils.viewport.Viewport r0 = r15.getViewport()
            float r0 = r0.getWorldHeight()
            r1 = 1133510656(0x43900000, float:288.0)
            float r0 = r0 / r1
            org.fortheloss.sticknodes.movieclip.MCCache._viewportScaleY = r0
            com.badlogic.gdx.math.Matrix4 r0 = new com.badlogic.gdx.math.Matrix4
            r0.<init>()
            org.fortheloss.sticknodes.movieclip.MCCache._rememberedProjectionMatrix = r0
            com.badlogic.gdx.math.Matrix4 r0 = new com.badlogic.gdx.math.Matrix4
            r0.<init>()
            org.fortheloss.sticknodes.movieclip.MCCache._renderProjectionMatrix = r0
            float r1 = org.fortheloss.sticknodes.movieclip.MCCache._viewportScaleX
            float r2 = org.fortheloss.sticknodes.movieclip.MCCache._viewportScaleY
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.scale(r1, r2, r3)
            return
    }

    public static int getCachedIndex(int r5, int r6) {
            boolean r0 = org.fortheloss.sticknodes.movieclip.MCCache.CACHE_ENABLED
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 0
            r2 = 0
        L8:
            r3 = 20
            if (r2 >= r3) goto L1f
            int[][] r3 = org.fortheloss.sticknodes.movieclip.MCCache.cachedLibraryIDs
            r4 = r3[r2]
            r4 = r4[r0]
            if (r4 != r5) goto L1c
            r3 = r3[r2]
            r4 = 1
            r3 = r3[r4]
            if (r3 != r6) goto L1c
            return r2
        L1c:
            int r2 = r2 + 1
            goto L8
        L1f:
            return r1
    }

    public static com.badlogic.gdx.graphics.g2d.Batch getRenderBatch() {
            com.badlogic.gdx.graphics.g2d.SpriteBatch r0 = org.fortheloss.sticknodes.movieclip.MCCache._renderBatch
            return r0
    }

    public static void rebuildFBOs() {
            java.lang.System.gc()
            com.badlogic.gdx.graphics.glutils.FrameBuffer[] r0 = org.fortheloss.sticknodes.movieclip.MCCache.fbos
            r1 = 20
            if (r0 != 0) goto Ld
            com.badlogic.gdx.graphics.glutils.FrameBuffer[] r0 = new com.badlogic.gdx.graphics.glutils.FrameBuffer[r1]
            org.fortheloss.sticknodes.movieclip.MCCache.fbos = r0
        Ld:
            r0 = 0
            r2 = 0
        Lf:
            if (r2 >= r1) goto L26
            int[][] r3 = org.fortheloss.sticknodes.movieclip.MCCache.cachedLibraryIDs
            r4 = r3[r2]
            r4 = r4[r0]
            r3 = r3[r2]
            r5 = 1
            r3 = r3[r5]
            if (r4 < 0) goto L23
            if (r3 < 0) goto L23
            cacheMovieclipInto(r4, r3, r2)
        L23:
            int r2 = r2 + 1
            goto Lf
        L26:
            return
    }

    public static void removeFromCache(int r4) {
            int[][] r0 = org.fortheloss.sticknodes.movieclip.MCCache.cachedLibraryIDs
            r1 = r0[r4]
            r2 = 0
            r3 = -1
            r1[r2] = r3
            r4 = r0[r4]
            r0 = 1
            r4[r0] = r3
            return
    }

    public static void removeFromCache(int r4, int r5) {
            r0 = 0
            r1 = 0
        L2:
            r2 = 20
            if (r1 >= r2) goto L23
            int[][] r2 = org.fortheloss.sticknodes.movieclip.MCCache.cachedLibraryIDs
            r3 = r2[r1]
            r3 = r3[r0]
            if (r3 != r4) goto L20
            r3 = -1
            if (r5 != r3) goto L15
            removeFromCache(r1)
            goto L20
        L15:
            r2 = r2[r1]
            r3 = 1
            r2 = r2[r3]
            if (r2 != r5) goto L20
            removeFromCache(r1)
            goto L23
        L20:
            int r1 = r1 + 1
            goto L2
        L23:
            return
    }

    public static void updateCacheOf(org.fortheloss.sticknodes.movieclip.MCMovieclipSource r5) {
            int r0 = r5.getLibraryID()
            if (r0 >= 0) goto L7
            return
        L7:
            r1 = 0
            r2 = 0
        L9:
            r3 = 20
            if (r2 >= r3) goto L2c
            int[][] r3 = org.fortheloss.sticknodes.movieclip.MCCache.cachedLibraryIDs
            r4 = r3[r2]
            r4 = r4[r1]
            if (r4 != r0) goto L29
            r3 = r3[r2]
            r4 = 1
            r3 = r3[r4]
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r5.frames
            int r4 = r4.size()
            if (r3 < r4) goto L26
            removeFromCache(r2)
            goto L29
        L26:
            cacheMovieclipInto(r0, r3, r2)
        L29:
            int r2 = r2 + 1
            goto L9
        L2c:
            return
    }
}
