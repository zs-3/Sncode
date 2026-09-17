package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdjl implements com.google.android.gms.internal.ads.zzdkx {
    private long zzA;
    private long zzB;
    private com.google.android.gms.ads.internal.client.zzdd zzC;
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdla zzb;
    private final org.json.JSONObject zzc;
    private final com.google.android.gms.internal.ads.zzdpt zzd;
    private final com.google.android.gms.internal.ads.zzdkp zze;
    private final com.google.android.gms.internal.ads.zzavn zzf;
    private final com.google.android.gms.internal.ads.zzcys zzg;
    private final com.google.android.gms.internal.ads.zzcxy zzh;
    private final com.google.android.gms.internal.ads.zzdfy zzi;
    private final com.google.android.gms.internal.ads.zzfgh zzj;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzk;
    private final com.google.android.gms.internal.ads.zzfhc zzl;
    private final com.google.android.gms.internal.ads.zzcpm zzm;
    private final com.google.android.gms.internal.ads.zzdlt zzn;
    private final com.google.android.gms.common.util.Clock zzo;
    private final com.google.android.gms.internal.ads.zzdfu zzp;
    private final com.google.android.gms.internal.ads.zzfng zzq;
    private final com.google.android.gms.internal.ads.zzdrj zzr;
    private final com.google.android.gms.internal.ads.zzfma zzs;
    private final com.google.android.gms.internal.ads.zzefj zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private android.graphics.Point zzy;
    private android.graphics.Point zzz;

    public zzdjl(android.content.Context r4, com.google.android.gms.internal.ads.zzdla r5, org.json.JSONObject r6, com.google.android.gms.internal.ads.zzdpt r7, com.google.android.gms.internal.ads.zzdkp r8, com.google.android.gms.internal.ads.zzavn r9, com.google.android.gms.internal.ads.zzcys r10, com.google.android.gms.internal.ads.zzcxy r11, com.google.android.gms.internal.ads.zzdfy r12, com.google.android.gms.internal.ads.zzfgh r13, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r14, com.google.android.gms.internal.ads.zzfhc r15, com.google.android.gms.internal.ads.zzcpm r16, com.google.android.gms.internal.ads.zzdlt r17, com.google.android.gms.common.util.Clock r18, com.google.android.gms.internal.ads.zzdfu r19, com.google.android.gms.internal.ads.zzfng r20, com.google.android.gms.internal.ads.zzfma r21, com.google.android.gms.internal.ads.zzefj r22, com.google.android.gms.internal.ads.zzdrj r23) {
            r3 = this;
            r0 = r3
            r3.<init>()
            r1 = 0
            r0.zzu = r1
            r0.zzw = r1
            r0.zzx = r1
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            r0.zzy = r1
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            r0.zzz = r1
            r1 = 0
            r0.zzA = r1
            r0.zzB = r1
            r1 = r4
            r0.zza = r1
            r1 = r5
            r0.zzb = r1
            r1 = r6
            r0.zzc = r1
            r1 = r7
            r0.zzd = r1
            r1 = r8
            r0.zze = r1
            r1 = r9
            r0.zzf = r1
            r1 = r10
            r0.zzg = r1
            r1 = r11
            r0.zzh = r1
            r1 = r12
            r0.zzi = r1
            r1 = r13
            r0.zzj = r1
            r1 = r14
            r0.zzk = r1
            r1 = r15
            r0.zzl = r1
            r1 = r16
            r0.zzm = r1
            r1 = r17
            r0.zzn = r1
            r1 = r18
            r0.zzo = r1
            r1 = r19
            r0.zzp = r1
            r1 = r20
            r0.zzq = r1
            r1 = r21
            r0.zzs = r1
            r1 = r22
            r0.zzt = r1
            r1 = r23
            r0.zzr = r1
            return
    }

    private final java.lang.String zzD(android.view.View r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzdw
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            com.google.android.gms.internal.ads.zzavn r0 = r3.zzf     // Catch: java.lang.Exception -> L21
            com.google.android.gms.internal.ads.zzavi r0 = r0.zzc()     // Catch: java.lang.Exception -> L21
            android.content.Context r2 = r3.zza     // Catch: java.lang.Exception -> L21
            java.lang.String r4 = r0.zzh(r2, r4, r1)     // Catch: java.lang.Exception -> L21
            return r4
        L21:
            java.lang.String r4 = "Exception getting data."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r4)
            return r1
    }

    private final java.lang.String zzE(android.view.View r3, java.util.Map r4) {
            r2 = this;
            if (r4 == 0) goto L31
            if (r3 == 0) goto L31
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        Lc:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto Lc
            java.lang.Object r3 = r0.getKey()
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L31:
            com.google.android.gms.internal.ads.zzdkp r3 = r2.zze
            int r3 = r3.zzc()
            r4 = 1
            if (r3 == r4) goto L48
            r4 = 2
            if (r3 == r4) goto L45
            r4 = 6
            if (r3 == r4) goto L42
            r3 = 0
            return r3
        L42:
            java.lang.String r3 = "3099"
            return r3
        L45:
            java.lang.String r3 = "2099"
            return r3
        L48:
            java.lang.String r3 = "1099"
            return r3
    }

    private final boolean zzF(java.lang.String r3) {
            r2 = this;
            org.json.JSONObject r0 = r2.zzc
            java.lang.String r1 = "allow_pub_event_reporting"
            org.json.JSONObject r0 = r0.optJSONObject(r1)
            r1 = 0
            if (r0 == 0) goto L13
            boolean r3 = r0.optBoolean(r3, r1)
            if (r3 == 0) goto L13
            r3 = 1
            return r3
        L13:
            return r1
    }

    private final boolean zzG() {
            r3 = this;
            org.json.JSONObject r0 = r3.zzc
            java.lang.String r1 = "allow_custom_click_gesture"
            r2 = 0
            boolean r0 = r0.optBoolean(r1, r2)
            return r0
    }

    private final boolean zzH(org.json.JSONObject r4, org.json.JSONObject r5, org.json.JSONObject r6, org.json.JSONObject r7, java.lang.String r8, org.json.JSONObject r9, boolean r10) {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Le3
            r0.<init>()     // Catch: org.json.JSONException -> Le3
            java.lang.String r1 = "ad"
            org.json.JSONObject r2 = r3.zzc     // Catch: org.json.JSONException -> Le3
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Le3
            java.lang.String r1 = "asset_view_signal"
            r0.put(r1, r5)     // Catch: org.json.JSONException -> Le3
            java.lang.String r5 = "ad_view_signal"
            r0.put(r5, r4)     // Catch: org.json.JSONException -> Le3
            java.lang.String r4 = "scroll_view_signal"
            r0.put(r4, r6)     // Catch: org.json.JSONException -> Le3
            java.lang.String r4 = "lock_screen_signal"
            r0.put(r4, r7)     // Catch: org.json.JSONException -> Le3
            java.lang.String r4 = "provided_signals"
            r0.put(r4, r9)     // Catch: org.json.JSONException -> Le3
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzdw     // Catch: org.json.JSONException -> Le3
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> Le3
            java.lang.Object r4 = r5.zza(r4)     // Catch: org.json.JSONException -> Le3
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: org.json.JSONException -> Le3
            boolean r4 = r4.booleanValue()     // Catch: org.json.JSONException -> Le3
            if (r4 == 0) goto L3c
            java.lang.String r4 = "view_signals"
            r0.put(r4, r8)     // Catch: org.json.JSONException -> Le3
        L3c:
            java.lang.String r4 = "policy_validator_enabled"
            r0.put(r4, r10)     // Catch: org.json.JSONException -> Le3
            java.lang.String r4 = "screen"
            android.content.Context r5 = r3.zza     // Catch: org.json.JSONException -> Le3
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> Le3
            r6.<init>()     // Catch: org.json.JSONException -> Le3
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: org.json.JSONException -> Le3
            java.lang.String r7 = "window"
            java.lang.Object r7 = r5.getSystemService(r7)     // Catch: org.json.JSONException -> Le3
            android.view.WindowManager r7 = (android.view.WindowManager) r7     // Catch: org.json.JSONException -> Le3
            android.util.DisplayMetrics r7 = com.google.android.gms.ads.internal.util.zzt.zzt(r7)     // Catch: org.json.JSONException -> Le3
            r8 = 0
            java.lang.String r9 = "width"
            int r10 = r7.widthPixels     // Catch: org.json.JSONException -> L79
            com.google.android.gms.ads.internal.util.client.zzf r1 = com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: org.json.JSONException -> L79
            int r10 = r1.zzb(r5, r10)     // Catch: org.json.JSONException -> L79
            r6.put(r9, r10)     // Catch: org.json.JSONException -> L79
            java.lang.String r9 = "height"
            int r7 = r7.heightPixels     // Catch: org.json.JSONException -> L79
            com.google.android.gms.ads.internal.util.client.zzf r10 = com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: org.json.JSONException -> L79
            int r5 = r10.zzb(r5, r7)     // Catch: org.json.JSONException -> L79
            r6.put(r9, r5)     // Catch: org.json.JSONException -> L79
            goto L7a
        L79:
            r6 = r8
        L7a:
            r0.put(r4, r6)     // Catch: org.json.JSONException -> Le3
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzih     // Catch: org.json.JSONException -> Le3
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> Le3
            java.lang.Object r4 = r5.zza(r4)     // Catch: org.json.JSONException -> Le3
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: org.json.JSONException -> Le3
            boolean r4 = r4.booleanValue()     // Catch: org.json.JSONException -> Le3
            if (r4 == 0) goto L9c
            com.google.android.gms.internal.ads.zzdpt r4 = r3.zzd     // Catch: org.json.JSONException -> Le3
            java.lang.String r5 = "/clickRecorded"
            com.google.android.gms.internal.ads.zzdji r6 = new com.google.android.gms.internal.ads.zzdji     // Catch: org.json.JSONException -> Le3
            r6.<init>(r3, r8)     // Catch: org.json.JSONException -> Le3
            r4.zzl(r5, r6)     // Catch: org.json.JSONException -> Le3
            goto La8
        L9c:
            com.google.android.gms.internal.ads.zzdpt r4 = r3.zzd     // Catch: org.json.JSONException -> Le3
            java.lang.String r5 = "/logScionEvent"
            com.google.android.gms.internal.ads.zzdjg r6 = new com.google.android.gms.internal.ads.zzdjg     // Catch: org.json.JSONException -> Le3
            r6.<init>(r3, r8)     // Catch: org.json.JSONException -> Le3
            r4.zzl(r5, r6)     // Catch: org.json.JSONException -> Le3
        La8:
            com.google.android.gms.internal.ads.zzdpt r4 = r3.zzd     // Catch: org.json.JSONException -> Le3
            java.lang.String r5 = "/nativeImpression"
            com.google.android.gms.internal.ads.zzdjk r6 = new com.google.android.gms.internal.ads.zzdjk     // Catch: org.json.JSONException -> Le3
            r6.<init>(r3, r8)     // Catch: org.json.JSONException -> Le3
            r4.zzl(r5, r6)     // Catch: org.json.JSONException -> Le3
            com.google.android.gms.internal.ads.zzdpt r4 = r3.zzd     // Catch: org.json.JSONException -> Le3
            java.lang.String r5 = "google.afma.nativeAds.handleImpression"
            com.google.common.util.concurrent.ListenableFuture r4 = r4.zzg(r5, r0)     // Catch: org.json.JSONException -> Le3
            java.lang.String r5 = "Error during performing handleImpression"
            com.google.android.gms.internal.ads.zzcaq.zza(r4, r5)     // Catch: org.json.JSONException -> Le3
            boolean r4 = r3.zzu
            if (r4 != 0) goto Le1
            com.google.android.gms.internal.ads.zzfgh r4 = r3.zzj
            android.content.Context r5 = r3.zza
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r6 = r3.zzk
            com.google.android.gms.internal.ads.zzfhc r7 = r3.zzl
            org.json.JSONObject r4 = r4.zzC
            com.google.android.gms.ads.internal.util.zzay r8 = com.google.android.gms.ads.internal.zzu.zzs()
            java.lang.String r6 = r6.afmaVersion
            java.lang.String r4 = r4.toString()
            java.lang.String r7 = r7.zzf
            boolean r4 = r8.zzn(r5, r6, r4, r7)
            r3.zzu = r4
        Le1:
            r4 = 1
            return r4
        Le3:
            r4 = move-exception
            java.lang.String r5 = "Unable to create impression JSON."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r5, r4)
            r4 = 0
            return r4
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzcxy zzb(com.google.android.gms.internal.ads.zzdjl r0) {
            com.google.android.gms.internal.ads.zzcxy r0 = r0.zzh
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzcys zzc(com.google.android.gms.internal.ads.zzdjl r0) {
            com.google.android.gms.internal.ads.zzcys r0 = r0.zzg
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdfy zzd(com.google.android.gms.internal.ads.zzdjl r0) {
            com.google.android.gms.internal.ads.zzdfy r0 = r0.zzi
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final boolean zzA() {
            r2 = this;
            int r0 = r2.zza()
            if (r0 == 0) goto L20
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzlg
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L19
            goto L20
        L19:
            com.google.android.gms.internal.ads.zzfhc r0 = r2.zzl
            com.google.android.gms.internal.ads.zzbfr r0 = r0.zzi
            boolean r0 = r0.zzj
            return r0
        L20:
            r0 = 1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final boolean zzB() {
            r1 = this;
            boolean r0 = r1.zzG()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final boolean zzC(android.os.Bundle r11) {
            r10 = this;
            java.lang.String r0 = "impression_reporting"
            boolean r0 = r10.zzF(r0)
            if (r0 != 0) goto Lf
            java.lang.String r11 = "The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r11)
            r11 = 0
            return r11
        Lf:
            com.google.android.gms.ads.internal.util.client.zzf r0 = com.google.android.gms.ads.internal.client.zzbc.zzb()
            r1 = 0
            org.json.JSONObject r8 = r0.zzk(r11, r1)
            com.google.android.gms.internal.ads.zzbcm r11 = com.google.android.gms.internal.ads.zzbcv.zzlc
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r11 = r0.zza(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L2e
            java.lang.String r1 = r10.zzD(r1)
        L2e:
            r7 = r1
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r9 = 0
            r2 = r10
            boolean r11 = r2.zzH(r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final int zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzfhc r0 = r2.zzl
            com.google.android.gms.internal.ads.zzbfr r0 = r0.zzi
            if (r0 == 0) goto L20
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzlg
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L19
            goto L20
        L19:
            com.google.android.gms.internal.ads.zzfhc r0 = r2.zzl
            com.google.android.gms.internal.ads.zzbfr r0 = r0.zzi
            int r0 = r0.zzi
            return r0
        L20:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final org.json.JSONObject zze(android.view.View r3, java.util.Map r4, java.util.Map r5, android.widget.ImageView.ScaleType r6) {
            r2 = this;
            android.content.Context r0 = r2.zza
            org.json.JSONObject r4 = com.google.android.gms.ads.internal.util.zzbv.zzd(r0, r4, r5, r3, r6)
            org.json.JSONObject r5 = com.google.android.gms.ads.internal.util.zzbv.zzg(r0, r3)
            org.json.JSONObject r6 = com.google.android.gms.ads.internal.util.zzbv.zzf(r3)
            org.json.JSONObject r3 = com.google.android.gms.ads.internal.util.zzbv.zze(r0, r3)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2c
            r0.<init>()     // Catch: org.json.JSONException -> L2c
            java.lang.String r1 = "asset_view_signal"
            r0.put(r1, r4)     // Catch: org.json.JSONException -> L2c
            java.lang.String r4 = "ad_view_signal"
            r0.put(r4, r5)     // Catch: org.json.JSONException -> L2c
            java.lang.String r4 = "scroll_view_signal"
            r0.put(r4, r6)     // Catch: org.json.JSONException -> L2c
            java.lang.String r4 = "lock_screen_signal"
            r0.put(r4, r3)     // Catch: org.json.JSONException -> L2c
            return r0
        L2c:
            r3 = move-exception
            java.lang.String r4 = "Unable to create native ad view signals JSON."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r4, r3)
            r3 = 0
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final org.json.JSONObject zzf(android.view.View r1, java.util.Map r2, java.util.Map r3, android.widget.ImageView.ScaleType r4) {
            r0 = this;
            org.json.JSONObject r1 = r0.zze(r1, r2, r3, r4)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            boolean r3 = r0.zzx     // Catch: org.json.JSONException -> L21
            if (r3 == 0) goto L19
            boolean r3 = r0.zzG()     // Catch: org.json.JSONException -> L21
            if (r3 == 0) goto L19
            java.lang.String r3 = "custom_click_gesture_eligible"
            r4 = 1
            r2.put(r3, r4)     // Catch: org.json.JSONException -> L21
        L19:
            if (r1 == 0) goto L27
            java.lang.String r3 = "nas"
            r2.put(r3, r1)     // Catch: org.json.JSONException -> L21
            goto L27
        L21:
            r1 = move-exception
            java.lang.String r3 = "Unable to create native click meta data JSON."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r3, r1)
        L27:
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzg() {
            r2 = this;
            com.google.android.gms.ads.internal.client.zzdd r0 = r2.zzC     // Catch: android.os.RemoteException -> L8
            if (r0 == 0) goto L7
            r0.zze()     // Catch: android.os.RemoteException -> L8
        L7:
            return
        L8:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzh() {
            r3 = this;
            org.json.JSONObject r0 = r3.zzc
            java.lang.String r1 = "custom_one_point_five_click_enabled"
            r2 = 0
            boolean r0 = r0.optBoolean(r1, r2)
            if (r0 != 0) goto Lc
            return
        Lc:
            com.google.android.gms.internal.ads.zzdlt r0 = r3.zzn
            r0.zzb()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzi() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdpt r0 = r1.zzd
            r0.zzi()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzj(com.google.android.gms.ads.internal.client.zzdh r4) {
            r3 = this;
            boolean r0 = r3.zzw     // Catch: android.os.RemoteException -> L36
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            if (r4 != 0) goto L25
            com.google.android.gms.internal.ads.zzdkp r1 = r3.zze     // Catch: android.os.RemoteException -> L36
            com.google.android.gms.ads.internal.client.zzfa r2 = r1.zzk()     // Catch: android.os.RemoteException -> L36
            if (r2 == 0) goto L25
            r3.zzw = r0     // Catch: android.os.RemoteException -> L36
            com.google.android.gms.internal.ads.zzfng r4 = r3.zzq     // Catch: android.os.RemoteException -> L36
            com.google.android.gms.ads.internal.client.zzfa r0 = r1.zzk()     // Catch: android.os.RemoteException -> L36
            java.lang.String r0 = r0.zzf()     // Catch: android.os.RemoteException -> L36
            com.google.android.gms.internal.ads.zzfma r1 = r3.zzs     // Catch: android.os.RemoteException -> L36
            r4.zzc(r0, r1)     // Catch: android.os.RemoteException -> L36
            r3.zzg()     // Catch: android.os.RemoteException -> L36
            return
        L25:
            r3.zzw = r0     // Catch: android.os.RemoteException -> L36
            com.google.android.gms.internal.ads.zzfng r0 = r3.zzq     // Catch: android.os.RemoteException -> L36
            java.lang.String r4 = r4.zzf()     // Catch: android.os.RemoteException -> L36
            com.google.android.gms.internal.ads.zzfma r1 = r3.zzs     // Catch: android.os.RemoteException -> L36
            r0.zzc(r4, r1)     // Catch: android.os.RemoteException -> L36
            r3.zzg()     // Catch: android.os.RemoteException -> L36
            return
        L36:
            r4 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzk(android.view.View r14, android.view.View r15, java.util.Map r16, java.util.Map r17, boolean r18, android.widget.ImageView.ScaleType r19) {
            r13 = this;
            r11 = r13
            r0 = r15
            r1 = r16
            android.content.Context r2 = r11.zza
            r3 = r17
            r4 = r19
            org.json.JSONObject r3 = com.google.android.gms.ads.internal.util.zzbv.zzd(r2, r1, r3, r15, r4)
            org.json.JSONObject r4 = com.google.android.gms.ads.internal.util.zzbv.zzg(r2, r15)
            org.json.JSONObject r5 = com.google.android.gms.ads.internal.util.zzbv.zzf(r15)
            org.json.JSONObject r6 = com.google.android.gms.ads.internal.util.zzbv.zze(r2, r15)
            r7 = r14
            java.lang.String r8 = r13.zzE(r14, r1)
            android.graphics.Point r1 = r11.zzz
            android.graphics.Point r9 = r11.zzy
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbv.zzc(r8, r2, r1, r9)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzdD
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 1
            if (r2 != r1) goto L3c
            r1 = r0
            goto L3d
        L3c:
            r1 = r7
        L3d:
            r10 = 0
            r12 = 0
            r0 = r13
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r18
            r10 = r12
            r0.zzn(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzl(java.lang.String r12) {
            r11 = this;
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r0 = r11
            r6 = r12
            r0.zzn(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzm(android.os.Bundle r14) {
            r13 = this;
            if (r14 != 0) goto L8
            java.lang.String r14 = "Click data is null. No click is reported."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r14)
            return
        L8:
            java.lang.String r0 = "click_reporting"
            boolean r0 = r13.zzF(r0)
            if (r0 != 0) goto L16
            java.lang.String r14 = "The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r14)
            return
        L16:
            java.lang.String r0 = "click_signal"
            android.os.Bundle r0 = r14.getBundle(r0)
            r1 = 0
            if (r0 == 0) goto L27
            java.lang.String r2 = "asset_id"
            java.lang.String r0 = r0.getString(r2)
            r8 = r0
            goto L28
        L27:
            r8 = r1
        L28:
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            com.google.android.gms.ads.internal.util.client.zzf r0 = com.google.android.gms.ads.internal.client.zzbc.zzb()
            org.json.JSONObject r10 = r0.zzk(r14, r1)
            r11 = 0
            r12 = 0
            r2 = r13
            r2.zzn(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    protected final void zzn(android.view.View r6, org.json.JSONObject r7, org.json.JSONObject r8, org.json.JSONObject r9, org.json.JSONObject r10, java.lang.String r11, org.json.JSONObject r12, org.json.JSONObject r13, boolean r14, boolean r15) {
            r5 = this;
            java.lang.String r0 = "tracking_urls_and_actions"
            java.lang.String r1 = "has_custom_click_handler"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1a7
            r2.<init>()     // Catch: org.json.JSONException -> L1a7
            java.lang.String r3 = "ad"
            org.json.JSONObject r4 = r5.zzc     // Catch: org.json.JSONException -> L1a7
            r2.put(r3, r4)     // Catch: org.json.JSONException -> L1a7
            java.lang.String r3 = "asset_view_signal"
            r2.put(r3, r8)     // Catch: org.json.JSONException -> L1a7
            java.lang.String r8 = "ad_view_signal"
            r2.put(r8, r7)     // Catch: org.json.JSONException -> L1a7
            java.lang.String r7 = "click_signal"
            r2.put(r7, r12)     // Catch: org.json.JSONException -> L1a7
            java.lang.String r7 = "scroll_view_signal"
            r2.put(r7, r9)     // Catch: org.json.JSONException -> L1a7
            java.lang.String r7 = "lock_screen_signal"
            r2.put(r7, r10)     // Catch: org.json.JSONException -> L1a7
            com.google.android.gms.internal.ads.zzdla r7 = r5.zzb     // Catch: org.json.JSONException -> L1a7
            com.google.android.gms.internal.ads.zzdkp r8 = r5.zze     // Catch: org.json.JSONException -> L1a7
            java.lang.String r8 = r8.zzA()     // Catch: org.json.JSONException -> L1a7
            com.google.android.gms.internal.ads.zzbhg r7 = r7.zzc(r8)     // Catch: org.json.JSONException -> L1a7
            r8 = 0
            r9 = 1
            if (r7 == 0) goto L3b
            r7 = 1
            goto L3c
        L3b:
            r7 = 0
        L3c:
            r2.put(r1, r7)     // Catch: org.json.JSONException -> L1a7
            java.lang.String r7 = "provided_signals"
            r2.put(r7, r13)     // Catch: org.json.JSONException -> L1a7
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1a7
            r7.<init>()     // Catch: org.json.JSONException -> L1a7
            java.lang.String r10 = "asset_id"
            r7.put(r10, r11)     // Catch: org.json.JSONException -> L1a7
            java.lang.String r10 = "template"
            com.google.android.gms.internal.ads.zzdkp r11 = r5.zze     // Catch: org.json.JSONException -> L1a7
            int r11 = r11.zzc()     // Catch: org.json.JSONException -> L1a7
            r7.put(r10, r11)     // Catch: org.json.JSONException -> L1a7
            java.lang.String r10 = "view_aware_api_used"
            r7.put(r10, r14)     // Catch: org.json.JSONException -> L1a7
            java.lang.String r10 = "custom_mute_requested"
            com.google.android.gms.internal.ads.zzfhc r11 = r5.zzl     // Catch: org.json.JSONException -> L1a7
            com.google.android.gms.internal.ads.zzbfr r11 = r11.zzi     // Catch: org.json.JSONException -> L1a7
            if (r11 == 0) goto L6c
            boolean r11 = r11.zzg     // Catch: org.json.JSONException -> L1a7
            if (r11 == 0) goto L6c
            r11 = 1
            goto L6d
        L6c:
            r11 = 0
        L6d:
            r7.put(r10, r11)     // Catch: org.json.JSONException -> L1a7
            java.lang.String r10 = "custom_mute_enabled"
            com.google.android.gms.internal.ads.zzdkp r11 = r5.zze     // Catch: org.json.JSONException -> L1a7
            java.util.List r11 = r11.zzH()     // Catch: org.json.JSONException -> L1a7
            boolean r11 = r11.isEmpty()     // Catch: org.json.JSONException -> L1a7
            if (r11 != 0) goto L88
            com.google.android.gms.internal.ads.zzdkp r11 = r5.zze     // Catch: org.json.JSONException -> L1a7
            com.google.android.gms.ads.internal.client.zzfa r11 = r11.zzk()     // Catch: org.json.JSONException -> L1a7
            if (r11 == 0) goto L88
            r11 = 1
            goto L89
        L88:
            r11 = 0
        L89:
            r7.put(r10, r11)     // Catch: org.json.JSONException -> L1a7
            com.google.android.gms.internal.ads.zzdlt r10 = r5.zzn     // Catch: org.json.JSONException -> L1a7
            com.google.android.gms.internal.ads.zzbhw r10 = r10.zza()     // Catch: org.json.JSONException -> L1a7
            if (r10 == 0) goto La3
            org.json.JSONObject r10 = r5.zzc     // Catch: org.json.JSONException -> L1a7
            java.lang.String r11 = "custom_one_point_five_click_enabled"
            boolean r10 = r10.optBoolean(r11, r8)     // Catch: org.json.JSONException -> L1a7
            if (r10 == 0) goto La3
            java.lang.String r10 = "custom_one_point_five_click_eligible"
            r7.put(r10, r9)     // Catch: org.json.JSONException -> L1a7
        La3:
            java.lang.String r10 = "timestamp"
            com.google.android.gms.common.util.Clock r11 = r5.zzo     // Catch: org.json.JSONException -> L1a7
            long r11 = r11.currentTimeMillis()     // Catch: org.json.JSONException -> L1a7
            r7.put(r10, r11)     // Catch: org.json.JSONException -> L1a7
            boolean r10 = r5.zzx     // Catch: org.json.JSONException -> L1a7
            if (r10 == 0) goto Lbd
            boolean r10 = r5.zzG()     // Catch: org.json.JSONException -> L1a7
            if (r10 == 0) goto Lbd
            java.lang.String r10 = "custom_click_gesture_eligible"
            r7.put(r10, r9)     // Catch: org.json.JSONException -> L1a7
        Lbd:
            if (r15 == 0) goto Lc4
            java.lang.String r10 = "is_custom_click_gesture"
            r7.put(r10, r9)     // Catch: org.json.JSONException -> L1a7
        Lc4:
            com.google.android.gms.internal.ads.zzdla r10 = r5.zzb     // Catch: org.json.JSONException -> L1a7
            com.google.android.gms.internal.ads.zzdkp r11 = r5.zze     // Catch: org.json.JSONException -> L1a7
            java.lang.String r11 = r11.zzA()     // Catch: org.json.JSONException -> L1a7
            com.google.android.gms.internal.ads.zzbhg r10 = r10.zzc(r11)     // Catch: org.json.JSONException -> L1a7
            if (r10 == 0) goto Ld3
            r8 = 1
        Ld3:
            r7.put(r1, r8)     // Catch: org.json.JSONException -> L1a7
            java.lang.String r8 = "click_signals"
            r10 = 0
            org.json.JSONObject r11 = r5.zzc     // Catch: java.lang.Exception -> Lf9
            org.json.JSONObject r11 = r11.optJSONObject(r0)     // Catch: java.lang.Exception -> Lf9
            if (r11 != 0) goto Le6
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lf9
            r11.<init>()     // Catch: java.lang.Exception -> Lf9
        Le6:
            java.lang.String r12 = "click_string"
            java.lang.String r11 = r11.optString(r12)     // Catch: java.lang.Exception -> Lf9
            com.google.android.gms.internal.ads.zzavn r12 = r5.zzf     // Catch: java.lang.Exception -> Lf9
            com.google.android.gms.internal.ads.zzavi r12 = r12.zzc()     // Catch: java.lang.Exception -> Lf9
            android.content.Context r13 = r5.zza     // Catch: java.lang.Exception -> Lf9
            java.lang.String r6 = r12.zze(r13, r11, r6)     // Catch: java.lang.Exception -> Lf9
            goto L100
        Lf9:
            r6 = move-exception
            java.lang.String r11 = "Exception obtaining click signals"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r11, r6)     // Catch: org.json.JSONException -> L1a7
            r6 = r10
        L100:
            r7.put(r8, r6)     // Catch: org.json.JSONException -> L1a7
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzez     // Catch: org.json.JSONException -> L1a7
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L1a7
            java.lang.Object r6 = r8.zza(r6)     // Catch: org.json.JSONException -> L1a7
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: org.json.JSONException -> L1a7
            boolean r6 = r6.booleanValue()     // Catch: org.json.JSONException -> L1a7
            if (r6 == 0) goto L11a
            java.lang.String r6 = "open_chrome_custom_tab"
            r7.put(r6, r9)     // Catch: org.json.JSONException -> L1a7
        L11a:
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzil     // Catch: org.json.JSONException -> L1a7
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L1a7
            java.lang.Object r6 = r8.zza(r6)     // Catch: org.json.JSONException -> L1a7
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: org.json.JSONException -> L1a7
            boolean r6 = r6.booleanValue()     // Catch: org.json.JSONException -> L1a7
            if (r6 == 0) goto L137
            boolean r6 = com.google.android.gms.common.util.PlatformVersion.isAtLeastR()     // Catch: org.json.JSONException -> L1a7
            if (r6 == 0) goto L137
            java.lang.String r6 = "try_fallback_for_deep_link"
            r7.put(r6, r9)     // Catch: org.json.JSONException -> L1a7
        L137:
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzim     // Catch: org.json.JSONException -> L1a7
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L1a7
            java.lang.Object r6 = r8.zza(r6)     // Catch: org.json.JSONException -> L1a7
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: org.json.JSONException -> L1a7
            boolean r6 = r6.booleanValue()     // Catch: org.json.JSONException -> L1a7
            if (r6 == 0) goto L154
            boolean r6 = com.google.android.gms.common.util.PlatformVersion.isAtLeastR()     // Catch: org.json.JSONException -> L1a7
            if (r6 == 0) goto L154
            java.lang.String r6 = "in_app_link_handling_for_android_11_enabled"
            r7.put(r6, r9)     // Catch: org.json.JSONException -> L1a7
        L154:
            java.lang.String r6 = "click"
            r2.put(r6, r7)     // Catch: org.json.JSONException -> L1a7
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1a7
            r6.<init>()     // Catch: org.json.JSONException -> L1a7
            com.google.android.gms.common.util.Clock r7 = r5.zzo     // Catch: org.json.JSONException -> L1a7
            long r7 = r7.currentTimeMillis()     // Catch: org.json.JSONException -> L1a7
            java.lang.String r9 = "time_from_last_touch_down"
            long r11 = r5.zzA     // Catch: org.json.JSONException -> L1a7
            long r11 = r7 - r11
            r6.put(r9, r11)     // Catch: org.json.JSONException -> L1a7
            java.lang.String r9 = "time_from_last_touch"
            long r11 = r5.zzB     // Catch: org.json.JSONException -> L1a7
            long r7 = r7 - r11
            r6.put(r9, r7)     // Catch: org.json.JSONException -> L1a7
            java.lang.String r7 = "touch_signal"
            r2.put(r7, r6)     // Catch: org.json.JSONException -> L1a7
            com.google.android.gms.internal.ads.zzfgh r6 = r5.zzj     // Catch: org.json.JSONException -> L1a7
            boolean r6 = r6.zzai     // Catch: org.json.JSONException -> L1a7
            if (r6 == 0) goto L199
            org.json.JSONObject r6 = r5.zzc     // Catch: org.json.JSONException -> L1a7
            java.lang.Object r6 = r6.get(r0)     // Catch: org.json.JSONException -> L1a7
            org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch: org.json.JSONException -> L1a7
            if (r6 == 0) goto L190
            java.lang.String r7 = "gws_query_id"
            java.lang.String r10 = r6.getString(r7)     // Catch: org.json.JSONException -> L1a7
        L190:
            if (r10 == 0) goto L199
            com.google.android.gms.internal.ads.zzefj r6 = r5.zzt     // Catch: org.json.JSONException -> L1a7
            com.google.android.gms.internal.ads.zzdkp r7 = r5.zze     // Catch: org.json.JSONException -> L1a7
            r6.zzq(r10, r7)     // Catch: org.json.JSONException -> L1a7
        L199:
            com.google.android.gms.internal.ads.zzdpt r6 = r5.zzd     // Catch: org.json.JSONException -> L1a7
            java.lang.String r7 = "google.afma.nativeAds.handleClick"
            com.google.common.util.concurrent.ListenableFuture r6 = r6.zzg(r7, r2)     // Catch: org.json.JSONException -> L1a7
            java.lang.String r7 = "Error during performing handleClick"
            com.google.android.gms.internal.ads.zzcaq.zza(r6, r7)     // Catch: org.json.JSONException -> L1a7
            return
        L1a7:
            r6 = move-exception
            java.lang.String r7 = "Unable to create click JSON."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r7, r6)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzo(android.view.View r17, android.view.View r18, java.util.Map r19, java.util.Map r20, boolean r21, android.widget.ImageView.ScaleType r22, int r23) {
            r16 = this;
            r12 = r16
            r2 = r18
            r0 = r19
            org.json.JSONObject r1 = r12.zzc
            java.lang.String r3 = "allow_sdk_custom_click_gesture"
            r4 = 0
            boolean r1 = r1.optBoolean(r3, r4)
            if (r1 == 0) goto L24
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzlg
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r3.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L24
            r4 = 1
        L24:
            if (r4 != 0) goto L3d
            boolean r1 = r12.zzx
            if (r1 != 0) goto L30
            java.lang.String r0 = "Custom click reporting failed. enableCustomClickGesture is not set."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            return
        L30:
            boolean r1 = r16.zzG()
            if (r1 == 0) goto L37
            goto L3d
        L37:
            java.lang.String r0 = "Custom click reporting failed. Ad unit id not in the allow list."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)
            return
        L3d:
            android.content.Context r1 = r12.zza
            r3 = r20
            r5 = r22
            org.json.JSONObject r5 = com.google.android.gms.ads.internal.util.zzbv.zzd(r1, r0, r3, r2, r5)
            android.content.Context r1 = r12.zza
            org.json.JSONObject r3 = com.google.android.gms.ads.internal.util.zzbv.zzg(r1, r2)
            org.json.JSONObject r6 = com.google.android.gms.ads.internal.util.zzbv.zzf(r18)
            android.content.Context r1 = r12.zza
            org.json.JSONObject r7 = com.google.android.gms.ads.internal.util.zzbv.zze(r1, r2)
            r1 = r17
            java.lang.String r8 = r12.zzE(r1, r0)
            android.content.Context r0 = r12.zza
            android.graphics.Point r1 = r12.zzz
            android.graphics.Point r9 = r12.zzy
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbv.zzc(r8, r0, r1, r9)
            if (r4 == 0) goto Lcb
            org.json.JSONObject r1 = r12.zzc     // Catch: org.json.JSONException -> Lbc
            java.lang.String r4 = "custom_click_gesture_signal"
            android.graphics.Point r0 = r12.zzz     // Catch: org.json.JSONException -> Lbc
            android.graphics.Point r10 = r12.zzy     // Catch: org.json.JSONException -> Lbc
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lb0
            r11.<init>()     // Catch: java.lang.Exception -> Lb0
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lae
            r13.<init>()     // Catch: java.lang.Exception -> Lae
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lae
            r14.<init>()     // Catch: java.lang.Exception -> Lae
            java.lang.String r15 = "y"
            java.lang.String r2 = "x"
            if (r0 == 0) goto L90
            int r12 = r0.x     // Catch: java.lang.Exception -> Lae
            r13.put(r2, r12)     // Catch: java.lang.Exception -> Lae
            int r0 = r0.y     // Catch: java.lang.Exception -> Lae
            r13.put(r15, r0)     // Catch: java.lang.Exception -> Lae
        L90:
            if (r10 == 0) goto L9c
            int r0 = r10.x     // Catch: java.lang.Exception -> Lae
            r14.put(r2, r0)     // Catch: java.lang.Exception -> Lae
            int r0 = r10.y     // Catch: java.lang.Exception -> Lae
            r14.put(r15, r0)     // Catch: java.lang.Exception -> Lae
        L9c:
            java.lang.String r0 = "start_point"
            r11.put(r0, r13)     // Catch: java.lang.Exception -> Lae
            java.lang.String r0 = "end_point"
            r11.put(r0, r14)     // Catch: java.lang.Exception -> Lae
            java.lang.String r0 = "duration_ms"
            r2 = r23
            r11.put(r0, r2)     // Catch: java.lang.Exception -> Lae
            goto Lb8
        Lae:
            r0 = move-exception
            goto Lb3
        Lb0:
            r0 = move-exception
            r2 = 0
            r11 = r2
        Lb3:
            java.lang.String r2 = "Error occurred while grabbing custom click gesture signals."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r0)     // Catch: org.json.JSONException -> Lbc
        Lb8:
            r1.put(r4, r11)     // Catch: org.json.JSONException -> Lbc
            goto Lcb
        Lbc:
            r0 = move-exception
            java.lang.String r1 = "Error occurred while adding CustomClickGestureSignals to adJson."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r2 = "FirstPartyNativeAdCore.performCustomClickGesture"
            r1.zzw(r0, r2)
        Lcb:
            r0 = 0
            r11 = 1
            r1 = r16
            r2 = r18
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r0
            r10 = r21
            r1.zzn(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzp() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1a
            r0.<init>()     // Catch: org.json.JSONException -> L1a
            java.lang.String r1 = "ad"
            org.json.JSONObject r2 = r3.zzc     // Catch: org.json.JSONException -> L1a
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L1a
            com.google.android.gms.internal.ads.zzdpt r1 = r3.zzd     // Catch: org.json.JSONException -> L1a
            java.lang.String r2 = "google.afma.nativeAds.handleDownloadedImpression"
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzg(r2, r0)     // Catch: org.json.JSONException -> L1a
            java.lang.String r1 = "Error during performing handleDownloadedImpression"
            com.google.android.gms.internal.ads.zzcaq.zza(r0, r1)     // Catch: org.json.JSONException -> L1a
            return
        L1a:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzq(android.view.View r10, java.util.Map r11, java.util.Map r12, android.widget.ImageView.ScaleType r13) {
            r9 = this;
            android.content.Context r0 = r9.zza
            org.json.JSONObject r3 = com.google.android.gms.ads.internal.util.zzbv.zzd(r0, r11, r12, r10, r13)
            org.json.JSONObject r2 = com.google.android.gms.ads.internal.util.zzbv.zzg(r0, r10)
            org.json.JSONObject r4 = com.google.android.gms.ads.internal.util.zzbv.zzf(r10)
            org.json.JSONObject r5 = com.google.android.gms.ads.internal.util.zzbv.zze(r0, r10)
            java.lang.String r6 = r9.zzD(r10)
            com.google.android.gms.internal.ads.zzfgh r10 = r9.zzj
            boolean r8 = com.google.android.gms.ads.internal.util.zzbv.zzh(r0, r10)
            r7 = 0
            r1 = r9
            r1.zzH(r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzr() {
            r8 = this;
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r8
            r0.zzH(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzs(android.view.View r3, android.view.MotionEvent r4, android.view.View r5) {
            r2 = this;
            android.graphics.Point r3 = com.google.android.gms.ads.internal.util.zzbv.zza(r4, r5)
            r2.zzy = r3
            com.google.android.gms.common.util.Clock r3 = r2.zzo
            long r0 = r3.currentTimeMillis()
            r2.zzB = r0
            int r3 = r4.getAction()
            if (r3 != 0) goto L1f
            com.google.android.gms.internal.ads.zzdrj r3 = r2.zzr
            r3.zzb(r4)
            r2.zzA = r0
            android.graphics.Point r3 = r2.zzy
            r2.zzz = r3
        L1f:
            android.view.MotionEvent r3 = android.view.MotionEvent.obtain(r4)
            android.graphics.Point r4 = r2.zzy
            int r5 = r4.x
            float r5 = (float) r5
            int r4 = r4.y
            float r4 = (float) r4
            r3.setLocation(r5, r4)
            com.google.android.gms.internal.ads.zzavn r4 = r2.zzf
            r4.zzd(r3)
            r3.recycle()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzt(android.os.Bundle r4) {
            r3 = this;
            if (r4 != 0) goto L8
            java.lang.String r4 = "Touch event data is null. No touch event is reported."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r4)
            return
        L8:
            java.lang.String r0 = "touch_reporting"
            boolean r0 = r3.zzF(r0)
            if (r0 != 0) goto L16
            java.lang.String r4 = "The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r4)
            return
        L16:
            java.lang.String r0 = "x"
            float r0 = r4.getFloat(r0)
            int r0 = (int) r0
            java.lang.String r1 = "y"
            float r1 = r4.getFloat(r1)
            int r1 = (int) r1
            java.lang.String r2 = "duration_ms"
            int r4 = r4.getInt(r2)
            com.google.android.gms.internal.ads.zzavn r2 = r3.zzf
            com.google.android.gms.internal.ads.zzavi r2 = r2.zzc()
            r2.zzl(r0, r1, r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzu(android.view.View r4) {
            r3 = this;
            org.json.JSONObject r0 = r3.zzc
            java.lang.String r1 = "custom_one_point_five_click_enabled"
            r2 = 0
            boolean r0 = r0.optBoolean(r1, r2)
            if (r0 != 0) goto L11
            java.lang.String r4 = "setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
            return
        L11:
            com.google.android.gms.internal.ads.zzdlt r0 = r3.zzn
            if (r4 != 0) goto L16
            return
        L16:
            r4.setOnClickListener(r0)
            r1 = 1
            r4.setClickable(r1)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r4)
            r0.zzc = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzv() {
            r1 = this;
            r0 = 1
            r1.zzx = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzw(com.google.android.gms.ads.internal.client.zzdd r1) {
            r0 = this;
            r0.zzC = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzx(com.google.android.gms.internal.ads.zzbhw r4) {
            r3 = this;
            org.json.JSONObject r0 = r3.zzc
            java.lang.String r1 = "custom_one_point_five_click_enabled"
            r2 = 0
            boolean r0 = r0.optBoolean(r1, r2)
            if (r0 != 0) goto L11
            java.lang.String r4 = "setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
            return
        L11:
            com.google.android.gms.internal.ads.zzdlt r0 = r3.zzn
            r0.zzc(r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzy(android.view.View r3, java.util.Map r4, java.util.Map r5, android.view.View.OnTouchListener r6, android.view.View.OnClickListener r7) {
            r2 = this;
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            r2.zzy = r0
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            r2.zzz = r0
            boolean r0 = r2.zzv
            r1 = 1
            if (r0 != 0) goto L1a
            com.google.android.gms.internal.ads.zzdfu r0 = r2.zzp
            r0.zza(r3)
            r2.zzv = r1
        L1a:
            r3.setOnTouchListener(r6)
            r3.setClickable(r1)
            r3.setOnClickListener(r7)
            com.google.android.gms.internal.ads.zzcpm r3 = r2.zzm
            r3.zzi(r2)
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = r2.zzk
            int r3 = r3.clientJarVersion
            boolean r3 = com.google.android.gms.ads.internal.util.zzbv.zzi(r3)
            if (r4 == 0) goto L60
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L3a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L60
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L3a
            if (r3 == 0) goto L59
            r0.setOnTouchListener(r6)
        L59:
            r0.setClickable(r1)
            r0.setOnClickListener(r7)
            goto L3a
        L60:
            if (r5 == 0) goto L8e
            java.util.Set r4 = r5.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L6a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L8e
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getValue()
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L6a
            if (r3 == 0) goto L89
            r5.setOnTouchListener(r6)
        L89:
            r7 = 0
            r5.setClickable(r7)
            goto L6a
        L8e:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzz(android.view.View r1, java.util.Map r2) {
            r0 = this;
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            r0.zzy = r2
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            r0.zzz = r2
            if (r1 == 0) goto L15
            com.google.android.gms.internal.ads.zzdfu r2 = r0.zzp
            r2.zzb(r1)
        L15:
            r1 = 0
            r0.zzv = r1
            return
    }
}
