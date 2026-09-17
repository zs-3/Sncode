package org.fortheloss.sticknodes;

/* loaded from: classes2.dex */
public class TextfieldBox implements org.fortheloss.sticknodes.animationscreen.IStageObject {
    private static final com.badlogic.gdx.graphics.Color tempColor = null;
    private static final com.badlogic.gdx.math.Matrix4 tempMatrix4 = null;
    private int _alignment;
    private float _alpha;
    private boolean _drawAboveWidescreenBars;
    private boolean _flagLockedToCamera;
    private int _fontID;
    private com.badlogic.gdx.graphics.g2d.GlyphLayout _glyphLayout;
    private boolean _hasShadow;
    private float _height;
    private int _id;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _label;
    private boolean _locked;
    private com.badlogic.gdx.math.Vector2 _position;
    private float _rotation;
    private float _scale;
    private com.badlogic.gdx.graphics.Color _shadowColor;
    private java.lang.String _temporaryTextToSet;
    private float _tweenedAlpha;
    private float _tweenedRotation;
    private float _tweenedScale;
    private float _tweenedX;
    private float _tweenedY;
    private float _width;
    private org.fortheloss.sticknodes.animationscreen.FontLoader mFontLoaderRef;

    static {
            com.badlogic.gdx.math.Matrix4 r0 = new com.badlogic.gdx.math.Matrix4
            r0.<init>()
            org.fortheloss.sticknodes.TextfieldBox.tempMatrix4 = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>()
            org.fortheloss.sticknodes.TextfieldBox.tempColor = r0
            return
    }

    public TextfieldBox(org.fortheloss.sticknodes.TextfieldBox r5) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4._fontID = r0
            r4._locked = r0
            r4._hasShadow = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r4._scale = r1
            r2 = 1
            r4._alignment = r2
            r2 = 0
            r4._width = r2
            r4._height = r2
            r4._rotation = r2
            r4._alpha = r1
            r4._drawAboveWidescreenBars = r0
            r3 = -1
            r4._id = r3
            r4._flagLockedToCamera = r0
            r4._tweenedX = r2
            r4._tweenedY = r2
            r4._tweenedScale = r2
            r4._tweenedRotation = r2
            r4._tweenedAlpha = r1
            org.fortheloss.sticknodes.animationscreen.FontLoader r1 = r5.mFontLoaderRef
            r4.mFontLoaderRef = r1
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            org.fortheloss.sticknodes.animationscreen.FontLoader r2 = r4.mFontLoaderRef
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = r2.getDefaultFontLabelStyle()
            java.lang.String r3 = ""
            r1.<init>(r3, r2)
            r4._label = r1
            r1.setWrap(r0)
            com.badlogic.gdx.graphics.g2d.GlyphLayout r1 = new com.badlogic.gdx.graphics.g2d.GlyphLayout
            r1.<init>()
            r4._glyphLayout = r1
            int r1 = r5._alignment
            r4.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r5._label
            com.badlogic.gdx.graphics.Color r1 = r1.getColor()
            r4.setColor(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r5._label
            com.badlogic.gdx.utils.StringBuilder r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r4.setText(r1)
            int r1 = r5._fontID
            r4.setFontID(r1, r0)
            com.badlogic.gdx.math.Vector2 r1 = new com.badlogic.gdx.math.Vector2
            com.badlogic.gdx.math.Vector2 r2 = r5._position
            r1.<init>(r2)
            r4._position = r1
            float r1 = r5._scale
            r4._scale = r1
            float r1 = r5._rotation
            r4._rotation = r1
            float r1 = r5._alpha
            r4._alpha = r1
            boolean r1 = r5._drawAboveWidescreenBars
            r4._drawAboveWidescreenBars = r1
            int r1 = r5._id
            r4._id = r1
            boolean r1 = r5._locked
            r4._locked = r1
            r4._flagLockedToCamera = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r1 = r5._shadowColor
            r0.<init>(r1)
            r4._shadowColor = r0
            boolean r5 = r5._hasShadow
            r4._hasShadow = r5
            return
    }

