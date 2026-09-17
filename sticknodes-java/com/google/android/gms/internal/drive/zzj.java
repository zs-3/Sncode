package com.google.android.gms.internal.drive;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AddEventListenerRequestCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzj extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzj> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    private final com.google.android.gms.drive.events.zze zzbv;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    final int zzda;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    private final com.google.android.gms.drive.events.zzx zzdb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 6)
    private final com.google.android.gms.drive.events.zzt zzdc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    final com.google.android.gms.drive.DriveId zzk;

    static {
            com.google.android.gms.internal.drive.zzk r0 = new com.google.android.gms.internal.drive.zzk
            r0.<init>()
            com.google.android.gms.internal.drive.zzj.CREATOR = r0
            return
    }

    public zzj(int r7, com.google.android.gms.drive.DriveId r8) {
            r6 = this;
            java.lang.Object r7 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            r1 = r7
            com.google.android.gms.drive.DriveId r1 = (com.google.android.gms.drive.DriveId) r1
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzj(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.drive.DriveId r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) com.google.android.gms.drive.events.zze r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) com.google.android.gms.drive.events.zzx r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) com.google.android.gms.drive.events.zzt r5) {
            r0 = this;
            r0.<init>()
            r0.zzk = r1
            r0.zzda = r2
            r0.zzbv = r3
            r0.zzdb = r4
            r0.zzdc = r5
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
            com.google.android.gms.drive.events.zze r1 = r4.zzbv
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.drive.events.zzx r1 = r4.zzdb
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.drive.events.zzt r1 = r4.zzdc
            r2 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
