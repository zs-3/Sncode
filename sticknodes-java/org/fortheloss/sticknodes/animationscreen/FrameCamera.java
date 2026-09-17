package org.fortheloss.sticknodes.animationscreen;

/* loaded from: classes2.dex */
public class FrameCamera implements com.badlogic.gdx.utils.Disposable {
    private static java.util.ArrayList<com.badlogic.gdx.graphics.Color> cameraColors;
    private static byte cameraMode;
    public static org.fortheloss.sticknodes.animationscreen.FrameCamera mcDefaultInstance;
    private static int perlinIndex;
    public static float perlinIndexIncrementer;
    private static int perlinLength;
    private static float[] perlinRotation;
    private static float[] perlinX;
    private static float[] perlinY;
    private float _beforeWobbleCamRotationDeg;
    private float _beforeWobbleCamScale;
    private float _beforeWobbleCamX;
    private float _beforeWobbleCamY;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> _cameraFigureLockBundles;
    private float _cameraOffsetX;
    private float _cameraOffsetY;
    private float _cameraScale;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle> _cameraTextfieldLockBundles;
    private org.fortheloss.sticknodes.data.FrameData _frameDataRef;
    private boolean _isAutoCamera;
    private boolean _isWidescreen;
    private boolean _isWobblingRotation;
    private boolean _isWobblingXY;
    private float _rotationDeg;
    private float _wobbleRotationIntensity;
    private boolean _wobbleScaleEnabled;
    private float _wobbleSpeed;
    private int _wobbleXYIntensity;

    static {
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = new org.fortheloss.sticknodes.animationscreen.FrameCamera
            r1 = 0
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.FrameCamera.mcDefaultInstance = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.fortheloss.sticknodes.animationscreen.FrameCamera.cameraColors = r0
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.RED
            r0.add(r1)
            java.util.ArrayList<com.badlogic.gdx.graphics.Color> r0 = org.fortheloss.sticknodes.animationscreen.FrameCamera.cameraColors
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.GREEN
            r0.add(r1)
            java.util.ArrayList<com.badlogic.gdx.graphics.Color> r0 = org.fortheloss.sticknodes.animationscreen.FrameCamera.cameraColors
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.MAGENTA
            r0.add(r1)
            java.util.ArrayList<com.badlogic.gdx.graphics.Color> r0 = org.fortheloss.sticknodes.animationscreen.FrameCamera.cameraColors
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.BLUE
            r0.add(r1)
            return
    }

    public FrameCamera(org.fortheloss.sticknodes.animationscreen.FrameCamera r8, org.fortheloss.sticknodes.data.FrameData r9, boolean r10) {
            r7 = this;
            r7.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r7._cameraScale = r0
            r0 = 0
            r7._cameraOffsetX = r0
            r7._cameraOffsetY = r0
            r7._rotationDeg = r0
            r1 = 0
            r7._isWidescreen = r1
            r7._isAutoCamera = r1
            r7._isWobblingXY = r1
            r7._isWobblingRotation = r1
            r2 = 1
            r7._wobbleScaleEnabled = r2
            r3 = 1077936128(0x40400000, float:3.0)
            r7._wobbleSpeed = r3
            r3 = 8
            r7._wobbleXYIntensity = r3
            r3 = 1056964608(0x3f000000, float:0.5)
            r7._wobbleRotationIntensity = r3
            r7._beforeWobbleCamX = r0
            r7._beforeWobbleCamY = r0
            r7._beforeWobbleCamScale = r0
            r7._beforeWobbleCamRotationDeg = r0
            r7._frameDataRef = r9
            float r9 = r8._cameraScale
            r7._cameraScale = r9
            float r9 = r8._cameraOffsetX
            r7._cameraOffsetX = r9
            float r9 = r8._cameraOffsetY
            r7._cameraOffsetY = r9
            float r9 = r8._rotationDeg
            r7._rotationDeg = r9
            boolean r9 = r8._isWidescreen
            r7._isWidescreen = r9
            boolean r9 = r8._isWobblingXY
            r7._isWobblingXY = r9
            boolean r9 = r8._isWobblingRotation
            r7._isWobblingRotation = r9
            boolean r9 = r8._wobbleScaleEnabled
            r7._wobbleScaleEnabled = r9
            int r9 = r8._wobbleXYIntensity
            r7._wobbleXYIntensity = r9
            float r9 = r8._wobbleRotationIntensity
            r7._wobbleRotationIntensity = r9
            float r9 = r8._wobbleSpeed
            r7._wobbleSpeed = r9
            if (r10 == 0) goto L109
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r9 = r8._cameraFigureLockBundles
            if (r9 == 0) goto Lb8
            int r9 = r9.size()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r9)
            r7._cameraFigureLockBundles = r10
            org.fortheloss.sticknodes.data.FrameData r10 = r7._frameDataRef
            java.util.ArrayList r10 = r10.getDrawableFigures()
            r0 = 0
        L74:
            if (r0 >= r9) goto Lb8
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r3 = new org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r4 = r8._cameraFigureLockBundles
            java.lang.Object r4 = r4.get(r0)
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r4 = (org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle) r4
            r3.<init>(r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r4 = r7._cameraFigureLockBundles
            r4.add(r3)
            int r4 = r10.size()
            int r4 = r4 - r2
        L8d:
            if (r4 < 0) goto Lb5
            java.lang.Object r5 = r10.get(r4)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r5 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r5
            int r5 = r5.getID()
            int r6 = r3.getFigureID()
            if (r5 != r6) goto Lb2
            java.lang.Object r4 = r10.get(r4)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            boolean r3 = r3.getFigureWillRotateAndScale()
            if (r3 == 0) goto Lad
            r3 = 2
            goto Lae
        Lad:
            r3 = 1
        Lae:
            r4.flagLockedToCamera(r3)
            goto Lb5
        Lb2:
            int r4 = r4 + (-1)
            goto L8d
        Lb5:
            int r0 = r0 + 1
            goto L74
        Lb8:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle> r9 = r8._cameraTextfieldLockBundles
            if (r9 == 0) goto L109
            int r9 = r9.size()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r9)
            r7._cameraTextfieldLockBundles = r10
            org.fortheloss.sticknodes.data.FrameData r10 = r7._frameDataRef
            java.util.ArrayList r10 = r10.getTextfieldBoxes()
            r0 = 0
        Lce:
            if (r0 >= r9) goto L109
            org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle r3 = new org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle> r4 = r8._cameraTextfieldLockBundles
            java.lang.Object r4 = r4.get(r0)
            org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle r4 = (org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle) r4
            r3.<init>(r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle> r4 = r7._cameraTextfieldLockBundles
            r4.add(r3)
            int r4 = r10.size()
            int r4 = r4 - r2
        Le7:
            if (r4 < 0) goto L106
            java.lang.Object r5 = r10.get(r4)
            org.fortheloss.sticknodes.TextfieldBox r5 = (org.fortheloss.sticknodes.TextfieldBox) r5
            int r5 = r5.getID()
            int r6 = r3.getTextfieldID()
            if (r5 != r6) goto L103
            java.lang.Object r3 = r10.get(r4)
            org.fortheloss.sticknodes.TextfieldBox r3 = (org.fortheloss.sticknodes.TextfieldBox) r3
            r3.setLockedToCamera(r2)
            goto L106
        L103:
            int r4 = r4 + (-1)
            goto Le7
        L106:
            int r0 = r0 + 1
            goto Lce
        L109:
            r7._isAutoCamera = r1
            return
    }

    public FrameCamera(org.fortheloss.sticknodes.data.FrameData r3) {
            r2 = this;
            r2.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r2._cameraScale = r0
            r0 = 0
            r2._cameraOffsetX = r0
            r2._cameraOffsetY = r0
            r2._rotationDeg = r0
            r1 = 0
            r2._isWidescreen = r1
            r2._isAutoCamera = r1
            r2._isWobblingXY = r1
            r2._isWobblingRotation = r1
            r1 = 1
            r2._wobbleScaleEnabled = r1
            r1 = 1077936128(0x40400000, float:3.0)
            r2._wobbleSpeed = r1
            r1 = 8
            r2._wobbleXYIntensity = r1
            r1 = 1056964608(0x3f000000, float:0.5)
            r2._wobbleRotationIntensity = r1
            r2._beforeWobbleCamX = r0
            r2._beforeWobbleCamY = r0
            r2._beforeWobbleCamScale = r0
            r2._beforeWobbleCamRotationDeg = r0
            r2._frameDataRef = r3
            return
    }

