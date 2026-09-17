package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbsk implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbsm zzc;

    zzbsk(com.google.android.gms.internal.ads.zzbsm r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r1
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r3, int r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbsm r3 = r2.zzc
            android.content.Context r3 = com.google.android.gms.internal.ads.zzbsm.zza(r3)
            java.lang.String r4 = "download"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.app.DownloadManager r3 = (android.app.DownloadManager) r3
            java.lang.String r4 = r2.zza     // Catch: java.lang.IllegalStateException -> L2e
            java.lang.String r0 = r2.zzb     // Catch: java.lang.IllegalStateException -> L2e
            android.app.DownloadManager$Request r1 = new android.app.DownloadManager$Request     // Catch: java.lang.IllegalStateException -> L2e
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.lang.IllegalStateException -> L2e
            r1.<init>(r4)     // Catch: java.lang.IllegalStateException -> L2e
            java.lang.String r4 = android.os.Environment.DIRECTORY_PICTURES     // Catch: java.lang.IllegalStateException -> L2e
            r1.setDestinationInExternalPublicDir(r4, r0)     // Catch: java.lang.IllegalStateException -> L2e
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.IllegalStateException -> L2e
            r1.allowScanningByMediaScanner()     // Catch: java.lang.IllegalStateException -> L2e
            r4 = 1
            r1.setNotificationVisibility(r4)     // Catch: java.lang.IllegalStateException -> L2e
            r3.enqueue(r1)     // Catch: java.lang.IllegalStateException -> L2e
            return
        L2e:
            com.google.android.gms.internal.ads.zzbsm r3 = r2.zzc
            java.lang.String r4 = "Could not store picture."
            r3.zzh(r4)
            return
    }
}
