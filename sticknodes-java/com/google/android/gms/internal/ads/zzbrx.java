package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbrx extends com.google.android.gms.internal.ads.zzbrj {
    private final com.google.android.gms.ads.mediation.rtb.RtbAdapter zza;
    private com.google.android.gms.ads.mediation.MediationInterstitialAd zzb;
    private com.google.android.gms.ads.mediation.MediationRewardedAd zzc;
    private com.google.android.gms.ads.mediation.MediationAppOpenAd zzd;
    private java.lang.String zze;

    public zzbrx(com.google.android.gms.ads.mediation.rtb.RtbAdapter r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.zze = r0
            r1.zza = r2
            return
    }

    static /* bridge */ /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzbrx r0, com.google.android.gms.ads.mediation.MediationAppOpenAd r1) {
            r0.zzd = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzbrx r0, com.google.android.gms.ads.mediation.MediationInterstitialAd r1) {
            r0.zzb = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzu(com.google.android.gms.internal.ads.zzbrx r0, com.google.android.gms.ads.mediation.MediationRewardedAd r1) {
            r0.zzc = r1
            return
    }

    private final android.os.Bundle zzv(com.google.android.gms.ads.internal.client.zzm r2) {
            r1 = this;
            android.os.Bundle r2 = r2.zzm
            if (r2 == 0) goto L15
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r0 = r1.zza
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            android.os.Bundle r2 = r2.getBundle(r0)
            if (r2 == 0) goto L15
            return r2
        L15:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            return r2
    }

    private static final android.os.Bundle zzw(java.lang.String r4) throws android.os.RemoteException {
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "Server parameters: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            android.os.Bundle r0 = new android.os.Bundle     // Catch: org.json.JSONException -> L38
            r0.<init>()     // Catch: org.json.JSONException -> L38
            if (r4 == 0) goto L37
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L38
            r0.<init>(r4)     // Catch: org.json.JSONException -> L38
            android.os.Bundle r4 = new android.os.Bundle     // Catch: org.json.JSONException -> L38
            r4.<init>()     // Catch: org.json.JSONException -> L38
            java.util.Iterator r1 = r0.keys()     // Catch: org.json.JSONException -> L38
        L22:
            boolean r2 = r1.hasNext()     // Catch: org.json.JSONException -> L38
            if (r2 == 0) goto L36
            java.lang.Object r2 = r1.next()     // Catch: org.json.JSONException -> L38
            java.lang.String r2 = (java.lang.String) r2     // Catch: org.json.JSONException -> L38
            java.lang.String r3 = r0.getString(r2)     // Catch: org.json.JSONException -> L38
            r4.putString(r2, r3)     // Catch: org.json.JSONException -> L38
            goto L22
        L36:
            r0 = r4
        L37:
            return r0
        L38:
            r4 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r4)
            android.os.RemoteException r4 = new android.os.RemoteException
            r4.<init>()
            throw r4
    }

    private static final boolean zzx(com.google.android.gms.ads.internal.client.zzm r0) {
            boolean r0 = r0.zzf
            if (r0 != 0) goto L10
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            boolean r0 = com.google.android.gms.ads.internal.util.client.zzf.zzs()
            if (r0 == 0) goto Le
            goto L10
        Le:
            r0 = 0
            return r0
        L10:
            r0 = 1
            return r0
    }

    private static final java.lang.String zzy(java.lang.String r1, com.google.android.gms.ads.internal.client.zzm r2) {
            java.lang.String r2 = r2.zzu
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Ld
            r0.<init>(r1)     // Catch: org.json.JSONException -> Ld
            java.lang.String r1 = "max_ad_content_rating"
            java.lang.String r2 = r0.getString(r1)     // Catch: org.json.JSONException -> Ld
        Ld:
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final com.google.android.gms.ads.internal.client.zzeb zze() {
            r3 = this;
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r0 = r3.zza
            boolean r1 = r0 instanceof com.google.android.gms.ads.mediation.zza
            r2 = 0
            if (r1 == 0) goto L14
            com.google.android.gms.ads.mediation.zza r0 = (com.google.android.gms.ads.mediation.zza) r0     // Catch: java.lang.Throwable -> Le
            com.google.android.gms.ads.internal.client.zzeb r0 = r0.getVideoController()     // Catch: java.lang.Throwable -> Le
            return r0
        Le:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
        L14:
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final com.google.android.gms.internal.ads.zzbrz zzf() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r0 = r1.zza
            com.google.android.gms.ads.VersionInfo r0 = r0.getVersionInfo()
            com.google.android.gms.internal.ads.zzbrz r0 = com.google.android.gms.internal.ads.zzbrz.zza(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final com.google.android.gms.internal.ads.zzbrz zzg() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r0 = r1.zza
            com.google.android.gms.ads.VersionInfo r0 = r0.getSDKVersionInfo()
            com.google.android.gms.internal.ads.zzbrz r0 = com.google.android.gms.internal.ads.zzbrz.zza(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzh(com.google.android.gms.dynamic.IObjectWrapper r5, java.lang.String r6, android.os.Bundle r7, android.os.Bundle r8, com.google.android.gms.ads.internal.client.zzs r9, com.google.android.gms.internal.ads.zzbrn r10) throws android.os.RemoteException {
            r4 = this;
            com.google.android.gms.internal.ads.zzbrv r0 = new com.google.android.gms.internal.ads.zzbrv     // Catch: java.lang.Throwable -> Lae
            r0.<init>(r4, r10)     // Catch: java.lang.Throwable -> Lae
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r10 = r4.zza     // Catch: java.lang.Throwable -> Lae
            com.google.android.gms.ads.mediation.MediationConfiguration r1 = new com.google.android.gms.ads.mediation.MediationConfiguration     // Catch: java.lang.Throwable -> Lae
            int r2 = r6.hashCode()     // Catch: java.lang.Throwable -> Lae
            switch(r2) {
                case -1396342996: goto L4d;
                case -1052618729: goto L43;
                case -239580146: goto L39;
                case 604727084: goto L2f;
                case 1167692200: goto L25;
                case 1778294298: goto L1b;
                case 1911491517: goto L11;
                default: goto L10;
            }
        L10:
            goto L57
        L11:
            java.lang.String r2 = "rewarded_interstitial"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 3
            goto L58
        L1b:
            java.lang.String r2 = "app_open_ad"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 6
            goto L58
        L25:
            java.lang.String r2 = "app_open"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 5
            goto L58
        L2f:
            java.lang.String r2 = "interstitial"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 1
            goto L58
        L39:
            java.lang.String r2 = "rewarded"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 2
            goto L58
        L43:
            java.lang.String r2 = "native"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 4
            goto L58
        L4d:
            java.lang.String r2 = "banner"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 0
            goto L58
        L57:
            r6 = -1
        L58:
            switch(r6) {
                case 0: goto L80;
                case 1: goto L7d;
                case 2: goto L7a;
                case 3: goto L77;
                case 4: goto L74;
                case 5: goto L71;
                case 6: goto L5c;
                default: goto L5b;
            }
        L5b:
            goto La6
        L5c:
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzlt     // Catch: java.lang.Throwable -> Lae
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r6 = r2.zza(r6)     // Catch: java.lang.Throwable -> Lae
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> Lae
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> Lae
            if (r6 == 0) goto La6
            com.google.android.gms.ads.AdFormat r6 = com.google.android.gms.ads.AdFormat.APP_OPEN_AD     // Catch: java.lang.Throwable -> Lae
            goto L82
        L71:
            com.google.android.gms.ads.AdFormat r6 = com.google.android.gms.ads.AdFormat.APP_OPEN_AD     // Catch: java.lang.Throwable -> Lae
            goto L82
        L74:
            com.google.android.gms.ads.AdFormat r6 = com.google.android.gms.ads.AdFormat.NATIVE     // Catch: java.lang.Throwable -> Lae
            goto L82
        L77:
            com.google.android.gms.ads.AdFormat r6 = com.google.android.gms.ads.AdFormat.REWARDED_INTERSTITIAL     // Catch: java.lang.Throwable -> Lae
            goto L82
        L7a:
            com.google.android.gms.ads.AdFormat r6 = com.google.android.gms.ads.AdFormat.REWARDED     // Catch: java.lang.Throwable -> Lae
            goto L82
        L7d:
            com.google.android.gms.ads.AdFormat r6 = com.google.android.gms.ads.AdFormat.INTERSTITIAL     // Catch: java.lang.Throwable -> Lae
            goto L82
        L80:
            com.google.android.gms.ads.AdFormat r6 = com.google.android.gms.ads.AdFormat.BANNER     // Catch: java.lang.Throwable -> Lae
        L82:
            r1.<init>(r6, r8)     // Catch: java.lang.Throwable -> Lae
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lae
            r6.<init>()     // Catch: java.lang.Throwable -> Lae
            r6.add(r1)     // Catch: java.lang.Throwable -> Lae
            com.google.android.gms.ads.mediation.rtb.RtbSignalData r8 = new com.google.android.gms.ads.mediation.rtb.RtbSignalData     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r5)     // Catch: java.lang.Throwable -> Lae
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Throwable -> Lae
            int r2 = r9.zze     // Catch: java.lang.Throwable -> Lae
            int r3 = r9.zzb     // Catch: java.lang.Throwable -> Lae
            java.lang.String r9 = r9.zza     // Catch: java.lang.Throwable -> Lae
            com.google.android.gms.ads.AdSize r9 = com.google.android.gms.ads.zzb.zzc(r2, r3, r9)     // Catch: java.lang.Throwable -> Lae
            r8.<init>(r1, r6, r7, r9)     // Catch: java.lang.Throwable -> Lae
            r10.collectSignals(r8, r0)     // Catch: java.lang.Throwable -> Lae
            return
        La6:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lae
            java.lang.String r7 = "Internal Error"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lae
            throw r6     // Catch: java.lang.Throwable -> Lae
        Lae:
            r6 = move-exception
            java.lang.String r7 = "Error generating signals for RTB"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r7, r6)
            java.lang.String r7 = "adapter.collectSignals"
            com.google.android.gms.internal.ads.zzbpi.zza(r5, r6, r7)
            android.os.RemoteException r5 = new android.os.RemoteException
            r5.<init>()
            throw r5
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzi(java.lang.String r17, java.lang.String r18, com.google.android.gms.ads.internal.client.zzm r19, com.google.android.gms.dynamic.IObjectWrapper r20, com.google.android.gms.internal.ads.zzbqv r21, com.google.android.gms.internal.ads.zzbpr r22) throws android.os.RemoteException {
            r16 = this;
            r1 = r16
            r0 = r19
            com.google.android.gms.internal.ads.zzbru r2 = new com.google.android.gms.internal.ads.zzbru     // Catch: java.lang.Throwable -> L3a
            r3 = r21
            r4 = r22
            r2.<init>(r1, r3, r4)     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r3 = r1.zza     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration r15 = new com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r4 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r20)     // Catch: java.lang.Throwable -> L3a
            r5 = r4
            android.content.Context r5 = (android.content.Context) r5     // Catch: java.lang.Throwable -> L3a
            android.os.Bundle r7 = zzw(r18)     // Catch: java.lang.Throwable -> L3a
            android.os.Bundle r8 = r1.zzv(r0)     // Catch: java.lang.Throwable -> L3a
            boolean r9 = zzx(r19)     // Catch: java.lang.Throwable -> L3a
            android.location.Location r10 = r0.zzk     // Catch: java.lang.Throwable -> L3a
            int r11 = r0.zzg     // Catch: java.lang.Throwable -> L3a
            int r12 = r0.zzt     // Catch: java.lang.Throwable -> L3a
            java.lang.String r13 = zzy(r18, r19)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r14 = r1.zze     // Catch: java.lang.Throwable -> L3a
            r4 = r15
            r6 = r17
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L3a
            r3.loadRtbAppOpenAd(r15, r2)     // Catch: java.lang.Throwable -> L3a
            return
        L3a:
            r0 = move-exception
            java.lang.String r2 = "Adapter failed to render app open ad."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r0)
            java.lang.String r2 = "adapter.loadRtbAppOpenAd"
            r3 = r20
            com.google.android.gms.internal.ads.zzbpi.zza(r3, r0, r2)
            android.os.RemoteException r0 = new android.os.RemoteException
            r0.<init>()
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzj(java.lang.String r18, java.lang.String r19, com.google.android.gms.ads.internal.client.zzm r20, com.google.android.gms.dynamic.IObjectWrapper r21, com.google.android.gms.internal.ads.zzbqy r22, com.google.android.gms.internal.ads.zzbpr r23, com.google.android.gms.ads.internal.client.zzs r24) throws android.os.RemoteException {
            r17 = this;
            r1 = r17
            r0 = r20
            r2 = r24
            com.google.android.gms.internal.ads.zzbrp r3 = new com.google.android.gms.internal.ads.zzbrp     // Catch: java.lang.Throwable -> L4a
            r4 = r22
            r5 = r23
            r3.<init>(r1, r4, r5)     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r4 = r1.zza     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.ads.mediation.MediationBannerAdConfiguration r15 = new com.google.android.gms.ads.mediation.MediationBannerAdConfiguration     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r5 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r21)     // Catch: java.lang.Throwable -> L4a
            r6 = r5
            android.content.Context r6 = (android.content.Context) r6     // Catch: java.lang.Throwable -> L4a
            android.os.Bundle r8 = zzw(r19)     // Catch: java.lang.Throwable -> L4a
            android.os.Bundle r9 = r1.zzv(r0)     // Catch: java.lang.Throwable -> L4a
            boolean r10 = zzx(r20)     // Catch: java.lang.Throwable -> L4a
            android.location.Location r11 = r0.zzk     // Catch: java.lang.Throwable -> L4a
            int r12 = r0.zzg     // Catch: java.lang.Throwable -> L4a
            int r13 = r0.zzt     // Catch: java.lang.Throwable -> L4a
            java.lang.String r14 = zzy(r19, r20)     // Catch: java.lang.Throwable -> L4a
            int r0 = r2.zze     // Catch: java.lang.Throwable -> L4a
            int r5 = r2.zzb     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = r2.zza     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.ads.AdSize r0 = com.google.android.gms.ads.zzb.zzc(r0, r5, r2)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = r1.zze     // Catch: java.lang.Throwable -> L4a
            r5 = r15
            r7 = r18
            r1 = r15
            r15 = r0
            r16 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L4a
            r4.loadRtbBannerAd(r1, r3)     // Catch: java.lang.Throwable -> L4a
            return
        L4a:
            r0 = move-exception
            java.lang.String r1 = "Adapter failed to render banner ad."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            java.lang.String r1 = "adapter.loadRtbBannerAd"
            r2 = r21
            com.google.android.gms.internal.ads.zzbpi.zza(r2, r0, r1)
            android.os.RemoteException r0 = new android.os.RemoteException
            r0.<init>()
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzk(java.lang.String r18, java.lang.String r19, com.google.android.gms.ads.internal.client.zzm r20, com.google.android.gms.dynamic.IObjectWrapper r21, com.google.android.gms.internal.ads.zzbqy r22, com.google.android.gms.internal.ads.zzbpr r23, com.google.android.gms.ads.internal.client.zzs r24) throws android.os.RemoteException {
            r17 = this;
            r1 = r17
            r0 = r20
            r2 = r24
            com.google.android.gms.internal.ads.zzbrq r3 = new com.google.android.gms.internal.ads.zzbrq     // Catch: java.lang.Throwable -> L4a
            r4 = r22
            r5 = r23
            r3.<init>(r1, r4, r5)     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r4 = r1.zza     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.ads.mediation.MediationBannerAdConfiguration r15 = new com.google.android.gms.ads.mediation.MediationBannerAdConfiguration     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r5 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r21)     // Catch: java.lang.Throwable -> L4a
            r6 = r5
            android.content.Context r6 = (android.content.Context) r6     // Catch: java.lang.Throwable -> L4a
            android.os.Bundle r8 = zzw(r19)     // Catch: java.lang.Throwable -> L4a
            android.os.Bundle r9 = r1.zzv(r0)     // Catch: java.lang.Throwable -> L4a
            boolean r10 = zzx(r20)     // Catch: java.lang.Throwable -> L4a
            android.location.Location r11 = r0.zzk     // Catch: java.lang.Throwable -> L4a
            int r12 = r0.zzg     // Catch: java.lang.Throwable -> L4a
            int r13 = r0.zzt     // Catch: java.lang.Throwable -> L4a
            java.lang.String r14 = zzy(r19, r20)     // Catch: java.lang.Throwable -> L4a
            int r0 = r2.zze     // Catch: java.lang.Throwable -> L4a
            int r5 = r2.zzb     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = r2.zza     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.ads.AdSize r0 = com.google.android.gms.ads.zzb.zzc(r0, r5, r2)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = r1.zze     // Catch: java.lang.Throwable -> L4a
            r5 = r15
            r7 = r18
            r1 = r15
            r15 = r0
            r16 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L4a
            r4.loadRtbInterscrollerAd(r1, r3)     // Catch: java.lang.Throwable -> L4a
            return
        L4a:
            r0 = move-exception
            java.lang.String r1 = "Adapter failed to render interscroller ad."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            java.lang.String r1 = "adapter.loadRtbInterscrollerAd"
            r2 = r21
            com.google.android.gms.internal.ads.zzbpi.zza(r2, r0, r1)
            android.os.RemoteException r0 = new android.os.RemoteException
            r0.<init>()
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzl(java.lang.String r17, java.lang.String r18, com.google.android.gms.ads.internal.client.zzm r19, com.google.android.gms.dynamic.IObjectWrapper r20, com.google.android.gms.internal.ads.zzbrb r21, com.google.android.gms.internal.ads.zzbpr r22) throws android.os.RemoteException {
            r16 = this;
            r1 = r16
            r0 = r19
            com.google.android.gms.internal.ads.zzbrr r2 = new com.google.android.gms.internal.ads.zzbrr     // Catch: java.lang.Throwable -> L3a
            r3 = r21
            r4 = r22
            r2.<init>(r1, r3, r4)     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r3 = r1.zza     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration r15 = new com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r4 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r20)     // Catch: java.lang.Throwable -> L3a
            r5 = r4
            android.content.Context r5 = (android.content.Context) r5     // Catch: java.lang.Throwable -> L3a
            android.os.Bundle r7 = zzw(r18)     // Catch: java.lang.Throwable -> L3a
            android.os.Bundle r8 = r1.zzv(r0)     // Catch: java.lang.Throwable -> L3a
            boolean r9 = zzx(r19)     // Catch: java.lang.Throwable -> L3a
            android.location.Location r10 = r0.zzk     // Catch: java.lang.Throwable -> L3a
            int r11 = r0.zzg     // Catch: java.lang.Throwable -> L3a
            int r12 = r0.zzt     // Catch: java.lang.Throwable -> L3a
            java.lang.String r13 = zzy(r18, r19)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r14 = r1.zze     // Catch: java.lang.Throwable -> L3a
            r4 = r15
            r6 = r17
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L3a
            r3.loadRtbInterstitialAd(r15, r2)     // Catch: java.lang.Throwable -> L3a
            return
        L3a:
            r0 = move-exception
            java.lang.String r2 = "Adapter failed to render interstitial ad."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r0)
            java.lang.String r2 = "adapter.loadRtbInterstitialAd"
            r3 = r20
            com.google.android.gms.internal.ads.zzbpi.zza(r3, r0, r2)
            android.os.RemoteException r0 = new android.os.RemoteException
            r0.<init>()
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzm(java.lang.String r9, java.lang.String r10, com.google.android.gms.ads.internal.client.zzm r11, com.google.android.gms.dynamic.IObjectWrapper r12, com.google.android.gms.internal.ads.zzbre r13, com.google.android.gms.internal.ads.zzbpr r14) throws android.os.RemoteException {
            r8 = this;
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.zzn(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzn(java.lang.String r20, java.lang.String r21, com.google.android.gms.ads.internal.client.zzm r22, com.google.android.gms.dynamic.IObjectWrapper r23, com.google.android.gms.internal.ads.zzbre r24, com.google.android.gms.internal.ads.zzbpr r25, com.google.android.gms.internal.ads.zzbfr r26) throws android.os.RemoteException {
            r19 = this;
            r1 = r19
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            com.google.android.gms.internal.ads.zzbrs r0 = new com.google.android.gms.internal.ads.zzbrs     // Catch: java.lang.Throwable -> L45
            r0.<init>(r1, r4, r5)     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r6 = r1.zza     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.ads.mediation.MediationNativeAdConfiguration r15 = new com.google.android.gms.ads.mediation.MediationNativeAdConfiguration     // Catch: java.lang.Throwable -> L45
            java.lang.Object r7 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r23)     // Catch: java.lang.Throwable -> L45
            r8 = r7
            android.content.Context r8 = (android.content.Context) r8     // Catch: java.lang.Throwable -> L45
            android.os.Bundle r10 = zzw(r21)     // Catch: java.lang.Throwable -> L45
            android.os.Bundle r11 = r1.zzv(r2)     // Catch: java.lang.Throwable -> L45
            boolean r12 = zzx(r22)     // Catch: java.lang.Throwable -> L45
            android.location.Location r13 = r2.zzk     // Catch: java.lang.Throwable -> L45
            int r14 = r2.zzg     // Catch: java.lang.Throwable -> L45
            int r9 = r2.zzt     // Catch: java.lang.Throwable -> L45
            java.lang.String r16 = zzy(r21, r22)     // Catch: java.lang.Throwable -> L45
            java.lang.String r7 = r1.zze     // Catch: java.lang.Throwable -> L45
            r17 = r7
            r7 = r15
            r18 = r9
            r9 = r20
            r2 = r15
            r15 = r18
            r18 = r26
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L45
            r6.loadRtbNativeAdMapper(r2, r0)     // Catch: java.lang.Throwable -> L45
            return
        L45:
            r0 = move-exception
            java.lang.String r2 = "Adapter failed to render native ad."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r0)
            java.lang.String r6 = "adapter.loadRtbNativeAdMapper"
            com.google.android.gms.internal.ads.zzbpi.zza(r3, r0, r6)
            java.lang.String r0 = r0.getMessage()
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 != 0) goto Lac
            java.lang.String r6 = "Method is not found"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lac
            com.google.android.gms.internal.ads.zzbrt r0 = new com.google.android.gms.internal.ads.zzbrt     // Catch: java.lang.Throwable -> L9d
            r0.<init>(r1, r4, r5)     // Catch: java.lang.Throwable -> L9d
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r4 = r1.zza     // Catch: java.lang.Throwable -> L9d
            com.google.android.gms.ads.mediation.MediationNativeAdConfiguration r15 = new com.google.android.gms.ads.mediation.MediationNativeAdConfiguration     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r5 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r23)     // Catch: java.lang.Throwable -> L9d
            r6 = r5
            android.content.Context r6 = (android.content.Context) r6     // Catch: java.lang.Throwable -> L9d
            android.os.Bundle r8 = zzw(r21)     // Catch: java.lang.Throwable -> L9d
            r5 = r22
            android.os.Bundle r9 = r1.zzv(r5)     // Catch: java.lang.Throwable -> L9d
            boolean r10 = zzx(r22)     // Catch: java.lang.Throwable -> L9d
            android.location.Location r11 = r5.zzk     // Catch: java.lang.Throwable -> L9d
            int r12 = r5.zzg     // Catch: java.lang.Throwable -> L9d
            int r13 = r5.zzt     // Catch: java.lang.Throwable -> L9d
            java.lang.String r14 = zzy(r21, r22)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r7 = r1.zze     // Catch: java.lang.Throwable -> L9d
            r5 = r15
            r16 = r7
            r7 = r20
            r1 = r15
            r15 = r16
            r16 = r26
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L9d
            r4.loadRtbNativeAd(r1, r0)     // Catch: java.lang.Throwable -> L9d
            return
        L9d:
            r0 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r0)
            java.lang.String r1 = "adapter.loadRtbNativeAd"
            com.google.android.gms.internal.ads.zzbpi.zza(r3, r0, r1)
            android.os.RemoteException r0 = new android.os.RemoteException
            r0.<init>()
            throw r0
        Lac:
            android.os.RemoteException r0 = new android.os.RemoteException
            r0.<init>()
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzo(java.lang.String r17, java.lang.String r18, com.google.android.gms.ads.internal.client.zzm r19, com.google.android.gms.dynamic.IObjectWrapper r20, com.google.android.gms.internal.ads.zzbrh r21, com.google.android.gms.internal.ads.zzbpr r22) throws android.os.RemoteException {
            r16 = this;
            r1 = r16
            r0 = r19
            com.google.android.gms.internal.ads.zzbrw r2 = new com.google.android.gms.internal.ads.zzbrw     // Catch: java.lang.Throwable -> L3a
            r3 = r21
            r4 = r22
            r2.<init>(r1, r3, r4)     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r3 = r1.zza     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration r15 = new com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r4 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r20)     // Catch: java.lang.Throwable -> L3a
            r5 = r4
            android.content.Context r5 = (android.content.Context) r5     // Catch: java.lang.Throwable -> L3a
            android.os.Bundle r7 = zzw(r18)     // Catch: java.lang.Throwable -> L3a
            android.os.Bundle r8 = r1.zzv(r0)     // Catch: java.lang.Throwable -> L3a
            boolean r9 = zzx(r19)     // Catch: java.lang.Throwable -> L3a
            android.location.Location r10 = r0.zzk     // Catch: java.lang.Throwable -> L3a
            int r11 = r0.zzg     // Catch: java.lang.Throwable -> L3a
            int r12 = r0.zzt     // Catch: java.lang.Throwable -> L3a
            java.lang.String r13 = zzy(r18, r19)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r14 = r1.zze     // Catch: java.lang.Throwable -> L3a
            r4 = r15
            r6 = r17
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L3a
            r3.loadRtbRewardedInterstitialAd(r15, r2)     // Catch: java.lang.Throwable -> L3a
            return
        L3a:
            r0 = move-exception
            java.lang.String r2 = "Adapter failed to render rewarded interstitial ad."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r0)
            java.lang.String r2 = "adapter.loadRtbRewardedInterstitialAd"
            r3 = r20
            com.google.android.gms.internal.ads.zzbpi.zza(r3, r0, r2)
            android.os.RemoteException r0 = new android.os.RemoteException
            r0.<init>()
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzp(java.lang.String r17, java.lang.String r18, com.google.android.gms.ads.internal.client.zzm r19, com.google.android.gms.dynamic.IObjectWrapper r20, com.google.android.gms.internal.ads.zzbrh r21, com.google.android.gms.internal.ads.zzbpr r22) throws android.os.RemoteException {
            r16 = this;
            r1 = r16
            r0 = r19
            com.google.android.gms.internal.ads.zzbrw r2 = new com.google.android.gms.internal.ads.zzbrw     // Catch: java.lang.Throwable -> L3a
            r3 = r21
            r4 = r22
            r2.<init>(r1, r3, r4)     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r3 = r1.zza     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration r15 = new com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r4 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r20)     // Catch: java.lang.Throwable -> L3a
            r5 = r4
            android.content.Context r5 = (android.content.Context) r5     // Catch: java.lang.Throwable -> L3a
            android.os.Bundle r7 = zzw(r18)     // Catch: java.lang.Throwable -> L3a
            android.os.Bundle r8 = r1.zzv(r0)     // Catch: java.lang.Throwable -> L3a
            boolean r9 = zzx(r19)     // Catch: java.lang.Throwable -> L3a
            android.location.Location r10 = r0.zzk     // Catch: java.lang.Throwable -> L3a
            int r11 = r0.zzg     // Catch: java.lang.Throwable -> L3a
            int r12 = r0.zzt     // Catch: java.lang.Throwable -> L3a
            java.lang.String r13 = zzy(r18, r19)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r14 = r1.zze     // Catch: java.lang.Throwable -> L3a
            r4 = r15
            r6 = r17
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L3a
            r3.loadRtbRewardedAd(r15, r2)     // Catch: java.lang.Throwable -> L3a
            return
        L3a:
            r0 = move-exception
            java.lang.String r2 = "Adapter failed to render rewarded ad."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r0)
            java.lang.String r2 = "adapter.loadRtbRewardedAd"
            r3 = r20
            com.google.android.gms.internal.ads.zzbpi.zza(r3, r0, r2)
            android.os.RemoteException r0 = new android.os.RemoteException
            r0.<init>()
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzq(java.lang.String r1) {
            r0 = this;
            r0.zze = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final boolean zzr(com.google.android.gms.dynamic.IObjectWrapper r3) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.ads.mediation.MediationAppOpenAd r0 = r2.zzd
            if (r0 == 0) goto L1b
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r3)     // Catch: java.lang.Throwable -> Le
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Throwable -> Le
            UX.aTqO5.a()     // Catch: java.lang.Throwable -> Le
            goto L19
        Le:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            java.lang.String r1 = "adapter.showRtbAppOpenAd"
            com.google.android.gms.internal.ads.zzbpi.zza(r3, r0, r1)
        L19:
            r3 = 1
            return r3
        L1b:
            r3 = 0
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final boolean zzs(com.google.android.gms.dynamic.IObjectWrapper r3) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.ads.mediation.MediationInterstitialAd r0 = r2.zzb
            if (r0 == 0) goto L1b
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r3)     // Catch: java.lang.Throwable -> Le
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Throwable -> Le
            UX.aTqO5.a()     // Catch: java.lang.Throwable -> Le
            goto L19
        Le:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            java.lang.String r1 = "adapter.showRtbInterstitialAd"
            com.google.android.gms.internal.ads.zzbpi.zza(r3, r0, r1)
        L19:
            r3 = 1
            return r3
        L1b:
            r3 = 0
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final boolean zzt(com.google.android.gms.dynamic.IObjectWrapper r3) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.ads.mediation.MediationRewardedAd r0 = r2.zzc
            if (r0 == 0) goto L1b
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r3)     // Catch: java.lang.Throwable -> Le
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Throwable -> Le
            UX.aTqO5.a()     // Catch: java.lang.Throwable -> Le
            goto L19
        Le:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            java.lang.String r1 = "adapter.showRtbRewardedAd"
            com.google.android.gms.internal.ads.zzbpi.zza(r3, r0, r1)
        L19:
            r3 = 1
            return r3
        L1b:
            r3 = 0
            return r3
    }
}
