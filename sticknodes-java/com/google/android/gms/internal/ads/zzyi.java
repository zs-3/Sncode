package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzyi extends com.google.android.gms.internal.ads.zzyf {
    private final boolean zze;
    private final com.google.android.gms.internal.ads.zzxy zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final boolean zzp;
    private final boolean zzq;
    private final int zzr;

    public zzyi(int r5, com.google.android.gms.internal.ads.zzcd r6, int r7, com.google.android.gms.internal.ads.zzxy r8, int r9, int r10, boolean r11) {
            r4 = this;
            r4.<init>(r5, r6, r7)
            r4.zzf = r8
            boolean r5 = r8.zzE
            r6 = 1
            if (r6 == r5) goto Ld
            r5 = 16
            goto Lf
        Ld:
            r5 = 24
        Lf:
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10 = 0
            if (r11 == 0) goto L26
            com.google.android.gms.internal.ads.zzaf r0 = r4.zzd
            int r1 = r0.zzt
            float r0 = r0.zzv
            int r1 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r1 == 0) goto L24
            r1 = 1325400064(0x4f000000, float:2.14748365E9)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L26
        L24:
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            r4.zze = r0
            r0 = -1
            if (r11 == 0) goto L4d
            com.google.android.gms.internal.ads.zzaf r11 = r4.zzd
            int r1 = r11.zzt
            if (r1 == r0) goto L34
            if (r1 < 0) goto L4d
        L34:
            int r1 = r11.zzu
            if (r1 == r0) goto L3a
            if (r1 < 0) goto L4d
        L3a:
            float r1 = r11.zzv
            int r2 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r2 == 0) goto L45
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L4d
        L45:
            int r11 = r11.zzi
            if (r11 == r0) goto L4b
            if (r11 < 0) goto L4d
        L4b:
            r11 = 1
            goto L4e
        L4d:
            r11 = 0
        L4e:
            r4.zzg = r11
            boolean r11 = com.google.android.gms.internal.ads.zzls.zza(r9, r10)
            r4.zzh = r11
            com.google.android.gms.internal.ads.zzaf r11 = r4.zzd
            float r1 = r11.zzv
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 == 0) goto L66
            r7 = 1092616192(0x41200000, float:10.0)
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 < 0) goto L66
            r7 = 1
            goto L67
        L66:
            r7 = 0
        L67:
            r4.zzi = r7
            int r7 = r11.zzi
            r4.zzj = r7
            int r7 = r11.zza()
            r4.zzk = r7
            com.google.android.gms.internal.ads.zzaf r7 = r4.zzd
            int r7 = r7.zzf
            int r7 = com.google.android.gms.internal.ads.zzyj.zzb(r7, r10)
            r4.zzm = r7
            com.google.android.gms.internal.ads.zzaf r7 = r4.zzd
            int r7 = r7.zzf
            if (r7 == 0) goto L89
            r7 = r7 & r6
            if (r7 == 0) goto L87
            goto L89
        L87:
            r7 = 0
            goto L8a
        L89:
            r7 = 1
        L8a:
            r4.zzn = r7
            r7 = 0
        L8d:
            com.google.android.gms.internal.ads.zzgax r11 = r8.zzl
            int r11 = r11.size()
            if (r7 >= r11) goto Lab
            com.google.android.gms.internal.ads.zzaf r11 = r4.zzd
            java.lang.String r11 = r11.zzn
            if (r11 == 0) goto La8
            com.google.android.gms.internal.ads.zzgax r1 = r8.zzl
            java.lang.Object r1 = r1.get(r7)
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto La8
            goto Lae
        La8:
            int r7 = r7 + 1
            goto L8d
        Lab:
            r7 = 2147483647(0x7fffffff, float:NaN)
        Lae:
            r4.zzl = r7
            r7 = r9 & 384(0x180, float:5.38E-43)
            r8 = 128(0x80, float:1.794E-43)
            if (r7 != r8) goto Lb8
            r7 = 1
            goto Lb9
        Lb8:
            r7 = 0
        Lb9:
            r4.zzp = r7
            r7 = r9 & 64
            r8 = 64
            if (r7 != r8) goto Lc3
            r7 = 1
            goto Lc4
        Lc3:
            r7 = 0
        Lc4:
            r4.zzq = r7
            com.google.android.gms.internal.ads.zzaf r7 = r4.zzd
            java.lang.String r8 = r7.zzn
            r11 = 4
            r1 = 3
            r2 = 2
            if (r8 != 0) goto Ld1
        Lcf:
            r11 = 0
            goto L11e
        Ld1:
            int r3 = r8.hashCode()
            switch(r3) {
                case -1851077871: goto L101;
                case -1662735862: goto Lf7;
                case -1662541442: goto Led;
                case 1331836730: goto Le3;
                case 1599127257: goto Ld9;
                default: goto Ld8;
            }
        Ld8:
            goto L10b
        Ld9:
            java.lang.String r3 = "video/x-vnd.on2.vp9"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L10b
            r8 = 3
            goto L10c
        Le3:
            java.lang.String r3 = "video/avc"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L10b
            r8 = 4
            goto L10c
        Led:
            java.lang.String r3 = "video/hevc"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L10b
            r8 = 2
            goto L10c
        Lf7:
            java.lang.String r3 = "video/av01"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L10b
            r8 = 1
            goto L10c
        L101:
            java.lang.String r3 = "video/dolby-vision"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L10b
            r8 = 0
            goto L10c
        L10b:
            r8 = -1
        L10c:
            if (r8 == 0) goto L11d
            if (r8 == r6) goto L11e
            if (r8 == r2) goto L11b
            if (r8 == r1) goto L119
            if (r8 == r11) goto L117
            goto Lcf
        L117:
            r11 = 1
            goto L11e
        L119:
            r11 = 2
            goto L11e
        L11b:
            r11 = 3
            goto L11e
        L11d:
            r11 = 5
        L11e:
            r4.zzr = r11
            int r8 = r7.zzf
            r8 = r8 & 16384(0x4000, float:2.2959E-41)
            if (r8 == 0) goto L128
        L126:
            r6 = 0
            goto L150
        L128:
            com.google.android.gms.internal.ads.zzxy r8 = r4.zzf
            boolean r11 = r8.zzN
            boolean r11 = com.google.android.gms.internal.ads.zzls.zza(r9, r11)
            if (r11 != 0) goto L133
            goto L126
        L133:
            boolean r11 = r4.zze
            if (r11 != 0) goto L13c
            boolean r8 = r8.zzC
            if (r8 != 0) goto L13c
            goto L126
        L13c:
            boolean r8 = com.google.android.gms.internal.ads.zzls.zza(r9, r10)
            if (r8 == 0) goto L150
            boolean r8 = r4.zzg
            if (r8 == 0) goto L150
            if (r11 == 0) goto L150
            int r7 = r7.zzi
            if (r7 == r0) goto L150
            r5 = r5 & r9
            if (r5 == 0) goto L150
            r6 = 2
        L150:
            r4.zzo = r6
            return
    }

    public static /* synthetic */ int zza(com.google.android.gms.internal.ads.zzyi r4, com.google.android.gms.internal.ads.zzyi r5) {
            boolean r0 = r4.zze
            if (r0 == 0) goto Ld
            boolean r0 = r4.zzh
            if (r0 == 0) goto Ld
            com.google.android.gms.internal.ads.zzgci r0 = com.google.android.gms.internal.ads.zzyj.zzg()
            goto L15
        Ld:
            com.google.android.gms.internal.ads.zzgci r0 = com.google.android.gms.internal.ads.zzyj.zzg()
            com.google.android.gms.internal.ads.zzgci r0 = r0.zza()
        L15:
            com.google.android.gms.internal.ads.zzgam r1 = com.google.android.gms.internal.ads.zzgam.zzj()
            com.google.android.gms.internal.ads.zzxy r2 = r4.zzf
            boolean r2 = r2.zzy
            int r2 = r4.zzk
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r5.zzk
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.gms.internal.ads.zzgam r1 = r1.zzc(r2, r3, r0)
            int r4 = r4.zzj
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r5 = r5.zzj
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            com.google.android.gms.internal.ads.zzgam r4 = r1.zzc(r4, r5, r0)
            int r4 = r4.zza()
            return r4
    }

    public static /* synthetic */ int zzd(com.google.android.gms.internal.ads.zzyi r4, com.google.android.gms.internal.ads.zzyi r5) {
            com.google.android.gms.internal.ads.zzgam r0 = com.google.android.gms.internal.ads.zzgam.zzj()
            boolean r1 = r4.zzh
            boolean r2 = r5.zzh
            com.google.android.gms.internal.ads.zzgam r0 = r0.zzd(r1, r2)
            int r1 = r4.zzm
            int r2 = r5.zzm
            com.google.android.gms.internal.ads.zzgam r0 = r0.zzb(r1, r2)
            boolean r1 = r4.zzn
            boolean r2 = r5.zzn
            com.google.android.gms.internal.ads.zzgam r0 = r0.zzd(r1, r2)
            boolean r1 = r4.zzi
            boolean r2 = r5.zzi
            com.google.android.gms.internal.ads.zzgam r0 = r0.zzd(r1, r2)
            boolean r1 = r4.zze
            boolean r2 = r5.zze
            com.google.android.gms.internal.ads.zzgam r0 = r0.zzd(r1, r2)
            boolean r1 = r4.zzg
            boolean r2 = r5.zzg
            com.google.android.gms.internal.ads.zzgam r0 = r0.zzd(r1, r2)
            int r1 = r4.zzl
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r5.zzl
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.gms.internal.ads.zzgci r3 = com.google.android.gms.internal.ads.zzgci.zzc()
            com.google.android.gms.internal.ads.zzgci r3 = r3.zza()
            com.google.android.gms.internal.ads.zzgam r0 = r0.zzc(r1, r2, r3)
            boolean r1 = r4.zzp
            boolean r2 = r5.zzp
            com.google.android.gms.internal.ads.zzgam r0 = r0.zzd(r1, r2)
            boolean r1 = r4.zzq
            boolean r2 = r5.zzq
            com.google.android.gms.internal.ads.zzgam r0 = r0.zzd(r1, r2)
            boolean r1 = r4.zzp
            if (r1 == 0) goto L6c
            boolean r1 = r4.zzq
            if (r1 == 0) goto L6c
            int r4 = r4.zzr
            int r5 = r5.zzr
            com.google.android.gms.internal.ads.zzgam r0 = r0.zzb(r4, r5)
        L6c:
            int r4 = r0.zza()
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final int zzb() {
            r1 = this;
            int r0 = r1.zzo
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final /* bridge */ /* synthetic */ boolean zzc(com.google.android.gms.internal.ads.zzyf r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzyi r3 = (com.google.android.gms.internal.ads.zzyi) r3
            com.google.android.gms.internal.ads.zzaf r0 = r2.zzd
            java.lang.String r0 = r0.zzn
            com.google.android.gms.internal.ads.zzaf r1 = r3.zzd
            java.lang.String r1 = r1.zzn
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L22
            com.google.android.gms.internal.ads.zzxy r0 = r2.zzf
            boolean r0 = r0.zzF
            boolean r0 = r2.zzp
            boolean r1 = r3.zzp
            if (r0 != r1) goto L22
            boolean r0 = r2.zzq
            boolean r3 = r3.zzq
            if (r0 != r3) goto L22
            r3 = 1
            return r3
        L22:
            r3 = 0
            return r3
    }
}
