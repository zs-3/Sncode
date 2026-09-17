package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdgy extends com.google.android.gms.internal.ads.zzcte {
    private final android.content.Context zzc;
    private final java.lang.ref.WeakReference zzd;
    private final com.google.android.gms.internal.ads.zzdfe zze;
    private final com.google.android.gms.internal.ads.zzdik zzf;
    private final com.google.android.gms.internal.ads.zzctz zzg;
    private final com.google.android.gms.internal.ads.zzfrk zzh;
    private final com.google.android.gms.internal.ads.zzcyn zzi;
    private final com.google.android.gms.internal.ads.zzcah zzj;
    private boolean zzk;

    zzdgy(com.google.android.gms.internal.ads.zzctd r1, android.content.Context r2, com.google.android.gms.internal.ads.zzcfo r3, com.google.android.gms.internal.ads.zzdfe r4, com.google.android.gms.internal.ads.zzdik r5, com.google.android.gms.internal.ads.zzctz r6, com.google.android.gms.internal.ads.zzfrk r7, com.google.android.gms.internal.ads.zzcyn r8, com.google.android.gms.internal.ads.zzcah r9) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.zzk = r1
            r0.zzc = r2
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r0.zzd = r1
            r0.zze = r4
            r0.zzf = r5
            r0.zzg = r6
            r0.zzh = r7
            r0.zzi = r8
            r0.zzj = r9
            return
    }

    public final void finalize() throws java.lang.Throwable {
            r3 = this;
            java.lang.ref.WeakReference r0 = r3.zzd     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L34
            com.google.android.gms.internal.ads.zzcfo r0 = (com.google.android.gms.internal.ads.zzcfo) r0     // Catch: java.lang.Throwable -> L34
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzgw     // Catch: java.lang.Throwable -> L34
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L34
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L34
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L34
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L2b
            boolean r1 = r3.zzk     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L30
            if (r0 == 0) goto L30
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzcan.zze     // Catch: java.lang.Throwable -> L34
            com.google.android.gms.internal.ads.zzdgx r2 = new com.google.android.gms.internal.ads.zzdgx     // Catch: java.lang.Throwable -> L34
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L34
            r1.execute(r2)     // Catch: java.lang.Throwable -> L34
            goto L30
        L2b:
            if (r0 == 0) goto L30
            r0.destroy()     // Catch: java.lang.Throwable -> L34
        L30:
            super.finalize()
            return
        L34:
            r0 = move-exception
            super.finalize()
            throw r0
    }

    public final boolean zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzctz r0 = r1.zzg
            boolean r0 = r0.zzg()
            return r0
    }

    public final boolean zzc(boolean r5, android.app.Activity r6) {
            r4 = this;
            com.google.android.gms.internal.ads.zzdfe r0 = r4.zze
            r0.zzb()
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzaG
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L4e
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r0 = r4.zzc
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzG(r0)
            if (r0 == 0) goto L4e
            java.lang.String r5 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r5)
            com.google.android.gms.internal.ads.zzcyn r5 = r4.zzi
            r5.zzb()
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzaH
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r6.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto Lc4
            com.google.android.gms.internal.ads.zzfrk r5 = r4.zzh
            com.google.android.gms.internal.ads.zzfgt r6 = r4.zza
            com.google.android.gms.internal.ads.zzfgs r6 = r6.zzb
            com.google.android.gms.internal.ads.zzfgk r6 = r6.zzb
            java.lang.String r6 = r6.zzb
            r5.zza(r6)
            goto Lc4
        L4e:
            java.lang.ref.WeakReference r0 = r4.zzd
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.ads.zzcfo r0 = (com.google.android.gms.internal.ads.zzcfo) r0
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzlw
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 0
            if (r2 == 0) goto L92
            if (r0 == 0) goto L92
            com.google.android.gms.internal.ads.zzfgh r0 = r0.zzD()
            if (r0 == 0) goto L92
            boolean r2 = r0.zzar
            if (r2 == 0) goto L92
            int r0 = r0.zzas
            com.google.android.gms.internal.ads.zzcah r2 = r4.zzj
            int r2 = r2.zzb()
            if (r0 == r2) goto L92
            java.lang.String r5 = "The interstitial consent form has been shown."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r5)
            com.google.android.gms.internal.ads.zzcyn r5 = r4.zzi
            r6 = 12
            java.lang.String r0 = "The consent form has already been shown."
            com.google.android.gms.ads.internal.client.zze r6 = com.google.android.gms.internal.ads.zzfie.zzd(r6, r0, r3)
            r5.zza(r6)
            goto Lc4
        L92:
            boolean r0 = r4.zzk
            if (r0 == 0) goto La6
            java.lang.String r0 = "The interstitial ad has been shown."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            com.google.android.gms.internal.ads.zzcyn r0 = r4.zzi
            r2 = 10
            com.google.android.gms.ads.internal.client.zze r2 = com.google.android.gms.internal.ads.zzfie.zzd(r2, r3, r3)
            r0.zza(r2)
        La6:
            boolean r0 = r4.zzk
            if (r0 != 0) goto Lc4
            if (r6 != 0) goto Lae
            android.content.Context r6 = r4.zzc
        Lae:
            com.google.android.gms.internal.ads.zzdik r0 = r4.zzf     // Catch: com.google.android.gms.internal.ads.zzdij -> Lbe
            com.google.android.gms.internal.ads.zzcyn r2 = r4.zzi     // Catch: com.google.android.gms.internal.ads.zzdij -> Lbe
            r0.zza(r5, r6, r2)     // Catch: com.google.android.gms.internal.ads.zzdij -> Lbe
            com.google.android.gms.internal.ads.zzdfe r5 = r4.zze     // Catch: com.google.android.gms.internal.ads.zzdij -> Lbe
            r5.zza()     // Catch: com.google.android.gms.internal.ads.zzdij -> Lbe
            r5 = 1
            r4.zzk = r5
            return r5
        Lbe:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzcyn r6 = r4.zzi
            r6.zzc(r5)
        Lc4:
            return r1
    }
}
