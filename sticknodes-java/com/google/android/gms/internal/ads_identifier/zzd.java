package com.google.android.gms.internal.ads_identifier;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes.dex */
public final class zzd extends com.google.android.gms.internal.ads_identifier.zza implements com.google.android.gms.internal.ads_identifier.zzf {
    zzd(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final java.lang.String zzc() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 1
            android.os.Parcel r0 = r2.zzb(r1, r0)
            java.lang.String r1 = r0.readString()
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zzd() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 6
            android.os.Parcel r0 = r2.zzb(r1, r0)
            boolean r1 = com.google.android.gms.internal.ads_identifier.zzc.zzb(r0)
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zze(boolean r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r2 = r1.zza()
            r0 = 1
            com.google.android.gms.internal.ads_identifier.zzc.zza(r2, r0)
            r0 = 2
            android.os.Parcel r2 = r1.zzb(r0, r2)
            boolean r0 = com.google.android.gms.internal.ads_identifier.zzc.zzb(r2)
            r2.recycle()
            return r0
    }
}
