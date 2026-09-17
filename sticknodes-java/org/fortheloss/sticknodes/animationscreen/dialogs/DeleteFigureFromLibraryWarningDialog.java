package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class DeleteFigureFromLibraryWarningDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private int _libraryID;
    private org.fortheloss.sticknodes.animationscreen.dialogs.IImportsEditorDialog _sourceDialogRef;

    public DeleteFigureFromLibraryWarningDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0._libraryID = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r2) {
            r1 = this;
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L14
            org.fortheloss.sticknodes.animationscreen.dialogs.IImportsEditorDialog r2 = r1._sourceDialogRef
            int r0 = r1._libraryID
            r2.actuallyDeleteFigure(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.IImportsEditorDialog r2 = r1._sourceDialogRef
            r2.onFilesModified()
        L14:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._sourceDialogRef = r0
            super.dispose()
            return
    }

    public void initialize(org.fortheloss.sticknodes.data.ProjectData r25, org.fortheloss.framework.Assets r26, int r27, org.fortheloss.sticknodes.animationscreen.dialogs.IImportsEditorDialog r28) {
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r27
            r3 = r28
            java.lang.String r4 = "areYouSureTitle"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            super.initialize(r4)
            r0._libraryID = r2
            r0._sourceDialogRef = r3
            java.lang.String r4 = org.fortheloss.sticknodes.App.animationMenuAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r5 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            r6 = 1
            r7 = r26
            java.lang.Object r4 = r7.get(r4, r5, r6)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r4 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            boolean r7 = r3 instanceof org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog
            java.lang.String r8 = "notUsedInMCs"
            java.lang.String r9 = "usedInMCs"
            java.lang.String r10 = ", "
            java.lang.String r11 = "notFoundOnFrames"
            java.lang.String r12 = ":\n"
            java.lang.String r13 = "foundOnFrames"
            java.lang.String r14 = "name"
            java.lang.String r15 = "\""
            java.lang.String r6 = ": "
            r26 = r10
            java.lang.String r10 = "\n> "
            r17 = r4
            java.lang.String r4 = "\n"
            r18 = 0
            if (r7 == 0) goto L1b3
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r7 = r1.libraryStickfigures
            java.lang.Object r7 = r7.get(r2)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r7 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r7
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r5.append(r0)
            java.lang.String r0 = r7.getName()
            r5.append(r0)
            java.lang.String r0 = "nodeCount"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r4)
            r14.append(r0)
            r14.append(r6)
            java.lang.String r0 = r14.toString()
            r5.append(r0)
            r0 = 1
            int r7 = r7.getNodeCount(r0)
            r5.append(r7)
            r5.append(r4)
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r13)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r10)
            r7.append(r0)
            r7.append(r6)
            java.lang.String r0 = r7.toString()
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r6 = r1.frames
            int r7 = r6.size()
            r13 = 0
            r14 = 0
        Lb0:
            if (r13 >= r7) goto Lfd
            java.lang.Object r19 = r6.get(r13)
            org.fortheloss.sticknodes.data.IFrameData r19 = (org.fortheloss.sticknodes.data.IFrameData) r19
            r20 = r6
            java.util.ArrayList r6 = r19.getDrawableFigures()
            int r19 = r6.size()
            r16 = 1
            int r19 = r19 + (-1)
            r21 = r7
            r7 = r19
        Lca:
            r19 = r4
            if (r7 < 0) goto Lf4
            java.lang.Object r4 = r6.get(r7)
            boolean r4 = r4 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r4 != 0) goto Ld7
            goto Lef
        Ld7:
            java.lang.Object r4 = r6.get(r7)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            int r4 = r4.getLibraryID()
            if (r4 != r2) goto Lef
            r5.append(r0)
            int r0 = r13 + 1
            r5.append(r0)
            r0 = r26
            r14 = 1
            goto Lf4
        Lef:
            int r7 = r7 + (-1)
            r4 = r19
            goto Lca
        Lf4:
            int r13 = r13 + 1
            r4 = r19
            r6 = r20
            r7 = r21
            goto Lb0
        Lfd:
            r19 = r4
            if (r14 != 0) goto L117
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r11)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r10)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r5.append(r0)
        L117:
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r9)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r10)
            r4.append(r0)
            r4.append(r12)
            java.lang.String r0 = r4.toString()
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r4 = r1.libraryMovieclips
            int r4 = r4.size()
            r6 = 0
            r7 = 0
        L135:
            if (r7 >= r4) goto L197
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r9 = r1.libraryMovieclips
            java.lang.Object r9 = r9.get(r7)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r9 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r9
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r11 = r9.frames
            int r12 = r11.size()
            r13 = 0
        L146:
            if (r13 >= r12) goto L190
            java.lang.Object r20 = r11.get(r13)
            org.fortheloss.sticknodes.data.IFrameData r20 = (org.fortheloss.sticknodes.data.IFrameData) r20
            r26 = r4
            java.util.ArrayList r4 = r20.getDrawableFigures()
            int r20 = r4.size()
            r16 = 1
            int r20 = r20 + (-1)
            r21 = r11
            r11 = r20
        L160:
            if (r11 < 0) goto L189
            java.lang.Object r20 = r4.get(r11)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r20 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r20
            r22 = r4
            int r4 = r20.getLibraryID()
            if (r4 != r2) goto L184
            r5.append(r0)
            r5.append(r15)
            java.lang.String r0 = r9.getName()
            r5.append(r0)
            r5.append(r15)
            r0 = r19
            r6 = 1
            goto L192
        L184:
            int r11 = r11 + (-1)
            r4 = r22
            goto L160
        L189:
            int r13 = r13 + 1
            r4 = r26
            r11 = r21
            goto L146
        L190:
            r26 = r4
        L192:
            int r7 = r7 + 1
            r4 = r26
            goto L135
        L197:
            if (r6 != 0) goto L1af
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.append(r0)
        L1af:
            r0 = r6
            r13 = r14
            goto L4fc
        L1b3:
            r19 = r4
            boolean r0 = r3 instanceof org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog
            java.lang.String r4 = "frameCount"
            if (r0 == 0) goto L27c
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r0 = r1.libraryMovieclips
            java.lang.Object r0 = r0.get(r2)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r0
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r14)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r6)
            java.lang.String r7 = r8.toString()
            r5.append(r7)
            java.lang.String r7 = r0.getName()
            r5.append(r7)
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = r19
            r7.append(r8)
            r7.append(r4)
            r7.append(r6)
            java.lang.String r4 = r7.toString()
            r5.append(r4)
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            int r0 = r0.size()
            r5.append(r0)
            r5.append(r8)
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r13)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r10)
            r4.append(r0)
            r4.append(r6)
            java.lang.String r0 = r4.toString()
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
            int r4 = r1.size()
            r6 = 0
            r7 = 0
        L225:
            if (r7 >= r4) goto L260
            java.lang.Object r8 = r1.get(r7)
            org.fortheloss.sticknodes.data.IFrameData r8 = (org.fortheloss.sticknodes.data.IFrameData) r8
            java.util.ArrayList r8 = r8.getDrawableFigures()
            int r9 = r8.size()
            r12 = 1
            int r9 = r9 - r12
        L237:
            if (r9 < 0) goto L25d
            java.lang.Object r12 = r8.get(r9)
            boolean r12 = r12 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r12 != 0) goto L242
            goto L25a
        L242:
            java.lang.Object r12 = r8.get(r9)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r12 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r12
            int r12 = r12.getLibraryID()
            if (r12 != r2) goto L25a
            r5.append(r0)
            int r0 = r7 + 1
            r5.append(r0)
            r0 = r26
            r6 = 1
            goto L25d
        L25a:
            int r9 = r9 + (-1)
            goto L237
        L25d:
            int r7 = r7 + 1
            goto L225
        L260:
            if (r6 != 0) goto L278
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r11)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.append(r0)
        L278:
            r13 = r6
            r0 = 0
            goto L4fc
        L27c:
            r0 = r19
            boolean r7 = r3 instanceof org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog
            if (r7 == 0) goto L4fa
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r7 = r1.librarySprites
            java.lang.Object r7 = r7.get(r2)
            org.fortheloss.sticknodes.sprite.ISpriteSource r7 = (org.fortheloss.sticknodes.sprite.ISpriteSource) r7
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r14)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r5.append(r3)
            java.lang.String r3 = r7.getName()
            r5.append(r3)
            boolean r3 = r7 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupSource
            if (r3 == 0) goto L2f1
            r14 = r7
            org.fortheloss.sticknodes.sprite.SpriteGroupSource r14 = (org.fortheloss.sticknodes.sprite.SpriteGroupSource) r14
            java.lang.String r19 = "spriteGroup"
            r20 = r3
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r19)
            r19 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            r5.append(r3)
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = ":"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r5.append(r3)
            java.util.ArrayList r3 = r14.getStates()
            int r3 = r3.size()
            r5.append(r3)
            goto L356
        L2f1:
            r20 = r3
            r19 = r8
            r3 = r7
            org.fortheloss.sticknodes.sprite.SpriteSource r3 = (org.fortheloss.sticknodes.sprite.SpriteSource) r3
            java.lang.String r4 = "width"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            r8.append(r4)
            java.lang.String r4 = " "
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            r5.append(r8)
            com.badlogic.gdx.graphics.Texture r8 = r3.getTexture()
            int r8 = r8.getWidth()
            float r8 = (float) r8
            float r14 = r3.getInternalScaleX()
            float r8 = r8 * r14
            int r8 = (int) r8
            r5.append(r8)
            java.lang.String r8 = "height"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r0)
            r14.append(r8)
            r14.append(r4)
            java.lang.String r4 = r14.toString()
            r5.append(r4)
            com.badlogic.gdx.graphics.Texture r4 = r3.getTexture()
            int r4 = r4.getHeight()
            float r4 = (float) r4
            float r3 = r3.getInternalScaleY()
            float r4 = r4 * r3
            int r3 = (int) r4
            r5.append(r3)
        L356:
            r5.append(r0)
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r13)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r10)
            r4.append(r3)
            r4.append(r6)
            java.lang.String r3 = r4.toString()
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r1.frames
            int r6 = r4.size()
            r8 = 0
            r13 = 0
        L377:
            if (r8 >= r6) goto L3c0
            java.lang.Object r14 = r4.get(r8)
            org.fortheloss.sticknodes.data.IFrameData r14 = (org.fortheloss.sticknodes.data.IFrameData) r14
            java.util.ArrayList r14 = r14.getDrawableFigures()
            int r21 = r14.size()
            r16 = 1
            int r21 = r21 + (-1)
            r22 = r0
            r0 = r21
        L38f:
            r21 = r4
            if (r0 < 0) goto L3b9
            java.lang.Object r4 = r14.get(r0)
            boolean r4 = r4 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r4 != 0) goto L39c
            goto L3b4
        L39c:
            java.lang.Object r4 = r14.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            int r4 = r4.getLibraryID()
            if (r4 != r2) goto L3b4
            r5.append(r3)
            int r0 = r8 + 1
            r5.append(r0)
            r3 = r26
            r13 = 1
            goto L3b9
        L3b4:
            int r0 = r0 + (-1)
            r4 = r21
            goto L38f
        L3b9:
            int r8 = r8 + 1
            r4 = r21
            r0 = r22
            goto L377
        L3c0:
            r22 = r0
            if (r13 != 0) goto L3da
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r11)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r10)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r5.append(r0)
        L3da:
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r9)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r10)
            r3.append(r0)
            r3.append(r12)
            java.lang.String r0 = r3.toString()
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r3 = r1.libraryMovieclips
            int r3 = r3.size()
            r8 = r0
            r0 = 0
            r4 = 0
        L3f9:
            if (r4 >= r3) goto L466
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r6 = r1.libraryMovieclips
            java.lang.Object r6 = r6.get(r4)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r6 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r6
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r9 = r6.frames
            int r11 = r9.size()
            r14 = 0
        L40a:
            if (r14 >= r11) goto L45f
            java.lang.Object r21 = r9.get(r14)
            org.fortheloss.sticknodes.data.IFrameData r21 = (org.fortheloss.sticknodes.data.IFrameData) r21
            r26 = r3
            java.util.ArrayList r3 = r21.getDrawableFigures()
            int r21 = r3.size()
            r16 = 1
            int r21 = r21 + (-1)
            r23 = r9
            r9 = r21
        L424:
            if (r9 < 0) goto L456
            r21 = r11
            java.lang.Object r11 = r3.get(r9)
            boolean r11 = r11 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r11 != 0) goto L431
            goto L451
        L431:
            java.lang.Object r11 = r3.get(r9)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r11 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r11
            int r11 = r11.getLibraryID()
            if (r11 != r2) goto L451
            r5.append(r8)
            r5.append(r15)
            java.lang.String r0 = r6.getName()
            r5.append(r0)
            r5.append(r15)
            r8 = r22
            r0 = 1
            goto L461
        L451:
            int r9 = r9 + (-1)
            r11 = r21
            goto L424
        L456:
            r21 = r11
            int r14 = r14 + 1
            r3 = r26
            r9 = r23
            goto L40a
        L45f:
            r26 = r3
        L461:
            int r4 = r4 + 1
            r3 = r26
            goto L3f9
        L466:
            if (r0 != 0) goto L47e
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r19)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r10)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r5.append(r2)
        L47e:
            if (r20 != 0) goto L4fc
            java.lang.String r2 = "usedInSpriteGroup"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r10)
            r3.append(r2)
            r3.append(r12)
            java.lang.String r2 = r3.toString()
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r3 = r1.librarySprites
            int r3 = r3.size()
            r8 = r2
            r2 = 0
            r4 = 0
        L4a1:
            if (r4 >= r3) goto L4dd
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r6 = r1.librarySprites
            java.lang.Object r6 = r6.get(r4)
            org.fortheloss.sticknodes.sprite.ISpriteSource r6 = (org.fortheloss.sticknodes.sprite.ISpriteSource) r6
            boolean r9 = r6 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupSource
            if (r9 != 0) goto L4b0
            goto L4da
        L4b0:
            org.fortheloss.sticknodes.sprite.SpriteGroupSource r6 = (org.fortheloss.sticknodes.sprite.SpriteGroupSource) r6
            java.util.ArrayList r9 = r6.getStates()
            int r11 = r9.size()
            r12 = 0
        L4bb:
            if (r12 >= r11) goto L4da
            java.lang.Object r14 = r9.get(r12)
            if (r14 != r7) goto L4d7
            r5.append(r8)
            r5.append(r15)
            java.lang.String r2 = r6.getName()
            r5.append(r2)
            r5.append(r15)
            r8 = r22
            r2 = 1
            goto L4da
        L4d7:
            int r12 = r12 + 1
            goto L4bb
        L4da:
            int r4 = r4 + 1
            goto L4a1
        L4dd:
            if (r2 != 0) goto L4f7
            java.lang.String r1 = "notUsedInSpriteGroups"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r10)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r5.append(r1)
        L4f7:
            r18 = r2
            goto L4fc
        L4fa:
            r0 = 0
            r13 = 0
        L4fc:
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = "aboutToDeleteFromProject"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r2, r3)
            r2 = 1
            r1.setWrap(r2)
            r1.setAlignment(r2)
            r2 = r24
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r2.addContent(r1)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            r1.width(r3)
            r24.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r3 = "separator"
            r4 = r17
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r6 = r4.findRegion(r3)
            r1.<init>(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r2.addContent(r1)
            r6 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r6)
            int r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r7 = (float) r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padTop(r7)
            r1.fillX()
            r24.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r1.<init>(r5, r7)
            r5 = 1
            r1.setWrap(r5)
            r7 = 8
            r1.setAlignment(r5, r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r2.addContent(r1)
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r5 = (float) r5
            r1.width(r5)
            r24.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Image r1 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r4.findRegion(r3)
            r1.<init>(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r2.addContent(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r6)
            r1.fillX()
            r24.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r5.<init>(r7)
            java.lang.String r7 = ""
            r1.<init>(r7, r5)
            if (r18 != 0) goto L5ab
            if (r0 != 0) goto L5ab
            if (r13 != 0) goto L5ab
            java.lang.String r0 = "safeDelete"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r1.setText(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = r1.getStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            com.badlogic.gdx.graphics.Color r5 = org.fortheloss.sticknodes.App.COLOR_GREEN
            r0.set(r5)
            goto L5c3
        L5ab:
            java.lang.String r0 = "notSafeDelete"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r1.setText(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = r1.getStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r5 = r5.fontColor
            r0.set(r5)
        L5c3:
            r0 = 1
            r1.setWrap(r0)
            r1.setAlignment(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.addContent(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            r0.width(r1)
            r24.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Image r0 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r4.findRegion(r3)
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r6)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.padBottom(r1)
            r0.fillX()
            r24.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "areYouSureDelete"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r3)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            r0.width(r1)
            r0 = r28
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog
            if (r0 == 0) goto L65a
            r24.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "mcDeleteNotice"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r3.<init>(r4)
            r0.<init>(r1, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = r0.getStyle()
            com.badlogic.gdx.graphics.Color r1 = r1.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r3 = r3.fontColor
            r1.set(r3)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.addContent(r0)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            r0.width(r1)
        L65a:
            java.lang.String r0 = "yesDelete"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r2.createTextButton(r0)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r2.addButton(r0, r1)
            java.lang.String r0 = "noCancel"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r2.createTextButton(r0)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r2.addButton(r0, r1)
            return
    }
}
