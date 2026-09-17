package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcck {
    private static final boolean zza = false;
    private final android.content.Context zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;
    private final com.google.android.gms.internal.ads.zzbdh zze;
    private final com.google.android.gms.internal.ads.zzbdk zzf;
    private final com.google.android.gms.ads.internal.util.zzbh zzg;
    private final long[] zzh;
    private final java.lang.String[] zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private com.google.android.gms.internal.ads.zzcbp zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;

    static {
            java.util.Random r0 = com.google.android.gms.ads.internal.client.zzbc.zze()
            r1 = 100
            int r0 = r0.nextInt(r1)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzmm
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r0 >= r1) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            com.google.android.gms.internal.ads.zzcck.zza = r0
            return
    }

    public zzcck(android.content.Context r8, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r9, java.lang.String r10, com.google.android.gms.internal.ads.zzbdk r11, com.google.android.gms.internal.ads.zzbdh r12) {
            r7 = this;
            r7.<init>()
            com.google.android.gms.ads.internal.util.zzbf r6 = new com.google.android.gms.ads.internal.util.zzbf
            r6.<init>()
            java.lang.String r1 = "min_1"
            r2 = 1
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0 = r6
            r0.zza(r1, r2, r4)
            java.lang.String r1 = "1_5"
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r4 = 4617315517961601024(0x4014000000000000, double:5.0)
            r0.zza(r1, r2, r4)
            java.lang.String r1 = "5_10"
            r2 = 4617315517961601024(0x4014000000000000, double:5.0)
            r4 = 4621819117588971520(0x4024000000000000, double:10.0)
            r0.zza(r1, r2, r4)
            java.lang.String r1 = "10_20"
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
            r4 = 4626322717216342016(0x4034000000000000, double:20.0)
            r0.zza(r1, r2, r4)
            java.lang.String r1 = "20_30"
            r2 = 4626322717216342016(0x4034000000000000, double:20.0)
            r4 = 4629137466983448576(0x403e000000000000, double:30.0)
            r0.zza(r1, r2, r4)
            java.lang.String r1 = "30_max"
            r2 = 4629137466983448576(0x403e000000000000, double:30.0)
            r4 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r0.zza(r1, r2, r4)
            com.google.android.gms.ads.internal.util.zzbh r0 = r6.zzb()
            r7.zzg = r0
            r0 = 0
            r7.zzj = r0
            r7.zzk = r0
            r7.zzl = r0
            r7.zzm = r0
            r1 = -1
            r7.zzr = r1
            r7.zzb = r8
            r7.zzd = r9
            r7.zzc = r10
            r7.zzf = r11
            r7.zze = r12
            com.google.android.gms.internal.ads.zzbcm r8 = com.google.android.gms.internal.ads.zzbcv.zzH
            com.google.android.gms.internal.ads.zzbct r9 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r8 = r9.zza(r8)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L76
            java.lang.String[] r8 = new java.lang.String[r0]
            r7.zzi = r8
            long[] r8 = new long[r0]
            r7.zzh = r8
            return
        L76:
            java.lang.String r9 = ","
            java.lang.String[] r8 = android.text.TextUtils.split(r8, r9)
            int r9 = r8.length
            java.lang.String[] r10 = new java.lang.String[r9]
            r7.zzi = r10
            long[] r9 = new long[r9]
            r7.zzh = r9
        L85:
            int r9 = r8.length
            if (r0 >= r9) goto La0
            long[] r9 = r7.zzh     // Catch: java.lang.NumberFormatException -> L93
            r10 = r8[r0]     // Catch: java.lang.NumberFormatException -> L93
            long r10 = java.lang.Long.parseLong(r10)     // Catch: java.lang.NumberFormatException -> L93
            r9[r0] = r10     // Catch: java.lang.NumberFormatException -> L93
            goto L9d
        L93:
            r9 = move-exception
            java.lang.String r10 = "Unable to parse frame hash target time number."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r10, r9)
            long[] r9 = r7.zzh
            r9[r0] = r1
        L9d:
            int r0 = r0 + 1
            goto L85
        La0:
            return
    }

    public final void zza(com.google.android.gms.internal.ads.zzcbp r4) {
            r3 = this;
            java.lang.String r0 = "vpc2"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.google.android.gms.internal.ads.zzbdk r1 = r3.zzf
            com.google.android.gms.internal.ads.zzbdh r2 = r3.zze
            com.google.android.gms.internal.ads.zzbdc.zza(r1, r2, r0)
            r0 = 1
            r3.zzj = r0
            com.google.android.gms.internal.ads.zzbdk r0 = r3.zzf
            java.lang.String r1 = r4.zzj()
            java.lang.String r2 = "vpn"
            r0.zzd(r2, r1)
            r3.zzo = r4
            return
    }

    public final void zzb() {
            r3 = this;
            boolean r0 = r3.zzj
            if (r0 == 0) goto L19
            boolean r0 = r3.zzk
            if (r0 == 0) goto L9
            goto L19
        L9:
            com.google.android.gms.internal.ads.zzbdk r0 = r3.zzf
            com.google.android.gms.internal.ads.zzbdh r1 = r3.zze
            java.lang.String r2 = "vfr2"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            com.google.android.gms.internal.ads.zzbdc.zza(r0, r1, r2)
            r0 = 1
            r3.zzk = r0
        L19:
            return
    }

    public final void zzc() {
            r4 = this;
            r0 = 1
            r4.zzn = r0
            boolean r1 = r4.zzk
            if (r1 == 0) goto L1a
            boolean r1 = r4.zzl
            if (r1 != 0) goto L1a
            com.google.android.gms.internal.ads.zzbdk r1 = r4.zzf
            com.google.android.gms.internal.ads.zzbdh r2 = r4.zze
            java.lang.String r3 = "vfp2"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            com.google.android.gms.internal.ads.zzbdc.zza(r1, r2, r3)
            r4.zzl = r0
        L1a:
            return
    }

    public final void zzd() {
            r7 = this;
            boolean r0 = com.google.android.gms.internal.ads.zzcck.zza
            if (r0 == 0) goto L9c
            boolean r0 = r7.zzp
            if (r0 != 0) goto L9c
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r0 = "type"
            java.lang.String r1 = "native-player-metrics"
            r5.putString(r0, r1)
            java.lang.String r0 = r7.zzc
            java.lang.String r1 = "request"
            r5.putString(r1, r0)
            com.google.android.gms.internal.ads.zzcbp r0 = r7.zzo
            java.lang.String r0 = r0.zzj()
            java.lang.String r1 = "player"
            r5.putString(r1, r0)
            com.google.android.gms.ads.internal.util.zzbh r0 = r7.zzg
            java.util.List r0 = r0.zza()
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r0.next()
            com.google.android.gms.ads.internal.util.zzbe r1 = (com.google.android.gms.ads.internal.util.zzbe) r1
            java.lang.String r2 = r1.zza
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r1.zze
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "fps_c_"
            java.lang.String r2 = r4.concat(r2)
            r5.putString(r2, r3)
            java.lang.String r2 = r1.zza
            java.lang.String r2 = java.lang.String.valueOf(r2)
            double r3 = r1.zzd
            java.lang.String r1 = java.lang.Double.toString(r3)
            java.lang.String r3 = "fps_p_"
            java.lang.String r2 = r3.concat(r2)
            r5.putString(r2, r1)
            goto L30
        L67:
            r0 = 0
        L68:
            long[] r1 = r7.zzh
            int r2 = r1.length
            if (r0 >= r2) goto L89
            java.lang.String[] r2 = r7.zzi
            r2 = r2[r0]
            if (r2 == 0) goto L86
            r3 = r1[r0]
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "fh_"
            java.lang.String r1 = r3.concat(r1)
            r5.putString(r1, r2)
        L86:
            int r0 = r0 + 1
            goto L68
        L89:
            android.content.Context r2 = r7.zzb
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r7.zzd
            com.google.android.gms.ads.internal.util.zzt r1 = com.google.android.gms.ads.internal.zzu.zzp()
            java.lang.String r3 = r0.afmaVersion
            r6 = 1
            java.lang.String r4 = "gmob-apps"
            r1.zzh(r2, r3, r4, r5, r6)
            r0 = 1
            r7.zzp = r0
        L9c:
            return
    }

    public final void zze() {
            r1 = this;
            r0 = 0
            r1.zzn = r0
            return
    }

    public final void zzf(com.google.android.gms.internal.ads.zzcbp r22) {
            r21 = this;
            r0 = r21
            boolean r1 = r0.zzl
            r2 = 1
            if (r1 == 0) goto L29
            boolean r1 = r0.zzm
            if (r1 != 0) goto L29
            boolean r1 = com.google.android.gms.ads.internal.util.zze.zzc()
            if (r1 == 0) goto L1a
            boolean r1 = r0.zzm
            if (r1 != 0) goto L1a
            java.lang.String r1 = "VideoMetricsMixin first frame"
            com.google.android.gms.ads.internal.util.zze.zza(r1)
        L1a:
            com.google.android.gms.internal.ads.zzbdk r1 = r0.zzf
            com.google.android.gms.internal.ads.zzbdh r3 = r0.zze
            java.lang.String r4 = "vff2"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            com.google.android.gms.internal.ads.zzbdc.zza(r1, r3, r4)
            r0.zzm = r2
        L29:
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzu.zzB()
            long r3 = r1.nanoTime()
            boolean r1 = r0.zzn
            r5 = 1
            r7 = -1
            if (r1 == 0) goto L55
            boolean r1 = r0.zzq
            if (r1 == 0) goto L55
            long r9 = r0.zzr
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L55
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            long r9 = r1.toNanos(r5)
            double r9 = (double) r9
            long r11 = r0.zzr
            long r11 = r3 - r11
            com.google.android.gms.ads.internal.util.zzbh r1 = r0.zzg
            double r11 = (double) r11
            double r9 = r9 / r11
            r1.zzb(r9)
        L55:
            boolean r1 = r0.zzn
            r0.zzq = r1
            r0.zzr = r3
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzI
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r3.zza(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            int r1 = r22.zza()
            long r9 = (long) r1
            r1 = 0
            r11 = 0
        L72:
            java.lang.String[] r12 = r0.zzi
            int r13 = r12.length
            if (r11 >= r13) goto Le7
            r12 = r12[r11]
            if (r12 == 0) goto L7e
        L7b:
            r12 = r22
            goto Le2
        L7e:
            long[] r12 = r0.zzh
            r13 = r12[r11]
            long r12 = r9 - r13
            long r12 = java.lang.Math.abs(r12)
            int r14 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r14 <= 0) goto L7b
            java.lang.String[] r3 = r0.zzi
            r4 = 8
            r12 = r22
            android.graphics.Bitmap r9 = r12.getBitmap(r4, r4)
            r12 = 63
            r14 = 0
            r16 = r14
            r10 = 0
        L9d:
            if (r10 >= r4) goto Ld1
            r5 = 0
        La0:
            if (r5 >= r4) goto Lca
            int r6 = r9.getPixel(r5, r10)
            int r18 = android.graphics.Color.blue(r6)
            int r19 = android.graphics.Color.red(r6)
            int r18 = r18 + r19
            int r6 = android.graphics.Color.green(r6)
            int r6 = r18 + r6
            r4 = 128(0x80, float:1.794E-43)
            if (r6 <= r4) goto Lbd
            r19 = 1
            goto Lbf
        Lbd:
            r19 = r14
        Lbf:
            int r4 = (int) r12
            long r19 = r19 << r4
            long r16 = r16 | r19
            long r12 = r12 + r7
            int r5 = r5 + 1
            r4 = 8
            goto La0
        Lca:
            int r10 = r10 + 1
            r4 = 8
            r5 = 1
            goto L9d
        Ld1:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Long r4 = java.lang.Long.valueOf(r16)
            r2[r1] = r4
            java.lang.String r1 = "%016X"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r3[r11] = r1
            return
        Le2:
            int r11 = r11 + 1
            r5 = 1
            goto L72
        Le7:
            return
    }
}
