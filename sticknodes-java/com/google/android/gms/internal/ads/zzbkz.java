package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbkz extends com.google.android.gms.internal.ads.zzayl implements com.google.android.gms.internal.ads.zzblb {
    zzbkz(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final com.google.android.gms.internal.ads.zzbky zze(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.internal.ads.zzbpl r2, int r3, com.google.android.gms.internal.ads.zzbkv r4) throws android.os.RemoteException {
            r0 = this;
            android.os.Parcel r3 = r0.zza()
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r1)
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r2)
            r1 = 243220000(0xe7f3e20, float:3.1461089E-30)
            r3.writeInt(r1)
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r4)
            r1 = 1
            android.os.Parcel r1 = r0.zzdb(r1, r3)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L20
            r2 = 0
            goto L34
        L20:
            java.lang.String r3 = "com.google.android.gms.ads.internal.h5.client.IH5AdsManager"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.zzbky
            if (r4 == 0) goto L2e
            r2 = r3
            com.google.android.gms.internal.ads.zzbky r2 = (com.google.android.gms.internal.ads.zzbky) r2
            goto L34
        L2e:
            com.google.android.gms.internal.ads.zzbkw r3 = new com.google.android.gms.internal.ads.zzbkw
            r3.<init>(r2)
            r2 = r3
        L34:
            r1.recycle()
            return r2
    }
}
