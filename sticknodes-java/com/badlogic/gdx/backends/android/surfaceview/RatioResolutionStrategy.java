package com.badlogic.gdx.backends.android.surfaceview;

/* loaded from: classes.dex */
public class RatioResolutionStrategy implements com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy {
    private final float ratio;

    public RatioResolutionStrategy(float r1) {
            r0 = this;
            r0.<init>()
            r0.ratio = r1
            return
    }

    public RatioResolutionStrategy(float r1, float r2) {
            r0 = this;
            r0.<init>()
            float r1 = r1 / r2
            r0.ratio = r1
            return
    }

    @Override // com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy
    public com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy.MeasuredDimension calcMeasures(int r5, int r6) {
            r4 = this;
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            float r0 = r4.ratio
            float r1 = (float) r5
            float r2 = (float) r6
            float r3 = r1 / r2
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto L18
            float r1 = r1 / r0
            int r6 = java.lang.Math.round(r1)
            goto L1e
        L18:
            float r2 = r2 * r0
            int r5 = java.lang.Math.round(r2)
        L1e:
            com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy$MeasuredDimension r0 = new com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy$MeasuredDimension
            r0.<init>(r5, r6)
            return r0
    }
}
