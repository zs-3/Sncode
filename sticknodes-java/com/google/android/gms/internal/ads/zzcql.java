package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcql extends com.google.android.gms.internal.ads.zzcte {
    private final com.google.android.gms.internal.ads.zzcfo zzc;
    private final int zzd;
    private final android.content.Context zze;
    private final com.google.android.gms.internal.ads.zzcpz zzf;
    private final com.google.android.gms.internal.ads.zzdik zzg;
    private final com.google.android.gms.internal.ads.zzdfe zzh;
    private final com.google.android.gms.internal.ads.zzcyn zzi;
    private final boolean zzj;
    private final com.google.android.gms.internal.ads.zzcah zzk;
    private boolean zzl;

    zzcql(com.google.android.gms.internal.ads.zzctd r1, android.content.Context r2, com.google.android.gms.internal.ads.zzcfo r3, int r4, com.google.android.gms.internal.ads.zzcpz r5, com.google.android.gms.internal.ads.zzdik r6, com.google.android.gms.internal.ads.zzdfe r7, com.google.android.gms.internal.ads.zzcyn r8, com.google.android.gms.internal.ads.zzcah r9) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.zzl = r1
            r0.zzc = r3
            r0.zze = r2
            r0.zzd = r4
            r0.zzf = r5
            r0.zzg = r6
            r0.zzh = r7
            r0.zzi = r8
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzfi
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.zzj = r1
            r0.zzk = r9
            return
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcte
    public final void zzb() {
            r1 = this;
            super.zzb()
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zzc
            if (r0 == 0) goto La
            r0.destroy()
        La:
            return
    }

    public final void zzc(com.google.android.gms.internal.ads.zzbai r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zzc
            if (r0 == 0) goto L7
            r0.zzak(r2)
        L7:
            return
    }

    public final void zzd(android.app.Activity r3, com.google.android.gms.internal.ads.zzbav r4, boolean r5) throws android.os.RemoteException {
            r2 = this;
            if (r3 != 0) goto L4
            android.content.Context r3 = r2.zze
        L4:
            boolean r4 = r2.zzj
            if (r4 == 0) goto Ld
            com.google.android.gms.internal.ads.zzdfe r4 = r2.zzh
            r4.zzb()
        Ld:
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzaG
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r0.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L61
            com.google.android.gms.ads.internal.zzu.zzp()
            boolean r4 = com.google.android.gms.ads.internal.util.zzt.zzG(r3)
            if (r4 == 0) goto L61
            java.lang.String r4 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
            com.google.android.gms.internal.ads.zzcyn r4 = r2.zzi
            r4.zzb()
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzaH
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto Ld2
            com.google.android.gms.internal.ads.zzfrk r4 = new com.google.android.gms.internal.ads.zzfrk
            android.content.Context r3 = r3.getApplicationContext()
            com.google.android.gms.ads.internal.util.zzbt r5 = com.google.android.gms.ads.internal.zzu.zzt()
            android.os.Looper r5 = r5.zzb()
            r4.<init>(r3, r5)
            com.google.android.gms.internal.ads.zzfgt r3 = r2.zza
            com.google.android.gms.internal.ads.zzfgs r3 = r3.zzb
            com.google.android.gms.internal.ads.zzfgk r3 = r3.zzb
            java.lang.String r3 = r3.zzb
            r4.zza(r3)
            return
        L61:
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzlw
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r0.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 == 0) goto La0
            com.google.android.gms.internal.ads.zzcfo r4 = r2.zzc
            if (r4 == 0) goto La0
            com.google.android.gms.internal.ads.zzfgh r4 = r4.zzD()
            if (r4 == 0) goto La0
            boolean r1 = r4.zzar
            if (r1 == 0) goto La0
            int r4 = r4.zzas
            com.google.android.gms.internal.ads.zzcah r1 = r2.zzk
            int r1 = r1.zzb()
            if (r4 != r1) goto L8d
            goto La0
        L8d:
            java.lang.String r3 = "The app open consent form has been shown."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r3)
            com.google.android.gms.internal.ads.zzcyn r3 = r2.zzi
            r4 = 12
            java.lang.String r5 = "The consent form has already been shown."
            com.google.android.gms.ads.internal.client.zze r4 = com.google.android.gms.internal.ads.zzfie.zzd(r4, r5, r0)
            r3.zza(r4)
            return
        La0:
            boolean r4 = r2.zzl
            if (r4 == 0) goto Lb4
            java.lang.String r4 = "App open interstitial ad is already visible."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
            com.google.android.gms.internal.ads.zzcyn r4 = r2.zzi
            r1 = 10
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfie.zzd(r1, r0, r0)
            r4.zza(r0)
        Lb4:
            boolean r4 = r2.zzl
            if (r4 != 0) goto Ld2
            com.google.android.gms.internal.ads.zzdik r4 = r2.zzg     // Catch: com.google.android.gms.internal.ads.zzdij -> Lcc
            com.google.android.gms.internal.ads.zzcyn r0 = r2.zzi     // Catch: com.google.android.gms.internal.ads.zzdij -> Lcc
            r4.zza(r5, r3, r0)     // Catch: com.google.android.gms.internal.ads.zzdij -> Lcc
            boolean r3 = r2.zzj     // Catch: com.google.android.gms.internal.ads.zzdij -> Lcc
            if (r3 == 0) goto Lc8
            com.google.android.gms.internal.ads.zzdfe r3 = r2.zzh     // Catch: com.google.android.gms.internal.ads.zzdij -> Lcc
            r3.zza()     // Catch: com.google.android.gms.internal.ads.zzdij -> Lcc
        Lc8:
            r3 = 1
            r2.zzl = r3
            return
        Lcc:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzcyn r4 = r2.zzi
            r4.zzc(r3)
        Ld2:
            return
    }

    public final void zze(long r2, int r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcpz r0 = r1.zzf
            r0.zza(r2, r4)
            return
    }
}
