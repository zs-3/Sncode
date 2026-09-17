package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcsg implements com.google.android.gms.internal.ads.zzayv {
    private final com.google.android.gms.internal.ads.zzcfo zza;
    private final java.util.concurrent.Executor zzb;
    private final java.util.concurrent.atomic.AtomicReference zzc;

    zzcsg(com.google.android.gms.internal.ads.zzcfo r2, java.util.concurrent.Executor r3) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.zzc = r0
            r1.zza = r2
            r1.zzb = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayv
    public final synchronized void zzdp(com.google.android.gms.internal.ads.zzayu r3) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zza     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L5f
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzmh     // Catch: java.lang.Throwable -> L61
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L61
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L61
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L18
            goto L5f
        L18:
            boolean r0 = r3.zzj     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L3c
            java.util.concurrent.atomic.AtomicReference r0 = r2.zzc     // Catch: java.lang.Throwable -> L61
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L61
            java.lang.Object r0 = r0.getAndSet(r1)     // Catch: java.lang.Throwable -> L61
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L2b
            goto L3c
        L2b:
            java.util.concurrent.Executor r3 = r2.zzb     // Catch: java.lang.Throwable -> L61
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zza     // Catch: java.lang.Throwable -> L61
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L61
            com.google.android.gms.internal.ads.zzcse r1 = new com.google.android.gms.internal.ads.zzcse     // Catch: java.lang.Throwable -> L61
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L61
            r3.execute(r1)     // Catch: java.lang.Throwable -> L61
            monitor-exit(r2)
            return
        L3c:
            boolean r3 = r3.zzj     // Catch: java.lang.Throwable -> L61
            if (r3 != 0) goto L5f
            java.util.concurrent.atomic.AtomicReference r3 = r2.zzc     // Catch: java.lang.Throwable -> L61
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L61
            java.lang.Object r3 = r3.getAndSet(r0)     // Catch: java.lang.Throwable -> L61
            boolean r3 = r0.equals(r3)     // Catch: java.lang.Throwable -> L61
            if (r3 != 0) goto L5f
            java.util.concurrent.Executor r3 = r2.zzb     // Catch: java.lang.Throwable -> L61
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zza     // Catch: java.lang.Throwable -> L61
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L61
            com.google.android.gms.internal.ads.zzcsf r1 = new com.google.android.gms.internal.ads.zzcsf     // Catch: java.lang.Throwable -> L61
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L61
            r3.execute(r1)     // Catch: java.lang.Throwable -> L61
            monitor-exit(r2)
            return
        L5f:
            monitor-exit(r2)
            return
        L61:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
