package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfma implements java.lang.Runnable {
    private final java.util.List zza;
    private final com.google.android.gms.internal.ads.zzfmd zzb;
    private java.lang.String zzc;
    private com.google.android.gms.internal.ads.zzfmg zzd;
    private java.lang.String zze;
    private com.google.android.gms.internal.ads.zzfgs zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private java.util.concurrent.Future zzh;
    private int zzi;

    zzfma(com.google.android.gms.internal.ads.zzfmd r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zza = r0
            r0 = 2
            r1.zzi = r0
            com.google.android.gms.internal.ads.zzfmg r0 = com.google.android.gms.internal.ads.zzfmg.zzb
            r1.zzd = r0
            r1.zzb = r2
            return
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
            r1 = this;
            monitor-enter(r1)
            r1.zzh()     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized com.google.android.gms.internal.ads.zzfma zza(com.google.android.gms.internal.ads.zzflp r4) {
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbek.zzc     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L3c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L3c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L3a
            java.util.List r0 = r3.zza     // Catch: java.lang.Throwable -> L3c
            r4.zzj()     // Catch: java.lang.Throwable -> L3c
            r0.add(r4)     // Catch: java.lang.Throwable -> L3c
            java.util.concurrent.Future r4 = r3.zzh     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto L1f
            r0 = 0
            r4.cancel(r0)     // Catch: java.lang.Throwable -> L3c
        L1f:
            java.util.concurrent.ScheduledExecutorService r4 = com.google.android.gms.internal.ads.zzcan.zzd     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zziq     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L3c
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L3c
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L3c
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L3c
            java.util.concurrent.ScheduledFuture r4 = r4.schedule(r3, r0, r2)     // Catch: java.lang.Throwable -> L3c
            r3.zzh = r4     // Catch: java.lang.Throwable -> L3c
        L3a:
            monitor-exit(r3)
            return r3
        L3c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final synchronized com.google.android.gms.internal.ads.zzfma zzb(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbek.zzc     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L19
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L19
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L17
            boolean r0 = com.google.android.gms.internal.ads.zzflz.zze(r2)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L17
            r1.zzc = r2     // Catch: java.lang.Throwable -> L19
        L17:
            monitor-exit(r1)
            return r1
        L19:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized com.google.android.gms.internal.ads.zzfma zzc(com.google.android.gms.ads.internal.client.zze r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbek.zzc     // Catch: java.lang.Throwable -> L13
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L13
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L13
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L11
            r1.zzg = r2     // Catch: java.lang.Throwable -> L13
        L11:
            monitor-exit(r1)
            return r1
        L13:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized com.google.android.gms.internal.ads.zzfma zzd(java.util.ArrayList r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbek.zzc     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L9a
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L9a
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L98
            java.lang.String r0 = "banner"
            boolean r0 = r2.contains(r0)     // Catch: java.lang.Throwable -> L9a
            if (r0 != 0) goto L95
            com.google.android.gms.ads.AdFormat r0 = com.google.android.gms.ads.AdFormat.BANNER     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = r0.name()     // Catch: java.lang.Throwable -> L9a
            boolean r0 = r2.contains(r0)     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L25
            goto L95
        L25:
            java.lang.String r0 = "interstitial"
            boolean r0 = r2.contains(r0)     // Catch: java.lang.Throwable -> L9a
            if (r0 != 0) goto L91
            com.google.android.gms.ads.AdFormat r0 = com.google.android.gms.ads.AdFormat.INTERSTITIAL     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = r0.name()     // Catch: java.lang.Throwable -> L9a
            boolean r0 = r2.contains(r0)     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L3a
            goto L91
        L3a:
            java.lang.String r0 = "native"
            boolean r0 = r2.contains(r0)     // Catch: java.lang.Throwable -> L9a
            if (r0 != 0) goto L8c
            com.google.android.gms.ads.AdFormat r0 = com.google.android.gms.ads.AdFormat.NATIVE     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = r0.name()     // Catch: java.lang.Throwable -> L9a
            boolean r0 = r2.contains(r0)     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L4f
            goto L8c
        L4f:
            java.lang.String r0 = "rewarded"
            boolean r0 = r2.contains(r0)     // Catch: java.lang.Throwable -> L9a
            if (r0 != 0) goto L88
            com.google.android.gms.ads.AdFormat r0 = com.google.android.gms.ads.AdFormat.REWARDED     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = r0.name()     // Catch: java.lang.Throwable -> L9a
            boolean r0 = r2.contains(r0)     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L64
            goto L88
        L64:
            java.lang.String r0 = "app_open_ad"
            boolean r0 = r2.contains(r0)     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L70
            r2 = 7
            r1.zzi = r2     // Catch: java.lang.Throwable -> L9a
            goto L98
        L70:
            java.lang.String r0 = "rewarded_interstitial"
            boolean r0 = r2.contains(r0)     // Catch: java.lang.Throwable -> L9a
            if (r0 != 0) goto L84
            com.google.android.gms.ads.AdFormat r0 = com.google.android.gms.ads.AdFormat.REWARDED_INTERSTITIAL     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = r0.name()     // Catch: java.lang.Throwable -> L9a
            boolean r2 = r2.contains(r0)     // Catch: java.lang.Throwable -> L9a
            if (r2 == 0) goto L98
        L84:
            r2 = 6
            r1.zzi = r2     // Catch: java.lang.Throwable -> L9a
            goto L98
        L88:
            r2 = 5
            r1.zzi = r2     // Catch: java.lang.Throwable -> L9a
            goto L98
        L8c:
            r2 = 8
            r1.zzi = r2     // Catch: java.lang.Throwable -> L9a
            goto L98
        L91:
            r2 = 4
            r1.zzi = r2     // Catch: java.lang.Throwable -> L9a
            goto L98
        L95:
            r2 = 3
            r1.zzi = r2     // Catch: java.lang.Throwable -> L9a
        L98:
            monitor-exit(r1)
            return r1
        L9a:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized com.google.android.gms.internal.ads.zzfma zze(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbek.zzc     // Catch: java.lang.Throwable -> L13
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L13
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L13
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L11
            r1.zze = r2     // Catch: java.lang.Throwable -> L13
        L11:
            monitor-exit(r1)
            return r1
        L13:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized com.google.android.gms.internal.ads.zzfma zzf(android.os.Bundle r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbek.zzc     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L17
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L15
            com.google.android.gms.internal.ads.zzfmg r2 = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zza(r2)     // Catch: java.lang.Throwable -> L17
            r1.zzd = r2     // Catch: java.lang.Throwable -> L17
        L15:
            monitor-exit(r1)
            return r1
        L17:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized com.google.android.gms.internal.ads.zzfma zzg(com.google.android.gms.internal.ads.zzfgs r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbek.zzc     // Catch: java.lang.Throwable -> L13
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L13
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L13
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L11
            r1.zzf = r2     // Catch: java.lang.Throwable -> L13
        L11:
            monitor-exit(r1)
            return r1
        L13:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void zzh() {
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbek.zzc     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L78
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L78
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L78
            if (r0 != 0) goto L11
            monitor-exit(r4)
            return
        L11:
            java.util.concurrent.Future r0 = r4.zzh     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L19
            r1 = 0
            r0.cancel(r1)     // Catch: java.lang.Throwable -> L78
        L19:
            java.util.List r0 = r4.zza     // Catch: java.lang.Throwable -> L78
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L78
        L1f:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto L71
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.zzflp r1 = (com.google.android.gms.internal.ads.zzflp) r1     // Catch: java.lang.Throwable -> L78
            int r2 = r4.zzi     // Catch: java.lang.Throwable -> L78
            r3 = 2
            if (r2 == r3) goto L33
            r1.zzn(r2)     // Catch: java.lang.Throwable -> L78
        L33:
            java.lang.String r2 = r4.zzc     // Catch: java.lang.Throwable -> L78
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L78
            if (r2 != 0) goto L40
            java.lang.String r2 = r4.zzc     // Catch: java.lang.Throwable -> L78
            r1.zze(r2)     // Catch: java.lang.Throwable -> L78
        L40:
            java.lang.String r2 = r4.zze     // Catch: java.lang.Throwable -> L78
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L78
            if (r2 != 0) goto L53
            boolean r2 = r1.zzl()     // Catch: java.lang.Throwable -> L78
            if (r2 != 0) goto L53
            java.lang.String r2 = r4.zze     // Catch: java.lang.Throwable -> L78
            r1.zzd(r2)     // Catch: java.lang.Throwable -> L78
        L53:
            com.google.android.gms.internal.ads.zzfgs r2 = r4.zzf     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L5b
            r1.zzb(r2)     // Catch: java.lang.Throwable -> L78
            goto L62
        L5b:
            com.google.android.gms.ads.internal.client.zze r2 = r4.zzg     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L62
            r1.zza(r2)     // Catch: java.lang.Throwable -> L78
        L62:
            com.google.android.gms.internal.ads.zzfmg r2 = r4.zzd     // Catch: java.lang.Throwable -> L78
            r1.zzf(r2)     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.zzfmd r2 = r4.zzb     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.zzflt r1 = r1.zzm()     // Catch: java.lang.Throwable -> L78
            r2.zzb(r1)     // Catch: java.lang.Throwable -> L78
            goto L1f
        L71:
            java.util.List r0 = r4.zza     // Catch: java.lang.Throwable -> L78
            r0.clear()     // Catch: java.lang.Throwable -> L78
            monitor-exit(r4)
            return
        L78:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    public final synchronized com.google.android.gms.internal.ads.zzfma zzi(int r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbek.zzc     // Catch: java.lang.Throwable -> L13
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L13
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L13
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L11
            r1.zzi = r2     // Catch: java.lang.Throwable -> L13
        L11:
            monitor-exit(r1)
            return r1
        L13:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
