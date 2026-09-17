package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcg extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.ads.internal.client.zzci {
    zzcg(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdPreloader"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final com.google.android.gms.internal.ads.zzbao zze(java.lang.String r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r2 = 5
            android.os.Parcel r2 = r1.zzdb(r2, r0)
            android.os.IBinder r0 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzbao r0 = com.google.android.gms.internal.ads.zzban.zzb(r0)
            r2.recycle()
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final com.google.android.gms.ads.internal.client.zzby zzf(java.lang.String r4) throws android.os.RemoteException {
            r3 = this;
            android.os.Parcel r0 = r3.zza()
            r0.writeString(r4)
            r4 = 7
            android.os.Parcel r4 = r3.zzdb(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L14
            r0 = 0
            goto L28
        L14:
            java.lang.String r1 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.ads.internal.client.zzby
            if (r2 == 0) goto L22
            r0 = r1
            com.google.android.gms.ads.internal.client.zzby r0 = (com.google.android.gms.ads.internal.client.zzby) r0
            goto L28
        L22:
            com.google.android.gms.ads.internal.client.zzbw r1 = new com.google.android.gms.ads.internal.client.zzbw
            r1.<init>(r0)
            r0 = r1
        L28:
            r4.recycle()
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final com.google.android.gms.internal.ads.zzbxf zzg(java.lang.String r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r2 = 3
            android.os.Parcel r2 = r1.zzdb(r2, r0)
            android.os.IBinder r0 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzbxf r0 = com.google.android.gms.internal.ads.zzbxe.zzq(r0)
            r2.recycle()
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzh(com.google.android.gms.internal.ads.zzbpl r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 8
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzi(java.util.List r2, com.google.android.gms.ads.internal.client.zzcf r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeTypedList(r2)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r3)
            r2 = 1
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzj(java.lang.String r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r2 = 4
            android.os.Parcel r2 = r1.zzdb(r2, r0)
            boolean r0 = com.google.android.gms.internal.ads.zzayn.zzg(r2)
            r2.recycle()
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzk(java.lang.String r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r2 = 6
            android.os.Parcel r2 = r1.zzdb(r2, r0)
            boolean r0 = com.google.android.gms.internal.ads.zzayn.zzg(r2)
            r2.recycle()
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzl(java.lang.String r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r2 = 2
            android.os.Parcel r2 = r1.zzdb(r2, r0)
            boolean r0 = com.google.android.gms.internal.ads.zzayn.zzg(r2)
            r2.recycle()
            return r0
    }
}
