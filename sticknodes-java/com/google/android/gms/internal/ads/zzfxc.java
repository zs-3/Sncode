package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfxc {
    private final com.google.android.gms.internal.ads.zzfyp zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzfxd zzc;
    private final java.lang.String zzd;
    private final java.util.List zze;
    private boolean zzf;
    private final android.content.Intent zzg;
    private final android.os.IBinder.DeathRecipient zzh;
    private android.content.ServiceConnection zzi;
    private android.os.IInterface zzj;

    zzfxc(android.content.Context r1, com.google.android.gms.internal.ads.zzfxd r2, java.lang.String r3, android.content.Intent r4, com.google.android.gms.internal.ads.zzfwh r5) {
            r0 = this;
            r0.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.zze = r3
            r0.zzb = r1
            r0.zzc = r2
            java.lang.String r1 = "OverlayDisplayService"
            r0.zzd = r1
            r0.zzg = r4
            com.google.android.gms.internal.ads.zzfwt r2 = new com.google.android.gms.internal.ads.zzfwt
            r2.<init>(r1)
            com.google.android.gms.internal.ads.zzfyp r1 = com.google.android.gms.internal.ads.zzfyt.zza(r2)
            r0.zza = r1
            com.google.android.gms.internal.ads.zzfwu r1 = new com.google.android.gms.internal.ads.zzfwu
            r1.<init>(r0)
            r0.zzh = r1
            return
    }

    static /* bridge */ /* synthetic */ android.os.IBinder.DeathRecipient zza(com.google.android.gms.internal.ads.zzfxc r0) {
            android.os.IBinder$DeathRecipient r0 = r0.zzh
            return r0
    }

    static /* bridge */ /* synthetic */ android.os.IInterface zzb(com.google.android.gms.internal.ads.zzfxc r0) {
            android.os.IInterface r0 = r0.zzj
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfxd zzd(com.google.android.gms.internal.ads.zzfxc r0) {
            com.google.android.gms.internal.ads.zzfxd r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List zze(com.google.android.gms.internal.ads.zzfxc r0) {
            java.util.List r0 = r0.zze
            return r0
    }

    static /* bridge */ /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzfxc r0, boolean r1) {
            r1 = 0
            r0.zzf = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzfxc r0, android.os.IInterface r1) {
            r0.zzj = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzfxc r0, java.lang.Runnable r1) {
            r0.zzo(r1)
            return
    }

    private final void zzo(java.lang.Runnable r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzfyp r0 = r2.zza
            java.lang.Object r0 = r0.zza()
            android.os.Handler r0 = (android.os.Handler) r0
            com.google.android.gms.internal.ads.zzfwv r1 = new com.google.android.gms.internal.ads.zzfwv
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    public final android.os.IInterface zzc() {
            r1 = this;
            android.os.IInterface r0 = r1.zzj
            return r0
    }

    public final void zzi(java.lang.Runnable r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfww r0 = new com.google.android.gms.internal.ads.zzfww
            r0.<init>(r1, r2)
            r1.zzo(r0)
            return
    }

    final /* synthetic */ void zzj(java.lang.Runnable r5) {
            r4 = this;
            android.os.IInterface r0 = r4.zzj
            r1 = 0
            if (r0 != 0) goto L4c
            boolean r0 = r4.zzf
            if (r0 != 0) goto L4c
            com.google.android.gms.internal.ads.zzfxd r0 = r4.zzc
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "Initiate binding to the service."
            r0.zzc(r3, r2)
            java.util.List r0 = r4.zze
            monitor-enter(r0)
            java.util.List r2 = r4.zze     // Catch: java.lang.Throwable -> L49
            r2.add(r5)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            com.google.android.gms.internal.ads.zzfxb r5 = new com.google.android.gms.internal.ads.zzfxb
            r0 = 0
            r5.<init>(r4, r0)
            r4.zzi = r5
            r0 = 1
            r4.zzf = r0
            android.content.Context r2 = r4.zzb
            android.content.Intent r3 = r4.zzg
            boolean r5 = r2.bindService(r3, r5, r0)
            if (r5 != 0) goto L48
            com.google.android.gms.internal.ads.zzfxd r5 = r4.zzc
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "Failed to bind to the service."
            r5.zzc(r2, r0)
            r4.zzf = r1
            java.util.List r5 = r4.zze
            monitor-enter(r5)
            java.util.List r0 = r4.zze     // Catch: java.lang.Throwable -> L45
            r0.clear()     // Catch: java.lang.Throwable -> L45
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L45
            return
        L45:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L45
            throw r0
        L48:
            return
        L49:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            throw r5
        L4c:
            boolean r0 = r4.zzf
            if (r0 == 0) goto L66
            com.google.android.gms.internal.ads.zzfxd r0 = r4.zzc
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Waiting to bind to the service."
            r0.zzc(r2, r1)
            java.util.List r0 = r4.zze
            monitor-enter(r0)
            java.util.List r1 = r4.zze     // Catch: java.lang.Throwable -> L63
            r1.add(r5)     // Catch: java.lang.Throwable -> L63
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
            return
        L63:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
            throw r5
        L66:
            r5.run()
            return
    }

    final /* synthetic */ void zzk() {
            r3 = this;
            java.lang.String r0 = r3.zzd
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            com.google.android.gms.internal.ads.zzfxd r0 = r3.zzc
            java.lang.String r2 = "%s : Binder has died."
            r0.zzc(r2, r1)
            java.util.List r0 = r3.zze
            monitor-enter(r0)
            java.util.List r1 = r3.zze     // Catch: java.lang.Throwable -> L19
            r1.clear()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L19:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r1
    }

    final /* synthetic */ void zzl(java.lang.Runnable r4) {
            r3 = this;
            r4.run()     // Catch: java.lang.RuntimeException -> L4
            return
        L4:
            r4 = move-exception
            com.google.android.gms.internal.ads.zzfxd r0 = r3.zzc
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "error caused by "
            r0.zza(r4, r1)
            return
    }

    final /* synthetic */ void zzm() {
            r4 = this;
            android.os.IInterface r0 = r4.zzj
            if (r0 == 0) goto L2c
            com.google.android.gms.internal.ads.zzfxd r0 = r4.zzc
            java.lang.String r1 = "Unbind from service."
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r0.zzc(r1, r3)
            android.content.Context r0 = r4.zzb
            android.content.ServiceConnection r1 = r4.zzi
            java.util.Objects.requireNonNull(r1)
            r0.unbindService(r1)
            r4.zzf = r2
            r0 = 0
            r4.zzj = r0
            r4.zzi = r0
            java.util.List r0 = r4.zze
            monitor-enter(r0)
            java.util.List r1 = r4.zze     // Catch: java.lang.Throwable -> L29
            r1.clear()     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r1
        L2c:
            return
    }

    public final void zzn() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfwx r0 = new com.google.android.gms.internal.ads.zzfwx
            r0.<init>(r1)
            r1.zzo(r0)
            return
    }
}
