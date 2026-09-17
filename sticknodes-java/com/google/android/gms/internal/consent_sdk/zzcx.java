package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
public final class zzcx {
    public static java.lang.String zza(java.lang.String r11, java.lang.Object... r12) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r12.length
            if (r1 >= r2) goto L77
            r2 = r12[r1]
            if (r2 != 0) goto Lc
            java.lang.String r2 = "null"
            goto L72
        Lc:
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L11
            goto L72
        L11:
            r9 = move-exception
            java.lang.Class r3 = r2.getClass()
            java.lang.String r3 = r3.getName()
            int r2 = java.lang.System.identityHashCode(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "@"
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r3 = "com.google.common.base.Strings"
            java.util.logging.Logger r3 = java.util.logging.Logger.getLogger(r3)
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            java.lang.String r5 = "Exception during lenientFormat for "
            java.lang.String r7 = r5.concat(r2)
            java.lang.String r5 = "com.google.common.base.Strings"
            java.lang.String r6 = "lenientToString"
            r8 = r9
            r3.logp(r4, r5, r6, r7, r8)
            java.lang.Class r3 = r9.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "<"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " threw "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = ">"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
        L72:
            r12[r1] = r2
            int r1 = r1 + 1
            goto L2
        L77:
            int r1 = r11.length()
            int r2 = r2 * 16
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + r2
            r3.<init>(r1)
            r1 = 0
        L84:
            int r2 = r12.length
            if (r0 >= r2) goto La1
            java.lang.String r4 = "%s"
            int r4 = r11.indexOf(r4, r1)
            r5 = -1
            if (r4 != r5) goto L91
            goto La1
        L91:
            r3.append(r11, r1, r4)
            int r1 = r0 + 1
            r0 = r12[r0]
            r3.append(r0)
            int r0 = r4 + 2
            r10 = r1
            r1 = r0
            r0 = r10
            goto L84
        La1:
            int r4 = r11.length()
            r3.append(r11, r1, r4)
            if (r0 >= r2) goto Lcc
            java.lang.String r11 = " ["
            r3.append(r11)
            int r11 = r0 + 1
            r0 = r12[r0]
            r3.append(r0)
        Lb6:
            int r0 = r12.length
            if (r11 >= r0) goto Lc7
            java.lang.String r0 = ", "
            r3.append(r0)
            int r0 = r11 + 1
            r11 = r12[r11]
            r3.append(r11)
            r11 = r0
            goto Lb6
        Lc7:
            r11 = 93
            r3.append(r11)
        Lcc:
            java.lang.String r11 = r3.toString()
            return r11
    }
}
