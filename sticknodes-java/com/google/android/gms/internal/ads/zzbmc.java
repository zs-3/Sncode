package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbmc implements com.google.android.gms.ads.initialization.AdapterStatus {
    private final com.google.android.gms.ads.initialization.AdapterStatus.State zza;
    private final java.lang.String zzb;
    private final int zzc;

    public zzbmc(com.google.android.gms.ads.initialization.AdapterStatus.State r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final com.google.android.gms.ads.initialization.AdapterStatus.State getInitializationState() {
            r1 = this;
            com.google.android.gms.ads.initialization.AdapterStatus$State r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final int getLatency() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }
}
