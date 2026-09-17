package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzxf extends com.google.android.gms.internal.ads.zzxh {
    protected zzxf(com.google.android.gms.internal.ads.zzcd r5, int[] r6, int r7, com.google.android.gms.internal.ads.zzyz r8, long r9, long r11, long r13, int r15, int r16, float r17, float r18, java.util.List r19, com.google.android.gms.internal.ads.zzdj r20) {
            r4 = this;
            r0 = 0
            r1 = r4
            r2 = r5
            r3 = r6
            r4.<init>(r5, r6, r0)
            com.google.android.gms.internal.ads.zzgax.zzl(r19)
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgax zzf(com.google.android.gms.internal.ads.zzyk[] r22) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            r3 = 0
            r5 = 2
            r6 = 1
            if (r2 >= r5) goto L2e
            r5 = r22[r2]
            if (r5 == 0) goto L27
            int[] r5 = r5.zzb
            int r5 = r5.length
            if (r5 <= r6) goto L27
            com.google.android.gms.internal.ads.zzgau r5 = new com.google.android.gms.internal.ads.zzgau
            r5.<init>()
            com.google.android.gms.internal.ads.zzxd r6 = new com.google.android.gms.internal.ads.zzxd
            r6.<init>(r3, r3)
            r5.zzf(r6)
            r0.add(r5)
            goto L2b
        L27:
            r3 = 0
            r0.add(r3)
        L2b:
            int r2 = r2 + 1
            goto L7
        L2e:
            long[][] r2 = new long[r5][]
            r7 = 0
        L31:
            r8 = -1
            if (r7 >= r5) goto L6a
            r10 = r22[r7]
            if (r10 != 0) goto L3e
            long[] r8 = new long[r1]
            r2[r7] = r8
            goto L67
        L3e:
            int[] r11 = r10.zzb
            int r11 = r11.length
            long[] r11 = new long[r11]
            r2[r7] = r11
            r11 = 0
        L46:
            int[] r12 = r10.zzb
            int r13 = r12.length
            if (r11 >= r13) goto L62
            com.google.android.gms.internal.ads.zzcd r13 = r10.zza
            r12 = r12[r11]
            com.google.android.gms.internal.ads.zzaf r12 = r13.zzb(r12)
            int r12 = r12.zzi
            long r12 = (long) r12
            r14 = r2[r7]
            int r15 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r15 != 0) goto L5d
            r12 = r3
        L5d:
            r14[r11] = r12
            int r11 = r11 + 1
            goto L46
        L62:
            r8 = r2[r7]
            java.util.Arrays.sort(r8)
        L67:
            int r7 = r7 + 1
            goto L31
        L6a:
            int[] r7 = new int[r5]
            long[] r10 = new long[r5]
            r11 = 0
        L6f:
            if (r11 >= r5) goto L7f
            r12 = r2[r11]
            int r13 = r12.length
            if (r13 != 0) goto L78
            r13 = r3
            goto L7a
        L78:
            r13 = r12[r1]
        L7a:
            r10[r11] = r13
            int r11 = r11 + 1
            goto L6f
        L7f:
            zzg(r0, r10)
            com.google.android.gms.internal.ads.zzgci r3 = com.google.android.gms.internal.ads.zzgci.zzc()
            com.google.android.gms.internal.ads.zzgcb r3 = com.google.android.gms.internal.ads.zzgcd.zzc(r3)
            com.google.android.gms.internal.ads.zzgbz r3 = r3.zzb(r5)
            com.google.android.gms.internal.ads.zzgbi r3 = r3.zza()
            r4 = 0
        L93:
            if (r4 >= r5) goto Lee
            r11 = r2[r4]
            int r11 = r11.length
            if (r11 > r6) goto L9b
            goto Le8
        L9b:
            double[] r12 = new double[r11]
            r13 = 0
        L9e:
            r14 = r2[r4]
            int r15 = r14.length
            r16 = 0
            if (r13 >= r15) goto Lb8
            r5 = r14[r13]
            int r14 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r14 != 0) goto Lac
            goto Lb1
        Lac:
            double r5 = (double) r5
            double r16 = java.lang.Math.log(r5)
        Lb1:
            r12[r13] = r16
            int r13 = r13 + 1
            r5 = 2
            r6 = 1
            goto L9e
        Lb8:
            int r11 = r11 + (-1)
            r5 = r12[r11]
            r13 = r12[r1]
            double r5 = r5 - r13
            r13 = 0
        Lc0:
            if (r13 >= r11) goto Le8
            r18 = r12[r13]
            int r13 = r13 + 1
            r20 = r12[r13]
            double r18 = r18 + r20
            int r14 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r14 != 0) goto Ld1
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto Ldb
        Ld1:
            r20 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r18 = r18 * r20
            r20 = r12[r1]
            double r18 = r18 - r20
            double r18 = r18 / r5
        Ldb:
            java.lang.Double r14 = java.lang.Double.valueOf(r18)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r3.zzq(r14, r1)
            r1 = 0
            goto Lc0
        Le8:
            int r4 = r4 + 1
            r1 = 0
            r5 = 2
            r6 = 1
            goto L93
        Lee:
            java.util.Collection r1 = r3.zzr()
            com.google.android.gms.internal.ads.zzgax r1 = com.google.android.gms.internal.ads.zzgax.zzl(r1)
            r3 = 0
        Lf7:
            int r4 = r1.size()
            if (r3 >= r4) goto L119
            java.lang.Object r4 = r1.get(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r7[r4]
            r6 = 1
            int r5 = r5 + r6
            r7[r4] = r5
            r8 = r2[r4]
            r11 = r8[r5]
            r10[r4] = r11
            zzg(r0, r10)
            int r3 = r3 + 1
            goto Lf7
        L119:
            r1 = 0
            r2 = 2
        L11b:
            if (r1 >= r2) goto L12b
            java.lang.Object r3 = r0.get(r1)
            if (r3 == 0) goto L128
            r3 = r10[r1]
            long r3 = r3 + r3
            r10[r1] = r3
        L128:
            int r1 = r1 + 1
            goto L11b
        L12b:
            zzg(r0, r10)
            com.google.android.gms.internal.ads.zzgau r1 = new com.google.android.gms.internal.ads.zzgau
            r1.<init>()
            r2 = 0
        L134:
            int r3 = r0.size()
            if (r2 >= r3) goto L151
            java.lang.Object r3 = r0.get(r2)
            com.google.android.gms.internal.ads.zzgau r3 = (com.google.android.gms.internal.ads.zzgau) r3
            if (r3 != 0) goto L147
            com.google.android.gms.internal.ads.zzgax r3 = com.google.android.gms.internal.ads.zzgax.zzn()
            goto L14b
        L147:
            com.google.android.gms.internal.ads.zzgax r3 = r3.zzi()
        L14b:
            r1.zzf(r3)
            int r2 = r2 + 1
            goto L134
        L151:
            com.google.android.gms.internal.ads.zzgax r0 = r1.zzi()
            return r0
    }

    private static void zzg(java.util.List r7, long[] r8) {
            r0 = 0
            r1 = 0
            r3 = 0
        L4:
            r4 = 2
            if (r3 >= r4) goto Ld
            r4 = r8[r3]
            long r1 = r1 + r4
            int r3 = r3 + 1
            goto L4
        Ld:
            int r3 = r7.size()
            if (r0 >= r3) goto L28
            java.lang.Object r3 = r7.get(r0)
            com.google.android.gms.internal.ads.zzgau r3 = (com.google.android.gms.internal.ads.zzgau) r3
            if (r3 == 0) goto L25
            com.google.android.gms.internal.ads.zzxd r4 = new com.google.android.gms.internal.ads.zzxd
            r5 = r8[r0]
            r4.<init>(r1, r5)
            r3.zzf(r4)
        L25:
            int r0 = r0 + 1
            goto Ld
        L28:
            return
    }
}
