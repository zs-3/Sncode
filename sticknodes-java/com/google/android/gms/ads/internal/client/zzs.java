package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AdSizeParcelCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzs extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.internal.client.zzs> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final java.lang.String zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final int zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    public final int zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    public final boolean zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 6)
    public final int zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 7)
    public final int zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 8)
    public final com.google.android.gms.ads.internal.client.zzs[] zzg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 9)
    public final boolean zzh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 10)
    public final boolean zzi;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 11)
    public boolean zzj;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 12)
    public boolean zzk;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 13)
    public boolean zzl;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 14)
    public boolean zzm;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 15)
    public boolean zzn;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 16)
    public boolean zzo;

    static {
            com.google.android.gms.ads.internal.client.zzt r0 = new com.google.android.gms.ads.internal.client.zzt
            r0.<init>()
            com.google.android.gms.ads.internal.client.zzs.CREATOR = r0
            return
    }

    public zzs() {
            r16 = this;
            java.lang.String r1 = "interstitial_mb"
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r0 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
    }

    public zzs(android.content.Context r3, com.google.android.gms.ads.AdSize r4) {
            r2 = this;
            r0 = 1
            com.google.android.gms.ads.AdSize[] r0 = new com.google.android.gms.ads.AdSize[r0]
            r1 = 0
            r0[r1] = r4
            r2.<init>(r3, r0)
            return
    }

    public zzs(android.content.Context r14, com.google.android.gms.ads.AdSize[] r15) {
            r13 = this;
            r13.<init>()
            r0 = 0
            r1 = r15[r0]
            r13.zzd = r0
            boolean r2 = r1.isFluid()
            r13.zzi = r2
            boolean r3 = com.google.android.gms.ads.zzb.zzf(r1)
            r13.zzm = r3
            boolean r3 = com.google.android.gms.ads.zzb.zzg(r1)
            r13.zzn = r3
            boolean r3 = com.google.android.gms.ads.zzb.zzh(r1)
            r13.zzo = r3
            if (r2 == 0) goto L31
            com.google.android.gms.ads.AdSize r3 = com.google.android.gms.ads.AdSize.BANNER
            int r4 = r3.getWidth()
            r13.zze = r4
            int r3 = r3.getHeight()
            r13.zzb = r3
            goto L5d
        L31:
            boolean r4 = r13.zzn
            if (r4 == 0) goto L42
            int r3 = r1.getWidth()
            r13.zze = r3
            int r3 = com.google.android.gms.ads.zzb.zza(r1)
            r13.zzb = r3
            goto L5d
        L42:
            if (r3 == 0) goto L51
            int r3 = r1.getWidth()
            r13.zze = r3
            int r3 = com.google.android.gms.ads.zzb.zzb(r1)
            r13.zzb = r3
            goto L5d
        L51:
            int r3 = r1.getWidth()
            r13.zze = r3
            int r3 = r1.getHeight()
            r13.zzb = r3
        L5d:
            int r4 = r13.zze
            r5 = -1
            r6 = 1
            if (r4 != r5) goto L65
            r4 = 1
            goto L66
        L65:
            r4 = 0
        L66:
            r5 = -2
            if (r3 != r5) goto L6b
            r3 = 1
            goto L6c
        L6b:
            r3 = 0
        L6c:
            android.content.res.Resources r5 = r14.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            if (r4 == 0) goto L100
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            android.content.res.Resources r7 = r14.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.orientation
            r8 = 2
            if (r7 == r8) goto L87
            goto Le8
        L87:
            android.content.res.Resources r7 = r14.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            int r8 = r7.heightPixels
            float r8 = (float) r8
            float r7 = r7.density
            float r8 = r8 / r7
            int r7 = (int) r8
            r8 = 600(0x258, float:8.41E-43)
            if (r7 >= r8) goto Le8
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            android.content.res.Resources r7 = r14.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            java.lang.String r8 = "window"
            java.lang.Object r8 = r14.getSystemService(r8)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            if (r8 == 0) goto Le8
            android.view.Display r8 = r8.getDefaultDisplay()
            r8.getRealMetrics(r7)
            int r9 = r7.heightPixels
            int r10 = r7.widthPixels
            r8.getMetrics(r7)
            int r8 = r7.heightPixels
            int r7 = r7.widthPixels
            if (r8 != r9) goto Le8
            if (r7 != r10) goto Le8
            int r7 = r5.widthPixels
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            android.content.res.Resources r8 = r14.getResources()
            java.lang.String r9 = "navigation_bar_width"
            java.lang.String r10 = "dimen"
            java.lang.String r11 = "android"
            int r8 = r8.getIdentifier(r9, r10, r11)
            if (r8 <= 0) goto Le3
            android.content.res.Resources r9 = r14.getResources()
            int r8 = r9.getDimensionPixelSize(r8)
            goto Le4
        Le3:
            r8 = 0
        Le4:
            int r7 = r7 - r8
            r13.zzf = r7
            goto Lec
        Le8:
            int r7 = r5.widthPixels
            r13.zzf = r7
        Lec:
            float r8 = r5.density
            float r7 = (float) r7
            float r7 = r7 / r8
            double r7 = (double) r7
            int r9 = (int) r7
            double r10 = (double) r9
            double r7 = r7 - r10
            r10 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 < 0) goto L10d
            int r9 = r9 + 1
            goto L10d
        L100:
            int r9 = r13.zze
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            int r7 = r13.zze
            int r7 = com.google.android.gms.ads.internal.util.client.zzf.zzq(r5, r7)
            r13.zzf = r7
        L10d:
            if (r3 == 0) goto L114
            int r7 = zze(r5)
            goto L116
        L114:
            int r7 = r13.zzb
        L116:
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            int r5 = com.google.android.gms.ads.internal.util.client.zzf.zzq(r5, r7)
            r13.zzc = r5
            java.lang.String r5 = "_as"
            java.lang.String r8 = "x"
            if (r4 != 0) goto L159
            if (r3 == 0) goto L128
            goto L159
        L128:
            boolean r3 = r13.zzn
            if (r3 != 0) goto L13d
            boolean r3 = r13.zzo
            if (r3 == 0) goto L131
            goto L13d
        L131:
            if (r2 == 0) goto L136
            java.lang.String r1 = "320x50_mb"
            goto L156
        L136:
            java.lang.String r1 = r1.toString()
            r13.zza = r1
            goto L170
        L13d:
            int r1 = r13.zze
            int r2 = r13.zzb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r8)
            r3.append(r2)
            r3.append(r5)
            java.lang.String r1 = r3.toString()
        L156:
            r13.zza = r1
            goto L170
        L159:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r8)
            r1.append(r7)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r13.zza = r1
        L170:
            int r1 = r15.length
            if (r1 <= r6) goto L189
            com.google.android.gms.ads.internal.client.zzs[] r1 = new com.google.android.gms.ads.internal.client.zzs[r1]
            r13.zzg = r1
            r1 = 0
        L178:
            int r2 = r15.length
            if (r1 >= r2) goto L18c
            com.google.android.gms.ads.internal.client.zzs[] r2 = r13.zzg
            com.google.android.gms.ads.internal.client.zzs r3 = new com.google.android.gms.ads.internal.client.zzs
            r4 = r15[r1]
            r3.<init>(r14, r4)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L178
        L189:
            r14 = 0
            r13.zzg = r14
        L18c:
            r13.zzh = r0
            r13.zzj = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzs(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) int r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) boolean r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) int r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) int r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) com.google.android.gms.ads.internal.client.zzs[] r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) boolean r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 10) boolean r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 11) boolean r10, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 12) boolean r11, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 13) boolean r12, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 14) boolean r13, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 15) boolean r14, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 16) boolean r15) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            r0.zzh = r8
            r0.zzi = r9
            r0.zzj = r10
            r0.zzk = r11
            r0.zzl = r12
            r0.zzm = r13
            r0.zzn = r14
            r0.zzo = r15
            return
    }

    public static int zza(android.util.DisplayMetrics r1) {
            int r0 = zze(r1)
            float r0 = (float) r0
            float r1 = r1.density
            float r0 = r0 * r1
            int r1 = (int) r0
            return r1
    }

    public static com.google.android.gms.ads.internal.client.zzs zzb() {
            com.google.android.gms.ads.internal.client.zzs r16 = new com.google.android.gms.ads.internal.client.zzs
            java.lang.String r1 = "interstitial_mb"
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
            r15 = 0
            r0 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r16
    }

    public static com.google.android.gms.ads.internal.client.zzs zzc() {
            com.google.android.gms.ads.internal.client.zzs r16 = new com.google.android.gms.ads.internal.client.zzs
            java.lang.String r1 = "320x50_mb"
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r0 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r16
    }

    public static com.google.android.gms.ads.internal.client.zzs zzd() {
            com.google.android.gms.ads.internal.client.zzs r16 = new com.google.android.gms.ads.internal.client.zzs
            java.lang.String r1 = "reward_mb"
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r0 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r16
    }

    private static int zze(android.util.DisplayMetrics r1) {
            int r0 = r1.heightPixels
            float r0 = (float) r0
            float r1 = r1.density
            float r0 = r0 / r1
            int r1 = (int) r0
            r0 = 400(0x190, float:5.6E-43)
            if (r1 > r0) goto Le
            r1 = 32
            return r1
        Le:
            r0 = 720(0x2d0, float:1.009E-42)
            if (r1 > r0) goto L15
            r1 = 50
            return r1
        L15:
            r1 = 90
            return r1
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            java.lang.String r0 = r4.zza
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r0, r3)
            int r0 = r4.zzb
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r0)
            int r0 = r4.zzc
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r0)
            boolean r0 = r4.zzd
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r2, r0)
            int r0 = r4.zze
            r2 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r0)
            int r0 = r4.zzf
            r2 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r0)
            com.google.android.gms.ads.internal.client.zzs[] r0 = r4.zzg
            r2 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(r5, r2, r0, r6, r3)
            boolean r6 = r4.zzh
            r0 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r0, r6)
            boolean r6 = r4.zzi
            r0 = 10
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r0, r6)
            boolean r6 = r4.zzj
            r0 = 11
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r0, r6)
            boolean r6 = r4.zzk
            r0 = 12
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r0, r6)
            boolean r6 = r4.zzl
            r0 = 13
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r0, r6)
            boolean r6 = r4.zzm
            r0 = 14
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r0, r6)
            boolean r6 = r4.zzn
            r0 = 15
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r0, r6)
            boolean r6 = r4.zzo
            r0 = 16
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r0, r6)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
            return
    }
}
