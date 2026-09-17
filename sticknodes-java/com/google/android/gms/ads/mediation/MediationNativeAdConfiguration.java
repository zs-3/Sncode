package com.google.android.gms.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public class MediationNativeAdConfiguration extends com.google.android.gms.ads.mediation.MediationAdConfiguration {
    private final com.google.android.gms.internal.ads.zzbfr zza;

    public MediationNativeAdConfiguration(android.content.Context r1, java.lang.String r2, android.os.Bundle r3, android.os.Bundle r4, boolean r5, android.location.Location r6, int r7, int r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.internal.ads.zzbfr r11) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.zza = r11
            return
    }

    public com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdOptions() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbfr r0 = r1.zza
            com.google.android.gms.ads.nativead.NativeAdOptions r0 = com.google.android.gms.internal.ads.zzbfr.zza(r0)
            return r0
    }
}
