package com.badlogic.gdx.scenes.scene2d.ui;

/* loaded from: classes.dex */
public class Window extends com.badlogic.gdx.scenes.scene2d.ui.Table {
    private static final com.badlogic.gdx.math.Vector2 tmpPosition = null;
    private static final com.badlogic.gdx.math.Vector2 tmpSize = null;
    protected boolean dragging;
    boolean drawTitleTable;
    protected int edge;
    boolean isModal;
    boolean isMovable;
    boolean isResizable;
    boolean keepWithinStage;
    int resizeBorder;
    private com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle style;
    com.badlogic.gdx.scenes.scene2d.ui.Label titleLabel;
    com.badlogic.gdx.scenes.scene2d.ui.Table titleTable;




    public static class WindowStyle {
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable background;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable stageBackground;
        public com.badlogic.gdx.graphics.g2d.BitmapFont titleFont;
        public com.badlogic.gdx.graphics.Color titleFontColor;

        public WindowStyle() {
                r2 = this;
                r2.<init>()
                com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
                r1 = 1065353216(0x3f800000, float:1.0)
                r0.<init>(r1, r1, r1, r1)
                r2.titleFontColor = r0
                return
        }
    }

    static {
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Window.tmpPosition = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Window.tmpSize = r0
            return
    }

