package com.google.android.gms.drive.events;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ChangeEventCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class ChangeEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.drive.events.ResourceEvent {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.events.ChangeEvent> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    private final int zzbu;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final com.google.android.gms.drive.DriveId zzk;

    static {
            com.google.android.gms.drive.events.zza r0 = new com.google.android.gms.drive.events.zza
            r0.<init>()
            com.google.android.gms.drive.events.ChangeEvent.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public ChangeEvent(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.drive.DriveId r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r2) {
            r0 = this;
            r0.<init>()
            r0.zzk = r1
            r0.zzbu = r2
            return
    }

    @Override // com.google.android.gms.drive.events.ResourceEvent
    public final com.google.android.gms.drive.DriveId getDriveId() {
            r1 = this;
            com.google.android.gms.drive.DriveId r0 = r1.zzk
            return r0
    }

    @Override // com.google.android.gms.drive.events.DriveEvent
    public final int getType() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final boolean hasBeenDeleted() {
            r1 = this;
            int r0 = r1.zzbu
            r0 = r0 & 4
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final boolean hasContentChanged() {
            r1 = this;
            int r0 = r1.zzbu
            r0 = r0 & 2
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final boolean hasMetadataChanged() {
            r2 = this;
            int r0 = r2.zzbu
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L7
            return r1
        L7:
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.util.Locale r0 = java.util.Locale.US
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.google.android.gms.drive.DriveId r2 = r4.zzk
            r3 = 0
            r1[r3] = r2
            int r2 = r4.zzbu
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "ChangeEvent [id=%s,changeFlags=%x]"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.drive.DriveId r1 = r4.zzk
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            int r6 = r4.zzbu
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r6)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
