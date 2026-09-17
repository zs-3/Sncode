package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzavw implements com.google.android.gms.internal.ads.zzawc {
    final /* synthetic */ android.app.Activity zza;

    zzavw(com.google.android.gms.internal.ads.zzawd r1, android.app.Activity r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzawc
    public final void zza(android.app.Application.ActivityLifecycleCallbacks r2) {
            r1 = this;
            android.app.Activity r0 = r1.zza
            r2.onActivityStarted(r0)
            return
    }
}
