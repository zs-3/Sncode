package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* loaded from: classes2.dex */
final class zzfe implements android.app.Application.ActivityLifecycleCallbacks {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzff zza;

    zzfe(com.google.android.gms.internal.measurement.zzff r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity r2, android.os.Bundle r3) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzex r0 = new com.google.android.gms.internal.measurement.zzex
            r0.<init>(r1, r3, r2)
            com.google.android.gms.internal.measurement.zzff r2 = r1.zza
            com.google.android.gms.internal.measurement.zzff.zzu(r2, r0)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzfd r0 = new com.google.android.gms.internal.measurement.zzfd
            r0.<init>(r1, r2)
            com.google.android.gms.internal.measurement.zzff r2 = r1.zza
            com.google.android.gms.internal.measurement.zzff.zzu(r2, r0)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzfa r0 = new com.google.android.gms.internal.measurement.zzfa
            r0.<init>(r1, r2)
            com.google.android.gms.internal.measurement.zzff r2 = r1.zza
            com.google.android.gms.internal.measurement.zzff.zzu(r2, r0)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzez r0 = new com.google.android.gms.internal.measurement.zzez
            r0.<init>(r1, r2)
            com.google.android.gms.internal.measurement.zzff r2 = r1.zza
            com.google.android.gms.internal.measurement.zzff.zzu(r2, r0)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity r4, android.os.Bundle r5) {
            r3 = this;
            com.google.android.gms.internal.measurement.zzcs r0 = new com.google.android.gms.internal.measurement.zzcs
            r0.<init>()
            com.google.android.gms.internal.measurement.zzfc r1 = new com.google.android.gms.internal.measurement.zzfc
            r1.<init>(r3, r4, r0)
            com.google.android.gms.internal.measurement.zzff r4 = r3.zza
            com.google.android.gms.internal.measurement.zzff.zzu(r4, r1)
            r1 = 50
            android.os.Bundle r4 = r0.zzb(r1)
            if (r4 == 0) goto L1a
            r5.putAll(r4)
        L1a:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzey r0 = new com.google.android.gms.internal.measurement.zzey
            r0.<init>(r1, r2)
            com.google.android.gms.internal.measurement.zzff r2 = r1.zza
            com.google.android.gms.internal.measurement.zzff.zzu(r2, r0)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzfb r0 = new com.google.android.gms.internal.measurement.zzfb
            r0.<init>(r1, r2)
            com.google.android.gms.internal.measurement.zzff r2 = r1.zza
            com.google.android.gms.internal.measurement.zzff.zzu(r2, r0)
            return
    }
}
