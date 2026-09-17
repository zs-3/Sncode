package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbsu extends com.google.android.gms.ads.nativead.NativeAd {
    private final com.google.android.gms.internal.ads.zzbhz zza;
    private final java.util.List zzb;
    private final com.google.android.gms.internal.ads.zzbst zzc;
    private final com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo zzd;
    private final java.util.List zze;

    public zzbsu(com.google.android.gms.internal.ads.zzbhz r6) {
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zzb = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zze = r1
            r5.zza = r6
            r1 = 0
            java.util.List r6 = r6.zzu()     // Catch: android.os.RemoteException -> L43
            if (r6 == 0) goto L47
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L43
        L20:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L43
            if (r2 == 0) goto L47
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L43
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L43
            if (r3 == 0) goto L35
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L43
            com.google.android.gms.internal.ads.zzbgc r2 = com.google.android.gms.internal.ads.zzbgb.zzg(r2)     // Catch: android.os.RemoteException -> L43
            goto L36
        L35:
            r2 = r1
        L36:
            if (r2 == 0) goto L20
            java.util.List r3 = r5.zzb     // Catch: android.os.RemoteException -> L43
            com.google.android.gms.internal.ads.zzbst r4 = new com.google.android.gms.internal.ads.zzbst     // Catch: android.os.RemoteException -> L43
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L43
            r3.add(r4)     // Catch: android.os.RemoteException -> L43
            goto L20
        L43:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r6)
        L47:
            com.google.android.gms.internal.ads.zzbhz r6 = r5.zza     // Catch: android.os.RemoteException -> L76
            java.util.List r6 = r6.zzv()     // Catch: android.os.RemoteException -> L76
            if (r6 == 0) goto L7a
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L76
        L53:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L76
            if (r2 == 0) goto L7a
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L76
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L76
            if (r3 == 0) goto L68
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L76
            com.google.android.gms.ads.internal.client.zzdh r2 = com.google.android.gms.ads.internal.client.zzdg.zzb(r2)     // Catch: android.os.RemoteException -> L76
            goto L69
        L68:
            r2 = r1
        L69:
            if (r2 == 0) goto L53
            java.util.List r3 = r5.zze     // Catch: android.os.RemoteException -> L76
            com.google.android.gms.ads.internal.client.zzdi r4 = new com.google.android.gms.ads.internal.client.zzdi     // Catch: android.os.RemoteException -> L76
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L76
            r3.add(r4)     // Catch: android.os.RemoteException -> L76
            goto L53
        L76:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r6)
        L7a:
            com.google.android.gms.internal.ads.zzbhz r6 = r5.zza     // Catch: android.os.RemoteException -> L88
            com.google.android.gms.internal.ads.zzbgc r6 = r6.zzk()     // Catch: android.os.RemoteException -> L88
            if (r6 == 0) goto L8c
            com.google.android.gms.internal.ads.zzbst r2 = new com.google.android.gms.internal.ads.zzbst     // Catch: android.os.RemoteException -> L88
            r2.<init>(r6)     // Catch: android.os.RemoteException -> L88
            goto L8d
        L88:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r6)
        L8c:
            r2 = r1
        L8d:
            r5.zzc = r2
            com.google.android.gms.internal.ads.zzbhz r6 = r5.zza     // Catch: android.os.RemoteException -> La4
            com.google.android.gms.internal.ads.zzbfv r6 = r6.zzi()     // Catch: android.os.RemoteException -> La4
            if (r6 == 0) goto La8
            com.google.android.gms.internal.ads.zzbsr r6 = new com.google.android.gms.internal.ads.zzbsr     // Catch: android.os.RemoteException -> La4
            com.google.android.gms.internal.ads.zzbhz r2 = r5.zza     // Catch: android.os.RemoteException -> La4
            com.google.android.gms.internal.ads.zzbfv r2 = r2.zzi()     // Catch: android.os.RemoteException -> La4
            r6.<init>(r2)     // Catch: android.os.RemoteException -> La4
            r1 = r6
            goto La8
        La4:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r6)
        La8:
            r5.zzd = r1
            return
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void cancelUnconfirmedClick() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r2.zza     // Catch: android.os.RemoteException -> L6
            r0.zzw()     // Catch: android.os.RemoteException -> L6
            return
        L6:
            r0 = move-exception
            java.lang.String r1 = "Failed to cancelUnconfirmedClick"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void destroy() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r2.zza     // Catch: android.os.RemoteException -> L6
            r0.zzx()     // Catch: android.os.RemoteException -> L6
            return
        L6:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void enableCustomClickGesture() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r2.zza     // Catch: android.os.RemoteException -> L6
            r0.zzD()     // Catch: android.os.RemoteException -> L6
            return
        L6:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo getAdChoicesInfo() {
            r1 = this;
            com.google.android.gms.ads.nativead.NativeAd$AdChoicesInfo r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.lang.String getAdvertiser() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r2.zza     // Catch: android.os.RemoteException -> L7
            java.lang.String r0 = r0.zzn()     // Catch: android.os.RemoteException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.lang.String getBody() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r2.zza     // Catch: android.os.RemoteException -> L7
            java.lang.String r0 = r0.zzo()     // Catch: android.os.RemoteException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.lang.String getCallToAction() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r2.zza     // Catch: android.os.RemoteException -> L7
            java.lang.String r0 = r0.zzp()     // Catch: android.os.RemoteException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final android.os.Bundle getExtras() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r2.zza     // Catch: android.os.RemoteException -> L9
            android.os.Bundle r0 = r0.zzf()     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Lf
            return r0
        L9:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
        Lf:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            return r0
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.lang.String getHeadline() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r2.zza     // Catch: android.os.RemoteException -> L7
            java.lang.String r0 = r0.zzq()     // Catch: android.os.RemoteException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final com.google.android.gms.ads.nativead.NativeAd.Image getIcon() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbst r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.util.List<com.google.android.gms.ads.nativead.NativeAd.Image> getImages() {
            r1 = this;
            java.util.List r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final com.google.android.gms.ads.MediaContent getMediaContent() {
            r3 = this;
            r0 = 0
            com.google.android.gms.internal.ads.zzbhz r1 = r3.zza     // Catch: android.os.RemoteException -> L15
            com.google.android.gms.internal.ads.zzbfz r1 = r1.zzj()     // Catch: android.os.RemoteException -> L15
            if (r1 == 0) goto L1b
            com.google.android.gms.ads.internal.client.zzfe r1 = new com.google.android.gms.ads.internal.client.zzfe     // Catch: android.os.RemoteException -> L15
            com.google.android.gms.internal.ads.zzbhz r2 = r3.zza     // Catch: android.os.RemoteException -> L15
            com.google.android.gms.internal.ads.zzbfz r2 = r2.zzj()     // Catch: android.os.RemoteException -> L15
            r1.<init>(r2, r0)     // Catch: android.os.RemoteException -> L15
            return r1
        L15:
            r1 = move-exception
            java.lang.String r2 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r1)
        L1b:
            return r0
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.util.List<com.google.android.gms.ads.MuteThisAdReason> getMuteThisAdReasons() {
            r1 = this;
            java.util.List r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.lang.String getPrice() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r2.zza     // Catch: android.os.RemoteException -> L7
            java.lang.String r0 = r0.zzs()     // Catch: android.os.RemoteException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final com.google.android.gms.ads.ResponseInfo getResponseInfo() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r2.zza     // Catch: android.os.RemoteException -> L7
            com.google.android.gms.ads.internal.client.zzdy r0 = r0.zzg()     // Catch: android.os.RemoteException -> L7
            goto Le
        L7:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            r0 = 0
        Le:
            com.google.android.gms.ads.ResponseInfo r0 = com.google.android.gms.ads.ResponseInfo.zza(r0)
            return r0
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.lang.Double getStarRating() {
            r6 = this;
            r0 = 0
            com.google.android.gms.internal.ads.zzbhz r1 = r6.zza     // Catch: android.os.RemoteException -> L13
            double r1 = r1.zze()     // Catch: android.os.RemoteException -> L13
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto Le
            goto L12
        Le:
            java.lang.Double r0 = java.lang.Double.valueOf(r1)     // Catch: android.os.RemoteException -> L13
        L12:
            return r0
        L13:
            r1 = move-exception
            java.lang.String r2 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r1)
            return r0
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final java.lang.String getStore() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r2.zza     // Catch: android.os.RemoteException -> L7
            java.lang.String r0 = r0.zzt()     // Catch: android.os.RemoteException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomClickGestureEnabled() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r2.zza     // Catch: android.os.RemoteException -> L7
            boolean r0 = r0.zzH()     // Catch: android.os.RemoteException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomMuteThisAdEnabled() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r2.zza     // Catch: android.os.RemoteException -> L7
            boolean r0 = r0.zzI()     // Catch: android.os.RemoteException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void muteThisAd(com.google.android.gms.ads.MuteThisAdReason r3) {
            r2 = this;
            java.lang.String r0 = ""
            com.google.android.gms.internal.ads.zzbhz r1 = r2.zza     // Catch: android.os.RemoteException -> L2a
            boolean r1 = r1.zzI()     // Catch: android.os.RemoteException -> L2a
            if (r1 != 0) goto Lb
            goto L2e
        Lb:
            if (r3 != 0) goto L14
            com.google.android.gms.internal.ads.zzbhz r3 = r2.zza     // Catch: android.os.RemoteException -> L34
            r1 = 0
            r3.zzy(r1)     // Catch: android.os.RemoteException -> L34
            return
        L14:
            boolean r1 = r3 instanceof com.google.android.gms.ads.internal.client.zzdi     // Catch: android.os.RemoteException -> L34
            if (r1 == 0) goto L24
            com.google.android.gms.internal.ads.zzbhz r1 = r2.zza     // Catch: android.os.RemoteException -> L34
            com.google.android.gms.ads.internal.client.zzdi r3 = (com.google.android.gms.ads.internal.client.zzdi) r3     // Catch: android.os.RemoteException -> L34
            com.google.android.gms.ads.internal.client.zzdh r3 = r3.zza()     // Catch: android.os.RemoteException -> L34
            r1.zzy(r3)     // Catch: android.os.RemoteException -> L34
            return
        L24:
            java.lang.String r3 = "Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null"
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r3)     // Catch: android.os.RemoteException -> L34
            return
        L2a:
            r3 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r3)     // Catch: android.os.RemoteException -> L34
        L2e:
            java.lang.String r3 = "Ad is not custom mute enabled"
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r3)     // Catch: android.os.RemoteException -> L34
            return
        L34:
            r3 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r3)
            return
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void performClick(android.os.Bundle r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r1.zza     // Catch: android.os.RemoteException -> L6
            r0.zzz(r2)     // Catch: android.os.RemoteException -> L6
            return
        L6:
            r2 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordCustomClickGesture() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r2.zza     // Catch: android.os.RemoteException -> L6
            r0.zzA()     // Catch: android.os.RemoteException -> L6
            return
        L6:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    protected final void recordEvent(android.os.Bundle r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r1.zza     // Catch: android.os.RemoteException -> L6
            r0.zzB(r2)     // Catch: android.os.RemoteException -> L6
            return
        L6:
            r2 = move-exception
            java.lang.String r0 = "Failed to record native event"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean recordImpression(android.os.Bundle r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r1.zza     // Catch: android.os.RemoteException -> L7
            boolean r2 = r0.zzJ(r2)     // Catch: android.os.RemoteException -> L7
            return r2
        L7:
            r2 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
            r2 = 0
            return r2
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void reportTouchEvent(android.os.Bundle r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r1.zza     // Catch: android.os.RemoteException -> L6
            r0.zzC(r2)     // Catch: android.os.RemoteException -> L6
            return
        L6:
            r2 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setMuteThisAdListener(com.google.android.gms.ads.MuteThisAdListener r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r2.zza     // Catch: android.os.RemoteException -> Lb
            com.google.android.gms.ads.internal.client.zzde r1 = new com.google.android.gms.ads.internal.client.zzde     // Catch: android.os.RemoteException -> Lb
            r1.<init>(r3)     // Catch: android.os.RemoteException -> Lb
            r0.zzE(r1)     // Catch: android.os.RemoteException -> Lb
            return
        Lb:
            r3 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r3)
            return
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setOnPaidEventListener(com.google.android.gms.ads.OnPaidEventListener r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r2.zza     // Catch: android.os.RemoteException -> Lb
            com.google.android.gms.ads.internal.client.zzft r1 = new com.google.android.gms.ads.internal.client.zzft     // Catch: android.os.RemoteException -> Lb
            r1.<init>(r3)     // Catch: android.os.RemoteException -> Lb
            r0.zzF(r1)     // Catch: android.os.RemoteException -> Lb
            return
        Lb:
            r3 = move-exception
            java.lang.String r0 = "Failed to setOnPaidEventListener"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r3)
            return
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setUnconfirmedClickListener(com.google.android.gms.ads.nativead.NativeAd.UnconfirmedClickListener r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r2.zza     // Catch: android.os.RemoteException -> Lb
            com.google.android.gms.internal.ads.zzbtc r1 = new com.google.android.gms.internal.ads.zzbtc     // Catch: android.os.RemoteException -> Lb
            r1.<init>(r3)     // Catch: android.os.RemoteException -> Lb
            r0.zzG(r1)     // Catch: android.os.RemoteException -> Lb
            return
        Lb:
            r3 = move-exception
            java.lang.String r0 = "Failed to setUnconfirmedClickListener"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r3)
            return
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r2.zza     // Catch: android.os.RemoteException -> L7
            com.google.android.gms.dynamic.IObjectWrapper r0 = r0.zzm()     // Catch: android.os.RemoteException -> L7
            goto Le
        L7:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            r0 = 0
        Le:
            return r0
    }
}
