package com.google.android.gms.internal.drive;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "OnListParentsResponseCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzfv extends com.google.android.gms.drive.zzu {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzfv> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    final com.google.android.gms.common.data.DataHolder zzij;

    static {
            com.google.android.gms.internal.drive.zzfw r0 = new com.google.android.gms.internal.drive.zzfw
            r0.<init>()
            com.google.android.gms.internal.drive.zzfv.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzfv(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.common.data.DataHolder r1) {
            r0 = this;
            r0.<init>()
            r0.zzij = r1
            return
    }

    @Override // com.google.android.gms.drive.zzu
    protected final void zza(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.common.data.DataHolder r1 = r4.zzij
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    public final com.google.android.gms.common.data.DataHolder zzav() {
            r1 = this;
            com.google.android.gms.common.data.DataHolder r0 = r1.zzij
            return r0
    }
}
