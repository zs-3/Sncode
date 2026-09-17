package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdpd extends com.google.android.gms.internal.ads.zzbhy {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzdkk zzb;
    private final com.google.android.gms.internal.ads.zzdkp zzc;
    private final com.google.android.gms.internal.ads.zzdud zzd;

    public zzdpd(java.lang.String r1, com.google.android.gms.internal.ads.zzdkk r2, com.google.android.gms.internal.ads.zzdkp r3, com.google.android.gms.internal.ads.zzdud r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzA() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkk r0 = r1.zzb
            r0.zzH()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzB(android.os.Bundle r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzmz
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L17
            com.google.android.gms.internal.ads.zzdkk r0 = r2.zzb
            r0.zzI(r3)
        L17:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzC(android.os.Bundle r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkk r0 = r1.zzb
            r0.zzM(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzD() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkk r0 = r1.zzb
            r0.zzO()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzE(com.google.android.gms.ads.internal.client.zzdd r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkk r0 = r1.zzb
            r0.zzP(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzF(com.google.android.gms.ads.internal.client.zzdr r3) throws android.os.RemoteException {
            r2 = this;
            boolean r0 = r3.zzf()     // Catch: android.os.RemoteException -> Lc
            if (r0 != 0) goto L12
            com.google.android.gms.internal.ads.zzdud r0 = r2.zzd     // Catch: android.os.RemoteException -> Lc
            r0.zze()     // Catch: android.os.RemoteException -> Lc
            goto L12
        Lc:
            r0 = move-exception
            java.lang.String r1 = "Error in making CSI ping for reporting paid event callback"
            com.google.android.gms.ads.internal.util.client.zzm.zzf(r1, r0)
        L12:
            com.google.android.gms.internal.ads.zzdkk r0 = r2.zzb
            r0.zzQ(r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzG(com.google.android.gms.internal.ads.zzbhw r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkk r0 = r1.zzb
            r0.zzR(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final boolean zzH() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkk r0 = r1.zzb
            boolean r0 = r0.zzW()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final boolean zzI() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zzc
            java.util.List r0 = r0.zzH()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L16
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zzc
            com.google.android.gms.ads.internal.client.zzfa r0 = r0.zzk()
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final boolean zzJ(android.os.Bundle r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkk r0 = r1.zzb
            boolean r2 = r0.zzZ(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final double zze() throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r2.zzc
            double r0 = r0.zza()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final android.os.Bundle zzf() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zzc
            android.os.Bundle r0 = r0.zzd()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final com.google.android.gms.ads.internal.client.zzdy zzg() throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzgy
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L14
            r0 = 0
            return r0
        L14:
            com.google.android.gms.internal.ads.zzdkk r0 = r2.zzb
            com.google.android.gms.internal.ads.zzcxt r0 = r0.zzm()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final com.google.android.gms.ads.internal.client.zzeb zzh() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zzc
            com.google.android.gms.ads.internal.client.zzeb r0 = r0.zzj()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final com.google.android.gms.internal.ads.zzbfv zzi() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zzc
            com.google.android.gms.internal.ads.zzbfv r0 = r0.zzl()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final com.google.android.gms.internal.ads.zzbfz zzj() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkk r0 = r1.zzb
            com.google.android.gms.internal.ads.zzdkm r0 = r0.zzc()
            com.google.android.gms.internal.ads.zzbfz r0 = r0.zza()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final com.google.android.gms.internal.ads.zzbgc zzk() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zzc
            com.google.android.gms.internal.ads.zzbgc r0 = r0.zzn()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final com.google.android.gms.dynamic.IObjectWrapper zzl() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zzc
            com.google.android.gms.dynamic.IObjectWrapper r0 = r0.zzv()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final com.google.android.gms.dynamic.IObjectWrapper zzm() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkk r0 = r1.zzb
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final java.lang.String zzn() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zzc
            java.lang.String r0 = r0.zzx()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final java.lang.String zzo() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zzc
            java.lang.String r0 = r0.zzy()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final java.lang.String zzp() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zzc
            java.lang.String r0 = r0.zzz()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final java.lang.String zzq() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zzc
            java.lang.String r0 = r0.zzB()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final java.lang.String zzr() throws android.os.RemoteException {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final java.lang.String zzs() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zzc
            java.lang.String r0 = r0.zzD()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final java.lang.String zzt() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zzc
            java.lang.String r0 = r0.zzE()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final java.util.List zzu() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zzc
            java.util.List r0 = r0.zzG()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final java.util.List zzv() throws android.os.RemoteException {
            r1 = this;
            boolean r0 = r1.zzI()
            if (r0 == 0) goto Ld
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zzc
            java.util.List r0 = r0.zzH()
            goto L11
        Ld:
            java.util.List r0 = java.util.Collections.emptyList()
        L11:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzw() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkk r0 = r1.zzb
            r0.zzv()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzx() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkk r0 = r1.zzb
            r0.zzb()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzy(com.google.android.gms.ads.internal.client.zzdh r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkk r0 = r1.zzb
            r0.zzC(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zzz(android.os.Bundle r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkk r0 = r1.zzb
            r0.zzG(r2)
            return
    }
}
