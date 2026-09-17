package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbam extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.internal.ads.zzbao {
    zzbam(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbao
    public final com.google.android.gms.ads.internal.client.zzby zze() throws android.os.RemoteException {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbao
    public final com.google.android.gms.ads.internal.client.zzdy zzf() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 5
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            com.google.android.gms.ads.internal.client.zzdy r1 = com.google.android.gms.ads.internal.client.zzdx.zzb(r1)
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbao
    public final void zzg(boolean r3) throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            int r1 = com.google.android.gms.internal.ads.zzayn.zza
            r0.writeInt(r3)
            r3 = 6
            r2.zzdc(r3, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbao
    public final void zzh(com.google.android.gms.ads.internal.client.zzdr r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 7
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbao
    public final void zzi(com.google.android.gms.dynamic.IObjectWrapper r2, com.google.android.gms.internal.ads.zzbav r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r3)
            r2 = 4
            r1.zzdc(r2, r0)
            return
    }
}
