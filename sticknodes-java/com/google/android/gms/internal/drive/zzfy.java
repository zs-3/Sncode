package com.google.android.gms.internal.drive;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "OnMetadataResponseCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzfy extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzfy> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    final com.google.android.gms.drive.metadata.internal.MetadataBundle zzdn;

    static {
            com.google.android.gms.internal.drive.zzfz r0 = new com.google.android.gms.internal.drive.zzfz
            r0.<init>()
            com.google.android.gms.internal.drive.zzfy.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzfy(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.drive.metadata.internal.MetadataBundle r1) {
            r0 = this;
            r0.<init>()
            r0.zzdn = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.drive.metadata.internal.MetadataBundle r1 = r4.zzdn
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    public final com.google.android.gms.drive.metadata.internal.MetadataBundle zzaw() {
            r1 = this;
            com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r1.zzdn
            return r0
    }
}
