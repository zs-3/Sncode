package com.google.android.gms.internal.drive;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "DriveServiceResponseCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzec extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzec> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    final android.os.IBinder zzgs;

    static {
            com.google.android.gms.internal.drive.zzed r0 = new com.google.android.gms.internal.drive.zzed
            r0.<init>()
            com.google.android.gms.internal.drive.zzec.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzec(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) android.os.IBinder r1) {
            r0 = this;
            r0.<init>()
            r0.zzgs = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            android.os.IBinder r0 = r3.zzgs
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
