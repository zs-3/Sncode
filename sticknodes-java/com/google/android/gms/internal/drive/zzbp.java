package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzbp implements com.google.android.gms.drive.DriveFile.DownloadProgressListener {
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.drive.DriveFile.DownloadProgressListener> zzfa;

    public zzbp(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.drive.DriveFile.DownloadProgressListener> r1) {
            r0 = this;
            r0.<init>()
            r0.zzfa = r1
            return
    }

    @Override // com.google.android.gms.drive.DriveFile.DownloadProgressListener
    public final void onProgress(long r9, long r11) {
            r8 = this;
            com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.drive.DriveFile$DownloadProgressListener> r0 = r8.zzfa
            com.google.android.gms.internal.drive.zzbq r7 = new com.google.android.gms.internal.drive.zzbq
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r1.<init>(r2, r3, r5)
            r0.notifyListener(r7)
            return
    }
}
