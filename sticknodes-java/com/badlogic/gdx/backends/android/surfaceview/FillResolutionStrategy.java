package com.badlogic.gdx.backends.android.surfaceview;

/* loaded from: classes.dex */
public class FillResolutionStrategy implements com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy {
    public FillResolutionStrategy() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy
    public com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy.MeasuredDimension calcMeasures(int r2, int r3) {
            r1 = this;
            int r2 = android.view.View.MeasureSpec.getSize(r2)
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy$MeasuredDimension r0 = new com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy$MeasuredDimension
            r0.<init>(r2, r3)
            return r0
    }
}
