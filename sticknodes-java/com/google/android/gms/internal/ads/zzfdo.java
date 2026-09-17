package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfdo implements com.google.android.gms.internal.ads.zzfdy {
    private final com.google.android.gms.internal.ads.zzfdy zza;
    private com.google.android.gms.internal.ads.zzcxh zzb;

    public zzfdo(com.google.android.gms.internal.ads.zzfdy r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final synchronized com.google.android.gms.internal.ads.zzcxh zza() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzcxh r0 = r1.zzb     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzfdz r2, com.google.android.gms.internal.ads.zzfdx r3, com.google.android.gms.internal.ads.zzcxh r4) {
            r1 = this;
            monitor-enter(r1)
            r1.zzb = r4     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzbwa r0 = r2.zza     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L1b
            com.google.android.gms.internal.ads.zzcum r3 = r4.zzb()     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzbwa r2 = r2.zza     // Catch: java.lang.Throwable -> L25
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzh(r2)     // Catch: java.lang.Throwable -> L25
            com.google.common.util.concurrent.ListenableFuture r2 = r3.zzk(r2)     // Catch: java.lang.Throwable -> L25
            com.google.common.util.concurrent.ListenableFuture r2 = r3.zzi(r2)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r1)
            return r2
        L1b:
            com.google.android.gms.internal.ads.zzfdy r0 = r1.zza     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzfdn r0 = (com.google.android.gms.internal.ads.zzfdn) r0     // Catch: java.lang.Throwable -> L25
            com.google.common.util.concurrent.ListenableFuture r2 = r0.zzb(r2, r3, r4)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r1)
            return r2
        L25:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzfdy
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfdz r1, com.google.android.gms.internal.ads.zzfdx r2, java.lang.Object r3) {
            r0 = this;
            r3 = 0
            com.google.common.util.concurrent.ListenableFuture r1 = r0.zzb(r1, r2, r3)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzfdy
    public final /* bridge */ /* synthetic */ java.lang.Object zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcxh r0 = r1.zza()
            return r0
    }
}
