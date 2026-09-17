package com.google.android.gms.internal.drive;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "OnPinnedDownloadPreferencesResponseCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzga extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzga> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final com.google.android.gms.internal.drive.zzgo zzil;

    static {
            com.google.android.gms.internal.drive.zzgb r0 = new com.google.android.gms.internal.drive.zzgb
            r0.<init>()
            com.google.android.gms.internal.drive.zzga.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzga(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.internal.drive.zzgo r1) {
            r0 = this;
            r0.<init>()
            r0.zzil = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.internal.drive.zzgo r1 = r4.zzil
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    public final com.google.android.gms.drive.TransferPreferences zzax() {
            r1 = this;
            com.google.android.gms.internal.drive.zzgo r0 = r1.zzil
            return r0
    }
}
