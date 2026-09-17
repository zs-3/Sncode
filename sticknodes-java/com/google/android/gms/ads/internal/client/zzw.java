package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AdapterResponseInfoParcelCreator")
/* loaded from: classes.dex */
public final class zzw extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.internal.client.zzw> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    public final java.lang.String zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public long zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public com.google.android.gms.ads.internal.client.zze zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    public final android.os.Bundle zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    public final java.lang.String zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 6)
    public final java.lang.String zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 7)
    public final java.lang.String zzg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 8)
    public final java.lang.String zzh;

    static {
            com.google.android.gms.ads.internal.client.zzx r0 = new com.google.android.gms.ads.internal.client.zzx
            r0.<init>()
            com.google.android.gms.ads.internal.client.zzw.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzw(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) long r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) com.google.android.gms.ads.internal.client.zze r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) android.os.Bundle r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) java.lang.String r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.lang.String r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) java.lang.String r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) java.lang.String r9) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r4
            r0.zzd = r5
            r0.zze = r6
            r0.zzf = r7
            r0.zzg = r8
            r0.zzh = r9
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r7, int r8) {
            r6 = this;
            java.lang.String r0 = r6.zza
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r7)
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r7, r2, r0, r3)
            long r4 = r6.zzb
            r0 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r7, r0, r4)
            com.google.android.gms.ads.internal.client.zze r0 = r6.zzc
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r7, r2, r0, r8, r3)
            android.os.Bundle r8 = r6.zzd
            r0 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(r7, r0, r8, r3)
            java.lang.String r8 = r6.zze
            r0 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r7, r0, r8, r3)
            java.lang.String r8 = r6.zzf
            r0 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r7, r0, r8, r3)
            java.lang.String r8 = r6.zzg
            r0 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r7, r0, r8, r3)
            java.lang.String r8 = r6.zzh
            r0 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r7, r0, r8, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r7, r1)
            return
    }
}
