package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcyn extends com.google.android.gms.internal.ads.zzddr implements com.google.android.gms.internal.ads.zzcye {
    private final java.util.concurrent.ScheduledExecutorService zzb;
    private java.util.concurrent.ScheduledFuture zzc;
    private boolean zzd;

    public zzcyn(com.google.android.gms.internal.ads.zzcym r1, java.util.Set r2, java.util.concurrent.Executor r3, java.util.concurrent.ScheduledExecutorService r4) {
            r0 = this;
            r0.<init>(r2)
            r2 = 0
            r0.zzd = r2
            r0.zzb = r4
            r0.zzo(r1, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zza(com.google.android.gms.ads.internal.client.zze r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcyf r0 = new com.google.android.gms.internal.ads.zzcyf
            r0.<init>(r2)
            r1.zzq(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcyg r0 = new com.google.android.gms.internal.ads.zzcyg
            r0.<init>()
            r1.zzq(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzc(com.google.android.gms.internal.ads.zzdij r3) {
            r2 = this;
            boolean r0 = r2.zzd
            if (r0 == 0) goto L5
            return
        L5:
            java.util.concurrent.ScheduledFuture r0 = r2.zzc
            if (r0 == 0) goto Ld
            r1 = 1
            r0.cancel(r1)
        Ld:
            com.google.android.gms.internal.ads.zzcyi r0 = new com.google.android.gms.internal.ads.zzcyi
            r0.<init>(r3)
            r2.zzq(r0)
            return
    }

    final /* synthetic */ void zzd() {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "Timeout waiting for show call succeed to be called."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r0)     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.internal.ads.zzdij r0 = new com.google.android.gms.internal.ads.zzdij     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "Timeout for show call succeed."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L15
            r2.zzc(r0)     // Catch: java.lang.Throwable -> L15
            r0 = 1
            r2.zzd = r0     // Catch: java.lang.Throwable -> L15
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    public final synchronized void zze() {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.ScheduledFuture r0 = r2.zzc     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lb
            r1 = 1
            r0.cancel(r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return
        Lb:
            monitor-exit(r2)
            return
        Ld:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final void zzf() {
            r5 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzko
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.google.android.gms.internal.ads.zzcyh r1 = new com.google.android.gms.internal.ads.zzcyh
            r1.<init>(r5)
            long r2 = (long) r0
            java.util.concurrent.ScheduledExecutorService r0 = r5.zzb
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r0 = r0.schedule(r1, r2, r4)
            r5.zzc = r0
            return
    }
}
