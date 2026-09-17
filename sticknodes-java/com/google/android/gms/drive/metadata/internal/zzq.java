package com.google.android.gms.drive.metadata.internal;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "PartialDriveIdCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzq extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.metadata.internal.zzq> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    final java.lang.String zzad;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    final long zzae;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.drive.DriveId.RESOURCE_TYPE_UNKNOWN", id = 4)
    final int zzaf;

    static {
            com.google.android.gms.drive.metadata.internal.zzr r0 = new com.google.android.gms.drive.metadata.internal.zzr
            r0.<init>()
            com.google.android.gms.drive.metadata.internal.zzq.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzq(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) long r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) int r4) {
            r0 = this;
            r0.<init>()
            r0.zzad = r1
            r0.zzae = r2
            r0.zzaf = r4
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.lang.String r0 = r3.zzad
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            long r0 = r3.zzae
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r2, r0)
            int r0 = r3.zzaf
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
