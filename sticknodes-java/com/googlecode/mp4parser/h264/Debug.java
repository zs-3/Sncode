package com.googlecode.mp4parser.h264;

/* loaded from: classes2.dex */
public class Debug {
    public static final boolean debug = false;

    public Debug() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void print(int r0) {
            return
    }

    public static void print(java.lang.String r0) {
            return
    }

    public static void print(short[] r8) {
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            r3 = 8
            if (r1 < r3) goto L8
            return
        L8:
            r4 = 0
        L9:
            if (r4 < r3) goto L13
            java.io.PrintStream r3 = java.lang.System.out
            r3.println()
            int r1 = r1 + 1
            goto L3
        L13:
            java.io.PrintStream r5 = java.lang.System.out
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            short r7 = r8[r2]
            java.lang.Short r7 = java.lang.Short.valueOf(r7)
            r6[r0] = r7
            java.lang.String r7 = "%3d, "
            r5.printf(r7, r6)
            int r2 = r2 + 1
            int r4 = r4 + 1
            goto L9
    }

    public static final void print8x8(java.nio.ShortBuffer r7) {
            r0 = 0
            r1 = 0
        L2:
            r2 = 8
            if (r1 < r2) goto L7
            return
        L7:
            r3 = 0
        L8:
            if (r3 < r2) goto L12
            java.io.PrintStream r2 = java.lang.System.out
            r2.println()
            int r1 = r1 + 1
            goto L2
        L12:
            java.io.PrintStream r4 = java.lang.System.out
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            short r6 = r7.get()
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            r5[r0] = r6
            java.lang.String r6 = "%3d, "
            r4.printf(r6, r5)
            int r3 = r3 + 1
            goto L8
    }

    public static final void print8x8(int[] r8) {
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            r3 = 8
            if (r1 < r3) goto L8
            return
        L8:
            r4 = 0
        L9:
            if (r4 < r3) goto L13
            java.io.PrintStream r3 = java.lang.System.out
            r3.println()
            int r1 = r1 + 1
            goto L3
        L13:
            java.io.PrintStream r5 = java.lang.System.out
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7 = r8[r2]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r0] = r7
            java.lang.String r7 = "%3d, "
            r5.printf(r7, r6)
            int r2 = r2 + 1
            int r4 = r4 + 1
            goto L9
    }

    public static final void print8x8(short[] r8) {
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            r3 = 8
            if (r1 < r3) goto L8
            return
        L8:
            r4 = 0
        L9:
            if (r4 < r3) goto L13
            java.io.PrintStream r3 = java.lang.System.out
            r3.println()
            int r1 = r1 + 1
            goto L3
        L13:
            java.io.PrintStream r5 = java.lang.System.out
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            short r7 = r8[r2]
            java.lang.Short r7 = java.lang.Short.valueOf(r7)
            r6[r0] = r7
            java.lang.String r7 = "%3d, "
            r5.printf(r7, r6)
            int r2 = r2 + 1
            int r4 = r4 + 1
            goto L9
    }

    public static void println(java.lang.String r0) {
            return
    }

    public static void trace(java.lang.String r0, java.lang.Object... r1) {
            return
    }
}
