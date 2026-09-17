package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzane implements com.google.android.gms.internal.ads.zzamz {
    private static final float[] zza = null;
    private final com.google.android.gms.internal.ads.zzaoq zzb;
    private final com.google.android.gms.internal.ads.zzek zzc;
    private final boolean[] zzd;
    private final com.google.android.gms.internal.ads.zzanc zze;
    private final com.google.android.gms.internal.ads.zzanr zzf;
    private com.google.android.gms.internal.ads.zzand zzg;
    private long zzh;
    private java.lang.String zzi;
    private com.google.android.gms.internal.ads.zzaeh zzj;
    private boolean zzk;
    private long zzl;

    static {
            r0 = 7
            float[] r0 = new float[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [1065353216, 1065353216, 1066115817, 1063828015, 1069166220, 1067132618, 1065353216} // fill-array
            com.google.android.gms.internal.ads.zzane.zza = r0
            return
    }

    public zzane() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    zzane(com.google.android.gms.internal.ads.zzaoq r5) {
            r4 = this;
            r4.<init>()
            r4.zzb = r5
            r0 = 4
            boolean[] r0 = new boolean[r0]
            r4.zzd = r0
            com.google.android.gms.internal.ads.zzanc r0 = new com.google.android.gms.internal.ads.zzanc
            r1 = 128(0x80, float:1.794E-43)
            r0.<init>(r1)
            r4.zze = r0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.zzl = r2
            if (r5 == 0) goto L2d
            com.google.android.gms.internal.ads.zzanr r5 = new com.google.android.gms.internal.ads.zzanr
            r0 = 178(0xb2, float:2.5E-43)
            r5.<init>(r0, r1)
            r4.zzf = r5
            com.google.android.gms.internal.ads.zzek r5 = new com.google.android.gms.internal.ads.zzek
            r5.<init>()
        L2a:
            r4.zzc = r5
            return
        L2d:
            r5 = 0
            r4.zzf = r5
            goto L2a
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(com.google.android.gms.internal.ads.zzek r18) {
            r17 = this;
            r0 = r17
            com.google.android.gms.internal.ads.zzand r1 = r0.zzg
            com.google.android.gms.internal.ads.zzdi.zzb(r1)
            com.google.android.gms.internal.ads.zzaeh r1 = r0.zzj
            com.google.android.gms.internal.ads.zzdi.zzb(r1)
            int r1 = r18.zzd()
            int r2 = r18.zze()
            byte[] r3 = r18.zzN()
            long r4 = r0.zzh
            int r6 = r18.zzb()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.zzh = r4
            com.google.android.gms.internal.ads.zzaeh r4 = r0.zzj
            int r5 = r18.zzb()
            r6 = r18
            r4.zzq(r6, r5)
        L2d:
            boolean[] r4 = r0.zzd
            int r4 = com.google.android.gms.internal.ads.zzfs.zza(r3, r1, r2, r4)
            if (r4 != r2) goto L4b
            boolean r4 = r0.zzk
            if (r4 != 0) goto L3e
            com.google.android.gms.internal.ads.zzanc r4 = r0.zze
            r4.zza(r3, r1, r2)
        L3e:
            com.google.android.gms.internal.ads.zzand r4 = r0.zzg
            r4.zza(r3, r1, r2)
            com.google.android.gms.internal.ads.zzanr r4 = r0.zzf
            if (r4 == 0) goto L4a
            r4.zza(r3, r1, r2)
        L4a:
            return
        L4b:
            byte[] r5 = r18.zzN()
            int r7 = r4 + 3
            r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.zzk
            if (r9 != 0) goto L180
            if (r8 <= 0) goto L62
            com.google.android.gms.internal.ads.zzanc r9 = r0.zze
            r9.zza(r3, r1, r4)
        L62:
            if (r8 >= 0) goto L66
            int r9 = -r8
            goto L67
        L66:
            r9 = 0
        L67:
            com.google.android.gms.internal.ads.zzanc r12 = r0.zze
            boolean r9 = r12.zzc(r5, r9)
            if (r9 == 0) goto L180
            com.google.android.gms.internal.ads.zzaeh r9 = r0.zzj
            com.google.android.gms.internal.ads.zzanc r12 = r0.zze
            int r13 = r12.zzb
            java.lang.String r14 = r0.zzi
            java.util.Objects.requireNonNull(r14)
            byte[] r15 = r12.zzc
            int r12 = r12.zza
            byte[] r12 = java.util.Arrays.copyOf(r15, r12)
            com.google.android.gms.internal.ads.zzej r15 = new com.google.android.gms.internal.ads.zzej
            int r10 = r12.length
            r15.<init>(r12, r10)
            r15.zzo(r13)
            r10 = 4
            r15.zzo(r10)
            r15.zzm()
            r13 = 8
            r15.zzn(r13)
            boolean r16 = r15.zzp()
            r11 = 3
            if (r16 == 0) goto La4
            r15.zzn(r10)
            r15.zzn(r11)
        La4:
            int r10 = r15.zzd(r10)
            r16 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r11 = "Invalid aspect ratio"
            java.lang.String r13 = "H263Reader"
            r6 = 15
            if (r10 != r6) goto Lc7
            r6 = 8
            int r10 = r15.zzd(r6)
            int r6 = r15.zzd(r6)
            if (r6 != 0) goto Lc2
            com.google.android.gms.internal.ads.zzea.zzf(r13, r11)
            goto Ld4
        Lc2:
            float r10 = (float) r10
            float r6 = (float) r6
            float r16 = r10 / r6
            goto Lce
        Lc7:
            r6 = 7
            if (r10 >= r6) goto Ld1
            float[] r6 = com.google.android.gms.internal.ads.zzane.zza
            r16 = r6[r10]
        Lce:
            r6 = r16
            goto Ld6
        Ld1:
            com.google.android.gms.internal.ads.zzea.zzf(r13, r11)
        Ld4:
            r6 = 1065353216(0x3f800000, float:1.0)
        Ld6:
            boolean r10 = r15.zzp()
            r11 = 2
            if (r10 == 0) goto L110
            r15.zzn(r11)
            r10 = 1
            r15.zzn(r10)
            boolean r10 = r15.zzp()
            if (r10 == 0) goto L110
            r10 = 15
            r15.zzn(r10)
            r15.zzm()
            r15.zzn(r10)
            r15.zzm()
            r15.zzn(r10)
            r15.zzm()
            r11 = 3
            r15.zzn(r11)
            r11 = 11
            r15.zzn(r11)
            r15.zzm()
            r15.zzn(r10)
            r15.zzm()
        L110:
            r10 = 2
            int r10 = r15.zzd(r10)
            if (r10 == 0) goto L11c
            java.lang.String r10 = "Unhandled video object layer shape"
            com.google.android.gms.internal.ads.zzea.zzf(r13, r10)
        L11c:
            r15.zzm()
            r10 = 16
            int r10 = r15.zzd(r10)
            r15.zzm()
            boolean r11 = r15.zzp()
            if (r11 == 0) goto L143
            if (r10 != 0) goto L136
            java.lang.String r10 = "Invalid vop_increment_time_resolution"
            com.google.android.gms.internal.ads.zzea.zzf(r13, r10)
            goto L143
        L136:
            int r10 = r10 + (-1)
            r11 = 0
        L139:
            if (r10 <= 0) goto L140
            int r10 = r10 >> 1
            int r11 = r11 + 1
            goto L139
        L140:
            r15.zzn(r11)
        L143:
            r15.zzm()
            r10 = 13
            int r11 = r15.zzd(r10)
            r15.zzm()
            int r10 = r15.zzd(r10)
            r15.zzm()
            r15.zzm()
            com.google.android.gms.internal.ads.zzad r13 = new com.google.android.gms.internal.ads.zzad
            r13.<init>()
            r13.zzL(r14)
            java.lang.String r14 = "video/mp4v-es"
            r13.zzZ(r14)
            r13.zzae(r11)
            r13.zzJ(r10)
            r13.zzV(r6)
            java.util.List r6 = java.util.Collections.singletonList(r12)
            r13.zzM(r6)
            com.google.android.gms.internal.ads.zzaf r6 = r13.zzaf()
            r9.zzl(r6)
            r6 = 1
            r0.zzk = r6
        L180:
            com.google.android.gms.internal.ads.zzand r6 = r0.zzg
            r6.zza(r3, r1, r4)
            com.google.android.gms.internal.ads.zzanr r6 = r0.zzf
            r9 = 178(0xb2, float:2.5E-43)
            if (r6 == 0) goto L1cd
            if (r8 <= 0) goto L192
            r6.zza(r3, r1, r4)
            r10 = 0
            goto L193
        L192:
            int r10 = -r8
        L193:
            com.google.android.gms.internal.ads.zzanr r1 = r0.zzf
            boolean r1 = r1.zzd(r10)
            if (r1 == 0) goto L1b9
            com.google.android.gms.internal.ads.zzanr r1 = r0.zzf
            byte[] r6 = r1.zza
            int r1 = r1.zzb
            int r1 = com.google.android.gms.internal.ads.zzfs.zzb(r6, r1)
            com.google.android.gms.internal.ads.zzek r6 = r0.zzc
            int r8 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzanr r8 = r0.zzf
            byte[] r8 = r8.zza
            r6.zzJ(r8, r1)
            com.google.android.gms.internal.ads.zzaoq r1 = r0.zzb
            long r10 = r0.zzl
            com.google.android.gms.internal.ads.zzek r6 = r0.zzc
            r1.zza(r10, r6)
        L1b9:
            if (r5 != r9) goto L1cd
            byte[] r1 = r18.zzN()
            int r5 = r4 + 2
            r1 = r1[r5]
            r5 = 1
            if (r1 != r5) goto L1cb
            com.google.android.gms.internal.ads.zzanr r1 = r0.zzf
            r1.zzc(r9)
        L1cb:
            r5 = 178(0xb2, float:2.5E-43)
        L1cd:
            int r1 = r2 - r4
            long r8 = r0.zzh
            long r10 = (long) r1
            long r8 = r8 - r10
            com.google.android.gms.internal.ads.zzand r4 = r0.zzg
            boolean r6 = r0.zzk
            r4.zzb(r8, r1, r6)
            com.google.android.gms.internal.ads.zzand r1 = r0.zzg
            long r8 = r0.zzl
            r1.zzc(r5, r8)
            r6 = r18
            r1 = r7
            goto L2d
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(com.google.android.gms.internal.ads.zzade r3, com.google.android.gms.internal.ads.zzaon r4) {
            r2 = this;
            r4.zzc()
            java.lang.String r0 = r4.zzb()
            r2.zzi = r0
            int r0 = r4.zza()
            r1 = 2
            com.google.android.gms.internal.ads.zzaeh r0 = r3.zzw(r0, r1)
            r2.zzj = r0
            com.google.android.gms.internal.ads.zzand r1 = new com.google.android.gms.internal.ads.zzand
            r1.<init>(r0)
            r2.zzg = r1
            com.google.android.gms.internal.ads.zzaoq r0 = r2.zzb
            if (r0 == 0) goto L22
            r0.zzb(r3, r4)
        L22:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean r5) {
            r4 = this;
            com.google.android.gms.internal.ads.zzand r0 = r4.zzg
            com.google.android.gms.internal.ads.zzdi.zzb(r0)
            if (r5 == 0) goto L16
            com.google.android.gms.internal.ads.zzand r5 = r4.zzg
            long r0 = r4.zzh
            r2 = 0
            boolean r3 = r4.zzk
            r5.zzb(r0, r2, r3)
            com.google.android.gms.internal.ads.zzand r5 = r4.zzg
            r5.zzd()
        L16:
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
            r2 = this;
            boolean[] r0 = r2.zzd
            com.google.android.gms.internal.ads.zzfs.zzh(r0)
            com.google.android.gms.internal.ads.zzanc r0 = r2.zze
            r0.zzb()
            com.google.android.gms.internal.ads.zzand r0 = r2.zzg
            if (r0 == 0) goto L11
            r0.zzd()
        L11:
            com.google.android.gms.internal.ads.zzanr r0 = r2.zzf
            if (r0 == 0) goto L18
            r0.zzb()
        L18:
            r0 = 0
            r2.zzh = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.zzl = r0
            return
    }
}
