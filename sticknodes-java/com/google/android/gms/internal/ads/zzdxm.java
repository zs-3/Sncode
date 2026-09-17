package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdxm implements com.google.android.gms.ads.internal.overlay.zzr, com.google.android.gms.internal.ads.zzche {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzb;
    private com.google.android.gms.internal.ads.zzdxb zzc;
    private com.google.android.gms.internal.ads.zzcfo zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private com.google.android.gms.ads.internal.client.zzdl zzh;
    private boolean zzi;

    zzdxm(android.content.Context r1, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    private final synchronized boolean zzl(com.google.android.gms.ads.internal.client.zzdl r9) {
            r8 = this;
            monitor-enter(r8)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzix     // Catch: java.lang.Throwable -> L83
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L83
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L83
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L83
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L83
            r1 = 16
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L25
            java.lang.String r0 = "Ad inspector had an internal error."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)     // Catch: java.lang.Throwable -> L83
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfie.zzd(r1, r3, r3)     // Catch: android.os.RemoteException -> L23 java.lang.Throwable -> L83
            r9.zze(r0)     // Catch: android.os.RemoteException -> L23 java.lang.Throwable -> L83
        L23:
            monitor-exit(r8)
            return r2
        L25:
            com.google.android.gms.internal.ads.zzdxb r0 = r8.zzc     // Catch: java.lang.Throwable -> L83
            if (r0 != 0) goto L47
            java.lang.String r0 = "Ad inspector had an internal error."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)     // Catch: java.lang.Throwable -> L83
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: android.os.RemoteException -> L45 java.lang.Throwable -> L83
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch: android.os.RemoteException -> L45 java.lang.Throwable -> L83
            java.lang.String r5 = "InspectorManager null"
            r4.<init>(r5)     // Catch: android.os.RemoteException -> L45 java.lang.Throwable -> L83
            java.lang.String r5 = "InspectorUi.shouldOpenUi"
            r0.zzw(r4, r5)     // Catch: android.os.RemoteException -> L45 java.lang.Throwable -> L83
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfie.zzd(r1, r3, r3)     // Catch: android.os.RemoteException -> L45 java.lang.Throwable -> L83
            r9.zze(r0)     // Catch: android.os.RemoteException -> L45 java.lang.Throwable -> L83
        L45:
            monitor-exit(r8)
            return r2
        L47:
            boolean r0 = r8.zze     // Catch: java.lang.Throwable -> L83
            if (r0 != 0) goto L73
            boolean r0 = r8.zzf     // Catch: java.lang.Throwable -> L83
            if (r0 != 0) goto L73
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L83
            long r0 = r0.currentTimeMillis()     // Catch: java.lang.Throwable -> L83
            long r4 = r8.zzg     // Catch: java.lang.Throwable -> L83
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zziA     // Catch: java.lang.Throwable -> L83
            com.google.android.gms.internal.ads.zzbct r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L83
            java.lang.Object r6 = r7.zza(r6)     // Catch: java.lang.Throwable -> L83
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L83
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L83
            long r6 = (long) r6
            long r4 = r4 + r6
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L70
            goto L73
        L70:
            r9 = 1
            monitor-exit(r8)
            return r9
        L73:
            java.lang.String r0 = "Ad inspector cannot be opened because it is already open."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)     // Catch: java.lang.Throwable -> L83
            r0 = 19
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfie.zzd(r0, r3, r3)     // Catch: android.os.RemoteException -> L81 java.lang.Throwable -> L83
            r9.zze(r0)     // Catch: android.os.RemoteException -> L81 java.lang.Throwable -> L83
        L81:
            monitor-exit(r8)
            return r2
        L83:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final synchronized void zza(boolean r5, int r6, java.lang.String r7, java.lang.String r8) {
            r4 = this;
            monitor-enter(r4)
            r0 = 1
            if (r5 == 0) goto L12
            java.lang.String r5 = "Ad inspector loaded."
            com.google.android.gms.ads.internal.util.zze.zza(r5)     // Catch: java.lang.Throwable -> L68
            r4.zze = r0     // Catch: java.lang.Throwable -> L68
            java.lang.String r5 = ""
            r4.zzk(r5)     // Catch: java.lang.Throwable -> L68
            monitor-exit(r4)
            return
        L12:
            java.lang.String r5 = "Ad inspector failed to load."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r5)     // Catch: java.lang.Throwable -> L68
            com.google.android.gms.internal.ads.zzcad r5 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: android.os.RemoteException -> L55 java.lang.Throwable -> L68
            java.lang.Exception r1 = new java.lang.Exception     // Catch: android.os.RemoteException -> L55 java.lang.Throwable -> L68
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> L55 java.lang.Throwable -> L68
            r2.<init>()     // Catch: android.os.RemoteException -> L55 java.lang.Throwable -> L68
            java.lang.String r3 = "Failed to load UI. Error code: "
            r2.append(r3)     // Catch: android.os.RemoteException -> L55 java.lang.Throwable -> L68
            r2.append(r6)     // Catch: android.os.RemoteException -> L55 java.lang.Throwable -> L68
            java.lang.String r6 = ", Description: "
            r2.append(r6)     // Catch: android.os.RemoteException -> L55 java.lang.Throwable -> L68
            r2.append(r7)     // Catch: android.os.RemoteException -> L55 java.lang.Throwable -> L68
            java.lang.String r6 = ", Failing URL: "
            r2.append(r6)     // Catch: android.os.RemoteException -> L55 java.lang.Throwable -> L68
            r2.append(r8)     // Catch: android.os.RemoteException -> L55 java.lang.Throwable -> L68
            java.lang.String r6 = r2.toString()     // Catch: android.os.RemoteException -> L55 java.lang.Throwable -> L68
            r1.<init>(r6)     // Catch: android.os.RemoteException -> L55 java.lang.Throwable -> L68
            java.lang.String r6 = "InspectorUi.onAdWebViewFinishedLoading 0"
            r5.zzw(r1, r6)     // Catch: android.os.RemoteException -> L55 java.lang.Throwable -> L68
            com.google.android.gms.ads.internal.client.zzdl r5 = r4.zzh     // Catch: android.os.RemoteException -> L55 java.lang.Throwable -> L68
            if (r5 == 0) goto L5f
            r6 = 17
            r7 = 0
            com.google.android.gms.ads.internal.client.zze r6 = com.google.android.gms.internal.ads.zzfie.zzd(r6, r7, r7)     // Catch: android.os.RemoteException -> L55 java.lang.Throwable -> L68
            r5.zze(r6)     // Catch: android.os.RemoteException -> L55 java.lang.Throwable -> L68
            goto L5f
        L55:
            r5 = move-exception
            java.lang.String r6 = "InspectorUi.onAdWebViewFinishedLoading 1"
            com.google.android.gms.internal.ads.zzcad r7 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L68
            r7.zzw(r5, r6)     // Catch: java.lang.Throwable -> L68
        L5f:
            r4.zzi = r0     // Catch: java.lang.Throwable -> L68
            com.google.android.gms.internal.ads.zzcfo r5 = r4.zzd     // Catch: java.lang.Throwable -> L68
            r5.destroy()     // Catch: java.lang.Throwable -> L68
            monitor-exit(r4)
            return
        L68:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdH() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdk() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdr() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.zzf = r0     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = ""
            r1.zzk(r0)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdu(int r4) {
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzcfo r4 = r3.zzd     // Catch: java.lang.Throwable -> L26
            r4.destroy()     // Catch: java.lang.Throwable -> L26
            boolean r4 = r3.zzi     // Catch: java.lang.Throwable -> L26
            r0 = 0
            if (r4 != 0) goto L17
            java.lang.String r4 = "Inspector closed."
            com.google.android.gms.ads.internal.util.zze.zza(r4)     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.ads.internal.client.zzdl r4 = r3.zzh     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L17
            r4.zze(r0)     // Catch: android.os.RemoteException -> L17 java.lang.Throwable -> L26
        L17:
            r4 = 0
            r3.zzf = r4     // Catch: java.lang.Throwable -> L26
            r3.zze = r4     // Catch: java.lang.Throwable -> L26
            r1 = 0
            r3.zzg = r1     // Catch: java.lang.Throwable -> L26
            r3.zzi = r4     // Catch: java.lang.Throwable -> L26
            r3.zzh = r0     // Catch: java.lang.Throwable -> L26
            monitor-exit(r3)
            return
        L26:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final android.app.Activity zzg() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zzd
            if (r0 == 0) goto L12
            boolean r0 = r0.zzaE()
            if (r0 == 0) goto Lb
            goto L12
        Lb:
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zzd
            android.app.Activity r0 = r0.zzi()
            return r0
        L12:
            r0 = 0
            return r0
    }

    public final void zzh(com.google.android.gms.internal.ads.zzdxb r1) {
            r0 = this;
            r0.zzc = r1
            return
    }

    final /* synthetic */ void zzi(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzdxb r0 = r2.zzc
            org.json.JSONObject r0 = r0.zze()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L11
            java.lang.String r1 = "redirectUrl"
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L11
        L11:
            com.google.android.gms.internal.ads.zzcfo r3 = r2.zzd
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "window.inspectorInfo"
            r3.zzb(r1, r0)
            return
    }

    public final synchronized void zzj(com.google.android.gms.ads.internal.client.zzdl r26, com.google.android.gms.internal.ads.zzbkq r27, com.google.android.gms.internal.ads.zzbkj r28, com.google.android.gms.internal.ads.zzbjx r29) {
            r25 = this;
            r1 = r25
            r2 = r26
            monitor-enter(r25)
            boolean r0 = r25.zzl(r26)     // Catch: java.lang.Throwable -> Le9
            if (r0 != 0) goto Ld
            monitor-exit(r25)
            return
        Ld:
            r3 = 0
            r4 = 17
            com.google.android.gms.ads.internal.zzu.zzz()     // Catch: com.google.android.gms.internal.ads.zzcga -> Lc3 java.lang.Throwable -> Le9
            android.content.Context r5 = r1.zza     // Catch: com.google.android.gms.internal.ads.zzcga -> Lc3 java.lang.Throwable -> Le9
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r12 = r1.zzb     // Catch: com.google.android.gms.internal.ads.zzcga -> Lc3 java.lang.Throwable -> Le9
            com.google.android.gms.internal.ads.zzchi r6 = com.google.android.gms.internal.ads.zzchi.zza()     // Catch: com.google.android.gms.internal.ads.zzcga -> Lc3 java.lang.Throwable -> Le9
            java.lang.String r7 = ""
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            com.google.android.gms.internal.ads.zzbbu r16 = com.google.android.gms.internal.ads.zzbbu.zza()     // Catch: com.google.android.gms.internal.ads.zzcga -> Lc3 java.lang.Throwable -> Le9
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            com.google.android.gms.internal.ads.zzcfo r0 = com.google.android.gms.internal.ads.zzcgb.zza(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch: com.google.android.gms.internal.ads.zzcga -> Lc3 java.lang.Throwable -> Le9
            r1.zzd = r0     // Catch: com.google.android.gms.internal.ads.zzcga -> Lc3 java.lang.Throwable -> Le9
            com.google.android.gms.internal.ads.zzchg r0 = r0.zzN()     // Catch: java.lang.Throwable -> Le9
            if (r0 != 0) goto L68
            java.lang.String r0 = "Failed to obtain a web view for the ad inspector"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)     // Catch: java.lang.Throwable -> Le9
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> Le9
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> Le9
            java.lang.String r6 = "Failed to obtain a web view for the ad inspector"
            r5.<init>(r6)     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> Le9
            java.lang.String r6 = "InspectorUi.openInspector 2"
            r0.zzw(r5, r6)     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> Le9
            java.lang.String r0 = "Failed to obtain a web view for the ad inspector"
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfie.zzd(r4, r0, r3)     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> Le9
            r2.zze(r0)     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> Le9
            monitor-exit(r25)
            return
        L5c:
            r0 = move-exception
            java.lang.String r2 = "InspectorUi.openInspector 3"
            com.google.android.gms.internal.ads.zzcad r3 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> Le9
            r3.zzw(r0, r2)     // Catch: java.lang.Throwable -> Le9
            monitor-exit(r25)
            return
        L68:
            r1.zzh = r2     // Catch: java.lang.Throwable -> Le9
            android.content.Context r2 = r1.zza     // Catch: java.lang.Throwable -> Le9
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            com.google.android.gms.internal.ads.zzbkp r3 = new com.google.android.gms.internal.ads.zzbkp     // Catch: java.lang.Throwable -> Le9
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Le9
            r24 = 0
            r5 = r0
            r19 = r27
            r21 = r3
            r22 = r28
            r23 = r29
            r5.zzS(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch: java.lang.Throwable -> Le9
            r0.zzB(r1)     // Catch: java.lang.Throwable -> Le9
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zzd     // Catch: java.lang.Throwable -> Le9
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zziy     // Catch: java.lang.Throwable -> Le9
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> Le9
            java.lang.Object r2 = r3.zza(r2)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Le9
            UX.aTqO5.a()     // Catch: java.lang.Throwable -> Le9
            com.google.android.gms.ads.internal.zzu.zzi()     // Catch: java.lang.Throwable -> Le9
            android.content.Context r0 = r1.zza     // Catch: java.lang.Throwable -> Le9
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel     // Catch: java.lang.Throwable -> Le9
            com.google.android.gms.internal.ads.zzcfo r3 = r1.zzd     // Catch: java.lang.Throwable -> Le9
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = r1.zzb     // Catch: java.lang.Throwable -> Le9
            r5 = 1
            r2.<init>(r1, r3, r5, r4)     // Catch: java.lang.Throwable -> Le9
            com.google.android.gms.ads.internal.overlay.zzn.zza(r0, r2, r5)     // Catch: java.lang.Throwable -> Le9
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> Le9
            long r2 = r0.currentTimeMillis()     // Catch: java.lang.Throwable -> Le9
            r1.zzg = r2     // Catch: java.lang.Throwable -> Le9
            monitor-exit(r25)
            return
        Lc3:
            r0 = move-exception
            java.lang.String r5 = "Failed to obtain a web view for the ad inspector"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r5, r0)     // Catch: java.lang.Throwable -> Le9
            com.google.android.gms.internal.ads.zzcad r5 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: android.os.RemoteException -> Ldd java.lang.Throwable -> Le9
            java.lang.String r6 = "InspectorUi.openInspector 0"
            r5.zzw(r0, r6)     // Catch: android.os.RemoteException -> Ldd java.lang.Throwable -> Le9
            java.lang.String r0 = "Failed to obtain a web view for the ad inspector"
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfie.zzd(r4, r0, r3)     // Catch: android.os.RemoteException -> Ldd java.lang.Throwable -> Le9
            r2.zze(r0)     // Catch: android.os.RemoteException -> Ldd java.lang.Throwable -> Le9
            monitor-exit(r25)
            return
        Ldd:
            r0 = move-exception
            java.lang.String r2 = "InspectorUi.openInspector 1"
            com.google.android.gms.internal.ads.zzcad r3 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> Le9
            r3.zzw(r0, r2)     // Catch: java.lang.Throwable -> Le9
            monitor-exit(r25)
            return
        Le9:
            r0 = move-exception
            monitor-exit(r25)
            throw r0
    }

    public final synchronized void zzk(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zze     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L16
            boolean r0 = r2.zzf     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto La
            goto L16
        La:
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zze     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.internal.ads.zzdxl r1 = new com.google.android.gms.internal.ads.zzdxl     // Catch: java.lang.Throwable -> L18
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L18
            r0.execute(r1)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            return
        L16:
            monitor-exit(r2)
            return
        L18:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
