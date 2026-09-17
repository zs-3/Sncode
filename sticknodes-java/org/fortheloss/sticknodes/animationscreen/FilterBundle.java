package org.fortheloss.sticknodes.animationscreen;

/* loaded from: classes2.dex */
public class FilterBundle implements com.badlogic.gdx.utils.Disposable {
    public static int EXTRA_BUFFER_SIZE_HALF = 50;
    private boolean _blurEnabled;
    private com.badlogic.gdx.graphics.glutils.FrameBuffer _defaultFBORef;
    private boolean _glowEnabled;
    private boolean _isEnabled;
    private boolean _isUsingTransformationMatrix;
    private int _originalViewportHeight;
    private int _originalViewportWidth;
    private int _originalViewportX;
    private int _originalViewportY;
    private com.badlogic.gdx.math.Rectangle _poppedScissors;
    private com.badlogic.gdx.math.Vector3 _tempVector3;
    private float _transformationRotationDeg;
    private float _uvScale;
    private float _uvScaleBlur;
    private float _uvScaleGlow;
    private boolean _willPopScissors;
    public com.badlogic.gdx.graphics.glutils.ShaderProgram allColorShader;
    public com.badlogic.gdx.graphics.glutils.ShaderProgram argbAndUnpremultiplyShader;
    public com.badlogic.gdx.graphics.glutils.ShaderProgram argbShader;
    public com.badlogic.gdx.graphics.g2d.Batch batch;
    public com.badlogic.gdx.graphics.glutils.ShaderProgram dropShadowHBlurShader;
    public com.badlogic.gdx.graphics.glutils.ShaderProgram dropShadowNoBlurShader;
    public com.badlogic.gdx.graphics.glutils.ShaderProgram dropShadowVBlurShader;
    public com.badlogic.gdx.graphics.glutils.FrameBuffer fbo1;
    public com.badlogic.gdx.graphics.glutils.FrameBuffer fbo2;
    public com.badlogic.gdx.graphics.glutils.FrameBuffer fbo3;
    public com.badlogic.gdx.graphics.glutils.FrameBuffer fboForMCs;
    public com.badlogic.gdx.graphics.glutils.FrameBuffer fboForMCs2;
    public com.badlogic.gdx.utils.viewport.Viewport fboViewport;
    public com.badlogic.gdx.graphics.glutils.ShaderProgram gaussianBlurShader;
    public com.badlogic.gdx.graphics.glutils.ShaderProgram hBlurAllShader;
    public com.badlogic.gdx.graphics.glutils.ShaderProgram hBlurInvertShader;
    public com.badlogic.gdx.graphics.glutils.ShaderProgram hBlurShader;
    public com.badlogic.gdx.graphics.glutils.ShaderProgram hGlowShader;
    public com.badlogic.gdx.graphics.glutils.ShaderProgram invertColorShader;
    private com.badlogic.gdx.math.Matrix4 invertedUntransMatrix;
    private com.badlogic.gdx.math.Matrix4 invertedUntransMatrixOrig;
    private float mExtraRotation;
    private float mFboScaleX;
    private float mFboScaleY;
    public com.badlogic.gdx.graphics.glutils.ShaderProgram motionBlurAllShader;
    public com.badlogic.gdx.graphics.glutils.ShaderProgram motionBlurInvertShader;
    public com.badlogic.gdx.graphics.glutils.ShaderProgram motionBlurOneDirectionAllShader;
    public com.badlogic.gdx.graphics.glutils.ShaderProgram motionBlurOneDirectionInvertShader;
    public com.badlogic.gdx.graphics.glutils.ShaderProgram motionBlurOneDirectionShader;
    public com.badlogic.gdx.graphics.glutils.ShaderProgram motionBlurShader;
    public com.badlogic.gdx.graphics.glutils.ShaderProgram outlineShader;
    public com.badlogic.gdx.graphics.glutils.ShaderProgram pixelateShader;
    public com.badlogic.gdx.math.Matrix4 rememberedProjectionMatrix;
    public com.badlogic.gdx.math.Matrix4 rememberedProjectionMatrixForMCs;
    public com.badlogic.gdx.math.Matrix4 rememberedTransformationMatrix;
    public com.badlogic.gdx.math.Matrix4 rememberedTransformationMatrixForMCs;
    public int renderHeight;
    public int renderWidth;
    public float renderX;
    public float renderY;
    public com.badlogic.gdx.graphics.glutils.ShaderProgram vBlurAllShader;
    public com.badlogic.gdx.graphics.glutils.ShaderProgram vBlurInvertShader;
    public com.badlogic.gdx.graphics.glutils.ShaderProgram vBlurShader;
    public com.badlogic.gdx.graphics.glutils.ShaderProgram vGlowShader;

