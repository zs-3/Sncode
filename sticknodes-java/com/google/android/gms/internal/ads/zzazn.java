package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzazn implements android.app.Application.ActivityLifecycleCallbacks {
    private android.app.Activity zza;
    private android.content.Context zzb;
    private final java.lang.Object zzc;
    private boolean zzd;
    private boolean zze;
    private final java.util.List zzf;
    private final java.util.List zzg;
    private java.lang.Runnable zzh;
    private boolean zzi;
    private long zzj;

    zzazn() {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zzc = r0
            r0 = 1
            r2.zzd = r0
            r0 = 0
            r2.zze = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.zzf = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.zzg = r1
            r2.zzi = r0
            return
    }

    static /* bridge */ /* synthetic */ java.lang.Object zzc(com.google.android.gms.internal.ads.zzazn r0) {
            java.lang.Object r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List zzd(com.google.android.gms.internal.ads.zzazn r0) {
            java.util.List r0 = r0.zzf
            return r0
    }

    static /* bridge */ /* synthetic */ void zze(com.google.android.gms.internal.ads.zzazn r0, boolean r1) {
            r1 = 0
            r0.zzd = r1
            return
    }

    static /* bridge */ /* synthetic */ boolean zzi(com.google.android.gms.internal.ads.zzazn r0) {
            boolean r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzj(com.google.android.gms.internal.ads.zzazn r0) {
            boolean r0 = r0.zze
            return r0
    }

    private final void zzk(android.app.Activity r4) {
            r3 = this;
            java.lang.Object r0 = r3.zzc
            monitor-enter(r0)
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = "com.google.android.gms.ads"
            boolean r1 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L15
            r3.zza = r4     // Catch: java.lang.Throwable -> L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L17:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r4
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity r5) {
            r4 = this;
            java.lang.Object r0 = r4.zzc
            monitor-enter(r0)
            android.app.Activity r1 = r4.zza     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            return
        L9:
            boolean r5 = r1.equals(r5)     // Catch: java.lang.Throwable -> L40
            if (r5 == 0) goto L12
            r5 = 0
            r4.zza = r5     // Catch: java.lang.Throwable -> L40
        L12:
            java.util.List r5 = r4.zzg     // Catch: java.lang.Throwable -> L40
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L40
        L18:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.internal.ads.zzbac r1 = (com.google.android.gms.internal.ads.zzbac) r1     // Catch: java.lang.Throwable -> L40
            boolean r1 = r1.zza()     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L40
            if (r1 == 0) goto L18
            r5.remove()     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L40
            goto L18
        L2e:
            r1 = move-exception
            com.google.android.gms.internal.ads.zzcad r2 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = "AppActivityTracker.ActivityListener.onActivityDestroyed"
            r2.zzw(r1, r3)     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r1)     // Catch: java.lang.Throwable -> L40
            goto L18
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            return
        L40:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r5
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity r5) {
            r4 = this;
            r4.zzk(r5)
            java.lang.Object r5 = r4.zzc
            monitor-enter(r5)
            java.util.List r0 = r4.zzg     // Catch: java.lang.Throwable -> L48
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L48
        Lc:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.zzbac r1 = (com.google.android.gms.internal.ads.zzbac) r1     // Catch: java.lang.Throwable -> L48
            r1.zzb()     // Catch: java.lang.Exception -> L1c java.lang.Throwable -> L48
            goto Lc
        L1c:
            r1 = move-exception
            com.google.android.gms.internal.ads.zzcad r2 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = "AppActivityTracker.ActivityListener.onActivityPaused"
            r2.zzw(r1, r3)     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r1)     // Catch: java.lang.Throwable -> L48
            goto Lc
        L2c:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L48
            r5 = 1
            r4.zze = r5
            java.lang.Runnable r5 = r4.zzh
            if (r5 == 0) goto L39
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            r0.removeCallbacks(r5)
        L39:
            com.google.android.gms.internal.ads.zzfun r5 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzazm r0 = new com.google.android.gms.internal.ads.zzazm
            r0.<init>(r4)
            r4.zzh = r0
            long r1 = r4.zzj
            r5.postDelayed(r0, r1)
            return
        L48:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L48
            throw r0
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity r7) {
            r6 = this;
            r6.zzk(r7)
            r7 = 0
            r6.zze = r7
            boolean r7 = r6.zzd
            r0 = 1
            r7 = r7 ^ r0
            r6.zzd = r0
            java.lang.Runnable r1 = r6.zzh
            if (r1 == 0) goto L15
            com.google.android.gms.internal.ads.zzfun r2 = com.google.android.gms.ads.internal.util.zzt.zza
            r2.removeCallbacks(r1)
        L15:
            java.lang.Object r1 = r6.zzc
            monitor-enter(r1)
            java.util.List r2 = r6.zzg     // Catch: java.lang.Throwable -> L64
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L64
        L1e:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L64
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.internal.ads.zzbac r3 = (com.google.android.gms.internal.ads.zzbac) r3     // Catch: java.lang.Throwable -> L64
            r3.zzc()     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L64
            goto L1e
        L2e:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzcad r4 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L64
            java.lang.String r5 = "AppActivityTracker.ActivityListener.onActivityResumed"
            r4.zzw(r3, r5)     // Catch: java.lang.Throwable -> L64
            java.lang.String r4 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r4, r3)     // Catch: java.lang.Throwable -> L64
            goto L1e
        L3e:
            if (r7 == 0) goto L5d
            java.util.List r7 = r6.zzf     // Catch: java.lang.Throwable -> L64
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L64
        L46:
            boolean r2 = r7.hasNext()     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L62
            java.lang.Object r2 = r7.next()     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.internal.ads.zzazo r2 = (com.google.android.gms.internal.ads.zzazo) r2     // Catch: java.lang.Throwable -> L64
            r2.zza(r0)     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L64
            goto L46
        L56:
            r2 = move-exception
            java.lang.String r3 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r3, r2)     // Catch: java.lang.Throwable -> L64
            goto L46
        L5d:
            java.lang.String r7 = "App is still foreground."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r7)     // Catch: java.lang.Throwable -> L64
        L62:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L64
            return
        L64:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L64
            throw r7
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity r1) {
            r0 = this;
            r0.zzk(r1)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity r1) {
            r0 = this;
            return
    }

    public final android.app.Activity zza() {
            r1 = this;
            android.app.Activity r0 = r1.zza
            return r0
    }

    public final android.content.Context zzb() {
            r1 = this;
            android.content.Context r0 = r1.zzb
            return r0
    }

    public final void zzf(com.google.android.gms.internal.ads.zzazo r3) {
            r2 = this;
            java.lang.Object r0 = r2.zzc
            monitor-enter(r0)
            java.util.List r1 = r2.zzf     // Catch: java.lang.Throwable -> La
            r1.add(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    public final void zzg(android.app.Application r2, android.content.Context r3) {
            r1 = this;
            boolean r0 = r1.zzi
            if (r0 != 0) goto L27
            r2.registerActivityLifecycleCallbacks(r1)
            boolean r0 = r3 instanceof android.app.Activity
            if (r0 == 0) goto L10
            android.app.Activity r3 = (android.app.Activity) r3
            r1.zzk(r3)
        L10:
            r1.zzb = r2
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzaW
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r1.zzj = r2
            r2 = 1
            r1.zzi = r2
        L27:
            return
    }

    public final void zzh(com.google.android.gms.internal.ads.zzazo r3) {
            r2 = this;
            java.lang.Object r0 = r2.zzc
            monitor-enter(r0)
            java.util.List r1 = r2.zzf     // Catch: java.lang.Throwable -> La
            r1.remove(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }
}
