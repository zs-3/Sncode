package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzegg {
    private androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures zza;
    private final android.content.Context zzb;

    zzegg(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            return
    }

    public final com.google.common.util.concurrent.ListenableFuture zza() {
            r2 = this;
            android.content.Context r0 = r2.zzb     // Catch: java.lang.Exception -> L1b
            androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures r0 = androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures.from(r0)     // Catch: java.lang.Exception -> L1b
            r2.zza = r0     // Catch: java.lang.Exception -> L1b
            if (r0 != 0) goto L16
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L1b
            java.lang.String r1 = "MeasurementManagerFutures is null"
            r0.<init>(r1)     // Catch: java.lang.Exception -> L1b
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzg(r0)     // Catch: java.lang.Exception -> L1b
            return r0
        L16:
            com.google.common.util.concurrent.ListenableFuture r0 = r0.getMeasurementApiStatusAsync()     // Catch: java.lang.Exception -> L1b
            return r0
        L1b:
            r0 = move-exception
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzg(r0)
            return r0
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(android.net.Uri r2, android.view.InputEvent r3) {
            r1 = this;
            androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures r0 = r1.zza     // Catch: java.lang.Exception -> La
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Exception -> La
            com.google.common.util.concurrent.ListenableFuture r2 = r0.registerSourceAsync(r2, r3)     // Catch: java.lang.Exception -> La
            return r2
        La:
            r2 = move-exception
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzg(r2)
            return r2
    }
}
