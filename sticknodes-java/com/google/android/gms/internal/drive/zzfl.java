package com.google.android.gms.internal.drive;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "OnDownloadProgressResponseCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzfl extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzfl> CREATOR = null;
    private static final java.util.List<com.google.android.gms.drive.zzh> zzhx = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    private final int status;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    final long zzhy;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    final long zzhz;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    private final java.util.List<com.google.android.gms.drive.zzh> zzia;

    static {
            java.util.List r0 = java.util.Collections.emptyList()
            com.google.android.gms.internal.drive.zzfl.zzhx = r0
            com.google.android.gms.internal.drive.zzfm r0 = new com.google.android.gms.internal.drive.zzfm
            r0.<init>()
            com.google.android.gms.internal.drive.zzfl.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzfl(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) long r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) long r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) int r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) java.util.List<com.google.android.gms.drive.zzh> r6) {
            r0 = this;
            r0.<init>()
            r0.zzhy = r1
            r0.zzhz = r3
            r0.status = r5
            r0.zzia = r6
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            long r0 = r3.zzhy
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r2, r0)
            long r0 = r3.zzhz
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r2, r0)
            int r0 = r3.status
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            java.util.List<com.google.android.gms.drive.zzh> r0 = r3.zzia
            r1 = 5
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
