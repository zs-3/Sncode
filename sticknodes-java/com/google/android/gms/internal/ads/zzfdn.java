package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfdn implements com.google.android.gms.internal.ads.zzfdy {
    private com.google.android.gms.internal.ads.zzcxh zza;

    public zzfdn() {
            r0 = this;
            r0.<init>()
            return
    }

    public final synchronized com.google.android.gms.internal.ads.zzcxh zza() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzcxh r0 = r1.zza     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzfdz r1, com.google.android.gms.internal.ads.zzfdx r2, com.google.android.gms.internal.ads.zzcxh r3) {
            r0 = this;
            monitor-enter(r0)
            if (r3 == 0) goto L6
            r0.zza = r3     // Catch: java.lang.Throwable -> L24
            goto L14
        L6:
            com.google.android.gms.internal.ads.zzfdw r1 = r1.zzb     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzcxg r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.Object r1 = r1.zzh()     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzcxh r1 = (com.google.android.gms.internal.ads.zzcxh) r1     // Catch: java.lang.Throwable -> L24
            r0.zza = r1     // Catch: java.lang.Throwable -> L24
        L14:
            com.google.android.gms.internal.ads.zzcxh r1 = r0.zza     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzcum r1 = r1.zzb()     // Catch: java.lang.Throwable -> L24
            com.google.common.util.concurrent.ListenableFuture r2 = r1.zzj()     // Catch: java.lang.Throwable -> L24
            com.google.common.util.concurrent.ListenableFuture r1 = r1.zzi(r2)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)
            return r1
        L24:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
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
