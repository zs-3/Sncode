package com.google.android.gms.internal.drive;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "TransferProgressDataCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzh extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzh> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    final int status;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    final int zzct;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    final long zzcw;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 6)
    final long zzcx;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    final com.google.android.gms.drive.DriveId zzk;

    static {
            com.google.android.gms.internal.drive.zzi r0 = new com.google.android.gms.internal.drive.zzi
            r0.<init>()
            com.google.android.gms.internal.drive.zzh.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzh(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) com.google.android.gms.drive.DriveId r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) int r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) long r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) long r6) {
            r0 = this;
            r0.<init>()
            r0.zzct = r1
            r0.zzk = r2
            r0.status = r3
            r0.zzcw = r4
            r0.zzcx = r6
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L39
            java.lang.Class r1 = r8.getClass()
            java.lang.Class<com.google.android.gms.internal.drive.zzh> r2 = com.google.android.gms.internal.drive.zzh.class
            if (r1 == r2) goto Lc
            goto L39
        Lc:
            r1 = 1
            if (r8 != r7) goto L10
            return r1
        L10:
            com.google.android.gms.internal.drive.zzh r8 = (com.google.android.gms.internal.drive.zzh) r8
            int r2 = r7.zzct
            int r3 = r8.zzct
            if (r2 != r3) goto L39
            com.google.android.gms.drive.DriveId r2 = r7.zzk
            com.google.android.gms.drive.DriveId r3 = r8.zzk
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L39
            int r2 = r7.status
            int r3 = r8.status
            if (r2 != r3) goto L39
            long r2 = r7.zzcw
            long r4 = r8.zzcw
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L39
            long r2 = r7.zzcx
            long r4 = r8.zzcx
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L39
            return r1
        L39:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.zzct
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            com.google.android.gms.drive.DriveId r1 = r3.zzk
            r2 = 1
            r0[r2] = r1
            int r1 = r3.status
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            long r1 = r3.zzcw
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            long r1 = r3.zzcx
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 4
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            int r1 = r4.zzct
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r1)
            com.google.android.gms.drive.DriveId r1 = r4.zzk
            r2 = 3
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            int r6 = r4.status
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r6)
            long r1 = r4.zzcw
            r6 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r5, r6, r1)
            long r1 = r4.zzcx
            r6 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r5, r6, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
