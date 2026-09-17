package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AdsServiceInputParcelCreator")
/* loaded from: classes.dex */
public final class zzbvb extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzbvb> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    public final android.content.pm.ApplicationInfo zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final java.lang.String zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final android.content.pm.PackageInfo zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    public final java.lang.String zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    public final int zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 6)
    public final java.lang.String zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 7)
    public final java.util.List zzg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 8)
    public final boolean zzh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 9)
    public final boolean zzi;

    static {
            com.google.android.gms.internal.ads.zzbvc r0 = new com.google.android.gms.internal.ads.zzbvc
            r0.<init>()
            com.google.android.gms.internal.ads.zzbvb.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzbvb(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) android.content.pm.ApplicationInfo r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) android.content.pm.PackageInfo r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) int r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.lang.String r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) java.util.List r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) boolean r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) boolean r9) {
            r0 = this;
            r0.<init>()
            r0.zzb = r2
            r0.zza = r1
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            r0.zzh = r8
            r0.zzi = r9
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            android.content.pm.ApplicationInfo r0 = r4.zza
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r0, r6, r3)
            java.lang.String r0 = r4.zzb
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r0, r3)
            android.content.pm.PackageInfo r0 = r4.zzc
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r0, r6, r3)
            java.lang.String r6 = r4.zzd
            r0 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r0, r6, r3)
            int r6 = r4.zze
            r0 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r0, r6)
            java.lang.String r6 = r4.zzf
            r0 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r0, r6, r3)
            java.util.List r6 = r4.zzg
            r0 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(r5, r0, r6, r3)
            boolean r6 = r4.zzh
            r0 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r0, r6)
            boolean r6 = r4.zzi
            r0 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r0, r6)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
            return
    }
}
