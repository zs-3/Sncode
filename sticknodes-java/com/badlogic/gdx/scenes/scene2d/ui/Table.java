package com.badlogic.gdx.scenes.scene2d.ui;

/* loaded from: classes.dex */
public class Table extends com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup {
    public static com.badlogic.gdx.scenes.scene2d.ui.Value backgroundBottom;
    public static com.badlogic.gdx.scenes.scene2d.ui.Value backgroundLeft;
    public static com.badlogic.gdx.scenes.scene2d.ui.Value backgroundRight;
    public static com.badlogic.gdx.scenes.scene2d.ui.Value backgroundTop;
    static final com.badlogic.gdx.utils.Pool<com.badlogic.gdx.scenes.scene2d.ui.Cell> cellPool = null;
    private static float[] columnWeightedWidth;
    public static com.badlogic.gdx.graphics.Color debugActorColor;
    public static com.badlogic.gdx.graphics.Color debugCellColor;
    public static com.badlogic.gdx.graphics.Color debugTableColor;
    private static float[] rowWeightedHeight;
    int align;
    com.badlogic.gdx.scenes.scene2d.utils.Drawable background;
    private final com.badlogic.gdx.scenes.scene2d.ui.Cell cellDefaults;
    private final com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Cell> cells;
    private boolean clip;
    private final com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Cell> columnDefaults;
    private float[] columnMinWidth;
    private float[] columnPrefWidth;
    private float[] columnWidth;
    private int columns;
    com.badlogic.gdx.scenes.scene2d.ui.Table.Debug debug;
    com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Table.DebugRect> debugRects;
    private float[] expandHeight;
    private float[] expandWidth;
    private boolean implicitEndRow;
    com.badlogic.gdx.scenes.scene2d.ui.Value padBottom;
    com.badlogic.gdx.scenes.scene2d.ui.Value padLeft;
    com.badlogic.gdx.scenes.scene2d.ui.Value padRight;
    com.badlogic.gdx.scenes.scene2d.ui.Value padTop;
    boolean round;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell rowDefaults;
    private float[] rowHeight;
    private float[] rowMinHeight;
    private float[] rowPrefHeight;
    private int rows;
    private boolean sizeInvalid;
    private com.badlogic.gdx.scenes.scene2d.ui.Skin skin;
    private float tableMinHeight;
    private float tableMinWidth;
    private float tablePrefHeight;
    private float tablePrefWidth;






    public enum Debug extends java.lang.Enum<com.badlogic.gdx.scenes.scene2d.ui.Table.Debug> {
        private static final /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Table.Debug[] $VALUES = null;
        public static final com.badlogic.gdx.scenes.scene2d.ui.Table.Debug actor = null;
        public static final com.badlogic.gdx.scenes.scene2d.ui.Table.Debug all = null;
        public static final com.badlogic.gdx.scenes.scene2d.ui.Table.Debug cell = null;
        public static final com.badlogic.gdx.scenes.scene2d.ui.Table.Debug none = null;
        public static final com.badlogic.gdx.scenes.scene2d.ui.Table.Debug table = null;

