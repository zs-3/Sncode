package org.jcodec.common;

/* loaded from: classes2.dex */
public class StringUtils {
    public static java.lang.String[] splitC(java.lang.String r1, char r2) {
            r0 = 0
            java.lang.String[] r1 = splitWorker(r1, r2, r0)
            return r1
    }

    private static java.lang.String[] splitWorker(java.lang.String r9, char r10, boolean r11) {
            if (r9 != 0) goto L4
            r9 = 0
            return r9
        L4:
            int r0 = r9.length()
            r1 = 0
            if (r0 != 0) goto Le
            java.lang.String[] r9 = new java.lang.String[r1]
            return r9
        Le:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L18:
            if (r4 >= r0) goto L36
            char r8 = r9.charAt(r4)
            if (r8 != r10) goto L31
            if (r5 != 0) goto L24
            if (r11 == 0) goto L2d
        L24:
            java.lang.String r5 = r9.substring(r7, r4)
            r2.add(r5)
            r5 = 0
            r6 = 1
        L2d:
            int r7 = r4 + 1
            r4 = r7
            goto L18
        L31:
            int r4 = r4 + 1
            r5 = 1
            r6 = 0
            goto L18
        L36:
            if (r5 != 0) goto L3c
            if (r11 == 0) goto L43
            if (r6 == 0) goto L43
        L3c:
            java.lang.String r9 = r9.substring(r7, r4)
            r2.add(r9)
        L43:
            int r9 = r2.size()
            java.lang.String[] r9 = new java.lang.String[r9]
            java.lang.Object[] r9 = r2.toArray(r9)
            java.lang.String[] r9 = (java.lang.String[]) r9
            return r9
    }
}
