package org.fortheloss.framework;

/* loaded from: classes2.dex */
public class ListCustomItemHeight<T> extends com.badlogic.gdx.scenes.scene2d.ui.Widget implements com.badlogic.gdx.scenes.scene2d.utils.Cullable {
    private int alignment;
    private com.badlogic.gdx.math.Rectangle cullingArea;
    float itemHeight;
    final com.badlogic.gdx.utils.Array<T> items;
    float minListWidth;
    private float prefHeight;
    private float prefWidth;
    final com.badlogic.gdx.scenes.scene2d.utils.ArraySelection<T> selection;
    com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle style;
    int touchDown;


    public ListCustomItemHeight(com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r3, float r4, float r5) {
            r2 = this;
            r2.<init>()
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r2.items = r0
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r1 = new com.badlogic.gdx.scenes.scene2d.utils.ArraySelection
            r1.<init>(r0)
            r2.selection = r1
            r0 = 8
            r2.alignment = r0
            r2.itemHeight = r4
            r2.minListWidth = r5
            r1.setActor(r2)
            r4 = 1
            r1.setRequired(r4)
            r2.setStyle(r3)
            float r3 = r2.getPrefWidth()
            float r4 = r2.getPrefHeight()
            r2.setSize(r3, r4)
            org.fortheloss.framework.ListCustomItemHeight$1 r3 = new org.fortheloss.framework.ListCustomItemHeight$1
            r3.<init>(r2)
            r2.addListener(r3)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r28, float r29) {
            r27 = this;
            r8 = r27
            r27.validate()
            com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r0 = r8.style
            com.badlogic.gdx.graphics.g2d.BitmapFont r9 = r0.font
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r10 = r0.selection
            com.badlogic.gdx.graphics.Color r11 = r0.fontColorSelected
            com.badlogic.gdx.graphics.Color r12 = r0.fontColorUnselected
            com.badlogic.gdx.graphics.Color r0 = r27.getColor()
            float r1 = r0.r
            float r2 = r0.g
            float r3 = r0.b
            float r0 = r0.a
            float r0 = r0 * r29
            r7 = r28
            r7.setColor(r1, r2, r3, r0)
            float r0 = r27.getX()
            float r19 = r27.getY()
            float r1 = r27.getWidth()
            float r2 = r27.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r3 = r8.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r3 = r3.background
            if (r3 == 0) goto L55
            r13 = r3
            r14 = r28
            r15 = r0
            r16 = r19
            r17 = r1
            r18 = r2
            r13.draw(r14, r15, r16, r17, r18)
            float r4 = r3.getLeftWidth()
            float r0 = r0 + r4
            float r5 = r3.getTopHeight()
            float r2 = r2 - r5
            float r3 = r3.getRightWidth()
            float r4 = r4 + r3
            float r1 = r1 - r4
        L55:
            r20 = r0
            r21 = r1
            float r0 = r10.getLeftWidth()
            r1 = 1092616192(0x41200000, float:10.0)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r1
            float r22 = r0 + r3
            float r0 = r21 - r22
            float r1 = r10.getRightWidth()
            float r23 = r0 - r1
            float r0 = r8.itemHeight
            float r1 = r9.getCapHeight()
            float r0 = r0 - r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r24 = r0 * r1
            float r0 = r12.r
            float r1 = r12.g
            float r3 = r12.b
            float r4 = r12.a
            float r4 = r4 * r29
            r9.setColor(r0, r1, r3, r4)
            r0 = 0
            r25 = r2
            r6 = 0
        L89:
            com.badlogic.gdx.utils.Array<T> r0 = r8.items
            int r1 = r0.size
            if (r6 >= r1) goto L110
            com.badlogic.gdx.math.Rectangle r1 = r8.cullingArea
            if (r1 == 0) goto Lad
            float r2 = r8.itemHeight
            float r2 = r25 - r2
            float r3 = r1.y
            float r1 = r1.height
            float r1 = r1 + r3
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 > 0) goto La5
            int r1 = (r25 > r3 ? 1 : (r25 == r3 ? 0 : -1))
            if (r1 < 0) goto La5
            goto Lad
        La5:
            int r0 = (r25 > r3 ? 1 : (r25 == r3 ? 0 : -1))
            if (r0 >= 0) goto Lab
            goto L110
        Lab:
            r14 = r6
            goto L106
        Lad:
            java.lang.Object r4 = r0.get(r6)
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection<T> r0 = r8.selection
            boolean r26 = r0.contains(r4)
            if (r26 == 0) goto Le4
            int r0 = r8.touchDown
            if (r0 != r6) goto Lc5
            com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r0 = r8.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.down
            if (r0 == 0) goto Lc5
            r13 = r0
            goto Lc6
        Lc5:
            r13 = r10
        Lc6:
            float r0 = r19 + r25
            float r1 = r8.itemHeight
            float r16 = r0 - r1
            r14 = r28
            r15 = r20
            r17 = r21
            r18 = r1
            r13.draw(r14, r15, r16, r17, r18)
            float r0 = r11.r
            float r1 = r11.g
            float r2 = r11.b
            float r3 = r11.a
            float r3 = r3 * r29
            r9.setColor(r0, r1, r2, r3)
        Le4:
            float r5 = r20 + r22
            float r0 = r19 + r25
            float r13 = r0 - r24
            r0 = r27
            r1 = r28
            r2 = r9
            r3 = r6
            r14 = r6
            r6 = r13
            r7 = r23
            r0.drawItem(r1, r2, r3, r4, r5, r6, r7)
            if (r26 == 0) goto L106
            float r0 = r12.r
            float r1 = r12.g
            float r2 = r12.b
            float r3 = r12.a
            float r3 = r3 * r29
            r9.setColor(r0, r1, r2, r3)
        L106:
            float r0 = r8.itemHeight
            float r25 = r25 - r0
            int r6 = r14 + 1
            r7 = r28
            goto L89
        L110:
            return
    }

    protected com.badlogic.gdx.graphics.g2d.GlyphLayout drawItem(com.badlogic.gdx.graphics.g2d.Batch r13, com.badlogic.gdx.graphics.g2d.BitmapFont r14, int r15, T r16, float r17, float r18, float r19) {
            r12 = this;
            r0 = r12
            r1 = r16
            java.lang.String r3 = r12.toString(r1)
            int r7 = r3.length()
            int r9 = r0.alignment
            r6 = 0
            r10 = 0
            java.lang.String r11 = "..."
            r1 = r14
            r2 = r13
            r4 = r17
            r5 = r18
            r8 = r19
            com.badlogic.gdx.graphics.g2d.GlyphLayout r1 = r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r1
    }

    public float getItemHeight() {
            r1 = this;
            float r0 = r1.itemHeight
            return r0
    }

    public int getItemIndexAt(float r5) {
            r4 = this;
            float r0 = r4.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r1 = r4.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.background
            if (r1 == 0) goto L19
            float r2 = r1.getTopHeight()
            float r3 = r1.getBottomHeight()
            float r2 = r2 + r3
            float r0 = r0 - r2
            float r1 = r1.getBottomHeight()
            float r5 = r5 - r1
        L19:
            float r0 = r0 - r5
            float r5 = r4.itemHeight
            float r0 = r0 / r5
            int r5 = (int) r0
            if (r5 < 0) goto L28
            com.badlogic.gdx.utils.Array<T> r0 = r4.items
            int r0 = r0.size
            if (r5 < r0) goto L27
            goto L28
        L27:
            return r5
        L28:
            r5 = -1
            return r5
    }

    public com.badlogic.gdx.utils.Array<T> getItems() {
            r1 = this;
            com.badlogic.gdx.utils.Array<T> r0 = r1.items
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
            r1 = this;
            r1.validate()
            float r0 = r1.prefHeight
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
            r1 = this;
            r1.validate()
            float r0 = r1.prefWidth
            return r0
    }

    public T getSelected() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection<T> r0 = r1.selection
            java.lang.Object r0 = r0.first()
            return r0
    }

    public int getSelectedIndex() {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection<T> r0 = r3.selection
            com.badlogic.gdx.utils.OrderedSet r0 = r0.items()
            int r1 = r0.size
            if (r1 != 0) goto Lc
            r0 = -1
            goto L17
        Lc:
            com.badlogic.gdx.utils.Array<T> r1 = r3.items
            java.lang.Object r0 = r0.first()
            r2 = 0
            int r0 = r1.indexOf(r0, r2)
        L17:
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.utils.ArraySelection<T> getSelection() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection<T> r0 = r1.selection
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle getStyle() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r0 = r1.style
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget
    public void layout() {
            r7 = this;
            com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r0 = r7.style
            com.badlogic.gdx.graphics.g2d.BitmapFont r1 = r0.font
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.selection
            r2 = 0
            r7.prefWidth = r2
            java.lang.Class<com.badlogic.gdx.graphics.g2d.GlyphLayout> r2 = com.badlogic.gdx.graphics.g2d.GlyphLayout.class
            com.badlogic.gdx.utils.Pool r2 = com.badlogic.gdx.utils.Pools.get(r2)
            java.lang.Object r3 = r2.obtain()
            com.badlogic.gdx.graphics.g2d.GlyphLayout r3 = (com.badlogic.gdx.graphics.g2d.GlyphLayout) r3
            r4 = 0
        L16:
            com.badlogic.gdx.utils.Array<T> r5 = r7.items
            int r6 = r5.size
            if (r4 >= r6) goto L3a
            java.lang.Object r5 = r5.get(r4)
            java.lang.String r5 = r7.toString(r5)
            r3.setText(r1, r5)
            float r5 = r3.width
            float r6 = r7.prefWidth
            float r5 = java.lang.Math.max(r5, r6)
            float r6 = r7.minListWidth
            float r5 = java.lang.Math.max(r5, r6)
            r7.prefWidth = r5
            int r4 = r4 + 1
            goto L16
        L3a:
            r2.free(r3)
            float r1 = r7.prefWidth
            float r2 = r0.getLeftWidth()
            float r0 = r0.getRightWidth()
            float r2 = r2 + r0
            float r1 = r1 + r2
            r7.prefWidth = r1
            com.badlogic.gdx.utils.Array<T> r0 = r7.items
            int r0 = r0.size
            float r0 = (float) r0
            float r2 = r7.itemHeight
            float r0 = r0 * r2
            r7.prefHeight = r0
            com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r0 = r7.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.background
            if (r0 == 0) goto L76
            float r2 = r0.getLeftWidth()
            float r3 = r0.getRightWidth()
            float r2 = r2 + r3
            float r1 = r1 + r2
            r7.prefWidth = r1
            float r1 = r7.prefHeight
            float r2 = r0.getTopHeight()
            float r0 = r0.getBottomHeight()
            float r2 = r2 + r0
            float r1 = r1 + r2
            r7.prefHeight = r1
        L76:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Cullable
    public void setCullingArea(com.badlogic.gdx.math.Rectangle r1) {
            r0 = this;
            r0.cullingArea = r1
            return
    }

    public void setItems(com.badlogic.gdx.utils.Array r4) {
            r3 = this;
            if (r4 == 0) goto L32
            float r0 = r3.getPrefWidth()
            float r1 = r3.getPrefHeight()
            com.badlogic.gdx.utils.Array<T> r2 = r3.items
            if (r4 == r2) goto L16
            r2.clear()
            com.badlogic.gdx.utils.Array<T> r2 = r3.items
            r2.addAll(r4)
        L16:
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection<T> r4 = r3.selection
            r4.validate()
            r3.invalidate()
            float r4 = r3.getPrefWidth()
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L2e
            float r4 = r3.getPrefHeight()
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 == 0) goto L31
        L2e:
            r3.invalidateHierarchy()
        L31:
            return
        L32:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "newItems cannot be null."
            r4.<init>(r0)
            throw r4
    }

    public void setItems(T... r4) {
            r3 = this;
            if (r4 == 0) goto L30
            float r0 = r3.getPrefWidth()
            float r1 = r3.getPrefHeight()
            com.badlogic.gdx.utils.Array<T> r2 = r3.items
            r2.clear()
            com.badlogic.gdx.utils.Array<T> r2 = r3.items
            r2.addAll(r4)
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection<T> r4 = r3.selection
            r4.validate()
            r3.invalidate()
            float r4 = r3.getPrefWidth()
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L2c
            float r4 = r3.getPrefHeight()
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 == 0) goto L2f
        L2c:
            r3.invalidateHierarchy()
        L2f:
            return
        L30:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "newItems cannot be null."
            r4.<init>(r0)
            throw r4
    }

    public void setSelected(T r3) {
            r2 = this;
            com.badlogic.gdx.utils.Array<T> r0 = r2.items
            r1 = 0
            boolean r0 = r0.contains(r3, r1)
            if (r0 == 0) goto Lf
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection<T> r0 = r2.selection
            r0.set(r3)
            goto L2c
        Lf:
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection<T> r3 = r2.selection
            boolean r3 = r3.getRequired()
            if (r3 == 0) goto L27
            com.badlogic.gdx.utils.Array<T> r3 = r2.items
            int r0 = r3.size
            if (r0 <= 0) goto L27
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection<T> r0 = r2.selection
            java.lang.Object r3 = r3.first()
            r0.set(r3)
            goto L2c
        L27:
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection<T> r3 = r2.selection
            r3.clear()
        L2c:
            return
    }

    public void setSelectedIndex(int r5) {
            r4 = this;
            r0 = -1
            if (r5 < r0) goto L1b
            com.badlogic.gdx.utils.Array<T> r1 = r4.items
            int r2 = r1.size
            if (r5 >= r2) goto L1b
            if (r5 != r0) goto L11
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection<T> r5 = r4.selection
            r5.clear()
            goto L1a
        L11:
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection<T> r0 = r4.selection
            java.lang.Object r5 = r1.get(r5)
            r0.set(r5)
        L1a:
            return
        L1b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            com.badlogic.gdx.utils.Array<T> r1 = r4.items
            int r1 = r1.size
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "index must be >= -1 and < "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ": "
            r2.append(r1)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r0.<init>(r5)
            throw r0
    }

    public void setStyle(com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r2) {
            r1 = this;
            if (r2 == 0) goto L8
            r1.style = r2
            r1.invalidateHierarchy()
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "style cannot be null."
            r2.<init>(r0)
            throw r2
    }

    protected java.lang.String toString(T r1) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            return r1
    }
}
