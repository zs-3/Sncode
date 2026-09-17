package com.google.android.gms.ads.internal.offline.buffering;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public class OfflineNotificationPoster extends androidx.work.Worker {
    private final com.google.android.gms.internal.ads.zzbtf zza;

    public OfflineNotificationPoster(android.content.Context r2, androidx.work.WorkerParameters r3) {
            r1 = this;
            r1.<init>(r2, r3)
            com.google.android.gms.ads.internal.client.zzba r3 = com.google.android.gms.ads.internal.client.zzbc.zza()
            com.google.android.gms.internal.ads.zzbph r0 = new com.google.android.gms.internal.ads.zzbph
            r0.<init>()
            com.google.android.gms.internal.ads.zzbtf r2 = r3.zzo(r2, r0)
            r1.zza = r2
            return
    }

    @Override // androidx.work.Worker
    public final androidx.work.ListenableWorker.Result doWork() {
            r6 = this;
            androidx.work.Data r0 = r6.getInputData()
            java.lang.String r1 = "uri"
            java.lang.String r0 = r0.getString(r1)
            androidx.work.Data r1 = r6.getInputData()
            java.lang.String r2 = "gws_query_id"
            java.lang.String r1 = r1.getString(r2)
            androidx.work.Data r2 = r6.getInputData()
            java.lang.String r3 = "image_url"
            java.lang.String r2 = r2.getString(r3)
            com.google.android.gms.internal.ads.zzbtf r3 = r6.zza     // Catch: android.os.RemoteException -> L35
            android.content.Context r4 = r6.getApplicationContext()     // Catch: android.os.RemoteException -> L35
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r4)     // Catch: android.os.RemoteException -> L35
            com.google.android.gms.ads.internal.offline.buffering.zza r5 = new com.google.android.gms.ads.internal.offline.buffering.zza     // Catch: android.os.RemoteException -> L35
            r5.<init>(r0, r1, r2)     // Catch: android.os.RemoteException -> L35
            r3.zzj(r4, r5)     // Catch: android.os.RemoteException -> L35
            androidx.work.ListenableWorker$Result r0 = androidx.work.ListenableWorker.Result.success()     // Catch: android.os.RemoteException -> L35
            return r0
        L35:
            androidx.work.ListenableWorker$Result r0 = androidx.work.ListenableWorker.Result.failure()
            return r0
    }
}
