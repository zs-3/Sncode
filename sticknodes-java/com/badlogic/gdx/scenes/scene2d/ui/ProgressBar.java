package com.badlogic.gdx.scenes.scene2d.ui;

/* loaded from: classes.dex */
public class ProgressBar extends com.badlogic.gdx.scenes.scene2d.ui.Widget {
    private float animateDuration;
    private float animateFromValue;
    private com.badlogic.gdx.math.Interpolation animateInterpolation;
    private float animateTime;
    boolean disabled;
    float max;
    float min;
    float position;
    private boolean programmaticChangeEvents;
    private boolean round;
    float stepSize;
    private com.badlogic.gdx.scenes.scene2d.ui.ProgressBar.ProgressBarStyle style;
    private float value;
    final boolean vertical;
    private com.badlogic.gdx.math.Interpolation visualInterpolation;

    public static class ProgressBarStyle {
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable background;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable disabledBackground;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable disabledKnob;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable disabledKnobAfter;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable disabledKnobBefore;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable knob;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable knobAfter;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable knobBefore;

        public ProgressBarStyle() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ProgressBar(float r2, float r3, float r4, boolean r5, com.badlogic.gdx.scenes.scene2d.ui.ProgressBar.ProgressBarStyle r6) {
            r1 = this;
            r1.<init>()
            com.badlogic.gdx.math.Interpolation r0 = com.badlogic.gdx.math.Interpolation.linear
            r1.animateInterpolation = r0
            r1.visualInterpolation = r0
            r0 = 1
            r1.round = r0
            r1.programmaticChangeEvents = r0
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 > 0) goto L47
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L30
            r1.setStyle(r6)
            r1.min = r2
            r1.max = r3
            r1.stepSize = r4
            r1.vertical = r5
            r1.value = r2
            float r2 = r1.getPrefWidth()
            float r3 = r1.getPrefHeight()
            r1.setSize(r2, r3)
            return
        L30:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "stepSize must be > 0: "
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L47:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "max must be > min. min,max: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = ", "
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2)
            throw r4
    }

    private void drawRound(com.badlogic.gdx.graphics.g2d.Batch r7, com.badlogic.gdx.scenes.scene2d.utils.Drawable r8, float r9, float r10, float r11, float r12) {
            r6 = this;
            boolean r0 = r6.round
            if (r0 == 0) goto L18
            int r9 = java.lang.Math.round(r9)
            float r9 = (float) r9
            int r10 = java.lang.Math.round(r10)
            float r10 = (float) r10
            int r11 = java.lang.Math.round(r11)
            float r11 = (float) r11
            int r12 = java.lang.Math.round(r12)
            float r12 = (float) r12
        L18:
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0 = r8
            r1 = r7
            r0.draw(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r3) {
            r2 = this;
            super.act(r3)
            float r0 = r2.animateTime
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L1e
            float r0 = r0 - r3
            r2.animateTime = r0
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r2.getStage()
            if (r3 == 0) goto L1e
            boolean r3 = r3.getActionsRequestRendering()
            if (r3 == 0) goto L1e
            com.badlogic.gdx.Graphics r3 = com.badlogic.gdx.Gdx.graphics
            r3.requestRendering()
        L1e:
            return
    }

    protected float clamp(float r3) {
            r2 = this;
            float r0 = r2.min
            float r1 = r2.max
            float r3 = com.badlogic.gdx.math.MathUtils.clamp(r3, r0, r1)
            return r3
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r22, float r23) {
            r21 = this;
            r7 = r21
            com.badlogic.gdx.scenes.scene2d.ui.ProgressBar$ProgressBarStyle r0 = r7.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.knob
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r8 = r21.getKnobDrawable()
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r9 = r21.getBackgroundDrawable()
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r10 = r21.getKnobBeforeDrawable()
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r11 = r21.getKnobAfterDrawable()
            com.badlogic.gdx.graphics.Color r1 = r21.getColor()
            float r12 = r21.getX()
            float r13 = r21.getY()
            float r14 = r21.getWidth()
            float r15 = r21.getHeight()
            r6 = 0
            if (r0 != 0) goto L30
            r16 = 0
            goto L36
        L30:
            float r2 = r0.getMinHeight()
            r16 = r2
        L36:
            if (r0 != 0) goto L3b
            r17 = 0
            goto L41
        L3b:
            float r0 = r0.getMinWidth()
            r17 = r0
        L41:
            float r18 = r21.getVisualPercent()
            float r0 = r1.r
            float r2 = r1.g
            float r3 = r1.b
            float r1 = r1.a
            float r1 = r1 * r23
            r5 = r22
            r5.setColor(r0, r2, r3, r1)
            boolean r0 = r7.vertical
            r19 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L101
            if (r9 == 0) goto L84
            float r0 = r9.getMinWidth()
            float r0 = r14 - r0
            float r0 = r0 * r19
            float r3 = r12 + r0
            float r17 = r9.getMinWidth()
            r0 = r21
            r1 = r22
            r2 = r9
            r4 = r13
            r5 = r17
            r20 = r8
            r8 = 0
            r6 = r15
            r0.drawRound(r1, r2, r3, r4, r5, r6)
            float r0 = r9.getTopHeight()
            float r6 = r9.getBottomHeight()
            float r0 = r0 + r6
            float r15 = r15 - r0
            goto L88
        L84:
            r20 = r8
            r8 = 0
            r6 = 0
        L88:
            float r15 = r15 - r16
            float r0 = r15 * r18
            float r8 = com.badlogic.gdx.math.MathUtils.clamp(r0, r8, r15)
            float r0 = r6 + r8
            r7.position = r0
            float r9 = r16 * r19
            if (r10 == 0) goto Lb2
            float r0 = r10.getMinWidth()
            float r0 = r14 - r0
            float r0 = r0 * r19
            float r3 = r12 + r0
            float r4 = r13 + r6
            float r5 = r10.getMinWidth()
            float r6 = r8 + r9
            r0 = r21
            r1 = r22
            r2 = r10
            r0.drawRound(r1, r2, r3, r4, r5, r6)
        Lb2:
            if (r11 == 0) goto Lde
            float r0 = r11.getMinWidth()
            float r0 = r14 - r0
            float r0 = r0 * r19
            float r3 = r12 + r0
            float r0 = r7.position
            float r0 = r0 + r13
            float r4 = r0 + r9
            float r5 = r11.getMinWidth()
            boolean r0 = r7.round
            if (r0 == 0) goto Ld2
            float r8 = r8 - r9
            int r0 = java.lang.Math.round(r8)
            float r0 = (float) r0
            goto Ld4
        Ld2:
            float r0 = r8 - r9
        Ld4:
            float r6 = r15 - r0
            r0 = r21
            r1 = r22
            r2 = r11
            r0.drawRound(r1, r2, r3, r4, r5, r6)
        Lde:
            if (r20 == 0) goto L1aa
            float r5 = r20.getMinWidth()
            float r6 = r20.getMinHeight()
            float r14 = r14 - r5
            float r14 = r14 * r19
            float r3 = r12 + r14
            float r0 = r7.position
            float r13 = r13 + r0
            float r16 = r16 - r6
            float r16 = r16 * r19
            float r4 = r13 + r16
            r0 = r21
            r1 = r22
            r2 = r20
            r0.drawRound(r1, r2, r3, r4, r5, r6)
            goto L1aa
        L101:
            r20 = r8
            r8 = 0
            if (r9 == 0) goto L132
            float r0 = r9.getMinHeight()
            float r0 = r15 - r0
            float r0 = r0 * r19
            float r0 = r0 + r13
            int r0 = java.lang.Math.round(r0)
            float r4 = (float) r0
            float r0 = r9.getMinHeight()
            int r0 = java.lang.Math.round(r0)
            float r6 = (float) r0
            r0 = r21
            r1 = r22
            r2 = r9
            r3 = r12
            r5 = r14
            r0.drawRound(r1, r2, r3, r4, r5, r6)
            float r6 = r9.getLeftWidth()
            float r0 = r9.getRightWidth()
            float r0 = r0 + r6
            float r14 = r14 - r0
            goto L133
        L132:
            r6 = 0
        L133:
            float r14 = r14 - r17
            float r0 = r14 * r18
            float r8 = com.badlogic.gdx.math.MathUtils.clamp(r0, r8, r14)
            float r0 = r6 + r8
            r7.position = r0
            float r9 = r17 * r19
            if (r10 == 0) goto L15d
            float r3 = r12 + r6
            float r0 = r10.getMinHeight()
            float r0 = r15 - r0
            float r0 = r0 * r19
            float r4 = r13 + r0
            float r5 = r8 + r9
            float r6 = r10.getMinHeight()
            r0 = r21
            r1 = r22
            r2 = r10
            r0.drawRound(r1, r2, r3, r4, r5, r6)
        L15d:
            if (r11 == 0) goto L189
            float r0 = r7.position
            float r0 = r0 + r12
            float r3 = r0 + r9
            float r0 = r11.getMinHeight()
            float r0 = r15 - r0
            float r0 = r0 * r19
            float r4 = r13 + r0
            boolean r0 = r7.round
            if (r0 == 0) goto L179
            float r8 = r8 - r9
            int r0 = java.lang.Math.round(r8)
            float r0 = (float) r0
            goto L17b
        L179:
            float r0 = r8 - r9
        L17b:
            float r5 = r14 - r0
            float r6 = r11.getMinHeight()
            r0 = r21
            r1 = r22
            r2 = r11
            r0.drawRound(r1, r2, r3, r4, r5, r6)
        L189:
            if (r20 == 0) goto L1aa
            float r5 = r20.getMinWidth()
            float r6 = r20.getMinHeight()
            float r0 = r7.position
            float r12 = r12 + r0
            float r17 = r17 - r5
            float r17 = r17 * r19
            float r3 = r12 + r17
            float r15 = r15 - r6
            float r15 = r15 * r19
            float r4 = r13 + r15
            r0 = r21
            r1 = r22
            r2 = r20
            r0.drawRound(r1, r2, r3, r4, r5, r6)
        L1aa:
            return
    }

    protected com.badlogic.gdx.scenes.scene2d.utils.Drawable getBackgroundDrawable() {
            r0 = this;
            r0 = 0
            throw r0
    }

    protected com.badlogic.gdx.scenes.scene2d.utils.Drawable getKnobAfterDrawable() {
            r0 = this;
            r0 = 0
            throw r0
    }

    protected com.badlogic.gdx.scenes.scene2d.utils.Drawable getKnobBeforeDrawable() {
            r0 = this;
            r0 = 0
            throw r0
    }

    protected com.badlogic.gdx.scenes.scene2d.utils.Drawable getKnobDrawable() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public float getMaxValue() {
            r1 = this;
            float r0 = r1.max
            return r0
    }

    public float getMinValue() {
            r1 = this;
            float r0 = r1.min
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
            r3 = this;
            boolean r0 = r3.vertical
            if (r0 == 0) goto L7
            r0 = 1124859904(0x430c0000, float:140.0)
            return r0
        L7:
            com.badlogic.gdx.scenes.scene2d.ui.ProgressBar$ProgressBarStyle r0 = r3.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.knob
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r3.getBackgroundDrawable()
            r2 = 0
            if (r0 != 0) goto L14
            r0 = 0
            goto L18
        L14:
            float r0 = r0.getMinHeight()
        L18:
            if (r1 != 0) goto L1b
            goto L1f
        L1b:
            float r2 = r1.getMinHeight()
        L1f:
            float r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
            r3 = this;
            boolean r0 = r3.vertical
            if (r0 == 0) goto L21
            com.badlogic.gdx.scenes.scene2d.ui.ProgressBar$ProgressBarStyle r0 = r3.style
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.knob
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r3.getBackgroundDrawable()
            r2 = 0
            if (r0 != 0) goto L11
            r0 = 0
            goto L15
        L11:
            float r0 = r0.getMinWidth()
        L15:
            if (r1 != 0) goto L18
            goto L1c
        L18:
            float r2 = r1.getMinWidth()
        L1c:
            float r0 = java.lang.Math.max(r0, r2)
            return r0
        L21:
            r0 = 1124859904(0x430c0000, float:140.0)
            return r0
    }

    public com.badlogic.gdx.scenes.scene2d.ui.ProgressBar.ProgressBarStyle getStyle() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.ProgressBar$ProgressBarStyle r0 = r1.style
            return r0
    }

    public float getValue() {
            r1 = this;
            float r0 = r1.value
            return r0
    }

    public float getVisualPercent() {
            r4 = this;
            float r0 = r4.min
            float r1 = r4.max
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            com.badlogic.gdx.math.Interpolation r0 = r4.visualInterpolation
            float r1 = r4.getVisualValue()
            float r2 = r4.min
            float r1 = r1 - r2
            float r3 = r4.max
            float r3 = r3 - r2
            float r1 = r1 / r3
            float r0 = r0.apply(r1)
            return r0
    }

    public float getVisualValue() {
            r6 = this;
            float r0 = r6.animateTime
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L18
            com.badlogic.gdx.math.Interpolation r1 = r6.animateInterpolation
            float r2 = r6.animateFromValue
            float r3 = r6.value
            r4 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6.animateDuration
            float r0 = r0 / r5
            float r4 = r4 - r0
            float r0 = r1.apply(r2, r3, r4)
            return r0
        L18:
            float r0 = r6.value
            return r0
    }

    protected float round(float r2) {
            r1 = this;
            float r0 = r1.stepSize
            float r2 = r2 / r0
            int r2 = java.lang.Math.round(r2)
            float r2 = (float) r2
            float r0 = r1.stepSize
            float r2 = r2 * r0
            return r2
    }

    public void setStyle(com.badlogic.gdx.scenes.scene2d.ui.ProgressBar.ProgressBarStyle r2) {
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

    public boolean setValue(float r5) {
            r4 = this;
            float r5 = r4.round(r5)
            float r5 = r4.clamp(r5)
            float r0 = r4.value
            r1 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L10
            return r1
        L10:
            float r2 = r4.getVisualValue()
            r4.value = r5
            boolean r5 = r4.programmaticChangeEvents
            if (r5 == 0) goto L2e
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.utils.ChangeListener$ChangeEvent> r5 = com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent.class
            java.lang.Object r5 = com.badlogic.gdx.utils.Pools.obtain(r5)
            com.badlogic.gdx.scenes.scene2d.utils.ChangeListener$ChangeEvent r5 = (com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent) r5
            boolean r3 = r4.fire(r5)
            com.badlogic.gdx.utils.Pools.free(r5)
            if (r3 == 0) goto L2e
            r4.value = r0
            return r1
        L2e:
            float r5 = r4.animateDuration
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L39
            r4.animateFromValue = r2
            r4.animateTime = r5
        L39:
            r5 = 1
            return r5
    }
}
