package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzamn {
    public static float zza(java.lang.String r2) throws java.lang.NumberFormatException {
            java.lang.String r0 = "%"
            boolean r0 = r2.endsWith(r0)
            if (r0 == 0) goto L1b
            r0 = 0
            int r1 = r2.length()
            int r1 = r1 + (-1)
            java.lang.String r2 = r2.substring(r0, r1)
            float r2 = java.lang.Float.parseFloat(r2)
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r0
            return r2
        L1b:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r0 = "Percentages must end with %"
            r2.<init>(r0)
            throw r2
    }

    public static long zzb(java.lang.String r9) throws java.lang.NumberFormatException {
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            java.lang.String r0 = "\\."
            r1 = 2
            java.lang.String[] r9 = r9.split(r0, r1)
            r0 = 0
            r2 = r9[r0]
            java.lang.String r3 = ":"
            r4 = -1
            java.lang.String[] r2 = r2.split(r3, r4)
            int r3 = r2.length
            r4 = 0
        L16:
            if (r0 >= r3) goto L26
            r6 = r2[r0]
            r7 = 60
            long r4 = r4 * r7
            long r6 = java.lang.Long.parseLong(r6)
            long r4 = r4 + r6
            int r0 = r0 + 1
            goto L16
        L26:
            r2 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r2
            int r0 = r9.length
            if (r0 != r1) goto L35
            r0 = 1
            r9 = r9[r0]
            long r0 = java.lang.Long.parseLong(r9)
            long r4 = r4 + r0
        L35:
            long r4 = r4 * r2
            return r4
    }
}
