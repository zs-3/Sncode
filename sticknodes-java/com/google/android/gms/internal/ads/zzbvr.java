package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbvr extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.internal.ads.zzbvt {
    zzbvr(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zze(com.google.android.gms.ads.internal.util.zzbb r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            r2 = 2
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzf(android.os.ParcelFileDescriptor r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            r2 = 1
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzg(android.os.ParcelFileDescriptor r2, com.google.android.gms.internal.ads.zzbwa r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r2)
            com.google.android.gms.internal.ads.zzayn.zzd(r0, r3)
            r2 = 3
            r1.zzdc(r2, r0)
            return
    }
}
