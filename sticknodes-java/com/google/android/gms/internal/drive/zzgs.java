package com.google.android.gms.internal.drive;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "RemoveEventListenerRequestCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzgs extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzgs> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    private final int zzda;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    private final com.google.android.gms.drive.events.zzt zzdc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final com.google.android.gms.drive.DriveId zzk;

    static {
            com.google.android.gms.internal.drive.zzgt r0 = new com.google.android.gms.internal.drive.zzgt
            r0.<init>()
            com.google.android.gms.internal.drive.zzgs.CREATOR = r0
            return
    }

    @com.google.android.gms.common.util.VisibleForTesting
    public zzgs(com.google.android.gms.drive.DriveId r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzgs(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.drive.DriveId r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) com.google.android.gms.drive.events.zzt r3) {
            r0 = this;
            r0.<init>()
            r0.zzk = r1
            r0.zzda = r2
            r0.zzdc = r3
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.drive.DriveId r1 = r4.zzk
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            int r1 = r4.zzda
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r1)
            com.google.android.gms.drive.events.zzt r1 = r4.zzdc
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
