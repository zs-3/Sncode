package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdv extends com.google.android.gms.internal.ads.zzayl {
    zzdv(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator"
            r1.<init>(r2, r0)
            return
    }

    public final com.google.android.gms.ads.internal.client.zzdu zze(com.google.android.gms.dynamic.IObjectWrapper r2, com.google.android.gms.internal.ads.zzbpl r3, int r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r4 = r1.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r2)
            com.google.android.gms.internal.ads.zzayn.zzf(r4, r3)
            r2 = 243220000(0xe7f3e20, float:3.1461089E-30)
            r4.writeInt(r2)
            r2 = 1
            android.os.Parcel r2 = r1.zzdb(r2, r4)
            android.os.IBinder r3 = r2.readStrongBinder()
            if (r3 != 0) goto L1d
            r3 = 0
            goto L31
        L1d:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IOutOfContextTester"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.ads.internal.client.zzdu
            if (r0 == 0) goto L2b
            r3 = r4
            com.google.android.gms.ads.internal.client.zzdu r3 = (com.google.android.gms.ads.internal.client.zzdu) r3
            goto L31
        L2b:
            com.google.android.gms.ads.internal.client.zzds r4 = new com.google.android.gms.ads.internal.client.zzds
            r4.<init>(r3)
            r3 = r4
        L31:
            r2.recycle()
            return r3
    }
}
