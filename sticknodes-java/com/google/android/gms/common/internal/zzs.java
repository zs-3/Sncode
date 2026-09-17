package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes.dex */
final class zzs extends com.google.android.gms.common.internal.GmsClientSupervisor {
    private final java.util.HashMap zzb;
    private final android.content.Context zzc;
    private volatile android.os.Handler zzd;
    private final com.google.android.gms.common.internal.zzq zze;
    private final com.google.android.gms.common.stats.ConnectionTracker zzf;
    private final long zzg;
    private final long zzh;
    private volatile java.util.concurrent.Executor zzi;

    zzs(android.content.Context r3, android.os.Looper r4, java.util.concurrent.Executor r5) {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.zzb = r0
            com.google.android.gms.common.internal.zzq r0 = new com.google.android.gms.common.internal.zzq
            r1 = 0
            r0.<init>(r2, r1)
            r2.zze = r0
            android.content.Context r3 = r3.getApplicationContext()
            r2.zzc = r3
            com.google.android.gms.internal.common.zzh r3 = new com.google.android.gms.internal.common.zzh
            r3.<init>(r4, r0)
            r2.zzd = r3
            com.google.android.gms.common.stats.ConnectionTracker r3 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()
            r2.zzf = r3
            r3 = 5000(0x1388, double:2.4703E-320)
            r2.zzg = r3
            r3 = 300000(0x493e0, double:1.482197E-318)
            r2.zzh = r3
            r2.zzi = r5
            return
    }

    static /* bridge */ /* synthetic */ long zzd(com.google.android.gms.common.internal.zzs r2) {
            long r0 = r2.zzh
            return r0
    }

