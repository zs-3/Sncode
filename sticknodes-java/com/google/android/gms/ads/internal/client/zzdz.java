package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdz extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.ads.internal.client.zzeb {
    zzdz(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IVideoController"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zze() throws android.os.RemoteException {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzf() throws android.os.RemoteException {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzg() throws android.os.RemoteException {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final int zzh() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 5
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            int r1 = r0.readInt()
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final com.google.android.gms.ads.internal.client.zzee zzi() throws android.os.RemoteException {
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 11
            android.os.Parcel r0 = r4.zzdb(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L12
            r1 = 0
            goto L26
        L12:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzee
            if (r3 == 0) goto L20
            r1 = r2
            com.google.android.gms.ads.internal.client.zzee r1 = (com.google.android.gms.ads.internal.client.zzee) r1
            goto L26
        L20:
            com.google.android.gms.ads.internal.client.zzec r2 = new com.google.android.gms.ads.internal.client.zzec
            r2.<init>(r1)
            r1 = r2
        L26:
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzj(boolean r3) throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            int r1 = com.google.android.gms.internal.ads.zzayn.zza
            r0.writeInt(r3)
            r3 = 3
            r2.zzdc(r3, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzk() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 2
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzl() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 1
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzm(com.google.android.gms.ads.internal.client.zzee r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 8
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzn() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 13
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzo() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 12
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            boolean r1 = com.google.android.gms.internal.ads.zzayn.zzg(r0)
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzp() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 10
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            boolean r1 = com.google.android.gms.internal.ads.zzayn.zzg(r0)
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzq() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 4
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            boolean r1 = com.google.android.gms.internal.ads.zzayn.zzg(r0)
            r0.recycle()
            return r1
    }
}
