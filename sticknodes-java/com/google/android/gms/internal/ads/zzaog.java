package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaog {
    private final com.google.android.gms.internal.ads.zzer zza;
    private final com.google.android.gms.internal.ads.zzek zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private long zzf;
    private long zzg;
    private long zzh;

    zzaog(int r3) {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.ads.zzer r3 = new com.google.android.gms.internal.ads.zzer
            r0 = 0
            r3.<init>(r0)
            r2.zza = r3
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.zzf = r0
            r2.zzg = r0
            r2.zzh = r0
            com.google.android.gms.internal.ads.zzek r3 = new com.google.android.gms.internal.ads.zzek
            r3.<init>()
            r2.zzb = r3
            return
    }

    private final int zze(com.google.android.gms.internal.ads.zzadc r4) {
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

    public final int zza(com.google.android.gms.internal.ads.zzadc r12, com.google.android.gms.internal.ads.zzadx r13, int r14) throws java.io.IOException {
            r11 = this;
            r0 = 0
            if (r14 > 0) goto L7
            r11.zze(r12)
            return r0
        L7:
            boolean r1 = r11.zze
            r2 = 71
            r3 = 112800(0x1b8a0, double:5.57306E-319)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 1
            if (r1 != 0) goto L7c
            long r8 = r12.zzd()
            long r3 = java.lang.Math.min(r3, r8)
            int r1 = (int) r3
            long r3 = (long) r1
            long r8 = r8 - r3
            long r3 = r12.zzf()
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 == 0) goto L2e
            r13.zza = r8
        L2b:
            r0 = 1
            goto Ld7
        L2e:
            com.google.android.gms.internal.ads.zzek r13 = r11.zzb
            r13.zzI(r1)
            r12.zzj()
            com.google.android.gms.internal.ads.zzek r13 = r11.zzb
            byte[] r13 = r13.zzN()
            r12.zzh(r13, r0, r1)
            com.google.android.gms.internal.ads.zzek r12 = r11.zzb
            int r13 = r12.zzd()
            int r1 = r12.zze()
            int r3 = r1 + (-188)
        L4b:
            if (r3 < r13) goto L77
            byte[] r4 = r12.zzN()
            r8 = -4
            r9 = 0
        L53:
            r10 = 4
            if (r8 > r10) goto L74
            int r10 = r8 * 188
            int r10 = r10 + r3
            if (r10 < r13) goto L70
            if (r10 >= r1) goto L70
            r10 = r4[r10]
            if (r10 == r2) goto L62
            goto L70
        L62:
            int r9 = r9 + r7
            r10 = 5
            if (r9 != r10) goto L71
            long r8 = com.google.android.gms.internal.ads.zzaop.zzb(r12, r3, r14)
            int r4 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r4 == 0) goto L74
            r5 = r8
            goto L77
        L70:
            r9 = 0
        L71:
            int r8 = r8 + 1
            goto L53
        L74:
            int r3 = r3 + (-1)
            goto L4b
        L77:
            r11.zzg = r5
            r11.zze = r7
            goto Ld7
        L7c:
            long r8 = r11.zzg
            int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r1 != 0) goto L86
            r11.zze(r12)
            return r0
        L86:
            boolean r1 = r11.zzd
            if (r1 != 0) goto Ld8
            long r8 = r12.zzd()
            long r3 = java.lang.Math.min(r3, r8)
            int r1 = (int) r3
            long r3 = r12.zzf()
            r8 = 0
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 == 0) goto La0
            r13.zza = r8
            goto L2b
        La0:
            com.google.android.gms.internal.ads.zzek r13 = r11.zzb
            r13.zzI(r1)
            r12.zzj()
            com.google.android.gms.internal.ads.zzek r13 = r11.zzb
            byte[] r13 = r13.zzN()
            r12.zzh(r13, r0, r1)
            com.google.android.gms.internal.ads.zzek r12 = r11.zzb
            int r13 = r12.zzd()
            int r1 = r12.zze()
        Lbb:
            if (r13 >= r1) goto Ld3
            byte[] r3 = r12.zzN()
            r3 = r3[r13]
            if (r3 == r2) goto Lc6
            goto Ld0
        Lc6:
            long r3 = com.google.android.gms.internal.ads.zzaop.zzb(r12, r13, r14)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto Ld0
            r5 = r3
            goto Ld3
        Ld0:
            int r13 = r13 + 1
            goto Lbb
        Ld3:
            r11.zzf = r5
            r11.zzd = r7
        Ld7:
            return r0
        Ld8:
            long r13 = r11.zzf
            int r1 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r1 != 0) goto Le2
            r11.zze(r12)
            return r0
        Le2:
            com.google.android.gms.internal.ads.zzer r1 = r11.zza
            long r13 = r1.zzb(r13)
            long r2 = r11.zzg
            long r1 = r1.zzc(r2)
            long r1 = r1 - r13
            r11.zzh = r1
            r11.zze(r12)
            return r0
    }

    public final long zzb() {
            r2 = this;
            long r0 = r2.zzh
            return r0
    }

    public final com.google.android.gms.internal.ads.zzer zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzer r0 = r1.zza
            return r0
    }

    public final boolean zzd() {
            r1 = this;
            boolean r0 = r1.zzc
            return r0
    }
}
