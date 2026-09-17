package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbhr extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.internal.ads.zzbht {
    zzbhr(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final boolean zze(com.google.android.gms.dynamic.IObjectWrapper r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r2)
            r2 = 2
            android.os.Parcel r2 = r1.zzdb(r2, r0)
            boolean r0 = com.google.android.gms.internal.ads.zzayn.zzg(r2)
            r2.recycle()
            return r0
    }
}
