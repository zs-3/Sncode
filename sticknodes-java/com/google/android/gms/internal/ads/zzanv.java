package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzanv implements com.google.android.gms.internal.ads.zzacl {
    private final com.google.android.gms.internal.ads.zzer zza;
    private final com.google.android.gms.internal.ads.zzek zzb;

    /* synthetic */ zzanv(com.google.android.gms.internal.ads.zzer r1, com.google.android.gms.internal.ads.zzanu r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            com.google.android.gms.internal.ads.zzek r1 = new com.google.android.gms.internal.ads.zzek
            r1.<init>()
            r0.zzb = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final com.google.android.gms.internal.ads.zzack zza(com.google.android.gms.internal.ads.zzadc r17, long r18) throws java.io.IOException {
            r16 = this;
            r0 = r16
            long r1 = r17.zzf()
            long r3 = r17.zzd()
            long r3 = r3 - r1
            r5 = 20000(0x4e20, double:9.8813E-320)
            long r3 = java.lang.Math.min(r5, r3)
            int r4 = (int) r3
            com.google.android.gms.internal.ads.zzek r3 = r0.zzb
            r3.zzI(r4)
            com.google.android.gms.internal.ads.zzek r3 = r0.zzb
            byte[] r3 = r3.zzN()
            r5 = 0
            r6 = r17
            r6.zzh(r3, r5, r4)
            r3 = -1
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r4
            r6 = -1
        L2b:
            com.google.android.gms.internal.ads.zzek r9 = r0.zzb
            int r10 = r9.zzb()
            r11 = 4
            if (r10 < r11) goto L122
            byte[] r10 = r9.zzN()
            int r12 = r9.zzd()
            int r10 = com.google.android.gms.internal.ads.zzanw.zzh(r10, r12)
            r12 = 1
            r13 = 442(0x1ba, float:6.2E-43)
            if (r10 == r13) goto L49
            r9.zzM(r12)
            goto L2b
        L49:
            r9.zzM(r11)
            long r14 = com.google.android.gms.internal.ads.zzanx.zzc(r9)
            int r3 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r3 == 0) goto L84
            com.google.android.gms.internal.ads.zzer r3 = r0.zza
            long r14 = r3.zzb(r14)
            int r3 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r3 <= 0) goto L6a
            int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r3 != 0) goto L68
            com.google.android.gms.internal.ads.zzack r1 = com.google.android.gms.internal.ads.zzack.zzd(r14, r1)
            goto L12f
        L68:
            long r3 = (long) r6
            goto L77
        L6a:
            r6 = 100000(0x186a0, double:4.94066E-319)
            long r6 = r6 + r14
            int r3 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r3 <= 0) goto L7e
            int r3 = r9.zzd()
            long r3 = (long) r3
        L77:
            long r1 = r1 + r3
            com.google.android.gms.internal.ads.zzack r1 = com.google.android.gms.internal.ads.zzack.zze(r1)
            goto L12f
        L7e:
            int r3 = r9.zzd()
            r6 = r3
            r7 = r14
        L84:
            int r3 = r9.zze()
            int r10 = r9.zzb()
            r14 = 10
            if (r10 >= r14) goto L95
            r9.zzL(r3)
            goto L11c
        L95:
            r10 = 9
            r9.zzM(r10)
            int r10 = r9.zzm()
            r10 = r10 & 7
            int r14 = r9.zzb()
            if (r14 >= r10) goto Lab
            r9.zzL(r3)
            goto L11c
        Lab:
            r9.zzM(r10)
            int r10 = r9.zzb()
            if (r10 >= r11) goto Lb8
            r9.zzL(r3)
            goto L11c
        Lb8:
            byte[] r10 = r9.zzN()
            int r14 = r9.zzd()
            int r10 = com.google.android.gms.internal.ads.zzanw.zzh(r10, r14)
            r14 = 443(0x1bb, float:6.21E-43)
            if (r10 == r14) goto Lc9
            goto Ldd
        Lc9:
            r9.zzM(r11)
            int r10 = r9.zzq()
            int r14 = r9.zzb()
            if (r14 >= r10) goto Lda
            r9.zzL(r3)
            goto L11c
        Lda:
            r9.zzM(r10)
        Ldd:
            int r10 = r9.zzb()
            if (r10 < r11) goto L11c
            byte[] r10 = r9.zzN()
            int r14 = r9.zzd()
            int r10 = com.google.android.gms.internal.ads.zzanw.zzh(r10, r14)
            if (r10 == r13) goto L11c
            r14 = 441(0x1b9, float:6.18E-43)
            if (r10 == r14) goto L11c
            int r10 = r10 >>> 8
            if (r10 != r12) goto L11c
            r9.zzM(r11)
            int r10 = r9.zzb()
            r14 = 2
            if (r10 >= r14) goto L107
            r9.zzL(r3)
            goto L11c
        L107:
            int r10 = r9.zzq()
            int r14 = r9.zze()
            int r15 = r9.zzd()
            int r15 = r15 + r10
            int r10 = java.lang.Math.min(r14, r15)
            r9.zzL(r10)
            goto Ldd
        L11c:
            int r3 = r9.zzd()
            goto L2b
        L122:
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 == 0) goto L12d
            long r3 = (long) r3
            long r1 = r1 + r3
            com.google.android.gms.internal.ads.zzack r1 = com.google.android.gms.internal.ads.zzack.zzf(r7, r1)
            goto L12f
        L12d:
            com.google.android.gms.internal.ads.zzack r1 = com.google.android.gms.internal.ads.zzack.zza
        L12f:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final void zzb() {
            r3 = this;
            byte[] r0 = com.google.android.gms.internal.ads.zzeu.zzf
            int r1 = r0.length
            com.google.android.gms.internal.ads.zzek r1 = r3.zzb
            r2 = 0
            r1.zzJ(r0, r2)
            return
    }
}
