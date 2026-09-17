package com.google.android.gms.ads.h5;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class H5AdsRequestHandler {
    private final com.google.android.gms.internal.ads.zzblc zza;

    public H5AdsRequestHandler(android.content.Context r2, com.google.android.gms.ads.h5.OnH5AdsEventListener r3) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzblc r0 = new com.google.android.gms.internal.ads.zzblc
            r0.<init>(r2, r3)
            r1.zza = r0
            return
    }

    public void clearAdObjects() {
            r1 = this;
            com.google.android.gms.internal.ads.zzblc r0 = r1.zza
            r0.zza()
            return
    }

    public boolean handleH5AdsRequest(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzblc r0 = r1.zza
            boolean r2 = r0.zzb(r2)
            return r2
    }

    public boolean shouldInterceptRequest(java.lang.String r1) {
            r0 = this;
            boolean r1 = com.google.android.gms.internal.ads.zzblc.zzc(r1)
            return r1
    }
}
