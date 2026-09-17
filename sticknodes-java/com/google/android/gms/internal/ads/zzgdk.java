package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgdk {
    static {
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            java.lang.Math.log(r0)
            return
    }

    public static int zza(double r5, java.math.RoundingMode r7) {
            r0 = 0
            r1 = 1
            r2 = 0
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 <= 0) goto L10
            boolean r2 = com.google.android.gms.internal.ads.zzgdl.zzb(r5)
            if (r2 == 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            java.lang.String r3 = "x must be positive and finite"
            com.google.android.gms.internal.ads.zzfxz.zzf(r2, r3)
            int r2 = java.lang.Math.getExponent(r5)
            int r3 = java.lang.Math.getExponent(r5)
            r4 = -1022(0xfffffffffffffc02, float:NaN)
            if (r3 < r4) goto L72
            int[] r3 = com.google.android.gms.internal.ads.zzgdj.zza
            int r7 = r7.ordinal()
            r7 = r3[r7]
            switch(r7) {
                case 1: goto L6a;
                case 2: goto L69;
                case 3: goto L60;
                case 4: goto L56;
                case 5: goto L4e;
                case 6: goto L33;
                case 7: goto L33;
                case 8: goto L33;
                default: goto L2d;
            }
        L2d:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L33:
            long r5 = java.lang.Double.doubleToRawLongBits(r5)
            r3 = 4503599627370495(0xfffffffffffff, double:2.225073858507201E-308)
            long r5 = r5 & r3
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r5 = r5 | r3
            double r5 = java.lang.Double.longBitsToDouble(r5)
            double r5 = r5 * r5
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L66
            r0 = 1
            goto L66
        L4e:
            if (r2 < 0) goto L51
            r0 = 1
        L51:
            boolean r5 = zzd(r5)
            goto L5d
        L56:
            if (r2 >= 0) goto L59
            r0 = 1
        L59:
            boolean r5 = zzd(r5)
        L5d:
            r5 = r5 ^ r1
            r0 = r0 & r5
            goto L66
        L60:
            boolean r5 = zzd(r5)
            r0 = r5 ^ 1
        L66:
            if (r0 == 0) goto L69
            int r2 = r2 + r1
        L69:
            return r2
        L6a:
            boolean r5 = zzd(r5)
            com.google.android.gms.internal.ads.zzgdq.zzb(r5)
            return r2
        L72:
            r0 = 4841369599423283200(0x4330000000000000, double:4.503599627370496E15)
            double r5 = r5 * r0
            int r5 = zza(r5, r7)
            int r5 = r5 + (-52)
            return r5
    }

    public static long zzb(double r9, java.math.RoundingMode r11) {
            boolean r0 = com.google.android.gms.internal.ads.zzgdl.zzb(r9)
            if (r0 == 0) goto Lbc
            int[] r0 = com.google.android.gms.internal.ads.zzgdj.zza
            int r1 = r11.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r4 = 0
            switch(r0) {
                case 1: goto L76;
                case 2: goto L65;
                case 3: goto L56;
                case 4: goto L7d;
                case 5: goto L45;
                case 6: goto L40;
                case 7: goto L2b;
                case 8: goto L1c;
                default: goto L16;
            }
        L16:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L1c:
            double r4 = java.lang.Math.rint(r9)
            double r6 = r9 - r4
            double r6 = java.lang.Math.abs(r6)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L7e
            goto L7d
        L2b:
            double r4 = java.lang.Math.rint(r9)
            double r6 = r9 - r4
            double r6 = java.lang.Math.abs(r6)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L7e
            double r2 = java.lang.Math.copySign(r2, r9)
            double r4 = r9 + r2
            goto L7e
        L40:
            double r4 = java.lang.Math.rint(r9)
            goto L7e
        L45:
            boolean r0 = zzc(r9)
            if (r0 == 0) goto L4c
            goto L7d
        L4c:
            long r2 = (long) r9
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 <= 0) goto L53
            r0 = 1
            goto L54
        L53:
            r0 = -1
        L54:
            long r4 = (long) r0
            goto L73
        L56:
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 <= 0) goto L7d
            boolean r0 = zzc(r9)
            if (r0 == 0) goto L61
            goto L7d
        L61:
            long r2 = (long) r9
            r4 = 1
            goto L73
        L65:
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 >= 0) goto L7d
            boolean r0 = zzc(r9)
            if (r0 == 0) goto L70
            goto L7d
        L70:
            long r2 = (long) r9
            r4 = -1
        L73:
            long r2 = r2 + r4
            double r4 = (double) r2
            goto L7e
        L76:
            boolean r0 = zzc(r9)
            com.google.android.gms.internal.ads.zzgdq.zzb(r0)
        L7d:
            r4 = r9
        L7e:
            r2 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            double r2 = r2 - r4
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 >= 0) goto L8a
            r2 = 1
            goto L8b
        L8a:
            r2 = 0
        L8b:
            r6 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 >= 0) goto L92
            goto L93
        L92:
            r1 = 0
        L93:
            r0 = r2 & r1
            if (r0 == 0) goto L99
            long r9 = (long) r4
            return r9
        L99:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "rounded value is out of range for input "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = " and rounding mode "
            r1.append(r9)
            r1.append(r11)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        Lbc:
            java.lang.ArithmeticException r9 = new java.lang.ArithmeticException
            java.lang.String r10 = "input is infinite or NaN"
            r9.<init>(r10)
            throw r9
    }

    public static boolean zzc(double r5) {
            boolean r0 = com.google.android.gms.internal.ads.zzgdl.zzb(r5)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L20
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L21
            long r3 = com.google.android.gms.internal.ads.zzgdl.zza(r5)
            int r0 = java.lang.Long.numberOfTrailingZeros(r3)
            int r0 = 52 - r0
            int r5 = java.lang.Math.getExponent(r5)
            if (r0 <= r5) goto L1f
            goto L20
        L1f:
            return r1
        L20:
            r1 = 0
        L21:
            return r1
    }

    public static boolean zzd(double r4) {
            r0 = 0
            r1 = 0
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 <= 0) goto L1d
            boolean r1 = com.google.android.gms.internal.ads.zzgdl.zzb(r4)
            if (r1 == 0) goto L1d
            long r4 = com.google.android.gms.internal.ads.zzgdl.zza(r4)
            r1 = -1
            long r1 = r1 + r4
            long r4 = r4 & r1
            r1 = 0
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 != 0) goto L1d
            r4 = 1
            return r4
        L1d:
            return r0
    }
}
