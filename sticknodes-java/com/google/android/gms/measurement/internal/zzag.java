package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "BatchUploadStatusParcelCreator")
/* loaded from: classes2.dex */
public final class zzag extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.zzag> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    public final long zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final int zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final long zzc;

    static {
            com.google.android.gms.measurement.internal.zzah r0 = new com.google.android.gms.measurement.internal.zzah
            r0.<init>()
            com.google.android.gms.measurement.internal.zzag.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzag(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) long r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) long r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r3
            r0.zzc = r4
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            long r0 = r3.zza
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r2, r0)
            int r0 = r3.zzb
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            long r0 = r3.zzc
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r2, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
