package com.google.android.gms.drive;

@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "UserMetadataCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class UserMetadata extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.UserMetadata> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final java.lang.String zzbo;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    private final java.lang.String zzbp;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    private final java.lang.String zzbq;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    private final boolean zzbr;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 6)
    private final java.lang.String zzbs;

    static {
            com.google.android.gms.drive.zzt r0 = new com.google.android.gms.drive.zzt
            r0.<init>()
            com.google.android.gms.drive.UserMetadata.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public UserMetadata(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) boolean r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.zzbo = r1
            r0.zzbp = r2
            r0.zzbq = r3
            r0.zzbr = r4
            r0.zzbs = r5
            return
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.zzbo
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.zzbp
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = r3.zzbq
            r2 = 2
            r0[r2] = r1
            boolean r1 = r3.zzbr
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            java.lang.String r1 = r3.zzbs
            r2 = 4
            r0[r2] = r1
            java.lang.String r1 = "Permission ID: '%s', Display Name: '%s', Picture URL: '%s', Authenticated User: %b, Email: '%s'"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.lang.String r0 = r3.zzbo
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            java.lang.String r0 = r3.zzbp
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            java.lang.String r0 = r3.zzbq
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            boolean r0 = r3.zzbr
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r0)
            java.lang.String r0 = r3.zzbs
            r1 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
