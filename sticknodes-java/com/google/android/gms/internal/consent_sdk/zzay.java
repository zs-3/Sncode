package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
final class zzay implements android.app.Application.ActivityLifecycleCallbacks {
    final /* synthetic */ com.google.android.gms.internal.consent_sdk.zzbb zza;
    private final android.app.Activity zzb;

    public zzay(com.google.android.gms.internal.consent_sdk.zzbb r1, android.app.Activity r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            return
    }

    static /* bridge */ /* synthetic */ void zza(com.google.android.gms.internal.consent_sdk.zzay r0) {
            r0.zzb()
            return
    }

    private final void zzb() {
            r1 = this;
            com.google.android.gms.internal.consent_sdk.zzbb r0 = r1.zza
            android.app.Application r0 = com.google.android.gms.internal.consent_sdk.zzbb.zza(r0)
            r0.unregisterActivityLifecycleCallbacks(r1)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity r2, android.os.Bundle r3) {
            r1 = this;
            com.google.android.gms.internal.consent_sdk.zzbb r3 = r1.zza
            android.app.Dialog r0 = com.google.android.gms.internal.consent_sdk.zzbb.zzb(r3)
            if (r0 == 0) goto L5a
            boolean r0 = r3.zza
            if (r0 == 0) goto L5a
            android.app.Dialog r3 = com.google.android.gms.internal.consent_sdk.zzbb.zzb(r3)
            r3.setOwnerActivity(r2)
            com.google.android.gms.internal.consent_sdk.zzbb r3 = r1.zza
            com.google.android.gms.internal.consent_sdk.zzbw r0 = com.google.android.gms.internal.consent_sdk.zzbb.zzd(r3)
            if (r0 == 0) goto L22
            com.google.android.gms.internal.consent_sdk.zzbw r3 = com.google.android.gms.internal.consent_sdk.zzbb.zzd(r3)
            r3.zza(r2)
        L22:
            com.google.android.gms.internal.consent_sdk.zzbb r3 = r1.zza
            java.util.concurrent.atomic.AtomicReference r3 = com.google.android.gms.internal.consent_sdk.zzbb.zze(r3)
            r0 = 0
            java.lang.Object r3 = r3.getAndSet(r0)
            com.google.android.gms.internal.consent_sdk.zzay r3 = (com.google.android.gms.internal.consent_sdk.zzay) r3
            if (r3 == 0) goto L4b
            r3.zzb()
            com.google.android.gms.internal.consent_sdk.zzbb r3 = r1.zza
            com.google.android.gms.internal.consent_sdk.zzay r0 = new com.google.android.gms.internal.consent_sdk.zzay
            r0.<init>(r3, r2)
            android.app.Application r2 = com.google.android.gms.internal.consent_sdk.zzbb.zza(r3)
            r2.registerActivityLifecycleCallbacks(r0)
            com.google.android.gms.internal.consent_sdk.zzbb r2 = r1.zza
            java.util.concurrent.atomic.AtomicReference r2 = com.google.android.gms.internal.consent_sdk.zzbb.zze(r2)
            r2.set(r0)
        L4b:
            com.google.android.gms.internal.consent_sdk.zzbb r2 = r1.zza
            android.app.Dialog r3 = com.google.android.gms.internal.consent_sdk.zzbb.zzb(r2)
            if (r3 == 0) goto L5a
            android.app.Dialog r2 = com.google.android.gms.internal.consent_sdk.zzbb.zzb(r2)
            r2.show()
        L5a:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity r4) {
            r3 = this;
            android.app.Activity r0 = r3.zzb
            if (r4 == r0) goto L5
            return
        L5:
            boolean r4 = r4.isChangingConfigurations()
            if (r4 == 0) goto L1f
            com.google.android.gms.internal.consent_sdk.zzbb r4 = r3.zza
            boolean r0 = r4.zza
            if (r0 == 0) goto L1f
            android.app.Dialog r0 = com.google.android.gms.internal.consent_sdk.zzbb.zzb(r4)
            if (r0 == 0) goto L1f
            android.app.Dialog r4 = com.google.android.gms.internal.consent_sdk.zzbb.zzb(r4)
            r4.dismiss()
            return
        L1f:
            com.google.android.gms.internal.consent_sdk.zzbb r4 = r3.zza
            com.google.android.gms.internal.consent_sdk.zzg r0 = new com.google.android.gms.internal.consent_sdk.zzg
            r1 = 3
            java.lang.String r2 = "Activity is destroyed."
            r0.<init>(r1, r2)
            r4.zzh(r0)
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
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity r1) {
            r0 = this;
            return
    }
}
