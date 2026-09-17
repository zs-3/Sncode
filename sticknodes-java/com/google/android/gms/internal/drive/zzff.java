package com.google.android.gms.internal.drive;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "OnChangesResponseCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzff extends com.google.android.gms.drive.zzu {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzff> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final com.google.android.gms.common.data.DataHolder zzhr;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    private final java.util.List<com.google.android.gms.drive.DriveId> zzhs;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    private final com.google.android.gms.drive.zza zzht;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    private final boolean zzhu;

    static {
            com.google.android.gms.internal.drive.zzfg r0 = new com.google.android.gms.internal.drive.zzfg
            r0.<init>()
            com.google.android.gms.internal.drive.zzff.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzff(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.common.data.DataHolder r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.util.List<com.google.android.gms.drive.DriveId> r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) com.google.android.gms.drive.zza r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) boolean r4) {
            r0 = this;
            r0.<init>()
            r0.zzhr = r1
            r0.zzhs = r2
            r0.zzht = r3
            r0.zzhu = r4
            return
    }

    @Override // com.google.android.gms.drive.zzu
    protected final void zza(android.os.Parcel r5, int r6) {
            r4 = this;
            r6 = r6 | 1
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.common.data.DataHolder r1 = r4.zzhr
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.util.List<com.google.android.gms.drive.DriveId> r1 = r4.zzhs
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r5, r2, r1, r3)
            com.google.android.gms.drive.zza r1 = r4.zzht
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            boolean r6 = r4.zzhu
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
