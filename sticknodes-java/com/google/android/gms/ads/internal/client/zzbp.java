package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbp extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.ads.internal.client.zzbr {
    zzbp(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdLoader"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final java.lang.String zze() throws android.os.RemoteException {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final java.lang.String zzf() throws android.os.RemoteException {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final void zzg(com.google.android.gms.ads.internal.client.zzm r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            r2 = 1
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final void zzh(com.google.android.gms.ads.internal.client.zzm r2, int r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            r0.writeInt(r3)
            r2 = 5
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final boolean zzi() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 3
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            boolean r1 = com.google.android.gms.internal.ads.zzayn.zzg(r0)
            r0.recycle()
            return r1
    }
}
