package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzawd implements android.app.Application.ActivityLifecycleCallbacks {
    private final android.app.Application zza;
    private final java.lang.ref.WeakReference zzb;
    private boolean zzc;

    public zzawd(android.app.Application r2, android.app.Application.ActivityLifecycleCallbacks r3) {
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
            com.google.android.gms.internal.ads.zzavv r0 = new com.google.android.gms.internal.ads.zzavv
            r0.<init>(r1, r2, r3)
            r1.zza(r0)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzawb r0 = new com.google.android.gms.internal.ads.zzawb
            r0.<init>(r1, r2)
            r1.zza(r0)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzavy r0 = new com.google.android.gms.internal.ads.zzavy
            r0.<init>(r1, r2)
            r1.zza(r0)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzavx r0 = new com.google.android.gms.internal.ads.zzavx
            r0.<init>(r1, r2)
            r1.zza(r0)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity r2, android.os.Bundle r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzawa r0 = new com.google.android.gms.internal.ads.zzawa
            r0.<init>(r1, r2, r3)
            r1.zza(r0)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzavw r0 = new com.google.android.gms.internal.ads.zzavw
            r0.<init>(r1, r2)
            r1.zza(r0)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzavz r0 = new com.google.android.gms.internal.ads.zzavz
            r0.<init>(r1, r2)
            r1.zza(r0)
            return
    }

    protected final void zza(com.google.android.gms.internal.ads.zzawc r2) {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.zzb     // Catch: java.lang.Exception -> L1a
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L1a
            android.app.Application$ActivityLifecycleCallbacks r0 = (android.app.Application.ActivityLifecycleCallbacks) r0     // Catch: java.lang.Exception -> L1a
            if (r0 == 0) goto Le
            r2.zza(r0)     // Catch: java.lang.Exception -> L1a
            return
        Le:
            boolean r2 = r1.zzc     // Catch: java.lang.Exception -> L1a
            if (r2 != 0) goto L1a
            android.app.Application r2 = r1.zza     // Catch: java.lang.Exception -> L1a
            r2.unregisterActivityLifecycleCallbacks(r1)     // Catch: java.lang.Exception -> L1a
            r2 = 1
            r1.zzc = r2     // Catch: java.lang.Exception -> L1a
        L1a:
            return
    }
}
