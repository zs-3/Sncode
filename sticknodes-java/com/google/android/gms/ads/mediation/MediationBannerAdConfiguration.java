package com.google.android.gms.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public class MediationBannerAdConfiguration extends com.google.android.gms.ads.mediation.MediationAdConfiguration {
    private final com.google.android.gms.ads.AdSize zza;

    public MediationBannerAdConfiguration(android.content.Context r12, java.lang.String r13, android.os.Bundle r14, android.os.Bundle r15, boolean r16, android.location.Location r17, int r18, int r19, java.lang.String r20, com.google.android.gms.ads.AdSize r21, java.lang.String r22) {
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = r21
            r0.zza = r1
            return
    }

    public com.google.android.gms.ads.AdSize getAdSize() {
            r1 = this;
            com.google.android.gms.ads.AdSize r0 = r1.zza
            return r0
    }
}
