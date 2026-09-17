package com.google.android.gms.drive.events;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "TransferProgressOptionsCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzt extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.events.zzt> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final int zzct;

    static {
            com.google.android.gms.drive.events.zzu r0 = new com.google.android.gms.drive.events.zzu
            r0.<init>()
            com.google.android.gms.drive.events.zzt.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzt(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r1) {
            r0 = this;
            r0.<init>()
            r0.zzct = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            int r0 = r2.zzct
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r4)
            return
    }
}
