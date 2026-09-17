package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbqx extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbqy {
    public zzbqx() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            r5 = 1
            if (r2 == r5) goto L37
            r0 = 2
            if (r2 == r0) goto L2c
            r0 = 3
            if (r2 == r0) goto L1d
            r0 = 4
            if (r2 == r0) goto Le
            r2 = 0
            return r2
        Le:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.zzbpu r2 = com.google.android.gms.internal.ads.zzbpt.zzb(r2)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzh(r2)
            goto L45
        L1d:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zze> r2 = com.google.android.gms.ads.internal.client.zze.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzayn.zza(r3, r2)
            com.google.android.gms.ads.internal.client.zze r2 = (com.google.android.gms.ads.internal.client.zze) r2
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzf(r2)
            goto L45
        L2c:
            java.lang.String r2 = r3.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zze(r2)
            goto L45
        L37:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r2)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzg(r2)
        L45:
            r4.writeNoException()
            return r5
    }
}
