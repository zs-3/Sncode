package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzamr implements com.google.android.gms.internal.ads.zzamz {
    private final com.google.android.gms.internal.ads.zzej zza;
    private final com.google.android.gms.internal.ads.zzek zzb;
    private final java.lang.String zzc;
    private final int zzd;
    private java.lang.String zze;
    private com.google.android.gms.internal.ads.zzaeh zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private long zzj;
    private com.google.android.gms.internal.ads.zzaf zzk;
    private int zzl;
    private long zzm;

    public zzamr() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public zzamr(java.lang.String r4, int r5) {
            r3 = this;
            r3.<init>()
            com.google.android.gms.internal.ads.zzej r0 = new com.google.android.gms.internal.ads.zzej
            r1 = 128(0x80, float:1.794E-43)
            byte[] r2 = new byte[r1]
            r0.<init>(r2, r1)
            r3.zza = r0
            com.google.android.gms.internal.ads.zzek r1 = new com.google.android.gms.internal.ads.zzek
            byte[] r0 = r0.zza
            r1.<init>(r0)
            r3.zzb = r1
            r0 = 0
            r3.zzg = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.zzm = r0
            r3.zzc = r4
            r3.zzd = r5
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(com.google.android.gms.internal.ads.zzek r12) {
            r11 = this;
            com.google.android.gms.internal.ads.zzaeh r0 = r11.zzf
            com.google.android.gms.internal.ads.zzdi.zzb(r0)
        L5:
            int r0 = r12.zzb()
            if (r0 <= 0) goto L13e
            int r0 = r11.zzg
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L100
            if (r0 == r2) goto L55
            int r0 = r12.zzb()
            int r1 = r11.zzl
            int r4 = r11.zzh
            int r1 = r1 - r4
            int r0 = java.lang.Math.min(r0, r1)
            com.google.android.gms.internal.ads.zzaeh r1 = r11.zzf
            r1.zzq(r12, r0)
            int r1 = r11.zzh
            int r1 = r1 + r0
            r11.zzh = r1
            int r0 = r11.zzl
            if (r1 != r0) goto L5
            long r0 = r11.zzm
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L3b
            goto L3c
        L3b:
            r2 = 0
        L3c:
            com.google.android.gms.internal.ads.zzdi.zzf(r2)
            com.google.android.gms.internal.ads.zzaeh r4 = r11.zzf
            long r5 = r11.zzm
            r7 = 1
            int r8 = r11.zzl
            r9 = 0
            r10 = 0
            r4.zzs(r5, r7, r8, r9, r10)
            long r0 = r11.zzm
            long r4 = r11.zzj
            long r0 = r0 + r4
            r11.zzm = r0
            r11.zzg = r3
            goto L5
        L55:
            com.google.android.gms.internal.ads.zzek r0 = r11.zzb
            byte[] r0 = r0.zzN()
            int r2 = r12.zzb()
            int r4 = r11.zzh
            r5 = 128(0x80, float:1.794E-43)
            int r4 = 128 - r4
            int r2 = java.lang.Math.min(r2, r4)
            int r4 = r11.zzh
            r12.zzH(r0, r4, r2)
            int r0 = r11.zzh
            int r0 = r0 + r2
            r11.zzh = r0
            if (r0 != r5) goto L5
            com.google.android.gms.internal.ads.zzej r0 = r11.zza
            r0.zzl(r3)
            com.google.android.gms.internal.ads.zzej r0 = r11.zza
            com.google.android.gms.internal.ads.zzaca r0 = com.google.android.gms.internal.ads.zzacb.zze(r0)
            com.google.android.gms.internal.ads.zzaf r2 = r11.zzk
            if (r2 == 0) goto L9a
            int r4 = r0.zzc
            int r6 = r2.zzB
            if (r4 != r6) goto L9a
            int r4 = r0.zzb
            int r6 = r2.zzC
            if (r4 != r6) goto L9a
            java.lang.String r4 = r0.zza
            java.lang.String r2 = r2.zzn
            boolean r2 = java.util.Objects.equals(r4, r2)
            if (r2 != 0) goto Ldc
        L9a:
            com.google.android.gms.internal.ads.zzad r2 = new com.google.android.gms.internal.ads.zzad
            r2.<init>()
            java.lang.String r4 = r11.zze
            r2.zzL(r4)
            java.lang.String r4 = r0.zza
            r2.zzZ(r4)
            int r4 = r0.zzc
            r2.zzz(r4)
            int r4 = r0.zzb
            r2.zzaa(r4)
            java.lang.String r4 = r11.zzc
            r2.zzP(r4)
            int r4 = r11.zzd
            r2.zzX(r4)
            int r4 = r0.zzf
            r2.zzU(r4)
            java.lang.String r4 = r0.zza
            java.lang.String r6 = "audio/ac3"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto Ld1
            int r4 = r0.zzf
            r2.zzy(r4)
        Ld1:
            com.google.android.gms.internal.ads.zzaf r2 = r2.zzaf()
            r11.zzk = r2
            com.google.android.gms.internal.ads.zzaeh r4 = r11.zzf
            r4.zzl(r2)
        Ldc:
            int r2 = r0.zzd
            r11.zzl = r2
            int r0 = r0.zze
            com.google.android.gms.internal.ads.zzaf r2 = r11.zzk
            int r2 = r2.zzC
            long r6 = (long) r0
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 * r8
            long r8 = (long) r2
            long r6 = r6 / r8
            r11.zzj = r6
            com.google.android.gms.internal.ads.zzek r0 = r11.zzb
            r0.zzL(r3)
            com.google.android.gms.internal.ads.zzaeh r0 = r11.zzf
            com.google.android.gms.internal.ads.zzek r2 = r11.zzb
            r0.zzq(r2, r5)
            r11.zzg = r1
            goto L5
        L100:
            int r0 = r12.zzb()
            if (r0 <= 0) goto L5
            boolean r0 = r11.zzi
            r4 = 11
            if (r0 != 0) goto L118
            int r0 = r12.zzm()
            if (r0 != r4) goto L114
            r0 = 1
            goto L115
        L114:
            r0 = 0
        L115:
            r11.zzi = r0
            goto L100
        L118:
            int r0 = r12.zzm()
            r5 = 119(0x77, float:1.67E-43)
            if (r0 != r5) goto L136
            r11.zzi = r3
            r11.zzg = r2
            com.google.android.gms.internal.ads.zzek r0 = r11.zzb
            byte[] r6 = r0.zzN()
            r6[r3] = r4
            byte[] r0 = r0.zzN()
            r0[r2] = r5
            r11.zzh = r1
            goto L5
        L136:
            if (r0 != r4) goto L13a
            r0 = 1
            goto L13b
        L13a:
            r0 = 0
        L13b:
            r11.zzi = r0
            goto L100
        L13e:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(com.google.android.gms.internal.ads.zzade r2, com.google.android.gms.internal.ads.zzaon r3) {
            r1 = this;
            r3.zzc()
            java.lang.String r0 = r3.zzb()
            r1.zze = r0
            int r3 = r3.zza()
            r0 = 1
            com.google.android.gms.internal.ads.zzaeh r2 = r2.zzw(r3, r0)
            r1.zzf = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzd(long r1, int r3) {
            r0 = this;
            r0.zzm = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zze() {
            r2 = this;
            r0 = 0
            r2.zzg = r0
            r2.zzh = r0
            r2.zzi = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.zzm = r0
            return
    }
}
