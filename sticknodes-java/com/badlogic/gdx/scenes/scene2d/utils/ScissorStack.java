package com.badlogic.gdx.scenes.scene2d.utils;

/* loaded from: classes.dex */
public class ScissorStack {
    private static com.badlogic.gdx.utils.Array<com.badlogic.gdx.math.Rectangle> scissors;
    static com.badlogic.gdx.math.Vector3 tmp;
    static final com.badlogic.gdx.math.Rectangle viewport = null;

    static {
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.scissors = r0
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.tmp = r0
            com.badlogic.gdx.math.Rectangle r0 = new com.badlogic.gdx.math.Rectangle
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.viewport = r0
            return
    }

    public static void calculateScissors(com.badlogic.gdx.graphics.Camera r13, float r14, float r15, float r16, float r17, com.badlogic.gdx.math.Matrix4 r18, com.badlogic.gdx.math.Rectangle r19, com.badlogic.gdx.math.Rectangle r20) {
            r0 = r18
            r1 = r19
            r2 = r20
            com.badlogic.gdx.math.Vector3 r3 = com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.tmp
            float r4 = r1.x
            float r5 = r1.y
            r6 = 0
            r3.set(r4, r5, r6)
            com.badlogic.gdx.math.Vector3 r3 = com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.tmp
            r3.mul(r0)
            com.badlogic.gdx.math.Vector3 r8 = com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.tmp
            r7 = r13
            r9 = r14
            r10 = r15
            r11 = r16
            r12 = r17
            r7.project(r8, r9, r10, r11, r12)
            com.badlogic.gdx.math.Vector3 r3 = com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.tmp
            float r4 = r3.x
            r2.x = r4
            float r4 = r3.y
            r2.y = r4
            float r4 = r1.x
            float r5 = r1.width
            float r4 = r4 + r5
            float r5 = r1.y
            float r1 = r1.height
            float r5 = r5 + r1
            r3.set(r4, r5, r6)
            com.badlogic.gdx.math.Vector3 r1 = com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.tmp
            r1.mul(r0)
            com.badlogic.gdx.math.Vector3 r4 = com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.tmp
            r3 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r3.project(r4, r5, r6, r7, r8)
            com.badlogic.gdx.math.Vector3 r0 = com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.tmp
            float r1 = r0.x
            float r3 = r2.x
            float r1 = r1 - r3
            r2.width = r1
            float r0 = r0.y
            float r1 = r2.y
            float r0 = r0 - r1
            r2.height = r0
            return
    }

    public static void calculateScissors(com.badlogic.gdx.graphics.Camera r9, com.badlogic.gdx.math.Matrix4 r10, com.badlogic.gdx.math.Rectangle r11, com.badlogic.gdx.math.Rectangle r12) {
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
            int r0 = r0.getWidth()
            float r4 = (float) r0
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
            int r0 = r0.getHeight()
            float r5 = (float) r0
            r2 = 0
            r3 = 0
            r1 = r9
            r6 = r10
            r7 = r11
            r8 = r12
            calculateScissors(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    private static void fix(com.badlogic.gdx.math.Rectangle r4) {
            float r0 = r4.x
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            r4.x = r0
            float r0 = r4.y
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            r4.y = r0
            float r0 = r4.width
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            r4.width = r0
            float r0 = r4.height
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            r4.height = r0
            float r1 = r4.width
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L33
            float r1 = -r1
            r4.width = r1
            float r3 = r4.x
            float r3 = r3 - r1
            r4.x = r3
        L33:
            int r1 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r1 >= 0) goto L3f
            float r0 = -r0
            r4.height = r0
            float r1 = r4.y
            float r1 = r1 - r0
            r4.y = r1
        L3f:
            return
    }

    public static com.badlogic.gdx.math.Rectangle popScissors() {
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.math.Rectangle> r0 = com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.scissors
            java.lang.Object r0 = r0.pop()
            com.badlogic.gdx.math.Rectangle r0 = (com.badlogic.gdx.math.Rectangle) r0
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.math.Rectangle> r1 = com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.scissors
            int r2 = r1.size
            if (r2 != 0) goto L16
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r2 = 3089(0xc11, float:4.329E-42)
            r1.glDisable(r2)
            goto L2b
        L16:
            java.lang.Object r1 = r1.peek()
            com.badlogic.gdx.math.Rectangle r1 = (com.badlogic.gdx.math.Rectangle) r1
            float r2 = r1.x
            int r2 = (int) r2
            float r3 = r1.y
            int r3 = (int) r3
            float r4 = r1.width
            int r4 = (int) r4
            float r1 = r1.height
            int r1 = (int) r1
            com.badlogic.gdx.graphics.glutils.HdpiUtils.glScissor(r2, r3, r4, r1)
        L2b:
            return r0
    }

    public static boolean pushScissors(com.badlogic.gdx.math.Rectangle r9) {
            fix(r9)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.math.Rectangle> r0 = com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.scissors
            int r1 = r0.size
            r2 = 1
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r1 != 0) goto L23
            float r0 = r9.width
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L22
            float r0 = r9.height
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L1a
            goto L22
        L1a:
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            r1 = 3089(0xc11, float:4.329E-42)
            r0.glEnable(r1)
            goto L6e
        L22:
            return r3
        L23:
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            com.badlogic.gdx.math.Rectangle r0 = (com.badlogic.gdx.math.Rectangle) r0
            float r1 = r0.x
            float r5 = r9.x
            float r1 = java.lang.Math.max(r1, r5)
            float r5 = r0.x
            float r6 = r0.width
            float r5 = r5 + r6
            float r6 = r9.x
            float r7 = r9.width
            float r6 = r6 + r7
            float r5 = java.lang.Math.min(r5, r6)
            float r5 = r5 - r1
            int r6 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r6 >= 0) goto L46
            return r3
        L46:
            float r6 = r0.y
            float r7 = r9.y
            float r6 = java.lang.Math.max(r6, r7)
            float r7 = r0.y
            float r0 = r0.height
            float r7 = r7 + r0
            float r0 = r9.y
            float r8 = r9.height
            float r0 = r0 + r8
            float r0 = java.lang.Math.min(r7, r0)
            float r0 = r0 - r6
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 >= 0) goto L62
            return r3
        L62:
            r9.x = r1
            r9.y = r6
            r9.width = r5
            float r0 = java.lang.Math.max(r4, r0)
            r9.height = r0
        L6e:
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.math.Rectangle> r0 = com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.scissors
            r0.add(r9)
            float r0 = r9.x
            int r0 = (int) r0
            float r1 = r9.y
            int r1 = (int) r1
            float r3 = r9.width
            int r3 = (int) r3
            float r9 = r9.height
            int r9 = (int) r9
            com.badlogic.gdx.graphics.glutils.HdpiUtils.glScissor(r0, r1, r3, r9)
            return r2
    }
}
