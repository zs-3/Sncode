package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcu extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.ads.internal.client.zzcw {
    zzcu(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.ILiteSdkInfo"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public final com.google.android.gms.internal.ads.zzbpl getAdapterCreator() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 2
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            com.google.android.gms.internal.ads.zzbpl r1 = com.google.android.gms.internal.ads.zzbpk.zzf(r1)
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public final com.google.android.gms.ads.internal.client.zzfc getLiteSdkVersion() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 1
            android.os.Parcel r0 = r2.zzdb(r1, r0)
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzfc> r1 = com.google.android.gms.ads.internal.client.zzfc.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzayn.zza(r0, r1)
            com.google.android.gms.ads.internal.client.zzfc r1 = (com.google.android.gms.ads.internal.client.zzfc) r1
            r0.recycle()
            return r1
    }
}
