package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzazc implements com.google.android.gms.internal.ads.zzazh {
    final /* synthetic */ android.app.Activity zza;

    zzazc(com.google.android.gms.internal.ads.zzazi r1, android.app.Activity r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzazh
    public final void zza(android.app.Application.ActivityLifecycleCallbacks r2) {
            r1 = this;
            android.app.Activity r0 = r1.zza
            r2.onActivityResumed(r0)
            return
    }
}
