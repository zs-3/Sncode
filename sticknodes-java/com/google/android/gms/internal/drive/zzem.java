package com.google.android.gms.internal.drive;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "GetPermissionsResponseCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzem extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzem> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    private final int responseCode;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final java.util.List<com.google.android.gms.drive.zzr> zzhb;

    static {
            com.google.android.gms.internal.drive.zzen r0 = new com.google.android.gms.internal.drive.zzen
            r0.<init>()
            com.google.android.gms.internal.drive.zzem.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzem(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.util.List<com.google.android.gms.drive.zzr> r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r2) {
            r0 = this;
            r0.<init>()
            r0.zzhb = r1
            r0.responseCode = r2
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.util.List<com.google.android.gms.drive.zzr> r0 = r3.zzhb
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r4, r1, r0, r2)
            int r0 = r3.responseCode
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
