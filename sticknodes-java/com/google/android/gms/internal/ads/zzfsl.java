package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfsl extends com.google.android.gms.internal.ads.zzayl {
    zzfsl(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.gass.internal.IGassService"
            r1.<init>(r2, r0)
            return
    }

    public final com.google.android.gms.internal.ads.zzfsj zze(com.google.android.gms.internal.ads.zzfsh r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            r2 = 1
            android.os.Parcel r2 = r1.zzdb(r2, r0)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzfsj> r0 = com.google.android.gms.internal.ads.zzfsj.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzayn.zza(r2, r0)
            com.google.android.gms.internal.ads.zzfsj r0 = (com.google.android.gms.internal.ads.zzfsj) r0
            r2.recycle()
            return r0
    }

    public final com.google.android.gms.internal.ads.zzfss zzf(com.google.android.gms.internal.ads.zzfsq r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            r2 = 3
            android.os.Parcel r2 = r1.zzdb(r2, r0)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzfss> r0 = com.google.android.gms.internal.ads.zzfss.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzayn.zza(r2, r0)
            com.google.android.gms.internal.ads.zzfss r0 = (com.google.android.gms.internal.ads.zzfss) r0
            r2.recycle()
            return r0
    }

    public final void zzg(com.google.android.gms.internal.ads.zzfse r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            r2 = 2
            r1.zzdc(r2, r0)
            return
    }
}
