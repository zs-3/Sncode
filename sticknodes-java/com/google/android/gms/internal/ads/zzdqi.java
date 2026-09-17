package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdqi extends com.google.android.gms.internal.ads.zzcte {
    private final android.content.Context zzc;
    private final java.lang.ref.WeakReference zzd;
    private final com.google.android.gms.internal.ads.zzdik zze;
    private final com.google.android.gms.internal.ads.zzdfe zzf;
    private final com.google.android.gms.internal.ads.zzcyn zzg;
    private final com.google.android.gms.internal.ads.zzczu zzh;
    private final com.google.android.gms.internal.ads.zzctz zzi;
    private final com.google.android.gms.internal.ads.zzbxc zzj;
    private final com.google.android.gms.internal.ads.zzfrk zzk;
    private final com.google.android.gms.internal.ads.zzfgv zzl;
    private boolean zzm;

    zzdqi(com.google.android.gms.internal.ads.zzctd r1, android.content.Context r2, com.google.android.gms.internal.ads.zzcfo r3, com.google.android.gms.internal.ads.zzdik r4, com.google.android.gms.internal.ads.zzdfe r5, com.google.android.gms.internal.ads.zzcyn r6, com.google.android.gms.internal.ads.zzczu r7, com.google.android.gms.internal.ads.zzctz r8, com.google.android.gms.internal.ads.zzfgh r9, com.google.android.gms.internal.ads.zzfrk r10, com.google.android.gms.internal.ads.zzfgv r11) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.zzm = r1
            r0.zzc = r2
            r0.zze = r4
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r0.zzd = r1
            r0.zzf = r5
            r0.zzg = r6
            r0.zzh = r7
            r0.zzi = r8
            r0.zzk = r10
            com.google.android.gms.internal.ads.zzbxw r1 = new com.google.android.gms.internal.ads.zzbxw
            com.google.android.gms.internal.ads.zzbwy r2 = r9.zzl
            if (r2 == 0) goto L24
            java.lang.String r3 = r2.zza
            goto L26
        L24:
            java.lang.String r3 = ""
        L26:
            if (r2 == 0) goto L2b
            int r2 = r2.zzb
            goto L2c
        L2b:
            r2 = 1
        L2c:
            r1.<init>(r3, r2)
            r0.zzj = r1
            r0.zzl = r11
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
            boolean r1 = r3.zzm     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L30
            if (r0 == 0) goto L30
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzcan.zze     // Catch: java.lang.Throwable -> L34
            com.google.android.gms.internal.ads.zzdqh r2 = new com.google.android.gms.internal.ads.zzdqh     // Catch: java.lang.Throwable -> L34
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

    public final android.os.Bundle zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzczu r0 = r1.zzh
            android.os.Bundle r0 = r0.zzb()
            return r0
    }

    public final com.google.android.gms.internal.ads.zzbxc zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbxc r0 = r1.zzj
            return r0
    }

    public final com.google.android.gms.internal.ads.zzfgv zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfgv r0 = r1.zzl
            return r0
    }

    public final boolean zze() {
            r1 = this;
            com.google.android.gms.internal.ads.zzctz r0 = r1.zzi
            boolean r0 = r0.zzg()
            return r0
    }

    public final boolean zzf() {
            r1 = this;
            boolean r0 = r1.zzm
            return r0
    }

    public final boolean zzg() {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.zzd
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.ads.zzcfo r0 = (com.google.android.gms.internal.ads.zzcfo) r0
            if (r0 == 0) goto L12
            boolean r0 = r0.zzaG()
            if (r0 != 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public final boolean zzh(boolean r5, android.app.Activity r6) {
            r4 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzaG
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L48
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r0 = r4.zzc
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzG(r0)
            if (r0 == 0) goto L48
            java.lang.String r5 = "Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r5)
            com.google.android.gms.internal.ads.zzcyn r5 = r4.zzg
            r5.zzb()
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzaH
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r6.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L47
            com.google.android.gms.internal.ads.zzfrk r5 = r4.zzk
            com.google.android.gms.internal.ads.zzfgt r6 = r4.zza
            com.google.android.gms.internal.ads.zzfgs r6 = r6.zzb
            com.google.android.gms.internal.ads.zzfgk r6 = r6.zzb
            java.lang.String r6 = r6.zzb
            r5.zza(r6)
        L47:
            return r1
        L48:
            boolean r0 = r4.zzm
            if (r0 == 0) goto L5e
            java.lang.String r5 = "The rewarded ad have been showed."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r5)
            com.google.android.gms.internal.ads.zzcyn r5 = r4.zzg
            r6 = 10
            r0 = 0
            com.google.android.gms.ads.internal.client.zze r6 = com.google.android.gms.internal.ads.zzfie.zzd(r6, r0, r0)
            r5.zza(r6)
            return r1
        L5e:
            r0 = 1
            r4.zzm = r0
            com.google.android.gms.internal.ads.zzdfe r2 = r4.zzf
            r2.zzb()
            if (r6 != 0) goto L6a
            android.content.Context r6 = r4.zzc
        L6a:
            com.google.android.gms.internal.ads.zzdik r2 = r4.zze     // Catch: com.google.android.gms.internal.ads.zzdij -> L77
            com.google.android.gms.internal.ads.zzcyn r3 = r4.zzg     // Catch: com.google.android.gms.internal.ads.zzdij -> L77
            r2.zza(r5, r6, r3)     // Catch: com.google.android.gms.internal.ads.zzdij -> L77
            com.google.android.gms.internal.ads.zzdfe r5 = r4.zzf     // Catch: com.google.android.gms.internal.ads.zzdij -> L77
            r5.zza()     // Catch: com.google.android.gms.internal.ads.zzdij -> L77
            return r0
        L77:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzcyn r6 = r4.zzg
            r6.zzc(r5)
            return r1
    }
}
