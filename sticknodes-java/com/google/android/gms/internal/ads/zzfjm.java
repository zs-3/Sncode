package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfjm {
    private final com.google.android.gms.internal.ads.zzfiq zza;
    private final com.google.android.gms.internal.ads.zzfjk zzb;
    private final com.google.android.gms.internal.ads.zzfim zzc;
    private final java.util.ArrayDeque zzd;
    private com.google.android.gms.internal.ads.zzfjs zze;
    private int zzf;

    public zzfjm(com.google.android.gms.internal.ads.zzfiq r2, com.google.android.gms.internal.ads.zzfim r3, com.google.android.gms.internal.ads.zzfjk r4) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zzf = r0
            r1.zza = r2
            r1.zzc = r3
            r1.zzb = r4
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.zzd = r2
            com.google.android.gms.internal.ads.zzfjh r2 = new com.google.android.gms.internal.ads.zzfjh
            r2.<init>(r1)
            r3.zzb(r2)
            return
    }

    static /* bridge */ /* synthetic */ java.util.ArrayDeque zzb(com.google.android.gms.internal.ads.zzfjm r0) {
            java.util.ArrayDeque r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzfjm r0, com.google.android.gms.internal.ads.zzfjs r1) {
            r1 = 0
            r0.zze = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzfjm r0) {
            r0.zzh()
            return
    }

    static /* bridge */ /* synthetic */ int zzg(com.google.android.gms.internal.ads.zzfjm r0) {
            int r0 = r0.zzf
            return r0
    }

    private final synchronized void zzh() {
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzga     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L6e
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L6e
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L2d
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzi()     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.internal.ads.zzbzx r0 = r0.zzh()     // Catch: java.lang.Throwable -> L6e
            boolean r0 = r0.zzh()     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L26
            goto L2d
        L26:
            java.util.ArrayDeque r0 = r4.zzd     // Catch: java.lang.Throwable -> L6e
            r0.clear()     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r4)
            return
        L2d:
            boolean r0 = r4.zzi()     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L6c
        L33:
            java.util.ArrayDeque r0 = r4.zzd     // Catch: java.lang.Throwable -> L6e
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6e
            if (r0 != 0) goto L6c
            java.util.ArrayDeque r0 = r4.zzd     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r0 = r0.pollFirst()     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.internal.ads.zzfjl r0 = (com.google.android.gms.internal.ads.zzfjl) r0     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L57
            com.google.android.gms.internal.ads.zzfja r1 = r0.zza()     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L33
            com.google.android.gms.internal.ads.zzfiq r1 = r4.zza     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.internal.ads.zzfja r2 = r0.zza()     // Catch: java.lang.Throwable -> L6e
            boolean r1 = r1.zze(r2)     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L33
        L57:
            com.google.android.gms.internal.ads.zzfiq r1 = r4.zza     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.internal.ads.zzfjk r2 = r4.zzb     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.internal.ads.zzfjs r3 = new com.google.android.gms.internal.ads.zzfjs     // Catch: java.lang.Throwable -> L6e
            r3.<init>(r1, r2, r0)     // Catch: java.lang.Throwable -> L6e
            r4.zze = r3     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.internal.ads.zzfji r1 = new com.google.android.gms.internal.ads.zzfji     // Catch: java.lang.Throwable -> L6e
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L6e
            r3.zzd(r1)     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r4)
            return
        L6c:
            monitor-exit(r4)
            return
        L6e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    private final synchronized boolean zzi() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzfjs r0 = r1.zze     // Catch: java.lang.Throwable -> La
            if (r0 != 0) goto L8
            r0 = 1
        L6:
            monitor-exit(r1)
            return r0
        L8:
            r0 = 0
            goto L6
        La:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzfjl r2) {
            r1 = this;
            monitor-enter(r1)
            r0 = 2
            r1.zzf = r0     // Catch: java.lang.Throwable -> L15
            boolean r0 = r1.zzi()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto Ld
            r2 = 0
            monitor-exit(r1)
            return r2
        Ld:
            com.google.android.gms.internal.ads.zzfjs r0 = r1.zze     // Catch: java.lang.Throwable -> L15
            com.google.common.util.concurrent.ListenableFuture r2 = r0.zza(r2)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)
            return r2
        L15:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void zze(com.google.android.gms.internal.ads.zzfjl r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.ArrayDeque r0 = r1.zzd     // Catch: java.lang.Throwable -> L8
            r0.add(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    final /* synthetic */ void zzf() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.zzf = r0     // Catch: java.lang.Throwable -> L9
            r1.zzh()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }
}
