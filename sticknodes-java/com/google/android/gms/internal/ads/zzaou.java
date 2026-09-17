package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaou implements com.google.android.gms.internal.ads.zzadb {
    private com.google.android.gms.internal.ads.zzade zza;
    private com.google.android.gms.internal.ads.zzaeh zzb;
    private int zzc;
    private long zzd;
    private com.google.android.gms.internal.ads.zzaos zze;
    private int zzf;
    private long zzg;

    public zzaou() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.zzc = r0
            r0 = -1
            r3.zzd = r0
            r2 = -1
            r3.zzf = r2
            r3.zzg = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzb(com.google.android.gms.internal.ads.zzadc r19, com.google.android.gms.internal.ads.zzadx r20) throws java.io.IOException {
            r18 = this;
            r0 = r18
            r1 = r19
            com.google.android.gms.internal.ads.zzaeh r2 = r0.zzb
            com.google.android.gms.internal.ads.zzdi.zzb(r2)
            int r2 = com.google.android.gms.internal.ads.zzeu.zza
            int r2 = r0.zzc
            r3 = -1
            r4 = 4
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L157
            r7 = 2
            r8 = -1
            if (r2 == r5) goto L124
            r10 = 3
            if (r2 == r7) goto La2
            if (r2 == r10) goto L3c
            long r10 = r0.zzg
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 == 0) goto L24
            goto L25
        L24:
            r5 = 0
        L25:
            com.google.android.gms.internal.ads.zzdi.zzf(r5)
            long r4 = r0.zzg
            long r7 = r19.zzf()
            long r4 = r4 - r7
            com.google.android.gms.internal.ads.zzaos r2 = r0.zze
            java.util.Objects.requireNonNull(r2)
            boolean r1 = r2.zzc(r1, r4)
            if (r1 == 0) goto L3b
            return r3
        L3b:
            return r6
        L3c:
            android.util.Pair r2 = com.google.android.gms.internal.ads.zzaox.zza(r19)
            java.lang.Object r3 = r2.first
            java.lang.Long r3 = (java.lang.Long) r3
            int r3 = r3.intValue()
            r0.zzf = r3
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            long r10 = r0.zzd
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 == 0) goto L62
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r5 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r5 != 0) goto L62
            r2 = r10
        L62:
            int r5 = r0.zzf
            long r10 = (long) r5
            long r10 = r10 + r2
            r0.zzg = r10
            long r1 = r19.zzd()
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 == 0) goto L95
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 <= 0) goto L95
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Data exceeds input length: "
            r3.append(r5)
            r3.append(r10)
            java.lang.String r5 = ", "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "WavExtractor"
            com.google.android.gms.internal.ads.zzea.zzf(r5, r3)
            r0.zzg = r1
            r10 = r1
        L95:
            com.google.android.gms.internal.ads.zzaos r1 = r0.zze
            java.util.Objects.requireNonNull(r1)
            int r2 = r0.zzf
            r1.zza(r2, r10)
            r0.zzc = r4
            return r6
        La2:
            com.google.android.gms.internal.ads.zzaov r15 = com.google.android.gms.internal.ads.zzaox.zzb(r19)
            int r1 = r15.zza
            r2 = 17
            if (r1 != r2) goto Lb8
            com.google.android.gms.internal.ads.zzaor r1 = new com.google.android.gms.internal.ads.zzaor
            com.google.android.gms.internal.ads.zzade r2 = r0.zza
            com.google.android.gms.internal.ads.zzaeh r3 = r0.zzb
            r1.<init>(r2, r3, r15)
            r0.zze = r1
            goto L10b
        Lb8:
            r2 = 6
            if (r1 != r2) goto Lcc
            com.google.android.gms.internal.ads.zzaot r1 = new com.google.android.gms.internal.ads.zzaot
            com.google.android.gms.internal.ads.zzade r13 = r0.zza
            com.google.android.gms.internal.ads.zzaeh r14 = r0.zzb
            r17 = -1
            java.lang.String r16 = "audio/g711-alaw"
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r0.zze = r1
            goto L10b
        Lcc:
            r2 = 7
            if (r1 != r2) goto Le0
            com.google.android.gms.internal.ads.zzaot r1 = new com.google.android.gms.internal.ads.zzaot
            com.google.android.gms.internal.ads.zzade r13 = r0.zza
            com.google.android.gms.internal.ads.zzaeh r14 = r0.zzb
            r17 = -1
            java.lang.String r16 = "audio/g711-mlaw"
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r0.zze = r1
            goto L10b
        Le0:
            int r2 = r15.zze
            if (r1 == r5) goto Lf5
            if (r1 == r10) goto Lee
            r3 = 65534(0xfffe, float:9.1833E-41)
            if (r1 == r3) goto Lf5
        Leb:
            r17 = 0
            goto Lfb
        Lee:
            r3 = 32
            if (r2 != r3) goto Leb
            r17 = 4
            goto Lfb
        Lf5:
            int r4 = com.google.android.gms.internal.ads.zzeu.zzm(r2)
            r17 = r4
        Lfb:
            if (r17 == 0) goto L10e
            com.google.android.gms.internal.ads.zzaot r1 = new com.google.android.gms.internal.ads.zzaot
            com.google.android.gms.internal.ads.zzade r13 = r0.zza
            com.google.android.gms.internal.ads.zzaeh r14 = r0.zzb
            java.lang.String r16 = "audio/raw"
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r0.zze = r1
        L10b:
            r0.zzc = r10
            return r6
        L10e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unsupported WAV format type: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzbo r1 = com.google.android.gms.internal.ads.zzbo.zzc(r1)
            throw r1
        L124:
            com.google.android.gms.internal.ads.zzek r2 = new com.google.android.gms.internal.ads.zzek
            r3 = 8
            r2.<init>(r3)
            com.google.android.gms.internal.ads.zzaow r4 = com.google.android.gms.internal.ads.zzaow.zza(r1, r2)
            int r5 = r4.zza
            r10 = 1685272116(0x64733634, float:1.7945858E22)
            if (r5 == r10) goto L13a
            r19.zzj()
            goto L152
        L13a:
            r1.zzg(r3)
            r2.zzL(r6)
            byte[] r5 = r2.zzN()
            r1.zzh(r5, r6, r3)
            long r8 = r2.zzr()
            long r4 = r4.zzb
            int r2 = (int) r4
            int r2 = r2 + r3
            r1.zzk(r2)
        L152:
            r0.zzd = r8
            r0.zzc = r7
            return r6
        L157:
            long r7 = r19.zzf()
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L163
            r2 = 1
            goto L164
        L163:
            r2 = 0
        L164:
            com.google.android.gms.internal.ads.zzdi.zzf(r2)
            int r2 = r0.zzf
            if (r2 == r3) goto L171
            r1.zzk(r2)
            r0.zzc = r4
            goto L186
        L171:
            boolean r2 = com.google.android.gms.internal.ads.zzaox.zzc(r19)
            if (r2 == 0) goto L187
            long r2 = r19.zze()
            long r7 = r19.zzf()
            long r2 = r2 - r7
            int r3 = (int) r2
            r1.zzk(r3)
            r0.zzc = r5
        L186:
            return r6
        L187:
            r1 = 0
            java.lang.String r2 = "Unsupported or unrecognized wav file type."
            com.google.android.gms.internal.ads.zzbo r1 = com.google.android.gms.internal.ads.zzbo.zza(r2, r1)
            throw r1
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
    public final void zze(com.google.android.gms.internal.ads.zzade r3) {
            r2 = this;
            r2.zza = r3
            r0 = 0
            r1 = 1
            com.google.android.gms.internal.ads.zzaeh r0 = r3.zzw(r0, r1)
            r2.zzb = r0
            r3.zzD()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long r4, long r6) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L8
            r4 = 0
            goto L9
        L8:
            r4 = 4
        L9:
            r3.zzc = r4
            com.google.android.gms.internal.ads.zzaos r4 = r3.zze
            if (r4 == 0) goto L12
            r4.zzb(r6)
        L12:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(com.google.android.gms.internal.ads.zzadc r1) throws java.io.IOException {
            r0 = this;
            boolean r1 = com.google.android.gms.internal.ads.zzaox.zzc(r1)
            return r1
    }
}
