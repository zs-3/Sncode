package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzayo extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.internal.ads.zzayq {
    zzayo(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.clearcut.IClearcut"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayq
    public final void zze(com.google.android.gms.dynamic.IObjectWrapper r1, java.lang.String r2) throws android.os.RemoteException {
            r0 = this;
            android.os.Parcel r2 = r0.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r2, r1)
            java.lang.String r1 = "GMA_SDK"
            r2.writeString(r1)
            r1 = 2
            r0.zzdc(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayq
    public final void zzf() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 3
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayq
    public final void zzg(int r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeInt(r2)
            r2 = 7
            r1.zzdc(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayq
    public final void zzh(int[] r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r2 = r1.zza()
            r0 = 0
            r2.writeIntArray(r0)
            r0 = 4
            r1.zzdc(r0, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayq
    public final void zzi(int r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r2 = r1.zza()
            r0 = 0
            r2.writeInt(r0)
            r0 = 6
            r1.zzdc(r0, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayq
    public final void zzj(byte[] r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeByteArray(r2)
            r2 = 5
            r1.zzdc(r2, r0)
            return
    }
}
