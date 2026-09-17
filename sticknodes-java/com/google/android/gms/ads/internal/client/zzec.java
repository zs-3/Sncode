package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzec extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.ads.internal.client.zzee {
    zzec(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zze() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 4
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzf(boolean r3) throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            int r1 = com.google.android.gms.internal.ads.zzayn.zza
            r0.writeInt(r3)
            r3 = 5
            r2.zzdc(r3, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzg() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 3
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzh() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 2
            r2.zzdc(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzi() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 1
            r2.zzdc(r1, r0)
            return
    }
}
