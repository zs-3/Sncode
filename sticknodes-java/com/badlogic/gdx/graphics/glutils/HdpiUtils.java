package com.badlogic.gdx.graphics.glutils;

/* loaded from: classes.dex */
public class HdpiUtils {
    private static com.badlogic.gdx.graphics.glutils.HdpiMode mode;

    static {
            com.badlogic.gdx.graphics.glutils.HdpiMode r0 = com.badlogic.gdx.graphics.glutils.HdpiMode.Logical
            com.badlogic.gdx.graphics.glutils.HdpiUtils.mode = r0
            return
    }

    public static void glScissor(int r2, int r3, int r4, int r5) {
            com.badlogic.gdx.graphics.glutils.HdpiMode r0 = com.badlogic.gdx.graphics.glutils.HdpiUtils.mode
            com.badlogic.gdx.graphics.glutils.HdpiMode r1 = com.badlogic.gdx.graphics.glutils.HdpiMode.Logical
            if (r0 != r1) goto L38
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
            int r0 = r0.getWidth()
            com.badlogic.gdx.Graphics r1 = com.badlogic.gdx.Gdx.graphics
            int r1 = r1.getBackBufferWidth()
            if (r0 != r1) goto L22
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
            int r0 = r0.getHeight()
            com.badlogic.gdx.Graphics r1 = com.badlogic.gdx.Gdx.graphics
            int r1 = r1.getBackBufferHeight()
            if (r0 == r1) goto L38
        L22:
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            int r2 = toBackBufferX(r2)
            int r3 = toBackBufferY(r3)
            int r4 = toBackBufferX(r4)
            int r5 = toBackBufferY(r5)
            r0.glScissor(r2, r3, r4, r5)
            goto L3d
        L38:
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r0.glScissor(r2, r3, r4, r5)
        L3d:
            return
    }

    public static void glViewport(int r2, int r3, int r4, int r5) {
            com.badlogic.gdx.graphics.glutils.HdpiMode r0 = com.badlogic.gdx.graphics.glutils.HdpiUtils.mode
            com.badlogic.gdx.graphics.glutils.HdpiMode r1 = com.badlogic.gdx.graphics.glutils.HdpiMode.Logical
            if (r0 != r1) goto L38
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
            int r0 = r0.getWidth()
            com.badlogic.gdx.Graphics r1 = com.badlogic.gdx.Gdx.graphics
            int r1 = r1.getBackBufferWidth()
            if (r0 != r1) goto L22
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
            int r0 = r0.getHeight()
            com.badlogic.gdx.Graphics r1 = com.badlogic.gdx.Gdx.graphics
            int r1 = r1.getBackBufferHeight()
            if (r0 == r1) goto L38
        L22:
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            int r2 = toBackBufferX(r2)
            int r3 = toBackBufferY(r3)
            int r4 = toBackBufferX(r4)
            int r5 = toBackBufferY(r5)
            r0.glViewport(r2, r3, r4, r5)
            goto L3d
        L38:
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r0.glViewport(r2, r3, r4, r5)
        L3d:
            return
    }

    public static int toBackBufferX(int r1) {
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
            int r0 = r0.getBackBufferWidth()
            int r1 = r1 * r0
            float r1 = (float) r1
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r1 = r1 / r0
            int r1 = (int) r1
            return r1
    }

    public static int toBackBufferY(int r1) {
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
            int r0 = r0.getBackBufferHeight()
            int r1 = r1 * r0
            float r1 = (float) r1
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r1 = r1 / r0
            int r1 = (int) r1
            return r1
    }
}
