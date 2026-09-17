package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzegi {
    private final android.content.Context zza;

    zzegi(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(boolean r3) {
            r2 = this;
            androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest$Builder r0 = new androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest$Builder     // Catch: java.lang.Exception -> L2a
            r0.<init>()     // Catch: java.lang.Exception -> L2a
            java.lang.String r1 = "com.google.android.gms.ads"
            androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest$Builder r0 = r0.setAdsSdkName(r1)     // Catch: java.lang.Exception -> L2a
            androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest$Builder r3 = r0.setShouldRecordObservation(r3)     // Catch: java.lang.Exception -> L2a
            androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest r3 = r3.build()     // Catch: java.lang.Exception -> L2a
            android.content.Context r0 = r2.zza     // Catch: java.lang.Exception -> L2a
            androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures r0 = androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures.from(r0)     // Catch: java.lang.Exception -> L2a
            if (r0 == 0) goto L20
            com.google.common.util.concurrent.ListenableFuture r3 = r0.getTopicsAsync(r3)     // Catch: java.lang.Exception -> L2a
            return r3
        L20:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L2a
            r3.<init>()     // Catch: java.lang.Exception -> L2a
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzg(r3)     // Catch: java.lang.Exception -> L2a
            return r3
        L2a:
            r3 = move-exception
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzg(r3)
            return r3
    }
}
