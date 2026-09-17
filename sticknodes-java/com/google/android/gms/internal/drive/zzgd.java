package com.google.android.gms.internal.drive;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "OnResourceIdSetResponseCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzgd extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzgd> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getResourceIds", id = 2)
    private final java.util.List<java.lang.String> zzim;

    static {
            com.google.android.gms.internal.drive.zzge r0 = new com.google.android.gms.internal.drive.zzge
            r0.<init>()
            com.google.android.gms.internal.drive.zzgd.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzgd(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.<init>()
            r0.zzim = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.util.List<java.lang.String> r0 = r3.zzim
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
