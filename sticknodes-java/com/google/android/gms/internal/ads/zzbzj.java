package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbzj extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.internal.ads.zzbzl {
    zzbzj(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.signals.ISignalGenerator"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final com.google.android.gms.dynamic.IObjectWrapper zze(com.google.android.gms.dynamic.IObjectWrapper r2, com.google.android.gms.dynamic.IObjectWrapper r3, java.lang.String r4, com.google.android.gms.dynamic.IObjectWrapper r5) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r3)
            r0.writeString(r4)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r5)
            r2 = 11
            android.os.Parcel r2 = r1.zzdb(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            r2.recycle()
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzf(com.google.android.gms.dynamic.IObjectWrapper r2, com.google.android.gms.internal.ads.zzbzp r3, com.google.android.gms.internal.ads.zzbzi r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r3)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r4)
            r2 = 1
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzg(com.google.android.gms.internal.ads.zzbuk r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            r2 = 7
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzh(java.util.List r2, com.google.android.gms.dynamic.IObjectWrapper r3, com.google.android.gms.internal.ads.zzbub r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeTypedList(r2)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r3)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r4)
            r2 = 10
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzi(java.util.List r2, com.google.android.gms.dynamic.IObjectWrapper r3, com.google.android.gms.internal.ads.zzbub r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeTypedList(r2)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r3)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r4)
            r2 = 9
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzj(com.google.android.gms.dynamic.IObjectWrapper r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 8
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzk(com.google.android.gms.dynamic.IObjectWrapper r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 2
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzl(java.util.List r2, com.google.android.gms.dynamic.IObjectWrapper r3, com.google.android.gms.internal.ads.zzbub r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeTypedList(r2)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r3)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r4)
            r2 = 6
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzm(java.util.List r2, com.google.android.gms.dynamic.IObjectWrapper r3, com.google.android.gms.internal.ads.zzbub r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeTypedList(r2)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r3)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r4)
            r2 = 5
            r1.zzdc(r2, r0)
            return
    }
}
