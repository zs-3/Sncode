package com.google.android.gms.ads.internal;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzt extends com.google.android.gms.ads.internal.client.zzbx {
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zza;
    private final com.google.android.gms.ads.internal.client.zzs zzb;
    private final java.util.concurrent.Future zzc;
    private final android.content.Context zzd;
    private final com.google.android.gms.ads.internal.zzs zze;
    private android.webkit.WebView zzf;
    private com.google.android.gms.ads.internal.client.zzbl zzg;
    private com.google.android.gms.internal.ads.zzavn zzh;
    private android.os.AsyncTask zzi;

    public zzt(android.content.Context r1, com.google.android.gms.ads.internal.client.zzs r2, java.lang.String r3, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4) {
            r0 = this;
            r0.<init>()
            r0.zzd = r1
            r0.zza = r4
            r0.zzb = r2
            android.webkit.WebView r2 = new android.webkit.WebView
            r2.<init>(r1)
            r0.zzf = r2
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zza
            com.google.android.gms.ads.internal.zzp r4 = new com.google.android.gms.ads.internal.zzp
            r4.<init>(r0)
            com.google.common.util.concurrent.ListenableFuture r2 = r2.zzb(r4)
            r0.zzc = r2
            com.google.android.gms.ads.internal.zzs r2 = new com.google.android.gms.ads.internal.zzs
            r2.<init>(r1, r3)
            r0.zze = r2
            r1 = 0
            r0.zzV(r1)
            android.webkit.WebView r2 = r0.zzf
            r2.setVerticalScrollBarEnabled(r1)
            android.webkit.WebView r1 = r0.zzf
            android.webkit.WebSettings r1 = r1.getSettings()
            r2 = 1
            r1.setJavaScriptEnabled(r2)
            android.webkit.WebView r1 = r0.zzf
            com.google.android.gms.ads.internal.zzn r2 = new com.google.android.gms.ads.internal.zzn
            r2.<init>(r0)
            r1.setWebViewClient(r2)
            android.webkit.WebView r1 = r0.zzf
            com.google.android.gms.ads.internal.zzo r2 = new com.google.android.gms.ads.internal.zzo
            r2.<init>(r0)
            r1.setOnTouchListener(r2)
            return
    }

    static /* bridge */ /* synthetic */ android.content.Context zzc(com.google.android.gms.ads.internal.zzt r0) {
            android.content.Context r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ android.webkit.WebView zze(com.google.android.gms.ads.internal.zzt r0) {
            android.webkit.WebView r0 = r0.zzf
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzavn zzf(com.google.android.gms.ads.internal.zzt r0) {
            com.google.android.gms.internal.ads.zzavn r0 = r0.zzh
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzbl zzh(com.google.android.gms.ads.internal.zzt r0) {
            com.google.android.gms.ads.internal.client.zzbl r0 = r0.zzg
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzm(com.google.android.gms.ads.internal.zzt r0) {
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String zzo(com.google.android.gms.ads.internal.zzt r2, java.lang.String r3) {
            com.google.android.gms.internal.ads.zzavn r0 = r2.zzh
            if (r0 == 0) goto L1c
            android.net.Uri r3 = android.net.Uri.parse(r3)
            com.google.android.gms.internal.ads.zzavn r0 = r2.zzh     // Catch: com.google.android.gms.internal.ads.zzavo -> L12
            android.content.Context r2 = r2.zzd     // Catch: com.google.android.gms.internal.ads.zzavo -> L12
            r1 = 0
            android.net.Uri r3 = r0.zza(r3, r2, r1, r1)     // Catch: com.google.android.gms.internal.ads.zzavo -> L12
            goto L18
        L12:
            r2 = move-exception
            java.lang.String r0 = "Unable to process ad data"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r0, r2)
        L18:
            java.lang.String r3 = r3.toString()
        L1c:
            return r3
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.Future zzu(com.google.android.gms.ads.internal.zzt r0) {
            java.util.concurrent.Future r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ void zzv(com.google.android.gms.ads.internal.zzt r0, com.google.android.gms.internal.ads.zzavn r1) {
            r0.zzh = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzw(com.google.android.gms.ads.internal.zzt r2, java.lang.String r3) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r0.setData(r3)
            android.content.Context r2 = r2.zzd
            r2.startActivity(r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzA() throws android.os.RemoteException {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unused method"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzB() throws android.os.RemoteException {
            r1 = this;
            java.lang.String r0 = "resume must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(com.google.android.gms.ads.internal.client.zzbi r2) throws android.os.RemoteException {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unused method"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(com.google.android.gms.ads.internal.client.zzbl r1) throws android.os.RemoteException {
            r0 = this;
            r0.zzg = r1
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(com.google.android.gms.ads.internal.client.zzcc r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unused method"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzF(com.google.android.gms.ads.internal.client.zzs r2) throws android.os.RemoteException {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "AdSize must be set before initialization"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(com.google.android.gms.ads.internal.client.zzcm r2) throws android.os.RemoteException {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unused method"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(com.google.android.gms.internal.ads.zzbar r2) throws android.os.RemoteException {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unused method"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(com.google.android.gms.ads.internal.client.zzy r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unused method"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(com.google.android.gms.ads.internal.client.zzct r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(com.google.android.gms.ads.internal.client.zzef r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unused method"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzL(boolean r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unused method"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(com.google.android.gms.internal.ads.zzbtv r2) throws android.os.RemoteException {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unused method"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzN(boolean r1) throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzO(com.google.android.gms.internal.ads.zzbdq r2) throws android.os.RemoteException {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unused method"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(com.google.android.gms.ads.internal.client.zzdr r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(com.google.android.gms.internal.ads.zzbty r1, java.lang.String r2) throws android.os.RemoteException {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unused method"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(java.lang.String r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unused method"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(com.google.android.gms.internal.ads.zzbws r2) throws android.os.RemoteException {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unused method"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(java.lang.String r2) throws android.os.RemoteException {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unused method"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzU(com.google.android.gms.ads.internal.client.zzgb r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unused method"
            r2.<init>(r0)
            throw r2
    }

    final void zzV(int r3) {
            r2 = this;
            android.webkit.WebView r0 = r2.zzf
            if (r0 != 0) goto L5
            return
        L5:
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r0.<init>(r1, r3)
            android.webkit.WebView r3 = r2.zzf
            r3.setLayoutParams(r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(com.google.android.gms.dynamic.IObjectWrapper r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzX() throws android.os.RemoteException {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unused method"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzY() throws android.os.RemoteException {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzZ() throws android.os.RemoteException {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() throws android.os.RemoteException {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzab(com.google.android.gms.ads.internal.client.zzm r3) throws android.os.RemoteException {
            r2 = this;
            android.webkit.WebView r0 = r2.zzf
            java.lang.String r1 = "This Search Ad has already been torn down"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r2.zza
            com.google.android.gms.ads.internal.zzs r1 = r2.zze
            r1.zzf(r3, r0)
            com.google.android.gms.ads.internal.zzr r3 = new com.google.android.gms.ads.internal.zzr
            r0 = 0
            r3.<init>(r2, r0)
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            android.os.AsyncTask r3 = r3.execute(r0)
            r2.zzi = r3
            r3 = 1
            return r3
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzac(com.google.android.gms.ads.internal.client.zzcq r2) throws android.os.RemoteException {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unused method"
            r2.<init>(r0)
            throw r2
    }

    final int zzb(java.lang.String r3) {
            r2 = this;
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r0 = "height"
            java.lang.String r3 = r3.getQueryParameter(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L12
            return r1
        L12:
            com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: java.lang.NumberFormatException -> L20
            android.content.Context r0 = r2.zzd     // Catch: java.lang.NumberFormatException -> L20
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L20
            int r3 = com.google.android.gms.ads.internal.util.client.zzf.zzy(r0, r3)     // Catch: java.lang.NumberFormatException -> L20
            return r3
        L20:
            return r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final android.os.Bundle zzd() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unused method"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzs zzg() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzs r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzbl zzi() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "getIAdListener not implemented"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzcm zzj() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "getIAppEventListener not implemented"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzdy zzk() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzeb zzl() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.dynamic.IObjectWrapper zzn() throws android.os.RemoteException {
            r1 = this;
            java.lang.String r0 = "getAdFrame must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            android.webkit.WebView r0 = r1.zzf
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            return r0
    }

    final java.lang.String zzp() {
            r5 = this;
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = "https://"
            android.net.Uri$Builder r1 = r0.scheme(r1)
            com.google.android.gms.internal.ads.zzbeb r2 = com.google.android.gms.internal.ads.zzbed.zzd
            java.lang.Object r2 = r2.zze()
            java.lang.String r2 = (java.lang.String) r2
            r1.appendEncodedPath(r2)
            com.google.android.gms.ads.internal.zzs r1 = r5.zze
            java.lang.String r1 = r1.zzd()
            java.lang.String r2 = "query"
            r0.appendQueryParameter(r2, r1)
            com.google.android.gms.ads.internal.zzs r1 = r5.zze
            java.lang.String r1 = r1.zzc()
            java.lang.String r2 = "pubId"
            r0.appendQueryParameter(r2, r1)
            com.google.android.gms.ads.internal.zzs r1 = r5.zze
            java.lang.String r1 = r1.zza()
            java.lang.String r2 = "mappver"
            r0.appendQueryParameter(r2, r1)
            com.google.android.gms.ads.internal.zzs r1 = r5.zze
            java.util.Map r1 = r1.zze()
            java.util.Set r2 = r1.keySet()
            java.util.Iterator r2 = r2.iterator()
        L45:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            r0.appendQueryParameter(r3, r4)
            goto L45
        L5b:
            android.net.Uri r0 = r0.build()
            com.google.android.gms.internal.ads.zzavn r1 = r5.zzh
            if (r1 == 0) goto L70
            android.content.Context r2 = r5.zzd     // Catch: com.google.android.gms.internal.ads.zzavo -> L6a
            android.net.Uri r0 = r1.zzb(r0, r2)     // Catch: com.google.android.gms.internal.ads.zzavo -> L6a
            goto L70
        L6a:
            r1 = move-exception
            java.lang.String r2 = "Unable to process ad data"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r2, r1)
        L70:
            java.lang.String r1 = r5.zzq()
            java.lang.String r0 = r0.getEncodedQuery()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "#"
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }

    final java.lang.String zzq() {
            r4 = this;
            com.google.android.gms.ads.internal.zzs r0 = r4.zze
            java.lang.String r0 = r0.zzb()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            if (r2 != r1) goto Lf
            java.lang.String r0 = "www.google.com"
        Lf:
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzbed.zzd
            java.lang.Object r1 = r1.zze()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "https://"
            r2.append(r3)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final java.lang.String zzr() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "getAdUnitId not implemented"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final java.lang.String zzs() throws android.os.RemoteException {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final java.lang.String zzt() throws android.os.RemoteException {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzx() throws android.os.RemoteException {
            r2 = this;
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            android.os.AsyncTask r0 = r2.zzi
            r1 = 1
            r0.cancel(r1)
            java.util.concurrent.Future r0 = r2.zzc
            r1 = 0
            r0.cancel(r1)
            android.webkit.WebView r0 = r2.zzf
            r0.destroy()
            r0 = 0
            r2.zzf = r0
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(com.google.android.gms.ads.internal.client.zzm r1, com.google.android.gms.ads.internal.client.zzbo r2) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzz() throws android.os.RemoteException {
            r1 = this;
            java.lang.String r0 = "pause must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            return
    }
}
