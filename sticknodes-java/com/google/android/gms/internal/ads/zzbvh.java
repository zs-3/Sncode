package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbvh extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.internal.ads.zzbvj {
    zzbvh(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.request.IAdRequestService"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zze(com.google.android.gms.internal.ads.zzbwa r2, com.google.android.gms.internal.ads.zzbvt r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r3)
            r2 = 6
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzf(com.google.android.gms.internal.ads.zzbwa r2, com.google.android.gms.internal.ads.zzbvt r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r3)
            r2 = 5
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzg(com.google.android.gms.internal.ads.zzbwa r2, com.google.android.gms.internal.ads.zzbvt r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r3)
            r2 = 4
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzh(java.lang.String r2, com.google.android.gms.internal.ads.zzbvt r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r3)
            r2 = 7
            r1.zzdc(r2, r0)
            return
    }
}
