package org.fortheloss.framework;

/* loaded from: classes2.dex */
public class RenderUtils {
    private static final com.badlogic.gdx.math.Rectangle mArea = null;
    private static final com.badlogic.gdx.math.Rectangle mScissors = null;

    static {
            com.badlogic.gdx.math.Rectangle r0 = new com.badlogic.gdx.math.Rectangle
            r0.<init>()
            org.fortheloss.framework.RenderUtils.mArea = r0
            com.badlogic.gdx.math.Rectangle r0 = new com.badlogic.gdx.math.Rectangle
            r0.<init>()
            org.fortheloss.framework.RenderUtils.mScissors = r0
            return
    }

    public static void tile(com.badlogic.gdx.graphics.Camera r17, com.badlogic.gdx.graphics.g2d.Batch r18, com.badlogic.gdx.graphics.g2d.TextureRegion r19, float r20, float r21, float r22, float r23) {
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r18.flush()
            com.badlogic.gdx.math.Rectangle r4 = org.fortheloss.framework.RenderUtils.mArea
            r4.set(r0, r1, r2, r3)
            com.badlogic.gdx.math.Matrix4 r5 = r18.getTransformMatrix()
            com.badlogic.gdx.math.Rectangle r6 = org.fortheloss.framework.RenderUtils.mScissors
            r7 = r17
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.calculateScissors(r7, r5, r4, r6)
            boolean r4 = com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.pushScissors(r6)
            if (r4 != 0) goto L22
            return
        L22:
            int r4 = r19.getRegionWidth()
            float r4 = (float) r4
            int r5 = r19.getRegionHeight()
            float r11 = (float) r5
            float r2 = r2 / r4
            double r5 = (double) r2
            double r5 = java.lang.Math.ceil(r5)
            int r2 = (int) r5
            r12 = 0
            r13 = 0
        L35:
            if (r13 >= r2) goto L5e
            float r5 = (float) r13
            float r5 = r5 * r4
            float r14 = r0 + r5
            float r5 = r3 / r11
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            int r15 = (int) r5
            r10 = 0
        L45:
            if (r10 >= r15) goto L5b
            float r5 = (float) r10
            float r5 = r5 * r11
            float r8 = r1 + r5
            r5 = r18
            r6 = r19
            r7 = r14
            r9 = r4
            r16 = r10
            r10 = r11
            r5.draw(r6, r7, r8, r9, r10)
            int r10 = r16 + 1
            goto L45
        L5b:
            int r13 = r13 + 1
            goto L35
        L5e:
            r18.flush()
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.popScissors()
            return
    }
}
