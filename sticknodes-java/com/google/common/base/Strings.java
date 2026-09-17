package com.google.common.base;

/* loaded from: classes2.dex */
public final class Strings {
    public static java.lang.String lenientFormat(java.lang.String r6, java.lang.Object... r7) {
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r0 = 0
            if (r7 != 0) goto Lf
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r1 = "(Object[])null"
            r7[r0] = r1
            goto L1e
        Lf:
            r1 = 0
        L10:
            int r2 = r7.length
            if (r1 >= r2) goto L1e
            r2 = r7[r1]
            java.lang.String r2 = lenientToString(r2)
            r7[r1] = r2
            int r1 = r1 + 1
            goto L10
        L1e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r6.length()
            int r3 = r7.length
            int r3 = r3 * 16
            int r2 = r2 + r3
            r1.<init>(r2)
            r2 = 0
        L2c:
            int r3 = r7.length
            if (r0 >= r3) goto L49
            java.lang.String r3 = "%s"
            int r3 = r6.indexOf(r3, r2)
            r4 = -1
            if (r3 != r4) goto L39
            goto L49
        L39:
            r1.append(r6, r2, r3)
            int r2 = r0 + 1
            r0 = r7[r0]
            r1.append(r0)
            int r0 = r3 + 2
            r5 = r2
            r2 = r0
            r0 = r5
            goto L2c
        L49:
            int r3 = r6.length()
            r1.append(r6, r2, r3)
            int r6 = r7.length
            if (r0 >= r6) goto L75
            java.lang.String r6 = " ["
            r1.append(r6)
            int r6 = r0 + 1
            r0 = r7[r0]
            r1.append(r0)
        L5f:
            int r0 = r7.length
            if (r6 >= r0) goto L70
            java.lang.String r0 = ", "
            r1.append(r0)
            int r0 = r6 + 1
            r6 = r7[r6]
            r1.append(r6)
            r6 = r0
            goto L5f
        L70:
            r6 = 93
            r1.append(r6)
        L75:
            java.lang.String r6 = r1.toString()
            return r6
    }

    private static java.lang.String lenientToString(java.lang.Object r6) {
            if (r6 != 0) goto L5
            java.lang.String r6 = "null"
            return r6
        L5:
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> La
            return r6
        La:
            r0 = move-exception
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            int r6 = java.lang.System.identityHashCode(r6)
            java.lang.String r6 = java.lang.Integer.toHexString(r6)
            int r2 = r1.length()
            int r2 = r2 + 1
            java.lang.String r3 = java.lang.String.valueOf(r6)
            int r3 = r3.length()
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r1)
            r1 = 64
            r3.append(r1)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            java.lang.String r1 = "com.google.common.base.Strings"
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.String r3 = "Exception during lenientFormat for "
            java.lang.String r4 = java.lang.String.valueOf(r6)
            int r5 = r4.length()
            if (r5 == 0) goto L57
            java.lang.String r3 = r3.concat(r4)
            goto L5d
        L57:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r3 = r4
        L5d:
            r1.log(r2, r3, r0)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = java.lang.String.valueOf(r6)
            int r1 = r1.length()
            int r1 = r1 + 9
            int r2 = r0.length()
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "<"
            r2.append(r1)
            r2.append(r6)
            java.lang.String r6 = " threw "
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = ">"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            return r6
    }
}
