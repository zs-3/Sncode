package com.google.common.collect;

/* loaded from: classes2.dex */
final class Hashing {
    static int smear(int r4) {
            long r0 = (long) r4
            r2 = -862048943(0xffffffffcc9e2d51, double:NaN)
            long r0 = r0 * r2
            int r4 = (int) r0
            r0 = 15
            int r4 = java.lang.Integer.rotateLeft(r4, r0)
            long r0 = (long) r4
            r2 = 461845907(0x1b873593, double:2.281821963E-315)
            long r0 = r0 * r2
            int r4 = (int) r0
            return r4
    }

    static int smearedHash(java.lang.Object r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            int r0 = r0.hashCode()
        L8:
            int r0 = smear(r0)
            return r0
    }
}
