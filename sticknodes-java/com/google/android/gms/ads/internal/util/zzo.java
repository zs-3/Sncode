package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzo implements com.google.android.gms.internal.ads.zzbdr {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbds zza;
    final /* synthetic */ android.content.Context zzb;
    final /* synthetic */ android.net.Uri zzc;

    zzo(com.google.android.gms.ads.internal.util.zzt r1, com.google.android.gms.internal.ads.zzbds r2, android.content.Context r3, android.net.Uri r4) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbdr
    public final void zza() {
            r3 = this;
            com.google.android.gms.internal.ads.zzbds r0 = r3.zza
            androidx.browser.customtabs.CustomTabsSession r0 = r0.zza()
            androidx.browser.customtabs.CustomTabsIntent$Builder r1 = new androidx.browser.customtabs.CustomTabsIntent$Builder
            r1.<init>(r0)
            androidx.browser.customtabs.CustomTabsIntent r0 = r1.build()
            android.content.Intent r1 = r0.intent
            android.content.Context r2 = r3.zzb
            java.lang.String r2 = com.google.android.gms.internal.ads.zzhjb.zza(r2)
            r1.setPackage(r2)
            android.content.Context r1 = r3.zzb
            android.net.Uri r2 = r3.zzc
            r0.launchUrl(r1, r2)
            android.content.Context r0 = r3.zzb
            com.google.android.gms.internal.ads.zzbds r1 = r3.zza
            android.app.Activity r0 = (android.app.Activity) r0
            r1.zzf(r0)
            return
    }
}
