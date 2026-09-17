package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzams implements com.google.android.gms.internal.ads.zzadb {
    private final com.google.android.gms.internal.ads.zzamt zza;
    private final com.google.android.gms.internal.ads.zzek zzb;
    private boolean zzc;

    public zzams() {
            r3 = this;
            r3.<init>()
            com.google.android.gms.internal.ads.zzamt r0 = new com.google.android.gms.internal.ads.zzamt
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2)
            r3.zza = r0
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r1 = 16384(0x4000, float:2.2959E-41)
            r0.<init>(r1)
            r3.zzb = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzb(com.google.android.gms.internal.ads.zzadc r4, com.google.android.gms.internal.ads.zzadx r5) throws java.io.IOException {
            r3 = this;
            com.google.android.gms.internal.ads.zzek r5 = r3.zzb
            byte[] r5 = r5.zzN()
            r0 = 0
            r1 = 16384(0x4000, float:2.2959E-41)
            int r4 = r4.zza(r5, r0, r1)
            r5 = -1
            if (r4 != r5) goto L11
            return r5
        L11:
            com.google.android.gms.internal.ads.zzek r5 = r3.zzb
            r5.zzL(r0)
            com.google.android.gms.internal.ads.zzek r5 = r3.zzb
            r5.zzK(r4)
            boolean r4 = r3.zzc
            if (r4 != 0) goto L2a
            com.google.android.gms.internal.ads.zzamt r4 = r3.zza
            r1 = 0
            r5 = 4
            r4.zzd(r1, r5)
            r4 = 1
            r3.zzc = r4
        L2a:
            com.google.android.gms.internal.ads.zzamt r4 = r3.zza
            com.google.android.gms.internal.ads.zzek r5 = r3.zzb
            r4.zza(r5)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ com.google.android.gms.internal.ads.zzadb zzc() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ java.util.List zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgax r0 = com.google.android.gms.internal.ads.zzgax.zzn()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zze(com.google.android.gms.internal.ads.zzade r6) {
            r5 = this;
            com.google.android.gms.internal.ads.zzaon r0 = new com.google.android.gms.internal.ads.zzaon
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            com.google.android.gms.internal.ads.zzamt r1 = r5.zza
            r1.zzb(r6, r0)
            r6.zzD()
            com.google.android.gms.internal.ads.zzadz r0 = new com.google.android.gms.internal.ads.zzadz
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 0
            r0.<init>(r1, r3)
            r6.zzO(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long r1, long r3) {
            r0 = this;
            r1 = 0
            r0.zzc = r1
            com.google.android.gms.internal.ads.zzamt r1 = r0.zza
            r1.zze()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(com.google.android.gms.internal.ads.zzadc r16) throws java.io.IOException {
            r15 = this;
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.zzN()
            r5 = r16
            com.google.android.gms.internal.ads.zzacq r5 = (com.google.android.gms.internal.ads.zzacq) r5
            r5.zzm(r4, r2, r1, r2)
            r0.zzL(r2)
            int r4 = r0.zzo()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L9e
            r16.zzj()
            r4 = r16
            com.google.android.gms.internal.ads.zzacq r4 = (com.google.android.gms.internal.ads.zzacq) r4
            r4.zzl(r3, r2)
            r5 = r3
        L2c:
            r1 = 0
        L2d:
            byte[] r6 = r0.zzN()
            r8 = 7
            r4.zzm(r6, r2, r8, r2)
            r0.zzL(r2)
            int r6 = r0.zzq()
            r9 = 44096(0xac40, float:6.1792E-41)
            r10 = 44097(0xac41, float:6.1793E-41)
            if (r6 == r9) goto L56
            if (r6 == r10) goto L56
            r16.zzj()
            int r5 = r5 + 1
            int r1 = r5 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r6) goto L55
            r4.zzl(r5, r2)
            goto L2c
        L55:
            return r2
        L56:
            r9 = 1
            int r1 = r1 + r9
            r11 = 4
            if (r1 < r11) goto L5c
            return r9
        L5c:
            byte[] r9 = r0.zzN()
            int r12 = com.google.android.gms.internal.ads.zzace.zza
            int r12 = r9.length
            r13 = -1
            if (r12 >= r8) goto L68
            r12 = -1
            goto L95
        L68:
            r12 = 2
            r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r14 = r9[r7]
            int r12 = r12 << 8
            r14 = r14 & 255(0xff, float:3.57E-43)
            r12 = r12 | r14
            r14 = 65535(0xffff, float:9.1834E-41)
            if (r12 != r14) goto L8f
            r11 = r9[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r12 = 5
            r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 16
            int r12 = r12 << 8
            r14 = 6
            r9 = r9[r14]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r11 = r11 | r12
            r12 = r11 | r9
            goto L90
        L8f:
            r8 = 4
        L90:
            if (r6 != r10) goto L94
            int r8 = r8 + 2
        L94:
            int r12 = r12 + r8
        L95:
            if (r12 != r13) goto L98
            return r2
        L98:
            int r12 = r12 + (-7)
            r4.zzl(r12, r2)
            goto L2d
        L9e:
            r0.zzM(r7)
            int r4 = r0.zzl()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.zzl(r4, r2)
            goto L9
    }
}
