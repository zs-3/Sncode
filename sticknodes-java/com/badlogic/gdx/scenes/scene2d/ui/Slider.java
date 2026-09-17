package com.badlogic.gdx.scenes.scene2d.ui;

/* loaded from: classes.dex */
public class Slider extends com.badlogic.gdx.scenes.scene2d.ui.ProgressBar {
    int button;
    int draggingPointer;
    boolean mouseOver;
    private float[] snapValues;
    private float threshold;
    private com.badlogic.gdx.math.Interpolation visualInterpolationInverse;


    public static class SliderStyle extends com.badlogic.gdx.scenes.scene2d.ui.ProgressBar.ProgressBarStyle {
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable backgroundDown;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable backgroundOver;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable knobAfterDown;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable knobAfterOver;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable knobBeforeDown;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable knobBeforeOver;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable knobDown;
        public com.badlogic.gdx.scenes.scene2d.utils.Drawable knobOver;

        public SliderStyle() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public Slider(float r1, float r2, float r3, boolean r4, com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = -1
            r0.button = r1
            r0.draggingPointer = r1
            com.badlogic.gdx.math.Interpolation r1 = com.badlogic.gdx.math.Interpolation.linear
            r0.visualInterpolationInverse = r1
            com.badlogic.gdx.scenes.scene2d.ui.Slider$1 r1 = new com.badlogic.gdx.scenes.scene2d.ui.Slider$1
            r1.<init>(r0)
            r0.addListener(r1)
            return
    }

