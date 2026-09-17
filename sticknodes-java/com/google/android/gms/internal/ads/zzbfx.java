package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbfx extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.internal.ads.zzbfz {
    zzbfx(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.IMediaContent"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final float zze() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 2
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            float r1 = r0.readFloat()
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final float zzf() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 6
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            float r1 = r0.readFloat()
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final float zzg() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 5
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            float r1 = r0.readFloat()
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final com.google.android.gms.ads.internal.client.zzeb zzh() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 7
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            com.google.android.gms.ads.internal.client.zzeb r1 = com.google.android.gms.ads.internal.client.zzea.zzb(r1)
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final com.google.android.gms.dynamic.IObjectWrapper zzi() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 4
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final void zzj(com.google.android.gms.dynamic.IObjectWrapper r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 3
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final boolean zzk() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 10
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            boolean r1 = com.google.android.gms.internal.ads.zzayn.zzg(r0)
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final boolean zzl() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 8
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            boolean r1 = com.google.android.gms.internal.ads.zzayn.zzg(r0)
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final void zzm(com.google.android.gms.internal.ads.zzbhk r1) throws android.os.RemoteException {
            r0 = this;
            r1 = 0
            throw r1
    }
}
