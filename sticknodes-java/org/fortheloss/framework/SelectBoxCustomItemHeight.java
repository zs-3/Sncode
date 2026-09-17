package org.fortheloss.framework;

/* loaded from: classes2.dex */
public class SelectBoxCustomItemHeight<T> extends com.badlogic.gdx.scenes.scene2d.ui.Widget {
    static final com.badlogic.gdx.math.Vector2 temp = null;
    private int alignment;
    private com.badlogic.gdx.scenes.scene2d.utils.ClickListener clickListener;
    boolean disabled;
    final com.badlogic.gdx.utils.Array<T> items;
    private float prefHeight;
    private float prefWidth;
    org.fortheloss.framework.SelectBoxCustomItemHeight.SelectBoxListCustomItemHeight<T> selectBoxList;
    final com.badlogic.gdx.scenes.scene2d.utils.ArraySelection<T> selection;
    com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle style;


    static class SelectBoxListCustomItemHeight<T> extends com.badlogic.gdx.scenes.scene2d.ui.ScrollPane {
        private com.badlogic.gdx.scenes.scene2d.InputListener hideListener;
        final org.fortheloss.framework.ListCustomItemHeight<T> list;
        int maxListCount;
        private com.badlogic.gdx.scenes.scene2d.Actor previousScrollFocus;
        private final com.badlogic.gdx.math.Vector2 screenPosition;
        private final org.fortheloss.framework.SelectBoxCustomItemHeight<T> selectBox;





