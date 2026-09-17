package org.fortheloss.framework;

/* loaded from: classes2.dex */
public class SelectBoxCustomItemHeightWithFilter<T> extends com.badlogic.gdx.scenes.scene2d.ui.Widget {
    static final com.badlogic.gdx.math.Vector2 temp = null;
    private java.lang.String _lastFilter;
    private int alignment;
    private com.badlogic.gdx.scenes.scene2d.utils.ClickListener clickListener;
    boolean disabled;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton filterClearButton;
    private com.badlogic.gdx.math.Vector2 filterCoords;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField filterTextField;
    final com.badlogic.gdx.utils.Array<T> fullItems;
    final com.badlogic.gdx.utils.Array<T> items;
    private T mDefaultNoSelection;
    private float prefHeight;
    private float prefWidth;
    org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter.SelectBoxListCustomItemHeight<T> selectBoxList;
    final com.badlogic.gdx.scenes.scene2d.utils.ArraySelection<T> selection;
    com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle style;





    static class SelectBoxListCustomItemHeight<T> extends com.badlogic.gdx.scenes.scene2d.ui.ScrollPane {
        private float _keepWidth;
        private com.badlogic.gdx.scenes.scene2d.InputListener hideListener;
        final org.fortheloss.framework.ListCustomItemHeight<T> list;
        int maxListCount;
        private com.badlogic.gdx.scenes.scene2d.Actor previousScrollFocus;
        private final com.badlogic.gdx.math.Vector2 screenPosition;
        private final org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<T> selectBox;





