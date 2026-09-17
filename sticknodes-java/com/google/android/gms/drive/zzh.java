package com.google.android.gms.drive;

@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "DriveFileRangeCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzh extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.zzh> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final long zzab;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    private final long zzac;

    static {
            com.google.android.gms.drive.zzi r0 = new com.google.android.gms.drive.zzi
            r0.<init>()
            com.google.android.gms.drive.zzh.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzh(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) long r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) long r3) {
            r0 = this;
            r0.<init>()
            r0.zzab = r1
            r0.zzac = r3
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            long r0 = r3.zzab
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r2, r0)
            long r0 = r3.zzac
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r2, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