        static {
                com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table$Debug
                java.lang.String r1 = "none"
                r2 = 0
                r0.<init>(r1, r2)
                com.badlogic.gdx.scenes.scene2d.ui.Table.Debug.none = r0
                com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r1 = new com.badlogic.gdx.scenes.scene2d.ui.Table$Debug
                java.lang.String r3 = "all"
                r4 = 1
                r1.<init>(r3, r4)
                com.badlogic.gdx.scenes.scene2d.ui.Table.Debug.all = r1
                com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r3 = new com.badlogic.gdx.scenes.scene2d.ui.Table$Debug
                java.lang.String r5 = "table"
                r6 = 2
                r3.<init>(r5, r6)
                com.badlogic.gdx.scenes.scene2d.ui.Table.Debug.table = r3
                com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r5 = new com.badlogic.gdx.scenes.scene2d.ui.Table$Debug
                java.lang.String r7 = "cell"
                r8 = 3
                r5.<init>(r7, r8)
                com.badlogic.gdx.scenes.scene2d.ui.Table.Debug.cell = r5
                com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r7 = new com.badlogic.gdx.scenes.scene2d.ui.Table$Debug
                java.lang.String r9 = "actor"
                r10 = 4
                r7.<init>(r9, r10)
                com.badlogic.gdx.scenes.scene2d.ui.Table.Debug.actor = r7
                r9 = 5
                com.badlogic.gdx.scenes.scene2d.ui.Table$Debug[] r9 = new com.badlogic.gdx.scenes.scene2d.ui.Table.Debug[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                com.badlogic.gdx.scenes.scene2d.ui.Table.Debug.$VALUES = r9
                return
        }

        Debug(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.badlogic.gdx.scenes.scene2d.ui.Table.Debug valueOf(java.lang.String r1) {
                java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.Table$Debug> r0 = com.badlogic.gdx.scenes.scene2d.ui.Table.Debug.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r1 = (com.badlogic.gdx.scenes.scene2d.ui.Table.Debug) r1
                return r1
        }

        public static com.badlogic.gdx.scenes.scene2d.ui.Table.Debug[] values() {
                com.badlogic.gdx.scenes.scene2d.ui.Table$Debug[] r0 = com.badlogic.gdx.scenes.scene2d.ui.Table.Debug.$VALUES
                java.lang.Object r0 = r0.clone()
                com.badlogic.gdx.scenes.scene2d.ui.Table$Debug[] r0 = (com.badlogic.gdx.scenes.scene2d.ui.Table.Debug[]) r0
                return r0
        }
    }

    public static class DebugRect extends com.badlogic.gdx.math.Rectangle {
        static com.badlogic.gdx.utils.Pool<com.badlogic.gdx.scenes.scene2d.ui.Table.DebugRect> pool;
        com.badlogic.gdx.graphics.Color color;

        static {
                java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.Table$DebugRect> r0 = com.badlogic.gdx.scenes.scene2d.ui.Table.DebugRect.class
                com.badlogic.gdx.utils.Pool r0 = com.badlogic.gdx.utils.Pools.get(r0)
                com.badlogic.gdx.scenes.scene2d.ui.Table.DebugRect.pool = r0
                return
        }

        public DebugRect() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r1, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table.debugTableColor = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>(r2, r1, r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table.debugCellColor = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>(r1, r2, r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table.debugActorColor = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table$1 r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table$1
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Table.cellPool = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table$2 r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table$2
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Table.backgroundTop = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table$3 r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table$3
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Table.backgroundLeft = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table$4 r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table$4
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Table.backgroundBottom = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table$5 r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table$5
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Table.backgroundRight = r0
            return
    }

    public Table() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public Table(com.badlogic.gdx.scenes.scene2d.ui.Skin r3) {
            r2 = this;
            r2.<init>()
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r1 = 4
            r0.<init>(r1)
            r2.cells = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r1 = 2
            r0.<init>(r1)
            r2.columnDefaults = r0
            r0 = 1
            r2.sizeInvalid = r0
            com.badlogic.gdx.scenes.scene2d.ui.Value r1 = com.badlogic.gdx.scenes.scene2d.ui.Table.backgroundTop
            r2.padTop = r1
            com.badlogic.gdx.scenes.scene2d.ui.Value r1 = com.badlogic.gdx.scenes.scene2d.ui.Table.backgroundLeft
            r2.padLeft = r1
            com.badlogic.gdx.scenes.scene2d.ui.Value r1 = com.badlogic.gdx.scenes.scene2d.ui.Table.backgroundBottom
            r2.padBottom = r1
            com.badlogic.gdx.scenes.scene2d.ui.Value r1 = com.badlogic.gdx.scenes.scene2d.ui.Table.backgroundRight
            r2.padRight = r1
            r2.align = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r1 = com.badlogic.gdx.scenes.scene2d.ui.Table.Debug.none
            r2.debug = r1
            r2.round = r0
            r2.skin = r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r2.obtainCell()
            r2.cellDefaults = r3
            r3 = 0
            r2.setTransform(r3)
            com.badlogic.gdx.scenes.scene2d.Touchable r3 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r2.setTouchable(r3)
            return
    }

    private void addDebugRect(float r2, float r3, float r4, float r5, com.badlogic.gdx.graphics.Color r6) {
            r1 = this;
            com.badlogic.gdx.utils.Pool<com.badlogic.gdx.scenes.scene2d.ui.Table$DebugRect> r0 = com.badlogic.gdx.scenes.scene2d.ui.Table.DebugRect.pool
            java.lang.Object r0 = r0.obtain()
            com.badlogic.gdx.scenes.scene2d.ui.Table$DebugRect r0 = (com.badlogic.gdx.scenes.scene2d.ui.Table.DebugRect) r0
            r0.color = r6
            r0.set(r2, r3, r4, r5)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Table$DebugRect> r2 = r1.debugRects
            r2.add(r0)
            return
    }

    private void addDebugRects(float r12, float r13, float r14, float r15) {
            r11 = this;
            r11.clearDebugRects()
            com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r0 = r11.debug
            com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r1 = com.badlogic.gdx.scenes.scene2d.ui.Table.Debug.table
            if (r0 == r1) goto Ld
            com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r1 = com.badlogic.gdx.scenes.scene2d.ui.Table.Debug.all
            if (r0 != r1) goto L2c
        Ld:
            r3 = 0
            r4 = 0
            float r5 = r11.getWidth()
            float r6 = r11.getHeight()
            com.badlogic.gdx.graphics.Color r7 = com.badlogic.gdx.scenes.scene2d.ui.Table.debugTableColor
            r2 = r11
            r2.addDebugRect(r3, r4, r5, r6, r7)
            float r0 = r11.getHeight()
            float r3 = r0 - r13
            float r5 = -r15
            com.badlogic.gdx.graphics.Color r6 = com.badlogic.gdx.scenes.scene2d.ui.Table.debugTableColor
            r1 = r11
            r2 = r12
            r4 = r14
            r1.addDebugRect(r2, r3, r4, r5, r6)
        L2c:
            r14 = 0
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Cell> r15 = r11.cells
            int r15 = r15.size
            r0 = r12
        L32:
            if (r14 >= r15) goto La9
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Cell> r1 = r11.cells
            java.lang.Object r1 = r1.get(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r1
            com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r2 = r11.debug
            com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r3 = com.badlogic.gdx.scenes.scene2d.ui.Table.Debug.actor
            if (r2 == r3) goto L46
            com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r3 = com.badlogic.gdx.scenes.scene2d.ui.Table.Debug.all
            if (r2 != r3) goto L54
        L46:
            float r5 = r1.actorX
            float r6 = r1.actorY
            float r7 = r1.actorWidth
            float r8 = r1.actorHeight
            com.badlogic.gdx.graphics.Color r9 = com.badlogic.gdx.scenes.scene2d.ui.Table.debugActorColor
            r4 = r11
            r4.addDebugRect(r5, r6, r7, r8, r9)
        L54:
            r2 = 0
            int r3 = r1.column
            java.lang.Integer r4 = r1.colspan
            int r4 = r4.intValue()
            int r4 = r4 + r3
        L5e:
            if (r3 >= r4) goto L68
            float[] r5 = r11.columnWidth
            r5 = r5[r3]
            float r2 = r2 + r5
            int r3 = r3 + 1
            goto L5e
        L68:
            float r3 = r1.computedPadLeft
            float r4 = r1.computedPadRight
            float r4 = r4 + r3
            float r2 = r2 - r4
            float r0 = r0 + r3
            com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r3 = r11.debug
            com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r4 = com.badlogic.gdx.scenes.scene2d.ui.Table.Debug.cell
            if (r3 == r4) goto L79
            com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r4 = com.badlogic.gdx.scenes.scene2d.ui.Table.Debug.all
            if (r3 != r4) goto L95
        L79:
            float[] r3 = r11.rowHeight
            int r4 = r1.row
            r3 = r3[r4]
            float r4 = r1.computedPadTop
            float r3 = r3 - r4
            float r5 = r1.computedPadBottom
            float r3 = r3 - r5
            float r4 = r4 + r13
            float r5 = r11.getHeight()
            float r7 = r5 - r4
            float r9 = -r3
            com.badlogic.gdx.graphics.Color r10 = com.badlogic.gdx.scenes.scene2d.ui.Table.debugCellColor
            r5 = r11
            r6 = r0
            r8 = r2
            r5.addDebugRect(r6, r7, r8, r9, r10)
        L95:
            boolean r3 = r1.endRow
            if (r3 == 0) goto La2
            float[] r0 = r11.rowHeight
            int r1 = r1.row
            r0 = r0[r1]
            float r13 = r13 + r0
            r0 = r12
            goto La6
        La2:
            float r1 = r1.computedPadRight
            float r2 = r2 + r1
            float r0 = r0 + r2
        La6:
            int r14 = r14 + 1
            goto L32
        La9:
            return
    }

    private void clearDebugRects() {
            r2 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Table$DebugRect> r0 = r2.debugRects
            if (r0 != 0) goto Lb
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r2.debugRects = r0
        Lb:
            com.badlogic.gdx.utils.Pool<com.badlogic.gdx.scenes.scene2d.ui.Table$DebugRect> r0 = com.badlogic.gdx.scenes.scene2d.ui.Table.DebugRect.pool
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Table$DebugRect> r1 = r2.debugRects
            r0.freeAll(r1)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Table$DebugRect> r0 = r2.debugRects
            r0.clear()
            return
    }

    private void computeSize() {
            r26 = this;
            r0 = r26
            r1 = 0
            r0.sizeInvalid = r1
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Cell> r2 = r0.cells
            T[] r3 = r2.items
            int r2 = r2.size
            r4 = 1
            if (r2 <= 0) goto L1d
            int r5 = r2 + (-1)
            r5 = r3[r5]
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r5
            boolean r5 = r5.endRow
            if (r5 != 0) goto L1d
            r26.endRow()
            r0.implicitEndRow = r4
        L1d:
            int r5 = r0.columns
            int r6 = r0.rows
            float[] r7 = r0.columnMinWidth
            float[] r7 = r0.ensureSize(r7, r5)
            r0.columnMinWidth = r7
            float[] r8 = r0.rowMinHeight
            float[] r8 = r0.ensureSize(r8, r6)
            r0.rowMinHeight = r8
            float[] r9 = r0.columnPrefWidth
            float[] r9 = r0.ensureSize(r9, r5)
            r0.columnPrefWidth = r9
            float[] r10 = r0.rowPrefHeight
            float[] r10 = r0.ensureSize(r10, r6)
            r0.rowPrefHeight = r10
            float[] r11 = r0.columnWidth
            float[] r11 = r0.ensureSize(r11, r5)
            r0.columnWidth = r11
            float[] r11 = r0.rowHeight
            float[] r11 = r0.ensureSize(r11, r6)
            r0.rowHeight = r11
            float[] r11 = r0.expandWidth
            float[] r11 = r0.ensureSize(r11, r5)
            r0.expandWidth = r11
            float[] r12 = r0.expandHeight
            float[] r12 = r0.ensureSize(r12, r6)
            r0.expandHeight = r12
            r14 = 0
            r15 = 0
        L63:
            if (r14 >= r2) goto L1cc
            r16 = r3[r14]
            r1 = r16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r1
            int r4 = r1.column
            int r13 = r1.row
            r18 = r2
            java.lang.Integer r2 = r1.colspan
            int r2 = r2.intValue()
            r19 = r14
            com.badlogic.gdx.scenes.scene2d.Actor r14 = r1.actor
            r20 = r8
            java.lang.Integer r8 = r1.expandY
            int r8 = r8.intValue()
            if (r8 == 0) goto L96
            r8 = r12[r13]
            r17 = 0
            int r8 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r8 != 0) goto L96
            java.lang.Integer r8 = r1.expandY
            int r8 = r8.intValue()
            float r8 = (float) r8
            r12[r13] = r8
        L96:
            r8 = 1
            if (r2 != r8) goto Lb2
            java.lang.Integer r8 = r1.expandX
            int r8 = r8.intValue()
            if (r8 == 0) goto Lb2
            r8 = r11[r4]
            r17 = 0
            int r8 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r8 != 0) goto Lb2
            java.lang.Integer r8 = r1.expandX
            int r8 = r8.intValue()
            float r8 = (float) r8
            r11[r4] = r8
        Lb2:
            com.badlogic.gdx.scenes.scene2d.ui.Value r8 = r1.padLeft
            float r8 = r8.get(r14)
            r21 = r12
            if (r4 != 0) goto Lbe
            r12 = 0
            goto Lca
        Lbe:
            com.badlogic.gdx.scenes.scene2d.ui.Value r12 = r1.spaceLeft
            float r12 = r12.get(r14)
            float r12 = r12 - r15
            r15 = 0
            float r12 = java.lang.Math.max(r15, r12)
        Lca:
            float r8 = r8 + r12
            r1.computedPadLeft = r8
            com.badlogic.gdx.scenes.scene2d.ui.Value r8 = r1.padTop
            float r8 = r8.get(r14)
            r1.computedPadTop = r8
            int r12 = r1.cellAboveIndex
            r15 = -1
            if (r12 == r15) goto Lf3
            r12 = r3[r12]
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r12
            com.badlogic.gdx.scenes.scene2d.ui.Value r15 = r1.spaceTop
            float r15 = r15.get(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Value r12 = r12.spaceBottom
            float r12 = r12.get(r14)
            float r15 = r15 - r12
            r12 = 0
            float r15 = java.lang.Math.max(r12, r15)
            float r8 = r8 + r15
            r1.computedPadTop = r8
        Lf3:
            com.badlogic.gdx.scenes.scene2d.ui.Value r8 = r1.spaceRight
            float r15 = r8.get(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Value r8 = r1.padRight
            float r8 = r8.get(r14)
            int r12 = r4 + r2
            if (r12 != r5) goto L105
            r12 = 0
            goto L106
        L105:
            r12 = r15
        L106:
            float r8 = r8 + r12
            r1.computedPadRight = r8
            com.badlogic.gdx.scenes.scene2d.ui.Value r8 = r1.padBottom
            float r8 = r8.get(r14)
            int r12 = r6 + (-1)
            if (r13 != r12) goto L115
            r12 = 0
            goto L11b
        L115:
            com.badlogic.gdx.scenes.scene2d.ui.Value r12 = r1.spaceBottom
            float r12 = r12.get(r14)
        L11b:
            float r8 = r8 + r12
            r1.computedPadBottom = r8
            com.badlogic.gdx.scenes.scene2d.ui.Value r8 = r1.prefWidth
            float r8 = r8.get(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Value r12 = r1.prefHeight
            float r12 = r12.get(r14)
            r22 = r15
            com.badlogic.gdx.scenes.scene2d.ui.Value r15 = r1.minWidth
            float r15 = r15.get(r14)
            r23 = r6
            com.badlogic.gdx.scenes.scene2d.ui.Value r6 = r1.minHeight
            float r6 = r6.get(r14)
            r24 = r5
            com.badlogic.gdx.scenes.scene2d.ui.Value r5 = r1.maxWidth
            float r5 = r5.get(r14)
            r25 = r11
            com.badlogic.gdx.scenes.scene2d.ui.Value r11 = r1.maxHeight
            float r11 = r11.get(r14)
            int r14 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r14 >= 0) goto L14f
            r8 = r15
        L14f:
            int r14 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r14 >= 0) goto L154
            r12 = r6
        L154:
            r14 = 0
            int r17 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r17 <= 0) goto L15e
            int r17 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r17 <= 0) goto L15e
            goto L15f
        L15e:
            r5 = r8
        L15f:
            int r8 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r8 <= 0) goto L168
            int r8 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r8 <= 0) goto L168
            goto L169
        L168:
            r11 = r12
        L169:
            boolean r8 = r0.round
            if (r8 == 0) goto L187
            double r14 = (double) r15
            double r14 = java.lang.Math.ceil(r14)
            float r15 = (float) r14
            r8 = r15
            double r14 = (double) r6
            double r14 = java.lang.Math.ceil(r14)
            float r6 = (float) r14
            double r14 = (double) r5
            double r14 = java.lang.Math.ceil(r14)
            float r5 = (float) r14
            double r11 = (double) r11
            double r11 = java.lang.Math.ceil(r11)
            float r11 = (float) r11
            r15 = r8
        L187:
            r8 = 1
            if (r2 != r8) goto L1a1
            float r2 = r1.computedPadLeft
            float r8 = r1.computedPadRight
            float r2 = r2 + r8
            r8 = r9[r4]
            float r5 = r5 + r2
            float r5 = java.lang.Math.max(r8, r5)
            r9[r4] = r5
            r5 = r7[r4]
            float r15 = r15 + r2
            float r2 = java.lang.Math.max(r5, r15)
            r7[r4] = r2
        L1a1:
            float r2 = r1.computedPadTop
            float r1 = r1.computedPadBottom
            float r2 = r2 + r1
            r1 = r10[r13]
            float r11 = r11 + r2
            float r1 = java.lang.Math.max(r1, r11)
            r10[r13] = r1
            r1 = r20[r13]
            float r6 = r6 + r2
            float r1 = java.lang.Math.max(r1, r6)
            r20[r13] = r1
            int r14 = r19 + 1
            r2 = r18
            r8 = r20
            r12 = r21
            r15 = r22
            r6 = r23
            r5 = r24
            r11 = r25
            r1 = 0
            r4 = 1
            goto L63
        L1cc:
            r24 = r5
            r23 = r6
            r20 = r8
            r25 = r11
            r6 = r2
            r1 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r8 = 0
        L1da:
            if (r8 >= r6) goto L24d
            r11 = r3[r8]
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r11
            int r12 = r11.column
            java.lang.Integer r13 = r11.expandX
            int r13 = r13.intValue()
            if (r13 == 0) goto L20d
            java.lang.Integer r14 = r11.colspan
            int r14 = r14.intValue()
            int r14 = r14 + r12
            r15 = r12
        L1f2:
            if (r15 >= r14) goto L200
            r18 = r25[r15]
            r17 = 0
            int r18 = (r18 > r17 ? 1 : (r18 == r17 ? 0 : -1))
            if (r18 == 0) goto L1fd
            goto L20d
        L1fd:
            int r15 = r15 + 1
            goto L1f2
        L200:
            r15 = r12
        L201:
            if (r15 >= r14) goto L20d
            r18 = r14
            float r14 = (float) r13
            r25[r15] = r14
            int r15 = r15 + 1
            r14 = r18
            goto L201
        L20d:
            java.lang.Boolean r13 = r11.uniformX
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            if (r13 != r14) goto L22f
            java.lang.Integer r13 = r11.colspan
            int r13 = r13.intValue()
            r15 = 1
            if (r13 != r15) goto L22f
            float r13 = r11.computedPadLeft
            float r15 = r11.computedPadRight
            float r13 = r13 + r15
            r15 = r7[r12]
            float r15 = r15 - r13
            float r4 = java.lang.Math.max(r4, r15)
            r12 = r9[r12]
            float r12 = r12 - r13
            float r1 = java.lang.Math.max(r1, r12)
        L22f:
            java.lang.Boolean r12 = r11.uniformY
            if (r12 != r14) goto L24a
            float r12 = r11.computedPadTop
            float r13 = r11.computedPadBottom
            float r12 = r12 + r13
            int r13 = r11.row
            r13 = r20[r13]
            float r13 = r13 - r12
            float r5 = java.lang.Math.max(r5, r13)
            int r11 = r11.row
            r11 = r10[r11]
            float r11 = r11 - r12
            float r2 = java.lang.Math.max(r2, r11)
        L24a:
            int r8 = r8 + 1
            goto L1da
        L24d:
            r8 = 0
            int r11 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r11 > 0) goto L256
            int r12 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r12 <= 0) goto L298
        L256:
            r8 = 0
        L257:
            if (r8 >= r6) goto L298
            r12 = r3[r8]
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r12
            if (r11 <= 0) goto L27c
            java.lang.Boolean r13 = r12.uniformX
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            if (r13 != r14) goto L27c
            java.lang.Integer r13 = r12.colspan
            int r13 = r13.intValue()
            r14 = 1
            if (r13 != r14) goto L27c
            float r13 = r12.computedPadLeft
            float r14 = r12.computedPadRight
            float r13 = r13 + r14
            int r14 = r12.column
            float r15 = r4 + r13
            r7[r14] = r15
            float r13 = r13 + r1
            r9[r14] = r13
        L27c:
            r13 = 0
            int r14 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r14 <= 0) goto L295
            java.lang.Boolean r13 = r12.uniformY
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            if (r13 != r14) goto L295
            float r13 = r12.computedPadTop
            float r14 = r12.computedPadBottom
            float r13 = r13 + r14
            int r12 = r12.row
            float r14 = r5 + r13
            r20[r12] = r14
            float r13 = r13 + r2
            r10[r12] = r13
        L295:
            int r8 = r8 + 1
            goto L257
        L298:
            r1 = 0
        L299:
            if (r1 >= r6) goto L32c
            r2 = r3[r1]
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r2
            java.lang.Integer r4 = r2.colspan
            int r4 = r4.intValue()
            r5 = 1
            if (r4 != r5) goto L2ab
            r2 = 0
            goto L328
        L2ab:
            int r8 = r2.column
            com.badlogic.gdx.scenes.scene2d.Actor r11 = r2.actor
            com.badlogic.gdx.scenes.scene2d.ui.Value r12 = r2.minWidth
            float r12 = r12.get(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Value r13 = r2.prefWidth
            float r13 = r13.get(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Value r14 = r2.maxWidth
            float r11 = r14.get(r11)
            int r14 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r14 >= 0) goto L2c6
            r13 = r12
        L2c6:
            r14 = 0
            int r15 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r15 <= 0) goto L2d0
            int r14 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r14 <= 0) goto L2d0
            goto L2d1
        L2d0:
            r11 = r13
        L2d1:
            boolean r13 = r0.round
            if (r13 == 0) goto L2e1
            double r12 = (double) r12
            double r12 = java.lang.Math.ceil(r12)
            float r12 = (float) r12
            double r13 = (double) r11
            double r13 = java.lang.Math.ceil(r13)
            float r11 = (float) r13
        L2e1:
            float r13 = r2.computedPadLeft
            float r2 = r2.computedPadRight
            float r13 = r13 + r2
            float r2 = -r13
            int r13 = r8 + r4
            r14 = r2
            r5 = r8
            r15 = 0
        L2ec:
            if (r5 >= r13) goto L2fd
            r18 = r7[r5]
            float r2 = r2 + r18
            r18 = r9[r5]
            float r14 = r14 + r18
            r18 = r25[r5]
            float r15 = r15 + r18
            int r5 = r5 + 1
            goto L2ec
        L2fd:
            float r12 = r12 - r2
            r2 = 0
            float r5 = java.lang.Math.max(r2, r12)
            float r11 = r11 - r14
            float r11 = java.lang.Math.max(r2, r11)
        L308:
            if (r8 >= r13) goto L328
            int r12 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r12 != 0) goto L313
            r12 = 1065353216(0x3f800000, float:1.0)
            float r14 = (float) r4
            float r12 = r12 / r14
            goto L316
        L313:
            r12 = r25[r8]
            float r12 = r12 / r15
        L316:
            r14 = r7[r8]
            float r17 = r5 * r12
            float r14 = r14 + r17
            r7[r8] = r14
            r14 = r9[r8]
            float r12 = r12 * r11
            float r14 = r14 + r12
            r9[r8] = r14
            int r8 = r8 + 1
            goto L308
        L328:
            int r1 = r1 + 1
            goto L299
        L32c:
            com.badlogic.gdx.scenes.scene2d.ui.Value r1 = r0.padLeft
            float r1 = r1.get(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Value r2 = r0.padRight
            float r2 = r2.get(r0)
            float r1 = r1 + r2
            com.badlogic.gdx.scenes.scene2d.ui.Value r2 = r0.padTop
            float r2 = r2.get(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Value r3 = r0.padBottom
            float r3 = r3.get(r0)
            float r2 = r2 + r3
            r0.tableMinWidth = r1
            r0.tablePrefWidth = r1
            r1 = r24
            r3 = 0
        L34d:
            if (r3 >= r1) goto L360
            float r4 = r0.tableMinWidth
            r5 = r7[r3]
            float r4 = r4 + r5
            r0.tableMinWidth = r4
            float r4 = r0.tablePrefWidth
            r5 = r9[r3]
            float r4 = r4 + r5
            r0.tablePrefWidth = r4
            int r3 = r3 + 1
            goto L34d
        L360:
            r0.tableMinHeight = r2
            r0.tablePrefHeight = r2
            r2 = r23
            r1 = 0
        L367:
            if (r1 >= r2) goto L380
            float r3 = r0.tableMinHeight
            r4 = r20[r1]
            float r3 = r3 + r4
            r0.tableMinHeight = r3
            float r3 = r0.tablePrefHeight
            r4 = r20[r1]
            r5 = r10[r1]
            float r4 = java.lang.Math.max(r4, r5)
            float r3 = r3 + r4
            r0.tablePrefHeight = r3
            int r1 = r1 + 1
            goto L367
        L380:
            float r1 = r0.tableMinWidth
            float r2 = r0.tablePrefWidth
            float r1 = java.lang.Math.max(r1, r2)
            r0.tablePrefWidth = r1
            float r1 = r0.tableMinHeight
            float r2 = r0.tablePrefHeight
            float r1 = java.lang.Math.max(r1, r2)
            r0.tablePrefHeight = r1
            return
    }

    private void drawDebugRects(com.badlogic.gdx.graphics.glutils.ShapeRenderer r9) {
            r8 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Table$DebugRect> r0 = r8.debugRects
            if (r0 == 0) goto L56
            boolean r0 = r8.getDebug()
            if (r0 != 0) goto Lb
            goto L56
        Lb:
            com.badlogic.gdx.graphics.glutils.ShapeRenderer$ShapeType r0 = com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType.Line
            r9.set(r0)
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r8.getStage()
            if (r0 == 0) goto L21
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r8.getStage()
            com.badlogic.gdx.graphics.Color r0 = r0.getDebugColor()
            r9.setColor(r0)
        L21:
            boolean r0 = r8.isTransform()
            r1 = 0
            if (r0 != 0) goto L31
            float r1 = r8.getX()
            float r0 = r8.getY()
            goto L32
        L31:
            r0 = 0
        L32:
            r2 = 0
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Table$DebugRect> r3 = r8.debugRects
            int r3 = r3.size
        L37:
            if (r2 >= r3) goto L56
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Table$DebugRect> r4 = r8.debugRects
            java.lang.Object r4 = r4.get(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table$DebugRect r4 = (com.badlogic.gdx.scenes.scene2d.ui.Table.DebugRect) r4
            com.badlogic.gdx.graphics.Color r5 = r4.color
            r9.setColor(r5)
            float r5 = r4.x
            float r5 = r5 + r1
            float r6 = r4.y
            float r6 = r6 + r0
            float r7 = r4.width
            float r4 = r4.height
            r9.rect(r5, r6, r7, r4)
            int r2 = r2 + 1
            goto L37
        L56:
            return
    }

    private void endRow() {
            r6 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Cell> r0 = r6.cells
            T[] r1 = r0.items
            int r0 = r0.size
            r2 = 1
            int r0 = r0 - r2
            r3 = 0
        L9:
            if (r0 < 0) goto L1e
            r4 = r1[r0]
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r4
            boolean r5 = r4.endRow
            if (r5 == 0) goto L14
            goto L1e
        L14:
            java.lang.Integer r4 = r4.colspan
            int r4 = r4.intValue()
            int r3 = r3 + r4
            int r0 = r0 + (-1)
            goto L9
        L1e:
            int r0 = r6.columns
            int r0 = java.lang.Math.max(r0, r3)
            r6.columns = r0
            int r0 = r6.rows
            int r0 = r0 + r2
            r6.rows = r0
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Cell> r0 = r6.cells
            java.lang.Object r0 = r0.peek()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r0
            r0.endRow = r2
            return
    }

    private float[] ensureSize(float[] r3, int r4) {
            r2 = this;
            if (r3 == 0) goto Lc
            int r0 = r3.length
            if (r0 >= r4) goto L6
            goto Lc
        L6:
            r0 = 0
            r1 = 0
            java.util.Arrays.fill(r3, r0, r4, r1)
            return r3
        Lc:
            float[] r3 = new float[r4]
            return r3
    }

    private com.badlogic.gdx.scenes.scene2d.ui.Cell obtainCell() {
            r1 = this;
            com.badlogic.gdx.utils.Pool<com.badlogic.gdx.scenes.scene2d.ui.Cell> r0 = com.badlogic.gdx.scenes.scene2d.ui.Table.cellPool
            java.lang.Object r0 = r0.obtain()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r0
            r0.setTable(r1)
            return r0
    }

    public <T extends com.badlogic.gdx.scenes.scene2d.Actor> com.badlogic.gdx.scenes.scene2d.ui.Cell<T> add(T r7) {
            r6 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r6.obtainCell()
            r0.actor = r7
            boolean r1 = r6.implicitEndRow
            r2 = 0
            if (r1 == 0) goto L1d
            r6.implicitEndRow = r2
            int r1 = r6.rows
            int r1 = r1 + (-1)
            r6.rows = r1
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Cell> r1 = r6.cells
            java.lang.Object r1 = r1.peek()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r1
            r1.endRow = r2
        L1d:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Cell> r1 = r6.cells
            int r3 = r1.size
            if (r3 <= 0) goto L6d
            java.lang.Object r1 = r1.peek()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r1
            boolean r4 = r1.endRow
            if (r4 != 0) goto L3d
            int r2 = r1.column
            java.lang.Integer r4 = r1.colspan
            int r4 = r4.intValue()
            int r2 = r2 + r4
            r0.column = r2
            int r1 = r1.row
            r0.row = r1
            goto L45
        L3d:
            r0.column = r2
            int r1 = r1.row
            int r1 = r1 + 1
            r0.row = r1
        L45:
            int r1 = r0.row
            if (r1 <= 0) goto L71
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Cell> r1 = r6.cells
            T[] r1 = r1.items
            int r3 = r3 + (-1)
        L4f:
            if (r3 < 0) goto L71
            r2 = r1[r3]
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r2
            int r4 = r2.column
            java.lang.Integer r2 = r2.colspan
            int r2 = r2.intValue()
            int r2 = r2 + r4
        L5e:
            if (r4 >= r2) goto L6a
            int r5 = r0.column
            if (r4 != r5) goto L67
            r0.cellAboveIndex = r3
            goto L71
        L67:
            int r4 = r4 + 1
            goto L5e
        L6a:
            int r3 = r3 + (-1)
            goto L4f
        L6d:
            r0.column = r2
            r0.row = r2
        L71:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Cell> r1 = r6.cells
            r1.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r6.cellDefaults
            r0.set(r1)
            int r1 = r0.column
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Cell> r2 = r6.columnDefaults
            int r3 = r2.size
            if (r1 >= r3) goto L8c
            java.lang.Object r1 = r2.get(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r1
            r0.merge(r1)
        L8c:
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r6.rowDefaults
            r0.merge(r1)
            if (r7 == 0) goto L96
            r6.addActor(r7)
        L96:
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Table align(int r1) {
            r0 = this;
            r0.align = r1
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Table background(com.badlogic.gdx.scenes.scene2d.utils.Drawable r1) {
            r0 = this;
            r0.setBackground(r1)
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    public void clearChildren(boolean r4) {
            r3 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Cell> r0 = r3.cells
            T[] r1 = r0.items
            int r0 = r0.size
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L18
            r2 = r1[r0]
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r2
            com.badlogic.gdx.scenes.scene2d.Actor r2 = r2.actor
            if (r2 == 0) goto L15
            r2.remove()
        L15:
            int r0 = r0 + (-1)
            goto L8
        L18:
            com.badlogic.gdx.utils.Pool<com.badlogic.gdx.scenes.scene2d.ui.Cell> r0 = com.badlogic.gdx.scenes.scene2d.ui.Table.cellPool
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Cell> r1 = r3.cells
            r0.freeAll(r1)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Cell> r1 = r3.cells
            r1.clear()
            r1 = 0
            r3.rows = r1
            r3.columns = r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r3.rowDefaults
            if (r2 == 0) goto L30
            r0.free(r2)
        L30:
            r0 = 0
            r3.rowDefaults = r0
            r3.implicitEndRow = r1
            super.clearChildren(r4)
            return
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Table debug(com.badlogic.gdx.scenes.scene2d.ui.Table.Debug r3) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r0 = com.badlogic.gdx.scenes.scene2d.ui.Table.Debug.none
            if (r3 == r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            super.setDebug(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r1 = r2.debug
            if (r1 == r3) goto L19
            r2.debug = r3
            if (r3 != r0) goto L16
            r2.clearDebugRects()
            goto L19
        L16:
            r2.invalidate()
        L19:
            return r2
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    public /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.Group debugAll() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r1.debugAll()
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    public com.badlogic.gdx.scenes.scene2d.ui.Table debugAll() {
            r0 = this;
            super.debugAll()
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell defaults() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r1.cellDefaults
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r6, float r7) {
            r5 = this;
            r5.validate()
            boolean r0 = r5.isTransform()
            if (r0 == 0) goto L56
            com.badlogic.gdx.math.Matrix4 r0 = r5.computeTransform()
            r5.applyTransform(r6, r0)
            r0 = 0
            r5.drawBackground(r6, r7, r0, r0)
            boolean r0 = r5.clip
            if (r0 == 0) goto L4f
            r6.flush()
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r5.padLeft
            float r0 = r0.get(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Value r1 = r5.padBottom
            float r1 = r1.get(r5)
            float r2 = r5.getWidth()
            float r2 = r2 - r0
            com.badlogic.gdx.scenes.scene2d.ui.Value r3 = r5.padRight
            float r3 = r3.get(r5)
            float r2 = r2 - r3
            float r3 = r5.getHeight()
            float r3 = r3 - r1
            com.badlogic.gdx.scenes.scene2d.ui.Value r4 = r5.padTop
            float r4 = r4.get(r5)
            float r3 = r3 - r4
            boolean r0 = r5.clipBegin(r0, r1, r2, r3)
            if (r0 == 0) goto L52
            r5.drawChildren(r6, r7)
            r6.flush()
            r5.clipEnd()
            goto L52
        L4f:
            r5.drawChildren(r6, r7)
        L52:
            r5.resetTransform(r6)
            goto L64
        L56:
            float r0 = r5.getX()
            float r1 = r5.getY()
            r5.drawBackground(r6, r7, r0, r1)
            super.draw(r6, r7)
        L64:
            return
    }

    protected void drawBackground(com.badlogic.gdx.graphics.g2d.Batch r11, float r12, float r13, float r14) {
            r10 = this;
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r10.background
            if (r0 != 0) goto L5
            return
        L5:
            com.badlogic.gdx.graphics.Color r0 = r10.getColor()
            float r1 = r0.r
            float r2 = r0.g
            float r3 = r0.b
            float r0 = r0.a
            float r0 = r0 * r12
            r11.setColor(r1, r2, r3, r0)
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r4 = r10.background
            float r8 = r10.getWidth()
            float r9 = r10.getHeight()
            r5 = r11
            r6 = r13
            r7 = r14
            r4.draw(r5, r6, r7, r8, r9)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void drawDebug(com.badlogic.gdx.graphics.glutils.ShapeRenderer r6) {
            r5 = this;
            boolean r0 = r5.isTransform()
            if (r0 == 0) goto L56
            com.badlogic.gdx.math.Matrix4 r0 = r5.computeTransform()
            r5.applyTransform(r6, r0)
            r5.drawDebugRects(r6)
            boolean r0 = r5.clip
            if (r0 == 0) goto L4f
            r6.flush()
            float r0 = r5.getWidth()
            float r1 = r5.getHeight()
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = r5.background
            r3 = 0
            if (r2 == 0) goto L41
            com.badlogic.gdx.scenes.scene2d.ui.Value r2 = r5.padLeft
            float r3 = r2.get(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Value r2 = r5.padBottom
            float r2 = r2.get(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Value r4 = r5.padRight
            float r4 = r4.get(r5)
            float r4 = r4 + r3
            float r0 = r0 - r4
            com.badlogic.gdx.scenes.scene2d.ui.Value r4 = r5.padTop
            float r4 = r4.get(r5)
            float r4 = r4 + r2
            float r1 = r1 - r4
            goto L42
        L41:
            r2 = 0
        L42:
            boolean r0 = r5.clipBegin(r3, r2, r0, r1)
            if (r0 == 0) goto L52
            r5.drawDebugChildren(r6)
            r5.clipEnd()
            goto L52
        L4f:
            r5.drawDebugChildren(r6)
        L52:
            r5.resetTransform(r6)
            goto L5c
        L56:
            r5.drawDebugRects(r6)
            super.drawDebug(r6)
        L5c:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    protected void drawDebugBounds(com.badlogic.gdx.graphics.glutils.ShapeRenderer r1) {
            r0 = this;
            return
    }

    public <T extends com.badlogic.gdx.scenes.scene2d.Actor> com.badlogic.gdx.scenes.scene2d.ui.Cell<T> getCell(T r6) {
            r5 = this;
            if (r6 == 0) goto L19
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Cell> r0 = r5.cells
            T[] r1 = r0.items
            r2 = 0
            int r0 = r0.size
        L9:
            if (r2 >= r0) goto L17
            r3 = r1[r2]
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r3
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r3.actor
            if (r4 != r6) goto L14
            return r3
        L14:
            int r2 = r2 + 1
            goto L9
        L17:
            r6 = 0
            return r6
        L19:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "actor cannot be null."
            r6.<init>(r0)
            throw r6
    }

    public com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Cell> getCells() {
            r1 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Cell> r0 = r1.cells
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinHeight() {
            r1 = this;
            boolean r0 = r1.sizeInvalid
            if (r0 == 0) goto L7
            r1.computeSize()
        L7:
            float r0 = r1.tableMinHeight
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinWidth() {
            r1 = this;
            boolean r0 = r1.sizeInvalid
            if (r0 == 0) goto L7
            r1.computeSize()
        L7:
            float r0 = r1.tableMinWidth
            return r0
    }

    public float getPadBottom() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r1.padBottom
            float r0 = r0.get(r1)
            return r0
    }

    public float getPadLeft() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r1.padLeft
            float r0 = r0.get(r1)
            return r0
    }

    public float getPadRight() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r1.padRight
            float r0 = r0.get(r1)
            return r0
    }

    public float getPadTop() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r1.padTop
            float r0 = r0.get(r1)
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
            r2 = this;
            boolean r0 = r2.sizeInvalid
            if (r0 == 0) goto L7
            r2.computeSize()
        L7:
            float r0 = r2.tablePrefHeight
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r2.background
            if (r1 == 0) goto L15
            float r1 = r1.getMinHeight()
            float r0 = java.lang.Math.max(r0, r1)
        L15:
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
            r2 = this;
            boolean r0 = r2.sizeInvalid
            if (r0 == 0) goto L7
            r2.computeSize()
        L7:
            float r0 = r2.tablePrefWidth
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r2.background
            if (r1 == 0) goto L15
            float r1 = r1.getMinWidth()
            float r0 = java.lang.Math.max(r0, r1)
        L15:
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public com.badlogic.gdx.scenes.scene2d.Actor hit(float r4, float r5, boolean r6) {
            r3 = this;
            boolean r0 = r3.clip
            if (r0 == 0) goto L2a
            r0 = 0
            if (r6 == 0) goto L10
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = r3.getTouchable()
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            if (r1 != r2) goto L10
            return r0
        L10:
            r1 = 0
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 < 0) goto L29
            float r2 = r3.getWidth()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L29
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L29
            float r1 = r3.getHeight()
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L2a
        L29:
            return r0
        L2a:
            com.badlogic.gdx.scenes.scene2d.Actor r4 = super.hit(r4, r5, r6)
            return r4
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup
    public void invalidate() {
            r1 = this;
            r0 = 1
            r1.sizeInvalid = r0
            super.invalidate()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup
    public void layout() {
            r30 = this;
            r0 = r30
            boolean r1 = r0.sizeInvalid
            if (r1 == 0) goto L9
            r30.computeSize()
        L9:
            float r1 = r30.getWidth()
            float r2 = r30.getHeight()
            int r3 = r0.columns
            int r4 = r0.rows
            float[] r5 = r0.columnWidth
            float[] r6 = r0.rowHeight
            com.badlogic.gdx.scenes.scene2d.ui.Value r7 = r0.padLeft
            float r7 = r7.get(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Value r8 = r0.padRight
            float r8 = r8.get(r0)
            float r8 = r8 + r7
            com.badlogic.gdx.scenes.scene2d.ui.Value r9 = r0.padTop
            float r9 = r9.get(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Value r10 = r0.padBottom
            float r10 = r10.get(r0)
            float r10 = r10 + r9
            float r11 = r0.tablePrefWidth
            float r12 = r0.tableMinWidth
            float r11 = r11 - r12
            r14 = 0
            int r15 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r15 != 0) goto L42
            float[] r11 = r0.columnMinWidth
            r17 = r9
            goto L71
        L42:
            float r12 = r1 - r12
            float r12 = java.lang.Math.max(r14, r12)
            float r12 = java.lang.Math.min(r11, r12)
            float[] r15 = com.badlogic.gdx.scenes.scene2d.ui.Table.columnWeightedWidth
            float[] r15 = r0.ensureSize(r15, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table.columnWeightedWidth = r15
            float[] r13 = r0.columnMinWidth
            float[] r14 = r0.columnPrefWidth
            r17 = r9
            r9 = 0
        L5b:
            if (r9 >= r3) goto L70
            r18 = r14[r9]
            r19 = r13[r9]
            float r18 = r18 - r19
            float r18 = r18 / r11
            r19 = r13[r9]
            float r18 = r18 * r12
            float r19 = r19 + r18
            r15[r9] = r19
            int r9 = r9 + 1
            goto L5b
        L70:
            r11 = r15
        L71:
            float r9 = r0.tablePrefHeight
            float r12 = r0.tableMinHeight
            float r9 = r9 - r12
            r12 = 0
            int r13 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r13 != 0) goto L80
            float[] r9 = r0.rowMinHeight
            r18 = r7
            goto Lb1
        L80:
            float[] r13 = com.badlogic.gdx.scenes.scene2d.ui.Table.rowWeightedHeight
            float[] r13 = r0.ensureSize(r13, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table.rowWeightedHeight = r13
            float r14 = r0.tableMinHeight
            float r14 = r2 - r14
            float r14 = java.lang.Math.max(r12, r14)
            float r12 = java.lang.Math.min(r9, r14)
            float[] r14 = r0.rowMinHeight
            float[] r15 = r0.rowPrefHeight
            r18 = r7
            r7 = 0
        L9b:
            if (r7 >= r4) goto Lb0
            r19 = r15[r7]
            r20 = r14[r7]
            float r19 = r19 - r20
            float r19 = r19 / r9
            r20 = r14[r7]
            float r19 = r19 * r12
            float r20 = r20 + r19
            r13[r7] = r20
            int r7 = r7 + 1
            goto L9b
        Lb0:
            r9 = r13
        Lb1:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Cell> r7 = r0.cells
            T[] r12 = r7.items
            int r7 = r7.size
            r13 = 0
        Lb8:
            if (r13 >= r7) goto L177
            r15 = r12[r13]
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r15
            int r14 = r15.column
            r20 = r12
            int r12 = r15.row
            r21 = r7
            com.badlogic.gdx.scenes.scene2d.Actor r7 = r15.actor
            r22 = r2
            java.lang.Integer r2 = r15.colspan
            int r2 = r2.intValue()
            r23 = r10
            int r10 = r14 + r2
            r25 = r1
            r24 = r4
            r1 = r14
            r4 = 0
        Lda:
            if (r1 >= r10) goto Le3
            r26 = r11[r1]
            float r4 = r4 + r26
            int r1 = r1 + 1
            goto Lda
        Le3:
            r1 = r9[r12]
            com.badlogic.gdx.scenes.scene2d.ui.Value r10 = r15.prefWidth
            float r10 = r10.get(r7)
            r26 = r9
            com.badlogic.gdx.scenes.scene2d.ui.Value r9 = r15.prefHeight
            float r9 = r9.get(r7)
            r27 = r11
            com.badlogic.gdx.scenes.scene2d.ui.Value r11 = r15.minWidth
            float r11 = r11.get(r7)
            r28 = r8
            com.badlogic.gdx.scenes.scene2d.ui.Value r8 = r15.minHeight
            float r8 = r8.get(r7)
            r29 = r3
            com.badlogic.gdx.scenes.scene2d.ui.Value r3 = r15.maxWidth
            float r3 = r3.get(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r15.maxHeight
            float r0 = r0.get(r7)
            int r7 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r7 >= 0) goto L116
            r10 = r11
        L116:
            int r7 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r7 >= 0) goto L11b
            r9 = r8
        L11b:
            r7 = 0
            int r8 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r8 <= 0) goto L125
            int r8 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r8 <= 0) goto L125
            goto L126
        L125:
            r3 = r10
        L126:
            int r8 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r8 <= 0) goto L12f
            int r7 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r7 <= 0) goto L12f
            goto L130
        L12f:
            r0 = r9
        L130:
            float r7 = r15.computedPadLeft
            float r7 = r4 - r7
            float r8 = r15.computedPadRight
            float r7 = r7 - r8
            float r3 = java.lang.Math.min(r7, r3)
            r15.actorWidth = r3
            float r3 = r15.computedPadTop
            float r3 = r1 - r3
            float r7 = r15.computedPadBottom
            float r3 = r3 - r7
            float r0 = java.lang.Math.min(r3, r0)
            r15.actorHeight = r0
            r0 = 1
            if (r2 != r0) goto L155
            r0 = r5[r14]
            float r0 = java.lang.Math.max(r0, r4)
            r5[r14] = r0
        L155:
            r0 = r6[r12]
            float r0 = java.lang.Math.max(r0, r1)
            r6[r12] = r0
            int r13 = r13 + 1
            r0 = r30
            r12 = r20
            r7 = r21
            r2 = r22
            r10 = r23
            r4 = r24
            r1 = r25
            r9 = r26
            r11 = r27
            r8 = r28
            r3 = r29
            goto Lb8
        L177:
            r25 = r1
            r22 = r2
            r29 = r3
            r24 = r4
            r21 = r7
            r28 = r8
            r23 = r10
            r27 = r11
            r20 = r12
            float[] r1 = r0.expandWidth
            float[] r2 = r0.expandHeight
            r4 = r29
            r3 = 0
            r7 = 0
        L191:
            if (r7 >= r4) goto L199
            r8 = r1[r7]
            float r3 = r3 + r8
            int r7 = r7 + 1
            goto L191
        L199:
            r16 = 0
            int r7 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r7 <= 0) goto L1d1
            float r7 = r25 - r28
            r8 = 0
        L1a2:
            if (r8 >= r4) goto L1aa
            r9 = r5[r8]
            float r7 = r7 - r9
            int r8 = r8 + 1
            goto L1a2
        L1aa:
            int r8 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r8 <= 0) goto L1d1
            r8 = 0
            r9 = 0
            r10 = 0
        L1b1:
            if (r9 >= r4) goto L1cb
            r11 = r1[r9]
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 != 0) goto L1ba
            goto L1c6
        L1ba:
            r10 = r1[r9]
            float r10 = r10 * r7
            float r10 = r10 / r3
            r11 = r5[r9]
            float r11 = r11 + r10
            r5[r9] = r11
            float r8 = r8 + r10
            r10 = r9
        L1c6:
            int r9 = r9 + 1
            r16 = 0
            goto L1b1
        L1cb:
            r1 = r5[r10]
            float r7 = r7 - r8
            float r1 = r1 + r7
            r5[r10] = r1
        L1d1:
            r3 = r24
            r1 = 0
            r7 = 0
        L1d5:
            if (r7 >= r3) goto L1dd
            r8 = r2[r7]
            float r1 = r1 + r8
            int r7 = r7 + 1
            goto L1d5
        L1dd:
            r16 = 0
            int r7 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r7 <= 0) goto L215
            float r7 = r22 - r23
            r8 = 0
        L1e6:
            if (r8 >= r3) goto L1ee
            r9 = r6[r8]
            float r7 = r7 - r9
            int r8 = r8 + 1
            goto L1e6
        L1ee:
            int r8 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r8 <= 0) goto L215
            r8 = 0
            r9 = 0
            r10 = 0
        L1f5:
            if (r9 >= r3) goto L20f
            r11 = r2[r9]
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 != 0) goto L1fe
            goto L20a
        L1fe:
            r10 = r2[r9]
            float r10 = r10 * r7
            float r10 = r10 / r1
            r11 = r6[r9]
            float r11 = r11 + r10
            r6[r9] = r11
            float r8 = r8 + r10
            r10 = r9
        L20a:
            int r9 = r9 + 1
            r16 = 0
            goto L1f5
        L20f:
            r1 = r6[r10]
            float r7 = r7 - r8
            float r1 = r1 + r7
            r6[r10] = r1
        L215:
            r1 = r21
            r2 = 0
        L218:
            if (r2 >= r1) goto L259
            r7 = r20[r2]
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r7
            java.lang.Integer r8 = r7.colspan
            int r8 = r8.intValue()
            r9 = 1
            if (r8 != r9) goto L228
            goto L256
        L228:
            int r10 = r7.column
            int r11 = r10 + r8
            r12 = 0
        L22d:
            if (r10 >= r11) goto L238
            r13 = r27[r10]
            r14 = r5[r10]
            float r13 = r13 - r14
            float r12 = r12 + r13
            int r10 = r10 + 1
            goto L22d
        L238:
            float r10 = r7.computedPadLeft
            float r11 = r7.computedPadRight
            float r10 = r10 + r11
            r11 = 0
            float r10 = java.lang.Math.max(r11, r10)
            float r12 = r12 - r10
            float r10 = (float) r8
            float r12 = r12 / r10
            int r10 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r10 <= 0) goto L256
            int r7 = r7.column
            int r8 = r8 + r7
        L24c:
            if (r7 >= r8) goto L256
            r10 = r5[r7]
            float r10 = r10 + r12
            r5[r7] = r10
            int r7 = r7 + 1
            goto L24c
        L256:
            int r2 = r2 + 1
            goto L218
        L259:
            r7 = r28
            r2 = 0
        L25c:
            if (r2 >= r4) goto L264
            r8 = r5[r2]
            float r7 = r7 + r8
            int r2 = r2 + 1
            goto L25c
        L264:
            r4 = r23
            r2 = 0
        L267:
            if (r2 >= r3) goto L26f
            r8 = r6[r2]
            float r4 = r4 + r8
            int r2 = r2 + 1
            goto L267
        L26f:
            int r2 = r0.align
            r3 = r2 & 16
            r8 = 1073741824(0x40000000, float:2.0)
            if (r3 == 0) goto L27c
            float r3 = r25 - r7
        L279:
            float r3 = r18 + r3
            goto L286
        L27c:
            r3 = r2 & 8
            if (r3 != 0) goto L284
            float r3 = r25 - r7
            float r3 = r3 / r8
            goto L279
        L284:
            r3 = r18
        L286:
            r9 = r2 & 4
            if (r9 == 0) goto L28f
            float r2 = r22 - r4
        L28c:
            float r9 = r17 + r2
            goto L299
        L28f:
            r2 = r2 & 2
            if (r2 != 0) goto L297
            float r2 = r22 - r4
            float r2 = r2 / r8
            goto L28c
        L297:
            r9 = r17
        L299:
            r10 = r3
            r11 = r9
            r2 = 0
        L29c:
            if (r2 >= r1) goto L3e0
            r12 = r20[r2]
            com.badlogic.gdx.scenes.scene2d.ui.Cell r12 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r12
            int r13 = r12.column
            java.lang.Integer r14 = r12.colspan
            int r14 = r14.intValue()
            int r14 = r14 + r13
            r15 = 0
        L2ac:
            if (r13 >= r14) goto L2b5
            r17 = r5[r13]
            float r15 = r15 + r17
            int r13 = r13 + 1
            goto L2ac
        L2b5:
            float r13 = r12.computedPadLeft
            float r14 = r12.computedPadRight
            float r14 = r14 + r13
            float r15 = r15 - r14
            float r10 = r10 + r13
            java.lang.Float r13 = r12.fillX
            float r13 = r13.floatValue()
            java.lang.Float r14 = r12.fillY
            float r14 = r14.floatValue()
            r16 = 0
            int r17 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r17 <= 0) goto L2f5
            float r13 = r13 * r15
            com.badlogic.gdx.scenes.scene2d.ui.Value r8 = r12.minWidth
            r21 = r1
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r12.actor
            float r1 = r8.get(r1)
            float r1 = java.lang.Math.max(r13, r1)
            r12.actorWidth = r1
            com.badlogic.gdx.scenes.scene2d.ui.Value r1 = r12.maxWidth
            com.badlogic.gdx.scenes.scene2d.Actor r8 = r12.actor
            float r1 = r1.get(r8)
            int r8 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r8 <= 0) goto L2f7
            float r8 = r12.actorWidth
            float r1 = java.lang.Math.min(r8, r1)
            r12.actorWidth = r1
            goto L2f7
        L2f5:
            r21 = r1
        L2f7:
            int r1 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r1 <= 0) goto L32b
            int r1 = r12.row
            r1 = r6[r1]
            float r1 = r1 * r14
            float r8 = r12.computedPadTop
            float r1 = r1 - r8
            float r8 = r12.computedPadBottom
            float r1 = r1 - r8
            com.badlogic.gdx.scenes.scene2d.ui.Value r8 = r12.minHeight
            com.badlogic.gdx.scenes.scene2d.Actor r13 = r12.actor
            float r8 = r8.get(r13)
            float r1 = java.lang.Math.max(r1, r8)
            r12.actorHeight = r1
            com.badlogic.gdx.scenes.scene2d.ui.Value r1 = r12.maxHeight
            com.badlogic.gdx.scenes.scene2d.Actor r8 = r12.actor
            float r1 = r1.get(r8)
            r8 = 0
            int r13 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r13 <= 0) goto L32c
            float r13 = r12.actorHeight
            float r1 = java.lang.Math.min(r13, r1)
            r12.actorHeight = r1
            goto L32c
        L32b:
            r8 = 0
        L32c:
            java.lang.Integer r1 = r12.align
            int r1 = r1.intValue()
            r13 = r1 & 8
            if (r13 == 0) goto L339
            r12.actorX = r10
            goto L34f
        L339:
            r13 = r1 & 16
            if (r13 == 0) goto L345
            float r13 = r10 + r15
            float r14 = r12.actorWidth
            float r13 = r13 - r14
            r12.actorX = r13
            goto L34f
        L345:
            float r13 = r12.actorWidth
            float r13 = r15 - r13
            r14 = 1073741824(0x40000000, float:2.0)
            float r13 = r13 / r14
            float r13 = r13 + r10
            r12.actorX = r13
        L34f:
            r13 = r1 & 2
            if (r13 == 0) goto L35a
            float r1 = r12.computedPadTop
            r12.actorY = r1
        L357:
            r13 = 1073741824(0x40000000, float:2.0)
            goto L37d
        L35a:
            r1 = r1 & 4
            if (r1 == 0) goto L36b
            int r1 = r12.row
            r1 = r6[r1]
            float r13 = r12.actorHeight
            float r1 = r1 - r13
            float r13 = r12.computedPadBottom
            float r1 = r1 - r13
            r12.actorY = r1
            goto L357
        L36b:
            int r1 = r12.row
            r1 = r6[r1]
            float r13 = r12.actorHeight
            float r1 = r1 - r13
            float r13 = r12.computedPadTop
            float r1 = r1 + r13
            float r13 = r12.computedPadBottom
            float r1 = r1 - r13
            r13 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r13
            r12.actorY = r1
        L37d:
            float r1 = r22 - r11
            float r14 = r12.actorY
            float r1 = r1 - r14
            float r14 = r12.actorHeight
            float r1 = r1 - r14
            r12.actorY = r1
            boolean r1 = r0.round
            if (r1 == 0) goto L3b3
            float r1 = r12.actorWidth
            double r13 = (double) r1
            double r13 = java.lang.Math.ceil(r13)
            float r1 = (float) r13
            r12.actorWidth = r1
            float r1 = r12.actorHeight
            double r13 = (double) r1
            double r13 = java.lang.Math.ceil(r13)
            float r1 = (float) r13
            r12.actorHeight = r1
            float r1 = r12.actorX
            double r13 = (double) r1
            double r13 = java.lang.Math.floor(r13)
            float r1 = (float) r13
            r12.actorX = r1
            float r1 = r12.actorY
            double r13 = (double) r1
            double r13 = java.lang.Math.floor(r13)
            float r1 = (float) r13
            r12.actorY = r1
        L3b3:
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r12.actor
            if (r1 == 0) goto L3c5
            float r13 = r12.actorX
            float r14 = r12.actorY
            float r8 = r12.actorWidth
            r18 = r5
            float r5 = r12.actorHeight
            r1.setBounds(r13, r14, r8, r5)
            goto L3c7
        L3c5:
            r18 = r5
        L3c7:
            boolean r1 = r12.endRow
            if (r1 == 0) goto L3d2
            int r1 = r12.row
            r1 = r6[r1]
            float r11 = r11 + r1
            r10 = r3
            goto L3d6
        L3d2:
            float r1 = r12.computedPadRight
            float r15 = r15 + r1
            float r10 = r10 + r15
        L3d6:
            int r2 = r2 + 1
            r5 = r18
            r1 = r21
            r8 = 1073741824(0x40000000, float:2.0)
            goto L29c
        L3e0:
            com.badlogic.gdx.utils.SnapshotArray r1 = r30.getChildren()
            T[] r2 = r1.items
            com.badlogic.gdx.scenes.scene2d.Actor[] r2 = (com.badlogic.gdx.scenes.scene2d.Actor[]) r2
            int r1 = r1.size
            r13 = 0
        L3eb:
            if (r13 >= r1) goto L3fb
            r5 = r2[r13]
            boolean r6 = r5 instanceof com.badlogic.gdx.scenes.scene2d.utils.Layout
            if (r6 == 0) goto L3f8
            com.badlogic.gdx.scenes.scene2d.utils.Layout r5 = (com.badlogic.gdx.scenes.scene2d.utils.Layout) r5
            r5.validate()
        L3f8:
            int r13 = r13 + 1
            goto L3eb
        L3fb:
            com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r1 = r0.debug
            com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r2 = com.badlogic.gdx.scenes.scene2d.ui.Table.Debug.none
            if (r1 == r2) goto L408
            float r7 = r7 - r28
            float r4 = r4 - r23
            r0.addDebugRects(r3, r9, r7, r4)
        L408:
            return
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Table pad(float r1) {
            r0 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r1)
            r0.pad(r1)
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Table pad(float r1, float r2, float r3, float r4) {
            r0 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r1)
            r0.padTop = r1
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r2)
            r0.padLeft = r1
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r3)
            r0.padBottom = r1
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r4)
            r0.padRight = r1
            r1 = 1
            r0.sizeInvalid = r1
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Table pad(com.badlogic.gdx.scenes.scene2d.ui.Value r2) {
            r1 = this;
            if (r2 == 0) goto Le
            r1.padTop = r2
            r1.padLeft = r2
            r1.padBottom = r2
            r1.padRight = r2
            r2 = 1
            r1.sizeInvalid = r2
            return r1
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "pad cannot be null."
            r2.<init>(r0)
            throw r2
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Table padBottom(float r1) {
            r0 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r1)
            r0.padBottom = r1
            r1 = 1
            r0.sizeInvalid = r1
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Table padLeft(float r1) {
            r0 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r1)
            r0.padLeft = r1
            r1 = 1
            r0.sizeInvalid = r1
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Table padRight(float r1) {
            r0 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r1)
            r0.padRight = r1
            r1 = 1
            r0.sizeInvalid = r1
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Table padTop(float r1) {
            r0 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r1)
            r0.padTop = r1
            r1 = 1
            r0.sizeInvalid = r1
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    public boolean removeActor(com.badlogic.gdx.scenes.scene2d.Actor r2) {
            r1 = this;
            r0 = 1
            boolean r2 = r1.removeActor(r2, r0)
            return r2
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    public boolean removeActor(com.badlogic.gdx.scenes.scene2d.Actor r1, boolean r2) {
            r0 = this;
            boolean r2 = super.removeActor(r1, r2)
            if (r2 != 0) goto L8
            r1 = 0
            return r1
        L8:
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.getCell(r1)
            if (r1 == 0) goto L11
            r2 = 0
            r1.actor = r2
        L11:
            r1 = 1
            return r1
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    public com.badlogic.gdx.scenes.scene2d.Actor removeActorAt(int r2, boolean r3) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r2 = super.removeActorAt(r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r1.getCell(r2)
            if (r3 == 0) goto Ld
            r0 = 0
            r3.actor = r0
        Ld:
            return r2
    }

    public void reset() {
            r4 = this;
            r4.clearChildren()
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = com.badlogic.gdx.scenes.scene2d.ui.Table.backgroundTop
            r4.padTop = r0
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = com.badlogic.gdx.scenes.scene2d.ui.Table.backgroundLeft
            r4.padLeft = r0
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = com.badlogic.gdx.scenes.scene2d.ui.Table.backgroundBottom
            r4.padBottom = r0
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = com.badlogic.gdx.scenes.scene2d.ui.Table.backgroundRight
            r4.padRight = r0
            r0 = 1
            r4.align = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r0 = com.badlogic.gdx.scenes.scene2d.ui.Table.Debug.none
            r4.debug(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r4.cellDefaults
            r0.reset()
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Cell> r0 = r4.columnDefaults
            int r0 = r0.size
            r1 = 0
        L25:
            if (r1 >= r0) goto L39
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Cell> r2 = r4.columnDefaults
            java.lang.Object r2 = r2.get(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r2
            if (r2 == 0) goto L36
            com.badlogic.gdx.utils.Pool<com.badlogic.gdx.scenes.scene2d.ui.Cell> r3 = com.badlogic.gdx.scenes.scene2d.ui.Table.cellPool
            r3.free(r2)
        L36:
            int r1 = r1 + 1
            goto L25
        L39:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Cell> r0 = r4.columnDefaults
            r0.clear()
            return
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell row() {
            r2 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.scenes.scene2d.ui.Cell> r0 = r2.cells
            int r1 = r0.size
            if (r1 <= 0) goto L1d
            boolean r1 = r2.implicitEndRow
            if (r1 != 0) goto L1a
            java.lang.Object r0 = r0.peek()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r0
            boolean r0 = r0.endRow
            if (r0 == 0) goto L17
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.rowDefaults
            return r0
        L17:
            r2.endRow()
        L1a:
            r2.invalidate()
        L1d:
            r0 = 0
            r2.implicitEndRow = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.rowDefaults
            if (r0 == 0) goto L29
            com.badlogic.gdx.utils.Pool<com.badlogic.gdx.scenes.scene2d.ui.Cell> r1 = com.badlogic.gdx.scenes.scene2d.ui.Table.cellPool
            r1.free(r0)
        L29:
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.obtainCell()
            r2.rowDefaults = r0
            r0.clear()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r2.rowDefaults
            return r0
    }

    public void setBackground(com.badlogic.gdx.scenes.scene2d.utils.Drawable r10) {
            r9 = this;
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r9.background
            if (r0 != r10) goto L5
            return
        L5:
            float r0 = r9.getPadTop()
            float r1 = r9.getPadLeft()
            float r2 = r9.getPadBottom()
            float r3 = r9.getPadRight()
            r9.background = r10
            float r10 = r9.getPadTop()
            float r4 = r9.getPadLeft()
            float r5 = r9.getPadBottom()
            float r6 = r9.getPadRight()
            float r7 = r0 + r2
            float r8 = r10 + r5
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L4c
            float r7 = r1 + r3
            float r8 = r4 + r6
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 == 0) goto L38
            goto L4c
        L38:
            int r10 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r10 != 0) goto L48
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L48
            int r10 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r10 != 0) goto L48
            int r10 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r10 == 0) goto L4f
        L48:
            r9.invalidate()
            goto L4f
        L4c:
            r9.invalidateHierarchy()
        L4f:
            return
    }

    public void setClip(boolean r1) {
            r0 = this;
            r0.clip = r1
            r0.setTransform(r1)
            r0.invalidate()
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void setDebug(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r1 = com.badlogic.gdx.scenes.scene2d.ui.Table.Debug.all
            goto L7
        L5:
            com.badlogic.gdx.scenes.scene2d.ui.Table$Debug r1 = com.badlogic.gdx.scenes.scene2d.ui.Table.Debug.none
        L7:
            r0.debug(r1)
            return
    }

    public void setRound(boolean r1) {
            r0 = this;
            r0.round = r1
            return
    }
}