        public SelectBoxListCustomItemHeight(org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<T> r8, com.badlogic.gdx.scenes.scene2d.ui.TextField r9, com.badlogic.gdx.scenes.scene2d.ui.ImageButton r10, float r11) {
                r7 = this;
                com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r0 = r8.style
                com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r0 = r0.scrollStyle
                r1 = 0
                r7.<init>(r1, r0)
                com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
                r0.<init>()
                r7.screenPosition = r0
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r7._keepWidth = r0
                r7.selectBox = r8
                r0 = 1
                r7.setOverscroll(r0, r0)
                r0 = 0
                r7.setFadeScrollBars(r0)
                r7.setScrollingDisabled(r0, r0)
                org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$SelectBoxListCustomItemHeight$1 r0 = new org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$SelectBoxListCustomItemHeight$1
                com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r1 = r8.style
                com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r3 = r1.listStyle
                r5 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1 = r0
                r2 = r7
                r4 = r11
                r6 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.list = r0
                com.badlogic.gdx.scenes.scene2d.Touchable r11 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
                r0.setTouchable(r11)
                r7.setActor(r0)
                org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$SelectBoxListCustomItemHeight$2 r11 = new org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$SelectBoxListCustomItemHeight$2
                r11.<init>(r7, r8)
                r0.addListener(r11)
                org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$SelectBoxListCustomItemHeight$3 r11 = new org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$SelectBoxListCustomItemHeight$3
                r11.<init>(r7, r8)
                r7.addListener(r11)
                org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$SelectBoxListCustomItemHeight$4 r11 = new org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$SelectBoxListCustomItemHeight$4
                r11.<init>(r7, r9, r10, r8)
                r7.hideListener = r11
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
                org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<T> r0 = r3.selectBox
                com.badlogic.gdx.math.Vector2 r1 = org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter.temp
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
                if (r0 == 0) goto L4b
                boolean r0 = r2.hasParent()
                if (r0 != 0) goto Lf
                goto L4b
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
                org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<T> r0 = r2.selectBox
                r0.onHide(r2)
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r2._keepWidth = r0
            L4b:
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
                org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<T> r0 = r12.selectBox
                com.badlogic.gdx.math.Vector2 r1 = r12.screenPosition
                r2 = 0
                com.badlogic.gdx.math.Vector2 r1 = r1.set(r2, r2)
                r0.localToStageCoordinates(r1)
                org.fortheloss.framework.ListCustomItemHeight<T> r0 = r12.list
                float r0 = r0.getItemHeight()
                int r1 = r12.maxListCount
                if (r1 > 0) goto L33
                org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<T> r1 = r12.selectBox
                com.badlogic.gdx.utils.Array<T> r1 = r1.items
                int r1 = r1.size
                goto L3d
            L33:
                org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<T> r2 = r12.selectBox
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
                com.badlogic.gdx.scenes.scene2d.Stage r3 = r12.getStage()
                com.badlogic.gdx.graphics.Camera r3 = r3.getCamera()
                float r3 = r3.viewportHeight
                com.badlogic.gdx.math.Vector2 r4 = r12.screenPosition
                float r4 = r4.y
                float r3 = r3 - r4
                org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<T> r4 = r12.selectBox
                float r4 = r4.getHeight()
                float r3 = r3 - r4
                r4 = 1
                int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r5 <= 0) goto L90
                int r5 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                if (r5 <= 0) goto L8f
                r4 = 0
                float r1 = java.lang.Math.min(r1, r3)
                goto L90
            L8f:
                r1 = r2
            L90:
                if (r4 == 0) goto L9b
                com.badlogic.gdx.math.Vector2 r2 = r12.screenPosition
                float r2 = r2.y
                float r2 = r2 - r1
                r12.setY(r2)
                goto La9
            L9b:
                com.badlogic.gdx.math.Vector2 r2 = r12.screenPosition
                float r2 = r2.y
                org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<T> r3 = r12.selectBox
                float r3 = r3.getHeight()
                float r2 = r2 + r3
                r12.setY(r2)
            La9:
                com.badlogic.gdx.math.Vector2 r2 = r12.screenPosition
                float r2 = r2.x
                r12.setX(r2)
                r12.setHeight(r1)
                r12.validate()
                r2 = 1150681088(0x44960000, float:1200.0)
                float r3 = org.fortheloss.sticknodes.App.assetScaling
                float r3 = r3 * r2
                float r2 = r12.getPrefWidth()
                org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<T> r5 = r12.selectBox
                float r5 = r5.getWidth()
                float r2 = java.lang.Math.max(r2, r5)
                float r2 = java.lang.Math.min(r3, r2)
                float r3 = r12.getPrefHeight()
                int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r1 <= 0) goto Le1
                boolean r1 = r12.isScrollingDisabledY()
                if (r1 != 0) goto Le1
                float r1 = r12.getScrollBarWidth()
                float r2 = r2 + r1
            Le1:
                r12.setWidth(r2)
                r12.validate()
                r6 = 0
                org.fortheloss.framework.ListCustomItemHeight<T> r1 = r12.list
                float r1 = r1.getHeight()
                org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<T> r2 = r12.selectBox
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
                if (r0 == 0) goto L119
                boolean r1 = r0.isDescendantOf(r12)
                if (r1 != 0) goto L119
                r12.previousScrollFocus = r0
            L119:
                r13.setScrollFocus(r12)
                org.fortheloss.framework.ListCustomItemHeight<T> r13 = r12.list
                com.badlogic.gdx.scenes.scene2d.utils.ArraySelection<T> r13 = r13.selection
                org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<T> r0 = r12.selectBox
                java.lang.Object r0 = r0.getSelected()
                r13.set(r0)
                org.fortheloss.framework.ListCustomItemHeight<T> r13 = r12.list
                com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
                r13.setTouchable(r0)
                r12.clearActions()
                org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<T> r13 = r12.selectBox
                r13.onShow(r12, r4)
                float r13 = r12.getWidth()
                r12._keepWidth = r13
                return
        }

        public void updateSize() {
                r5 = this;
                com.badlogic.gdx.scenes.scene2d.Stage r0 = r5.getStage()
                if (r0 != 0) goto L7
                return
            L7:
                org.fortheloss.framework.ListCustomItemHeight<T> r0 = r5.list
                float r0 = r0.getItemHeight()
                int r1 = r5.maxListCount
                if (r1 > 0) goto L18
                org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<T> r1 = r5.selectBox
                com.badlogic.gdx.utils.Array<T> r1 = r1.items
                int r1 = r1.size
                goto L22
            L18:
                org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<T> r2 = r5.selectBox
                com.badlogic.gdx.utils.Array<T> r2 = r2.items
                int r2 = r2.size
                int r1 = java.lang.Math.min(r1, r2)
            L22:
                float r1 = (float) r1
                float r0 = r0 * r1
                com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r1 = r5.getStyle()
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.background
                if (r1 == 0) goto L37
                float r2 = r1.getTopHeight()
                float r1 = r1.getBottomHeight()
                float r2 = r2 + r1
                float r0 = r0 + r2
            L37:
                org.fortheloss.framework.ListCustomItemHeight<T> r1 = r5.list
                com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r1 = r1.getStyle()
                com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.background
                if (r1 == 0) goto L4b
                float r2 = r1.getTopHeight()
                float r1 = r1.getBottomHeight()
                float r2 = r2 + r1
                float r0 = r0 + r2
            L4b:
                com.badlogic.gdx.math.Vector2 r1 = r5.screenPosition
                float r1 = r1.y
                com.badlogic.gdx.scenes.scene2d.Stage r2 = r5.getStage()
                com.badlogic.gdx.graphics.Camera r2 = r2.getCamera()
                float r2 = r2.viewportHeight
                com.badlogic.gdx.math.Vector2 r3 = r5.screenPosition
                float r3 = r3.y
                float r2 = r2 - r3
                org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<T> r3 = r5.selectBox
                float r3 = r3.getHeight()
                float r2 = r2 - r3
                r3 = 1
                int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r4 <= 0) goto L75
                int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r4 <= 0) goto L74
                r3 = 0
                float r0 = java.lang.Math.min(r0, r2)
                goto L75
            L74:
                r0 = r1
            L75:
                if (r3 == 0) goto L80
                com.badlogic.gdx.math.Vector2 r1 = r5.screenPosition
                float r1 = r1.y
                float r1 = r1 - r0
                r5.setY(r1)
                goto L8e
            L80:
                com.badlogic.gdx.math.Vector2 r1 = r5.screenPosition
                float r1 = r1.y
                org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<T> r2 = r5.selectBox
                float r2 = r2.getHeight()
                float r1 = r1 + r2
                r5.setY(r1)
            L8e:
                com.badlogic.gdx.math.Vector2 r1 = r5.screenPosition
                float r1 = r1.x
                r5.setX(r1)
                r5.setHeight(r0)
                r5.validate()
                float r1 = r5._keepWidth
                r2 = 0
                int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r2 >= 0) goto Lc7
                float r1 = r5.getPrefWidth()
                org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<T> r2 = r5.selectBox
                float r2 = r2.getWidth()
                float r1 = java.lang.Math.max(r1, r2)
                float r2 = r5.getPrefHeight()
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 <= 0) goto Lc3
                boolean r0 = r5.isScrollingDisabledY()
                if (r0 != 0) goto Lc3
                float r0 = r5.getScrollBarWidth()
                float r1 = r1 + r0
            Lc3:
                r5.setWidth(r1)
                goto Lca
            Lc7:
                r5.setWidth(r1)
            Lca:
                r5.validate()
                return
        }
    }

    static {
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter.temp = r0
            return
    }

    public SelectBoxCustomItemHeightWithFilter(com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r3, float r4, com.badlogic.gdx.scenes.scene2d.ui.TextField r5, com.badlogic.gdx.scenes.scene2d.ui.ImageButton r6, T r7) {
            r2 = this;
            r2.<init>()
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            r2.filterCoords = r0
            java.lang.String r0 = ""
            r2._lastFilter = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r2.fullItems = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r2.items = r0
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r1 = new com.badlogic.gdx.scenes.scene2d.utils.ArraySelection
            r1.<init>(r0)
            r2.selection = r1
            r0 = 8
            r2.alignment = r0
            r2.filterTextField = r5
            r2.filterClearButton = r6
            r2.mDefaultNoSelection = r7
            r2.setStyle(r3)
            float r3 = r2.getPrefWidth()
            float r7 = r2.getPrefHeight()
            r2.setSize(r3, r7)
            r1.setActor(r2)
            r3 = 1
            r1.setRequired(r3)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$SelectBoxListCustomItemHeight r3 = new org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$SelectBoxListCustomItemHeight
            r3.<init>(r2, r5, r6, r4)
            r2.selectBoxList = r3
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$1 r3 = new org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$1
            r3.<init>(r2)
            r2.clickListener = r3
            r2.addListener(r3)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$2 r3 = new org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$2
            r3.<init>(r2, r5)
            r5.addListener(r3)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$3 r3 = new org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$3
            r3.<init>(r2)
            r5.addListener(r3)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$4 r3 = new org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$4
            r3.<init>(r2, r5)
            r6.addListener(r3)
            return
    }

    public void clearSearch() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r2.filterTextField
            java.lang.String r1 = ""
            r0.setText(r1)
            r2.filterList(r1)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r14, float r15) {
            r13 = this;
            r13.validate()
            boolean r0 = r13.disabled
            if (r0 == 0) goto Le
            com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r0 = r13.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.backgroundDisabled
            if (r0 == 0) goto Le
            goto L34
        Le:
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$SelectBoxListCustomItemHeight<T> r0 = r13.selectBoxList
            boolean r0 = r0.hasParent()
            if (r0 == 0) goto L1d
            com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r0 = r13.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.backgroundOpen
            if (r0 == 0) goto L1d
            goto L34
        L1d:
            com.badlogic.gdx.scenes.scene2d.utils.ClickListener r0 = r13.clickListener
            boolean r0 = r0.isOver()
            if (r0 == 0) goto L2c
            com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r0 = r13.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.backgroundOver
            if (r0 == 0) goto L2c
            goto L34
        L2c:
            com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r0 = r13.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.background
            if (r0 == 0) goto L33
            goto L34
        L33:
            r0 = 0
        L34:
            com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r1 = r13.style
            com.badlogic.gdx.graphics.g2d.BitmapFont r7 = r1.font
            boolean r2 = r13.disabled
            if (r2 == 0) goto L41
            com.badlogic.gdx.graphics.Color r2 = r1.disabledFontColor
            if (r2 == 0) goto L41
            goto L43
        L41:
            com.badlogic.gdx.graphics.Color r2 = r1.fontColor
        L43:
            r8 = r2
            com.badlogic.gdx.graphics.Color r1 = r13.getColor()
            float r9 = r13.getX()
            float r10 = r13.getY()
            float r11 = r13.getWidth()
            float r12 = r13.getHeight()
            float r2 = r1.r
            float r3 = r1.g
            float r4 = r1.b
            float r1 = r1.a
            float r1 = r1 * r15
            r14.setColor(r2, r3, r4, r1)
            if (r0 == 0) goto L70
            r1 = r0
            r2 = r14
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.draw(r2, r3, r4, r5, r6)
        L70:
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection<T> r1 = r13.selection
            java.lang.Object r5 = r1.first()
            if (r5 == 0) goto Lc4
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto La2
            float r2 = r0.getLeftWidth()
            float r3 = r0.getRightWidth()
            float r2 = r2 + r3
            float r11 = r11 - r2
            float r2 = r0.getBottomHeight()
            float r3 = r0.getTopHeight()
            float r2 = r2 + r3
            float r12 = r12 - r2
            float r2 = r0.getLeftWidth()
            float r9 = r9 + r2
            float r12 = r12 / r1
            float r0 = r0.getBottomHeight()
            float r12 = r12 + r0
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r0 = r7.getData()
            float r0 = r0.capHeight
            goto La9
        La2:
            float r12 = r12 / r1
            com.badlogic.gdx.graphics.g2d.BitmapFont$BitmapFontData r0 = r7.getData()
            float r0 = r0.capHeight
        La9:
            float r0 = r0 / r1
            float r12 = r12 + r0
            int r0 = (int) r12
            float r0 = (float) r0
            float r10 = r10 + r0
            r6 = r9
            float r0 = r8.r
            float r1 = r8.g
            float r2 = r8.b
            float r3 = r8.a
            float r3 = r3 * r15
            r7.setColor(r0, r1, r2, r3)
            r2 = r13
            r3 = r14
            r4 = r7
            r7 = r10
            r8 = r11
            r2.drawItem(r3, r4, r5, r6, r7, r8)
        Lc4:
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

    public void filterList(java.lang.String r8) {
            r7 = this;
            r7._lastFilter = r8
            float r0 = r7.getPrefWidth()
            float r1 = r7.getPrefHeight()
            com.badlogic.gdx.utils.Array<T> r2 = r7.items
            r2.clear()
            if (r8 == 0) goto L15
            java.lang.String r8 = r8.trim()
        L15:
            if (r8 == 0) goto L57
            int r2 = r8.length()
            if (r2 > 0) goto L1e
            goto L57
        L1e:
            com.badlogic.gdx.utils.Array<T> r2 = r7.fullItems
            int r2 = r2.size
            r3 = 1
            int r2 = r2 - r3
        L24:
            if (r2 < 0) goto L5e
            com.badlogic.gdx.utils.Array<T> r4 = r7.fullItems
            java.lang.Object r4 = r4.get(r2)
            boolean r5 = r4 instanceof org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex
            if (r5 == 0) goto L54
            r5 = r4
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex r5 = (org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex) r5
            java.lang.String r5 = r5.getName()
            int r6 = r8.length()
            if (r6 != r3) goto L49
            boolean r5 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(r5, r8)
            if (r5 == 0) goto L54
            com.badlogic.gdx.utils.Array<T> r5 = r7.items
            r5.add(r4)
            goto L54
        L49:
            boolean r5 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(r5, r8)
            if (r5 == 0) goto L54
            com.badlogic.gdx.utils.Array<T> r5 = r7.items
            r5.add(r4)
        L54:
            int r2 = r2 + (-1)
            goto L24
        L57:
            com.badlogic.gdx.utils.Array<T> r8 = r7.items
            com.badlogic.gdx.utils.Array<T> r2 = r7.fullItems
            r8.addAll(r2)
        L5e:
            com.badlogic.gdx.utils.Array<T> r8 = r7.items
            int r2 = r8.size
            if (r2 > 0) goto L69
            T r2 = r7.mDefaultNoSelection
            r8.add(r2)
        L69:
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection<T> r8 = r7.selection
            r8.validate()
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$SelectBoxListCustomItemHeight<T> r8 = r7.selectBoxList
            org.fortheloss.framework.ListCustomItemHeight<T> r8 = r8.list
            com.badlogic.gdx.utils.Array<T> r2 = r7.items
            r8.setItems(r2)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$SelectBoxListCustomItemHeight<T> r8 = r7.selectBoxList
            r8.updateSize()
            r7.invalidate()
            float r8 = r7.getPrefWidth()
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 != 0) goto L8f
            float r8 = r7.getPrefHeight()
            int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r8 == 0) goto L92
        L8f:
            r7.invalidateHierarchy()
        L92:
            return
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

    public void hideList() {
            r1 = this;
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$SelectBoxListCustomItemHeight<T> r0 = r1.selectBoxList
            r0.hide()
            return
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
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$SelectBoxListCustomItemHeight<T> r0 = r9.selectBoxList
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

    protected void onHide(com.badlogic.gdx.scenes.scene2d.Actor r6) {
            r5 = this;
            com.badlogic.gdx.graphics.Color r0 = r6.getColor()
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.a = r1
            com.badlogic.gdx.math.Interpolation r0 = com.badlogic.gdx.math.Interpolation.fade
            r2 = 1041865114(0x3e19999a, float:0.15)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.fadeOut(r2, r0)
            com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.removeActor()
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r3, r4)
            r6.addAction(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r6 = r5.filterTextField
            com.badlogic.gdx.graphics.Color r6 = r6.getColor()
            r6.a = r1
            com.badlogic.gdx.scenes.scene2d.ui.TextField r6 = r5.filterTextField
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.fadeOut(r2, r0)
            com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.removeActor()
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r3, r4)
            r6.addAction(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r6 = r5.filterClearButton
            com.badlogic.gdx.graphics.Color r6 = r6.getColor()
            r6.a = r1
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r6 = r5.filterClearButton
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.fadeOut(r2, r0)
            com.badlogic.gdx.scenes.scene2d.actions.RemoveActorAction r1 = com.badlogic.gdx.scenes.scene2d.actions.Actions.removeActor()
            com.badlogic.gdx.scenes.scene2d.actions.SequenceAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(r0, r1)
            r6.addAction(r0)
            return
    }

    protected void onShow(com.badlogic.gdx.scenes.scene2d.Actor r8, boolean r9) {
            r7 = this;
            com.badlogic.gdx.graphics.Color r9 = r8.getColor()
            r0 = 0
            r9.a = r0
            com.badlogic.gdx.math.Interpolation r9 = com.badlogic.gdx.math.Interpolation.fade
            r1 = 1050253722(0x3e99999a, float:0.3)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r2 = com.badlogic.gdx.scenes.scene2d.actions.Actions.fadeIn(r1, r9)
            r8.addAction(r2)
            com.badlogic.gdx.math.Vector2 r8 = r7.filterCoords
            float r2 = r7.getWidth()
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1082130432(0x40800000, float:4.0)
            float r3 = r3 * r4
            float r2 = r2 + r3
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r7.filterTextField
            float r3 = r3.getWidth()
            float r2 = r2 + r3
            com.badlogic.gdx.math.Vector2 r8 = r8.set(r2, r0)
            r7.localToStageCoordinates(r8)
            com.badlogic.gdx.math.Vector2 r8 = r7.filterCoords
            float r8 = r8.x
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r7.getStage()
            float r2 = r2.getWidth()
            r3 = 1056964608(0x3f000000, float:0.5)
            r5 = 1092616192(0x41200000, float:10.0)
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto La5
            com.badlogic.gdx.math.Vector2 r8 = r7.filterCoords
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r7.filterTextField
            float r2 = r2.getWidth()
            float r2 = -r2
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r4
            float r2 = r2 - r6
            com.badlogic.gdx.math.Vector2 r8 = r8.set(r2, r0)
            r7.localToStageCoordinates(r8)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r8 = r7.filterTextField
            com.badlogic.gdx.math.Vector2 r2 = r7.filterCoords
            float r6 = r2.x
            float r2 = r2.y
            r8.setPosition(r6, r2)
            com.badlogic.gdx.math.Vector2 r8 = r7.filterCoords
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r7.filterTextField
            float r2 = r2.getWidth()
            float r2 = -r2
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r4
            float r2 = r2 - r6
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r7.filterTextField
            float r4 = r4.getWidth()
            float r2 = r2 + r4
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r4 = r7.filterClearButton
            float r4 = r4.getWidth()
            float r2 = r2 - r4
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r5
            float r2 = r2 - r4
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r7.filterTextField
            float r4 = r4.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r5 = r7.filterClearButton
            float r5 = r5.getHeight()
            float r4 = r4 - r5
            float r4 = r4 * r3
            com.badlogic.gdx.math.Vector2 r8 = r8.set(r2, r4)
            r7.localToStageCoordinates(r8)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r8 = r7.filterClearButton
            com.badlogic.gdx.math.Vector2 r2 = r7.filterCoords
            float r3 = r2.x
            float r2 = r2.y
            r8.setPosition(r3, r2)
            goto L101
        La5:
            com.badlogic.gdx.math.Vector2 r8 = r7.filterCoords
            float r2 = r7.getWidth()
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r4
            float r2 = r2 + r6
            com.badlogic.gdx.math.Vector2 r8 = r8.set(r2, r0)
            r7.localToStageCoordinates(r8)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r8 = r7.filterTextField
            com.badlogic.gdx.math.Vector2 r2 = r7.filterCoords
            float r6 = r2.x
            float r2 = r2.y
            r8.setPosition(r6, r2)
            com.badlogic.gdx.math.Vector2 r8 = r7.filterCoords
            float r2 = r7.getWidth()
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r4
            float r2 = r2 + r6
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r7.filterTextField
            float r4 = r4.getWidth()
            float r2 = r2 + r4
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r4 = r7.filterClearButton
            float r4 = r4.getWidth()
            float r2 = r2 - r4
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r5
            float r2 = r2 - r4
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r7.filterTextField
            float r4 = r4.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r5 = r7.filterClearButton
            float r5 = r5.getHeight()
            float r4 = r4 - r5
            float r4 = r4 * r3
            com.badlogic.gdx.math.Vector2 r8 = r8.set(r2, r4)
            r7.localToStageCoordinates(r8)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r8 = r7.filterClearButton
            com.badlogic.gdx.math.Vector2 r2 = r7.filterCoords
            float r3 = r2.x
            float r2 = r2.y
            r8.setPosition(r3, r2)
        L101:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r8 = r7.filterTextField
            r2 = 1
            r8.setVisible(r2)
            com.badlogic.gdx.scenes.scene2d.Stage r8 = r7.getStage()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r7.filterTextField
            r8.addActor(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r8 = r7.filterTextField
            com.badlogic.gdx.graphics.Color r8 = r8.getColor()
            r8.a = r0
            com.badlogic.gdx.scenes.scene2d.ui.TextField r8 = r7.filterTextField
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r3 = com.badlogic.gdx.scenes.scene2d.actions.Actions.fadeIn(r1, r9)
            r8.addAction(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r8 = r7.filterClearButton
            r8.setVisible(r2)
            com.badlogic.gdx.scenes.scene2d.Stage r8 = r7.getStage()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r2 = r7.filterClearButton
            r8.addActor(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r8 = r7.filterClearButton
            com.badlogic.gdx.graphics.Color r8 = r8.getColor()
            r8.a = r0
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r8 = r7.filterClearButton
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r9 = com.badlogic.gdx.scenes.scene2d.actions.Actions.fadeIn(r1, r9)
            r8.addAction(r9)
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

    public void setItems(com.badlogic.gdx.utils.Array<T> r3) {
            r2 = this;
            if (r3 == 0) goto L34
            float r0 = r2.getPrefWidth()
            com.badlogic.gdx.utils.Array<T> r1 = r2.fullItems
            if (r3 == r1) goto L12
            r1.clear()
            com.badlogic.gdx.utils.Array<T> r1 = r2.fullItems
            r1.addAll(r3)
        L12:
            java.lang.String r3 = r2._lastFilter
            r2.filterList(r3)
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection<T> r3 = r2.selection
            r3.validate()
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$SelectBoxListCustomItemHeight<T> r3 = r2.selectBoxList
            org.fortheloss.framework.ListCustomItemHeight<T> r3 = r3.list
            com.badlogic.gdx.utils.Array<T> r1 = r2.items
            r3.setItems(r1)
            r2.invalidate()
            float r3 = r2.getPrefWidth()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L33
            r2.invalidateHierarchy()
        L33:
            return
        L34:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "newItems cannot be null."
            r3.<init>(r0)
            throw r3
    }

    public void setMaxListCount(int r2) {
            r1 = this;
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$SelectBoxListCustomItemHeight<T> r0 = r1.selectBoxList
            r0.maxListCount = r2
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
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$SelectBoxListCustomItemHeight<T> r0 = r1.selectBoxList
            r0.hide()
        L7:
            super.setStage(r2)
            return
    }

    public void setStyle(com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r3) {
            r2 = this;
            if (r3 == 0) goto L1a
            r2.style = r3
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$SelectBoxListCustomItemHeight<T> r0 = r2.selectBoxList
            if (r0 == 0) goto L16
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r1 = r3.scrollStyle
            r0.setStyle(r1)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$SelectBoxListCustomItemHeight<T> r0 = r2.selectBoxList
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
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter$SelectBoxListCustomItemHeight<T> r0 = r2.selectBoxList
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
