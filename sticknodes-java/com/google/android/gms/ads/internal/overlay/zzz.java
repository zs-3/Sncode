package com.google.android.gms.ads.internal.overlay;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzz {
    private java.lang.String zza;
    private java.lang.String zzb;
    private com.google.android.gms.internal.ads.zzcfo zzc;
    private com.google.android.gms.internal.ads.zzfvt zzd;
    private boolean zze;
    private com.google.android.gms.internal.ads.zzfwq zzf;

    public zzz() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zzc = r0
            r1 = 0
            r2.zze = r1
            r2.zza = r0
            r2.zzd = r0
            r2.zzb = r0
            return
    }

    private final com.google.android.gms.internal.ads.zzfws zzl() {
            r3 = this;
            com.google.android.gms.internal.ads.zzfwr r0 = com.google.android.gms.internal.ads.zzfws.zzc()
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzle
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L24
            java.lang.String r1 = r3.zzb
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L24
            java.lang.String r1 = r3.zzb
            r0.zza(r1)
            goto L33
        L24:
            java.lang.String r1 = r3.zza
            if (r1 == 0) goto L2c
            r0.zzb(r1)
            goto L33
        L2c:
            java.lang.String r1 = "Missing session token and/or appId"
            java.lang.String r2 = "onLMDupdate"
            r3.zzf(r1, r2)
        L33:
            com.google.android.gms.internal.ads.zzfws r0 = r0.zzc()
            return r0
    }

    private final void zzm() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfwq r0 = r1.zzf
            if (r0 != 0) goto Lb
            com.google.android.gms.ads.internal.overlay.zzy r0 = new com.google.android.gms.ads.internal.overlay.zzy
            r0.<init>(r1)
            r1.zzf = r0
        Lb:
            return
    }

    public final synchronized void zza(com.google.android.gms.internal.ads.zzcfo r2, android.content.Context r3) {
            r1 = this;
            monitor-enter(r1)
            r1.zzc = r2     // Catch: java.lang.Throwable -> L25
            boolean r2 = r1.zzk(r3)     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L12
            java.lang.String r2 = "Unable to bind"
            java.lang.String r3 = "on_play_store_bind"
            r1.zzf(r2, r3)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r1)
            return
        L12:
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L25
            r2.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "action"
            java.lang.String r0 = "fetch_completed"
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "on_play_store_bind"
            r1.zze(r3, r2)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r1)
            return
        L25:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final void zzb() {
            r3 = this;
            boolean r0 = r3.zze
            if (r0 == 0) goto L18
            com.google.android.gms.internal.ads.zzfvt r0 = r3.zzd
            if (r0 != 0) goto L9
            goto L18
        L9:
            com.google.android.gms.internal.ads.zzfws r1 = r3.zzl()
            com.google.android.gms.internal.ads.zzfwq r2 = r3.zzf
            r0.zza(r1, r2)
            java.lang.String r0 = "onLMDOverlayCollapse"
            r3.zzd(r0)
            return
        L18:
            java.lang.String r0 = "LastMileDelivery not connected"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            return
    }

    public final void zzc() {
            r4 = this;
            boolean r0 = r4.zze
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.zzfvt r0 = r4.zzd
            if (r0 != 0) goto L9
            goto L46
        L9:
            com.google.android.gms.internal.ads.zzfvr r1 = com.google.android.gms.internal.ads.zzfvs.zzc()
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzle
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2d
            java.lang.String r2 = r4.zzb
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L2d
            java.lang.String r2 = r4.zzb
            r1.zza(r2)
            goto L3c
        L2d:
            java.lang.String r2 = r4.zza
            if (r2 == 0) goto L35
            r1.zzb(r2)
            goto L3c
        L35:
            java.lang.String r2 = "Missing session token and/or appId"
            java.lang.String r3 = "onLMDupdate"
            r4.zzf(r2, r3)
        L3c:
            com.google.android.gms.internal.ads.zzfvs r1 = r1.zzc()
            com.google.android.gms.internal.ads.zzfwq r2 = r4.zzf
            r0.zzb(r1, r2)
            return
        L46:
            java.lang.String r0 = "LastMileDelivery not connected"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            return
    }

    final void zzd(java.lang.String r2) {
            r1 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zze(r2, r0)
            return
    }

    final void zze(java.lang.String r3, java.util.Map r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zze
            com.google.android.gms.ads.internal.overlay.zzx r1 = new com.google.android.gms.ads.internal.overlay.zzx
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
            return
    }

    final void zzf(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            com.google.android.gms.ads.internal.util.zze.zza(r3)
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zzc
            if (r0 == 0) goto L1b
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "message"
            r0.put(r1, r3)
            java.lang.String r3 = "action"
            r0.put(r3, r4)
            java.lang.String r3 = "onError"
            r2.zze(r3, r0)
        L1b:
            return
    }

    public final void zzg() {
            r3 = this;
            boolean r0 = r3.zze
            if (r0 == 0) goto L18
            com.google.android.gms.internal.ads.zzfvt r0 = r3.zzd
            if (r0 != 0) goto L9
            goto L18
        L9:
            com.google.android.gms.internal.ads.zzfws r1 = r3.zzl()
            com.google.android.gms.internal.ads.zzfwq r2 = r3.zzf
            r0.zzc(r1, r2)
            java.lang.String r0 = "onLMDOverlayExpand"
            r3.zzd(r0)
            return
        L18:
            java.lang.String r0 = "LastMileDelivery not connected"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            return
    }

    final /* synthetic */ void zzh(java.lang.String r2, java.util.Map r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zzc
            if (r0 == 0) goto L7
            r0.zzd(r2, r3)
        L7:
            return
    }

    final void zzi(com.google.android.gms.internal.ads.zzfwp r3) {
            r2 = this;
            java.lang.String r0 = r3.zzb()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L22
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzle
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L22
            java.lang.String r0 = r3.zzb()
            r2.zza = r0
        L22:
            int r0 = r3.zza()
            switch(r0) {
                case 8152: goto L57;
                case 8153: goto L51;
                case 8154: goto L29;
                case 8155: goto L4b;
                case 8156: goto L29;
                case 8157: goto L42;
                case 8158: goto L29;
                case 8159: goto L29;
                case 8160: goto L2a;
                case 8161: goto L2a;
                case 8162: goto L2a;
                default: goto L29;
            }
        L29:
            return
        L2a:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r3 = r3.zza()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "error"
            r0.put(r1, r3)
            java.lang.String r3 = "onLMDOverlayFailedToOpen"
            r2.zze(r3, r0)
            return
        L42:
            r3 = 0
            r2.zza = r3
            r2.zzb = r3
            r3 = 0
            r2.zze = r3
            return
        L4b:
            java.lang.String r3 = "onLMDOverlayClose"
            r2.zzd(r3)
            return
        L51:
            java.lang.String r3 = "onLMDOverlayClicked"
            r2.zzd(r3)
            return
        L57:
            java.lang.String r3 = "onLMDOverlayOpened"
            r2.zzd(r3)
            return
    }

    public final void zzj(com.google.android.gms.internal.ads.zzcfo r2, com.google.android.gms.internal.ads.zzfwn r3) {
            r1 = this;
            if (r2 != 0) goto La
            java.lang.String r2 = "adWebview missing"
            java.lang.String r3 = "onLMDShow"
            r1.zzf(r2, r3)
            return
        La:
            r1.zzc = r2
            boolean r0 = r1.zze
            if (r0 != 0) goto L23
            android.content.Context r2 = r2.getContext()
            boolean r2 = r1.zzk(r2)
            if (r2 == 0) goto L1b
            goto L23
        L1b:
            java.lang.String r2 = "LMDOverlay not bound"
            java.lang.String r3 = "on_play_store_bind"
            r1.zzf(r2, r3)
            return
        L23:
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzle
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r0.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L3b
            java.lang.String r2 = r3.zzh()
            r1.zzb = r2
        L3b:
            r1.zzm()
            com.google.android.gms.internal.ads.zzfvt r2 = r1.zzd
            if (r2 == 0) goto L47
            com.google.android.gms.internal.ads.zzfwq r0 = r1.zzf
            r2.zzd(r3, r0)
        L47:
            return
    }

    public final synchronized boolean zzk(android.content.Context r4) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = com.google.android.gms.internal.ads.zzfxf.zza(r4)     // Catch: java.lang.Throwable -> L30
            r1 = 0
            if (r0 != 0) goto La
            monitor-exit(r3)
            return r1
        La:
            com.google.android.gms.internal.ads.zzfvt r4 = com.google.android.gms.internal.ads.zzfvu.zza(r4)     // Catch: java.lang.NullPointerException -> L11 java.lang.Throwable -> L30
            r3.zzd = r4     // Catch: java.lang.NullPointerException -> L11 java.lang.Throwable -> L30
            goto L20
        L11:
            r4 = move-exception
            java.lang.String r0 = "Error connecting LMD Overlay service"
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = "LastMileDeliveryOverlay.bindLastMileDeliveryService"
            com.google.android.gms.internal.ads.zzcad r2 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L30
            r2.zzw(r4, r0)     // Catch: java.lang.Throwable -> L30
        L20:
            com.google.android.gms.internal.ads.zzfvt r4 = r3.zzd     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L28
            r3.zze = r1     // Catch: java.lang.Throwable -> L30
            monitor-exit(r3)
            return r1
        L28:
            r3.zzm()     // Catch: java.lang.Throwable -> L30
            r4 = 1
            r3.zze = r4     // Catch: java.lang.Throwable -> L30
            monitor-exit(r3)
            return r4
        L30:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }
}
