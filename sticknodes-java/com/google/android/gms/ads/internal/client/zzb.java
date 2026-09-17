package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzb extends com.google.android.gms.ads.internal.client.zzbh {
    private final com.google.android.gms.ads.internal.client.zza zza;

    public zzb(com.google.android.gms.ads.internal.client.zza r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbi
    public final void zzb() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zza r0 = r1.zza
            r0.onAdClicked()
            return
    }
}
