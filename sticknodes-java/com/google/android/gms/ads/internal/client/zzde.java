package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzde extends com.google.android.gms.ads.internal.client.zzdc {
    private final com.google.android.gms.ads.MuteThisAdListener zza;

    public zzde(com.google.android.gms.ads.MuteThisAdListener r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzdd
    public final void zze() {
            r1 = this;
            com.google.android.gms.ads.MuteThisAdListener r0 = r1.zza
            r0.onAdMuted()
            return
    }
}
