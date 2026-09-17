package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzawr {
    public static final /* synthetic */ int zza = 0;
    private static final char[] zzb = null;

    static {
            java.lang.String r0 = "0123456789abcdef"
            char[] r0 = r0.toCharArray()
            com.google.android.gms.internal.ads.zzawr.zzb = r0
            return
    }

    public static long zza(double r0, int r2, android.util.DisplayMetrics r3) {
            float r2 = r3.density
            double r2 = (double) r2
            double r0 = r0 / r2
            long r0 = java.lang.Math.round(r0)
            return r0
    }

    public static java.lang.String zzb(byte[] r6) {
            int r0 = r6.length
            int r0 = r0 + r0
            char[] r0 = new char[r0]
            r1 = 0
        L5:
            int r2 = r6.length
            if (r1 >= r2) goto L21
            r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            char[] r3 = com.google.android.gms.internal.ads.zzawr.zzb
            int r4 = r2 >>> 4
            char r4 = r3[r4]
            int r5 = r1 + r1
            r0[r5] = r4
            r2 = r2 & 15
            int r5 = r5 + 1
            char r2 = r3[r2]
            r0[r5] = r2
            int r1 = r1 + 1
            goto L5
        L21:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
            return r6
    }

    public static boolean zzc() {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public static boolean zzd(java.lang.String r0) {
            if (r0 == 0) goto Lb
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public static boolean zze(android.util.DisplayMetrics r1) {
            if (r1 == 0) goto Lb
            float r1 = r1.density
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 == 0) goto Lb
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public static byte[] zzf(java.lang.String r7) {
            int r0 = r7.length()
            int r1 = r0 % 2
            if (r1 != 0) goto L2f
            int r1 = r0 / 2
            byte[] r1 = new byte[r1]
            r2 = 0
        Ld:
            if (r2 >= r0) goto L2e
            int r3 = r2 / 2
            char r4 = r7.charAt(r2)
            r5 = 16
            int r4 = java.lang.Character.digit(r4, r5)
            int r4 = r4 << 4
            int r6 = r2 + 1
            char r6 = r7.charAt(r6)
            int r5 = java.lang.Character.digit(r6, r5)
            int r4 = r4 + r5
            byte r4 = (byte) r4
            r1[r3] = r4
            int r2 = r2 + 2
            goto Ld
        L2e:
            return r1
        L2f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "String must be of even-length"
            r7.<init>(r0)
            throw r7
    }
}
