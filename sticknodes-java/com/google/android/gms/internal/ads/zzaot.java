package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaot implements com.google.android.gms.internal.ads.zzaos {
    private final com.google.android.gms.internal.ads.zzade zza;
    private final com.google.android.gms.internal.ads.zzaeh zzb;
    private final com.google.android.gms.internal.ads.zzaov zzc;
    private final com.google.android.gms.internal.ads.zzaf zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaot(com.google.android.gms.internal.ads.zzade r2, com.google.android.gms.internal.ads.zzaeh r3, com.google.android.gms.internal.ads.zzaov r4, java.lang.String r5, int r6) throws com.google.android.gms.internal.ads.zzbo {
            r1 = this;
            r1.<init>()
            r1.zza = r2
            r1.zzb = r3
            r1.zzc = r4
            int r2 = r4.zzb
            int r3 = r4.zze
            int r2 = r2 * r3
            int r3 = r4.zzd
            int r2 = r2 / 8
            if (r3 != r2) goto L48
            int r3 = r4.zzc
            int r3 = r3 * r2
            int r0 = r3 * 8
            int r3 = r3 / 10
            int r2 = java.lang.Math.max(r2, r3)
            r1.zze = r2
            com.google.android.gms.internal.ads.zzad r3 = new com.google.android.gms.internal.ads.zzad
            r3.<init>()
            r3.zzZ(r5)
            r3.zzy(r0)
            r3.zzU(r0)
            r3.zzQ(r2)
            int r2 = r4.zzb
            r3.zzz(r2)
            int r2 = r4.zzc
            r3.zzaa(r2)
            r3.zzT(r6)
            com.google.android.gms.internal.ads.zzaf r2 = r3.zzaf()
            r1.zzd = r2
            return
        L48:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Expected block size: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = "; got: "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r3 = 0
            com.google.android.gms.internal.ads.zzbo r2 = com.google.android.gms.internal.ads.zzbo.zza(r2, r3)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzaos
    public final void zza(int r8, long r9) {
            r7 = this;
            long r3 = (long) r8
            com.google.android.gms.internal.ads.zzaoy r8 = new com.google.android.gms.internal.ads.zzaoy
            com.google.android.gms.internal.ads.zzaov r1 = r7.zzc
            r2 = 1
            r0 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r5)
            com.google.android.gms.internal.ads.zzade r9 = r7.zza
            r9.zzO(r8)
            com.google.android.gms.internal.ads.zzaeh r8 = r7.zzb
            com.google.android.gms.internal.ads.zzaf r9 = r7.zzd
            r8.zzl(r9)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaos
    public final void zzb(long r1) {
            r0 = this;
            r0.zzf = r1
            r1 = 0
            r0.zzg = r1
            r1 = 0
            r0.zzh = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaos
    public final boolean zzc(com.google.android.gms.internal.ads.zzadc r19, long r20) throws java.io.IOException {
            r18 = this;
            r0 = r18
            r1 = r20
        L4:
            r3 = 1
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 <= 0) goto L2d
            int r7 = r0.zzg
            int r8 = r0.zze
            if (r7 >= r8) goto L2d
            int r8 = r8 - r7
            long r6 = (long) r8
            long r6 = java.lang.Math.min(r6, r1)
            int r7 = (int) r6
            com.google.android.gms.internal.ads.zzaeh r6 = r0.zzb
            r8 = r19
            int r3 = r6.zzf(r8, r7, r3)
            r6 = -1
            if (r3 != r6) goto L25
            r1 = r4
            goto L4
        L25:
            int r4 = r0.zzg
            int r4 = r4 + r3
            r0.zzg = r4
            long r3 = (long) r3
            long r1 = r1 - r3
            goto L4
        L2d:
            com.google.android.gms.internal.ads.zzaov r1 = r0.zzc
            int r2 = r0.zzg
            int r4 = r1.zzd
            int r2 = r2 / r4
            if (r2 <= 0) goto L5f
            long r7 = r0.zzf
            long r9 = r0.zzh
            r11 = 1000000(0xf4240, double:4.940656E-318)
            int r1 = r1.zzc
            long r13 = (long) r1
            java.math.RoundingMode r15 = java.math.RoundingMode.FLOOR
            long r9 = com.google.android.gms.internal.ads.zzeu.zzt(r9, r11, r13, r15)
            long r12 = r7 + r9
            int r15 = r2 * r4
            int r1 = r0.zzg
            int r1 = r1 - r15
            com.google.android.gms.internal.ads.zzaeh r11 = r0.zzb
            r14 = 1
            r17 = 0
            r16 = r1
            r11.zzs(r12, r14, r15, r16, r17)
            long r4 = r0.zzh
            long r7 = (long) r2
            long r4 = r4 + r7
            r0.zzh = r4
            r0.zzg = r1
        L5f:
            if (r6 > 0) goto L62
            return r3
        L62:
            r1 = 0
            return r1
    }
}
