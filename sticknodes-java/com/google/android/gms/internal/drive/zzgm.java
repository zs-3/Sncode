package com.google.android.gms.internal.drive;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "OpenFileIntentSenderRequestCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzgm extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzgm> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final java.lang.String zzba;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    private final java.lang.String[] zzbb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    private final com.google.android.gms.drive.DriveId zzbd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    private final com.google.android.gms.drive.query.internal.FilterHolder zzbe;

    static {
            com.google.android.gms.internal.drive.zzgn r0 = new com.google.android.gms.internal.drive.zzgn
            r0.<init>()
            com.google.android.gms.internal.drive.zzgm.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    @com.google.android.gms.common.util.VisibleForTesting
    public zzgm(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String[] r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) com.google.android.gms.drive.DriveId r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) com.google.android.gms.drive.query.internal.FilterHolder r4) {
            r0 = this;
            r0.<init>()
            r0.zzba = r1
            r0.zzbb = r2
            r0.zzbd = r3
            r0.zzbe = r4
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            java.lang.String r1 = r4.zzba
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            java.lang.String[] r1 = r4.zzbb
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(r5, r2, r1, r3)
            com.google.android.gms.drive.DriveId r1 = r4.zzbd
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.drive.query.internal.FilterHolder r1 = r4.zzbe
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
