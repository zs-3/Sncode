package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzo {
    public static final com.google.android.gms.internal.ads.zzo zza = null;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final byte[] zze;
    public final int zzf;
    public final int zzg;
    private int zzh;

    static {
            com.google.android.gms.internal.ads.zzm r0 = new com.google.android.gms.internal.ads.zzm
            r0.<init>()
            r1 = 1
            r0.zzc(r1)
            r2 = 2
            r0.zzb(r2)
            r3 = 3
            r0.zzd(r3)
            com.google.android.gms.internal.ads.zzo r0 = r0.zzg()
            com.google.android.gms.internal.ads.zzo.zza = r0
            com.google.android.gms.internal.ads.zzm r0 = new com.google.android.gms.internal.ads.zzm
            r0.<init>()
            r0.zzc(r1)
            r0.zzb(r1)
            r0.zzd(r2)
            r0.zzg()
            r0 = 0
            r4 = 36
            java.lang.Integer.toString(r0, r4)
            java.lang.Integer.toString(r1, r4)
            java.lang.Integer.toString(r2, r4)
            java.lang.Integer.toString(r3, r4)
            r0 = 4
            java.lang.Integer.toString(r0, r4)
            r0 = 5
            java.lang.Integer.toString(r0, r4)
            return
    }

    /* synthetic */ zzo(int r1, int r2, int r3, byte[] r4, int r5, int r6, com.google.android.gms.internal.ads.zzn r7) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            r0.zzd = r3
            r0.zze = r4
            r0.zzf = r5
            r0.zzg = r6
            return
    }

    public static int zza(int r2) {
            r0 = 1
            if (r2 == r0) goto L18
            r0 = 9
            r1 = 6
            if (r2 == r0) goto L17
            r0 = 4
            if (r2 == r0) goto L15
            r0 = 5
            if (r2 == r0) goto L15
            if (r2 == r1) goto L15
            r0 = 7
            if (r2 == r0) goto L15
            r2 = -1
            return r2
        L15:
            r2 = 2
            return r2
        L17:
            return r1
        L18:
            return r0
    }

    public static int zzb(int r3) {
            r0 = 1
            if (r3 == r0) goto L21
            r0 = 4
            if (r3 == r0) goto L1e
            r0 = 13
            if (r3 == r0) goto L1c
            r0 = 16
            r1 = 6
            if (r3 == r0) goto L1b
            r0 = 18
            r2 = 7
            if (r3 == r0) goto L1a
            if (r3 == r1) goto L21
            if (r3 == r2) goto L21
            r3 = -1
            return r3
        L1a:
            return r2
        L1b:
            return r1
        L1c:
            r3 = 2
            return r3
        L1e:
            r3 = 10
            return r3
        L21:
            r3 = 3
            return r3
    }

    public static boolean zzg(com.google.android.gms.internal.ads.zzo r5) {
            r0 = 1
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r5.zzb
            r2 = 2
            r3 = -1
            r4 = 0
            if (r1 == r3) goto Lf
            if (r1 == r0) goto Lf
            if (r1 != r2) goto L16
        Lf:
            int r1 = r5.zzc
            if (r1 == r3) goto L18
            if (r1 != r2) goto L16
            goto L18
        L16:
            r0 = 0
            goto L32
        L18:
            int r1 = r5.zzd
            if (r1 == r3) goto L1f
            r2 = 3
            if (r1 != r2) goto L16
        L1f:
            byte[] r1 = r5.zze
            if (r1 != 0) goto L16
            int r1 = r5.zzg
            r2 = 8
            if (r1 == r3) goto L2b
            if (r1 != r2) goto L16
        L2b:
            int r5 = r5.zzf
            if (r5 == r3) goto L32
            if (r5 == r2) goto L32
            goto L16
        L32:
            return r0
    }

    private static java.lang.String zzh(int r2) {
            r0 = -1
            if (r2 == r0) goto L21
            r0 = 1
            if (r2 == r0) goto L1e
            r0 = 2
            if (r2 == r0) goto L1b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Undefined color range "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L1b:
            java.lang.String r2 = "Limited range"
            return r2
        L1e:
            java.lang.String r2 = "Full range"
            return r2
        L21:
            java.lang.String r2 = "Unset color range"
            return r2
    }

    private static java.lang.String zzi(int r2) {
            r0 = -1
            if (r2 == r0) goto L27
            r0 = 6
            if (r2 == r0) goto L24
            r0 = 1
            if (r2 == r0) goto L21
            r0 = 2
            if (r2 == r0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Undefined color space "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L1e:
            java.lang.String r2 = "BT601"
            return r2
        L21:
            java.lang.String r2 = "BT709"
            return r2
        L24:
            java.lang.String r2 = "BT2020"
            return r2
        L27:
            java.lang.String r2 = "Unset color space"
            return r2
    }

    private static java.lang.String zzj(int r2) {
            r0 = -1
            if (r2 == r0) goto L3a
            r0 = 10
            if (r2 == r0) goto L37
            r0 = 1
            if (r2 == r0) goto L34
            r0 = 2
            if (r2 == r0) goto L31
            r0 = 3
            if (r2 == r0) goto L2e
            r0 = 6
            if (r2 == r0) goto L2b
            r0 = 7
            if (r2 == r0) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Undefined color transfer "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L28:
            java.lang.String r2 = "HLG"
            return r2
        L2b:
            java.lang.String r2 = "ST2084 PQ"
            return r2
        L2e:
            java.lang.String r2 = "SDR SMPTE 170M"
            return r2
        L31:
            java.lang.String r2 = "sRGB"
            return r2
        L34:
            java.lang.String r2 = "Linear"
            return r2
        L37:
            java.lang.String r2 = "Gamma 2.2"
            return r2
        L3a:
            java.lang.String r2 = "Unset color transfer"
            return r2
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L3b
            java.lang.Class<com.google.android.gms.internal.ads.zzo> r2 = com.google.android.gms.internal.ads.zzo.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L3b
        L10:
            com.google.android.gms.internal.ads.zzo r5 = (com.google.android.gms.internal.ads.zzo) r5
            int r2 = r4.zzb
            int r3 = r5.zzb
            if (r2 != r3) goto L3b
            int r2 = r4.zzc
            int r3 = r5.zzc
            if (r2 != r3) goto L3b
            int r2 = r4.zzd
            int r3 = r5.zzd
            if (r2 != r3) goto L3b
            byte[] r2 = r4.zze
            byte[] r3 = r5.zze
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L3b
            int r2 = r4.zzf
            int r3 = r5.zzf
            if (r2 != r3) goto L3b
            int r2 = r4.zzg
            int r5 = r5.zzg
            if (r2 != r5) goto L3b
            return r0
        L3b:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.zzh
            if (r0 != 0) goto L27
            int r0 = r3.zzb
            int r0 = r0 + 527
            int r0 = r0 * 31
            int r1 = r3.zzc
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.zzd
            byte[] r2 = r3.zze
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = java.util.Arrays.hashCode(r2)
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.zzf
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.zzg
            int r0 = r0 + r1
            r3.zzh = r0
        L27:
            return r0
    }

    public final java.lang.String toString() {
            r8 = this;
            int r0 = r8.zzf
            int r1 = r8.zzd
            int r2 = r8.zzc
            int r3 = r8.zzb
            java.lang.String r3 = zzi(r3)
            java.lang.String r2 = zzh(r2)
            java.lang.String r1 = zzj(r1)
            java.lang.String r4 = "NA"
            r5 = -1
            if (r0 == r5) goto L2b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            java.lang.String r0 = "bit Luma"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            goto L2c
        L2b:
            r0 = r4
        L2c:
            int r6 = r8.zzg
            if (r6 == r5) goto L41
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            java.lang.String r5 = "bit Chroma"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
        L41:
            byte[] r5 = r8.zze
            if (r5 == 0) goto L47
            r5 = 1
            goto L48
        L47:
            r5 = 0
        L48:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "ColorInfo("
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = ", "
            r6.append(r3)
            r6.append(r2)
            r6.append(r3)
            r6.append(r1)
            r6.append(r3)
            r6.append(r5)
            r6.append(r3)
            r6.append(r0)
            r6.append(r3)
            r6.append(r4)
            java.lang.String r0 = ")"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            return r0
    }

    public final com.google.android.gms.internal.ads.zzm zzc() {
            r2 = this;
            com.google.android.gms.internal.ads.zzm r0 = new com.google.android.gms.internal.ads.zzm
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public final java.lang.String zzd() {
            r5 = this;
            boolean r0 = r5.zzf()
            if (r0 == 0) goto L2d
            int r0 = r5.zzb
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.String r0 = zzi(r0)
            r1[r2] = r0
            r0 = 1
            int r2 = r5.zzc
            java.lang.String r2 = zzh(r2)
            r1[r0] = r2
            r0 = 2
            int r2 = r5.zzd
            java.lang.String r2 = zzj(r2)
            r1[r0] = r2
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = "%s/%s/%s"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            goto L2f
        L2d:
            java.lang.String r0 = "NA/NA/NA"
        L2f:
            boolean r1 = r5.zze()
            java.lang.String r2 = "/"
            if (r1 == 0) goto L4e
            int r1 = r5.zzf
            int r3 = r5.zzg
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r2)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            goto L50
        L4e:
            java.lang.String r1 = "NA/NA"
        L50:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r2)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            return r0
    }

    public final boolean zze() {
            r2 = this;
            int r0 = r2.zzf
            r1 = -1
            if (r0 == r1) goto Lb
            int r0 = r2.zzg
            if (r0 == r1) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public final boolean zzf() {
            r2 = this;
            int r0 = r2.zzb
            r1 = -1
            if (r0 == r1) goto Lf
            int r0 = r2.zzc
            if (r0 == r1) goto Lf
            int r0 = r2.zzd
            if (r0 == r1) goto Lf
            r0 = 1
            return r0
        Lf:
            r0 = 0
            return r0
    }
}
