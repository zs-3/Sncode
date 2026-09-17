package com.google.android.gms.drive.events;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "TransferProgressEventCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzr extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.drive.events.DriveEvent {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.events.zzr> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final com.google.android.gms.internal.drive.zzh zzcs;

    static {
            com.google.android.gms.drive.events.zzs r0 = new com.google.android.gms.drive.events.zzs
            r0.<init>()
            com.google.android.gms.drive.events.zzr.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzr(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.internal.drive.zzh r1) {
            r0 = this;
            r0.<init>()
            r0.zzcs = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 == 0) goto L1a
            java.lang.Class r0 = r3.getClass()
            java.lang.Class<com.google.android.gms.drive.events.zzr> r1 = com.google.android.gms.drive.events.zzr.class
            if (r0 == r1) goto Lb
            goto L1a
        Lb:
            if (r3 != r2) goto Lf
            r3 = 1
            return r3
        Lf:
            com.google.android.gms.drive.events.zzr r3 = (com.google.android.gms.drive.events.zzr) r3
            com.google.android.gms.internal.drive.zzh r0 = r2.zzcs
            com.google.android.gms.internal.drive.zzh r3 = r3.zzcs
            boolean r3 = com.google.android.gms.common.internal.Objects.equal(r0, r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    @Override // com.google.android.gms.drive.events.DriveEvent
    public final int getType() {
            r1 = this;
            r0 = 8
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.internal.drive.zzh r1 = r3.zzcs
            r2 = 0
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.internal.drive.zzh r1 = r4.zzcs
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    public final com.google.android.gms.internal.drive.zzh zzac() {
            r1 = this;
            com.google.android.gms.internal.drive.zzh r0 = r1.zzcs
            return r0
    }
}
