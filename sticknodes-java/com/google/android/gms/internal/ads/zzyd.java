package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzyd extends com.google.android.gms.internal.ads.zzyf implements java.lang.Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzyd(int r4, com.google.android.gms.internal.ads.zzcd r5, int r6, com.google.android.gms.internal.ads.zzxy r7, int r8, java.lang.String r9) {
            r3 = this;
            r3.<init>(r4, r5, r6)
            r4 = 0
            boolean r5 = com.google.android.gms.internal.ads.zzls.zza(r8, r4)
            r3.zzf = r5
            com.google.android.gms.internal.ads.zzaf r5 = r3.zzd
            int r5 = r5.zze
            int r6 = r7.zzv
            r6 = r5 & 1
            r0 = 1
            if (r0 == r6) goto L17
            r6 = 0
            goto L18
        L17:
            r6 = 1
        L18:
            r3.zzg = r6
            r5 = r5 & 2
            if (r5 == 0) goto L20
            r5 = 1
            goto L21
        L20:
            r5 = 0
        L21:
            r3.zzh = r5
            com.google.android.gms.internal.ads.zzgax r5 = r7.zzt
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L32
            java.lang.String r5 = ""
            com.google.android.gms.internal.ads.zzgax r5 = com.google.android.gms.internal.ads.zzgax.zzo(r5)
            goto L34
        L32:
            com.google.android.gms.internal.ads.zzgax r5 = r7.zzt
        L34:
            r6 = 0
        L35:
            int r1 = r5.size()
            if (r6 >= r1) goto L4d
            com.google.android.gms.internal.ads.zzaf r1 = r3.zzd
            java.lang.Object r2 = r5.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            int r1 = com.google.android.gms.internal.ads.zzyj.zzc(r1, r2, r4)
            if (r1 <= 0) goto L4a
            goto L51
        L4a:
            int r6 = r6 + 1
            goto L35
        L4d:
            r6 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
        L51:
            r3.zzi = r6
            r3.zzj = r1
            com.google.android.gms.internal.ads.zzaf r5 = r3.zzd
            int r5 = r5.zzf
            int r6 = r7.zzu
            int r5 = com.google.android.gms.internal.ads.zzyj.zzb(r5, r6)
            r3.zzk = r5
            com.google.android.gms.internal.ads.zzaf r6 = r3.zzd
            int r6 = r6.zzf
            r6 = r6 & 1088(0x440, float:1.525E-42)
            if (r6 == 0) goto L6b
            r6 = 1
            goto L6c
        L6b:
            r6 = 0
        L6c:
            r3.zzm = r6
            java.lang.String r6 = com.google.android.gms.internal.ads.zzyj.zzh(r9)
            if (r6 != 0) goto L76
            r6 = 1
            goto L77
        L76:
            r6 = 0
        L77:
            com.google.android.gms.internal.ads.zzaf r2 = r3.zzd
            int r6 = com.google.android.gms.internal.ads.zzyj.zzc(r2, r9, r6)
            r3.zzl = r6
            if (r1 > 0) goto L98
            com.google.android.gms.internal.ads.zzgax r9 = r7.zzt
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L8b
            if (r5 > 0) goto L98
        L8b:
            boolean r5 = r3.zzg
            if (r5 != 0) goto L98
            boolean r5 = r3.zzh
            if (r5 == 0) goto L96
            if (r6 <= 0) goto L96
            goto L98
        L96:
            r5 = 0
            goto L99
        L98:
            r5 = 1
        L99:
            boolean r6 = r7.zzN
            boolean r6 = com.google.android.gms.internal.ads.zzls.zza(r8, r6)
            if (r6 == 0) goto La4
            if (r5 == 0) goto La4
            r4 = 1
        La4:
            r3.zze = r4
            return
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzyd r1 = (com.google.android.gms.internal.ads.zzyd) r1
            int r1 = r0.zza(r1)
            return r1
    }

    public final int zza(com.google.android.gms.internal.ads.zzyd r5) {
            r4 = this;
            com.google.android.gms.internal.ads.zzgam r0 = com.google.android.gms.internal.ads.zzgam.zzj()
            boolean r1 = r4.zzf
            boolean r2 = r5.zzf
            com.google.android.gms.internal.ads.zzgam r0 = r0.zzd(r1, r2)
            int r1 = r4.zzi
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r5.zzi
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.gms.internal.ads.zzgci r3 = com.google.android.gms.internal.ads.zzgci.zzc()
            com.google.android.gms.internal.ads.zzgci r3 = r3.zza()
            com.google.android.gms.internal.ads.zzgam r0 = r0.zzc(r1, r2, r3)
            int r1 = r4.zzj
            int r2 = r5.zzj
            com.google.android.gms.internal.ads.zzgam r0 = r0.zzb(r1, r2)
            int r1 = r4.zzk
            int r2 = r5.zzk
            com.google.android.gms.internal.ads.zzgam r0 = r0.zzb(r1, r2)
            boolean r1 = r4.zzg
            boolean r2 = r5.zzg
            com.google.android.gms.internal.ads.zzgam r0 = r0.zzd(r1, r2)
            boolean r1 = r4.zzh
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r2 = r5.zzh
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            int r3 = r4.zzj
            if (r3 != 0) goto L51
            com.google.android.gms.internal.ads.zzgci r3 = com.google.android.gms.internal.ads.zzgci.zzc()
            goto L59
        L51:
            com.google.android.gms.internal.ads.zzgci r3 = com.google.android.gms.internal.ads.zzgci.zzc()
            com.google.android.gms.internal.ads.zzgci r3 = r3.zza()
        L59:
            com.google.android.gms.internal.ads.zzgam r0 = r0.zzc(r1, r2, r3)
            int r1 = r4.zzl
            int r2 = r5.zzl
            com.google.android.gms.internal.ads.zzgam r0 = r0.zzb(r1, r2)
            int r1 = r4.zzk
            if (r1 != 0) goto L71
            boolean r1 = r4.zzm
            boolean r5 = r5.zzm
            com.google.android.gms.internal.ads.zzgam r0 = r0.zze(r1, r5)
        L71:
            int r5 = r0.zza()
            return r5
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final int zzb() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final /* bridge */ /* synthetic */ boolean zzc(com.google.android.gms.internal.ads.zzyf r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzyd r1 = (com.google.android.gms.internal.ads.zzyd) r1
            r1 = 0
            return r1
    }
}
