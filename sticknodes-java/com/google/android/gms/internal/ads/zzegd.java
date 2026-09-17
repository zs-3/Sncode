package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzegd {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzb;
    private final com.google.android.gms.internal.ads.zzfgh zzc;
    private final com.google.android.gms.internal.ads.zzcfo zzd;
    private final com.google.android.gms.internal.ads.zzdud zze;
    private com.google.android.gms.internal.ads.zzfot zzf;

    zzegd(android.content.Context r1, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2, com.google.android.gms.internal.ads.zzfgh r3, com.google.android.gms.internal.ads.zzcfo r4, com.google.android.gms.internal.ads.zzdud r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            return
    }

    public final synchronized void zza(android.view.View r3) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzfot r0 = r2.zzf     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            com.google.android.gms.internal.ads.zzega r1 = com.google.android.gms.ads.internal.zzu.zzA()     // Catch: java.lang.Throwable -> L10
            r1.zzh(r0, r3)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r2)
            return
        Le:
            monitor-exit(r2)
            return
        L10:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final synchronized void zzb() {
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzfot r0 = r3.zzf     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L14
            com.google.android.gms.internal.ads.zzcfo r0 = r3.zzd     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L14
            java.lang.String r1 = "onSdkImpression"
            com.google.android.gms.internal.ads.zzgba r2 = com.google.android.gms.internal.ads.zzgba.zzd()     // Catch: java.lang.Throwable -> L16
            r0.zzd(r1, r2)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r3)
            return
        L14:
            monitor-exit(r3)
            return
        L16:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public final synchronized void zzc() {
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzfot r0 = r4.zzf     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L32
            com.google.android.gms.internal.ads.zzcfo r1 = r4.zzd     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L32
            java.util.List r1 = r1.zzV()     // Catch: java.lang.Throwable -> L34
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L34
        L11:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L34
            android.view.View r2 = (android.view.View) r2     // Catch: java.lang.Throwable -> L34
            com.google.android.gms.internal.ads.zzega r3 = com.google.android.gms.ads.internal.zzu.zzA()     // Catch: java.lang.Throwable -> L34
            r3.zzh(r0, r2)     // Catch: java.lang.Throwable -> L34
            goto L11
        L25:
            com.google.android.gms.internal.ads.zzcfo r0 = r4.zzd     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "onSdkLoaded"
            com.google.android.gms.internal.ads.zzgba r2 = com.google.android.gms.internal.ads.zzgba.zzd()     // Catch: java.lang.Throwable -> L34
            r0.zzd(r1, r2)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r4)
            return
        L32:
            monitor-exit(r4)
            return
        L34:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    public final synchronized boolean zzd() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzfot r0 = r1.zzf     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L8
            r0 = 1
        L6:
            monitor-exit(r1)
            return r0
        L8:
            r0 = 0
            goto L6
        La:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized boolean zze(boolean r6) {
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzfgh r6 = r5.zzc     // Catch: java.lang.Throwable -> Lab
            boolean r6 = r6.zzT     // Catch: java.lang.Throwable -> Lab
            r0 = 0
            if (r6 == 0) goto La9
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzeU     // Catch: java.lang.Throwable -> Lab
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r6 = r1.zza(r6)     // Catch: java.lang.Throwable -> Lab
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> Lab
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> Lab
            if (r6 == 0) goto La9
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzeX     // Catch: java.lang.Throwable -> Lab
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r6 = r1.zza(r6)     // Catch: java.lang.Throwable -> Lab
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> Lab
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> Lab
            if (r6 == 0) goto La9
            com.google.android.gms.internal.ads.zzcfo r6 = r5.zzd     // Catch: java.lang.Throwable -> Lab
            if (r6 != 0) goto L32
            goto La9
        L32:
            com.google.android.gms.internal.ads.zzfot r6 = r5.zzf     // Catch: java.lang.Throwable -> Lab
            if (r6 == 0) goto L3d
            java.lang.String r6 = "Omid javascript session service already started for ad."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r6)     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r5)
            return r0
        L3d:
            android.content.Context r6 = r5.zza     // Catch: java.lang.Throwable -> Lab
            com.google.android.gms.internal.ads.zzega r1 = com.google.android.gms.ads.internal.zzu.zzA()     // Catch: java.lang.Throwable -> Lab
            boolean r6 = r1.zzl(r6)     // Catch: java.lang.Throwable -> Lab
            if (r6 != 0) goto L50
            java.lang.String r6 = "Unable to initialize omid."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r6)     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r5)
            return r0
        L50:
            com.google.android.gms.internal.ads.zzfgh r6 = r5.zzc     // Catch: java.lang.Throwable -> Lab
            com.google.android.gms.internal.ads.zzfhf r6 = r6.zzV     // Catch: java.lang.Throwable -> Lab
            boolean r6 = r6.zzb()     // Catch: java.lang.Throwable -> Lab
            if (r6 == 0) goto La9
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r6 = r5.zzb     // Catch: java.lang.Throwable -> Lab
            com.google.android.gms.internal.ads.zzcfo r1 = r5.zzd     // Catch: java.lang.Throwable -> Lab
            com.google.android.gms.internal.ads.zzega r2 = com.google.android.gms.ads.internal.zzu.zzA()     // Catch: java.lang.Throwable -> Lab
            android.webkit.WebView r1 = r1.zzG()     // Catch: java.lang.Throwable -> Lab
            r3 = 1
            com.google.android.gms.internal.ads.zzfot r6 = r2.zze(r6, r1, r3)     // Catch: java.lang.Throwable -> Lab
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzeY     // Catch: java.lang.Throwable -> Lab
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> Lab
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> Lab
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> Lab
            if (r1 == 0) goto L92
            com.google.android.gms.internal.ads.zzdud r1 = r5.zze     // Catch: java.lang.Throwable -> Lab
            if (r6 == 0) goto L84
            java.lang.String r2 = "1"
            goto L86
        L84:
            java.lang.String r2 = "0"
        L86:
            com.google.android.gms.internal.ads.zzduc r1 = r1.zza()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r4 = "omid_js_session_success"
            r1.zzb(r4, r2)     // Catch: java.lang.Throwable -> Lab
            r1.zzf()     // Catch: java.lang.Throwable -> Lab
        L92:
            if (r6 != 0) goto L9b
            java.lang.String r6 = "Unable to create javascript session service."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r6)     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r5)
            return r0
        L9b:
            java.lang.String r0 = "Created omid javascript session service."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r0)     // Catch: java.lang.Throwable -> Lab
            r5.zzf = r6     // Catch: java.lang.Throwable -> Lab
            com.google.android.gms.internal.ads.zzcfo r6 = r5.zzd     // Catch: java.lang.Throwable -> Lab
            r6.zzas(r5)     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r5)
            return r3
        La9:
            monitor-exit(r5)
            return r0
        Lab:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    public final synchronized void zzf(com.google.android.gms.internal.ads.zzcgd r3) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzfot r0 = r2.zzf     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzcfo r1 = r2.zzd     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1a
            com.google.android.gms.internal.ads.zzega r1 = com.google.android.gms.ads.internal.zzu.zzA()     // Catch: java.lang.Throwable -> L1c
            r1.zzm(r0, r3)     // Catch: java.lang.Throwable -> L1c
            r3 = 0
            r2.zzf = r3     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zzd     // Catch: java.lang.Throwable -> L1c
            r0.zzas(r3)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)
            return
        L1a:
            monitor-exit(r2)
            return
        L1c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
