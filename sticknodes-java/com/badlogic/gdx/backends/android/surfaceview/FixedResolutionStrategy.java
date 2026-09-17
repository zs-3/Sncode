package com.badlogic.gdx.backends.android.surfaceview;

/* loaded from: classes.dex */
public class FixedResolutionStrategy implements com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy {
    private final int height;
    private final int width;

    public FixedResolutionStrategy(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.width = r1
            r0.height = r2
            return
    }

    @Override // com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy
    public com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy.MeasuredDimension calcMeasures(int r2, int r3) {
            r1 = this;
            com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy$MeasuredDimension r2 = new com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy$MeasuredDimension
            int r3 = r1.width
            int r0 = r1.height
            r2.<init>(r3, r0)
            return r2
    }
}
