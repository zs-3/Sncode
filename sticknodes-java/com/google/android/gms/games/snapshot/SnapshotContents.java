package com.google.android.gms.games.snapshot;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public interface SnapshotContents extends android.os.Parcelable {
    android.os.ParcelFileDescriptor getParcelFileDescriptor();

    boolean isClosed();

    boolean modifyBytes(int r1, byte[] r2, int r3, int r4);

    byte[] readFully() throws java.io.IOException;

    boolean writeBytes(byte[] r1);

    com.google.android.gms.drive.Contents zza();

    void zzb();
}