    public Window(java.lang.String r5, com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle r6) {
            r4 = this;
            r4.<init>()
            r0 = 1
            r4.isMovable = r0
            r1 = 8
            r4.resizeBorder = r1
            r4.keepWithinStage = r0
            if (r5 == 0) goto L62
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r4.setTouchable(r1)
            r4.setClip(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.graphics.g2d.BitmapFont r2 = r6.titleFont
            com.badlogic.gdx.graphics.Color r3 = r6.titleFontColor
            r1.<init>(r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r5 = r4.newLabel(r5, r1)
            r4.titleLabel = r5
            r5.setEllipsis(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Window$1 r5 = new com.badlogic.gdx.scenes.scene2d.ui.Window$1
            r5.<init>(r4)
            r4.titleTable = r5
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r4.titleLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.fillX()
            r0 = 0
            r5.minWidth(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r4.titleTable
            r4.addActor(r5)
            r4.setStyle(r6)
            r5 = 1125515264(0x43160000, float:150.0)
            r4.setWidth(r5)
            r4.setHeight(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Window$2 r5 = new com.badlogic.gdx.scenes.scene2d.ui.Window$2
            r5.<init>(r4)
            r4.addCaptureListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Window$3 r5 = new com.badlogic.gdx.scenes.scene2d.ui.Window$3
            r5.<init>(r4)
            r4.addListener(r5)
            return
        L62:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "title cannot be null."
            r5.<init>(r6)
            throw r5
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r12, float r13) {
            r11 = this;
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r11.getStage()
            if (r0 == 0) goto L59
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r0.getKeyboardFocus()
            if (r1 != 0) goto Lf
            r0.setKeyboardFocus(r11)
        Lf:
            r11.keepWithinStage()
            com.badlogic.gdx.scenes.scene2d.ui.Window$WindowStyle r1 = r11.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r1.stageBackground
            if (r1 == 0) goto L59
            com.badlogic.gdx.math.Vector2 r1 = com.badlogic.gdx.scenes.scene2d.ui.Window.tmpPosition
            r2 = 0
            com.badlogic.gdx.math.Vector2 r2 = r1.set(r2, r2)
            r11.stageToLocalCoordinates(r2)
            com.badlogic.gdx.math.Vector2 r2 = com.badlogic.gdx.scenes.scene2d.ui.Window.tmpSize
            float r3 = r0.getWidth()
            float r0 = r0.getHeight()
            com.badlogic.gdx.math.Vector2 r0 = r2.set(r3, r0)
            r11.stageToLocalCoordinates(r0)
            float r0 = r11.getX()
            float r3 = r1.x
            float r7 = r0 + r3
            float r0 = r11.getY()
            float r1 = r1.y
            float r8 = r0 + r1
            float r0 = r11.getX()
            float r1 = r2.x
            float r9 = r0 + r1
            float r0 = r11.getY()
            float r1 = r2.y
            float r10 = r0 + r1
            r4 = r11
            r5 = r12
            r6 = r13
            r4.drawStageBackground(r5, r6, r7, r8, r9, r10)
        L59:
            super.draw(r12, r13)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table
    protected void drawBackground(com.badlogic.gdx.graphics.g2d.Batch r4, float r5, float r6, float r7) {
            r3 = this;
            super.drawBackground(r4, r5, r6, r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r3.titleTable
            com.badlogic.gdx.graphics.Color r6 = r6.getColor()
            com.badlogic.gdx.graphics.Color r7 = r3.getColor()
            float r7 = r7.a
            r6.a = r7
            float r6 = r3.getPadTop()
            float r7 = r3.getPadLeft()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r3.titleTable
            float r1 = r3.getWidth()
            float r1 = r1 - r7
            float r2 = r3.getPadRight()
            float r1 = r1 - r2
            r0.setSize(r1, r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r3.titleTable
            float r1 = r3.getHeight()
            float r1 = r1 - r6
            r0.setPosition(r7, r1)
            r6 = 1
            r3.drawTitleTable = r6
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r3.titleTable
            r6.draw(r4, r5)
            r4 = 0
            r3.drawTitleTable = r4
            return
    }

    protected void drawStageBackground(com.badlogic.gdx.graphics.g2d.Batch r7, float r8, float r9, float r10, float r11, float r12) {
            r6 = this;
            com.badlogic.gdx.graphics.Color r0 = r6.getColor()
            float r1 = r0.r
            float r2 = r0.g
            float r3 = r0.b
            float r0 = r0.a
            float r0 = r0 * r8
            r7.setColor(r1, r2, r3, r0)
            com.badlogic.gdx.scenes.scene2d.ui.Window$WindowStyle r8 = r6.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r8.stageBackground
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.draw(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
            r3 = this;
            float r0 = super.getPrefWidth()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r3.titleTable
            float r1 = r1.getPrefWidth()
            float r2 = r3.getPadLeft()
            float r1 = r1 + r2
            float r2 = r3.getPadRight()
            float r1 = r1 + r2
            float r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle getStyle() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Window$WindowStyle r0 = r1.style
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Label getTitleLabel() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r1.titleLabel
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Table getTitleTable() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r1.titleTable
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public com.badlogic.gdx.scenes.scene2d.Actor hit(float r3, float r4, boolean r5) {
            r2 = this;
            boolean r0 = r2.isVisible()
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            com.badlogic.gdx.scenes.scene2d.Actor r0 = super.hit(r3, r4, r5)
            if (r0 != 0) goto L1d
            boolean r1 = r2.isModal
            if (r1 == 0) goto L1d
            if (r5 == 0) goto L1c
            com.badlogic.gdx.scenes.scene2d.Touchable r5 = r2.getTouchable()
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            if (r5 != r1) goto L1d
        L1c:
            return r2
        L1d:
            float r5 = r2.getHeight()
            if (r0 == 0) goto L53
            if (r0 != r2) goto L26
            goto L53
        L26:
            int r1 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r1 > 0) goto L53
            float r1 = r2.getPadTop()
            float r5 = r5 - r1
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L53
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 < 0) goto L53
            float r4 = r2.getWidth()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L53
            r3 = r0
        L41:
            com.badlogic.gdx.scenes.scene2d.Group r4 = r3.getParent()
            if (r4 == r2) goto L4c
            com.badlogic.gdx.scenes.scene2d.Group r3 = r3.getParent()
            goto L41
        L4c:
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r2.getCell(r3)
            if (r3 == 0) goto L53
            return r2
        L53:
            return r0
    }

    public void keepWithinStage() {
            r11 = this;
            boolean r0 = r11.keepWithinStage
            if (r0 != 0) goto L5
            return
        L5:
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r11.getStage()
            if (r0 != 0) goto Lc
            return
        Lc:
            com.badlogic.gdx.graphics.Camera r1 = r0.getCamera()
            boolean r2 = r1 instanceof com.badlogic.gdx.graphics.OrthographicCamera
            if (r2 == 0) goto La4
            r2 = r1
            com.badlogic.gdx.graphics.OrthographicCamera r2 = (com.badlogic.gdx.graphics.OrthographicCamera) r2
            float r3 = r0.getWidth()
            float r0 = r0.getHeight()
            r4 = 16
            float r5 = r11.getX(r4)
            com.badlogic.gdx.math.Vector3 r6 = r1.position
            float r6 = r6.x
            float r5 = r5 - r6
            r7 = 1073741824(0x40000000, float:2.0)
            float r8 = r3 / r7
            float r9 = r2.zoom
            float r10 = r8 / r9
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 <= 0) goto L40
            float r5 = r8 / r9
            float r6 = r6 + r5
            float r5 = r11.getY(r4)
            r11.setPosition(r6, r5, r4)
        L40:
            r4 = 8
            float r5 = r11.getX(r4)
            com.badlogic.gdx.math.Vector3 r6 = r1.position
            float r6 = r6.x
            float r5 = r5 - r6
            float r3 = -r3
            float r3 = r3 / r7
            float r9 = r2.zoom
            float r3 = r3 / r9
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 >= 0) goto L5d
            float r8 = r8 / r9
            float r6 = r6 - r8
            float r3 = r11.getY(r4)
            r11.setPosition(r6, r3, r4)
        L5d:
            r3 = 2
            float r4 = r11.getY(r3)
            com.badlogic.gdx.math.Vector3 r5 = r1.position
            float r5 = r5.y
            float r4 = r4 - r5
            float r5 = r0 / r7
            float r6 = r2.zoom
            float r6 = r5 / r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L81
            float r4 = r11.getX(r3)
            com.badlogic.gdx.math.Vector3 r6 = r1.position
            float r6 = r6.y
            float r8 = r2.zoom
            float r8 = r5 / r8
            float r6 = r6 + r8
            r11.setPosition(r4, r6, r3)
        L81:
            r3 = 4
            float r4 = r11.getY(r3)
            com.badlogic.gdx.math.Vector3 r6 = r1.position
            float r6 = r6.y
            float r4 = r4 - r6
            float r0 = -r0
            float r0 = r0 / r7
            float r6 = r2.zoom
            float r0 = r0 / r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto Led
            float r0 = r11.getX(r3)
            com.badlogic.gdx.math.Vector3 r1 = r1.position
            float r1 = r1.y
            float r2 = r2.zoom
            float r5 = r5 / r2
            float r1 = r1 - r5
            r11.setPosition(r0, r1, r3)
            goto Led
        La4:
            com.badlogic.gdx.scenes.scene2d.Group r1 = r11.getParent()
            com.badlogic.gdx.scenes.scene2d.Group r2 = r0.getRoot()
            if (r1 != r2) goto Led
            float r1 = r0.getWidth()
            float r0 = r0.getHeight()
            float r2 = r11.getX()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto Lc2
            r11.setX(r3)
        Lc2:
            float r2 = r11.getRight()
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 <= 0) goto Ld2
            float r2 = r11.getWidth()
            float r1 = r1 - r2
            r11.setX(r1)
        Ld2:
            float r1 = r11.getY()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto Ldd
            r11.setY(r3)
        Ldd:
            float r1 = r11.getTop()
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 <= 0) goto Led
            float r1 = r11.getHeight()
            float r0 = r0 - r1
            r11.setY(r0)
        Led:
            return
    }

    protected com.badlogic.gdx.scenes.scene2d.ui.Label newLabel(java.lang.String r2, com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle r3) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            r0.<init>(r2, r3)
            return r0
    }

    public void setKeepWithinStage(boolean r1) {
            r0 = this;
            r0.keepWithinStage = r1
            return
    }

    public void setModal(boolean r1) {
            r0 = this;
            r0.isModal = r1
            return
    }

    public void setMovable(boolean r1) {
            r0 = this;
            r0.isMovable = r1
            return
    }

    public void setResizable(boolean r1) {
            r0 = this;
            r0.isResizable = r1
            return
    }

    public void setStyle(com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle r4) {
            r3 = this;
            if (r4 == 0) goto L1b
            r3.style = r4
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r4.background
            r3.setBackground(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r3.titleLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r1 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.graphics.g2d.BitmapFont r2 = r4.titleFont
            com.badlogic.gdx.graphics.Color r4 = r4.titleFontColor
            r1.<init>(r2, r4)
            r0.setStyle(r1)
            r3.invalidateHierarchy()
            return
        L1b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "style cannot be null."
            r4.<init>(r0)
            throw r4
    }
}
