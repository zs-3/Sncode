package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes.dex */
final class zzp implements android.content.ServiceConnection, com.google.android.gms.common.internal.zzt {
    final /* synthetic */ com.google.android.gms.common.internal.zzs zza;
    private final java.util.Map zzb;
    private int zzc;
    private boolean zzd;
    private android.os.IBinder zze;
    private final com.google.android.gms.common.internal.zzo zzf;
    private android.content.ComponentName zzg;

    public zzp(com.google.android.gms.common.internal.zzs r1, com.google.android.gms.common.internal.zzo r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzf = r2
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.zzb = r1
            r1 = 2
            r0.zzc = r1
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.ConnectionResult zzd(com.google.android.gms.common.internal.zzp r9, java.lang.String r10, java.util.concurrent.Executor r11) {
            com.google.android.gms.common.internal.zzo r0 = r9.zzf     // Catch: com.google.android.gms.common.internal.zzaj -> L69
            com.google.android.gms.common.internal.zzs r1 = r9.zza     // Catch: com.google.android.gms.common.internal.zzaj -> L69
            android.content.Context r1 = com.google.android.gms.common.internal.zzs.zze(r1)     // Catch: com.google.android.gms.common.internal.zzaj -> L69
            android.content.Intent r5 = r0.zzb(r1)     // Catch: com.google.android.gms.common.internal.zzaj -> L69
            r0 = 3
            r9.zzc = r0
            android.os.StrictMode$VmPolicy r0 = com.google.android.gms.common.util.zzc.zza()
            com.google.android.gms.common.internal.zzs r1 = r9.zza     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.common.stats.ConnectionTracker r2 = com.google.android.gms.common.internal.zzs.zzg(r1)     // Catch: java.lang.Throwable -> L64
            android.content.Context r3 = com.google.android.gms.common.internal.zzs.zze(r1)     // Catch: java.lang.Throwable -> L64
            r7 = 4225(0x1081, float:5.92E-42)
            r4 = r10
            r6 = r9
            r8 = r11
            boolean r10 = r2.zza(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L64
            r9.zzd = r10     // Catch: java.lang.Throwable -> L64
            if (r10 == 0) goto L49
            com.google.android.gms.common.internal.zzs r10 = r9.zza     // Catch: java.lang.Throwable -> L64
            android.os.Handler r10 = com.google.android.gms.common.internal.zzs.zzf(r10)     // Catch: java.lang.Throwable -> L64
            r11 = 1
            com.google.android.gms.common.internal.zzo r1 = r9.zzf     // Catch: java.lang.Throwable -> L64
            android.os.Message r10 = r10.obtainMessage(r11, r1)     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.common.internal.zzs r11 = r9.zza     // Catch: java.lang.Throwable -> L64
            android.os.Handler r11 = com.google.android.gms.common.internal.zzs.zzf(r11)     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.common.internal.zzs r9 = r9.zza     // Catch: java.lang.Throwable -> L64
            long r1 = com.google.android.gms.common.internal.zzs.zzd(r9)     // Catch: java.lang.Throwable -> L64
            r11.sendMessageDelayed(r10, r1)     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.common.ConnectionResult r9 = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS     // Catch: java.lang.Throwable -> L64
            goto L60
        L49:
            r10 = 2
            r9.zzc = r10     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.common.internal.zzs r10 = r9.zza     // Catch: java.lang.IllegalArgumentException -> L59 java.lang.Throwable -> L64
            com.google.android.gms.common.stats.ConnectionTracker r11 = com.google.android.gms.common.internal.zzs.zzg(r10)     // Catch: java.lang.IllegalArgumentException -> L59 java.lang.Throwable -> L64
            android.content.Context r10 = com.google.android.gms.common.internal.zzs.zze(r10)     // Catch: java.lang.IllegalArgumentException -> L59 java.lang.Throwable -> L64
            r11.unbindService(r10, r9)     // Catch: java.lang.IllegalArgumentException -> L59 java.lang.Throwable -> L64
        L59:
            com.google.android.gms.common.ConnectionResult r9 = new com.google.android.gms.common.ConnectionResult     // Catch: java.lang.Throwable -> L64
            r10 = 16
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L64
        L60:
            android.os.StrictMode.setVmPolicy(r0)
            goto L6c
        L64:
            r9 = move-exception
            android.os.StrictMode.setVmPolicy(r0)
            throw r9
        L69:
            r9 = move-exception
            com.google.android.gms.common.ConnectionResult r9 = r9.zza
        L6c:
            return r9
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(android.content.ComponentName r1) {
            r0 = this;
            r0.onServiceDisconnected(r1)
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName r5, android.os.IBinder r6) {
            r4 = this;
            com.google.android.gms.common.internal.zzs r0 = r4.zza
            java.util.HashMap r0 = com.google.android.gms.common.internal.zzs.zzh(r0)
            monitor-enter(r0)
            com.google.android.gms.common.internal.zzs r1 = r4.zza     // Catch: java.lang.Throwable -> L35
            android.os.Handler r1 = com.google.android.gms.common.internal.zzs.zzf(r1)     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.common.internal.zzo r2 = r4.zzf     // Catch: java.lang.Throwable -> L35
            r3 = 1
            r1.removeMessages(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.zze = r6     // Catch: java.lang.Throwable -> L35
            r4.zzg = r5     // Catch: java.lang.Throwable -> L35
            java.util.Map r1 = r4.zzb     // Catch: java.lang.Throwable -> L35
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L35
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L35
        L21:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L35
            android.content.ServiceConnection r2 = (android.content.ServiceConnection) r2     // Catch: java.lang.Throwable -> L35
            r2.onServiceConnected(r5, r6)     // Catch: java.lang.Throwable -> L35
            goto L21
        L31:
            r4.zzc = r3     // Catch: java.lang.Throwable -> L35
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            return
        L35:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            throw r5
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName r5) {
            r4 = this;
            com.google.android.gms.common.internal.zzs r0 = r4.zza
            java.util.HashMap r0 = com.google.android.gms.common.internal.zzs.zzh(r0)
            monitor-enter(r0)
            com.google.android.gms.common.internal.zzs r1 = r4.zza     // Catch: java.lang.Throwable -> L37
            android.os.Handler r1 = com.google.android.gms.common.internal.zzs.zzf(r1)     // Catch: java.lang.Throwable -> L37
            r2 = 1
            com.google.android.gms.common.internal.zzo r3 = r4.zzf     // Catch: java.lang.Throwable -> L37
            r1.removeMessages(r2, r3)     // Catch: java.lang.Throwable -> L37
            r1 = 0
            r4.zze = r1     // Catch: java.lang.Throwable -> L37
            r4.zzg = r5     // Catch: java.lang.Throwable -> L37
            java.util.Map r1 = r4.zzb     // Catch: java.lang.Throwable -> L37
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L37
        L22:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L37
            android.content.ServiceConnection r2 = (android.content.ServiceConnection) r2     // Catch: java.lang.Throwable -> L37
            r2.onServiceDisconnected(r5)     // Catch: java.lang.Throwable -> L37
            goto L22
        L32:
            r5 = 2
            r4.zzc = r5     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            return
        L37:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r5
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    public final android.content.ComponentName zzb() {
            r1 = this;
            android.content.ComponentName r0 = r1.zzg
            return r0
    }

    public final android.os.IBinder zzc() {
            r1 = this;
            android.os.IBinder r0 = r1.zze
            return r0
    }

    public final void zze(android.content.ServiceConnection r1, android.content.ServiceConnection r2, java.lang.String r3) {
            r0 = this;
            java.util.Map r3 = r0.zzb
            r3.put(r1, r2)
            return
    }

    public final void zzf(android.content.ServiceConnection r1, java.lang.String r2) {
            r0 = this;
            java.util.Map r2 = r0.zzb
            r2.remove(r1)
            return
    }

    public final void zzg(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.common.internal.zzo r3 = r2.zzf
            com.google.android.gms.common.internal.zzs r0 = r2.zza
            android.os.Handler r0 = com.google.android.gms.common.internal.zzs.zzf(r0)
            r1 = 1
            r0.removeMessages(r1, r3)
            com.google.android.gms.common.internal.zzs r3 = r2.zza
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.internal.zzs.zzg(r3)
            android.content.Context r3 = com.google.android.gms.common.internal.zzs.zze(r3)
            r0.unbindService(r3, r2)
            r3 = 0
            r2.zzd = r3
            r3 = 2
            r2.zzc = r3
            return
    }

    public final boolean zzh(android.content.ServiceConnection r2) {
            r1 = this;
            java.util.Map r0 = r1.zzb
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    public final boolean zzi() {
            r1 = this;
            java.util.Map r0 = r1.zzb
            boolean r0 = r0.isEmpty()
            return r0
    }

    public final boolean zzj() {
            r1 = this;
            boolean r0 = r1.zzd
            return r0
    }
}
