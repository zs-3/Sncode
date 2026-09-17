package com.badlogic.gdx;

/* loaded from: classes.dex */
public abstract class AbstractGraphics implements com.badlogic.gdx.Graphics {
    public AbstractGraphics() {
            r0 = this;
            r0.<init>()
            return
    }

    public float getBackBufferScale() {
            r2 = this;
            int r0 = r2.getBackBufferWidth()
            float r0 = (float) r0
            int r1 = r2.getWidth()
            float r1 = (float) r1
            float r0 = r0 / r1
            return r0
    }

    public float getDensity() {
            r2 = this;
            float r0 = r2.getPpiX()
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L14
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 > 0) goto L14
            r1 = 1126170624(0x43200000, float:160.0)
            float r0 = r0 / r1
            goto L16
        L14:
            r0 = 1065353216(0x3f800000, float:1.0)
        L16:
            return r0
    }

    public float getRawDeltaTime() {
            r1 = this;
            float r0 = r1.getDeltaTime()
            return r0
    }
}
