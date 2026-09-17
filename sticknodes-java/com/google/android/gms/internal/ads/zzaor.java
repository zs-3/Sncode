package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaor implements com.google.android.gms.internal.ads.zzaos {
    private static final int[] zza = null;
    private static final int[] zzb = null;
    private final com.google.android.gms.internal.ads.zzade zzc;
    private final com.google.android.gms.internal.ads.zzaeh zzd;
    private final com.google.android.gms.internal.ads.zzaov zze;
    private final int zzf;
    private final byte[] zzg;
    private final com.google.android.gms.internal.ads.zzek zzh;
    private final int zzi;
    private final com.google.android.gms.internal.ads.zzaf zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    static {
            r0 = 16
            int[] r0 = new int[r0]
            r0 = {x0014: FILL_ARRAY_DATA , data: [-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8} // fill-array
            com.google.android.gms.internal.ads.zzaor.zza = r0
            r0 = 89
            int[] r0 = new int[r0]
            r0 = {x0038: FILL_ARRAY_DATA , data: [7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767} // fill-array
            com.google.android.gms.internal.ads.zzaor.zzb = r0
            return
    }

    public zzaor(com.google.android.gms.internal.ads.zzade r6, com.google.android.gms.internal.ads.zzaeh r7, com.google.android.gms.internal.ads.zzaov r8) throws com.google.android.gms.internal.ads.zzbo {
            r5 = this;
            r5.<init>()
            r5.zzc = r6
            r5.zzd = r7
            r5.zze = r8
            int r6 = r8.zzc
            int r6 = r6 / 10
            r7 = 1
            int r6 = java.lang.Math.max(r7, r6)
            r5.zzi = r6
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            byte[] r1 = r8.zzf
            r0.<init>(r1)
            r0.zzk()
            int r0 = r0.zzk()
            r5.zzf = r0
            int r1 = r8.zzb
            int r2 = r1 * 4
            int r3 = r8.zzd
            int r2 = r3 - r2
            int r4 = r8.zze
            int r4 = r4 * r1
            int r2 = r2 * 8
            int r2 = r2 / r4
            int r2 = r2 + r7
            if (r0 != r2) goto L84
            int r7 = com.google.android.gms.internal.ads.zzeu.zza
            int r7 = r6 + r0
            int r7 = r7 + (-1)
            int r7 = r7 / r0
            int r3 = r3 * r7
            byte[] r2 = new byte[r3]
            r5.zzg = r2
            com.google.android.gms.internal.ads.zzek r2 = new com.google.android.gms.internal.ads.zzek
            int r3 = r0 + r0
            int r3 = r3 * r1
            int r7 = r7 * r3
            r2.<init>(r7)
            r5.zzh = r2
            int r7 = r8.zzc
            int r2 = r8.zzd
            int r7 = r7 * r2
            int r7 = r7 * 8
            int r7 = r7 / r0
            com.google.android.gms.internal.ads.zzad r0 = new com.google.android.gms.internal.ads.zzad
            r0.<init>()
            java.lang.String r2 = "audio/raw"
            r0.zzZ(r2)
            r0.zzy(r7)
            r0.zzU(r7)
            int r6 = r6 + r6
            int r6 = r6 * r1
            r0.zzQ(r6)
            int r6 = r8.zzb
            r0.zzz(r6)
            int r6 = r8.zzc
            r0.zzaa(r6)
            r6 = 2
            r0.zzT(r6)
            com.google.android.gms.internal.ads.zzaf r6 = r0.zzaf()
            r5.zzj = r6
            return
        L84:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Expected frames per block: "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = "; got: "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r7 = 0
            com.google.android.gms.internal.ads.zzbo r6 = com.google.android.gms.internal.ads.zzbo.zza(r6, r7)
            throw r6
    }

    private final int zzd(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzaov r0 = r1.zze
            int r0 = r0.zzb
            int r0 = r0 + r0
            int r2 = r2 / r0
            return r2
    }

    private final int zze(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzaov r0 = r1.zze
            int r2 = r2 + r2
            int r0 = r0.zzb
            int r2 = r2 * r0
            return r2
    }

    private final void zzf(int r19) {
            r18 = this;
            r0 = r18
            com.google.android.gms.internal.ads.zzaov r1 = r0.zze
            int r1 = r1.zzc
            long r6 = (long) r1
            java.math.RoundingMode r8 = java.math.RoundingMode.FLOOR
            long r9 = r0.zzl
            long r2 = r0.zzn
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = com.google.android.gms.internal.ads.zzeu.zzt(r2, r4, r6, r8)
            long r12 = r9 + r1
            int r1 = r18.zze(r19)
            int r2 = r0.zzm
            int r16 = r2 - r1
            com.google.android.gms.internal.ads.zzaeh r11 = r0.zzd
            r14 = 1
            r17 = 0
            r15 = r1
            r11.zzs(r12, r14, r15, r16, r17)
            long r2 = r0.zzn
            r4 = r19
            long r4 = (long) r4
            long r2 = r2 + r4
            r0.zzn = r2
            int r2 = r0.zzm
            int r2 = r2 - r1
            r0.zzm = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaos
    public final void zza(int r9, long r10) {
            r8 = this;
            com.google.android.gms.internal.ads.zzaoy r7 = new com.google.android.gms.internal.ads.zzaoy
            com.google.android.gms.internal.ads.zzaov r1 = r8.zze
            int r2 = r8.zzf
            long r3 = (long) r9
            r0 = r7
            r5 = r10
            r0.<init>(r1, r2, r3, r5)
            com.google.android.gms.internal.ads.zzade r9 = r8.zzc
            r9.zzO(r7)
            com.google.android.gms.internal.ads.zzaeh r9 = r8.zzd
            com.google.android.gms.internal.ads.zzaf r10 = r8.zzj
            r9.zzl(r10)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaos
    public final void zzb(long r2) {
            r1 = this;
            r0 = 0
            r1.zzk = r0
            r1.zzl = r2
            r1.zzm = r0
            r2 = 0
            r1.zzn = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaos
    public final boolean zzc(com.google.android.gms.internal.ads.zzadc r21, long r22) throws java.io.IOException {
            r20 = this;
            r0 = r20
            r1 = r22
            int r3 = r0.zzm
            int r3 = r0.zzd(r3)
            int r4 = r0.zzi
            int r4 = r4 - r3
            int r3 = com.google.android.gms.internal.ads.zzeu.zza
            int r3 = r0.zzf
            int r4 = r4 + r3
            r5 = -1
            int r4 = r4 + r5
            int r4 = r4 / r3
            com.google.android.gms.internal.ads.zzaov r3 = r0.zze
            int r3 = r3.zzd
            int r4 = r4 * r3
            r7 = 0
            int r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r9 != 0) goto L23
        L21:
            r7 = 1
            goto L24
        L23:
            r7 = 0
        L24:
            if (r7 != 0) goto L45
            int r8 = r0.zzk
            if (r8 >= r4) goto L45
            int r8 = r4 - r8
            long r8 = (long) r8
            long r8 = java.lang.Math.min(r8, r1)
            int r9 = (int) r8
            byte[] r8 = r0.zzg
            int r10 = r0.zzk
            r11 = r21
            int r8 = r11.zza(r8, r10, r9)
            if (r8 != r5) goto L3f
            goto L21
        L3f:
            int r9 = r0.zzk
            int r9 = r9 + r8
            r0.zzk = r9
            goto L24
        L45:
            int r1 = r0.zzk
            com.google.android.gms.internal.ads.zzaov r2 = r0.zze
            int r2 = r2.zzd
            int r1 = r1 / r2
            if (r1 <= 0) goto L150
            byte[] r2 = r0.zzg
            com.google.android.gms.internal.ads.zzek r4 = r0.zzh
            r5 = 0
        L53:
            if (r5 >= r1) goto L11b
            r8 = 0
        L56:
            com.google.android.gms.internal.ads.zzaov r9 = r0.zze
            int r10 = r9.zzb
            if (r8 >= r10) goto L113
            byte[] r11 = r4.zzN()
            int r9 = r9.zzd
            int r12 = r5 * r9
            int r9 = r9 / r10
            int r9 = r9 + (-4)
            int r13 = r8 * 4
            int r12 = r12 + r13
            int r13 = r12 + 1
            r13 = r2[r13]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r14 = r2[r12]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r15 = r12 + 2
            r15 = r2[r15]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r3 = 88
            int r15 = java.lang.Math.min(r15, r3)
            int[] r16 = com.google.android.gms.internal.ads.zzaor.zzb
            r16 = r16[r15]
            int r3 = r0.zzf
            int r3 = r3 * r5
            int r3 = r3 * r10
            int r3 = r3 + r8
            int r13 = r13 << 8
            r13 = r13 | r14
            short r13 = (short) r13
            r14 = r13 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r3
            byte r14 = (byte) r14
            r11[r3] = r14
            int r14 = r3 + 1
            int r6 = r13 >> 8
            byte r6 = (byte) r6
            r11[r14] = r6
            r6 = 0
        L9d:
            int r14 = r9 + r9
            if (r6 >= r14) goto L10b
            int r14 = r10 * 4
            int r14 = r14 + r12
            int r18 = r6 / 8
            int r19 = r6 / 2
            int r19 = r19 % 4
            int r18 = r18 * r10
            int r18 = r18 * 4
            int r14 = r14 + r18
            int r14 = r14 + r19
            r14 = r2[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r18 = r6 % 2
            if (r18 != 0) goto Lbd
            r14 = r14 & 15
            goto Lbf
        Lbd:
            int r14 = r14 >> 4
        Lbf:
            r18 = r14 & 7
            int r18 = r18 + r18
            r17 = 1
            int r18 = r18 + 1
            int r18 = r18 * r16
            r16 = r14 & 8
            r19 = r2
            int r2 = r18 >> 3
            if (r16 == 0) goto Ld2
            int r2 = -r2
        Ld2:
            r22 = r9
            r9 = -32768(0xffffffffffff8000, float:NaN)
            int r13 = r13 + r2
            r2 = 32767(0x7fff, float:4.5916E-41)
            int r2 = java.lang.Math.min(r13, r2)
            int r13 = java.lang.Math.max(r9, r2)
            int r2 = r10 + r10
            int r3 = r3 + r2
            r2 = r13 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r11[r3] = r2
            int r2 = r3 + 1
            int r9 = r13 >> 8
            byte r9 = (byte) r9
            r11[r2] = r9
            int[] r2 = com.google.android.gms.internal.ads.zzaor.zza
            r2 = r2[r14]
            int r15 = r15 + r2
            r2 = 88
            int r9 = java.lang.Math.min(r15, r2)
            r14 = 0
            int r15 = java.lang.Math.max(r14, r9)
            int[] r9 = com.google.android.gms.internal.ads.zzaor.zzb
            r16 = r9[r15]
            int r6 = r6 + 1
            r9 = r22
            r2 = r19
            goto L9d
        L10b:
            r19 = r2
            r17 = 1
            int r8 = r8 + 1
            goto L56
        L113:
            r19 = r2
            r17 = 1
            int r5 = r5 + 1
            goto L53
        L11b:
            int r2 = r0.zzf
            int r2 = r2 * r1
            int r2 = r0.zze(r2)
            r3 = 0
            r4.zzL(r3)
            r4.zzK(r2)
            int r2 = r0.zzk
            com.google.android.gms.internal.ads.zzaov r3 = r0.zze
            int r3 = r3.zzd
            int r1 = r1 * r3
            int r2 = r2 - r1
            r0.zzk = r2
            com.google.android.gms.internal.ads.zzek r1 = r0.zzh
            com.google.android.gms.internal.ads.zzaeh r2 = r0.zzd
            int r3 = r1.zze()
            r2.zzq(r1, r3)
            int r1 = r0.zzm
            int r1 = r1 + r3
            r0.zzm = r1
            int r1 = r0.zzd(r1)
            int r2 = r0.zzi
            if (r1 < r2) goto L150
            r0.zzf(r2)
        L150:
            if (r7 == 0) goto L15d
            int r1 = r0.zzm
            int r1 = r0.zzd(r1)
            if (r1 <= 0) goto L15d
            r0.zzf(r1)
        L15d:
            return r7
    }
}
