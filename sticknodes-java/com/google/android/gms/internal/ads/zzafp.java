package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzafp implements com.google.android.gms.internal.ads.zzadb {
    private final com.google.android.gms.internal.ads.zzek zza;
    private com.google.android.gms.internal.ads.zzade zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private com.google.android.gms.internal.ads.zzahj zzg;
    private com.google.android.gms.internal.ads.zzadc zzh;
    private com.google.android.gms.internal.ads.zzafs zzi;
    private com.google.android.gms.internal.ads.zzajl zzj;

    public zzafp() {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r1 = 6
            r0.<init>(r1)
            r2.zza = r0
            r0 = -1
            r2.zzf = r0
            return
    }

    private final int zza(com.google.android.gms.internal.ads.zzadc r4) throws java.io.IOException {
            r3 = this;
            com.google.android.gms.internal.ads.zzek r0 = r3.zza
            r1 = 2
            r0.zzI(r1)
            com.google.android.gms.internal.ads.zzek r0 = r3.zza
            byte[] r0 = r0.zzN()
            com.google.android.gms.internal.ads.zzacq r4 = (com.google.android.gms.internal.ads.zzacq) r4
            r2 = 0
            r4.zzm(r0, r2, r1, r2)
            com.google.android.gms.internal.ads.zzek r4 = r3.zza
            int r4 = r4.zzq()
            return r4
    }

    private final void zzg() {
            r6 = this;
            com.google.android.gms.internal.ads.zzade r0 = r6.zzb
            java.util.Objects.requireNonNull(r0)
            r0.zzD()
            com.google.android.gms.internal.ads.zzade r0 = r6.zzb
            com.google.android.gms.internal.ads.zzadz r1 = new com.google.android.gms.internal.ads.zzadz
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 0
            r1.<init>(r2, r4)
            r0.zzO(r1)
            r0 = 6
            r6.zzc = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzb(com.google.android.gms.internal.ads.zzadc r24, com.google.android.gms.internal.ads.zzadx r25) throws java.io.IOException {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            int r3 = r0.zzc
            r4 = 4
            r5 = -1
            r7 = 2
            r8 = 1
            r9 = 0
            if (r3 == 0) goto L1af
            if (r3 == r8) goto L193
            r10 = -1
            if (r3 == r7) goto Ld6
            r5 = 5
            if (r3 == r4) goto L4c
            if (r3 == r5) goto L24
            r1 = 6
            if (r3 != r1) goto L1e
            return r10
        L1e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L24:
            com.google.android.gms.internal.ads.zzafs r3 = r0.zzi
            if (r3 == 0) goto L2c
            com.google.android.gms.internal.ads.zzadc r3 = r0.zzh
            if (r1 == r3) goto L37
        L2c:
            r0.zzh = r1
            com.google.android.gms.internal.ads.zzafs r3 = new com.google.android.gms.internal.ads.zzafs
            long r4 = r0.zzf
            r3.<init>(r1, r4)
            r0.zzi = r3
        L37:
            com.google.android.gms.internal.ads.zzajl r1 = r0.zzj
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.internal.ads.zzafs r3 = r0.zzi
            int r1 = r1.zzb(r3, r2)
            if (r1 != r8) goto L4b
            long r3 = r2.zza
            long r5 = r0.zzf
            long r3 = r3 + r5
            r2.zza = r3
        L4b:
            return r1
        L4c:
            long r6 = r24.zzf()
            long r10 = r0.zzf
            int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r3 != 0) goto Ld3
            com.google.android.gms.internal.ads.zzek r2 = r0.zza
            byte[] r2 = r2.zzN()
            boolean r2 = r1.zzm(r2, r9, r8, r8)
            if (r2 != 0) goto L66
            r23.zzg()
            goto Ld2
        L66:
            r24.zzj()
            com.google.android.gms.internal.ads.zzajl r2 = r0.zzj
            if (r2 != 0) goto L78
            com.google.android.gms.internal.ads.zzajl r2 = new com.google.android.gms.internal.ads.zzajl
            com.google.android.gms.internal.ads.zzakt r3 = com.google.android.gms.internal.ads.zzakt.zza
            r6 = 8
            r2.<init>(r3, r6)
            r0.zzj = r2
        L78:
            com.google.android.gms.internal.ads.zzafs r2 = new com.google.android.gms.internal.ads.zzafs
            long r6 = r0.zzf
            r2.<init>(r1, r6)
            r0.zzi = r2
            com.google.android.gms.internal.ads.zzajl r1 = r0.zzj
            boolean r1 = r1.zzi(r2)
            if (r1 == 0) goto Lcf
            com.google.android.gms.internal.ads.zzajl r1 = r0.zzj
            com.google.android.gms.internal.ads.zzafu r2 = new com.google.android.gms.internal.ads.zzafu
            long r6 = r0.zzf
            com.google.android.gms.internal.ads.zzade r3 = r0.zzb
            java.util.Objects.requireNonNull(r3)
            r2.<init>(r6, r3)
            r1.zze(r2)
            com.google.android.gms.internal.ads.zzahj r1 = r0.zzg
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.internal.ads.zzade r2 = r0.zzb
            java.util.Objects.requireNonNull(r2)
            r3 = 1024(0x400, float:1.435E-42)
            com.google.android.gms.internal.ads.zzaeh r2 = r2.zzw(r3, r4)
            com.google.android.gms.internal.ads.zzad r3 = new com.google.android.gms.internal.ads.zzad
            r3.<init>()
            java.lang.String r4 = "image/jpeg"
            r3.zzC(r4)
            com.google.android.gms.internal.ads.zzbk r4 = new com.google.android.gms.internal.ads.zzbk
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            com.google.android.gms.internal.ads.zzbj[] r8 = new com.google.android.gms.internal.ads.zzbj[r8]
            r8[r9] = r1
            r4.<init>(r6, r8)
            r3.zzS(r4)
            com.google.android.gms.internal.ads.zzaf r1 = r3.zzaf()
            r2.zzl(r1)
            r0.zzc = r5
            goto Ld2
        Lcf:
            r23.zzg()
        Ld2:
            return r9
        Ld3:
            r2.zza = r10
            return r8
        Ld6:
            int r2 = r0.zzd
            r3 = 65505(0xffe1, float:9.1792E-41)
            if (r2 != r3) goto L18a
            com.google.android.gms.internal.ads.zzek r2 = new com.google.android.gms.internal.ads.zzek
            int r3 = r0.zze
            r2.<init>(r3)
            byte[] r3 = r2.zzN()
            int r4 = r0.zze
            r1.zzi(r3, r9, r4)
            com.google.android.gms.internal.ads.zzahj r3 = r0.zzg
            if (r3 != 0) goto L18f
            java.lang.String r3 = r2.zzy(r9)
            java.lang.String r4 = "http://ns.adobe.com/xap/1.0/"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L18f
            java.lang.String r2 = r2.zzy(r9)
            if (r2 == 0) goto L18f
            long r3 = r24.zzd()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L10e
        L10b:
            r1 = 0
            goto L181
        L10e:
            com.google.android.gms.internal.ads.zzafr r2 = com.google.android.gms.internal.ads.zzafv.zza(r2)
            if (r2 != 0) goto L115
            goto L10b
        L115:
            java.util.List r8 = r2.zzb
            int r8 = r8.size()
            if (r8 >= r7) goto L11e
            goto L10b
        L11e:
            java.util.List r7 = r2.zzb
            int r7 = r7.size()
            int r7 = r7 + r10
            r11 = r5
            r13 = r11
            r17 = r13
            r19 = r17
            r8 = 0
        L12c:
            if (r7 < 0) goto L166
            java.util.List r10 = r2.zzb
            java.lang.Object r10 = r10.get(r7)
            com.google.android.gms.internal.ads.zzafq r10 = (com.google.android.gms.internal.ads.zzafq) r10
            java.lang.String r15 = r10.zza
            java.lang.String r1 = "video/mp4"
            boolean r1 = r1.equals(r15)
            r1 = r1 | r8
            if (r7 != 0) goto L147
            long r9 = r10.zzc
            long r3 = r3 - r9
            r8 = 0
            goto L14b
        L147:
            long r8 = r10.zzb
            long r8 = r3 - r8
        L14b:
            r21 = r3
            r3 = r8
            r8 = r21
            if (r1 == 0) goto L15b
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 == 0) goto L15b
            long r19 = r8 - r3
            r17 = r3
            r1 = 0
        L15b:
            if (r7 != 0) goto L15e
            r13 = r8
        L15e:
            if (r7 != 0) goto L161
            r11 = r3
        L161:
            int r7 = r7 + (-1)
            r8 = r1
            r9 = 0
            goto L12c
        L166:
            int r1 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r1 == 0) goto L10b
            int r1 = (r19 > r5 ? 1 : (r19 == r5 ? 0 : -1))
            if (r1 == 0) goto L10b
            int r1 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r1 == 0) goto L10b
            int r1 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r1 != 0) goto L177
            goto L10b
        L177:
            long r1 = r2.zza
            com.google.android.gms.internal.ads.zzahj r3 = new com.google.android.gms.internal.ads.zzahj
            r10 = r3
            r15 = r1
            r10.<init>(r11, r13, r15, r17, r19)
            r1 = r3
        L181:
            r0.zzg = r1
            if (r1 == 0) goto L18f
            long r1 = r1.zzd
            r0.zzf = r1
            goto L18f
        L18a:
            int r2 = r0.zze
            r1.zzk(r2)
        L18f:
            r2 = 0
            r0.zzc = r2
            return r2
        L193:
            r2 = 0
            com.google.android.gms.internal.ads.zzek r3 = r0.zza
            r3.zzI(r7)
            com.google.android.gms.internal.ads.zzek r3 = r0.zza
            byte[] r3 = r3.zzN()
            r1.zzi(r3, r2, r7)
            com.google.android.gms.internal.ads.zzek r1 = r0.zza
            int r1 = r1.zzq()
            int r1 = r1 + (-2)
            r0.zze = r1
            r0.zzc = r7
            return r2
        L1af:
            r2 = 0
            com.google.android.gms.internal.ads.zzek r3 = r0.zza
            r3.zzI(r7)
            com.google.android.gms.internal.ads.zzek r3 = r0.zza
            byte[] r3 = r3.zzN()
            r1.zzi(r3, r2, r7)
            com.google.android.gms.internal.ads.zzek r1 = r0.zza
            int r1 = r1.zzq()
            r0.zzd = r1
            r2 = 65498(0xffda, float:9.1782E-41)
            if (r1 != r2) goto L1d8
            long r1 = r0.zzf
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto L1d4
            r0.zzc = r4
            goto L1e9
        L1d4:
            r23.zzg()
            goto L1e9
        L1d8:
            r2 = 65488(0xffd0, float:9.1768E-41)
            if (r1 < r2) goto L1e2
            r2 = 65497(0xffd9, float:9.1781E-41)
            if (r1 <= r2) goto L1e9
        L1e2:
            r2 = 65281(0xff01, float:9.1478E-41)
            if (r1 == r2) goto L1e9
            r0.zzc = r8
        L1e9:
            r1 = 0
            return r1
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
    public final void zze(com.google.android.gms.internal.ads.zzade r1) {
            r0 = this;
            r0.zzb = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long r4, long r6) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto Ld
            r4 = 0
            r3.zzc = r4
            r4 = 0
            r3.zzj = r4
            return
        Ld:
            int r0 = r3.zzc
            r1 = 5
            if (r0 != r1) goto L1a
            com.google.android.gms.internal.ads.zzajl r0 = r3.zzj
            java.util.Objects.requireNonNull(r0)
            r0.zzf(r4, r6)
        L1a:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(com.google.android.gms.internal.ads.zzadc r7) throws java.io.IOException {
            r6 = this;
            int r0 = r6.zza(r7)
            r1 = 0
            r2 = 65496(0xffd8, float:9.178E-41)
            if (r0 == r2) goto Lb
            return r1
        Lb:
            int r0 = r6.zza(r7)
            r6.zzd = r0
            r2 = 65504(0xffe0, float:9.179E-41)
            r3 = 2
            if (r0 != r2) goto L39
            com.google.android.gms.internal.ads.zzek r0 = r6.zza
            r0.zzI(r3)
            com.google.android.gms.internal.ads.zzek r0 = r6.zza
            byte[] r0 = r0.zzN()
            r2 = r7
            com.google.android.gms.internal.ads.zzacq r2 = (com.google.android.gms.internal.ads.zzacq) r2
            r2.zzm(r0, r1, r3, r1)
            com.google.android.gms.internal.ads.zzek r0 = r6.zza
            int r0 = r0.zzq()
            int r0 = r0 + (-2)
            r2.zzl(r0, r1)
            int r0 = r6.zza(r7)
            r6.zzd = r0
        L39:
            r2 = 65505(0xffe1, float:9.1792E-41)
            if (r0 != r2) goto L69
            com.google.android.gms.internal.ads.zzacq r7 = (com.google.android.gms.internal.ads.zzacq) r7
            r7.zzl(r3, r1)
            com.google.android.gms.internal.ads.zzek r0 = r6.zza
            r2 = 6
            r0.zzI(r2)
            com.google.android.gms.internal.ads.zzek r0 = r6.zza
            byte[] r0 = r0.zzN()
            r7.zzm(r0, r1, r2, r1)
            com.google.android.gms.internal.ads.zzek r7 = r6.zza
            long r2 = r7.zzu()
            r4 = 1165519206(0x45786966, double:5.758429993E-315)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L69
            com.google.android.gms.internal.ads.zzek r7 = r6.zza
            int r7 = r7.zzq()
            if (r7 != 0) goto L69
            r7 = 1
            return r7
        L69:
            return r1
    }
}
