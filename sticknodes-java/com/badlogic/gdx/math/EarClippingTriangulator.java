package com.badlogic.gdx.math;

/* loaded from: classes.dex */
public class EarClippingTriangulator {
    private short[] indices;
    private final com.badlogic.gdx.utils.ShortArray indicesArray;
    private final com.badlogic.gdx.utils.ShortArray triangles;
    private int vertexCount;
    private final com.badlogic.gdx.utils.IntArray vertexTypes;
    private float[] vertices;

    public EarClippingTriangulator() {
            r1 = this;
            r1.<init>()
            com.badlogic.gdx.utils.ShortArray r0 = new com.badlogic.gdx.utils.ShortArray
            r0.<init>()
            r1.indicesArray = r0
            com.badlogic.gdx.utils.IntArray r0 = new com.badlogic.gdx.utils.IntArray
            r0.<init>()
            r1.vertexTypes = r0
            com.badlogic.gdx.utils.ShortArray r0 = new com.badlogic.gdx.utils.ShortArray
            r0.<init>()
            r1.triangles = r0
            return
    }

    private int classifyVertex(int r10) {
            r9 = this;
            short[] r0 = r9.indices
            int r1 = r9.previousIndex(r10)
            short r1 = r0[r1]
            int r1 = r1 * 2
            short r2 = r0[r10]
            int r2 = r2 * 2
            int r10 = r9.nextIndex(r10)
            short r10 = r0[r10]
            int r10 = r10 * 2
            float[] r0 = r9.vertices
            r3 = r0[r1]
            int r1 = r1 + 1
            r4 = r0[r1]
            r5 = r0[r2]
            int r2 = r2 + 1
            r6 = r0[r2]
            r7 = r0[r10]
            int r10 = r10 + 1
            r8 = r0[r10]
            int r10 = computeSpannedAreaSign(r3, r4, r5, r6, r7, r8)
            return r10
    }

    private static int computeSpannedAreaSign(float r1, float r2, float r3, float r4, float r5, float r6) {
            float r0 = r6 - r4
            float r1 = r1 * r0
            float r6 = r2 - r6
            float r3 = r3 * r6
            float r1 = r1 + r3
            float r4 = r4 - r2
            float r5 = r5 * r4
            float r1 = r1 + r5
            float r1 = java.lang.Math.signum(r1)
            int r1 = (int) r1
            return r1
    }

    private void cutEarTip(int r4) {
            r3 = this;
            short[] r0 = r3.indices
            com.badlogic.gdx.utils.ShortArray r1 = r3.triangles
            int r2 = r3.previousIndex(r4)
            short r2 = r0[r2]
            r1.add(r2)
            short r2 = r0[r4]
            r1.add(r2)
            int r2 = r3.nextIndex(r4)
            short r0 = r0[r2]
            r1.add(r0)
            com.badlogic.gdx.utils.ShortArray r0 = r3.indicesArray
            r0.removeIndex(r4)
            com.badlogic.gdx.utils.IntArray r0 = r3.vertexTypes
            r0.removeIndex(r4)
            int r4 = r3.vertexCount
            int r4 = r4 + (-1)
            r3.vertexCount = r4
            return
    }

    private int findEarTip() {
            r6 = this;
            int r0 = r6.vertexCount
            r1 = 0
            r2 = 0
        L4:
            if (r2 >= r0) goto L10
            boolean r3 = r6.isEarTip(r2)
            if (r3 == 0) goto Ld
            return r2
        Ld:
            int r2 = r2 + 1
            goto L4
        L10:
            com.badlogic.gdx.utils.IntArray r2 = r6.vertexTypes
            int[] r2 = r2.items
            r3 = 0
        L15:
            if (r3 >= r0) goto L20
            r4 = r2[r3]
            r5 = -1
            if (r4 == r5) goto L1d
            return r3
        L1d:
            int r3 = r3 + 1
            goto L15
        L20:
            return r1
    }

    private boolean isEarTip(int r27) {
            r26 = this;
            r0 = r26
            com.badlogic.gdx.utils.IntArray r1 = r0.vertexTypes
            int[] r1 = r1.items
            r2 = r1[r27]
            r3 = 0
            r4 = -1
            if (r2 != r4) goto Ld
            return r3
        Ld:
            int r2 = r26.previousIndex(r27)
            int r4 = r26.nextIndex(r27)
            short[] r5 = r0.indices
            short r6 = r5[r2]
            int r6 = r6 * 2
            short r7 = r5[r27]
            int r7 = r7 * 2
            short r8 = r5[r4]
            int r8 = r8 * 2
            float[] r9 = r0.vertices
            r16 = r9[r6]
            r15 = 1
            int r6 = r6 + r15
            r6 = r9[r6]
            r23 = r9[r7]
            int r7 = r7 + r15
            r7 = r9[r7]
            r24 = r9[r8]
            int r8 = r8 + r15
            r8 = r9[r8]
            int r4 = r0.nextIndex(r4)
        L39:
            if (r4 == r2) goto L81
            r10 = r1[r4]
            if (r10 == r15) goto L79
            short r10 = r5[r4]
            int r10 = r10 * 2
            r21 = r9[r10]
            int r10 = r10 + r15
            r22 = r9[r10]
            r10 = r24
            r11 = r8
            r12 = r16
            r13 = r6
            r14 = r21
            r25 = 1
            r15 = r22
            int r10 = computeSpannedAreaSign(r10, r11, r12, r13, r14, r15)
            if (r10 < 0) goto L7b
            r10 = r16
            r11 = r6
            r12 = r23
            r13 = r7
            r14 = r21
            r15 = r22
            int r10 = computeSpannedAreaSign(r10, r11, r12, r13, r14, r15)
            if (r10 < 0) goto L7b
            r17 = r23
            r18 = r7
            r19 = r24
            r20 = r8
            int r10 = computeSpannedAreaSign(r17, r18, r19, r20, r21, r22)
            if (r10 < 0) goto L7b
            return r3
        L79:
            r25 = 1
        L7b:
            int r4 = r0.nextIndex(r4)
            r15 = 1
            goto L39
        L81:
            r25 = 1
            return r25
    }

