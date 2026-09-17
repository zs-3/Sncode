package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzanx {
    private final com.google.android.gms.internal.ads.zzer zza;
    private final com.google.android.gms.internal.ads.zzek zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private long zzf;
    private long zzg;
    private long zzh;

    zzanx() {
            r3 = this;
            r3.<init>()
            com.google.android.gms.internal.ads.zzer r0 = new com.google.android.gms.internal.ads.zzer
            r1 = 0
            r0.<init>(r1)
            r3.zza = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.zzf = r0
            r3.zzg = r0
            r3.zzh = r0
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r0.<init>()
            r3.zzb = r0
            return
    }

    public static long zzc(com.google.android.gms.internal.ads.zzek r20) {
            r0 = r20
            int r1 = r20.zzd()
            int r2 = r20.zzb()
            r3 = 9
            if (r2 >= r3) goto Lf
            goto L77
        Lf:
            byte[] r2 = new byte[r3]
            r4 = 0
            r0.zzH(r2, r4, r3)
            r0.zzL(r1)
            r0 = r2[r4]
            r1 = r0 & 196(0xc4, float:2.75E-43)
            r3 = 68
            if (r1 != r3) goto L77
            r1 = 2
            r1 = r2[r1]
            r3 = r1 & 4
            r4 = 4
            if (r3 != r4) goto L77
            r3 = r2[r4]
            r5 = r3 & 4
            if (r5 != r4) goto L77
            r4 = 5
            r5 = r2[r4]
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L77
            r5 = 8
            r5 = r2[r5]
            r7 = 3
            r5 = r5 & r7
            if (r5 != r7) goto L77
            long r8 = (long) r0
            r0 = r2[r6]
            long r5 = (long) r0
            long r0 = (long) r1
            r2 = r2[r7]
            long r10 = (long) r2
            long r2 = (long) r3
            r12 = 248(0xf8, double:1.225E-321)
            long r2 = r2 & r12
            long r2 = r2 >> r7
            r14 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r14
            long r10 = r10 << r4
            long r12 = r12 & r0
            long r12 = r12 >> r7
            r16 = 56
            long r16 = r8 & r16
            long r16 = r16 >> r7
            r18 = 3
            long r7 = r8 & r18
            long r4 = r5 & r14
            long r0 = r0 & r18
            r6 = 30
            long r14 = r16 << r6
            r6 = 28
            long r6 = r7 << r6
            long r6 = r6 | r14
            r8 = 20
            long r4 = r4 << r8
            long r4 = r4 | r6
            r6 = 15
            long r6 = r12 << r6
            long r4 = r4 | r6
            r6 = 13
            long r0 = r0 << r6
            long r0 = r0 | r4
            long r0 = r0 | r10
            long r0 = r0 | r2
            return r0
        L77:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            return r0
    }

    private final int zzf(com.google.android.gms.internal.ads.zzadc r4) {
            r3 = this;
            byte[] r0 = com.google.android.gms.internal.ads.zzeu.zzf
            int r1 = r0.length
            com.google.android.gms.internal.ads.zzek r1 = r3.zzb
            r2 = 0
            r1.zzJ(r0, r2)
            r0 = 1
            r3.zzc = r0
            r4.zzj()
            return r2
    }

    private static final int zzg(byte[] r3, int r4) {
            r0 = r3[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r4 + 1
            r1 = r3[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r4 + 2
            r2 = r3[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r4 = r4 + 3
            r3 = r3[r4]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r0 << 24
            int r0 = r1 << 16
            r4 = r4 | r0
            int r0 = r2 << 8
            r4 = r4 | r0
            r3 = r3 | r4
            return r3
    }

    public final int zza(com.google.android.gms.internal.ads.zzadc r12, com.google.android.gms.internal.ads.zzadx r13) throws java.io.IOException {
            r11 = this;
            boolean r0 = r11.zze
            r1 = 442(0x1ba, float:6.2E-43)
            r2 = 20000(0x4e20, double:9.8813E-320)
            r4 = 1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            if (r0 != 0) goto L67
            long r8 = r12.zzd()
            long r2 = java.lang.Math.min(r2, r8)
            int r0 = (int) r2
            long r2 = (long) r0
            long r8 = r8 - r2
            long r2 = r12.zzf()
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 == 0) goto L26
            r13.zza = r8
            goto Lcb
        L26:
            com.google.android.gms.internal.ads.zzek r13 = r11.zzb
            r13.zzI(r0)
            r12.zzj()
            com.google.android.gms.internal.ads.zzek r13 = r11.zzb
            byte[] r13 = r13.zzN()
            r12.zzh(r13, r7, r0)
            com.google.android.gms.internal.ads.zzek r12 = r11.zzb
            int r13 = r12.zzd()
            int r0 = r12.zze()
            int r0 = r0 + (-4)
        L43:
            if (r0 < r13) goto L61
            byte[] r2 = r12.zzN()
            int r2 = zzg(r2, r0)
            if (r2 != r1) goto L5e
            int r2 = r0 + 4
            r12.zzL(r2)
            long r2 = zzc(r12)
            int r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r8 == 0) goto L5e
            r5 = r2
            goto L61
        L5e:
            int r0 = r0 + (-1)
            goto L43
        L61:
            r11.zzg = r5
            r11.zze = r4
        L65:
            r4 = 0
            goto Lcb
        L67:
            long r8 = r11.zzg
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 != 0) goto L71
            r11.zzf(r12)
            return r7
        L71:
            boolean r0 = r11.zzd
            if (r0 != 0) goto Lcc
            long r8 = r12.zzd()
            long r2 = java.lang.Math.min(r2, r8)
            int r0 = (int) r2
            long r2 = r12.zzf()
            r8 = 0
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 == 0) goto L8b
            r13.zza = r8
            goto Lcb
        L8b:
            com.google.android.gms.internal.ads.zzek r13 = r11.zzb
            r13.zzI(r0)
            r12.zzj()
            com.google.android.gms.internal.ads.zzek r13 = r11.zzb
            byte[] r13 = r13.zzN()
            r12.zzh(r13, r7, r0)
            com.google.android.gms.internal.ads.zzek r12 = r11.zzb
            int r13 = r12.zzd()
            int r0 = r12.zze()
        La6:
            int r2 = r0 + (-3)
            if (r13 >= r2) goto Lc6
            byte[] r2 = r12.zzN()
            int r2 = zzg(r2, r13)
            if (r2 != r1) goto Lc3
            int r2 = r13 + 4
            r12.zzL(r2)
            long r2 = zzc(r12)
            int r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r8 == 0) goto Lc3
            r5 = r2
            goto Lc6
        Lc3:
            int r13 = r13 + 1
            goto La6
        Lc6:
            r11.zzf = r5
            r11.zzd = r4
            goto L65
        Lcb:
            return r4
        Lcc:
            long r0 = r11.zzf
            int r13 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r13 != 0) goto Ld6
            r11.zzf(r12)
            return r7
        Ld6:
            com.google.android.gms.internal.ads.zzer r13 = r11.zza
            long r0 = r13.zzb(r0)
            long r2 = r11.zzg
            long r2 = r13.zzc(r2)
            long r2 = r2 - r0
            r11.zzh = r2
            r11.zzf(r12)
            return r7
    }

    public final long zzb() {
            r2 = this;
            long r0 = r2.zzh
            return r0
    }

    public final com.google.android.gms.internal.ads.zzer zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzer r0 = r1.zza
            return r0
    }

    public final boolean zze() {
            r1 = this;
            boolean r0 = r1.zzc
            return r0
    }
}