        public SelectBoxListCustomItemHeight(org.fortheloss.framework.SelectBoxCustomItemHeight<T> r8, float r9) {
                r7 = this;
                com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r0 = r8.style
                com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r0 = r0.scrollStyle
                r1 = 0
                r7.<init>(r1, r0)
                com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
                r0.<init>()
                r7.screenPosition = r0
                r7.selectBox = r8
                r0 = 1
                r7.setOverscroll(r0, r0)
                r0 = 0
                r7.setFadeScrollBars(r0)
                r7.setScrollingDisabled(r0, r0)
                org.fortheloss.framework.SelectBoxCustomItemHeight$SelectBoxListCustomItemHeight$1 r0 = new org.fortheloss.framework.SelectBoxCustomItemHeight$SelectBoxListCustomItemHeight$1
                com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r1 = r8.style
                com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r3 = r1.listStyle
                r5 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1 = r0
                r2 = r7
                r4 = r9
                r6 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.list = r0
                com.badlogic.gdx.scenes.scene2d.Touchable r9 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
                r0.setTouchable(r9)
                r7.setActor(r0)
                org.fortheloss.framework.SelectBoxCustomItemHeight$SelectBoxListCustomItemHeight$2 r9 = new org.fortheloss.framework.SelectBoxCustomItemHeight$SelectBoxListCustomItemHeight$2
                r9.<init>(r7, r8)
                r0.addListener(r9)
                org.fortheloss.framework.SelectBoxCustomItemHeight$SelectBoxListCustomItemHeight$3 r9 = new org.fortheloss.framework.SelectBoxCustomItemHeight$SelectBoxListCustomItemHeight$3
                r9.<init>(r7, r8)
                r7.addListener(r9)
                org.fortheloss.framework.SelectBoxCustomItemHeight$SelectBoxListCustomItemHeight$4 r9 = new org.fortheloss.framework.SelectBoxCustomItemHeight$SelectBoxListCustomItemHeight$4
                r9.<init>(r7, r8)
                r7.hideListener = r9
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.ScrollPane, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
        public void act(float r1) {
                r0 = this;
                super.act(r1)
                r0.toFront()
                return
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.ScrollPane, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
        public void draw(com.badlogic.gdx.graphics.g2d.Batch r4, float r5) {
                r3 = this;
                org.fortheloss.framework.SelectBoxCustomItemHeight<T> r0 = r3.selectBox
                com.badlogic.gdx.math.Vector2 r1 = org.fortheloss.framework.SelectBoxCustomItemHeight.temp
                r2 = 0
                com.badlogic.gdx.math.Vector2 r2 = r1.set(r2, r2)
                r0.localToStageCoordinates(r2)
                com.badlogic.gdx.math.Vector2 r0 = r3.screenPosition
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L17
                r3.hide()
            L17:
                super.draw(r4, r5)
                return
        }

        public void hide() {
                r2 = this;
                org.fortheloss.framework.ListCustomItemHeight<T> r0 = r2.list
                boolean r0 = r0.isTouchable()
                if (r0 == 0) goto L47
                boolean r0 = r2.hasParent()
                if (r0 != 0) goto Lf
                goto L47
            Lf:
                org.fortheloss.framework.ListCustomItemHeight<T> r0 = r2.list
                com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
                r0.setTouchable(r1)
                com.badlogic.gdx.scenes.scene2d.Stage r0 = r2.getStage()
                if (r0 == 0) goto L3f
                com.badlogic.gdx.scenes.scene2d.InputListener r1 = r2.hideListener
                r0.removeCaptureListener(r1)
                com.badlogic.gdx.scenes.scene2d.Actor r1 = r2.previousScrollFocus
                if (r1 == 0) goto L2e
                com.badlogic.gdx.scenes.scene2d.Stage r1 = r1.getStage()
                if (r1 != 0) goto L2e
                r1 = 0
                r2.previousScrollFocus = r1
            L2e:
                com.badlogic.gdx.scenes.scene2d.Actor r1 = r0.getScrollFocus()
                if (r1 == 0) goto L3a
                boolean r1 = r2.isAscendantOf(r1)
                if (r1 == 0) goto L3f
            L3a:
                com.badlogic.gdx.scenes.scene2d.Actor r1 = r2.previousScrollFocus
                r0.setScrollFocus(r1)
            L3f:
                r2.clearActions()
                org.fortheloss.framework.SelectBoxCustomItemHeight<T> r0 = r2.selectBox
                r0.onHide(r2)
            L47:
                return
        }

        public void show(com.badlogic.gdx.scenes.scene2d.Stage r13) {
                r12 = this;
                org.fortheloss.framework.ListCustomItemHeight<T> r0 = r12.list
                boolean r0 = r0.isTouchable()
                if (r0 == 0) goto L9
                return
            L9:
                com.badlogic.gdx.scenes.scene2d.InputListener r0 = r12.hideListener
                r13.removeCaptureListener(r0)
                com.badlogic.gdx.scenes.scene2d.InputListener r0 = r12.hideListener
                r13.addCaptureListener(r0)
                r13.addActor(r12)
                org.fortheloss.framework.SelectBoxCustomItemHeight<T> r0 = r12.selectBox
                com.badlogic.gdx.math.Vector2 r1 = r12.screenPosition
                r2 = 0
                com.badlogic.gdx.math.Vector2 r1 = r1.set(r2, r2)
                r0.localToStageCoordinates(r1)
                org.fortheloss.framework.ListCustomItemHeight<T> r0 = r12.list
                float r0 = r0.getItemHeight()
                int r1 = r12.maxListCount
                if (r1 > 0) goto L33
                org.fortheloss.framework.SelectBoxCustomItemHeight<T> r1 = r12.selectBox
                com.badlogic.gdx.utils.Array<T> r1 = r1.items
                int r1 = r1.size
                goto L3d
            L33:
                org.fortheloss.framework.SelectBoxCustomItemHeight<T> r2 = r12.selectBox
                com.badlogic.gdx.utils.Array<T> r2 = r2.items
                int r2 = r2.size
                int r1 = java.lang.Math.min(r1, r2)
            L3d:
                float r1 = (float) r1
                float r1 = r1 * r0
                com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r2 = r12.getStyle()
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.background
                if (r2 == 0) goto L52
                float r3 = r2.getTopHeight()
                float r2 = r2.getBottomHeight()
                float r3 = r3 + r2
                float r1 = r1 + r3
            L52:
                org.fortheloss.framework.ListCustomItemHeight<T> r2 = r12.list
                com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r2 = r2.getStyle()
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r2.background
                if (r2 == 0) goto L66
                float r3 = r2.getTopHeight()
                float r2 = r2.getBottomHeight()
                float r3 = r3 + r2
                float r1 = r1 + r3
            L66:
                com.badlogic.gdx.math.Vector2 r2 = r12.screenPosition
                float r2 = r2.y
                com.badlogic.gdx.graphics.Camera r3 = r13.getCamera()
                float r3 = r3.viewportHeight
                com.badlogic.gdx.math.Vector2 r4 = r12.screenPosition
                float r4 = r4.y
                float r3 = r3 - r4
                org.fortheloss.framework.SelectBoxCustomItemHeight<T> r4 = r12.selectBox
                float r4 = r4.getHeight()
                float r3 = r3 - r4
                r4 = 1
                int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r5 <= 0) goto L8c
                int r5 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                if (r5 <= 0) goto L8b
                r4 = 0
                float r1 = java.lang.Math.min(r1, r3)
                goto L8c
            L8b:
                r1 = r2
            L8c:
                if (r4 == 0) goto L97
                com.badlogic.gdx.math.Vector2 r2 = r12.screenPosition
                float r2 = r2.y
                float r2 = r2 - r1
                r12.setY(r2)
                goto La5
            L97:
                com.badlogic.gdx.math.Vector2 r2 = r12.screenPosition
                float r2 = r2.y
                org.fortheloss.framework.SelectBoxCustomItemHeight<T> r3 = r12.selectBox
                float r3 = r3.getHeight()
                float r2 = r2 + r3
                r12.setY(r2)
            La5:
                com.badlogic.gdx.math.Vector2 r2 = r12.screenPosition
                float r2 = r2.x
                r12.setX(r2)
                r12.setHeight(r1)
                r12.validate()
                float r2 = r12.getPrefWidth()
                org.fortheloss.framework.SelectBoxCustomItemHeight<T> r3 = r12.selectBox
                float r3 = r3.getWidth()
                float r2 = java.lang.Math.max(r2, r3)
                float r3 = r12.getPrefHeight()
                int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r1 <= 0) goto Ld3
                boolean r1 = r12.isScrollingDisabledY()
                if (r1 != 0) goto Ld3
                float r1 = r12.getScrollBarWidth()
                float r2 = r2 + r1
            Ld3:
                r12.setWidth(r2)
                r12.validate()
                r6 = 0
                org.fortheloss.framework.ListCustomItemHeight<T> r1 = r12.list
                float r1 = r1.getHeight()
                org.fortheloss.framework.SelectBoxCustomItemHeight<T> r2 = r12.selectBox
                int r2 = r2.getSelectedIndex()
                float r2 = (float) r2
                float r2 = r2 * r0
                float r1 = r1 - r2
                r2 = 1073741824(0x40000000, float:2.0)
                float r0 = r0 / r2
                float r7 = r1 - r0
                r8 = 0
                r9 = 0
                r10 = 1
                r11 = 1
                r5 = r12
                r5.scrollTo(r6, r7, r8, r9, r10, r11)
                r12.updateVisualScroll()
                r0 = 0
                r12.previousScrollFocus = r0
                com.badlogic.gdx.scenes.scene2d.Actor r0 = r13.getScrollFocus()
                if (r0 == 0) goto L10b
                boolean r1 = r0.isDescendantOf(r12)
                if (r1 != 0) goto L10b
                r12.previousScrollFocus = r0
            L10b:
                r13.setScrollFocus(r12)
                org.fortheloss.framework.ListCustomItemHeight<T> r13 = r12.list
                com.badlogic.gdx.scenes.scene2d.utils.ArraySelection<T> r13 = r13.selection
                org.fortheloss.framework.SelectBoxCustomItemHeight<T> r0 = r12.selectBox
                java.lang.Object r0 = r0.getSelected()
                r13.set(r0)
                org.fortheloss.framework.ListCustomItemHeight<T> r13 = r12.list
                com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
                r13.setTouchable(r0)
                r12.clearActions()
                org.fortheloss.framework.SelectBoxCustomItemHeight<T> r13 = r12.selectBox
                r13.onShow(r12, r4)
                return
        }
    }

