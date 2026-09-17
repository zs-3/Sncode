package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzanb implements com.google.android.gms.internal.ads.zzamz {
    private static final double[] zza = null;
    private java.lang.String zzb;
    private com.google.android.gms.internal.ads.zzaeh zzc;
    private final com.google.android.gms.internal.ads.zzaoq zzd;
    private final com.google.android.gms.internal.ads.zzek zze;
    private final com.google.android.gms.internal.ads.zzanr zzf;
    private final boolean[] zzg;
    private final com.google.android.gms.internal.ads.zzana zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    static {
            r0 = 8
            double[] r0 = new double[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [4627441868472394375, 4627448617123184640, 4627730092099895296, 4629129031169960744, 4629137466983448576, 4632233691727265792, 4633632630797331240, 4633641066610819072} // fill-array
            com.google.android.gms.internal.ads.zzanb.zza = r0
            return
    }

    public zzanb() {
            r1 = this;
            r0 = 0
            throw r0
    }

    zzanb(com.google.android.gms.internal.ads.zzaoq r3) {
            r2 = this;
            r2.<init>()
            r2.zzd = r3
            r0 = 4
            boolean[] r0 = new boolean[r0]
            r2.zzg = r0
            com.google.android.gms.internal.ads.zzana r0 = new com.google.android.gms.internal.ads.zzana
            r1 = 128(0x80, float:1.794E-43)
            r0.<init>(r1)
            r2.zzh = r0
            if (r3 == 0) goto L24
            com.google.android.gms.internal.ads.zzanr r3 = new com.google.android.gms.internal.ads.zzanr
            r0 = 178(0xb2, float:2.5E-43)
            r3.<init>(r0, r1)
            r2.zzf = r3
            com.google.android.gms.internal.ads.zzek r3 = new com.google.android.gms.internal.ads.zzek
            r3.<init>()
            goto L27
        L24:
            r3 = 0
            r2.zzf = r3
        L27:
            r2.zze = r3
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.zzm = r0
            r2.zzo = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(com.google.android.gms.internal.ads.zzek r21) {
            r20 = this;
            r0 = r20
            com.google.android.gms.internal.ads.zzaeh r1 = r0.zzc
            com.google.android.gms.internal.ads.zzdi.zzb(r1)
            int r1 = r21.zzd()
            int r2 = r21.zze()
            byte[] r3 = r21.zzN()
            long r4 = r0.zzi
            int r6 = r21.zzb()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.zzi = r4
            com.google.android.gms.internal.ads.zzaeh r4 = r0.zzc
            int r5 = r21.zzb()
            r6 = r21
            r4.zzq(r6, r5)
        L28:
            boolean[] r4 = r0.zzg
            int r4 = com.google.android.gms.internal.ads.zzfs.zza(r3, r1, r2, r4)
            if (r4 != r2) goto L41
            boolean r4 = r0.zzk
            if (r4 != 0) goto L39
            com.google.android.gms.internal.ads.zzana r4 = r0.zzh
            r4.zza(r3, r1, r2)
        L39:
            com.google.android.gms.internal.ads.zzanr r4 = r0.zzf
            if (r4 == 0) goto L40
            r4.zza(r3, r1, r2)
        L40:
            return
        L41:
            byte[] r5 = r21.zzN()
            int r7 = r4 + 3
            r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.zzk
            if (r9 != 0) goto L124
            if (r8 <= 0) goto L58
            com.google.android.gms.internal.ads.zzana r9 = r0.zzh
            r9.zza(r3, r1, r4)
        L58:
            if (r8 >= 0) goto L5c
            int r9 = -r8
            goto L5d
        L5c:
            r9 = 0
        L5d:
            com.google.android.gms.internal.ads.zzana r12 = r0.zzh
            boolean r9 = r12.zzc(r5, r9)
            if (r9 == 0) goto L124
            com.google.android.gms.internal.ads.zzana r9 = r0.zzh
            java.lang.String r12 = r0.zzb
            java.util.Objects.requireNonNull(r12)
            byte[] r13 = r9.zzc
            int r14 = r9.zza
            byte[] r13 = java.util.Arrays.copyOf(r13, r14)
            r14 = 4
            r15 = r13[r14]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r16 = 5
            r10 = r13[r16]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r17 = 6
            r11 = r13[r17]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r17 = 7
            r14 = r13[r17]
            r14 = r14 & 240(0xf0, float:3.36E-43)
            r19 = r10 & 15
            r6 = 4
            int r15 = r15 << r6
            int r10 = r10 >> r6
            r10 = r10 | r15
            int r14 = r14 >> r6
            r15 = 8
            int r18 = r19 << 8
            r11 = r18 | r11
            r15 = 2
            if (r14 == r15) goto Lad
            r15 = 3
            if (r14 == r15) goto La8
            if (r14 == r6) goto La3
            r6 = 1065353216(0x3f800000, float:1.0)
            goto Lb4
        La3:
            int r6 = r11 * 121
            int r14 = r10 * 100
            goto Lb1
        La8:
            int r6 = r11 * 16
            int r14 = r10 * 9
            goto Lb1
        Lad:
            int r6 = r11 * 4
            int r14 = r10 * 3
        Lb1:
            float r6 = (float) r6
            float r14 = (float) r14
            float r6 = r6 / r14
        Lb4:
            com.google.android.gms.internal.ads.zzad r14 = new com.google.android.gms.internal.ads.zzad
            r14.<init>()
            r14.zzL(r12)
            java.lang.String r12 = "video/mpeg2"
            r14.zzZ(r12)
            r14.zzae(r10)
            r14.zzJ(r11)
            r14.zzV(r6)
            java.util.List r6 = java.util.Collections.singletonList(r13)
            r14.zzM(r6)
            com.google.android.gms.internal.ads.zzaf r6 = r14.zzaf()
            r10 = r13[r17]
            r10 = r10 & 15
            int r10 = r10 + (-1)
            r11 = 0
            if (r10 < 0) goto L106
            r14 = 8
            if (r10 >= r14) goto L106
            double[] r11 = com.google.android.gms.internal.ads.zzanb.zza
            r10 = r11[r10]
            int r9 = r9.zzb
            int r9 = r9 + 9
            r9 = r13[r9]
            r12 = r9 & 96
            int r12 = r12 >> 5
            r9 = r9 & 31
            if (r12 == r9) goto Lff
            double r12 = (double) r12
            int r9 = r9 + 1
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = r12 + r14
            double r14 = (double) r9
            double r12 = r12 / r14
            double r10 = r10 * r12
        Lff:
            r12 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r12 = r12 / r10
            long r11 = (long) r12
        L106:
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            android.util.Pair r6 = android.util.Pair.create(r6, r9)
            com.google.android.gms.internal.ads.zzaeh r9 = r0.zzc
            java.lang.Object r10 = r6.first
            com.google.android.gms.internal.ads.zzaf r10 = (com.google.android.gms.internal.ads.zzaf) r10
            r9.zzl(r10)
            java.lang.Object r6 = r6.second
            java.lang.Long r6 = (java.lang.Long) r6
            long r9 = r6.longValue()
            r0.zzl = r9
            r6 = 1
            r0.zzk = r6
        L124:
            com.google.android.gms.internal.ads.zzanr r6 = r0.zzf
            r9 = 178(0xb2, float:2.5E-43)
            if (r6 == 0) goto L16c
            if (r8 <= 0) goto L131
            r6.zza(r3, r1, r4)
            r1 = 0
            goto L132
        L131:
            int r1 = -r8
        L132:
            com.google.android.gms.internal.ads.zzanr r6 = r0.zzf
            boolean r1 = r6.zzd(r1)
            if (r1 == 0) goto L158
            com.google.android.gms.internal.ads.zzanr r1 = r0.zzf
            byte[] r6 = r1.zza
            int r1 = r1.zzb
            int r1 = com.google.android.gms.internal.ads.zzfs.zzb(r6, r1)
            com.google.android.gms.internal.ads.zzek r6 = r0.zze
            int r8 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzanr r8 = r0.zzf
            byte[] r8 = r8.zza
            r6.zzJ(r8, r1)
            com.google.android.gms.internal.ads.zzaoq r1 = r0.zzd
            long r10 = r0.zzo
            com.google.android.gms.internal.ads.zzek r6 = r0.zze
            r1.zza(r10, r6)
        L158:
            if (r5 != r9) goto L16c
            byte[] r1 = r21.zzN()
            int r5 = r4 + 2
            r1 = r1[r5]
            r5 = 1
            if (r1 != r5) goto L16a
            com.google.android.gms.internal.ads.zzanr r1 = r0.zzf
            r1.zzc(r9)
        L16a:
            r5 = 178(0xb2, float:2.5E-43)
        L16c:
            if (r5 == 0) goto L17e
            r1 = 179(0xb3, float:2.51E-43)
            if (r5 != r1) goto L173
            goto L17e
        L173:
            r1 = 184(0xb8, float:2.58E-43)
            if (r5 != r1) goto L17a
            r1 = 1
            r0.zzp = r1
        L17a:
            r4 = r2
            r6 = r3
            goto L1e5
        L17e:
            int r1 = r2 - r4
            boolean r4 = r0.zzq
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L1ac
            boolean r4 = r0.zzk
            if (r4 == 0) goto L1ac
            long r9 = r0.zzo
            int r4 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r4 == 0) goto L1ac
            boolean r11 = r0.zzp
            long r12 = r0.zzi
            long r14 = r0.zzn
            long r12 = r12 - r14
            int r4 = (int) r12
            int r12 = r4 - r1
            com.google.android.gms.internal.ads.zzaeh r8 = r0.zzc
            r14 = 0
            r13 = r1
            r4 = r2
            r6 = r3
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8.zzs(r9, r11, r12, r13, r14)
            goto L1af
        L1ac:
            r4 = r2
            r6 = r3
            r2 = r14
        L1af:
            boolean r8 = r0.zzj
            if (r8 == 0) goto L1bb
            boolean r8 = r0.zzq
            if (r8 == 0) goto L1b8
            goto L1bb
        L1b8:
            r1 = 0
            r2 = 1
            goto L1de
        L1bb:
            long r8 = r0.zzi
            long r10 = (long) r1
            long r8 = r8 - r10
            r0.zzn = r8
            long r14 = r0.zzm
            int r1 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r1 == 0) goto L1c8
            goto L1d4
        L1c8:
            long r8 = r0.zzo
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 == 0) goto L1d3
            long r10 = r0.zzl
            long r14 = r8 + r10
            goto L1d4
        L1d3:
            r14 = r2
        L1d4:
            r0.zzo = r14
            r1 = 0
            r0.zzp = r1
            r0.zzm = r2
            r2 = 1
            r0.zzj = r2
        L1de:
            if (r5 != 0) goto L1e2
            r10 = 1
            goto L1e3
        L1e2:
            r10 = 0
        L1e3:
            r0.zzq = r10
        L1e5:
            r2 = r4
            r3 = r6
            r1 = r7
            r6 = r21
            goto L28
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(com.google.android.gms.internal.ads.zzade r3, com.google.android.gms.internal.ads.zzaon r4) {
            r2 = this;
            r4.zzc()
            java.lang.String r0 = r4.zzb()
            r2.zzb = r0
            int r0 = r4.zza()
            r1 = 2
            com.google.android.gms.internal.ads.zzaeh r0 = r3.zzw(r0, r1)
            r2.zzc = r0
            com.google.android.gms.internal.ads.zzaoq r0 = r2.zzd
            if (r0 == 0) goto L1b
            r0.zzb(r3, r4)
        L1b:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean r9) {
            r8 = this;
            com.google.android.gms.internal.ads.zzaeh r0 = r8.zzc
            com.google.android.gms.internal.ads.zzdi.zzb(r0)
            if (r9 == 0) goto L19
            boolean r4 = r8.zzp
            long r0 = r8.zzi
            long r2 = r8.zzn
            long r0 = r0 - r2
            com.google.android.gms.internal.ads.zzaeh r9 = r8.zzc
            long r2 = r8.zzo
            int r5 = (int) r0
            r6 = 0
            r7 = 0
            r1 = r9
            r1.zzs(r2, r4, r5, r6, r7)
        L19:
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
            boolean[] r0 = r2.zzg
            com.google.android.gms.internal.ads.zzfs.zzh(r0)
            com.google.android.gms.internal.ads.zzana r0 = r2.zzh
            r0.zzb()
            com.google.android.gms.internal.ads.zzanr r0 = r2.zzf
            if (r0 == 0) goto L11
            r0.zzb()
        L11:
            r0 = 0
            r2.zzi = r0
            r0 = 0
            r2.zzj = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.zzm = r0
            r2.zzo = r0
            return
    }
}
