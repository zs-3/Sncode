package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public class WorkManagerUtil extends com.google.android.gms.ads.internal.util.zzbq {
    @com.google.android.apps.common.proguard.UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void zzb(android.content.Context r1) {
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.IllegalStateException -> L10
            androidx.work.Configuration$Builder r0 = new androidx.work.Configuration$Builder     // Catch: java.lang.IllegalStateException -> L10
            r0.<init>()     // Catch: java.lang.IllegalStateException -> L10
            androidx.work.Configuration r0 = r0.build()     // Catch: java.lang.IllegalStateException -> L10
            androidx.work.WorkManager.initialize(r1, r0)     // Catch: java.lang.IllegalStateException -> L10
        L10:
            return
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(com.google.android.gms.dynamic.IObjectWrapper r5) {
            r4 = this;
            java.lang.Object r5 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r5)
            android.content.Context r5 = (android.content.Context) r5
            zzb(r5)
            androidx.work.WorkManager r5 = androidx.work.WorkManager.getInstance(r5)     // Catch: java.lang.IllegalStateException -> L3e
            java.lang.String r0 = "offline_ping_sender_work"
            r5.cancelAllWorkByTag(r0)
            androidx.work.Constraints$Builder r1 = new androidx.work.Constraints$Builder
            r1.<init>()
            androidx.work.NetworkType r2 = androidx.work.NetworkType.CONNECTED
            androidx.work.Constraints$Builder r1 = r1.setRequiredNetworkType(r2)
            androidx.work.Constraints r1 = r1.build()
            androidx.work.OneTimeWorkRequest$Builder r2 = new androidx.work.OneTimeWorkRequest$Builder
            java.lang.Class<com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender> r3 = com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender.class
            r2.<init>(r3)
            androidx.work.WorkRequest$Builder r1 = r2.setConstraints(r1)
            androidx.work.OneTimeWorkRequest$Builder r1 = (androidx.work.OneTimeWorkRequest.Builder) r1
            androidx.work.WorkRequest$Builder r0 = r1.addTag(r0)
            androidx.work.OneTimeWorkRequest$Builder r0 = (androidx.work.OneTimeWorkRequest.Builder) r0
            androidx.work.WorkRequest r0 = r0.build()
            androidx.work.OneTimeWorkRequest r0 = (androidx.work.OneTimeWorkRequest) r0
            r5.enqueue(r0)
            return
        L3e:
            r5 = move-exception
            java.lang.String r0 = "Failed to instantiate WorkManager."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r0, r5)
            return
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(com.google.android.gms.dynamic.IObjectWrapper r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            com.google.android.gms.ads.internal.offline.buffering.zza r0 = new com.google.android.gms.ads.internal.offline.buffering.zza
            java.lang.String r1 = ""
            r0.<init>(r4, r5, r1)
            boolean r3 = r2.zzg(r3, r0)
            return r3
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzg(com.google.android.gms.dynamic.IObjectWrapper r5, com.google.android.gms.ads.internal.offline.buffering.zza r6) {
            r4 = this;
            java.lang.Object r5 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r5)
            android.content.Context r5 = (android.content.Context) r5
            zzb(r5)
            androidx.work.Constraints$Builder r0 = new androidx.work.Constraints$Builder
            r0.<init>()
            androidx.work.NetworkType r1 = androidx.work.NetworkType.CONNECTED
            androidx.work.Constraints$Builder r0 = r0.setRequiredNetworkType(r1)
            androidx.work.Constraints r0 = r0.build()
            androidx.work.Data$Builder r1 = new androidx.work.Data$Builder
            r1.<init>()
            java.lang.String r2 = r6.zza
            java.lang.String r3 = "uri"
            androidx.work.Data$Builder r1 = r1.putString(r3, r2)
            java.lang.String r2 = r6.zzb
            java.lang.String r3 = "gws_query_id"
            androidx.work.Data$Builder r1 = r1.putString(r3, r2)
            java.lang.String r6 = r6.zzc
            java.lang.String r2 = "image_url"
            androidx.work.Data$Builder r6 = r1.putString(r2, r6)
            androidx.work.Data r6 = r6.build()
            androidx.work.OneTimeWorkRequest$Builder r1 = new androidx.work.OneTimeWorkRequest$Builder
            java.lang.Class<com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster> r2 = com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster.class
            r1.<init>(r2)
            androidx.work.WorkRequest$Builder r0 = r1.setConstraints(r0)
            androidx.work.OneTimeWorkRequest$Builder r0 = (androidx.work.OneTimeWorkRequest.Builder) r0
            androidx.work.WorkRequest$Builder r6 = r0.setInputData(r6)
            androidx.work.OneTimeWorkRequest$Builder r6 = (androidx.work.OneTimeWorkRequest.Builder) r6
            java.lang.String r0 = "offline_notification_work"
            androidx.work.WorkRequest$Builder r6 = r6.addTag(r0)
            androidx.work.OneTimeWorkRequest$Builder r6 = (androidx.work.OneTimeWorkRequest.Builder) r6
            androidx.work.WorkRequest r6 = r6.build()
            androidx.work.OneTimeWorkRequest r6 = (androidx.work.OneTimeWorkRequest) r6
            androidx.work.WorkManager r5 = androidx.work.WorkManager.getInstance(r5)     // Catch: java.lang.IllegalStateException -> L63
            r5.enqueue(r6)
            r5 = 1
            return r5
        L63:
            r5 = move-exception
            java.lang.String r6 = "Failed to instantiate WorkManager."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r6, r5)
            r5 = 0
            return r5
    }
}
