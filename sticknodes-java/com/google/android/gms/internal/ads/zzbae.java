package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbae {
    static long zza(long r6, int r8) {
            r0 = 1
            if (r8 != r0) goto L4
            return r6
        L4:
            long r1 = r6 * r6
            int r3 = r8 >> 1
            r8 = r8 & r0
            r4 = 1073807359(0x4000ffff, double:5.305313263E-315)
            long r1 = r1 % r4
            if (r8 != 0) goto L15
            long r6 = zza(r1, r3)
        L13:
            long r6 = r6 % r4
            return r6
        L15:
            long r0 = zza(r1, r3)
            long r0 = r0 % r4
            long r6 = r6 * r0
            goto L13
    }

    static java.lang.String zzb(java.lang.String[] r2, int r3, int r4) {
            int r0 = r2.length
            int r4 = r4 + r3
            if (r0 >= r4) goto Lc
            java.lang.String r2 = "Unable to construct shingle"
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r2)
            java.lang.String r2 = ""
            return r2
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L11:
            int r1 = r4 + (-1)
            if (r3 >= r1) goto L22
            r1 = r2[r3]
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            int r3 = r3 + 1
            goto L11
        L22:
            r2 = r2[r1]
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static void zzc(java.lang.String[] r17, int r18, int r19, java.util.PriorityQueue r20) {
            r0 = r17
            int r4 = r0.length
            r1 = 0
            r2 = 6
            if (r4 >= r2) goto L19
            long r2 = zze(r0, r1, r4)
            java.lang.String r5 = zzb(r0, r1, r4)
            r0 = r18
            r1 = r2
            r3 = r5
            r5 = r20
            zzd(r0, r1, r3, r4, r5)
            return
        L19:
            long r3 = zze(r0, r1, r2)
            java.lang.String r9 = zzb(r0, r1, r2)
            r10 = 6
            r6 = r18
            r7 = r3
            r11 = r20
            zzd(r6, r7, r9, r10, r11)
            r1 = 1
        L2b:
            int r9 = r0.length
            int r5 = r9 + (-5)
            if (r1 >= r5) goto L6f
            int r5 = r1 + (-1)
            r5 = r0[r5]
            int r5 = com.google.android.gms.internal.ads.zzbaa.zza(r5)
            int r6 = r1 + 5
            r6 = r0[r6]
            int r6 = com.google.android.gms.internal.ads.zzbaa.zza(r6)
            long r7 = (long) r5
            r10 = 1073807359(0x4000ffff, double:5.305313263E-315)
            long r3 = r3 + r10
            long r5 = (long) r6
            java.lang.String r12 = zzb(r0, r1, r2)
            r13 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r5 = r5 + r13
            long r7 = r7 + r13
            r13 = 16785407(0x1001fff, double:8.293093E-317)
            r15 = 5
            long r15 = zza(r13, r15)
            long r7 = r7 % r10
            long r15 = r15 * r7
            long r15 = r15 % r10
            long r3 = r3 - r15
            long r3 = r3 % r10
            long r3 = r3 * r13
            long r3 = r3 % r10
            long r5 = r5 % r10
            long r3 = r3 + r5
            long r3 = r3 % r10
            r5 = r18
            r6 = r3
            r8 = r12
            r10 = r20
            zzd(r5, r6, r8, r9, r10)
            int r1 = r1 + 1
            goto L2b
        L6f:
            return
    }

    static void zzd(int r2, long r3, java.lang.String r5, int r6, java.util.PriorityQueue r7) {
            com.google.android.gms.internal.ads.zzbad r0 = new com.google.android.gms.internal.ads.zzbad
            r0.<init>(r3, r5, r6)
            int r3 = r7.size()
            if (r3 != r2) goto L25
            java.lang.Object r3 = r7.peek()
            com.google.android.gms.internal.ads.zzbad r3 = (com.google.android.gms.internal.ads.zzbad) r3
            int r3 = r3.zzc
            int r4 = r0.zzc
            if (r3 > r4) goto L38
            java.lang.Object r3 = r7.peek()
            com.google.android.gms.internal.ads.zzbad r3 = (com.google.android.gms.internal.ads.zzbad) r3
            long r3 = r3.zza
            long r5 = r0.zza
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L38
        L25:
            boolean r3 = r7.contains(r0)
            if (r3 == 0) goto L2c
            goto L38
        L2c:
            r7.add(r0)
            int r3 = r7.size()
            if (r3 <= r2) goto L38
            r7.poll()
        L38:
            return
    }

    private static long zze(java.lang.String[] r8, int r9, int r10) {
            r9 = 0
            r9 = r8[r9]
            int r9 = com.google.android.gms.internal.ads.zzbaa.zza(r9)
            long r0 = (long) r9
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = r0 + r2
            r4 = 1073807359(0x4000ffff, double:5.305313263E-315)
            long r0 = r0 % r4
            r9 = 1
        L11:
            if (r9 >= r10) goto L27
            r6 = 16785407(0x1001fff, double:8.293093E-317)
            long r0 = r0 * r6
            long r0 = r0 % r4
            r6 = r8[r9]
            int r6 = com.google.android.gms.internal.ads.zzbaa.zza(r6)
            long r6 = (long) r6
            long r6 = r6 + r2
            long r6 = r6 % r4
            long r0 = r0 + r6
            long r0 = r0 % r4
            int r9 = r9 + 1
            goto L11
        L27:
            return r0
    }
}
