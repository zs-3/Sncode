package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdvb implements com.google.android.gms.ads.admanager.AppEventListener, com.google.android.gms.internal.ads.zzday, com.google.android.gms.ads.internal.client.zza, com.google.android.gms.internal.ads.zzcya, com.google.android.gms.internal.ads.zzcyu, com.google.android.gms.internal.ads.zzcyv, com.google.android.gms.internal.ads.zzczo, com.google.android.gms.internal.ads.zzcyd, com.google.android.gms.internal.ads.zzflh {
    private final java.util.List zza;
    private final com.google.android.gms.internal.ads.zzdup zzb;
    private long zzc;

    public zzdvb(com.google.android.gms.internal.ads.zzdup r1, com.google.android.gms.internal.ads.zzcho r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            java.util.List r1 = java.util.Collections.singletonList(r2)
            r0.zza = r1
            return
    }

    private final void zzg(java.lang.Class r4, java.lang.String r5, java.lang.Object... r6) {
            r3 = this;
            java.lang.String r4 = r4.getSimpleName()
            com.google.android.gms.internal.ads.zzdup r0 = r3.zzb
            java.util.List r1 = r3.zza
            java.lang.String r2 = "Event-"
            java.lang.String r4 = r2.concat(r4)
            r0.zza(r1, r4, r5, r6)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
            r3 = this;
            java.lang.Class<com.google.android.gms.ads.internal.client.zza> r0 = com.google.android.gms.ads.internal.client.zza.class
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "onAdClicked"
            r3.zzg(r0, r2, r1)
            return
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            java.lang.Class<com.google.android.gms.ads.admanager.AppEventListener> r3 = com.google.android.gms.ads.admanager.AppEventListener.class
            java.lang.String r4 = "onAppEvent"
            r2.zzg(r3, r4, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zza() {
            r3 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzcya> r0 = com.google.android.gms.internal.ads.zzcya.class
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "onAdClosed"
            r3.zzg(r0, r2, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzb() {
            r3 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzcya> r0 = com.google.android.gms.internal.ads.zzcya.class
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "onAdLeftApplication"
            r3.zzg(r0, r2, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzc() {
            r3 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzcya> r0 = com.google.android.gms.internal.ads.zzcya.class
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "onAdOpened"
            r3.zzg(r0, r2, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzflh
    public final void zzd(com.google.android.gms.internal.ads.zzfla r2, java.lang.String r3) {
            r1 = this;
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0 = 0
            r2[r0] = r3
            java.lang.Class<com.google.android.gms.internal.ads.zzfkz> r3 = com.google.android.gms.internal.ads.zzfkz.class
            java.lang.String r0 = "onTaskSucceeded"
            r1.zzg(r3, r0, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzdB(com.google.android.gms.ads.internal.client.zze r4) {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r4.zza
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r4.zzb
            r2 = 1
            r0[r2] = r1
            java.lang.String r4 = r4.zzc
            r1 = 2
            r0[r1] = r4
            java.lang.Class<com.google.android.gms.internal.ads.zzcyd> r4 = com.google.android.gms.internal.ads.zzcyd.class
            java.lang.String r1 = "onAdFailedToLoad"
            r3.zzg(r4, r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzflh
    public final void zzdC(com.google.android.gms.internal.ads.zzfla r2, java.lang.String r3) {
            r1 = this;
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0 = 0
            r2[r0] = r3
            java.lang.Class<com.google.android.gms.internal.ads.zzfkz> r3 = com.google.android.gms.internal.ads.zzfkz.class
            java.lang.String r0 = "onTaskCreated"
            r1.zzg(r3, r0, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzflh
    public final void zzdD(com.google.android.gms.internal.ads.zzfla r2, java.lang.String r3, java.lang.Throwable r4) {
            r1 = this;
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0 = 0
            r2[r0] = r3
            java.lang.Class r3 = r4.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r4 = 1
            r2[r4] = r3
            java.lang.Class<com.google.android.gms.internal.ads.zzfkz> r3 = com.google.android.gms.internal.ads.zzfkz.class
            java.lang.String r4 = "onTaskFailed"
            r1.zzg(r3, r4, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzflh
    public final void zzdE(com.google.android.gms.internal.ads.zzfla r2, java.lang.String r3) {
            r1 = this;
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0 = 0
            r2[r0] = r3
            java.lang.Class<com.google.android.gms.internal.ads.zzfkz> r3 = com.google.android.gms.internal.ads.zzfkz.class
            java.lang.String r0 = "onTaskStarted"
            r1.zzg(r3, r0, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void zzdj(android.content.Context r3) {
            r2 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.Class<com.google.android.gms.internal.ads.zzcyv> r3 = com.google.android.gms.internal.ads.zzcyv.class
            java.lang.String r1 = "onDestroy"
            r2.zzg(r3, r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void zzdl(android.content.Context r3) {
            r2 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.Class<com.google.android.gms.internal.ads.zzcyv> r3 = com.google.android.gms.internal.ads.zzcyv.class
            java.lang.String r1 = "onPause"
            r2.zzg(r3, r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyv
    public final void zzdm(android.content.Context r3) {
            r2 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.Class<com.google.android.gms.internal.ads.zzcyv> r3 = com.google.android.gms.internal.ads.zzcyv.class
            java.lang.String r1 = "onResume"
            r2.zzg(r3, r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final void zzdn(com.google.android.gms.internal.ads.zzbwa r3) {
            r2 = this;
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzu.zzB()
            long r0 = r3.elapsedRealtime()
            r2.zzc = r0
            java.lang.Class<com.google.android.gms.internal.ads.zzday> r3 = com.google.android.gms.internal.ads.zzday.class
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "onAdRequest"
            r2.zzg(r3, r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final void zzdo(com.google.android.gms.internal.ads.zzfgt r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzds(com.google.android.gms.internal.ads.zzbwm r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            java.lang.Class<com.google.android.gms.internal.ads.zzcya> r3 = com.google.android.gms.internal.ads.zzcya.class
            java.lang.String r4 = "onRewarded"
            r2.zzg(r3, r4, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zze() {
            r3 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzcya> r0 = com.google.android.gms.internal.ads.zzcya.class
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "onRewardedVideoCompleted"
            r3.zzg(r0, r2, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzf() {
            r3 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzcya> r0 = com.google.android.gms.internal.ads.zzcya.class
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "onRewardedVideoStarted"
            r3.zzg(r0, r2, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final void zzr() {
            r3 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzcyu> r0 = com.google.android.gms.internal.ads.zzcyu.class
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "onAdImpression"
            r3.zzg(r0, r2, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzs() {
            r4 = this;
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r0 = r0.elapsedRealtime()
            long r2 = r4.zzc
            long r0 = r0 - r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Ad Request Latency : "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            java.lang.Class<com.google.android.gms.internal.ads.zzczo> r0 = com.google.android.gms.internal.ads.zzczo.class
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "onAdLoaded"
            r4.zzg(r0, r2, r1)
            return
    }
}
