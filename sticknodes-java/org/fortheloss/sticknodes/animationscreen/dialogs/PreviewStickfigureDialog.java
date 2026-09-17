package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class PreviewStickfigureDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private static boolean show_nodes = true;
    private com.badlogic.gdx.graphics.glutils.FrameBuffer _fbo;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Image> _imageCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _nodesButton;
    private boolean _ownStickfigure;
    private org.fortheloss.sticknodes.stickfigure.Stickfigure _stickfigure;

    static {
            return
    }

    public PreviewStickfigureDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0._ownStickfigure = r1
            return
    }

    private void renderStickfigure(org.fortheloss.sticknodes.animationscreen.NodeDrawTools r33) {
            r32 = this;
            r0 = r32
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r0._stickfigure
            if (r1 == 0) goto L1e5
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getMainNode()
            if (r1 != 0) goto Le
            goto L1e5
        Le:
            r1 = 1142947840(0x44200000, float:640.0)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r2
            int r1 = (int) r1
            r3 = 1139802112(0x43f00000, float:480.0)
            float r2 = r2 * r3
            int r2 = (int) r2
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r0._fbo
            if (r3 == 0) goto L24
            r3.dispose()
            r3 = 0
            r0._fbo = r3
        L24:
            com.badlogic.gdx.graphics.Pixmap$Format r3 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888     // Catch: java.lang.IllegalStateException -> L33
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = r1
            r5 = r2
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.IllegalStateException -> L33
            r0._fbo = r3     // Catch: java.lang.IllegalStateException -> L33
            goto L41
        L33:
            com.badlogic.gdx.graphics.Pixmap$Format r3 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA4444
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = r1
            r5 = r2
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = org.fortheloss.framework.SubclassedFrameBufferBuilder.createBasicExtended(r3, r4, r5, r6, r7, r8, r9)
            r0._fbo = r3
        L41:
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r0._fbo
            if (r3 != 0) goto L46
            return
        L46:
            org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator r3 = new org.fortheloss.sticknodes.stickfigure.StickfigureSizeCalculator
            r3.<init>()
            r4 = 1
            r3.forceNonZeroSizes(r4)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r0._stickfigure
            com.badlogic.gdx.math.Rectangle r3 = r3.getSize(r4)
            float r4 = r3.x
            float r5 = r3.y
            float r6 = r3.width
            float r6 = r6 - r4
            float r3 = r3.height
            float r3 = r3 - r5
            float r1 = (float) r1
            r7 = 1063675494(0x3f666666, float:0.9)
            float r8 = r1 * r7
            float r2 = (float) r2
            float r7 = r7 * r2
            r9 = 1060320051(0x3f333333, float:0.7)
            float r10 = r1 * r9
            float r9 = r9 * r2
            r11 = 0
            int r12 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r12 <= 0) goto L1d7
            int r12 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r12 > 0) goto L7a
            goto L1d7
        L7a:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r12 = r0._stickfigure
            float r12 = r12.getScale()
            r15 = 1065353216(0x3f800000, float:1.0)
            int r13 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r13 >= 0) goto L97
            int r13 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r13 >= 0) goto L97
            float r7 = r6 / r10
            float r8 = r3 / r9
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L94
            float r10 = r10 / r6
            goto Lb2
        L94:
            float r10 = r9 / r3
            goto Lb2
        L97:
            int r9 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r9 <= 0) goto L9e
            float r8 = r8 / r6
            r10 = r8
            goto La0
        L9e:
            r10 = 1065353216(0x3f800000, float:1.0)
        La0:
            int r8 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r8 <= 0) goto Lb2
            float r7 = r7 / r3
            float r8 = java.lang.Math.abs(r7)
            float r9 = java.lang.Math.abs(r10)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 >= 0) goto Lb2
            r10 = r7
        Lb2:
            int r7 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r7 >= 0) goto Lc5
            r7 = 953267991(0x38d1b717, float:1.0E-4)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r8 = r0._stickfigure
            float r8 = r8.getScale()
            float r8 = r8 * r10
            float r12 = java.lang.Math.max(r7, r8)
        Lc5:
            int r7 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r7 <= 0) goto Ld7
            r8 = 1101004800(0x41a00000, float:20.0)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r9 = r0._stickfigure
            float r9 = r9.getScale()
            float r9 = r9 * r10
            float r12 = java.lang.Math.min(r8, r9)
        Ld7:
            if (r7 == 0) goto Leb
            org.fortheloss.sticknodes.stickfigure.Stickfigure r7 = r0._stickfigure
            r7.setScale(r12)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r7 = r0._stickfigure
            r7.validateDirtyNodes()
            float r6 = r6 * r10
            float r3 = r3 * r10
            float r4 = r4 * r10
            float r5 = r5 * r10
        Leb:
            com.badlogic.gdx.utils.viewport.ScreenViewport r14 = new com.badlogic.gdx.utils.viewport.ScreenViewport
            r14.<init>()
            com.badlogic.gdx.graphics.Camera r7 = r14.getCamera()
            com.badlogic.gdx.math.Vector3 r7 = r7.position
            com.badlogic.gdx.graphics.glutils.FrameBuffer r8 = r0._fbo
            int r8 = r8.getWidth()
            int r8 = r8 / 2
            float r8 = (float) r8
            com.badlogic.gdx.graphics.glutils.FrameBuffer r9 = r0._fbo
            int r9 = r9.getHeight()
            int r9 = r9 / 2
            float r9 = (float) r9
            r7.set(r8, r9, r11)
            com.badlogic.gdx.graphics.Camera r7 = r14.getCamera()
            com.badlogic.gdx.math.Vector3 r7 = r7.up
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7.set(r11, r8, r11)
            com.badlogic.gdx.graphics.Camera r7 = r14.getCamera()
            com.badlogic.gdx.math.Vector3 r7 = r7.direction
            r7.set(r11, r11, r15)
            com.badlogic.gdx.graphics.glutils.FrameBuffer r7 = r0._fbo
            int r7 = r7.getWidth()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r8 = r0._fbo
            int r8 = r8.getHeight()
            r9 = 0
            r14.update(r7, r8, r9)
            com.badlogic.gdx.graphics.glutils.FrameBuffer r7 = r0._fbo
            r7.begin()
            com.badlogic.gdx.graphics.GL20 r7 = com.badlogic.gdx.Gdx.gl
            r7.glClearColor(r15, r15, r15, r15)
            com.badlogic.gdx.graphics.GL20 r7 = com.badlogic.gdx.Gdx.gl
            r8 = 16384(0x4000, float:2.2959E-41)
            r7.glClear(r8)
            org.fortheloss.sticknodes.SNShapeRenderer r13 = r33.getShapeRenderer()
            com.badlogic.gdx.graphics.g2d.Batch r12 = r33.getBatch()
            r14.apply(r9)
            com.badlogic.gdx.graphics.Camera r7 = r14.getCamera()
            com.badlogic.gdx.math.Matrix4 r7 = r7.combined
            r13.setProjectionMatrix(r7)
            org.fortheloss.sticknodes.SNShapeRenderer$ShapeType r7 = org.fortheloss.sticknodes.SNShapeRenderer.ShapeType.Filled
            r13.begin(r7)
            r8 = 0
            r9 = 0
            com.badlogic.gdx.graphics.Color r16 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY
            com.badlogic.gdx.graphics.Color r17 = org.fortheloss.sticknodes.App.COLOR_OFF_WHITE
            r7 = r13
            r10 = r1
            r11 = r2
            r29 = r12
            r12 = r16
            r30 = r13
            r13 = r16
            r31 = r14
            r14 = r17
            r15 = r17
            r7.rect(r8, r9, r10, r11, r12, r13, r14, r15)
            r30.flush()
            float r1 = r1 - r6
            r6 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r6
            float r9 = r1 - r4
            float r2 = r2 - r3
            float r2 = r2 * r6
            float r10 = r2 - r5
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r0._stickfigure
            r19 = 0
            r22 = 0
            r23 = 0
            r24 = 1065353216(0x3f800000, float:1.0)
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r16 = r1
            r17 = r30
            r18 = r29
            r20 = r9
            r21 = r10
            r16.drawLimbs(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r30.end()
            boolean r1 = org.fortheloss.sticknodes.animationscreen.dialogs.PreviewStickfigureDialog.show_nodes
            if (r1 == 0) goto L1d1
            r29.begin()
            r1 = r29
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.graphics.Camera r2 = r31.getCamera()
            com.badlogic.gdx.math.Matrix4 r2 = r2.combined
            r1.setProjectionMatrix(r2)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r7 = r0._stickfigure
            r11 = 0
            r12 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            r15 = 1
            org.fortheloss.sticknodes.stickfigure.StickNode r16 = r7.getMainNode()
            r17 = 0
            r8 = r33
            r7.drawNodes(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1.end()
        L1d1:
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r0._fbo
            r1.end()
            return
        L1d7:
            boolean r1 = r0._ownStickfigure
            if (r1 == 0) goto L1e0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r0._stickfigure
            r1.dispose()
        L1e0:
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r0._fbo
            r1.dispose()
        L1e5:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r5) {
            r4 = this;
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r0 = 2
            if (r5 != r0) goto L81
            r4.doNotHideDialog()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = r4._stickfigure
            if (r5 == 0) goto L81
            boolean r5 = org.fortheloss.sticknodes.animationscreen.dialogs.PreviewStickfigureDialog.show_nodes
            r5 = r5 ^ 1
            org.fortheloss.sticknodes.animationscreen.dialogs.PreviewStickfigureDialog.show_nodes = r5
            java.lang.String r0 = ": "
            java.lang.String r1 = "nodes"
            if (r5 == 0) goto L3e
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._nodesButton
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r2 = "on"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            r5.setText(r0)
            goto L5f
        L3e:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._nodesButton
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r2 = "off"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            r5.setText(r0)
        L5f:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r4._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.NodeDrawTools r5 = r5.getNodeDrawTools()
            r4.renderStickfigure(r5)
            com.badlogic.gdx.graphics.glutils.FrameBuffer r5 = r4._fbo
            if (r5 == 0) goto L81
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.GLTexture r5 = r5.getColorBufferTexture()
            com.badlogic.gdx.graphics.Texture r5 = (com.badlogic.gdx.graphics.Texture) r5
            r0.<init>(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Image> r5 = r4._imageCellRef
            r5.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Image> r5 = r4._imageCellRef
            r5.setActor(r0)
        L81:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r3._fbo
            r1 = 0
            if (r0 == 0) goto La
            r0.dispose()
            r3._fbo = r1
        La:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r3._stickfigure
            if (r0 == 0) goto L17
            boolean r2 = r3._ownStickfigure
            if (r2 == 0) goto L15
            r0.dispose()
        L15:
            r3._stickfigure = r1
        L17:
            r3._imageCellRef = r1
            r3._nodesButton = r1
            super.dispose()
            return
    }

    public void initialize(int r5) {
            r4 = this;
            java.lang.String r0 = "previewStickfigureTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            org.fortheloss.sticknodes.data.ProjectData r0 = r0.getProjectData()
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r0 = r0.libraryStickfigures
            java.lang.Object r5 = r0.get(r5)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r5
            r4._stickfigure = r5
            r0 = 0
            r4._ownStickfigure = r0
            r0 = 1
            if (r5 == 0) goto L69
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r4._stickfigure
            java.lang.String r1 = r1.getName()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r5.<init>(r1, r2)
            r5.setWrap(r0)
            r5.setAlignment(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.addContent(r5)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            r5.width(r1)
            r4.addContentRow()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r4._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.NodeDrawTools r5 = r5.getNodeDrawTools()
            r4.renderStickfigure(r5)
            com.badlogic.gdx.graphics.glutils.FrameBuffer r5 = r4._fbo
            if (r5 == 0) goto L69
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.GLTexture r5 = r5.getColorBufferTexture()
            com.badlogic.gdx.graphics.Texture r5 = (com.badlogic.gdx.graphics.Texture) r5
            r1.<init>(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.addContent(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.align(r0)
            r4._imageCellRef = r5
        L69:
            java.lang.String r5 = "okay"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4.createTextButton(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.addButton(r5, r0)
            java.lang.String r5 = ""
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4.createTextButton(r5)
            r4._nodesButton = r5
            boolean r0 = org.fortheloss.sticknodes.animationscreen.dialogs.PreviewStickfigureDialog.show_nodes
            java.lang.String r1 = ": "
            java.lang.String r2 = "nodes"
            if (r0 == 0) goto Laa
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r2 = "on"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r1)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            r5.setText(r0)
            goto Lc9
        Laa:
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r2 = "off"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r1)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            r5.setText(r0)
        Lc9:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._nodesButton
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.addButton(r5, r0)
            return
    }

    public void initialize(com.badlogic.gdx.files.FileHandle r5) {
            r4 = this;
            java.lang.String r0 = "previewStickfigureTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            org.fortheloss.sticknodes.data.ProjectData r0 = r0.getProjectData()
            java.lang.String r1 = r5.name()
            java.lang.String r2 = "s"
            boolean r2 = r1.endsWith(r2)
            if (r2 == 0) goto L2a
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r0.getStickfigureFromFile(r5)
            r4._stickfigure = r2
            if (r2 != 0) goto L30
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = r0.getStickfigureFromFileOld(r5)
            r4._stickfigure = r5
            goto L30
        L2a:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = r0.getStickfigureFromPivotFile(r5)
            r4._stickfigure = r5
        L30:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = r4._stickfigure
            r0 = 1
            if (r5 == 0) goto L81
            int r5 = r1.length()
            if (r5 <= 0) goto L59
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r5.<init>(r1, r2)
            r5.setWrap(r0)
            r5.setAlignment(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.addContent(r5)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            r5.width(r1)
            r4.addContentRow()
        L59:
            r4._ownStickfigure = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r4._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.NodeDrawTools r5 = r5.getNodeDrawTools()
            r4.renderStickfigure(r5)
            com.badlogic.gdx.graphics.glutils.FrameBuffer r5 = r4._fbo
            if (r5 == 0) goto L81
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.GLTexture r5 = r5.getColorBufferTexture()
            com.badlogic.gdx.graphics.Texture r5 = (com.badlogic.gdx.graphics.Texture) r5
            r1.<init>(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r4.addContent(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.align(r0)
            r4._imageCellRef = r5
        L81:
            java.lang.String r5 = "okay"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4.createTextButton(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.addButton(r5, r0)
            java.lang.String r5 = ""
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4.createTextButton(r5)
            r4._nodesButton = r5
            boolean r0 = org.fortheloss.sticknodes.animationscreen.dialogs.PreviewStickfigureDialog.show_nodes
            java.lang.String r1 = ": "
            java.lang.String r2 = "nodes"
            if (r0 == 0) goto Lc2
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r2 = "on"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r1)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            r5.setText(r0)
            goto Le1
        Lc2:
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r2 = "off"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r1)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            r5.setText(r0)
        Le1:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._nodesButton
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.addButton(r5, r0)
            return
    }
}
