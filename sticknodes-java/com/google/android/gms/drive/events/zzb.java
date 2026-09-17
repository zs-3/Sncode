package com.google.android.gms.drive.events;

@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ChangesAvailableEventCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1, 2})
/* loaded from: classes.dex */
public final class zzb extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.drive.events.DriveEvent {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.events.zzb> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    private final com.google.android.gms.drive.events.zze zzbv;

    static {
            com.google.android.gms.drive.events.zzc r0 = new com.google.android.gms.drive.events.zzc
            r0.<init>()
            com.google.android.gms.drive.events.zzb.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzb(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) com.google.android.gms.drive.events.zze r1) {
            r0 = this;
            r0.<init>()
            r0.zzbv = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 == 0) goto L1a
            java.lang.Class r0 = r3.getClass()
            java.lang.Class<com.google.android.gms.drive.events.zzb> r1 = com.google.android.gms.drive.events.zzb.class
            if (r0 == r1) goto Lb
            goto L1a
        Lb:
            if (r3 != r2) goto Lf
            r3 = 1
            return r3
        Lf:
            com.google.android.gms.drive.events.zzb r3 = (com.google.android.gms.drive.events.zzb) r3
            com.google.android.gms.drive.events.zze r0 = r2.zzbv
            com.google.android.gms.drive.events.zze r3 = r3.zzbv
            boolean r3 = com.google.android.gms.common.internal.Objects.equal(r0, r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    @Override // com.google.android.gms.drive.events.DriveEvent
    public final int getType() {
            r1 = this;
            r0 = 4
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.drive.events.zze r1 = r3.zzbv
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
            com.google.android.gms.drive.events.zze r2 = r4.zzbv
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "ChangesAvailableEvent [changesAvailableOptions=%s]"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.drive.events.zze r1 = r4.zzbv
            r2 = 3
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
