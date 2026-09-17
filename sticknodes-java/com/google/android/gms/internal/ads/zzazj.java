package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzazj extends com.google.android.gms.ads.internal.client.zzcl {
    private final com.google.android.gms.ads.admanager.AppEventListener zza;

    public zzazj(com.google.android.gms.ads.admanager.AppEventListener r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final com.google.android.gms.ads.admanager.AppEventListener zzb() {
            r1 = this;
            com.google.android.gms.ads.admanager.AppEventListener r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzc(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.google.android.gms.ads.admanager.AppEventListener r0 = r1.zza
            r0.onAppEvent(r2, r3)
            return
    }
}
