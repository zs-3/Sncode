package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaoe implements com.google.android.gms.internal.ads.zzacl {
    private final com.google.android.gms.internal.ads.zzer zza;
    private final com.google.android.gms.internal.ads.zzek zzb;
    private final int zzc;

    public zzaoe(int r1, com.google.android.gms.internal.ads.zzer r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            r0.zza = r2
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
            r5 = 112800(0x1b8a0, double:5.57306E-319)
            long r3 = java.lang.Math.min(r5, r3)
            int r4 = (int) r3
            com.google.android.gms.internal.ads.zzek r3 = r0.zzb
            r3.zzI(r4)
            com.google.android.gms.internal.ads.zzek r3 = r0.zzb
            byte[] r3 = r3.zzN()
            r5 = 0
            r6 = r17
            r6.zzh(r3, r5, r4)
            com.google.android.gms.internal.ads.zzek r3 = r0.zzb
            int r4 = r3.zze()
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = -1
            r11 = r5
            r9 = r7
        L33:
            int r13 = r3.zzb()
            r14 = 188(0xbc, float:2.63E-43)
            if (r13 < r14) goto L7e
            byte[] r13 = r3.zzN()
            int r14 = r3.zzd()
            int r13 = com.google.android.gms.internal.ads.zzaop.zza(r13, r14, r4)
            int r14 = r13 + 188
            if (r14 <= r4) goto L4c
            goto L7e
        L4c:
            int r7 = r0.zzc
            long r7 = com.google.android.gms.internal.ads.zzaop.zzb(r3, r13, r7)
            int r15 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r15 == 0) goto L79
            com.google.android.gms.internal.ads.zzer r15 = r0.zza
            long r7 = r15.zzb(r7)
            int r15 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r15 <= 0) goto L69
            int r3 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r3 != 0) goto L72
            com.google.android.gms.internal.ads.zzack r1 = com.google.android.gms.internal.ads.zzack.zzd(r7, r1)
            goto L8a
        L69:
            long r9 = (long) r13
            r11 = 100000(0x186a0, double:4.94066E-319)
            long r11 = r11 + r7
            int r13 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r13 <= 0) goto L78
        L72:
            long r1 = r1 + r9
            com.google.android.gms.internal.ads.zzack r1 = com.google.android.gms.internal.ads.zzack.zze(r1)
            goto L8a
        L78:
            r11 = r7
        L79:
            r3.zzL(r14)
            long r7 = (long) r14
            goto L33
        L7e:
            int r3 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r3 == 0) goto L88
            long r1 = r1 + r7
            com.google.android.gms.internal.ads.zzack r1 = com.google.android.gms.internal.ads.zzack.zzf(r11, r1)
            goto L8a
        L88:
            com.google.android.gms.internal.ads.zzack r1 = com.google.android.gms.internal.ads.zzack.zza
        L8a:
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
