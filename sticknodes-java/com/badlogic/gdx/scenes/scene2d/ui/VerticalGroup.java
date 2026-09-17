package com.badlogic.gdx.scenes.scene2d.ui;

/* loaded from: classes.dex */
public class VerticalGroup extends com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup {
    private int align;
    private int columnAlign;
    private com.badlogic.gdx.utils.FloatArray columnSizes;
    private boolean expand;
    private float fill;
    private float lastPrefWidth;
    private float padBottom;
    private float padLeft;
    private float padRight;
    private float padTop;
    private float prefHeight;
    private float prefWidth;
    private boolean reverse;
    private boolean round;
    private boolean sizeInvalid;
    private float space;
    private boolean wrap;
    private float wrapSpace;

    public VerticalGroup() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.sizeInvalid = r0
            r1 = 2
            r2.align = r1
            r2.round = r0
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r2.setTouchable(r0)
            return
    }

    private void computeSize() {
            r19 = this;
            r0 = r19
            r1 = 0
            r0.sizeInvalid = r1
            com.badlogic.gdx.utils.SnapshotArray r2 = r19.getChildren()
            int r3 = r2.size
            r4 = 0
            r0.prefWidth = r4
            boolean r5 = r0.wrap
            if (r5 == 0) goto Lbe
            r0.prefHeight = r4
            com.badlogic.gdx.utils.FloatArray r5 = r0.columnSizes
            if (r5 != 0) goto L20
            com.badlogic.gdx.utils.FloatArray r5 = new com.badlogic.gdx.utils.FloatArray
            r5.<init>()
            r0.columnSizes = r5
            goto L23
        L20:
            r5.clear()
        L23:
            com.badlogic.gdx.utils.FloatArray r5 = r0.columnSizes
            float r6 = r0.space
            float r7 = r0.wrapSpace
            float r8 = r0.padTop
            float r9 = r0.padBottom
            float r8 = r8 + r9
            float r9 = r19.getHeight()
            float r9 = r9 - r8
            boolean r10 = r0.reverse
            r11 = -1
            if (r10 == 0) goto L3c
            int r1 = r3 + (-1)
            r3 = -1
            goto L3d
        L3c:
            r11 = 1
        L3d:
            r10 = 0
            r12 = 0
            r13 = 0
        L40:
            if (r1 == r3) goto La0
            java.lang.Object r14 = r2.get(r1)
            com.badlogic.gdx.scenes.scene2d.Actor r14 = (com.badlogic.gdx.scenes.scene2d.Actor) r14
            boolean r15 = r14 instanceof com.badlogic.gdx.scenes.scene2d.utils.Layout
            if (r15 == 0) goto L63
            com.badlogic.gdx.scenes.scene2d.utils.Layout r14 = (com.badlogic.gdx.scenes.scene2d.utils.Layout) r14
            float r15 = r14.getPrefWidth()
            float r16 = r14.getPrefHeight()
            int r17 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
            if (r17 <= 0) goto L6b
            float r14 = r14.getMinHeight()
            float r16 = java.lang.Math.max(r9, r14)
            goto L6b
        L63:
            float r15 = r14.getWidth()
            float r16 = r14.getHeight()
        L6b:
            int r14 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r14 <= 0) goto L72
            r17 = r6
            goto L74
        L72:
            r17 = 0
        L74:
            float r17 = r16 + r17
            float r18 = r10 + r17
            int r18 = (r18 > r9 ? 1 : (r18 == r9 ? 0 : -1))
            if (r18 <= 0) goto L96
            if (r14 <= 0) goto L96
            r5.add(r10)
            r5.add(r12)
            float r14 = r0.prefHeight
            float r10 = r10 + r8
            float r10 = java.lang.Math.max(r14, r10)
            r0.prefHeight = r10
            int r10 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r10 <= 0) goto L92
            float r13 = r13 + r7
        L92:
            float r13 = r13 + r12
            r10 = 0
            r12 = 0
            goto L98
        L96:
            r16 = r17
        L98:
            float r10 = r10 + r16
            float r12 = java.lang.Math.max(r12, r15)
            int r1 = r1 + r11
            goto L40
        La0:
            r5.add(r10)
            r5.add(r12)
            float r1 = r0.prefHeight
            float r10 = r10 + r8
            float r1 = java.lang.Math.max(r1, r10)
            r0.prefHeight = r1
            int r1 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r1 <= 0) goto Lb4
            float r13 = r13 + r7
        Lb4:
            float r1 = r0.prefWidth
            float r13 = r13 + r12
            float r1 = java.lang.Math.max(r1, r13)
            r0.prefWidth = r1
            goto L109
        Lbe:
            float r4 = r0.padTop
            float r5 = r0.padBottom
            float r4 = r4 + r5
            float r5 = r0.space
            int r6 = r3 + (-1)
            float r6 = (float) r6
            float r5 = r5 * r6
            float r4 = r4 + r5
            r0.prefHeight = r4
        Lcd:
            if (r1 >= r3) goto L109
            java.lang.Object r4 = r2.get(r1)
            com.badlogic.gdx.scenes.scene2d.Actor r4 = (com.badlogic.gdx.scenes.scene2d.Actor) r4
            boolean r5 = r4 instanceof com.badlogic.gdx.scenes.scene2d.utils.Layout
            if (r5 == 0) goto Lf1
            com.badlogic.gdx.scenes.scene2d.utils.Layout r4 = (com.badlogic.gdx.scenes.scene2d.utils.Layout) r4
            float r5 = r0.prefWidth
            float r6 = r4.getPrefWidth()
            float r5 = java.lang.Math.max(r5, r6)
            r0.prefWidth = r5
            float r5 = r0.prefHeight
            float r4 = r4.getPrefHeight()
            float r5 = r5 + r4
            r0.prefHeight = r5
            goto L106
        Lf1:
            float r5 = r0.prefWidth
            float r6 = r4.getWidth()
            float r5 = java.lang.Math.max(r5, r6)
            r0.prefWidth = r5
            float r5 = r0.prefHeight
            float r4 = r4.getHeight()
            float r5 = r5 + r4
            r0.prefHeight = r5
        L106:
            int r1 = r1 + 1
            goto Lcd
        L109:
            float r1 = r0.prefWidth
            float r2 = r0.padLeft
            float r3 = r0.padRight
            float r2 = r2 + r3
            float r1 = r1 + r2
            r0.prefWidth = r1
            boolean r2 = r0.round
            if (r2 == 0) goto L127
            int r1 = java.lang.Math.round(r1)
            float r1 = (float) r1
            r0.prefWidth = r1
            float r1 = r0.prefHeight
            int r1 = java.lang.Math.round(r1)
            float r1 = (float) r1
            r0.prefHeight = r1
        L127:
            return
    }

    private void layoutWrapped() {
            r27 = this;
            r0 = r27
            float r1 = r27.getPrefWidth()
            float r2 = r0.lastPrefWidth
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L11
            r0.lastPrefWidth = r1
            r27.invalidateHierarchy()
        L11:
            int r2 = r0.align
            boolean r3 = r0.round
            float r4 = r0.space
            float r5 = r0.padLeft
            float r6 = r0.fill
            float r7 = r0.wrapSpace
            float r8 = r0.prefHeight
            float r9 = r0.padTop
            float r8 = r8 - r9
            float r9 = r0.padBottom
            float r8 = r8 - r9
            float r9 = r27.getHeight()
            float r10 = r0.prefHeight
            float r11 = r0.padTop
            float r10 = r10 - r11
            float r10 = r10 + r4
            r11 = r2 & 16
            r12 = 1073741824(0x40000000, float:2.0)
            if (r11 == 0) goto L3c
            float r11 = r27.getWidth()
            float r11 = r11 - r1
        L3a:
            float r5 = r5 + r11
            goto L47
        L3c:
            r11 = r2 & 8
            if (r11 != 0) goto L47
            float r11 = r27.getWidth()
            float r11 = r11 - r1
            float r11 = r11 / r12
            goto L3a
        L47:
            r1 = r2 & 2
            if (r1 == 0) goto L51
            float r1 = r0.prefHeight
            float r1 = r9 - r1
        L4f:
            float r10 = r10 + r1
            goto L5b
        L51:
            r1 = r2 & 4
            if (r1 != 0) goto L5b
            float r1 = r0.prefHeight
            float r1 = r9 - r1
            float r1 = r1 / r12
            goto L4f
        L5b:
            float r1 = r0.padTop
            float r9 = r9 - r1
            int r1 = r0.columnAlign
            com.badlogic.gdx.utils.FloatArray r2 = r0.columnSizes
            com.badlogic.gdx.utils.SnapshotArray r11 = r27.getChildren()
            int r13 = r11.size
            boolean r14 = r0.reverse
            r15 = -1
            r16 = 0
            if (r14 == 0) goto L73
            int r13 = r13 + (-1)
            r14 = -1
            goto L77
        L73:
            r15 = 1
            r15 = r13
            r13 = 0
            r14 = 1
        L77:
            r17 = 0
            r12 = 0
            r18 = 0
            r19 = 0
        L7e:
            if (r13 == r15) goto L179
            java.lang.Object r20 = r11.get(r13)
            r21 = r11
            r11 = r20
            com.badlogic.gdx.scenes.scene2d.Actor r11 = (com.badlogic.gdx.scenes.scene2d.Actor) r11
            r20 = 0
            r22 = r15
            boolean r15 = r11 instanceof com.badlogic.gdx.scenes.scene2d.utils.Layout
            if (r15 == 0) goto Lb2
            r20 = r11
            com.badlogic.gdx.scenes.scene2d.utils.Layout r20 = (com.badlogic.gdx.scenes.scene2d.utils.Layout) r20
            float r15 = r20.getPrefWidth()
            float r23 = r20.getPrefHeight()
            int r24 = (r23 > r9 ? 1 : (r23 == r9 ? 0 : -1))
            if (r24 <= 0) goto Laf
            r24 = r15
            float r15 = r20.getMinHeight()
            float r23 = java.lang.Math.max(r9, r15)
            r15 = r24
            goto Lba
        Laf:
            r24 = r15
            goto Lba
        Lb2:
            float r15 = r11.getWidth()
            float r23 = r11.getHeight()
        Lba:
            r26 = r23
            r23 = r9
            r9 = r26
            float r24 = r18 - r9
            float r24 = r24 - r4
            r25 = r15
            float r15 = r0.padBottom
            int r15 = (r24 > r15 ? 1 : (r24 == r15 ? 0 : -1))
            if (r15 < 0) goto Lce
            if (r12 != 0) goto L103
        Lce:
            int r15 = r2.size
            int r15 = r15 + (-2)
            int r12 = java.lang.Math.min(r12, r15)
            r15 = r1 & 4
            if (r15 == 0) goto Le5
            float r15 = r2.get(r12)
            float r15 = r8 - r15
        Le0:
            float r15 = r10 - r15
            r18 = r15
            goto Lf6
        Le5:
            r15 = r1 & 2
            if (r15 != 0) goto Lf4
            float r15 = r2.get(r12)
            float r15 = r8 - r15
            r16 = 1073741824(0x40000000, float:2.0)
            float r15 = r15 / r16
            goto Le0
        Lf4:
            r18 = r10
        Lf6:
            if (r12 <= 0) goto Lfb
            float r5 = r5 + r7
            float r5 = r5 + r19
        Lfb:
            int r15 = r12 + 1
            float r19 = r2.get(r15)
            int r12 = r12 + 2
        L103:
            int r15 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r15 <= 0) goto L10a
            float r15 = r19 * r6
            goto L10c
        L10a:
            r15 = r25
        L10c:
            if (r20 == 0) goto L123
            float r0 = r20.getMinWidth()
            float r15 = java.lang.Math.max(r15, r0)
            float r0 = r20.getMaxWidth()
            int r24 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r24 <= 0) goto L123
            int r24 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r24 <= 0) goto L123
            r15 = r0
        L123:
            r0 = r1 & 16
            if (r0 == 0) goto L12d
            float r0 = r19 - r15
            float r0 = r0 + r5
            r16 = 1073741824(0x40000000, float:2.0)
            goto L13c
        L12d:
            r0 = r1 & 8
            if (r0 != 0) goto L139
            float r0 = r19 - r15
            r16 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r16
            float r0 = r0 + r5
            goto L13c
        L139:
            r16 = 1073741824(0x40000000, float:2.0)
            r0 = r5
        L13c:
            float r24 = r9 + r4
            r25 = r1
            float r1 = r18 - r24
            if (r3 == 0) goto L15e
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            r18 = r2
            int r2 = java.lang.Math.round(r1)
            float r2 = (float) r2
            int r15 = java.lang.Math.round(r15)
            float r15 = (float) r15
            int r9 = java.lang.Math.round(r9)
            float r9 = (float) r9
            r11.setBounds(r0, r2, r15, r9)
            goto L163
        L15e:
            r18 = r2
            r11.setBounds(r0, r1, r15, r9)
        L163:
            if (r20 == 0) goto L168
            r20.validate()
        L168:
            int r13 = r13 + r14
            r0 = r27
            r2 = r18
            r11 = r21
            r15 = r22
            r9 = r23
            r18 = r1
            r1 = r25
            goto L7e
        L179:
            return
    }

    public com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup align(int r1) {
            r0 = this;
            r0.align = r1
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    protected void drawDebugBounds(com.badlogic.gdx.graphics.glutils.ShapeRenderer r13) {
            r12 = this;
            super.drawDebugBounds(r13)
            boolean r0 = r12.getDebug()
            if (r0 != 0) goto La
            return
        La:
            com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType r0 = com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType.Line
            r13.set(r0)
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r12.getStage()
            if (r0 == 0) goto L20
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r12.getStage()
            com.badlogic.gdx.graphics.Color r0 = r0.getDebugColor()
            r13.setColor(r0)
        L20:
            float r0 = r12.getX()
            float r1 = r12.padLeft
            float r3 = r0 + r1
            float r0 = r12.getY()
            float r1 = r12.padBottom
            float r4 = r0 + r1
            float r5 = r12.getOriginX()
            float r6 = r12.getOriginY()
            float r0 = r12.getWidth()
            float r1 = r12.padLeft
            float r0 = r0 - r1
            float r1 = r12.padRight
            float r7 = r0 - r1
            float r0 = r12.getHeight()
            float r1 = r12.padBottom
            float r0 = r0 - r1
            float r1 = r12.padTop
            float r8 = r0 - r1
            float r9 = r12.getScaleX()
            float r10 = r12.getScaleY()
            float r11 = r12.getRotation()
            r2 = r13
            r2.rect(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup fill() {
            r1 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.fill = r0
            return r1
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
            r1 = this;
            boolean r0 = r1.wrap
            if (r0 == 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r1.sizeInvalid
            if (r0 == 0) goto Ld
            r1.computeSize()
        Ld:
            float r0 = r1.prefHeight
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
            r1 = this;
            boolean r0 = r1.sizeInvalid
            if (r0 == 0) goto L7
            r1.computeSize()
        L7:
            float r0 = r1.prefWidth
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup
    public void invalidate() {
            r1 = this;
            super.invalidate()
            r0 = 1
            r1.sizeInvalid = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup
    public void layout() {
            r19 = this;
            r0 = r19
            boolean r1 = r0.sizeInvalid
            if (r1 == 0) goto L9
            r19.computeSize()
        L9:
            boolean r1 = r0.wrap
            if (r1 == 0) goto L11
            r19.layoutWrapped()
            return
        L11:
            boolean r1 = r0.round
            int r2 = r0.align
            float r3 = r0.space
            float r4 = r0.padLeft
            float r5 = r0.fill
            boolean r6 = r0.expand
            if (r6 == 0) goto L24
            float r6 = r19.getWidth()
            goto L26
        L24:
            float r6 = r0.prefWidth
        L26:
            float r6 = r6 - r4
            float r7 = r0.padRight
            float r6 = r6 - r7
            float r7 = r0.prefHeight
            float r8 = r0.padTop
            float r7 = r7 - r8
            float r7 = r7 + r3
            r8 = r2 & 2
            r9 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L3f
            float r8 = r19.getHeight()
            float r10 = r0.prefHeight
            float r8 = r8 - r10
        L3d:
            float r7 = r7 + r8
            goto L4c
        L3f:
            r8 = r2 & 4
            if (r8 != 0) goto L4c
            float r8 = r19.getHeight()
            float r10 = r0.prefHeight
            float r8 = r8 - r10
            float r8 = r8 / r9
            goto L3d
        L4c:
            r8 = r2 & 8
            if (r8 == 0) goto L51
            goto L6a
        L51:
            r2 = r2 & 16
            if (r2 == 0) goto L5f
            float r2 = r19.getWidth()
            float r4 = r0.padRight
            float r2 = r2 - r4
            float r4 = r2 - r6
            goto L6a
        L5f:
            float r2 = r19.getWidth()
            float r2 = r2 - r4
            float r8 = r0.padRight
            float r2 = r2 - r8
            float r2 = r2 - r6
            float r2 = r2 / r9
            float r4 = r4 + r2
        L6a:
            int r2 = r0.columnAlign
            com.badlogic.gdx.utils.SnapshotArray r8 = r19.getChildren()
            r10 = 0
            int r11 = r8.size
            boolean r12 = r0.reverse
            r13 = -1
            if (r12 == 0) goto L7c
            int r10 = r11 + (-1)
            r11 = -1
            goto L7d
        L7c:
            r13 = 1
        L7d:
            if (r10 == r11) goto L10f
            java.lang.Object r12 = r8.get(r10)
            com.badlogic.gdx.scenes.scene2d.Actor r12 = (com.badlogic.gdx.scenes.scene2d.Actor) r12
            r14 = 0
            boolean r15 = r12 instanceof com.badlogic.gdx.scenes.scene2d.utils.Layout
            if (r15 == 0) goto L96
            r14 = r12
            com.badlogic.gdx.scenes.scene2d.utils.Layout r14 = (com.badlogic.gdx.scenes.scene2d.utils.Layout) r14
            float r15 = r14.getPrefWidth()
            float r16 = r14.getPrefHeight()
            goto L9e
        L96:
            float r15 = r12.getWidth()
            float r16 = r12.getHeight()
        L9e:
            r17 = r16
            r16 = 0
            int r18 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r18 <= 0) goto La8
            float r15 = r6 * r5
        La8:
            if (r14 == 0) goto Lbf
            float r9 = r14.getMinWidth()
            float r15 = java.lang.Math.max(r15, r9)
            float r9 = r14.getMaxWidth()
            int r16 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r16 <= 0) goto Lbf
            int r16 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r16 <= 0) goto Lbf
            r15 = r9
        Lbf:
            r9 = r2 & 16
            if (r9 == 0) goto Lcb
            float r9 = r6 - r15
            float r9 = r9 + r4
            r0 = r17
            r16 = 1073741824(0x40000000, float:2.0)
            goto Ldc
        Lcb:
            r9 = r2 & 8
            if (r9 != 0) goto Ld7
            float r9 = r6 - r15
            r16 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r16
            float r9 = r9 + r4
            goto Lda
        Ld7:
            r16 = 1073741824(0x40000000, float:2.0)
            r9 = r4
        Lda:
            r0 = r17
        Ldc:
            float r17 = r0 + r3
            float r7 = r7 - r17
            if (r1 == 0) goto Lfc
            int r9 = java.lang.Math.round(r9)
            float r9 = (float) r9
            r17 = r1
            int r1 = java.lang.Math.round(r7)
            float r1 = (float) r1
            int r15 = java.lang.Math.round(r15)
            float r15 = (float) r15
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            r12.setBounds(r9, r1, r15, r0)
            goto L101
        Lfc:
            r17 = r1
            r12.setBounds(r9, r7, r15, r0)
        L101:
            if (r14 == 0) goto L106
            r14.validate()
        L106:
            int r10 = r10 + r13
            r0 = r19
            r1 = r17
            r9 = 1073741824(0x40000000, float:2.0)
            goto L7d
        L10f:
            return
    }

    public com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup pad(float r1) {
            r0 = this;
            r0.padTop = r1
            r0.padLeft = r1
            r0.padBottom = r1
            r0.padRight = r1
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup pad(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.padTop = r1
            r0.padLeft = r2
            r0.padBottom = r3
            r0.padRight = r4
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup space(float r1) {
            r0 = this;
            r0.space = r1
            return r0
    }
}
