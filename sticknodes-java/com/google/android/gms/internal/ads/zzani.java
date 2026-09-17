package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzani implements com.google.android.gms.internal.ads.zzamz {
    private final com.google.android.gms.internal.ads.zzaod zza;
    private java.lang.String zzb;
    private com.google.android.gms.internal.ads.zzaeh zzc;
    private com.google.android.gms.internal.ads.zzanh zzd;
    private boolean zze;
    private final boolean[] zzf;
    private final com.google.android.gms.internal.ads.zzanr zzg;
    private final com.google.android.gms.internal.ads.zzanr zzh;
    private final com.google.android.gms.internal.ads.zzanr zzi;
    private final com.google.android.gms.internal.ads.zzanr zzj;
    private final com.google.android.gms.internal.ads.zzanr zzk;
    private long zzl;
    private long zzm;
    private final com.google.android.gms.internal.ads.zzek zzn;

    public zzani(com.google.android.gms.internal.ads.zzaod r3) {
            r2 = this;
            r2.<init>()
            r2.zza = r3
            r3 = 3
            boolean[] r3 = new boolean[r3]
            r2.zzf = r3
            com.google.android.gms.internal.ads.zzanr r3 = new com.google.android.gms.internal.ads.zzanr
            r0 = 32
            r1 = 128(0x80, float:1.794E-43)
            r3.<init>(r0, r1)
            r2.zzg = r3
            com.google.android.gms.internal.ads.zzanr r3 = new com.google.android.gms.internal.ads.zzanr
            r0 = 33
            r3.<init>(r0, r1)
            r2.zzh = r3
            com.google.android.gms.internal.ads.zzanr r3 = new com.google.android.gms.internal.ads.zzanr
            r0 = 34
            r3.<init>(r0, r1)
            r2.zzi = r3
            com.google.android.gms.internal.ads.zzanr r3 = new com.google.android.gms.internal.ads.zzanr
            r0 = 39
            r3.<init>(r0, r1)
            r2.zzj = r3
            com.google.android.gms.internal.ads.zzanr r3 = new com.google.android.gms.internal.ads.zzanr
            r0 = 40
            r3.<init>(r0, r1)
            r2.zzk = r3
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.zzm = r0
            com.google.android.gms.internal.ads.zzek r3 = new com.google.android.gms.internal.ads.zzek
            r3.<init>()
            r2.zzn = r3
            return
    }

    private final void zzf(byte[] r2, int r3, int r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzanh r0 = r1.zzd
            r0.zzc(r2, r3, r4)
            boolean r0 = r1.zze
            if (r0 != 0) goto L18
            com.google.android.gms.internal.ads.zzanr r0 = r1.zzg
            r0.zza(r2, r3, r4)
            com.google.android.gms.internal.ads.zzanr r0 = r1.zzh
            r0.zza(r2, r3, r4)
            com.google.android.gms.internal.ads.zzanr r0 = r1.zzi
            r0.zza(r2, r3, r4)
        L18:
            com.google.android.gms.internal.ads.zzanr r0 = r1.zzj
            r0.zza(r2, r3, r4)
            com.google.android.gms.internal.ads.zzanr r0 = r1.zzk
            r0.zza(r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(com.google.android.gms.internal.ads.zzek r29) {
            r28 = this;
            r0 = r28
            com.google.android.gms.internal.ads.zzaeh r1 = r0.zzc
            com.google.android.gms.internal.ads.zzdi.zzb(r1)
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
        L9:
            int r1 = r29.zzb()
            if (r1 <= 0) goto L1e7
            int r1 = r29.zzd()
            int r2 = r29.zze()
            byte[] r3 = r29.zzN()
            long r4 = r0.zzl
            int r6 = r29.zzb()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.zzl = r4
            com.google.android.gms.internal.ads.zzaeh r4 = r0.zzc
            int r5 = r29.zzb()
            r6 = r29
            r4.zzq(r6, r5)
        L30:
            if (r1 >= r2) goto L9
            boolean[] r4 = r0.zzf
            int r4 = com.google.android.gms.internal.ads.zzfs.zza(r3, r1, r2, r4)
            if (r4 == r2) goto L1e4
            int r5 = r4 + 3
            r7 = r3[r5]
            r7 = r7 & 126(0x7e, float:1.77E-43)
            int r8 = r4 - r1
            if (r8 <= 0) goto L47
            r0.zzf(r3, r1, r4)
        L47:
            int r12 = r2 - r4
            long r9 = r0.zzl
            long r13 = (long) r12
            long r10 = r9 - r13
            if (r8 >= 0) goto L52
            int r4 = -r8
            goto L53
        L52:
            r4 = 0
        L53:
            long r8 = r0.zzm
            com.google.android.gms.internal.ads.zzanh r13 = r0.zzd
            boolean r14 = r0.zze
            r13.zzb(r10, r12, r14)
            boolean r13 = r0.zze
            if (r13 != 0) goto L155
            com.google.android.gms.internal.ads.zzanr r13 = r0.zzg
            r13.zzd(r4)
            com.google.android.gms.internal.ads.zzanr r13 = r0.zzh
            r13.zzd(r4)
            com.google.android.gms.internal.ads.zzanr r13 = r0.zzi
            r13.zzd(r4)
            com.google.android.gms.internal.ads.zzanr r13 = r0.zzg
            boolean r15 = r13.zze()
            if (r15 == 0) goto L155
            com.google.android.gms.internal.ads.zzanr r15 = r0.zzh
            boolean r16 = r15.zze()
            if (r16 == 0) goto L155
            com.google.android.gms.internal.ads.zzanr r14 = r0.zzi
            boolean r17 = r14.zze()
            if (r17 == 0) goto L155
            java.lang.String r1 = r0.zzb
            r18 = r5
            int r5 = r13.zzb
            int r6 = r15.zzb
            int r6 = r6 + r5
            r19 = r2
            int r2 = r14.zzb
            int r6 = r6 + r2
            byte[] r2 = new byte[r6]
            byte[] r6 = r13.zza
            r20 = r3
            r3 = 0
            java.lang.System.arraycopy(r6, r3, r2, r3, r5)
            byte[] r5 = r15.zza
            int r6 = r13.zzb
            r17 = r12
            int r12 = r15.zzb
            java.lang.System.arraycopy(r5, r3, r2, r6, r12)
            byte[] r5 = r14.zza
            int r6 = r13.zzb
            int r12 = r15.zzb
            int r6 = r6 + r12
            int r12 = r14.zzb
            java.lang.System.arraycopy(r5, r3, r2, r6, r12)
            byte[] r5 = r15.zza
            int r6 = r15.zzb
            r12 = 3
            r13 = 0
            com.google.android.gms.internal.ads.zzfm r5 = com.google.android.gms.internal.ads.zzfs.zzc(r5, r12, r6, r13)
            com.google.android.gms.internal.ads.zzfh r6 = r5.zza
            if (r6 == 0) goto Le0
            int r12 = r6.zzf
            int[] r13 = r6.zze
            int r14 = r6.zzd
            int r15 = r6.zzc
            boolean r3 = r6.zzb
            int r6 = r6.zza
            r21 = r6
            r22 = r3
            r23 = r15
            r24 = r14
            r25 = r13
            r26 = r12
            java.lang.String r13 = com.google.android.gms.internal.ads.zzdk.zzb(r21, r22, r23, r24, r25, r26)
        Le0:
            com.google.android.gms.internal.ads.zzad r3 = new com.google.android.gms.internal.ads.zzad
            r3.<init>()
            r3.zzL(r1)
            java.lang.String r1 = "video/hevc"
            r3.zzZ(r1)
            r3.zzA(r13)
            int r1 = r5.zzd
            r3.zzae(r1)
            int r1 = r5.zze
            r3.zzJ(r1)
            com.google.android.gms.internal.ads.zzm r1 = new com.google.android.gms.internal.ads.zzm
            r1.<init>()
            int r6 = r5.zzh
            r1.zzc(r6)
            int r6 = r5.zzi
            r1.zzb(r6)
            int r6 = r5.zzj
            r1.zzd(r6)
            int r6 = r5.zzb
            int r6 = r6 + 8
            r1.zzf(r6)
            int r6 = r5.zzc
            int r6 = r6 + 8
            r1.zza(r6)
            com.google.android.gms.internal.ads.zzo r1 = r1.zzg()
            r3.zzB(r1)
            float r1 = r5.zzf
            r3.zzV(r1)
            int r1 = r5.zzg
            r3.zzR(r1)
            java.util.List r1 = java.util.Collections.singletonList(r2)
            r3.zzM(r1)
            com.google.android.gms.internal.ads.zzaf r1 = r3.zzaf()
            com.google.android.gms.internal.ads.zzaeh r2 = r0.zzc
            r2.zzl(r1)
            int r2 = r1.zzp
            r3 = -1
            if (r2 == r3) goto L145
            r27 = 1
            goto L147
        L145:
            r27 = 0
        L147:
            com.google.android.gms.internal.ads.zzfxz.zzj(r27)
            com.google.android.gms.internal.ads.zzaod r2 = r0.zza
            int r1 = r1.zzp
            r2.zze(r1)
            r1 = 1
            r0.zze = r1
            goto L15d
        L155:
            r19 = r2
            r20 = r3
            r18 = r5
            r17 = r12
        L15d:
            com.google.android.gms.internal.ads.zzanr r1 = r0.zzj
            boolean r1 = r1.zzd(r4)
            r2 = 5
            if (r1 == 0) goto L185
            com.google.android.gms.internal.ads.zzanr r1 = r0.zzj
            byte[] r3 = r1.zza
            int r1 = r1.zzb
            int r1 = com.google.android.gms.internal.ads.zzfs.zzb(r3, r1)
            com.google.android.gms.internal.ads.zzek r3 = r0.zzn
            com.google.android.gms.internal.ads.zzanr r5 = r0.zzj
            byte[] r5 = r5.zza
            r3.zzJ(r5, r1)
            com.google.android.gms.internal.ads.zzek r1 = r0.zzn
            r1.zzM(r2)
            com.google.android.gms.internal.ads.zzaod r1 = r0.zza
            com.google.android.gms.internal.ads.zzek r3 = r0.zzn
            r1.zza(r8, r3)
        L185:
            com.google.android.gms.internal.ads.zzanr r1 = r0.zzk
            boolean r1 = r1.zzd(r4)
            if (r1 == 0) goto L1ac
            com.google.android.gms.internal.ads.zzanr r1 = r0.zzk
            byte[] r3 = r1.zza
            int r1 = r1.zzb
            int r1 = com.google.android.gms.internal.ads.zzfs.zzb(r3, r1)
            com.google.android.gms.internal.ads.zzek r3 = r0.zzn
            com.google.android.gms.internal.ads.zzanr r4 = r0.zzk
            byte[] r4 = r4.zza
            r3.zzJ(r4, r1)
            com.google.android.gms.internal.ads.zzek r1 = r0.zzn
            r1.zzM(r2)
            com.google.android.gms.internal.ads.zzaod r1 = r0.zza
            com.google.android.gms.internal.ads.zzek r2 = r0.zzn
            r1.zza(r8, r2)
        L1ac:
            r1 = 1
            int r1 = r7 >> 1
            long r14 = r0.zzm
            com.google.android.gms.internal.ads.zzanh r9 = r0.zzd
            boolean r2 = r0.zze
            r12 = r17
            r13 = r1
            r16 = r2
            r9.zze(r10, r12, r13, r14, r16)
            boolean r2 = r0.zze
            if (r2 != 0) goto L1d0
            com.google.android.gms.internal.ads.zzanr r2 = r0.zzg
            r2.zzc(r1)
            com.google.android.gms.internal.ads.zzanr r2 = r0.zzh
            r2.zzc(r1)
            com.google.android.gms.internal.ads.zzanr r2 = r0.zzi
            r2.zzc(r1)
        L1d0:
            com.google.android.gms.internal.ads.zzanr r2 = r0.zzj
            r2.zzc(r1)
            com.google.android.gms.internal.ads.zzanr r2 = r0.zzk
            r2.zzc(r1)
            r6 = r29
            r1 = r18
            r2 = r19
            r3 = r20
            goto L30
        L1e4:
            r0.zzf(r3, r1, r2)
        L1e7:
            return
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
            com.google.android.gms.internal.ads.zzanh r1 = new com.google.android.gms.internal.ads.zzanh
            r1.<init>(r0)
            r2.zzd = r1
            com.google.android.gms.internal.ads.zzaod r0 = r2.zza
            r0.zzb(r3, r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzaeh r0 = r2.zzc
            com.google.android.gms.internal.ads.zzdi.zzb(r0)
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            if (r3 == 0) goto L15
            com.google.android.gms.internal.ads.zzaod r3 = r2.zza
            r3.zzc()
            com.google.android.gms.internal.ads.zzanh r3 = r2.zzd
            long r0 = r2.zzl
            r3.zza(r0)
        L15:
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
            r2.zzl = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.zzm = r0
            boolean[] r0 = r2.zzf
            com.google.android.gms.internal.ads.zzfs.zzh(r0)
            com.google.android.gms.internal.ads.zzanr r0 = r2.zzg
            r0.zzb()
            com.google.android.gms.internal.ads.zzanr r0 = r2.zzh
            r0.zzb()
            com.google.android.gms.internal.ads.zzanr r0 = r2.zzi
            r0.zzb()
            com.google.android.gms.internal.ads.zzanr r0 = r2.zzj
            r0.zzb()
            com.google.android.gms.internal.ads.zzanr r0 = r2.zzk
            r0.zzb()
            com.google.android.gms.internal.ads.zzaod r0 = r2.zza
            r0.zzc()
            com.google.android.gms.internal.ads.zzanh r0 = r2.zzd
            if (r0 == 0) goto L35
            r0.zzd()
        L35:
            return
    }
}
