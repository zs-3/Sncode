package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgdp {
    public static long zza(long r10, long r12) {
            long r0 = r10 ^ r12
            r2 = 1
            r3 = 0
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            long r6 = r10 + r12
            long r8 = r10 ^ r6
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 < 0) goto L16
            goto L17
        L16:
            r2 = 0
        L17:
            r0 = r0 | r2
            if (r0 == 0) goto L1b
            return r6
        L1b:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "overflow: checkedAdd("
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = ", "
            r1.append(r10)
            r1.append(r12)
            java.lang.String r10 = ")"
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
    }

    public static long zzb(long r8, long r10, java.math.RoundingMode r12) {
            java.util.Objects.requireNonNull(r12)
            long r0 = r8 / r10
            long r2 = r10 * r0
            long r2 = r8 - r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L10
            goto L59
        L10:
            long r8 = r8 ^ r10
            int[] r6 = com.google.android.gms.internal.ads.zzgdo.zza
            int r7 = r12.ordinal()
            r6 = r6[r7]
            r7 = 63
            long r8 = r8 >> r7
            int r9 = (int) r8
            r8 = 1
            r9 = r9 | r8
            r7 = 0
            switch(r6) {
                case 1: goto L56;
                case 2: goto L59;
                case 3: goto L4d;
                case 4: goto L53;
                case 5: goto L4a;
                case 6: goto L29;
                case 7: goto L29;
                case 8: goto L29;
                default: goto L23;
            }
        L23:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L29:
            long r2 = java.lang.Math.abs(r2)
            long r10 = java.lang.Math.abs(r10)
            long r10 = r10 - r2
            long r2 = r2 - r10
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 != 0) goto L47
            java.math.RoundingMode r10 = java.math.RoundingMode.HALF_UP
            if (r12 == r10) goto L51
            java.math.RoundingMode r10 = java.math.RoundingMode.HALF_EVEN
            if (r12 != r10) goto L50
            r10 = 1
            long r10 = r10 & r0
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 == 0) goto L50
            goto L51
        L47:
            if (r10 <= 0) goto L50
            goto L51
        L4a:
            if (r9 <= 0) goto L50
            goto L51
        L4d:
            if (r9 >= 0) goto L50
            goto L51
        L50:
            r8 = 0
        L51:
            if (r8 == 0) goto L59
        L53:
            long r8 = (long) r9
            long r0 = r0 + r8
            return r0
        L56:
            com.google.android.gms.internal.ads.zzgdq.zzb(r7)
        L59:
            return r0
    }

    public static long zzc(long r5, long r7) {
            java.lang.String r0 = "a"
            com.google.android.gms.internal.ads.zzgdq.zza(r0, r5)
            java.lang.String r0 = "b"
            com.google.android.gms.internal.ads.zzgdq.zza(r0, r7)
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L11
            return r7
        L11:
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 != 0) goto L16
            return r5
        L16:
            int r0 = java.lang.Long.numberOfTrailingZeros(r5)
            long r5 = r5 >> r0
            int r1 = java.lang.Long.numberOfTrailingZeros(r7)
            long r7 = r7 >> r1
        L20:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L33
            long r5 = r5 - r7
            r2 = 63
            long r2 = r5 >> r2
            long r2 = r2 & r5
            long r5 = r5 - r2
            long r5 = r5 - r2
            int r4 = java.lang.Long.numberOfTrailingZeros(r5)
            long r5 = r5 >> r4
            long r7 = r7 + r2
            goto L20
        L33:
            int r7 = java.lang.Math.min(r0, r1)
            long r5 = r5 << r7
            return r5
    }

    public static long zzd(long r10, long r12) {
            long r0 = ~r10
            int r2 = java.lang.Long.numberOfLeadingZeros(r10)
            int r0 = java.lang.Long.numberOfLeadingZeros(r0)
            int r2 = r2 + r0
            int r0 = java.lang.Long.numberOfLeadingZeros(r12)
            int r2 = r2 + r0
            long r0 = ~r12
            int r0 = java.lang.Long.numberOfLeadingZeros(r0)
            int r2 = r2 + r0
            r0 = 65
            if (r2 <= r0) goto L1c
            long r10 = r10 * r12
            return r10
        L1c:
            long r0 = r10 ^ r12
            r3 = 64
            r4 = 1
            r5 = 0
            if (r2 >= r3) goto L26
            r2 = 1
            goto L27
        L26:
            r2 = 0
        L27:
            r6 = 0
            int r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r3 >= 0) goto L2f
            r6 = 1
            goto L30
        L2f:
            r6 = 0
        L30:
            r7 = -9223372036854775808
            int r9 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r9 != 0) goto L37
            goto L38
        L37:
            r4 = 0
        L38:
            r5 = 63
            long r0 = r0 >>> r5
            r4 = r4 & r6
            r2 = r2 | r4
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r0 = r0 + r4
            if (r2 == 0) goto L46
            return r0
        L46:
            long r4 = r10 * r12
            if (r3 == 0) goto L52
            long r10 = r4 / r10
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 != 0) goto L51
            goto L52
        L51:
            return r0
        L52:
            return r4
    }
}
