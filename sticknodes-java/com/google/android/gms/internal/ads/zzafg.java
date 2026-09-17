package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzafg implements com.google.android.gms.internal.ads.zzadb {
    private final byte[] zza;
    private final com.google.android.gms.internal.ads.zzek zzb;
    private final com.google.android.gms.internal.ads.zzadh zzc;
    private com.google.android.gms.internal.ads.zzade zzd;
    private com.google.android.gms.internal.ads.zzaeh zze;
    private int zzf;
    private com.google.android.gms.internal.ads.zzbk zzg;
    private com.google.android.gms.internal.ads.zzadm zzh;
    private int zzi;
    private int zzj;
    private com.google.android.gms.internal.ads.zzaff zzk;
    private int zzl;
    private long zzm;

    public zzafg() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public zzafg(int r3) {
            r2 = this;
            r2.<init>()
            r3 = 42
            byte[] r3 = new byte[r3]
            r2.zza = r3
            com.google.android.gms.internal.ads.zzek r3 = new com.google.android.gms.internal.ads.zzek
            r0 = 32768(0x8000, float:4.5918E-41)
            byte[] r0 = new byte[r0]
            r1 = 0
            r3.<init>(r0, r1)
            r2.zzb = r3
            com.google.android.gms.internal.ads.zzadh r3 = new com.google.android.gms.internal.ads.zzadh
            r3.<init>()
            r2.zzc = r3
            r2.zzf = r1
            return
    }

    private final long zza(com.google.android.gms.internal.ads.zzek r5, boolean r6) {
            r4 = this;
            com.google.android.gms.internal.ads.zzadm r0 = r4.zzh
            java.util.Objects.requireNonNull(r0)
            int r0 = r5.zzd()
        L9:
            int r1 = r5.zze()
            int r1 = r1 + (-16)
            if (r0 > r1) goto L2b
            r5.zzL(r0)
            com.google.android.gms.internal.ads.zzadm r1 = r4.zzh
            int r2 = r4.zzj
            com.google.android.gms.internal.ads.zzadh r3 = r4.zzc
            boolean r1 = com.google.android.gms.internal.ads.zzadi.zzc(r5, r1, r2, r3)
            if (r1 == 0) goto L28
            r5.zzL(r0)
            com.google.android.gms.internal.ads.zzadh r5 = r4.zzc
            long r5 = r5.zza
            return r5
        L28:
            int r0 = r0 + 1
            goto L9
        L2b:
            if (r6 == 0) goto L65
        L2d:
            int r6 = r5.zze()
            int r1 = r4.zzi
            int r6 = r6 - r1
            if (r0 > r6) goto L5d
            r5.zzL(r0)
            com.google.android.gms.internal.ads.zzadm r6 = r4.zzh     // Catch: java.lang.IndexOutOfBoundsException -> L44
            int r1 = r4.zzj     // Catch: java.lang.IndexOutOfBoundsException -> L44
            com.google.android.gms.internal.ads.zzadh r2 = r4.zzc     // Catch: java.lang.IndexOutOfBoundsException -> L44
            boolean r6 = com.google.android.gms.internal.ads.zzadi.zzc(r5, r6, r1, r2)     // Catch: java.lang.IndexOutOfBoundsException -> L44
            goto L45
        L44:
            r6 = 0
        L45:
            int r1 = r5.zzd()
            int r2 = r5.zze()
            if (r1 <= r2) goto L50
            goto L5a
        L50:
            if (r6 == 0) goto L5a
            r5.zzL(r0)
            com.google.android.gms.internal.ads.zzadh r5 = r4.zzc
            long r5 = r5.zza
            return r5
        L5a:
            int r0 = r0 + 1
            goto L2d
        L5d:
            int r6 = r5.zze()
            r5.zzL(r6)
            goto L68
        L65:
            r5.zzL(r0)
        L68:
            r5 = -1
            return r5
    }

    private final void zzg() {
            r11 = this;
            long r0 = r11.zzm
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r2
            com.google.android.gms.internal.ads.zzadm r2 = r11.zzh
            int r3 = com.google.android.gms.internal.ads.zzeu.zza
            int r2 = r2.zze
            long r2 = (long) r2
            long r5 = r0 / r2
            com.google.android.gms.internal.ads.zzaeh r4 = r11.zze
            int r8 = r11.zzl
            r7 = 1
            r9 = 0
            r10 = 0
            r4.zzs(r5, r7, r8, r9, r10)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzb(com.google.android.gms.internal.ads.zzadc r19, com.google.android.gms.internal.ads.zzadx r20) throws java.io.IOException {
            r18 = this;
            r0 = r18
            r1 = r19
            int r2 = r0.zzf
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L22a
            r5 = 2
            if (r2 == r3) goto L21d
            r6 = 0
            r7 = 3
            r8 = 4
            if (r2 == r5) goto L1fc
            if (r2 == r7) goto L148
            r9 = -1
            if (r2 == r8) goto Lda
            com.google.android.gms.internal.ads.zzaeh r2 = r0.zze
            java.util.Objects.requireNonNull(r2)
            com.google.android.gms.internal.ads.zzadm r2 = r0.zzh
            java.util.Objects.requireNonNull(r2)
            com.google.android.gms.internal.ads.zzaff r5 = r0.zzk
            r6 = -1
            if (r5 == 0) goto L35
            boolean r7 = r5.zze()
            if (r7 == 0) goto L35
            r7 = r20
            int r4 = r5.zza(r1, r7)
            goto Lbb
        L35:
            long r7 = r0.zzm
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 != 0) goto L43
            long r1 = com.google.android.gms.internal.ads.zzadi.zzb(r1, r2)
            r0.zzm = r1
            goto Lbb
        L43:
            com.google.android.gms.internal.ads.zzek r2 = r0.zzb
            int r5 = r2.zze()
            r7 = 32768(0x8000, float:4.5918E-41)
            if (r5 >= r7) goto L71
            byte[] r2 = r2.zzN()
            int r7 = r7 - r5
            int r1 = r1.zza(r2, r5, r7)
            if (r1 != r6) goto L5a
            goto L5b
        L5a:
            r3 = 0
        L5b:
            if (r3 != 0) goto L64
            com.google.android.gms.internal.ads.zzek r2 = r0.zzb
            int r5 = r5 + r1
            r2.zzK(r5)
            goto L72
        L64:
            com.google.android.gms.internal.ads.zzek r1 = r0.zzb
            int r1 = r1.zzb()
            if (r1 != 0) goto L72
            r18.zzg()
            r4 = -1
            goto Lbb
        L71:
            r3 = 0
        L72:
            com.google.android.gms.internal.ads.zzek r1 = r0.zzb
            int r2 = r1.zzd()
            int r5 = r0.zzl
            int r6 = r0.zzi
            if (r5 >= r6) goto L8a
            int r7 = r1.zzb()
            int r6 = r6 - r5
            int r5 = java.lang.Math.min(r6, r7)
            r1.zzM(r5)
        L8a:
            com.google.android.gms.internal.ads.zzek r1 = r0.zzb
            long r5 = r0.zza(r1, r3)
            com.google.android.gms.internal.ads.zzek r1 = r0.zzb
            int r3 = r1.zzd()
            int r3 = r3 - r2
            r1.zzL(r2)
            com.google.android.gms.internal.ads.zzaeh r1 = r0.zze
            com.google.android.gms.internal.ads.zzek r2 = r0.zzb
            r1.zzq(r2, r3)
            int r1 = r0.zzl
            int r1 = r1 + r3
            r0.zzl = r1
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 == 0) goto Lb1
            r18.zzg()
            r0.zzl = r4
            r0.zzm = r5
        Lb1:
            com.google.android.gms.internal.ads.zzek r1 = r0.zzb
            int r2 = r1.zzb()
            r3 = 16
            if (r2 < r3) goto Lbc
        Lbb:
            return r4
        Lbc:
            int r2 = r1.zzb()
            byte[] r3 = r1.zzN()
            int r5 = r1.zzd()
            byte[] r1 = r1.zzN()
            java.lang.System.arraycopy(r3, r5, r1, r4, r2)
            com.google.android.gms.internal.ads.zzek r1 = r0.zzb
            r1.zzL(r4)
            com.google.android.gms.internal.ads.zzek r1 = r0.zzb
            r1.zzK(r2)
            return r4
        Lda:
            r19.zzj()
            com.google.android.gms.internal.ads.zzek r2 = new com.google.android.gms.internal.ads.zzek
            r2.<init>(r5)
            byte[] r3 = r2.zzN()
            r1.zzh(r3, r4, r5)
            int r2 = r2.zzq()
            int r3 = r2 >> 2
            r5 = 16382(0x3ffe, float:2.2956E-41)
            if (r3 != r5) goto L13e
            r19.zzj()
            r0.zzj = r2
            com.google.android.gms.internal.ads.zzade r2 = r0.zzd
            int r3 = com.google.android.gms.internal.ads.zzeu.zza
            long r14 = r19.zzf()
            long r16 = r19.zzd()
            com.google.android.gms.internal.ads.zzadm r12 = r0.zzh
            java.util.Objects.requireNonNull(r12)
            com.google.android.gms.internal.ads.zzadl r1 = r12.zzk
            if (r1 == 0) goto L113
            com.google.android.gms.internal.ads.zzadk r1 = new com.google.android.gms.internal.ads.zzadk
            r1.<init>(r12, r14)
            goto L137
        L113:
            r5 = 0
            int r1 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
            if (r1 == 0) goto L12e
            long r7 = r12.zzj
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 <= 0) goto L12e
            com.google.android.gms.internal.ads.zzaff r1 = new com.google.android.gms.internal.ads.zzaff
            int r13 = r0.zzj
            r11 = r1
            r11.<init>(r12, r13, r14, r16)
            r0.zzk = r1
            com.google.android.gms.internal.ads.zzaea r1 = r1.zzb()
            goto L137
        L12e:
            com.google.android.gms.internal.ads.zzadz r1 = new com.google.android.gms.internal.ads.zzadz
            long r7 = r12.zza()
            r1.<init>(r7, r5)
        L137:
            r2.zzO(r1)
            r1 = 5
            r0.zzf = r1
            return r4
        L13e:
            r19.zzj()
            java.lang.String r1 = "First frame does not start with sync code."
            com.google.android.gms.internal.ads.zzbo r1 = com.google.android.gms.internal.ads.zzbo.zza(r1, r6)
            throw r1
        L148:
            com.google.android.gms.internal.ads.zzadm r2 = r0.zzh
        L14a:
            r19.zzj()
            com.google.android.gms.internal.ads.zzej r3 = new com.google.android.gms.internal.ads.zzej
            byte[] r5 = new byte[r8]
            r3.<init>(r5, r8)
            byte[] r5 = r3.zza
            r1.zzh(r5, r4, r8)
            boolean r5 = r3.zzp()
            r6 = 7
            int r6 = r3.zzd(r6)
            r9 = 24
            int r3 = r3.zzd(r9)
            int r3 = r3 + r8
            r9 = 6
            if (r6 != 0) goto L179
            r2 = 38
            byte[] r3 = new byte[r2]
            r1.zzi(r3, r4, r2)
            com.google.android.gms.internal.ads.zzadm r2 = new com.google.android.gms.internal.ads.zzadm
            r2.<init>(r3, r8)
            goto L1d3
        L179:
            if (r2 == 0) goto L1f6
            if (r6 != r7) goto L192
            com.google.android.gms.internal.ads.zzek r6 = new com.google.android.gms.internal.ads.zzek
            r6.<init>(r3)
            byte[] r10 = r6.zzN()
            r1.zzi(r10, r4, r3)
            com.google.android.gms.internal.ads.zzadl r3 = com.google.android.gms.internal.ads.zzadj.zzb(r6)
            com.google.android.gms.internal.ads.zzadm r2 = r2.zzf(r3)
            goto L1d3
        L192:
            if (r6 != r8) goto L1b2
            com.google.android.gms.internal.ads.zzek r6 = new com.google.android.gms.internal.ads.zzek
            r6.<init>(r3)
            byte[] r10 = r6.zzN()
            r1.zzi(r10, r4, r3)
            r6.zzM(r8)
            com.google.android.gms.internal.ads.zzaek r3 = com.google.android.gms.internal.ads.zzaen.zzc(r6, r4, r4)
            java.lang.String[] r3 = r3.zza
            java.util.List r3 = java.util.Arrays.asList(r3)
            com.google.android.gms.internal.ads.zzadm r2 = r2.zzg(r3)
            goto L1d3
        L1b2:
            if (r6 != r9) goto L1d0
            com.google.android.gms.internal.ads.zzek r6 = new com.google.android.gms.internal.ads.zzek
            r6.<init>(r3)
            byte[] r10 = r6.zzN()
            r1.zzi(r10, r4, r3)
            r6.zzM(r8)
            com.google.android.gms.internal.ads.zzagb r3 = com.google.android.gms.internal.ads.zzagb.zzb(r6)
            com.google.android.gms.internal.ads.zzgax r3 = com.google.android.gms.internal.ads.zzgax.zzo(r3)
            com.google.android.gms.internal.ads.zzadm r2 = r2.zze(r3)
            goto L1d3
        L1d0:
            r1.zzk(r3)
        L1d3:
            int r3 = com.google.android.gms.internal.ads.zzeu.zza
            r0.zzh = r2
            if (r5 == 0) goto L14a
            java.util.Objects.requireNonNull(r2)
            int r1 = r2.zzc
            int r1 = java.lang.Math.max(r1, r9)
            r0.zzi = r1
            com.google.android.gms.internal.ads.zzaeh r1 = r0.zze
            com.google.android.gms.internal.ads.zzadm r2 = r0.zzh
            byte[] r3 = r0.zza
            com.google.android.gms.internal.ads.zzbk r5 = r0.zzg
            com.google.android.gms.internal.ads.zzaf r2 = r2.zzc(r3, r5)
            r1.zzl(r2)
            r0.zzf = r8
            return r4
        L1f6:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L1fc:
            com.google.android.gms.internal.ads.zzek r2 = new com.google.android.gms.internal.ads.zzek
            r2.<init>(r8)
            byte[] r3 = r2.zzN()
            r1.zzi(r3, r4, r8)
            long r1 = r2.zzu()
            r8 = 1716281667(0x664c6143, double:8.479558103E-315)
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 != 0) goto L216
            r0.zzf = r7
            return r4
        L216:
            java.lang.String r1 = "Failed to read FLAC stream marker."
            com.google.android.gms.internal.ads.zzbo r1 = com.google.android.gms.internal.ads.zzbo.zza(r1, r6)
            throw r1
        L21d:
            byte[] r2 = r0.zza
            r3 = 42
            r1.zzh(r2, r4, r3)
            r19.zzj()
            r0.zzf = r5
            return r4
        L22a:
            r19.zzj()
            long r5 = r19.zze()
            com.google.android.gms.internal.ads.zzbk r2 = com.google.android.gms.internal.ads.zzadj.zza(r1, r3)
            long r7 = r19.zze()
            long r7 = r7 - r5
            int r5 = (int) r7
            r1.zzk(r5)
            r0.zzg = r2
            r0.zzf = r3
            return r4
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
            r2.zzd = r3
            r0 = 0
            r1 = 1
            com.google.android.gms.internal.ads.zzaeh r0 = r3.zzw(r0, r1)
            r2.zze = r0
            r3.zzD()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long r5, long r7) {
            r4 = this;
            r0 = 0
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 != 0) goto La
            r4.zzf = r0
            goto L11
        La:
            com.google.android.gms.internal.ads.zzaff r5 = r4.zzk
            if (r5 == 0) goto L11
            r5.zzd(r7)
        L11:
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 != 0) goto L16
            goto L18
        L16:
            r1 = -1
        L18:
            r4.zzm = r1
            r4.zzl = r0
            com.google.android.gms.internal.ads.zzek r5 = r4.zzb
            r5.zzI(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(com.google.android.gms.internal.ads.zzadc r6) throws java.io.IOException {
            r5 = this;
            r0 = 0
            com.google.android.gms.internal.ads.zzadj.zza(r6, r0)
            com.google.android.gms.internal.ads.zzek r1 = new com.google.android.gms.internal.ads.zzek
            r2 = 4
            r1.<init>(r2)
            byte[] r3 = r1.zzN()
            com.google.android.gms.internal.ads.zzacq r6 = (com.google.android.gms.internal.ads.zzacq) r6
            r6.zzm(r3, r0, r2, r0)
            long r1 = r1.zzu()
            r3 = 1716281667(0x664c6143, double:8.479558103E-315)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L20
            r6 = 1
            return r6
        L20:
            return r0
    }
}
