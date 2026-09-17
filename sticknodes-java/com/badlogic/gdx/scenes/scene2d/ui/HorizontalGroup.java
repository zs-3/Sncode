package com.badlogic.gdx.scenes.scene2d.ui;

/* loaded from: classes.dex */
public class HorizontalGroup extends com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup {
    private int align;
    private boolean expand;
    private float fill;
    private float lastPrefHeight;
    private float padBottom;
    private float padLeft;
    private float padRight;
    private float padTop;
    private float prefHeight;
    private float prefWidth;
    private boolean reverse;
    private boolean round;
    private int rowAlign;
    private com.badlogic.gdx.utils.FloatArray rowSizes;
    private boolean sizeInvalid;
    private float space;
    private boolean wrap;
    private boolean wrapReverse;
    private float wrapSpace;

    public HorizontalGroup() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.sizeInvalid = r0
            r1 = 8
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
            r0.prefHeight = r4
            boolean r5 = r0.wrap
            if (r5 == 0) goto Lc0
            r0.prefWidth = r4
            com.badlogic.gdx.utils.FloatArray r5 = r0.rowSizes
            if (r5 != 0) goto L20
            com.badlogic.gdx.utils.FloatArray r5 = new com.badlogic.gdx.utils.FloatArray
            r5.<init>()
            r0.rowSizes = r5
            goto L23
        L20:
            r5.clear()
        L23:
            com.badlogic.gdx.utils.FloatArray r5 = r0.rowSizes
            float r6 = r0.space
            float r7 = r0.wrapSpace
            float r8 = r0.padLeft
            float r9 = r0.padRight
            float r8 = r8 + r9
            float r9 = r19.getWidth()
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
            if (r1 == r3) goto La1
            java.lang.Object r14 = r2.get(r1)
            com.badlogic.gdx.scenes.scene2d.Actor r14 = (com.badlogic.gdx.scenes.scene2d.Actor) r14
            boolean r15 = r14 instanceof com.badlogic.gdx.scenes.scene2d.utils.Layout
            if (r15 == 0) goto L63
            com.badlogic.gdx.scenes.scene2d.utils.Layout r14 = (com.badlogic.gdx.scenes.scene2d.utils.Layout) r14
            float r15 = r14.getPrefWidth()
            int r16 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r16 <= 0) goto L5e
            float r15 = r14.getMinWidth()
            float r15 = java.lang.Math.max(r9, r15)
        L5e:
            float r14 = r14.getPrefHeight()
            goto L6b
        L63:
            float r15 = r14.getWidth()
            float r14 = r14.getHeight()
        L6b:
            int r16 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r16 <= 0) goto L72
            r17 = r6
            goto L74
        L72:
            r17 = 0
        L74:
            float r17 = r15 + r17
            float r18 = r10 + r17
            int r18 = (r18 > r9 ? 1 : (r18 == r9 ? 0 : -1))
            if (r18 <= 0) goto L97
            if (r16 <= 0) goto L97
            r5.add(r10)
            r5.add(r12)
            float r4 = r0.prefWidth
            float r10 = r10 + r8
            float r4 = java.lang.Math.max(r4, r10)
            r0.prefWidth = r4
            r4 = 0
            int r10 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r10 <= 0) goto L93
            float r13 = r13 + r7
        L93:
            float r13 = r13 + r12
            r10 = 0
            r12 = 0
            goto L99
        L97:
            r15 = r17
        L99:
            float r10 = r10 + r15
            float r12 = java.lang.Math.max(r12, r14)
            int r1 = r1 + r11
            r4 = 0
            goto L40
        La1:
            r5.add(r10)
            r5.add(r12)
            float r1 = r0.prefWidth
            float r10 = r10 + r8
            float r1 = java.lang.Math.max(r1, r10)
            r0.prefWidth = r1
            r1 = 0
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 <= 0) goto Lb6
            float r13 = r13 + r7
        Lb6:
            float r1 = r0.prefHeight
            float r13 = r13 + r12
            float r1 = java.lang.Math.max(r1, r13)
            r0.prefHeight = r1
            goto L10b
        Lc0:
            float r4 = r0.padLeft
            float r5 = r0.padRight
            float r4 = r4 + r5
            float r5 = r0.space
            int r6 = r3 + (-1)
            float r6 = (float) r6
            float r5 = r5 * r6
            float r4 = r4 + r5
            r0.prefWidth = r4
        Lcf:
            if (r1 >= r3) goto L10b
            java.lang.Object r4 = r2.get(r1)
            com.badlogic.gdx.scenes.scene2d.Actor r4 = (com.badlogic.gdx.scenes.scene2d.Actor) r4
            boolean r5 = r4 instanceof com.badlogic.gdx.scenes.scene2d.utils.Layout
            if (r5 == 0) goto Lf3
            com.badlogic.gdx.scenes.scene2d.utils.Layout r4 = (com.badlogic.gdx.scenes.scene2d.utils.Layout) r4
            float r5 = r0.prefWidth
            float r6 = r4.getPrefWidth()
            float r5 = r5 + r6
            r0.prefWidth = r5
            float r5 = r0.prefHeight
            float r4 = r4.getPrefHeight()
            float r4 = java.lang.Math.max(r5, r4)
            r0.prefHeight = r4
            goto L108
        Lf3:
            float r5 = r0.prefWidth
            float r6 = r4.getWidth()
            float r5 = r5 + r6
            r0.prefWidth = r5
            float r5 = r0.prefHeight
            float r4 = r4.getHeight()
            float r4 = java.lang.Math.max(r5, r4)
            r0.prefHeight = r4
        L108:
            int r1 = r1 + 1
            goto Lcf
        L10b:
            float r1 = r0.prefHeight
            float r2 = r0.padTop
            float r3 = r0.padBottom
            float r2 = r2 + r3
            float r1 = r1 + r2
            r0.prefHeight = r1
            boolean r1 = r0.round
            if (r1 == 0) goto L12b
            float r1 = r0.prefWidth
            int r1 = java.lang.Math.round(r1)
            float r1 = (float) r1
            r0.prefWidth = r1
            float r1 = r0.prefHeight
            int r1 = java.lang.Math.round(r1)
            float r1 = (float) r1
            r0.prefHeight = r1
        L12b:
            return
    }

    private void layoutWrapped() {
            r29 = this;
            r0 = r29
            float r1 = r29.getPrefHeight()
            float r2 = r0.lastPrefHeight
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L11
            r0.lastPrefHeight = r1
            r29.invalidateHierarchy()
        L11:
            int r2 = r0.align
            boolean r3 = r0.round
            float r4 = r0.space
            float r5 = r0.fill
            float r6 = r0.wrapSpace
            float r7 = r0.prefWidth
            float r8 = r0.padLeft
            float r7 = r7 - r8
            float r8 = r0.padRight
            float r7 = r7 - r8
            float r8 = r0.padTop
            float r8 = r1 - r8
            float r9 = r29.getWidth()
            float r10 = r0.padLeft
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            r12 = r2 & 2
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 == 0) goto L3c
            float r12 = r29.getHeight()
            float r12 = r12 - r1
        L3a:
            float r8 = r8 + r12
            goto L47
        L3c:
            r12 = r2 & 4
            if (r12 != 0) goto L47
            float r12 = r29.getHeight()
            float r12 = r12 - r1
            float r12 = r12 / r13
            goto L3a
        L47:
            boolean r12 = r0.wrapReverse
            r14 = 1
            if (r12 == 0) goto L56
            com.badlogic.gdx.utils.FloatArray r11 = r0.rowSizes
            float r11 = r11.get(r14)
            float r1 = r1 + r11
            float r8 = r8 - r1
            r11 = 1065353216(0x3f800000, float:1.0)
        L56:
            r1 = r2 & 16
            if (r1 == 0) goto L60
            float r1 = r0.prefWidth
            float r1 = r9 - r1
        L5e:
            float r10 = r10 + r1
            goto L6a
        L60:
            r1 = r2 & 8
            if (r1 != 0) goto L6a
            float r1 = r0.prefWidth
            float r1 = r9 - r1
            float r1 = r1 / r13
            goto L5e
        L6a:
            float r1 = r0.padRight
            float r9 = r9 - r1
            int r1 = r0.rowAlign
            com.badlogic.gdx.utils.FloatArray r2 = r0.rowSizes
            com.badlogic.gdx.utils.SnapshotArray r12 = r29.getChildren()
            int r15 = r12.size
            boolean r14 = r0.reverse
            r17 = -1
            r18 = 0
            if (r14 == 0) goto L84
            int r15 = r15 + (-1)
            r13 = -1
            r14 = -1
            goto L87
        L84:
            r13 = r15
            r14 = 1
            r15 = 0
        L87:
            r17 = 0
            r0 = 0
            r18 = 0
            r19 = 0
        L8e:
            if (r15 == r13) goto L195
            java.lang.Object r20 = r12.get(r15)
            r21 = r12
            r12 = r20
            com.badlogic.gdx.scenes.scene2d.Actor r12 = (com.badlogic.gdx.scenes.scene2d.Actor) r12
            r20 = 0
            r22 = r13
            boolean r13 = r12 instanceof com.badlogic.gdx.scenes.scene2d.utils.Layout
            if (r13 == 0) goto Lbb
            r20 = r12
            com.badlogic.gdx.scenes.scene2d.utils.Layout r20 = (com.badlogic.gdx.scenes.scene2d.utils.Layout) r20
            float r13 = r20.getPrefWidth()
            int r23 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r23 <= 0) goto Lb6
            float r13 = r20.getMinWidth()
            float r13 = java.lang.Math.max(r9, r13)
        Lb6:
            float r23 = r20.getPrefHeight()
            goto Lc3
        Lbb:
            float r13 = r12.getWidth()
            float r23 = r12.getHeight()
        Lc3:
            float r24 = r18 + r13
            int r24 = (r24 > r9 ? 1 : (r24 == r9 ? 0 : -1))
            if (r24 > 0) goto Ld9
            if (r0 != 0) goto Lcc
            goto Ld9
        Lcc:
            r27 = r19
            r19 = r7
            r7 = r27
            r28 = r18
            r18 = r9
            r9 = r28
            goto L113
        Ld9:
            r18 = r9
            int r9 = r2.size
            int r9 = r9 + (-2)
            int r0 = java.lang.Math.min(r0, r9)
            r9 = r1 & 16
            if (r9 == 0) goto Lef
            float r9 = r2.get(r0)
            float r9 = r7 - r9
        Led:
            float r9 = r9 + r10
            goto Lff
        Lef:
            r9 = r1 & 8
            if (r9 != 0) goto Lfe
            float r9 = r2.get(r0)
            float r9 = r7 - r9
            r16 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r16
            goto Led
        Lfe:
            r9 = r10
        Lff:
            r19 = r7
            int r7 = r0 + 1
            float r7 = r2.get(r7)
            if (r0 <= 0) goto L10d
            float r24 = r6 * r11
            float r8 = r8 + r24
        L10d:
            float r24 = r7 * r11
            float r8 = r8 + r24
            int r0 = r0 + 2
        L113:
            int r24 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r24 <= 0) goto L119
            float r23 = r7 * r5
        L119:
            r24 = r0
            r0 = r23
            r23 = r2
            if (r20 == 0) goto L136
            float r2 = r20.getMinHeight()
            float r0 = java.lang.Math.max(r0, r2)
            float r2 = r20.getMaxHeight()
            int r25 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r25 <= 0) goto L136
            int r25 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r25 <= 0) goto L136
            r0 = r2
        L136:
            r2 = r1 & 2
            if (r2 == 0) goto L140
            float r2 = r7 - r0
            float r2 = r2 + r8
            r16 = 1073741824(0x40000000, float:2.0)
            goto L14f
        L140:
            r2 = r1 & 4
            if (r2 != 0) goto L14c
            float r2 = r7 - r0
            r16 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r16
            float r2 = r2 + r8
            goto L14f
        L14c:
            r16 = 1073741824(0x40000000, float:2.0)
            r2 = r8
        L14f:
            if (r3 == 0) goto L16d
            r25 = r1
            int r1 = java.lang.Math.round(r9)
            float r1 = (float) r1
            int r2 = java.lang.Math.round(r2)
            float r2 = (float) r2
            r26 = r3
            int r3 = java.lang.Math.round(r13)
            float r3 = (float) r3
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            r12.setBounds(r1, r2, r3, r0)
            goto L174
        L16d:
            r25 = r1
            r26 = r3
            r12.setBounds(r9, r2, r13, r0)
        L174:
            float r13 = r13 + r4
            float r0 = r9 + r13
            if (r20 == 0) goto L17c
            r20.validate()
        L17c:
            int r15 = r15 + r14
            r9 = r18
            r12 = r21
            r13 = r22
            r2 = r23
            r1 = r25
            r3 = r26
            r18 = r0
            r0 = r24
            r27 = r19
            r19 = r7
            r7 = r27
            goto L8e
        L195:
            return
    }

    public com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup align(int r1) {
            r0 = this;
            r0.align = r1
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup bottom() {
            r1 = this;
            int r0 = r1.align
            r0 = r0 | 4
            r0 = r0 & (-3)
            r1.align = r0
            return r1
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

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
            r1 = this;
            boolean r0 = r1.sizeInvalid
            if (r0 == 0) goto L7
            r1.computeSize()
        L7:
            float r0 = r1.prefHeight
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
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
            float r4 = r0.padBottom
            float r5 = r0.fill
            boolean r6 = r0.expand
            if (r6 == 0) goto L24
            float r6 = r19.getHeight()
            goto L26
        L24:
            float r6 = r0.prefHeight
        L26:
            float r7 = r0.padTop
            float r6 = r6 - r7
            float r6 = r6 - r4
            float r7 = r0.padLeft
            r8 = r2 & 16
            r9 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L3b
            float r8 = r19.getWidth()
            float r10 = r0.prefWidth
            float r8 = r8 - r10
        L39:
            float r7 = r7 + r8
            goto L48
        L3b:
            r8 = r2 & 8
            if (r8 != 0) goto L48
            float r8 = r19.getWidth()
            float r10 = r0.prefWidth
            float r8 = r8 - r10
            float r8 = r8 / r9
            goto L39
        L48:
            r8 = r2 & 4
            if (r8 == 0) goto L4d
            goto L66
        L4d:
            r2 = r2 & 2
            if (r2 == 0) goto L5b
            float r2 = r19.getHeight()
            float r4 = r0.padTop
            float r2 = r2 - r4
            float r4 = r2 - r6
            goto L66
        L5b:
            float r2 = r19.getHeight()
            float r2 = r2 - r4
            float r8 = r0.padTop
            float r2 = r2 - r8
            float r2 = r2 - r6
            float r2 = r2 / r9
            float r4 = r4 + r2
        L66:
            int r2 = r0.rowAlign
            com.badlogic.gdx.utils.SnapshotArray r8 = r19.getChildren()
            r10 = 0
            int r11 = r8.size
            boolean r12 = r0.reverse
            r13 = -1
            if (r12 == 0) goto L78
            int r10 = r11 + (-1)
            r11 = -1
            goto L79
        L78:
            r13 = 1
        L79:
            if (r10 == r11) goto L10b
            java.lang.Object r12 = r8.get(r10)
            com.badlogic.gdx.scenes.scene2d.Actor r12 = (com.badlogic.gdx.scenes.scene2d.Actor) r12
            r14 = 0
            boolean r15 = r12 instanceof com.badlogic.gdx.scenes.scene2d.utils.Layout
            if (r15 == 0) goto L92
            r14 = r12
            com.badlogic.gdx.scenes.scene2d.utils.Layout r14 = (com.badlogic.gdx.scenes.scene2d.utils.Layout) r14
            float r15 = r14.getPrefWidth()
            float r16 = r14.getPrefHeight()
            goto L9a
        L92:
            float r15 = r12.getWidth()
            float r16 = r12.getHeight()
        L9a:
            r17 = 0
            int r18 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r18 <= 0) goto La2
            float r16 = r6 * r5
        La2:
            r9 = r16
            if (r14 == 0) goto Lbb
            float r0 = r14.getMinHeight()
            float r9 = java.lang.Math.max(r9, r0)
            float r0 = r14.getMaxHeight()
            int r16 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r16 <= 0) goto Lbb
            int r16 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r16 <= 0) goto Lbb
            r9 = r0
        Lbb:
            r0 = r2 & 2
            if (r0 == 0) goto Lc5
            float r0 = r6 - r9
            float r0 = r0 + r4
            r16 = 1073741824(0x40000000, float:2.0)
            goto Ld4
        Lc5:
            r0 = r2 & 4
            if (r0 != 0) goto Ld1
            float r0 = r6 - r9
            r16 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r16
            float r0 = r0 + r4
            goto Ld4
        Ld1:
            r16 = 1073741824(0x40000000, float:2.0)
            r0 = r4
        Ld4:
            if (r1 == 0) goto Lf2
            r17 = r1
            int r1 = java.lang.Math.round(r7)
            float r1 = (float) r1
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            r18 = r2
            int r2 = java.lang.Math.round(r15)
            float r2 = (float) r2
            int r9 = java.lang.Math.round(r9)
            float r9 = (float) r9
            r12.setBounds(r1, r0, r2, r9)
            goto Lf9
        Lf2:
            r17 = r1
            r18 = r2
            r12.setBounds(r7, r0, r15, r9)
        Lf9:
            float r15 = r15 + r3
            float r7 = r7 + r15
            if (r14 == 0) goto L100
            r14.validate()
        L100:
            int r10 = r10 + r13
            r0 = r19
            r1 = r17
            r2 = r18
            r9 = 1073741824(0x40000000, float:2.0)
            goto L79
        L10b:
            return
    }

    public com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup pad(float r1) {
            r0 = this;
            r0.padTop = r1
            r0.padLeft = r1
            r0.padBottom = r1
            r0.padRight = r1
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup pad(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.padTop = r1
            r0.padLeft = r2
            r0.padBottom = r3
            r0.padRight = r4
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup rowBottom() {
            r1 = this;
            int r0 = r1.rowAlign
            r0 = r0 | 4
            r0 = r0 & (-3)
            r1.rowAlign = r0
            return r1
    }

    public com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup rowTop() {
            r1 = this;
            int r0 = r1.rowAlign
            r0 = r0 | 2
            r0 = r0 & (-5)
            r1.rowAlign = r0
            return r1
    }

    public com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup space(float r1) {
            r0 = this;
            r0.space = r1
            return r0
    }
}
