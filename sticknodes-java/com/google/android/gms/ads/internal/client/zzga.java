package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzga extends com.google.android.gms.ads.internal.client.zzed {
    private final com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks zza;

    public zzga(com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zze() {
            r1 = this;
            com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks r0 = r1.zza
            r0.onVideoEnd()
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzf(boolean r2) {
            r1 = this;
            com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks r0 = r1.zza
            r0.onVideoMute(r2)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzg() {
            r1 = this;
            com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks r0 = r1.zza
            r0.onVideoPause()
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzh() {
            r1 = this;
            com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks r0 = r1.zza
            r0.onVideoPlay()
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzi() {
            r1 = this;
            com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks r0 = r1.zza
            r0.onVideoStart()
            return
    }
}
