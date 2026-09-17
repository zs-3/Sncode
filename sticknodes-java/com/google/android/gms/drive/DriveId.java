package com.google.android.gms.drive;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "DriveIdCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class DriveId extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.DriveId> CREATOR = null;
    public static final int RESOURCE_TYPE_FILE = 0;
    public static final int RESOURCE_TYPE_FOLDER = 1;
    public static final int RESOURCE_TYPE_UNKNOWN = -1;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final java.lang.String zzad;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    private final long zzae;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.drive.DriveId.RESOURCE_TYPE_UNKNOWN", id = 5)
    private final int zzaf;
    private volatile java.lang.String zzag;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    private final long zzf;
    private volatile java.lang.String zzh;

    static {
            com.google.android.gms.drive.zzk r0 = new com.google.android.gms.drive.zzk
            r0.<init>()
            com.google.android.gms.drive.DriveId.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public DriveId(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) long r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) long r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) int r10) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.zzh = r0
            r4.zzag = r0
            r4.zzad = r5
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r5)
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            if (r5 != 0) goto L1f
            r2 = -1
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 == 0) goto L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1)
            r4.zzae = r6
            r4.zzf = r8
            r4.zzaf = r10
            return
    }

    public static com.google.android.gms.drive.DriveId decodeFromString(java.lang.String r3) {
            java.lang.String r0 = "DriveId:"
            boolean r0 = r3.startsWith(r0)
            int r1 = r3.length()
            java.lang.String r2 = "Invalid DriveId: "
            if (r1 == 0) goto L13
            java.lang.String r1 = r2.concat(r3)
            goto L18
        L13:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
        L18:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            r0 = 8
            java.lang.String r3 = r3.substring(r0)
            r0 = 10
            byte[] r3 = android.util.Base64.decode(r3, r0)
            com.google.android.gms.drive.DriveId r3 = zza(r3)
            return r3
    }

    @com.google.android.gms.common.util.VisibleForTesting
    public static com.google.android.gms.drive.DriveId zza(java.lang.String r8) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            com.google.android.gms.drive.DriveId r7 = new com.google.android.gms.drive.DriveId
            r2 = -1
            r4 = -1
            r6 = -1
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r4, r6)
            return r7
    }

    @com.google.android.gms.common.util.VisibleForTesting
    private static com.google.android.gms.drive.DriveId zza(byte[] r8) {
            com.google.android.gms.internal.drive.zzjx r0 = com.google.android.gms.internal.drive.zzjx.zzcj()     // Catch: com.google.android.gms.internal.drive.zzkq -> L2e
            com.google.android.gms.internal.drive.zzfb r8 = com.google.android.gms.internal.drive.zzfb.zza(r8, r0)     // Catch: com.google.android.gms.internal.drive.zzkq -> L2e
            java.lang.String r0 = r8.getResourceId()
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L16
            r0 = 0
            goto L1a
        L16:
            java.lang.String r0 = r8.getResourceId()
        L1a:
            r2 = r0
            com.google.android.gms.drive.DriveId r0 = new com.google.android.gms.drive.DriveId
            long r3 = r8.zzal()
            long r5 = r8.zzam()
            int r7 = r8.getResourceType()
            r1 = r0
            r1.<init>(r2, r3, r5, r7)
            return r0
        L2e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>()
            throw r8
    }

    public com.google.android.gms.drive.DriveFile asDriveFile() {
            r2 = this;
            int r0 = r2.zzaf
            r1 = 1
            if (r0 == r1) goto Lb
            com.google.android.gms.internal.drive.zzbn r0 = new com.google.android.gms.internal.drive.zzbn
            r0.<init>(r2)
            return r0
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This DriveId corresponds to a folder. Call asDriveFolder instead."
            r0.<init>(r1)
            throw r0
    }

    public com.google.android.gms.drive.DriveFolder asDriveFolder() {
            r2 = this;
            int r0 = r2.zzaf
            if (r0 == 0) goto La
            com.google.android.gms.internal.drive.zzbs r0 = new com.google.android.gms.internal.drive.zzbs
            r0.<init>(r2)
            return r0
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This DriveId corresponds to a file. Call asDriveFile instead."
            r0.<init>(r1)
            throw r0
    }

    public com.google.android.gms.drive.DriveResource asDriveResource() {
            r2 = this;
            int r0 = r2.zzaf
            r1 = 1
            if (r0 != r1) goto La
            com.google.android.gms.drive.DriveFolder r0 = r2.asDriveFolder()
            return r0
        La:
            if (r0 != 0) goto L11
            com.google.android.gms.drive.DriveFile r0 = r2.asDriveFile()
            return r0
        L11:
            com.google.android.gms.internal.drive.zzdp r0 = new com.google.android.gms.internal.drive.zzdp
            r0.<init>(r2)
            return r0
    }

    public final java.lang.String encodeToString() {
            r3 = this;
            java.lang.String r0 = r3.zzh
            if (r0 != 0) goto L53
            com.google.android.gms.internal.drive.zzfb$zza r0 = com.google.android.gms.internal.drive.zzfb.zzan()
            r1 = 1
            com.google.android.gms.internal.drive.zzfb$zza r0 = r0.zzm(r1)
            java.lang.String r1 = r3.zzad
            if (r1 != 0) goto L13
            java.lang.String r1 = ""
        L13:
            com.google.android.gms.internal.drive.zzfb$zza r0 = r0.zze(r1)
            long r1 = r3.zzae
            com.google.android.gms.internal.drive.zzfb$zza r0 = r0.zzg(r1)
            long r1 = r3.zzf
            com.google.android.gms.internal.drive.zzfb$zza r0 = r0.zzh(r1)
            int r1 = r3.zzaf
            com.google.android.gms.internal.drive.zzfb$zza r0 = r0.zzn(r1)
            com.google.android.gms.internal.drive.zzlq r0 = r0.zzdf()
            com.google.android.gms.internal.drive.zzkk r0 = (com.google.android.gms.internal.drive.zzkk) r0
            com.google.android.gms.internal.drive.zzfb r0 = (com.google.android.gms.internal.drive.zzfb) r0
            byte[] r0 = r0.toByteArray()
            r1 = 10
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)
            java.lang.String r1 = "DriveId:"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L4c
            java.lang.String r0 = r1.concat(r0)
            goto L51
        L4c:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L51:
            r3.zzh = r0
        L53:
            java.lang.String r0 = r3.zzh
            return r0
    }

    public boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L4d
            java.lang.Class r1 = r9.getClass()
            java.lang.Class<com.google.android.gms.drive.DriveId> r2 = com.google.android.gms.drive.DriveId.class
            if (r1 == r2) goto Lc
            goto L4d
        Lc:
            com.google.android.gms.drive.DriveId r9 = (com.google.android.gms.drive.DriveId) r9
            long r1 = r9.zzf
            long r3 = r8.zzf
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L17
            return r0
        L17:
            long r1 = r9.zzae
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L2e
            long r5 = r8.zzae
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L2e
            java.lang.String r9 = r9.zzad
            java.lang.String r0 = r8.zzad
            boolean r9 = r9.equals(r0)
            return r9
        L2e:
            java.lang.String r3 = r8.zzad
            r4 = 1
            if (r3 == 0) goto L46
            java.lang.String r9 = r9.zzad
            if (r9 != 0) goto L38
            goto L46
        L38:
            long r5 = r8.zzae
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 != 0) goto L45
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto L45
            return r4
        L45:
            return r0
        L46:
            long r5 = r8.zzae
            int r9 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r9 != 0) goto L4d
            return r4
        L4d:
            return r0
    }

    public java.lang.String getResourceId() {
            r1 = this;
            java.lang.String r0 = r1.zzad
            return r0
    }

    public int getResourceType() {
            r1 = this;
            int r0 = r1.zzaf
            return r0
    }

    public int hashCode() {
            r5 = this;
            long r0 = r5.zzae
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lf
            java.lang.String r0 = r5.zzad
            int r0 = r0.hashCode()
            return r0
        Lf:
            long r0 = r5.zzf
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            long r1 = r5.zzae
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            if (r2 == 0) goto L2e
            java.lang.String r0 = r0.concat(r1)
            goto L34
        L2e:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L34:
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toInvariantString() {
            r3 = this;
            java.lang.String r0 = r3.zzag
            if (r0 != 0) goto L28
            com.google.android.gms.internal.drive.zzfd$zza r0 = com.google.android.gms.internal.drive.zzfd.zzap()
            long r1 = r3.zzae
            com.google.android.gms.internal.drive.zzfd$zza r0 = r0.zzi(r1)
            long r1 = r3.zzf
            com.google.android.gms.internal.drive.zzfd$zza r0 = r0.zzj(r1)
            com.google.android.gms.internal.drive.zzlq r0 = r0.zzdf()
            com.google.android.gms.internal.drive.zzkk r0 = (com.google.android.gms.internal.drive.zzkk) r0
            com.google.android.gms.internal.drive.zzfd r0 = (com.google.android.gms.internal.drive.zzfd) r0
            byte[] r0 = r0.toByteArray()
            r1 = 10
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)
            r3.zzag = r0
        L28:
            java.lang.String r0 = r3.zzag
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.encodeToString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.lang.String r0 = r3.zzad
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            long r0 = r3.zzae
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r2, r0)
            long r0 = r3.zzf
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r2, r0)
            int r0 = r3.zzaf
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
