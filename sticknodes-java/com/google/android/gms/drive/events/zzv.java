package com.google.android.gms.drive.events;

@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "TransferStateEventCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1, 2})
/* loaded from: classes.dex */
public final class zzv extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.drive.events.DriveEvent {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.events.zzv> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    private final java.util.List<com.google.android.gms.internal.drive.zzh> zzcu;

    static {
            com.google.android.gms.drive.events.zzw r0 = new com.google.android.gms.drive.events.zzw
            r0.<init>()
            com.google.android.gms.drive.events.zzv.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzv(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.util.List<com.google.android.gms.internal.drive.zzh> r1) {
            r0 = this;
            r0.<init>()
            r0.zzcu = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 == 0) goto L1a
            java.lang.Class r0 = r3.getClass()
            java.lang.Class<com.google.android.gms.drive.events.zzv> r1 = com.google.android.gms.drive.events.zzv.class
            if (r0 == r1) goto Lb
            goto L1a
        Lb:
            if (r3 != r2) goto Lf
            r3 = 1
            return r3
        Lf:
            com.google.android.gms.drive.events.zzv r3 = (com.google.android.gms.drive.events.zzv) r3
            java.util.List<com.google.android.gms.internal.drive.zzh> r0 = r2.zzcu
            java.util.List<com.google.android.gms.internal.drive.zzh> r3 = r3.zzcu
            boolean r3 = com.google.android.gms.common.internal.Objects.equal(r0, r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    @Override // com.google.android.gms.drive.events.DriveEvent
    public final int getType() {
            r1 = this;
            r0 = 7
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.util.List<com.google.android.gms.internal.drive.zzh> r1 = r3.zzcu
            r2 = 0
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.util.List<com.google.android.gms.internal.drive.zzh> r1 = r3.zzcu
            java.lang.String r2 = "','"
            java.lang.String r1 = android.text.TextUtils.join(r2, r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "TransferStateEvent[%s]"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.util.List<com.google.android.gms.internal.drive.zzh> r0 = r3.zzcu
            r1 = 3
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
