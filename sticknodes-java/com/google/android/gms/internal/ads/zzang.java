package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzang implements com.google.android.gms.internal.ads.zzamz {
    private final com.google.android.gms.internal.ads.zzaod zza;
    private final com.google.android.gms.internal.ads.zzanr zzb;
    private final com.google.android.gms.internal.ads.zzanr zzc;
    private final com.google.android.gms.internal.ads.zzanr zzd;
    private long zze;
    private final boolean[] zzf;
    private java.lang.String zzg;
    private com.google.android.gms.internal.ads.zzaeh zzh;
    private com.google.android.gms.internal.ads.zzanf zzi;
    private boolean zzj;
    private long zzk;
    private boolean zzl;
    private final com.google.android.gms.internal.ads.zzek zzm;

    public zzang(com.google.android.gms.internal.ads.zzaod r1, boolean r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r1 = 3
            boolean[] r1 = new boolean[r1]
            r0.zzf = r1
            com.google.android.gms.internal.ads.zzanr r1 = new com.google.android.gms.internal.ads.zzanr
            r2 = 7
            r3 = 128(0x80, float:1.794E-43)
            r1.<init>(r2, r3)
            r0.zzb = r1
            com.google.android.gms.internal.ads.zzanr r1 = new com.google.android.gms.internal.ads.zzanr
            r2 = 8
            r1.<init>(r2, r3)
            r0.zzc = r1
            com.google.android.gms.internal.ads.zzanr r1 = new com.google.android.gms.internal.ads.zzanr
            r2 = 6
            r1.<init>(r2, r3)
            r0.zzd = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zzk = r1
            com.google.android.gms.internal.ads.zzek r1 = new com.google.android.gms.internal.ads.zzek
            r1.<init>()
            r0.zzm = r1
            return
    }

    private final void zzf(byte[] r2, int r3, int r4) {
            r1 = this;
            boolean r0 = r1.zzj
            if (r0 != 0) goto Le
            com.google.android.gms.internal.ads.zzanr r0 = r1.zzb
            r0.zza(r2, r3, r4)
            com.google.android.gms.internal.ads.zzanr r0 = r1.zzc
            r0.zza(r2, r3, r4)
        Le:
            com.google.android.gms.internal.ads.zzanr r0 = r1.zzd
            r0.zza(r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(com.google.android.gms.internal.ads.zzek r19) {
            r18 = this;
            r0 = r18
            com.google.android.gms.internal.ads.zzaeh r1 = r0.zzh
            com.google.android.gms.internal.ads.zzdi.zzb(r1)
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            int r1 = r19.zzd()
            int r2 = r19.zze()
            byte[] r3 = r19.zzN()
            long r4 = r0.zze
            int r6 = r19.zzb()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.zze = r4
            com.google.android.gms.internal.ads.zzaeh r4 = r0.zzh
            int r5 = r19.zzb()
            r6 = r19
            r4.zzq(r6, r5)
        L2a:
            boolean[] r4 = r0.zzf
            int r4 = com.google.android.gms.internal.ads.zzfs.zza(r3, r1, r2, r4)
            if (r4 == r2) goto L1c3
            int r5 = r4 + 3
            r6 = r3[r5]
            r10 = r6 & 31
            int r6 = r4 - r1
            if (r6 <= 0) goto L3f
            r0.zzf(r3, r1, r4)
        L3f:
            int r1 = r2 - r4
            long r7 = r0.zze
            long r11 = (long) r1
            long r8 = r7 - r11
            if (r6 >= 0) goto L4a
            int r6 = -r6
            goto L4b
        L4a:
            r6 = 0
        L4b:
            long r11 = r0.zzk
            boolean r7 = r0.zzj
            r13 = 4
            if (r7 == 0) goto L58
        L52:
            r17 = r2
            r16 = r5
            goto L16c
        L58:
            com.google.android.gms.internal.ads.zzanr r7 = r0.zzb
            r7.zzd(r6)
            com.google.android.gms.internal.ads.zzanr r7 = r0.zzc
            r7.zzd(r6)
            boolean r7 = r0.zzj
            if (r7 != 0) goto L12a
            com.google.android.gms.internal.ads.zzanr r7 = r0.zzb
            boolean r7 = r7.zze()
            if (r7 == 0) goto L52
            com.google.android.gms.internal.ads.zzanr r7 = r0.zzc
            boolean r7 = r7.zze()
            if (r7 == 0) goto L52
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            com.google.android.gms.internal.ads.zzanr r14 = r0.zzb
            byte[] r15 = r14.zza
            int r14 = r14.zzb
            byte[] r14 = java.util.Arrays.copyOf(r15, r14)
            r7.add(r14)
            com.google.android.gms.internal.ads.zzanr r14 = r0.zzc
            byte[] r15 = r14.zza
            int r14 = r14.zzb
            byte[] r14 = java.util.Arrays.copyOf(r15, r14)
            r7.add(r14)
            com.google.android.gms.internal.ads.zzanr r14 = r0.zzb
            byte[] r15 = r14.zza
            int r14 = r14.zzb
            com.google.android.gms.internal.ads.zzfr r14 = com.google.android.gms.internal.ads.zzfs.zzf(r15, r13, r14)
            com.google.android.gms.internal.ads.zzanr r15 = r0.zzc
            byte[] r4 = r15.zza
            int r15 = r15.zzb
            com.google.android.gms.internal.ads.zzfq r4 = com.google.android.gms.internal.ads.zzfs.zze(r4, r13, r15)
            int r15 = r14.zza
            int r13 = r14.zzb
            r16 = r5
            int r5 = r14.zzc
            java.lang.String r5 = com.google.android.gms.internal.ads.zzdk.zza(r15, r13, r5)
            com.google.android.gms.internal.ads.zzaeh r13 = r0.zzh
            com.google.android.gms.internal.ads.zzad r15 = new com.google.android.gms.internal.ads.zzad
            r15.<init>()
            r17 = r2
            java.lang.String r2 = r0.zzg
            r15.zzL(r2)
            java.lang.String r2 = "video/avc"
            r15.zzZ(r2)
            r15.zzA(r5)
            int r2 = r14.zze
            r15.zzae(r2)
            int r2 = r14.zzf
            r15.zzJ(r2)
            com.google.android.gms.internal.ads.zzm r2 = new com.google.android.gms.internal.ads.zzm
            r2.<init>()
            int r5 = r14.zzj
            r2.zzc(r5)
            int r5 = r14.zzk
            r2.zzb(r5)
            int r5 = r14.zzl
            r2.zzd(r5)
            int r5 = r14.zzh
            int r5 = r5 + 8
            r2.zzf(r5)
            int r5 = r14.zzi
            int r5 = r5 + 8
            r2.zza(r5)
            com.google.android.gms.internal.ads.zzo r2 = r2.zzg()
            r15.zzB(r2)
            float r2 = r14.zzg
            r15.zzV(r2)
            r15.zzM(r7)
            int r2 = r14.zzm
            r15.zzR(r2)
            com.google.android.gms.internal.ads.zzaf r2 = r15.zzaf()
            r13.zzl(r2)
            r2 = 1
            r0.zzj = r2
            com.google.android.gms.internal.ads.zzanf r2 = r0.zzi
            r2.zzc(r14)
            com.google.android.gms.internal.ads.zzanf r2 = r0.zzi
            r2.zzb(r4)
            com.google.android.gms.internal.ads.zzanr r2 = r0.zzb
            r2.zzb()
            com.google.android.gms.internal.ads.zzanr r2 = r0.zzc
            r2.zzb()
            goto L16c
        L12a:
            r17 = r2
            r16 = r5
            com.google.android.gms.internal.ads.zzanr r2 = r0.zzb
            boolean r4 = r2.zze()
            if (r4 == 0) goto L151
            byte[] r4 = r2.zza
            int r2 = r2.zzb
            r5 = 4
            com.google.android.gms.internal.ads.zzfr r2 = com.google.android.gms.internal.ads.zzfs.zzf(r4, r5, r2)
            com.google.android.gms.internal.ads.zzaod r4 = r0.zza
            int r5 = r2.zzm
            r4.zze(r5)
            com.google.android.gms.internal.ads.zzanf r4 = r0.zzi
            r4.zzc(r2)
            com.google.android.gms.internal.ads.zzanr r2 = r0.zzb
            r2.zzb()
            goto L16c
        L151:
            com.google.android.gms.internal.ads.zzanr r2 = r0.zzc
            boolean r4 = r2.zze()
            if (r4 == 0) goto L16c
            byte[] r4 = r2.zza
            int r2 = r2.zzb
            r5 = 4
            com.google.android.gms.internal.ads.zzfq r2 = com.google.android.gms.internal.ads.zzfs.zze(r4, r5, r2)
            com.google.android.gms.internal.ads.zzanf r4 = r0.zzi
            r4.zzb(r2)
            com.google.android.gms.internal.ads.zzanr r2 = r0.zzc
            r2.zzb()
        L16c:
            com.google.android.gms.internal.ads.zzanr r2 = r0.zzd
            boolean r2 = r2.zzd(r6)
            if (r2 == 0) goto L194
            com.google.android.gms.internal.ads.zzanr r2 = r0.zzd
            byte[] r4 = r2.zza
            int r2 = r2.zzb
            int r2 = com.google.android.gms.internal.ads.zzfs.zzb(r4, r2)
            com.google.android.gms.internal.ads.zzek r4 = r0.zzm
            com.google.android.gms.internal.ads.zzanr r5 = r0.zzd
            byte[] r5 = r5.zza
            r4.zzJ(r5, r2)
            com.google.android.gms.internal.ads.zzek r2 = r0.zzm
            r4 = 4
            r2.zzL(r4)
            com.google.android.gms.internal.ads.zzaod r2 = r0.zza
            com.google.android.gms.internal.ads.zzek r4 = r0.zzm
            r2.zza(r11, r4)
        L194:
            com.google.android.gms.internal.ads.zzanf r2 = r0.zzi
            boolean r4 = r0.zzj
            boolean r1 = r2.zzf(r8, r1, r4)
            if (r1 == 0) goto L1a1
            r1 = 0
            r0.zzl = r1
        L1a1:
            long r11 = r0.zzk
            boolean r1 = r0.zzj
            if (r1 != 0) goto L1b1
            com.google.android.gms.internal.ads.zzanr r1 = r0.zzb
            r1.zzc(r10)
            com.google.android.gms.internal.ads.zzanr r1 = r0.zzc
            r1.zzc(r10)
        L1b1:
            com.google.android.gms.internal.ads.zzanr r1 = r0.zzd
            r1.zzc(r10)
            com.google.android.gms.internal.ads.zzanf r7 = r0.zzi
            boolean r13 = r0.zzl
            r7.zze(r8, r10, r11, r13)
            r1 = r16
            r2 = r17
            goto L2a
        L1c3:
            r0.zzf(r3, r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(com.google.android.gms.internal.ads.zzade r4, com.google.android.gms.internal.ads.zzaon r5) {
            r3 = this;
            r5.zzc()
            java.lang.String r0 = r5.zzb()
            r3.zzg = r0
            int r0 = r5.zza()
            r1 = 2
            com.google.android.gms.internal.ads.zzaeh r0 = r4.zzw(r0, r1)
            r3.zzh = r0
            com.google.android.gms.internal.ads.zzanf r1 = new com.google.android.gms.internal.ads.zzanf
            r2 = 0
            r1.<init>(r0, r2, r2)
            r3.zzi = r1
            com.google.android.gms.internal.ads.zzaod r0 = r3.zza
            r0.zzb(r4, r5)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzaeh r0 = r2.zzh
            com.google.android.gms.internal.ads.zzdi.zzb(r0)
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            if (r3 == 0) goto L15
            com.google.android.gms.internal.ads.zzaod r3 = r2.zza
            r3.zzc()
            com.google.android.gms.internal.ads.zzanf r3 = r2.zzi
            long r0 = r2.zze
            r3.zza(r0)
        L15:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzd(long r1, int r3) {
            r0 = this;
            r0.zzk = r1
            r1 = r3 & 2
            boolean r2 = r0.zzl
            if (r1 == 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            r1 = r1 | r2
            r0.zzl = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zze() {
            r2 = this;
            r0 = 0
            r2.zze = r0
            r0 = 0
            r2.zzl = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.zzk = r0
            boolean[] r0 = r2.zzf
            com.google.android.gms.internal.ads.zzfs.zzh(r0)
            com.google.android.gms.internal.ads.zzanr r0 = r2.zzb
            r0.zzb()
            com.google.android.gms.internal.ads.zzanr r0 = r2.zzc
            r0.zzb()
            com.google.android.gms.internal.ads.zzanr r0 = r2.zzd
            r0.zzb()
            com.google.android.gms.internal.ads.zzaod r0 = r2.zza
            r0.zzc()
            com.google.android.gms.internal.ads.zzanf r0 = r2.zzi
            if (r0 == 0) goto L2e
            r0.zzd()
        L2e:
            return
    }
}
