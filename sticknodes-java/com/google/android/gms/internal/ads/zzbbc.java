package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbbc {
    private java.util.concurrent.ScheduledFuture zza;
    private final java.lang.Runnable zzb;
    private final java.lang.Object zzc;
    private com.google.android.gms.internal.ads.zzbbf zzd;
    private android.content.Context zze;
    private com.google.android.gms.internal.ads.zzbbi zzf;

    public zzbbc() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            com.google.android.gms.internal.ads.zzbay r0 = new com.google.android.gms.internal.ads.zzbay
            r0.<init>(r1)
            r1.zzb = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zzc = r0
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzbbf zzc(com.google.android.gms.internal.ads.zzbbc r0) {
            com.google.android.gms.internal.ads.zzbbf r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.Object zze(com.google.android.gms.internal.ads.zzbbc r0) {
            java.lang.Object r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzbbc r0, com.google.android.gms.internal.ads.zzbbf r1) {
            r1 = 0
            r0.zzd = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzbbc r0) {
            r0.zzl()
            return
    }

    static /* bridge */ /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzbbc r2) {
            java.lang.Object r0 = r2.zzc
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbbf r1 = r2.zzd     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            return
        L9:
            boolean r1 = r1.isConnected()     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L17
            com.google.android.gms.internal.ads.zzbbf r1 = r2.zzd     // Catch: java.lang.Throwable -> L26
            boolean r1 = r1.isConnecting()     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L1c
        L17:
            com.google.android.gms.internal.ads.zzbbf r1 = r2.zzd     // Catch: java.lang.Throwable -> L26
            r1.disconnect()     // Catch: java.lang.Throwable -> L26
        L1c:
            r1 = 0
            r2.zzd = r1     // Catch: java.lang.Throwable -> L26
            r2.zzf = r1     // Catch: java.lang.Throwable -> L26
            android.os.Binder.flushPendingCommands()     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            return
        L26:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r2
    }

    static /* bridge */ /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzbbc r0, com.google.android.gms.internal.ads.zzbbi r1) {
            r0.zzf = r1
            return
    }

    private final void zzl() {
            r3 = this;
            java.lang.Object r0 = r3.zzc
            monitor-enter(r0)
            android.content.Context r1 = r3.zze     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L21
            com.google.android.gms.internal.ads.zzbbf r1 = r3.zzd     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto Lc
            goto L21
        Lc:
            com.google.android.gms.internal.ads.zzbba r1 = new com.google.android.gms.internal.ads.zzbba     // Catch: java.lang.Throwable -> L23
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.internal.ads.zzbbb r2 = new com.google.android.gms.internal.ads.zzbbb     // Catch: java.lang.Throwable -> L23
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.internal.ads.zzbbf r1 = r3.zzd(r1, r2)     // Catch: java.lang.Throwable -> L23
            r3.zzd = r1     // Catch: java.lang.Throwable -> L23
            r1.checkAvailabilityAndConnect()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r1
    }

    public final long zza(com.google.android.gms.internal.ads.zzbbg r5) {
            r4 = this;
            java.lang.Object r0 = r4.zzc
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbbi r1 = r4.zzf     // Catch: java.lang.Throwable -> L23
            r2 = -2
            if (r1 != 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return r2
        Lb:
            com.google.android.gms.internal.ads.zzbbf r1 = r4.zzd     // Catch: java.lang.Throwable -> L23
            boolean r1 = r1.zzp()     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L21
            com.google.android.gms.internal.ads.zzbbi r1 = r4.zzf     // Catch: android.os.RemoteException -> L1b java.lang.Throwable -> L23
            long r1 = r1.zze(r5)     // Catch: android.os.RemoteException -> L1b java.lang.Throwable -> L23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return r1
        L1b:
            r5 = move-exception
            java.lang.String r1 = "Unable to call into cache service."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r5)     // Catch: java.lang.Throwable -> L23
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return r2
        L23:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r5
    }

    public final com.google.android.gms.internal.ads.zzbbd zzb(com.google.android.gms.internal.ads.zzbbg r3) {
            r2 = this;
            java.lang.Object r0 = r2.zzc
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbbi r1 = r2.zzf     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto Le
            com.google.android.gms.internal.ads.zzbbd r3 = new com.google.android.gms.internal.ads.zzbbd     // Catch: java.lang.Throwable -> L33
            r3.<init>()     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return r3
        Le:
            com.google.android.gms.internal.ads.zzbbf r1 = r2.zzd     // Catch: android.os.RemoteException -> L26 java.lang.Throwable -> L33
            boolean r1 = r1.zzp()     // Catch: android.os.RemoteException -> L26 java.lang.Throwable -> L33
            if (r1 == 0) goto L1e
            com.google.android.gms.internal.ads.zzbbi r1 = r2.zzf     // Catch: android.os.RemoteException -> L26 java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzbbd r3 = r1.zzg(r3)     // Catch: android.os.RemoteException -> L26 java.lang.Throwable -> L33
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return r3
        L1e:
            com.google.android.gms.internal.ads.zzbbi r1 = r2.zzf     // Catch: android.os.RemoteException -> L26 java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzbbd r3 = r1.zzf(r3)     // Catch: android.os.RemoteException -> L26 java.lang.Throwable -> L33
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return r3
        L26:
            r3 = move-exception
            java.lang.String r1 = "Unable to call into cache service."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r3)     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzbbd r3 = new com.google.android.gms.internal.ads.zzbbd     // Catch: java.lang.Throwable -> L33
            r3.<init>()     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return r3
        L33:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r3
    }

    protected final synchronized com.google.android.gms.internal.ads.zzbbf zzd(com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks r4, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener r5) {
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbbf r0 = new com.google.android.gms.internal.ads.zzbbf     // Catch: java.lang.Throwable -> L12
            android.content.Context r1 = r3.zze     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.ads.internal.util.zzbt r2 = com.google.android.gms.ads.internal.zzu.zzt()     // Catch: java.lang.Throwable -> L12
            android.os.Looper r2 = r2.zzb()     // Catch: java.lang.Throwable -> L12
            r0.<init>(r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)
            return r0
        L12:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final void zzi(android.content.Context r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.Object r0 = r2.zzc
            monitor-enter(r0)
            android.content.Context r1 = r2.zze     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            return
        Lc:
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L48
            r2.zze = r3     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzee     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L48
            java.lang.Object r3 = r1.zza(r3)     // Catch: java.lang.Throwable -> L48
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L48
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L28
            r2.zzl()     // Catch: java.lang.Throwable -> L48
            goto L46
        L28:
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzed     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L48
            java.lang.Object r3 = r1.zza(r3)     // Catch: java.lang.Throwable -> L48
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L48
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L46
            com.google.android.gms.internal.ads.zzbaz r3 = new com.google.android.gms.internal.ads.zzbaz     // Catch: java.lang.Throwable -> L48
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.zzazp r1 = com.google.android.gms.ads.internal.zzu.zzb()     // Catch: java.lang.Throwable -> L48
            r1.zzc(r3)     // Catch: java.lang.Throwable -> L48
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            return
        L48:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            throw r3
    }

    public final void zzj() {
            r6 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzef
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L41
            java.lang.Object r0 = r6.zzc
            monitor-enter(r0)
            r6.zzl()     // Catch: java.lang.Throwable -> L3e
            java.util.concurrent.ScheduledFuture r1 = r6.zza     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L20
            r2 = 0
            r1.cancel(r2)     // Catch: java.lang.Throwable -> L3e
        L20:
            java.util.concurrent.ScheduledExecutorService r1 = com.google.android.gms.internal.ads.zzcan.zzd     // Catch: java.lang.Throwable -> L3e
            java.lang.Runnable r2 = r6.zzb     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzeg     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r3 = r4.zza(r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L3e
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L3e
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L3e
            java.util.concurrent.ScheduledFuture r1 = r1.schedule(r2, r3, r5)     // Catch: java.lang.Throwable -> L3e
            r6.zza = r1     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L3e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r1
        L41:
            return
    }
}
