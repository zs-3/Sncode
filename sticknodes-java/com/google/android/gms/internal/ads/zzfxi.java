package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfxi {
    public static java.lang.String zza(java.lang.String r4) {
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L2f
            char r2 = r4.charAt(r1)
            boolean r2 = zze(r2)
            if (r2 == 0) goto L2c
            char[] r4 = r4.toCharArray()
        L15:
            if (r1 >= r0) goto L27
            char r2 = r4[r1]
            boolean r3 = zze(r2)
            if (r3 == 0) goto L24
            r2 = r2 ^ 32
            char r2 = (char) r2
            r4[r1] = r2
        L24:
            int r1 = r1 + 1
            goto L15
        L27:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            return r4
        L2c:
            int r1 = r1 + 1
            goto L5
        L2f:
            return r4
    }

    public static java.lang.String zzb(java.lang.String r4) {
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L2f
            char r2 = r4.charAt(r1)
            boolean r2 = zzd(r2)
            if (r2 == 0) goto L2c
            char[] r4 = r4.toCharArray()
        L15:
            if (r1 >= r0) goto L27
            char r2 = r4[r1]
            boolean r3 = zzd(r2)
            if (r3 == 0) goto L24
            r2 = r2 ^ 32
            char r2 = (char) r2
            r4[r1] = r2
        L24:
            int r1 = r1 + 1
            goto L15
        L27:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            return r4
        L2c:
            int r1 = r1 + 1
            goto L5
        L2f:
            return r4
    }

    public static boolean zzc(java.lang.CharSequence r7, java.lang.CharSequence r8) {
            int r0 = r7.length()
            r1 = 1
            if (r7 != r8) goto L8
            return r1
        L8:
            int r2 = r8.length()
            r3 = 0
            if (r0 != r2) goto L31
            r2 = 0
        L10:
            if (r2 >= r0) goto L30
            char r4 = r7.charAt(r2)
            char r5 = r8.charAt(r2)
            if (r4 != r5) goto L1d
            goto L2c
        L1d:
            int r4 = zzf(r4)
            r6 = 26
            if (r4 >= r6) goto L2f
            int r5 = zzf(r5)
            if (r4 == r5) goto L2c
            goto L2f
        L2c:
            int r2 = r2 + 1
            goto L10
        L2f:
            return r3
        L30:
            return r1
        L31:
            return r3
    }

    public static boolean zzd(char r1) {
            r0 = 97
            if (r1 < r0) goto La
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 > r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static boolean zze(char r1) {
            r0 = 65
            if (r1 < r0) goto La
            r0 = 90
            if (r1 > r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    private static int zzf(char r0) {
            r0 = r0 | 32
            int r0 = r0 + (-97)
            char r0 = (char) r0
            return r0
    }
}
