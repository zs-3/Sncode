package com.google.android.gms.drive.events;

@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "TransferStateOptionsCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzx extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.events.zzx> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final java.util.List<com.google.android.gms.drive.DriveSpace> zzby;

    static {
            com.google.android.gms.drive.events.zzy r0 = new com.google.android.gms.drive.events.zzy
            r0.<init>()
            com.google.android.gms.drive.events.zzx.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzx(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.util.List<com.google.android.gms.drive.DriveSpace> r1) {
            r0 = this;
            r0.<init>()
            r0.zzby = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 == 0) goto L1a
            java.lang.Class r0 = r3.getClass()
            java.lang.Class<com.google.android.gms.drive.events.zzx> r1 = com.google.android.gms.drive.events.zzx.class
            if (r0 == r1) goto Lb
            goto L1a
        Lb:
            if (r3 != r2) goto Lf
            r3 = 1
            return r3
        Lf:
            com.google.android.gms.drive.events.zzx r3 = (com.google.android.gms.drive.events.zzx) r3
            java.util.List<com.google.android.gms.drive.DriveSpace> r0 = r2.zzby
            java.util.List<com.google.android.gms.drive.DriveSpace> r3 = r3.zzby
            boolean r3 = com.google.android.gms.common.internal.Objects.equal(r0, r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.util.List<com.google.android.gms.drive.DriveSpace> r1 = r3.zzby
            r2 = 0
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.util.Locale r0 = java.util.Locale.US
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.List<com.google.android.gms.drive.DriveSpace> r2 = r4.zzby
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "TransferStateOptions[Spaces=%s]"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.util.List<com.google.android.gms.drive.DriveSpace> r0 = r3.zzby
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
