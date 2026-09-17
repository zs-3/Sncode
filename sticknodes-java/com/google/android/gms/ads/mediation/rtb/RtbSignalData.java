package com.google.android.gms.ads.mediation.rtb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public class RtbSignalData {
    private final android.content.Context zza;
    private final java.util.List zzb;
    private final android.os.Bundle zzc;
    private final com.google.android.gms.ads.AdSize zzd;

    public RtbSignalData(android.content.Context r1, java.util.List<com.google.android.gms.ads.mediation.MediationConfiguration> r2, android.os.Bundle r3, com.google.android.gms.ads.AdSize r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    public com.google.android.gms.ads.AdSize getAdSize() {
            r1 = this;
            com.google.android.gms.ads.AdSize r0 = r1.zzd
            return r0
    }

    @java.lang.Deprecated
    public com.google.android.gms.ads.mediation.MediationConfiguration getConfiguration() {
            r2 = this;
            java.util.List r0 = r2.zzb
            if (r0 == 0) goto L14
            int r0 = r0.size()
            if (r0 <= 0) goto L14
            java.util.List r0 = r2.zzb
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.ads.mediation.MediationConfiguration r0 = (com.google.android.gms.ads.mediation.MediationConfiguration) r0
            return r0
        L14:
            r0 = 0
            return r0
    }

    public java.util.List<com.google.android.gms.ads.mediation.MediationConfiguration> getConfigurations() {
            r1 = this;
            java.util.List r0 = r1.zzb
            return r0
    }

    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.zza
            return r0
    }

    public android.os.Bundle getNetworkExtras() {
            r1 = this;
            android.os.Bundle r0 = r1.zzc
            return r0
    }
}
