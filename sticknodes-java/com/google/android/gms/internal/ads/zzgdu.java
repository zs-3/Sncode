package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgdu extends com.google.android.gms.internal.ads.zzgdv {
    static /* bridge */ /* synthetic */ int zza(int[] r1, int r2, int r3, int r4) {
        L0:
            if (r3 >= r4) goto La
            r0 = r1[r3]
            if (r0 != r2) goto L7
            goto Lb
        L7:
            int r3 = r3 + 1
            goto L0
        La:
            r3 = -1
        Lb:
            return r3
    }

    public static int zzb(long r4) {
            int r0 = (int) r4
            long r1 = (long) r0
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 != 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            java.lang.String r2 = "Out of range: %s"
            com.google.android.gms.internal.ads.zzfxz.zzg(r1, r2, r4)
            return r0
    }

    public static int zzc(int r2, int r3, int r4) {
            r4 = 1
            java.lang.String r0 = "min (%s) must be less than or equal to max (%s)"
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            com.google.android.gms.internal.ads.zzfxz.zzh(r4, r0, r3, r1)
            int r2 = java.lang.Math.max(r2, r3)
            int r2 = java.lang.Math.min(r2, r1)
            return r2
    }

    public static int zzd(byte[] r6) {
            int r0 = r6.length
            r1 = 1
            r2 = 0
            r3 = 4
            if (r0 < r3) goto L8
            r4 = 1
            goto L9
        L8:
            r4 = 0
        L9:
            java.lang.String r5 = "array too small: %s < %s"
            com.google.android.gms.internal.ads.zzfxz.zzh(r4, r5, r0, r3)
            r0 = r6[r2]
            int r0 = r0 << 24
            r1 = r6[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 2
            r2 = r6[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 3
            r6 = r6[r3]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r1 = r2 << 8
            r0 = r0 | r1
            r6 = r6 | r0
            return r6
    }

    public static int zze(long r3) {
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto Lb
            r3 = 2147483647(0x7fffffff, float:NaN)
            return r3
        Lb:
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L15
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            return r3
        L15:
            int r4 = (int) r3
            return r4
    }

    public static java.lang.Integer zzf(java.lang.String r12, int r13) {
            java.util.Objects.requireNonNull(r12)
            boolean r13 = r12.isEmpty()
            r0 = 0
            if (r13 == 0) goto Ld
        La:
            r12 = r0
            goto L70
        Ld:
            r13 = 0
            char r1 = r12.charAt(r13)
            r2 = 45
            if (r1 != r2) goto L17
            r13 = 1
        L17:
            int r3 = r12.length()
            if (r13 != r3) goto L1e
            goto La
        L1e:
            int r3 = r13 + 1
            char r13 = r12.charAt(r13)
            int r13 = com.google.android.gms.internal.ads.zzgdw.zza(r13)
            if (r13 < 0) goto La
            r4 = 10
            if (r13 < r4) goto L2f
            goto La
        L2f:
            int r13 = -r13
            long r5 = (long) r13
        L31:
            int r13 = r12.length()
            r7 = -9223372036854775808
            if (r3 >= r13) goto L5f
            int r13 = r3 + 1
            char r3 = r12.charAt(r3)
            int r3 = com.google.android.gms.internal.ads.zzgdw.zza(r3)
            if (r3 < 0) goto La
            if (r3 >= r4) goto La
            r9 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 >= 0) goto L51
            goto La
        L51:
            r9 = 10
            long r5 = r5 * r9
            long r9 = (long) r3
            long r7 = r7 + r9
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 >= 0) goto L5c
            goto La
        L5c:
            long r5 = r5 - r9
            r3 = r13
            goto L31
        L5f:
            if (r1 != r2) goto L66
            java.lang.Long r12 = java.lang.Long.valueOf(r5)
            goto L70
        L66:
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 != 0) goto L6b
            goto La
        L6b:
            long r12 = -r5
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
        L70:
            if (r12 == 0) goto L89
            long r1 = r12.longValue()
            int r13 = r12.intValue()
            long r3 = (long) r13
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 == 0) goto L80
            goto L89
        L80:
            int r12 = r12.intValue()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            return r12
        L89:
            return r0
    }

    public static java.util.List zzg(int... r3) {
            int r0 = r3.length
            if (r0 != 0) goto L8
            java.util.List r3 = java.util.Collections.emptyList()
            return r3
        L8:
            com.google.android.gms.internal.ads.zzgdt r1 = new com.google.android.gms.internal.ads.zzgdt
            r2 = 0
            r1.<init>(r3, r2, r0)
            return r1
    }

    public static int[] zzh(java.util.Collection r4) {
            java.lang.Object[] r4 = r4.toArray()
            int r0 = r4.length
            int[] r1 = new int[r0]
            r2 = 0
        L8:
            if (r2 >= r0) goto L1a
            r3 = r4[r2]
            java.util.Objects.requireNonNull(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L8
        L1a:
            return r1
    }
}
