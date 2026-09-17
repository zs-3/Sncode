package com.google.android.gms.internal.drive;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "FileUploadPreferencesImplCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
@java.lang.Deprecated
/* loaded from: classes.dex */
public final class zzei extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.drive.FileUploadPreferences {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzei> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    private int zzbn;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private int zzgy;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    private boolean zzgz;

    static {
            com.google.android.gms.internal.drive.zzej r0 = new com.google.android.gms.internal.drive.zzej
            r0.<init>()
            com.google.android.gms.internal.drive.zzei.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzei(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) boolean r3) {
            r0 = this;
            r0.<init>()
            r0.zzgy = r1
            r0.zzbn = r2
            r0.zzgz = r3
            return
    }

    public zzei(com.google.android.gms.drive.TransferPreferences r3) {
            r2 = this;
            int r0 = r3.getNetworkPreference()
            int r1 = r3.getBatteryUsagePreference()
            boolean r3 = r3.isRoamingAllowed()
            r2.<init>(r0, r1, r3)
            return
    }

    private static boolean zzh(int r2) {
            r0 = 1
            if (r2 == r0) goto L8
            r1 = 2
            if (r2 == r1) goto L8
            r2 = 0
            return r2
        L8:
            return r0
    }

    private static boolean zzi(int r1) {
            r0 = 256(0x100, float:3.59E-43)
            if (r1 == r0) goto La
            r0 = 257(0x101, float:3.6E-43)
            if (r1 == r0) goto La
            r1 = 0
            return r1
        La:
            r1 = 1
            return r1
    }

    @Override // com.google.android.gms.drive.FileUploadPreferences
    public final int getBatteryUsagePreference() {
            r1 = this;
            int r0 = r1.zzbn
            boolean r0 = zzi(r0)
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            int r0 = r1.zzbn
            return r0
    }

    @Override // com.google.android.gms.drive.FileUploadPreferences
    public final int getNetworkTypePreference() {
            r1 = this;
            int r0 = r1.zzgy
            boolean r0 = zzh(r0)
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            int r0 = r1.zzgy
            return r0
    }

    @Override // com.google.android.gms.drive.FileUploadPreferences
    public final boolean isRoamingAllowed() {
            r1 = this;
            boolean r0 = r1.zzgz
            return r0
    }

    @Override // com.google.android.gms.drive.FileUploadPreferences
    public final void setBatteryUsagePreference(int r2) {
            r1 = this;
            boolean r0 = zzi(r2)
            if (r0 == 0) goto L9
            r1.zzbn = r2
            return
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid battery usage preference value."
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.drive.FileUploadPreferences
    public final void setNetworkTypePreference(int r2) {
            r1 = this;
            boolean r0 = zzh(r2)
            if (r0 == 0) goto L9
            r1.zzgy = r2
            return
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid data connection preference value."
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.drive.FileUploadPreferences
    public final void setRoamingAllowed(boolean r1) {
            r0 = this;
            r0.zzgz = r1
            return
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
            boolean r0 = r2.zzgz
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r3, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r4)
            return
    }
}
