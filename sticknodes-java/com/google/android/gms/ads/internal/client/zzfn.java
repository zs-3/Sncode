package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfn extends com.google.android.gms.ads.internal.client.zzcy {
    private com.google.android.gms.internal.ads.zzbmb zza;

    public zzfn() {
            r0 = this;
            r0.<init>()
            return
    }

    final /* synthetic */ void zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbmb r0 = r2.zza
            if (r0 == 0) goto L12
            java.util.List r1 = java.util.Collections.emptyList()     // Catch: android.os.RemoteException -> Lc
            r0.zzb(r1)     // Catch: android.os.RemoteException -> Lc
            return
        Lc:
            r0 = move-exception
            java.lang.String r1 = "Could not notify onComplete event."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r1, r0)
        L12:
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final float zze() throws android.os.RemoteException {
            r1 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final java.lang.String zzf() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final java.util.List zzg() throws android.os.RemoteException {
            r1 = this;
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzh(java.lang.String r1) throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzi() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzj(boolean r1) throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzk() throws android.os.RemoteException {
            r2 = this;
            java.lang.String r0 = "The initialization is not processed because MobileAdsSettingsManager is not created successfully."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r0)
            android.os.Handler r0 = com.google.android.gms.ads.internal.util.client.zzf.zza
            com.google.android.gms.ads.internal.client.zzfm r1 = new com.google.android.gms.ads.internal.client.zzfm
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzl(java.lang.String r1, com.google.android.gms.dynamic.IObjectWrapper r2) throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzm(com.google.android.gms.ads.internal.client.zzdl r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzn(com.google.android.gms.dynamic.IObjectWrapper r1, java.lang.String r2) throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzo(com.google.android.gms.internal.ads.zzbpl r1) throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzp(boolean r1) throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzq(float r1) throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzr(java.lang.String r1) throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzs(com.google.android.gms.internal.ads.zzbmb r1) throws android.os.RemoteException {
            r0 = this;
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzt(java.lang.String r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzu(com.google.android.gms.ads.internal.client.zzfw r1) throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final boolean zzv() throws android.os.RemoteException {
            r1 = this;
            r0 = 0
            return r0
    }
}
