package com.google.android.gms.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public class MediationConfiguration {
    public static final java.lang.String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";
    private final com.google.android.gms.ads.AdFormat zza;
    private final android.os.Bundle zzb;

    public MediationConfiguration(com.google.android.gms.ads.AdFormat r1, android.os.Bundle r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public com.google.android.gms.ads.AdFormat getFormat() {
            r1 = this;
            com.google.android.gms.ads.AdFormat r0 = r1.zza
            return r0
    }

    public android.os.Bundle getServerParameters() {
            r1 = this;
            android.os.Bundle r0 = r1.zzb
            return r0
    }
}
