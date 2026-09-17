package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class RemoveSpriteBackgroundDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private com.badlogic.gdx.graphics.g2d.Batch mBatchRef;
    private org.fortheloss.framework.ColorPicker mColorPicker;
    private com.badlogic.gdx.graphics.Color mColorToRemove;
    private org.fortheloss.framework.RepeatingImage mRepeatingTransparencyBg;
    private com.badlogic.gdx.graphics.glutils.ShaderProgram mShaderColorRemoveRef;
    private int mSpread;
    private org.fortheloss.framework.LabelInputIncrementField mSpreadField;
    private com.badlogic.gdx.graphics.Texture mTexture;
    private int mThreshold;
    private org.fortheloss.framework.LabelInputIncrementField mThresholdField;
    private com.badlogic.gdx.graphics.g2d.TextureRegion mTransparencyTexRef;







    /* renamed from: -$$Nest$fgetmColorPicker, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ColorPicker m605$$Nest$fgetmColorPicker(org.fortheloss.sticknodes.animationscreen.dialogs.RemoveSpriteBackgroundDialog r0) {
            org.fortheloss.framework.ColorPicker r0 = r0.mColorPicker
            return r0
    }

    /* renamed from: -$$Nest$fgetmColorToRemove, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.graphics.Color m606$$Nest$fgetmColorToRemove(org.fortheloss.sticknodes.animationscreen.dialogs.RemoveSpriteBackgroundDialog r0) {
            com.badlogic.gdx.graphics.Color r0 = r0.mColorToRemove
            return r0
    }

    /* renamed from: -$$Nest$fgetmShaderColorRemoveRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.graphics.glutils.ShaderProgram m607$$Nest$fgetmShaderColorRemoveRef(org.fortheloss.sticknodes.animationscreen.dialogs.RemoveSpriteBackgroundDialog r0) {
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = r0.mShaderColorRemoveRef
            return r0
    }

    /* renamed from: -$$Nest$fgetmSpread, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m608$$Nest$fgetmSpread(org.fortheloss.sticknodes.animationscreen.dialogs.RemoveSpriteBackgroundDialog r0) {
            int r0 = r0.mSpread
            return r0
    }

    /* renamed from: -$$Nest$fgetmTexture, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.graphics.Texture m609$$Nest$fgetmTexture(org.fortheloss.sticknodes.animationscreen.dialogs.RemoveSpriteBackgroundDialog r0) {
            com.badlogic.gdx.graphics.Texture r0 = r0.mTexture
            return r0
    }

    /* renamed from: -$$Nest$fgetmThreshold, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m610$$Nest$fgetmThreshold(org.fortheloss.sticknodes.animationscreen.dialogs.RemoveSpriteBackgroundDialog r0) {
            int r0 = r0.mThreshold
            return r0
    }

    /* renamed from: -$$Nest$fputmSpread, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m611$$Nest$fputmSpread(org.fortheloss.sticknodes.animationscreen.dialogs.RemoveSpriteBackgroundDialog r0, int r1) {
            r0.mSpread = r1
            return
    }

    /* renamed from: -$$Nest$fputmThreshold, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m612$$Nest$fputmThreshold(org.fortheloss.sticknodes.animationscreen.dialogs.RemoveSpriteBackgroundDialog r0, int r1) {
            r0.mThreshold = r1
            return
    }

    public RemoveSpriteBackgroundDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r5, com.badlogic.gdx.graphics.Pixmap r6, boolean r7, com.badlogic.gdx.graphics.g2d.TextureRegion r8) {
            r4 = this;
            r4.<init>(r5)
            r0 = 1
            r4.mThreshold = r0
            r0 = 100
            r4.mSpread = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            org.fortheloss.framework.Assets r0 = r0.getAssets()
            java.lang.String r1 = org.fortheloss.sticknodes.App.shaderRemoveColor
            java.lang.Class<com.badlogic.gdx.graphics.glutils.ShaderProgram> r2 = com.badlogic.gdx.graphics.glutils.ShaderProgram.class
            r3 = 0
            java.lang.Object r0 = r0.get(r1, r2, r3)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r0 = (com.badlogic.gdx.graphics.glutils.ShaderProgram) r0
            r4.mShaderColorRemoveRef = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r1 = 0
            r0.<init>(r1, r1, r1, r1)
            r4.mColorToRemove = r0
            r4.mTransparencyTexRef = r8
            com.badlogic.gdx.scenes.scene2d.Stage r5 = r5.getStage()
            com.badlogic.gdx.graphics.g2d.Batch r5 = r5.getBatch()
            r4.mBatchRef = r5
            com.badlogic.gdx.graphics.Texture r5 = new com.badlogic.gdx.graphics.Texture
            r5.<init>(r6, r3)
            r4.mTexture = r5
            if (r7 == 0) goto L40
            com.badlogic.gdx.graphics.Texture$TextureFilter r6 = com.badlogic.gdx.graphics.Texture.TextureFilter.Linear
            r5.setFilter(r6, r6)
            goto L45
        L40:
            com.badlogic.gdx.graphics.Texture$TextureFilter r6 = com.badlogic.gdx.graphics.Texture.TextureFilter.Nearest
            r5.setFilter(r6, r6)
        L45:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L125
            int r1 = r0.mThreshold
            if (r1 <= 0) goto L125
            com.badlogic.gdx.graphics.Texture r1 = r0.mTexture
            int r1 = r1.getWidth()
            com.badlogic.gdx.graphics.Texture r4 = r0.mTexture
            int r12 = r4.getHeight()
            com.badlogic.gdx.graphics.Pixmap$Format r13 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = r13
            r5 = r1
            r6 = r12
            com.badlogic.gdx.graphics.glutils.FrameBuffer r14 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r4, r5, r6, r7, r8, r9)
            com.badlogic.gdx.utils.viewport.ScreenViewport r4 = new com.badlogic.gdx.utils.viewport.ScreenViewport
            r4.<init>()
            com.badlogic.gdx.graphics.Camera r5 = r4.getCamera()
            com.badlogic.gdx.math.Vector3 r5 = r5.position
            float r10 = (float) r1
            r6 = 1073741824(0x40000000, float:2.0)
            float r7 = r10 / r6
            float r9 = (float) r12
            float r6 = r9 / r6
            r8 = 0
            r5.set(r7, r6, r8)
            r4.update(r1, r12, r3)
            int r5 = r1 * r12
            int r15 = r5 * 4
            java.nio.ByteBuffer r5 = com.badlogic.gdx.utils.BufferUtils.newByteBuffer(r15)
            byte[] r11 = new byte[r15]
            r14.begin()
            com.badlogic.gdx.graphics.GL20 r6 = com.badlogic.gdx.Gdx.gl
            r6.glClearColor(r8, r8, r8, r8)
            com.badlogic.gdx.graphics.GL20 r6 = com.badlogic.gdx.Gdx.gl
            r7 = 16384(0x4000, float:2.2959E-41)
            r6.glClear(r7)
            r4.apply(r3)
            com.badlogic.gdx.graphics.g2d.Batch r6 = r0.mBatchRef
            r6.begin()
            com.badlogic.gdx.graphics.g2d.Batch r6 = r0.mBatchRef
            r7 = 1065353216(0x3f800000, float:1.0)
            r6.setColor(r7, r7, r7, r7)
            com.badlogic.gdx.graphics.g2d.Batch r6 = r0.mBatchRef
            com.badlogic.gdx.graphics.Camera r4 = r4.getCamera()
            com.badlogic.gdx.math.Matrix4 r4 = r4.combined
            r6.setProjectionMatrix(r4)
            com.badlogic.gdx.graphics.g2d.Batch r4 = r0.mBatchRef
            com.badlogic.gdx.graphics.glutils.ShaderProgram r6 = r0.mShaderColorRemoveRef
            r4.setShader(r6)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r4 = r0.mShaderColorRemoveRef
            com.badlogic.gdx.graphics.Color r6 = r0.mColorToRemove
            float r7 = r6.r
            float r8 = r6.g
            float r6 = r6.b
            java.lang.String r3 = "u_removeColor"
            r4.setUniformf(r3, r7, r8, r6)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r3 = r0.mShaderColorRemoveRef
            int r4 = r0.mThreshold
            float r4 = (float) r4
            r6 = 1132462080(0x43800000, float:256.0)
            float r4 = r4 / r6
            java.lang.String r6 = "u_threshold"
            r3.setUniformf(r6, r4)
            com.badlogic.gdx.graphics.glutils.ShaderProgram r3 = r0.mShaderColorRemoveRef
            int r4 = r0.mSpread
            float r4 = (float) r4
            r6 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r6
            java.lang.String r6 = "u_spread"
            r3.setUniformf(r6, r4)
            com.badlogic.gdx.graphics.g2d.Batch r6 = r0.mBatchRef
            com.badlogic.gdx.graphics.Texture r7 = r0.mTexture
            r8 = 0
            int r3 = -r12
            float r3 = (float) r3
            r4 = r11
            r11 = r3
            r6.draw(r7, r8, r9, r10, r11)
            com.badlogic.gdx.graphics.g2d.Batch r3 = r0.mBatchRef
            r3.end()
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl
            r6 = 3333(0xd05, float:4.67E-42)
            r3.glPixelStorei(r6, r2)
            r5.clear()
            com.badlogic.gdx.graphics.GL20 r3 = com.badlogic.gdx.Gdx.gl
            r6 = 0
            r7 = 0
            r9 = 6408(0x1908, float:8.98E-42)
            r10 = 5121(0x1401, float:7.176E-42)
            r11 = r4
            r4 = r3
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r1
            r8 = r12
            r2 = r11
            r11 = r3
            r4.glReadPixels(r5, r6, r7, r8, r9, r10, r11)
            r3.clear()
            r3.get(r2)
            r14.end()
            com.badlogic.gdx.graphics.Pixmap r3 = new com.badlogic.gdx.graphics.Pixmap
            r3.<init>(r1, r12, r13)
            r4 = 0
        Le5:
            if (r4 >= r15) goto L111
            int r5 = r4 / 4
            int r6 = r5 % r1
            int r5 = r5 / r1
            r7 = r2[r4]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 24
            int r8 = r4 + 1
            r8 = r2[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 16
            r7 = r7 | r8
            int r8 = r4 + 2
            r8 = r2[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            r7 = r7 | r8
            int r8 = r4 + 3
            r8 = r2[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r7 = r7 | r8
            r3.drawPixel(r6, r5, r7)
            int r4 = r4 + 4
            goto Le5
        L111:
            r14.dispose()
            com.badlogic.gdx.graphics.Texture r1 = r0.mTexture
            com.badlogic.gdx.graphics.Texture$TextureFilter r1 = r1.getMinFilter()
            com.badlogic.gdx.graphics.Texture$TextureFilter r2 = com.badlogic.gdx.graphics.Texture.TextureFilter.Linear
            if (r1 != r2) goto L120
            r2 = 1
            goto L121
        L120:
            r2 = 0
        L121:
            r0.onFinished(r3, r2)
            goto L12a
        L125:
            r1 = 0
            r2 = 1
            r0.onFinished(r1, r2)
        L12a:
            com.badlogic.gdx.Input r1 = com.badlogic.gdx.Gdx.input
            r2 = 0
            r1.setOnscreenKeyboardVisible(r2)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2.mBatchRef = r0
            r2.mTransparencyTexRef = r0
            r2.mShaderColorRemoveRef = r0
            r2.mColorToRemove = r0
            r2.mRepeatingTransparencyBg = r0
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mThresholdField
            if (r1 == 0) goto L14
            r1.dispose()
            r2.mThresholdField = r0
        L14:
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mSpreadField
            if (r1 == 0) goto L1d
            r1.dispose()
            r2.mSpreadField = r0
        L1d:
            com.badlogic.gdx.graphics.Texture r1 = r2.mTexture
            if (r1 == 0) goto L26
            r1.dispose()
            r2.mTexture = r0
        L26:
            org.fortheloss.framework.ColorPicker r1 = r2.mColorPicker
            if (r1 == 0) goto L2f
            r1.dispose()
            r2.mColorPicker = r0
        L2f:
            super.dispose()
            return
    }

    public void initialize() {
            r15 = this;
            java.lang.String r0 = "removeBackgroundColorTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r15.getTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            r1 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceRight(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.spaceLeft(r1)
            r1 = 0
            r0.uniform(r1, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r15.getDialogScrollPane()
            r2 = 1
            r0.setScrollbarsOnTop(r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r15._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r12 = r0.getSessionData()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r15._animationScreenRef
            org.fortheloss.framework.Assets r0 = r0.getAssets()
            java.lang.String r3 = org.fortheloss.sticknodes.App.colorPickerAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r4 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            java.lang.Object r0 = r0.get(r3, r4, r2)
            r9 = r0
            com.badlogic.gdx.graphics.g2d.TextureAtlas r9 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r9
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.uniform(r1, r1)
            r3.expand(r1, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r15.addContent(r0)
            r3.fillX()
            r15.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "remove"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r3.<init>(r4, r5)
            r3.setWrap(r1)
            r3.setAlignment(r2)
            r0.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r13 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            java.lang.String r4 = ""
            r13.<init>(r4, r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.RemoveSpriteBackgroundDialog$1 r14 = new org.fortheloss.sticknodes.animationscreen.dialogs.RemoveSpriteBackgroundDialog$1
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r5 = r15.getDialog()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r15._animationScreenRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r3.getScreenFBO()
            int r6 = r3.getWidth()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r15._animationScreenRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r3.getScreenFBO()
            int r7 = r3.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1092616192(0x41200000, float:10.0)
            float r10 = r3 * r4
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r15._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r3 = r3.getSessionData()
            boolean r11 = r3.getIsLeftHandMode()
            r3 = r14
            r4 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r15.mColorPicker = r14
            org.fortheloss.sticknodes.animationscreen.dialogs.RemoveSpriteBackgroundDialog$2 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.RemoveSpriteBackgroundDialog$2
            r3.<init>(r15)
            r14.addListener(r3)
            org.fortheloss.framework.ColorPicker r3 = r15.mColorPicker
            com.badlogic.gdx.graphics.Color r4 = r15.mColorToRemove
            r3.setColor(r4)
            org.fortheloss.framework.ColorPicker r3 = r15.mColorPicker
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r0.add(r3)
            float r4 = r13.getWidth()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.width(r4)
            float r4 = r13.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.height(r4)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            r5 = 1109393408(0x42200000, float:40.0)
            float r4 = r4 * r5
            r3.spaceRight(r4)
            org.fortheloss.framework.LabelInputIncrementField r3 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r7 = r15._animationScreenRef
            java.lang.String r4 = "threshold"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.String r9 = "1"
            r10 = 3
            r11 = 0
            r12 = 1132462080(0x43800000, float:256.0)
            r13 = 0
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r15.mThresholdField = r3
            r3.setIncrementButtonVisibilityPermanent(r2)
            org.fortheloss.framework.LabelInputIncrementField r3 = r15.mThresholdField
            org.fortheloss.sticknodes.animationscreen.dialogs.RemoveSpriteBackgroundDialog$3 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.RemoveSpriteBackgroundDialog$3
            r4.<init>(r15)
            r3.setFieldListener(r4)
            org.fortheloss.framework.LabelInputIncrementField r3 = r15.mThresholdField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r0.add(r3)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r5
            r3.spaceRight(r4)
            org.fortheloss.framework.LabelInputIncrementField r3 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r7 = r15._animationScreenRef
            java.lang.String r4 = "fadePercent"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.String r9 = "0"
            r12 = 1120403456(0x42c80000, float:100.0)
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r15.mSpreadField = r3
            r3.setIncrementButtonVisibilityPermanent(r2)
            org.fortheloss.framework.LabelInputIncrementField r3 = r15.mSpreadField
            org.fortheloss.sticknodes.animationscreen.dialogs.RemoveSpriteBackgroundDialog$4 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.RemoveSpriteBackgroundDialog$4
            r4.<init>(r15)
            r3.setFieldListener(r4)
            org.fortheloss.framework.LabelInputIncrementField r3 = r15.mSpreadField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r0.add(r3)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r5
            r3.spaceRight(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox
            java.lang.String r4 = "antiAlias"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            r3.<init>(r4, r5)
            r3.setChecked(r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.RemoveSpriteBackgroundDialog$5 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.RemoveSpriteBackgroundDialog$5
            r4.<init>(r15, r3)
            r3.addListener(r4)
            r0.add(r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.RemoveSpriteBackgroundDialog$6 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.RemoveSpriteBackgroundDialog$6
            com.badlogic.gdx.graphics.Texture r3 = r15.mTexture
            r0.<init>(r15, r3)
            r3 = 2
            r0.setAlign(r3)
            com.badlogic.gdx.utils.Scaling r4 = com.badlogic.gdx.utils.Scaling.fit
            r0.setScaling(r4)
            org.fortheloss.framework.RepeatingImage r4 = new org.fortheloss.framework.RepeatingImage
            com.badlogic.gdx.graphics.g2d.TextureRegion r5 = r15.mTransparencyTexRef
            r4.<init>(r5)
            r15.mRepeatingTransparencyBg = r4
            r4.setAlign(r3)
            org.fortheloss.framework.RepeatingImage r4 = r15.mRepeatingTransparencyBg
            com.badlogic.gdx.utils.Scaling r5 = com.badlogic.gdx.utils.Scaling.stretch
            r4.setScaling(r5)
            org.fortheloss.framework.RepeatingImage r4 = r15.mRepeatingTransparencyBg
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1045220557(0x3e4ccccd, float:0.2)
            r7 = 1050253722(0x3e99999a, float:0.3)
            r4.setColor(r5, r6, r7, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Stack r4 = new com.badlogic.gdx.scenes.scene2d.ui.Stack
            com.badlogic.gdx.scenes.scene2d.Actor[] r5 = new com.badlogic.gdx.scenes.scene2d.Actor[r3]
            org.fortheloss.framework.RepeatingImage r6 = r15.mRepeatingTransparencyBg
            r5[r1] = r6
            r5[r2] = r0
            r4.<init>(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r15.addContent(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r3)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r15._animationScreenRef
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r1.getStage()
            float r1 = r1.getHeight()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1144586240(0x44390000, float:740.0)
            float r2 = r2 * r3
            float r1 = r1 - r2
            r0.maxHeight(r1)
            java.lang.String r0 = "apply"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r15.createTextButton(r0)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r15.addButton(r0, r1)
            java.lang.String r0 = "cancel"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r15.createTextButton(r0)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r15.addButton(r0, r1)
            return
    }

    protected void onFinished(com.badlogic.gdx.graphics.Pixmap r1, boolean r2) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void onTablePositionChanged() {
            r1 = this;
            org.fortheloss.framework.RepeatingImage r0 = r1.mRepeatingTransparencyBg
            if (r0 == 0) goto L7
            r0.invalidate()
        L7:
            return
    }
}
