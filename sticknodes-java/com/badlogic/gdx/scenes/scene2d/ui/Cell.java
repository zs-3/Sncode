package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.scenes.scene2d.Actor;

/* loaded from: classes.dex */
public class Cell<T extends com.badlogic.gdx.scenes.scene2d.Actor> implements com.badlogic.gdx.utils.Pool.Poolable {
    private static final java.lang.Integer bottomi = null;
    private static final java.lang.Integer centeri = null;
    private static com.badlogic.gdx.scenes.scene2d.ui.Cell defaults;
    private static com.badlogic.gdx.Files files;
    private static final java.lang.Integer lefti = null;
    private static final java.lang.Float onef = null;
    private static final java.lang.Integer onei = null;
    private static final java.lang.Integer righti = null;
    private static final java.lang.Integer topi = null;
    private static final java.lang.Float zerof = null;
    private static final java.lang.Integer zeroi = null;
    com.badlogic.gdx.scenes.scene2d.Actor actor;
    float actorHeight;
    float actorWidth;
    float actorX;
    float actorY;
    java.lang.Integer align;
    int cellAboveIndex;
    java.lang.Integer colspan;
    int column;
    float computedPadBottom;
    float computedPadLeft;
    float computedPadRight;
    float computedPadTop;
    boolean endRow;
    java.lang.Integer expandX;
    java.lang.Integer expandY;
    java.lang.Float fillX;
    java.lang.Float fillY;
    com.badlogic.gdx.scenes.scene2d.ui.Value maxHeight;
    com.badlogic.gdx.scenes.scene2d.ui.Value maxWidth;
    com.badlogic.gdx.scenes.scene2d.ui.Value minHeight;
    com.badlogic.gdx.scenes.scene2d.ui.Value minWidth;
    com.badlogic.gdx.scenes.scene2d.ui.Value padBottom;
    com.badlogic.gdx.scenes.scene2d.ui.Value padLeft;
    com.badlogic.gdx.scenes.scene2d.ui.Value padRight;
    com.badlogic.gdx.scenes.scene2d.ui.Value padTop;
    com.badlogic.gdx.scenes.scene2d.ui.Value prefHeight;
    com.badlogic.gdx.scenes.scene2d.ui.Value prefWidth;
    int row;
    com.badlogic.gdx.scenes.scene2d.ui.Value spaceBottom;
    com.badlogic.gdx.scenes.scene2d.ui.Value spaceLeft;
    com.badlogic.gdx.scenes.scene2d.ui.Value spaceRight;
    com.badlogic.gdx.scenes.scene2d.ui.Value spaceTop;
    private com.badlogic.gdx.scenes.scene2d.ui.Table table;
    java.lang.Boolean uniformX;
    java.lang.Boolean uniformY;

    static {
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell.zerof = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell.onef = r0
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell.zeroi = r0
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell.onei = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell.centeri = r0
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell.topi = r0
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell.bottomi = r0
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell.lefti = r0
            r0 = 16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell.righti = r0
            return
    }

