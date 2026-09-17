package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzamu implements com.google.android.gms.internal.ads.zzadb {
    private final com.google.android.gms.internal.ads.zzamv zza;
    private final com.google.android.gms.internal.ads.zzek zzb;
    private final com.google.android.gms.internal.ads.zzek zzc;
    private final com.google.android.gms.internal.ads.zzej zzd;
    private com.google.android.gms.internal.ads.zzade zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    public zzamu() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public zzamu(int r4) {
            r3 = this;
            r3.<init>()
            com.google.android.gms.internal.ads.zzamv r4 = new com.google.android.gms.internal.ads.zzamv
            r0 = 1
            r1 = 0
            r2 = 0
            r4.<init>(r0, r1, r2)
            r3.zza = r4
            com.google.android.gms.internal.ads.zzek r4 = new com.google.android.gms.internal.ads.zzek
            r0 = 2048(0x800, float:2.87E-42)
            r4.<init>(r0)
            r3.zzb = r4
            r0 = -1
            r3.zzg = r0
            com.google.android.gms.internal.ads.zzek r4 = new com.google.android.gms.internal.ads.zzek
            r0 = 10
            r4.<init>(r0)
            r3.zzc = r4
            com.google.android.gms.internal.ads.zzej r0 = new com.google.android.gms.internal.ads.zzej
            byte[] r4 = r4.zzN()
            int r1 = r4.length
            r0.<init>(r4, r1)
            r3.zzd = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzb(com.google.android.gms.internal.ads.zzadc r8, com.google.android.gms.internal.ads.zzadx r9) throws java.io.IOException {
            r7 = this;
            com.google.android.gms.internal.ads.zzade r9 = r7.zze
            com.google.android.gms.internal.ads.zzdi.zzb(r9)
            com.google.android.gms.internal.ads.zzek r9 = r7.zzb
            byte[] r9 = r9.zzN()
            r0 = 0
            r1 = 2048(0x800, float:2.87E-42)
            int r8 = r8.zza(r9, r0, r1)
            boolean r9 = r7.zzi
            r1 = 1
            if (r9 != 0) goto L2a
            com.google.android.gms.internal.ads.zzade r9 = r7.zze
            com.google.android.gms.internal.ads.zzadz r2 = new com.google.android.gms.internal.ads.zzadz
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r2.<init>(r3, r5)
            r9.zzO(r2)
            r7.zzi = r1
        L2a:
            r9 = -1
            if (r8 != r9) goto L2e
            return r9
        L2e:
            com.google.android.gms.internal.ads.zzek r9 = r7.zzb
            r9.zzL(r0)
            com.google.android.gms.internal.ads.zzek r9 = r7.zzb
            r9.zzK(r8)
            boolean r8 = r7.zzh
            if (r8 != 0) goto L46
            com.google.android.gms.internal.ads.zzamv r8 = r7.zza
            long r2 = r7.zzf
            r9 = 4
            r8.zzd(r2, r9)
            r7.zzh = r1
        L46:
            com.google.android.gms.internal.ads.zzamv r8 = r7.zza
            com.google.android.gms.internal.ads.zzek r9 = r7.zzb
            r8.zza(r9)
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
    public final void zze(com.google.android.gms.internal.ads.zzade r5) {
            r4 = this;
            r4.zze = r5
            com.google.android.gms.internal.ads.zzaon r0 = new com.google.android.gms.internal.ads.zzaon
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            com.google.android.gms.internal.ads.zzamv r1 = r4.zza
            r1.zzb(r5, r0)
            r5.zzD()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long r1, long r3) {
            r0 = this;
            r1 = 0
            r0.zzh = r1
            com.google.android.gms.internal.ads.zzamv r1 = r0.zza
            r1.zze()
            r0.zzf = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(com.google.android.gms.internal.ads.zzadc r10) throws java.io.IOException {
            r9 = this;
            r0 = 0
            r1 = 0
        L2:
            com.google.android.gms.internal.ads.zzek r2 = r9.zzc
            byte[] r2 = r2.zzN()
            r3 = r10
            com.google.android.gms.internal.ads.zzacq r3 = (com.google.android.gms.internal.ads.zzacq) r3
            r4 = 10
            r3.zzm(r2, r0, r4, r0)
            com.google.android.gms.internal.ads.zzek r2 = r9.zzc
            r2.zzL(r0)
            com.google.android.gms.internal.ads.zzek r2 = r9.zzc
            int r2 = r2.zzo()
            r4 = 4801587(0x494433, float:6.728456E-39)
            if (r2 == r4) goto L99
            r10.zzj()
            r2 = r10
            com.google.android.gms.internal.ads.zzacq r2 = (com.google.android.gms.internal.ads.zzacq) r2
            r2.zzl(r1, r0)
            long r3 = r9.zzg
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L34
            long r3 = (long) r1
            r9.zzg = r3
        L34:
            r4 = r1
            r3 = 0
            r5 = 0
        L37:
            com.google.android.gms.internal.ads.zzek r6 = r9.zzc
            byte[] r6 = r6.zzN()
            r7 = 2
            r2.zzm(r6, r0, r7, r0)
            com.google.android.gms.internal.ads.zzek r6 = r9.zzc
            r6.zzL(r0)
            com.google.android.gms.internal.ads.zzek r6 = r9.zzc
            int r6 = r6.zzq()
            boolean r6 = com.google.android.gms.internal.ads.zzamv.zzf(r6)
            if (r6 != 0) goto L5d
            int r4 = r4 + 1
            r10.zzj()
            r2.zzl(r4, r0)
        L5a:
            r3 = 0
            r5 = 0
            goto L92
        L5d:
            r6 = 1
            int r3 = r3 + r6
            r7 = 4
            if (r3 < r7) goto L68
            r8 = 188(0xbc, float:2.63E-43)
            if (r5 > r8) goto L67
            goto L68
        L67:
            return r6
        L68:
            com.google.android.gms.internal.ads.zzek r6 = r9.zzc
            byte[] r6 = r6.zzN()
            r2.zzm(r6, r0, r7, r0)
            com.google.android.gms.internal.ads.zzej r6 = r9.zzd
            r7 = 14
            r6.zzl(r7)
            com.google.android.gms.internal.ads.zzej r6 = r9.zzd
            r7 = 13
            int r6 = r6.zzd(r7)
            r7 = 6
            if (r6 > r7) goto L8c
            int r4 = r4 + 1
            r10.zzj()
            r2.zzl(r4, r0)
            goto L5a
        L8c:
            int r7 = r6 + (-6)
            r2.zzl(r7, r0)
            int r5 = r5 + r6
        L92:
            int r6 = r4 - r1
            r7 = 8192(0x2000, float:1.14794E-41)
            if (r6 < r7) goto L37
            return r0
        L99:
            com.google.android.gms.internal.ads.zzek r2 = r9.zzc
            r4 = 3
            r2.zzM(r4)
            com.google.android.gms.internal.ads.zzek r2 = r9.zzc
            int r2 = r2.zzl()
            int r4 = r2 + 10
            int r1 = r1 + r4
            r3.zzl(r2, r0)
            goto L2
    }
}
