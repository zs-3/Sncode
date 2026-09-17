package com.google.android.gms.internal.drive;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "CloseContentsAndUpdateMetadataRequestCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzm extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzm> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 6)
    private final java.lang.String zzan;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    private final boolean zzao;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "true", id = 10)
    private final boolean zzat;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final com.google.android.gms.drive.DriveId zzdd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    private final com.google.android.gms.drive.metadata.internal.MetadataBundle zzde;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    private final com.google.android.gms.drive.Contents zzdf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 7)
    private final int zzdg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 8)
    private final int zzdh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 9)
    private final boolean zzdi;

    static {
            com.google.android.gms.internal.drive.zzn r0 = new com.google.android.gms.internal.drive.zzn
            r0.<init>()
            com.google.android.gms.internal.drive.zzm.CREATOR = r0
            return
    }

    @com.google.android.gms.common.util.VisibleForTesting
    public zzm(com.google.android.gms.drive.DriveId r11, com.google.android.gms.drive.metadata.internal.MetadataBundle r12, int r13, boolean r14, com.google.android.gms.drive.zzn r15) {
            r10 = this;
            boolean r4 = r15.zzm()
            java.lang.String r5 = r15.zzl()
            int r6 = r15.zzn()
            boolean r9 = r15.zzp()
            r3 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r7 = r13
            r8 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzm(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.drive.DriveId r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) com.google.android.gms.drive.metadata.internal.MetadataBundle r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) com.google.android.gms.drive.Contents r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) boolean r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.lang.String r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) int r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) int r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) boolean r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 10) boolean r9) {
            r0 = this;
            r0.<init>()
            r0.zzdd = r1
            r0.zzde = r2
            r0.zzdf = r3
            r0.zzao = r4
            r0.zzan = r5
            r0.zzdg = r6
            r0.zzdh = r7
            r0.zzdi = r8
            r0.zzat = r9
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.drive.DriveId r1 = r4.zzdd
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.drive.metadata.internal.MetadataBundle r1 = r4.zzde
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.drive.Contents r1 = r4.zzdf
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            boolean r6 = r4.zzao
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            java.lang.String r6 = r4.zzan
            r1 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            int r6 = r4.zzdg
            r1 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r6)
            int r6 = r4.zzdh
            r1 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r6)
            boolean r6 = r4.zzdi
            r1 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            boolean r6 = r4.zzat
            r1 = 10
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