    static {
            return
    }

    public FilterBundle(int r19, int r20, int r21, com.badlogic.gdx.graphics.glutils.FrameBuffer r22, com.badlogic.gdx.utils.viewport.Viewport r23, com.badlogic.gdx.graphics.g2d.Batch r24, org.fortheloss.framework.Assets r25, float r26, float r27, boolean r28, boolean r29) {
            r18 = this;
            r6 = r18
            r7 = r25
            r8 = r28
            java.lang.Class<com.badlogic.gdx.graphics.glutils.ShaderProgram> r9 = com.badlogic.gdx.graphics.glutils.ShaderProgram.class
            r18.<init>()
            r0 = 0
            r6.renderX = r0
            r6.renderY = r0
            r10 = 0
            r6.renderWidth = r10
            r6.renderHeight = r10
            r1 = 1065353216(0x3f800000, float:1.0)
            r6._uvScale = r1
            r6._uvScaleBlur = r1
            r6._uvScaleGlow = r1
            r1 = 1
            r6._isEnabled = r1
            r6._blurEnabled = r1
            r6._glowEnabled = r1
            r6._willPopScissors = r10
            r6._transformationRotationDeg = r0
            r6._isUsingTransformationMatrix = r10
            r6.mExtraRotation = r0
            com.badlogic.gdx.utils.viewport.ScreenViewport r0 = new com.badlogic.gdx.utils.viewport.ScreenViewport
            r0.<init>()
            r6.fboViewport = r0
            r1 = r20
            r2 = r21
            r3 = r26
            r4 = r27
            r6.updateRenderSizing(r1, r2, r3, r4)
            if (r23 == 0) goto L58
            int r0 = r23.getScreenX()
            r6._originalViewportX = r0
            int r0 = r23.getScreenY()
            r6._originalViewportY = r0
            int r0 = r23.getScreenWidth()
            r6._originalViewportWidth = r0
            int r0 = r23.getScreenHeight()
            r6._originalViewportHeight = r0
        L58:
            com.badlogic.gdx.graphics.Pixmap$Format r0 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888     // Catch: java.lang.Exception -> Lb9
            int r12 = r6.renderWidth     // Catch: java.lang.Exception -> Lb9
            int r13 = r6.renderHeight     // Catch: java.lang.Exception -> Lb9
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 1
            r11 = r0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r5 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> Lb9
            r6.fbo1 = r5     // Catch: java.lang.Exception -> Lb9
            int r12 = r6.renderWidth     // Catch: java.lang.Exception -> Lb9
            int r13 = r6.renderHeight     // Catch: java.lang.Exception -> Lb9
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 1
            r11 = r0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r5 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> Lb9
            r6.fboForMCs = r5     // Catch: java.lang.Exception -> Lb9
            org.fortheloss.framework.IPlatform r5 = org.fortheloss.sticknodes.App.platform     // Catch: java.lang.Exception -> Lb9
            boolean r5 = r5.isPro()     // Catch: java.lang.Exception -> Lb9
            if (r5 == 0) goto L1a2
            int r12 = r6.renderWidth     // Catch: java.lang.Exception -> Lb9
            int r13 = r6.renderHeight     // Catch: java.lang.Exception -> Lb9
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 1
            r11 = r0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r5 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> Lb9
            r6.fboForMCs2 = r5     // Catch: java.lang.Exception -> Lb9
            int r12 = r6.renderWidth     // Catch: java.lang.Exception -> Lb9
            int r13 = r6.renderHeight     // Catch: java.lang.Exception -> Lb9
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 1
            r11 = r0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r5 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> Lb9
            r6.fbo2 = r5     // Catch: java.lang.Exception -> Lb9
            int r12 = r6.renderWidth     // Catch: java.lang.Exception -> Lb9
            int r13 = r6.renderHeight     // Catch: java.lang.Exception -> Lb9
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 1
            r11 = r0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> Lb9
            r6.fbo3 = r0     // Catch: java.lang.Exception -> Lb9
            goto L1a2
        Lb9:
            java.io.PrintStream r0 = java.lang.System.out
            int r5 = r6.renderWidth
            int r11 = r6.renderHeight
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "FilterBundle failed to create 1, renderSize is: "
            r12.append(r13)
            r12.append(r5)
            java.lang.String r5 = " x "
            r12.append(r5)
            r12.append(r11)
            java.lang.String r5 = r12.toString()
            r0.println(r5)
            int r0 = r6.renderHeight
            r5 = 2160(0x870, float:3.027E-42)
            if (r0 <= r5) goto Lf0
            r5 = 0
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = r26
            r4 = r27
            r0.updateRenderSizing(r1, r2, r3, r4, r5)
        Lf0:
            com.badlogic.gdx.graphics.Pixmap$Format r0 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888     // Catch: java.lang.Exception -> L150
            int r12 = r6.renderWidth     // Catch: java.lang.Exception -> L150
            int r13 = r6.renderHeight     // Catch: java.lang.Exception -> L150
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 1
            r11 = r0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> L150
            r6.fbo1 = r1     // Catch: java.lang.Exception -> L150
            int r12 = r6.renderWidth     // Catch: java.lang.Exception -> L150
            int r13 = r6.renderHeight     // Catch: java.lang.Exception -> L150
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 1
            r11 = r0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> L150
            r6.fboForMCs = r1     // Catch: java.lang.Exception -> L150
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform     // Catch: java.lang.Exception -> L150
            boolean r1 = r1.isPro()     // Catch: java.lang.Exception -> L150
            if (r1 == 0) goto L1a2
            int r12 = r6.renderWidth     // Catch: java.lang.Exception -> L150
            int r13 = r6.renderHeight     // Catch: java.lang.Exception -> L150
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 1
            r11 = r0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> L150
            r6.fboForMCs2 = r1     // Catch: java.lang.Exception -> L150
            int r12 = r6.renderWidth     // Catch: java.lang.Exception -> L150
            int r13 = r6.renderHeight     // Catch: java.lang.Exception -> L150
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 1
            r11 = r0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> L150
            r6.fbo2 = r1     // Catch: java.lang.Exception -> L150
            int r12 = r6.renderWidth     // Catch: java.lang.Exception -> L150
            int r13 = r6.renderHeight     // Catch: java.lang.Exception -> L150
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 1
            r11 = r0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> L150
            r6.fbo3 = r0     // Catch: java.lang.Exception -> L150
            goto L1a2
        L150:
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "FilterBundle failed to create 2, attempting RGBA444"
            r0.println(r1)
            com.badlogic.gdx.graphics.Pixmap$Format r0 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA4444
            int r12 = r6.renderWidth
            int r13 = r6.renderHeight
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 1
            r11 = r0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r11, r12, r13, r14, r15, r16, r17)
            r6.fbo1 = r1
            int r12 = r6.renderWidth
            int r13 = r6.renderHeight
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r11, r12, r13, r14, r15, r16, r17)
            r6.fboForMCs = r1
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            boolean r1 = r1.isPro()
            if (r1 == 0) goto L1a2
            int r12 = r6.renderWidth
            int r13 = r6.renderHeight
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 1
            r11 = r0
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r11, r12, r13, r14, r15, r16, r17)
            r6.fboForMCs2 = r1
            int r12 = r6.renderWidth
            int r13 = r6.renderHeight
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r11, r12, r13, r14, r15, r16, r17)
            r6.fbo2 = r1
            int r12 = r6.renderWidth
            int r13 = r6.renderHeight
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r11, r12, r13, r14, r15, r16, r17)
            r6.fbo3 = r0
        L1a2:
            r0 = r22
            r6._defaultFBORef = r0
            r0 = r24
            r6.batch = r0
            r18.setUVQuality(r19)
            com.badlogic.gdx.math.Matrix4 r0 = new com.badlogic.gdx.math.Matrix4
            r0.<init>()
            r6.rememberedProjectionMatrix = r0
            com.badlogic.gdx.math.Matrix4 r0 = new com.badlogic.gdx.math.Matrix4
            r0.<init>()
            r6.rememberedTransformationMatrix = r0
            com.badlogic.gdx.math.Matrix4 r0 = new com.badlogic.gdx.math.Matrix4
            r0.<init>()
            r6.rememberedProjectionMatrixForMCs = r0
            com.badlogic.gdx.math.Matrix4 r0 = new com.badlogic.gdx.math.Matrix4
            r0.<init>()
            r6.rememberedTransformationMatrixForMCs = r0
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r0.<init>()
            r6._tempVector3 = r0
            com.badlogic.gdx.math.Matrix4 r0 = new com.badlogic.gdx.math.Matrix4
            r0.<init>()
            r6.invertedUntransMatrix = r0
            com.badlogic.gdx.math.Matrix4 r0 = new com.badlogic.gdx.math.Matrix4
            r0.<init>()
            r6.invertedUntransMatrixOrig = r0
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.isPro()
            if (r0 == 0) goto L2c2
            java.lang.String r0 = org.fortheloss.sticknodes.App.shaderAllColor
            java.lang.Object r0 = r7.get(r0, r9, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            r6.allColorShader = r0
            java.lang.String r0 = org.fortheloss.sticknodes.App.shaderInvertColor
            java.lang.Object r0 = r7.get(r0, r9, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            r6.invertColorShader = r0
            java.lang.String r0 = org.fortheloss.sticknodes.App.shaderDropShadowHBlur
            java.lang.Object r0 = r7.get(r0, r9, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            r6.dropShadowHBlurShader = r0
            java.lang.String r0 = org.fortheloss.sticknodes.App.shaderDropShadowVBlur
            java.lang.Object r0 = r7.get(r0, r9, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            r6.dropShadowVBlurShader = r0
            java.lang.String r0 = org.fortheloss.sticknodes.App.shaderDropShadowNoBlur
            java.lang.Object r0 = r7.get(r0, r9, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            r6.dropShadowNoBlurShader = r0
            java.lang.String r0 = org.fortheloss.sticknodes.App.shaderOutline
            java.lang.Object r0 = r7.get(r0, r9, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            r6.outlineShader = r0
            java.lang.String r0 = org.fortheloss.sticknodes.App.shaderHBlur
            java.lang.Object r0 = r7.get(r0, r9, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            r6.hBlurShader = r0
            java.lang.String r0 = org.fortheloss.sticknodes.App.shaderHBlurInvert
            java.lang.Object r0 = r7.get(r0, r9, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            r6.hBlurInvertShader = r0
            java.lang.String r0 = org.fortheloss.sticknodes.App.shaderHBlurAll
            java.lang.Object r0 = r7.get(r0, r9, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            r6.hBlurAllShader = r0
            java.lang.String r0 = org.fortheloss.sticknodes.App.shaderVBlur
            java.lang.Object r0 = r7.get(r0, r9, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            r6.vBlurShader = r0
            java.lang.String r0 = org.fortheloss.sticknodes.App.shaderVBlurInvert
            java.lang.Object r0 = r7.get(r0, r9, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            r6.vBlurInvertShader = r0
            java.lang.String r0 = org.fortheloss.sticknodes.App.shaderVBlurAll
            java.lang.Object r0 = r7.get(r0, r9, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            r6.vBlurAllShader = r0
            java.lang.String r0 = org.fortheloss.sticknodes.App.shaderMotionBlur
            java.lang.Object r0 = r7.get(r0, r9, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            r6.motionBlurShader = r0
            java.lang.String r0 = org.fortheloss.sticknodes.App.shaderMotionBlurInvert
            java.lang.Object r0 = r7.get(r0, r9, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            r6.motionBlurInvertShader = r0
            java.lang.String r0 = org.fortheloss.sticknodes.App.shaderMotionBlurAll
            java.lang.Object r0 = r7.get(r0, r9, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            r6.motionBlurAllShader = r0
            java.lang.String r0 = org.fortheloss.sticknodes.App.shaderMotionBlurOneDirection
            java.lang.Object r0 = r7.get(r0, r9, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            r6.motionBlurOneDirectionShader = r0
            java.lang.String r0 = org.fortheloss.sticknodes.App.shaderMotionBlurOneDirectionInvert
            java.lang.Object r0 = r7.get(r0, r9, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            r6.motionBlurOneDirectionInvertShader = r0
            java.lang.String r0 = org.fortheloss.sticknodes.App.shaderMotionBlurOneDirectionAll
            java.lang.Object r0 = r7.get(r0, r9, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            r6.motionBlurOneDirectionAllShader = r0
            java.lang.String r0 = org.fortheloss.sticknodes.App.shaderGaussianBlur
            java.lang.Object r0 = r7.get(r0, r9, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            r6.gaussianBlurShader = r0
            java.lang.String r0 = org.fortheloss.sticknodes.App.shaderHGlow
            java.lang.Object r0 = r7.get(r0, r9, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            r6.hGlowShader = r0
            java.lang.String r0 = org.fortheloss.sticknodes.App.shaderVGlow
            java.lang.Object r0 = r7.get(r0, r9, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            r6.vGlowShader = r0
            java.lang.String r0 = org.fortheloss.sticknodes.App.shaderPixelate
            java.lang.Object r0 = r7.get(r0, r9, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            r6.pixelateShader = r0
        L2c2:
            java.lang.String r0 = org.fortheloss.sticknodes.App.shaderArgbAndUnpremultiply
            java.lang.Object r0 = r7.get(r0, r9, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            r6.argbAndUnpremultiplyShader = r0
            java.lang.String r0 = org.fortheloss.sticknodes.App.shaderArgb
            java.lang.Object r0 = r7.get(r0, r9, r10)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            r6.argbShader = r0
            r6._willPopScissors = r8
            if (r8 == 0) goto L2e1
            com.badlogic.gdx.math.Rectangle r0 = new com.badlogic.gdx.math.Rectangle
            r0.<init>()
            r6._poppedScissors = r0
        L2e1:
            return
    }

    private void updateRenderSizing(int r7, int r8, float r9, float r10) {
            r6 = this;
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.updateRenderSizing(r1, r2, r3, r4, r5)
            return
    }

    private void updateRenderSizing(int r2, int r3, float r4, float r5, boolean r6) {
            r1 = this;
            if (r6 == 0) goto L17
            int r6 = org.fortheloss.sticknodes.animationscreen.FilterBundle.EXTRA_BUFFER_SIZE_HALF
            float r0 = (float) r6
            float r4 = r4 - r0
            r1.renderX = r4
            float r4 = (float) r6
            float r5 = r5 - r4
            r1.renderY = r5
            int r4 = r6 * 2
            int r4 = r4 + r2
            r1.renderWidth = r4
            int r6 = r6 * 2
            int r6 = r6 + r3
            r1.renderHeight = r6
            goto L1f
        L17:
            r1.renderX = r4
            r1.renderY = r5
            r1.renderWidth = r2
            r1.renderHeight = r3
        L1f:
            float r4 = (float) r2
            int r5 = r1.renderWidth
            float r5 = (float) r5
            float r5 = r4 / r5
            r1.mFboScaleX = r5
            float r5 = (float) r3
            int r6 = r1.renderHeight
            float r6 = (float) r6
            float r6 = r5 / r6
            r1.mFboScaleY = r6
            com.badlogic.gdx.utils.viewport.Viewport r6 = r1.fboViewport
            com.badlogic.gdx.graphics.Camera r6 = r6.getCamera()
            com.badlogic.gdx.math.Vector3 r6 = r6.position
            r0 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 * r0
            float r5 = r5 * r0
            r0 = 0
            r6.set(r4, r5, r0)
            com.badlogic.gdx.utils.viewport.Viewport r4 = r1.fboViewport
            r5 = 0
            r4.update(r2, r3, r5)
            return
    }

    public void beginFBO1() {
            r2 = this;
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r2.fbo1
            r0.begin()
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r1 = 0
            r0.glClearColor(r1, r1, r1, r1)
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r1 = 16384(0x4000, float:2.2959E-41)
            r0.glClear(r1)
            return
    }

    public void beginFBO2() {
            r2 = this;
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r2.fbo2
            r0.begin()
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r1 = 0
            r0.glClearColor(r1, r1, r1, r1)
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r1 = 16384(0x4000, float:2.2959E-41)
            r0.glClear(r1)
            return
    }

    public void beginFBO3() {
            r2 = this;
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r2.fbo3
            r0.begin()
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r1 = 0
            r0.glClearColor(r1, r1, r1, r1)
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r1 = 16384(0x4000, float:2.2959E-41)
            r0.glClear(r1)
            return
    }

    public void beginFBOForMCs() {
            r2 = this;
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r2.fboForMCs
            r0.begin()
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r1 = 0
            r0.glClearColor(r1, r1, r1, r1)
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r1 = 16384(0x4000, float:2.2959E-41)
            r0.glClear(r1)
            return
    }

    public void beginFBOForMCs2() {
            r2 = this;
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r2.fboForMCs2
            r0.begin()
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r1 = 0
            r0.glClearColor(r1, r1, r1, r1)
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r1 = 16384(0x4000, float:2.2959E-41)
            r0.glClear(r1)
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r2.fbo1
            r1 = 0
            if (r0 == 0) goto La
            r0.dispose()
            r2.fbo1 = r1
        La:
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r2.fbo2
            if (r0 == 0) goto L13
            r0.dispose()
            r2.fbo2 = r1
        L13:
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r2.fbo3
            if (r0 == 0) goto L1c
            r0.dispose()
            r2.fbo3 = r1
        L1c:
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r2.fboForMCs
            if (r0 == 0) goto L25
            r0.dispose()
            r2.fboForMCs = r1
        L25:
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r2.fboForMCs2
            if (r0 == 0) goto L2e
            r0.dispose()
            r2.fboForMCs2 = r1
        L2e:
            r2._defaultFBORef = r1
            r2.fboViewport = r1
            r2.rememberedProjectionMatrix = r1
            r2.rememberedTransformationMatrix = r1
            r2.rememberedProjectionMatrixForMCs = r1
            r2.rememberedTransformationMatrixForMCs = r1
            r2.batch = r1
            r2.allColorShader = r1
            r2.invertColorShader = r1
            r2.dropShadowHBlurShader = r1
            r2.dropShadowVBlurShader = r1
            r2.dropShadowNoBlurShader = r1
            r2.outlineShader = r1
            r2.hBlurShader = r1
            r2.hBlurInvertShader = r1
            r2.hBlurAllShader = r1
            r2.vBlurShader = r1
            r2.vBlurInvertShader = r1
            r2.vBlurAllShader = r1
            r2.motionBlurShader = r1
            r2.motionBlurAllShader = r1
            r2.motionBlurInvertShader = r1
            r2.motionBlurOneDirectionShader = r1
            r2.motionBlurOneDirectionAllShader = r1
            r2.motionBlurOneDirectionInvertShader = r1
            r2.gaussianBlurShader = r1
            r2.hGlowShader = r1
            r2.vGlowShader = r1
            r2.pixelateShader = r1
            r2.argbAndUnpremultiplyShader = r1
            r2.argbShader = r1
            r2._poppedScissors = r1
            r2.invertedUntransMatrix = r1
            r2.invertedUntransMatrixOrig = r1
            r2._tempVector3 = r1
            return
    }

    public void endFBO(boolean r5) {
            r4 = this;
            com.badlogic.gdx.graphics.glutils.FrameBuffer.unbind()
            if (r5 == 0) goto L1d
            com.badlogic.gdx.graphics.glutils.FrameBuffer r5 = r4._defaultFBORef
            r5.begin()
            int r5 = r4._originalViewportWidth
            if (r5 == 0) goto L1d
            boolean r0 = r4._willPopScissors
            if (r0 == 0) goto L1d
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            int r1 = r4._originalViewportX
            int r2 = r4._originalViewportY
            int r3 = r4._originalViewportHeight
            r0.glViewport(r1, r2, r5, r3)
        L1d:
            return
    }

    public boolean getBlurEnabled() {
            r1 = this;
            boolean r0 = r1._blurEnabled
            return r0
    }

    public com.badlogic.gdx.graphics.glutils.FrameBuffer getDefaultFBO() {
            r1 = this;
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r1._defaultFBORef
            return r0
    }

    public float getExtraRotation() {
            r1 = this;
            float r0 = r1.mExtraRotation
            return r0
    }

    public float getFboScaleX() {
            r1 = this;
            float r0 = r1.mFboScaleX
            return r0
    }

    public float getFboScaleY() {
            r1 = this;
            float r0 = r1.mFboScaleY
            return r0
    }

    public boolean getGlowEnabled() {
            r1 = this;
            boolean r0 = r1._glowEnabled
            return r0
    }

    public com.badlogic.gdx.math.Matrix4 getInvertedUntranslatedMatrix(com.badlogic.gdx.math.Matrix4 r3) {
            r2 = this;
            float[] r0 = r3.val
            com.badlogic.gdx.math.Matrix4 r1 = r2.invertedUntransMatrixOrig
            float[] r1 = r1.val
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 != 0) goto L21
            com.badlogic.gdx.math.Matrix4 r0 = r2.invertedUntransMatrixOrig
            r0.set(r3)
            com.badlogic.gdx.math.Matrix4 r0 = r2.invertedUntransMatrix
            r0.set(r3)
            com.badlogic.gdx.math.Matrix4 r3 = r2.invertedUntransMatrix
            r0 = 0
            r3.setTranslation(r0, r0, r0)
            com.badlogic.gdx.math.Matrix4 r3 = r2.invertedUntransMatrix
            r3.inv()
        L21:
            com.badlogic.gdx.math.Matrix4 r3 = r2.invertedUntransMatrix
            return r3
    }

    public float getTransformationRotationDeg() {
            r1 = this;
            float r0 = r1._transformationRotationDeg
            return r0
    }

    public float getUVScale() {
            r1 = this;
            boolean r0 = r1._isEnabled
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            float r0 = r1._uvScale
            return r0
    }

    public float getUVScaleBlur() {
            r1 = this;
            boolean r0 = r1._isEnabled
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            float r0 = r1._uvScaleBlur
            return r0
    }

    public float getUVScaleGlow() {
            r1 = this;
            boolean r0 = r1._isEnabled
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            float r0 = r1._uvScaleGlow
            return r0
    }

    public boolean isUsingRotatedTransformationMatrix() {
            r1 = this;
            boolean r0 = r1._isUsingTransformationMatrix
            return r0
    }

    public void popAndRememberScissors() {
            r2 = this;
            boolean r0 = r2._willPopScissors
            if (r0 == 0) goto Ld
            com.badlogic.gdx.math.Rectangle r0 = r2._poppedScissors
            com.badlogic.gdx.math.Rectangle r1 = com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.popScissors()
            r0.set(r1)
        Ld:
            return
    }

    public void rememberProjectionMatrix(com.badlogic.gdx.math.Matrix4 r2) {
            r1 = this;
            com.badlogic.gdx.math.Matrix4 r0 = r1.rememberedProjectionMatrix
            r0.set(r2)
            return
    }

    public void rememberProjectionMatrixForMCs(com.badlogic.gdx.math.Matrix4 r2) {
            r1 = this;
            com.badlogic.gdx.math.Matrix4 r0 = r1.rememberedProjectionMatrixForMCs
            r0.set(r2)
            return
    }

    public void rememberTransformationMatrix(com.badlogic.gdx.math.Matrix4 r2) {
            r1 = this;
            com.badlogic.gdx.math.Matrix4 r0 = r1.rememberedTransformationMatrix
            r0.set(r2)
            return
    }

    public void rememberTransformationMatrixForMCs(com.badlogic.gdx.math.Matrix4 r2) {
            r1 = this;
            com.badlogic.gdx.math.Matrix4 r0 = r1.rememberedTransformationMatrixForMCs
            r0.set(r2)
            return
    }

    public void restoreScissors() {
            r1 = this;
            boolean r0 = r1._willPopScissors
            if (r0 == 0) goto L9
            com.badlogic.gdx.math.Rectangle r0 = r1._poppedScissors
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.pushScissors(r0)
        L9:
            return
    }

    public void setBlurEnabled(boolean r1) {
            r0 = this;
            r0._blurEnabled = r1
            return
    }

    public void setDefaultFBO(com.badlogic.gdx.graphics.glutils.FrameBuffer r7, float r8, float r9, boolean r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.setDefaultFBO(r1, r2, r3, r4, r5)
            return
    }

    public void setDefaultFBO(com.badlogic.gdx.graphics.glutils.FrameBuffer r1, float r2, float r3, boolean r4, boolean r5) {
            r0 = this;
            r0._defaultFBORef = r1
            r0.renderX = r2
            r0.renderY = r3
            if (r5 == 0) goto L12
            int r1 = org.fortheloss.sticknodes.animationscreen.FilterBundle.EXTRA_BUFFER_SIZE_HALF
            float r5 = (float) r1
            float r2 = r2 - r5
            r0.renderX = r2
            float r1 = (float) r1
            float r3 = r3 - r1
            r0.renderY = r3
        L12:
            r0._willPopScissors = r4
            return
    }

    public void setEnabled(boolean r1) {
            r0 = this;
            r0._isEnabled = r1
            return
    }

    public void setExtraRotation(float r1) {
            r0 = this;
            r0.mExtraRotation = r1
            return
    }

    public void setGlowEnabled(boolean r1) {
            r0 = this;
            r0._glowEnabled = r1
            return
    }

    public void setIsUsingRotatedTransformationMatrix(boolean r1) {
            r0 = this;
            r0._isUsingTransformationMatrix = r1
            return
    }

    public void setScaleValues(float r1, float r2, int r3, int r4) {
            r0 = this;
            r0.updateRenderSizing(r3, r4, r1, r2)
            return
    }

    public void setTransformationRotationDeg(float r1) {
            r0 = this;
            r0._transformationRotationDeg = r1
            return
    }

    public void setUVQuality(int r3) {
            r2 = this;
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 1
            if (r3 != r1) goto Le
            r2._uvScale = r0
            r3 = 1048576000(0x3e800000, float:0.25)
            r2._uvScaleBlur = r3
            r2._uvScaleGlow = r3
            goto L23
        Le:
            r1 = 2
            if (r3 != r1) goto L1b
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            r2._uvScale = r3
            r2._uvScaleBlur = r0
            r2._uvScaleGlow = r0
            goto L23
        L1b:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2._uvScale = r3
            r2._uvScaleBlur = r3
            r2._uvScaleGlow = r3
        L23:
            return
    }

    public com.badlogic.gdx.math.Vector3 transformPoint(float r3, float r4, com.badlogic.gdx.math.Matrix4 r5) {
            r2 = this;
            com.badlogic.gdx.math.Vector3 r0 = r2._tempVector3
            r1 = 0
            com.badlogic.gdx.math.Vector3 r3 = r0.set(r3, r4, r1)
            com.badlogic.gdx.math.Vector3 r3 = r3.mul(r5)
            return r3
    }

    public boolean willPopScissors() {
            r1 = this;
            boolean r0 = r1._willPopScissors
            return r0
    }
}
