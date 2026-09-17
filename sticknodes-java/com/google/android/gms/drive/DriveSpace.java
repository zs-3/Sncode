package com.google.android.gms.drive;

@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "DriveSpaceCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class DriveSpace extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.DriveSpace> CREATOR = null;
    public static final com.google.android.gms.drive.DriveSpace zzah = null;
    public static final com.google.android.gms.drive.DriveSpace zzai = null;
    public static final com.google.android.gms.drive.DriveSpace zzaj = null;
    private static final java.util.Set<com.google.android.gms.drive.DriveSpace> zzak = null;
    private static final java.lang.String zzal = null;
    private static final java.util.regex.Pattern zzam = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getName", id = 2)
    private final java.lang.String name;

    static {
            com.google.android.gms.drive.zzm r0 = new com.google.android.gms.drive.zzm
            r0.<init>()
            com.google.android.gms.drive.DriveSpace.CREATOR = r0
            com.google.android.gms.drive.DriveSpace r0 = new com.google.android.gms.drive.DriveSpace
            java.lang.String r1 = "DRIVE"
            r0.<init>(r1)
            com.google.android.gms.drive.DriveSpace.zzah = r0
            com.google.android.gms.drive.DriveSpace r1 = new com.google.android.gms.drive.DriveSpace
            java.lang.String r2 = "APP_DATA_FOLDER"
            r1.<init>(r2)
            com.google.android.gms.drive.DriveSpace.zzai = r1
            com.google.android.gms.drive.DriveSpace r2 = new com.google.android.gms.drive.DriveSpace
            java.lang.String r3 = "PHOTOS"
            r2.<init>(r3)
            com.google.android.gms.drive.DriveSpace.zzaj = r2
            java.util.Set r0 = com.google.android.gms.common.util.CollectionUtils.setOf(r0, r1, r2)
            com.google.android.gms.drive.DriveSpace.zzak = r0
            java.lang.Object[] r0 = r0.toArray()
            java.lang.String r1 = ","
            java.lang.String r0 = android.text.TextUtils.join(r1, r0)
            com.google.android.gms.drive.DriveSpace.zzal = r0
            java.lang.String r0 = "[A-Z0-9_]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.drive.DriveSpace.zzam = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    DriveSpace(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.name = r1
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 == 0) goto L16
            java.lang.Class r0 = r3.getClass()
            java.lang.Class<com.google.android.gms.drive.DriveSpace> r1 = com.google.android.gms.drive.DriveSpace.class
            if (r0 == r1) goto Lb
            goto L16
        Lb:
            java.lang.String r0 = r2.name
            com.google.android.gms.drive.DriveSpace r3 = (com.google.android.gms.drive.DriveSpace) r3
            java.lang.String r3 = r3.name
            boolean r3 = r0.equals(r3)
            return r3
        L16:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.name
            int r0 = r0.hashCode()
            r1 = 1247068382(0x4a54c0de, float:3485751.5)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.lang.String r0 = r3.name
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
