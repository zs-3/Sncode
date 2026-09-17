package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfr extends com.google.android.gms.internal.ads.zzbxe {
    public zzfr() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void zzr(com.google.android.gms.internal.ads.zzbxm r2) {
            java.lang.String r0 = "This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r0)
            android.os.Handler r0 = com.google.android.gms.ads.internal.util.client.zzf.zza
            com.google.android.gms.ads.internal.client.zzfq r1 = new com.google.android.gms.ads.internal.client.zzfq
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final android.os.Bundle zzb() throws android.os.RemoteException {
            r1 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final com.google.android.gms.ads.internal.client.zzdy zzc() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final com.google.android.gms.internal.ads.zzbxc zzd() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final java.lang.String zze() throws android.os.RemoteException {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzf(com.google.android.gms.ads.internal.client.zzm r1, com.google.android.gms.internal.ads.zzbxm r2) throws android.os.RemoteException {
            r0 = this;
            zzr(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzg(com.google.android.gms.ads.internal.client.zzm r1, com.google.android.gms.internal.ads.zzbxm r2) throws android.os.RemoteException {
            r0 = this;
            zzr(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzh(boolean r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzi(com.google.android.gms.ads.internal.client.zzdo r1) throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzj(com.google.android.gms.ads.internal.client.zzdr r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzk(com.google.android.gms.internal.ads.zzbxi r1) throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzl(com.google.android.gms.internal.ads.zzbxt r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzm(com.google.android.gms.dynamic.IObjectWrapper r1) throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzn(com.google.android.gms.dynamic.IObjectWrapper r1, boolean r2) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final boolean zzo() throws android.os.RemoteException {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzp(com.google.android.gms.internal.ads.zzbxn r1) throws android.os.RemoteException {
            r0 = this;
            return
    }
}