    public Cell() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.cellAboveIndex = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = defaults()
            if (r0 == 0) goto Lf
            r1.set(r0)
        Lf:
            return
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.Cell defaults() {
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.scenes.scene2d.ui.Cell.files
            if (r0 == 0) goto L8
            com.badlogic.gdx.Files r1 = com.badlogic.gdx.Gdx.files
            if (r0 == r1) goto L64
        L8:
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.scenes.scene2d.ui.Cell.files = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = new com.badlogic.gdx.scenes.scene2d.ui.Cell
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Cell.defaults = r0
            com.badlogic.gdx.scenes.scene2d.ui.Value r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.minWidth
            r0.minWidth = r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = com.badlogic.gdx.scenes.scene2d.ui.Cell.defaults
            com.badlogic.gdx.scenes.scene2d.ui.Value r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.minHeight
            r0.minHeight = r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = com.badlogic.gdx.scenes.scene2d.ui.Cell.defaults
            com.badlogic.gdx.scenes.scene2d.ui.Value r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.prefWidth
            r0.prefWidth = r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = com.badlogic.gdx.scenes.scene2d.ui.Cell.defaults
            com.badlogic.gdx.scenes.scene2d.ui.Value r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.prefHeight
            r0.prefHeight = r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = com.badlogic.gdx.scenes.scene2d.ui.Cell.defaults
            com.badlogic.gdx.scenes.scene2d.ui.Value r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.maxWidth
            r0.maxWidth = r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = com.badlogic.gdx.scenes.scene2d.ui.Cell.defaults
            com.badlogic.gdx.scenes.scene2d.ui.Value r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.maxHeight
            r0.maxHeight = r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = com.badlogic.gdx.scenes.scene2d.ui.Cell.defaults
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.zero
            r0.spaceTop = r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = com.badlogic.gdx.scenes.scene2d.ui.Cell.defaults
            r0.spaceLeft = r1
            r0.spaceBottom = r1
            r0.spaceRight = r1
            r0.padTop = r1
            r0.padLeft = r1
            r0.padBottom = r1
            r0.padRight = r1
            java.lang.Float r1 = com.badlogic.gdx.scenes.scene2d.ui.Cell.zerof
            r0.fillX = r1
            r0.fillY = r1
            java.lang.Integer r1 = com.badlogic.gdx.scenes.scene2d.ui.Cell.centeri
            r0.align = r1
            java.lang.Integer r1 = com.badlogic.gdx.scenes.scene2d.ui.Cell.zeroi
            r0.expandX = r1
            r0.expandY = r1
            java.lang.Integer r1 = com.badlogic.gdx.scenes.scene2d.ui.Cell.onei
            r0.colspan = r1
            r1 = 0
            r0.uniformX = r1
            r0.uniformY = r1
        L64:
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = com.badlogic.gdx.scenes.scene2d.ui.Cell.defaults
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> align(int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.align = r1
            return r0
    }

    void clear() {
            r1 = this;
            r0 = 0
            r1.minWidth = r0
            r1.minHeight = r0
            r1.prefWidth = r0
            r1.prefHeight = r0
            r1.maxWidth = r0
            r1.maxHeight = r0
            r1.spaceTop = r0
            r1.spaceLeft = r0
            r1.spaceBottom = r0
            r1.spaceRight = r0
            r1.padTop = r0
            r1.padLeft = r0
            r1.padBottom = r0
            r1.padRight = r0
            r1.fillX = r0
            r1.fillY = r0
            r1.align = r0
            r1.expandX = r0
            r1.expandY = r0
            r1.colspan = r0
            r1.uniformX = r0
            r1.uniformY = r0
            return
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> clearActor() {
            r1 = this;
            r0 = 0
            r1.setActor(r0)
            return r1
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> colspan(int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.colspan = r1
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> expand() {
            r1 = this;
            java.lang.Integer r0 = com.badlogic.gdx.scenes.scene2d.ui.Cell.onei
            r1.expandX = r0
            r1.expandY = r0
            return r1
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> expand(boolean r1, boolean r2) {
            r0 = this;
            if (r1 == 0) goto L5
            java.lang.Integer r1 = com.badlogic.gdx.scenes.scene2d.ui.Cell.onei
            goto L7
        L5:
            java.lang.Integer r1 = com.badlogic.gdx.scenes.scene2d.ui.Cell.zeroi
        L7:
            r0.expandX = r1
            if (r2 == 0) goto Le
            java.lang.Integer r1 = com.badlogic.gdx.scenes.scene2d.ui.Cell.onei
            goto L10
        Le:
            java.lang.Integer r1 = com.badlogic.gdx.scenes.scene2d.ui.Cell.zeroi
        L10:
            r0.expandY = r1
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> expandX() {
            r1 = this;
            java.lang.Integer r0 = com.badlogic.gdx.scenes.scene2d.ui.Cell.onei
            r1.expandX = r0
            return r1
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> expandY() {
            r1 = this;
            java.lang.Integer r0 = com.badlogic.gdx.scenes.scene2d.ui.Cell.onei
            r1.expandY = r0
            return r1
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> fill() {
            r1 = this;
            java.lang.Float r0 = com.badlogic.gdx.scenes.scene2d.ui.Cell.onef
            r1.fillX = r0
            r1.fillY = r0
            return r1
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> fill(boolean r1, boolean r2) {
            r0 = this;
            if (r1 == 0) goto L5
            java.lang.Float r1 = com.badlogic.gdx.scenes.scene2d.ui.Cell.onef
            goto L7
        L5:
            java.lang.Float r1 = com.badlogic.gdx.scenes.scene2d.ui.Cell.zerof
        L7:
            r0.fillX = r1
            if (r2 == 0) goto Le
            java.lang.Float r1 = com.badlogic.gdx.scenes.scene2d.ui.Cell.onef
            goto L10
        Le:
            java.lang.Float r1 = com.badlogic.gdx.scenes.scene2d.ui.Cell.zerof
        L10:
            r0.fillY = r1
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> fillX() {
            r1 = this;
            java.lang.Float r0 = com.badlogic.gdx.scenes.scene2d.ui.Cell.onef
            r1.fillX = r0
            return r1
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> fillY() {
            r1 = this;
            java.lang.Float r0 = com.badlogic.gdx.scenes.scene2d.ui.Cell.onef
            r1.fillY = r0
            return r1
    }

    public T getActor() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r1.actor
            return r0
    }

    public float getSpaceRight() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.spaceRight
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r2.actor
            float r0 = r0.get(r1)
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Table getTable() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r1.table
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> height(float r1) {
            r0 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r1)
            r0.height(r1)
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> height(com.badlogic.gdx.scenes.scene2d.ui.Value r2) {
            r1 = this;
            if (r2 == 0) goto L9
            r1.minHeight = r2
            r1.prefHeight = r2
            r1.maxHeight = r2
            return r1
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "height cannot be null."
            r2.<init>(r0)
            throw r2
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> maxHeight(float r1) {
            r0 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r1)
            r0.maxHeight = r1
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> maxWidth(float r1) {
            r0 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r1)
            r0.maxWidth = r1
            return r0
    }

    void merge(com.badlogic.gdx.scenes.scene2d.ui.Cell r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.minWidth
            if (r0 == 0) goto L9
            r1.minWidth = r0
        L9:
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.minHeight
            if (r0 == 0) goto Lf
            r1.minHeight = r0
        Lf:
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.prefWidth
            if (r0 == 0) goto L15
            r1.prefWidth = r0
        L15:
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.prefHeight
            if (r0 == 0) goto L1b
            r1.prefHeight = r0
        L1b:
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.maxWidth
            if (r0 == 0) goto L21
            r1.maxWidth = r0
        L21:
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.maxHeight
            if (r0 == 0) goto L27
            r1.maxHeight = r0
        L27:
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.spaceTop
            if (r0 == 0) goto L2d
            r1.spaceTop = r0
        L2d:
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.spaceLeft
            if (r0 == 0) goto L33
            r1.spaceLeft = r0
        L33:
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.spaceBottom
            if (r0 == 0) goto L39
            r1.spaceBottom = r0
        L39:
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.spaceRight
            if (r0 == 0) goto L3f
            r1.spaceRight = r0
        L3f:
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.padTop
            if (r0 == 0) goto L45
            r1.padTop = r0
        L45:
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.padLeft
            if (r0 == 0) goto L4b
            r1.padLeft = r0
        L4b:
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.padBottom
            if (r0 == 0) goto L51
            r1.padBottom = r0
        L51:
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.padRight
            if (r0 == 0) goto L57
            r1.padRight = r0
        L57:
            java.lang.Float r0 = r2.fillX
            if (r0 == 0) goto L5d
            r1.fillX = r0
        L5d:
            java.lang.Float r0 = r2.fillY
            if (r0 == 0) goto L63
            r1.fillY = r0
        L63:
            java.lang.Integer r0 = r2.align
            if (r0 == 0) goto L69
            r1.align = r0
        L69:
            java.lang.Integer r0 = r2.expandX
            if (r0 == 0) goto L6f
            r1.expandX = r0
        L6f:
            java.lang.Integer r0 = r2.expandY
            if (r0 == 0) goto L75
            r1.expandY = r0
        L75:
            java.lang.Integer r0 = r2.colspan
            if (r0 == 0) goto L7b
            r1.colspan = r0
        L7b:
            java.lang.Boolean r0 = r2.uniformX
            if (r0 == 0) goto L81
            r1.uniformX = r0
        L81:
            java.lang.Boolean r2 = r2.uniformY
            if (r2 == 0) goto L87
            r1.uniformY = r2
        L87:
            return
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> minHeight(float r1) {
            r0 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r1)
            r0.minHeight = r1
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> minWidth(float r1) {
            r0 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r1)
            r0.minWidth = r1
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> pad(float r1) {
            r0 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r1)
            r0.pad(r1)
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> pad(float r1, float r2, float r3, float r4) {
            r0 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r2 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r3 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r4 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r4)
            r0.pad(r1, r2, r3, r4)
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> pad(com.badlogic.gdx.scenes.scene2d.ui.Value r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            r1.padTop = r2
            r1.padLeft = r2
            r1.padBottom = r2
            r1.padRight = r2
            return r1
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "pad cannot be null."
            r2.<init>(r0)
            throw r2
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> pad(com.badlogic.gdx.scenes.scene2d.ui.Value r1, com.badlogic.gdx.scenes.scene2d.ui.Value r2, com.badlogic.gdx.scenes.scene2d.ui.Value r3, com.badlogic.gdx.scenes.scene2d.ui.Value r4) {
            r0 = this;
            if (r1 == 0) goto L29
            if (r2 == 0) goto L21
            if (r3 == 0) goto L19
            if (r4 == 0) goto L11
            r0.padTop = r1
            r0.padLeft = r2
            r0.padBottom = r3
            r0.padRight = r4
            return r0
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "right cannot be null."
            r1.<init>(r2)
            throw r1
        L19:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "bottom cannot be null."
            r1.<init>(r2)
            throw r1
        L21:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "left cannot be null."
            r1.<init>(r2)
            throw r1
        L29:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "top cannot be null."
            r1.<init>(r2)
            throw r1
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> padBottom(float r1) {
            r0 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r1)
            r0.padBottom = r1
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> padLeft(float r1) {
            r0 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r1)
            r0.padLeft = r1
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> padRight(float r1) {
            r0 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r1)
            r0.padRight = r1
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> padTop(float r1) {
            r0 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r1)
            r0.padTop = r1
            return r0
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1.actor = r0
            r1.table = r0
            r0 = 0
            r1.endRow = r0
            r0 = -1
            r1.cellAboveIndex = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = defaults()
            r1.set(r0)
            return
    }

    public void row() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r1.table
            r0.row()
            return
    }

    void set(com.badlogic.gdx.scenes.scene2d.ui.Cell r2) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.minWidth
            r1.minWidth = r0
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.minHeight
            r1.minHeight = r0
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.prefWidth
            r1.prefWidth = r0
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.prefHeight
            r1.prefHeight = r0
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.maxWidth
            r1.maxWidth = r0
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.maxHeight
            r1.maxHeight = r0
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.spaceTop
            r1.spaceTop = r0
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.spaceLeft
            r1.spaceLeft = r0
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.spaceBottom
            r1.spaceBottom = r0
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.spaceRight
            r1.spaceRight = r0
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.padTop
            r1.padTop = r0
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.padLeft
            r1.padLeft = r0
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.padBottom
            r1.padBottom = r0
            com.badlogic.gdx.scenes.scene2d.ui.Value r0 = r2.padRight
            r1.padRight = r0
            java.lang.Float r0 = r2.fillX
            r1.fillX = r0
            java.lang.Float r0 = r2.fillY
            r1.fillY = r0
            java.lang.Integer r0 = r2.align
            r1.align = r0
            java.lang.Integer r0 = r2.expandX
            r1.expandX = r0
            java.lang.Integer r0 = r2.expandY
            r1.expandY = r0
            java.lang.Integer r0 = r2.colspan
            r1.colspan = r0
            java.lang.Boolean r0 = r2.uniformX
            r1.uniformX = r0
            java.lang.Boolean r2 = r2.uniformY
            r1.uniformY = r2
            return
    }

    public <A extends com.badlogic.gdx.scenes.scene2d.Actor> com.badlogic.gdx.scenes.scene2d.ui.Cell<A> setActor(A r3) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r2.actor
            if (r0 == r3) goto L1c
            if (r0 == 0) goto L13
            com.badlogic.gdx.scenes.scene2d.Group r0 = r0.getParent()
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2.table
            if (r0 != r1) goto L13
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r2.actor
            r0.remove()
        L13:
            r2.actor = r3
            if (r3 == 0) goto L1c
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r2.table
            r0.addActor(r3)
        L1c:
            return r2
    }

    public void setTable(com.badlogic.gdx.scenes.scene2d.ui.Table r1) {
            r0 = this;
            r0.table = r1
            return
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> size(float r1, float r2) {
            r0 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r2 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r2)
            r0.size(r1, r2)
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> size(com.badlogic.gdx.scenes.scene2d.ui.Value r1, com.badlogic.gdx.scenes.scene2d.ui.Value r2) {
            r0 = this;
            if (r1 == 0) goto L19
            if (r2 == 0) goto L11
            r0.minWidth = r1
            r0.minHeight = r2
            r0.prefWidth = r1
            r0.prefHeight = r2
            r0.maxWidth = r1
            r0.maxHeight = r2
            return r0
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "height cannot be null."
            r1.<init>(r2)
            throw r1
        L19:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "width cannot be null."
            r1.<init>(r2)
            throw r1
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> space(float r4) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto Ld
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r4 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r4)
            r3.space(r4)
            return r3
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "space cannot be < 0: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> space(float r3, float r4, float r5, float r6) {
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 < 0) goto L6a
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 < 0) goto L53
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 < 0) goto L3c
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L25
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r3 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r4 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r5 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r6 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r6)
            r2.space(r3, r4, r5, r6)
            return r2
        L25:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "right cannot be < 0: "
            r4.append(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L3c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "bottom cannot be < 0: "
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L53:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "left cannot be < 0: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L6a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "top cannot be < 0: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> space(com.badlogic.gdx.scenes.scene2d.ui.Value r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            r1.spaceTop = r2
            r1.spaceLeft = r2
            r1.spaceBottom = r2
            r1.spaceRight = r2
            return r1
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "space cannot be null."
            r2.<init>(r0)
            throw r2
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> space(com.badlogic.gdx.scenes.scene2d.ui.Value r1, com.badlogic.gdx.scenes.scene2d.ui.Value r2, com.badlogic.gdx.scenes.scene2d.ui.Value r3, com.badlogic.gdx.scenes.scene2d.ui.Value r4) {
            r0 = this;
            if (r1 == 0) goto L29
            if (r2 == 0) goto L21
            if (r3 == 0) goto L19
            if (r4 == 0) goto L11
            r0.spaceTop = r1
            r0.spaceLeft = r2
            r0.spaceBottom = r3
            r0.spaceRight = r4
            return r0
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "right cannot be null."
            r1.<init>(r2)
            throw r1
        L19:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "bottom cannot be null."
            r1.<init>(r2)
            throw r1
        L21:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "left cannot be null."
            r1.<init>(r2)
            throw r1
        L29:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "top cannot be null."
            r1.<init>(r2)
            throw r1
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> spaceBottom(float r4) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto Lc
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r4 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r4)
            r3.spaceBottom = r4
            return r3
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "spaceBottom cannot be < 0: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> spaceLeft(float r4) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto Lc
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r4 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r4)
            r3.spaceLeft = r4
            return r3
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "spaceLeft cannot be < 0: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> spaceRight(float r4) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto Lc
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r4 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r4)
            r3.spaceRight = r4
            return r3
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "spaceRight cannot be < 0: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> spaceTop(float r4) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto Lc
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r4 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r4)
            r3.spaceTop = r4
            return r3
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "spaceTop cannot be < 0: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public java.lang.String toString() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r1.actor
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.toString()
            goto Ld
        L9:
            java.lang.String r0 = super.toString()
        Ld:
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> uniform(boolean r2) {
            r1 = this;
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.uniformX = r0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.uniformY = r2
            return r1
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> uniform(boolean r1, boolean r2) {
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.uniformX = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r0.uniformY = r1
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> uniformX() {
            r1 = this;
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.uniformX = r0
            return r1
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> width(float r1) {
            r0 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.valueOf(r1)
            r0.width(r1)
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Cell<T> width(com.badlogic.gdx.scenes.scene2d.ui.Value r2) {
            r1 = this;
            if (r2 == 0) goto L9
            r1.minWidth = r2
            r1.prefWidth = r2
            r1.maxWidth = r2
            return r1
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "width cannot be null."
            r2.<init>(r0)
            throw r2
    }
}
