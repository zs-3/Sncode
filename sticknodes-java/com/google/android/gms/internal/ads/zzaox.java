package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaox {
    public static android.util.Pair zza(com.google.android.gms.internal.ads.zzadc r3) throws java.io.IOException {
            r3.zzj()
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r1 = 8
            r0.<init>(r1)
            r2 = 1684108385(0x64617461, float:1.6635614E22)
            com.google.android.gms.internal.ads.zzaow r0 = zzd(r2, r3, r0)
            r3.zzk(r1)
            long r1 = r3.zzf()
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            long r0 = r0.zzb
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            android.util.Pair r3 = android.util.Pair.create(r3, r0)
            return r3
    }

    public static com.google.android.gms.internal.ads.zzaov zzb(com.google.android.gms.internal.ads.zzadc r14) throws java.io.IOException {
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r1 = 16
            r0.<init>(r1)
            r2 = 1718449184(0x666d7420, float:2.8033575E23)
            com.google.android.gms.internal.ads.zzaow r2 = zzd(r2, r14, r0)
            long r3 = r2.zzb
            r5 = 0
            r6 = 16
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 < 0) goto L19
            r3 = 1
            goto L1a
        L19:
            r3 = 0
        L1a:
            com.google.android.gms.internal.ads.zzdi.zzf(r3)
            byte[] r3 = r0.zzN()
            r14.zzh(r3, r5, r1)
            r0.zzL(r5)
            int r7 = r0.zzk()
            int r8 = r0.zzk()
            int r9 = r0.zzj()
            int r10 = r0.zzj()
            int r11 = r0.zzk()
            int r12 = r0.zzk()
            long r0 = r2.zzb
            int r1 = (int) r0
            int r1 = r1 + (-16)
            if (r1 <= 0) goto L4c
            byte[] r0 = new byte[r1]
            r14.zzh(r0, r5, r1)
            goto L4e
        L4c:
            byte[] r0 = com.google.android.gms.internal.ads.zzeu.zzf
        L4e:
            r13 = r0
            long r0 = r14.zze()
            long r2 = r14.zzf()
            long r0 = r0 - r2
            int r1 = (int) r0
            r14.zzk(r1)
            com.google.android.gms.internal.ads.zzaov r14 = new com.google.android.gms.internal.ads.zzaov
            r6 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return r14
    }

    public static boolean zzc(com.google.android.gms.internal.ads.zzadc r4) throws java.io.IOException {
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r1 = 8
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzaow r1 = com.google.android.gms.internal.ads.zzaow.zza(r4, r0)
            int r1 = r1.zza
            r2 = 0
            r3 = 1380533830(0x52494646, float:2.16116855E11)
            if (r1 == r3) goto L1a
            r3 = 1380333108(0x52463634, float:2.12828226E11)
            if (r1 != r3) goto L19
            goto L1a
        L19:
            return r2
        L1a:
            byte[] r1 = r0.zzN()
            r3 = 4
            r4.zzh(r1, r2, r3)
            r0.zzL(r2)
            int r4 = r0.zzg()
            r0 = 1463899717(0x57415645, float:2.12576269E14)
            if (r4 == r0) goto L45
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported form type: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "WavHeaderReader"
            com.google.android.gms.internal.ads.zzea.zzc(r0, r4)
            return r2
        L45:
            r4 = 1
            return r4
    }

    private static com.google.android.gms.internal.ads.zzaow zzd(int r10, com.google.android.gms.internal.ads.zzadc r11, com.google.android.gms.internal.ads.zzek r12) throws java.io.IOException {
            com.google.android.gms.internal.ads.zzaow r0 = com.google.android.gms.internal.ads.zzaow.zza(r11, r12)
        L4:
            int r1 = r0.zza
            if (r1 == r10) goto L56
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Ignoring unknown WAV chunk: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "WavHeaderReader"
            com.google.android.gms.internal.ads.zzea.zzf(r2, r1)
            long r1 = r0.zzb
            r3 = 1
            long r5 = r1 & r3
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r5 = 8
            long r1 = r1 + r5
            if (r9 == 0) goto L2e
            long r1 = r1 + r3
        L2e:
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L3e
            int r0 = (int) r1
            r11.zzk(r0)
            com.google.android.gms.internal.ads.zzaow r0 = com.google.android.gms.internal.ads.zzaow.zza(r11, r12)
            goto L4
        L3e:
            int r10 = r0.zza
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Chunk is too large (~2GB+) to skip; id: "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.google.android.gms.internal.ads.zzbo r10 = com.google.android.gms.internal.ads.zzbo.zzc(r10)
            throw r10
        L56:
            return r0
    }
}
