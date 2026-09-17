package org.fortheloss.sticknodes.animationscreen.spritemenus;

/* loaded from: classes2.dex */
public class SelectionData implements com.badlogic.gdx.utils.Disposable {
    public int h;
    public float internalScaleX;
    public float internalScaleY;
    public int maskState;
    public java.lang.String name;
    public float originX;
    public float originY;
    public float u1;
    public float u2;
    public float v1;
    public float v2;
    public int w;
    public int x;
    public int y;

    public SelectionData() {
            r0 = this;
            r0.<init>()
            return
    }

    public SelectionData(java.lang.String r1, float r2, float r3, float r4, float r5, int r6, int r7, int r8, int r9, float r10, float r11, float r12, float r13, int r14) {
            r0 = this;
            r0.<init>()
            r0.setData(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.name = r0
            return
    }

    public void setData(java.lang.String r1, float r2, float r3, float r4, float r5, int r6, int r7, int r8, int r9, float r10, float r11, float r12, float r13, int r14) {
            r0 = this;
            r0.name = r1
            r0.u1 = r2
            r0.v1 = r3
            r0.u2 = r4
            r0.v2 = r5
            r0.x = r6
            r0.y = r7
            r0.w = r8
            r0.h = r9
            r0.originX = r10
            r0.originY = r11
            r0.internalScaleX = r12
            r0.internalScaleY = r13
            r0.maskState = r14
            return
    }
}
