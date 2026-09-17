package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzafm extends com.google.android.gms.internal.ads.zzafl {
    private final com.google.android.gms.internal.ads.zzek zzb;
    private final com.google.android.gms.internal.ads.zzek zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzafm(com.google.android.gms.internal.ads.zzaeh r2) {
            r1 = this;
            r1.<init>(r2)
            com.google.android.gms.internal.ads.zzek r2 = new com.google.android.gms.internal.ads.zzek
            byte[] r0 = com.google.android.gms.internal.ads.zzfs.zza
            r2.<init>(r0)
            r1.zzb = r2
            com.google.android.gms.internal.ads.zzek r2 = new com.google.android.gms.internal.ads.zzek
            r0 = 4
            r2.<init>(r0)
            r1.zzc = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    protected final boolean zza(com.google.android.gms.internal.ads.zzek r4) throws com.google.android.gms.internal.ads.zzafk {
            r3 = this;
            int r4 = r4.zzm()
            int r0 = r4 >> 4
            r4 = r4 & 15
            r1 = 7
            if (r4 != r1) goto L14
            r3.zzg = r0
            r4 = 5
            if (r0 == r4) goto L12
            r4 = 1
            return r4
        L12:
            r4 = 0
            return r4
        L14:
            com.google.android.gms.internal.ads.zzafk r0 = new com.google.android.gms.internal.ads.zzafk
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Video format not supported: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    protected final boolean zzb(com.google.android.gms.internal.ads.zzek r16, long r17) throws com.google.android.gms.internal.ads.zzbo {
            r15 = this;
            r0 = r15
            r1 = r16
            int r2 = r16.zzm()
            int r3 = r16.zzh()
            long r3 = (long) r3
            r5 = 1
            r6 = 0
            if (r2 != 0) goto L61
            boolean r2 = r0.zze
            if (r2 != 0) goto Lcb
            com.google.android.gms.internal.ads.zzek r2 = new com.google.android.gms.internal.ads.zzek
            int r3 = r16.zzb()
            byte[] r3 = new byte[r3]
            r2.<init>(r3)
            byte[] r3 = r2.zzN()
            int r4 = r16.zzb()
            r1.zzH(r3, r6, r4)
            com.google.android.gms.internal.ads.zzacf r1 = com.google.android.gms.internal.ads.zzacf.zza(r2)
            int r2 = r1.zzb
            r0.zzd = r2
            com.google.android.gms.internal.ads.zzad r2 = new com.google.android.gms.internal.ads.zzad
            r2.<init>()
            java.lang.String r3 = "video/avc"
            r2.zzZ(r3)
            java.lang.String r3 = r1.zzl
            r2.zzA(r3)
            int r3 = r1.zzc
            r2.zzae(r3)
            int r3 = r1.zzd
            r2.zzJ(r3)
            float r3 = r1.zzk
            r2.zzV(r3)
            java.util.List r1 = r1.zza
            r2.zzM(r1)
            com.google.android.gms.internal.ads.zzaf r1 = r2.zzaf()
            com.google.android.gms.internal.ads.zzaeh r2 = r0.zza
            r2.zzl(r1)
            r0.zze = r5
            return r6
        L61:
            if (r2 != r5) goto Lcb
            boolean r2 = r0.zze
            if (r2 == 0) goto Lcb
            int r2 = r0.zzg
            if (r2 != r5) goto L6d
            r2 = 1
            goto L6e
        L6d:
            r2 = 0
        L6e:
            boolean r7 = r0.zzf
            if (r7 != 0) goto L76
            if (r2 == 0) goto Lcb
            r11 = 1
            goto L77
        L76:
            r11 = r2
        L77:
            com.google.android.gms.internal.ads.zzek r2 = r0.zzc
            byte[] r2 = r2.zzN()
            r2[r6] = r6
            r2[r5] = r6
            r7 = 2
            r2[r7] = r6
            int r2 = r0.zzd
            r7 = 4
            int r2 = 4 - r2
            r12 = 0
        L8a:
            int r8 = r16.zzb()
            if (r8 <= 0) goto Lbb
            com.google.android.gms.internal.ads.zzek r8 = r0.zzc
            byte[] r8 = r8.zzN()
            int r9 = r0.zzd
            r1.zzH(r8, r2, r9)
            com.google.android.gms.internal.ads.zzek r8 = r0.zzc
            r8.zzL(r6)
            com.google.android.gms.internal.ads.zzek r8 = r0.zzc
            com.google.android.gms.internal.ads.zzek r9 = r0.zzb
            int r8 = r8.zzp()
            r9.zzL(r6)
            com.google.android.gms.internal.ads.zzaeh r9 = r0.zza
            com.google.android.gms.internal.ads.zzek r10 = r0.zzb
            r9.zzq(r10, r7)
            int r12 = r12 + 4
            com.google.android.gms.internal.ads.zzaeh r9 = r0.zza
            r9.zzq(r1, r8)
            int r12 = r12 + r8
            goto L8a
        Lbb:
            r1 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r1
            long r9 = r17 + r3
            com.google.android.gms.internal.ads.zzaeh r8 = r0.zza
            r13 = 0
            r14 = 0
            r8.zzs(r9, r11, r12, r13, r14)
            r0.zzf = r5
            return r5
        Lcb:
            return r6
    }
}
