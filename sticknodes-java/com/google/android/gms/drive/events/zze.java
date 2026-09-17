package com.google.android.gms.drive.events;

@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ChangesAvailableOptionsCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zze extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.events.zze> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final int zzbw;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    private final boolean zzbx;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    private final java.util.List<com.google.android.gms.drive.DriveSpace> zzby;

    static {
            com.google.android.gms.drive.events.zzf r0 = new com.google.android.gms.drive.events.zzf
            r0.<init>()
            com.google.android.gms.drive.events.zze.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zze(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) boolean r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.util.List<com.google.android.gms.drive.DriveSpace> r3) {
            r0 = this;
            r0.<init>()
            r0.zzbw = r1
            r0.zzbx = r2
            r0.zzby = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L29
            java.lang.Class r1 = r5.getClass()
            java.lang.Class<com.google.android.gms.drive.events.zze> r2 = com.google.android.gms.drive.events.zze.class
            if (r1 == r2) goto Lc
            goto L29
        Lc:
            r1 = 1
            if (r5 != r4) goto L10
            return r1
        L10:
            com.google.android.gms.drive.events.zze r5 = (com.google.android.gms.drive.events.zze) r5
            java.util.List<com.google.android.gms.drive.DriveSpace> r2 = r4.zzby
            java.util.List<com.google.android.gms.drive.DriveSpace> r3 = r5.zzby
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L29
            int r2 = r4.zzbw
            int r3 = r5.zzbw
            if (r2 != r3) goto L29
            boolean r2 = r4.zzbx
            boolean r5 = r5.zzbx
            if (r2 != r5) goto L29
            return r1
        L29:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.util.List<com.google.android.gms.drive.DriveSpace> r1 = r3.zzby
            r2 = 0
            r0[r2] = r1
            int r1 = r3.zzbw
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            boolean r1 = r3.zzbx
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            int r0 = r3.zzbw
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            boolean r0 = r3.zzbx
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r0)
            java.util.List<com.google.android.gms.drive.DriveSpace> r0 = r3.zzby
            r1 = 4
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