    private int nextIndex(int r2) {
            r1 = this;
            int r2 = r2 + 1
            int r0 = r1.vertexCount
            int r2 = r2 % r0
            return r2
    }

    private int previousIndex(int r1) {
            r0 = this;
            if (r1 != 0) goto L4
            int r1 = r0.vertexCount
        L4:
            int r1 = r1 + (-1)
            return r1
    }

    private void triangulate() {
            r5 = this;
            com.badlogic.gdx.utils.IntArray r0 = r5.vertexTypes
            int[] r0 = r0.items
        L4:
            int r1 = r5.vertexCount
            r2 = 0
            r3 = 3
            if (r1 <= r3) goto L28
            int r1 = r5.findEarTip()
            r5.cutEarTip(r1)
            int r3 = r5.previousIndex(r1)
            int r4 = r5.vertexCount
            if (r1 != r4) goto L1a
            goto L1b
        L1a:
            r2 = r1
        L1b:
            int r1 = r5.classifyVertex(r3)
            r0[r3] = r1
            int r1 = r5.classifyVertex(r2)
            r0[r2] = r1
            goto L4
        L28:
            if (r1 != r3) goto L3f
            com.badlogic.gdx.utils.ShortArray r0 = r5.triangles
            short[] r1 = r5.indices
            short r2 = r1[r2]
            r0.add(r2)
            r2 = 1
            short r2 = r1[r2]
            r0.add(r2)
            r2 = 2
            short r1 = r1[r2]
            r0.add(r1)
        L3f:
            return
    }

    public com.badlogic.gdx.utils.ShortArray computeTriangles(com.badlogic.gdx.utils.FloatArray r3) {
            r2 = this;
            float[] r0 = r3.items
            int r3 = r3.size
            r1 = 0
            com.badlogic.gdx.utils.ShortArray r3 = r2.computeTriangles(r0, r1, r3)
            return r3
    }

    public com.badlogic.gdx.utils.ShortArray computeTriangles(float[] r3) {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            com.badlogic.gdx.utils.ShortArray r3 = r2.computeTriangles(r3, r1, r0)
            return r3
    }

    public com.badlogic.gdx.utils.ShortArray computeTriangles(float[] r5, int r6, int r7) {
            r4 = this;
            r4.vertices = r5
            int r0 = r7 / 2
            r4.vertexCount = r0
            int r1 = r6 / 2
            com.badlogic.gdx.utils.ShortArray r2 = r4.indicesArray
            r2.clear()
            r2.ensureCapacity(r0)
            r2.size = r0
            short[] r2 = r2.items
            r4.indices = r2
            boolean r5 = com.badlogic.gdx.math.GeometryUtils.isClockwise(r5, r6, r7)
            r6 = 0
            if (r5 == 0) goto L29
            r5 = 0
        L1e:
            if (r5 >= r0) goto L37
            int r7 = r1 + r5
            short r7 = (short) r7
            r2[r5] = r7
            int r5 = r5 + 1
            short r5 = (short) r5
            goto L1e
        L29:
            int r5 = r0 + (-1)
            r7 = 0
        L2c:
            if (r7 >= r0) goto L37
            int r3 = r1 + r5
            int r3 = r3 - r7
            short r3 = (short) r3
            r2[r7] = r3
            int r7 = r7 + 1
            goto L2c
        L37:
            com.badlogic.gdx.utils.IntArray r5 = r4.vertexTypes
            r5.clear()
            r5.ensureCapacity(r0)
            r7 = 0
        L40:
            if (r7 >= r0) goto L4c
            int r1 = r4.classifyVertex(r7)
            r5.add(r1)
            int r7 = r7 + 1
            goto L40
        L4c:
            com.badlogic.gdx.utils.ShortArray r5 = r4.triangles
            r5.clear()
            int r0 = r0 + (-2)
            int r6 = java.lang.Math.max(r6, r0)
            int r6 = r6 * 3
            r5.ensureCapacity(r6)
            r4.triangulate()
            return r5
    }
}
