package com.google.android.gms.drive.metadata.internal;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ParentDriveIdSetCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class ParentDriveIdSet extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.metadata.internal.ParentDriveIdSet> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    final java.util.List<com.google.android.gms.drive.metadata.internal.zzq> zzjj;

    static {
            com.google.android.gms.drive.metadata.internal.zzn r0 = new com.google.android.gms.drive.metadata.internal.zzn
            r0.<init>()
            com.google.android.gms.drive.metadata.internal.ParentDriveIdSet.CREATOR = r0
            return
    }

    public ParentDriveIdSet() {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.<init>(r0)
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    ParentDriveIdSet(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.util.List<com.google.android.gms.drive.metadata.internal.zzq> r1) {
            r0 = this;
            r0.<init>()
            r0.zzjj = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.util.List<com.google.android.gms.drive.metadata.internal.zzq> r0 = r3.zzjj
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
