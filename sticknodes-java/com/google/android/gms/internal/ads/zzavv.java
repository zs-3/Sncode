package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzavv implements com.google.android.gms.internal.ads.zzawc {
    final /* synthetic */ android.app.Activity zza;
    final /* synthetic */ android.os.Bundle zzb;

    zzavv(com.google.android.gms.internal.ads.zzawd r1, android.app.Activity r2, android.os.Bundle r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzawc
    public final void zza(android.app.Application.ActivityLifecycleCallbacks r3) {
            r2 = this;
            android.app.Activity r0 = r2.zza
            android.os.Bundle r1 = r2.zzb
            r3.onActivityCreated(r0, r1)
            return
    }
}
