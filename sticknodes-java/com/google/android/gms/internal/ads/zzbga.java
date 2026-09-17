package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbga extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.internal.ads.zzbgc {
    zzbga(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final double zzb() throws android.os.RemoteException {
            r3 = this;
            android.os.Parcel r0 = r3.zza()
            r1 = 3
            android.os.Parcel r0 = r3.zzdb(r1, r0)
            double r1 = r0.readDouble()
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final int zzc() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 5
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            int r1 = r0.readInt()
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final int zzd() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 4
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            int r1 = r0.readInt()
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final android.net.Uri zze() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 2
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            android.os.Parcelable$Creator r1 = android.net.Uri.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzayn.zza(r0, r1)
            android.net.Uri r1 = (android.net.Uri) r1
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final com.google.android.gms.dynamic.IObjectWrapper zzf() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 1
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            r0.recycle()
            return r1
    }
}
