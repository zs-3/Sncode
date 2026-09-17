package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzxs extends com.google.android.gms.internal.ads.zzyf implements java.lang.Comparable {
    private final int zze;
    private final boolean zzf;
    private final java.lang.String zzg;
    private final com.google.android.gms.internal.ads.zzxy zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    public zzxs(int r5, com.google.android.gms.internal.ads.zzcd r6, int r7, com.google.android.gms.internal.ads.zzxy r8, int r9, boolean r10, com.google.android.gms.internal.ads.zzfya r11, int r12) {
            r4 = this;
            r4.<init>(r5, r6, r7)
            r4.zzh = r8
            boolean r5 = r8.zzL
            r6 = 24
            r7 = 1
            if (r7 == r5) goto Lf
            r5 = 16
            goto L11
        Lf:
            r5 = 24
        L11:
            com.google.android.gms.internal.ads.zzaf r12 = r4.zzd
            java.lang.String r12 = r12.zzd
            java.lang.String r12 = com.google.android.gms.internal.ads.zzyj.zzh(r12)
            r4.zzg = r12
            r12 = 0
            boolean r0 = com.google.android.gms.internal.ads.zzls.zza(r9, r12)
            r4.zzi = r0
            r0 = 0
        L23:
            com.google.android.gms.internal.ads.zzgax r1 = r8.zzn
            int r1 = r1.size()
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r0 >= r1) goto L42
            com.google.android.gms.internal.ads.zzaf r1 = r4.zzd
            com.google.android.gms.internal.ads.zzgax r3 = r8.zzn
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            int r1 = com.google.android.gms.internal.ads.zzyj.zzc(r1, r3, r12)
            if (r1 <= 0) goto L3f
            goto L46
        L3f:
            int r0 = r0 + 1
            goto L23
        L42:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
        L46:
            r4.zzk = r0
            r4.zzj = r1
            com.google.android.gms.internal.ads.zzaf r0 = r4.zzd
            int r0 = r0.zzf
            int r0 = com.google.android.gms.internal.ads.zzyj.zzb(r0, r12)
            r4.zzl = r0
            com.google.android.gms.internal.ads.zzaf r0 = r4.zzd
            int r1 = r0.zzf
            if (r1 == 0) goto L60
            r1 = r1 & r7
            if (r1 == 0) goto L5e
            goto L60
        L5e:
            r1 = 0
            goto L61
        L60:
            r1 = 1
        L61:
            r4.zzm = r1
            int r1 = r0.zze
            r1 = r1 & r7
            if (r7 == r1) goto L6a
            r1 = 0
            goto L6b
        L6a:
            r1 = 1
        L6b:
            r4.zzp = r1
            int r1 = r0.zzB
            r4.zzq = r1
            int r1 = r0.zzC
            r4.zzr = r1
            int r1 = r0.zzi
            r4.zzs = r1
            boolean r11 = r11.zza(r0)
            r4.zzf = r11
            android.content.res.Resources r11 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r11 = r11.getConfiguration()
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = -1
            if (r0 < r6) goto L9b
            android.os.LocaleList r6 = r11.getLocales()
            java.lang.String r6 = r6.toLanguageTags()
            java.lang.String r11 = ","
            java.lang.String[] r6 = r6.split(r11, r1)
            goto La5
        L9b:
            java.lang.String[] r6 = new java.lang.String[r7]
            java.util.Locale r11 = r11.locale
            java.lang.String r11 = r11.toLanguageTag()
            r6[r12] = r11
        La5:
            r11 = 0
        La6:
            int r0 = r6.length
            if (r11 >= r0) goto Lb4
            r0 = r6[r11]
            java.lang.String r0 = com.google.android.gms.internal.ads.zzeu.zzD(r0)
            r6[r11] = r0
            int r11 = r11 + 1
            goto La6
        Lb4:
            r11 = 0
        Lb5:
            int r0 = r6.length
            if (r11 >= r0) goto Lc6
            com.google.android.gms.internal.ads.zzaf r0 = r4.zzd
            r3 = r6[r11]
            int r0 = com.google.android.gms.internal.ads.zzyj.zzc(r0, r3, r12)
            if (r0 <= 0) goto Lc3
            goto Lca
        Lc3:
            int r11 = r11 + 1
            goto Lb5
        Lc6:
            r11 = 2147483647(0x7fffffff, float:NaN)
            r0 = 0
        Lca:
            r4.zzn = r11
            r4.zzo = r0
            r6 = 0
        Lcf:
            com.google.android.gms.internal.ads.zzgax r11 = r8.zzr
            int r11 = r11.size()
            if (r6 >= r11) goto Lee
            com.google.android.gms.internal.ads.zzaf r11 = r4.zzd
            java.lang.String r11 = r11.zzn
            if (r11 == 0) goto Leb
            com.google.android.gms.internal.ads.zzgax r0 = r8.zzr
            java.lang.Object r0 = r0.get(r6)
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto Leb
            r2 = r6
            goto Lee
        Leb:
            int r6 = r6 + 1
            goto Lcf
        Lee:
            r4.zzt = r2
            r6 = r9 & 384(0x180, float:5.38E-43)
            r8 = 128(0x80, float:1.794E-43)
            if (r6 != r8) goto Lf8
            r6 = 1
            goto Lf9
        Lf8:
            r6 = 0
        Lf9:
            r4.zzu = r6
            r6 = r9 & 64
            r8 = 64
            if (r6 != r8) goto L103
            r6 = 1
            goto L104
        L103:
            r6 = 0
        L104:
            r4.zzv = r6
            com.google.android.gms.internal.ads.zzxy r6 = r4.zzh
            boolean r8 = r6.zzN
            boolean r8 = com.google.android.gms.internal.ads.zzls.zza(r9, r8)
            if (r8 != 0) goto L112
        L110:
            r7 = 0
            goto L133
        L112:
            boolean r8 = r4.zzf
            if (r8 != 0) goto L11b
            boolean r11 = r6.zzG
            if (r11 != 0) goto L11b
            goto L110
        L11b:
            boolean r11 = com.google.android.gms.internal.ads.zzls.zza(r9, r12)
            if (r11 == 0) goto L133
            if (r8 == 0) goto L133
            com.google.android.gms.internal.ads.zzaf r8 = r4.zzd
            int r8 = r8.zzi
            if (r8 == r1) goto L133
            boolean r6 = r6.zzP
            if (r6 != 0) goto L12f
            if (r10 != 0) goto L133
        L12f:
            r5 = r5 & r9
            if (r5 == 0) goto L133
            r7 = 2
        L133:
            r4.zze = r7
            return
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzxs r1 = (com.google.android.gms.internal.ads.zzxs) r1
            int r1 = r0.zza(r1)
            return r1
    }

    public final int zza(com.google.android.gms.internal.ads.zzxs r6) {
            r5 = this;
            boolean r0 = r5.zzf
            if (r0 == 0) goto Ld
            boolean r0 = r5.zzi
            if (r0 == 0) goto Ld
            com.google.android.gms.internal.ads.zzgci r0 = com.google.android.gms.internal.ads.zzyj.zzg()
            goto L15
        Ld:
            com.google.android.gms.internal.ads.zzgci r0 = com.google.android.gms.internal.ads.zzyj.zzg()
            com.google.android.gms.internal.ads.zzgci r0 = r0.zza()
        L15:
            boolean r1 = r5.zzi
            com.google.android.gms.internal.ads.zzgam r2 = com.google.android.gms.internal.ads.zzgam.zzj()
            boolean r3 = r6.zzi
            com.google.android.gms.internal.ads.zzgam r1 = r2.zzd(r1, r3)
            int r2 = r5.zzk
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r6.zzk
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.gms.internal.ads.zzgci r4 = com.google.android.gms.internal.ads.zzgci.zzc()
            com.google.android.gms.internal.ads.zzgci r4 = r4.zza()
            com.google.android.gms.internal.ads.zzgam r1 = r1.zzc(r2, r3, r4)
            int r2 = r5.zzj
            int r3 = r6.zzj
            com.google.android.gms.internal.ads.zzgam r1 = r1.zzb(r2, r3)
            int r2 = r5.zzl
            int r3 = r6.zzl
            com.google.android.gms.internal.ads.zzgam r1 = r1.zzb(r2, r3)
            boolean r2 = r5.zzp
            boolean r3 = r6.zzp
            com.google.android.gms.internal.ads.zzgam r1 = r1.zzd(r2, r3)
            boolean r2 = r5.zzm
            boolean r3 = r6.zzm
            com.google.android.gms.internal.ads.zzgam r1 = r1.zzd(r2, r3)
            int r2 = r5.zzn
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r6.zzn
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.gms.internal.ads.zzgci r4 = com.google.android.gms.internal.ads.zzgci.zzc()
            com.google.android.gms.internal.ads.zzgci r4 = r4.zza()
            com.google.android.gms.internal.ads.zzgam r1 = r1.zzc(r2, r3, r4)
            int r2 = r5.zzo
            int r3 = r6.zzo
            com.google.android.gms.internal.ads.zzgam r1 = r1.zzb(r2, r3)
            boolean r2 = r5.zzf
            boolean r3 = r6.zzf
            com.google.android.gms.internal.ads.zzgam r1 = r1.zzd(r2, r3)
            int r2 = r5.zzt
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r6.zzt
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.gms.internal.ads.zzgci r4 = com.google.android.gms.internal.ads.zzgci.zzc()
            com.google.android.gms.internal.ads.zzgci r4 = r4.zza()
            com.google.android.gms.internal.ads.zzgam r1 = r1.zzc(r2, r3, r4)
            com.google.android.gms.internal.ads.zzxy r2 = r5.zzh
            boolean r2 = r2.zzy
            boolean r2 = r5.zzu
            boolean r3 = r6.zzu
            com.google.android.gms.internal.ads.zzgam r1 = r1.zzd(r2, r3)
            boolean r2 = r5.zzv
            boolean r3 = r6.zzv
            com.google.android.gms.internal.ads.zzgam r1 = r1.zzd(r2, r3)
            int r2 = r5.zzq
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r6.zzq
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.gms.internal.ads.zzgam r1 = r1.zzc(r2, r3, r0)
            int r2 = r5.zzr
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r6.zzr
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.gms.internal.ads.zzgam r1 = r1.zzc(r2, r3, r0)
            java.lang.String r2 = r5.zzg
            java.lang.String r3 = r6.zzg
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto Le7
            int r2 = r5.zzs
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r6 = r6.zzs
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.android.gms.internal.ads.zzgam r1 = r1.zzc(r2, r6, r0)
        Le7:
            int r6 = r1.zza()
            return r6
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final int zzb() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final /* bridge */ /* synthetic */ boolean zzc(com.google.android.gms.internal.ads.zzyf r6) {
            r5 = this;
            com.google.android.gms.internal.ads.zzxy r0 = r5.zzh
            com.google.android.gms.internal.ads.zzxs r6 = (com.google.android.gms.internal.ads.zzxs) r6
            boolean r0 = r0.zzJ
            com.google.android.gms.internal.ads.zzaf r0 = r5.zzd
            int r1 = r0.zzB
            r2 = -1
            if (r1 == r2) goto L3d
            com.google.android.gms.internal.ads.zzaf r3 = r6.zzd
            int r4 = r3.zzB
            if (r1 != r4) goto L3d
            java.lang.String r0 = r0.zzn
            if (r0 == 0) goto L3d
            java.lang.String r1 = r3.zzn
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L3d
            com.google.android.gms.internal.ads.zzxy r0 = r5.zzh
            boolean r0 = r0.zzI
            com.google.android.gms.internal.ads.zzaf r0 = r5.zzd
            int r0 = r0.zzC
            if (r0 == r2) goto L3d
            com.google.android.gms.internal.ads.zzaf r1 = r6.zzd
            int r1 = r1.zzC
            if (r0 != r1) goto L3d
            boolean r0 = r5.zzu
            boolean r1 = r6.zzu
            if (r0 != r1) goto L3d
            boolean r0 = r5.zzv
            boolean r6 = r6.zzv
            if (r0 != r6) goto L3d
            r6 = 1
            return r6
        L3d:
            r6 = 0
            return r6
    }
}
