package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzenc extends com.google.android.gms.ads.internal.client.zzbx {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.internal.client.zzbl zzb;
    private final com.google.android.gms.internal.ads.zzfhc zzc;
    private final com.google.android.gms.internal.ads.zzcqr zzd;
    private final android.view.ViewGroup zze;
    private final com.google.android.gms.internal.ads.zzdud zzf;

    public zzenc(android.content.Context r1, com.google.android.gms.ads.internal.client.zzbl r2, com.google.android.gms.internal.ads.zzfhc r3, com.google.android.gms.internal.ads.zzcqr r4, com.google.android.gms.internal.ads.zzdud r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zzf = r5
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r1)
            r2.removeAllViews()
            android.view.View r1 = r4.zzd()
            com.google.android.gms.ads.internal.zzu.zzp()
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            r2.addView(r1, r3)
            com.google.android.gms.ads.internal.client.zzs r1 = r0.zzg()
            int r1 = r1.zzc
            r2.setMinimumHeight(r1)
            com.google.android.gms.ads.internal.client.zzs r1 = r0.zzg()
            int r1 = r1.zzf
            r2.setMinimumWidth(r1)
            r0.zze = r2
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzA() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzcqr r0 = r1.zzd
            r0.zzh()
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzB() throws android.os.RemoteException {
            r2 = this;
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            com.google.android.gms.internal.ads.zzcqr r0 = r2.zzd
            com.google.android.gms.internal.ads.zzcyz r0 = r0.zzn()
            r1 = 0
            r0.zzc(r1)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(com.google.android.gms.ads.internal.client.zzbi r1) throws android.os.RemoteException {
            r0 = this;
            java.lang.String r1 = "setAdClickListener is not supported in Ad Manager AdView returned by AdLoader."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r1)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(com.google.android.gms.ads.internal.client.zzbl r1) throws android.os.RemoteException {
            r0 = this;
            java.lang.String r1 = "setAdListener is not supported in Ad Manager AdView returned by AdLoader."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r1)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(com.google.android.gms.ads.internal.client.zzcc r1) throws android.os.RemoteException {
            r0 = this;
            java.lang.String r1 = "setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r1)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzF(com.google.android.gms.ads.internal.client.zzs r3) throws android.os.RemoteException {
            r2 = this;
            java.lang.String r0 = "setAdSize must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            com.google.android.gms.internal.ads.zzcqr r0 = r2.zzd
            if (r0 == 0) goto Le
            android.view.ViewGroup r1 = r2.zze
            r0.zzi(r1, r3)
        Le:
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(com.google.android.gms.ads.internal.client.zzcm r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzfhc r0 = r1.zzc
            com.google.android.gms.internal.ads.zzeob r0 = r0.zzc
            if (r0 == 0) goto L9
            r0.zzm(r2)
        L9:
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(com.google.android.gms.internal.ads.zzbar r1) throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(com.google.android.gms.ads.internal.client.zzy r1) throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(com.google.android.gms.ads.internal.client.zzct r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(com.google.android.gms.ads.internal.client.zzef r1) throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzL(boolean r1) throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(com.google.android.gms.internal.ads.zzbtv r1) throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzN(boolean r1) throws android.os.RemoteException {
            r0 = this;
            java.lang.String r1 = "setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r1)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzO(com.google.android.gms.internal.ads.zzbdq r1) throws android.os.RemoteException {
            r0 = this;
            java.lang.String r1 = "setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r1)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(com.google.android.gms.ads.internal.client.zzdr r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzlk
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2e
            com.google.android.gms.internal.ads.zzfhc r0 = r3.zzc
            com.google.android.gms.internal.ads.zzeob r0 = r0.zzc
            if (r0 == 0) goto L2d
            boolean r1 = r4.zzf()     // Catch: android.os.RemoteException -> L24
            if (r1 != 0) goto L2a
            com.google.android.gms.internal.ads.zzdud r1 = r3.zzf     // Catch: android.os.RemoteException -> L24
            r1.zze()     // Catch: android.os.RemoteException -> L24
            goto L2a
        L24:
            r1 = move-exception
            java.lang.String r2 = "Error in making CSI ping for reporting paid event callback"
            com.google.android.gms.ads.internal.util.client.zzm.zzf(r2, r1)
        L2a:
            r0.zzl(r4)
        L2d:
            return
        L2e:
            java.lang.String r4 = "setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r4)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(com.google.android.gms.internal.ads.zzbty r1, java.lang.String r2) throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(java.lang.String r1) throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(com.google.android.gms.internal.ads.zzbws r1) throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(java.lang.String r1) throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzU(com.google.android.gms.ads.internal.client.zzgb r1) throws android.os.RemoteException {
            r0 = this;
            java.lang.String r1 = "setVideoOptions is not supported in Ad Manager AdView returned by AdLoader."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r1)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(com.google.android.gms.dynamic.IObjectWrapper r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzX() throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzY() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzcqr r0 = r1.zzd
            if (r0 == 0) goto Lc
            boolean r0 = r0.zzs()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
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
    public final boolean zzab(com.google.android.gms.ads.internal.client.zzm r1) throws android.os.RemoteException {
            r0 = this;
            java.lang.String r1 = "loadAd is not supported for an Ad Manager AdView returned from AdLoader."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r1)
            r1 = 0
            return r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzac(com.google.android.gms.ads.internal.client.zzcq r1) throws android.os.RemoteException {
            r0 = this;
            java.lang.String r1 = "setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r1)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final android.os.Bundle zzd() throws android.os.RemoteException {
            r1 = this;
            java.lang.String r0 = "getAdMetadata is not supported in Ad Manager AdView returned by AdLoader."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzs zzg() {
            r2 = this;
            java.lang.String r0 = "getAdSize must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            com.google.android.gms.internal.ads.zzcqr r0 = r2.zzd
            com.google.android.gms.internal.ads.zzfgi r0 = r0.zzf()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            android.content.Context r1 = r2.zza
            com.google.android.gms.ads.internal.client.zzs r0 = com.google.android.gms.internal.ads.zzfhi.zza(r1, r0)
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzbl zzi() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzbl r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzcm zzj() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzfhc r0 = r1.zzc
            com.google.android.gms.ads.internal.client.zzcm r0 = r0.zzn
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzdy zzk() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcqr r0 = r1.zzd
            com.google.android.gms.internal.ads.zzcxt r0 = r0.zzm()
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzeb zzl() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzcqr r0 = r1.zzd
            com.google.android.gms.ads.internal.client.zzeb r0 = r0.zze()
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.dynamic.IObjectWrapper zzn() throws android.os.RemoteException {
            r1 = this;
            android.view.ViewGroup r0 = r1.zze
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final java.lang.String zzr() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzfhc r0 = r1.zzc
            java.lang.String r0 = r0.zzf
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final java.lang.String zzs() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzcqr r0 = r1.zzd
            com.google.android.gms.internal.ads.zzcxt r0 = r0.zzm()
            if (r0 == 0) goto L13
            com.google.android.gms.internal.ads.zzcqr r0 = r1.zzd
            com.google.android.gms.internal.ads.zzcxt r0 = r0.zzm()
            java.lang.String r0 = r0.zzg()
            return r0
        L13:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final java.lang.String zzt() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzcqr r0 = r1.zzd
            com.google.android.gms.internal.ads.zzcxt r0 = r0.zzm()
            if (r0 == 0) goto L13
            com.google.android.gms.internal.ads.zzcqr r0 = r1.zzd
            com.google.android.gms.internal.ads.zzcxt r0 = r0.zzm()
            java.lang.String r0 = r0.zzg()
            return r0
        L13:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzx() throws android.os.RemoteException {
            r1 = this;
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            com.google.android.gms.internal.ads.zzcqr r0 = r1.zzd
            r0.zzb()
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(com.google.android.gms.ads.internal.client.zzm r1, com.google.android.gms.ads.internal.client.zzbo r2) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzz() throws android.os.RemoteException {
            r2 = this;
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            com.google.android.gms.internal.ads.zzcqr r0 = r2.zzd
            com.google.android.gms.internal.ads.zzcyz r0 = r0.zzn()
            r1 = 0
            r0.zzb(r1)
            return
    }
}
