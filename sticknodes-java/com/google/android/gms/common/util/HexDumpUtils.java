package com.google.android.gms.common.util;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public final class HexDumpUtils {
    public HexDumpUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String dump(byte[] r10, int r11, int r12, boolean r13) {
            if (r10 == 0) goto Lc2
            int r0 = r10.length
            if (r0 == 0) goto Lc2
            if (r11 < 0) goto Lc2
            if (r12 <= 0) goto Lc2
            int r1 = r11 + r12
            if (r1 <= r0) goto Lf
            goto Lc2
        Lf:
            if (r13 == 0) goto L14
            r0 = 75
            goto L16
        L14:
            r0 = 57
        L16:
            int r1 = r12 + 15
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 16
            int r1 = r1 / r3
            int r0 = r0 * r1
            r2.<init>(r0)
            r0 = 0
            r1 = r12
            r4 = 0
            r5 = 0
        L26:
            if (r1 <= 0) goto Lbd
            r6 = 8
            r7 = 1
            if (r4 != 0) goto L56
            r5 = 65536(0x10000, float:9.18355E-41)
            if (r12 >= r5) goto L43
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            r5[r0] = r8
            java.lang.String r8 = "%04X:"
            java.lang.String r5 = java.lang.String.format(r8, r5)
            r2.append(r5)
            goto L54
        L43:
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            r5[r0] = r8
            java.lang.String r8 = "%08X:"
            java.lang.String r5 = java.lang.String.format(r8, r5)
            r2.append(r5)
        L54:
            r5 = r11
            goto L5d
        L56:
            if (r4 != r6) goto L5d
            java.lang.String r8 = " -"
            r2.append(r8)
        L5d:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r8 = r10[r11]
            r8 = r8 & 255(0xff, float:3.57E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r0] = r8
            java.lang.String r8 = " %02X"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            r2.append(r7)
            int r1 = r1 + (-1)
            int r4 = r4 + 1
            if (r13 == 0) goto Laf
            if (r4 == r3) goto L7c
            if (r1 != 0) goto Laf
        L7c:
            int r7 = 16 - r4
            if (r7 <= 0) goto L8b
            r8 = 0
        L81:
            if (r8 >= r7) goto L8b
            java.lang.String r9 = "   "
            r2.append(r9)
            int r8 = r8 + 1
            goto L81
        L8b:
            java.lang.String r8 = "  "
            if (r7 < r6) goto L92
            r2.append(r8)
        L92:
            r2.append(r8)
            r6 = 0
        L96:
            if (r6 >= r4) goto Laf
            int r7 = r5 + r6
            r7 = r10[r7]
            char r7 = (char) r7
            r8 = 32
            r9 = 46
            if (r7 < r8) goto La7
            r8 = 126(0x7e, float:1.77E-43)
            if (r7 <= r8) goto La9
        La7:
            r7 = 46
        La9:
            r2.append(r7)
            int r6 = r6 + 1
            goto L96
        Laf:
            if (r4 == r3) goto Lb3
            if (r1 != 0) goto Lb9
        Lb3:
            r4 = 10
            r2.append(r4)
            r4 = 0
        Lb9:
            int r11 = r11 + 1
            goto L26
        Lbd:
            java.lang.String r10 = r2.toString()
            return r10
        Lc2:
            r10 = 0
            return r10
    }
}
