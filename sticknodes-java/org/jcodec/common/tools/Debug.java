package org.jcodec.common.tools;

/* loaded from: classes2.dex */
public class Debug {
    public static boolean debug;

    static {
            return
    }

    public static void trace(java.lang.Object... r3) {
            boolean r0 = org.jcodec.common.tools.Debug.debug
            if (r0 == 0) goto L25
            int r0 = r3.length
            if (r0 <= 0) goto L25
            r0 = 0
            r0 = r3[r0]
            java.lang.String r0 = (java.lang.String) r0
            org.jcodec.common.ArrayUtil.shiftLeft1(r3)
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ": %d\n"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.printf(r0, r3)
        L25:
            return
    }
}
