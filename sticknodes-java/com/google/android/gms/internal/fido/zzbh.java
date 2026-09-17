package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public final class zzbh {
    public static int zza(int r5, int r6, java.math.RoundingMode r7) {
            java.util.Objects.requireNonNull(r7)
            if (r6 == 0) goto L54
            int r0 = r5 / r6
            int r1 = r6 * r0
            int r1 = r5 - r1
            if (r1 != 0) goto Le
            return r0
        Le:
            r5 = r5 ^ r6
            int[] r2 = com.google.android.gms.internal.fido.zzbg.zza
            int r3 = r7.ordinal()
            r2 = r2[r3]
            int r5 = r5 >> 31
            r3 = 1
            r5 = r5 | r3
            r4 = 0
            switch(r2) {
                case 1: goto L50;
                case 2: goto L53;
                case 3: goto L48;
                case 4: goto L4e;
                case 5: goto L45;
                case 6: goto L25;
                case 7: goto L25;
                case 8: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L25:
            int r1 = java.lang.Math.abs(r1)
            int r6 = java.lang.Math.abs(r6)
            int r6 = r6 - r1
            int r1 = r1 - r6
            if (r1 != 0) goto L42
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_UP
            if (r7 == r6) goto L4c
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_EVEN
            if (r7 != r6) goto L3b
            r6 = 1
            goto L3c
        L3b:
            r6 = 0
        L3c:
            r7 = r0 & 1
            r6 = r6 & r7
            if (r6 == 0) goto L4b
            goto L4c
        L42:
            if (r1 <= 0) goto L4b
            goto L4c
        L45:
            if (r5 <= 0) goto L4b
            goto L4c
        L48:
            if (r5 >= 0) goto L4b
            goto L4c
        L4b:
            r3 = 0
        L4c:
            if (r3 == 0) goto L53
        L4e:
            int r0 = r0 + r5
            return r0
        L50:
            com.google.android.gms.internal.fido.zzbi.zza(r4)
        L53:
            return r0
        L54:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "/ by zero"
            r5.<init>(r6)
            throw r5
    }

    public static int zzb(int r1, java.math.RoundingMode r2) {
            if (r1 <= 0) goto L3d
            int[] r0 = com.google.android.gms.internal.fido.zzbg.zza
            int r2 = r2.ordinal()
            r2 = r0[r2]
            switch(r2) {
                case 1: goto L2b;
                case 2: goto L36;
                case 3: goto L36;
                case 4: goto L22;
                case 5: goto L22;
                case 6: goto L13;
                case 7: goto L13;
                case 8: goto L13;
                default: goto Ld;
            }
        Ld:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L13:
            r2 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r1)
            int r2 = r2 >>> r0
            int r0 = 31 - r0
            int r2 = r2 - r1
            int r1 = r2 >>> 31
            int r0 = r0 + r1
            return r0
        L22:
            int r1 = r1 + (-1)
            int r1 = java.lang.Integer.numberOfLeadingZeros(r1)
            int r1 = 32 - r1
            return r1
        L2b:
            int r2 = r1 + (-1)
            r2 = r2 & r1
            if (r2 != 0) goto L32
            r2 = 1
            goto L33
        L32:
            r2 = 0
        L33:
            com.google.android.gms.internal.fido.zzbi.zza(r2)
        L36:
            int r1 = java.lang.Integer.numberOfLeadingZeros(r1)
            int r1 = 31 - r1
            return r1
        L3d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "x (0) must be > 0"
            r1.<init>(r2)
            throw r1
    }
}
