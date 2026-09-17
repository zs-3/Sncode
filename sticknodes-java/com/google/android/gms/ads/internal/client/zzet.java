package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzet implements com.google.android.gms.ads.initialization.AdapterStatus {
    zzet(com.google.android.gms.ads.internal.client.zzey r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = "Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time."
            return r0
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final com.google.android.gms.ads.initialization.AdapterStatus.State getInitializationState() {
            r1 = this;
            com.google.android.gms.ads.initialization.AdapterStatus$State r0 = com.google.android.gms.ads.initialization.AdapterStatus.State.READY
            return r0
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final int getLatency() {
            r1 = this;
            r0 = 0
            return r0
    }
}
