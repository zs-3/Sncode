package com.badlogic.gdx.backends.android.surfaceview;

/* loaded from: classes.dex */
public interface ResolutionStrategy {

    public static class MeasuredDimension {
        public final int height;
        public final int width;

        public MeasuredDimension(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.width = r1
                r0.height = r2
                return
        }
    }

    com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy.MeasuredDimension calcMeasures(int r1, int r2);
}
