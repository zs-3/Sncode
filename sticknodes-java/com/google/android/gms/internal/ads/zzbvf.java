package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "HttpRequestParcelCreator")
/* loaded from: classes.dex */
public final class zzbvf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzbvf> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    public final java.lang.String zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final int zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final android.os.Bundle zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    public final byte[] zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    public final boolean zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 6)
    public final java.lang.String zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 7)
    public final java.lang.String zzg;

    static {
            com.google.android.gms.internal.ads.zzbvg r0 = new com.google.android.gms.internal.ads.zzbvg
            r0.<init>()
            com.google.android.gms.internal.ads.zzbvf.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzbvf(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) android.os.Bundle r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) byte[] r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) boolean r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.lang.String r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) java.lang.String r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            java.lang.String r5 = r3.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r5, r2)
            int r5 = r3.zzb
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r5)
            android.os.Bundle r5 = r3.zzc
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(r4, r1, r5, r2)
            byte[] r5 = r3.zzd
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r4, r1, r5, r2)
            boolean r5 = r3.zze
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r5)
            java.lang.String r5 = r3.zzf
            r1 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r5, r2)
            java.lang.String r5 = r3.zzg
            r1 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r5, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }
}
