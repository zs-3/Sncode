package com.google.android.gms.internal.drive;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ParcelableTransferPreferencesCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzgo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.drive.TransferPreferences {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzgo> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    private final boolean zzbm;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    private final int zzbn;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final int zzgy;

    static {
            com.google.android.gms.internal.drive.zzgp r0 = new com.google.android.gms.internal.drive.zzgp
            r0.<init>()
            com.google.android.gms.internal.drive.zzgo.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzgo(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) boolean r3) {
            r0 = this;
            r0.<init>()
            r0.zzgy = r1
            r0.zzbn = r2
            r0.zzbm = r3
            return
    }

    @Override // com.google.android.gms.drive.TransferPreferences
    public final int getBatteryUsagePreference() {
            r1 = this;
            int r0 = r1.zzbn
            return r0
    }

    @Override // com.google.android.gms.drive.TransferPreferences
    public final int getNetworkPreference() {
            r1 = this;
            int r0 = r1.zzgy
            return r0
    }

    @Override // com.google.android.gms.drive.TransferPreferences
    public final boolean isRoamingAllowed() {
            r1 = this;
            boolean r0 = r1.zzbm
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            int r0 = r2.zzgy
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r1, r0)
            int r0 = r2.zzbn
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r1, r0)
            boolean r0 = r2.zzbm
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r3, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r4)
            return
    }
}
