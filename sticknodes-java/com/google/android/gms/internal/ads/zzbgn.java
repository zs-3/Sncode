package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbgn extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.internal.ads.zzbgp {
    zzbgn(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbgp
    public final android.os.IBinder zze(com.google.android.gms.dynamic.IObjectWrapper r2, com.google.android.gms.dynamic.IObjectWrapper r3, com.google.android.gms.dynamic.IObjectWrapper r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r3)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r4)
            r2 = 1
            android.os.Parcel r2 = r1.zzdb(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            r2.recycle()
            return r3
    }
}
