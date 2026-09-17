package com.google.android.gms.internal.drive;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "CloseContentsRequestCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzo> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final com.google.android.gms.drive.Contents zzdf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    private final int zzdh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    private final java.lang.Boolean zzdj;

    static {
            com.google.android.gms.internal.drive.zzp r0 = new com.google.android.gms.internal.drive.zzp
            r0.<init>()
            com.google.android.gms.internal.drive.zzo.CREATOR = r0
            return
    }

    @com.google.android.gms.common.util.VisibleForTesting
    public zzo(int r2, boolean r3) {
            r1 = this;
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r0 = 0
            r1.<init>(r0, r3, r2)
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    @com.google.android.gms.common.util.VisibleForTesting
    public zzo(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.drive.Contents r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.Boolean r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) int r3) {
            r0 = this;
            r0.<init>()
            r0.zzdf = r1
            r0.zzdj = r2
            r0.zzdh = r3
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.drive.Contents r1 = r4.zzdf
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.lang.Boolean r6 = r4.zzdj
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBooleanObject(r5, r1, r6, r3)
            int r6 = r4.zzdh
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r6)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
