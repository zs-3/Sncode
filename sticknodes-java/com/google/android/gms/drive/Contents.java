package com.google.android.gms.drive;

@com.google.android.gms.common.annotation.KeepForSdk
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ContentsCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class Contents extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.Contents> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    private final int mode;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final android.os.ParcelFileDescriptor zzi;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    final int zzj;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    private final com.google.android.gms.drive.DriveId zzk;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 7)
    private final boolean zzl;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 8)
    private final java.lang.String zzm;

    static {
            com.google.android.gms.drive.zzc r0 = new com.google.android.gms.drive.zzc
            r0.<init>()
            com.google.android.gms.drive.Contents.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public Contents(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) android.os.ParcelFileDescriptor r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) int r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) com.google.android.gms.drive.DriveId r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) boolean r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r0.zzi = r1
            r0.zzj = r2
            r0.mode = r3
            r0.zzk = r4
            r0.zzl = r5
            r0.zzm = r6
            return
    }

    public final com.google.android.gms.drive.DriveId getDriveId() {
            r1 = this;
            com.google.android.gms.drive.DriveId r0 = r1.zzk
            return r0
    }

    public final java.io.InputStream getInputStream() {
            r2 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            android.os.ParcelFileDescriptor r1 = r2.zzi
            java.io.FileDescriptor r1 = r1.getFileDescriptor()
            r0.<init>(r1)
            return r0
    }

    public final int getMode() {
            r1 = this;
            int r0 = r1.mode
            return r0
    }

    public final java.io.OutputStream getOutputStream() {
            r2 = this;
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            android.os.ParcelFileDescriptor r1 = r2.zzi
            java.io.FileDescriptor r1 = r1.getFileDescriptor()
            r0.<init>(r1)
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public android.os.ParcelFileDescriptor getParcelFileDescriptor() {
            r1 = this;
            android.os.ParcelFileDescriptor r0 = r1.zzi
            return r0
    }

    public final int getRequestId() {
            r1 = this;
            int r0 = r1.zzj
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            android.os.ParcelFileDescriptor r1 = r4.zzi
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            int r1 = r4.zzj
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r1)
            int r1 = r4.mode
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r1)
            com.google.android.gms.drive.DriveId r1 = r4.zzk
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            boolean r6 = r4.zzl
            r1 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            java.lang.String r6 = r4.zzm
            r1 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    public final boolean zzb() {
            r1 = this;
            boolean r0 = r1.zzl
            return r0
    }
}
