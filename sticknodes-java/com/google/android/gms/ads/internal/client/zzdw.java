package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdw extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.ads.internal.client.zzdy {
    zzdw(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IResponseInfo"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final android.os.Bundle zze() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 5
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzayn.zza(r0, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final com.google.android.gms.ads.internal.client.zzw zzf() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 4
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzw> r1 = com.google.android.gms.ads.internal.client.zzw.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzayn.zza(r0, r1)
            com.google.android.gms.ads.internal.client.zzw r1 = (com.google.android.gms.ads.internal.client.zzw) r1
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final java.lang.String zzg() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 1
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            java.lang.String r1 = r0.readString()
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final java.lang.String zzh() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 6
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            java.lang.String r1 = r0.readString()
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final java.lang.String zzi() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 2
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            java.lang.String r1 = r0.readString()
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final java.util.List zzj() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 3
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzw> r1 = com.google.android.gms.ads.internal.client.zzw.CREATOR
            java.util.ArrayList r1 = r0.createTypedArrayList(r1)
            r0.recycle()
            return r1
    }
}
