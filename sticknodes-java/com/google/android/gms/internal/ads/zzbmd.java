package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbmd implements com.google.android.gms.ads.initialization.InitializationStatus {
    private final java.util.Map zza;

    public zzbmd(java.util.Map r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.ads.initialization.InitializationStatus
    public final java.util.Map<java.lang.String, com.google.android.gms.ads.initialization.AdapterStatus> getAdapterStatusMap() {
            r1 = this;
            java.util.Map r0 = r1.zza
            return r0
    }
}
