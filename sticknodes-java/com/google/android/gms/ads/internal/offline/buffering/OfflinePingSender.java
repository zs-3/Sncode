package com.google.android.gms.ads.internal.offline.buffering;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public class OfflinePingSender extends androidx.work.Worker {
    private final com.google.android.gms.internal.ads.zzbtf zza;

    public OfflinePingSender(android.content.Context r2, androidx.work.WorkerParameters r3) {
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
            r1 = this;
            com.google.android.gms.internal.ads.zzbtf r0 = r1.zza     // Catch: android.os.RemoteException -> La
            r0.zzh()     // Catch: android.os.RemoteException -> La
            androidx.work.ListenableWorker$Result r0 = androidx.work.ListenableWorker.Result.success()     // Catch: android.os.RemoteException -> La
            return r0
        La:
            androidx.work.ListenableWorker$Result r0 = androidx.work.ListenableWorker.Result.failure()
            return r0
    }
}
