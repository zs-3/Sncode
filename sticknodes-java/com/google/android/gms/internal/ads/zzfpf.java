package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class zzfpf implements android.app.Application.ActivityLifecycleCallbacks {
    protected boolean zza;
    private boolean zzb;
    private com.google.android.gms.internal.ads.zzfpe zzc;

    public zzfpf() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void zza(boolean r2) {
            r1 = this;
            boolean r0 = r1.zza
            if (r0 == r2) goto L14
            r1.zza = r2
            boolean r0 = r1.zzb
            if (r0 == 0) goto L14
            r1.zzb(r2)
            com.google.android.gms.internal.ads.zzfpe r0 = r1.zzc
            if (r0 == 0) goto L14
            r0.zzc(r2)
        L14:
            return
    }

    private final boolean zzh() {
            r2 = this;
            android.app.ActivityManager$RunningAppProcessInfo r0 = new android.app.ActivityManager$RunningAppProcessInfo
            r0.<init>()
            android.app.ActivityManager.getMyMemoryState(r0)
            int r0 = r0.importance
            r1 = 100
            if (r0 != r1) goto Lf
            goto L17
        Lf:
            boolean r0 = r2.zzc()
            if (r0 != 0) goto L17
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity r1) {
            r0 = this;
            r1 = 1
            r0.zza(r1)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity r1) {
            r0 = this;
            boolean r1 = r0.zzh()
            r0.zza(r1)
            return
    }

    protected void zzb(boolean r1) {
            r0 = this;
            return
    }

    protected boolean zzc() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final void zzd(android.content.Context r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.app.Application
            if (r0 == 0) goto L9
            android.app.Application r2 = (android.app.Application) r2
            r2.registerActivityLifecycleCallbacks(r1)
        L9:
            return
    }

    public final void zze(com.google.android.gms.internal.ads.zzfpe r1) {
            r0 = this;
            r0.zzc = r1
            return
    }

    public final void zzf() {
            r1 = this;
            r0 = 1
            r1.zzb = r0
            boolean r0 = r1.zzh()
            r1.zza = r0
            r1.zzb(r0)
            return
    }

    public final void zzg() {
            r1 = this;
            r0 = 0
            r1.zzb = r0
            r0 = 0
            r1.zzc = r0
            return
    }
}