    boolean calculatePositionAndValue(float r9, float r10) {
            r8 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle r0 = r8.getStyle()
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.knob
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r8.getBackgroundDrawable()
            float r2 = r8.position
            float r3 = r8.getMinValue()
            float r4 = r8.getMaxValue()
            boolean r5 = r8.vertical
            r6 = 1056964608(0x3f000000, float:0.5)
            r7 = 0
            if (r5 == 0) goto L5e
            float r9 = r8.getHeight()
            float r5 = r1.getTopHeight()
            float r9 = r9 - r5
            float r5 = r1.getBottomHeight()
            float r9 = r9 - r5
            if (r0 != 0) goto L2d
            r0 = 0
            goto L31
        L2d:
            float r0 = r0.getMinHeight()
        L31:
            float r5 = r1.getBottomHeight()
            float r10 = r10 - r5
            float r6 = r6 * r0
            float r10 = r10 - r6
            r8.position = r10
            float r4 = r4 - r3
            com.badlogic.gdx.math.Interpolation r5 = r8.visualInterpolationInverse
            float r9 = r9 - r0
            float r10 = r10 / r9
            float r10 = r5.apply(r10)
            float r4 = r4 * r10
            float r3 = r3 + r4
            float r10 = r1.getBottomHeight()
            float r10 = java.lang.Math.min(r7, r10)
            float r0 = r8.position
            float r10 = java.lang.Math.max(r10, r0)
            r8.position = r10
            float r9 = java.lang.Math.min(r9, r10)
            r8.position = r9
            goto La0
        L5e:
            float r10 = r8.getWidth()
            float r5 = r1.getLeftWidth()
            float r10 = r10 - r5
            float r5 = r1.getRightWidth()
            float r10 = r10 - r5
            if (r0 != 0) goto L70
            r0 = 0
            goto L74
        L70:
            float r0 = r0.getMinWidth()
        L74:
            float r5 = r1.getLeftWidth()
            float r9 = r9 - r5
            float r6 = r6 * r0
            float r9 = r9 - r6
            r8.position = r9
            float r4 = r4 - r3
            com.badlogic.gdx.math.Interpolation r5 = r8.visualInterpolationInverse
            float r10 = r10 - r0
            float r9 = r9 / r10
            float r9 = r5.apply(r9)
            float r4 = r4 * r9
            float r3 = r3 + r4
            float r9 = r1.getLeftWidth()
            float r9 = java.lang.Math.min(r7, r9)
            float r0 = r8.position
            float r9 = java.lang.Math.max(r9, r0)
            r8.position = r9
            float r9 = java.lang.Math.min(r10, r9)
            r8.position = r9
        La0:
            com.badlogic.gdx.Input r9 = com.badlogic.gdx.Gdx.input
            r10 = 59
            boolean r9 = r9.isKeyPressed(r10)
            if (r9 != 0) goto Lb9
            com.badlogic.gdx.Input r9 = com.badlogic.gdx.Gdx.input
            r10 = 60
            boolean r9 = r9.isKeyPressed(r10)
            if (r9 != 0) goto Lb9
            float r9 = r8.snap(r3)
            goto Lba
        Lb9:
            r9 = r3
        Lba:
            boolean r10 = r8.setValue(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 != 0) goto Lc4
            r8.position = r2
        Lc4:
            return r10
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.ProgressBar
    protected com.badlogic.gdx.scenes.scene2d.utils.Drawable getBackgroundDrawable() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.ProgressBar$ProgressBarStyle r0 = super.getStyle()
            com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle r0 = (com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle) r0
            boolean r1 = r2.disabled
            if (r1 == 0) goto Lf
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r0.disabledBackground
            if (r1 == 0) goto Lf
            return r1
        Lf:
            boolean r1 = r2.isDragging()
            if (r1 == 0) goto L1a
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r0.backgroundDown
            if (r1 == 0) goto L1a
            return r1
        L1a:
            boolean r1 = r2.mouseOver
            if (r1 == 0) goto L23
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r0.backgroundOver
            if (r1 == 0) goto L23
            return r1
        L23:
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.background
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.ProgressBar
    protected com.badlogic.gdx.scenes.scene2d.utils.Drawable getKnobAfterDrawable() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.ProgressBar$ProgressBarStyle r0 = super.getStyle()
            com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle r0 = (com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle) r0
            boolean r1 = r2.disabled
            if (r1 == 0) goto Lf
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r0.disabledKnobAfter
            if (r1 == 0) goto Lf
            return r1
        Lf:
            boolean r1 = r2.isDragging()
            if (r1 == 0) goto L1a
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r0.knobAfterDown
            if (r1 == 0) goto L1a
            return r1
        L1a:
            boolean r1 = r2.mouseOver
            if (r1 == 0) goto L23
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r0.knobAfterOver
            if (r1 == 0) goto L23
            return r1
        L23:
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.knobAfter
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.ProgressBar
    protected com.badlogic.gdx.scenes.scene2d.utils.Drawable getKnobBeforeDrawable() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.ProgressBar$ProgressBarStyle r0 = super.getStyle()
            com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle r0 = (com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle) r0
            boolean r1 = r2.disabled
            if (r1 == 0) goto Lf
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r0.disabledKnobBefore
            if (r1 == 0) goto Lf
            return r1
        Lf:
            boolean r1 = r2.isDragging()
            if (r1 == 0) goto L1a
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r0.knobBeforeDown
            if (r1 == 0) goto L1a
            return r1
        L1a:
            boolean r1 = r2.mouseOver
            if (r1 == 0) goto L23
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r0.knobBeforeOver
            if (r1 == 0) goto L23
            return r1
        L23:
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.knobBefore
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.ProgressBar
    protected com.badlogic.gdx.scenes.scene2d.utils.Drawable getKnobDrawable() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.ProgressBar$ProgressBarStyle r0 = super.getStyle()
            com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle r0 = (com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle) r0
            boolean r1 = r2.disabled
            if (r1 == 0) goto Lf
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r0.disabledKnob
            if (r1 == 0) goto Lf
            return r1
        Lf:
            boolean r1 = r2.isDragging()
            if (r1 == 0) goto L1a
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r0.knobDown
            if (r1 == 0) goto L1a
            return r1
        L1a:
            boolean r1 = r2.mouseOver
            if (r1 == 0) goto L23
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r1 = r0.knobOver
            if (r1 == 0) goto L23
            return r1
        L23:
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = r0.knob
            return r0
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.ProgressBar
    public com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle getStyle() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.ProgressBar$ProgressBarStyle r0 = super.getStyle()
            com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle r0 = (com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle) r0
            return r0
    }

    public boolean isDragging() {
            r2 = this;
            int r0 = r2.draggingPointer
            r1 = -1
            if (r0 == r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    protected float snap(float r8) {
            r7 = this;
            float[] r0 = r7.snapValues
            if (r0 == 0) goto L34
            int r0 = r0.length
            if (r0 != 0) goto L8
            goto L34
        L8:
            r0 = 0
            r1 = 0
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
        Le:
            float[] r4 = r7.snapValues
            int r5 = r4.length
            if (r1 >= r5) goto L2e
            r4 = r4[r1]
            float r5 = r8 - r4
            float r5 = java.lang.Math.abs(r5)
            float r6 = r7.threshold
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 > 0) goto L2b
            int r6 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r6 == 0) goto L29
            int r6 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r6 >= 0) goto L2b
        L29:
            r0 = r4
            r3 = r5
        L2b:
            int r1 = r1 + 1
            goto Le
        L2e:
            int r1 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r1 != 0) goto L33
            goto L34
        L33:
            r8 = r0
        L34:
            return r8
    }
}
