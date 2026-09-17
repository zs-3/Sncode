package com.google.android.gms.internal.drive;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "CreateFileRequestCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1, 10})
/* loaded from: classes.dex */
public final class zzw extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzw> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 7)
    private final java.lang.String zzan;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    private final com.google.android.gms.drive.Contents zzdf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    private final com.google.android.gms.drive.metadata.internal.MetadataBundle zzdn;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    private final java.lang.Integer zzdo;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final com.google.android.gms.drive.DriveId zzdp;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 6)
    private final boolean zzdq;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 8)
    private final int zzdr;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 9)
    private final int zzds;

    static {
            com.google.android.gms.internal.drive.zzx r0 = new com.google.android.gms.internal.drive.zzx
            r0.<init>()
            com.google.android.gms.internal.drive.zzw.CREATOR = r0
            return
    }

    @com.google.android.gms.common.util.VisibleForTesting
    public zzw(com.google.android.gms.drive.DriveId r10, com.google.android.gms.drive.metadata.internal.MetadataBundle r11, int r12, int r13, com.google.android.gms.drive.ExecutionOptions r14) {
            r9 = this;
            boolean r5 = r14.zzm()
            java.lang.String r6 = r14.zzl()
            int r7 = r14.zzn()
            r3 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r4 = r13
            r8 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzw(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.drive.DriveId r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) com.google.android.gms.drive.metadata.internal.MetadataBundle r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) com.google.android.gms.drive.Contents r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) int r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) boolean r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) java.lang.String r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) int r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) int r10) {
            r2 = this;
            r2.<init>()
            if (r5 == 0) goto L15
            if (r10 == 0) goto L15
            int r0 = r5.getRequestId()
            if (r0 != r10) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            java.lang.String r1 = "inconsistent contents reference"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
        L15:
            if (r6 != 0) goto L24
            if (r5 != 0) goto L24
            if (r10 == 0) goto L1c
            goto L24
        L1c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Need a valid contents"
            r3.<init>(r4)
            throw r3
        L24:
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.drive.DriveId r3 = (com.google.android.gms.drive.DriveId) r3
            r2.zzdp = r3
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.google.android.gms.drive.metadata.internal.MetadataBundle r3 = (com.google.android.gms.drive.metadata.internal.MetadataBundle) r3
            r2.zzdn = r3
            r2.zzdf = r5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r2.zzdo = r3
            r2.zzan = r8
            r2.zzdr = r9
            r2.zzdq = r7
            r2.zzds = r10
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.drive.DriveId r1 = r4.zzdp
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.drive.metadata.internal.MetadataBundle r1 = r4.zzdn
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.drive.Contents r1 = r4.zzdf
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.lang.Integer r6 = r4.zzdo
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(r5, r1, r6, r3)
            boolean r6 = r4.zzdq
            r1 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            java.lang.String r6 = r4.zzan
            r1 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            int r6 = r4.zzdr
            r1 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r6)
            int r6 = r4.zzds
            r1 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r6)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
