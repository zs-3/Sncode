package com.google.android.gms.games.snapshot;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
@com.google.android.apps.common.proguard.UsedByReflection("GamesGmsClientImpl.java")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "SnapshotContentsEntityCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class SnapshotContentsEntity extends com.google.android.gms.games.internal.zzc implements com.google.android.gms.games.snapshot.SnapshotContents {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.snapshot.SnapshotContentsEntity> CREATOR = null;
    private static final java.lang.Object zza = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getContents", id = 1)
    private com.google.android.gms.drive.Contents zzb;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.games.snapshot.SnapshotContentsEntity.zza = r0
            com.google.android.gms.games.snapshot.zza r0 = new com.google.android.gms.games.snapshot.zza
            r0.<init>()
            com.google.android.gms.games.snapshot.SnapshotContentsEntity.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public SnapshotContentsEntity(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) com.google.android.gms.drive.Contents r1) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            return
    }

    private final boolean zzc(int r7, byte[] r8, int r9, int r10, boolean r11) {
            r6 = this;
            boolean r0 = r6.isClosed()
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "Must provide a previously opened SnapshotContents"
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r2)
            java.lang.Object r0 = com.google.android.gms.games.snapshot.SnapshotContentsEntity.zza
            monitor-enter(r0)
            com.google.android.gms.drive.Contents r2 = r6.zzb     // Catch: java.lang.Throwable -> L44
            android.os.ParcelFileDescriptor r2 = r2.getParcelFileDescriptor()     // Catch: java.lang.Throwable -> L44
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L44
            java.io.FileDescriptor r2 = r2.getFileDescriptor()     // Catch: java.lang.Throwable -> L44
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L44
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L44
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L44
            java.nio.channels.FileChannel r3 = r3.getChannel()     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L44
            long r4 = (long) r7     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L44
            r3.position(r4)     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L44
            r2.write(r8, r9, r10)     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L44
            if (r11 == 0) goto L34
            int r7 = r8.length     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L44
            long r7 = (long) r7     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L44
            r3.truncate(r7)     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L44
        L34:
            r2.flush()     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L44
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            return r1
        L39:
            r7 = move-exception
            java.lang.String r8 = "SnapshotContentsEntity"
            java.lang.String r9 = "Failed to write snapshot data"
            com.google.android.gms.internal.games.zzft.zzc(r8, r9, r7)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            r7 = 0
            return r7
        L44:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            throw r7
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    public final android.os.ParcelFileDescriptor getParcelFileDescriptor() {
            r2 = this;
            boolean r0 = r2.isClosed()
            r0 = r0 ^ 1
            java.lang.String r1 = "Cannot mutate closed contents!"
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            com.google.android.gms.drive.Contents r0 = r2.zzb
            android.os.ParcelFileDescriptor r0 = r0.getParcelFileDescriptor()
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    public final boolean isClosed() {
            r1 = this;
            com.google.android.gms.drive.Contents r0 = r1.zzb
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    public final boolean modifyBytes(int r7, byte[] r8, int r9, int r10) {
            r6 = this;
            int r4 = r8.length
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            boolean r7 = r0.zzc(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    public final byte[] readFully() throws java.io.IOException {
            r6 = this;
            boolean r0 = r6.isClosed()
            r0 = r0 ^ 1
            java.lang.String r1 = "Must provide a previously opened Snapshot"
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            java.lang.Object r0 = com.google.android.gms.games.snapshot.SnapshotContentsEntity.zza
            monitor-enter(r0)
            com.google.android.gms.drive.Contents r1 = r6.zzb     // Catch: java.lang.Throwable -> L42
            android.os.ParcelFileDescriptor r1 = r1.getParcelFileDescriptor()     // Catch: java.lang.Throwable -> L42
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L42
            java.io.FileDescriptor r1 = r1.getFileDescriptor()     // Catch: java.lang.Throwable -> L42
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L42
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L42
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L42
            java.nio.channels.FileChannel r3 = r2.getChannel()     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L42
            r4 = 0
            r3.position(r4)     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L42
            r3 = 0
            byte[] r1 = com.google.android.gms.common.util.IOUtils.readInputStreamFully(r1, r3)     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L42
            java.nio.channels.FileChannel r2 = r2.getChannel()     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L42
            r2.position(r4)     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            return r1
        L39:
            r1 = move-exception
            java.lang.String r2 = "SnapshotContentsEntity"
            java.lang.String r3 = "Failed to read snapshot data"
            com.google.android.gms.internal.games.zzft.zze(r2, r3, r1)     // Catch: java.lang.Throwable -> L42
            throw r1     // Catch: java.lang.Throwable -> L42
        L42:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            throw r1
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    public final boolean writeBytes(byte[] r7) {
            r6 = this;
            int r4 = r7.length
            r1 = 0
            r3 = 0
            r5 = 1
            r0 = r6
            r2 = r7
            boolean r7 = r0.zzc(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.drive.Contents r1 = r4.zzb
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    public final com.google.android.gms.drive.Contents zza() {
            r1 = this;
            com.google.android.gms.drive.Contents r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    public final void zzb() {
            r1 = this;
            r0 = 0
            r1.zzb = r0
            return
    }
}