    static /* bridge */ /* synthetic */ android.content.Context zze(com.google.android.gms.common.internal.zzs r0) {
            android.content.Context r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ android.os.Handler zzf(com.google.android.gms.common.internal.zzs r0) {
            android.os.Handler r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.stats.ConnectionTracker zzg(com.google.android.gms.common.internal.zzs r0) {
            com.google.android.gms.common.stats.ConnectionTracker r0 = r0.zzf
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.HashMap zzh(com.google.android.gms.common.internal.zzs r0) {
            java.util.HashMap r0 = r0.zzb
            return r0
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final com.google.android.gms.common.ConnectionResult zza(com.google.android.gms.common.internal.zzo r6, android.content.ServiceConnection r7, java.lang.String r8, java.util.concurrent.Executor r9) {
            r5 = this;
            java.lang.String r0 = "ServiceConnection must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7, r0)
            java.util.HashMap r0 = r5.zzb
            monitor-enter(r0)
            java.util.HashMap r1 = r5.zzb     // Catch: java.lang.Throwable -> L82
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.common.internal.zzp r1 = (com.google.android.gms.common.internal.zzp) r1     // Catch: java.lang.Throwable -> L82
            if (r9 != 0) goto L14
            java.util.concurrent.Executor r9 = r5.zzi     // Catch: java.lang.Throwable -> L82
        L14:
            r2 = 0
            if (r1 != 0) goto L29
            com.google.android.gms.common.internal.zzp r1 = new com.google.android.gms.common.internal.zzp     // Catch: java.lang.Throwable -> L82
            r1.<init>(r5, r6)     // Catch: java.lang.Throwable -> L82
            r1.zze(r7, r7, r8)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.common.ConnectionResult r2 = com.google.android.gms.common.internal.zzp.zzd(r1, r8, r9)     // Catch: java.lang.Throwable -> L82
            java.util.HashMap r7 = r5.zzb     // Catch: java.lang.Throwable -> L82
            r7.put(r6, r1)     // Catch: java.lang.Throwable -> L82
            goto L53
        L29:
            android.os.Handler r3 = r5.zzd     // Catch: java.lang.Throwable -> L82
            r4 = 0
            r3.removeMessages(r4, r6)     // Catch: java.lang.Throwable -> L82
            boolean r3 = r1.zzh(r7)     // Catch: java.lang.Throwable -> L82
            if (r3 != 0) goto L67
            r1.zze(r7, r7, r8)     // Catch: java.lang.Throwable -> L82
            int r6 = r1.zza()     // Catch: java.lang.Throwable -> L82
            r3 = 1
            if (r6 == r3) goto L48
            r7 = 2
            if (r6 == r7) goto L43
            goto L53
        L43:
            com.google.android.gms.common.ConnectionResult r2 = com.google.android.gms.common.internal.zzp.zzd(r1, r8, r9)     // Catch: java.lang.Throwable -> L82
            goto L53
        L48:
            android.content.ComponentName r6 = r1.zzb()     // Catch: java.lang.Throwable -> L82
            android.os.IBinder r8 = r1.zzc()     // Catch: java.lang.Throwable -> L82
            r7.onServiceConnected(r6, r8)     // Catch: java.lang.Throwable -> L82
        L53:
            boolean r6 = r1.zzj()     // Catch: java.lang.Throwable -> L82
            if (r6 == 0) goto L5d
            com.google.android.gms.common.ConnectionResult r6 = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS     // Catch: java.lang.Throwable -> L82
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L82
            return r6
        L5d:
            if (r2 != 0) goto L65
            com.google.android.gms.common.ConnectionResult r2 = new com.google.android.gms.common.ConnectionResult     // Catch: java.lang.Throwable -> L82
            r6 = -1
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L82
        L65:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L82
            return r2
        L67:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L82
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L82
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L82
            r8.<init>()     // Catch: java.lang.Throwable -> L82
            java.lang.String r9 = "Trying to bind a GmsServiceConnection that was already connected before.  config="
            r8.append(r9)     // Catch: java.lang.Throwable -> L82
            r8.append(r6)     // Catch: java.lang.Throwable -> L82
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> L82
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L82
            throw r7     // Catch: java.lang.Throwable -> L82
        L82:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L82
            throw r6
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final void zzb(com.google.android.gms.common.internal.zzo r4, android.content.ServiceConnection r5, java.lang.String r6) {
            r3 = this;
            java.lang.String r0 = "ServiceConnection must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r0)
            java.util.HashMap r0 = r3.zzb
            monitor-enter(r0)
            java.util.HashMap r1 = r3.zzb     // Catch: java.lang.Throwable -> L67
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L67
            com.google.android.gms.common.internal.zzp r1 = (com.google.android.gms.common.internal.zzp) r1     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L4c
            boolean r2 = r1.zzh(r5)     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto L31
            r1.zzf(r5, r6)     // Catch: java.lang.Throwable -> L67
            boolean r5 = r1.zzi()     // Catch: java.lang.Throwable -> L67
            if (r5 == 0) goto L2f
            android.os.Handler r5 = r3.zzd     // Catch: java.lang.Throwable -> L67
            r6 = 0
            android.os.Message r4 = r5.obtainMessage(r6, r4)     // Catch: java.lang.Throwable -> L67
            android.os.Handler r5 = r3.zzd     // Catch: java.lang.Throwable -> L67
            long r1 = r3.zzg     // Catch: java.lang.Throwable -> L67
            r5.sendMessageDelayed(r4, r1)     // Catch: java.lang.Throwable -> L67
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            return
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r6.<init>()     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = "Trying to unbind a GmsServiceConnection  that was not bound before.  config="
            r6.append(r1)     // Catch: java.lang.Throwable -> L67
            r6.append(r4)     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L67
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L67
            throw r5     // Catch: java.lang.Throwable -> L67
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r6.<init>()     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = "Nonexistent connection status for service config: "
            r6.append(r1)     // Catch: java.lang.Throwable -> L67
            r6.append(r4)     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L67
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L67
            throw r5     // Catch: java.lang.Throwable -> L67
        L67:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            throw r4
    }

    final void zzi(java.util.concurrent.Executor r2) {
            r1 = this;
            java.util.HashMap r0 = r1.zzb
            monitor-enter(r0)
            r1.zzi = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    final void zzj(android.os.Looper r4) {
            r3 = this;
            java.util.HashMap r0 = r3.zzb
            monitor-enter(r0)
            com.google.android.gms.internal.common.zzh r1 = new com.google.android.gms.internal.common.zzh     // Catch: java.lang.Throwable -> Le
            com.google.android.gms.common.internal.zzq r2 = r3.zze     // Catch: java.lang.Throwable -> Le
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> Le
            r3.zzd = r1     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r4
    }
}