    public static void draw(org.fortheloss.sticknodes.SNShapeRenderer r33, float r34, float r35, float r36, float r37, float r38, boolean r39, boolean r40, boolean r41, boolean r42) {
            r9 = r33
            java.lang.Class<com.badlogic.gdx.graphics.Color> r10 = com.badlogic.gdx.graphics.Color.class
            float r0 = r34 + r36
            r11 = 1065353216(0x3f800000, float:1.0)
            float r12 = r0 + r11
            float r0 = r35 + r37
            float r13 = r0 + r11
            r0 = 1056964608(0x3f000000, float:0.5)
            float r14 = r36 * r0
            float r15 = r37 * r0
            r8 = 5
            r16 = 1124335616(0x43040000, float:132.0)
            r7 = 6
            r17 = 1070537376(0x3fcf1aa0, float:1.618)
            r6 = 3
            r18 = 1059816735(0x3f2b851f, float:0.67)
            r19 = 1051260355(0x3ea8f5c3, float:0.33)
            r5 = 4
            r4 = 2
            r20 = 0
            r3 = 1
            if (r39 == 0) goto L2f7
            com.badlogic.gdx.graphics.Color r0 = com.badlogic.gdx.graphics.Color.RED
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.MAGENTA
            com.badlogic.gdx.graphics.Color r2 = com.badlogic.gdx.graphics.Color.GREEN
            com.badlogic.gdx.graphics.Color r21 = com.badlogic.gdx.graphics.Color.BLUE
            if (r40 == 0) goto L40
            com.badlogic.gdx.graphics.Color r0 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.DARK_GRAY
            r22 = r0
            r23 = r22
            r21 = r1
            r24 = r21
            goto L46
        L40:
            r23 = r0
            r22 = r1
            r24 = r2
        L46:
            float r25 = r36 + r11
            float r26 = r37 + r11
            r0 = r33
            r1 = r34
            r2 = r35
            r11 = 1
            r3 = r25
            r4 = r26
            r5 = r23
            r6 = r21
            r7 = r22
            r8 = r24
            r0.rect(r1, r2, r3, r4, r5, r6, r7, r8)
            byte r0 = org.fortheloss.sticknodes.animationscreen.FrameCamera.cameraMode
            if (r0 != 0) goto La4
            r0 = r33
            r1 = r34
            r2 = r35
            r3 = r12
            r4 = r13
            r5 = r23
            r6 = r22
            r0.line(r1, r2, r3, r4, r5, r6)
            r2 = r13
            r4 = r35
            r5 = r24
            r6 = r21
            r0.line(r1, r2, r3, r4, r5, r6)
            float r7 = r35 + r15
            r2 = r7
            r4 = r7
            r5 = r23
            r6 = r22
            r0.line(r1, r2, r3, r4, r5, r6)
            float r8 = r34 + r14
            r1 = r8
            r2 = r35
            r3 = r8
            r4 = r13
            r5 = r21
            r6 = r24
            r0.line(r1, r2, r3, r4, r5, r6)
            com.badlogic.gdx.graphics.Color r0 = com.badlogic.gdx.graphics.Color.DARK_GRAY
            r9.setColor(r0)
            r0 = 1031798784(0x3d800000, float:0.0625)
            float r0 = r0 * r36
            r9.circle(r8, r7, r0)
            goto L2a5
        La4:
            if (r0 != r11) goto Le6
            float r0 = r36 * r19
            float r3 = r34 + r0
            r0 = r33
            r1 = r3
            r2 = r35
            r4 = r13
            r5 = r23
            r6 = r22
            r0.line(r1, r2, r3, r4, r5, r6)
            float r0 = r36 * r18
            float r3 = r34 + r0
            r0 = r33
            r1 = r3
            r5 = r24
            r6 = r21
            r0.line(r1, r2, r3, r4, r5, r6)
            float r0 = r37 * r19
            float r4 = r35 + r0
            r0 = r33
            r1 = r34
            r2 = r4
            r3 = r12
            r5 = r22
            r6 = r23
            r0.line(r1, r2, r3, r4, r5, r6)
            float r0 = r37 * r18
            float r4 = r35 + r0
            r0 = r33
            r2 = r4
            r5 = r21
            r6 = r24
            r0.line(r1, r2, r3, r4, r5, r6)
            goto L2a5
        Le6:
            r14 = 2
            if (r0 != r14) goto L123
            float r0 = r36 / r17
            float r7 = r37 / r17
            float r8 = r36 - r0
            float r10 = r37 - r7
            float r3 = r34 + r0
            r0 = r33
            r1 = r3
            r2 = r35
            r4 = r13
            r5 = r23
            r6 = r22
            r0.line(r1, r2, r3, r4, r5, r6)
            float r3 = r34 + r8
            r1 = r3
            r5 = r24
            r6 = r21
            r0.line(r1, r2, r3, r4, r5, r6)
            float r4 = r35 + r7
            r1 = r34
            r2 = r4
            r3 = r12
            r5 = r22
            r6 = r23
            r0.line(r1, r2, r3, r4, r5, r6)
            float r4 = r35 + r10
            r2 = r4
            r5 = r21
            r6 = r24
            r0.line(r1, r2, r3, r4, r5, r6)
            goto L2a5
        L123:
            java.lang.Class<java.util.ArrayList> r0 = java.util.ArrayList.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            r7 = r0
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            byte r0 = org.fortheloss.sticknodes.animationscreen.FrameCamera.cameraMode
            r15 = 3
            r8 = 4
            if (r0 == r15) goto L137
            if (r0 != r8) goto L135
            goto L137
        L135:
            r3 = 0
            goto L138
        L137:
            r3 = 1
        L138:
            if (r0 == r8) goto L140
            r6 = 6
            if (r0 != r6) goto L13e
            goto L140
        L13e:
            r0 = 0
            goto L141
        L140:
            r0 = 1
        L141:
            if (r3 == 0) goto L151
            if (r0 == 0) goto L14b
            r2 = r34
            r5 = r35
            r4 = r12
            goto L158
        L14b:
            r2 = r34
            r3 = r35
            r4 = r12
            goto L15f
        L151:
            if (r0 == 0) goto L15a
            r4 = r34
            r5 = r35
            r2 = r12
        L158:
            r3 = r13
            goto L160
        L15a:
            r4 = r34
            r3 = r35
            r2 = r12
        L15f:
            r5 = r13
        L160:
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r7.add(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            r7.add(r0)
            r6 = 1
            r0 = r7
            r1 = r33
            drawPhiLines(r0, r1, r2, r3, r4, r5, r6)
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "- - - - -"
            r0.println(r1)
            int r8 = r7.size()
            r0 = 0
            r3 = 1
        L182:
            if (r14 >= r8) goto L29f
            int r1 = r14 + (-2)
            java.lang.Object r1 = r7.get(r1)
            java.lang.Float r1 = (java.lang.Float) r1
            float r17 = r1.floatValue()
            int r1 = r14 + (-1)
            java.lang.Object r1 = r7.get(r1)
            java.lang.Float r1 = (java.lang.Float) r1
            float r18 = r1.floatValue()
            java.lang.Object r1 = r7.get(r14)
            java.lang.Float r1 = (java.lang.Float) r1
            float r19 = r1.floatValue()
            int r1 = r14 + 1
            java.lang.Object r1 = r7.get(r1)
            java.lang.Float r1 = (java.lang.Float) r1
            float r21 = r1.floatValue()
            float r1 = r19 - r17
            r2 = 1031610879(0x3d7d21ff, float:0.0618)
            float r4 = r1 * r2
            float r5 = r17 + r4
            float r6 = r21 - r18
            float r2 = r2 * r6
            float r22 = r21 - r2
            r11 = -1
            if (r3 != r11) goto L1c8
            float r5 = r19 - r4
            float r22 = r18 + r2
        L1c8:
            r11 = r5
            int r24 = r3 * (-1)
            float r1 = r1 * r1
            float r6 = r6 * r6
            float r1 = r1 + r6
            double r1 = (double) r1
            double r1 = java.lang.Math.cbrt(r1)
            int r1 = (int) r1
            r2 = 20
            int r1 = com.badlogic.gdx.math.MathUtils.clamp(r1, r15, r2)
            r6 = 5
            int r5 = r1 * 5
            java.util.ArrayList<com.badlogic.gdx.graphics.Color> r1 = org.fortheloss.sticknodes.animationscreen.FrameCamera.cameraColors
            java.lang.Object r1 = r1.get(r0)
            r4 = r1
            com.badlogic.gdx.graphics.Color r4 = (com.badlogic.gdx.graphics.Color) r4
            java.util.ArrayList<com.badlogic.gdx.graphics.Color> r1 = org.fortheloss.sticknodes.animationscreen.FrameCamera.cameraColors
            int r2 = r1.size()
            r3 = 1
            int r2 = r2 - r3
            if (r0 != r2) goto L1f4
            r2 = 0
            goto L1f6
        L1f4:
            int r2 = r0 + 1
        L1f6:
            java.lang.Object r1 = r1.get(r2)
            r3 = r1
            com.badlogic.gdx.graphics.Color r3 = (com.badlogic.gdx.graphics.Color) r3
            int r0 = r0 + 1
            java.util.ArrayList<com.badlogic.gdx.graphics.Color> r1 = org.fortheloss.sticknodes.animationscreen.FrameCamera.cameraColors
            int r1 = r1.size()
            if (r0 < r1) goto L20a
            r25 = 0
            goto L20c
        L20a:
            r25 = r0
        L20c:
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r10)
            r2 = r0
            com.badlogic.gdx.graphics.Color r2 = (com.badlogic.gdx.graphics.Color) r2
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r10)
            r1 = r0
            com.badlogic.gdx.graphics.Color r1 = (com.badlogic.gdx.graphics.Color) r1
            r2.set(r4)
            r1.set(r4)
            r26 = r17
            r27 = r18
            r0 = 1
        L225:
            if (r0 > r5) goto L288
            float r6 = (float) r0
            float r15 = (float) r5
            float r6 = r6 / r15
            r15 = 1065353216(0x3f800000, float:1.0)
            float r28 = r15 - r6
            float r15 = r28 * r28
            float r29 = r15 * r17
            r30 = 1073741824(0x40000000, float:2.0)
            float r28 = r28 * r30
            float r28 = r28 * r6
            float r30 = r28 * r11
            float r29 = r29 + r30
            float r30 = r6 * r6
            float r31 = r30 * r19
            float r29 = r29 + r31
            float r15 = r15 * r18
            float r28 = r28 * r22
            float r15 = r15 + r28
            float r30 = r30 * r21
            float r15 = r15 + r30
            r1.set(r2)
            r28 = r0
            com.badlogic.gdx.graphics.Color r0 = r2.set(r4)
            r0.lerp(r3, r6)
            r0 = r33
            r30 = r1
            r1 = r26
            r26 = r2
            r2 = r27
            r27 = r3
            r3 = r29
            r31 = r4
            r4 = r15
            r32 = r5
            r5 = r30
            r9 = 5
            r6 = r26
            r0.line(r1, r2, r3, r4, r5, r6)
            int r0 = r28 + 1
            r2 = r26
            r3 = r27
            r26 = r29
            r1 = r30
            r4 = r31
            r5 = r32
            r6 = 5
            r9 = r33
            r27 = r15
            r15 = 3
            goto L225
        L288:
            r30 = r1
            r26 = r2
            r9 = 5
            com.badlogic.gdx.utils.Pools.free(r26)
            com.badlogic.gdx.utils.Pools.free(r30)
            int r14 = r14 + 2
            r3 = r24
            r0 = r25
            r11 = 1
            r15 = 3
            r9 = r33
            goto L182
        L29f:
            r7.clear()
            com.badlogic.gdx.utils.Pools.free(r7)
        L2a5:
            if (r41 == 0) goto L40a
            if (r42 != 0) goto L40a
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r16
            float r0 = r0 * r38
            float r1 = r35 + r0
            float r0 = r13 - r0
            if (r40 == 0) goto L2d1
            com.badlogic.gdx.graphics.Color r2 = com.badlogic.gdx.graphics.Color.DARK_GRAY
            r35 = r33
            r36 = r34
            r37 = r1
            r38 = r12
            r39 = r1
            r40 = r2
            r41 = r2
            r35.line(r36, r37, r38, r39, r40, r41)
            r37 = r0
            r39 = r0
            r35.line(r36, r37, r38, r39, r40, r41)
            goto L40a
        L2d1:
            com.badlogic.gdx.graphics.Color r2 = com.badlogic.gdx.graphics.Color.RED
            com.badlogic.gdx.graphics.Color r3 = com.badlogic.gdx.graphics.Color.BLUE
            r35 = r33
            r36 = r34
            r37 = r1
            r38 = r12
            r39 = r1
            r40 = r2
            r41 = r3
            r35.line(r36, r37, r38, r39, r40, r41)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.GREEN
            com.badlogic.gdx.graphics.Color r2 = com.badlogic.gdx.graphics.Color.MAGENTA
            r37 = r0
            r39 = r0
            r40 = r1
            r41 = r2
            r35.line(r36, r37, r38, r39, r40, r41)
            goto L40a
        L2f7:
            r0 = 1065353216(0x3f800000, float:1.0)
            r6 = 6
            r8 = 4
            r9 = 5
            r14 = 2
            float r3 = r36 + r0
            float r4 = r37 + r0
            com.badlogic.gdx.graphics.Color r10 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY
            com.badlogic.gdx.graphics.Color r11 = com.badlogic.gdx.graphics.Color.DARK_GRAY
            r0 = r33
            r1 = r34
            r2 = r35
            r5 = r10
            r15 = 6
            r6 = r11
            r7 = r10
            r15 = 4
            r8 = r11
            r0.rect(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r41 == 0) goto L334
            if (r42 != 0) goto L334
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r16
            float r0 = r0 * r38
            float r4 = r35 + r0
            float r7 = r13 - r0
            r0 = r33
            r1 = r34
            r2 = r4
            r3 = r12
            r5 = r10
            r6 = r11
            r0.line(r1, r2, r3, r4, r5, r6)
            r2 = r7
            r4 = r7
            r5 = r11
            r6 = r10
            r0.line(r1, r2, r3, r4, r5, r6)
        L334:
            byte r0 = org.fortheloss.sticknodes.animationscreen.FrameCamera.cameraMode
            r1 = 1
            if (r0 != r1) goto L378
            float r0 = r36 * r19
            float r3 = r34 + r0
            r0 = r33
            r1 = r3
            r2 = r35
            r4 = r13
            r5 = r10
            r6 = r11
            r0.line(r1, r2, r3, r4, r5, r6)
            float r0 = r36 * r18
            float r3 = r34 + r0
            r0 = r33
            r1 = r3
            r0.line(r1, r2, r3, r4, r5, r6)
            float r0 = r37 * r19
            float r4 = r35 + r0
            r0 = r33
            r1 = r34
            r2 = r4
            r3 = r12
            r5 = r11
            r6 = r10
            r0.line(r1, r2, r3, r4, r5, r6)
            float r0 = r37 * r18
            float r0 = r35 + r0
            r35 = r33
            r36 = r34
            r37 = r0
            r38 = r12
            r39 = r0
            r40 = r11
            r41 = r10
            r35.line(r36, r37, r38, r39, r40, r41)
            goto L40a
        L378:
            if (r0 != r14) goto L3c3
            float r0 = r36 / r17
            float r1 = r37 / r17
            float r2 = r36 - r0
            float r3 = r37 - r1
            float r0 = r34 + r0
            r36 = r33
            r37 = r0
            r38 = r35
            r39 = r0
            r40 = r13
            r41 = r10
            r42 = r11
            r36.line(r37, r38, r39, r40, r41, r42)
            float r0 = r34 + r2
            r37 = r0
            r39 = r0
            r36.line(r37, r38, r39, r40, r41, r42)
            float r0 = r35 + r1
            r37 = r34
            r38 = r0
            r39 = r12
            r40 = r0
            r41 = r11
            r42 = r10
            r36.line(r37, r38, r39, r40, r41, r42)
            float r0 = r35 + r3
            r35 = r33
            r36 = r34
            r37 = r0
            r38 = r12
            r39 = r0
            r40 = r11
            r41 = r10
            r35.line(r36, r37, r38, r39, r40, r41)
            goto L40a
        L3c3:
            r2 = 3
            if (r0 == r2) goto L3cd
            if (r0 == r15) goto L3cd
            if (r0 == r9) goto L3cd
            r3 = 6
            if (r0 != r3) goto L40a
        L3cd:
            if (r0 == r2) goto L3d4
            if (r0 != r15) goto L3d2
            goto L3d4
        L3d2:
            r3 = 0
            goto L3d5
        L3d4:
            r3 = 1
        L3d5:
            if (r0 == r15) goto L3da
            r2 = 6
            if (r0 != r2) goto L3dc
        L3da:
            r20 = 1
        L3dc:
            if (r3 == 0) goto L3eb
            if (r20 == 0) goto L3e6
            r1 = r35
            r0 = r12
            r12 = r34
            goto L3f7
        L3e6:
            r0 = r12
            r1 = r13
            r12 = r34
            goto L3f5
        L3eb:
            if (r20 == 0) goto L3f2
            r0 = r34
            r1 = r35
            goto L3f7
        L3f2:
            r0 = r34
            r1 = r13
        L3f5:
            r13 = r35
        L3f7:
            r2 = 0
            r3 = 1
            r34 = r2
            r35 = r33
            r36 = r12
            r37 = r13
            r38 = r0
            r39 = r1
            r40 = r3
            drawPhiLines(r34, r35, r36, r37, r38, r39, r40)
        L40a:
            return
    }

    private static void drawPhiLines(java.util.ArrayList<java.lang.Float> r9, org.fortheloss.sticknodes.SNShapeRenderer r10, float r11, float r12, float r13, float r14, boolean r15) {
            float r0 = r13 - r11
            float r1 = r14 - r12
            r2 = -1
            r3 = 1
            r4 = 0
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 >= 0) goto Ld
            r5 = -1
            goto Le
        Ld:
            r5 = 1
        Le:
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 >= 0) goto L13
            goto L14
        L13:
            r2 = 1
        L14:
            float r0 = java.lang.Math.abs(r0)
            float r1 = java.lang.Math.abs(r1)
            r3 = 1092616192(0x41200000, float:10.0)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 < 0) goto L84
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L28
            goto L84
        L28:
            r3 = 1070537376(0x3fcf1aa0, float:1.618)
            if (r15 == 0) goto L59
            float r0 = r0 / r3
            float r15 = (float) r5
            float r0 = r0 * r15
            float r11 = r11 + r0
            if (r9 == 0) goto L42
            java.lang.Float r15 = java.lang.Float.valueOf(r11)
            r9.add(r15)
            java.lang.Float r15 = java.lang.Float.valueOf(r14)
            r9.add(r15)
        L42:
            com.badlogic.gdx.graphics.Color r6 = com.badlogic.gdx.graphics.Color.DARK_GRAY
            com.badlogic.gdx.graphics.Color r7 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r11
            r5 = r14
            r1.line(r2, r3, r4, r5, r6, r7)
            r7 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r14
            r5 = r13
            r6 = r12
            drawPhiLines(r1, r2, r3, r4, r5, r6, r7)
            goto L84
        L59:
            float r1 = r1 / r3
            float r15 = (float) r2
            float r1 = r1 * r15
            float r12 = r12 + r1
            if (r9 == 0) goto L6e
            java.lang.Float r15 = java.lang.Float.valueOf(r13)
            r9.add(r15)
            java.lang.Float r15 = java.lang.Float.valueOf(r12)
            r9.add(r15)
        L6e:
            com.badlogic.gdx.graphics.Color r7 = com.badlogic.gdx.graphics.Color.DARK_GRAY
            com.badlogic.gdx.graphics.Color r8 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r12
            r2.line(r3, r4, r5, r6, r7, r8)
            r8 = 1
            r2 = r9
            r3 = r10
            r4 = r13
            r5 = r12
            r6 = r11
            r7 = r14
            drawPhiLines(r2, r3, r4, r5, r6, r7, r8)
        L84:
            return
    }

    public static byte getMode() {
            byte r0 = org.fortheloss.sticknodes.animationscreen.FrameCamera.cameraMode
            return r0
    }

    public static void setMode(byte r0) {
            org.fortheloss.sticknodes.animationscreen.FrameCamera.cameraMode = r0
            return
    }

    public static void setSimplexNoise(float[] r0, float[] r1, float[] r2) {
            org.fortheloss.sticknodes.animationscreen.FrameCamera.perlinX = r0
            org.fortheloss.sticknodes.animationscreen.FrameCamera.perlinY = r1
            org.fortheloss.sticknodes.animationscreen.FrameCamera.perlinRotation = r2
            int r0 = r0.length
            org.fortheloss.sticknodes.animationscreen.FrameCamera.perlinLength = r0
            r0 = 200(0xc8, float:2.8E-43)
            org.fortheloss.sticknodes.animationscreen.FrameCamera.perlinIndex = r0
            return
    }

    private void updateLockedFigurePositions(java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r17, java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r18, boolean r19) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r3 = r0._cameraFigureLockBundles
            if (r3 != 0) goto Lf
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle> r4 = r0._cameraTextfieldLockBundles
            if (r4 != 0) goto Lf
            return
        Lf:
            float r4 = r0._cameraOffsetX
            r5 = 1156579328(0x44f00000, float:1920.0)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r6
            float r7 = r0._cameraScale
            float r5 = r5 * r7
            r8 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r8
            float r4 = r4 + r5
            float r5 = r0._cameraOffsetY
            r9 = 1149698048(0x44870000, float:1080.0)
            float r6 = r6 * r9
            float r6 = r6 * r7
            float r6 = r6 * r8
            float r5 = r5 + r6
            r6 = 1
            if (r3 == 0) goto L13f
            if (r1 == 0) goto L13f
            int r3 = r3.size()
            int r3 = r3 - r6
        L35:
            if (r3 < 0) goto L13f
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r7 = r0._cameraFigureLockBundles
            java.lang.Object r7 = r7.get(r3)
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r7 = (org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle) r7
            int r9 = r17.size()
            int r9 = r9 - r6
        L44:
            if (r9 < 0) goto L13b
            java.lang.Object r10 = r1.get(r9)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r10 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r10
            int r11 = r10.getID()
            int r12 = r7.getFigureID()
            if (r11 != r12) goto L137
            boolean r9 = r7.getFigureWillRotateAndScale()
            if (r9 == 0) goto Lee
            float r9 = r7.getCamStartScale()
            float r11 = r7.getFigureStartScale()
            float r9 = r9 / r11
            float r11 = r16.getCameraScale()
            float r11 = r11 / r9
            float r9 = r7.getFigureStartScale()
            float r11 = r11 - r9
            float r9 = r7.getParallax()
            float r11 = r11 * r9
            float r9 = r7.getFigureStartScale()
            float r9 = r9 + r11
            boolean r11 = r10 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r11 == 0) goto L8d
            r11 = r10
            org.fortheloss.sticknodes.sprite.SpriteRef r11 = (org.fortheloss.sticknodes.sprite.SpriteRef) r11
            r11.setScaleX(r9, r6)
            float r9 = r11.getScaleX()
            float r11 = r7.getFigureStartScale()
            goto L98
        L8d:
            r10.setScale(r9)
            float r9 = r10.getScale()
            float r11 = r7.getFigureStartScale()
        L98:
            float r9 = r9 / r11
            float r11 = r0._rotationDeg
            float r12 = r7.getRotationOffset()
            float r11 = r11 + r12
            r10.setFigureRotation(r11)
            float r11 = r0._rotationDeg
            float r12 = r7.getDistanceAngleOffset()
            float r11 = r11 + r12
            float r12 = com.badlogic.gdx.math.MathUtils.cosDeg(r11)
            float r13 = r7.getDistanceToStickfigure()
            float r12 = r12 * r13
            float r11 = com.badlogic.gdx.math.MathUtils.sinDeg(r11)
            float r13 = r7.getDistanceToStickfigure()
            float r11 = r11 * r13
            float r13 = r7.getCamStartX()
            float r13 = r4 - r13
            float r14 = r7.getCamStartY()
            float r14 = r5 - r14
            float r12 = r12 * r9
            float r12 = r12 + r4
            float r15 = r7.getParallax()
            float r15 = r15 * r13
            float r15 = r15 - r13
            float r12 = r12 + r15
            float r11 = r11 * r9
            float r11 = r11 + r5
            float r7 = r7.getParallax()
            float r7 = r7 * r14
            float r7 = r7 - r14
            float r11 = r11 + r7
            boolean r7 = r10 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r7 == 0) goto Lea
            r7 = r10
            org.fortheloss.sticknodes.stickfigure.Stickfigure r7 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r7
            r7.unlockStickNode()
        Lea:
            r10.setPosition(r12, r11)
            goto L13b
        Lee:
            float r9 = r7.getCamStartRotation()
            float r11 = r7.getDistanceAngleOffset()
            float r9 = r9 + r11
            float r11 = com.badlogic.gdx.math.MathUtils.cosDeg(r9)
            float r12 = r7.getDistanceToStickfigure()
            float r11 = r11 * r12
            float r9 = com.badlogic.gdx.math.MathUtils.sinDeg(r9)
            float r12 = r7.getDistanceToStickfigure()
            float r9 = r9 * r12
            float r12 = r7.getCamStartX()
            float r12 = r4 - r12
            float r13 = r7.getCamStartY()
            float r13 = r5 - r13
            float r11 = r11 + r4
            float r14 = r7.getParallax()
            float r14 = r14 * r12
            float r14 = r14 - r12
            float r11 = r11 + r14
            float r9 = r9 + r5
            float r7 = r7.getParallax()
            float r7 = r7 * r13
            float r7 = r7 - r13
            float r9 = r9 + r7
            boolean r7 = r10 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r7 == 0) goto L133
            r7 = r10
            org.fortheloss.sticknodes.stickfigure.Stickfigure r7 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r7
            r7.unlockStickNode()
        L133:
            r10.setPosition(r11, r9)
            goto L13b
        L137:
            int r9 = r9 + (-1)
            goto L44
        L13b:
            int r3 = r3 + (-1)
            goto L35
        L13f:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle> r1 = r0._cameraTextfieldLockBundles
            if (r1 == 0) goto L1e2
            if (r2 == 0) goto L1e2
            int r1 = r1.size()
            int r1 = r1 - r6
        L14a:
            if (r1 < 0) goto L1e2
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle> r3 = r0._cameraTextfieldLockBundles
            java.lang.Object r3 = r3.get(r1)
            org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle r3 = (org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle) r3
            int r7 = r18.size()
            int r7 = r7 - r6
        L159:
            if (r7 < 0) goto L1de
            java.lang.Object r9 = r2.get(r7)
            org.fortheloss.sticknodes.TextfieldBox r9 = (org.fortheloss.sticknodes.TextfieldBox) r9
            int r10 = r9.getID()
            int r11 = r3.getTextfieldID()
            if (r10 != r11) goto L1da
            float r7 = r3.getCamStartScale()
            float r10 = r3.getTextfieldStartScale()
            float r7 = r7 / r10
            float r10 = r16.getCameraScale()
            float r10 = r10 / r7
            float r7 = r3.getTextfieldStartScale()
            float r10 = r10 - r7
            r7 = 1008981770(0x3c23d70a, float:0.01)
            float r11 = r3.getTextfieldStartScale()
            float r11 = r11 + r10
            float r7 = java.lang.Math.max(r7, r11)
            float r10 = r3.getTextfieldStartScale()
            float r10 = r7 / r10
            float r11 = r0._rotationDeg
            float r12 = r3.getRotationOffset()
            float r11 = r11 + r12
            float r12 = r0._rotationDeg
            float r13 = r3.getDistanceAngleOffset()
            float r12 = r12 + r13
            float r13 = com.badlogic.gdx.math.MathUtils.cosDeg(r12)
            float r14 = r3.getDistanceToTextfield()
            float r13 = r13 * r14
            float r12 = com.badlogic.gdx.math.MathUtils.sinDeg(r12)
            float r3 = r3.getDistanceToTextfield()
            float r12 = r12 * r3
            float r13 = r13 * r10
            float r13 = r13 + r4
            float r12 = r12 * r10
            float r12 = r12 + r5
            float r3 = r9.getWidth()
            float r3 = r3 * r7
            float r3 = r3 * r8
            float r13 = r13 - r3
            float r3 = r9.getHeight()
            float r3 = r3 * r7
            float r3 = r3 * r8
            float r12 = r12 + r3
            if (r19 != 0) goto L1d6
            r9.setScale(r7)
            r9.setFigureRotation(r11)
            r9.setPosition(r13, r12)
            goto L1de
        L1d6:
            r9.setTweenedValues(r13, r12, r7, r11)
            goto L1de
        L1da:
            int r7 = r7 + (-1)
            goto L159
        L1de:
            int r1 = r1 + (-1)
            goto L14a
        L1e2:
            return
    }

    public void addLockedFigure(int r17, int r18, int r19, float r20, float r21, float r22, float r23, float r24, float r25, float r26, float r27, float r28, boolean r29) {
            r16 = this;
            r0 = r16
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r1 = r0._cameraFigureLockBundles
            if (r1 != 0) goto Ld
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0._cameraFigureLockBundles = r1
        Ld:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r1 = r0._cameraFigureLockBundles
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r15 = new org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle
            r2 = r15
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r13 = r27
            r14 = r28
            r0 = r15
            r15 = r29
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.add(r0)
            r0 = r16
            org.fortheloss.sticknodes.data.FrameData r1 = r0._frameDataRef
            java.util.ArrayList r1 = r1.getDrawableFigures()
            int r2 = r1.size()
            r3 = 1
            int r2 = r2 - r3
        L41:
            if (r2 < 0) goto L61
            java.lang.Object r4 = r1.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            int r4 = r4.getID()
            r5 = r17
            if (r4 != r5) goto L5e
            java.lang.Object r1 = r1.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            if (r29 == 0) goto L5a
            r3 = 2
        L5a:
            r1.flagLockedToCamera(r3)
            goto L61
        L5e:
            int r2 = r2 + (-1)
            goto L41
        L61:
            return
    }

    public void addLockedFigure(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r17) {
            r16 = this;
            r14 = r16
            r0 = r17
            float r1 = r14._cameraOffsetX
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1156579328(0x44f00000, float:1920.0)
            float r3 = r3 * r2
            float r4 = r14._cameraScale
            float r3 = r3 * r4
            r5 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r5
            float r6 = r1 + r3
            float r1 = r14._cameraOffsetY
            r3 = 1149698048(0x44870000, float:1080.0)
            float r2 = r2 * r3
            float r2 = r2 * r4
            float r2 = r2 * r5
            float r5 = r1 + r2
            int r1 = r17.getID()
            int r2 = r17.getLibraryID()
            boolean r3 = r0 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r3 == 0) goto L30
            r4 = 2
            goto L37
        L30:
            boolean r4 = r0 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r4 == 0) goto L36
            r4 = 1
            goto L37
        L36:
            r4 = 0
        L37:
            float r7 = r17.getX()
            float r7 = r7 - r6
            float r8 = r17.getY()
            float r8 = r8 - r5
            float r9 = r7 * r7
            float r10 = r8 * r8
            float r9 = r9 + r10
            double r9 = (double) r9
            double r9 = java.lang.Math.sqrt(r9)
            float r9 = (float) r9
            double r10 = (double) r8
            double r7 = (double) r7
            double r7 = java.lang.Math.atan2(r10, r7)
            float r7 = (float) r7
            r8 = 1113927392(0x42652ee0, float:57.295776)
            float r7 = r7 * r8
            float r8 = r14._rotationDeg
            float r10 = r7 - r8
            float r7 = r17.getRotation()
            float r8 = r14._rotationDeg
            float r11 = r7 - r8
            if (r3 == 0) goto L6d
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = (org.fortheloss.sticknodes.sprite.SpriteRef) r0
            float r0 = r0.getScaleX()
            goto L71
        L6d:
            float r0 = r17.getScale()
        L71:
            r12 = r0
            float r7 = r14._cameraScale
            float r8 = r14._rotationDeg
            r13 = 1065353216(0x3f800000, float:1.0)
            r15 = 0
            r0 = r16
            r3 = r4
            r4 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r15
            r0.addLockedFigure(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
    }

    public void addLockedTextfield(int r14, float r15, float r16, float r17, float r18, float r19, float r20, float r21, float r22) {
            r13 = this;
            r0 = r13
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle> r1 = r0._cameraTextfieldLockBundles
            if (r1 != 0) goto Lc
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0._cameraTextfieldLockBundles = r1
        Lc:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle> r1 = r0._cameraTextfieldLockBundles
            org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle r12 = new org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle
            r2 = r12
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1.add(r12)
            org.fortheloss.sticknodes.data.FrameData r1 = r0._frameDataRef
            java.util.ArrayList r1 = r1.getTextfieldBoxes()
            int r2 = r1.size()
            r3 = 1
            int r2 = r2 - r3
        L33:
            if (r2 < 0) goto L4f
            java.lang.Object r4 = r1.get(r2)
            org.fortheloss.sticknodes.TextfieldBox r4 = (org.fortheloss.sticknodes.TextfieldBox) r4
            int r4 = r4.getID()
            r5 = r14
            if (r4 != r5) goto L4c
            java.lang.Object r1 = r1.get(r2)
            org.fortheloss.sticknodes.TextfieldBox r1 = (org.fortheloss.sticknodes.TextfieldBox) r1
            r1.setLockedToCamera(r3)
            goto L4f
        L4c:
            int r2 = r2 + (-1)
            goto L33
        L4f:
            return
    }

    public void addLockedTextfield(org.fortheloss.sticknodes.TextfieldBox r11) {
            r10 = this;
            float r0 = r10._cameraOffsetX
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1156579328(0x44f00000, float:1920.0)
            float r2 = r2 * r1
            float r3 = r10._cameraScale
            float r2 = r2 * r3
            r4 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r4
            float r2 = r2 + r0
            float r0 = r10._cameraOffsetY
            r5 = 1149698048(0x44870000, float:1080.0)
            float r1 = r1 * r5
            float r1 = r1 * r3
            float r1 = r1 * r4
            float r3 = r0 + r1
            int r1 = r11.getID()
            float r9 = r11.getScale()
            float r0 = r11.getX()
            float r5 = r11.getWidth()
            float r5 = r5 * r9
            float r5 = r5 * r4
            float r0 = r0 + r5
            float r0 = r0 - r2
            float r5 = r11.getY()
            float r6 = r11.getHeight()
            float r6 = r6 * r9
            float r6 = r6 * r4
            float r5 = r5 - r6
            float r5 = r5 - r3
            float r4 = r0 * r0
            float r6 = r5 * r5
            float r4 = r4 + r6
            double r6 = (double) r4
            double r6 = java.lang.Math.sqrt(r6)
            float r6 = (float) r6
            double r4 = (double) r5
            double r7 = (double) r0
            double r4 = java.lang.Math.atan2(r4, r7)
            float r0 = (float) r4
            r4 = 1113927392(0x42652ee0, float:57.295776)
            float r0 = r0 * r4
            float r4 = r10._rotationDeg
            float r7 = r0 - r4
            float r0 = r11.getRotation()
            float r5 = r10._rotationDeg
            float r8 = r0 - r5
            float r4 = r10._cameraScale
            r0 = r10
            r0.addLockedTextfield(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public void applyMoveDuringDelay(org.fortheloss.sticknodes.animationscreen.FrameCamera r4, org.fortheloss.sticknodes.animationscreen.FrameCamera r5, float r6, com.badlogic.gdx.math.Interpolation r7, java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8, java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r9) {
            r3 = this;
            float r6 = r7.apply(r6)
            float r7 = r4._cameraOffsetX
            float r0 = r5.getCameraOffsetX()
            float r1 = r4._cameraOffsetX
            float r0 = r0 - r1
            float r0 = r0 * r6
            float r7 = r7 + r0
            r0 = 0
            r3.setCameraOffsetX(r7, r0)
            float r7 = r4._cameraOffsetY
            float r1 = r5.getCameraOffsetY()
            float r2 = r4._cameraOffsetY
            float r1 = r1 - r2
            float r1 = r1 * r6
            float r7 = r7 + r1
            r3.setCameraOffsetY(r7, r0)
            float r7 = r4._cameraScale
            float r1 = r5.getCameraScale()
            float r2 = r4._cameraScale
            float r1 = r1 - r2
            float r1 = r1 * r6
            float r7 = r7 + r1
            r3.setCameraScale(r7, r0)
            float r7 = r4._wobbleSpeed
            float r1 = r5.getWobbleSpeed()
            float r2 = r4._wobbleSpeed
            float r1 = r1 - r2
            float r1 = r1 * r6
            float r7 = r7 + r1
            r3.setWobbleSpeed(r7)
            int r7 = r4._wobbleXYIntensity
            float r7 = (float) r7
            int r1 = r5.getWobbleXYIntensity()
            int r2 = r4._wobbleXYIntensity
            int r1 = r1 - r2
            float r1 = (float) r1
            float r1 = r1 * r6
            float r7 = r7 + r1
            int r7 = (int) r7
            r3.setWobbleXYIntensity(r7)
            float r7 = r4._wobbleRotationIntensity
            float r1 = r5.getWobbleRotationIntensity()
            float r2 = r4._wobbleRotationIntensity
            float r1 = r1 - r2
            float r1 = r1 * r6
            float r7 = r7 + r1
            r3.setWobbleRotationIntensity(r7)
            float r7 = r4._rotationDeg
            float r5 = r5.getCameraRotationDeg()
            float r5 = r5 - r7
            r7 = 1127481344(0x43340000, float:180.0)
            float r5 = r5 + r7
            r1 = 1135869952(0x43b40000, float:360.0)
            float r5 = r5 % r1
            float r5 = r5 - r7
            r7 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 >= 0) goto L77
            float r5 = r5 + r1
        L77:
            float r4 = r4._rotationDeg
            float r5 = r5 * r6
            float r4 = r4 + r5
            r3.setCameraRotation(r4, r0)
            r3.updateLockedFigurePositions(r8, r9, r0)
            return
    }

    public boolean applyWobble(java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8, java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r9, boolean r10) {
            r7 = this;
            float r0 = r7.getCameraOffsetX()
            r7._beforeWobbleCamX = r0
            float r0 = r7.getCameraOffsetY()
            r7._beforeWobbleCamY = r0
            float r0 = r7.getCameraScale()
            r7._beforeWobbleCamScale = r0
            float r0 = r7.getCameraRotationDeg()
            r7._beforeWobbleCamRotationDeg = r0
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            boolean r1 = r7._wobbleScaleEnabled
            if (r1 == 0) goto L22
            float r1 = r7._cameraScale
            float r0 = r0 * r1
        L22:
            boolean r1 = r7._isWobblingXY
            if (r1 == 0) goto L4c
            float r1 = r7._cameraOffsetX
            float[] r2 = org.fortheloss.sticknodes.animationscreen.FrameCamera.perlinX
            int r3 = org.fortheloss.sticknodes.animationscreen.FrameCamera.perlinIndex
            r2 = r2[r3]
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r4
            int r5 = r7._wobbleXYIntensity
            float r6 = (float) r5
            float r2 = r2 * r6
            float r2 = r2 * r0
            float r1 = r1 + r2
            r7._cameraOffsetX = r1
            float r1 = r7._cameraOffsetY
            float[] r2 = org.fortheloss.sticknodes.animationscreen.FrameCamera.perlinY
            r2 = r2[r3]
            float r2 = r2 * r4
            float r3 = (float) r5
            float r2 = r2 * r3
            float r2 = r2 * r0
            float r1 = r1 + r2
            r7._cameraOffsetY = r1
        L4c:
            boolean r0 = r7._isWobblingRotation
            if (r0 == 0) goto L67
            float r0 = r7._rotationDeg
            float[] r1 = org.fortheloss.sticknodes.animationscreen.FrameCamera.perlinRotation
            int r2 = org.fortheloss.sticknodes.animationscreen.FrameCamera.perlinIndex
            r1 = r1[r2]
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r2
            float r2 = r7._wobbleRotationIntensity
            float r1 = r1 * r2
            float r2 = r7._cameraScale
            float r1 = r1 * r2
            float r0 = r0 + r1
            r7._rotationDeg = r0
        L67:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r0 = r7._cameraFigureLockBundles
            if (r0 != 0) goto L72
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle> r0 = r7._cameraTextfieldLockBundles
            if (r0 == 0) goto L70
            goto L72
        L70:
            r8 = 0
            return r8
        L72:
            r7.updateLockedFigurePositions(r8, r9, r10)
            r8 = 1
            return r8
    }

    public void copyFrom(org.fortheloss.sticknodes.animationscreen.FrameCamera r2, boolean r3) {
            r1 = this;
            boolean r0 = r1._isAutoCamera
            if (r0 != 0) goto L14
            float r0 = r2._cameraOffsetX
            r1._cameraOffsetX = r0
            float r0 = r2._cameraOffsetY
            r1._cameraOffsetY = r0
            float r0 = r2._cameraScale
            r1._cameraScale = r0
            float r0 = r2._rotationDeg
            r1._rotationDeg = r0
        L14:
            boolean r0 = r2._isWidescreen
            r1._isWidescreen = r0
            boolean r0 = r2._isWobblingXY
            r1._isWobblingXY = r0
            boolean r0 = r2._isWobblingRotation
            r1._isWobblingRotation = r0
            boolean r0 = r2._wobbleScaleEnabled
            r1._wobbleScaleEnabled = r0
            int r0 = r2._wobbleXYIntensity
            r1._wobbleXYIntensity = r0
            float r0 = r2._wobbleRotationIntensity
            r1._wobbleRotationIntensity = r0
            float r2 = r2._wobbleSpeed
            r1._wobbleSpeed = r2
            if (r3 == 0) goto L49
            org.fortheloss.sticknodes.data.FrameData r2 = r1._frameDataRef
            if (r2 == 0) goto L49
            r2.onUserChangeCameraPosition()
            org.fortheloss.sticknodes.data.FrameData r2 = r1._frameDataRef
            java.util.ArrayList r2 = r2.getDrawableFigures()
            org.fortheloss.sticknodes.data.FrameData r3 = r1._frameDataRef
            java.util.ArrayList r3 = r3.getTextfieldBoxes()
            r0 = 0
            r1.updateLockedFigurePositions(r2, r3, r0)
        L49:
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._frameDataRef = r0
            r1._cameraFigureLockBundles = r0
            r1._cameraTextfieldLockBundles = r0
            return
    }

    public float getCameraOffsetX() {
            r1 = this;
            float r0 = r1._cameraOffsetX
            return r0
    }

    public float getCameraOffsetY() {
            r1 = this;
            float r0 = r1._cameraOffsetY
            return r0
    }

    public float getCameraRotationDeg() {
            r1 = this;
            float r0 = r1._rotationDeg
            return r0
    }

    public float getCameraScale() {
            r1 = this;
            float r0 = r1._cameraScale
            return r0
    }

    public void getData(java.io.OutputStream r7) throws java.io.IOException {
            r6 = this;
            float r0 = r6._cameraScale
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r7)
            float r0 = r6._cameraOffsetX
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 / r1
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r7)
            float r0 = r6._cameraOffsetY
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 / r1
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r7)
            float r0 = r6._rotationDeg
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r7)
            boolean r0 = r6._isWobblingXY
            r7.write(r0)
            boolean r0 = r6._isWobblingRotation
            r7.write(r0)
            boolean r0 = r6._wobbleScaleEnabled
            r7.write(r0)
            int r0 = r6._wobbleXYIntensity
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r7)
            float r0 = r6._wobbleRotationIntensity
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r7)
            float r0 = r6._wobbleSpeed
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r7)
            boolean r0 = r6._isWidescreen
            r7.write(r0)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r0 = r6._cameraFigureLockBundles
            r1 = 0
            if (r0 != 0) goto L44
            r0 = 0
            goto L48
        L44:
            int r0 = r0.size()
        L48:
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r7)
            r2 = 0
        L4c:
            if (r2 >= r0) goto Lbd
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r3 = r6._cameraFigureLockBundles
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r3 = (org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle) r3
            int r4 = r3.getFigureID()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r4, r7)
            int r4 = r3.getLibraryID()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r4, r7)
            int r4 = r3.getFigureType()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r4, r7)
            float r4 = r3.getCamStartX()
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 / r5
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r4, r7)
            float r4 = r3.getCamStartY()
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 / r5
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r4, r7)
            float r4 = r3.getCamStartScale()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r4, r7)
            float r4 = r3.getCamStartRotation()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r4, r7)
            float r4 = r3.getDistanceToStickfigure()
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 / r5
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r4, r7)
            float r4 = r3.getDistanceAngleOffset()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r4, r7)
            float r4 = r3.getRotationOffset()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r4, r7)
            float r4 = r3.getFigureStartScale()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r4, r7)
            float r4 = r3.getParallax()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r4, r7)
            boolean r3 = r3.getFigureWillRotateAndScale()
            r7.write(r3)
            int r2 = r2 + 1
            goto L4c
        Lbd:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle> r0 = r6._cameraTextfieldLockBundles
            if (r0 != 0) goto Lc3
            r0 = 0
            goto Lc7
        Lc3:
            int r0 = r0.size()
        Lc7:
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r7)
        Lca:
            if (r1 >= r0) goto L11f
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle> r2 = r6._cameraTextfieldLockBundles
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle r2 = (org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle) r2
            int r3 = r2.getTextfieldID()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r3, r7)
            float r3 = r2.getCamStartX()
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 / r4
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r3, r7)
            float r3 = r2.getCamStartY()
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 / r4
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r3, r7)
            float r3 = r2.getCamStartScale()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r3, r7)
            float r3 = r2.getCamStartRotation()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r3, r7)
            float r3 = r2.getDistanceToTextfield()
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 / r4
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r3, r7)
            float r3 = r2.getDistanceAngleOffset()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r3, r7)
            float r3 = r2.getRotationOffset()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r3, r7)
            float r2 = r2.getTextfieldStartScale()
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r2, r7)
            int r1 = r1 + 1
            goto Lca
        L11f:
            return
    }

    public org.fortheloss.sticknodes.data.FrameData getFrameData() {
            r1 = this;
            org.fortheloss.sticknodes.data.FrameData r0 = r1._frameDataRef
            return r0
    }

    public java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> getLockedStickfigureBundles() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r0 = r1._cameraFigureLockBundles
            return r0
    }

    public java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle> getLockedTextfieldBundles() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle> r0 = r1._cameraTextfieldLockBundles
            return r0
    }

    public void getProperties(org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r2) {
            r1 = this;
            float r0 = r1._cameraScale
            r2.scale = r0
            float r0 = r1._cameraOffsetX
            r2.offsetX = r0
            float r0 = r1._cameraOffsetY
            r2.offsetY = r0
            float r0 = r1._rotationDeg
            r2.rotationDeg = r0
            boolean r0 = r1._isWobblingXY
            r2.isWobblingXY = r0
            boolean r0 = r1._isWobblingRotation
            r2.isWobblingRotation = r0
            boolean r0 = r1._wobbleScaleEnabled
            r2.wobbleScaleEnabled = r0
            int r0 = r1._wobbleXYIntensity
            r2.wobbleXYIntensity = r0
            float r0 = r1._wobbleRotationIntensity
            r2.wobbleRotationIntensity = r0
            float r0 = r1._wobbleSpeed
            r2.wobbleSpeed = r0
            boolean r0 = r1._isWidescreen
            r2.isWidescreen = r0
            return
    }

    public float getWobbleRotationIntensity() {
            r1 = this;
            float r0 = r1._wobbleRotationIntensity
            return r0
    }

    public float getWobbleSpeed() {
            r1 = this;
            float r0 = r1._wobbleSpeed
            return r0
    }

    public int getWobbleXYIntensity() {
            r1 = this;
            int r0 = r1._wobbleXYIntensity
            return r0
    }

    public boolean hasLockedStickfigures() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r0 = r1._cameraFigureLockBundles
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public void incrementLockedFigureParallax(int r8, int r9) {
            r7 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r0 = r7._cameraFigureLockBundles
            if (r0 == 0) goto L66
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 0
        Lc:
            if (r0 < 0) goto L4c
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r4 = r7._cameraFigureLockBundles
            java.lang.Object r4 = r4.get(r0)
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r4 = (org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle) r4
            int r4 = r4.getFigureID()
            if (r4 != r8) goto L49
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r3 = r7._cameraFigureLockBundles
            java.lang.Object r3 = r3.get(r0)
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r3 = (org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle) r3
            float r4 = r3.getParallax()
            float r5 = (float) r9
            r6 = 1008981770(0x3c23d70a, float:0.01)
            float r5 = r5 * r6
            float r4 = r4 + r5
            r5 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 * r5
            int r4 = java.lang.Math.round(r4)
            float r4 = (float) r4
            float r4 = r4 / r5
            r5 = 0
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 != 0) goto L44
            if (r9 >= 0) goto L45
            r6 = -1138501878(0xffffffffbc23d70a, float:-0.01)
            goto L45
        L44:
            r6 = r4
        L45:
            r3.setParallax(r6)
            r3 = 1
        L49:
            int r0 = r0 + (-1)
            goto Lc
        L4c:
            if (r3 == 0) goto L5e
            org.fortheloss.sticknodes.data.FrameData r8 = r7._frameDataRef
            java.util.ArrayList r8 = r8.getDrawableFigures()
            org.fortheloss.sticknodes.data.FrameData r9 = r7._frameDataRef
            java.util.ArrayList r9 = r9.getTextfieldBoxes()
            r7.updateLockedFigurePositions(r8, r9, r2)
            return
        L5e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Can't modify this locked figure from this camera, it isn't locked to it."
            r8.<init>(r9)
            throw r8
        L66:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Can't remove a locked figure from this camera, it has none."
            r8.<init>(r9)
            throw r8
    }

    public void incrementOffset(float r2, float r3) {
            r1 = this;
            float r0 = r1._cameraOffsetX
            float r0 = r0 + r2
            r1._cameraOffsetX = r0
            float r2 = r1._cameraOffsetY
            float r2 = r2 + r3
            r1._cameraOffsetY = r2
            org.fortheloss.sticknodes.data.FrameData r2 = r1._frameDataRef
            if (r2 == 0) goto L21
            r2.onUserChangeCameraPosition()
            org.fortheloss.sticknodes.data.FrameData r2 = r1._frameDataRef
            java.util.ArrayList r2 = r2.getDrawableFigures()
            org.fortheloss.sticknodes.data.FrameData r3 = r1._frameDataRef
            java.util.ArrayList r3 = r3.getTextfieldBoxes()
            r0 = 0
            r1.updateLockedFigurePositions(r2, r3, r0)
        L21:
            return
    }

    public void incrementStaticWobbleSeed(float r3) {
            r2 = this;
            float r0 = org.fortheloss.sticknodes.animationscreen.FrameCamera.perlinIndexIncrementer
            float r1 = r2._wobbleSpeed
            float r1 = r1 * r3
            float r0 = r0 + r1
            org.fortheloss.sticknodes.animationscreen.FrameCamera.perlinIndexIncrementer = r0
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L10
            return
        L10:
            int r3 = org.fortheloss.sticknodes.animationscreen.FrameCamera.perlinIndex
            int r1 = (int) r0
            int r3 = r3 + r1
            org.fortheloss.sticknodes.animationscreen.FrameCamera.perlinIndex = r3
            int r1 = (int) r0
            float r1 = (float) r1
            float r0 = r0 - r1
            org.fortheloss.sticknodes.animationscreen.FrameCamera.perlinIndexIncrementer = r0
            int r0 = org.fortheloss.sticknodes.animationscreen.FrameCamera.perlinLength
            if (r3 < r0) goto L22
            int r3 = r3 - r0
            org.fortheloss.sticknodes.animationscreen.FrameCamera.perlinIndex = r3
        L22:
            return
    }

    public void interpolateValues(float r5, org.fortheloss.sticknodes.animationscreen.FrameCamera r6) {
            r4 = this;
            float r0 = r4._cameraOffsetX
            float r1 = r6.getCameraOffsetX()
            float r2 = r4._cameraOffsetX
            float r1 = r1 - r2
            float r1 = r1 * r5
            float r0 = r0 + r1
            r1 = 0
            r4.setCameraOffsetX(r0, r1)
            float r0 = r4._cameraOffsetY
            float r2 = r6.getCameraOffsetY()
            float r3 = r4._cameraOffsetY
            float r2 = r2 - r3
            float r2 = r2 * r5
            float r0 = r0 + r2
            r4.setCameraOffsetY(r0, r1)
            float r0 = r4._cameraScale
            float r2 = r6.getCameraScale()
            float r3 = r4._cameraScale
            float r2 = r2 - r3
            float r2 = r2 * r5
            float r0 = r0 + r2
            r4.setCameraScale(r0, r1)
            float r0 = r4._wobbleSpeed
            float r2 = r6.getWobbleSpeed()
            float r3 = r4._wobbleSpeed
            float r2 = r2 - r3
            float r2 = r2 * r5
            float r0 = r0 + r2
            r4.setWobbleSpeed(r0)
            int r0 = r4._wobbleXYIntensity
            float r0 = (float) r0
            int r2 = r6.getWobbleXYIntensity()
            int r3 = r4._wobbleXYIntensity
            int r2 = r2 - r3
            float r2 = (float) r2
            float r2 = r2 * r5
            float r0 = r0 + r2
            int r0 = (int) r0
            r4.setWobbleXYIntensity(r0)
            float r0 = r4._wobbleRotationIntensity
            float r2 = r6.getWobbleRotationIntensity()
            float r3 = r4._wobbleRotationIntensity
            float r2 = r2 - r3
            float r2 = r2 * r5
            float r0 = r0 + r2
            r4.setWobbleRotationIntensity(r0)
            float r0 = r4._rotationDeg
            float r6 = r6.getCameraRotationDeg()
            float r6 = r6 - r0
            r0 = 1127481344(0x43340000, float:180.0)
            float r6 = r6 + r0
            r2 = 1135869952(0x43b40000, float:360.0)
            float r6 = r6 % r2
            float r6 = r6 - r0
            r0 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L73
            float r6 = r6 + r2
        L73:
            float r0 = r4._rotationDeg
            float r6 = r6 * r5
            float r0 = r0 + r6
            r4.setCameraRotation(r0, r1)
            org.fortheloss.sticknodes.data.FrameData r5 = r4._frameDataRef
            if (r5 == 0) goto L91
            r5.onUserChangeCameraPosition()
            org.fortheloss.sticknodes.data.FrameData r5 = r4._frameDataRef
            java.util.ArrayList r5 = r5.getDrawableFigures()
            org.fortheloss.sticknodes.data.FrameData r6 = r4._frameDataRef
            java.util.ArrayList r6 = r6.getTextfieldBoxes()
            r4.updateLockedFigurePositions(r5, r6, r1)
        L91:
            return
    }

    public boolean isAutoCamera() {
            r1 = this;
            boolean r0 = r1._isAutoCamera
            return r0
    }

    public boolean isWidescreen() {
            r1 = this;
            boolean r0 = r1._isWidescreen
            return r0
    }

    public boolean isWobbleScaleEnabled() {
            r1 = this;
            boolean r0 = r1._wobbleScaleEnabled
            return r0
    }

    public boolean isWobbling() {
            r2 = this;
            boolean r0 = r2._isWobblingXY
            if (r0 == 0) goto L8
            int r0 = r2._wobbleXYIntensity
            if (r0 > 0) goto L13
        L8:
            boolean r0 = r2._isWobblingRotation
            if (r0 == 0) goto L15
            float r0 = r2._wobbleRotationIntensity
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L15
        L13:
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    public boolean isWobblingRotation() {
            r1 = this;
            boolean r0 = r1._isWobblingRotation
            return r0
    }

    public boolean isWobblingXY() {
            r1 = this;
            boolean r0 = r1._isWobblingXY
            return r0
    }

    public void onFigureLockBundlesModified(java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.updateLockedFigurePositions(r3, r0, r1)
            return
    }

    public void readData(int r23, int r24, java.io.DataInputStream r25) throws java.io.IOException {
            r22 = this;
            r14 = r22
            r15 = r23
            r0 = 170(0xaa, float:2.38E-43)
            if (r15 < r0) goto Ld
            float r1 = r25.readFloat()
            goto Lf
        Ld:
            r1 = 1065353216(0x3f800000, float:1.0)
        Lf:
            r14._cameraScale = r1
            r1 = 0
            if (r15 < r0) goto L1d
            float r2 = r25.readFloat()
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            goto L1e
        L1d:
            r2 = 0
        L1e:
            r14._cameraOffsetX = r2
            if (r15 < r0) goto L2b
            float r0 = r25.readFloat()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r2
            goto L2c
        L2b:
            r0 = 0
        L2c:
            r14._cameraOffsetY = r0
            r0 = 230(0xe6, float:3.22E-43)
            if (r15 < r0) goto L36
            float r1 = r25.readFloat()
        L36:
            r14._rotationDeg = r1
            r13 = 310(0x136, float:4.34E-43)
            r1 = 1077936128(0x40400000, float:3.0)
            r2 = 8
            r3 = 1056964608(0x3f000000, float:0.5)
            r12 = 1
            r11 = 0
            if (r15 < r0) goto Lb1
            if (r15 < r13) goto L7a
            int r0 = r25.read()
            if (r0 == 0) goto L4e
            r0 = 1
            goto L4f
        L4e:
            r0 = 0
        L4f:
            r14._isWobblingXY = r0
            int r0 = r25.read()
            if (r0 == 0) goto L59
            r0 = 1
            goto L5a
        L59:
            r0 = 0
        L5a:
            r14._isWobblingRotation = r0
            int r0 = r25.read()
            if (r0 == 0) goto L64
            r0 = 1
            goto L65
        L64:
            r0 = 0
        L65:
            r14._wobbleScaleEnabled = r0
            int r0 = r25.readInt()
            r14._wobbleXYIntensity = r0
            float r0 = r25.readFloat()
            r14._wobbleRotationIntensity = r0
            float r0 = r25.readFloat()
            r14._wobbleSpeed = r0
            goto Lbd
        L7a:
            int r0 = r25.read()
            if (r0 == 0) goto L82
            r0 = 1
            goto L83
        L82:
            r0 = 0
        L83:
            float r4 = r25.readFloat()
            float r5 = r25.readFloat()
            if (r0 == 0) goto La4
            r14._isWobblingXY = r12
            int r0 = (int) r4
            r14._wobbleXYIntensity = r0
            r0 = 1059648963(0x3f28f5c3, float:0.66)
            float r5 = r5 * r0
            float r5 = r5 / r3
            int r0 = java.lang.Math.round(r5)
            float r0 = (float) r0
            float r0 = r0 * r3
            r14._wobbleSpeed = r0
            r14._wobbleScaleEnabled = r11
            goto Lac
        La4:
            r14._isWobblingXY = r11
            r14._wobbleXYIntensity = r2
            r14._wobbleSpeed = r1
            r14._wobbleScaleEnabled = r12
        Lac:
            r14._isWobblingRotation = r11
            r14._wobbleRotationIntensity = r3
            goto Lbd
        Lb1:
            r14._isWobblingXY = r11
            r14._isWobblingRotation = r11
            r14._wobbleScaleEnabled = r12
            r14._wobbleXYIntensity = r2
            r14._wobbleRotationIntensity = r3
            r14._wobbleSpeed = r1
        Lbd:
            r0 = 220(0xdc, float:3.08E-43)
            if (r15 < r0) goto Lc9
            int r1 = r25.read()
            if (r1 == 0) goto Lc9
            r1 = 1
            goto Lca
        Lc9:
            r1 = 0
        Lca:
            r14._isWidescreen = r1
            if (r15 < r0) goto Ld5
            r0 = 244(0xf4, float:3.42E-43)
            if (r15 >= r0) goto Ld5
            r25.read()
        Ld5:
            r0 = 237(0xed, float:3.32E-43)
            if (r15 < r0) goto L152
            int r10 = r25.readInt()
            r9 = 0
        Lde:
            if (r9 >= r10) goto L152
            int r1 = r25.readInt()
            int r2 = r25.readInt()
            r0 = 300(0x12c, float:4.2E-43)
            if (r15 < r0) goto Lf2
            int r0 = r25.readInt()
            r3 = r0
            goto Lf3
        Lf2:
            r3 = 0
        Lf3:
            float r0 = r25.readFloat()
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r0
            float r0 = r25.readFloat()
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r0
            float r6 = r25.readFloat()
            float r7 = r25.readFloat()
            float r0 = r25.readFloat()
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r0
            float r16 = r25.readFloat()
            float r17 = r25.readFloat()
            float r18 = r25.readFloat()
            float r19 = r25.readFloat()
            int r0 = r25.read()
            if (r0 == 0) goto L12c
            r20 = 1
            goto L12e
        L12c:
            r20 = 0
        L12e:
            r0 = r22
            r21 = r9
            r9 = r16
            r16 = r10
            r10 = r17
            r17 = 0
            r11 = r18
            r18 = 1
            r12 = r19
            r14 = 310(0x136, float:4.34E-43)
            r13 = r20
            r0.addLockedFigure(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            int r9 = r21 + 1
            r10 = r16
            r11 = 0
            r12 = 1
            r13 = 310(0x136, float:4.34E-43)
            r14 = r22
            goto Lde
        L152:
            r14 = 310(0x136, float:4.34E-43)
            r17 = 0
            if (r15 < r14) goto L197
            int r10 = r25.readInt()
            r11 = 0
        L15d:
            if (r11 >= r10) goto L197
            int r1 = r25.readInt()
            float r0 = r25.readFloat()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r0
            float r0 = r25.readFloat()
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r0
            float r4 = r25.readFloat()
            float r5 = r25.readFloat()
            float r0 = r25.readFloat()
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r0
            float r7 = r25.readFloat()
            float r8 = r25.readFloat()
            float r9 = r25.readFloat()
            r0 = r22
            r0.addLockedTextfield(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int r11 = r11 + 1
            goto L15d
        L197:
            return
    }

    public void removeAppliedMoveDuringDelay(java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2, java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r3) {
            r1 = this;
            r0 = 0
            r1.updateLockedFigurePositions(r2, r3, r0)
            return
    }

    public boolean removeAppliedWobble(java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2, java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r3, boolean r4) {
            r1 = this;
            float r0 = r1._beforeWobbleCamX
            r1._cameraOffsetX = r0
            float r0 = r1._beforeWobbleCamY
            r1._cameraOffsetY = r0
            float r0 = r1._beforeWobbleCamScale
            r1._cameraScale = r0
            float r0 = r1._beforeWobbleCamRotationDeg
            r1._rotationDeg = r0
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r0 = r1._cameraFigureLockBundles
            if (r0 != 0) goto L1b
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle> r0 = r1._cameraTextfieldLockBundles
            if (r0 == 0) goto L19
            goto L1b
        L19:
            r2 = 0
            return r2
        L1b:
            r1.updateLockedFigurePositions(r2, r3, r4)
            r2 = 1
            return r2
    }

    public void removeLockedFigure(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4) {
            r3 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r0 = r3._cameraFigureLockBundles
            if (r0 == 0) goto L43
            if (r4 == 0) goto L3b
            int r0 = r4.getID()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r1 = r3._cameraFigureLockBundles
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L12:
            if (r1 < 0) goto L2b
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r2 = r3._cameraFigureLockBundles
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r2 = (org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle) r2
            int r2 = r2.getFigureID()
            if (r2 != r0) goto L28
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r0 = r3._cameraFigureLockBundles
            r0.remove(r1)
            goto L2b
        L28:
            int r1 = r1 + (-1)
            goto L12
        L2b:
            r0 = 0
            r4.flagLockedToCamera(r0)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r4 = r3._cameraFigureLockBundles
            int r4 = r4.size()
            if (r4 > 0) goto L3a
            r4 = 0
            r3._cameraFigureLockBundles = r4
        L3a:
            return
        L3b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't remove this locked figure from this camera, it isn't locked to it."
            r4.<init>(r0)
            throw r4
        L43:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't remove a locked figure from this camera, it has none."
            r4.<init>(r0)
            throw r4
    }

    public void removeLockedFigures() {
            r5 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r0 = r5._cameraFigureLockBundles
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Lb:
            if (r0 < 0) goto L44
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r1 = r5._cameraFigureLockBundles
            java.lang.Object r1 = r1.remove(r0)
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r1 = (org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle) r1
            int r1 = r1.getFigureID()
            org.fortheloss.sticknodes.data.FrameData r2 = r5._frameDataRef
            java.util.ArrayList r2 = r2.getDrawableFigures()
            int r3 = r2.size()
            int r3 = r3 + (-1)
        L25:
            if (r3 < 0) goto L41
            java.lang.Object r4 = r2.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            int r4 = r4.getID()
            if (r4 != r1) goto L3e
            java.lang.Object r1 = r2.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            r2 = 0
            r1.flagLockedToCamera(r2)
            goto L41
        L3e:
            int r3 = r3 + (-1)
            goto L25
        L41:
            int r0 = r0 + (-1)
            goto Lb
        L44:
            r0 = 0
            r5._cameraFigureLockBundles = r0
            return
    }

    public void removeLockedTextfield(org.fortheloss.sticknodes.TextfieldBox r4) {
            r3 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle> r0 = r3._cameraTextfieldLockBundles
            if (r0 == 0) goto L43
            if (r4 == 0) goto L3b
            int r0 = r4.getID()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle> r1 = r3._cameraTextfieldLockBundles
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L12:
            if (r1 < 0) goto L2b
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle> r2 = r3._cameraTextfieldLockBundles
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle r2 = (org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle) r2
            int r2 = r2.getTextfieldID()
            if (r2 != r0) goto L28
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle> r0 = r3._cameraTextfieldLockBundles
            r0.remove(r1)
            goto L2b
        L28:
            int r1 = r1 + (-1)
            goto L12
        L2b:
            r0 = 0
            r4.setLockedToCamera(r0)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle> r4 = r3._cameraTextfieldLockBundles
            int r4 = r4.size()
            if (r4 > 0) goto L3a
            r4 = 0
            r3._cameraTextfieldLockBundles = r4
        L3a:
            return
        L3b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't remove this locked textfield from this camera, it isn't locked to it."
            r4.<init>(r0)
            throw r4
        L43:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't remove a locked textfield from this camera, it has none."
            r4.<init>(r0)
            throw r4
    }

    public void setCameraOffsetX(float r2) {
            r1 = this;
            r0 = 1
            r1.setCameraOffsetX(r2, r0)
            return
    }

    public void setCameraOffsetX(float r2, boolean r3) {
            r1 = this;
            r1._cameraOffsetX = r2
            org.fortheloss.sticknodes.data.FrameData r2 = r1._frameDataRef
            if (r2 == 0) goto L1b
            r2.onUserChangeCameraPosition()
            if (r3 == 0) goto L1b
            org.fortheloss.sticknodes.data.FrameData r2 = r1._frameDataRef
            java.util.ArrayList r2 = r2.getDrawableFigures()
            org.fortheloss.sticknodes.data.FrameData r3 = r1._frameDataRef
            java.util.ArrayList r3 = r3.getTextfieldBoxes()
            r0 = 0
            r1.updateLockedFigurePositions(r2, r3, r0)
        L1b:
            return
    }

    public void setCameraOffsetY(float r2) {
            r1 = this;
            r0 = 1
            r1.setCameraOffsetY(r2, r0)
            return
    }

    public void setCameraOffsetY(float r2, boolean r3) {
            r1 = this;
            r1._cameraOffsetY = r2
            org.fortheloss.sticknodes.data.FrameData r2 = r1._frameDataRef
            if (r2 == 0) goto L1b
            r2.onUserChangeCameraPosition()
            if (r3 == 0) goto L1b
            org.fortheloss.sticknodes.data.FrameData r2 = r1._frameDataRef
            java.util.ArrayList r2 = r2.getDrawableFigures()
            org.fortheloss.sticknodes.data.FrameData r3 = r1._frameDataRef
            java.util.ArrayList r3 = r3.getTextfieldBoxes()
            r0 = 0
            r1.updateLockedFigurePositions(r2, r3, r0)
        L1b:
            return
    }

    public void setCameraRotation(float r2) {
            r1 = this;
            r0 = 1
            r1.setCameraRotation(r2, r0)
            return
    }

    public void setCameraRotation(float r2, boolean r3) {
            r1 = this;
            r0 = 1135869952(0x43b40000, float:360.0)
            float r2 = r2 % r0
            r1._rotationDeg = r2
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            float r2 = (float) r2
            float r2 = r2 / r0
            r1._rotationDeg = r2
            org.fortheloss.sticknodes.data.FrameData r2 = r1._frameDataRef
            if (r2 == 0) goto L2a
            r2.onUserChangeCameraPosition()
            if (r3 == 0) goto L2a
            org.fortheloss.sticknodes.data.FrameData r2 = r1._frameDataRef
            java.util.ArrayList r2 = r2.getDrawableFigures()
            org.fortheloss.sticknodes.data.FrameData r3 = r1._frameDataRef
            java.util.ArrayList r3 = r3.getTextfieldBoxes()
            r0 = 0
            r1.updateLockedFigurePositions(r2, r3, r0)
        L2a:
            return
    }

    public void setCameraScale(float r2) {
            r1 = this;
            r0 = 1
            r1.setCameraScale(r2, r0)
            return
    }

    public void setCameraScale(float r4, boolean r5) {
            r3 = this;
            r0 = 1084227584(0x40a00000, float:5.0)
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 >= 0) goto Ld
            r4 = 1017370378(0x3ca3d70a, float:0.02)
            goto L13
        Ld:
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 <= 0) goto L13
            r4 = 1084227584(0x40a00000, float:5.0)
        L13:
            r3._cameraScale = r4
            org.fortheloss.sticknodes.data.FrameData r4 = r3._frameDataRef
            if (r4 == 0) goto L2e
            r4.onUserChangeCameraPosition()
            if (r5 == 0) goto L2e
            org.fortheloss.sticknodes.data.FrameData r4 = r3._frameDataRef
            java.util.ArrayList r4 = r4.getDrawableFigures()
            org.fortheloss.sticknodes.data.FrameData r5 = r3._frameDataRef
            java.util.ArrayList r5 = r5.getTextfieldBoxes()
            r0 = 0
            r3.updateLockedFigurePositions(r4, r5, r0)
        L2e:
            return
    }

    public void setIsAutoCamera(boolean r1) {
            r0 = this;
            r0._isAutoCamera = r1
            return
    }

    public void setIsWidescreen(boolean r1) {
            r0 = this;
            r0._isWidescreen = r1
            return
    }

    public void setLockedFigureParallax(int r6, float r7) {
            r5 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r0 = r5._cameraFigureLockBundles
            if (r0 == 0) goto L45
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 0
        Lc:
            if (r0 < 0) goto L2b
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r4 = r5._cameraFigureLockBundles
            java.lang.Object r4 = r4.get(r0)
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r4 = (org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle) r4
            int r4 = r4.getFigureID()
            if (r4 != r6) goto L28
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r3 = r5._cameraFigureLockBundles
            java.lang.Object r3 = r3.get(r0)
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r3 = (org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle) r3
            r3.setParallax(r7)
            r3 = 1
        L28:
            int r0 = r0 + (-1)
            goto Lc
        L2b:
            if (r3 == 0) goto L3d
            org.fortheloss.sticknodes.data.FrameData r6 = r5._frameDataRef
            java.util.ArrayList r6 = r6.getDrawableFigures()
            org.fortheloss.sticknodes.data.FrameData r7 = r5._frameDataRef
            java.util.ArrayList r7 = r7.getTextfieldBoxes()
            r5.updateLockedFigurePositions(r6, r7, r2)
            return
        L3d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Can't modify this locked figure from this camera, it isn't locked to it."
            r6.<init>(r7)
            throw r6
        L45:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Can't remove a locked figure from this camera, it has none."
            r6.<init>(r7)
            throw r6
    }

    public void setLockedFigureRotateAndScaleWithCamera(int r5, boolean r6) {
            r4 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r0 = r4._cameraFigureLockBundles
            if (r0 == 0) goto L5e
            r1 = 0
            int r0 = r0.size()
            r2 = 1
            int r0 = r0 - r2
        Lb:
            if (r0 < 0) goto L2a
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r3 = r4._cameraFigureLockBundles
            java.lang.Object r3 = r3.get(r0)
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r3 = (org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle) r3
            int r3 = r3.getFigureID()
            if (r3 != r5) goto L27
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r1 = r4._cameraFigureLockBundles
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r1 = (org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle) r1
            r1.setFigureWillRotateAndScale(r6)
            r1 = 1
        L27:
            int r0 = r0 + (-1)
            goto Lb
        L2a:
            if (r1 == 0) goto L56
            org.fortheloss.sticknodes.data.FrameData r0 = r4._frameDataRef
            java.util.ArrayList r0 = r0.getDrawableFigures()
            int r1 = r0.size()
            int r1 = r1 - r2
        L37:
            if (r1 < 0) goto L55
            java.lang.Object r3 = r0.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            int r3 = r3.getID()
            if (r3 != r5) goto L52
            java.lang.Object r5 = r0.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r5 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r5
            if (r6 == 0) goto L4e
            r2 = 2
        L4e:
            r5.flagLockedToCamera(r2)
            goto L55
        L52:
            int r1 = r1 + (-1)
            goto L37
        L55:
            return
        L56:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Can't modify this locked figure from this camera, it isn't locked to it."
            r5.<init>(r6)
            throw r5
        L5e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Can't remove a locked figure from this camera, it has none."
            r5.<init>(r6)
            throw r5
    }

    public void setProperties(org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r3) {
            r2 = this;
            float r0 = r3.scale
            r2._cameraScale = r0
            float r0 = r3.offsetX
            r2._cameraOffsetX = r0
            float r0 = r3.offsetY
            r2._cameraOffsetY = r0
            float r0 = r3.rotationDeg
            r2._rotationDeg = r0
            boolean r0 = r3.isWobblingXY
            r2._isWobblingXY = r0
            boolean r0 = r3.isWobblingRotation
            r2._isWobblingRotation = r0
            boolean r0 = r3.wobbleScaleEnabled
            r2._wobbleScaleEnabled = r0
            int r0 = r3.wobbleXYIntensity
            r2._wobbleXYIntensity = r0
            float r0 = r3.wobbleRotationIntensity
            r2._wobbleRotationIntensity = r0
            float r0 = r3.wobbleSpeed
            r2._wobbleSpeed = r0
            boolean r3 = r3.isWidescreen
            r2._isWidescreen = r3
            org.fortheloss.sticknodes.data.FrameData r3 = r2._frameDataRef
            if (r3 == 0) goto L43
            r3.onUserChangeCameraPosition()
            org.fortheloss.sticknodes.data.FrameData r3 = r2._frameDataRef
            java.util.ArrayList r3 = r3.getDrawableFigures()
            org.fortheloss.sticknodes.data.FrameData r0 = r2._frameDataRef
            java.util.ArrayList r0 = r0.getTextfieldBoxes()
            r1 = 0
            r2.updateLockedFigurePositions(r3, r0, r1)
        L43:
            return
    }

    public void setWobbleProperties(org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r2) {
            r1 = this;
            boolean r0 = r2.isWobblingXY
            r1._isWobblingXY = r0
            boolean r0 = r2.isWobblingRotation
            r1._isWobblingRotation = r0
            boolean r0 = r2.wobbleScaleEnabled
            r1._wobbleScaleEnabled = r0
            int r0 = r2.wobbleXYIntensity
            r1._wobbleXYIntensity = r0
            float r0 = r2.wobbleRotationIntensity
            r1._wobbleRotationIntensity = r0
            float r2 = r2.wobbleSpeed
            r1._wobbleSpeed = r2
            return
    }

    public void setWobbleRotation(boolean r1) {
            r0 = this;
            r0._isWobblingRotation = r1
            return
    }

    public void setWobbleRotationIntensity(float r3) {
            r2 = this;
            r2._wobbleRotationIntensity = r3
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto La
            r2._wobbleRotationIntensity = r0
            goto L12
        La:
            r0 = 1127481344(0x43340000, float:180.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L12
            r2._wobbleRotationIntensity = r0
        L12:
            float r3 = r2._wobbleRotationIntensity
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2._wobbleRotationIntensity = r3
            return
    }

    public void setWobbleScale(boolean r1) {
            r0 = this;
            r0._wobbleScaleEnabled = r1
            return
    }

    public void setWobbleSpeed(float r3) {
            r2 = this;
            r2._wobbleSpeed = r3
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Lb
            r2._wobbleSpeed = r0
            goto L13
        Lb:
            r0 = 1112014848(0x42480000, float:50.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L13
            r2._wobbleSpeed = r0
        L13:
            float r3 = r2._wobbleSpeed
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2._wobbleSpeed = r3
            return
    }

    public void setWobbleXY(boolean r1) {
            r0 = this;
            r0._isWobblingXY = r1
            return
    }

    public void setWobbleXYIntensity(int r2) {
            r1 = this;
            r1._wobbleXYIntensity = r2
            if (r2 >= 0) goto L8
            r2 = 0
            r1._wobbleXYIntensity = r2
            goto Le
        L8:
            r0 = 100
            if (r2 <= r0) goto Le
            r1._wobbleXYIntensity = r0
        Le:
            return
    }

    public void temporarilyReferenceLockedBundles(org.fortheloss.sticknodes.data.FrameData r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r3.getFrameCamera()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle> r0 = r0._cameraFigureLockBundles
            r2._cameraFigureLockBundles = r0
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r3.getFrameCamera()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle> r0 = r0._cameraTextfieldLockBundles
            r2._cameraTextfieldLockBundles = r0
            java.util.ArrayList r0 = r3.getTweenedDrawableFigures()
            java.util.ArrayList r3 = r3.getTextfieldBoxes()
            r1 = 1
            r2.updateLockedFigurePositions(r0, r3, r1)
            return
    }

    public void updateLocked(boolean r3, boolean r4) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L15
            if (r4 == 0) goto L15
            org.fortheloss.sticknodes.data.FrameData r3 = r2._frameDataRef
            java.util.ArrayList r3 = r3.getDrawableFigures()
            org.fortheloss.sticknodes.data.FrameData r4 = r2._frameDataRef
            java.util.ArrayList r4 = r4.getTextfieldBoxes()
            r2.updateLockedFigurePositions(r3, r4, r0)
            goto L2d
        L15:
            r1 = 0
            if (r3 == 0) goto L22
            org.fortheloss.sticknodes.data.FrameData r3 = r2._frameDataRef
            java.util.ArrayList r3 = r3.getDrawableFigures()
            r2.updateLockedFigurePositions(r3, r1, r0)
            goto L2d
        L22:
            if (r4 == 0) goto L2d
            org.fortheloss.sticknodes.data.FrameData r3 = r2._frameDataRef
            java.util.ArrayList r3 = r3.getTextfieldBoxes()
            r2.updateLockedFigurePositions(r1, r3, r0)
        L2d:
            return
    }
}
