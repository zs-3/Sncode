package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbks extends com.google.android.gms.internal.ads.zzbku {
    private final com.google.android.gms.ads.h5.OnH5AdsEventListener zza;

    public zzbks(com.google.android.gms.ads.h5.OnH5AdsEventListener r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbkv
    public final void zzb(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.ads.h5.OnH5AdsEventListener r0 = r1.zza
            r0.onH5AdsEvent(r2)
            return
    }
}
