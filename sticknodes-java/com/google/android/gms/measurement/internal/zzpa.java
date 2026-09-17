package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "UploadBatchParcelCreator")
/* loaded from: classes2.dex */
public final class zzpa extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.zzpa> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    public final long zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public byte[] zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final java.lang.String zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    public final android.os.Bundle zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    public final int zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 6)
    public final long zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 7)
    public java.lang.String zzg;

    static {
            com.google.android.gms.measurement.internal.zzpb r0 = new com.google.android.gms.measurement.internal.zzpb
            r0.<init>()
            com.google.android.gms.measurement.internal.zzpa.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzpa(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) long r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) byte[] r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) android.os.Bundle r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) int r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) long r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) java.lang.String r9) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            r0.zze = r6
            r0.zzf = r7
            r0.zzg = r9
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            long r0 = r4.zza
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r5, r2, r0)
            byte[] r0 = r4.zzb
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r5, r1, r0, r2)
            java.lang.String r0 = r4.zzc
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r0, r2)
            android.os.Bundle r0 = r4.zzd
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(r5, r1, r0, r2)
            int r0 = r4.zze
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r0)
            long r0 = r4.zzf
            r3 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r5, r3, r0)
            java.lang.String r0 = r4.zzg
            r1 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r6)
            return
    }
}
