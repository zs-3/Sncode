package com.google.android.gms.internal.drive;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "GetMetadataRequestCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzek extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzek> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final com.google.android.gms.drive.DriveId zzdd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    private final boolean zzha;

    static {
            com.google.android.gms.internal.drive.zzel r0 = new com.google.android.gms.internal.drive.zzel
            r0.<init>()
            com.google.android.gms.internal.drive.zzek.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    @com.google.android.gms.common.util.VisibleForTesting
    public zzek(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.drive.DriveId r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) boolean r2) {
            r0 = this;
            r0.<init>()
            r0.zzdd = r1
            r0.zzha = r2
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.drive.DriveId r1 = r4.zzdd
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            boolean r6 = r4.zzha
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
