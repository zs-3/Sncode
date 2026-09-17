package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzehz implements com.google.android.gms.internal.ads.zzegk {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdic zzb;
    private final java.util.concurrent.Executor zzc;
    private final com.google.android.gms.internal.ads.zzfgg zzd;

    public zzehz(android.content.Context r1, java.util.concurrent.Executor r2, com.google.android.gms.internal.ads.zzdic r3, com.google.android.gms.internal.ads.zzfgg r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r3
            r0.zzc = r2
            r0.zzd = r4
            return
    }

    private static java.lang.String zzd(com.google.android.gms.internal.ads.zzfgh r1) {
            org.json.JSONObject r1 = r1.zzv     // Catch: java.lang.Exception -> L9
            java.lang.String r0 = "tab_url"
            java.lang.String r1 = r1.getString(r0)     // Catch: java.lang.Exception -> L9
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzfgt r4, com.google.android.gms.internal.ads.zzfgh r5) {
            r3 = this;
            java.lang.String r0 = zzd(r5)
            r1 = 0
            if (r0 == 0) goto Lc
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto Ld
        Lc:
            r0 = r1
        Ld:
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgfo.zzh(r1)
            com.google.android.gms.internal.ads.zzehx r2 = new com.google.android.gms.internal.ads.zzehx
            r2.<init>(r3, r0, r4, r5)
            java.util.concurrent.Executor r4 = r3.zzc
            com.google.common.util.concurrent.ListenableFuture r4 = com.google.android.gms.internal.ads.zzgfo.zzn(r1, r2, r4)
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(com.google.android.gms.internal.ads.zzfgt r2, com.google.android.gms.internal.ads.zzfgh r3) {
            r1 = this;
            android.content.Context r2 = r1.zza
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L18
            boolean r2 = com.google.android.gms.internal.ads.zzbds.zzg(r2)
            if (r2 == 0) goto L18
            java.lang.String r2 = zzd(r3)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L18
            r2 = 1
            return r2
        L18:
            r2 = 0
            return r2
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(android.net.Uri r10, com.google.android.gms.internal.ads.zzfgt r11, com.google.android.gms.internal.ads.zzfgh r12, java.lang.Object r13) throws java.lang.Exception {
            r9 = this;
            androidx.browser.customtabs.CustomTabsIntent$Builder r13 = new androidx.browser.customtabs.CustomTabsIntent$Builder     // Catch: java.lang.Throwable -> L55
            r13.<init>()     // Catch: java.lang.Throwable -> L55
            androidx.browser.customtabs.CustomTabsIntent r13 = r13.build()     // Catch: java.lang.Throwable -> L55
            android.content.Intent r0 = r13.intent     // Catch: java.lang.Throwable -> L55
            r0.setData(r10)     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.ads.internal.overlay.zzc r2 = new com.google.android.gms.ads.internal.overlay.zzc     // Catch: java.lang.Throwable -> L55
            android.content.Intent r10 = r13.intent     // Catch: java.lang.Throwable -> L55
            r13 = 0
            r2.<init>(r10, r13)     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.internal.ads.zzcas r10 = new com.google.android.gms.internal.ads.zzcas     // Catch: java.lang.Throwable -> L55
            r10.<init>()     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.internal.ads.zzdic r0 = r9.zzb     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.internal.ads.zzctu r1 = new com.google.android.gms.internal.ads.zzctu     // Catch: java.lang.Throwable -> L55
            r1.<init>(r11, r12, r13)     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.internal.ads.zzdhc r11 = new com.google.android.gms.internal.ads.zzdhc     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.internal.ads.zzehy r12 = new com.google.android.gms.internal.ads.zzehy     // Catch: java.lang.Throwable -> L55
            r12.<init>(r10)     // Catch: java.lang.Throwable -> L55
            r11.<init>(r12, r13)     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.internal.ads.zzdgz r11 = r0.zze(r1, r11)     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r12 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel     // Catch: java.lang.Throwable -> L55
            r3 = 0
            com.google.android.gms.internal.ads.zzdag r4 = r11.zza()     // Catch: java.lang.Throwable -> L55
            r5 = 0
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r6 = new com.google.android.gms.ads.internal.util.client.VersionInfoParcel     // Catch: java.lang.Throwable -> L55
            r13 = 0
            r6.<init>(r13, r13, r13)     // Catch: java.lang.Throwable -> L55
            r7 = 0
            r8 = 0
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L55
            r10.zzc(r12)     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.internal.ads.zzfgg r10 = r9.zzd     // Catch: java.lang.Throwable -> L55
            r10.zza()     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.internal.ads.zzdgy r10 = r11.zzg()     // Catch: java.lang.Throwable -> L55
            com.google.common.util.concurrent.ListenableFuture r10 = com.google.android.gms.internal.ads.zzgfo.zzh(r10)     // Catch: java.lang.Throwable -> L55
            return r10
        L55:
            r10 = move-exception
            java.lang.String r11 = "Error in CustomTabsAdRenderer"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r11, r10)
            throw r10
    }
}
