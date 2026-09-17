package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzank implements com.google.android.gms.internal.ads.zzamz {
    private final java.lang.String zza;
    private final int zzb;
    private final com.google.android.gms.internal.ads.zzek zzc;
    private final com.google.android.gms.internal.ads.zzej zzd;
    private com.google.android.gms.internal.ads.zzaeh zze;
    private java.lang.String zzf;
    private com.google.android.gms.internal.ads.zzaf zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private int zzu;
    private java.lang.String zzv;

    public zzank(java.lang.String r2, int r3) {
            r1 = this;
            r1.<init>()
            r1.zza = r2
            r1.zzb = r3
            com.google.android.gms.internal.ads.zzek r2 = new com.google.android.gms.internal.ads.zzek
            r3 = 1024(0x400, float:1.435E-42)
            r2.<init>(r3)
            r1.zzc = r2
            com.google.android.gms.internal.ads.zzej r3 = new com.google.android.gms.internal.ads.zzej
            byte[] r2 = r2.zzN()
            int r0 = r2.length
            r3.<init>(r2, r0)
            r1.zzd = r3
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.zzl = r2
            return
    }

    private final int zzf(com.google.android.gms.internal.ads.zzej r4) throws com.google.android.gms.internal.ads.zzbo {
            r3 = this;
            int r0 = r4.zza()
            r1 = 1
            com.google.android.gms.internal.ads.zzabx r1 = com.google.android.gms.internal.ads.zzaby.zzb(r4, r1)
            java.lang.String r2 = r1.zzc
            r3.zzv = r2
            int r2 = r1.zza
            r3.zzs = r2
            int r1 = r1.zzb
            r3.zzu = r1
            int r4 = r4.zza()
            int r0 = r0 - r4
            return r0
    }

    private static long zzg(com.google.android.gms.internal.ads.zzej r2) {
            r0 = 2
            int r0 = r2.zzd(r0)
            int r0 = r0 + 1
            int r0 = r0 * 8
            int r2 = r2.zzd(r0)
            long r0 = (long) r2
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(com.google.android.gms.internal.ads.zzek r15) throws com.google.android.gms.internal.ads.zzbo {
            r14 = this;
            com.google.android.gms.internal.ads.zzaeh r0 = r14.zze
            com.google.android.gms.internal.ads.zzdi.zzb(r0)
        L5:
            int r0 = r15.zzb()
            if (r0 <= 0) goto L224
            int r0 = r14.zzh
            r1 = 86
            r2 = 1
            if (r0 == 0) goto L21a
            r3 = 2
            r4 = 0
            if (r0 == r2) goto L204
            r1 = 3
            r5 = 8
            if (r0 == r3) goto L1da
            int r0 = r15.zzb()
            int r3 = r14.zzj
            int r6 = r14.zzi
            int r3 = r3 - r6
            int r0 = java.lang.Math.min(r0, r3)
            com.google.android.gms.internal.ads.zzej r3 = r14.zzd
            byte[] r3 = r3.zza
            int r6 = r14.zzi
            r15.zzH(r3, r6, r0)
            int r3 = r14.zzi
            int r3 = r3 + r0
            r14.zzi = r3
            int r0 = r14.zzj
            if (r3 != r0) goto L5
            com.google.android.gms.internal.ads.zzej r0 = r14.zzd
            r0.zzl(r4)
            com.google.android.gms.internal.ads.zzej r0 = r14.zzd
            boolean r3 = r0.zzp()
            r6 = 0
            if (r3 != 0) goto L157
            r14.zzm = r2
            int r3 = r0.zzd(r2)
            if (r3 != r2) goto L56
            int r3 = r0.zzd(r2)
            r7 = 1
            goto L58
        L56:
            r7 = r3
            r3 = 0
        L58:
            r14.zzn = r3
            if (r3 != 0) goto L152
            if (r7 != r2) goto L62
            zzg(r0)
            r7 = 1
        L62:
            boolean r3 = r0.zzp()
            if (r3 == 0) goto L14d
            r3 = 6
            int r8 = r0.zzd(r3)
            r14.zzo = r8
            r8 = 4
            int r9 = r0.zzd(r8)
            int r10 = r0.zzd(r1)
            if (r9 != 0) goto L148
            if (r10 != 0) goto L148
            if (r7 != 0) goto Ldd
            int r9 = r0.zzc()
            int r10 = r14.zzf(r0)
            r0.zzl(r9)
            int r9 = r10 + 7
            int r9 = r9 / r5
            byte[] r9 = new byte[r9]
            r0.zzh(r9, r4, r10)
            com.google.android.gms.internal.ads.zzad r10 = new com.google.android.gms.internal.ads.zzad
            r10.<init>()
            java.lang.String r11 = r14.zzf
            r10.zzL(r11)
            java.lang.String r11 = "audio/mp4a-latm"
            r10.zzZ(r11)
            java.lang.String r11 = r14.zzv
            r10.zzA(r11)
            int r11 = r14.zzu
            r10.zzz(r11)
            int r11 = r14.zzs
            r10.zzaa(r11)
            java.util.List r9 = java.util.Collections.singletonList(r9)
            r10.zzM(r9)
            java.lang.String r9 = r14.zza
            r10.zzP(r9)
            int r9 = r14.zzb
            r10.zzX(r9)
            com.google.android.gms.internal.ads.zzaf r9 = r10.zzaf()
            com.google.android.gms.internal.ads.zzaf r10 = r14.zzg
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto Lea
            r14.zzg = r9
            r10 = 1024000000(0x3d090000, double:5.059232213E-315)
            int r12 = r9.zzC
            long r12 = (long) r12
            long r10 = r10 / r12
            r14.zzt = r10
            com.google.android.gms.internal.ads.zzaeh r10 = r14.zze
            r10.zzl(r9)
            goto Lea
        Ldd:
            long r9 = zzg(r0)
            int r10 = (int) r9
            int r9 = r14.zzf(r0)
            int r10 = r10 - r9
            r0.zzn(r10)
        Lea:
            int r9 = r0.zzd(r1)
            r14.zzp = r9
            if (r9 == 0) goto L115
            if (r9 == r2) goto L10f
            if (r9 == r1) goto L10b
            if (r9 == r8) goto L10b
            r1 = 5
            if (r9 == r1) goto L10b
            if (r9 == r3) goto L107
            r1 = 7
            if (r9 != r1) goto L101
            goto L107
        L101:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>()
            throw r15
        L107:
            r0.zzn(r2)
            goto L118
        L10b:
            r0.zzn(r3)
            goto L118
        L10f:
            r1 = 9
            r0.zzn(r1)
            goto L118
        L115:
            r0.zzn(r5)
        L118:
            boolean r1 = r0.zzp()
            r14.zzq = r1
            r8 = 0
            r14.zzr = r8
            if (r1 == 0) goto L13e
            if (r7 == r2) goto L138
        L126:
            boolean r1 = r0.zzp()
            long r7 = r14.zzr
            long r7 = r7 << r5
            int r3 = r0.zzd(r5)
            long r9 = (long) r3
            long r7 = r7 + r9
            r14.zzr = r7
            if (r1 != 0) goto L126
            goto L13e
        L138:
            long r7 = zzg(r0)
            r14.zzr = r7
        L13e:
            boolean r1 = r0.zzp()
            if (r1 == 0) goto L15c
            r0.zzn(r5)
            goto L15c
        L148:
            com.google.android.gms.internal.ads.zzbo r15 = com.google.android.gms.internal.ads.zzbo.zza(r6, r6)
            throw r15
        L14d:
            com.google.android.gms.internal.ads.zzbo r15 = com.google.android.gms.internal.ads.zzbo.zza(r6, r6)
            throw r15
        L152:
            com.google.android.gms.internal.ads.zzbo r15 = com.google.android.gms.internal.ads.zzbo.zza(r6, r6)
            throw r15
        L157:
            boolean r1 = r14.zzm
            if (r1 != 0) goto L15c
            goto L1c5
        L15c:
            int r1 = r14.zzn
            if (r1 != 0) goto L1d5
            int r1 = r14.zzo
            if (r1 != 0) goto L1d0
            int r1 = r14.zzp
            if (r1 != 0) goto L1cb
            r1 = 0
        L169:
            int r3 = r0.zzd(r5)
            int r10 = r1 + r3
            r1 = 255(0xff, float:3.57E-43)
            if (r3 == r1) goto L1c9
            int r1 = r0.zzc()
            r3 = r1 & 7
            if (r3 != 0) goto L183
            com.google.android.gms.internal.ads.zzek r3 = r14.zzc
            int r1 = r1 >> 3
            r3.zzL(r1)
            goto L193
        L183:
            com.google.android.gms.internal.ads.zzek r1 = r14.zzc
            int r3 = r10 * 8
            byte[] r1 = r1.zzN()
            r0.zzh(r1, r4, r3)
            com.google.android.gms.internal.ads.zzek r1 = r14.zzc
            r1.zzL(r4)
        L193:
            com.google.android.gms.internal.ads.zzaeh r1 = r14.zze
            com.google.android.gms.internal.ads.zzek r3 = r14.zzc
            r1.zzq(r3, r10)
            long r5 = r14.zzl
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L1a6
            goto L1a7
        L1a6:
            r2 = 0
        L1a7:
            com.google.android.gms.internal.ads.zzdi.zzf(r2)
            com.google.android.gms.internal.ads.zzaeh r6 = r14.zze
            long r7 = r14.zzl
            r9 = 1
            r11 = 0
            r12 = 0
            r6.zzs(r7, r9, r10, r11, r12)
            long r1 = r14.zzl
            long r5 = r14.zzt
            long r1 = r1 + r5
            r14.zzl = r1
            boolean r1 = r14.zzq
            if (r1 == 0) goto L1c5
            long r1 = r14.zzr
            int r2 = (int) r1
            r0.zzn(r2)
        L1c5:
            r14.zzh = r4
            goto L5
        L1c9:
            r1 = r10
            goto L169
        L1cb:
            com.google.android.gms.internal.ads.zzbo r15 = com.google.android.gms.internal.ads.zzbo.zza(r6, r6)
            throw r15
        L1d0:
            com.google.android.gms.internal.ads.zzbo r15 = com.google.android.gms.internal.ads.zzbo.zza(r6, r6)
            throw r15
        L1d5:
            com.google.android.gms.internal.ads.zzbo r15 = com.google.android.gms.internal.ads.zzbo.zza(r6, r6)
            throw r15
        L1da:
            int r0 = r14.zzk
            r0 = r0 & (-225(0xffffffffffffff1f, float:NaN))
            int r0 = r0 << r5
            int r2 = r15.zzm()
            r0 = r0 | r2
            r14.zzj = r0
            com.google.android.gms.internal.ads.zzek r2 = r14.zzc
            byte[] r3 = r2.zzN()
            int r3 = r3.length
            if (r0 <= r3) goto L1fe
            r2.zzI(r0)
            com.google.android.gms.internal.ads.zzej r0 = r14.zzd
            com.google.android.gms.internal.ads.zzek r2 = r14.zzc
            byte[] r2 = r2.zzN()
            int r3 = r2.length
            r0.zzk(r2, r3)
        L1fe:
            r14.zzi = r4
            r14.zzh = r1
            goto L5
        L204:
            int r0 = r15.zzm()
            r2 = r0 & 224(0xe0, float:3.14E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r2 != r5) goto L214
            r14.zzk = r0
            r14.zzh = r3
            goto L5
        L214:
            if (r0 == r1) goto L5
            r14.zzh = r4
            goto L5
        L21a:
            int r0 = r15.zzm()
            if (r0 != r1) goto L5
            r14.zzh = r2
            goto L5
        L224:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(com.google.android.gms.internal.ads.zzade r3, com.google.android.gms.internal.ads.zzaon r4) {
            r2 = this;
            r4.zzc()
            int r0 = r4.zza()
            r1 = 1
            com.google.android.gms.internal.ads.zzaeh r3 = r3.zzw(r0, r1)
            r2.zze = r3
            java.lang.String r3 = r4.zzb()
            r2.zzf = r3
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
            r0.zzl = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zze() {
            r3 = this;
            r0 = 0
            r3.zzh = r0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.zzl = r1
            r3.zzm = r0
            return
    }
}