    static {
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            org.fortheloss.framework.SelectBoxCustomItemHeight.temp = r0
            return
    }

    public SelectBoxCustomItemHeight(com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r3, float r4) {
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
            r2.setStyle(r3)
            float r3 = r2.getPrefWidth()
            float r0 = r2.getPrefHeight()
            r2.setSize(r3, r0)
            r1.setActor(r2)
            r3 = 1
            r1.setRequired(r3)
            org.fortheloss.framework.SelectBoxCustomItemHeight$SelectBoxListCustomItemHeight r3 = new org.fortheloss.framework.SelectBoxCustomItemHeight$SelectBoxListCustomItemHeight
            r3.<init>(r2, r4)
            r2.selectBoxList = r3
            org.fortheloss.framework.SelectBoxCustomItemHeight$1 r3 = new org.fortheloss.framework.SelectBoxCustomItemHeight$1
            r3.<init>(r2)
            r2.clickListener = r3
            r2.addListener(r3)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r17, float r18) {
            r16 = this;
            r7 = r16
            r16.validate()
            boolean r0 = r7.disabled
            if (r0 == 0) goto L10
            com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r0 = r7.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.backgroundDisabled
            if (r0 == 0) goto L10
            goto L36
        L10:
            org.fortheloss.framework.SelectBoxCustomItemHeight$SelectBoxListCustomItemHeight<T> r0 = r7.selectBoxList
            boolean r0 = r0.hasParent()
            if (r0 == 0) goto L1f
            com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r0 = r7.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.backgroundOpen
            if (r0 == 0) goto L1f
            goto L36
        L1f:
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r0 = r7.clickListener
            boolean r0 = r0.isOver()
            if (r0 == 0) goto L2e
            com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r0 = r7.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.backgroundOver
            if (r0 == 0) goto L2e
            goto L36
        L2e:
            com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r0 = r7.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.background
            if (r0 == 0) goto L35
            goto L36
        L35:
            r0 = 0
        L36:
            com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r1 = r7.style
            com.badlogic.gdx.graphics.g2d.BitmapFont r8 = r1.font
            boolean r2 = r7.disabled
            if (r2 == 0) goto L43
            com.badlogic.gdx.graphics.Color r2 = r1.disabledFontColor
            if (r2 == 0) goto L43
            goto L45
        L43:
            com.badlogic.gdx.graphics.Color r2 = r1.fontColor
        L45:
            r9 = r2
            com.badlogic.gdx.graphics.Color r10 = r16.getColor()
            float r11 = r16.getX()
            float r12 = r16.getY()
            float r13 = r16.getWidth()
            float r14 = r16.getHeight()
            float r1 = r10.r
            float r2 = r10.g
            float r3 = r10.b
            float r4 = r10.a
            float r4 = r4 * r18
            r15 = r17
            r15.setColor(r1, r2, r3, r4)
            if (r0 == 0) goto L75
            r1 = r0
            r2 = r17
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r1.draw(r2, r3, r4, r5, r6)
        L75:
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection<T> r1 = r7.selection
            java.lang.Object r3 = r1.first()
            if (r3 == 0) goto Lcf
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto La7
            float r2 = r0.getLeftWidth()
            float r4 = r0.getRightWidth()
            float r2 = r2 + r4
            float r13 = r13 - r2
            float r2 = r0.getBottomHeight()
            float r4 = r0.getTopHeight()
            float r2 = r2 + r4
            float r14 = r14 - r2
            float r2 = r0.getLeftWidth()
            float r11 = r11 + r2
            float r14 = r14 / r1
            float r0 = r0.getBottomHeight()
            float r14 = r14 + r0
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r0 = r8.getData()
            float r0 = r0.capHeight
            goto Lae
        La7:
            float r14 = r14 / r1
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r0 = r8.getData()
            float r0 = r0.capHeight
        Lae:
            float r0 = r0 / r1
            float r14 = r14 + r0
            int r0 = (int) r14
            float r0 = (float) r0
            float r12 = r12 + r0
            r4 = r11
            r5 = r12
            r6 = r13
            float r0 = r9.r
            float r1 = r9.g
            float r2 = r9.b
            float r9 = r9.a
            float r9 = r9 * r18
            float r10 = r10.a
            float r9 = r9 * r10
            r8.setColor(r0, r1, r2, r9)
            r0 = r16
            r1 = r17
            r2 = r8
            r0.drawItem(r1, r2, r3, r4, r5, r6)
        Lcf:
            return
    }

