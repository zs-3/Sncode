package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbpt extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbpu {
    public zzbpt() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.internal.ads.zzbpu zzb(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbpu
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzbpu r0 = (com.google.android.gms.internal.ads.zzbpu) r0
            return r0
        L11:
            com.google.android.gms.internal.ads.zzbps r0 = new com.google.android.gms.internal.ads.zzbps
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r2 = 1
            if (r1 == r2) goto L15
            r4 = 2
            if (r1 == r4) goto L8
            r1 = 0
            return r1
        L8:
            boolean r1 = r0.zzf()
            r3.writeNoException()
            int r4 = com.google.android.gms.internal.ads.zzayn.zza
            r3.writeInt(r1)
            goto L1f
        L15:
            com.google.android.gms.dynamic.IObjectWrapper r1 = r0.zze()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r1)
        L1f:
            return r2
    }
}
