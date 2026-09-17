package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzazi implements android.app.Application.ActivityLifecycleCallbacks {
    private final android.app.Application zza;
    private final java.lang.ref.WeakReference zzb;
    private boolean zzc;

    public zzazi(android.app.Application r2, android.app.Application.ActivityLifecycleCallbacks r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzc = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r1.zzb = r0
            r1.zza = r2
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity r2, android.os.Bundle r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzaza r0 = new com.google.android.gms.internal.ads.zzaza
            r0.<init>(r1, r2, r3)
            r1.zza(r0)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzazg r0 = new com.google.android.gms.internal.ads.zzazg
            r0.<init>(r1, r2)
            r1.zza(r0)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzazd r0 = new com.google.android.gms.internal.ads.zzazd
            r0.<init>(r1, r2)
            r1.zza(r0)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzazc r0 = new com.google.android.gms.internal.ads.zzazc
            r0.<init>(r1, r2)
            r1.zza(r0)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity r2, android.os.Bundle r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzazf r0 = new com.google.android.gms.internal.ads.zzazf
            r0.<init>(r1, r2, r3)
            r1.zza(r0)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzazb r0 = new com.google.android.gms.internal.ads.zzazb
            r0.<init>(r1, r2)
            r1.zza(r0)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzaze r0 = new com.google.android.gms.internal.ads.zzaze
            r0.<init>(r1, r2)
            r1.zza(r0)
            return
    }

    protected final void zza(com.google.android.gms.internal.ads.zzazh r2) {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.zzb     // Catch: java.lang.Exception -> L1b
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L1b
            android.app.Application$ActivityLifecycleCallbacks r0 = (android.app.Application.ActivityLifecycleCallbacks) r0     // Catch: java.lang.Exception -> L1b
            if (r0 == 0) goto Le
            r2.zza(r0)     // Catch: java.lang.Exception -> L1b
            return
        Le:
            boolean r2 = r1.zzc     // Catch: java.lang.Exception -> L1b
            if (r2 != 0) goto L1a
            android.app.Application r2 = r1.zza     // Catch: java.lang.Exception -> L1b
            r2.unregisterActivityLifecycleCallbacks(r1)     // Catch: java.lang.Exception -> L1b
            r2 = 1
            r1.zzc = r2     // Catch: java.lang.Exception -> L1b
        L1a:
            return
        L1b:
            r2 = move-exception
            java.lang.String r0 = "Error while dispatching lifecycle callback."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
            return
    }
}
