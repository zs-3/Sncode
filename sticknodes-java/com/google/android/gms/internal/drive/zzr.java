package com.google.android.gms.internal.drive;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "CreateContentsRequestCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzr extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzr> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.drive.DriveFile.MODE_WRITE_ONLY", id = 2)
    private final int mode;

    static {
            com.google.android.gms.internal.drive.zzs r0 = new com.google.android.gms.internal.drive.zzs
            r0.<init>()
            com.google.android.gms.internal.drive.zzr.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzr(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r3) {
            r2 = this;
            r2.<init>()
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r3 == r0) goto Le
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r3 != r0) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            java.lang.String r1 = "Cannot create a new read-only contents!"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            r2.mode = r3
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            int r0 = r2.mode
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r4)
            return
    }
}
