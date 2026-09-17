package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class PreviewSpriteDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private org.fortheloss.framework.AnimationWidget mAnimWidget;
    private com.badlogic.gdx.graphics.glutils.FrameBuffer mFbo;
    private com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Texture> mFboTs;
    private com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.glutils.FrameBuffer> mFbos;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton mSaveButton;
    private org.fortheloss.sticknodes.sprite.SpriteRef mSprite;


    /* renamed from: -$$Nest$fgetmSaveButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextButton m604$$Nest$fgetmSaveButton(org.fortheloss.sticknodes.animationscreen.dialogs.PreviewSpriteDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r0.mSaveButton
            return r0
    }

    public PreviewSpriteDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void renderSprite(org.fortheloss.sticknodes.SNShapeRenderer r20, com.badlogic.gdx.graphics.g2d.Batch r21) {
            r19 = this;
            r0 = r19
            r10 = r20
            r11 = r21
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1142947840(0x44200000, float:640.0)
            float r2 = r2 * r1
            int r2 = (int) r2
            r3 = 1139802112(0x43f00000, float:480.0)
            float r1 = r1 * r3
            int r1 = (int) r1
            float r12 = (float) r2
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            float r13 = r12 * r3
            float r14 = (float) r1
            float r15 = r14 * r3
            com.badlogic.gdx.graphics.Pixmap$Format r3 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888     // Catch: java.lang.IllegalStateException -> L2a
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = r2
            r5 = r1
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.IllegalStateException -> L2a
            r0.mFbo = r3     // Catch: java.lang.IllegalStateException -> L2a
            goto L38
        L2a:
            com.badlogic.gdx.graphics.Pixmap$Format r3 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA4444
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = r2
            r5 = r1
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r3, r4, r5, r6, r7, r8, r9)
            r0.mFbo = r1
        L38:
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r0.mFbo
            if (r1 != 0) goto L3d
            return
        L3d:
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r0.mSprite
            com.badlogic.gdx.graphics.Texture r16 = r1.getTexture()
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r0.mSprite
            float r1 = r1.getScaledWidth()
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = r0.mSprite
            float r2 = r2.getScaledHeight()
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto L55
            float r13 = r13 / r1
            goto L57
        L55:
            float r13 = r15 / r2
        L57:
            float r15 = r1 * r13
            float r13 = r13 * r2
            com.badlogic.gdx.utils.viewport.ScreenViewport r9 = new com.badlogic.gdx.utils.viewport.ScreenViewport
            r9.<init>()
            com.badlogic.gdx.graphics.Camera r1 = r9.getCamera()
            com.badlogic.gdx.math.Vector3 r1 = r1.position
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0.mFbo
            int r2 = r2.getWidth()
            int r2 = r2 / 2
            float r2 = (float) r2
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r0.mFbo
            int r3 = r3.getHeight()
            int r3 = r3 / 2
            float r3 = (float) r3
            r4 = 0
            r1.set(r2, r3, r4)
            com.badlogic.gdx.graphics.Camera r1 = r9.getCamera()
            com.badlogic.gdx.math.Vector3 r1 = r1.up
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.set(r4, r2, r4)
            com.badlogic.gdx.graphics.Camera r1 = r9.getCamera()
            com.badlogic.gdx.math.Vector3 r1 = r1.direction
            r8 = 1065353216(0x3f800000, float:1.0)
            r1.set(r4, r4, r8)
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r0.mFbo
            int r1 = r1.getWidth()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0.mFbo
            int r2 = r2.getHeight()
            r3 = 0
            r9.update(r1, r2, r3)
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r0.mFbo
            r1.begin()
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r1.glClearColor(r8, r8, r8, r8)
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r2 = 16384(0x4000, float:2.2959E-41)
            r1.glClear(r2)
            r9.apply(r3)
            com.badlogic.gdx.graphics.Camera r1 = r9.getCamera()
            com.badlogic.gdx.math.Matrix4 r1 = r1.combined
            r10.setProjectionMatrix(r1)
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r1 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r10.begin(r1)
            r2 = 0
            r3 = 0
            com.badlogic.gdx.graphics.Color r7 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY
            com.badlogic.gdx.graphics.Color r17 = org.fortheloss.sticknodes.App.COLOR_OFF_WHITE
            r1 = r20
            r4 = r12
            r5 = r14
            r6 = r7
            r8 = r17
            r18 = r9
            r9 = r17
            r1.rect(r2, r3, r4, r5, r6, r7, r8, r9)
            r20.end()
            com.badlogic.gdx.graphics.Camera r1 = r18.getCamera()
            com.badlogic.gdx.math.Matrix4 r1 = r1.combined
            r11.setProjectionMatrix(r1)
            r21.begin()
            r1 = 1
            r7 = 771(0x303, float:1.08E-42)
            r11.setBlendFunction(r1, r7)
            r1 = 1065353216(0x3f800000, float:1.0)
            r11.setColor(r1, r1, r1, r1)
            float r12 = r12 - r15
            r1 = 1056964608(0x3f000000, float:0.5)
            float r3 = r12 * r1
            float r14 = r14 - r13
            float r4 = r14 * r1
            r1 = r21
            r2 = r16
            r5 = r15
            r6 = r13
            r1.draw(r2, r3, r4, r5, r6)
            r1 = 0
            r11.setShader(r1)
            r21.end()
            r1 = 770(0x302, float:1.079E-42)
            r11.setBlendFunction(r1, r7)
            com.badlogic.gdx.graphics.GL20 r2 = com.badlogic.gdx.Gdx.gl
            r2.glBlendFuncSeparate(r1, r7, r1, r7)
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r0.mFbo
            r1.end()
            return
    }

    private void renderSpriteGroup(org.fortheloss.sticknodes.SNShapeRenderer r30, com.badlogic.gdx.graphics.g2d.Batch r31) {
            r29 = this;
            r0 = r29
            r10 = r30
            r11 = r31
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1142947840(0x44200000, float:640.0)
            float r2 = r2 * r1
            int r12 = (int) r2
            r2 = 1139802112(0x43f00000, float:480.0)
            float r1 = r1 * r2
            int r13 = (int) r1
            float r14 = (float) r12
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            float r15 = r14 * r1
            float r2 = (float) r13
            float r16 = r2 * r1
            com.badlogic.gdx.utils.viewport.ScreenViewport r1 = new com.badlogic.gdx.utils.viewport.ScreenViewport
            r1.<init>()
            com.badlogic.gdx.graphics.Camera r3 = r1.getCamera()
            com.badlogic.gdx.math.Vector3 r3 = r3.position
            int r4 = r12 / 2
            float r4 = (float) r4
            int r5 = r13 / 2
            float r5 = (float) r5
            r6 = 0
            r3.set(r4, r5, r6)
            com.badlogic.gdx.graphics.Camera r3 = r1.getCamera()
            com.badlogic.gdx.math.Vector3 r3 = r3.up
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.set(r6, r4, r6)
            com.badlogic.gdx.graphics.Camera r3 = r1.getCamera()
            com.badlogic.gdx.math.Vector3 r3 = r3.direction
            r9 = 1065353216(0x3f800000, float:1.0)
            r3.set(r6, r6, r9)
            r8 = 0
            r1.update(r12, r13, r8)
            org.fortheloss.sticknodes.sprite.SpriteRef r3 = r0.mSprite
            r7 = r3
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r7 = (org.fortheloss.sticknodes.sprite.SpriteGroupRef) r7
            int r3 = r7.getNumStates()
            r4 = 5
            r6 = 1
            if (r3 >= r4) goto L5b
            r5 = r3
            r17 = 1
            goto L63
        L5b:
            float r3 = (float) r3
            r5 = 1084227584(0x40a00000, float:5.0)
            float r3 = r3 / r5
            int r3 = (int) r3
            r17 = r3
            r5 = 5
        L63:
            com.badlogic.gdx.utils.Array r3 = new com.badlogic.gdx.utils.Array
            r3.<init>(r5)
            r0.mFbos = r3
            com.badlogic.gdx.utils.Array r3 = new com.badlogic.gdx.utils.Array
            r3.<init>(r5)
            r0.mFboTs = r3
            r4 = 0
        L72:
            if (r4 >= r5) goto L197
            com.badlogic.gdx.graphics.Pixmap$Format r3 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888     // Catch: java.lang.IllegalStateException -> L96
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = r4
            r4 = r12
            r23 = r5
            r5 = r13
            r6 = r18
            r18 = r2
            r2 = r7
            r7 = r19
            r8 = r20
            r11 = 1065353216(0x3f800000, float:1.0)
            r9 = r21
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.IllegalStateException -> L9f
            goto Lab
        L96:
            r18 = r2
            r22 = r4
            r23 = r5
            r2 = r7
            r11 = 1065353216(0x3f800000, float:1.0)
        L9f:
            com.badlogic.gdx.graphics.Pixmap$Format r3 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA4444
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = r12
            r5 = r13
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r3, r4, r5, r6, r7, r8, r9)
        Lab:
            r9 = r3
            if (r9 != 0) goto Lbb
            r7 = r31
            r25 = r1
            r26 = r2
            r8 = 1065353216(0x3f800000, float:1.0)
            r11 = 1
            r27 = 0
            goto L186
        Lbb:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.glutils.FrameBuffer> r3 = r0.mFbos
            r3.add(r9)
            r9.begin()
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl
            r3.glClearColor(r11, r11, r11, r11)
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl
            r4 = 16384(0x4000, float:2.2959E-41)
            r3.glClear(r4)
            int r4 = r22 * r17
            org.fortheloss.sticknodes.sprite.SpriteSource r3 = r2.getSpriteSourceAtState(r4)
            com.badlogic.gdx.graphics.Texture r19 = r3.getTexture()
            int r3 = r19.getWidth()
            float r3 = (float) r3
            org.fortheloss.sticknodes.sprite.SpriteSource r5 = r2.getSpriteSourceAtState(r4)
            float r5 = r5.getInternalScaleX()
            float r3 = r3 * r5
            int r5 = r19.getHeight()
            float r5 = (float) r5
            org.fortheloss.sticknodes.sprite.SpriteSource r4 = r2.getSpriteSourceAtState(r4)
            float r4 = r4.getInternalScaleY()
            float r5 = r5 * r4
            int r4 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lfe
            float r4 = r15 / r3
            goto L100
        Lfe:
            float r4 = r16 / r5
        L100:
            float r20 = r3 * r4
            float r21 = r5 * r4
            r8 = 0
            r1.apply(r8)
            com.badlogic.gdx.graphics.Camera r3 = r1.getCamera()
            com.badlogic.gdx.math.Matrix4 r3 = r3.combined
            r10.setProjectionMatrix(r3)
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r3 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r10.begin(r3)
            r3 = 0
            r4 = 0
            com.badlogic.gdx.graphics.Color r7 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY
            com.badlogic.gdx.graphics.Color r24 = org.fortheloss.sticknodes.App.COLOR_OFF_WHITE
            r25 = r1
            r1 = r30
            r26 = r2
            r2 = r3
            r3 = r4
            r4 = r14
            r5 = r18
            r6 = r7
            r27 = 0
            r8 = r24
            r28 = r9
            r9 = r24
            r1.rect(r2, r3, r4, r5, r6, r7, r8, r9)
            r30.end()
            com.badlogic.gdx.graphics.Camera r1 = r25.getCamera()
            com.badlogic.gdx.math.Matrix4 r1 = r1.combined
            r7 = r31
            r8 = 1065353216(0x3f800000, float:1.0)
            r7.setProjectionMatrix(r1)
            r31.begin()
            r31.flush()
            r9 = 771(0x303, float:1.08E-42)
            r11 = 1
            r7.setBlendFunction(r11, r9)
            r7.setColor(r8, r8, r8, r8)
            float r1 = r14 - r20
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r1 * r2
            float r1 = r18 - r21
            float r4 = r1 * r2
            r1 = r31
            r2 = r19
            r5 = r20
            r6 = r21
            r1.draw(r2, r3, r4, r5, r6)
            r1 = 0
            r7.setShader(r1)
            r31.end()
            r1 = 770(0x302, float:1.079E-42)
            r7.setBlendFunction(r1, r9)
            com.badlogic.gdx.graphics.GL20 r2 = com.badlogic.gdx.Gdx.gl
            r2.glBlendFuncSeparate(r1, r9, r1, r9)
            r28.end()
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Texture> r1 = r0.mFboTs
            com.badlogic.gdx.graphics.GLTexture r2 = r28.getColorBufferTexture()
            com.badlogic.gdx.graphics.Texture r2 = (com.badlogic.gdx.graphics.Texture) r2
            r1.add(r2)
        L186:
            int r4 = r22 + 1
            r11 = r7
            r2 = r18
            r5 = r23
            r1 = r25
            r7 = r26
            r6 = 1
            r8 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L72
        L197:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r2) {
            r1 = this;
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != 0) goto L9
            goto L27
        L9:
            r0 = 1
            if (r2 != r0) goto L27
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = r1.mSprite
            boolean r2 = r2 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupRef
            if (r2 == 0) goto L13
            return
        L13:
            org.fortheloss.sticknodes.animationscreen.dialogs.PreviewSpriteDialog$1 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.PreviewSpriteDialog$1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r2.<init>(r1, r0)
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r1.mSprite
            r2.initialize(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.addDialogToStage(r2)
            r1.doNotHideDialog()
        L27:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r3.mFbo
            r1 = 0
            if (r0 == 0) goto La
            r0.dispose()
            r3.mFbo = r1
        La:
            r3.mFboTs = r1
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.glutils.FrameBuffer> r0 = r3.mFbos
            if (r0 == 0) goto L26
            int r0 = r0.size
            int r0 = r0 + (-1)
        L14:
            if (r0 < 0) goto L24
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.glutils.FrameBuffer> r2 = r3.mFbos
            java.lang.Object r2 = r2.get(r0)
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = (com.badlogic.gdx.graphics.glutils.FrameBuffer) r2
            r2.dispose()
            int r0 = r0 + (-1)
            goto L14
        L24:
            r3.mFbos = r1
        L26:
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r3.mSprite
            if (r0 == 0) goto L2f
            r0.dispose()
            r3.mSprite = r1
        L2f:
            org.fortheloss.framework.AnimationWidget r0 = r3.mAnimWidget
            if (r0 == 0) goto L38
            r0.dispose()
            r3.mAnimWidget = r1
        L38:
            r3.mSaveButton = r1
            super.dispose()
            return
    }

    public void initialize(int r6) {
            r5 = this;
            java.lang.String r0 = "previewSpriteTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            org.fortheloss.sticknodes.data.ProjectData r0 = r0.getProjectData()
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r0 = r0.librarySprites
            java.lang.Object r6 = r0.get(r6)
            org.fortheloss.sticknodes.sprite.ISpriteSource r6 = (org.fortheloss.sticknodes.sprite.ISpriteSource) r6
            boolean r0 = r6 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupSource
            if (r0 == 0) goto L28
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r0 = new org.fortheloss.sticknodes.sprite.SpriteGroupRef
            r0.<init>()
            r5.mSprite = r0
            org.fortheloss.sticknodes.sprite.SpriteGroupSource r6 = (org.fortheloss.sticknodes.sprite.SpriteGroupSource) r6
            r0.setSpriteGroupSource(r6)
            goto L34
        L28:
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = new org.fortheloss.sticknodes.sprite.SpriteRef
            r0.<init>()
            r5.mSprite = r0
            org.fortheloss.sticknodes.sprite.SpriteSource r6 = (org.fortheloss.sticknodes.sprite.SpriteSource) r6
            r0.setSpriteSource(r6)
        L34:
            org.fortheloss.sticknodes.sprite.SpriteRef r6 = r5.mSprite
            r0 = 0
            r1 = 1
            if (r6 == 0) goto Lc5
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = r5.mSprite
            java.lang.String r2 = r2.getName()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r6.<init>(r2, r3)
            r6.setWrap(r1)
            r6.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.addContent(r6)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            r6.width(r2)
            r5.addContentRow()
            org.fortheloss.sticknodes.sprite.SpriteRef r6 = r5.mSprite
            boolean r6 = r6 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupRef
            if (r6 == 0) goto L98
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r6 = r5._animationScreenRef
            org.fortheloss.sticknodes.SNShapeRenderer r6 = r6.getShapeRenderer()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r5._animationScreenRef
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r2.getStage()
            com.badlogic.gdx.graphics.g2d.Batch r2 = r2.getBatch()
            r5.renderSpriteGroup(r6, r2)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.Texture> r6 = r5.mFboTs
            if (r6 == 0) goto Lc5
            com.badlogic.gdx.graphics.g2d.Animation r2 = new com.badlogic.gdx.graphics.g2d.Animation
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            com.badlogic.gdx.graphics.g2d.Animation$PlayMode r4 = com.badlogic.gdx.graphics.g2d.Animation.PlayMode.LOOP
            r2.<init>(r3, r6, r4)
            org.fortheloss.framework.AnimationWidget r6 = new org.fortheloss.framework.AnimationWidget
            r6.<init>(r2, r0, r0)
            r5.mAnimWidget = r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.addContent(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.expandX()
            r6.align(r1)
            goto Lc5
        L98:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r6 = r5._animationScreenRef
            org.fortheloss.sticknodes.SNShapeRenderer r6 = r6.getShapeRenderer()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r5._animationScreenRef
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r2.getStage()
            com.badlogic.gdx.graphics.g2d.Batch r2 = r2.getBatch()
            r5.renderSprite(r6, r2)
            com.badlogic.gdx.graphics.glutils.FrameBuffer r6 = r5.mFbo
            if (r6 == 0) goto Lc5
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.GLTexture r6 = r6.getColorBufferTexture()
            com.badlogic.gdx.graphics.Texture r6 = (com.badlogic.gdx.graphics.Texture) r6
            r2.<init>(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.addContent(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.expandX()
            r6.align(r1)
        Lc5:
            java.lang.String r6 = "okay"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r5.createTextButton(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.addButton(r6, r0)
            org.fortheloss.sticknodes.sprite.SpriteRef r6 = r5.mSprite
            if (r6 == 0) goto L11a
            boolean r6 = r6 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupRef
            if (r6 != 0) goto L11a
            java.lang.String r6 = "saveSpriteToFile"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r6 = "..."
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r5.createTextButton(r6, r1)
            r5.mSaveButton = r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.addButton(r6, r0)
            org.fortheloss.sticknodes.sprite.SpriteRef r6 = r5.mSprite
            boolean r6 = r6.hasRawRgbData()
            if (r6 != 0) goto L11a
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r5.mSaveButton
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 1065353216(0x3f800000, float:1.0)
            r6.setColor(r1, r1, r1, r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r5.mSaveButton
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r6.setTouchable(r0)
        L11a:
            return
    }
}
