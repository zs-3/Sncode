package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "NonagonRequestParcelCreator")
/* loaded from: classes.dex */
public final class zzbwa extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzbwa> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    public final android.os.Bundle zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final android.content.pm.ApplicationInfo zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    public final java.lang.String zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    public final java.util.List zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 6)
    public final android.content.pm.PackageInfo zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 7)
    public final java.lang.String zzg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 9)
    public final java.lang.String zzh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 10)
    public com.google.android.gms.internal.ads.zzfix zzi;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 11)
    public java.lang.String zzj;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 12)
    public final boolean zzk;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 13)
    public final boolean zzl;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 14)
    public final android.os.Bundle zzm;

    static {
            com.google.android.gms.internal.ads.zzbwb r0 = new com.google.android.gms.internal.ads.zzbwb
            r0.<init>()
            com.google.android.gms.internal.ads.zzbwa.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzbwa(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) android.os.Bundle r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) android.content.pm.ApplicationInfo r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) java.util.List r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) android.content.pm.PackageInfo r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) java.lang.String r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) java.lang.String r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 10) com.google.android.gms.internal.ads.zzfix r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 11) java.lang.String r10, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 12) boolean r11, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 13) boolean r12, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 14) android.os.Bundle r13) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzd = r4
            r0.zzc = r3
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            r0.zzh = r8
            r0.zzi = r9
            r0.zzj = r10
            r0.zzk = r11
            r0.zzl = r12
            r0.zzm = r13
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            android.os.Bundle r0 = r4.zza
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(r5, r2, r0, r3)
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r4.zzb
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r0, r6, r3)
            android.content.pm.ApplicationInfo r0 = r4.zzc
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r0, r6, r3)
            java.lang.String r0 = r4.zzd
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r0, r3)
            java.util.List r0 = r4.zze
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(r5, r2, r0, r3)
            android.content.pm.PackageInfo r0 = r4.zzf
            r2 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r0, r6, r3)
            java.lang.String r0 = r4.zzg
            r2 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r0, r3)
            java.lang.String r0 = r4.zzh
            r2 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r0, r3)
            com.google.android.gms.internal.ads.zzfix r0 = r4.zzi
            r2 = 10
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r0, r6, r3)
            java.lang.String r6 = r4.zzj
            r0 = 11
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r0, r6, r3)
            boolean r6 = r4.zzk
            r0 = 12
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r0, r6)
            boolean r6 = r4.zzl
            r0 = 13
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r0, r6)
            android.os.Bundle r6 = r4.zzm
            r0 = 14
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(r5, r0, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
            return
    }
}