    public TextfieldBox(org.fortheloss.sticknodes.animationscreen.FontLoader r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public TextfieldBox(boolean r7, org.fortheloss.sticknodes.animationscreen.FontLoader r8) {
            r6 = this;
            r6.<init>()
            r0 = 0
            r6._fontID = r0
            r6._locked = r0
            r6._hasShadow = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r6._scale = r1
            r2 = 1
            r6._alignment = r2
            r2 = 0
            r6._width = r2
            r6._height = r2
            r6._rotation = r2
            r6._alpha = r1
            r6._drawAboveWidescreenBars = r0
            r3 = -1
            r6._id = r3
            r6._flagLockedToCamera = r0
            r6._tweenedX = r2
            r6._tweenedY = r2
            r6._tweenedScale = r2
            r6._tweenedRotation = r2
            r6._tweenedAlpha = r1
            r6.mFontLoaderRef = r8
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            org.fortheloss.sticknodes.animationscreen.FontLoader r4 = r6.mFontLoaderRef
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = r4.getDefaultFontLabelStyle()
            java.lang.String r5 = ""
            r3.<init>(r5, r4)
            r6._label = r3
            r3.setWrap(r0)
            com.badlogic.gdx.graphics.g2d.GlyphLayout r3 = new com.badlogic.gdx.graphics.g2d.GlyphLayout
            r3.<init>()
            r6._glyphLayout = r3
            int r3 = r6._alignment
            r6.setAlignment(r3)
            r3 = 1040187392(0x3e000000, float:0.125)
            r6.setColor(r3, r3, r3)
            java.lang.String r3 = "hello"
            if (r7 != 0) goto L5c
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r3)
            r6.setText(r7)
            goto L62
        L5c:
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r3)
            r6._temporaryTextToSet = r7
        L62:
            com.badlogic.gdx.math.Vector2 r7 = new com.badlogic.gdx.math.Vector2
            r7.<init>()
            r6._position = r7
            r6._scale = r1
            r6._locked = r0
            r6._flagLockedToCamera = r0
            com.badlogic.gdx.graphics.Color r7 = new com.badlogic.gdx.graphics.Color
            r7.<init>(r2, r2, r2, r1)
            r6._shadowColor = r7
            r6._hasShadow = r0
            int r7 = r8.getDefaultFontId()
            r6._fontID = r7
            r6.setFontID(r7, r0)
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.mFontLoaderRef = r0
            r1._label = r0
            r1._glyphLayout = r0
            r1._position = r0
            r1._shadowColor = r0
            r1._temporaryTextToSet = r0
            return
    }

    public void draw(com.badlogic.gdx.graphics.g2d.Batch r16, com.badlogic.gdx.graphics.glutils.ShaderProgram r17, float r18, float r19, float r20, float r21, float r22, boolean r23) {
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            com.badlogic.gdx.math.Vector2 r3 = r0._position
            float r4 = r3.x
            float r3 = r3.y
            float r5 = r0._scale
            float r6 = r0._rotation
            float r7 = r0._alpha
            if (r23 == 0) goto L1d
            float r4 = r0._tweenedX
            float r3 = r0._tweenedY
            float r5 = r0._tweenedScale
            float r6 = r0._tweenedRotation
            float r7 = r0._tweenedAlpha
        L1d:
            float r5 = r5 * r22
            int r8 = r0._alignment
            r9 = 16
            r10 = 1056964608(0x3f000000, float:0.5)
            r11 = 0
            if (r8 != r9) goto L2f
            float r8 = r0._width
        L2a:
            float r8 = r8 * r5
            float r8 = r8 * r10
            goto L38
        L2f:
            r9 = 8
            if (r8 != r9) goto L37
            float r8 = r0._width
            float r8 = -r8
            goto L2a
        L37:
            r8 = 0
        L38:
            float r9 = r4 - r20
            r12 = 1065353216(0x3f800000, float:1.0)
            float r13 = r22 - r12
            float r9 = r9 * r13
            float r14 = r3 - r21
            float r14 = r14 * r13
            float r4 = r4 + r18
            float r4 = r4 + r9
            float r9 = r0._width
            float r9 = r9 * r5
            float r9 = r9 * r10
            float r4 = r4 + r9
            float r3 = r3 + r19
            float r3 = r3 + r14
            float r9 = r0._height
            float r9 = r9 * r5
            float r9 = r9 * r10
            float r3 = r3 - r9
            com.badlogic.gdx.scenes.scene2d.ui.Label r9 = r0._label
            com.badlogic.gdx.graphics.Color r9 = r9.getColor()
            java.lang.String r10 = "u_scale"
            r2.setUniformf(r10, r5)
            java.lang.String r10 = "u_textAlpha"
            r2.setUniformf(r10, r7)
            r2 = 1
            int r7 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r7 == 0) goto L6f
            r7 = 1
            goto L70
        L6f:
            r7 = 0
        L70:
            if (r7 == 0) goto L93
            r16.flush()
            com.badlogic.gdx.math.Matrix4 r10 = org.fortheloss.sticknodes.TextfieldBox.tempMatrix4
            com.badlogic.gdx.math.Matrix4 r13 = r16.getTransformMatrix()
            r10.set(r13)
            com.badlogic.gdx.math.Matrix4 r10 = r16.getTransformMatrix()
            com.badlogic.gdx.math.Matrix4 r10 = r10.translate(r4, r3, r11)
            com.badlogic.gdx.math.Matrix4 r6 = r10.rotate(r11, r11, r12, r6)
            float r10 = -r4
            float r13 = -r3
            com.badlogic.gdx.math.Matrix4 r6 = r6.translate(r10, r13, r11)
            r1.setTransformMatrix(r6)
        L93:
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r0._label
            r6.setFontScale(r5)
            float r4 = r4 + r8
            r6 = 771(0x303, float:1.08E-42)
            r1.setBlendFunction(r2, r6)
            boolean r2 = r0._hasShadow
            if (r2 == 0) goto Ld7
            com.badlogic.gdx.graphics.Color r2 = org.fortheloss.sticknodes.TextfieldBox.tempColor
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = r0._label
            com.badlogic.gdx.graphics.Color r8 = r8.getColor()
            r2.set(r8)
            com.badlogic.gdx.graphics.Color r8 = r0._shadowColor
            r1.setColor(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = r0._label
            com.badlogic.gdx.graphics.Color r10 = r0._shadowColor
            r8.setColor(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = r0._label
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            r11 = 1073741824(0x40000000, float:2.0)
            float r13 = r10 * r11
            float r13 = r13 * r5
            float r13 = r13 + r4
            float r10 = r10 * r11
            float r10 = r10 * r5
            float r5 = r3 - r10
            r8.setPosition(r13, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r0._label
            r5.draw(r1, r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r0._label
            r5.setColor(r2)
        Ld7:
            float r2 = r9.r
            float r5 = r9.g
            float r8 = r9.b
            r1.setColor(r2, r5, r8, r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0._label
            r2.setPosition(r4, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0._label
            r2.draw(r1, r12)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0._label
            r2.setFontScale(r12)
            if (r7 == 0) goto Lf9
            r16.flush()
            com.badlogic.gdx.math.Matrix4 r2 = org.fortheloss.sticknodes.TextfieldBox.tempMatrix4
            r1.setTransformMatrix(r2)
        Lf9:
            r2 = 770(0x302, float:1.079E-42)
            r1.setBlendFunction(r2, r6)
            return
    }

    public void drawOutline(org.fortheloss.sticknodes.animationscreen.NodeDrawTools r21, float r22, float r23, float r24, float r25, float r26, boolean r27, boolean r28) {
            r20 = this;
            r0 = r20
            r1 = r21
            float r2 = r20.getX()
            float r2 = r2 - r24
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = r26 - r3
            float r2 = r2 * r3
            float r4 = r20.getY()
            float r4 = r4 - r25
            float r4 = r4 * r3
            float r3 = r0._scale
            float r3 = r3 * r26
            float r5 = r20.getX()
            float r5 = r5 + r22
            float r5 = r5 + r2
            float r2 = r20.getY()
            float r2 = r2 + r23
            float r2 = r2 + r4
            if (r28 != 0) goto L34
            if (r27 != 0) goto L2f
            goto L34
        L2f:
            r4 = 49
            r6 = 51
            goto L38
        L34:
            r4 = 48
            r6 = 50
        L38:
            r7 = 1090519040(0x41000000, float:8.0)
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r7
            r7 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 * r7
            float r9 = r0._width
            float r9 = r9 * r3
            float r10 = r0._height
            float r10 = r10 * r3
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r11 = r1.getNode(r6)
            com.badlogic.gdx.graphics.g2d.Batch r12 = r21.getBatch()
            r3 = 1056964608(0x3f000000, float:0.5)
            float r6 = r9 * r3
            float r5 = r5 + r6
            float r3 = r3 * r10
            float r2 = r2 - r3
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r7
            float r14 = r2 - r3
            float r3 = r9 + r8
            float r18 = r10 + r8
            float r17 = r20.getRotation()
            r13 = r5
            r15 = r3
            r16 = r18
            r11.drawPatch(r12, r13, r14, r15, r16, r17)
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r13 = r1.getNode(r4)
            com.badlogic.gdx.graphics.g2d.Batch r14 = r21.getBatch()
            float r19 = r20.getRotation()
            r15 = r5
            r16 = r2
            r17 = r3
            r13.drawPatch(r14, r15, r16, r17, r18, r19)
            boolean r3 = r0._locked
            if (r3 != 0) goto L8b
            boolean r3 = r0._flagLockedToCamera
            if (r3 == 0) goto Lb2
        L8b:
            if (r28 != 0) goto L93
            if (r27 != 0) goto L90
            goto L93
        L90:
            r3 = 10
            goto L95
        L93:
            r3 = 8
        L95:
            org.fortheloss.sticknodes.animationscreen.drawables.BaseNodeDrawable r3 = r1.getNode(r3)
            com.badlogic.gdx.graphics.g2d.Batch r1 = r21.getBatch()
            r4 = 1069547520(0x3fc00000, float:1.5)
            float r6 = r20.getRotation()
            r21 = r3
            r22 = r1
            r23 = r5
            r24 = r2
            r25 = r4
            r26 = r6
            r21.drawNode(r22, r23, r24, r25, r26)
        Lb2:
            return
    }

    public int getAlignment() {
            r1 = this;
            int r0 = r1._alignment
            return r0
    }

    public float getAlpha() {
            r1 = this;
            float r0 = r1._alpha
            return r0
    }

    public com.badlogic.gdx.graphics.Color getColor() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r1._label
            com.badlogic.gdx.graphics.Color r0 = r0.getColor()
            return r0
    }

    public void getData(java.io.OutputStream r4) throws java.io.IOException {
            r3 = this;
            int r0 = r3._id
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r4)
            int r0 = r3._fontID
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r4)
            com.badlogic.gdx.math.Vector2 r0 = r3._position
            float r0 = r0.x
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 / r1
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r4)
            com.badlogic.gdx.math.Vector2 r0 = r3._position
            float r0 = r0.y
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 / r1
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r4)
            float r0 = r3._scale
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r3._label
            com.badlogic.gdx.utils.StringBuilder r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            byte[] r0 = r0.getBytes()
            int r1 = r0.length
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r1, r4)
            int r1 = r0.length
            r2 = 0
            r4.write(r0, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r3._label
            com.badlogic.gdx.graphics.Color r0 = r0.getColor()
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r4)
            int r0 = r3._alignment
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r4)
            float r0 = r3._rotation
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r4)
            float r0 = r3._alpha
            org.fortheloss.sticknodes.App.writeFloatToOutputStream(r0, r4)
            boolean r0 = r3._drawAboveWidescreenBars
            r4.write(r0)
            boolean r0 = r3._locked
            r4.write(r0)
            boolean r0 = r3._hasShadow
            r4.write(r0)
            com.badlogic.gdx.graphics.Color r0 = r3._shadowColor
            int r0 = r0.toIntBits()
            org.fortheloss.sticknodes.App.writeIntToOutputStream(r0, r4)
            return
    }

    public boolean getDrawAboveWidescreenBars() {
            r1 = this;
            boolean r0 = r1._drawAboveWidescreenBars
            return r0
    }

    public int getFontID() {
            r1 = this;
            int r0 = r1._fontID
            return r0
    }

    public float getHeight() {
            r1 = this;
            float r0 = r1._height
            return r0
    }

    public int getID() {
            r1 = this;
            int r0 = r1._id
            return r0
    }

    public org.fortheloss.sticknodes.TextfieldBox getIsTouched(float r17, float r18) {
            r16 = this;
            r0 = r16
            float r1 = r16.getWidth()
            float r2 = r0._scale
            float r1 = r1 * r2
            float r2 = r16.getHeight()
            float r3 = r0._scale
            float r2 = r2 * r3
            float r3 = r16.getRotation()
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L3e
            float r3 = r16.getX()
            int r3 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r3 <= 0) goto Ld9
            float r3 = r16.getX()
            float r3 = r3 + r1
            int r1 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r1 >= 0) goto Ld9
            float r1 = r16.getY()
            int r1 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            if (r1 >= 0) goto Ld9
            float r1 = r16.getY()
            float r1 = r1 - r2
            int r1 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            if (r1 <= 0) goto Ld9
            return r0
        L3e:
            r3 = 1056964608(0x3f000000, float:0.5)
            float r4 = r1 * r3
            float r3 = r3 * r2
            float r1 = r1 * r2
            float r2 = r16.getX()
            float r2 = r2 + r4
            float r5 = r16.getY()
            float r5 = r5 - r3
            float r6 = r16.getRotation()
            float r6 = com.badlogic.gdx.math.MathUtils.cosDeg(r6)
            float r7 = r16.getRotation()
            float r7 = com.badlogic.gdx.math.MathUtils.sinDeg(r7)
            float r8 = -r4
            float r9 = r6 * r8
            float r9 = r9 + r2
            float r10 = r7 * r3
            float r11 = r9 - r10
            float r8 = r8 * r7
            float r8 = r8 + r5
            float r12 = r6 * r3
            float r13 = r8 + r12
            float r14 = r6 * r4
            float r2 = r2 + r14
            float r10 = r2 - r10
            float r4 = r4 * r7
            float r5 = r5 + r4
            float r12 = r12 + r5
            float r3 = -r3
            float r7 = r7 * r3
            float r2 = r2 - r7
            float r6 = r6 * r3
            float r5 = r5 + r6
            float r9 = r9 - r7
            float r8 = r8 + r6
            float r3 = r12 - r18
            float r3 = r3 * r11
            float r4 = r18 - r13
            float r4 = r4 * r10
            float r3 = r3 + r4
            float r4 = r13 - r12
            float r4 = r4 * r17
            float r3 = r3 + r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r3 = java.lang.Math.abs(r3)
            long r6 = (long) r3
            float r3 = r5 - r18
            float r10 = r10 * r3
            float r3 = r18 - r12
            float r3 = r3 * r2
            float r10 = r10 + r3
            float r12 = r12 - r5
            float r3 = r17 * r12
            float r10 = r10 + r3
            float r10 = r10 / r4
            float r3 = java.lang.Math.abs(r10)
            long r14 = (long) r3
            float r3 = r8 - r18
            float r2 = r2 * r3
            float r3 = r18 - r5
            float r3 = r3 * r9
            float r2 = r2 + r3
            float r5 = r5 - r8
            float r3 = r17 * r5
            float r2 = r2 + r3
            float r2 = r2 / r4
            float r2 = java.lang.Math.abs(r2)
            long r2 = (long) r2
            float r5 = r13 - r18
            float r9 = r9 * r5
            float r5 = r18 - r8
            float r11 = r11 * r5
            float r9 = r9 + r11
            float r8 = r8 - r13
            float r5 = r17 * r8
            float r9 = r9 + r5
            float r9 = r9 / r4
            float r4 = java.lang.Math.abs(r9)
            long r4 = (long) r4
            long r6 = r6 + r14
            long r6 = r6 + r2
            long r6 = r6 + r4
            float r2 = (float) r6
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 > 0) goto Ld9
            return r0
        Ld9:
            r1 = 0
            return r1
    }

    public void getProperties(org.fortheloss.sticknodes.data.useractions.TextfieldBoxProperties r3) {
            r2 = this;
            int r0 = r2._fontID
            r3.fontID = r0
            com.badlogic.gdx.math.Vector2 r0 = r2._position
            float r1 = r0.x
            r3.x = r1
            float r0 = r0.y
            r3.y = r0
            float r0 = r2._scale
            r3.scale = r0
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r2._label
            com.badlogic.gdx.utils.StringBuilder r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r3.text = r0
            com.badlogic.gdx.graphics.Color r0 = r3.color
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r2._label
            com.badlogic.gdx.graphics.Color r1 = r1.getColor()
            r0.set(r1)
            int r0 = r2._alignment
            r3.alignment = r0
            float r0 = r2._rotation
            r3.rotation = r0
            float r0 = r2._alpha
            r3.alpha = r0
            boolean r0 = r2._drawAboveWidescreenBars
            r3.drawAboveWidescreenBars = r0
            boolean r0 = r2._locked
            r3.locked = r0
            boolean r0 = r2._hasShadow
            r3.hasShadow = r0
            com.badlogic.gdx.graphics.Color r3 = r3.shadowColor
            com.badlogic.gdx.graphics.Color r0 = r2._shadowColor
            r3.set(r0)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IStageObject
    public float getRotation() {
            r1 = this;
            float r0 = r1._rotation
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IStageObject
    public float getScale() {
            r1 = this;
            float r0 = r1._scale
            return r0
    }

    public com.badlogic.gdx.graphics.Color getShadowColor() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1._shadowColor
            return r0
    }

    public java.lang.String getText() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r1._label
            com.badlogic.gdx.utils.StringBuilder r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            return r0
    }

    public float getWidth() {
            r1 = this;
            float r0 = r1._width
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IStageObject
    public float getX() {
            r1 = this;
            com.badlogic.gdx.math.Vector2 r0 = r1._position
            float r0 = r0.x
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IStageObject
    public float getY() {
            r1 = this;
            com.badlogic.gdx.math.Vector2 r0 = r1._position
            float r0 = r0.y
            return r0
    }

    public boolean hasShadow() {
            r1 = this;
            boolean r0 = r1._hasShadow
            return r0
    }

    public void interpolateValues(float r5, org.fortheloss.sticknodes.TextfieldBox r6) {
            r4 = this;
            com.badlogic.gdx.math.Vector2 r0 = r4._position
            float r1 = r0.x
            com.badlogic.gdx.math.Vector2 r2 = r6._position
            float r3 = r2.x
            float r3 = r3 - r1
            float r3 = r3 * r5
            float r1 = r1 + r3
            r0.x = r1
            float r1 = r0.y
            float r2 = r2.y
            float r2 = r2 - r1
            float r2 = r2 * r5
            float r1 = r1 + r2
            r0.y = r1
            float r0 = r4._scale
            float r1 = r6._scale
            float r1 = r1 - r0
            float r1 = r1 * r5
            float r0 = r0 + r1
            r4._scale = r0
            float r1 = r4._alpha
            float r2 = r6._alpha
            float r2 = r2 - r1
            float r2 = r2 * r5
            float r1 = r1 + r2
            r4._alpha = r1
            float r1 = r4._rotation
            float r6 = r6._rotation
            float r6 = r6 - r1
            r2 = 1127481344(0x43340000, float:180.0)
            float r6 = r6 + r2
            r3 = 1135869952(0x43b40000, float:360.0)
            float r6 = r6 % r3
            float r6 = r6 - r2
            r2 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 >= 0) goto L3f
            float r6 = r6 + r3
        L3f:
            float r6 = r6 * r5
            float r1 = r1 + r6
            r4._rotation = r1
            r5 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r5
            int r6 = java.lang.Math.round(r0)
            float r6 = (float) r6
            float r6 = r6 / r5
            r4._scale = r6
            float r6 = r4._rotation
            float r6 = r6 * r5
            int r6 = java.lang.Math.round(r6)
            float r6 = (float) r6
            float r6 = r6 / r5
            r4._rotation = r6
            float r6 = r4._alpha
            float r6 = r6 * r5
            int r6 = java.lang.Math.round(r6)
            float r6 = (float) r6
            float r6 = r6 / r5
            r4._alpha = r6
            return
    }

    public boolean isLocked() {
            r1 = this;
            boolean r0 = r1._locked
            return r0
    }

    public boolean isLockedToCamera() {
            r1 = this;
            boolean r0 = r1._flagLockedToCamera
            return r0
    }

    public void readData(int r7, java.io.DataInputStream r8, int r9) throws java.io.IOException {
            r6 = this;
            r0 = 176(0xb0, float:2.47E-43)
            if (r7 < r0) goto L8
            int r9 = r8.readInt()
        L8:
            r6._id = r9
            r9 = 244(0xf4, float:3.42E-43)
            r0 = 0
            if (r7 < r9) goto L14
            int r9 = r8.readInt()
            goto L15
        L14:
            r9 = 0
        L15:
            r6.setFontID(r9, r0)
            com.badlogic.gdx.math.Vector2 r9 = r6._position
            float r1 = r8.readFloat()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r2
            float r2 = r8.readFloat()
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r3
            r9.set(r1, r2)
            float r9 = r8.readFloat()
            r6._scale = r9
            int r9 = r8.readInt()
            byte[] r1 = new byte[r9]
            r8.readFully(r1, r0, r9)
            java.lang.String r9 = new java.lang.String
            r9.<init>(r1)
            r6._temporaryTextToSet = r9
            int r9 = r8.readInt()
            r1 = r9 & 255(0xff, float:3.57E-43)
            float r1 = (float) r1
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 / r2
            int r3 = r9 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            float r3 = (float) r3
            float r3 = r3 / r2
            int r9 = r9 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            float r9 = (float) r9
            float r9 = r9 / r2
            r6.setColor(r1, r3, r9)
            int r9 = r8.readInt()
            r6.setAlignment(r9)
            r9 = 237(0xed, float:3.32E-43)
            r1 = 0
            if (r7 < r9) goto L6d
            float r3 = r8.readFloat()
            goto L6e
        L6d:
            r3 = 0
        L6e:
            r6._rotation = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r7 < r9) goto L79
            float r9 = r8.readFloat()
            goto L7b
        L79:
            r9 = 1065353216(0x3f800000, float:1.0)
        L7b:
            r6._alpha = r9
            r9 = 310(0x136, float:4.34E-43)
            r4 = 1
            if (r7 < r9) goto L8a
            int r5 = r8.read()
            if (r5 == 0) goto L8a
            r5 = 1
            goto L8b
        L8a:
            r5 = 0
        L8b:
            r6._drawAboveWidescreenBars = r5
            if (r7 < r9) goto L97
            int r9 = r8.read()
            if (r9 == 0) goto L97
            r9 = 1
            goto L98
        L97:
            r9 = 0
        L98:
            r6._locked = r9
            r9 = 242(0xf2, float:3.39E-43)
            if (r7 < r9) goto Lc1
            int r7 = r8.read()
            if (r7 == 0) goto La5
            r0 = 1
        La5:
            r6._hasShadow = r0
            int r7 = r8.readInt()
            com.badlogic.gdx.graphics.Color r8 = r6._shadowColor
            r9 = r7 & 255(0xff, float:3.57E-43)
            float r9 = (float) r9
            float r9 = r9 / r2
            int r0 = r7 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            float r0 = r0 / r2
            int r7 = r7 >> 16
            r7 = r7 & 255(0xff, float:3.57E-43)
            float r7 = (float) r7
            float r7 = r7 / r2
            r8.set(r9, r0, r7, r3)
            goto Lc8
        Lc1:
            r6._hasShadow = r0
            com.badlogic.gdx.graphics.Color r7 = r6._shadowColor
            r7.set(r1, r1, r1, r3)
        Lc8:
            return
    }

    public void readDataOld(int r4, java.nio.ByteBuffer r5, int r6) {
            r3 = this;
            r3._id = r6
            r4 = 0
            r3.setFontID(r4, r4)
            com.badlogic.gdx.math.Vector2 r6 = r3._position
            float r0 = r5.getFloat()
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r1
            float r1 = r5.getFloat()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r2
            r6.set(r0, r1)
            float r6 = r5.getFloat()
            r3._scale = r6
            int r6 = r5.getInt()
            byte[] r0 = new byte[r6]
            r5.get(r0, r4, r6)
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
            r3._temporaryTextToSet = r6
            int r6 = r5.getInt()
            r0 = r6 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 / r1
            int r2 = r6 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            float r2 = (float) r2
            float r2 = r2 / r1
            int r6 = r6 >> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            float r6 = (float) r6
            float r6 = r6 / r1
            r3.setColor(r0, r2, r6)
            int r5 = r5.getInt()
            r3.setAlignment(r5)
            r5 = 0
            r3._rotation = r5
            r6 = 1065353216(0x3f800000, float:1.0)
            r3._alpha = r6
            r3._drawAboveWidescreenBars = r4
            r3._locked = r4
            r3._hasShadow = r4
            com.badlogic.gdx.graphics.Color r4 = r3._shadowColor
            r4.set(r5, r5, r5, r6)
            return
    }

    public void setAlignment(int r2) {
            r1 = this;
            r1._alignment = r2
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r1._label
            r0.setAlignment(r2, r2)
            return
    }

    public void setAlpha(float r3) {
            r2 = this;
            r2._alpha = r3
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto La
            r2._alpha = r0
            goto L12
        La:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L12
            r2._alpha = r0
        L12:
            float r3 = r2._alpha
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2._alpha = r3
            return
    }

    public void setColor(float r3, float r4, float r5) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r2._label
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setColor(r3, r4, r5, r1)
            return
    }

    public void setColor(com.badlogic.gdx.graphics.Color r5) {
            r4 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r4._label
            float r1 = r5.r
            float r2 = r5.g
            float r5 = r5.b
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.setColor(r1, r2, r5, r3)
            return
    }

    public void setDrawAboveWidescreenBars(boolean r1) {
            r0 = this;
            r0._drawAboveWidescreenBars = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IStageObject
    public void setFigureRotation(float r2) {
            r1 = this;
            r0 = 1135869952(0x43b40000, float:360.0)
            float r2 = r2 % r0
            r1._rotation = r2
            return
    }

    public void setFontID(int r2, boolean r3) {
            r1 = this;
            if (r3 != 0) goto L7
            int r3 = r1._fontID
            if (r2 != r3) goto L7
            return
        L7:
            r1._fontID = r2
            org.fortheloss.sticknodes.animationscreen.FontLoader r3 = r1.mFontLoaderRef
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = r3.getFontLabelStyle(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r1._label
            r3.setStyle(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r1._label
            com.badlogic.gdx.utils.StringBuilder r2 = r2.getText()
            int r2 = r2.length()
            if (r2 <= 0) goto L53
            com.badlogic.gdx.graphics.g2d.GlyphLayout r2 = r1._glyphLayout
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r1._label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = r3.getStyle()
            com.badlogic.gdx.graphics.g2d.BitmapFont r3 = r3.font
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r1._label
            com.badlogic.gdx.utils.StringBuilder r0 = r0.getText()
            r2.setText(r3, r0)
            com.badlogic.gdx.graphics.g2d.GlyphLayout r2 = r1._glyphLayout
            float r2 = r2.width
            r3 = 1101004800(0x41a00000, float:20.0)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r3
            float r2 = java.lang.Math.max(r2, r0)
            r1._width = r2
            com.badlogic.gdx.graphics.g2d.GlyphLayout r2 = r1._glyphLayout
            float r2 = r2.height
            r3 = 1082130432(0x40800000, float:4.0)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r3
            float r2 = java.lang.Math.max(r2, r0)
            r1._height = r2
        L53:
            return
    }

    public void setHasShadow(boolean r1) {
            r0 = this;
            r0._hasShadow = r1
            return
    }

    public void setID(int r1) {
            r0 = this;
            r0._id = r1
            return
    }

    public void setLocked(boolean r1) {
            r0 = this;
            r0._locked = r1
            return
    }

    public void setLockedToCamera(boolean r1) {
            r0 = this;
            r0._flagLockedToCamera = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IStageObject
    public void setPosition(float r2, float r3) {
            r1 = this;
            com.badlogic.gdx.math.Vector2 r0 = r1._position
            r0.set(r2, r3)
            return
    }

    public void setProperties(org.fortheloss.sticknodes.data.useractions.TextfieldBoxProperties r3) {
            r2 = this;
            int r0 = r3.fontID
            r1 = 0
            r2.setFontID(r0, r1)
            com.badlogic.gdx.math.Vector2 r0 = r2._position
            float r1 = r3.x
            r0.x = r1
            float r1 = r3.y
            r0.y = r1
            float r0 = r3.scale
            r2._scale = r0
            java.lang.String r0 = r3.text
            r2.setText(r0)
            com.badlogic.gdx.graphics.Color r0 = r3.color
            r2.setColor(r0)
            int r0 = r3.alignment
            r2.setAlignment(r0)
            float r0 = r3.rotation
            r2._rotation = r0
            float r0 = r3.alpha
            r2._alpha = r0
            boolean r0 = r3.drawAboveWidescreenBars
            r2._drawAboveWidescreenBars = r0
            boolean r0 = r3.locked
            r2._locked = r0
            boolean r0 = r3.hasShadow
            r2._hasShadow = r0
            com.badlogic.gdx.graphics.Color r0 = r2._shadowColor
            com.badlogic.gdx.graphics.Color r3 = r3.shadowColor
            r0.set(r3)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.IStageObject
    public void setScale(float r3) {
            r2 = this;
            r2._scale = r3
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Lc
            r2._scale = r0
            goto L14
        Lc:
            r0 = 1092616192(0x41200000, float:10.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L14
            r2._scale = r0
        L14:
            return
    }

    public void setShadowColor(com.badlogic.gdx.graphics.Color r5) {
            r4 = this;
            com.badlogic.gdx.graphics.Color r0 = r4._shadowColor
            float r1 = r5.r
            float r2 = r5.g
            float r5 = r5.b
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.set(r1, r2, r5, r3)
            return
    }

    public void setText(java.lang.String r5) {
            r4 = this;
            boolean r0 = r5.isEmpty()
            r1 = 1082130432(0x40800000, float:4.0)
            r2 = 1101004800(0x41a00000, float:20.0)
            if (r0 == 0) goto L42
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4._label
            java.lang.String r0 = " "
            r5.setText(r0)
            com.badlogic.gdx.graphics.g2d.GlyphLayout r5 = r4._glyphLayout
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r4._label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = r3.getStyle()
            com.badlogic.gdx.graphics.g2d.BitmapFont r3 = r3.font
            r5.setText(r3, r0)
            com.badlogic.gdx.graphics.g2d.GlyphLayout r5 = r4._glyphLayout
            float r5 = r5.width
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r2
            float r5 = java.lang.Math.max(r5, r0)
            r4._width = r5
            com.badlogic.gdx.graphics.g2d.GlyphLayout r5 = r4._glyphLayout
            float r5 = r5.height
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r1
            float r5 = java.lang.Math.max(r5, r0)
            r4._height = r5
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4._label
            java.lang.String r0 = ""
            r5.setText(r0)
            goto L70
        L42:
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r4._label
            r0.setText(r5)
            com.badlogic.gdx.graphics.g2d.GlyphLayout r0 = r4._glyphLayout
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r4._label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = r3.getStyle()
            com.badlogic.gdx.graphics.g2d.BitmapFont r3 = r3.font
            r0.setText(r3, r5)
            com.badlogic.gdx.graphics.g2d.GlyphLayout r5 = r4._glyphLayout
            float r5 = r5.width
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r2
            float r5 = java.lang.Math.max(r5, r0)
            r4._width = r5
            com.badlogic.gdx.graphics.g2d.GlyphLayout r5 = r4._glyphLayout
            float r5 = r5.height
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r1
            float r5 = java.lang.Math.max(r5, r0)
            r4._height = r5
        L70:
            return
    }

    public void setTextFromTemporaryText() {
            r2 = this;
            java.lang.String r0 = r2._temporaryTextToSet
            r2.setText(r0)
            r0 = 0
            r2._temporaryTextToSet = r0
            int r0 = r2._fontID
            r1 = 1
            r2.setFontID(r0, r1)
            return
    }

    public void setTweenedValues(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0._tweenedX = r1
            r0._tweenedY = r2
            r0._tweenedScale = r3
            r0._tweenedRotation = r4
            return
    }

    public void setTweenedValues(float r5, org.fortheloss.sticknodes.TextfieldBox r6, org.fortheloss.sticknodes.TextfieldBox r7) {
            r4 = this;
            if (r7 == 0) goto L47
            com.badlogic.gdx.math.Vector2 r0 = r6._position
            float r1 = r0.x
            com.badlogic.gdx.math.Vector2 r2 = r7._position
            float r3 = r2.x
            float r3 = r3 - r1
            float r3 = r3 * r5
            float r1 = r1 + r3
            r4._tweenedX = r1
            float r0 = r0.y
            float r1 = r2.y
            float r1 = r1 - r0
            float r1 = r1 * r5
            float r0 = r0 + r1
            r4._tweenedY = r0
            float r0 = r6._scale
            float r1 = r7._scale
            float r1 = r1 - r0
            float r1 = r1 * r5
            float r0 = r0 + r1
            r4._tweenedScale = r0
            float r0 = r6._alpha
            float r1 = r7._alpha
            float r1 = r1 - r0
            float r1 = r1 * r5
            float r0 = r0 + r1
            r4._tweenedAlpha = r0
            float r6 = r6._rotation
            float r7 = r7._rotation
            float r7 = r7 - r6
            r0 = 1127481344(0x43340000, float:180.0)
            float r7 = r7 + r0
            r1 = 1135869952(0x43b40000, float:360.0)
            float r7 = r7 % r1
            float r7 = r7 - r0
            r0 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto L41
            float r7 = r7 + r1
        L41:
            float r7 = r7 * r5
            float r6 = r6 + r7
            r4._tweenedRotation = r6
            goto L5d
        L47:
            com.badlogic.gdx.math.Vector2 r5 = r6._position
            float r7 = r5.x
            r4._tweenedX = r7
            float r5 = r5.y
            r4._tweenedY = r5
            float r5 = r6._scale
            r4._tweenedScale = r5
            float r5 = r6._rotation
            r4._tweenedRotation = r5
            float r5 = r6._alpha
            r4._tweenedAlpha = r5
        L5d:
            return
    }

    public void setTweenedValues(org.fortheloss.sticknodes.TextfieldBox r3) {
            r2 = this;
            com.badlogic.gdx.math.Vector2 r0 = r3._position
            float r1 = r0.x
            r2._tweenedX = r1
            float r0 = r0.y
            r2._tweenedY = r0
            float r0 = r3._scale
            r2._tweenedScale = r0
            float r0 = r3._rotation
            r2._tweenedRotation = r0
            float r3 = r3._alpha
            r2._tweenedAlpha = r3
            return
    }
}