    protected com.badlogic.gdx.graphics.g2d.GlyphLayout drawItem(com.badlogic.gdx.graphics.g2d.Batch r13, com.badlogic.gdx.graphics.g2d.BitmapFont r14, T r15, float r16, float r17, float r18) {
            r12 = this;
            r0 = r12
            r1 = r15
            java.lang.String r3 = r12.toString(r15)
            int r7 = r3.length()
            int r9 = r0.alignment
            r6 = 0
            r10 = 0
            java.lang.String r11 = "..."
            r1 = r14
            r2 = r13
            r4 = r16
            r5 = r17
            r8 = r18
            com.badlogic.gdx.graphics.g2d.GlyphLayout r1 = r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r1
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

    public com.badlogic.gdx.scenes.scene2d.ui.ScrollPane getScrollPane() {
            r1 = this;
            org.fortheloss.framework.SelectBoxCustomItemHeight$SelectBoxListCustomItemHeight<T> r0 = r1.selectBoxList
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

    public void hideList() {
            r1 = this;
            org.fortheloss.framework.SelectBoxCustomItemHeight$SelectBoxListCustomItemHeight<T> r0 = r1.selectBoxList
            r0.hide()
            return
    }

    public boolean isDisabled() {
            r1 = this;
            boolean r0 = r1.disabled
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget
    public void layout() {
            r9 = this;
            com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r0 = r9.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r0.background
            com.badlogic.gdx.graphics.g2d.BitmapFont r0 = r0.font
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L2a
            float r3 = r1.getTopHeight()
            float r4 = r1.getBottomHeight()
            float r3 = r3 + r4
            float r4 = r0.getCapHeight()
            float r3 = r3 + r4
            float r4 = r0.getDescent()
            float r4 = r4 * r2
            float r3 = r3 - r4
            float r2 = r1.getMinHeight()
            float r2 = java.lang.Math.max(r3, r2)
            r9.prefHeight = r2
            goto L37
        L2a:
            float r3 = r0.getCapHeight()
            float r4 = r0.getDescent()
            float r4 = r4 * r2
            float r3 = r3 - r4
            r9.prefHeight = r3
        L37:
            java.lang.Class<com.badlogic.gdx.graphics.g2d.GlyphLayout> r2 = com.badlogic.gdx.graphics.g2d.GlyphLayout.class
            com.badlogic.gdx.utils.Pool r2 = com.badlogic.gdx.utils.Pools.get(r2)
            java.lang.Object r3 = r2.obtain()
            com.badlogic.gdx.graphics.g2d.GlyphLayout r3 = (com.badlogic.gdx.graphics.g2d.GlyphLayout) r3
            r4 = 0
            r5 = 0
            r6 = 0
        L46:
            com.badlogic.gdx.utils.Array<T> r7 = r9.items
            int r8 = r7.size
            if (r4 >= r8) goto L60
            java.lang.Object r7 = r7.get(r4)
            java.lang.String r7 = r9.toString(r7)
            r3.setText(r0, r7)
            float r7 = r3.width
            float r6 = java.lang.Math.max(r7, r6)
            int r4 = r4 + 1
            goto L46
        L60:
            r2.free(r3)
            r9.prefWidth = r6
            if (r1 == 0) goto L73
            float r0 = r1.getLeftWidth()
            float r1 = r1.getRightWidth()
            float r0 = r0 + r1
            float r0 = r0 + r6
            r9.prefWidth = r0
        L73:
            com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r0 = r9.style
            com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r1 = r0.listStyle
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r0 = r0.scrollStyle
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r1.selection
            float r2 = r2.getLeftWidth()
            float r6 = r6 + r2
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.selection
            float r1 = r1.getRightWidth()
            float r6 = r6 + r1
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r0.background
            if (r1 == 0) goto L97
            float r1 = r1.getLeftWidth()
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.background
            float r0 = r0.getRightWidth()
            float r1 = r1 + r0
            float r6 = r6 + r1
        L97:
            org.fortheloss.framework.SelectBoxCustomItemHeight$SelectBoxListCustomItemHeight<T> r0 = r9.selectBoxList
            if (r0 == 0) goto La1
            boolean r0 = r0.isScrollingDisabledY()
            if (r0 != 0) goto Lc0
        La1:
            com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r0 = r9.style
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r0 = r0.scrollStyle
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.vScroll
            if (r0 == 0) goto Lae
            float r0 = r0.getMinWidth()
            goto Laf
        Lae:
            r0 = 0
        Laf:
            com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r1 = r9.style
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r1 = r1.scrollStyle
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.vScrollKnob
            if (r1 == 0) goto Lbb
            float r5 = r1.getMinWidth()
        Lbb:
            float r0 = java.lang.Math.max(r0, r5)
            float r6 = r6 + r0
        Lc0:
            float r0 = r9.prefWidth
            float r0 = java.lang.Math.max(r0, r6)
            r9.prefWidth = r0
            return
    }

    protected void onHide(com.badlogic.gdx.scenes.scene2d.Actor r3) {
            r2 = this;
            com.badlogic.gdx.graphics.Color r0 = r3.getColor()
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.a = r1
            com.badlogic.gdx.math.Interpolation r0 = com.badlogic.gdx.math.Interpolation.fade
            r1 = 1041865114(0x3e19999a, float:0.15)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.fadeOut(r1, r0)
            com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.removeActor()
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r0, r1)
            r3.addAction(r0)
            return
    }

    protected void onShow(com.badlogic.gdx.scenes.scene2d.Actor r2, boolean r3) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r3 = r2.getColor()
            r0 = 0
            r3.a = r0
            com.badlogic.gdx.math.Interpolation r3 = com.badlogic.gdx.math.Interpolation.fade
            r0 = 1050253722(0x3e99999a, float:0.3)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.fadeIn(r0, r3)
            r2.addAction(r3)
            return
    }

    public void setDisabled(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L9
            boolean r0 = r1.disabled
            if (r0 != 0) goto L9
            r1.hideList()
        L9:
            r1.disabled = r2
            return
    }

    public void setItems(T... r3) {
            r2 = this;
            if (r3 == 0) goto L2d
            float r0 = r2.getPrefWidth()
            com.badlogic.gdx.utils.Array<T> r1 = r2.items
            r1.clear()
            com.badlogic.gdx.utils.Array<T> r1 = r2.items
            r1.addAll(r3)
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection<T> r3 = r2.selection
            r3.validate()
            org.fortheloss.framework.SelectBoxCustomItemHeight$SelectBoxListCustomItemHeight<T> r3 = r2.selectBoxList
            org.fortheloss.framework.ListCustomItemHeight<T> r3 = r3.list
            com.badlogic.gdx.utils.Array<T> r1 = r2.items
            r3.setItems(r1)
            r2.invalidate()
            float r3 = r2.getPrefWidth()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L2c
            r2.invalidateHierarchy()
        L2c:
            return
        L2d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "newItems cannot be null."
            r3.<init>(r0)
            throw r3
    }

    public void setMaxListCount(int r2) {
            r1 = this;
            org.fortheloss.framework.SelectBoxCustomItemHeight$SelectBoxListCustomItemHeight<T> r0 = r1.selectBoxList
            r0.maxListCount = r2
            return
    }

    public void setSelected(T r3) {
            r2 = this;
            com.badlogic.gdx.utils.Array<T> r0 = r2.items
            r1 = 0
            boolean r0 = r0.contains(r3, r1)
            if (r0 == 0) goto Lf
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection<T> r0 = r2.selection
            r0.set(r3)
            goto L24
        Lf:
            com.badlogic.gdx.utils.Array<T> r3 = r2.items
            int r0 = r3.size
            if (r0 <= 0) goto L1f
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection<T> r0 = r2.selection
            java.lang.Object r3 = r3.first()
            r0.set(r3)
            goto L24
        L1f:
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection<T> r3 = r2.selection
            r3.clear()
        L24:
            return
    }

    public void setSelectedIndex(int r3) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection<T> r0 = r2.selection
            com.badlogic.gdx.utils.Array<T> r1 = r2.items
            java.lang.Object r3 = r1.get(r3)
            r0.set(r3)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    protected void setStage(com.badlogic.gdx.scenes.scene2d.Stage r2) {
            r1 = this;
            if (r2 != 0) goto L7
            org.fortheloss.framework.SelectBoxCustomItemHeight$SelectBoxListCustomItemHeight<T> r0 = r1.selectBoxList
            r0.hide()
        L7:
            super.setStage(r2)
            return
    }

    public void setStyle(com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r3) {
            r2 = this;
            if (r3 == 0) goto L1a
            r2.style = r3
            org.fortheloss.framework.SelectBoxCustomItemHeight$SelectBoxListCustomItemHeight<T> r0 = r2.selectBoxList
            if (r0 == 0) goto L16
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r1 = r3.scrollStyle
            r0.setStyle(r1)
            org.fortheloss.framework.SelectBoxCustomItemHeight$SelectBoxListCustomItemHeight<T> r0 = r2.selectBoxList
            org.fortheloss.framework.ListCustomItemHeight<T> r0 = r0.list
            com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r3 = r3.listStyle
            r0.setStyle(r3)
        L16:
            r2.invalidateHierarchy()
            return
        L1a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "style cannot be null."
            r3.<init>(r0)
            throw r3
    }

    public void showList() {
            r2 = this;
            com.badlogic.gdx.utils.Array<T> r0 = r2.items
            int r0 = r0.size
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.framework.SelectBoxCustomItemHeight$SelectBoxListCustomItemHeight<T> r0 = r2.selectBoxList
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r2.getStage()
            r0.show(r1)
            return
    }

    protected java.lang.String toString(T r1) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            return r1
    }
}
