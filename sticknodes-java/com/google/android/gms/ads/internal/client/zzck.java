package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzck extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.ads.internal.client.zzcm {
    zzck(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAppEventListener"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzc(java.lang.String r2, java.lang.String r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r0.writeString(r3)
            r2 = 1
            r1.zzdc(r2, r0)
            return
    }
}
