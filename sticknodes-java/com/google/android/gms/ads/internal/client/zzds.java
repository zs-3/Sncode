package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzds extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.ads.internal.client.zzdu {
    zzds(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IOutOfContextTester"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzdu
    public final void zze(java.lang.String r2, com.google.android.gms.dynamic.IObjectWrapper r3, com.google.android.gms.dynamic.IObjectWrapper r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r3)
            com.google.android.gms.internal.ads.zzayn.zzf(r0, r4)
            r2 = 1
            r1.zzdc(r2, r0)
            return
    }
}
