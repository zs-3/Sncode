package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaat extends android.os.HandlerThread implements android.os.Handler.Callback {
    private com.google.android.gms.internal.ads.zzdp zza;
    private android.os.Handler zzb;
    private java.lang.Error zzc;
    private java.lang.RuntimeException zzd;
    private com.google.android.gms.internal.ads.zzaav zze;

    public zzaat() {
            r1 = this;
            java.lang.String r0 = "ExoPlayer:PlaceholderSurface"
            r1.<init>(r0)
            return
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r5) {
            r4 = this;
            int r0 = r5.what
            r1 = 1
            if (r0 == r1) goto L24
            r5 = 2
            if (r0 == r5) goto La
            goto L86
        La:
            com.google.android.gms.internal.ads.zzdp r5 = r4.zza     // Catch: java.lang.Throwable -> L13
            java.util.Objects.requireNonNull(r5)
            r5.zzc()     // Catch: java.lang.Throwable -> L13
            goto L1b
        L13:
            r5 = move-exception
            java.lang.String r0 = "PlaceholderSurface"
            java.lang.String r2 = "Failed to release placeholder surface"
            com.google.android.gms.internal.ads.zzea.zzd(r0, r2, r5)     // Catch: java.lang.Throwable -> L1f
        L1b:
            r4.quit()
            return r1
        L1f:
            r5 = move-exception
            r4.quit()
            throw r5
        L24:
            int r5 = r5.arg1     // Catch: java.lang.Throwable -> L4a java.lang.Error -> L4c com.google.android.gms.internal.ads.zzdq -> L5f java.lang.RuntimeException -> L77
            com.google.android.gms.internal.ads.zzdp r0 = r4.zza     // Catch: java.lang.Throwable -> L4a java.lang.Error -> L4c com.google.android.gms.internal.ads.zzdq -> L5f java.lang.RuntimeException -> L77
            java.util.Objects.requireNonNull(r0)
            r0.zzb(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Error -> L4c com.google.android.gms.internal.ads.zzdq -> L5f java.lang.RuntimeException -> L77
            com.google.android.gms.internal.ads.zzaav r0 = new com.google.android.gms.internal.ads.zzaav     // Catch: java.lang.Throwable -> L4a java.lang.Error -> L4c com.google.android.gms.internal.ads.zzdq -> L5f java.lang.RuntimeException -> L77
            com.google.android.gms.internal.ads.zzdp r2 = r4.zza     // Catch: java.lang.Throwable -> L4a java.lang.Error -> L4c com.google.android.gms.internal.ads.zzdq -> L5f java.lang.RuntimeException -> L77
            android.graphics.SurfaceTexture r2 = r2.zza()     // Catch: java.lang.Throwable -> L4a java.lang.Error -> L4c com.google.android.gms.internal.ads.zzdq -> L5f java.lang.RuntimeException -> L77
            if (r5 == 0) goto L3a
            r5 = 1
            goto L3b
        L3a:
            r5 = 0
        L3b:
            r3 = 0
            r0.<init>(r4, r2, r5, r3)     // Catch: java.lang.Throwable -> L4a java.lang.Error -> L4c com.google.android.gms.internal.ads.zzdq -> L5f java.lang.RuntimeException -> L77
            r4.zze = r0     // Catch: java.lang.Throwable -> L4a java.lang.Error -> L4c com.google.android.gms.internal.ads.zzdq -> L5f java.lang.RuntimeException -> L77
            monitor-enter(r4)
            r4.notify()     // Catch: java.lang.Throwable -> L47
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L47
            goto L86
        L47:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L47
            throw r5
        L4a:
            r5 = move-exception
            goto L8a
        L4c:
            r5 = move-exception
            java.lang.String r0 = "PlaceholderSurface"
            java.lang.String r2 = "Failed to initialize placeholder surface"
            com.google.android.gms.internal.ads.zzea.zzd(r0, r2, r5)     // Catch: java.lang.Throwable -> L4a
            r4.zzc = r5     // Catch: java.lang.Throwable -> L4a
            monitor-enter(r4)
            r4.notify()     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5c
            goto L86
        L5c:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5c
            throw r5
        L5f:
            r5 = move-exception
            java.lang.String r0 = "PlaceholderSurface"
            java.lang.String r2 = "Failed to initialize placeholder surface"
            com.google.android.gms.internal.ads.zzea.zzd(r0, r2, r5)     // Catch: java.lang.Throwable -> L4a
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4a
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L4a
            r4.zzd = r0     // Catch: java.lang.Throwable -> L4a
            monitor-enter(r4)
            r4.notify()     // Catch: java.lang.Throwable -> L74
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L74
            goto L86
        L74:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L74
            throw r5
        L77:
            r5 = move-exception
            java.lang.String r0 = "PlaceholderSurface"
            java.lang.String r2 = "Failed to initialize placeholder surface"
            com.google.android.gms.internal.ads.zzea.zzd(r0, r2, r5)     // Catch: java.lang.Throwable -> L4a
            r4.zzd = r5     // Catch: java.lang.Throwable -> L4a
            monitor-enter(r4)
            r4.notify()     // Catch: java.lang.Throwable -> L87
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L87
        L86:
            return r1
        L87:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L87
            throw r5
        L8a:
            monitor-enter(r4)
            r4.notify()     // Catch: java.lang.Throwable -> L90
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L90
            throw r5
        L90:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L90
            throw r5
    }

    public final com.google.android.gms.internal.ads.zzaav zza(int r4) {
            r3 = this;
            r3.start()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = r3.getLooper()
            r0.<init>(r1, r3)
            r3.zzb = r0
            com.google.android.gms.internal.ads.zzdp r0 = new com.google.android.gms.internal.ads.zzdp
            android.os.Handler r1 = r3.zzb
            r2 = 0
            r0.<init>(r1, r2)
            r3.zza = r0
            monitor-enter(r3)
            android.os.Handler r0 = r3.zzb     // Catch: java.lang.Throwable -> L50
            r1 = 0
            r2 = 1
            android.os.Message r4 = r0.obtainMessage(r2, r4, r1)     // Catch: java.lang.Throwable -> L50
            r4.sendToTarget()     // Catch: java.lang.Throwable -> L50
        L24:
            com.google.android.gms.internal.ads.zzaav r4 = r3.zze     // Catch: java.lang.Throwable -> L50
            if (r4 != 0) goto L36
            java.lang.RuntimeException r4 = r3.zzd     // Catch: java.lang.Throwable -> L50
            if (r4 != 0) goto L36
            java.lang.Error r4 = r3.zzc     // Catch: java.lang.Throwable -> L50
            if (r4 != 0) goto L36
            r3.wait()     // Catch: java.lang.InterruptedException -> L34 java.lang.Throwable -> L50
            goto L24
        L34:
            r1 = 1
            goto L24
        L36:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L40
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L40:
            java.lang.RuntimeException r4 = r3.zzd
            if (r4 != 0) goto L4f
            java.lang.Error r4 = r3.zzc
            if (r4 != 0) goto L4e
            com.google.android.gms.internal.ads.zzaav r4 = r3.zze
            java.util.Objects.requireNonNull(r4)
            return r4
        L4e:
            throw r4
        L4f:
            throw r4
        L50:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L50
            throw r4
    }

    public final void zzb() {
            r2 = this;
            android.os.Handler r0 = r2.zzb
            java.util.Objects.requireNonNull(r0)
            r1 = 2
            r0.sendEmptyMessage(r1)
            return
    }
}
