package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzbq implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier<com.google.android.gms.drive.DriveFile.DownloadProgressListener> {
    private final /* synthetic */ long zzfb;
    private final /* synthetic */ long zzfc;

    zzbq(com.google.android.gms.internal.drive.zzbp r1, long r2, long r4) {
            r0 = this;
            r0.zzfb = r2
            r0.zzfc = r4
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(com.google.android.gms.drive.DriveFile.DownloadProgressListener r5) {
            r4 = this;
            com.google.android.gms.drive.DriveFile$DownloadProgressListener r5 = (com.google.android.gms.drive.DriveFile.DownloadProgressListener) r5
            long r0 = r4.zzfb
            long r2 = r4.zzfc
            r5.onProgress(r0, r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
            r0 = this;
            return
    }
}
